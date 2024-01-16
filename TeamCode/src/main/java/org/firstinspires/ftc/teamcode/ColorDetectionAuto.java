package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;

import org.firstinspires.ftc.robotcore.external.Telemetry;

@Autonomous(name="ColorDetectionAuto",group="Encoder")
public class ColorDetectionAuto extends ColorDetectionPractice {
    public void runOpMode() throws InterruptedException {
        initAuto();
        initOpenCV();
        waitForStart();
        telemetry.addLine("Started");
        loopOpenCV();
        String x = getLocation();
        if (x.equals("Right")) {
            encoderStrafe(0.2, -5, -5, 10, 0);
        } else if (x.equals("Center")) {
            encoderDrive(0.2, -5, -5, 10, 0);
        } else if (x.equals("Left")) {
            encoderStrafe(0.2, 5, 5, 10, 0);
        } else {
            encoderDrive(0.2, 5, 5, 10, 0);
        }


    }
}