package com.p074ss.bytertc.engine.data;

/* JADX INFO: loaded from: classes11.dex */
public class HumanOrientation {
    public Orientation forward;
    public Orientation right;

    /* JADX INFO: renamed from: up */
    public Orientation f56461up;

    public HumanOrientation() {
        this.forward = new Orientation(1.0f, 0.0f, 0.0f);
        this.right = new Orientation(0.0f, 1.0f, 0.0f);
        this.f56461up = new Orientation(0.0f, 0.0f, 1.0f);
    }

    public HumanOrientation(Orientation orientation, Orientation orientation2, Orientation orientation3) {
        this.forward = orientation;
        this.right = orientation2;
        this.f56461up = orientation3;
    }
}
