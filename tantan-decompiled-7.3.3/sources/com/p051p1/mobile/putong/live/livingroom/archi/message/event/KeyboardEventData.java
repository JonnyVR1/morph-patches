package com.p051p1.mobile.putong.live.livingroom.archi.message.event;

/* JADX INFO: loaded from: classes4.dex */
public class KeyboardEventData {

    /* JADX INFO: renamed from: a */
    public final Action f48601a;

    /* JADX INFO: renamed from: b */
    public final Type f48602b;

    /* JADX INFO: renamed from: c */
    public final int f48603c;

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
        this.f48601a = action;
        this.f48602b = type;
        this.f48603c = i;
    }

    /* JADX INFO: renamed from: a */
    public int m73007a() {
        return this.f48603c;
    }

    /* JADX INFO: renamed from: b */
    public boolean m73008b() {
        return this.f48601a == Action.Show;
    }
}
