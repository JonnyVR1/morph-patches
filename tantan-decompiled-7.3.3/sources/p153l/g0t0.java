package p153l;

import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.internal.ads.zzbvk;

/* JADX INFO: loaded from: classes6.dex */
public final class g0t0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AdOverlayInfoParcel f101680a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ zzbvk f101681b;

    public g0t0(zzbvk zzbvkVar, AdOverlayInfoParcel adOverlayInfoParcel) {
        this.f101680a = adOverlayInfoParcel;
        this.f101681b = zzbvkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bxy0.m106927k();
        ghy0.m130283a(this.f101681b.f10151a, this.f101680a, true);
    }
}
