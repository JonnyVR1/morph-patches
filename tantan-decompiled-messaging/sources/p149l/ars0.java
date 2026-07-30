package p149l;

import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.internal.ads.zzbvk;

/* JADX INFO: loaded from: classes6.dex */
public final class ars0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AdOverlayInfoParcel f71341a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ zzbvk f71342b;

    public ars0(zzbvk zzbvkVar, AdOverlayInfoParcel adOverlayInfoParcel) {
        this.f71341a = adOverlayInfoParcel;
        this.f71342b = zzbvkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        vny0.m199073k();
        a8y0.m95388a(this.f71342b.f10114a, this.f71341a, true);
    }
}
