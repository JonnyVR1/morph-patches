package com.p046p1.mobile.putong.live.livingroom.voice.intl.roominfobar;

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
import com.p046p1.mobile.android.p048ui.bubble.C4345a;
import com.p046p1.mobile.android.p048ui.bubble.C4348d;
import com.p046p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import com.p046p1.mobile.putong.live.base.data.BLiveCommonViewConfig;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.p046p1.mobile.putong.live.base.data.BLiveVoice;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceRoom;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.common.avatar.CommonMaskAvatarView;
import com.p046p1.mobile.putong.live.livingroom.view.FocusTextView;
import com.tantanapp.common.utils.NullChecker;
import p147v.VText;
import p149l.agv;
import p149l.e16;
import p149l.h1c0;
import p149l.i3c0;
import p149l.i54;
import p149l.mqv;
import p149l.nnn0;
import p149l.qdn0;
import p149l.qfo0;
import p149l.s7m;
import p149l.t100;
import p149l.w8u;
import p149l.w9j;
import p149l.x8u;
import p149l.xdl0;

/* JADX INFO: loaded from: classes11.dex */
public class VoiceRoomInfoView extends FrameLayout implements s7m<qdn0> {

    /* JADX INFO: renamed from: a */
    public LinearLayout f53390a;

    /* JADX INFO: renamed from: b */
    public TextView f53391b;

    /* JADX INFO: renamed from: c */
    public FocusTextView f53392c;

    /* JADX INFO: renamed from: d */
    public ImageView f53393d;

    /* JADX INFO: renamed from: e */
    public VText f53394e;

    /* JADX INFO: renamed from: f */
    public FrameLayout f53395f;

    /* JADX INFO: renamed from: g */
    public LinearLayout f53396g;

    /* JADX INFO: renamed from: h */
    public FocusTextView f53397h;

    /* JADX INFO: renamed from: i */
    public TextView f53398i;

    /* JADX INFO: renamed from: j */
    public TextView f53399j;

    /* JADX INFO: renamed from: k */
    public CommonMaskAvatarView f53400k;

    /* JADX INFO: renamed from: l */
    public qdn0 f53401l;

    /* JADX INFO: renamed from: m */
    public String f53402m;

    /* JADX INFO: renamed from: n */
    public String f53403n;

    public VoiceRoomInfoView(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public /* synthetic */ void m78427q(View view) {
        this.f53401l.m174078o4();
    }

    /* JADX INFO: renamed from: r */
    private void m78428r() {
        xdl0.m208329E0(this.f53390a, new View.OnClickListener() { // from class: l.kfo0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f122955a.m78427q(view);
            }
        });
        xdl0.m208329E0(this.f53391b, new View.OnClickListener() { // from class: l.lfo0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f127915a.m78429s(view);
            }
        });
        this.f53394e.setOnClickListener(new View.OnClickListener() { // from class: l.mfo0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f133606a.m78430u(view);
            }
        });
        xdl0.m208329E0(this.f53399j, new View.OnClickListener() { // from class: l.nfo0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f138810a.m78431v(view);
            }
        });
        xdl0.m208329E0(this.f53400k, new View.OnClickListener() { // from class: l.ofo0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f143728a.m78432w(view);
            }
        });
        m78449z(0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public /* synthetic */ void m78429s(View view) {
        this.f53401l.m174081r4(this.f53402m);
    }

    private void setTitle(String str) {
        this.f53392c.setText(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public /* synthetic */ void m78430u(View view) {
        this.f53401l.m174064Z3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public /* synthetic */ void m78431v(View view) {
        this.f53401l.m174064Z3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public /* synthetic */ void m78432w(View view) {
        this.f53401l.m174079p4();
    }

    /* JADX INFO: renamed from: A */
    public void m78433A(BLiveVoiceRoom bLiveVoiceRoom) {
        this.f53397h.setText(bLiveVoiceRoom.title);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: B */
    public void m78434B(BLiveVoice bLiveVoice) {
        if (bLiveVoice.tags.size() <= 0 || TextUtils.isEmpty(bLiveVoice.tags.get(0).text) || !"highQuality".equals(bLiveVoice.tags.get(0).type)) {
            xdl0.m208344M(this.f53391b, false);
            return;
        }
        BLiveCommonViewConfig bLiveCommonViewConfig = bLiveVoice.tags.get(0);
        this.f53402m = bLiveCommonViewConfig.schema;
        if ("on".equals(bLiveCommonViewConfig.state)) {
            this.f53391b.setBackgroundResource(i3c0.f110879U7);
            this.f53391b.setTextColor(e16.m114375c(getContext(), h1c0.f105325O0));
            xdl0.m208344M(this.f53391b, true);
        } else if (BLiveOperationTitleShowType.off.equals(bLiveCommonViewConfig.state) && ((nnn0) this.f53401l.m206027E2()).mo97490p()) {
            this.f53391b.setBackgroundResource(i3c0.f110868T7);
            this.f53391b.setTextColor(e16.m114375c(getContext(), h1c0.f105341W0));
            xdl0.m208344M(this.f53391b, true);
        } else {
            xdl0.m208344M(this.f53391b, false);
        }
        this.f53391b.setText(bLiveCommonViewConfig.text);
    }

    /* JADX INFO: renamed from: C */
    public void m78435C(BLiveVoiceRoom bLiveVoiceRoom) {
        setTitle(bLiveVoiceRoom.title);
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    /* JADX INFO: renamed from: E */
    public void m78436E(boolean z) {
        xdl0.m208344M(this, z);
        if (z) {
            return;
        }
        xdl0.m208344M(this.f53390a, false);
        xdl0.m208344M(this.f53395f, false);
    }

    /* JADX INFO: renamed from: F */
    public final void m78437F(LongLinkLiveMessage.VoiceLiveHighQualityTagMessage voiceLiveHighQualityTagMessage) {
        VText vText = new VText(this.f53401l.act());
        int i = xdl0.f192404f;
        vText.setLayoutParams(new FrameLayout.LayoutParams(i, i));
        vText.setText(voiceLiveHighQualityTagMessage.getText());
        vText.setPadding(t100.m186890d(14.0f), t100.m186890d(10.0f), t100.m186890d(14.0f), t100.m186890d(10.0f));
        vText.setTextColor(Color.parseColor("#ffffff"));
        this.f53403n = C4348d.m20896l().m20908t(new C4345a(this.f53401l.act()).m20877s(vText).m20864e(true).m20850E(true).m20879u(t100.m186890d(12.0f)).m20870k(Color.parseColor("#fe7e1d")).m20855J(13.0f).m20875q(C4345a.f15680N | C4345a.f15681O).m20861b(Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS).m20873o(C4345a.f15681O, t100.m186890d(5.0f)), this.f53391b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: G */
    public void m78438G(LongLinkLiveMessage.VoiceLiveHighQualityTagMessage voiceLiveHighQualityTagMessage) {
        if (voiceLiveHighQualityTagMessage.getAction().equals(LongLinkLiveMessage.VoiceLiveHighQualityTagMessage.HighQualityTagAction.tagStateChange)) {
            m78439H(voiceLiveHighQualityTagMessage.getShowTag(), voiceLiveHighQualityTagMessage.getState(), voiceLiveHighQualityTagMessage.getText());
        } else if (voiceLiveHighQualityTagMessage.getAction().equals(LongLinkLiveMessage.VoiceLiveHighQualityTagMessage.HighQualityTagAction.guideTag) && ((nnn0) this.f53401l.m206027E2()).mo97490p()) {
            m78437F(voiceLiveHighQualityTagMessage);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: H */
    public final void m78439H(boolean z, LongLinkLiveMessage.VoiceLiveHighQualityTagMessage.HighQualityTagState highQualityTagState, String str) {
        if (z && highQualityTagState.equals(LongLinkLiveMessage.VoiceLiveHighQualityTagMessage.HighQualityTagState.on)) {
            this.f53391b.setBackgroundResource(i3c0.f110879U7);
            this.f53391b.setTextColor(e16.m114375c(getContext(), h1c0.f105325O0));
            xdl0.m208344M(this.f53391b, true);
        } else if (z && highQualityTagState.equals(LongLinkLiveMessage.VoiceLiveHighQualityTagMessage.HighQualityTagState.off) && ((nnn0) this.f53401l.m206027E2()).mo97490p()) {
            this.f53391b.setBackgroundResource(i3c0.f110868T7);
            this.f53391b.setTextColor(e16.m114375c(getContext(), h1c0.f105341W0));
            xdl0.m208344M(this.f53391b, true);
        } else {
            xdl0.m208344M(this.f53391b, false);
        }
        this.f53391b.setText(str);
    }

    @Override // p149l.s7m
    public void destroy() {
        m78436E(false);
        this.f53392c.setText("");
        m78446p();
    }

    /* JADX INFO: renamed from: i */
    public final void m78440i(View view) {
        qfo0.m174366a(this, view);
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(qdn0 qdn0Var) {
        this.f53401l = qdn0Var;
    }

    /* JADX INFO: renamed from: k */
    public void m78442k(LongLinkLiveMessage.VoiceRoomTopicUpdate voiceRoomTopicUpdate) {
        setTitle(voiceRoomTopicUpdate.getTitle());
    }

    /* JADX INFO: renamed from: l */
    public void m78443l(boolean z) {
        xdl0.m208344M(this.f53393d, z);
    }

    /* JADX INFO: renamed from: m */
    public void m78444m(boolean z) {
        xdl0.m208344M(this.f53394e, z);
        if (z) {
            this.f53401l.m174082s4(false);
        }
    }

    /* JADX INFO: renamed from: n */
    public void m78445n(boolean z, boolean z2) {
        if (z) {
            this.f53399j.setText(w8u.m202217t(R$string.f47005Uh));
            xdl0.m208344M(this.f53399j, true);
        } else {
            TextView textView = this.f53399j;
            if (z2) {
                textView.setText(w8u.m202217t(R$string.f46627D4));
                xdl0.m208344M(this.f53399j, true);
            } else {
                xdl0.m208344M(textView, false);
            }
        }
        if (z) {
            this.f53401l.m174082s4(false);
        } else if (z2) {
            this.f53401l.m174082s4(false);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m78440i(this);
        m78428r();
    }

    /* JADX INFO: renamed from: p */
    public void m78446p() {
        if (NullChecker.m81303a(this.f53403n)) {
            C4348d.m20896l().m20900k(this.f53403n);
            this.f53403n = null;
        }
    }

    /* JADX INFO: renamed from: x */
    public void m78447x(boolean z) {
        if (z) {
            xdl0.m208344M(this.f53390a, true);
            xdl0.m208344M(this.f53395f, false);
        } else {
            xdl0.m208344M(this.f53395f, true);
            xdl0.m208344M(this.f53390a, false);
        }
    }

    /* JADX INFO: renamed from: y */
    public void m78448y(mqv<i54> mqvVar) {
        if (mqvVar != null) {
            agv.m96345c(this.f53400k, t100.m186890d(52.0f), mqvVar, new w9j() { // from class: l.pfo0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((i54) obj).f111522c;
                }
            }, 1);
        }
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: z */
    public void m78449z(long j) {
        this.f53398i.setText(x8u.m207433c(j) + w8u.m202217t(R$string.f46608C7));
    }

    public VoiceRoomInfoView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceRoomInfoView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
