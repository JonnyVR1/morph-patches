package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.live.base.data.BFansBaseRecall;
import com.p046p1.mobile.putong.live.base.data.BLiveData;
import com.p046p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p046p1.mobile.putong.live.base.data.BLiveFanBase;
import com.p046p1.mobile.putong.live.base.data.BLiveFanBaseNotifyParams;
import com.p046p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes4.dex */
public class j6g {

    /* JADX INFO: renamed from: a */
    public gm0 f116468a = null;

    /* JADX INFO: renamed from: b */
    public BLiveFanBase f116469b = null;

    /* JADX INFO: renamed from: c */
    public String f116470c = null;

    /* JADX INFO: renamed from: d */
    public ho2 f116471d;

    public j6g(ho2 ho2Var) {
        this.f116471d = ho2Var;
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ h4g m139983f(BLiveEnvelope bLiveEnvelope) {
        BLiveData bLiveData = bLiveEnvelope.data;
        return new h4g(bLiveData.fanbases, bLiveData.fanbaseRelations);
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m139986i(Throwable th) {
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ kgg m139989l(gm0 gm0Var, BFansBaseRecall bFansBaseRecall) {
        return new kgg(bFansBaseRecall, gm0Var);
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ y8g m139990m(gm0 gm0Var, BLiveEnvelope bLiveEnvelope) {
        y8g y8gVar = new y8g(bLiveEnvelope);
        y8gVar.m213375e(gm0Var);
        return y8gVar;
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ C22306c m139996s(v9j v9jVar, h4g h4gVar) {
        return (C22306c) v9jVar.call();
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ void m139997t(gm0 gm0Var) {
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ void m139998u(Throwable th) {
    }

    /* JADX INFO: renamed from: A */
    public gm0 m140001A() {
        gm0 gm0Var = this.f116468a;
        if ((gm0Var == null || gm0Var.m126927b()) && this.f116471d.f108743D) {
            m140024X();
        }
        return this.f116468a;
    }

    /* JADX INFO: renamed from: B */
    public final C22306c<h4g> m140002B() {
        return LivingNormalApiProvider.m71580t4(this.f116470c).map(new w9j() { // from class: l.m5g
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return j6g.m139983f((BLiveEnvelope) obj);
            }
        }).doOnNext(new e30() { // from class: l.n5g
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f137210a.m140010J((h4g) obj);
            }
        });
    }

    /* JADX INFO: renamed from: C */
    public C22306c<y8g> m140003C(final String str) {
        return m140028z().flatMap(new w9j() { // from class: l.s5g
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f162550a.m140012L(str, (gm0) obj);
            }
        });
    }

    /* JADX INFO: renamed from: D */
    public void m140004D(boolean z, mcr mcrVar, String str) {
        this.f116470c = str;
        if (!z) {
            BLiveFanBase bLiveFanBaseM129237b = this.f116471d.m132161r0().m129237b();
            this.f116469b = bLiveFanBaseM129237b;
            if (bLiveFanBaseM129237b != null) {
                m140024X();
                return;
            }
        }
        mcrVar.duringCreated(m140002B()).subscribe(ffw.m121194e(new e30() { // from class: l.h6g
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f106055a.m140013M((h4g) obj);
            }
        }, new e30() { // from class: l.i6g
            @Override // p149l.e30
            public final void call(Object obj) {
                j6g.m139998u((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Boolean m140005E(BLiveEnvelope bLiveEnvelope) {
        return Boolean.valueOf(vwb.m200296J(bLiveEnvelope.data.fanbaseMedals) && this.f116471d.m132161r0().m129238c(qib0.f154713b0.f139230a.userId()));
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ C22306c m140006F(String str) {
        return LivingNormalApiProvider.m71634z4(str, this.f116469b.f44363id).map(new w9j() { // from class: l.x5g
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f191135a.m140005E((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ C22306c m140007G(String str, String str2) {
        return LivingNormalApiProvider.m71286M7(this.f116469b.f44363id, str, str2);
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m140008H(gm0 gm0Var) {
        if (gm0Var.m126927b()) {
            return;
        }
        this.f116468a = gm0Var;
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ C22306c m140009I() {
        return LivingNormalApiProvider.m71292N4(this.f116469b.f44363id).map(new d6g()).doOnNext(new e30() { // from class: l.e6g
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f89573a.m140008H((gm0) obj);
            }
        }).onErrorReturn(new w9j() { // from class: l.f6g
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return gm0.m126926a();
            }
        });
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m140010J(h4g h4gVar) {
        this.f116469b = h4gVar.m129237b();
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ C22306c m140011K(String str, final gm0 gm0Var) {
        return LivingNormalApiProvider.m71446e5(str, this.f116469b.f44363id).map(new w9j() { // from class: l.a6g
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return j6g.m139990m(gm0Var, (BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ C22306c m140012L(final String str, final gm0 gm0Var) {
        return m140023W(new v9j() { // from class: l.u5g
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f174705a.m140011K(str, gm0Var);
            }
        });
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m140013M(h4g h4gVar) {
        m140024X();
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ h8g m140014N(BLiveEnvelope bLiveEnvelope, gm0 gm0Var) {
        h8g h8gVar = new h8g();
        h8gVar.m129886d(new m6g(bLiveEnvelope, this.f116469b.f44363id));
        h8gVar.m129885c(gm0Var);
        return h8gVar;
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ C22306c m140015O(String str) {
        return C22306c.zip(LivingNormalApiProvider.m71256J4(this.f116469b.f44363id, str), m140028z(), new x9j() { // from class: l.o5g
            @Override // p149l.x9j
            public final Object call(Object obj, Object obj2) {
                return this.f141897a.m140014N((BLiveEnvelope) obj, (gm0) obj2);
            }
        });
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ C22306c m140016P() {
        return LivingNormalApiProvider.m71283M4(this.f116469b.f44363id, this.f116471d.mo132054A0()).map(new w9j() { // from class: l.q5g
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return new mcg((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ C22306c m140017Q(final String str, final gm0 gm0Var) {
        return m140023W(new v9j() { // from class: l.w5g
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return LivingNormalApiProvider.m71535o4(str).map(new w9j() { // from class: l.z5g
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return j6g.m139989l(gm0Var, (BFansBaseRecall) obj);
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ C22306c m140018R(String str) {
        if (w220.m201015b()) {
            return C22306c.just(BLiveEnvelope.new_());
        }
        BLiveFanBaseNotifyParams bLiveFanBaseNotifyParams = new BLiveFanBaseNotifyParams();
        bLiveFanBaseNotifyParams.type = "fanbase_medal_expire";
        String str2 = this.f116469b.f44363id;
        bLiveFanBaseNotifyParams.fanbaseId = str2;
        bLiveFanBaseNotifyParams.userId = str;
        return LivingNormalApiProvider.m71591u6(str2, bLiveFanBaseNotifyParams.toJson());
    }

    /* JADX INFO: renamed from: S */
    public C22306c<h8g> m140019S() {
        final String strUserId = qib0.f154713b0.f139230a.userId();
        return m140023W(new v9j() { // from class: l.g6g
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f101262a.m140015O(strUserId);
            }
        });
    }

    /* JADX INFO: renamed from: T */
    public C22306c<mcg> m140020T() {
        return m140023W(new v9j() { // from class: l.l5g
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f126133a.m140016P();
            }
        });
    }

    /* JADX INFO: renamed from: U */
    public C22306c<kgg> m140021U() {
        final String strUserId = qib0.f154713b0.f139230a.userId();
        return m140028z().flatMap(new w9j() { // from class: l.r5g
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f157817a.m140017Q(strUserId, (gm0) obj);
            }
        });
    }

    /* JADX INFO: renamed from: V */
    public C22306c<BLiveEnvelope> m140022V(final String str) {
        return m140023W(new v9j() { // from class: l.p5g
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f147297a.m140018R(str);
            }
        });
    }

    /* JADX INFO: renamed from: W */
    public final <T> C22306c<T> m140023W(final v9j<C22306c<T>> v9jVar) {
        return this.f116469b != null ? v9jVar.call() : (C22306c<T>) m140002B().flatMap(new w9j() { // from class: l.c6g
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return j6g.m139996s(v9jVar, (h4g) obj);
            }
        });
    }

    /* JADX INFO: renamed from: X */
    public final void m140024X() {
        m140028z().subscribe(ffw.m121194e(new e30() { // from class: l.v5g
            @Override // p149l.e30
            public final void call(Object obj) {
                j6g.m139997t((gm0) obj);
            }
        }, new e30() { // from class: l.b6g
            @Override // p149l.e30
            public final void call(Object obj) {
                j6g.m139986i((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Y */
    public void m140025Y() {
        this.f116469b = null;
        this.f116470c = null;
        this.f116468a = null;
    }

    /* JADX INFO: renamed from: x */
    public C22306c<Boolean> m140026x(final String str) {
        return m140023W(new v9j() { // from class: l.t5g
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f167825a.m140006F(str);
            }
        });
    }

    /* JADX INFO: renamed from: y */
    public C22306c<BLiveEnvelope> m140027y(final String str, final String str2) {
        return m140023W(new v9j() { // from class: l.y5g
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f196433a.m140007G(str, str2);
            }
        });
    }

    /* JADX INFO: renamed from: z */
    public C22306c<gm0> m140028z() {
        gm0 gm0Var = this.f116468a;
        if (gm0Var == null || gm0Var.m126927b()) {
            return (TextUtils.isEmpty(this.f116470c) || "null".equals(this.f116470c)) ? C22306c.just(gm0.m126926a()) : m140023W(new v9j() { // from class: l.k5g
                @Override // p149l.v9j, java.util.concurrent.Callable
                public final Object call() {
                    return this.f121203a.m140009I();
                }
            });
        }
        return C22306c.just(this.f116468a);
    }
}
