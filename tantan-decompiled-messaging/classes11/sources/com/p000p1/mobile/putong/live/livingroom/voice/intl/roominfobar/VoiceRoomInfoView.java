package com.p000p1.mobile.putong.live.livingroom.voice.intl.roominfobar;

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
import com.p1.mobile.android.ui.bubble.a;
import com.p1.mobile.android.ui.bubble.d;
import com.p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import com.p1.mobile.putong.live.base.data.BLiveAbsRoom;
import com.p1.mobile.putong.live.base.data.BLiveCommonViewConfig;
import com.p1.mobile.putong.live.base.data.BLiveVoice;
import com.p1.mobile.putong.live.base.data.BLiveVoiceRoom;
import com.p1.mobile.putong.live.livingroom.R;
import com.p1.mobile.putong.live.livingroom.common.avatar.CommonMaskAvatarView;
import com.p1.mobile.putong.live.livingroom.view.FocusTextView;
import com.tantanapp.common.utils.NullChecker;
import l.agv;
import l.e16;
import l.h1c0;
import l.i3c0;
import l.i54;
import l.mqv;
import l.qfo0;
import l.s7m;
import l.t100;
import l.w8u;
import l.w9j;
import l.xdl0;
import p009l.qdn0;
import p009l.x8u;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class VoiceRoomInfoView extends FrameLayout implements s7m<qdn0> {

    /* JADX INFO: renamed from: a */
    public LinearLayout f6996a;

    /* JADX INFO: renamed from: b */
    public TextView f6997b;

    /* JADX INFO: renamed from: c */
    public FocusTextView f6998c;

    /* JADX INFO: renamed from: d */
    public ImageView f6999d;

    /* JADX INFO: renamed from: e */
    public VText f7000e;

    /* JADX INFO: renamed from: f */
    public FrameLayout f7001f;

    /* JADX INFO: renamed from: g */
    public LinearLayout f7002g;

    /* JADX INFO: renamed from: h */
    public FocusTextView f7003h;

    /* JADX INFO: renamed from: i */
    public TextView f7004i;

    /* JADX INFO: renamed from: j */
    public TextView f7005j;

    /* JADX INFO: renamed from: k */
    public CommonMaskAvatarView f7006k;

    /* JADX INFO: renamed from: l */
    public qdn0 f7007l;

    /* JADX INFO: renamed from: m */
    public String f7008m;

    /* JADX INFO: renamed from: n */
    public String f7009n;

    public VoiceRoomInfoView(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public /* synthetic */ void m8630q(View view) {
        this.f7007l.m20891o4();
    }

    /* JADX INFO: renamed from: r */
    private void m8631r() {
        xdl0.E0(this.f6996a, new View.OnClickListener() { // from class: l.kfo0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f15652a.m8630q(view);
            }
        });
        xdl0.E0(this.f6997b, new View.OnClickListener() { // from class: l.lfo0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f16150a.m8632s(view);
            }
        });
        this.f7000e.setOnClickListener(new View.OnClickListener() { // from class: l.mfo0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f16878a.m8633u(view);
            }
        });
        xdl0.E0(this.f7005j, new View.OnClickListener() { // from class: l.nfo0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f17443a.m8634v(view);
            }
        });
        xdl0.E0(this.f7006k, new View.OnClickListener() { // from class: l.ofo0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f18001a.m8635w(view);
            }
        });
        m8654z(0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public /* synthetic */ void m8632s(View view) {
        this.f7007l.m20894r4(this.f7008m);
    }

    private void setTitle(String str) {
        this.f6998c.setText(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public /* synthetic */ void m8633u(View view) {
        this.f7007l.m20877Z3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public /* synthetic */ void m8634v(View view) {
        this.f7007l.m20877Z3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public /* synthetic */ void m8635w(View view) {
        this.f7007l.m20892p4();
    }

    /* JADX INFO: renamed from: A */
    public void m8636A(BLiveVoiceRoom bLiveVoiceRoom) {
        this.f7003h.setText(((BLiveAbsRoom) bLiveVoiceRoom).title);
    }

    /* JADX INFO: renamed from: B */
    public void m8637B(BLiveVoice bLiveVoice) {
        if (bLiveVoice.tags.size() <= 0 || TextUtils.isEmpty(((BLiveCommonViewConfig) bLiveVoice.tags.get(0)).text) || !"highQuality".equals(((BLiveCommonViewConfig) bLiveVoice.tags.get(0)).type)) {
            xdl0.M(this.f6997b, false);
            return;
        }
        BLiveCommonViewConfig bLiveCommonViewConfig = (BLiveCommonViewConfig) bLiveVoice.tags.get(0);
        this.f7008m = bLiveCommonViewConfig.schema;
        if ("on".equals(bLiveCommonViewConfig.state)) {
            this.f6997b.setBackgroundResource(i3c0.U7);
            this.f6997b.setTextColor(e16.c(getContext(), h1c0.O0));
            xdl0.M(this.f6997b, true);
        } else if ("off".equals(bLiveCommonViewConfig.state) && this.f7007l.E2().p()) {
            this.f6997b.setBackgroundResource(i3c0.T7);
            this.f6997b.setTextColor(e16.c(getContext(), h1c0.W0));
            xdl0.M(this.f6997b, true);
        } else {
            xdl0.M(this.f6997b, false);
        }
        this.f6997b.setText(bLiveCommonViewConfig.text);
    }

    /* JADX INFO: renamed from: C */
    public void m8638C(BLiveVoiceRoom bLiveVoiceRoom) {
        setTitle(((BLiveAbsRoom) bLiveVoiceRoom).title);
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m8639C0() {
        return null;
    }

    /* JADX INFO: renamed from: E */
    public void m8640E(boolean z) {
        xdl0.M(this, z);
        if (z) {
            return;
        }
        xdl0.M(this.f6996a, false);
        xdl0.M(this.f7001f, false);
    }

    /* JADX INFO: renamed from: F */
    public final void m8641F(LongLinkLiveMessage.VoiceLiveHighQualityTagMessage voiceLiveHighQualityTagMessage) {
        VText vText = new VText(this.f7007l.act());
        int i = xdl0.f;
        vText.setLayoutParams(new FrameLayout.LayoutParams(i, i));
        vText.setText(voiceLiveHighQualityTagMessage.getText());
        vText.setPadding(t100.d(14.0f), t100.d(10.0f), t100.d(14.0f), t100.d(10.0f));
        vText.setTextColor(Color.parseColor("#ffffff"));
        this.f7009n = d.l().t(new a(this.f7007l.act()).s(vText).e(true).E(true).u(t100.d(12.0f)).k(new int[]{Color.parseColor("#fe7e1d")}).J(13.0f).q(a.N | a.O).b(5000L).o(a.O, t100.d(5.0f)), this.f6997b);
    }

    /* JADX INFO: renamed from: G */
    public void m8642G(LongLinkLiveMessage.VoiceLiveHighQualityTagMessage voiceLiveHighQualityTagMessage) {
        if (voiceLiveHighQualityTagMessage.getAction().equals(LongLinkLiveMessage.VoiceLiveHighQualityTagMessage.HighQualityTagAction.tagStateChange)) {
            m8643H(voiceLiveHighQualityTagMessage.getShowTag(), voiceLiveHighQualityTagMessage.getState(), voiceLiveHighQualityTagMessage.getText());
        } else if (voiceLiveHighQualityTagMessage.getAction().equals(LongLinkLiveMessage.VoiceLiveHighQualityTagMessage.HighQualityTagAction.guideTag) && this.f7007l.E2().p()) {
            m8641F(voiceLiveHighQualityTagMessage);
        }
    }

    /* JADX INFO: renamed from: H */
    public final void m8643H(boolean z, LongLinkLiveMessage.VoiceLiveHighQualityTagMessage.HighQualityTagState highQualityTagState, String str) {
        if (z && highQualityTagState.equals(LongLinkLiveMessage.VoiceLiveHighQualityTagMessage.HighQualityTagState.on)) {
            this.f6997b.setBackgroundResource(i3c0.U7);
            this.f6997b.setTextColor(e16.c(getContext(), h1c0.O0));
            xdl0.M(this.f6997b, true);
        } else if (z && highQualityTagState.equals(LongLinkLiveMessage.VoiceLiveHighQualityTagMessage.HighQualityTagState.off) && this.f7007l.E2().p()) {
            this.f6997b.setBackgroundResource(i3c0.T7);
            this.f6997b.setTextColor(e16.c(getContext(), h1c0.W0));
            xdl0.M(this.f6997b, true);
        } else {
            xdl0.M(this.f6997b, false);
        }
        this.f6997b.setText(str);
    }

    public void destroy() {
        m8640E(false);
        this.f6998c.setText("");
        m8651p();
    }

    /* JADX INFO: renamed from: i */
    public final void m8644i(View view) {
        qfo0.a(this, view);
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void m8645i1(qdn0 qdn0Var) {
        this.f7007l = qdn0Var;
    }

    /* JADX INFO: renamed from: k */
    public void m8647k(LongLinkLiveMessage.VoiceRoomTopicUpdate voiceRoomTopicUpdate) {
        setTitle(voiceRoomTopicUpdate.getTitle());
    }

    /* JADX INFO: renamed from: l */
    public void m8648l(boolean z) {
        xdl0.M(this.f6999d, z);
    }

    /* JADX INFO: renamed from: m */
    public void m8649m(boolean z) {
        xdl0.M(this.f7000e, z);
        if (z) {
            this.f7007l.m20895s4(false);
        }
    }

    /* JADX INFO: renamed from: n */
    public void m8650n(boolean z, boolean z2) {
        if (z) {
            this.f7005j.setText(w8u.t(R.string.Uh));
            xdl0.M(this.f7005j, true);
        } else {
            TextView textView = this.f7005j;
            if (z2) {
                textView.setText(w8u.t(R.string.D4));
                xdl0.M(this.f7005j, true);
            } else {
                xdl0.M(textView, false);
            }
        }
        if (z) {
            this.f7007l.m20895s4(false);
        } else if (z2) {
            this.f7007l.m20895s4(false);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m8644i(this);
        m8631r();
    }

    /* JADX INFO: renamed from: p */
    public void m8651p() {
        if (NullChecker.a(this.f7009n)) {
            d.l().k(this.f7009n);
            this.f7009n = null;
        }
    }

    /* JADX INFO: renamed from: x */
    public void m8652x(boolean z) {
        if (z) {
            xdl0.M(this.f6996a, true);
            xdl0.M(this.f7001f, false);
        } else {
            xdl0.M(this.f7001f, true);
            xdl0.M(this.f6996a, false);
        }
    }

    /* JADX INFO: renamed from: y */
    public void m8653y(mqv<i54> mqvVar) {
        if (mqvVar != null) {
            agv.c(this.f7006k, t100.d(52.0f), mqvVar, new w9j() { // from class: l.pfo0
                public final Object call(Object obj) {
                    return ((i54) obj).c;
                }
            }, 1);
        }
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: z */
    public void m8654z(long j) {
        this.f7004i.setText(x8u.m24745c(j) + w8u.t(R.string.C7));
    }

    public VoiceRoomInfoView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceRoomInfoView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
