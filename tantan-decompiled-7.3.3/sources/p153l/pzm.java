package p153l;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes4.dex */
public class pzm {

    /* JADX INFO: renamed from: a */
    public qzs f154935a;

    /* JADX INFO: renamed from: b */
    public fbt f154936b;

    /* JADX INFO: renamed from: l.pzm$a */
    public static final class C19474a {
        private static final pzm INSTANCE = new pzm();
    }

    public pzm() {
        this.f154935a = new qzs();
        this.f154936b = new fbt();
    }

    /* JADX INFO: renamed from: c */
    public static pzm m174537c() {
        return C19474a.INSTANCE;
    }

    /* JADX INFO: renamed from: a */
    public void m174538a(boolean z) {
        m174540d(z).dismiss();
    }

    /* JADX INFO: renamed from: b */
    public void m174539b() {
        m174540d(true).dismiss();
        m174540d(false).dismiss();
    }

    @NonNull
    /* JADX INFO: renamed from: d */
    public kwl m174540d(boolean z) {
        return z ? this.f154935a : this.f154936b;
    }

    /* JADX INFO: renamed from: e */
    public void m174541e(boolean z) {
        m174540d(z).mo124928q();
    }

    /* JADX INFO: renamed from: f */
    public boolean m174542f(hti htiVar, boolean z) {
        nsh0.m164608j("live_float_window", "showFloatingWindow:" + z);
        return m174540d(z).mo124927p(htiVar);
    }
}
