package com.p051p1.mobile.putong.live.livingroom.virtual.payGuide;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice;
import com.p051p1.mobile.putong.live.base.data.BLiveGivenGiftBrief;
import com.p051p1.mobile.putong.live.base.data.BLiveTraceServerBiz;
import com.p051p1.mobile.putong.live.base.data.BLiveTraceServerData;
import com.p051p1.mobile.putong.live.livingroom.common.avatar.CommonAnimMaskAvatarView;
import p151v.VDraweeView;
import p151v.VText;
import p153l.aiv;
import p153l.hne0;
import p153l.i4g0;
import p153l.izs;
import p153l.jyb;
import p153l.ldv;
import p153l.oo2;
import p153l.qa00;
import p153l.x20;
import p153l.xau;
import p153l.y20;

/* JADX INFO: loaded from: classes5.dex */
public class LiveVoiceVirtualPaymentGuideDialog extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public CommonAnimMaskAvatarView f53465d;

    /* JADX INFO: renamed from: e */
    public VText f53466e;

    /* JADX INFO: renamed from: f */
    public VText f53467f;

    /* JADX INFO: renamed from: g */
    public LinearLayout f53468g;

    /* JADX INFO: renamed from: h */
    public VDraweeView f53469h;

    /* JADX INFO: renamed from: i */
    public VText f53470i;

    /* JADX INFO: renamed from: j */
    public VText f53471j;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.virtual.payGuide.LiveVoiceVirtualPaymentGuideDialog$a */
    public class C13134a implements aiv.C15716a.a {
        public C13134a() {
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

    public LiveVoiceVirtualPaymentGuideDialog(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: j0 */
    public final void m78409j0(View view) {
        ldv.m153820a(this, view);
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m78410k0(oo2 oo2Var, LongLinkVirtualVoice.VoicePayGuidePopUp voicePayGuidePopUp, y20 y20Var, View view) {
        i4g0.m138523u("e_gift", oo2Var.mo118373p() ? "p_anchor_audio_room" : "p_user_audio_room", jyb.m147494Y("giftId", Long.valueOf(voicePayGuidePopUp.getGiftId())), jyb.m147494Y("giftUnitPrice", Long.valueOf(oo2Var.m168555w0((int) voicePayGuidePopUp.getGiftId()).getPrice())), jyb.m147494Y("module", BLiveTraceServerBiz.audio_pay_guide_relationship_pop), jyb.m147494Y("giftCombos", ""), jyb.m147494Y("gift_receiver_id", voicePayGuidePopUp.getToUserMask().getUserId()));
        y20Var.call(new hne0.C17513a().m136085v(voicePayGuidePopUp.getGiftId() + "", new C13134a(), (int) voicePayGuidePopUp.getGiftCount(), "audio_pay_guide_bubble", "audio_pay_guide_bubble", BLiveTraceServerData.getNativeTraceServerData(BLiveTraceServerBiz.get(BLiveTraceServerBiz.audio_pay_guide_relationship_pop)), voicePayGuidePopUp.getToUserMask().getUserId(), "source_voice_gift_guide").m136083t());
    }

    /* JADX INFO: renamed from: l0 */
    public void m78411l0(final oo2 oo2Var, final LongLinkVirtualVoice.VoicePayGuidePopUp voicePayGuidePopUp, final y20<hne0> y20Var, final x20 x20Var) {
        i4g0.m138492A("e_gift", oo2Var.mo118373p() ? "p_anchor_audio_room" : "p_user_audio_room", jyb.m147494Y("giftId", Long.valueOf(voicePayGuidePopUp.getGiftId())), jyb.m147494Y("module", BLiveTraceServerBiz.audio_pay_guide_relationship_pop));
        this.f53465d.setMaskAvatarData(new CommonAnimMaskAvatarView.C12880a().m73297d("context_single_room").m73298e(qa00.f156304Q).m73296c(voicePayGuidePopUp.getToUserMask().getAvatar()).m73294a());
        StringBuilder sb = new StringBuilder();
        sb.append("向喜欢的人");
        sb.append(xau.m209906p(voicePayGuidePopUp.getToUserMask().getName(), 3));
        sb.append("送礼");
        this.f53466e.setText(sb);
        this.f53467f.setText(voicePayGuidePopUp.getSubTitle());
        izs.m142869t("context_single_room", this.f53469h, voicePayGuidePopUp.getGiftIcon(), qa00.f156335v);
        this.f53470i.setText(voicePayGuidePopUp.getButtonTitle());
        this.f53468g.setOnClickListener(new View.OnClickListener() { // from class: l.jdv
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f120363a.m78410k0(oo2Var, voicePayGuidePopUp, y20Var, view);
            }
        });
        this.f53471j.setOnClickListener(new View.OnClickListener() { // from class: l.kdv
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                x20Var.call();
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m78409j0(this);
    }

    public LiveVoiceVirtualPaymentGuideDialog(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveVoiceVirtualPaymentGuideDialog(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
