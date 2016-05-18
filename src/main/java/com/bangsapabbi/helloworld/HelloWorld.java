package com.bangsapabbi.helloworld;

public class HelloWorld {
    public static void main(String[] args) {
    World world = new World();    
    World worldToKill = new World();
    kill(worldToKill);
    System.out.println(world.greet());
    }
}
