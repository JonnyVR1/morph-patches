package com.p051p1.mobile.putong.live.livingroom.virtual.payGuide;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p051p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice;
import com.p051p1.mobile.putong.live.base.data.BLiveGivenGiftBrief;
import com.p051p1.mobile.putong.live.base.data.BLiveTraceServerBiz;
import com.p051p1.mobile.putong.live.base.data.BLiveTraceServerData;
import com.p051p1.mobile.putong.live.livingroom.common.avatar.CommonAnimMaskAvatarView;
import p151v.VDraweeView;
import p151v.VText;
import p153l.aiv;
import p153l.bnl0;
import p153l.hne0;
import p153l.i4g0;
import p153l.izs;
import p153l.jyb;
import p153l.oo2;
import p153l.pbv;
import p153l.qa00;
import p153l.x20;
import p153l.xau;
import p153l.y20;

/* JADX INFO: loaded from: classes5.dex */
public class LiveVoicePayGuideBottomDialog extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public View f53455a;

    /* JADX INFO: renamed from: b */
    public FrameLayout f53456b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f53457c;

    /* JADX INFO: renamed from: d */
    public CommonAnimMaskAvatarView f53458d;

    /* JADX INFO: renamed from: e */
    public VText f53459e;

    /* JADX INFO: renamed from: f */
    public VText f53460f;

    /* JADX INFO: renamed from: g */
    public VText f53461g;

    /* JADX INFO: renamed from: h */
    public VText f53462h;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.virtual.payGuide.LiveVoicePayGuideBottomDialog$a */
    public class C13132a implements aiv.C15716a.a {
        public C13132a() {
        }

        @Override // p153l.aiv.C15716a.a
        /* JADX INFO: renamed from: a */
        public void mo68349a(BLiveGivenGiftBrief bLiveGivenGiftBrief) {
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

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.virtual.payGuide.LiveVoicePayGuideBottomDialog$b */
    public class C13133b implements aiv.C15716a.a {
        public C13133b() {
        }

        @Override // p153l.aiv.C15716a.a
        /* JADX INFO: renamed from: a */
        public void mo68349a(BLiveGivenGiftBrief bLiveGivenGiftBrief) {
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

    public LiveVoicePayGuideBottomDialog(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: d */
    public final void m78403d(View view) {
        pbv.m171532a(this, view);
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m78404e(oo2 oo2Var, LongLinkVirtualVoice.VoicePayGuidePopUp voicePayGuidePopUp, y20 y20Var, View view) {
        i4g0.m138523u("e_gift", oo2Var.mo118373p() ? "p_anchor_audio_room" : "p_user_audio_room", jyb.m147494Y("giftId", Long.valueOf(voicePayGuidePopUp.getGiftId())), jyb.m147494Y("giftUnitPrice", Long.valueOf(oo2Var.m168555w0((int) voicePayGuidePopUp.getGiftId()).getPrice())), jyb.m147494Y("module", BLiveTraceServerBiz.audio_pay_guide_key_pop), jyb.m147494Y("giftCombos", ""), jyb.m147494Y("gift_receiver_id", voicePayGuidePopUp.getToUserMask().getUserId()));
        y20Var.call(new hne0.C17513a().m136085v(voicePayGuidePopUp.getGiftId() + "", new C13132a(), (int) voicePayGuidePopUp.getGiftCount(), "audio_pay_guide_bubble", "audio_pay_guide_bubble", BLiveTraceServerData.getNativeTraceServerData(BLiveTraceServerBiz.get(BLiveTraceServerBiz.audio_pay_guide_key_pop)), voicePayGuidePopUp.getToUserMask().getUserId(), "source_voice_gift_guide").m136083t());
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m78405f(LongLinkVirtualVoice.VoicePayGuidePopUp voicePayGuidePopUp, y20 y20Var, View view) {
        y20Var.call(new hne0.C17513a().m136085v(voicePayGuidePopUp.getGiftId() + "", new C13133b(), (int) voicePayGuidePopUp.getGiftCount(), "audio_pay_guide_bubble", "audio_pay_guide_bubble", BLiveTraceServerData.getNativeTraceServerData(BLiveTraceServerBiz.get(BLiveTraceServerBiz.audio_pay_guide_nearby_pop)), voicePayGuidePopUp.getToUserMask().getUserId(), "source_voice_gift_guide").m136083t());
    }

    /* JADX INFO: renamed from: g */
    public void m78406g(final oo2 oo2Var, final LongLinkVirtualVoice.VoicePayGuidePopUp voicePayGuidePopUp, final y20<hne0> y20Var, final x20 x20Var) {
        this.f53455a.setOnClickListener(new View.OnClickListener() { // from class: l.mbv
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                x20Var.call();
            }
        });
        if (voicePayGuidePopUp.getGuideTypeValue() == 1) {
            i4g0.m138492A("e_gift", oo2Var.mo118373p() ? "p_anchor_audio_room" : "p_user_audio_room", jyb.m147494Y("giftId", Long.valueOf(voicePayGuidePopUp.getGiftId())), jyb.m147494Y("module", BLiveTraceServerBiz.audio_pay_guide_key_pop));
            bnl0.m105524M(this.f53457c, true);
            bnl0.m105524M(this.f53458d, false);
            if (!TextUtils.isEmpty(voicePayGuidePopUp.getGiftIcon())) {
                izs.m142869t("context_single_room", this.f53457c, voicePayGuidePopUp.getGiftIcon(), qa00.f156291D);
            }
            bnl0.m105524M(this.f53459e, false);
            this.f53460f.setText(voicePayGuidePopUp.getTitle());
            this.f53461g.setText(voicePayGuidePopUp.getSubTitle());
            this.f53462h.setText(voicePayGuidePopUp.getButtonTitle());
            this.f53462h.setOnClickListener(new View.OnClickListener() { // from class: l.nbv
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f141260a.m78404e(oo2Var, voicePayGuidePopUp, y20Var, view);
                }
            });
            return;
        }
        bnl0.m105524M(this.f53457c, false);
        bnl0.m105524M(this.f53458d, true);
        i4g0.m138492A("e_gift", oo2Var.mo118373p() ? "p_anchor_audio_room" : "p_user_audio_room", jyb.m147494Y("giftId", Long.valueOf(voicePayGuidePopUp.getGiftId())), jyb.m147494Y("module", BLiveTraceServerBiz.audio_pay_guide_nearby_pop));
        bnl0.m105524M(this.f53459e, !TextUtils.isEmpty(voicePayGuidePopUp.getUserTag()));
        this.f53459e.setText(voicePayGuidePopUp.getUserTag());
        StringBuilder sb = new StringBuilder();
        sb.append(xau.m209906p(voicePayGuidePopUp.getToUserMask().getName(), 8));
        sb.append("在你附近");
        this.f53460f.setText(sb);
        this.f53461g.setText(voicePayGuidePopUp.getSubTitle());
        this.f53462h.setText(voicePayGuidePopUp.getButtonTitle());
        if (!TextUtils.isEmpty(voicePayGuidePopUp.getToUserMask().getAvatar())) {
            this.f53458d.setMaskAvatarData(new CommonAnimMaskAvatarView.C12880a().m73297d("context_single_room").m73296c(voicePayGuidePopUp.getToUserMask().getAvatar()).m73298e(qa00.f156291D).m73294a());
        }
        this.f53462h.setOnClickListener(new View.OnClickListener() { // from class: l.obv
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f146626a.m78405f(voicePayGuidePopUp, y20Var, view);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m78403d(this);
    }

    public LiveVoicePayGuideBottomDialog(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveVoicePayGuideBottomDialog(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
