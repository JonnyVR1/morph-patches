package p149l;

import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import androidx.appcompat.app.DialogInterfaceC0074a;
import com.google.firebase.messaging.Constants;
import com.google.protobuf.GeneratedMessageLite;
import com.p046p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.p046p1.mobile.putong.live.base.data.BLiveGivenGiftBrief;
import com.p046p1.mobile.putong.live.base.data.BLiveTraceServerBiz;
import com.p046p1.mobile.putong.live.base.data.BLiveTraceServerData;
import com.p046p1.mobile.putong.live.livingroom.virtual.payGuide.LiveVoicePayGuideBottomDialog;
import com.p046p1.mobile.putong.live.livingroom.virtual.payGuide.LiveVoiceVirtualPaymentGuideDialog;
import com.p046p1.mobile.putong.live.livingroom.virtual.payGuide.VirtualPayGuideV2View;
import com.p046p1.mobile.putong.live.livingroom.voice.member.LiveVoiceVirtualSendGiftGuideDialog;
import java.util.LinkedList;
import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
public class h7o0 extends pat<nnn0> {

    /* JADX INFO: renamed from: i */
    public LinkedList<GeneratedMessageLite> f106319i;

    /* JADX INFO: renamed from: j */
    public final PopupWindow f106320j;

    /* JADX INFO: renamed from: k */
    public Runnable f106321k;

    /* JADX INFO: renamed from: l */
    public DialogInterfaceC0074a f106322l;

    public h7o0(bsm bsmVar) {
        super(bsmVar);
        this.f106319i = new LinkedList<>();
        final PopupWindow popupWindow = new PopupWindow();
        this.f106320j = popupWindow;
        Objects.requireNonNull(popupWindow);
        this.f106321k = new Runnable() { // from class: l.r6o0
            @Override // java.lang.Runnable
            public final void run() {
                popupWindow.dismiss();
            }
        };
        this.f106322l = null;
    }

    /* JADX INFO: renamed from: Z3 */
    public final /* synthetic */ void m129770Z3() {
        this.f106322l.dismiss();
    }

    /* JADX INFO: renamed from: a4 */
    public final /* synthetic */ void m129771a4(DialogInterface dialogInterface) {
        m129784n4();
    }

    /* JADX INFO: renamed from: b4 */
    public final /* synthetic */ void m129772b4(cfe0 cfe0Var) {
        m129785o4(cfe0Var);
        this.f106322l.dismiss();
    }

    /* JADX INFO: renamed from: c4 */
    public final /* synthetic */ void m129773c4(DialogInterface dialogInterface) {
        m129784n4();
    }

    /* JADX INFO: renamed from: d4 */
    public final /* synthetic */ void m129774d4(cfe0 cfe0Var) {
        m129785o4(cfe0Var);
        this.f106322l.dismiss();
    }

    /* JADX INFO: renamed from: e4 */
    public final /* synthetic */ void m129775e4() {
        this.f106322l.dismiss();
    }

    /* JADX INFO: renamed from: f4 */
    public final /* synthetic */ void m129776f4(View view) {
        this.f106320j.dismiss();
    }

    /* JADX INFO: renamed from: g4 */
    public final /* synthetic */ void m129777g4(LongLinkVirtualVoice.VoicePayGuideV2PopUp voicePayGuideV2PopUp, View view) {
        m129786p4(voicePayGuideV2PopUp);
    }

    /* JADX INFO: renamed from: h4 */
    public final /* synthetic */ void m129778h4(DialogInterface dialogInterface) {
        m129784n4();
    }

    /* JADX INFO: renamed from: i4 */
    public final /* synthetic */ void m129779i4(cfe0 cfe0Var) {
        m129785o4(cfe0Var);
        this.f106322l.dismiss();
    }

    /* JADX INFO: renamed from: j4 */
    public final /* synthetic */ void m129780j4() {
        this.f106322l.dismiss();
    }

    /* JADX INFO: renamed from: k4 */
    public final /* synthetic */ void m129781k4(LongLinkVirtualVoice.VoicePayGuidePopUp voicePayGuidePopUp) {
        this.f106319i.add(voicePayGuidePopUp);
        m129784n4();
    }

    /* JADX INFO: renamed from: l4 */
    public final /* synthetic */ void m129782l4(LongLinkVirtualVoice.VoicePayGuideV2PopUp voicePayGuideV2PopUp) {
        this.f106319i.add(voicePayGuideV2PopUp);
        m129784n4();
    }

    /* JADX INFO: renamed from: m4 */
    public final /* synthetic */ void m129783m4(LongLinkVirtualVoice.VoiceAvatarFramePayGuidePopUp voiceAvatarFramePayGuidePopUp) {
        this.f106319i.add(voiceAvatarFramePayGuidePopUp);
        m129784n4();
    }

    /* JADX INFO: renamed from: n4 */
    public final void m129784n4() {
        if (this.f106319i.isEmpty()) {
            return;
        }
        GeneratedMessageLite generatedMessageLitePoll = this.f106319i.poll();
        if (generatedMessageLitePoll instanceof LongLinkVirtualVoice.VoicePayGuidePopUp) {
            LongLinkVirtualVoice.VoicePayGuidePopUp voicePayGuidePopUp = (LongLinkVirtualVoice.VoicePayGuidePopUp) generatedMessageLitePoll;
            if (voicePayGuidePopUp.getGuideTypeValue() == 0) {
                m129788r4(voicePayGuidePopUp);
                return;
            } else {
                m129787q4(voicePayGuidePopUp);
                return;
            }
        }
        if (generatedMessageLitePoll instanceof LongLinkVirtualVoice.VoiceAvatarFramePayGuidePopUp) {
            m129790t4((LongLinkVirtualVoice.VoiceAvatarFramePayGuidePopUp) generatedMessageLitePoll);
        } else if (generatedMessageLitePoll instanceof LongLinkVirtualVoice.VoicePayGuideV2PopUp) {
            m129789s4((LongLinkVirtualVoice.VoicePayGuideV2PopUp) generatedMessageLitePoll);
        } else {
            m129784n4();
        }
    }

    /* JADX INFO: renamed from: o4 */
    public final void m129785o4(cfe0 cfe0Var) {
        cfe0Var.f80589a.f148665n = "source_voice_gift_guide";
        m206028F2().SendGiftEventGroup.sendGift().mo172463j(cfe0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: p4 */
    public final void m129786p4(LongLinkVirtualVoice.VoicePayGuideV2PopUp voicePayGuideV2PopUp) {
        this.f106320j.dismiss();
        BLiveGiftItem bLiveGiftItemM132171w0 = ((nnn0) m206027E2()).m132171w0((int) voicePayGuideV2PopUp.getGiftId());
        String str = "audio_pay_guide_follow_" + voicePayGuideV2PopUp.getRelationshipType();
        if (voicePayGuideV2PopUp.getGuideType().getNumber() == 2) {
            str = "audio_pay_guide_not_follow_" + voicePayGuideV2PopUp.getRelationshipType();
        }
        String str2 = str;
        zvf0.m220399u("e_gift", ((nnn0) m206027E2()).mo97490p() ? "p_anchor_audio_room" : "p_user_audio_room", vwb.m200311Y("giftId", Long.valueOf(voicePayGuideV2PopUp.getGiftId())), vwb.m200311Y("giftUnitPrice", Long.valueOf(bLiveGiftItemM132171w0 == null ? 0L : bLiveGiftItemM132171w0.getPrice())), vwb.m200311Y("module", str2), vwb.m200311Y("giftCombos", ""), vwb.m200311Y(Constants.ScionAnalytics.PARAM_LABEL, voicePayGuideV2PopUp.getUserTag().getType()), vwb.m200311Y("content", voicePayGuideV2PopUp.getSubTitle()), vwb.m200311Y("enter_source", ((nnn0) m206027E2()).mo121373R2()), vwb.m200311Y("gift_receiver_id", voicePayGuideV2PopUp.getUserId()));
        m206028F2().SendGiftEventGroup.sendGift().mo172463j(new cfe0.C16123a().m106531v(voicePayGuideV2PopUp.getGiftId() + "", new C17242a(voicePayGuideV2PopUp), (int) voicePayGuideV2PopUp.getGiftCount(), str2, str2, BLiveTraceServerData.getNativeTraceServerData(BLiveTraceServerBiz.get(voicePayGuideV2PopUp.getBizType())), voicePayGuideV2PopUp.getToUserInfo().getUserId(), "source_voice_gift_guide").m106529t());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [l.ho2] */
    /* JADX INFO: renamed from: q4 */
    public final void m129787q4(LongLinkVirtualVoice.VoicePayGuidePopUp voicePayGuidePopUp) {
        LiveVoicePayGuideBottomDialog liveVoicePayGuideBottomDialog = (LiveVoicePayGuideBottomDialog) LayoutInflater.from(this.f188513f).inflate(t6c0.f168269Z9, (ViewGroup) null);
        byr byrVar = new byr(this, liveVoicePayGuideBottomDialog);
        this.f106322l = byrVar;
        byrVar.show();
        this.f106322l.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.s6o0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f162839a.m129771a4(dialogInterface);
            }
        });
        liveVoicePayGuideBottomDialog.m77223g(m206027E2(), voicePayGuidePopUp, new e30() { // from class: l.t6o0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f168631a.m129772b4((cfe0) obj);
            }
        }, new d30() { // from class: l.u6o0
            @Override // p149l.d30
            public final void call() {
                this.f174876a.m129770Z3();
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [l.ho2] */
    /* JADX INFO: renamed from: r4 */
    public final void m129788r4(LongLinkVirtualVoice.VoicePayGuidePopUp voicePayGuidePopUp) {
        dd80.C16336a c16336aNewDialog = this.f188512e.f77095a.newDialog();
        LiveVoiceVirtualPaymentGuideDialog liveVoiceVirtualPaymentGuideDialog = (LiveVoiceVirtualPaymentGuideDialog) LayoutInflater.from(this.f188513f).inflate(t6c0.f168309cb, (ViewGroup) null);
        c16336aNewDialog.m110963R(liveVoiceVirtualPaymentGuideDialog);
        dd80 dd80VarM110960O = c16336aNewDialog.m110960O();
        this.f106322l = dd80VarM110960O;
        dd80VarM110960O.show();
        this.f106322l.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.v6o0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f180220a.m129773c4(dialogInterface);
            }
        });
        liveVoiceVirtualPaymentGuideDialog.m77228l0(m206027E2(), voicePayGuidePopUp, new e30() { // from class: l.w6o0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f184950a.m129774d4((cfe0) obj);
            }
        }, new d30() { // from class: l.x6o0
            @Override // p149l.d30
            public final void call() {
                this.f191258a.m129775e4();
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: s4 */
    public final void m129789s4(final LongLinkVirtualVoice.VoicePayGuideV2PopUp voicePayGuideV2PopUp) {
        VirtualPayGuideV2View virtualPayGuideV2View = (VirtualPayGuideV2View) LayoutInflater.from(this.f188513f).inflate(t6c0.f168282aa, (ViewGroup) null);
        this.f106320j.setOutsideTouchable(true);
        this.f106320j.setWidth(Math.min(t100.m186890d(265.0f), xdl0.m208412y0() - t100.m186890d(110.0f)));
        this.f106320j.setHeight(t100.m186890d(123.0f));
        this.f106320j.setAnimationStyle(d8c0.f84859n);
        this.f106320j.setContentView(virtualPayGuideV2View);
        virtualPayGuideV2View.m77230i0(voicePayGuideV2PopUp, new View.OnClickListener() { // from class: l.e7o0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f89736a.m129776f4(view);
            }
        }, new View.OnClickListener() { // from class: l.f7o0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f96272a.m129777g4(voicePayGuideV2PopUp, view);
            }
        });
        this.f106320j.showAtLocation(m206036Q2(), 83, t100.m186890d(12.0f), t100.m186890d(68.0f));
        e51.m114743H(this.f188513f, this.f106321k, 10000L);
        this.f106320j.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: l.g7o0
            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                this.f101422a.m129784n4();
            }
        });
        String str = voicePayGuideV2PopUp.getGuideType().getNumber() == 2 ? "audio_pay_guide_not_follow_" : "audio_pay_guide_follow_";
        String str2 = ((nnn0) m206027E2()).mo97490p() ? "p_anchor_audio_room" : "p_user_audio_room";
        zvf0.m220368A("e_gift", str2, vwb.m200311Y("giftId", Long.valueOf(voicePayGuideV2PopUp.getGiftId())), vwb.m200311Y(Constants.ScionAnalytics.PARAM_LABEL, voicePayGuideV2PopUp.getUserTag().getType()), vwb.m200311Y("content", voicePayGuideV2PopUp.getSubTitle()), vwb.m200311Y("enter_source", ((nnn0) m206027E2()).mo121373R2()), vwb.m200311Y("module", str + voicePayGuideV2PopUp.getRelationshipType()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        duringCreated(((nnn0) m206027E2()).m132160q1().m189109h1()).subscribe(ffw.m121193d(new e30() { // from class: l.y6o0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f196587a.m129781k4((LongLinkVirtualVoice.VoicePayGuidePopUp) obj);
            }
        }));
        duringCreated(((nnn0) m206027E2()).m132160q1().m189106g1()).subscribe(ffw.m121197h(new e30() { // from class: l.z6o0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f201943a.m129782l4((LongLinkVirtualVoice.VoicePayGuideV2PopUp) obj);
            }
        }));
        duringCreated(((nnn0) m206027E2()).m132160q1().m189153w0()).subscribe(ffw.m121193d(new e30() { // from class: l.a7o0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f67940a.m129783m4((LongLinkVirtualVoice.VoiceAvatarFramePayGuidePopUp) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [l.ho2] */
    /* JADX INFO: renamed from: t4 */
    public final void m129790t4(LongLinkVirtualVoice.VoiceAvatarFramePayGuidePopUp voiceAvatarFramePayGuidePopUp) {
        dd80.C16336a c16336aNewDialog = this.f188512e.f77095a.newDialog();
        LiveVoiceVirtualSendGiftGuideDialog liveVoiceVirtualSendGiftGuideDialog = (LiveVoiceVirtualSendGiftGuideDialog) LayoutInflater.from(this.f188513f).inflate(t6c0.f168387ib, (ViewGroup) null);
        c16336aNewDialog.m110963R(liveVoiceVirtualSendGiftGuideDialog);
        dd80 dd80VarM110960O = c16336aNewDialog.m110960O();
        this.f106322l = dd80VarM110960O;
        dd80VarM110960O.show();
        this.f106322l.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.b7o0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f74006a.m129778h4(dialogInterface);
            }
        });
        liveVoiceVirtualSendGiftGuideDialog.m78600l0(m206027E2(), voiceAvatarFramePayGuidePopUp, new e30() { // from class: l.c7o0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f79639a.m129779i4((cfe0) obj);
            }
        }, new d30() { // from class: l.d7o0
            @Override // p149l.d30
            public final void call() {
                this.f84756a.m129780j4();
            }
        });
    }

    /* JADX INFO: renamed from: l.h7o0$a */
    public class C17242a implements zfv.C21687a.a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ LongLinkVirtualVoice.VoicePayGuideV2PopUp f106323a;

        public C17242a(LongLinkVirtualVoice.VoicePayGuideV2PopUp voicePayGuideV2PopUp) {
            this.f106323a = voicePayGuideV2PopUp;
        }

        @Override // p149l.zfv.C21687a.a
        /* JADX INFO: renamed from: a */
        public void mo67166a(BLiveGivenGiftBrief bLiveGivenGiftBrief) {
            if ("stranger".equals(this.f106323a.getRelationshipType())) {
                osi0.m165783g("好友申请已发出");
            }
        }

        @Override // p149l.zfv.C21687a.a
        /* JADX INFO: renamed from: b */
        public void mo67167b() {
        }

        @Override // p149l.zfv.C21687a.a
        /* JADX INFO: renamed from: c */
        public void mo67168c() {
        }
    }
}
