package p149l;

import android.text.TextUtils;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import com.p046p1.mobile.putong.live.LiveDialogAct;
import com.p046p1.mobile.putong.live.base.data.BLiveSettings;
import com.p046p1.mobile.putong.live.base.data.BLiveVoice;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.archi.frag.RoomFrag;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveControlMessage;
import com.p046p1.mobile.putong.live.livingroom.common.jumproom.JumpRoomData;
import com.p046p1.mobile.putong.live.livingroom.util.pref.LiveWatchCounter;
import com.p046p1.mobile.putong.live.livingroom.view.SayHiBubbleView;
import com.p046p1.mobile.putong.live.livingroom.virtual.VoiceVirtualRoomView;
import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
public class kap0 extends AbstractC15533a6<fhm0, BLiveVoice, jfo0, VoiceVirtualRoomView> {

    /* JADX INFO: renamed from: j */
    public final RoomFrag f122139j;

    /* JADX INFO: renamed from: k */
    public final l8d0 f122140k;

    /* JADX INFO: renamed from: l */
    public c4g0 f122141l;

    /* JADX INFO: renamed from: m */
    public c4g0 f122142m;

    /* JADX WARN: Multi-variable type inference failed */
    public kap0(jfo0 jfo0Var, l8d0 l8d0Var, VoiceVirtualRoomView voiceVirtualRoomView) {
        super(jfo0Var);
        this.f122139j = (RoomFrag) jfo0Var.f77100f;
        this.f122140k = l8d0Var;
        mo51532C(voiceVirtualRoomView);
        jfo0Var.m103722a(this, (ViewGroup) this.viewModel);
        ((fhm0) m206027E2()).m160246N3(((fhm0) m206027E2()).m121381b4().template);
        ((fhm0) m206027E2()).m160245M3(((fhm0) m206027E2()).m121381b4().gameType);
        ((fhm0) m206027E2()).f139757a0 = ((fhm0) m206027E2()).m121381b4().voiceEnterType;
    }

    /* JADX INFO: renamed from: D4 */
    private void m145154D4(String str, String str2, d30 d30Var) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Dialog.C4309e c4309eM20496B = act().dialog().m20504F(str).m20496B(false);
        Objects.requireNonNull(d30Var);
        c4309eM20496B.m20544n0(str2, new bii0(d30Var)).m20568z0();
    }

    /* JADX INFO: renamed from: m4 */
    public static /* synthetic */ void m145158m4() {
    }

    /* JADX INFO: renamed from: q4 */
    public static /* synthetic */ void m145162q4(LongLinkLiveMessage.JailInRoom jailInRoom) {
        if (TextUtils.equals(ypv.f199493a.m199309D0(), jailInRoom.getUser().getId())) {
            lsi0.m151595y(w8u.m202217t(R$string.f47458pf));
        }
    }

    /* JADX INFO: renamed from: s4 */
    private void m145164s4() {
        mkd0.m154992z(this.f122142m);
        this.f122142m = duringCreated(((VoiceVirtualRoomView) this.viewModel).getGiftWidthObs()).onBackpressureLatest().filter(new w9j() { // from class: l.hap0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((Integer) obj).intValue() > 0);
            }
        }).distinctUntilChanged().subscribe(ffw.m121197h(new e30() { // from class: l.iap0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f112318a.m145172v4((Integer) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y4 */
    public /* synthetic */ void m145165y4() {
        act().m66873d2();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: A4 */
    public final /* synthetic */ void m145166A4(LiveControlMessage liveControlMessage) {
        hfw.m130790a("[live][virtual_voice]", "controlMsgType=" + liveControlMessage.type);
        String str = liveControlMessage.type;
        str.getClass();
        switch (str) {
            case "add_manager":
            case "delete_manager":
                ((fhm0) m206027E2()).mo132074K1(((fhm0) m206027E2()).m149814k());
                break;
            case "delete_room":
                ((fhm0) m206027E2()).mo149812h(new y6s());
                break;
            case "system":
                m145154D4(liveControlMessage.content, this.f188513f.getString(R$string.f47646y5), new d30() { // from class: l.gap0
                    @Override // p149l.d30
                    public final void call() {
                        kap0.m145158m4();
                    }
                });
                break;
            case "re_request_room_gift_list":
                wrj.m205257w(true);
                ((fhm0) m206027E2()).m132055A1(new evj.C16689a(((fhm0) m206027E2()).m149818o(), ((fhm0) m206027E2()).m132146l0().f56011id, "live").m118277f(), null);
                break;
            case "chat_tip_change":
                ((fhm0) m206027E2()).m132076L1();
                break;
            case "boot":
                ((fhm0) m206027E2()).m132132g2(((fhm0) m206027E2()).mo149813j());
                m145170t4();
                act().m66873d2();
                LiveDialogAct.m67177g2(act(), "", liveControlMessage.content);
                break;
            case "stop":
            case "force_stop":
                ((fhm0) m206027E2()).mo149812h(u7s.f175055e);
                break;
            case "pause":
                ((fhm0) m206027E2()).mo149812h(pau.f148011b);
                break;
            case "forbidden_multidevice":
                String strM202217t = w8u.m202217t(liveControlMessage.isAnchor ? R$string.f46972T5 : R$string.f46930R5);
                ((fhm0) m206027E2()).m132132g2(((fhm0) m206027E2()).mo149813j());
                m145170t4();
                act().m66873d2();
                LiveDialogAct.m67177g2(act(), "", strM202217t);
                break;
        }
    }

    /* JADX INFO: renamed from: E4 */
    public void m145169E4(boolean z, String str) {
        m206028F2().VoiceCloseEvent.showFloatWindow().mo172463j(new z0n0(z, str));
    }

    @Override // p149l.AbstractC15533a6
    /* JADX INFO: renamed from: N3 */
    public void mo95084N3() {
        m206028F2().PreLoadEvent.cleanPreLoad().m172467p();
    }

    @Override // p149l.AbstractC15533a6
    /* JADX INFO: renamed from: O3 */
    public boolean mo95085O3() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.AbstractC15533a6
    /* JADX INFO: renamed from: R3 */
    public View mo95087R3() {
        return (View) this.viewModel;
    }

    @Override // p149l.AbstractC15533a6
    /* JADX INFO: renamed from: T3 */
    public void mo95089T3(e30<r8d0> e30Var) {
        m206028F2().RoomInfoEvent.initSmallWindowRoomInfo().mo172463j(new s8d0(e30Var, null, false, null, false));
    }

    @Override // p149l.AbstractC15533a6
    /* JADX INFO: renamed from: U3 */
    public boolean mo95090U3(int i) {
        return true;
    }

    @Override // p149l.AbstractC15533a6
    /* JADX INFO: renamed from: V3 */
    public boolean mo95091V3() {
        return ((Boolean) m129297F3(new o6f(3400))).booleanValue();
    }

    @Override // p149l.AbstractC15533a6
    /* JADX INFO: renamed from: W3 */
    public boolean mo95092W3() {
        return true;
    }

    @Override // p149l.AbstractC15533a6
    /* JADX INFO: renamed from: X3 */
    public boolean mo95093X3(int i) {
        return false;
    }

    @Override // p149l.AbstractC15533a6
    /* JADX INFO: renamed from: Y3 */
    public boolean mo95094Y3(boolean z, boolean z2) {
        if (z2) {
            return false;
        }
        m145169E4(false, "click_back_button");
        return true;
    }

    @Override // p149l.AbstractC15533a6
    /* JADX INFO: renamed from: Z3 */
    public void mo95095Z3() {
        this.f122140k.m148896h1();
    }

    @Override // p149l.AbstractC15533a6
    /* JADX INFO: renamed from: a4 */
    public void mo95096a4() {
        m145169E4(false, "slide");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.AbstractC15533a6
    /* JADX INFO: renamed from: e4 */
    public void mo95100e4(JumpRoomData jumpRoomData) {
        ((fhm0) m206027E2()).m121385f4(jumpRoomData);
    }

    @Override // p149l.AbstractC15533a6
    /* JADX INFO: renamed from: f4 */
    public void mo95101f4(cul culVar) {
        m206028F2().PlayerEvent.updatePlayer().mo172463j(culVar);
    }

    @Override // p149l.AbstractC15533a6
    /* JADX INFO: renamed from: g4 */
    public void mo95102g4(boolean z) {
        V v2 = this.viewModel;
        if (v2 == 0) {
            return;
        }
        ((VoiceVirtualRoomView) v2).setSwallowAllTouchEvent(z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [l.bsm] */
    @Override // p149l.AbstractC15533a6
    /* JADX INFO: renamed from: i4 */
    public void mo95104i4() {
        ypv.m215676r();
        m144512z2(this.f122140k.m148916x0().m149343I2(m154638K3()));
        z9p0.m217679b(this, (jfo0) m154638K3(), (VoiceVirtualRoomView) this.viewModel);
        super.mo70198T();
        ((fhm0) m206027E2()).m149825w(this.f67733i);
        ((fhm0) m206027E2()).mo132121c2();
        this.f188513f.setSwipeBackEnable(false);
        m145164s4();
        duringCreated(((fhm0) m206027E2()).mo149827y()).subscribe(ffw.m121197h(new e30() { // from class: l.aap0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f68592a.m145173w4((iqv) obj);
            }
        }));
        duringCreated(ypv.m215672k().m121230k()).subscribe(ffw.m121197h(new e30() { // from class: l.bap0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f74710a.m145174x4((BLiveSettings) obj);
            }
        }));
        duringCreated(((fhm0) m206027E2()).m149815l()).subscribe(ffw.m121197h(new e30() { // from class: l.cap0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f80043a.m145175z4((iqv) obj);
            }
        }));
        this.f122141l = ((fhm0) m206027E2()).m132153n1().subscribe(ffw.m121197h(new e30() { // from class: l.dap0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f85253a.m145166A4((LiveControlMessage) obj);
            }
        }));
        ((fhm0) m206027E2()).m132084P1();
        LiveWatchCounter.m76330h().m76332f(1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.AbstractC15533a6
    public void init() {
        m144512z2(new n2j(this.f188512e, this.f122140k));
        z9p0.m217680c(this, (jfo0) m154638K3(), (VoiceVirtualRoomView) this.viewModel);
        ((VoiceVirtualRoomView) this.viewModel).m76720j0(this.f122139j.f47738A);
        aqe.m98261i().m98277t(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.h4t, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        this.f188512e.f77107m.destroy();
        hu20.m132970p("context_single_room");
        mkd0.m154992z(this.f122141l);
        boolean zMo95091V3 = mo95091V3();
        super.mo69117n();
        if (zMo95091V3) {
            ((fhm0) this.f188512e.f77102h).mo97488c0(true);
        } else {
            ((fhm0) m206027E2()).exit();
            SayHiBubbleView.setGreetedToUserId(null);
        }
    }

    @Override // p149l.k4t
    /* JADX INFO: renamed from: s2 */
    public void mo111727s2() {
        super.mo111727s2();
        mkd0.m154992z(this.f122142m);
        ((VoiceVirtualRoomView) this.viewModel).destroy();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        ((VoiceVirtualRoomView) this.viewModel).m76721k0();
        z9p0.m217678a(this, (jfo0) m154638K3(), (VoiceVirtualRoomView) this.viewModel);
        if (!((fhm0) m206027E2()).f139747Q) {
            ((fhm0) m206027E2()).f97523g0 = mqi0.m155944o();
        }
        duringCreated(((fhm0) m206027E2()).m132160q1().m189143t()).filter(new w9j() { // from class: l.eap0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((LongLinkLiveMessage.JailInRoom) obj).hasUser());
            }
        }).subscribe(ffw.m121197h(new e30() { // from class: l.fap0
            @Override // p149l.e30
            public final void call(Object obj) {
                kap0.m145162q4((LongLinkLiveMessage.JailInRoom) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: t4 */
    public void m145170t4() {
        mo140769J3();
    }

    @Override // p149l.AbstractC15533a6
    /* JADX INFO: renamed from: u4, reason: merged with bridge method [inline-methods] */
    public void mo95088S3(BLiveVoice bLiveVoice, boolean z, e30<r8d0> e30Var, e30<r8d0> e30Var2, boolean z2) {
        if (TextUtils.isEmpty(bLiveVoice.f44323id)) {
            return;
        }
        m206028F2().RoomInfoEvent.initRoomInfo().mo172463j(new s8d0(e30Var2, bLiveVoice, z, e30Var, z2));
    }

    /* JADX INFO: renamed from: v4 */
    public final /* synthetic */ void m145172v4(Integer num) {
        m206028F2().ChatEvent.changeInputSize().mo172463j(new Size(xdl0.m208412y0() - num.intValue(), 0));
    }

    /* JADX INFO: renamed from: w4 */
    public final /* synthetic */ void m145173w4(iqv iqvVar) {
        m154640M3();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: x4 */
    public final /* synthetic */ void m145174x4(BLiveSettings bLiveSettings) {
        ((fhm0) m206027E2()).m132097U0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: z4 */
    public final /* synthetic */ void m145175z4(iqv iqvVar) {
        hfw.m130790a("[live][virtual_voice]", "cur living state : " + iqvVar.toString());
        if (iqvVar.m137804k()) {
            ((fhm0) m206027E2()).mo97489e2(((fhm0) m206027E2()).mo97490p(), ((fhm0) m206027E2()).mo149813j());
        } else if (iqvVar.m137795b()) {
            m145154D4(ypv.f199497e.getString(R$string.f46708Gj), ypv.f199497e.getString(R$string.f47423o2), new d30() { // from class: l.jap0
                @Override // p149l.d30
                public final void call() {
                    this.f117110a.m145165y4();
                }
            });
        }
    }

    @Override // p149l.AbstractC15533a6
    /* JADX INFO: renamed from: C4, reason: merged with bridge method [inline-methods] */
    public void mo95098c4(BLiveVoice bLiveVoice) {
    }

    @Override // p149l.AbstractC15533a6
    /* JADX INFO: renamed from: m */
    public void mo95105m(boolean z) {
    }

    @Override // p149l.AbstractC15533a6
    /* JADX INFO: renamed from: P3 */
    public void mo95086P3() {
    }

    @Override // p149l.AbstractC15533a6
    /* JADX INFO: renamed from: B4, reason: merged with bridge method [inline-methods] */
    public void mo95097b4(boolean z, BLiveVoice bLiveVoice) {
    }
}
