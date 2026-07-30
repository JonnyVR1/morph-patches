package p149l;

import com.google.android.gms.internal.ads.zzcfz;

/* JADX INFO: loaded from: classes6.dex */
public final class a5t0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ boolean f67721a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ zzcfz f67722b;

    public a5t0(zzcfz zzcfzVar, boolean z) {
        this.f67721a = z;
        this.f67722b = zzcfzVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f67722b.m13608m("windowVisibilityChanged", "isVisible", String.valueOf(this.f67721a));
    }
}
