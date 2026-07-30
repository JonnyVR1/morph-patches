package com.p069ss.bytertc.engine.data;

/* JADX INFO: loaded from: classes13.dex */
public class HumanOrientation {
    public Orientation forward;
    public Orientation right;

    /* JADX INFO: renamed from: up */
    public Orientation f55613up;

    public HumanOrientation() {
        this.forward = new Orientation(1.0f, 0.0f, 0.0f);
        this.right = new Orientation(0.0f, 1.0f, 0.0f);
        this.f55613up = new Orientation(0.0f, 0.0f, 1.0f);
    }

    public HumanOrientation(Orientation orientation, Orientation orientation2, Orientation orientation3) {
        this.forward = orientation;
        this.right = orientation2;
        this.f55613up = orientation3;
    }
}
