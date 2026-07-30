package com.p000p1.mobile.putong.live.livingroom.archi.message.event;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class KeyboardEventData {

    /* JADX INFO: renamed from: a */
    public final Action f3795a;

    /* JADX INFO: renamed from: b */
    public final Type f3796b;

    /* JADX INFO: renamed from: c */
    public final int f3797c;

    public enum Action {
        UnKnow,
        Show,
        Hide
    }

    public enum Type {
        UnKnow,
        SoftKeyBoard,
        Dialog
    }

    public KeyboardEventData(Action action, Type type, int i) {
        this.f3795a = action;
        this.f3796b = type;
        this.f3797c = i;
    }

    /* JADX INFO: renamed from: a */
    public int m5200a() {
        return this.f3797c;
    }

    /* JADX INFO: renamed from: b */
    public boolean m5201b() {
        return this.f3795a == Action.Show;
    }
}
