package p149l;

import com.google.android.gms.measurement.internal.C2458g;

/* JADX INFO: loaded from: classes6.dex */
public final class bwx0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f77713a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f77714b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f77715c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ long f77716d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C2458g f77717e;

    public bwx0(C2458g c2458g, String str, String str2, Object obj, long j) {
        this.f77713a = str;
        this.f77714b = str2;
        this.f77715c = obj;
        this.f77716d = j;
        this.f77717e = c2458g;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f77717e.m15205b0(this.f77713a, this.f77714b, this.f77715c, this.f77716d);
    }
}
