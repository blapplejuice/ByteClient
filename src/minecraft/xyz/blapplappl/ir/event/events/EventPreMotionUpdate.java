package xyz.blapplappl.ir.event.events;

import xyz.blapplappl.ir.event.Event;

public class EventPreMotionUpdate extends Event {
    private float yaw, pitch;
    private boolean ground;
    private double x, y, z;

    public EventPreMotionUpdate(float yaw, float pitch, boolean ground, double x, double y, double z) {
        this.yaw = yaw;
        this.pitch = pitch;
        this.ground = ground;
        this.x = x;
        this.y = y;
        this.z = z;
    }

    //getters
    public float getYaw() {
        return yaw;
    }
    public float getPitch() {
        return pitch;
    }
    public boolean onGround() {
        return ground;
    }
    //setters
    public void setYaw(float yaw) {
        this.yaw = yaw;
    }
    public void setPitch(float pitch) {
        this.pitch = pitch;
    }
    public void setGround(boolean ground) {
        this.ground = ground;
    }
}
