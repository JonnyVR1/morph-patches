package p149l;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzw;
import com.google.android.gms.internal.ads.zzcei;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;

/* JADX INFO: loaded from: classes6.dex */
public final class ifv0 implements plv0 {

    /* JADX INFO: renamed from: a */
    public final zzw f113056a;

    /* JADX INFO: renamed from: b */
    public final zzcei f113057b;

    /* JADX INFO: renamed from: c */
    public final boolean f113058c;

    public ifv0(zzw zzwVar, zzcei zzceiVar, boolean z) {
        this.f113056a = zzwVar;
        this.f113057b = zzceiVar;
        this.f113058c = z;
    }

    @Override // p149l.plv0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo96132a(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (this.f113057b.zzc >= ((Integer) d1s0.m109677c().m144697a(m7s0.f132253h5)).intValue()) {
            bundle.putString("app_open_version", "2");
        }
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132266i5)).booleanValue()) {
            bundle.putBoolean("app_switched", this.f113058c);
        }
        zzw zzwVar = this.f113056a;
        if (zzwVar != null) {
            int i = zzwVar.zza;
            if (i == 1) {
                bundle.putString("avo", "p");
            } else if (i == 2) {
                bundle.putString("avo", BLiveStormDanmakuGiftResourceType.f44444l);
            }
        }
    }
}
