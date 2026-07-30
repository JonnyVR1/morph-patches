package com.p051p1.mobile.android.app;

import android.os.Bundle;

/* JADX INFO: renamed from: com.p1.mobile.android.app.c */
/* JADX INFO: loaded from: classes8.dex */
public class C4470c {

    /* JADX INFO: renamed from: e */
    public static C4470c f16263e = new C4470c("Attach", true, false, false);

    /* JADX INFO: renamed from: f */
    public static C4470c f16264f = new C4470c("AfterCreate", true, false, false);

    /* JADX INFO: renamed from: g */
    public static C4470c f16265g = new C4470c("AfterCreateView", true, false, false);

    /* JADX INFO: renamed from: h */
    public static C4470c f16266h = new C4470c("Start", true, true, false);

    /* JADX INFO: renamed from: i */
    public static C4470c f16267i = new C4470c("Resume", true, true, false);

    /* JADX INFO: renamed from: j */
    public static C4470c f16268j = new C4470c("Pause", false, true, false);

    /* JADX INFO: renamed from: k */
    public static C4470c f16269k = new C4470c("Stop", false, false, false);

    /* JADX INFO: renamed from: l */
    public static C4470c f16270l = new C4470c("DestroyView", false, false, false);

    /* JADX INFO: renamed from: m */
    public static C4470c f16271m = new C4470c("Destroy", false, false, false);

    /* JADX INFO: renamed from: n */
    public static C4470c f16272n = new C4470c("Detach", false, false, false);

    /* JADX INFO: renamed from: o */
    public static C4470c f16273o = new C4470c("Finish", false, true, true);

    /* JADX INFO: renamed from: a */
    public final boolean f16274a;

    /* JADX INFO: renamed from: b */
    public final boolean f16275b;

    /* JADX INFO: renamed from: c */
    public final String f16276c;

    /* JADX INFO: renamed from: d */
    public final boolean f16277d;

    /* JADX INFO: renamed from: com.p1.mobile.android.app.c$a */
    public static class a extends c {
        public a(Bundle bundle) {
            super("Create", bundle, false, false);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.android.app.c$b */
    public static class b extends c {
        public b(Bundle bundle) {
            super("CreateView", bundle, false, false);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.android.app.c$c */
    public static abstract class c extends C4470c {

        /* JADX INFO: renamed from: p */
        public final Bundle f16278p;

        public c(String str, Bundle bundle, boolean z, boolean z2) {
            super(str, true, z, z2);
            this.f16278p = bundle;
        }
    }

    public C4470c(String str, boolean z, boolean z2, boolean z3) {
        this.f16276c = str;
        this.f16274a = z;
        this.f16275b = z2;
        this.f16277d = z3;
    }
}
