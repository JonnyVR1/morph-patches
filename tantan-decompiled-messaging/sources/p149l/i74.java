package p149l;

import android.util.Size;
import android.view.View;
import com.p046p1.mobile.putong.live.base.data.BLiveCall;
import com.p046p1.mobile.putong.live.base.data.BLiveCallVolume;
import com.p046p1.mobile.putong.live.livingroom.archi.message.event.KeyboardEventData;
import com.p046p1.mobile.putong.live.livingroom.recreation.multiplayerchat.view.CallWidgetView;

/* JADX INFO: loaded from: classes5.dex */
public abstract class i74 extends h4t<ho2, CallWidgetView> {

    /* JADX INFO: renamed from: i */
    public o44 f111825i;

    public i74(bsm bsmVar, CallWidgetView callWidgetView, o44 o44Var) {
        super(bsmVar);
        mo51532C(callWidgetView);
        this.f111825i = o44Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V3 */
    public /* synthetic */ void m134726V3(KeyboardEventData keyboardEventData) {
        if (keyboardEventData.m71824a() == 0 || keyboardEventData.m71824a() > 500) {
            ((CallWidgetView) this.viewModel).setVisible(!keyboardEventData.m71825b());
            if (keyboardEventData.m71825b()) {
                return;
            }
            m134732U3(Boolean.valueOf(((CallWidgetView) this.viewModel).f51503n));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W3 */
    public /* synthetic */ void m134727W3(Integer num) {
        m134736c4(num.intValue(), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d4 */
    public void m134728d4(final BLiveCallVolume bLiveCallVolume) {
        if (bLiveCallVolume == null) {
            return;
        }
        final cud cudVarM162531Z3 = this.f111825i.m162531Z3();
        vwb.m200354z(cudVarM162531Z3.m108760m().m133919m(), new e30() { // from class: l.h74
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f106191a.m134733X3(bLiveCallVolume, cudVarM162531Z3, (BLiveCall) obj);
            }
        });
    }

    /* JADX INFO: renamed from: O3 */
    public void m134730O3(Integer num) {
        BLiveCall bLiveCallM108758k = this.f111825i.m162531Z3().m108758k(num.intValue());
        if (v44.m196940h(bLiveCallM108758k)) {
            return;
        }
        if (bLiveCallM108758k == null) {
            mo114371Z3(num);
        } else {
            mo114370Y3(bLiveCallM108758k, this.f111825i.m162531Z3().m108754g(num));
        }
    }

    /* JADX INFO: renamed from: P3 */
    public abstract void mo114367P3(int i);

    /* JADX INFO: renamed from: R3 */
    public void mo114368R3(cud cudVar) {
        ((CallWidgetView) this.viewModel).m75951N(cudVar, cudVar.f82557d);
    }

    /* JADX INFO: renamed from: S3 */
    public void m134731S3(cud cudVar) {
        h54.m129377d("handleDeputyModel:" + cudVar.m108759l().toString());
        int i = cudVar.f82558e;
        if (i == 1) {
            cudVar.m108763p("widget handleDeputyModel updateAll");
            ((CallWidgetView) this.viewModel).setLiveCallModel(cudVar);
            return;
        }
        if (i == 3 && cudVar.m108762o()) {
            cudVar.m108763p("widget remove one");
            mo114369T3(cudVar);
            return;
        }
        int i2 = cudVar.f82558e;
        if (i2 == 2) {
            cudVar.m108763p("widget handleDeputyModel update single");
            ((CallWidgetView) this.viewModel).m75951N(cudVar, cudVar.f82557d);
        } else if (i2 == 4) {
            cudVar.m108763p("widget handleDeputyModel add");
            mo114368R3(cudVar);
        }
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        duringCreated(m206028F2().KeyboardEvent.show().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.e74
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f89667a.m134726V3((KeyboardEventData) obj);
            }
        }));
        duringCreated(m206028F2().PlayerEvent.callVolumeChanged().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.f74
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f96194a.m134728d4((BLiveCallVolume) obj);
            }
        }));
        duringCreated(m206028F2().CallEvent.memberVolume().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.f74
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f96194a.m134728d4((BLiveCallVolume) obj);
            }
        }));
        duringCreated(m206028F2().CallEvent.updateWidgetMargin().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.g74
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f101330a.m134727W3((Integer) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: T3 */
    public void mo114369T3(cud cudVar) {
        m134734a4(cudVar.f82557d.getDeputyViewPos());
    }

    /* JADX INFO: renamed from: U3 */
    public void m134732U3(Boolean bool) {
        if (this.f111825i.m162531Z3().m108755h() != null) {
            m134736c4(((Integer) m129297F3(new j74(4400))).intValue(), false);
        } else if (bool.booleanValue()) {
            m134735b4(l9e.f127081e);
        } else {
            m134735b4(l9e.f127080d);
        }
    }

    /* JADX INFO: renamed from: X3 */
    public final /* synthetic */ void m134733X3(BLiveCallVolume bLiveCallVolume, cud cudVar, BLiveCall bLiveCall) {
        Float f = bLiveCallVolume.volumes.get(bLiveCall.user);
        if (f == null || f.floatValue() < 0.02f || f.floatValue() == bLiveCall.volume) {
            bLiveCall.isSpeak = false;
            bLiveCall.volume = 0.0f;
        } else {
            bLiveCall.isSpeak = true;
            bLiveCall.volume = f.floatValue();
        }
        ((CallWidgetView) this.viewModel).m75952O(cudVar, bLiveCall);
    }

    /* JADX INFO: renamed from: Y3 */
    public abstract void mo114370Y3(BLiveCall bLiveCall, i54 i54Var);

    /* JADX INFO: renamed from: Z3 */
    public abstract void mo114371Z3(Integer num);

    /* JADX INFO: renamed from: a4 */
    public void m134734a4(int i) {
        ((CallWidgetView) this.viewModel).m75957v(i);
    }

    /* JADX INFO: renamed from: b4 */
    public final void m134735b4(int i) {
        h54.m129377d("sendChatHeightEvent:" + i);
        m206028F2().ChatEvent.changeInputSize().mo172463j(new Size(0, i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c4 */
    public final void m134736c4(int i, boolean z) {
        int i2;
        int i3;
        if (z) {
            xdl0.m208357U((View) this.viewModel, i - l9e.f127082f);
        }
        if (((CallWidgetView) this.viewModel).f51503n) {
            i2 = (i - l9e.f127083g) - l9e.f127087k;
            i3 = l9e.f127091o;
        } else {
            i2 = (i - l9e.f127082f) - l9e.f127087k;
            i3 = l9e.f127091o;
        }
        m134735b4(i2 - i3);
    }

    @Override // p149l.h4t, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        super.mo69117n();
        V v2 = this.viewModel;
        if (v2 != 0) {
            ((CallWidgetView) v2).setVisible(false);
        }
        m134735b4(l9e.f127077a);
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        ((CallWidgetView) this.viewModel).setVisible(true);
        ((CallWidgetView) this.viewModel).m75958w(m206032L2());
        duringCreated(this.f111825i.m162532a4()).subscribe(ffw.m121193d(new e30() { // from class: l.d74
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f84691a.m134731S3((cud) obj);
            }
        }));
        m134735b4(l9e.f127080d);
    }

    /* JADX INFO: renamed from: N3 */
    public void mo134729N3() {
    }
}
