package com.vivo.push.p114e;

import java.util.ArrayList;

/* JADX INFO: renamed from: com.vivo.push.e.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C14609a {

    /* JADX INFO: renamed from: a */
    private static String[] f61036a = {"com.vivo.pushservice", "com.vivo.pushdemo.test", "com.vivo.sdk.test", "com.vivo.hybrid"};

    /* JADX INFO: renamed from: b */
    private ArrayList<String> f61037b;

    /* JADX INFO: renamed from: com.vivo.push.e.a$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        private static C14609a f61038a = new C14609a(0);
    }

    private C14609a() {
        this.f61037b = null;
        this.f61037b = new ArrayList<>();
    }

    /* JADX INFO: renamed from: a */
    public static C14609a m84908a() {
        return a.f61038a;
    }

    /* JADX INFO: renamed from: b */
    public final ArrayList<String> m84909b() {
        return new ArrayList<>(this.f61037b);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m84910c() {
        ArrayList<String> arrayList = this.f61037b;
        return (arrayList == null || arrayList.size() == 0) ? false : true;
    }

    public /* synthetic */ C14609a(byte b) {
        this();
    }
}
