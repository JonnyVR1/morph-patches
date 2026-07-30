package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.live.base.data.BLiveCall;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveCallMessage;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveInfoMessage;
import java.util.List;
import p133rx.C22306c;
import p133rx.subjects.C22392a;

/* JADX INFO: loaded from: classes5.dex */
public class o44 extends pat<pn40> {

    /* JADX INFO: renamed from: i */
    public String f141735i;

    /* JADX INFO: renamed from: j */
    public final cud f141736j;

    /* JADX INFO: renamed from: k */
    public C22392a<Boolean> f141737k;

    public o44(bsm bsmVar, a34 a34Var) {
        super(bsmVar);
        this.f141735i = "CallConstant";
        this.f141737k = C22392a.m221512b();
        this.f141736j = new cud(m206032L2());
        m144512z2(new e64(bsmVar, a34Var.f67326c, this));
    }

    /* JADX INFO: renamed from: J3 */
    public static /* synthetic */ Boolean m162515J3(cud cudVar) {
        int i = cudVar.f82558e;
        return Boolean.valueOf(i == 3 || i == 4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j4 */
    public void m162525j4(LiveInfoMessage liveInfoMessage) {
        List<LongLinkLiveMessage.CallRewardPoint> list = liveInfoMessage.callRewardPoint;
        if (vwb.m200296J(list)) {
            return;
        }
        vwb.m200354z(list, new e30() { // from class: l.e44
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f89247a.m162538g4((LongLinkLiveMessage.CallRewardPoint) obj);
            }
        });
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        m129301d3(fd50.class, new w9j() { // from class: l.g44
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f100539a.m162534c4((fd50) obj);
            }
        });
        m129301d3(y24.class, new w9j() { // from class: l.h44
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f105800a.m162533b4((y24) obj);
            }
        });
        m129301d3(bkj.class, new w9j() { // from class: l.i44
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f111405a.m162535d4((bkj) obj);
            }
        });
        duringCreated(new v9j() { // from class: l.j44
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f116139a.m162532a4();
            }
        }).filter(new w9j() { // from class: l.k44
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return o44.m162515J3((cud) obj);
            }
        }).subscribe(ffw.m121193d(new e30() { // from class: l.l44
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f125967a.m162536e4((cud) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: U3 */
    public void mo162526U3(z24 z24Var) {
        this.f141736j.m108750c(z24Var);
    }

    /* JADX INFO: renamed from: V3 */
    public void m162527V3(Throwable th) {
        int i;
        String str = null;
        if (th instanceof TantanException.Client.CoreService) {
            TantanException.Client.CoreService coreService = (TantanException.Client.CoreService) th;
            i = coreService.code;
            if (i != 41052 && i != 41002 && i != 41004 && i != 41000) {
                str = coreService.metaMessage;
            }
        } else {
            i = 0;
        }
        if (str == null) {
            lsi0.m151578h(R$string.f46764J9);
        } else {
            lsi0.m151580j(str);
        }
        h54.m129377d("error cause code = " + i + " message = " + str);
    }

    /* JADX INFO: renamed from: W3 */
    public void m162528W3(BLiveCall bLiveCall) {
        m162529X3(bLiveCall, "");
    }

    /* JADX INFO: renamed from: X3 */
    public void m162529X3(BLiveCall bLiveCall, String str) {
        if (bLiveCall == null || TextUtils.isEmpty(bLiveCall.f44342id) || v44.m196938f(bLiveCall)) {
            return;
        }
        h54.m129377d("finish call :" + bLiveCall.f44342id + ",reason:" + str);
        duringCreated(LivingNormalApiProvider.m71456f6(bLiveCall.f44342id, m206032L2(), str)).subscribe(ffw.m121194e(new e30() { // from class: l.b44
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f73281a.m162537f4((List) obj);
            }
        }, new f44(this)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Y3 */
    public void m162530Y3(e30<i0s> e30Var) {
        if (((pn40) m206027E2()).mo149813j() == null || TextUtils.isEmpty(((pn40) m206027E2()).m149814k())) {
            return;
        }
        duringCreated(LivingNormalApiProvider.m71291N3(((pn40) m206027E2()).m149814k())).subscribe(ffw.m121194e(e30Var, new f44(this)));
    }

    /* JADX INFO: renamed from: Z3 */
    public cud m162531Z3() {
        return this.f141736j;
    }

    /* JADX INFO: renamed from: a4 */
    public C22306c<cud> m162532a4() {
        return this.f141736j.m108757j();
    }

    /* JADX INFO: renamed from: b4 */
    public final r44 m162533b4(y24 y24Var) {
        BLiveCall bLiveCallM108753f = this.f141736j.m108753f(y24Var.f195489c);
        i54 i54VarM133917k = this.f141736j.m108760m().m133917k(y24Var.f195489c);
        if (bLiveCallM108753f == null || i54VarM133917k == null) {
            return null;
        }
        return new r44(mlj.m155154c(i54VarM133917k, q44.m172922b(bLiveCallM108753f.f44342id, "gift-audience-none-callaudience", bLiveCallM108753f.position)), v44.m196935c(bLiveCallM108753f));
    }

    /* JADX INFO: renamed from: c4 */
    public final /* synthetic */ Boolean m162534c4(fd50 fd50Var) {
        return Boolean.valueOf(this.f141736j.m108760m().m133919m().size() != 0);
    }

    /* JADX INFO: renamed from: d4 */
    public final /* synthetic */ List m162535d4(bkj bkjVar) {
        return this.f141736j.m108761n();
    }

    /* JADX INFO: renamed from: e4 */
    public final /* synthetic */ void m162536e4(cud cudVar) {
        int size = this.f141736j.m108760m().m133919m().size();
        if (cudVar.f82558e == 3) {
            if (size != 0) {
                return;
            }
        } else if (size != 1) {
            return;
        }
        m206028F2().BottomEvent.callBottomButtonApiDiffRefresh().m172467p();
    }

    /* JADX INFO: renamed from: f4 */
    public final /* synthetic */ void m162537f4(List list) {
        mo162541k4((BLiveCall) list.get(0));
    }

    /* JADX INFO: renamed from: g4 */
    public final /* synthetic */ void m162538g4(LongLinkLiveMessage.CallRewardPoint callRewardPoint) {
        BLiveCall bLiveCallM108753f = this.f141736j.m108753f(callRewardPoint.getUserId());
        if (bLiveCallM108753f != null) {
            bLiveCallM108753f.userRecvRewardPoint = callRewardPoint.getRewardPoint();
            mo162543m4(bLiveCallM108753f);
        }
    }

    /* JADX INFO: renamed from: h4 */
    public final /* synthetic */ Boolean m162539h4(f64 f64Var) {
        return Boolean.valueOf(this.f141736j.m108755h() != null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i4 */
    public void mo162540i4(LiveCallMessage liveCallMessage) {
        h54.m129381h(liveCallMessage);
        if (!TextUtils.isEmpty(liveCallMessage.bulletText())) {
            ((pn40) m206027E2()).m132104W1(new j54(liveCallMessage.bulletText()));
        }
        switch (liveCallMessage.getType()) {
            case 6:
                mo162526U3(new z24(liveCallMessage.getCall(), liveCallMessage.getCallUser()));
                break;
            case 8:
            case 9:
            case 14:
            case 16:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
                if (m162531Z3().m108760m().m133915i(liveCallMessage.getCallId()) != null) {
                    mo162543m4(liveCallMessage.getCall());
                }
                break;
            case 10:
            case 11:
            case 28:
            case 29:
            case 30:
                mo162541k4(liveCallMessage.getCall());
                break;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public void mo162541k4(BLiveCall bLiveCall) {
        this.f141736j.m108767t(bLiveCall.f44342id);
    }

    /* JADX INFO: renamed from: l4 */
    public C22306c<Boolean> m162542l4() {
        return this.f141737k;
    }

    /* JADX INFO: renamed from: m4 */
    public void mo162543m4(BLiveCall bLiveCall) {
        this.f141736j.m108770w(bLiveCall);
    }

    /* JADX INFO: renamed from: n4 */
    public void mo162544n4(i0s i0sVar) {
        this.f141736j.m108771x(i0sVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        duringCreated(((pn40) m206027E2()).m132160q1().m189101f()).subscribe(new e30() { // from class: l.m44
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f131226a.mo162540i4((LiveCallMessage) obj);
            }
        });
        duringCreated(((pn40) m206027E2()).m132160q1().m189038C()).filter(new w9j() { // from class: l.n44
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((LiveInfoMessage) obj).isRewardChange());
            }
        }).subscribe(new e30() { // from class: l.c44
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f79151a.m162525j4((LiveInfoMessage) obj);
            }
        });
        m129301d3(f64.class, new w9j() { // from class: l.d44
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f84279a.m162539h4((f64) obj);
            }
        });
    }
}
