package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

@Autonomous(name="Far Place Red",group="Encoder")
public class Red_Place_Far extends Auto_Util {
    public void runOpMode() throws InterruptedException {
        initAuto();

        waitForStart();
        if (false) { // center
            encoderDrive(DRIVE_SPEED,-17,-17,10,0);
            intakeWork(1);
            encoderDrive(DRIVE_SPEED,2.5,2.5,10,0);
            encoderStrafe(STRAFE_SPEED,10,10,10,0);
            encoderDrive(DRIVE_SPEED,-18,-18,10,0);
            encoderDrive(DRIVE_SPEED,-12.3,12.3,10,0);
            encoderDrive(DRIVE_SPEED,-69,-69,10,0);
            encoderStrafe(STRAFE_SPEED,-13,-13,10,0);
            encoderDrive(0.1,-5,-5,10,0);
            place(50);
            sleep(1000);
            reload();
            encoderDrive(DRIVE_SPEED,5,5,10,0);
            encoderStrafe(STRAFE_SPEED,15,15,10,0);
            encoderDrive(DRIVE_SPEED,-10,-10,10,0);

        } else if (false) { //right
            encoderDrive(DRIVE_SPEED,-17,-17,10,0);
            encoderStrafe(STRAFE_SPEED,-13,-13,10,0);
            intakeWork(5);
            encoderStrafe(STRAFE_SPEED,12,12,10,0);
            encoderDrive(DRIVE_SPEED,-16,-16,10,0);
            encoderStrafe(STRAFE_SPEED,-12.3,12.3,10,0);
            encoderDrive(DRIVE_SPEED,59,59,10,0);
            encoderStrafe(STRAFE_SPEED,-17,-17,10,0);
            encoderDrive(0.1,-5,-5,10,0);
            place(50);
            sleep(1000);
            reload();
            encoderDrive(DRIVE_SPEED,5,5,10,0);
            encoderStrafe(STRAFE_SPEED,20,20,10,0);
            encoderDrive(DRIVE_SPEED,-10,-10,10,0);

        } else if (true) { //left
            encoderDrive(DRIVE_SPEED,-17,-17,10,0);
            encoderStrafe(STRAFE_SPEED,13,13,10,0);
            intakeWork(5);
            encoderStrafe(STRAFE_SPEED,-12,-12,10,0);
            encoderDrive(DRIVE_SPEED,-16,-16,10,0);
            encoderStrafe(STRAFE_SPEED,-12.3,12.3,10,0);
            encoderDrive(DRIVE_SPEED,59,59,10,0);
            encoderStrafe(STRAFE_SPEED,-17,-17,10,0);
            encoderDrive(0.1,-5,-5,10,0);
            place(50);
            sleep(1000);
            reload();
            encoderDrive(DRIVE_SPEED,5,5,10,0);
            encoderStrafe(STRAFE_SPEED,20,20,10,0);
            encoderDrive(DRIVE_SPEED,-10,-10,10,0);
        }

    }
}
