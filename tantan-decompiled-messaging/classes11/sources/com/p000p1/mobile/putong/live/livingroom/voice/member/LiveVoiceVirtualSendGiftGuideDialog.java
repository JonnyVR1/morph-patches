package com.p000p1.mobile.putong.live.livingroom.voice.member;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.StrikethroughSpan;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.legacy.widget.Space;
import com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice;
import com.p1.mobile.longlink.msg.userMask.userMaskConfig;
import com.p1.mobile.putong.live.base.data.BLiveGivenGiftBrief;
import com.p1.mobile.putong.live.base.data.BLiveTraceServerBiz;
import com.p1.mobile.putong.live.base.data.BLiveTraceServerData;
import com.p1.mobile.putong.live.livingroom.common.avatar.CommonMaskAvatarView;
import l.cfe0;
import l.d30;
import l.e30;
import l.ho2;
import l.j760;
import l.nbv;
import l.t100;
import l.vwb;
import l.zfv;
import l.zvf0;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class LiveVoiceVirtualSendGiftGuideDialog extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public Space f7249d;

    /* JADX INFO: renamed from: e */
    public CommonMaskAvatarView f7250e;

    /* JADX INFO: renamed from: f */
    public CommonMaskAvatarView f7251f;

    /* JADX INFO: renamed from: g */
    public VText f7252g;

    /* JADX INFO: renamed from: h */
    public VText f7253h;

    /* JADX INFO: renamed from: i */
    public LinearLayout f7254i;

    /* JADX INFO: renamed from: j */
    public VText f7255j;

    /* JADX INFO: renamed from: k */
    public VText f7256k;

    /* JADX INFO: renamed from: l */
    public VText f7257l;

    /* JADX INFO: renamed from: m */
    public String f7258m;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.voice.member.LiveVoiceVirtualSendGiftGuideDialog$a */
    public class C0444a implements zfv.a.a {
        public C0444a() {
        }

        /* JADX INFO: renamed from: a */
        public void m8814a(BLiveGivenGiftBrief bLiveGivenGiftBrief) {
        }

        /* JADX INFO: renamed from: b */
        public void m8815b() {
        }

        /* JADX INFO: renamed from: c */
        public void m8816c() {
        }
    }

    public LiveVoiceVirtualSendGiftGuideDialog(Context context) {
        super(context);
        this.f7258m = "audio_pay_guide_cp_avatar_frame";
    }

    /* JADX INFO: renamed from: j0 */
    public final void m8811j0(View view) {
        nbv.a(this, view);
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m8812k0(ho2 ho2Var, LongLinkVirtualVoice.VoiceAvatarFramePayGuidePopUp voiceAvatarFramePayGuidePopUp, e30 e30Var, View view) {
        zvf0.u("e_gift", ho2Var.p() ? "p_anchor_audio_room" : "p_user_audio_room", new j760[]{vwb.Y("giftId", Long.valueOf(voiceAvatarFramePayGuidePopUp.getGiftId())), vwb.Y("giftUnitPrice", Long.valueOf(ho2Var.w0((int) voiceAvatarFramePayGuidePopUp.getGiftId()).getPrice())), vwb.Y("module", this.f7258m), vwb.Y("giftCombos", ""), vwb.Y("gift_receiver_id", voiceAvatarFramePayGuidePopUp.getToUserMask().getUserId())});
        cfe0.a aVar = new cfe0.a();
        String strValueOf = String.valueOf(voiceAvatarFramePayGuidePopUp.getGiftId());
        C0444a c0444a = new C0444a();
        int giftCount = (int) voiceAvatarFramePayGuidePopUp.getGiftCount();
        String str = this.f7258m;
        e30Var.call(aVar.v(strValueOf, c0444a, giftCount, str, str, BLiveTraceServerData.getNativeTraceServerData(BLiveTraceServerBiz.get("audio_pay_guide_relationship_pop")), voiceAvatarFramePayGuidePopUp.getToUserMask().getUserId(), "source_voice_gift_guide").t());
    }

    /* JADX INFO: renamed from: l0 */
    public void m8813l0(final ho2 ho2Var, final LongLinkVirtualVoice.VoiceAvatarFramePayGuidePopUp voiceAvatarFramePayGuidePopUp, final e30<cfe0> e30Var, final d30 d30Var) {
        zvf0.A("e_gift", ho2Var.p() ? "p_anchor_audio_room" : "p_user_audio_room", new j760[]{vwb.Y("giftId", Long.valueOf(voiceAvatarFramePayGuidePopUp.getGiftId())), vwb.Y("module", this.f7258m)});
        userMaskConfig.UserMask fromUserMask = voiceAvatarFramePayGuidePopUp.getFromUserMask();
        userMaskConfig.UserMask toUserMask = voiceAvatarFramePayGuidePopUp.getToUserMask();
        CommonMaskAvatarView commonMaskAvatarView = this.f7250e;
        int i = t100.S;
        commonMaskAvatarView.q0(i, fromUserMask.getAvatarConfig().getFrameConfig().getStaticUrl(), fromUserMask.getAvatar(), fromUserMask.getAvatarConfig().getFrameConfig().getDynamicUrl());
        this.f7251f.q0(i, toUserMask.getAvatarConfig().getFrameConfig().getStaticUrl(), toUserMask.getAvatar(), toUserMask.getAvatarConfig().getFrameConfig().getDynamicUrl());
        this.f7252g.setText(voiceAvatarFramePayGuidePopUp.getTitle());
        this.f7253h.setText(voiceAvatarFramePayGuidePopUp.getSubTitle());
        this.f7255j.setText(voiceAvatarFramePayGuidePopUp.getButtonTitle());
        String buttonSubTitle = voiceAvatarFramePayGuidePopUp.getButtonSubTitle();
        SpannableString spannableString = new SpannableString(buttonSubTitle);
        spannableString.setSpan(new StrikethroughSpan(), 0, buttonSubTitle.length(), 33);
        this.f7256k.setText(spannableString);
        this.f7254i.setOnClickListener(new View.OnClickListener() { // from class: l.lbv
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f16057a.m8812k0(ho2Var, voiceAvatarFramePayGuidePopUp, e30Var, view);
            }
        });
        this.f7257l.setOnClickListener(new View.OnClickListener() { // from class: l.mbv
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                d30Var.call();
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m8811j0(this);
    }

    public LiveVoiceVirtualSendGiftGuideDialog(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7258m = "audio_pay_guide_cp_avatar_frame";
    }

    public LiveVoiceVirtualSendGiftGuideDialog(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f7258m = "audio_pay_guide_cp_avatar_frame";
    }
}
