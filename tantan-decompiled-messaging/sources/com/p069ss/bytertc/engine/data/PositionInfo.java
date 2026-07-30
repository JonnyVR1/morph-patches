package com.p069ss.bytertc.engine.data;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes13.dex */
public class PositionInfo {
    public HumanOrientation orientation;
    public Position position;

    public PositionInfo(Position position, HumanOrientation humanOrientation) {
        this.position = position;
        this.orientation = humanOrientation;
    }

    @CalledByNative
    public float getFieldOrientationForwardX() {
        return this.orientation.forward.f55617x;
    }

    @CalledByNative
    public float getFieldOrientationForwardY() {
        return this.orientation.forward.f55618y;
    }

    @CalledByNative
    public float getFieldOrientationForwardZ() {
        return this.orientation.forward.f55619z;
    }

    @CalledByNative
    public float getFieldOrientationRightX() {
        return this.orientation.right.f55617x;
    }

    @CalledByNative
    public float getFieldOrientationRightY() {
        return this.orientation.right.f55618y;
    }

    @CalledByNative
    public float getFieldOrientationRightZ() {
        return this.orientation.right.f55619z;
    }

    @CalledByNative
    public float getFieldOrientationUpX() {
        return this.orientation.f55613up.f55617x;
    }

    @CalledByNative
    public float getFieldOrientationUpY() {
        return this.orientation.f55613up.f55618y;
    }

    @CalledByNative
    public float getFieldOrientationUpZ() {
        return this.orientation.f55613up.f55619z;
    }

    @CalledByNative
    public float getFieldPositionX() {
        return this.position.f55621x;
    }

    @CalledByNative
    public float getFieldPositionY() {
        return this.position.f55622y;
    }

    @CalledByNative
    public float getFieldPositionZ() {
        return this.position.f55623z;
    }
}
