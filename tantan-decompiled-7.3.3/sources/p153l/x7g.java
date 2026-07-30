package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.live.base.data.BFansBaseRecall;
import com.p051p1.mobile.putong.live.base.data.BLiveData;
import com.p051p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p051p1.mobile.putong.live.base.data.BLiveFanBase;
import com.p051p1.mobile.putong.live.base.data.BLiveFanBaseNotifyParams;
import com.p051p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes4.dex */
public class x7g {

    /* JADX INFO: renamed from: a */
    public cm0 f192715a = null;

    /* JADX INFO: renamed from: b */
    public BLiveFanBase f192716b = null;

    /* JADX INFO: renamed from: c */
    public String f192717c = null;

    /* JADX INFO: renamed from: d */
    public oo2 f192718d;

    public x7g(oo2 oo2Var) {
        this.f192718d = oo2Var;
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ v5g m209588f(BLiveEnvelope bLiveEnvelope) {
        BLiveData bLiveData = bLiveEnvelope.data;
        return new v5g(bLiveData.fanbases, bLiveData.fanbaseRelations);
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m209591i(Throwable th) {
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ yhg m209594l(cm0 cm0Var, BFansBaseRecall bFansBaseRecall) {
        return new yhg(bFansBaseRecall, cm0Var);
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ mag m209595m(cm0 cm0Var, BLiveEnvelope bLiveEnvelope) {
        mag magVar = new mag(bLiveEnvelope);
        magVar.m157647e(cm0Var);
        return magVar;
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ C22421c m209601s(pcj pcjVar, v5g v5gVar) {
        return (C22421c) pcjVar.call();
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ void m209602t(cm0 cm0Var) {
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ void m209603u(Throwable th) {
    }

    /* JADX INFO: renamed from: A */
    public cm0 m209606A() {
        cm0 cm0Var = this.f192715a;
        if ((cm0Var == null || cm0Var.m111075b()) && this.f192718d.f148256D) {
            m209629X();
        }
        return this.f192715a;
    }

    /* JADX INFO: renamed from: B */
    public final C22421c<v5g> m209607B() {
        return LivingNormalApiProvider.m72763t4(this.f192717c).map(new qcj() { // from class: l.a7g
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return x7g.m209588f((BLiveEnvelope) obj);
            }
        }).doOnNext(new y20() { // from class: l.b7g
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f75300a.m209615J((v5g) obj);
            }
        });
    }

    /* JADX INFO: renamed from: C */
    public C22421c<mag> m209608C(final String str) {
        return m209633z().flatMap(new qcj() { // from class: l.g7g
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f102539a.m209617L(str, (cm0) obj);
            }
        });
    }

    /* JADX INFO: renamed from: D */
    public void m209609D(boolean z, ner nerVar, String str) {
        this.f192717c = str;
        if (!z) {
            BLiveFanBase bLiveFanBaseM199846b = this.f192718d.m168546r0().m199846b();
            this.f192716b = bLiveFanBaseM199846b;
            if (bLiveFanBaseM199846b != null) {
                m209629X();
                return;
            }
        }
        nerVar.duringCreated(m209607B()).subscribe(dhw.m115826e(new y20() { // from class: l.v7g
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f182757a.m209618M((v5g) obj);
            }
        }, new y20() { // from class: l.w7g
            @Override // p153l.y20
            public final void call(Object obj) {
                x7g.m209603u((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Boolean m209610E(BLiveEnvelope bLiveEnvelope) {
        return Boolean.valueOf(jyb.m147479J(bLiveEnvelope.data.fanbaseMedals) && this.f192718d.m168546r0().m199847c(uqb0.f180396b0.f170324a.userId()));
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ C22421c m209611F(String str) {
        return LivingNormalApiProvider.m72817z4(str, this.f192716b.f45211id).map(new qcj() { // from class: l.l7g
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f130343a.m209610E((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ C22421c m209612G(String str, String str2) {
        return LivingNormalApiProvider.m72469M7(this.f192716b.f45211id, str, str2);
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m209613H(cm0 cm0Var) {
        if (cm0Var.m111075b()) {
            return;
        }
        this.f192715a = cm0Var;
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ C22421c m209614I() {
        return LivingNormalApiProvider.m72475N4(this.f192716b.f45211id).map(new r7g()).doOnNext(new y20() { // from class: l.s7g
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f166688a.m209613H((cm0) obj);
            }
        }).onErrorReturn(new qcj() { // from class: l.t7g
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return cm0.m111074a();
            }
        });
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m209615J(v5g v5gVar) {
        this.f192716b = v5gVar.m199846b();
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ C22421c m209616K(String str, final cm0 cm0Var) {
        return LivingNormalApiProvider.m72629e5(str, this.f192716b.f45211id).map(new qcj() { // from class: l.o7g
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return x7g.m209595m(cm0Var, (BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ C22421c m209617L(final String str, final cm0 cm0Var) {
        return m209628W(new pcj() { // from class: l.i7g
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f113259a.m209616K(str, cm0Var);
            }
        });
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m209618M(v5g v5gVar) {
        m209629X();
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ v9g m209619N(BLiveEnvelope bLiveEnvelope, cm0 cm0Var) {
        v9g v9gVar = new v9g();
        v9gVar.m200447d(new a8g(bLiveEnvelope, this.f192716b.f45211id));
        v9gVar.m200446c(cm0Var);
        return v9gVar;
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ C22421c m209620O(String str) {
        return C22421c.zip(LivingNormalApiProvider.m72439J4(this.f192716b.f45211id, str), m209633z(), new rcj() { // from class: l.c7g
            @Override // p153l.rcj
            public final Object call(Object obj, Object obj2) {
                return this.f80112a.m209619N((BLiveEnvelope) obj, (cm0) obj2);
            }
        });
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ C22421c m209621P() {
        return LivingNormalApiProvider.m72466M4(this.f192716b.f45211id, this.f192718d.mo118362A0()).map(new qcj() { // from class: l.e7g
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return new aeg((BLiveEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ C22421c m209622Q(final String str, final cm0 cm0Var) {
        return m209628W(new pcj() { // from class: l.k7g
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return LivingNormalApiProvider.m72718o4(str).map(new qcj() { // from class: l.n7g
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return x7g.m209594l(cm0Var, (BFansBaseRecall) obj);
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ C22421c m209623R(String str) {
        if (eb20.m120149b()) {
            return C22421c.just(BLiveEnvelope.new_());
        }
        BLiveFanBaseNotifyParams bLiveFanBaseNotifyParams = new BLiveFanBaseNotifyParams();
        bLiveFanBaseNotifyParams.type = "fanbase_medal_expire";
        String str2 = this.f192716b.f45211id;
        bLiveFanBaseNotifyParams.fanbaseId = str2;
        bLiveFanBaseNotifyParams.userId = str;
        return LivingNormalApiProvider.m72774u6(str2, bLiveFanBaseNotifyParams.toJson());
    }

    /* JADX INFO: renamed from: S */
    public C22421c<v9g> m209624S() {
        final String strUserId = uqb0.f180396b0.f170324a.userId();
        return m209628W(new pcj() { // from class: l.u7g
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f177901a.m209620O(strUserId);
            }
        });
    }

    /* JADX INFO: renamed from: T */
    public C22421c<aeg> m209625T() {
        return m209628W(new pcj() { // from class: l.z6g
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f203160a.m209621P();
            }
        });
    }

    /* JADX INFO: renamed from: U */
    public C22421c<yhg> m209626U() {
        final String strUserId = uqb0.f180396b0.f170324a.userId();
        return m209633z().flatMap(new qcj() { // from class: l.f7g
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f97555a.m209622Q(strUserId, (cm0) obj);
            }
        });
    }

    /* JADX INFO: renamed from: V */
    public C22421c<BLiveEnvelope> m209627V(final String str) {
        return m209628W(new pcj() { // from class: l.d7g
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f85509a.m209623R(str);
            }
        });
    }

    /* JADX INFO: renamed from: W */
    public final <T> C22421c<T> m209628W(final pcj<C22421c<T>> pcjVar) {
        return this.f192716b != null ? pcjVar.call() : (C22421c<T>) m209607B().flatMap(new qcj() { // from class: l.q7g
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return x7g.m209601s(pcjVar, (v5g) obj);
            }
        });
    }

    /* JADX INFO: renamed from: X */
    public final void m209629X() {
        m209633z().subscribe(dhw.m115826e(new y20() { // from class: l.j7g
            @Override // p153l.y20
            public final void call(Object obj) {
                x7g.m209602t((cm0) obj);
            }
        }, new y20() { // from class: l.p7g
            @Override // p153l.y20
            public final void call(Object obj) {
                x7g.m209591i((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Y */
    public void m209630Y() {
        this.f192716b = null;
        this.f192717c = null;
        this.f192715a = null;
    }

    /* JADX INFO: renamed from: x */
    public C22421c<Boolean> m209631x(final String str) {
        return m209628W(new pcj() { // from class: l.h7g
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f108126a.m209611F(str);
            }
        });
    }

    /* JADX INFO: renamed from: y */
    public C22421c<BLiveEnvelope> m209632y(final String str, final String str2) {
        return m209628W(new pcj() { // from class: l.m7g
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f135074a.m209612G(str, str2);
            }
        });
    }

    /* JADX INFO: renamed from: z */
    public C22421c<cm0> m209633z() {
        cm0 cm0Var = this.f192715a;
        if (cm0Var == null || cm0Var.m111075b()) {
            return (TextUtils.isEmpty(this.f192717c) || "null".equals(this.f192717c)) ? C22421c.just(cm0.m111074a()) : m209628W(new pcj() { // from class: l.y6g
                @Override // p153l.pcj, java.util.concurrent.Callable
                public final Object call() {
                    return this.f197684a.m209614I();
                }
            });
        }
        return C22421c.just(this.f192715a);
    }
}
