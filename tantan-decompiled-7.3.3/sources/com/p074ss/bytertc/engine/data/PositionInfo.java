package com.p074ss.bytertc.engine.data;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes11.dex */
public class PositionInfo {
    public HumanOrientation orientation;
    public Position position;

    public PositionInfo(Position position, HumanOrientation humanOrientation) {
        this.position = position;
        this.orientation = humanOrientation;
    }

    @CalledByNative
    public float getFieldOrientationForwardX() {
        return this.orientation.forward.f56465x;
    }

    @CalledByNative
    public float getFieldOrientationForwardY() {
        return this.orientation.forward.f56466y;
    }

    @CalledByNative
    public float getFieldOrientationForwardZ() {
        return this.orientation.forward.f56467z;
    }

    @CalledByNative
    public float getFieldOrientationRightX() {
        return this.orientation.right.f56465x;
    }

    @CalledByNative
    public float getFieldOrientationRightY() {
        return this.orientation.right.f56466y;
    }

    @CalledByNative
    public float getFieldOrientationRightZ() {
        return this.orientation.right.f56467z;
    }

    @CalledByNative
    public float getFieldOrientationUpX() {
        return this.orientation.f56461up.f56465x;
    }

    @CalledByNative
    public float getFieldOrientationUpY() {
        return this.orientation.f56461up.f56466y;
    }

    @CalledByNative
    public float getFieldOrientationUpZ() {
        return this.orientation.f56461up.f56467z;
    }

    @CalledByNative
    public float getFieldPositionX() {
        return this.position.f56469x;
    }

    @CalledByNative
    public float getFieldPositionY() {
        return this.position.f56470y;
    }

    @CalledByNative
    public float getFieldPositionZ() {
        return this.position.f56471z;
    }
}
