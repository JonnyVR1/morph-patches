package p153l;

import android.net.NetworkInfo;
import android.text.TextUtils;
import com.p051p1.mobile.putong.live.base.data.BLiveCall;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveCallMessage;
import com.tantanapp.common.utils.ConnectivityReceiver;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes5.dex */
public class hz3 extends qct<oo2> {

    /* JADX INFO: renamed from: i */
    public final r2s f112188i;

    /* JADX INFO: renamed from: j */
    public final ArrayList<y34> f112189j;

    /* JADX INFO: renamed from: k */
    public final HashMap<String, kcg0> f112190k;

    public hz3(dum dumVar, r2s r2sVar) {
        super(dumVar);
        this.f112189j = new ArrayList<>();
        this.f112190k = new HashMap<>();
        this.f112188i = r2sVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e4 */
    public /* synthetic */ void m137815e4(Long l2) {
        m137816V3();
    }

    /* JADX INFO: renamed from: V3 */
    public final void m137816V3() {
        final r2s r2sVar = this.f112188i;
        Objects.requireNonNull(r2sVar);
        r2sVar.m161647Y3(new y20() { // from class: l.cz3
            @Override // p153l.y20
            public final void call(Object obj) {
                r2sVar.m219456e5((j2s) obj);
            }
        });
    }

    /* JADX INFO: renamed from: W3 */
    public boolean m137817W3(final Long l2) {
        y34 y34Var = (y34) jyb.m147529r(this.f112189j, new qcj() { // from class: l.ez3
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((y34) obj).f197301a.user, String.valueOf(l2)));
            }
        });
        if (y34Var == null) {
            return false;
        }
        m137830k4(y34Var);
        m137832m4(y34Var.f197301a.f45190id);
        return true;
    }

    /* JADX INFO: renamed from: X3 */
    public void m137818X3(qvd qvdVar) {
        this.f112188i.m179560u4(false, !this.f112189j.isEmpty());
    }

    /* JADX INFO: renamed from: Y3 */
    public final /* synthetic */ void m137819Y3(BLiveCall bLiveCall) {
        this.f112188i.mo161660m4(bLiveCall);
    }

    /* JADX INFO: renamed from: Z3 */
    public final /* synthetic */ void m137820Z3(y34 y34Var, BLiveCall bLiveCall) {
        y34Var.f197301a = bLiveCall;
        this.f112189j.remove(y34Var);
    }

    /* JADX INFO: renamed from: a4 */
    public final /* synthetic */ Boolean m137821a4(y34 y34Var, Long l2) {
        return Boolean.valueOf(this.f112188i.m161648Z3().m178270m().m143249i(y34Var.f197301a.f45190id) == null);
    }

    /* JADX INFO: renamed from: b4 */
    public final /* synthetic */ C22421c m137822b4(y34 y34Var, Long l2) {
        return duringCreated(LivingNormalApiProvider.m72639f6(y34Var.f197301a.f45190id, true, q24.f155276b));
    }

    /* JADX INFO: renamed from: c4 */
    public final /* synthetic */ void m137823c4(y34 y34Var, List list) {
        m137825f4(y34Var);
    }

    /* JADX INFO: renamed from: d4 */
    public final /* synthetic */ void m137824d4(NetworkInfo networkInfo) {
        m137816V3();
    }

    /* JADX INFO: renamed from: f4 */
    public final void m137825f4(y34 y34Var) {
        o1j0.m165651y(this.f196919f.getString(R$string.f47560H1, y34Var.f197302b.f107998b));
        g64.m129083d("anchor onConnectFailed callId" + y34Var.f197301a.f45190id);
        this.f112189j.remove(y34Var);
        this.f112188i.m179560u4(false, this.f112189j.isEmpty() ^ true);
        m137828i4(y34Var.f197301a);
    }

    /* JADX INFO: renamed from: g4 */
    public void m137826g4(final y34 y34Var) {
        g64.m129083d("onVoiceCallAgreed callId:" + y34Var.f197301a.f45190id);
        y34 y34Var2 = (y34) jyb.m147529r(this.f112189j, new qcj() { // from class: l.fz3
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((y34) obj).f197301a.user, y34Var.f197301a.user));
            }
        });
        if (y34Var2 != null) {
            this.f112189j.remove(y34Var2);
        }
        this.f112189j.add(y34Var);
        m137831l4(y34Var);
        this.f112188i.m179560u4(true, !this.f112189j.isEmpty());
    }

    /* JADX INFO: renamed from: h4 */
    public void m137827h4(final LiveCallMessage liveCallMessage) {
        y34 y34Var;
        if (!liveCallMessage.m73006is(28) || (y34Var = (y34) jyb.m147529r(this.f112189j, new qcj() { // from class: l.dz3
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(liveCallMessage.getCallId(), ((y34) obj).f197301a.f45190id));
            }
        })) == null) {
            return;
        }
        this.f112189j.remove(y34Var.f197301a);
        m137832m4(y34Var.f197301a.f45190id);
        m137828i4(y34Var.f197301a);
    }

    /* JADX INFO: renamed from: i4 */
    public final void m137828i4(BLiveCall bLiveCall) {
        m213811F2().CallEvent.removeCallCheck().mo199273j(bLiveCall);
    }

    /* JADX INFO: renamed from: j4 */
    public void m137829j4(BLiveCall bLiveCall) {
        g64.m129083d("report call video success id = " + bLiveCall.f45190id);
        C22421c<T> c22421cDuringCreated = duringCreated(LivingNormalApiProvider.m72576Y6(bLiveCall.f45190id, true, LivingNormalApiProvider.ConnectType.VIDEO_TYPE));
        y20 y20Var = new y20() { // from class: l.gz3
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f107162a.m137819Y3((BLiveCall) obj);
            }
        };
        r2s r2sVar = this.f112188i;
        Objects.requireNonNull(r2sVar);
        c22421cDuringCreated.subscribe(dhw.m115826e(y20Var, new l2s(r2sVar)));
    }

    /* JADX INFO: renamed from: k4 */
    public final void m137830k4(final y34 y34Var) {
        g64.m129083d("reportVoiceSuccess callId:" + y34Var.f197301a.f45190id);
        C22421c<T> c22421cDuringCreated = duringCreated(LivingNormalApiProvider.m72576Y6(y34Var.f197301a.f45190id, true, LivingNormalApiProvider.ConnectType.VOICE_TYPE));
        y20 y20Var = new y20() { // from class: l.xy3
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f196712a.m137820Z3(y34Var, (BLiveCall) obj);
            }
        };
        r2s r2sVar = this.f112188i;
        Objects.requireNonNull(r2sVar);
        c22421cDuringCreated.subscribe(dhw.m115826e(y20Var, new l2s(r2sVar)));
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [l.oo2] */
    /* JADX INFO: renamed from: l4 */
    public final void m137831l4(final y34 y34Var) {
        g64.m129083d("startConnectWatchDog callId:" + y34Var.f197301a.f45190id);
        C22421c c22421cFlatMap = m138858H3(m213810E2().m168521h2(30, TimeUnit.SECONDS)).take(1).filter(new qcj() { // from class: l.uy3
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f181534a.m137821a4(y34Var, (Long) obj);
            }
        }).flatMap(new qcj() { // from class: l.vy3
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f186333a.m137822b4(y34Var, (Long) obj);
            }
        });
        y20 y20Var = new y20() { // from class: l.wy3
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f191568a.m137823c4(y34Var, (List) obj);
            }
        };
        r2s r2sVar = this.f112188i;
        Objects.requireNonNull(r2sVar);
        this.f112190k.put(y34Var.f197301a.f45190id, c22421cFlatMap.subscribe(dhw.m115826e(y20Var, new l2s(r2sVar))));
    }

    /* JADX INFO: renamed from: m4 */
    public final void m137832m4(String str) {
        g64.m129083d("CallAnchorControlModule stop call timer id = " + str);
        psd0.m173633z(this.f112190k.remove(str));
    }

    @Override // p153l.i6t, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        super.mo70300n();
        this.f112189j.clear();
        this.f112190k.clear();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r0v11, types: [l.oo2] */
    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        duringCreated(m213810E2().m168545q1().m98283f()).subscribe(new y20() { // from class: l.ty3
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f176632a.m137827h4((LiveCallMessage) obj);
            }
        });
        duringCreated(this.f112188i.m161649a4()).subscribe(dhw.m115825d(new y20() { // from class: l.yy3
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f202075a.m137818X3((qvd) obj);
            }
        }));
        duringCreated(ConnectivityReceiver.m82473m()).skip(1).filter(new qcj() { // from class: l.zy3
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(ConnectivityReceiver.m82467g());
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.az3
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f74073a.m137824d4((NetworkInfo) obj);
            }
        }));
        m138858H3(m213810E2().m168521h2(20, TimeUnit.SECONDS)).subscribe(dhw.m115825d(new y20() { // from class: l.bz3
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f79093a.m137815e4((Long) obj);
            }
        }));
    }
}
