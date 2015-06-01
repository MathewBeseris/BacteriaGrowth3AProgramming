boolean spot = false;
int x;
int y;
int r = 10;
PImage bg;
int bNumber = 0;
int click = 0;

void setup(){
  bg = loadImage("Environment1.png");
    size(1280,720);
    image(bg,0,0);
    strokeWeight(5);
    frameRate(30);
}

void draw(){
    if(spot == true){
       bacteriaSpot();
       bNumber ++;
    }
    fill(255);
    rect(0,0,200,80);
    fill(0);
    text("Number of Bacteria Grown: " + bNumber, 5,20);
    text("Number of Times Clicked: " + click, 5,35);
    if(click != 0)
    text("Bacteria Per Click: " + bNumber/click,5,50);
}

void bacteriaSpot(){
   stroke(random(255),random(255),random(255));
   point(x+random(r)-r/2,y+random(r)-r/2);
   r++;
}

void mousePressed(){
  click ++;
  x= mouseX;
  y= mouseY;
  r = 10;
  spot = true;
}
