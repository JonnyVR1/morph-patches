package p153l;

import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import androidx.appcompat.app.DialogInterfaceC0075a;
import com.google.firebase.messaging.Constants;
import com.google.protobuf.GeneratedMessageLite;
import com.p051p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.p051p1.mobile.putong.live.base.data.BLiveGivenGiftBrief;
import com.p051p1.mobile.putong.live.base.data.BLiveTraceServerBiz;
import com.p051p1.mobile.putong.live.base.data.BLiveTraceServerData;
import com.p051p1.mobile.putong.live.livingroom.virtual.payGuide.LiveVoicePayGuideBottomDialog;
import com.p051p1.mobile.putong.live.livingroom.virtual.payGuide.LiveVoiceVirtualPaymentGuideDialog;
import com.p051p1.mobile.putong.live.livingroom.virtual.payGuide.VirtualPayGuideV2View;
import com.p051p1.mobile.putong.live.livingroom.voice.member.LiveVoiceVirtualSendGiftGuideDialog;
import java.util.LinkedList;
import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
public class lgo0 extends qct<rwn0> {

    /* JADX INFO: renamed from: i */
    public LinkedList<GeneratedMessageLite> f131992i;

    /* JADX INFO: renamed from: j */
    public final PopupWindow f131993j;

    /* JADX INFO: renamed from: k */
    public Runnable f131994k;

    /* JADX INFO: renamed from: l */
    public DialogInterfaceC0075a f131995l;

    public lgo0(dum dumVar) {
        super(dumVar);
        this.f131992i = new LinkedList<>();
        final PopupWindow popupWindow = new PopupWindow();
        this.f131993j = popupWindow;
        Objects.requireNonNull(popupWindow);
        this.f131994k = new Runnable() { // from class: l.vfo0
            @Override // java.lang.Runnable
            public final void run() {
                popupWindow.dismiss();
            }
        };
        this.f131995l = null;
    }

    /* JADX INFO: renamed from: Z3 */
    public final /* synthetic */ void m154111Z3() {
        this.f131995l.dismiss();
    }

    /* JADX INFO: renamed from: a4 */
    public final /* synthetic */ void m154112a4(DialogInterface dialogInterface) {
        m154125n4();
    }

    /* JADX INFO: renamed from: b4 */
    public final /* synthetic */ void m154113b4(hne0 hne0Var) {
        m154126o4(hne0Var);
        this.f131995l.dismiss();
    }

    /* JADX INFO: renamed from: c4 */
    public final /* synthetic */ void m154114c4(DialogInterface dialogInterface) {
        m154125n4();
    }

    /* JADX INFO: renamed from: d4 */
    public final /* synthetic */ void m154115d4(hne0 hne0Var) {
        m154126o4(hne0Var);
        this.f131995l.dismiss();
    }

    /* JADX INFO: renamed from: e4 */
    public final /* synthetic */ void m154116e4() {
        this.f131995l.dismiss();
    }

    /* JADX INFO: renamed from: f4 */
    public final /* synthetic */ void m154117f4(View view) {
        this.f131993j.dismiss();
    }

    /* JADX INFO: renamed from: g4 */
    public final /* synthetic */ void m154118g4(LongLinkVirtualVoice.VoicePayGuideV2PopUp voicePayGuideV2PopUp, View view) {
        m154127p4(voicePayGuideV2PopUp);
    }

    /* JADX INFO: renamed from: h4 */
    public final /* synthetic */ void m154119h4(DialogInterface dialogInterface) {
        m154125n4();
    }

    /* JADX INFO: renamed from: i4 */
    public final /* synthetic */ void m154120i4(hne0 hne0Var) {
        m154126o4(hne0Var);
        this.f131995l.dismiss();
    }

    /* JADX INFO: renamed from: j4 */
    public final /* synthetic */ void m154121j4() {
        this.f131995l.dismiss();
    }

    /* JADX INFO: renamed from: k4 */
    public final /* synthetic */ void m154122k4(LongLinkVirtualVoice.VoicePayGuidePopUp voicePayGuidePopUp) {
        this.f131992i.add(voicePayGuidePopUp);
        m154125n4();
    }

    /* JADX INFO: renamed from: l4 */
    public final /* synthetic */ void m154123l4(LongLinkVirtualVoice.VoicePayGuideV2PopUp voicePayGuideV2PopUp) {
        this.f131992i.add(voicePayGuideV2PopUp);
        m154125n4();
    }

    /* JADX INFO: renamed from: m4 */
    public final /* synthetic */ void m154124m4(LongLinkVirtualVoice.VoiceAvatarFramePayGuidePopUp voiceAvatarFramePayGuidePopUp) {
        this.f131992i.add(voiceAvatarFramePayGuidePopUp);
        m154125n4();
    }

    /* JADX INFO: renamed from: n4 */
    public final void m154125n4() {
        if (this.f131992i.isEmpty()) {
            return;
        }
        GeneratedMessageLite generatedMessageLitePoll = this.f131992i.poll();
        if (generatedMessageLitePoll instanceof LongLinkVirtualVoice.VoicePayGuidePopUp) {
            LongLinkVirtualVoice.VoicePayGuidePopUp voicePayGuidePopUp = (LongLinkVirtualVoice.VoicePayGuidePopUp) generatedMessageLitePoll;
            if (voicePayGuidePopUp.getGuideTypeValue() == 0) {
                m154129r4(voicePayGuidePopUp);
                return;
            } else {
                m154128q4(voicePayGuidePopUp);
                return;
            }
        }
        if (generatedMessageLitePoll instanceof LongLinkVirtualVoice.VoiceAvatarFramePayGuidePopUp) {
            m154131t4((LongLinkVirtualVoice.VoiceAvatarFramePayGuidePopUp) generatedMessageLitePoll);
        } else if (generatedMessageLitePoll instanceof LongLinkVirtualVoice.VoicePayGuideV2PopUp) {
            m154130s4((LongLinkVirtualVoice.VoicePayGuideV2PopUp) generatedMessageLitePoll);
        } else {
            m154125n4();
        }
    }

    /* JADX INFO: renamed from: o4 */
    public final void m154126o4(hne0 hne0Var) {
        hne0Var.f110732a.f180066n = "source_voice_gift_guide";
        m213811F2().SendGiftEventGroup.sendGift().mo199273j(hne0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: p4 */
    public final void m154127p4(LongLinkVirtualVoice.VoicePayGuideV2PopUp voicePayGuideV2PopUp) {
        this.f131993j.dismiss();
        BLiveGiftItem bLiveGiftItemM168555w0 = ((rwn0) m213810E2()).m168555w0((int) voicePayGuideV2PopUp.getGiftId());
        String str = "audio_pay_guide_follow_" + voicePayGuideV2PopUp.getRelationshipType();
        if (voicePayGuideV2PopUp.getGuideType().getNumber() == 2) {
            str = "audio_pay_guide_not_follow_" + voicePayGuideV2PopUp.getRelationshipType();
        }
        String str2 = str;
        i4g0.m138523u("e_gift", ((rwn0) m213810E2()).mo118373p() ? "p_anchor_audio_room" : "p_user_audio_room", jyb.m147494Y("giftId", Long.valueOf(voicePayGuideV2PopUp.getGiftId())), jyb.m147494Y("giftUnitPrice", Long.valueOf(bLiveGiftItemM168555w0 == null ? 0L : bLiveGiftItemM168555w0.getPrice())), jyb.m147494Y("module", str2), jyb.m147494Y("giftCombos", ""), jyb.m147494Y(Constants.ScionAnalytics.PARAM_LABEL, voicePayGuideV2PopUp.getUserTag().getType()), jyb.m147494Y("content", voicePayGuideV2PopUp.getSubTitle()), jyb.m147494Y("enter_source", ((rwn0) m213810E2()).mo146599R2()), jyb.m147494Y("gift_receiver_id", voicePayGuideV2PopUp.getUserId()));
        m213811F2().SendGiftEventGroup.sendGift().mo199273j(new hne0.C17513a().m136085v(voicePayGuideV2PopUp.getGiftId() + "", new C18391a(voicePayGuideV2PopUp), (int) voicePayGuideV2PopUp.getGiftCount(), str2, str2, BLiveTraceServerData.getNativeTraceServerData(BLiveTraceServerBiz.get(voicePayGuideV2PopUp.getBizType())), voicePayGuideV2PopUp.getToUserInfo().getUserId(), "source_voice_gift_guide").m136083t());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [l.oo2] */
    /* JADX INFO: renamed from: q4 */
    public final void m154128q4(LongLinkVirtualVoice.VoicePayGuidePopUp voicePayGuidePopUp) {
        LiveVoicePayGuideBottomDialog liveVoicePayGuideBottomDialog = (LiveVoicePayGuideBottomDialog) LayoutInflater.from(this.f196919f).inflate(yec0.f199001Z9, (ViewGroup) null);
        c0s c0sVar = new c0s(this, liveVoicePayGuideBottomDialog);
        this.f131995l = c0sVar;
        c0sVar.show();
        this.f131995l.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.wfo0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f188873a.m154112a4(dialogInterface);
            }
        });
        liveVoicePayGuideBottomDialog.m78406g(m213810E2(), voicePayGuidePopUp, new y20() { // from class: l.xfo0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f194082a.m154113b4((hne0) obj);
            }
        }, new x20() { // from class: l.yfo0
            @Override // p153l.x20
            public final void call() {
                this.f199646a.m154111Z3();
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [l.oo2] */
    /* JADX INFO: renamed from: r4 */
    public final void m154129r4(LongLinkVirtualVoice.VoicePayGuidePopUp voicePayGuidePopUp) {
        jl80.C17971a c17971aNewDialog = this.f196918e.f90815a.newDialog();
        LiveVoiceVirtualPaymentGuideDialog liveVoiceVirtualPaymentGuideDialog = (LiveVoiceVirtualPaymentGuideDialog) LayoutInflater.from(this.f196919f).inflate(yec0.f199041cb, (ViewGroup) null);
        c17971aNewDialog.m146023R(liveVoiceVirtualPaymentGuideDialog);
        jl80 jl80VarM146020O = c17971aNewDialog.m146020O();
        this.f131995l = jl80VarM146020O;
        jl80VarM146020O.show();
        this.f131995l.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.zfo0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f204180a.m154114c4(dialogInterface);
            }
        });
        liveVoiceVirtualPaymentGuideDialog.m78411l0(m213810E2(), voicePayGuidePopUp, new y20() { // from class: l.ago0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f71270a.m154115d4((hne0) obj);
            }
        }, new x20() { // from class: l.bgo0
            @Override // p153l.x20
            public final void call() {
                this.f76676a.m154116e4();
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: s4 */
    public final void m154130s4(final LongLinkVirtualVoice.VoicePayGuideV2PopUp voicePayGuideV2PopUp) {
        VirtualPayGuideV2View virtualPayGuideV2View = (VirtualPayGuideV2View) LayoutInflater.from(this.f196919f).inflate(yec0.f199014aa, (ViewGroup) null);
        this.f131993j.setOutsideTouchable(true);
        this.f131993j.setWidth(Math.min(qa00.m175859d(265.0f), bnl0.m105592y0() - qa00.m175859d(110.0f)));
        this.f131993j.setHeight(qa00.m175859d(123.0f));
        this.f131993j.setAnimationStyle(jgc0.f120707n);
        this.f131993j.setContentView(virtualPayGuideV2View);
        virtualPayGuideV2View.m78413i0(voicePayGuideV2PopUp, new View.OnClickListener() { // from class: l.igo0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f114805a.m154117f4(view);
            }
        }, new View.OnClickListener() { // from class: l.jgo0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f120752a.m154118g4(voicePayGuideV2PopUp, view);
            }
        });
        this.f131993j.showAtLocation(m213819Q2(), 83, qa00.m175859d(12.0f), qa00.m175859d(68.0f));
        l51.m152888H(this.f196919f, this.f131994k, 10000L);
        this.f131993j.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: l.kgo0
            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                this.f126637a.m154125n4();
            }
        });
        String str = voicePayGuideV2PopUp.getGuideType().getNumber() == 2 ? "audio_pay_guide_not_follow_" : "audio_pay_guide_follow_";
        String str2 = ((rwn0) m213810E2()).mo118373p() ? "p_anchor_audio_room" : "p_user_audio_room";
        i4g0.m138492A("e_gift", str2, jyb.m147494Y("giftId", Long.valueOf(voicePayGuideV2PopUp.getGiftId())), jyb.m147494Y(Constants.ScionAnalytics.PARAM_LABEL, voicePayGuideV2PopUp.getUserTag().getType()), jyb.m147494Y("content", voicePayGuideV2PopUp.getSubTitle()), jyb.m147494Y("enter_source", ((rwn0) m213810E2()).mo146599R2()), jyb.m147494Y("module", str + voicePayGuideV2PopUp.getRelationshipType()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        duringCreated(((rwn0) m213810E2()).m168545q1().m98291h1()).subscribe(dhw.m115825d(new y20() { // from class: l.cgo0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f81690a.m154122k4((LongLinkVirtualVoice.VoicePayGuidePopUp) obj);
            }
        }));
        duringCreated(((rwn0) m213810E2()).m168545q1().m98288g1()).subscribe(dhw.m115829h(new y20() { // from class: l.dgo0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f88322a.m154123l4((LongLinkVirtualVoice.VoicePayGuideV2PopUp) obj);
            }
        }));
        duringCreated(((rwn0) m213810E2()).m168545q1().m98335w0()).subscribe(dhw.m115825d(new y20() { // from class: l.ego0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f93957a.m154124m4((LongLinkVirtualVoice.VoiceAvatarFramePayGuidePopUp) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [l.oo2] */
    /* JADX INFO: renamed from: t4 */
    public final void m154131t4(LongLinkVirtualVoice.VoiceAvatarFramePayGuidePopUp voiceAvatarFramePayGuidePopUp) {
        jl80.C17971a c17971aNewDialog = this.f196918e.f90815a.newDialog();
        LiveVoiceVirtualSendGiftGuideDialog liveVoiceVirtualSendGiftGuideDialog = (LiveVoiceVirtualSendGiftGuideDialog) LayoutInflater.from(this.f196919f).inflate(yec0.f199119ib, (ViewGroup) null);
        c17971aNewDialog.m146023R(liveVoiceVirtualSendGiftGuideDialog);
        jl80 jl80VarM146020O = c17971aNewDialog.m146020O();
        this.f131995l = jl80VarM146020O;
        jl80VarM146020O.show();
        this.f131995l.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.fgo0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f98961a.m154119h4(dialogInterface);
            }
        });
        liveVoiceVirtualSendGiftGuideDialog.m79783l0(m213810E2(), voiceAvatarFramePayGuidePopUp, new y20() { // from class: l.ggo0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f104034a.m154120i4((hne0) obj);
            }
        }, new x20() { // from class: l.hgo0
            @Override // p153l.x20
            public final void call() {
                this.f109428a.m154121j4();
            }
        });
    }

    /* JADX INFO: renamed from: l.lgo0$a */
    public class C18391a implements aiv.C15716a.a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ LongLinkVirtualVoice.VoicePayGuideV2PopUp f131996a;

        public C18391a(LongLinkVirtualVoice.VoicePayGuideV2PopUp voicePayGuideV2PopUp) {
            this.f131996a = voicePayGuideV2PopUp;
        }

        @Override // p153l.aiv.C15716a.a
        /* JADX INFO: renamed from: a */
        public void mo68349a(BLiveGivenGiftBrief bLiveGivenGiftBrief) {
            if ("stranger".equals(this.f131996a.getRelationshipType())) {
                r1j0.m179420g("好友申请已发出");
            }
        }

        @Override // p153l.aiv.C15716a.a
        /* JADX INFO: renamed from: b */
        public void mo68350b() {
        }

        @Override // p153l.aiv.C15716a.a
        /* JADX INFO: renamed from: c */
        public void mo68351c() {
        }
    }
}
