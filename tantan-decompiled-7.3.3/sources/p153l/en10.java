package p153l;

import com.google.android.exoplayer2.PlaybackException;
import com.p051p1.mobile.putong.live.base.data.BLiveMultiCall;
import com.p051p1.mobile.putong.live.base.data.BLiveRtcToken;
import com.p051p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import java.util.concurrent.TimeUnit;
import p137rx.C22421c;
import p153l.oo2;

/* JADX INFO: loaded from: classes5.dex */
public abstract class en10<D extends oo2> extends i6t<oo2, iam<?>> {

    /* JADX INFO: renamed from: i */
    public td10<D> f94717i;

    /* JADX INFO: renamed from: j */
    public sc10<D> f94718j;

    public en10(dum<D> dumVar, td10<D> td10Var) {
        super(dumVar);
        this.f94717i = td10Var;
    }

    /* JADX INFO: renamed from: K3 */
    public static /* synthetic */ void m121391K3(BLiveMultiCall bLiveMultiCall) {
    }

    /* JADX INFO: renamed from: T3 */
    public final C22421c<Integer> m121399T3() {
        return LivingNormalApiProvider.m72458L5((this.f94717i.m190584b4().m153853u().equals("1plus5") && m213815L2()) ? "big" : "small", this.f94717i.m190584b4().m153853u());
    }

    /* JADX INFO: renamed from: U3 */
    public C22421c<BLiveRtcToken> m121400U3(String str, String str2) {
        return m113231o2(C22421c.combineLatest(m121401V3(str, str2), m121399T3(), new cn10()), false);
    }

    /* JADX INFO: renamed from: V3 */
    public C22421c<BLiveRtcToken> m121401V3(String str, String str2) {
        return LivingNormalApiProvider.m72712n7(str, str2);
    }

    /* JADX INFO: renamed from: X3 */
    public final void m121403X3(le10 le10Var) {
        if (fp10.m126517d(this.f94717i.m190587e4())) {
            mo121402W3(le10Var);
            if (le10Var.f131693d != 2) {
                mo121411f4();
            }
        }
    }

    /* JADX INFO: renamed from: Y3 */
    public x84 mo121404Y3(x84 x84Var) {
        if (x84Var.m209669b() != 8) {
            ir10.m141746a("handleSDKCallback:" + x84Var.m209670c());
        }
        int iM209669b = x84Var.m209669b();
        if (iM209669b == 1) {
            m121417l4(x84Var.m209673f());
            return x84Var;
        }
        if (iM209669b == 4) {
            x84Var.m209685r(this.f94718j.m185361L3(x84Var.m209674g()));
            return x84Var;
        }
        if (iM209669b == 7) {
            m121406a4();
            return x84Var;
        }
        if (iM209669b != 8) {
            return x84Var;
        }
        m213811F2().MultiCallEvent.updateMemberVolume().mo199273j(x84Var.m209671d());
        return x84Var;
    }

    /* JADX INFO: renamed from: Z3 */
    public final void m121405Z3(BLiveMultiCall bLiveMultiCall) {
        if (fp10.m126514a(bLiveMultiCall)) {
            this.f94717i.m190584b4().m153847o();
            mo121415j4();
        } else if (fp10.m126516c(bLiveMultiCall)) {
            mo121416k4();
        }
    }

    /* JADX INFO: renamed from: a4 */
    public final void m121406a4() {
        final BLiveMultiCall bLiveMultiCallMo225055clone = this.f94717i.m190587e4().mo225055clone();
        if (cd10.f81058J.equals(bLiveMultiCallMo225055clone.state)) {
            return;
        }
        bLiveMultiCallMo225055clone.state = cd10.f81088p;
        duringCreated(LivingNormalApiProvider.m72630e6(this.f94717i.m190587e4().f45248id, "anchor-sdk-push-failed")).subscribe(dhw.m115826e(new y20() { // from class: l.an10
            @Override // p153l.y20
            public final void call(Object obj) {
                en10.m121391K3((BLiveMultiCall) obj);
            }
        }, new y20() { // from class: l.bn10
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f77429a.m121407b4(bLiveMultiCallMo225055clone, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: b4 */
    public final /* synthetic */ void m121407b4(BLiveMultiCall bLiveMultiCall, Throwable th) {
        this.f94717i.m190604v4(bLiveMultiCall);
    }

    /* JADX INFO: renamed from: c4 */
    public final /* synthetic */ Boolean m121408c4(Long l2) {
        return Boolean.valueOf(!fp10.m126517d(this.f94717i.m190587e4()));
    }

    /* JADX INFO: renamed from: d4 */
    public final /* synthetic */ void m121409d4(Long l2) {
        m121406a4();
    }

    /* JADX INFO: renamed from: e4 */
    public final /* synthetic */ void m121410e4(BLiveRtcToken bLiveRtcToken) {
        ((xzl) m138856F3(new r410(PlaybackException.ERROR_CODE_DRM_UNSPECIFIED))).mo170538o(bLiveRtcToken.channelKey);
    }

    /* JADX INFO: renamed from: g4 */
    public void m121412g4(String str, String str2, y20<BLiveRtcToken> y20Var) {
        ir10.m141746a("requestRtcToken roomId:" + str);
        m113231o2(m121401V3(str, str2), false).subscribe(dhw.m115829h(y20Var));
    }

    /* JADX INFO: renamed from: h4 */
    public void m121413h4(String str, String str2, y20<BLiveRtcToken> y20Var) {
        ir10.m141746a("requestRtcTokenAndBitrate roomId:" + str);
        m113231o2(C22421c.combineLatest(m121401V3(str, str2), m121399T3(), new cn10()), false).subscribe(dhw.m115829h(y20Var));
    }

    /* JADX INFO: renamed from: j4 */
    public void mo121415j4() {
        m138858H3(m213810E2().m168525i2(TimeUnit.SECONDS)).takeFirst(new qcj() { // from class: l.wm10
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((Long) obj).longValue() > 30);
            }
        }).filter(new qcj() { // from class: l.xm10
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f195041a.m121408c4((Long) obj);
            }
        }).doOnNext(new y20() { // from class: l.ym10
            @Override // p153l.y20
            public final void call(Object obj) {
                ir10.m141746a("join call failed in 30s  ");
            }
        }).subscribe(dhw.m115829h(new y20() { // from class: l.zm10
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f205028a.m121409d4((Long) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: k4 */
    public abstract void mo121416k4();

    /* JADX INFO: renamed from: l4 */
    public void m121417l4(String str) {
        ir10.m141746a("updateRtcToken");
        m121412g4(this.f94717i.m190587e4().ownerRoomId, str, new y20() { // from class: l.dn10
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f89750a.m121410e4((BLiveRtcToken) obj);
            }
        });
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        duringCreated(this.f94717i.m190588f4()).subscribe(dhw.m115829h(new y20() { // from class: l.um10
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f179594a.m121405Z3((BLiveMultiCall) obj);
            }
        }));
        duringCreated(this.f94717i.m190585c4()).subscribe(dhw.m115829h(new y20() { // from class: l.vm10
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f184659a.m121403X3((le10) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: W3 */
    public void mo121402W3(le10 le10Var) {
    }

    /* JADX INFO: renamed from: i4 */
    public void mo121414i4(String str) {
    }

    /* JADX INFO: renamed from: f4 */
    public void mo121411f4() {
    }
}
