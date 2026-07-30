package p153l;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzw;
import com.google.android.gms.internal.ads.zzcei;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;

/* JADX INFO: loaded from: classes6.dex */
public final class oov0 implements vuv0 {

    /* JADX INFO: renamed from: a */
    public final zzw f148395a;

    /* JADX INFO: renamed from: b */
    public final zzcei f148396b;

    /* JADX INFO: renamed from: c */
    public final boolean f148397c;

    public oov0(zzw zzwVar, zzcei zzceiVar, boolean z) {
        this.f148395a = zzwVar;
        this.f148396b = zzceiVar;
        this.f148397c = z;
    }

    @Override // p153l.vuv0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo99378a(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (this.f148396b.zzc >= ((Integer) jas0.m144075c().m176505a(sgs0.f168324h5)).intValue()) {
            bundle.putString("app_open_version", "2");
        }
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168337i5)).booleanValue()) {
            bundle.putBoolean("app_switched", this.f148397c);
        }
        zzw zzwVar = this.f148395a;
        if (zzwVar != null) {
            int i = zzwVar.zza;
            if (i == 1) {
                bundle.putString("avo", "p");
            } else if (i == 2) {
                bundle.putString("avo", BLiveStormDanmakuGiftResourceType.f45292l);
            }
        }
    }
}
