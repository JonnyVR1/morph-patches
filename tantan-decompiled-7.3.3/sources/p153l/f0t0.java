package p153l;

import com.google.android.gms.internal.ads.zzbvk;

/* JADX INFO: loaded from: classes6.dex */
public final class f0t0 implements joy0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzbvk f96718a;

    public f0t0(zzbvk zzbvkVar) {
        this.f96718a = zzbvkVar;
    }

    @Override // p153l.joy0
    /* JADX INFO: renamed from: M6 */
    public final void mo113753M6() {
        dct0.m115293b("AdMobCustomTabsAdapter overlay is paused.");
    }

    @Override // p153l.joy0
    /* JADX INFO: renamed from: O */
    public final void mo113754O() {
        dct0.m115293b("Delay close AdMobCustomTabsAdapter overlay.");
    }

    @Override // p153l.joy0
    /* JADX INFO: renamed from: P2 */
    public final void mo113755P2() {
        dct0.m115293b("Opening AdMobCustomTabsAdapter overlay.");
        zzbvk zzbvkVar = this.f96718a;
        zzbvkVar.f10152b.mo103047o(zzbvkVar);
    }

    @Override // p153l.joy0
    /* JADX INFO: renamed from: g7 */
    public final void mo113765g7() {
        dct0.m115293b("AdMobCustomTabsAdapter overlay is resumed.");
    }

    @Override // p153l.joy0
    /* JADX INFO: renamed from: m5 */
    public final void mo113769m5(int i) {
        dct0.m115293b("AdMobCustomTabsAdapter overlay is closed.");
        zzbvk zzbvkVar = this.f96718a;
        zzbvkVar.f10152b.mo103049s(zzbvkVar);
    }

    @Override // p153l.joy0
    /* JADX INFO: renamed from: m4 */
    public final void mo113768m4() {
    }
}
