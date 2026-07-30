package com.vivo.push.p119e;

import java.util.ArrayList;

/* JADX INFO: renamed from: com.vivo.push.e.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C14757a {

    /* JADX INFO: renamed from: a */
    private static String[] f61883a = {"com.vivo.pushservice", "com.vivo.pushdemo.test", "com.vivo.sdk.test", "com.vivo.hybrid"};

    /* JADX INFO: renamed from: b */
    private ArrayList<String> f61884b;

    /* JADX INFO: renamed from: com.vivo.push.e.a$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        private static C14757a f61885a = new C14757a(0);
    }

    private C14757a() {
        this.f61884b = null;
        this.f61884b = new ArrayList<>();
    }

    /* JADX INFO: renamed from: a */
    public static C14757a m86079a() {
        return a.f61885a;
    }

    /* JADX INFO: renamed from: b */
    public final ArrayList<String> m86080b() {
        return new ArrayList<>(this.f61884b);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m86081c() {
        ArrayList<String> arrayList = this.f61884b;
        return (arrayList == null || arrayList.size() == 0) ? false : true;
    }

    public /* synthetic */ C14757a(byte b) {
        this();
    }
}
