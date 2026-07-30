package com.p046p1.mobile.android.app;

import android.os.Bundle;

/* JADX INFO: renamed from: com.p1.mobile.android.app.c */
/* JADX INFO: loaded from: classes8.dex */
public class C4319c {

    /* JADX INFO: renamed from: e */
    public static C4319c f15544e = new C4319c("Attach", true, false, false);

    /* JADX INFO: renamed from: f */
    public static C4319c f15545f = new C4319c("AfterCreate", true, false, false);

    /* JADX INFO: renamed from: g */
    public static C4319c f15546g = new C4319c("AfterCreateView", true, false, false);

    /* JADX INFO: renamed from: h */
    public static C4319c f15547h = new C4319c("Start", true, true, false);

    /* JADX INFO: renamed from: i */
    public static C4319c f15548i = new C4319c("Resume", true, true, false);

    /* JADX INFO: renamed from: j */
    public static C4319c f15549j = new C4319c("Pause", false, true, false);

    /* JADX INFO: renamed from: k */
    public static C4319c f15550k = new C4319c("Stop", false, false, false);

    /* JADX INFO: renamed from: l */
    public static C4319c f15551l = new C4319c("DestroyView", false, false, false);

    /* JADX INFO: renamed from: m */
    public static C4319c f15552m = new C4319c("Destroy", false, false, false);

    /* JADX INFO: renamed from: n */
    public static C4319c f15553n = new C4319c("Detach", false, false, false);

    /* JADX INFO: renamed from: o */
    public static C4319c f15554o = new C4319c("Finish", false, true, true);

    /* JADX INFO: renamed from: a */
    public final boolean f15555a;

    /* JADX INFO: renamed from: b */
    public final boolean f15556b;

    /* JADX INFO: renamed from: c */
    public final String f15557c;

    /* JADX INFO: renamed from: d */
    public final boolean f15558d;

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
    public static abstract class c extends C4319c {

        /* JADX INFO: renamed from: p */
        public final Bundle f15559p;

        public c(String str, Bundle bundle, boolean z, boolean z2) {
            super(str, true, z, z2);
            this.f15559p = bundle;
        }
    }

    public C4319c(String str, boolean z, boolean z2, boolean z3) {
        this.f15557c = str;
        this.f15555a = z;
        this.f15556b = z2;
        this.f15558d = z3;
    }
}
