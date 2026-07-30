package com.p051p1.mobile.putong.live.livingroom.voice.intl.roominfobar;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.p053ui.bubble.C4496a;
import com.p051p1.mobile.android.p053ui.bubble.C4499d;
import com.p051p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import com.p051p1.mobile.putong.live.base.data.BLiveCommonViewConfig;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.p051p1.mobile.putong.live.base.data.BLiveVoice;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceRoom;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.common.avatar.CommonMaskAvatarView;
import com.p051p1.mobile.putong.live.livingroom.view.FocusTextView;
import com.tantanapp.common.utils.NullChecker;
import p151v.VText;
import p153l.biv;
import p153l.bnl0;
import p153l.h64;
import p153l.iam;
import p153l.j26;
import p153l.n9c0;
import p153l.nsv;
import p153l.obc0;
import p153l.qa00;
import p153l.qcj;
import p153l.rwn0;
import p153l.umn0;
import p153l.uoo0;
import p153l.xau;
import p153l.yau;

/* JADX INFO: loaded from: classes10.dex */
public class VoiceRoomInfoView extends FrameLayout implements iam<umn0> {

    /* JADX INFO: renamed from: a */
    public LinearLayout f54238a;

    /* JADX INFO: renamed from: b */
    public TextView f54239b;

    /* JADX INFO: renamed from: c */
    public FocusTextView f54240c;

    /* JADX INFO: renamed from: d */
    public ImageView f54241d;

    /* JADX INFO: renamed from: e */
    public VText f54242e;

    /* JADX INFO: renamed from: f */
    public FrameLayout f54243f;

    /* JADX INFO: renamed from: g */
    public LinearLayout f54244g;

    /* JADX INFO: renamed from: h */
    public FocusTextView f54245h;

    /* JADX INFO: renamed from: i */
    public TextView f54246i;

    /* JADX INFO: renamed from: j */
    public TextView f54247j;

    /* JADX INFO: renamed from: k */
    public CommonMaskAvatarView f54248k;

    /* JADX INFO: renamed from: l */
    public umn0 f54249l;

    /* JADX INFO: renamed from: m */
    public String f54250m;

    /* JADX INFO: renamed from: n */
    public String f54251n;

    public VoiceRoomInfoView(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public /* synthetic */ void m79610q(View view) {
        this.f54249l.m196786o4();
    }

    /* JADX INFO: renamed from: r */
    private void m79611r() {
        bnl0.m105509E0(this.f54238a, new View.OnClickListener() { // from class: l.ooo0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f148388a.m79610q(view);
            }
        });
        bnl0.m105509E0(this.f54239b, new View.OnClickListener() { // from class: l.poo0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f153420a.m79612s(view);
            }
        });
        this.f54242e.setOnClickListener(new View.OnClickListener() { // from class: l.qoo0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f158744a.m79613u(view);
            }
        });
        bnl0.m105509E0(this.f54247j, new View.OnClickListener() { // from class: l.roo0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f164221a.m79614v(view);
            }
        });
        bnl0.m105509E0(this.f54248k, new View.OnClickListener() { // from class: l.soo0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f169914a.m79615w(view);
            }
        });
        m79632z(0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public /* synthetic */ void m79612s(View view) {
        this.f54249l.m196789r4(this.f54250m);
    }

    private void setTitle(String str) {
        this.f54240c.setText(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public /* synthetic */ void m79613u(View view) {
        this.f54249l.m196772Z3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public /* synthetic */ void m79614v(View view) {
        this.f54249l.m196772Z3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public /* synthetic */ void m79615w(View view) {
        this.f54249l.m196787p4();
    }

    /* JADX INFO: renamed from: A */
    public void m79616A(BLiveVoiceRoom bLiveVoiceRoom) {
        this.f54245h.setText(bLiveVoiceRoom.title);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: B */
    public void m79617B(BLiveVoice bLiveVoice) {
        if (bLiveVoice.tags.size() <= 0 || TextUtils.isEmpty(bLiveVoice.tags.get(0).text) || !"highQuality".equals(bLiveVoice.tags.get(0).type)) {
            bnl0.m105524M(this.f54239b, false);
            return;
        }
        BLiveCommonViewConfig bLiveCommonViewConfig = bLiveVoice.tags.get(0);
        this.f54250m = bLiveCommonViewConfig.schema;
        if ("on".equals(bLiveCommonViewConfig.state)) {
            this.f54239b.setBackgroundResource(obc0.f146207U7);
            this.f54239b.setTextColor(j26.m143190c(getContext(), n9c0.f140786O0));
            bnl0.m105524M(this.f54239b, true);
        } else if (BLiveOperationTitleShowType.off.equals(bLiveCommonViewConfig.state) && ((rwn0) this.f54249l.m213810E2()).mo118373p()) {
            this.f54239b.setBackgroundResource(obc0.f146196T7);
            this.f54239b.setTextColor(j26.m143190c(getContext(), n9c0.f140802W0));
            bnl0.m105524M(this.f54239b, true);
        } else {
            bnl0.m105524M(this.f54239b, false);
        }
        this.f54239b.setText(bLiveCommonViewConfig.text);
    }

    /* JADX INFO: renamed from: C */
    public void m79618C(BLiveVoiceRoom bLiveVoiceRoom) {
        setTitle(bLiveVoiceRoom.title);
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    /* JADX INFO: renamed from: E */
    public void m79619E(boolean z) {
        bnl0.m105524M(this, z);
        if (z) {
            return;
        }
        bnl0.m105524M(this.f54238a, false);
        bnl0.m105524M(this.f54243f, false);
    }

    /* JADX INFO: renamed from: F */
    public final void m79620F(LongLinkLiveMessage.VoiceLiveHighQualityTagMessage voiceLiveHighQualityTagMessage) {
        VText vText = new VText(this.f54249l.act());
        int i = bnl0.f77545f;
        vText.setLayoutParams(new FrameLayout.LayoutParams(i, i));
        vText.setText(voiceLiveHighQualityTagMessage.getText());
        vText.setPadding(qa00.m175859d(14.0f), qa00.m175859d(10.0f), qa00.m175859d(14.0f), qa00.m175859d(10.0f));
        vText.setTextColor(Color.parseColor("#ffffff"));
        this.f54251n = C4499d.m21895l().m21907t(new C4496a(this.f54249l.act()).m21876s(vText).m21863e(true).m21849E(true).m21878u(qa00.m175859d(12.0f)).m21869k(Color.parseColor("#fe7e1d")).m21854J(13.0f).m21874q(C4496a.f16399N | C4496a.f16400O).m21860b(Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS).m21872o(C4496a.f16400O, qa00.m175859d(5.0f)), this.f54239b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: G */
    public void m79621G(LongLinkLiveMessage.VoiceLiveHighQualityTagMessage voiceLiveHighQualityTagMessage) {
        if (voiceLiveHighQualityTagMessage.getAction().equals(LongLinkLiveMessage.VoiceLiveHighQualityTagMessage.HighQualityTagAction.tagStateChange)) {
            m79622H(voiceLiveHighQualityTagMessage.getShowTag(), voiceLiveHighQualityTagMessage.getState(), voiceLiveHighQualityTagMessage.getText());
        } else if (voiceLiveHighQualityTagMessage.getAction().equals(LongLinkLiveMessage.VoiceLiveHighQualityTagMessage.HighQualityTagAction.guideTag) && ((rwn0) this.f54249l.m213810E2()).mo118373p()) {
            m79620F(voiceLiveHighQualityTagMessage);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: H */
    public final void m79622H(boolean z, LongLinkLiveMessage.VoiceLiveHighQualityTagMessage.HighQualityTagState highQualityTagState, String str) {
        if (z && highQualityTagState.equals(LongLinkLiveMessage.VoiceLiveHighQualityTagMessage.HighQualityTagState.on)) {
            this.f54239b.setBackgroundResource(obc0.f146207U7);
            this.f54239b.setTextColor(j26.m143190c(getContext(), n9c0.f140786O0));
            bnl0.m105524M(this.f54239b, true);
        } else if (z && highQualityTagState.equals(LongLinkLiveMessage.VoiceLiveHighQualityTagMessage.HighQualityTagState.off) && ((rwn0) this.f54249l.m213810E2()).mo118373p()) {
            this.f54239b.setBackgroundResource(obc0.f146196T7);
            this.f54239b.setTextColor(j26.m143190c(getContext(), n9c0.f140802W0));
            bnl0.m105524M(this.f54239b, true);
        } else {
            bnl0.m105524M(this.f54239b, false);
        }
        this.f54239b.setText(str);
    }

    @Override // p153l.iam
    public void destroy() {
        m79619E(false);
        this.f54240c.setText("");
        m79629p();
    }

    /* JADX INFO: renamed from: i */
    public final void m79623i(View view) {
        uoo0.m197002a(this, view);
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(umn0 umn0Var) {
        this.f54249l = umn0Var;
    }

    /* JADX INFO: renamed from: k */
    public void m79625k(LongLinkLiveMessage.VoiceRoomTopicUpdate voiceRoomTopicUpdate) {
        setTitle(voiceRoomTopicUpdate.getTitle());
    }

    /* JADX INFO: renamed from: l */
    public void m79626l(boolean z) {
        bnl0.m105524M(this.f54241d, z);
    }

    /* JADX INFO: renamed from: m */
    public void m79627m(boolean z) {
        bnl0.m105524M(this.f54242e, z);
        if (z) {
            this.f54249l.m196790s4(false);
        }
    }

    /* JADX INFO: renamed from: n */
    public void m79628n(boolean z, boolean z2) {
        if (z) {
            this.f54247j.setText(xau.m209910t(R$string.f47853Uh));
            bnl0.m105524M(this.f54247j, true);
        } else {
            TextView textView = this.f54247j;
            if (z2) {
                textView.setText(xau.m209910t(R$string.f47475D4));
                bnl0.m105524M(this.f54247j, true);
            } else {
                bnl0.m105524M(textView, false);
            }
        }
        if (z) {
            this.f54249l.m196790s4(false);
        } else if (z2) {
            this.f54249l.m196790s4(false);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m79623i(this);
        m79611r();
    }

    /* JADX INFO: renamed from: p */
    public void m79629p() {
        if (NullChecker.m82486a(this.f54251n)) {
            C4499d.m21895l().m21899k(this.f54251n);
            this.f54251n = null;
        }
    }

    /* JADX INFO: renamed from: x */
    public void m79630x(boolean z) {
        if (z) {
            bnl0.m105524M(this.f54238a, true);
            bnl0.m105524M(this.f54243f, false);
        } else {
            bnl0.m105524M(this.f54243f, true);
            bnl0.m105524M(this.f54238a, false);
        }
    }

    /* JADX INFO: renamed from: y */
    public void m79631y(nsv<h64> nsvVar) {
        if (nsvVar != null) {
            biv.m104518c(this.f54248k, qa00.m175859d(52.0f), nsvVar, new qcj() { // from class: l.too0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((h64) obj).f107999c;
                }
            }, 1);
        }
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: z */
    public void m79632z(long j) {
        this.f54246i.setText(yau.m214935c(j) + xau.m209910t(R$string.f47456C7));
    }

    public VoiceRoomInfoView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceRoomInfoView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
