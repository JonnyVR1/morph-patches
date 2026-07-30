package com.p051p1.mobile.putong.live.livingroom.virtual.loveplanet.view;

import android.animation.Animator;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.p053ui.bubble.C4496a;
import com.p051p1.mobile.android.p053ui.bubble.C4499d;
import com.p051p1.mobile.putong.live.base.data.BLiveAvatarFrameConfig;
import com.p051p1.mobile.putong.live.base.data.BLiveCallEffectConfig;
import com.p051p1.mobile.putong.live.base.data.BLiveLovePlanet;
import com.p051p1.mobile.putong.live.base.data.BLiveLovePlanetPlayerInfo;
import com.p051p1.mobile.putong.live.base.data.BLiveMaskAvatarConfig;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceTagBubble;
import com.p051p1.mobile.putong.live.base.data.LovePlanetStage;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p051p1.mobile.putong.live.livingroom.common.avatar.CommonMaskAvatarView;
import com.p051p1.mobile.putong.live.livingroom.view.FocusTextView;
import com.p051p1.mobile.putong.live.livingroom.view.SayHiBubbleView;
import com.p051p1.mobile.putong.live.livingroom.virtual.loveplanet.travel.VoiceVirtualLoveItemInfoView;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import p151v.VLinear;
import p153l.biv;
import p153l.bnl0;
import p153l.d55;
import p153l.gt0;
import p153l.guk0;
import p153l.hfw;
import p153l.iam;
import p153l.ifw;
import p153l.it0;
import p153l.n3d0;
import p153l.n9c0;
import p153l.ndp0;
import p153l.obc0;
import p153l.ofp0;
import p153l.qa00;
import p153l.qnp0;
import p153l.rwn0;
import p153l.w2m;
import p153l.x20;
import p153l.yau;
import p153l.yec0;

/* JADX INFO: loaded from: classes5.dex */
public class VoiceVirtualLovePlanetWidgetView extends ConstraintLayout implements iam<ndp0> {

    /* JADX INFO: renamed from: A */
    public d55 f53428A;

    /* JADX INFO: renamed from: B */
    public String f53429B;

    /* JADX INFO: renamed from: C */
    public w2m f53430C;

    /* JADX INFO: renamed from: D */
    public HashMap<String, w2m> f53431D;

    /* JADX INFO: renamed from: d */
    public AnimEffectPlayer f53432d;

    /* JADX INFO: renamed from: e */
    public Guideline f53433e;

    /* JADX INFO: renamed from: f */
    public AnimEffectPlayer f53434f;

    /* JADX INFO: renamed from: g */
    public CommonMaskAvatarView f53435g;

    /* JADX INFO: renamed from: h */
    public VLinear f53436h;

    /* JADX INFO: renamed from: i */
    public ImageView f53437i;

    /* JADX INFO: renamed from: j */
    public TextView f53438j;

    /* JADX INFO: renamed from: k */
    public TextView f53439k;

    /* JADX INFO: renamed from: l */
    public TextView f53440l;

    /* JADX INFO: renamed from: m */
    public TextView f53441m;

    /* JADX INFO: renamed from: n */
    public TextView f53442n;

    /* JADX INFO: renamed from: o */
    public TextView f53443o;

    /* JADX INFO: renamed from: p */
    public CommonMaskAvatarView f53444p;

    /* JADX INFO: renamed from: q */
    public VLinear f53445q;

    /* JADX INFO: renamed from: r */
    public ImageView f53446r;

    /* JADX INFO: renamed from: s */
    public FocusTextView f53447s;

    /* JADX INFO: renamed from: t */
    public View f53448t;

    /* JADX INFO: renamed from: u */
    public TextView f53449u;

    /* JADX INFO: renamed from: v */
    public ImageView f53450v;

    /* JADX INFO: renamed from: w */
    public FrameLayout f53451w;

    /* JADX INFO: renamed from: x */
    public Animator f53452x;

    /* JADX INFO: renamed from: y */
    public ndp0 f53453y;

    /* JADX INFO: renamed from: z */
    public TextView[] f53454z;

    public VoiceVirtualLovePlanetWidgetView(Context context) {
        super(context);
        this.f53431D = new HashMap<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p0 */
    public /* synthetic */ void m78380p0(View view) {
        ndp0 ndp0Var = this.f53453y;
        if (ndp0Var != null) {
            ndp0Var.m162779v4();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q0 */
    public /* synthetic */ void m78381q0(View view) {
        ndp0 ndp0Var = this.f53453y;
        if (ndp0Var != null) {
            ndp0Var.m162780w4();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r0 */
    public /* synthetic */ void m78382r0(View view) {
        this.f53453y.m162777t4();
    }

    /* JADX INFO: renamed from: B0 */
    public void m78383B0(int i) {
        ImageView imageView = this.f53450v;
        if (i < 0) {
            bnl0.m105524M(imageView, false);
            return;
        }
        bnl0.m105524M(imageView, true);
        this.f53450v.setImageResource(i);
        this.f53450v.setOnClickListener(new View.OnClickListener() { // from class: l.lfp0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f131893a.m78393s0(view);
            }
        });
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    /* JADX INFO: renamed from: D0 */
    public void m78384D0(String str) {
        int i;
        int i2 = 0;
        if ("introduction".equals(str)) {
            i = 1;
        } else if (LovePlanetStage.choice.equals(str)) {
            i = 2;
        } else if (LovePlanetStage.result.equals(str)) {
            i = 3;
        } else {
            i = "trip".equals(str) ? 4 : 0;
        }
        while (true) {
            TextView[] textViewArr = this.f53454z;
            if (i2 >= textViewArr.length) {
                return;
            }
            if (i2 < i) {
                textViewArr[i2].setTextColor(n3d0.m161277a(n9c0.f140823e1));
                this.f53454z[i2].setBackgroundResource(obc0.f146025F);
            } else {
                textViewArr[i2].setTextColor(n3d0.m161277a(n9c0.f140847m1));
                this.f53454z[i2].setBackgroundResource(obc0.f146037G);
            }
            i2++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: E0 */
    public void m78385E0(BLiveLovePlanet bLiveLovePlanet) {
        w2m w2mVarM139750a = ifw.m139750a(getContext(), bLiveLovePlanet, this.f53431D);
        if (!NullChecker.m82486a(this.f53430C) || w2mVarM139750a.getViewId() != this.f53430C.getViewId()) {
            this.f53451w.removeAllViews();
            int i = bnl0.f77544e;
            this.f53451w.addView((View) w2mVarM139750a, new FrameLayout.LayoutParams(i, i));
            this.f53430C = w2mVarM139750a;
            w2mVarM139750a.mo22064i1(this.f53453y);
        }
        this.f53430C.mo78363c0(bLiveLovePlanet);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: G0 */
    public void m78386G0(BLiveVoiceTagBubble bLiveVoiceTagBubble) {
        SayHiBubbleView sayHiBubbleView = (SayHiBubbleView) LayoutInflater.from(getContext()).inflate(yec0.f199092ga, (ViewGroup) null);
        sayHiBubbleView.m77831f(bLiveVoiceTagBubble, ((rwn0) this.f53453y.m213810E2()).m202194o(), ((rwn0) this.f53453y.m213810E2()).m168526j0(), ((rwn0) this.f53453y.m213810E2()).m202191k(), new x20() { // from class: l.nfp0
            @Override // p153l.x20
            public final void call() {
                C4499d.m21895l().m21899k(SayHiBubbleView.getGreetViewTag());
            }
        });
        C4496a c4496a = new C4496a(getContext());
        c4496a.m21846B(qa00.f156316c).m21876s(sayHiBubbleView).m21873p(75).m21879v(qa00.f156322i).m21869k(n3d0.m161277a(n9c0.f140823e1)).m21874q(C4496a.f16399N).m21860b(Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS);
        C4499d.m21895l().m21908u(c4496a, this.f53435g, SayHiBubbleView.getGreetViewTag());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: H0 */
    public boolean m78387H0(BLiveVoiceTagBubble bLiveVoiceTagBubble) {
        String str = bLiveVoiceTagBubble.fromUserId;
        w2m w2mVar = this.f53430C;
        VoiceVirtualLoveItemInfoView voiceVirtualLoveItemInfoViewMo78365S = w2mVar != null ? w2mVar.mo78365S(str) : null;
        if (voiceVirtualLoveItemInfoViewMo78365S == null) {
            this.f53453y.m213811F2().VoiceVirtualLiveEvent.showSayHiBubble().mo199273j(str);
            return false;
        }
        SayHiBubbleView sayHiBubbleView = (SayHiBubbleView) LayoutInflater.from(getContext()).inflate(yec0.f199092ga, (ViewGroup) null);
        sayHiBubbleView.m77831f(bLiveVoiceTagBubble, ((rwn0) this.f53453y.m213810E2()).m202194o(), ((rwn0) this.f53453y.m213810E2()).m168526j0(), ((rwn0) this.f53453y.m213810E2()).m202191k(), new x20() { // from class: l.mfp0
            @Override // p153l.x20
            public final void call() {
                C4499d.m21895l().m21899k(SayHiBubbleView.getGreetViewTag());
            }
        });
        C4496a c4496a = new C4496a(getContext());
        c4496a.m21846B(qa00.f156316c).m21876s(sayHiBubbleView).m21873p(75).m21881x(-qa00.f156333t).m21869k(n3d0.m161277a(n9c0.f140823e1)).m21874q(C4496a.f16399N).m21860b(Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS);
        int i = voiceVirtualLoveItemInfoViewMo78365S.getBindPlayerInfo().position;
        if (i == 3) {
            c4496a.m21879v(qa00.f156322i);
        } else if (i == 4) {
            c4496a.m21880w(qa00.f156322i);
        }
        C4499d.m21895l().m21908u(c4496a, voiceVirtualLoveItemInfoViewMo78365S, SayHiBubbleView.getGreetViewTag());
        return true;
    }

    /* JADX INFO: renamed from: I0 */
    public final void m78388I0() {
        if (NullChecker.m82486a(this.f53434f)) {
            this.f53434f.stopAnimation(true);
        }
        this.f53435g.m73312t0();
    }

    /* JADX INFO: renamed from: J0 */
    public void m78389J0(BLiveVoiceCall bLiveVoiceCall, boolean z) {
        if (bLiveVoiceCall.mutedByAnchor || bLiveVoiceCall.mutedByUser || !bLiveVoiceCall.isSpeak || guk0.m132332k(bLiveVoiceCall)) {
            m78388I0();
            return;
        }
        m78395u0(bLiveVoiceCall);
        if (z) {
            this.f53435g.m73311s0();
        }
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(ndp0 ndp0Var) {
        this.f53453y = ndp0Var;
    }

    @Override // p153l.iam
    public void destroy() {
        it0.m142009C(this.f53452x);
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: n0 */
    public final void m78391n0(View view) {
        ofp0.m167472a(this, view);
    }

    /* JADX INFO: renamed from: o0 */
    public void m78392o0() {
        it0.m142009C(this.f53452x);
        setPivotX(bnl0.m105592y0() >> 1);
        Animator animatorM132178x = gt0.m132178x(250L, gt0.m132168n(this, View.ALPHA, 0.0f, 1.0f));
        this.f53452x = animatorM132178x;
        animatorM132178x.setInterpolator(gt0.f106346a);
        this.f53452x.start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m78388I0();
        C4499d.m21895l().m21899k("greeting");
        this.f53428A.m114258b();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m78391n0(this);
        this.f53454z = new TextView[]{this.f53440l, this.f53441m, this.f53442n, this.f53443o};
        bnl0.m105505C0(this.f53432d, qa00.m175859d(348.0f));
        qnp0.m177261d1(this.f53432d, qa00.f156322i);
        this.f53432d.mo69680g("https://fe-static.tancdn.com/v1/raw/72abc4b8-2889-4d9b-80f0-e50c0ee2a24812.svga", -1, null, true);
        bnl0.m105509E0(this.f53435g, new View.OnClickListener() { // from class: l.ifp0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f114683a.m78380p0(view);
            }
        });
        bnl0.m105509E0(this.f53444p, new View.OnClickListener() { // from class: l.jfp0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f120611a.m78381q0(view);
            }
        });
        bnl0.m105509E0(this.f53449u, new View.OnClickListener() { // from class: l.kfp0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f126489a.m78382r0(view);
            }
        });
        this.f53428A = new d55(this.f53435g.getCountDownProgressView());
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m78393s0(View view) {
        this.f53453y.m162782y4();
    }

    /* JADX INFO: renamed from: t0 */
    public void m78394t0() {
        it0.m142009C(this.f53452x);
        setPivotX(bnl0.m105592y0() >> 1);
        setPivotY(0.0f);
        Animator animatorM132178x = gt0.m132178x(250L, gt0.m132168n(this, View.ALPHA, 1.0f, 0.0f));
        this.f53452x = animatorM132178x;
        animatorM132178x.setInterpolator(gt0.f106346a);
        this.f53452x.start();
    }

    /* JADX INFO: renamed from: u0 */
    public final void m78395u0(BLiveVoiceCall bLiveVoiceCall) {
        BLiveCallEffectConfig bLiveCallEffectConfig = bLiveVoiceCall.callEffect;
        String str = bLiveCallEffectConfig == null ? "https://fe-static.tancdn.com/v1/raw/dca27774-97f5-4987-b63e-14793e7db35912.svga" : bLiveCallEffectConfig.circleVoicingUrl;
        if (this.f53434f.isAnimating() && TextUtils.equals(str, this.f53429B)) {
            return;
        }
        this.f53429B = str;
        this.f53434f.m69683j(str, -1);
    }

    /* JADX INFO: renamed from: v0 */
    public void m78396v0(String str) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        TextView textView = this.f53449u;
        if (zIsEmpty) {
            bnl0.m105525M0(textView, false);
        } else {
            bnl0.m105525M0(textView, true);
            this.f53449u.setText(str);
        }
    }

    /* JADX INFO: renamed from: w0 */
    public void m78397w0(BLiveVoiceCall bLiveVoiceCall, hfw hfwVar) {
        boolean zM134863l = hfwVar.m134863l(bLiveVoiceCall.user);
        if (bLiveVoiceCall.position == 0) {
            m78389J0(bLiveVoiceCall, zM134863l);
            return;
        }
        boolean zM134867p = hfwVar.m134867p(bLiveVoiceCall.user);
        if (NullChecker.m82486a(this.f53430C) && zM134867p) {
            this.f53430C.mo78362Z(bLiveVoiceCall, zM134863l);
        }
    }

    /* JADX INFO: renamed from: y0 */
    public void m78398y0(BLiveLovePlanetPlayerInfo bLiveLovePlanetPlayerInfo) {
        if (bLiveLovePlanetPlayerInfo != null && !TextUtils.isEmpty(bLiveLovePlanetPlayerInfo.avatar)) {
            this.f53428A.m114260d(bLiveLovePlanetPlayerInfo.avatarConfig);
            BLiveMaskAvatarConfig bLiveMaskAvatarConfig = bLiveLovePlanetPlayerInfo.avatarConfig;
            BLiveAvatarFrameConfig bLiveAvatarFrameConfig = bLiveMaskAvatarConfig != null ? bLiveMaskAvatarConfig.frameConfig : null;
            biv.m104522g(this.f53435g, qa00.m175859d(50.0f), bLiveLovePlanetPlayerInfo.getAvatarUrl(), bLiveAvatarFrameConfig != null ? bLiveAvatarFrameConfig.staticUrl : null, bLiveAvatarFrameConfig != null ? bLiveAvatarFrameConfig.dynamicUrl : null);
            return;
        }
        biv.m104522g(this.f53435g, qa00.m175859d(50.0f), "res://drawable/" + obc0.f146048Ga, null, null);
        m78388I0();
        this.f53428A.m114258b();
    }

    /* JADX INFO: renamed from: z0 */
    public void m78399z0(BLiveLovePlanetPlayerInfo bLiveLovePlanetPlayerInfo) {
        if (bLiveLovePlanetPlayerInfo == null || TextUtils.isEmpty(bLiveLovePlanetPlayerInfo.avatar)) {
            this.f53447s.setText("MVP");
            biv.m104522g(this.f53444p, qa00.m175859d(50.0f), "res://drawable/" + obc0.f146036Fa, null, null);
            return;
        }
        BLiveMaskAvatarConfig bLiveMaskAvatarConfig = bLiveLovePlanetPlayerInfo.avatarConfig;
        BLiveAvatarFrameConfig bLiveAvatarFrameConfig = bLiveMaskAvatarConfig != null ? bLiveMaskAvatarConfig.frameConfig : null;
        biv.m104522g(this.f53444p, qa00.m175859d(50.0f), bLiveLovePlanetPlayerInfo.avatar, bLiveAvatarFrameConfig != null ? bLiveAvatarFrameConfig.staticUrl : null, bLiveAvatarFrameConfig != null ? bLiveAvatarFrameConfig.dynamicUrl : null);
        long j = bLiveLovePlanetPlayerInfo.sendScore;
        FocusTextView focusTextView = this.f53447s;
        if (j > 0) {
            focusTextView.setText(String.format("%s:%s星动值", bLiveLovePlanetPlayerInfo.userName, yau.m214935c(j)));
        } else {
            focusTextView.setText(bLiveLovePlanetPlayerInfo.userName);
        }
    }

    public VoiceVirtualLovePlanetWidgetView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f53431D = new HashMap<>();
    }

    public VoiceVirtualLovePlanetWidgetView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f53431D = new HashMap<>();
    }
}
