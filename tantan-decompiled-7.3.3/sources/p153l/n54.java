package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.live.base.data.BLiveCall;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveCallMessage;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveInfoMessage;
import java.util.List;
import p137rx.C22421c;
import p137rx.subjects.C22507a;

/* JADX INFO: loaded from: classes5.dex */
public class n54 extends qct<dw40> {

    /* JADX INFO: renamed from: i */
    public String f140280i;

    /* JADX INFO: renamed from: j */
    public final qvd f140281j;

    /* JADX INFO: renamed from: k */
    public C22507a<Boolean> f140282k;

    public n54(dum dumVar, z34 z34Var) {
        super(dumVar);
        this.f140280i = "CallConstant";
        this.f140282k = C22507a.m222758b();
        this.f140281j = new qvd(m213815L2());
        m153103z2(new d74(dumVar, z34Var.f202780c, this));
    }

    /* JADX INFO: renamed from: J3 */
    public static /* synthetic */ Boolean m161632J3(qvd qvdVar) {
        int i = qvdVar.f159736e;
        return Boolean.valueOf(i == 3 || i == 4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j4 */
    public void m161642j4(LiveInfoMessage liveInfoMessage) {
        List<LongLinkLiveMessage.CallRewardPoint> list = liveInfoMessage.callRewardPoint;
        if (jyb.m147479J(list)) {
            return;
        }
        jyb.m147537z(list, new y20() { // from class: l.d54
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f85098a.m161655g4((LongLinkLiveMessage.CallRewardPoint) obj);
            }
        });
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        m138860d3(ml50.class, new qcj() { // from class: l.f54
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f97189a.m161651c4((ml50) obj);
            }
        });
        m138860d3(x34.class, new qcj() { // from class: l.g54
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f102279a.m161650b4((x34) obj);
            }
        });
        m138860d3(rmj.class, new qcj() { // from class: l.h54
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f107894a.m161652d4((rmj) obj);
            }
        });
        duringCreated(new pcj() { // from class: l.i54
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f112997a.m161649a4();
            }
        }).filter(new qcj() { // from class: l.j54
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return n54.m161632J3((qvd) obj);
            }
        }).subscribe(dhw.m115825d(new y20() { // from class: l.k54
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f123968a.m161653e4((qvd) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: U3 */
    public void mo161643U3(y34 y34Var) {
        this.f140281j.m178260c(y34Var);
    }

    /* JADX INFO: renamed from: V3 */
    public void m161644V3(Throwable th) {
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
            o1j0.m165634h(R$string.f47612J9);
        } else {
            o1j0.m165636j(str);
        }
        g64.m129083d("error cause code = " + i + " message = " + str);
    }

    /* JADX INFO: renamed from: W3 */
    public void m161645W3(BLiveCall bLiveCall) {
        m161646X3(bLiveCall, "");
    }

    /* JADX INFO: renamed from: X3 */
    public void m161646X3(BLiveCall bLiveCall, String str) {
        if (bLiveCall == null || TextUtils.isEmpty(bLiveCall.f45190id) || u54.m194526f(bLiveCall)) {
            return;
        }
        g64.m129083d("finish call :" + bLiveCall.f45190id + ",reason:" + str);
        duringCreated(LivingNormalApiProvider.m72639f6(bLiveCall.f45190id, m213815L2(), str)).subscribe(dhw.m115826e(new y20() { // from class: l.a54
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f68498a.m161654f4((List) obj);
            }
        }, new e54(this)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Y3 */
    public void m161647Y3(y20<j2s> y20Var) {
        if (((dw40) m213810E2()).mo183435j() == null || TextUtils.isEmpty(((dw40) m213810E2()).m202191k())) {
            return;
        }
        duringCreated(LivingNormalApiProvider.m72474N3(((dw40) m213810E2()).m202191k())).subscribe(dhw.m115826e(y20Var, new e54(this)));
    }

    /* JADX INFO: renamed from: Z3 */
    public qvd m161648Z3() {
        return this.f140281j;
    }

    /* JADX INFO: renamed from: a4 */
    public C22421c<qvd> m161649a4() {
        return this.f140281j.m178267j();
    }

    /* JADX INFO: renamed from: b4 */
    public final q54 m161650b4(x34 x34Var) {
        BLiveCall bLiveCallM178263f = this.f140281j.m178263f(x34Var.f192218c);
        h64 h64VarM143251k = this.f140281j.m178270m().m143251k(x34Var.f192218c);
        if (bLiveCallM178263f == null || h64VarM143251k == null) {
            return null;
        }
        return new q54(coj.m111661c(h64VarM143251k, p54.m170592b(bLiveCallM178263f.f45190id, "gift-audience-none-callaudience", bLiveCallM178263f.position)), u54.m194523c(bLiveCallM178263f));
    }

    /* JADX INFO: renamed from: c4 */
    public final /* synthetic */ Boolean m161651c4(ml50 ml50Var) {
        return Boolean.valueOf(this.f140281j.m178270m().m143253m().size() != 0);
    }

    /* JADX INFO: renamed from: d4 */
    public final /* synthetic */ List m161652d4(rmj rmjVar) {
        return this.f140281j.m178271n();
    }

    /* JADX INFO: renamed from: e4 */
    public final /* synthetic */ void m161653e4(qvd qvdVar) {
        int size = this.f140281j.m178270m().m143253m().size();
        if (qvdVar.f159736e == 3) {
            if (size != 0) {
                return;
            }
        } else if (size != 1) {
            return;
        }
        m213811F2().BottomEvent.callBottomButtonApiDiffRefresh().m199277p();
    }

    /* JADX INFO: renamed from: f4 */
    public final /* synthetic */ void m161654f4(List list) {
        mo161658k4((BLiveCall) list.get(0));
    }

    /* JADX INFO: renamed from: g4 */
    public final /* synthetic */ void m161655g4(LongLinkLiveMessage.CallRewardPoint callRewardPoint) {
        BLiveCall bLiveCallM178263f = this.f140281j.m178263f(callRewardPoint.getUserId());
        if (bLiveCallM178263f != null) {
            bLiveCallM178263f.userRecvRewardPoint = callRewardPoint.getRewardPoint();
            mo161660m4(bLiveCallM178263f);
        }
    }

    /* JADX INFO: renamed from: h4 */
    public final /* synthetic */ Boolean m161656h4(e74 e74Var) {
        return Boolean.valueOf(this.f140281j.m178265h() != null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i4 */
    public void mo161657i4(LiveCallMessage liveCallMessage) {
        g64.m129087h(liveCallMessage);
        if (!TextUtils.isEmpty(liveCallMessage.bulletText())) {
            ((dw40) m213810E2()).m168490W1(new i64(liveCallMessage.bulletText()));
        }
        switch (liveCallMessage.getType()) {
            case 6:
                mo161643U3(new y34(liveCallMessage.getCall(), liveCallMessage.getCallUser()));
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
                if (m161648Z3().m178270m().m143249i(liveCallMessage.getCallId()) != null) {
                    mo161660m4(liveCallMessage.getCall());
                }
                break;
            case 10:
            case 11:
            case 28:
            case 29:
            case 30:
                mo161658k4(liveCallMessage.getCall());
                break;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public void mo161658k4(BLiveCall bLiveCall) {
        this.f140281j.m178277t(bLiveCall.f45190id);
    }

    /* JADX INFO: renamed from: l4 */
    public C22421c<Boolean> m161659l4() {
        return this.f140282k;
    }

    /* JADX INFO: renamed from: m4 */
    public void mo161660m4(BLiveCall bLiveCall) {
        this.f140281j.m178280w(bLiveCall);
    }

    /* JADX INFO: renamed from: n4 */
    public void mo161661n4(j2s j2sVar) {
        this.f140281j.m178281x(j2sVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        duringCreated(((dw40) m213810E2()).m168545q1().m98283f()).subscribe(new y20() { // from class: l.l54
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f130065a.mo161657i4((LiveCallMessage) obj);
            }
        });
        duringCreated(((dw40) m213810E2()).m168545q1().m98220C()).filter(new qcj() { // from class: l.m54
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((LiveInfoMessage) obj).isRewardChange());
            }
        }).subscribe(new y20() { // from class: l.b54
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f75020a.m161642j4((LiveInfoMessage) obj);
            }
        });
        m138860d3(e74.class, new qcj() { // from class: l.c54
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f79761a.m161656h4((e74) obj);
            }
        });
    }
}
