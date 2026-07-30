package p153l;

import com.cosmos.photon.push.thirdparty.ThirdPushManager;

/* JADX INFO: loaded from: classes6.dex */
public final class glu0 implements lvw0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f104887a = ThirdPushManager.VENDOR_TYPE_FCM;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ilu0 f104888b;

    public glu0(ilu0 ilu0Var, String str, boolean z) {
        this.f104888b = ilu0Var;
    }

    @Override // p153l.lvw0
    public final void zza(Throwable th) {
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168246b5)).booleanValue()) {
            bxy0.m106933q().m120274v(th, "omid native display exp");
        }
    }

    @Override // p153l.lvw0
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        this.f104888b.f115619k.m196622t((wit0) obj);
        ilu0 ilu0Var = this.f104888b;
        tct0 tct0VarM196596c0 = ilu0Var.f115619k.m196596c0();
        hfw0 hfw0VarM140692R = ilu0Var.m140692R(this.f104887a, true);
        if (hfw0VarM140692R != null && tct0VarM196596c0 != null) {
            tct0VarM196596c0.m190494b(hfw0VarM140692R);
        } else if (tct0VarM196596c0 != null) {
            tct0VarM196596c0.cancel(false);
        }
    }
}
