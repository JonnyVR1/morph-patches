package com.p046p1.mobile.putong.live.livingroom.virtual.payGuide;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p046p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice;
import com.p046p1.mobile.putong.live.base.data.BLiveGivenGiftBrief;
import com.p046p1.mobile.putong.live.base.data.BLiveTraceServerBiz;
import com.p046p1.mobile.putong.live.base.data.BLiveTraceServerData;
import com.p046p1.mobile.putong.live.livingroom.common.avatar.CommonAnimMaskAvatarView;
import p147v.VDraweeView;
import p147v.VText;
import p149l.cfe0;
import p149l.d30;
import p149l.e30;
import p149l.ho2;
import p149l.hxs;
import p149l.o9v;
import p149l.t100;
import p149l.vwb;
import p149l.w8u;
import p149l.xdl0;
import p149l.zfv;
import p149l.zvf0;

/* JADX INFO: loaded from: classes5.dex */
public class LiveVoicePayGuideBottomDialog extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public View f52607a;

    /* JADX INFO: renamed from: b */
    public FrameLayout f52608b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f52609c;

    /* JADX INFO: renamed from: d */
    public CommonAnimMaskAvatarView f52610d;

    /* JADX INFO: renamed from: e */
    public VText f52611e;

    /* JADX INFO: renamed from: f */
    public VText f52612f;

    /* JADX INFO: renamed from: g */
    public VText f52613g;

    /* JADX INFO: renamed from: h */
    public VText f52614h;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.virtual.payGuide.LiveVoicePayGuideBottomDialog$a */
    public class C12969a implements zfv.C21687a.a {
        public C12969a() {
        }

        @Override // p149l.zfv.C21687a.a
        /* JADX INFO: renamed from: a */
        public void mo67166a(BLiveGivenGiftBrief bLiveGivenGiftBrief) {
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

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.virtual.payGuide.LiveVoicePayGuideBottomDialog$b */
    public class C12970b implements zfv.C21687a.a {
        public C12970b() {
        }

        @Override // p149l.zfv.C21687a.a
        /* JADX INFO: renamed from: a */
        public void mo67166a(BLiveGivenGiftBrief bLiveGivenGiftBrief) {
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

    public LiveVoicePayGuideBottomDialog(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: d */
    public final void m77220d(View view) {
        o9v.m163212a(this, view);
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m77221e(ho2 ho2Var, LongLinkVirtualVoice.VoicePayGuidePopUp voicePayGuidePopUp, e30 e30Var, View view) {
        zvf0.m220399u("e_gift", ho2Var.mo97490p() ? "p_anchor_audio_room" : "p_user_audio_room", vwb.m200311Y("giftId", Long.valueOf(voicePayGuidePopUp.getGiftId())), vwb.m200311Y("giftUnitPrice", Long.valueOf(ho2Var.m132171w0((int) voicePayGuidePopUp.getGiftId()).getPrice())), vwb.m200311Y("module", BLiveTraceServerBiz.audio_pay_guide_key_pop), vwb.m200311Y("giftCombos", ""), vwb.m200311Y("gift_receiver_id", voicePayGuidePopUp.getToUserMask().getUserId()));
        e30Var.call(new cfe0.C16123a().m106531v(voicePayGuidePopUp.getGiftId() + "", new C12969a(), (int) voicePayGuidePopUp.getGiftCount(), "audio_pay_guide_bubble", "audio_pay_guide_bubble", BLiveTraceServerData.getNativeTraceServerData(BLiveTraceServerBiz.get(BLiveTraceServerBiz.audio_pay_guide_key_pop)), voicePayGuidePopUp.getToUserMask().getUserId(), "source_voice_gift_guide").m106529t());
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m77222f(LongLinkVirtualVoice.VoicePayGuidePopUp voicePayGuidePopUp, e30 e30Var, View view) {
        e30Var.call(new cfe0.C16123a().m106531v(voicePayGuidePopUp.getGiftId() + "", new C12970b(), (int) voicePayGuidePopUp.getGiftCount(), "audio_pay_guide_bubble", "audio_pay_guide_bubble", BLiveTraceServerData.getNativeTraceServerData(BLiveTraceServerBiz.get(BLiveTraceServerBiz.audio_pay_guide_nearby_pop)), voicePayGuidePopUp.getToUserMask().getUserId(), "source_voice_gift_guide").m106529t());
    }

    /* JADX INFO: renamed from: g */
    public void m77223g(final ho2 ho2Var, final LongLinkVirtualVoice.VoicePayGuidePopUp voicePayGuidePopUp, final e30<cfe0> e30Var, final d30 d30Var) {
        this.f52607a.setOnClickListener(new View.OnClickListener() { // from class: l.l9v
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                d30Var.call();
            }
        });
        if (voicePayGuidePopUp.getGuideTypeValue() == 1) {
            zvf0.m220368A("e_gift", ho2Var.mo97490p() ? "p_anchor_audio_room" : "p_user_audio_room", vwb.m200311Y("giftId", Long.valueOf(voicePayGuidePopUp.getGiftId())), vwb.m200311Y("module", BLiveTraceServerBiz.audio_pay_guide_key_pop));
            xdl0.m208344M(this.f52609c, true);
            xdl0.m208344M(this.f52610d, false);
            if (!TextUtils.isEmpty(voicePayGuidePopUp.getGiftIcon())) {
                hxs.m133407t("context_single_room", this.f52609c, voicePayGuidePopUp.getGiftIcon(), t100.f167229D);
            }
            xdl0.m208344M(this.f52611e, false);
            this.f52612f.setText(voicePayGuidePopUp.getTitle());
            this.f52613g.setText(voicePayGuidePopUp.getSubTitle());
            this.f52614h.setText(voicePayGuidePopUp.getButtonTitle());
            this.f52614h.setOnClickListener(new View.OnClickListener() { // from class: l.m9v
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f132803a.m77221e(ho2Var, voicePayGuidePopUp, e30Var, view);
                }
            });
            return;
        }
        xdl0.m208344M(this.f52609c, false);
        xdl0.m208344M(this.f52610d, true);
        zvf0.m220368A("e_gift", ho2Var.mo97490p() ? "p_anchor_audio_room" : "p_user_audio_room", vwb.m200311Y("giftId", Long.valueOf(voicePayGuidePopUp.getGiftId())), vwb.m200311Y("module", BLiveTraceServerBiz.audio_pay_guide_nearby_pop));
        xdl0.m208344M(this.f52611e, !TextUtils.isEmpty(voicePayGuidePopUp.getUserTag()));
        this.f52611e.setText(voicePayGuidePopUp.getUserTag());
        StringBuilder sb = new StringBuilder();
        sb.append(w8u.m202213p(voicePayGuidePopUp.getToUserMask().getName(), 8));
        sb.append("在你附近");
        this.f52612f.setText(sb);
        this.f52613g.setText(voicePayGuidePopUp.getSubTitle());
        this.f52614h.setText(voicePayGuidePopUp.getButtonTitle());
        if (!TextUtils.isEmpty(voicePayGuidePopUp.getToUserMask().getAvatar())) {
            this.f52610d.setMaskAvatarData(new CommonAnimMaskAvatarView.C12717a().m72114d("context_single_room").m72113c(voicePayGuidePopUp.getToUserMask().getAvatar()).m72115e(t100.f167229D).m72111a());
        }
        this.f52614h.setOnClickListener(new View.OnClickListener() { // from class: l.n9v
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f137837a.m77222f(voicePayGuidePopUp, e30Var, view);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m77220d(this);
    }

    public LiveVoicePayGuideBottomDialog(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveVoicePayGuideBottomDialog(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
