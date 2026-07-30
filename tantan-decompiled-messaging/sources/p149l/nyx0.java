package p149l;

import com.google.android.gms.measurement.internal.C2458g;

/* JADX INFO: loaded from: classes6.dex */
public final class nyx0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Boolean f141170a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2458g f141171b;

    public nyx0(C2458g c2458g, Boolean bool) {
        this.f141170a = bool;
        this.f141171b = c2458g;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f141171b.m15193T(this.f141170a, true);
    }
}
