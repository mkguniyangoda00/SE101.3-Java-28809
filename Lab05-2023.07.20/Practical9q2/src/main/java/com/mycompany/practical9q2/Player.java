package com.mycompany.practical9q2;

public class Player implements PlayerController
{
    @Override
    public void moveUp() {
        System.out.println("Player moves up.");
    }

    @Override
    public void moveDown() {
        System.out.println("Player moves down.");
    }

    @Override
    public void moveLeft() {
        System.out.println("Player moves left.");
    }

    @Override
    public void moveRight() {
        System.out.println("Player moves right.");
    }
}
