package p153l;

import com.google.android.gms.internal.ads.zzbbz;

/* JADX INFO: loaded from: classes6.dex */
public final class ssu0 implements upx0 {

    /* JADX INFO: renamed from: a */
    public final kqx0 f170520a;

    public ssu0(kqx0 kqx0Var) {
        this.f170520a = kqx0Var;
    }

    @Override // p153l.kqx0
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzbbz zzbbzVar = ((z5u0) this.f170520a).m218742a().f145329o.f192644a == 3 ? zzbbz.REWARDED_INTERSTITIAL : zzbbz.REWARD_BASED_VIDEO_AD;
        cqx0.m111999b(zzbbzVar);
        return zzbbzVar;
    }
}
