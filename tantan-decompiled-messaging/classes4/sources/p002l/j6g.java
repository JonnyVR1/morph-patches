package p002l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p1.mobile.putong.live.base.data.BFansBaseRecall;
import com.p1.mobile.putong.live.base.data.BLiveData;
import com.p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p1.mobile.putong.live.base.data.BLiveFanBase;
import com.p1.mobile.putong.live.base.data.BLiveFanBaseNotifyParams;
import l.e30;
import l.ffw;
import l.h4g;
import l.mcr;
import l.qib0;
import l.v9j;
import l.vwb;
import l.w9j;
import l.x9j;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class j6g {

    /* JADX INFO: renamed from: a */
    public gm0 f13606a = null;

    /* JADX INFO: renamed from: b */
    public BLiveFanBase f13607b = null;

    /* JADX INFO: renamed from: c */
    public String f13608c = null;

    /* JADX INFO: renamed from: d */
    public ho2 f13609d;

    public j6g(ho2 ho2Var) {
        this.f13609d = ho2Var;
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ h4g m15674f(BLiveEnvelope bLiveEnvelope) {
        BLiveData bLiveData = bLiveEnvelope.data;
        return new h4g(bLiveData.fanbases, bLiveData.fanbaseRelations);
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m15677i(Throwable th) {
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ kgg m15680l(gm0 gm0Var, BFansBaseRecall bFansBaseRecall) {
        return new kgg(bFansBaseRecall, gm0Var);
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ y8g m15681m(gm0 gm0Var, BLiveEnvelope bLiveEnvelope) {
        y8g y8gVar = new y8g(bLiveEnvelope);
        y8gVar.m26440e(gm0Var);
        return y8gVar;
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ c m15687s(v9j v9jVar, h4g h4gVar) {
        return (c) v9jVar.call();
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ void m15688t(gm0 gm0Var) {
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ void m15689u(Throwable th) {
    }

    /* JADX INFO: renamed from: A */
    public gm0 m15692A() {
        gm0 gm0Var = this.f13606a;
        if ((gm0Var == null || gm0Var.m13898b()) && this.f13609d.f12143D) {
            m15715X();
        }
        return this.f13606a;
    }

    /* JADX INFO: renamed from: B */
    public final c<h4g> m15693B() {
        return LivingNormalApiProvider.m4946t4(this.f13608c).map(new w9j() { // from class: l.m5g
            public final Object call(Object obj) {
                return j6g.m15674f((BLiveEnvelope) obj);
            }
        }).doOnNext(new e30() { // from class: l.n5g
            public final void call(Object obj) {
                this.f15829a.m15701J((h4g) obj);
            }
        });
    }

    /* JADX INFO: renamed from: C */
    public c<y8g> m15694C(final String str) {
        return m15719z().flatMap(new w9j() { // from class: l.s5g
            public final Object call(Object obj) {
                return this.f18800a.m15703L(str, (gm0) obj);
            }
        });
    }

    /* JADX INFO: renamed from: D */
    public void m15695D(boolean z, mcr mcrVar, String str) {
        this.f13608c = str;
        if (!z) {
            BLiveFanBase bLiveFanBaseB = this.f13609d.m14597r0().b();
            this.f13607b = bLiveFanBaseB;
            if (bLiveFanBaseB != null) {
                m15715X();
                return;
            }
        }
        mcrVar.duringCreated(m15693B()).subscribe(ffw.e(new e30() { // from class: l.h6g
            public final void call(Object obj) {
                this.f11899a.m15704M((h4g) obj);
            }
        }, new e30() { // from class: l.i6g
            public final void call(Object obj) {
                j6g.m15689u((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Boolean m15696E(BLiveEnvelope bLiveEnvelope) {
        return Boolean.valueOf(vwb.J(bLiveEnvelope.data.fanbaseMedals) && this.f13609d.m14597r0().c(qib0.b0.a.userId()));
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ c m15697F(String str) {
        return LivingNormalApiProvider.m5000z4(str, this.f13607b.id).map(new w9j() { // from class: l.x5g
            public final Object call(Object obj) {
                return this.f22129a.m15696E((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ c m15698G(String str, String str2) {
        return LivingNormalApiProvider.m4652M7(this.f13607b.id, str, str2);
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m15699H(gm0 gm0Var) {
        if (gm0Var.m13898b()) {
            return;
        }
        this.f13606a = gm0Var;
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ c m15700I() {
        return LivingNormalApiProvider.m4658N4(this.f13607b.id).map(new w9j() { // from class: l.d6g
            public final Object call(Object obj) {
                return new gm0((BLiveEnvelope) obj);
            }
        }).doOnNext(new e30() { // from class: l.e6g
            public final void call(Object obj) {
                this.f9595a.m15699H((gm0) obj);
            }
        }).onErrorReturn(new w9j() { // from class: l.f6g
            public final Object call(Object obj) {
                return gm0.m13897a();
            }
        });
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m15701J(h4g h4gVar) {
        this.f13607b = h4gVar.b();
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ c m15702K(String str, final gm0 gm0Var) {
        return LivingNormalApiProvider.m4812e5(str, this.f13607b.id).map(new w9j() { // from class: l.a6g
            public final Object call(Object obj) {
                return j6g.m15681m(gm0Var, (BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ c m15703L(final String str, final gm0 gm0Var) {
        return m15714W(new v9j() { // from class: l.u5g
            public final Object call() {
                return this.f20496a.m15702K(str, gm0Var);
            }
        });
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m15704M(h4g h4gVar) {
        m15715X();
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ h8g m15705N(BLiveEnvelope bLiveEnvelope, gm0 gm0Var) {
        h8g h8gVar = new h8g();
        h8gVar.m14286d(new m6g(bLiveEnvelope, this.f13607b.id));
        h8gVar.m14285c(gm0Var);
        return h8gVar;
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ c m15706O(String str) {
        return c.zip(LivingNormalApiProvider.m4622J4(this.f13607b.id, str), m15719z(), new x9j() { // from class: l.o5g
            public final Object call(Object obj, Object obj2) {
                return this.f16370a.m15705N((BLiveEnvelope) obj, (gm0) obj2);
            }
        });
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ c m15707P() {
        return LivingNormalApiProvider.m4649M4(this.f13607b.id, this.f13609d.mo14489A0()).map(new w9j() { // from class: l.q5g
            public final Object call(Object obj) {
                return new mcg((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ c m15708Q(final String str, final gm0 gm0Var) {
        return m15714W(new v9j() { // from class: l.w5g
            public final Object call() {
                return LivingNormalApiProvider.m4901o4(str).map(new w9j() { // from class: l.z5g
                    public final Object call(Object obj) {
                        return j6g.m15680l(gm0Var, (BFansBaseRecall) obj);
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ c m15709R(String str) {
        if (w220.m24291b()) {
            return c.just(BLiveEnvelope.new_());
        }
        BLiveFanBaseNotifyParams bLiveFanBaseNotifyParams = new BLiveFanBaseNotifyParams();
        bLiveFanBaseNotifyParams.type = "fanbase_medal_expire";
        String str2 = this.f13607b.id;
        bLiveFanBaseNotifyParams.fanbaseId = str2;
        bLiveFanBaseNotifyParams.userId = str;
        return LivingNormalApiProvider.m4957u6(str2, bLiveFanBaseNotifyParams.toJson());
    }

    /* JADX INFO: renamed from: S */
    public c<h8g> m15710S() {
        final String strUserId = qib0.b0.a.userId();
        return m15714W(new v9j() { // from class: l.g6g
            public final Object call() {
                return this.f11285a.m15706O(strUserId);
            }
        });
    }

    /* JADX INFO: renamed from: T */
    public c<mcg> m15711T() {
        return m15714W(new v9j() { // from class: l.l5g
            public final Object call() {
                return this.f14677a.m15707P();
            }
        });
    }

    /* JADX INFO: renamed from: U */
    public c<kgg> m15712U() {
        final String strUserId = qib0.b0.a.userId();
        return m15719z().flatMap(new w9j() { // from class: l.r5g
            public final Object call(Object obj) {
                return this.f18371a.m15708Q(strUserId, (gm0) obj);
            }
        });
    }

    /* JADX INFO: renamed from: V */
    public c<BLiveEnvelope> m15713V(final String str) {
        return m15714W(new v9j() { // from class: l.p5g
            public final Object call() {
                return this.f17011a.m15709R(str);
            }
        });
    }

    /* JADX INFO: renamed from: W */
    public final <T> c<T> m15714W(final v9j<c<T>> v9jVar) {
        return this.f13607b != null ? (c) v9jVar.call() : m15693B().flatMap(new w9j() { // from class: l.c6g
            public final Object call(Object obj) {
                return j6g.m15687s(v9jVar, (h4g) obj);
            }
        });
    }

    /* JADX INFO: renamed from: X */
    public final void m15715X() {
        m15719z().subscribe(ffw.e(new e30() { // from class: l.v5g
            public final void call(Object obj) {
                j6g.m15688t((gm0) obj);
            }
        }, new e30() { // from class: l.b6g
            public final void call(Object obj) {
                j6g.m15677i((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Y */
    public void m15716Y() {
        this.f13607b = null;
        this.f13608c = null;
        this.f13606a = null;
    }

    /* JADX INFO: renamed from: x */
    public c<Boolean> m15717x(final String str) {
        return m15714W(new v9j() { // from class: l.t5g
            public final Object call() {
                return this.f19426a.m15697F(str);
            }
        });
    }

    /* JADX INFO: renamed from: y */
    public c<BLiveEnvelope> m15718y(final String str, final String str2) {
        return m15714W(new v9j() { // from class: l.y5g
            public final Object call() {
                return this.f22668a.m15698G(str, str2);
            }
        });
    }

    /* JADX INFO: renamed from: z */
    public c<gm0> m15719z() {
        gm0 gm0Var = this.f13606a;
        if (gm0Var == null || gm0Var.m13898b()) {
            return (TextUtils.isEmpty(this.f13608c) || "null".equals(this.f13608c)) ? c.just(gm0.m13897a()) : m15714W(new v9j() { // from class: l.k5g
                public final Object call() {
                    return this.f14204a.m15700I();
                }
            });
        }
        return c.just(this.f13606a);
    }
}
