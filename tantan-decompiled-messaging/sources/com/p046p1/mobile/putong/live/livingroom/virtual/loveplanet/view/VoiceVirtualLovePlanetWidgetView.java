package com.p046p1.mobile.putong.live.livingroom.virtual.loveplanet.view;

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
import com.p046p1.mobile.android.p048ui.bubble.C4345a;
import com.p046p1.mobile.android.p048ui.bubble.C4348d;
import com.p046p1.mobile.putong.live.base.data.BLiveAvatarFrameConfig;
import com.p046p1.mobile.putong.live.base.data.BLiveCallEffectConfig;
import com.p046p1.mobile.putong.live.base.data.BLiveLovePlanet;
import com.p046p1.mobile.putong.live.base.data.BLiveLovePlanetPlayerInfo;
import com.p046p1.mobile.putong.live.base.data.BLiveMaskAvatarConfig;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceTagBubble;
import com.p046p1.mobile.putong.live.base.data.LovePlanetStage;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p046p1.mobile.putong.live.livingroom.common.avatar.CommonMaskAvatarView;
import com.p046p1.mobile.putong.live.livingroom.view.FocusTextView;
import com.p046p1.mobile.putong.live.livingroom.view.SayHiBubbleView;
import com.p046p1.mobile.putong.live.livingroom.virtual.loveplanet.travel.VoiceVirtualLoveItemInfoView;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import p147v.VLinear;
import p149l.agv;
import p149l.alk0;
import p149l.bt0;
import p149l.c0m;
import p149l.c45;
import p149l.d30;
import p149l.dt0;
import p149l.h1c0;
import p149l.i3c0;
import p149l.j4p0;
import p149l.jdw;
import p149l.k6p0;
import p149l.kdw;
import p149l.kvc0;
import p149l.mep0;
import p149l.nnn0;
import p149l.s7m;
import p149l.t100;
import p149l.t6c0;
import p149l.x8u;
import p149l.xdl0;

/* JADX INFO: loaded from: classes5.dex */
public class VoiceVirtualLovePlanetWidgetView extends ConstraintLayout implements s7m<j4p0> {

    /* JADX INFO: renamed from: A */
    public c45 f52580A;

    /* JADX INFO: renamed from: B */
    public String f52581B;

    /* JADX INFO: renamed from: C */
    public c0m f52582C;

    /* JADX INFO: renamed from: D */
    public HashMap<String, c0m> f52583D;

    /* JADX INFO: renamed from: d */
    public AnimEffectPlayer f52584d;

    /* JADX INFO: renamed from: e */
    public Guideline f52585e;

    /* JADX INFO: renamed from: f */
    public AnimEffectPlayer f52586f;

    /* JADX INFO: renamed from: g */
    public CommonMaskAvatarView f52587g;

    /* JADX INFO: renamed from: h */
    public VLinear f52588h;

    /* JADX INFO: renamed from: i */
    public ImageView f52589i;

    /* JADX INFO: renamed from: j */
    public TextView f52590j;

    /* JADX INFO: renamed from: k */
    public TextView f52591k;

    /* JADX INFO: renamed from: l */
    public TextView f52592l;

    /* JADX INFO: renamed from: m */
    public TextView f52593m;

    /* JADX INFO: renamed from: n */
    public TextView f52594n;

    /* JADX INFO: renamed from: o */
    public TextView f52595o;

    /* JADX INFO: renamed from: p */
    public CommonMaskAvatarView f52596p;

    /* JADX INFO: renamed from: q */
    public VLinear f52597q;

    /* JADX INFO: renamed from: r */
    public ImageView f52598r;

    /* JADX INFO: renamed from: s */
    public FocusTextView f52599s;

    /* JADX INFO: renamed from: t */
    public View f52600t;

    /* JADX INFO: renamed from: u */
    public TextView f52601u;

    /* JADX INFO: renamed from: v */
    public ImageView f52602v;

    /* JADX INFO: renamed from: w */
    public FrameLayout f52603w;

    /* JADX INFO: renamed from: x */
    public Animator f52604x;

    /* JADX INFO: renamed from: y */
    public j4p0 f52605y;

    /* JADX INFO: renamed from: z */
    public TextView[] f52606z;

    public VoiceVirtualLovePlanetWidgetView(Context context) {
        super(context);
        this.f52583D = new HashMap<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p0 */
    public /* synthetic */ void m77197p0(View view) {
        j4p0 j4p0Var = this.f52605y;
        if (j4p0Var != null) {
            j4p0Var.m139751v4();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q0 */
    public /* synthetic */ void m77198q0(View view) {
        j4p0 j4p0Var = this.f52605y;
        if (j4p0Var != null) {
            j4p0Var.m139752w4();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r0 */
    public /* synthetic */ void m77199r0(View view) {
        this.f52605y.m139749t4();
    }

    /* JADX INFO: renamed from: B0 */
    public void m77200B0(int i) {
        ImageView imageView = this.f52602v;
        if (i < 0) {
            xdl0.m208344M(imageView, false);
            return;
        }
        xdl0.m208344M(imageView, true);
        this.f52602v.setImageResource(i);
        this.f52602v.setOnClickListener(new View.OnClickListener() { // from class: l.h6p0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f106108a.m77210s0(view);
            }
        });
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    /* JADX INFO: renamed from: D0 */
    public void m77201D0(String str) {
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
            TextView[] textViewArr = this.f52606z;
            if (i2 >= textViewArr.length) {
                return;
            }
            if (i2 < i) {
                textViewArr[i2].setTextColor(kvc0.m147352a(h1c0.f105362e1));
                this.f52606z[i2].setBackgroundResource(i3c0.f110697F);
            } else {
                textViewArr[i2].setTextColor(kvc0.m147352a(h1c0.f105386m1));
                this.f52606z[i2].setBackgroundResource(i3c0.f110709G);
            }
            i2++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: E0 */
    public void m77202E0(BLiveLovePlanet bLiveLovePlanet) {
        c0m c0mVarM145692a = kdw.m145692a(getContext(), bLiveLovePlanet, this.f52583D);
        if (!NullChecker.m81303a(this.f52582C) || c0mVarM145692a.getViewId() != this.f52582C.getViewId()) {
            this.f52603w.removeAllViews();
            int i = xdl0.f192403e;
            this.f52603w.addView((View) c0mVarM145692a, new FrameLayout.LayoutParams(i, i));
            this.f52582C = c0mVarM145692a;
            c0mVarM145692a.mo21065i1(this.f52605y);
        }
        this.f52582C.mo77180c0(bLiveLovePlanet);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: G0 */
    public void m77203G0(BLiveVoiceTagBubble bLiveVoiceTagBubble) {
        SayHiBubbleView sayHiBubbleView = (SayHiBubbleView) LayoutInflater.from(getContext()).inflate(t6c0.f168360ga, (ViewGroup) null);
        sayHiBubbleView.m76648f(bLiveVoiceTagBubble, ((nnn0) this.f52605y.m206027E2()).m149818o(), ((nnn0) this.f52605y.m206027E2()).m132140j0(), ((nnn0) this.f52605y.m206027E2()).m149814k(), new d30() { // from class: l.j6p0
            @Override // p149l.d30
            public final void call() {
                C4348d.m20896l().m20900k(SayHiBubbleView.getGreetViewTag());
            }
        });
        C4345a c4345a = new C4345a(getContext());
        c4345a.m20847B(t100.f167254c).m20877s(sayHiBubbleView).m20874p(75).m20880v(t100.f167260i).m20870k(kvc0.m147352a(h1c0.f105362e1)).m20875q(C4345a.f15680N).m20861b(Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS);
        C4348d.m20896l().m20909u(c4345a, this.f52587g, SayHiBubbleView.getGreetViewTag());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: H0 */
    public boolean m77204H0(BLiveVoiceTagBubble bLiveVoiceTagBubble) {
        String str = bLiveVoiceTagBubble.fromUserId;
        c0m c0mVar = this.f52582C;
        VoiceVirtualLoveItemInfoView voiceVirtualLoveItemInfoViewMo77182S = c0mVar != null ? c0mVar.mo77182S(str) : null;
        if (voiceVirtualLoveItemInfoViewMo77182S == null) {
            this.f52605y.m206028F2().VoiceVirtualLiveEvent.showSayHiBubble().mo172463j(str);
            return false;
        }
        SayHiBubbleView sayHiBubbleView = (SayHiBubbleView) LayoutInflater.from(getContext()).inflate(t6c0.f168360ga, (ViewGroup) null);
        sayHiBubbleView.m76648f(bLiveVoiceTagBubble, ((nnn0) this.f52605y.m206027E2()).m149818o(), ((nnn0) this.f52605y.m206027E2()).m132140j0(), ((nnn0) this.f52605y.m206027E2()).m149814k(), new d30() { // from class: l.i6p0
            @Override // p149l.d30
            public final void call() {
                C4348d.m20896l().m20900k(SayHiBubbleView.getGreetViewTag());
            }
        });
        C4345a c4345a = new C4345a(getContext());
        c4345a.m20847B(t100.f167254c).m20877s(sayHiBubbleView).m20874p(75).m20882x(-t100.f167271t).m20870k(kvc0.m147352a(h1c0.f105362e1)).m20875q(C4345a.f15680N).m20861b(Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS);
        int i = voiceVirtualLoveItemInfoViewMo77182S.getBindPlayerInfo().position;
        if (i == 3) {
            c4345a.m20880v(t100.f167260i);
        } else if (i == 4) {
            c4345a.m20881w(t100.f167260i);
        }
        C4348d.m20896l().m20909u(c4345a, voiceVirtualLoveItemInfoViewMo77182S, SayHiBubbleView.getGreetViewTag());
        return true;
    }

    /* JADX INFO: renamed from: I0 */
    public final void m77205I0() {
        if (NullChecker.m81303a(this.f52586f)) {
            this.f52586f.stopAnimation(true);
        }
        this.f52587g.m72129t0();
    }

    /* JADX INFO: renamed from: J0 */
    public void m77206J0(BLiveVoiceCall bLiveVoiceCall, boolean z) {
        if (bLiveVoiceCall.mutedByAnchor || bLiveVoiceCall.mutedByUser || !bLiveVoiceCall.isSpeak || alk0.m97312k(bLiveVoiceCall)) {
            m77205I0();
            return;
        }
        m77212u0(bLiveVoiceCall);
        if (z) {
            this.f52587g.m72128s0();
        }
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(j4p0 j4p0Var) {
        this.f52605y = j4p0Var;
    }

    @Override // p149l.s7m
    public void destroy() {
        dt0.m113503C(this.f52604x);
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: n0 */
    public final void m77208n0(View view) {
        k6p0.m144628a(this, view);
    }

    /* JADX INFO: renamed from: o0 */
    public void m77209o0() {
        dt0.m113503C(this.f52604x);
        setPivotX(xdl0.m208412y0() >> 1);
        Animator animatorM103751x = bt0.m103751x(250L, bt0.m103741n(this, View.ALPHA, 0.0f, 1.0f));
        this.f52604x = animatorM103751x;
        animatorM103751x.setInterpolator(bt0.f77154a);
        this.f52604x.start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m77205I0();
        C4348d.m20896l().m20900k("greeting");
        this.f52580A.m105202b();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m77208n0(this);
        this.f52606z = new TextView[]{this.f52592l, this.f52593m, this.f52594n, this.f52595o};
        xdl0.m208325C0(this.f52584d, t100.m186890d(348.0f));
        mep0.m154302d1(this.f52584d, t100.f167260i);
        this.f52584d.mo68497g("https://fe-static.tancdn.com/v1/raw/72abc4b8-2889-4d9b-80f0-e50c0ee2a24812.svga", -1, null, true);
        xdl0.m208329E0(this.f52587g, new View.OnClickListener() { // from class: l.e6p0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f89629a.m77197p0(view);
            }
        });
        xdl0.m208329E0(this.f52596p, new View.OnClickListener() { // from class: l.f6p0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f96158a.m77198q0(view);
            }
        });
        xdl0.m208329E0(this.f52601u, new View.OnClickListener() { // from class: l.g6p0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f101300a.m77199r0(view);
            }
        });
        this.f52580A = new c45(this.f52587g.getCountDownProgressView());
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m77210s0(View view) {
        this.f52605y.m139754y4();
    }

    /* JADX INFO: renamed from: t0 */
    public void m77211t0() {
        dt0.m113503C(this.f52604x);
        setPivotX(xdl0.m208412y0() >> 1);
        setPivotY(0.0f);
        Animator animatorM103751x = bt0.m103751x(250L, bt0.m103741n(this, View.ALPHA, 1.0f, 0.0f));
        this.f52604x = animatorM103751x;
        animatorM103751x.setInterpolator(bt0.f77154a);
        this.f52604x.start();
    }

    /* JADX INFO: renamed from: u0 */
    public final void m77212u0(BLiveVoiceCall bLiveVoiceCall) {
        BLiveCallEffectConfig bLiveCallEffectConfig = bLiveVoiceCall.callEffect;
        String str = bLiveCallEffectConfig == null ? "https://fe-static.tancdn.com/v1/raw/dca27774-97f5-4987-b63e-14793e7db35912.svga" : bLiveCallEffectConfig.circleVoicingUrl;
        if (this.f52586f.isAnimating() && TextUtils.equals(str, this.f52581B)) {
            return;
        }
        this.f52581B = str;
        this.f52586f.m68500j(str, -1);
    }

    /* JADX INFO: renamed from: v0 */
    public void m77213v0(String str) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        TextView textView = this.f52601u;
        if (zIsEmpty) {
            xdl0.m208345M0(textView, false);
        } else {
            xdl0.m208345M0(textView, true);
            this.f52601u.setText(str);
        }
    }

    /* JADX INFO: renamed from: w0 */
    public void m77214w0(BLiveVoiceCall bLiveVoiceCall, jdw jdwVar) {
        boolean zM141077l = jdwVar.m141077l(bLiveVoiceCall.user);
        if (bLiveVoiceCall.position == 0) {
            m77206J0(bLiveVoiceCall, zM141077l);
            return;
        }
        boolean zM141081p = jdwVar.m141081p(bLiveVoiceCall.user);
        if (NullChecker.m81303a(this.f52582C) && zM141081p) {
            this.f52582C.mo77179Z(bLiveVoiceCall, zM141077l);
        }
    }

    /* JADX INFO: renamed from: y0 */
    public void m77215y0(BLiveLovePlanetPlayerInfo bLiveLovePlanetPlayerInfo) {
        if (bLiveLovePlanetPlayerInfo != null && !TextUtils.isEmpty(bLiveLovePlanetPlayerInfo.avatar)) {
            this.f52580A.m105204d(bLiveLovePlanetPlayerInfo.avatarConfig);
            BLiveMaskAvatarConfig bLiveMaskAvatarConfig = bLiveLovePlanetPlayerInfo.avatarConfig;
            BLiveAvatarFrameConfig bLiveAvatarFrameConfig = bLiveMaskAvatarConfig != null ? bLiveMaskAvatarConfig.frameConfig : null;
            agv.m96349g(this.f52587g, t100.m186890d(50.0f), bLiveLovePlanetPlayerInfo.getAvatarUrl(), bLiveAvatarFrameConfig != null ? bLiveAvatarFrameConfig.staticUrl : null, bLiveAvatarFrameConfig != null ? bLiveAvatarFrameConfig.dynamicUrl : null);
            return;
        }
        agv.m96349g(this.f52587g, t100.m186890d(50.0f), "res://drawable/" + i3c0.f110720Ga, null, null);
        m77205I0();
        this.f52580A.m105202b();
    }

    /* JADX INFO: renamed from: z0 */
    public void m77216z0(BLiveLovePlanetPlayerInfo bLiveLovePlanetPlayerInfo) {
        if (bLiveLovePlanetPlayerInfo == null || TextUtils.isEmpty(bLiveLovePlanetPlayerInfo.avatar)) {
            this.f52599s.setText("MVP");
            agv.m96349g(this.f52596p, t100.m186890d(50.0f), "res://drawable/" + i3c0.f110708Fa, null, null);
            return;
        }
        BLiveMaskAvatarConfig bLiveMaskAvatarConfig = bLiveLovePlanetPlayerInfo.avatarConfig;
        BLiveAvatarFrameConfig bLiveAvatarFrameConfig = bLiveMaskAvatarConfig != null ? bLiveMaskAvatarConfig.frameConfig : null;
        agv.m96349g(this.f52596p, t100.m186890d(50.0f), bLiveLovePlanetPlayerInfo.avatar, bLiveAvatarFrameConfig != null ? bLiveAvatarFrameConfig.staticUrl : null, bLiveAvatarFrameConfig != null ? bLiveAvatarFrameConfig.dynamicUrl : null);
        long j = bLiveLovePlanetPlayerInfo.sendScore;
        FocusTextView focusTextView = this.f52599s;
        if (j > 0) {
            focusTextView.setText(String.format("%s:%s星动值", bLiveLovePlanetPlayerInfo.userName, x8u.m207433c(j)));
        } else {
            focusTextView.setText(bLiveLovePlanetPlayerInfo.userName);
        }
    }

    public VoiceVirtualLovePlanetWidgetView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f52583D = new HashMap<>();
    }

    public VoiceVirtualLovePlanetWidgetView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f52583D = new HashMap<>();
    }
}
