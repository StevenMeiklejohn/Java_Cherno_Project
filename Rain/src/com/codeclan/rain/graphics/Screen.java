package com.codeclan.rain.graphics;

// Screen represent our game screen and handle how we set the pixels.
public class Screen {
	private int width;
	private int height;
//	array to contain all our pixel data.
	public int[] pixels;
	
	public Screen(int width, int height){
		this.width = width;
		this.height = height;
//		Creates an array with one integer (representing colour) for each pixel;
		pixels = new int[width * height];
	}
	
//	Loop through the pixels array and replace every colour with black.
	public void clear(){
		for (int i = 0; i < pixels.length; i++){
			pixels[i] = 0;
		}
	}
	
	public void render(){
		for(int y = 0; y < height; y++){
			for(int x = 0; x < width; x++){
				pixels[x+y*width] = 0xFF00FF;
			}
		}
	}
}
