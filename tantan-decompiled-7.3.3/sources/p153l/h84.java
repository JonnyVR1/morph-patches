package p153l;

import android.util.Size;
import android.view.View;
import com.p051p1.mobile.putong.live.base.data.BLiveCall;
import com.p051p1.mobile.putong.live.base.data.BLiveCallVolume;
import com.p051p1.mobile.putong.live.livingroom.archi.message.event.KeyboardEventData;
import com.p051p1.mobile.putong.live.livingroom.recreation.multiplayerchat.view.CallWidgetView;

/* JADX INFO: loaded from: classes5.dex */
public abstract class h84 extends i6t<oo2, CallWidgetView> {

    /* JADX INFO: renamed from: i */
    public n54 f108206i;

    public h84(dum dumVar, CallWidgetView callWidgetView, n54 n54Var) {
        super(dumVar);
        mo52715C(callWidgetView);
        this.f108206i = n54Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V3 */
    public /* synthetic */ void m133894V3(KeyboardEventData keyboardEventData) {
        if (keyboardEventData.m73007a() == 0 || keyboardEventData.m73007a() > 500) {
            ((CallWidgetView) this.viewModel).setVisible(!keyboardEventData.m73008b());
            if (keyboardEventData.m73008b()) {
                return;
            }
            m133900U3(Boolean.valueOf(((CallWidgetView) this.viewModel).f52351n));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W3 */
    public /* synthetic */ void m133895W3(Integer num) {
        m133904c4(num.intValue(), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d4 */
    public void m133896d4(final BLiveCallVolume bLiveCallVolume) {
        if (bLiveCallVolume == null) {
            return;
        }
        final qvd qvdVarM161648Z3 = this.f108206i.m161648Z3();
        jyb.m147537z(qvdVarM161648Z3.m178270m().m143253m(), new y20() { // from class: l.g84
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f102642a.m133901X3(bLiveCallVolume, qvdVarM161648Z3, (BLiveCall) obj);
            }
        });
    }

    /* JADX INFO: renamed from: O3 */
    public void m133898O3(Integer num) {
        BLiveCall bLiveCallM178268k = this.f108206i.m161648Z3().m178268k(num.intValue());
        if (u54.m194528h(bLiveCallM178268k)) {
            return;
        }
        if (bLiveCallM178268k == null) {
            mo113675Z3(num);
        } else {
            mo113674Y3(bLiveCallM178268k, this.f108206i.m161648Z3().m178264g(num));
        }
    }

    /* JADX INFO: renamed from: P3 */
    public abstract void mo113671P3(int i);

    /* JADX INFO: renamed from: R3 */
    public void mo113672R3(qvd qvdVar) {
        ((CallWidgetView) this.viewModel).m77134N(qvdVar, qvdVar.f159735d);
    }

    /* JADX INFO: renamed from: S3 */
    public void m133899S3(qvd qvdVar) {
        g64.m129083d("handleDeputyModel:" + qvdVar.m178269l().toString());
        int i = qvdVar.f159736e;
        if (i == 1) {
            qvdVar.m178273p("widget handleDeputyModel updateAll");
            ((CallWidgetView) this.viewModel).setLiveCallModel(qvdVar);
            return;
        }
        if (i == 3 && qvdVar.m178272o()) {
            qvdVar.m178273p("widget remove one");
            mo113673T3(qvdVar);
            return;
        }
        int i2 = qvdVar.f159736e;
        if (i2 == 2) {
            qvdVar.m178273p("widget handleDeputyModel update single");
            ((CallWidgetView) this.viewModel).m77134N(qvdVar, qvdVar.f159735d);
        } else if (i2 == 4) {
            qvdVar.m178273p("widget handleDeputyModel add");
            mo113672R3(qvdVar);
        }
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        duringCreated(m213811F2().KeyboardEvent.show().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.d84
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f85577a.m133894V3((KeyboardEventData) obj);
            }
        }));
        duringCreated(m213811F2().PlayerEvent.callVolumeChanged().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.e84
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f92507a.m133896d4((BLiveCallVolume) obj);
            }
        }));
        duringCreated(m213811F2().CallEvent.memberVolume().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.e84
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f92507a.m133896d4((BLiveCallVolume) obj);
            }
        }));
        duringCreated(m213811F2().CallEvent.updateWidgetMargin().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.f84
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f97699a.m133895W3((Integer) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: T3 */
    public void mo113673T3(qvd qvdVar) {
        m133902a4(qvdVar.f159735d.getDeputyViewPos());
    }

    /* JADX INFO: renamed from: U3 */
    public void m133900U3(Boolean bool) {
        if (this.f108206i.m161648Z3().m178265h() != null) {
            m133904c4(((Integer) m138856F3(new i84(4400))).intValue(), false);
        } else if (bool.booleanValue()) {
            m133903b4(pae.f151261e);
        } else {
            m133903b4(pae.f151260d);
        }
    }

    /* JADX INFO: renamed from: X3 */
    public final /* synthetic */ void m133901X3(BLiveCallVolume bLiveCallVolume, qvd qvdVar, BLiveCall bLiveCall) {
        Float f = bLiveCallVolume.volumes.get(bLiveCall.user);
        if (f == null || f.floatValue() < 0.02f || f.floatValue() == bLiveCall.volume) {
            bLiveCall.isSpeak = false;
            bLiveCall.volume = 0.0f;
        } else {
            bLiveCall.isSpeak = true;
            bLiveCall.volume = f.floatValue();
        }
        ((CallWidgetView) this.viewModel).m77135O(qvdVar, bLiveCall);
    }

    /* JADX INFO: renamed from: Y3 */
    public abstract void mo113674Y3(BLiveCall bLiveCall, h64 h64Var);

    /* JADX INFO: renamed from: Z3 */
    public abstract void mo113675Z3(Integer num);

    /* JADX INFO: renamed from: a4 */
    public void m133902a4(int i) {
        ((CallWidgetView) this.viewModel).m77140v(i);
    }

    /* JADX INFO: renamed from: b4 */
    public final void m133903b4(int i) {
        g64.m129083d("sendChatHeightEvent:" + i);
        m213811F2().ChatEvent.changeInputSize().mo199273j(new Size(0, i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c4 */
    public final void m133904c4(int i, boolean z) {
        int i2;
        int i3;
        if (z) {
            bnl0.m105537U((View) this.viewModel, i - pae.f151262f);
        }
        if (((CallWidgetView) this.viewModel).f52351n) {
            i2 = (i - pae.f151263g) - pae.f151267k;
            i3 = pae.f151271o;
        } else {
            i2 = (i - pae.f151262f) - pae.f151267k;
            i3 = pae.f151271o;
        }
        m133903b4(i2 - i3);
    }

    @Override // p153l.i6t, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        super.mo70300n();
        V v2 = this.viewModel;
        if (v2 != 0) {
            ((CallWidgetView) v2).setVisible(false);
        }
        m133903b4(pae.f151257a);
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        ((CallWidgetView) this.viewModel).setVisible(true);
        ((CallWidgetView) this.viewModel).m77141w(m213815L2());
        duringCreated(this.f108206i.m161649a4()).subscribe(dhw.m115825d(new y20() { // from class: l.c84
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f80179a.m133899S3((qvd) obj);
            }
        }));
        m133903b4(pae.f151260d);
    }

    /* JADX INFO: renamed from: N3 */
    public void mo133897N3() {
    }
}
