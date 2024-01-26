package components;

import javax.swing.*;

public class TiltablePanel extends JPanel {
    private int horizontalTilt, verticalTilt;

    /**
     *
     * @param x
     * @param y
     * @param width
     * @param height
     * @param horizontalTilt
     * @param verticalTilt
     *
     * @Working: this adds the function to initially tilt the created object
     */
    public void setBounds(int x, int y,
                          int width, int height,
                          int horizontalTilt, int verticalTilt) {

        double actualWidth = Math.cos(Math.toRadians(horizontalTilt)) * width;
        double actualHeight = Math.cos(Math.toRadians(verticalTilt)) * height;

        this.horizontalTilt = horizontalTilt;
        this.verticalTilt = verticalTilt;

        super.setBounds(x, y, (int) actualWidth, (int) actualHeight);
    }

    /**
     *
     * @param horizontalAngle angle difference
     * @param verticalAngle angle difference
     *
     *  @Actoins: tilts the object
     */
    public void tilt(int horizontalAngle, int verticalAngle){
        setBounds(getX(), getY(), getWidth(), getHeight(), getHorizontalTilt() + horizontalAngle, getVerticalTilt() + verticalAngle);
    }

    public int getHorizontalTilt() {
        return horizontalTilt;
    }

    public int getVerticalTilt() {
        return verticalTilt;
    }


}
