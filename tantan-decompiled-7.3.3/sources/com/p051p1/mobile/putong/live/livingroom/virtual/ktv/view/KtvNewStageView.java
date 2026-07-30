package com.p051p1.mobile.putong.live.livingroom.virtual.ktv.view;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.p053ui.bubble.C4496a;
import com.p051p1.mobile.android.p053ui.bubble.C4499d;
import com.p051p1.mobile.putong.live.base.data.BLiveCallEffectConfig;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceKtvPlayInfo;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p051p1.mobile.putong.live.livingroom.virtual.ktv.bean.LrcWrapperBean;
import com.tantanapp.common.utils.NullChecker;
import java.util.Locale;
import p151v.VDraweeView;
import p153l.b6r;
import p153l.bae0;
import p153l.bnl0;
import p153l.hiv;
import p153l.htd0;
import p153l.i9o0;
import p153l.iam;
import p153l.izs;
import p153l.l51;
import p153l.mdc0;
import p153l.n9c0;
import p153l.obc0;
import p153l.qa00;
import p153l.qzj;
import p153l.r4r;
import p153l.wo0;
import p153l.xau;
import p153l.yau;
import p153l.yec0;
import p153l.zrv;

/* JADX INFO: loaded from: classes5.dex */
public class KtvNewStageView extends FrameLayout implements iam<r4r> {

    /* JADX INFO: renamed from: A */
    public TextView f53251A;

    /* JADX INFO: renamed from: B */
    public View f53252B;

    /* JADX INFO: renamed from: C */
    public KtvSuggestViewModel f53253C;

    /* JADX INFO: renamed from: D */
    public TextView f53254D;

    /* JADX INFO: renamed from: E */
    public View f53255E;

    /* JADX INFO: renamed from: F */
    public AnimEffectPlayer f53256F;

    /* JADX INFO: renamed from: G */
    public AnimEffectPlayer f53257G;

    /* JADX INFO: renamed from: H */
    public AnimEffectPlayer f53258H;

    /* JADX INFO: renamed from: I */
    public String f53259I;

    /* JADX INFO: renamed from: a */
    public LrcView f53260a;

    /* JADX INFO: renamed from: b */
    public TextView f53261b;

    /* JADX INFO: renamed from: c */
    public TextView f53262c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f53263d;

    /* JADX INFO: renamed from: e */
    public View f53264e;

    /* JADX INFO: renamed from: f */
    public b6r f53265f;

    /* JADX INFO: renamed from: g */
    public BLiveVoiceKtvPlayInfo f53266g;

    /* JADX INFO: renamed from: h */
    public r4r f53267h;

    /* JADX INFO: renamed from: i */
    public String f53268i;

    /* JADX INFO: renamed from: j */
    public int f53269j;

    /* JADX INFO: renamed from: k */
    public boolean f53270k;

    /* JADX INFO: renamed from: l */
    public boolean f53271l;

    /* JADX INFO: renamed from: m */
    public String f53272m;

    /* JADX INFO: renamed from: n */
    public String f53273n;

    /* JADX INFO: renamed from: o */
    public String f53274o;

    /* JADX INFO: renamed from: p */
    public View f53275p;

    /* JADX INFO: renamed from: q */
    public TextView f53276q;

    /* JADX INFO: renamed from: r */
    public TextView f53277r;

    /* JADX INFO: renamed from: s */
    public TextView f53278s;

    /* JADX INFO: renamed from: t */
    public TextView f53279t;

    /* JADX INFO: renamed from: u */
    public VoiceDressCallTouchView f53280u;

    /* JADX INFO: renamed from: v */
    public VDraweeView f53281v;

    /* JADX INFO: renamed from: w */
    public TextView f53282w;

    /* JADX INFO: renamed from: x */
    public TextView f53283x;

    /* JADX INFO: renamed from: y */
    public TextView f53284y;

    /* JADX INFO: renamed from: z */
    public ViewGroup f53285z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.virtual.ktv.view.KtvNewStageView$a */
    public class C13125a extends wo0 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AnimEffectPlayer f53286a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ AnimEffectPlayer f53287b;

        public C13125a(AnimEffectPlayer animEffectPlayer, AnimEffectPlayer animEffectPlayer2) {
            this.f53286a = animEffectPlayer;
            this.f53287b = animEffectPlayer2;
        }

        @Override // p153l.wo0
        /* JADX INFO: renamed from: g */
        public void mo70786g() {
            super.mo70786g();
            this.f53286a.m69687n();
            bnl0.m105524M(this.f53286a, false);
            bnl0.m105524M(this.f53287b, true);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.virtual.ktv.view.KtvNewStageView$b */
    public class C13126b implements VoiceDressCallTouchView.InterfaceC13131b {
        public C13126b() {
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.virtual.ktv.view.VoiceDressCallTouchView.InterfaceC13131b
        /* JADX INFO: renamed from: a */
        public void mo78278a(int i) {
            KtvNewStageView.this.f53269j = i;
            KtvNewStageView.this.f53267h.m179811k4(KtvNewStageView.this.m78272n(), i, KtvNewStageView.this.m78273p());
            l51.m152888H(KtvNewStageView.this.getAct(), new Runnable() { // from class: l.y4r
                @Override // java.lang.Runnable
                public final void run() {
                    this.f197513a.m78280d();
                }
            }, 200L);
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.virtual.ktv.view.VoiceDressCallTouchView.InterfaceC13131b
        /* JADX INFO: renamed from: b */
        public void mo78279b(int i) {
            KtvNewStageView.this.f53283x.setText(String.format("x%d ", Integer.valueOf(i)));
            bnl0.m105524M(KtvNewStageView.this.f53283x, true);
        }

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ void m78280d() {
            KtvNewStageView.this.f53283x.setText("");
        }
    }

    public KtvNewStageView(Context context) {
        super(context);
        this.f53270k = false;
    }

    /* JADX INFO: renamed from: r */
    private void m78253r() {
        bnl0.m105509E0(this.f53261b, new View.OnClickListener() { // from class: l.t4r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f172098a.m78254s(view);
            }
        });
        bnl0.m105509E0(this.f53263d, new View.OnClickListener() { // from class: l.u4r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f177484a.m78255u(view);
            }
        });
        bnl0.m105509E0(this.f53264e, new View.OnClickListener() { // from class: l.v4r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f182420a.m78256v(view);
            }
        });
        this.f53280u.setOnSendListener(new C13126b());
        bnl0.m105509E0(this.f53251A, new View.OnClickListener() { // from class: l.w4r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f187431a.m78257w(view);
            }
        });
        bnl0.m105509E0(this.f53252B, new View.OnClickListener() { // from class: l.x4r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f192429a.m78258x(view);
            }
        });
        this.f53285z.bringChildToFront(this.f53263d);
        m78259A("https://fe-static.tancdn.com/v1/raw/b24fdcc1-31f9-4dec-81c0-407eff737dac14.svga");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public /* synthetic */ void m78254s(View view) {
        if (this.f53265f != null) {
            boolean zEquals = this.f53261b.getText().equals("调音");
            b6r b6rVar = this.f53265f;
            if (zEquals) {
                b6rVar.mo102792a(view, this.f53266g);
            } else {
                b6rVar.mo102793b(view);
            }
        }
    }

    private void setBottomButtonFunc(boolean z) {
        TextView textView = this.f53261b;
        if (z) {
            textView.setText("点歌");
            Drawable drawable = getContext().getDrawable(obc0.f146059H9);
            drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
            this.f53261b.setCompoundDrawables(drawable, null, null, null);
        } else {
            textView.setText("调音");
            Drawable drawable2 = getContext().getDrawable(obc0.f146071I9);
            drawable2.setBounds(0, 0, drawable2.getMinimumWidth(), drawable2.getMinimumHeight());
            this.f53261b.setCompoundDrawables(drawable2, null, null, null);
        }
        m78264G();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public /* synthetic */ void m78255u(View view) {
        BLiveVoiceKtvPlayInfo bLiveVoiceKtvPlayInfo = this.f53266g;
        b6r b6rVar = this.f53265f;
        if (bLiveVoiceKtvPlayInfo != null) {
            b6rVar.mo102794c(view, bLiveVoiceKtvPlayInfo);
        } else {
            b6rVar.mo102793b(view);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public /* synthetic */ void m78256v(View view) {
        if (TextUtils.isEmpty(this.f53274o)) {
            return;
        }
        this.f53267h.m213811F2().SchemeHandleEvent.handleScheme().mo199273j(new bae0.C15953a(7009).m103154e(this.f53274o).m103152c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public /* synthetic */ void m78257w(View view) {
        this.f53267h.m179814n4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public /* synthetic */ void m78258x(View view) {
        this.f53267h.m179810i4();
    }

    /* JADX INFO: renamed from: A */
    public void m78259A(String str) {
        if (TextUtils.equals(this.f53268i, str)) {
            return;
        }
        this.f53268i = str;
        if (this.f53256F.isAnimating()) {
            m78261C(this.f53256F, this.f53258H, str);
        } else if (this.f53258H.isAnimating()) {
            m78261C(this.f53258H, this.f53256F, str);
        } else {
            m78261C(this.f53256F, this.f53258H, str);
        }
    }

    /* JADX INFO: renamed from: B */
    public void m78260B(BLiveVoiceCall bLiveVoiceCall) {
        BLiveCallEffectConfig bLiveCallEffectConfig = bLiveVoiceCall.callEffect;
        String str = bLiveCallEffectConfig == null ? "https://fe-static.tancdn.com/v1/raw/44325435-3109-4466-a7a0-1b65574e3fc814.svga" : bLiveCallEffectConfig.circleVoicingUrl;
        if (this.f53257G.isAnimating() && TextUtils.equals(str, this.f53259I)) {
            return;
        }
        this.f53259I = str;
        bnl0.m105524M(this.f53257G, true);
        this.f53257G.mo69685l(this.f53259I, -1, null);
    }

    /* JADX INFO: renamed from: C */
    public void m78261C(AnimEffectPlayer animEffectPlayer, AnimEffectPlayer animEffectPlayer2, String str) {
        animEffectPlayer2.mo69680g(str, -1, new C13125a(animEffectPlayer, animEffectPlayer2), true);
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    /* JADX INFO: renamed from: E */
    public void m78262E() {
        this.f53280u.m78335d0();
    }

    /* JADX INFO: renamed from: F */
    public void m78263F() {
        this.f53266g = null;
        setBottomButtonFunc(true);
        this.f53260a.m78320i();
        setViewPlayingStatus(false);
        bnl0.m105524M(this.f53264e, false);
        m78265H();
        bnl0.m105524M(this.f53258H, false);
        this.f53258H.m69687n();
        bnl0.m105524M(this.f53256F, false);
        this.f53256F.m69687n();
        this.f53268i = "";
    }

    /* JADX INFO: renamed from: G */
    public final void m78264G() {
        if (TextUtils.isEmpty(m78273p())) {
            bnl0.m105524M(this.f53280u, false);
            bnl0.m105524M(this.f53283x, false);
        } else {
            BLiveGiftItem bLiveGiftItemM135160l = ((hiv) zrv.m221194l(htd0.f111521c)).m135160l(m78272n());
            if (!this.f53270k && NullChecker.m82486a(bLiveGiftItemM135160l)) {
                this.f53270k = true;
                qzj.m178788e(bLiveGiftItemM135160l, this.f53267h.mo78457R2(), m78273p(), this.f53269j);
            }
            izs.m142869t("context_single_room", this.f53281v, this.f53266g.quickGiftInfo.url, qa00.f156327n);
            this.f53282w.setText(this.f53266g.quickGiftInfo.name);
            this.f53280u.m78330X();
            bnl0.m105524M(this.f53280u, true);
        }
        this.f53283x.setTypeface(Typeface.DEFAULT_BOLD);
    }

    /* JADX INFO: renamed from: H */
    public void m78265H() {
        r4r r4rVar = this.f53267h;
        if (r4rVar != null) {
            bnl0.m105524M(this.f53251A, i9o0.m139137h(r4rVar));
        }
    }

    /* JADX INFO: renamed from: I */
    public void m78266I(String str) {
        if (bnl0.m105529O0(this.f53280u)) {
            if (C4499d.m21895l().m21911x("ktv_press_call_tips")) {
                C4499d.m21895l().m21899k("ktv_press_call_tips");
            }
            C4499d.m21895l().m21899k("ktv_press_call_tips");
            C4496a c4496a = new C4496a(this.f53267h.act());
            c4496a.m21848D(str).m21863e(true).m21869k(this.f53267h.act().getResources().getColor(n9c0.f140818d)).m21854J(14.0f).m21860b(Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS).m21882y(true).m21874q(C4496a.f16399N).m21881x(qa00.f156318e);
            C4499d.m21895l().m21908u(c4496a, this.f53280u, "ktv_press_call_tips");
        }
    }

    /* JADX INFO: renamed from: J */
    public void m78267J() {
        this.f53257G.m69687n();
        bnl0.m105524M(this.f53257G, false);
    }

    /* JADX INFO: renamed from: K */
    public void m78268K(int i, int i2, int i3, long j, String str, String str2, String str3) {
        this.f53274o = str2;
        this.f53278s.setText(String.format("%s音浪", yau.m214935c(j)));
        String str4 = String.format("应援%s级(%s/%s)", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
        if (TextUtils.isEmpty(str)) {
            this.f53267h.m179813m4();
        } else if (!TextUtils.equals(str4, this.f53273n) || !TextUtils.equals(str, this.f53272m)) {
            this.f53272m = str;
            this.f53267h.m179812l4();
        }
        this.f53273n = str4;
        this.f53279t.setText(str4);
        m78259A(str3);
    }

    /* JADX INFO: renamed from: L */
    public void m78269L() {
        boolean zEquals = TextUtils.equals(this.f53279t.getText().toString(), this.f53272m);
        TextView textView = this.f53279t;
        if (zEquals) {
            textView.setText(this.f53273n);
        } else {
            textView.setText(this.f53272m);
        }
    }

    @Override // p153l.iam
    public void destroy() {
    }

    public BLiveVoiceKtvPlayInfo getPlayInfo() {
        return this.f53266g;
    }

    public VDraweeView get_avatar() {
        return this.f53263d;
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return layoutInflater.inflate(yec0.f199195o9, (ViewGroup) null);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(r4r r4rVar) {
        this.f53267h = r4rVar;
    }

    /* JADX INFO: renamed from: m */
    public final void m78271m() {
        this.f53260a = (LrcView) findViewById(mdc0.f135986L3);
        this.f53261b = (TextView) findViewById(mdc0.f136185g7);
        this.f53262c = (TextView) findViewById(mdc0.f136142c4);
        this.f53263d = (VDraweeView) findViewById(mdc0.f136299t);
        this.f53264e = findViewById(mdc0.f135898B5);
        this.f53275p = findViewById(mdc0.f135995M3);
        this.f53276q = (TextView) findViewById(mdc0.f136352y7);
        this.f53277r = (TextView) findViewById(mdc0.f136343x7);
        this.f53279t = (TextView) findViewById(mdc0.f136262o7);
        this.f53278s = (TextView) findViewById(mdc0.f136325v7);
        this.f53280u = (VoiceDressCallTouchView) findViewById(mdc0.f136118a0);
        this.f53281v = (VDraweeView) findViewById(mdc0.f136108Z);
        this.f53282w = (TextView) findViewById(mdc0.f136128b0);
        this.f53283x = (TextView) findViewById(mdc0.f135961I5);
        this.f53284y = (TextView) findViewById(mdc0.f136051S5);
        this.f53285z = (ViewGroup) findViewById(mdc0.f135924E4);
        this.f53251A = (TextView) findViewById(mdc0.f136297s6);
        this.f53252B = findViewById(mdc0.f136359z5);
        this.f53253C = (KtvSuggestViewModel) findViewById(mdc0.f136224k6);
        this.f53254D = (TextView) findViewById(mdc0.f136145c7);
        this.f53255E = findViewById(mdc0.f136132b4);
        this.f53256F = (AnimEffectPlayer) findViewById(mdc0.f136284r2);
        this.f53257G = (AnimEffectPlayer) findViewById(mdc0.f136098X7);
        this.f53258H = (AnimEffectPlayer) findViewById(mdc0.f136293s2);
    }

    /* JADX INFO: renamed from: n */
    public int m78272n() {
        if (NullChecker.m82486a(this.f53266g) && NullChecker.m82486a(this.f53266g.quickGiftInfo)) {
            return this.f53266g.quickGiftInfo.giftId;
        }
        return 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (NullChecker.m82486a(this.f53280u)) {
            this.f53280u.m78334b0();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m78271m();
        m78253r();
    }

    /* JADX INFO: renamed from: p */
    public String m78273p() {
        return NullChecker.m82486a(this.f53266g) ? this.f53266g.userId : "";
    }

    /* JADX INFO: renamed from: q */
    public final boolean m78274q(BLiveVoiceKtvPlayInfo bLiveVoiceKtvPlayInfo) {
        if (this.f53266g == null) {
            return false;
        }
        this.f53266g = bLiveVoiceKtvPlayInfo;
        return TextUtils.equals(bLiveVoiceKtvPlayInfo.userId, zrv.f205799a.m207631D0());
    }

    public void setClickCallback(b6r b6rVar) {
        this.f53265f = b6rVar;
    }

    public void setCountDownView(int i) {
        BLiveVoiceKtvPlayInfo bLiveVoiceKtvPlayInfo = this.f53266g;
        if (bLiveVoiceKtvPlayInfo == null || TextUtils.isEmpty(bLiveVoiceKtvPlayInfo.title)) {
            return;
        }
        this.f53277r.setText(String.format(Locale.CHINA, "%ds后播放《%s》", Integer.valueOf(i), this.f53266g.title));
    }

    public void setLrcFile(LrcWrapperBean lrcWrapperBean) {
        this.f53260a.setLrcData(lrcWrapperBean);
        this.f53262c.postDelayed(new Runnable() { // from class: l.s4r
            @Override // java.lang.Runnable
            public final void run() {
                this.f166261a.m78275y();
            }
        }, 1000L);
    }

    public void setMusicProgress(long j) {
        this.f53260a.m78321j((int) j);
    }

    public void setMusicTotal(long j) {
    }

    public void setPauseView(BLiveVoiceKtvPlayInfo bLiveVoiceKtvPlayInfo) {
        this.f53266g = bLiveVoiceKtvPlayInfo;
        if (bLiveVoiceKtvPlayInfo.mask != null) {
            m78276z(bLiveVoiceKtvPlayInfo);
            setBottomButtonFunc(!m78274q(bLiveVoiceKtvPlayInfo));
            bnl0.m105524M(this.f53275p, false);
            bnl0.m105524M(this.f53260a, true);
            bnl0.m105524M(this.f53264e, this.f53271l);
            setViewPlayingStatus(true);
        }
    }

    public void setPlayingView(BLiveVoiceKtvPlayInfo bLiveVoiceKtvPlayInfo) {
        this.f53266g = bLiveVoiceKtvPlayInfo;
        if (bLiveVoiceKtvPlayInfo.mask != null) {
            m78276z(bLiveVoiceKtvPlayInfo);
            setBottomButtonFunc(!m78274q(bLiveVoiceKtvPlayInfo));
            bnl0.m105524M(this.f53260a, true);
            bnl0.m105524M(this.f53275p, false);
            bnl0.m105524M(this.f53264e, this.f53271l);
            setViewPlayingStatus(true);
        }
    }

    public void setPrepareView(BLiveVoiceKtvPlayInfo bLiveVoiceKtvPlayInfo) {
        if (bLiveVoiceKtvPlayInfo == null || bLiveVoiceKtvPlayInfo.mask == null) {
            return;
        }
        this.f53266g = bLiveVoiceKtvPlayInfo;
        m78276z(bLiveVoiceKtvPlayInfo);
        setBottomButtonFunc(true);
        this.f53275p.setVisibility(0);
        this.f53276q.setText("正在加载...");
        this.f53277r.setText(String.format(Locale.CHINA, "%ds后播放《%s》", Long.valueOf(bLiveVoiceKtvPlayInfo.prepareRemainSeconds), bLiveVoiceKtvPlayInfo.title));
        bnl0.m105524M(this.f53260a, false);
        bnl0.m105524M(this.f53264e, this.f53271l);
        this.f53260a.m78320i();
        setViewPlayingStatus(true);
    }

    public void setViewPlayingStatus(boolean z) {
        bnl0.m105524M(this.f53262c, z);
        bnl0.m105524M(this.f53255E, z);
        bnl0.m105524M(this.f53285z, z);
        bnl0.m105524M(this.f53253C, !z);
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m78275y() {
        this.f53262c.onWindowFocusChanged(true);
    }

    /* JADX INFO: renamed from: z */
    public final void m78276z(BLiveVoiceKtvPlayInfo bLiveVoiceKtvPlayInfo) {
        izs.m142864o("context_live_activities", this.f53263d, bLiveVoiceKtvPlayInfo.mask.avatar);
        this.f53262c.setText(bLiveVoiceKtvPlayInfo.title + "·" + bLiveVoiceKtvPlayInfo.author);
        this.f53271l = bLiveVoiceKtvPlayInfo.showLevel;
        m78268K(bLiveVoiceKtvPlayInfo.level, bLiveVoiceKtvPlayInfo.giftUv, bLiveVoiceKtvPlayInfo.nextLevelGiftUv, bLiveVoiceKtvPlayInfo.score, bLiveVoiceKtvPlayInfo.levelTip, bLiveVoiceKtvPlayInfo.schema, bLiveVoiceKtvPlayInfo.showBgSvgaUrl);
        boolean zIsEmpty = TextUtils.isEmpty(bLiveVoiceKtvPlayInfo.bestSingerName);
        TextView textView = this.f53254D;
        if (zIsEmpty) {
            bnl0.m105524M(textView, false);
        } else {
            bnl0.m105524M(textView, true);
            this.f53254D.setText(bLiveVoiceKtvPlayInfo.bestSingerName);
        }
        this.f53284y.setText(xau.m209906p(bLiveVoiceKtvPlayInfo.mask.name, 6));
        m78259A(bLiveVoiceKtvPlayInfo.showBgSvgaUrl);
    }

    public KtvNewStageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f53270k = false;
    }

    public KtvNewStageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f53270k = false;
    }
}
