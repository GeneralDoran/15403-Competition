package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

import org.firstinspires.ftc.robotcore.external.Telemetry;

@Autonomous(name="ColorDetectionAutoOther",group="Encoder")
public class ColorDetectionAutoOther extends ColorDetectionPractice {
    public void runOpMode() throws InterruptedException {
        initAuto();
        initOpenCVOther();
        waitForStart();
        telemetry.addLine("Started");
        loopOpenCVOther();
        String x = getLocation();
        if (x.equals("Right")){
            encoderStrafe(0.2,-5,-5,10,0);
        } else if (x.equals("Center")){
            encoderDrive(0.2,-5,-5,10,0);
        } else if (x.equals("Left")){
            encoderStrafe(0.2,5,5,10,0);
        } else {
            //do nothing
            telemetry.addLine("Do Nothing");
            //encoderDrive(0.2,5,5,10,0);
        }


    }
}