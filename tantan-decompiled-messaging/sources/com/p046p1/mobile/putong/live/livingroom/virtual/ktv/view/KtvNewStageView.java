package com.p046p1.mobile.putong.live.livingroom.virtual.ktv.view;

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
import com.p046p1.mobile.android.p048ui.bubble.C4345a;
import com.p046p1.mobile.android.p048ui.bubble.C4348d;
import com.p046p1.mobile.putong.live.base.data.BLiveCallEffectConfig;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceKtvPlayInfo;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p046p1.mobile.putong.live.livingroom.virtual.ktv.bean.LrcWrapperBean;
import com.tantanapp.common.utils.NullChecker;
import java.util.Locale;
import p147v.VDraweeView;
import p149l.a4r;
import p149l.ap0;
import p149l.axj;
import p149l.e0o0;
import p149l.e51;
import p149l.fld0;
import p149l.g5c0;
import p149l.ggv;
import p149l.h1c0;
import p149l.hxs;
import p149l.i3c0;
import p149l.q2r;
import p149l.s7m;
import p149l.t100;
import p149l.t6c0;
import p149l.w8u;
import p149l.x1e0;
import p149l.x8u;
import p149l.xdl0;
import p149l.ypv;

/* JADX INFO: loaded from: classes5.dex */
public class KtvNewStageView extends FrameLayout implements s7m<q2r> {

    /* JADX INFO: renamed from: A */
    public TextView f52403A;

    /* JADX INFO: renamed from: B */
    public View f52404B;

    /* JADX INFO: renamed from: C */
    public KtvSuggestViewModel f52405C;

    /* JADX INFO: renamed from: D */
    public TextView f52406D;

    /* JADX INFO: renamed from: E */
    public View f52407E;

    /* JADX INFO: renamed from: F */
    public AnimEffectPlayer f52408F;

    /* JADX INFO: renamed from: G */
    public AnimEffectPlayer f52409G;

    /* JADX INFO: renamed from: H */
    public AnimEffectPlayer f52410H;

    /* JADX INFO: renamed from: I */
    public String f52411I;

    /* JADX INFO: renamed from: a */
    public LrcView f52412a;

    /* JADX INFO: renamed from: b */
    public TextView f52413b;

    /* JADX INFO: renamed from: c */
    public TextView f52414c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f52415d;

    /* JADX INFO: renamed from: e */
    public View f52416e;

    /* JADX INFO: renamed from: f */
    public a4r f52417f;

    /* JADX INFO: renamed from: g */
    public BLiveVoiceKtvPlayInfo f52418g;

    /* JADX INFO: renamed from: h */
    public q2r f52419h;

    /* JADX INFO: renamed from: i */
    public String f52420i;

    /* JADX INFO: renamed from: j */
    public int f52421j;

    /* JADX INFO: renamed from: k */
    public boolean f52422k;

    /* JADX INFO: renamed from: l */
    public boolean f52423l;

    /* JADX INFO: renamed from: m */
    public String f52424m;

    /* JADX INFO: renamed from: n */
    public String f52425n;

    /* JADX INFO: renamed from: o */
    public String f52426o;

    /* JADX INFO: renamed from: p */
    public View f52427p;

    /* JADX INFO: renamed from: q */
    public TextView f52428q;

    /* JADX INFO: renamed from: r */
    public TextView f52429r;

    /* JADX INFO: renamed from: s */
    public TextView f52430s;

    /* JADX INFO: renamed from: t */
    public TextView f52431t;

    /* JADX INFO: renamed from: u */
    public VoiceDressCallTouchView f52432u;

    /* JADX INFO: renamed from: v */
    public VDraweeView f52433v;

    /* JADX INFO: renamed from: w */
    public TextView f52434w;

    /* JADX INFO: renamed from: x */
    public TextView f52435x;

    /* JADX INFO: renamed from: y */
    public TextView f52436y;

    /* JADX INFO: renamed from: z */
    public ViewGroup f52437z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.virtual.ktv.view.KtvNewStageView$a */
    public class C12962a extends ap0 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AnimEffectPlayer f52438a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ AnimEffectPlayer f52439b;

        public C12962a(AnimEffectPlayer animEffectPlayer, AnimEffectPlayer animEffectPlayer2) {
            this.f52438a = animEffectPlayer;
            this.f52439b = animEffectPlayer2;
        }

        @Override // p149l.ap0
        /* JADX INFO: renamed from: g */
        public void mo69603g() {
            super.mo69603g();
            this.f52438a.m68504n();
            xdl0.m208344M(this.f52438a, false);
            xdl0.m208344M(this.f52439b, true);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.virtual.ktv.view.KtvNewStageView$b */
    public class C12963b implements VoiceDressCallTouchView.InterfaceC12968b {
        public C12963b() {
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.virtual.ktv.view.VoiceDressCallTouchView.InterfaceC12968b
        /* JADX INFO: renamed from: a */
        public void mo77095a(int i) {
            KtvNewStageView.this.f52421j = i;
            KtvNewStageView.this.f52419h.m172503k4(KtvNewStageView.this.m77089n(), i, KtvNewStageView.this.m77090p());
            e51.m114743H(KtvNewStageView.this.getAct(), new Runnable() { // from class: l.x2r
                @Override // java.lang.Runnable
                public final void run() {
                    this.f190814a.m77097d();
                }
            }, 200L);
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.virtual.ktv.view.VoiceDressCallTouchView.InterfaceC12968b
        /* JADX INFO: renamed from: b */
        public void mo77096b(int i) {
            KtvNewStageView.this.f52435x.setText(String.format("x%d ", Integer.valueOf(i)));
            xdl0.m208344M(KtvNewStageView.this.f52435x, true);
        }

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ void m77097d() {
            KtvNewStageView.this.f52435x.setText("");
        }
    }

    public KtvNewStageView(Context context) {
        super(context);
        this.f52422k = false;
    }

    /* JADX INFO: renamed from: r */
    private void m77070r() {
        xdl0.m208329E0(this.f52413b, new View.OnClickListener() { // from class: l.s2r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f161996a.m77071s(view);
            }
        });
        xdl0.m208329E0(this.f52415d, new View.OnClickListener() { // from class: l.t2r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f167544a.m77072u(view);
            }
        });
        xdl0.m208329E0(this.f52416e, new View.OnClickListener() { // from class: l.u2r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f173512a.m77073v(view);
            }
        });
        this.f52432u.setOnSendListener(new C12963b());
        xdl0.m208329E0(this.f52403A, new View.OnClickListener() { // from class: l.v2r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f179600a.m77074w(view);
            }
        });
        xdl0.m208329E0(this.f52404B, new View.OnClickListener() { // from class: l.w2r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f184282a.m77075x(view);
            }
        });
        this.f52437z.bringChildToFront(this.f52415d);
        m77076A("https://fe-static.tancdn.com/v1/raw/b24fdcc1-31f9-4dec-81c0-407eff737dac14.svga");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public /* synthetic */ void m77071s(View view) {
        if (this.f52417f != null) {
            boolean zEquals = this.f52413b.getText().equals("调音");
            a4r a4rVar = this.f52417f;
            if (zEquals) {
                a4rVar.mo94925a(view, this.f52418g);
            } else {
                a4rVar.mo94926b(view);
            }
        }
    }

    private void setBottomButtonFunc(boolean z) {
        TextView textView = this.f52413b;
        if (z) {
            textView.setText("点歌");
            Drawable drawable = getContext().getDrawable(i3c0.f110731H9);
            drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
            this.f52413b.setCompoundDrawables(drawable, null, null, null);
        } else {
            textView.setText("调音");
            Drawable drawable2 = getContext().getDrawable(i3c0.f110743I9);
            drawable2.setBounds(0, 0, drawable2.getMinimumWidth(), drawable2.getMinimumHeight());
            this.f52413b.setCompoundDrawables(drawable2, null, null, null);
        }
        m77081G();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public /* synthetic */ void m77072u(View view) {
        BLiveVoiceKtvPlayInfo bLiveVoiceKtvPlayInfo = this.f52418g;
        a4r a4rVar = this.f52417f;
        if (bLiveVoiceKtvPlayInfo != null) {
            a4rVar.mo94927c(view, bLiveVoiceKtvPlayInfo);
        } else {
            a4rVar.mo94926b(view);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public /* synthetic */ void m77073v(View view) {
        if (TextUtils.isEmpty(this.f52426o)) {
            return;
        }
        this.f52419h.m206028F2().SchemeHandleEvent.handleScheme().mo172463j(new x1e0.C21018a(7009).m206701e(this.f52426o).m206699c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public /* synthetic */ void m77074w(View view) {
        this.f52419h.m172506n4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public /* synthetic */ void m77075x(View view) {
        this.f52419h.m172502i4();
    }

    /* JADX INFO: renamed from: A */
    public void m77076A(String str) {
        if (TextUtils.equals(this.f52420i, str)) {
            return;
        }
        this.f52420i = str;
        if (this.f52408F.isAnimating()) {
            m77078C(this.f52408F, this.f52410H, str);
        } else if (this.f52410H.isAnimating()) {
            m77078C(this.f52410H, this.f52408F, str);
        } else {
            m77078C(this.f52408F, this.f52410H, str);
        }
    }

    /* JADX INFO: renamed from: B */
    public void m77077B(BLiveVoiceCall bLiveVoiceCall) {
        BLiveCallEffectConfig bLiveCallEffectConfig = bLiveVoiceCall.callEffect;
        String str = bLiveCallEffectConfig == null ? "https://fe-static.tancdn.com/v1/raw/44325435-3109-4466-a7a0-1b65574e3fc814.svga" : bLiveCallEffectConfig.circleVoicingUrl;
        if (this.f52409G.isAnimating() && TextUtils.equals(str, this.f52411I)) {
            return;
        }
        this.f52411I = str;
        xdl0.m208344M(this.f52409G, true);
        this.f52409G.mo68502l(this.f52411I, -1, null);
    }

    /* JADX INFO: renamed from: C */
    public void m77078C(AnimEffectPlayer animEffectPlayer, AnimEffectPlayer animEffectPlayer2, String str) {
        animEffectPlayer2.mo68497g(str, -1, new C12962a(animEffectPlayer, animEffectPlayer2), true);
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    /* JADX INFO: renamed from: E */
    public void m77079E() {
        this.f52432u.m77152d0();
    }

    /* JADX INFO: renamed from: F */
    public void m77080F() {
        this.f52418g = null;
        setBottomButtonFunc(true);
        this.f52412a.m77137i();
        setViewPlayingStatus(false);
        xdl0.m208344M(this.f52416e, false);
        m77082H();
        xdl0.m208344M(this.f52410H, false);
        this.f52410H.m68504n();
        xdl0.m208344M(this.f52408F, false);
        this.f52408F.m68504n();
        this.f52420i = "";
    }

    /* JADX INFO: renamed from: G */
    public final void m77081G() {
        if (TextUtils.isEmpty(m77090p())) {
            xdl0.m208344M(this.f52432u, false);
            xdl0.m208344M(this.f52435x, false);
        } else {
            BLiveGiftItem bLiveGiftItemM126026l = ((ggv) ypv.m215673l(fld0.f98148c)).m126026l(m77089n());
            if (!this.f52422k && NullChecker.m81303a(bLiveGiftItemM126026l)) {
                this.f52422k = true;
                axj.m99431e(bLiveGiftItemM126026l, this.f52419h.mo77274R2(), m77090p(), this.f52421j);
            }
            hxs.m133407t("context_single_room", this.f52433v, this.f52418g.quickGiftInfo.url, t100.f167265n);
            this.f52434w.setText(this.f52418g.quickGiftInfo.name);
            this.f52432u.m77147X();
            xdl0.m208344M(this.f52432u, true);
        }
        this.f52435x.setTypeface(Typeface.DEFAULT_BOLD);
    }

    /* JADX INFO: renamed from: H */
    public void m77082H() {
        q2r q2rVar = this.f52419h;
        if (q2rVar != null) {
            xdl0.m208344M(this.f52403A, e0o0.m114322h(q2rVar));
        }
    }

    /* JADX INFO: renamed from: I */
    public void m77083I(String str) {
        if (xdl0.m208349O0(this.f52432u)) {
            if (C4348d.m20896l().m20912x("ktv_press_call_tips")) {
                C4348d.m20896l().m20900k("ktv_press_call_tips");
            }
            C4348d.m20896l().m20900k("ktv_press_call_tips");
            C4345a c4345a = new C4345a(this.f52419h.act());
            c4345a.m20849D(str).m20864e(true).m20870k(this.f52419h.act().getResources().getColor(h1c0.f105357d)).m20855J(14.0f).m20861b(Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS).m20883y(true).m20875q(C4345a.f15680N).m20882x(t100.f167256e);
            C4348d.m20896l().m20909u(c4345a, this.f52432u, "ktv_press_call_tips");
        }
    }

    /* JADX INFO: renamed from: J */
    public void m77084J() {
        this.f52409G.m68504n();
        xdl0.m208344M(this.f52409G, false);
    }

    /* JADX INFO: renamed from: K */
    public void m77085K(int i, int i2, int i3, long j, String str, String str2, String str3) {
        this.f52426o = str2;
        this.f52430s.setText(String.format("%s音浪", x8u.m207433c(j)));
        String str4 = String.format("应援%s级(%s/%s)", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
        if (TextUtils.isEmpty(str)) {
            this.f52419h.m172505m4();
        } else if (!TextUtils.equals(str4, this.f52425n) || !TextUtils.equals(str, this.f52424m)) {
            this.f52424m = str;
            this.f52419h.m172504l4();
        }
        this.f52425n = str4;
        this.f52431t.setText(str4);
        m77076A(str3);
    }

    /* JADX INFO: renamed from: L */
    public void m77086L() {
        boolean zEquals = TextUtils.equals(this.f52431t.getText().toString(), this.f52424m);
        TextView textView = this.f52431t;
        if (zEquals) {
            textView.setText(this.f52425n);
        } else {
            textView.setText(this.f52424m);
        }
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    public BLiveVoiceKtvPlayInfo getPlayInfo() {
        return this.f52418g;
    }

    public VDraweeView get_avatar() {
        return this.f52415d;
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return layoutInflater.inflate(t6c0.f168463o9, (ViewGroup) null);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(q2r q2rVar) {
        this.f52419h = q2rVar;
    }

    /* JADX INFO: renamed from: m */
    public final void m77088m() {
        this.f52412a = (LrcView) findViewById(g5c0.f100741L3);
        this.f52413b = (TextView) findViewById(g5c0.f100940g7);
        this.f52414c = (TextView) findViewById(g5c0.f100897c4);
        this.f52415d = (VDraweeView) findViewById(g5c0.f101054t);
        this.f52416e = findViewById(g5c0.f100653B5);
        this.f52427p = findViewById(g5c0.f100750M3);
        this.f52428q = (TextView) findViewById(g5c0.f101107y7);
        this.f52429r = (TextView) findViewById(g5c0.f101098x7);
        this.f52431t = (TextView) findViewById(g5c0.f101017o7);
        this.f52430s = (TextView) findViewById(g5c0.f101080v7);
        this.f52432u = (VoiceDressCallTouchView) findViewById(g5c0.f100873a0);
        this.f52433v = (VDraweeView) findViewById(g5c0.f100863Z);
        this.f52434w = (TextView) findViewById(g5c0.f100883b0);
        this.f52435x = (TextView) findViewById(g5c0.f100716I5);
        this.f52436y = (TextView) findViewById(g5c0.f100806S5);
        this.f52437z = (ViewGroup) findViewById(g5c0.f100679E4);
        this.f52403A = (TextView) findViewById(g5c0.f101052s6);
        this.f52404B = findViewById(g5c0.f101114z5);
        this.f52405C = (KtvSuggestViewModel) findViewById(g5c0.f100979k6);
        this.f52406D = (TextView) findViewById(g5c0.f100900c7);
        this.f52407E = findViewById(g5c0.f100887b4);
        this.f52408F = (AnimEffectPlayer) findViewById(g5c0.f101039r2);
        this.f52409G = (AnimEffectPlayer) findViewById(g5c0.f100853X7);
        this.f52410H = (AnimEffectPlayer) findViewById(g5c0.f101048s2);
    }

    /* JADX INFO: renamed from: n */
    public int m77089n() {
        if (NullChecker.m81303a(this.f52418g) && NullChecker.m81303a(this.f52418g.quickGiftInfo)) {
            return this.f52418g.quickGiftInfo.giftId;
        }
        return 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (NullChecker.m81303a(this.f52432u)) {
            this.f52432u.m77151b0();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m77088m();
        m77070r();
    }

    /* JADX INFO: renamed from: p */
    public String m77090p() {
        return NullChecker.m81303a(this.f52418g) ? this.f52418g.userId : "";
    }

    /* JADX INFO: renamed from: q */
    public final boolean m77091q(BLiveVoiceKtvPlayInfo bLiveVoiceKtvPlayInfo) {
        if (this.f52418g == null) {
            return false;
        }
        this.f52418g = bLiveVoiceKtvPlayInfo;
        return TextUtils.equals(bLiveVoiceKtvPlayInfo.userId, ypv.f199493a.m199309D0());
    }

    public void setClickCallback(a4r a4rVar) {
        this.f52417f = a4rVar;
    }

    public void setCountDownView(int i) {
        BLiveVoiceKtvPlayInfo bLiveVoiceKtvPlayInfo = this.f52418g;
        if (bLiveVoiceKtvPlayInfo == null || TextUtils.isEmpty(bLiveVoiceKtvPlayInfo.title)) {
            return;
        }
        this.f52429r.setText(String.format(Locale.CHINA, "%ds后播放《%s》", Integer.valueOf(i), this.f52418g.title));
    }

    public void setLrcFile(LrcWrapperBean lrcWrapperBean) {
        this.f52412a.setLrcData(lrcWrapperBean);
        this.f52414c.postDelayed(new Runnable() { // from class: l.r2r
            @Override // java.lang.Runnable
            public final void run() {
                this.f157436a.m77092y();
            }
        }, 1000L);
    }

    public void setMusicProgress(long j) {
        this.f52412a.m77138j((int) j);
    }

    public void setMusicTotal(long j) {
    }

    public void setPauseView(BLiveVoiceKtvPlayInfo bLiveVoiceKtvPlayInfo) {
        this.f52418g = bLiveVoiceKtvPlayInfo;
        if (bLiveVoiceKtvPlayInfo.mask != null) {
            m77093z(bLiveVoiceKtvPlayInfo);
            setBottomButtonFunc(!m77091q(bLiveVoiceKtvPlayInfo));
            xdl0.m208344M(this.f52427p, false);
            xdl0.m208344M(this.f52412a, true);
            xdl0.m208344M(this.f52416e, this.f52423l);
            setViewPlayingStatus(true);
        }
    }

    public void setPlayingView(BLiveVoiceKtvPlayInfo bLiveVoiceKtvPlayInfo) {
        this.f52418g = bLiveVoiceKtvPlayInfo;
        if (bLiveVoiceKtvPlayInfo.mask != null) {
            m77093z(bLiveVoiceKtvPlayInfo);
            setBottomButtonFunc(!m77091q(bLiveVoiceKtvPlayInfo));
            xdl0.m208344M(this.f52412a, true);
            xdl0.m208344M(this.f52427p, false);
            xdl0.m208344M(this.f52416e, this.f52423l);
            setViewPlayingStatus(true);
        }
    }

    public void setPrepareView(BLiveVoiceKtvPlayInfo bLiveVoiceKtvPlayInfo) {
        if (bLiveVoiceKtvPlayInfo == null || bLiveVoiceKtvPlayInfo.mask == null) {
            return;
        }
        this.f52418g = bLiveVoiceKtvPlayInfo;
        m77093z(bLiveVoiceKtvPlayInfo);
        setBottomButtonFunc(true);
        this.f52427p.setVisibility(0);
        this.f52428q.setText("正在加载...");
        this.f52429r.setText(String.format(Locale.CHINA, "%ds后播放《%s》", Long.valueOf(bLiveVoiceKtvPlayInfo.prepareRemainSeconds), bLiveVoiceKtvPlayInfo.title));
        xdl0.m208344M(this.f52412a, false);
        xdl0.m208344M(this.f52416e, this.f52423l);
        this.f52412a.m77137i();
        setViewPlayingStatus(true);
    }

    public void setViewPlayingStatus(boolean z) {
        xdl0.m208344M(this.f52414c, z);
        xdl0.m208344M(this.f52407E, z);
        xdl0.m208344M(this.f52437z, z);
        xdl0.m208344M(this.f52405C, !z);
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m77092y() {
        this.f52414c.onWindowFocusChanged(true);
    }

    /* JADX INFO: renamed from: z */
    public final void m77093z(BLiveVoiceKtvPlayInfo bLiveVoiceKtvPlayInfo) {
        hxs.m133402o("context_live_activities", this.f52415d, bLiveVoiceKtvPlayInfo.mask.avatar);
        this.f52414c.setText(bLiveVoiceKtvPlayInfo.title + "·" + bLiveVoiceKtvPlayInfo.author);
        this.f52423l = bLiveVoiceKtvPlayInfo.showLevel;
        m77085K(bLiveVoiceKtvPlayInfo.level, bLiveVoiceKtvPlayInfo.giftUv, bLiveVoiceKtvPlayInfo.nextLevelGiftUv, bLiveVoiceKtvPlayInfo.score, bLiveVoiceKtvPlayInfo.levelTip, bLiveVoiceKtvPlayInfo.schema, bLiveVoiceKtvPlayInfo.showBgSvgaUrl);
        boolean zIsEmpty = TextUtils.isEmpty(bLiveVoiceKtvPlayInfo.bestSingerName);
        TextView textView = this.f52406D;
        if (zIsEmpty) {
            xdl0.m208344M(textView, false);
        } else {
            xdl0.m208344M(textView, true);
            this.f52406D.setText(bLiveVoiceKtvPlayInfo.bestSingerName);
        }
        this.f52436y.setText(w8u.m202213p(bLiveVoiceKtvPlayInfo.mask.name, 6));
        m77076A(bLiveVoiceKtvPlayInfo.showBgSvgaUrl);
    }

    public KtvNewStageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f52422k = false;
    }

    public KtvNewStageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f52422k = false;
    }
}
