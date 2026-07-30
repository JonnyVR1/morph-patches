package com.p051p1.mobile.putong.live.livingroom.voice.member;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.StrikethroughSpan;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.legacy.widget.Space;
import com.p051p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice;
import com.p051p1.mobile.longlink.msg.userMask.userMaskConfig;
import com.p051p1.mobile.putong.live.base.data.BLiveGivenGiftBrief;
import com.p051p1.mobile.putong.live.base.data.BLiveTraceServerBiz;
import com.p051p1.mobile.putong.live.base.data.BLiveTraceServerData;
import com.p051p1.mobile.putong.live.livingroom.common.avatar.CommonMaskAvatarView;
import p151v.VText;
import p153l.aiv;
import p153l.hne0;
import p153l.i4g0;
import p153l.jyb;
import p153l.odv;
import p153l.oo2;
import p153l.qa00;
import p153l.x20;
import p153l.y20;

/* JADX INFO: loaded from: classes10.dex */
public class LiveVoiceVirtualSendGiftGuideDialog extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public Space f54491d;

    /* JADX INFO: renamed from: e */
    public CommonMaskAvatarView f54492e;

    /* JADX INFO: renamed from: f */
    public CommonMaskAvatarView f54493f;

    /* JADX INFO: renamed from: g */
    public VText f54494g;

    /* JADX INFO: renamed from: h */
    public VText f54495h;

    /* JADX INFO: renamed from: i */
    public LinearLayout f54496i;

    /* JADX INFO: renamed from: j */
    public VText f54497j;

    /* JADX INFO: renamed from: k */
    public VText f54498k;

    /* JADX INFO: renamed from: l */
    public VText f54499l;

    /* JADX INFO: renamed from: m */
    public String f54500m;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.voice.member.LiveVoiceVirtualSendGiftGuideDialog$a */
    public class C13205a implements aiv.C15716a.a {
        public C13205a() {
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

    public LiveVoiceVirtualSendGiftGuideDialog(Context context) {
        super(context);
        this.f54500m = "audio_pay_guide_cp_avatar_frame";
    }

    /* JADX INFO: renamed from: j0 */
    public final void m79781j0(View view) {
        odv.m167343a(this, view);
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m79782k0(oo2 oo2Var, LongLinkVirtualVoice.VoiceAvatarFramePayGuidePopUp voiceAvatarFramePayGuidePopUp, y20 y20Var, View view) {
        i4g0.m138523u("e_gift", oo2Var.mo118373p() ? "p_anchor_audio_room" : "p_user_audio_room", jyb.m147494Y("giftId", Long.valueOf(voiceAvatarFramePayGuidePopUp.getGiftId())), jyb.m147494Y("giftUnitPrice", Long.valueOf(oo2Var.m168555w0((int) voiceAvatarFramePayGuidePopUp.getGiftId()).getPrice())), jyb.m147494Y("module", this.f54500m), jyb.m147494Y("giftCombos", ""), jyb.m147494Y("gift_receiver_id", voiceAvatarFramePayGuidePopUp.getToUserMask().getUserId()));
        hne0.C17513a c17513a = new hne0.C17513a();
        String strValueOf = String.valueOf(voiceAvatarFramePayGuidePopUp.getGiftId());
        C13205a c13205a = new C13205a();
        int giftCount = (int) voiceAvatarFramePayGuidePopUp.getGiftCount();
        String str = this.f54500m;
        y20Var.call(c17513a.m136085v(strValueOf, c13205a, giftCount, str, str, BLiveTraceServerData.getNativeTraceServerData(BLiveTraceServerBiz.get(BLiveTraceServerBiz.audio_pay_guide_relationship_pop)), voiceAvatarFramePayGuidePopUp.getToUserMask().getUserId(), "source_voice_gift_guide").m136083t());
    }

    /* JADX INFO: renamed from: l0 */
    public void m79783l0(final oo2 oo2Var, final LongLinkVirtualVoice.VoiceAvatarFramePayGuidePopUp voiceAvatarFramePayGuidePopUp, final y20<hne0> y20Var, final x20 x20Var) {
        i4g0.m138492A("e_gift", oo2Var.mo118373p() ? "p_anchor_audio_room" : "p_user_audio_room", jyb.m147494Y("giftId", Long.valueOf(voiceAvatarFramePayGuidePopUp.getGiftId())), jyb.m147494Y("module", this.f54500m));
        userMaskConfig.UserMask fromUserMask = voiceAvatarFramePayGuidePopUp.getFromUserMask();
        userMaskConfig.UserMask toUserMask = voiceAvatarFramePayGuidePopUp.getToUserMask();
        CommonMaskAvatarView commonMaskAvatarView = this.f54492e;
        int i = qa00.f156306S;
        commonMaskAvatarView.m73309q0(i, fromUserMask.getAvatarConfig().getFrameConfig().getStaticUrl(), fromUserMask.getAvatar(), fromUserMask.getAvatarConfig().getFrameConfig().getDynamicUrl());
        this.f54493f.m73309q0(i, toUserMask.getAvatarConfig().getFrameConfig().getStaticUrl(), toUserMask.getAvatar(), toUserMask.getAvatarConfig().getFrameConfig().getDynamicUrl());
        this.f54494g.setText(voiceAvatarFramePayGuidePopUp.getTitle());
        this.f54495h.setText(voiceAvatarFramePayGuidePopUp.getSubTitle());
        this.f54497j.setText(voiceAvatarFramePayGuidePopUp.getButtonTitle());
        String buttonSubTitle = voiceAvatarFramePayGuidePopUp.getButtonSubTitle();
        SpannableString spannableString = new SpannableString(buttonSubTitle);
        spannableString.setSpan(new StrikethroughSpan(), 0, buttonSubTitle.length(), 33);
        this.f54498k.setText(spannableString);
        this.f54496i.setOnClickListener(new View.OnClickListener() { // from class: l.mdv
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f136412a.m79782k0(oo2Var, voiceAvatarFramePayGuidePopUp, y20Var, view);
            }
        });
        this.f54499l.setOnClickListener(new View.OnClickListener() { // from class: l.ndv
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                x20Var.call();
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m79781j0(this);
    }

    public LiveVoiceVirtualSendGiftGuideDialog(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f54500m = "audio_pay_guide_cp_avatar_frame";
    }

    public LiveVoiceVirtualSendGiftGuideDialog(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f54500m = "audio_pay_guide_cp_avatar_frame";
    }
}
