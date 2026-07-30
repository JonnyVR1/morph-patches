package p153l;

import android.text.TextUtils;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.putong.live.LiveDialogAct;
import com.p051p1.mobile.putong.live.base.data.BLiveSettings;
import com.p051p1.mobile.putong.live.base.data.BLiveVoice;
import com.p051p1.mobile.putong.live.external.internal.virtualVoice.entry.LiveVoiceInternalEntryBean;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.archi.frag.RoomFrag;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveControlMessage;
import com.p051p1.mobile.putong.live.livingroom.common.jumproom.JumpRoomData;
import com.p051p1.mobile.putong.live.livingroom.util.pref.LiveWatchCounter;
import com.p051p1.mobile.putong.live.livingroom.voice.intl.root.VoiceRoomView;
import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
public class tqo0 extends AbstractC21253x5<jqm0, BLiveVoice, noo0, VoiceRoomView> {

    /* JADX INFO: renamed from: j */
    public noo0 f175762j;

    /* JADX INFO: renamed from: k */
    public final RoomFrag f175763k;

    /* JADX INFO: renamed from: l */
    public final ogd0 f175764l;

    /* JADX INFO: renamed from: m */
    public kcg0 f175765m;

    /* JADX INFO: renamed from: n */
    public kcg0 f175766n;

    /* JADX INFO: renamed from: o */
    public String f175767o;

    /* JADX WARN: Multi-variable type inference failed */
    public tqo0(noo0 noo0Var, ogd0 ogd0Var, VoiceRoomView voiceRoomView) {
        super(noo0Var);
        this.f175762j = noo0Var;
        this.f175763k = (RoomFrag) noo0Var.f90820f;
        this.f175764l = ogd0Var;
        mo52715C(voiceRoomView);
        noo0Var.m118163a(this, (ViewGroup) this.viewModel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: A4 */
    public /* synthetic */ void m192320A4(String str) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        V v2 = this.viewModel;
        if (zIsEmpty) {
            ((VoiceRoomView) v2).f54330e.m79596c(((jqm0) m213810E2()).mo183440n().bgPicType, ((jqm0) m213810E2()).mo183440n().backgroundUrl);
        } else {
            ((VoiceRoomView) v2).f54330e.m79596c(LiveVoiceInternalEntryBean.TYPE_IMAGE_STYLE_STATIC, str);
        }
    }

    /* JADX INFO: renamed from: D4 */
    private void m192321D4(String str, String str2, x20 x20Var) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Dialog.C4460e c4460eM21495B = act().dialog().m21503F(str).m21495B(false);
        Objects.requireNonNull(x20Var);
        c4460eM21495B.m21543n0(str2, new bri0(x20Var)).m21567z0();
    }

    /* JADX INFO: renamed from: l4 */
    public static /* synthetic */ void m192324l4(Throwable th) {
    }

    /* JADX INFO: renamed from: n4 */
    public static /* synthetic */ void m192326n4() {
    }

    /* JADX INFO: renamed from: s4 */
    private void m192331s4() {
        psd0.m173633z(this.f175766n);
        this.f175766n = duringCreated(((VoiceRoomView) this.viewModel).getGiftWidthObs()).onBackpressureLatest().filter(new qcj() { // from class: l.pqo0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((Integer) obj).intValue() > 0);
            }
        }).distinctUntilChanged().subscribe(dhw.m115826e(new y20() { // from class: l.qqo0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f159022a.m192332v4((Integer) obj);
            }
        }, new y20() { // from class: l.rqo0
            @Override // p153l.y20
            public final void call(Object obj) {
                tqo0.m192324l4((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v4 */
    public /* synthetic */ void m192332v4(Integer num) {
        m213811F2().ChatEvent.changeInputSize().mo199273j(new Size(bnl0.m105592y0() - num.intValue(), 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w4 */
    public /* synthetic */ void m192333w4(jsv jsvVar) {
        lej0 lej0Var = lej0.INSTANCE;
        lej0Var.m153910d("voice_valid_state_module");
        m163464M3();
        lej0Var.m153907a("voice_valid_state_module", "validStateModule");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: x4 */
    public /* synthetic */ void m192334x4(BLiveSettings bLiveSettings) {
        ((jqm0) m213810E2()).m168480T0();
    }

    @Override // p153l.AbstractC21253x5
    /* JADX INFO: renamed from: B4, reason: merged with bridge method [inline-methods] */
    public void mo120622b4(boolean z, BLiveVoice bLiveVoice) {
        if (TextUtils.equals(this.f175767o, bLiveVoice.f45171id)) {
            return;
        }
        this.f175767o = bLiveVoice.f45171id;
        m213811F2().PreLoadEvent.preLoad().mo199273j(new om80(z, bLiveVoice));
    }

    /* JADX INFO: renamed from: E4 */
    public void m192337E4(boolean z, String str) {
        m213811F2().VoiceCloseEvent.showFloatWindow().mo199273j(new dan0(z, str));
    }

    @Override // p153l.AbstractC21253x5
    /* JADX INFO: renamed from: N3 */
    public void mo120609N3() {
        this.f175767o = null;
        m213811F2().PreLoadEvent.cleanPreLoad().m199277p();
    }

    @Override // p153l.AbstractC21253x5
    /* JADX INFO: renamed from: O3 */
    public boolean mo120610O3() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.AbstractC21253x5
    /* JADX INFO: renamed from: R3 */
    public View mo120612R3() {
        return (View) this.viewModel;
    }

    @Override // p153l.AbstractC21253x5
    /* JADX INFO: renamed from: T3 */
    public void mo120614T3(y20<ugd0> y20Var) {
        m213811F2().RoomInfoEvent.initSmallWindowRoomInfo().mo199273j(new vgd0(y20Var, null, false, null, false));
    }

    @Override // p153l.AbstractC21253x5
    /* JADX INFO: renamed from: U3 */
    public boolean mo120615U3(int i) {
        return true;
    }

    @Override // p153l.AbstractC21253x5
    /* JADX INFO: renamed from: V3 */
    public boolean mo120616V3() {
        return ((Boolean) m138856F3(new u7f(3400))).booleanValue();
    }

    @Override // p153l.AbstractC21253x5
    /* JADX INFO: renamed from: W3 */
    public boolean mo120617W3() {
        return this.f175767o != null;
    }

    @Override // p153l.AbstractC21253x5
    /* JADX INFO: renamed from: X3 */
    public boolean mo120618X3(int i) {
        return ((Boolean) m138856F3(new v24(3400, i))).booleanValue();
    }

    @Override // p153l.AbstractC21253x5
    /* JADX INFO: renamed from: Y3 */
    public boolean mo120619Y3(boolean z, boolean z2) {
        if (z2 || !zrv.f205799a.m207696u().live.voiceWindowEnable.booleanValue()) {
            return false;
        }
        m192337E4(false, "click_back_button");
        return true;
    }

    @Override // p153l.AbstractC21253x5
    /* JADX INFO: renamed from: Z3 */
    public void mo120620Z3() {
        this.f175764l.m167571h1();
    }

    @Override // p153l.AbstractC21253x5
    /* JADX INFO: renamed from: a4 */
    public void mo120621a4() {
        m192337E4(false, "slide");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.AbstractC21253x5
    /* JADX INFO: renamed from: e4 */
    public void mo120624e4(JumpRoomData jumpRoomData) {
        ((jqm0) m213810E2()).m146614f4(jumpRoomData);
    }

    @Override // p153l.AbstractC21253x5
    /* JADX INFO: renamed from: f4 */
    public void mo120625f4(qwl qwlVar) {
        m213811F2().PlayerEvent.updatePlayer().mo199273j(qwlVar);
    }

    @Override // p153l.AbstractC21253x5
    /* JADX INFO: renamed from: g4 */
    public void mo120626g4(boolean z) {
        V v2 = this.viewModel;
        if (v2 == 0) {
            return;
        }
        ((VoiceRoomView) v2).setSwallowAllTouchEvent(z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [l.dum] */
    @Override // p153l.AbstractC21253x5
    /* JADX INFO: renamed from: i4 */
    public void mo120627i4() {
        zrv.m221197r();
        m153103z2(this.f175764l.m167591x0().m158075I2(m163462K3()));
        jqo0.m146621c(this, (noo0) m163462K3(), (VoiceRoomView) this.viewModel);
        super.mo71381T();
        ((jqm0) m213810E2()).m202199w(this.f192449i);
        ((jqm0) m213810E2()).mo168507c2();
        this.f196919f.setSwipeBackEnable(false);
        ((VoiceRoomView) this.viewModel).m79643k0(true);
        m192331s4();
        duringCreated(((jqm0) m213810E2()).mo183454y()).subscribe(dhw.m115825d(new y20() { // from class: l.lqo0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f133236a.m192333w4((jsv) obj);
            }
        }));
        duringCreated(zrv.m221193k().m159274k()).subscribe(dhw.m115825d(new y20() { // from class: l.mqo0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f138118a.m192334x4((BLiveSettings) obj);
            }
        }));
        duringCreated(((jqm0) m213810E2()).m202192l()).subscribe(dhw.m115825d(new y20() { // from class: l.nqo0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f143249a.m192340y4((jsv) obj);
            }
        }));
        this.f175765m = ((jqm0) m213810E2()).m168541o1(this.f196919f).subscribe(dhw.m115825d(new y20() { // from class: l.oqo0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f148607a.m192341z4((LiveControlMessage) obj);
            }
        }));
        ((jqm0) m213810E2()).m168470P1();
        LiveWatchCounter.m77513h().m77515f(1);
        this.f175767o = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.AbstractC21253x5
    public void init() {
        m153103z2(new i5j(this.f196918e, this.f175764l));
        jqo0.m146622d(this, (noo0) m163462K3(), (VoiceRoomView) this.viewModel);
        ((VoiceRoomView) this.viewModel).m79642j0(this.f175763k.f48586A);
        ere.m122146i().m122162t(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.i6t, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        this.f196918e.f90827m.destroy();
        r230.m179475p("context_single_room");
        psd0.m173633z(this.f175765m);
        boolean zMo120616V3 = mo120616V3();
        super.mo70300n();
        if (zMo120616V3) {
            ((jqm0) this.f196918e.f90822h).mo146610c0(true);
        } else {
            ((jqm0) m213810E2()).exit();
        }
    }

    @Override // p153l.l6t
    /* JADX INFO: renamed from: s2 */
    public void mo120629s2() {
        super.mo120629s2();
        psd0.m173633z(this.f175766n);
        ((VoiceRoomView) this.viewModel).destroy();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        pvn.m173970e(new pvn.C19456a());
        if (!((jqm0) m213810E2()).f165194Q) {
            ((jqm0) m213810E2()).f122231g0 = pzi0.m174454o();
        }
        ((VoiceRoomView) this.viewModel).f54330e.m79596c(((jqm0) m213810E2()).mo183440n().bgPicType, ((jqm0) m213810E2()).mo183440n().backgroundUrl);
        duringCreated(m213811F2().VoiceAuctionEvent.refreshVoiceBg().m199270g()).subscribe(dhw.m115829h(new y20() { // from class: l.kqo0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f128264a.m192320A4((String) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: t4 */
    public void m192338t4() {
        mo120608J3();
    }

    @Override // p153l.AbstractC21253x5
    /* JADX INFO: renamed from: u4, reason: merged with bridge method [inline-methods] */
    public void mo120613S3(BLiveVoice bLiveVoice, boolean z, y20<ugd0> y20Var, y20<ugd0> y20Var2, boolean z2) {
        m213811F2().RoomInfoEvent.initRoomInfo().mo199273j(new vgd0(y20Var2, bLiveVoice, z, y20Var, z2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: y4 */
    public final /* synthetic */ void m192340y4(jsv jsvVar) {
        if (jsvVar.m146885k()) {
            ((jqm0) m213810E2()).mo146096e2(false, ((jqm0) m213810E2()).mo183435j());
            lej0.INSTANCE.m153907a("enter_voice_room", "startLive");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: z4 */
    public final /* synthetic */ void m192341z4(LiveControlMessage liveControlMessage) {
        String str = liveControlMessage.type;
        str.getClass();
        switch (str) {
            case "add_manager":
            case "delete_manager":
                ((jqm0) m213810E2()).mo118370K1(((jqm0) m213810E2()).m202191k());
                break;
            case "system":
                m192321D4(liveControlMessage.content, this.f196919f.getString(R$string.f48494y5), new x20() { // from class: l.sqo0
                    @Override // p153l.x20
                    public final void call() {
                        tqo0.m192326n4();
                    }
                });
                break;
            case "re_request_room_gift_list":
                muj.m160221w(true);
                ((jqm0) m213810E2()).m168445A1(new uxj.C20693a(((jqm0) m213810E2()).m202194o(), ((jqm0) m213810E2()).m168532l0().f56859id, "live").m198494f(), null);
                break;
            case "chat_tip_change":
                ((jqm0) m213810E2()).m168464L1();
                break;
            case "boot":
                ((jqm0) m213810E2()).m168518g2(((jqm0) m213810E2()).mo183435j());
                m192338t4();
                act().m68056e2();
                LiveDialogAct.m68361i2(act(), "", liveControlMessage.content, true);
                break;
            case "stop":
            case "force_stop":
                ((jqm0) m213810E2()).mo160116h(v9s.f183031e);
                break;
            case "pause":
                ((jqm0) m213810E2()).mo160116h(qcu.f156623b);
                break;
            case "forbidden_multidevice":
                String strM209910t = xau.m209910t(liveControlMessage.isAnchor ? R$string.f47820T5 : R$string.f47778R5);
                ((jqm0) m213810E2()).m168518g2(((jqm0) m213810E2()).mo183435j());
                m192338t4();
                act().m68056e2();
                LiveDialogAct.m68360h2(act(), "", strM209910t);
                break;
        }
        nsh0.m164609k(liveControlMessage.toString(), "[live][voice]", "[passivity_exit]");
    }

    @Override // p153l.AbstractC21253x5
    /* JADX INFO: renamed from: C4, reason: merged with bridge method [inline-methods] */
    public void mo120623c4(BLiveVoice bLiveVoice) {
    }

    @Override // p153l.AbstractC21253x5
    /* JADX INFO: renamed from: m */
    public void mo120628m(boolean z) {
    }

    @Override // p153l.AbstractC21253x5
    /* JADX INFO: renamed from: P3 */
    public void mo120611P3() {
    }
}
