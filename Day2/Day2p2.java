package com.jvking.Day2;

public class Day2p2 {
    /*街头霸王P1 一次普攻加一次技能伤害对方还剩多少血*/
    public static void main(String[] args) {
        int attack1 = 220;
        int defense1 = 85;
        double blood1 = 1012.5;
        double skill1 = 1.2;
        int attack2 = 210;
        int defense2 = 80;
        double blood2 = 1223.3;
        double skill2 = 1.3;
        double damage1 = attack1 - defense2;
        double damage2 = attack1*skill1 - defense2;
        double health = blood2 - damage1 - damage2;

        System.out.println("这两次伤害后P2还剩"+health+"滴血");


    }

}
