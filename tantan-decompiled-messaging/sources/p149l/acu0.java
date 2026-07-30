package p149l;

import com.cosmos.photon.push.thirdparty.ThirdPushManager;

/* JADX INFO: loaded from: classes6.dex */
public final class acu0 implements fmw0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f68880a = ThirdPushManager.VENDOR_TYPE_FCM;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ccu0 f68881b;

    public acu0(ccu0 ccu0Var, String str, boolean z) {
        this.f68881b = ccu0Var;
    }

    @Override // p149l.fmw0
    public final void zza(Throwable th) {
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132175b5)).booleanValue()) {
            vny0.m199079q().m212289v(th, "omid native display exp");
        }
    }

    @Override // p149l.fmw0
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        this.f68881b.f80313k.m163615t((q9t0) obj);
        ccu0 ccu0Var = this.f68881b;
        n3t0 n3t0VarM163589c0 = ccu0Var.f80313k.m163589c0();
        b6w0 b6w0VarM106170R = ccu0Var.m106170R(this.f68880a, true);
        if (b6w0VarM106170R != null && n3t0VarM163589c0 != null) {
            n3t0VarM163589c0.m157774b(b6w0VarM106170R);
        } else if (n3t0VarM163589c0 != null) {
            n3t0VarM163589c0.cancel(false);
        }
    }
}
