package com.p003p1.mobile.android.app;

import android.os.Bundle;

/* JADX INFO: renamed from: com.p1.mobile.android.app.c */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class C0231c {

    /* JADX INFO: renamed from: e */
    public static C0231c f1243e = new C0231c("Attach", true, false, false);

    /* JADX INFO: renamed from: f */
    public static C0231c f1244f = new C0231c("AfterCreate", true, false, false);

    /* JADX INFO: renamed from: g */
    public static C0231c f1245g = new C0231c("AfterCreateView", true, false, false);

    /* JADX INFO: renamed from: h */
    public static C0231c f1246h = new C0231c("Start", true, true, false);

    /* JADX INFO: renamed from: i */
    public static C0231c f1247i = new C0231c("Resume", true, true, false);

    /* JADX INFO: renamed from: j */
    public static C0231c f1248j = new C0231c("Pause", false, true, false);

    /* JADX INFO: renamed from: k */
    public static C0231c f1249k = new C0231c("Stop", false, false, false);

    /* JADX INFO: renamed from: l */
    public static C0231c f1250l = new C0231c("DestroyView", false, false, false);

    /* JADX INFO: renamed from: m */
    public static C0231c f1251m = new C0231c("Destroy", false, false, false);

    /* JADX INFO: renamed from: n */
    public static C0231c f1252n = new C0231c("Detach", false, false, false);

    /* JADX INFO: renamed from: o */
    public static C0231c f1253o = new C0231c("Finish", false, true, true);

    /* JADX INFO: renamed from: a */
    public final boolean f1254a;

    /* JADX INFO: renamed from: b */
    public final boolean f1255b;

    /* JADX INFO: renamed from: c */
    public final String f1256c;

    /* JADX INFO: renamed from: d */
    public final boolean f1257d;

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
    public static abstract class c extends C0231c {

        /* JADX INFO: renamed from: p */
        public final Bundle f1258p;

        public c(String str, Bundle bundle, boolean z, boolean z2) {
            super(str, true, z, z2);
            this.f1258p = bundle;
        }
    }

    public C0231c(String str, boolean z, boolean z2, boolean z3) {
        this.f1256c = str;
        this.f1254a = z;
        this.f1255b = z2;
        this.f1257d = z3;
    }
}
