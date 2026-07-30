package com.p046p1.mobile.putong.live.livingroom.virtual.payGuide;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
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
import p149l.kbv;
import p149l.t100;
import p149l.vwb;
import p149l.w8u;
import p149l.zfv;
import p149l.zvf0;

/* JADX INFO: loaded from: classes5.dex */
public class LiveVoiceVirtualPaymentGuideDialog extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public CommonAnimMaskAvatarView f52617d;

    /* JADX INFO: renamed from: e */
    public VText f52618e;

    /* JADX INFO: renamed from: f */
    public VText f52619f;

    /* JADX INFO: renamed from: g */
    public LinearLayout f52620g;

    /* JADX INFO: renamed from: h */
    public VDraweeView f52621h;

    /* JADX INFO: renamed from: i */
    public VText f52622i;

    /* JADX INFO: renamed from: j */
    public VText f52623j;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.virtual.payGuide.LiveVoiceVirtualPaymentGuideDialog$a */
    public class C12971a implements zfv.C21687a.a {
        public C12971a() {
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

    public LiveVoiceVirtualPaymentGuideDialog(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: j0 */
    public final void m77226j0(View view) {
        kbv.m145325a(this, view);
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m77227k0(ho2 ho2Var, LongLinkVirtualVoice.VoicePayGuidePopUp voicePayGuidePopUp, e30 e30Var, View view) {
        zvf0.m220399u("e_gift", ho2Var.mo97490p() ? "p_anchor_audio_room" : "p_user_audio_room", vwb.m200311Y("giftId", Long.valueOf(voicePayGuidePopUp.getGiftId())), vwb.m200311Y("giftUnitPrice", Long.valueOf(ho2Var.m132171w0((int) voicePayGuidePopUp.getGiftId()).getPrice())), vwb.m200311Y("module", BLiveTraceServerBiz.audio_pay_guide_relationship_pop), vwb.m200311Y("giftCombos", ""), vwb.m200311Y("gift_receiver_id", voicePayGuidePopUp.getToUserMask().getUserId()));
        e30Var.call(new cfe0.C16123a().m106531v(voicePayGuidePopUp.getGiftId() + "", new C12971a(), (int) voicePayGuidePopUp.getGiftCount(), "audio_pay_guide_bubble", "audio_pay_guide_bubble", BLiveTraceServerData.getNativeTraceServerData(BLiveTraceServerBiz.get(BLiveTraceServerBiz.audio_pay_guide_relationship_pop)), voicePayGuidePopUp.getToUserMask().getUserId(), "source_voice_gift_guide").m106529t());
    }

    /* JADX INFO: renamed from: l0 */
    public void m77228l0(final ho2 ho2Var, final LongLinkVirtualVoice.VoicePayGuidePopUp voicePayGuidePopUp, final e30<cfe0> e30Var, final d30 d30Var) {
        zvf0.m220368A("e_gift", ho2Var.mo97490p() ? "p_anchor_audio_room" : "p_user_audio_room", vwb.m200311Y("giftId", Long.valueOf(voicePayGuidePopUp.getGiftId())), vwb.m200311Y("module", BLiveTraceServerBiz.audio_pay_guide_relationship_pop));
        this.f52617d.setMaskAvatarData(new CommonAnimMaskAvatarView.C12717a().m72114d("context_single_room").m72115e(t100.f167242Q).m72113c(voicePayGuidePopUp.getToUserMask().getAvatar()).m72111a());
        StringBuilder sb = new StringBuilder();
        sb.append("向喜欢的人");
        sb.append(w8u.m202213p(voicePayGuidePopUp.getToUserMask().getName(), 3));
        sb.append("送礼");
        this.f52618e.setText(sb);
        this.f52619f.setText(voicePayGuidePopUp.getSubTitle());
        hxs.m133407t("context_single_room", this.f52621h, voicePayGuidePopUp.getGiftIcon(), t100.f167273v);
        this.f52622i.setText(voicePayGuidePopUp.getButtonTitle());
        this.f52620g.setOnClickListener(new View.OnClickListener() { // from class: l.ibv
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f112382a.m77227k0(ho2Var, voicePayGuidePopUp, e30Var, view);
            }
        });
        this.f52623j.setOnClickListener(new View.OnClickListener() { // from class: l.jbv
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                d30Var.call();
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m77226j0(this);
    }

    public LiveVoiceVirtualPaymentGuideDialog(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveVoiceVirtualPaymentGuideDialog(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
