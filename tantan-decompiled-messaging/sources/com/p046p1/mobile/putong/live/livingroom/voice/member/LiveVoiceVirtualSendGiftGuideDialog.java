package com.p046p1.mobile.putong.live.livingroom.voice.member;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.StrikethroughSpan;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.legacy.widget.Space;
import com.p046p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice;
import com.p046p1.mobile.longlink.msg.userMask.userMaskConfig;
import com.p046p1.mobile.putong.live.base.data.BLiveGivenGiftBrief;
import com.p046p1.mobile.putong.live.base.data.BLiveTraceServerBiz;
import com.p046p1.mobile.putong.live.base.data.BLiveTraceServerData;
import com.p046p1.mobile.putong.live.livingroom.common.avatar.CommonMaskAvatarView;
import p147v.VText;
import p149l.cfe0;
import p149l.d30;
import p149l.e30;
import p149l.ho2;
import p149l.nbv;
import p149l.t100;
import p149l.vwb;
import p149l.zfv;
import p149l.zvf0;

/* JADX INFO: loaded from: classes11.dex */
public class LiveVoiceVirtualSendGiftGuideDialog extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public Space f53643d;

    /* JADX INFO: renamed from: e */
    public CommonMaskAvatarView f53644e;

    /* JADX INFO: renamed from: f */
    public CommonMaskAvatarView f53645f;

    /* JADX INFO: renamed from: g */
    public VText f53646g;

    /* JADX INFO: renamed from: h */
    public VText f53647h;

    /* JADX INFO: renamed from: i */
    public LinearLayout f53648i;

    /* JADX INFO: renamed from: j */
    public VText f53649j;

    /* JADX INFO: renamed from: k */
    public VText f53650k;

    /* JADX INFO: renamed from: l */
    public VText f53651l;

    /* JADX INFO: renamed from: m */
    public String f53652m;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.voice.member.LiveVoiceVirtualSendGiftGuideDialog$a */
    public class C13042a implements zfv.C21687a.a {
        public C13042a() {
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

    public LiveVoiceVirtualSendGiftGuideDialog(Context context) {
        super(context);
        this.f53652m = "audio_pay_guide_cp_avatar_frame";
    }

    /* JADX INFO: renamed from: j0 */
    public final void m78598j0(View view) {
        nbv.m158841a(this, view);
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m78599k0(ho2 ho2Var, LongLinkVirtualVoice.VoiceAvatarFramePayGuidePopUp voiceAvatarFramePayGuidePopUp, e30 e30Var, View view) {
        zvf0.m220399u("e_gift", ho2Var.mo97490p() ? "p_anchor_audio_room" : "p_user_audio_room", vwb.m200311Y("giftId", Long.valueOf(voiceAvatarFramePayGuidePopUp.getGiftId())), vwb.m200311Y("giftUnitPrice", Long.valueOf(ho2Var.m132171w0((int) voiceAvatarFramePayGuidePopUp.getGiftId()).getPrice())), vwb.m200311Y("module", this.f53652m), vwb.m200311Y("giftCombos", ""), vwb.m200311Y("gift_receiver_id", voiceAvatarFramePayGuidePopUp.getToUserMask().getUserId()));
        cfe0.C16123a c16123a = new cfe0.C16123a();
        String strValueOf = String.valueOf(voiceAvatarFramePayGuidePopUp.getGiftId());
        C13042a c13042a = new C13042a();
        int giftCount = (int) voiceAvatarFramePayGuidePopUp.getGiftCount();
        String str = this.f53652m;
        e30Var.call(c16123a.m106531v(strValueOf, c13042a, giftCount, str, str, BLiveTraceServerData.getNativeTraceServerData(BLiveTraceServerBiz.get(BLiveTraceServerBiz.audio_pay_guide_relationship_pop)), voiceAvatarFramePayGuidePopUp.getToUserMask().getUserId(), "source_voice_gift_guide").m106529t());
    }

    /* JADX INFO: renamed from: l0 */
    public void m78600l0(final ho2 ho2Var, final LongLinkVirtualVoice.VoiceAvatarFramePayGuidePopUp voiceAvatarFramePayGuidePopUp, final e30<cfe0> e30Var, final d30 d30Var) {
        zvf0.m220368A("e_gift", ho2Var.mo97490p() ? "p_anchor_audio_room" : "p_user_audio_room", vwb.m200311Y("giftId", Long.valueOf(voiceAvatarFramePayGuidePopUp.getGiftId())), vwb.m200311Y("module", this.f53652m));
        userMaskConfig.UserMask fromUserMask = voiceAvatarFramePayGuidePopUp.getFromUserMask();
        userMaskConfig.UserMask toUserMask = voiceAvatarFramePayGuidePopUp.getToUserMask();
        CommonMaskAvatarView commonMaskAvatarView = this.f53644e;
        int i = t100.f167244S;
        commonMaskAvatarView.m72126q0(i, fromUserMask.getAvatarConfig().getFrameConfig().getStaticUrl(), fromUserMask.getAvatar(), fromUserMask.getAvatarConfig().getFrameConfig().getDynamicUrl());
        this.f53645f.m72126q0(i, toUserMask.getAvatarConfig().getFrameConfig().getStaticUrl(), toUserMask.getAvatar(), toUserMask.getAvatarConfig().getFrameConfig().getDynamicUrl());
        this.f53646g.setText(voiceAvatarFramePayGuidePopUp.getTitle());
        this.f53647h.setText(voiceAvatarFramePayGuidePopUp.getSubTitle());
        this.f53649j.setText(voiceAvatarFramePayGuidePopUp.getButtonTitle());
        String buttonSubTitle = voiceAvatarFramePayGuidePopUp.getButtonSubTitle();
        SpannableString spannableString = new SpannableString(buttonSubTitle);
        spannableString.setSpan(new StrikethroughSpan(), 0, buttonSubTitle.length(), 33);
        this.f53650k.setText(spannableString);
        this.f53648i.setOnClickListener(new View.OnClickListener() { // from class: l.lbv
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f127338a.m78599k0(ho2Var, voiceAvatarFramePayGuidePopUp, e30Var, view);
            }
        });
        this.f53651l.setOnClickListener(new View.OnClickListener() { // from class: l.mbv
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                d30Var.call();
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m78598j0(this);
    }

    public LiveVoiceVirtualSendGiftGuideDialog(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f53652m = "audio_pay_guide_cp_avatar_frame";
    }

    public LiveVoiceVirtualSendGiftGuideDialog(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f53652m = "audio_pay_guide_cp_avatar_frame";
    }
}
