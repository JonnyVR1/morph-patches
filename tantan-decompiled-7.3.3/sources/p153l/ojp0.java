package p153l;

import android.text.TextUtils;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import com.p051p1.mobile.putong.live.LiveDialogAct;
import com.p051p1.mobile.putong.live.base.data.BLiveSettings;
import com.p051p1.mobile.putong.live.base.data.BLiveVoice;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.archi.frag.RoomFrag;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveControlMessage;
import com.p051p1.mobile.putong.live.livingroom.common.jumproom.JumpRoomData;
import com.p051p1.mobile.putong.live.livingroom.util.pref.LiveWatchCounter;
import com.p051p1.mobile.putong.live.livingroom.view.SayHiBubbleView;
import com.p051p1.mobile.putong.live.livingroom.virtual.VoiceVirtualRoomView;
import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
public class ojp0 extends AbstractC21253x5<jqm0, BLiveVoice, noo0, VoiceVirtualRoomView> {

    /* JADX INFO: renamed from: j */
    public final RoomFrag f147691j;

    /* JADX INFO: renamed from: k */
    public final ogd0 f147692k;

    /* JADX INFO: renamed from: l */
    public kcg0 f147693l;

    /* JADX INFO: renamed from: m */
    public kcg0 f147694m;

    /* JADX WARN: Multi-variable type inference failed */
    public ojp0(noo0 noo0Var, ogd0 ogd0Var, VoiceVirtualRoomView voiceVirtualRoomView) {
        super(noo0Var);
        this.f147691j = (RoomFrag) noo0Var.f90820f;
        this.f147692k = ogd0Var;
        mo52715C(voiceVirtualRoomView);
        noo0Var.m118163a(this, (ViewGroup) this.viewModel);
        ((jqm0) m213810E2()).m183408N3(((jqm0) m213810E2()).m146609b4().template);
        ((jqm0) m213810E2()).m183407M3(((jqm0) m213810E2()).m146609b4().gameType);
        ((jqm0) m213810E2()).f165204a0 = ((jqm0) m213810E2()).m146609b4().voiceEnterType;
    }

    /* JADX INFO: renamed from: D4 */
    private void m167901D4(String str, String str2, x20 x20Var) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Dialog.C4460e c4460eM21495B = act().dialog().m21503F(str).m21495B(false);
        Objects.requireNonNull(x20Var);
        c4460eM21495B.m21543n0(str2, new bri0(x20Var)).m21567z0();
    }

    /* JADX INFO: renamed from: m4 */
    public static /* synthetic */ void m167905m4() {
    }

    /* JADX INFO: renamed from: q4 */
    public static /* synthetic */ void m167909q4(LongLinkLiveMessage.JailInRoom jailInRoom) {
        if (TextUtils.equals(zrv.f205799a.m207631D0(), jailInRoom.getUser().getId())) {
            o1j0.m165651y(xau.m209910t(R$string.f48306pf));
        }
    }

    /* JADX INFO: renamed from: s4 */
    private void m167911s4() {
        psd0.m173633z(this.f147694m);
        this.f147694m = duringCreated(((VoiceVirtualRoomView) this.viewModel).getGiftWidthObs()).onBackpressureLatest().filter(new qcj() { // from class: l.ljp0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((Integer) obj).intValue() > 0);
            }
        }).distinctUntilChanged().subscribe(dhw.m115829h(new y20() { // from class: l.mjp0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f137112a.m167919v4((Integer) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y4 */
    public /* synthetic */ void m167912y4() {
        act().m68056e2();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: A4 */
    public final /* synthetic */ void m167913A4(LiveControlMessage liveControlMessage) {
        fhw.m125605a("[live][virtual_voice]", "controlMsgType=" + liveControlMessage.type);
        String str = liveControlMessage.type;
        str.getClass();
        switch (str) {
            case "add_manager":
            case "delete_manager":
                ((jqm0) m213810E2()).mo118370K1(((jqm0) m213810E2()).m202191k());
                break;
            case "delete_room":
                ((jqm0) m213810E2()).mo160116h(new z8s());
                break;
            case "system":
                m167901D4(liveControlMessage.content, this.f196919f.getString(R$string.f48494y5), new x20() { // from class: l.kjp0
                    @Override // p153l.x20
                    public final void call() {
                        ojp0.m167905m4();
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
                m167917t4();
                act().m68056e2();
                LiveDialogAct.m68360h2(act(), "", liveControlMessage.content);
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
                m167917t4();
                act().m68056e2();
                LiveDialogAct.m68360h2(act(), "", strM209910t);
                break;
        }
    }

    /* JADX INFO: renamed from: E4 */
    public void m167916E4(boolean z, String str) {
        m213811F2().VoiceCloseEvent.showFloatWindow().mo199273j(new dan0(z, str));
    }

    @Override // p153l.AbstractC21253x5
    /* JADX INFO: renamed from: N3 */
    public void mo120609N3() {
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
        return true;
    }

    @Override // p153l.AbstractC21253x5
    /* JADX INFO: renamed from: X3 */
    public boolean mo120618X3(int i) {
        return false;
    }

    @Override // p153l.AbstractC21253x5
    /* JADX INFO: renamed from: Y3 */
    public boolean mo120619Y3(boolean z, boolean z2) {
        if (z2) {
            return false;
        }
        m167916E4(false, "click_back_button");
        return true;
    }

    @Override // p153l.AbstractC21253x5
    /* JADX INFO: renamed from: Z3 */
    public void mo120620Z3() {
        this.f147692k.m167571h1();
    }

    @Override // p153l.AbstractC21253x5
    /* JADX INFO: renamed from: a4 */
    public void mo120621a4() {
        m167916E4(false, "slide");
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
        ((VoiceVirtualRoomView) v2).setSwallowAllTouchEvent(z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [l.dum] */
    @Override // p153l.AbstractC21253x5
    /* JADX INFO: renamed from: i4 */
    public void mo120627i4() {
        zrv.m221197r();
        m153103z2(this.f147692k.m167591x0().m158075I2(m163462K3()));
        djp0.m116145b(this, (noo0) m163462K3(), (VoiceVirtualRoomView) this.viewModel);
        super.mo71381T();
        ((jqm0) m213810E2()).m202199w(this.f192449i);
        ((jqm0) m213810E2()).mo168507c2();
        this.f196919f.setSwipeBackEnable(false);
        m167911s4();
        duringCreated(((jqm0) m213810E2()).mo183454y()).subscribe(dhw.m115829h(new y20() { // from class: l.ejp0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f94315a.m167920w4((jsv) obj);
            }
        }));
        duringCreated(zrv.m221193k().m159274k()).subscribe(dhw.m115829h(new y20() { // from class: l.fjp0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f99403a.m167921x4((BLiveSettings) obj);
            }
        }));
        duringCreated(((jqm0) m213810E2()).m202192l()).subscribe(dhw.m115829h(new y20() { // from class: l.gjp0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f104640a.m167922z4((jsv) obj);
            }
        }));
        this.f147693l = ((jqm0) m213810E2()).m168539n1().subscribe(dhw.m115829h(new y20() { // from class: l.hjp0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f110292a.m167913A4((LiveControlMessage) obj);
            }
        }));
        ((jqm0) m213810E2()).m168470P1();
        LiveWatchCounter.m77513h().m77515f(1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.AbstractC21253x5
    public void init() {
        m153103z2(new i5j(this.f196918e, this.f147692k));
        djp0.m116146c(this, (noo0) m163462K3(), (VoiceVirtualRoomView) this.viewModel);
        ((VoiceVirtualRoomView) this.viewModel).m77903j0(this.f147691j.f48586A);
        ere.m122146i().m122162t(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.i6t, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        this.f196918e.f90827m.destroy();
        r230.m179475p("context_single_room");
        psd0.m173633z(this.f147693l);
        boolean zMo120616V3 = mo120616V3();
        super.mo70300n();
        if (zMo120616V3) {
            ((jqm0) this.f196918e.f90822h).mo146610c0(true);
        } else {
            ((jqm0) m213810E2()).exit();
            SayHiBubbleView.setGreetedToUserId(null);
        }
    }

    @Override // p153l.l6t
    /* JADX INFO: renamed from: s2 */
    public void mo120629s2() {
        super.mo120629s2();
        psd0.m173633z(this.f147694m);
        ((VoiceVirtualRoomView) this.viewModel).destroy();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        ((VoiceVirtualRoomView) this.viewModel).m77904k0();
        djp0.m116144a(this, (noo0) m163462K3(), (VoiceVirtualRoomView) this.viewModel);
        if (!((jqm0) m213810E2()).f165194Q) {
            ((jqm0) m213810E2()).f122231g0 = pzi0.m174454o();
        }
        duringCreated(((jqm0) m213810E2()).m168545q1().m98325t()).filter(new qcj() { // from class: l.ijp0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((LongLinkLiveMessage.JailInRoom) obj).hasUser());
            }
        }).subscribe(dhw.m115829h(new y20() { // from class: l.jjp0
            @Override // p153l.y20
            public final void call(Object obj) {
                ojp0.m167909q4((LongLinkLiveMessage.JailInRoom) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: t4 */
    public void m167917t4() {
        mo120608J3();
    }

    @Override // p153l.AbstractC21253x5
    /* JADX INFO: renamed from: u4, reason: merged with bridge method [inline-methods] */
    public void mo120613S3(BLiveVoice bLiveVoice, boolean z, y20<ugd0> y20Var, y20<ugd0> y20Var2, boolean z2) {
        if (TextUtils.isEmpty(bLiveVoice.f45171id)) {
            return;
        }
        m213811F2().RoomInfoEvent.initRoomInfo().mo199273j(new vgd0(y20Var2, bLiveVoice, z, y20Var, z2));
    }

    /* JADX INFO: renamed from: v4 */
    public final /* synthetic */ void m167919v4(Integer num) {
        m213811F2().ChatEvent.changeInputSize().mo199273j(new Size(bnl0.m105592y0() - num.intValue(), 0));
    }

    /* JADX INFO: renamed from: w4 */
    public final /* synthetic */ void m167920w4(jsv jsvVar) {
        m163464M3();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: x4 */
    public final /* synthetic */ void m167921x4(BLiveSettings bLiveSettings) {
        ((jqm0) m213810E2()).m168483U0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: z4 */
    public final /* synthetic */ void m167922z4(jsv jsvVar) {
        fhw.m125605a("[live][virtual_voice]", "cur living state : " + jsvVar.toString());
        if (jsvVar.m146885k()) {
            ((jqm0) m213810E2()).mo146096e2(((jqm0) m213810E2()).mo118373p(), ((jqm0) m213810E2()).mo183435j());
        } else if (jsvVar.m146876b()) {
            m167901D4(zrv.f205803e.getString(R$string.f47556Gj), zrv.f205803e.getString(R$string.f48271o2), new x20() { // from class: l.njp0
                @Override // p153l.x20
                public final void call() {
                    this.f142332a.m167912y4();
                }
            });
        }
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

    @Override // p153l.AbstractC21253x5
    /* JADX INFO: renamed from: B4, reason: merged with bridge method [inline-methods] */
    public void mo120622b4(boolean z, BLiveVoice bLiveVoice) {
    }
}
