package com.p046p1.mobile.putong.live.livingroom.archi.message.event;

/* JADX INFO: loaded from: classes4.dex */
public class KeyboardEventData {

    /* JADX INFO: renamed from: a */
    public final Action f47753a;

    /* JADX INFO: renamed from: b */
    public final Type f47754b;

    /* JADX INFO: renamed from: c */
    public final int f47755c;

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
        this.f47753a = action;
        this.f47754b = type;
        this.f47755c = i;
    }

    /* JADX INFO: renamed from: a */
    public int m71824a() {
        return this.f47755c;
    }

    /* JADX INFO: renamed from: b */
    public boolean m71825b() {
        return this.f47753a == Action.Show;
    }
}
