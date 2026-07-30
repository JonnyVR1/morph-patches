package p153l;

import com.google.android.gms.measurement.internal.C2481g;

/* JADX INFO: loaded from: classes6.dex */
public final class h5y0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f107983a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f107984b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f107985c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ long f107986d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C2481g f107987e;

    public h5y0(C2481g c2481g, String str, String str2, Object obj, long j) {
        this.f107983a = str;
        this.f107984b = str2;
        this.f107985c = obj;
        this.f107986d = j;
        this.f107987e = c2481g;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f107987e.m15259b0(this.f107983a, this.f107984b, this.f107985c, this.f107986d);
    }
}
