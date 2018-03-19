package ro.bv.robocode.awesomerobots;

import robocode.HitByBulletEvent;
import robocode.Robot;
import robocode.ScannedRobotEvent;

public class AwesomeO extends Robot {

    @Override
    public void run() {
        while (true) {
            ahead(100);
            turnLeft(90);
            turnGunLeft(90);
            fireBullet(1);
        }
    }

    public void onScannedRobot(ScannedRobotEvent e) {
        fire(3);
    }

    public void onHitByBullet(HitByBulletEvent e) {
        turnLeft(90);
    }

}
