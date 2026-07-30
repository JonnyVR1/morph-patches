package p149l;

import com.google.android.exoplayer2.PlaybackException;
import com.p046p1.mobile.putong.live.base.data.BLiveMultiCall;
import com.p046p1.mobile.putong.live.base.data.BLiveRtcToken;
import com.p046p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import java.util.concurrent.TimeUnit;
import p133rx.C22306c;
import p149l.ho2;

/* JADX INFO: loaded from: classes5.dex */
public abstract class ue10<D extends ho2> extends h4t<ho2, s7m<?>> {

    /* JADX INFO: renamed from: i */
    public j510<D> f175983i;

    /* JADX INFO: renamed from: j */
    public i410<D> f175984j;

    public ue10(bsm<D> bsmVar, j510<D> j510Var) {
        super(bsmVar);
        this.f175983i = j510Var;
    }

    /* JADX INFO: renamed from: K3 */
    public static /* synthetic */ void m193170K3(BLiveMultiCall bLiveMultiCall) {
    }

    /* JADX INFO: renamed from: T3 */
    public final C22306c<Integer> m193178T3() {
        return LivingNormalApiProvider.m71275L5((this.f175983i.m139800b4().m100375u().equals("1plus5") && m206032L2()) ? "big" : "small", this.f175983i.m139800b4().m100375u());
    }

    /* JADX INFO: renamed from: U3 */
    public C22306c<BLiveRtcToken> m193179U3(String str, String str2) {
        return m104250o2(C22306c.combineLatest(m193180V3(str, str2), m193178T3(), new se10()), false);
    }

    /* JADX INFO: renamed from: V3 */
    public C22306c<BLiveRtcToken> m193180V3(String str, String str2) {
        return LivingNormalApiProvider.m71529n7(str, str2);
    }

    /* JADX INFO: renamed from: X3 */
    public final void m193181X3(b610 b610Var) {
        if (vg10.m198312d(this.f175983i.m139803e4())) {
            mo144988W3(b610Var);
            if (b610Var.f73730d != 2) {
                mo144990f4();
            }
        }
    }

    /* JADX INFO: renamed from: Y3 */
    public y74 mo144989Y3(y74 y74Var) {
        if (y74Var.m213285b() != 8) {
            yi10.m214879a("handleSDKCallback:" + y74Var.m213286c());
        }
        int iM213285b = y74Var.m213285b();
        if (iM213285b == 1) {
            m193190l4(y74Var.m213289f());
            return y74Var;
        }
        if (iM213285b == 4) {
            y74Var.m213301r(this.f175984j.m134317L3(y74Var.m213290g()));
            return y74Var;
        }
        if (iM213285b == 7) {
            m193183a4();
            return y74Var;
        }
        if (iM213285b != 8) {
            return y74Var;
        }
        m206028F2().MultiCallEvent.updateMemberVolume().mo172463j(y74Var.m213287d());
        return y74Var;
    }

    /* JADX INFO: renamed from: Z3 */
    public final void m193182Z3(BLiveMultiCall bLiveMultiCall) {
        if (vg10.m198309a(bLiveMultiCall)) {
            this.f175983i.m139800b4().m100369o();
            mo154057j4();
        } else if (vg10.m198311c(bLiveMultiCall)) {
            mo144992k4();
        }
    }

    /* JADX INFO: renamed from: a4 */
    public final void m193183a4() {
        final BLiveMultiCall bLiveMultiCallMo223809clone = this.f175983i.m139803e4().mo223809clone();
        if (s410.f162220J.equals(bLiveMultiCallMo223809clone.state)) {
            return;
        }
        bLiveMultiCallMo223809clone.state = s410.f162250p;
        duringCreated(LivingNormalApiProvider.m71447e6(this.f175983i.m139803e4().f44400id, "anchor-sdk-push-failed")).subscribe(ffw.m121194e(new e30() { // from class: l.qe10
            @Override // p149l.e30
            public final void call(Object obj) {
                ue10.m193170K3((BLiveMultiCall) obj);
            }
        }, new e30() { // from class: l.re10
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f159022a.m193184b4(bLiveMultiCallMo223809clone, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: b4 */
    public final /* synthetic */ void m193184b4(BLiveMultiCall bLiveMultiCall, Throwable th) {
        this.f175983i.m139820v4(bLiveMultiCall);
    }

    /* JADX INFO: renamed from: c4 */
    public final /* synthetic */ Boolean m193185c4(Long l2) {
        return Boolean.valueOf(!vg10.m198312d(this.f175983i.m139803e4()));
    }

    /* JADX INFO: renamed from: d4 */
    public final /* synthetic */ void m193186d4(Long l2) {
        m193183a4();
    }

    /* JADX INFO: renamed from: e4 */
    public final /* synthetic */ void m193187e4(BLiveRtcToken bLiveRtcToken) {
        ((exl) m129297F3(new jw00(PlaybackException.ERROR_CODE_DRM_UNSPECIFIED))).mo118680o(bLiveRtcToken.channelKey);
    }

    /* JADX INFO: renamed from: g4 */
    public void m193188g4(String str, String str2, e30<BLiveRtcToken> e30Var) {
        yi10.m214879a("requestRtcToken roomId:" + str);
        m104250o2(m193180V3(str, str2), false).subscribe(ffw.m121197h(e30Var));
    }

    /* JADX INFO: renamed from: h4 */
    public void m193189h4(String str, String str2, e30<BLiveRtcToken> e30Var) {
        yi10.m214879a("requestRtcTokenAndBitrate roomId:" + str);
        m104250o2(C22306c.combineLatest(m193180V3(str, str2), m193178T3(), new se10()), false).subscribe(ffw.m121197h(e30Var));
    }

    /* JADX INFO: renamed from: j4 */
    public void mo154057j4() {
        m129299H3(m206027E2().m132139i2(TimeUnit.SECONDS)).takeFirst(new w9j() { // from class: l.me10
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((Long) obj).longValue() > 30);
            }
        }).filter(new w9j() { // from class: l.ne10
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f138572a.m193185c4((Long) obj);
            }
        }).doOnNext(new e30() { // from class: l.oe10
            @Override // p149l.e30
            public final void call(Object obj) {
                yi10.m214879a("join call failed in 30s  ");
            }
        }).subscribe(ffw.m121197h(new e30() { // from class: l.pe10
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f148398a.m193186d4((Long) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: k4 */
    public abstract void mo144992k4();

    /* JADX INFO: renamed from: l4 */
    public void m193190l4(String str) {
        yi10.m214879a("updateRtcToken");
        m193188g4(this.f175983i.m139803e4().ownerRoomId, str, new e30() { // from class: l.te10
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f169790a.m193187e4((BLiveRtcToken) obj);
            }
        });
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        duringCreated(this.f175983i.m139804f4()).subscribe(ffw.m121197h(new e30() { // from class: l.ke10
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f122662a.m193182Z3((BLiveMultiCall) obj);
            }
        }));
        duringCreated(this.f175983i.m139801c4()).subscribe(ffw.m121197h(new e30() { // from class: l.le10
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f127631a.m193181X3((b610) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: W3 */
    public void mo144988W3(b610 b610Var) {
    }

    /* JADX INFO: renamed from: i4 */
    public void mo144991i4(String str) {
    }

    /* JADX INFO: renamed from: f4 */
    public void mo144990f4() {
    }
}
