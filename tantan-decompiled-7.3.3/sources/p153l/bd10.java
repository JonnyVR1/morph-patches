package p153l;

import android.text.TextUtils;
import android.util.Pair;
import com.p051p1.mobile.putong.live.base.data.BLiveMultiCall;
import com.p051p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes5.dex */
public class bd10 extends sc10<mu40> {

    /* JADX INFO: renamed from: k */
    public final HashMap<String, Pair<String, kcg0>> f76219k;

    public bd10(dum<mu40> dumVar, td10<mu40> td10Var) {
        super(dumVar, td10Var);
        this.f76219k = new HashMap<>();
    }

    /* JADX INFO: renamed from: T3 */
    public static /* synthetic */ C22421c m103566T3(BLiveMultiCall bLiveMultiCall) {
        return bLiveMultiCall.isAway ? LivingNormalApiProvider.m72619d4(bLiveMultiCall.f45248id) : C22421c.just(bLiveMultiCall);
    }

    @Override // p153l.sc10
    /* JADX INFO: renamed from: M3 */
    public void mo103571M3(v7t v7tVar) {
        super.mo103571M3(v7tVar);
        BLiveMultiCall bLiveMultiCallM200274b = v7tVar.m200274b();
        m213811F2().MultiCallEvent.updateMultiCall().mo199273j(bLiveMultiCallM200274b);
        if (fp10.m126517d(bLiveMultiCallM200274b) || fp10.m126516c(bLiveMultiCallM200274b)) {
            m103579e4(bLiveMultiCallM200274b.userId);
        } else if (fp10.m126514a(bLiveMultiCallM200274b)) {
            m103573Y3(bLiveMultiCallM200274b);
        }
    }

    @Override // p153l.sc10
    /* JADX INFO: renamed from: O3 */
    public void mo103572O3(String str) {
        ir10.m141746a("onMemberJoinSdkSuccess , userId=" + str);
        Pair<String, kcg0> pair = this.f76219k.get(str);
        if (pair == null) {
            return;
        }
        ir10.m141746a("onMemberJoinSdkSuccess and user's call exist");
        final String str2 = (String) pair.first;
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        duringCreated(LivingNormalApiProvider.m72567X6(str2)).flatMap(new qcj() { // from class: l.yc10
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return bd10.m103566T3((BLiveMultiCall) obj);
            }
        }).doOnError(new y20() { // from class: l.zc10
            @Override // p153l.y20
            public final void call(Object obj) {
                ir10.m141746a("report failed callId:" + str2);
            }
        }).subscribe(dhw.m115829h(new y20() { // from class: l.ad10
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f69779a.m103580f4((BLiveMultiCall) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Y3 */
    public void m103573Y3(final BLiveMultiCall bLiveMultiCall) {
        if (!this.f76219k.containsKey(bLiveMultiCall.userId)) {
            this.f76219k.put(bLiveMultiCall.userId, new Pair<>(bLiveMultiCall.f45248id, m138858H3(((mu40) m213810E2()).m168521h2(60, TimeUnit.SECONDS)).take(1).filter(new qcj() { // from class: l.uc10
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return this.f178398a.m103574Z3(bLiveMultiCall, (Long) obj);
                }
            }).subscribe(dhw.m115826e(new y20() { // from class: l.vc10
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f183310a.m103575a4(bLiveMultiCall, (Long) obj);
                }
            }, new y20() { // from class: l.wc10
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f188314a.m103576b4(bLiveMultiCall, (Throwable) obj);
                }
            }))));
            ir10.m141746a("add watchdog ,userId=" + bLiveMultiCall.userId);
        }
        this.f167190i.put(bLiveMultiCall.userId, bLiveMultiCall);
    }

    /* JADX INFO: renamed from: Z3 */
    public final /* synthetic */ Boolean m103574Z3(BLiveMultiCall bLiveMultiCall, Long l2) {
        return Boolean.valueOf(this.f167191j.m190584b4().m153849q(bLiveMultiCall.f45248id) == null);
    }

    /* JADX INFO: renamed from: a4 */
    public final /* synthetic */ void m103575a4(BLiveMultiCall bLiveMultiCall, Long l2) {
        m103578d4(bLiveMultiCall);
    }

    /* JADX INFO: renamed from: b4 */
    public final /* synthetic */ void m103576b4(BLiveMultiCall bLiveMultiCall, Throwable th) {
        ir10.m141746a("user timer connecting failed ,userId=" + bLiveMultiCall.userId);
        m103579e4(bLiveMultiCall.userId);
    }

    /* JADX INFO: renamed from: c4 */
    public final /* synthetic */ void m103577c4(BLiveMultiCall bLiveMultiCall, BLiveMultiCall bLiveMultiCall2) {
        m213811F2().MultiCallEvent.updateMultiCall().mo199273j(bLiveMultiCall2);
        this.f167191j.m190604v4(bLiveMultiCall);
    }

    /* JADX INFO: renamed from: d4 */
    public final void m103578d4(final BLiveMultiCall bLiveMultiCall) {
        m103579e4(bLiveMultiCall.userId);
        ir10.m141746a("ConnectFailed ,userId=" + bLiveMultiCall.userId);
        bf10.m103820Z(this, bLiveMultiCall.f45248id);
        duringCreated(LivingNormalApiProvider.m72630e6(bLiveMultiCall.f45248id, "time-out")).subscribe(dhw.m115829h(new y20() { // from class: l.xc10
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f193253a.m103577c4(bLiveMultiCall, (BLiveMultiCall) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: e4 */
    public final void m103579e4(String str) {
        ir10.m141746a("remove watchdog ,userId=" + str);
        Pair<String, kcg0> pair = this.f76219k.get(str);
        if (pair == null) {
            return;
        }
        psd0.m173633z((kcg0) pair.second);
        this.f76219k.remove(str);
        ir10.m141746a("remove watchdog success");
    }

    /* JADX INFO: renamed from: f4 */
    public final void m103580f4(BLiveMultiCall bLiveMultiCall) {
        ir10.m141746a("reportSuccess callId:" + bLiveMultiCall.f45248id);
        BLiveMultiCall bLiveMultiCallM153849q = this.f167191j.m190584b4().m153849q(bLiveMultiCall.f45248id);
        td10<D> td10Var = this.f167191j;
        if (bLiveMultiCallM153849q == null) {
            td10Var.m190582Z3(bLiveMultiCall);
        } else {
            td10Var.m190606x4(bLiveMultiCall);
        }
        m103579e4(bLiveMultiCall.userId);
    }

    @Override // p153l.i6t, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        super.mo70300n();
        jyb.m147537z(this.f76219k.values(), new y20() { // from class: l.tc10
            @Override // p153l.y20
            public final void call(Object obj) {
                psd0.m173633z((kcg0) ((Pair) obj).second);
            }
        });
        this.f76219k.clear();
    }

    @Override // p153l.sc10, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
    }
}
