package com.p051p1.mobile.putong.live.livingroom.voice.call.view;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.longlink.msg.voicelivemessage.VoiceMicEmoji;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p051p1.mobile.putong.live.base.data.BLiveAvatarFrameConfig;
import com.p051p1.mobile.putong.live.base.data.BLiveMember;
import com.p051p1.mobile.putong.live.base.data.BLiveUserMask;
import com.p051p1.mobile.putong.live.base.data.BLiveVoice;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceCallHatInfo;
import com.p051p1.mobile.putong.live.base.data.BLiveVoicePkCallInfo;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceRoom;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceRoomCallPlaceResource;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.common.avatar.CommonMaskAvatarView;
import com.p051p1.mobile.putong.live.livingroom.royal.LiveGradientTextView;
import com.p051p1.mobile.putong.live.livingroom.voice.intl.emoji.VoiceTripleDiceView;
import com.tantan.library.svga.AnimListener;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;
import p151v.VDraweeView;
import p151v.VLinear;
import p151v.VText;
import p153l.biv;
import p153l.bnl0;
import p153l.civ;
import p153l.fc2;
import p153l.guk0;
import p153l.gx40;
import p153l.h64;
import p153l.htd0;
import p153l.ixm0;
import p153l.izs;
import p153l.kcg0;
import p153l.l6o0;
import p153l.n3d0;
import p153l.n9c0;
import p153l.nsv;
import p153l.obc0;
import p153l.psd0;
import p153l.ptk0;
import p153l.qa00;
import p153l.qcj;
import p153l.qdh0;
import p153l.rwn0;
import p153l.tcn0;
import p153l.und0;
import p153l.wao0;
import p153l.wft;
import p153l.wo0;
import p153l.xau;
import p153l.yau;
import p153l.zrv;

/* JADX INFO: loaded from: classes5.dex */
public class NormalVoiceDeputyItemView extends RelativeLayout implements tcn0 {

    /* JADX INFO: renamed from: A */
    public qdh0 f53829A;

    /* JADX INFO: renamed from: B */
    public DecimalFormat f53830B;

    /* JADX INFO: renamed from: C */
    public kcg0 f53831C;

    /* JADX INFO: renamed from: D */
    public final AnimListener f53832D;

    /* JADX INFO: renamed from: a */
    public VDraweeView f53833a;

    /* JADX INFO: renamed from: b */
    public FrameLayout f53834b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f53835c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f53836d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f53837e;

    /* JADX INFO: renamed from: f */
    public AnimEffectPlayer f53838f;

    /* JADX INFO: renamed from: g */
    public CommonMaskAvatarView f53839g;

    /* JADX INFO: renamed from: h */
    public VDraweeView f53840h;

    /* JADX INFO: renamed from: i */
    public ImageView f53841i;

    /* JADX INFO: renamed from: j */
    public ImageView f53842j;

    /* JADX INFO: renamed from: k */
    public ImageView f53843k;

    /* JADX INFO: renamed from: l */
    public VText f53844l;

    /* JADX INFO: renamed from: m */
    public VText f53845m;

    /* JADX INFO: renamed from: n */
    public FrameLayout f53846n;

    /* JADX INFO: renamed from: o */
    public AnimEffectPlayer f53847o;

    /* JADX INFO: renamed from: p */
    public VoiceTripleDiceView f53848p;

    /* JADX INFO: renamed from: q */
    public VDraweeView f53849q;

    /* JADX INFO: renamed from: r */
    public VLinear f53850r;

    /* JADX INFO: renamed from: s */
    public VText f53851s;

    /* JADX INFO: renamed from: t */
    public LiveGradientTextView f53852t;

    /* JADX INFO: renamed from: u */
    public VLinear f53853u;

    /* JADX INFO: renamed from: v */
    public ImageView f53854v;

    /* JADX INFO: renamed from: w */
    public SVGAnimationView f53855w;

    /* JADX INFO: renamed from: x */
    public TextView f53856x;

    /* JADX INFO: renamed from: y */
    public String f53857y;

    /* JADX INFO: renamed from: z */
    public Drawable f53858z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.voice.call.view.NormalVoiceDeputyItemView$a */
    public class C13167a extends AnimListener {
        public C13167a() {
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onFinished() {
            super.onFinished();
            SVGAnimationView sVGAnimationView = NormalVoiceDeputyItemView.this.f53855w;
            if (sVGAnimationView != null) {
                bnl0.m105524M(sVGAnimationView, false);
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.voice.call.view.NormalVoiceDeputyItemView$b */
    public class C13168b extends wo0 {
        public C13168b() {
        }

        @Override // p153l.wo0
        /* JADX INFO: renamed from: g */
        public void mo70786g() {
            super.mo70786g();
            NormalVoiceDeputyItemView.this.m79133B(true, false, false);
        }
    }

    public NormalVoiceDeputyItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f53857y = "https://auto.tancdn.com/v1/raw/a5705b18-7436-41ec-8ab5-b094eacd298211.pdf";
        this.f53858z = fc2.m124978h(Integer.MIN_VALUE);
        this.f53832D = new C13167a();
    }

    private String getVoiceAnimUrl() {
        return this.f53857y;
    }

    /* JADX INFO: renamed from: A */
    public final void m79132A(TextView textView, int i) {
        textView.setMaxEms(i);
        textView.setEllipsize(TextUtils.TruncateAt.END);
    }

    /* JADX INFO: renamed from: B */
    public final void m79133B(boolean z, boolean z2, boolean z3) {
        bnl0.m105524M(this.f53846n, z || z2 || z3);
        bnl0.m105524M(this.f53847o, z);
        bnl0.m105524M(this.f53849q, z2);
        bnl0.m105524M(this.f53848p, z3);
    }

    /* JADX INFO: renamed from: C */
    public final void m79134C(boolean z) {
        this.f53839g.getRealAvatarView().getHierarchy().m207040C(z ? this.f53858z : null);
    }

    @Override // p153l.tcn0
    /* JADX INFO: renamed from: D */
    public void mo79135D(@NonNull BLiveVoiceCall bLiveVoiceCall) {
        if (bLiveVoiceCall.mutedByAnchor || bLiveVoiceCall.mutedByUser || !bLiveVoiceCall.isSpeak || guk0.m132332k(bLiveVoiceCall)) {
            this.f53839g.m73312t0();
        } else {
            this.f53839g.m73311s0();
        }
    }

    /* JADX INFO: renamed from: E */
    public final void m79136E(BLiveVoiceCall bLiveVoiceCall) {
        boolean zEquals = ptk0.f154095e.equals(bLiveVoiceCall.awayReason);
        ImageView imageView = this.f53843k;
        if (!zEquals) {
            bnl0.m105524M(imageView, false);
        } else {
            bnl0.m105524M(imageView, true);
            this.f53843k.setImageResource(obc0.f146027F1);
        }
    }

    /* JADX INFO: renamed from: F */
    public void m79137F() {
        AnimEffectPlayer animEffectPlayer = this.f53847o;
        if (animEffectPlayer != null) {
            animEffectPlayer.m69687n();
        }
        VoiceTripleDiceView voiceTripleDiceView = this.f53848p;
        if (voiceTripleDiceView != null) {
            voiceTripleDiceView.m79314g();
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m79138G() {
        AnimEffectPlayer animEffectPlayer = this.f53838f;
        if (animEffectPlayer != null) {
            animEffectPlayer.stopAnimation(true);
        }
    }

    /* JADX INFO: renamed from: H */
    public String m79139H(double d) {
        if (this.f53830B == null) {
            try {
                DecimalFormat decimalFormat = (DecimalFormat) NumberFormat.getNumberInstance(new Locale("en", "US"));
                this.f53830B = decimalFormat;
                decimalFormat.applyPattern("#,###");
            } catch (Exception e) {
                CrashHelper.m82479c(e);
                this.f53830B = new DecimalFormat("#,###");
            }
        }
        return this.f53830B.format(d);
    }

    @Override // p153l.tcn0
    /* JADX INFO: renamed from: a */
    public void mo79140a(BLiveVoiceCall bLiveVoiceCall) {
        if (bLiveVoiceCall.mutedByAnchor || bLiveVoiceCall.mutedByUser || !bLiveVoiceCall.isSpeak || guk0.m132332k(bLiveVoiceCall)) {
            m79138G();
        } else {
            m79156w();
        }
    }

    @Override // p153l.tcn0
    /* JADX INFO: renamed from: b */
    public void mo79141b(List<VoiceMicEmoji.EmojiPlayResult> list, String str) {
        m79137F();
        if (m79155v(list, str)) {
            if (TextUtils.isEmpty(list.get(0).getContentPic())) {
                mo79149j();
                return;
            } else {
                this.f53848p.m79310c(list.get(0).getContentPic(), list.get(1).getContentPic(), list.get(2).getContentPic());
                m79133B(false, false, true);
                return;
            }
        }
        if (list.size() < 1 || TextUtils.isEmpty(list.get(0).getContentPic())) {
            mo79149j();
        } else {
            izs.m142868s("context_single_room", this.f53849q, list.get(0).getContentPic());
            m79133B(false, true, false);
        }
    }

    @Override // p153l.tcn0
    /* JADX INFO: renamed from: c */
    public void mo79142c(final int i, @NonNull final ixm0<?> ixm0Var) {
        this.f53839g.setOnClickListener(new View.OnClickListener() { // from class: l.bx40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ixm0Var.m142571i4(Integer.valueOf(i));
            }
        });
        this.f53836d.setOnClickListener(new View.OnClickListener() { // from class: l.cx40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ixm0Var.m142571i4(Integer.valueOf(i));
            }
        });
        this.f53837e.setOnClickListener(new View.OnClickListener() { // from class: l.dx40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ixm0Var.m142571i4(Integer.valueOf(i));
            }
        });
    }

    @Override // p153l.tcn0
    /* JADX INFO: renamed from: d */
    public void mo79143d(List<VoiceMicEmoji.EmojiPlayResult> list, String str, String str2) {
        if (m79155v(list, str)) {
            m79133B(false, false, true);
            if (this.f53848p.m79309b() && this.f53848p.getTag() != null && ((String) this.f53848p.getTag()).equals(str2)) {
                return;
            }
            this.f53848p.m79313f(list);
            this.f53848p.setTag(str2);
            return;
        }
        if (list.size() < 1) {
            return;
        }
        if (this.f53847o.isAnimating() && this.f53847o.getTag() != null && ((String) this.f53847o.getTag()).equals(str2)) {
            m79133B(true, false, false);
        } else {
            this.f53847o.mo69685l(list.get(0).getLoadingSvg(), -1, new C13168b());
            this.f53847o.setTag(str2);
        }
    }

    @Override // p153l.tcn0
    /* JADX INFO: renamed from: e */
    public void mo79144e(@NonNull BLiveVoiceCall bLiveVoiceCall, @Nullable BLiveMember bLiveMember, @NonNull nsv<h64> nsvVar, @NonNull ixm0<?> ixm0Var, @Nullable wao0 wao0Var) {
        bnl0.m105524M(this.f53839g, true);
        BLiveVoice bLiveVoiceMo183435j = ((rwn0) ixm0Var.m213810E2()).mo183435j();
        if (guk0.m132332k(bLiveVoiceCall)) {
            m79136E(bLiveVoiceCall);
            m79138G();
        } else if (bLiveVoiceCall.mutedByAnchor || bLiveVoiceCall.mutedByUser) {
            this.f53843k.setImageResource(obc0.f146407l9);
            bnl0.m105524M(this.f53843k, true);
            m79134C(true);
            m79138G();
        } else {
            this.f53843k.setImageDrawable(null);
            m79134C(false);
        }
        und0.m196834b(this.f53852t, nsvVar.f143542a.f107998b, -1, bLiveVoiceCall.userNameGradientColors);
        this.f53851s.setText(String.valueOf(bLiveVoiceCall.position + 1));
        bnl0.m105524M(this.f53851s, true);
        bnl0.m105524M(this.f53836d, false);
        if (bLiveVoiceCall.intendPosition == 0 && m79154u(ixm0Var, bLiveVoiceCall.user)) {
            boolean zM132325d = guk0.m132325d(bLiveVoiceCall);
            VText vText = this.f53844l;
            if (zM132325d) {
                vText.setText(xau.m209910t(R$string.f48397ti));
                this.f53844l.setBackgroundResource(obc0.f145965A);
            } else {
                vText.setText(xau.m209910t(R$string.f48416uf));
                this.f53844l.setBackgroundResource(obc0.f146482s0);
            }
            bnl0.m105524M(this.f53844l, true);
        } else if (bLiveMember == null || !bLiveMember.isManager) {
            bnl0.m105524M(this.f53844l, false);
        } else {
            this.f53844l.setBackgroundResource(obc0.f145977B);
            this.f53844l.setText(xau.m209910t(R$string.f48210l7));
            bnl0.m105524M(this.f53844l, true);
        }
        m79158y(bLiveVoiceCall, nsvVar, bLiveVoiceMo183435j);
        m79153t(wao0Var);
        m79152s(nsvVar);
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [l.oo2, l.vp20] */
    /* JADX WARN: Type inference failed for: r6v3, types: [l.oo2, l.vp20] */
    @Override // p153l.tcn0
    /* JADX INFO: renamed from: f */
    public void mo79145f(int i, ixm0 ixm0Var) {
        bnl0.m105524M(this.f53851s, false);
        bnl0.m105524M(this.f53842j, false);
        bnl0.m105524M(this.f53843k, false);
        this.f53852t.setTextColor(Color.parseColor("#4DFFFFFF"));
        this.f53852t.setText(getContext().getString(R$string.f47683Mf, Integer.valueOf(i)));
        m79132A(this.f53852t, 4);
        bnl0.m105524M(this.f53839g, false);
        bnl0.m105524M(this.f53836d, true);
        bnl0.m105524M(this.f53844l, false);
        this.f53853u.setVisibility(4);
        this.f53856x.setText("0");
        m79138G();
        m79134C(false);
        BLiveAbsData bLiveAbsDataMo183435j = ixm0Var.m213810E2().mo183435j();
        if (NullChecker.m82486a(bLiveAbsDataMo183435j) && BLiveVoice.VOICE_LIVE_MODEL_BOSS.equals(bLiveAbsDataMo183435j.liveMode) && i == 9) {
            this.f53852t.setText("BOSS");
            bnl0.m105524M(this.f53845m, true);
            bnl0.m105524M(this.f53837e, true);
            bnl0.m105524M(this.f53836d, false);
        }
        bnl0.m105524M(this.f53833a, false);
        bnl0.m105524M(this.f53855w, false);
        m79133B(false, false, false);
        m79151r((BLiveVoiceRoom) ixm0Var.m213810E2().mo183440n());
    }

    @Override // p153l.tcn0
    /* JADX INFO: renamed from: g */
    public void mo79146g(String str) {
        izs.m142870u("context_single_room", this.f53840h, str, qa00.m175859d(44.0f), qa00.m175859d(44.0f));
    }

    public CommonMaskAvatarView getAvatarView() {
        return this.f53839g;
    }

    @Override // p153l.tcn0
    /* JADX INFO: renamed from: h */
    public void mo79147h(int i, boolean z, ixm0 ixm0Var) {
        mo79145f(i, ixm0Var);
        if (z) {
            this.f53839g.m73302i0();
        }
    }

    @Override // p153l.tcn0
    /* JADX INFO: renamed from: i */
    public void mo79148i(float f) {
        CommonMaskAvatarView commonMaskAvatarView = this.f53839g;
        if (f > 0.0f) {
            commonMaskAvatarView.m73307n0(f);
        } else {
            commonMaskAvatarView.m73303j0();
        }
    }

    @Override // p153l.tcn0
    /* JADX INFO: renamed from: j */
    public void mo79149j() {
        m79137F();
        m79133B(false, false, false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m79138G();
        m79137F();
        this.f53839g.m73302i0();
        psd0.m173633z(this.f53831C);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m79150q(this);
        this.f53829A = new qdh0(this.f53838f, null);
        this.f53848p.m79311d(qa00.m175859d(33.0f), qa00.m175859d(33.0f), -qa00.m175859d(7.0f), -qa00.m175859d(10.5f));
        this.f53847o.setClearsAfterStop(true);
    }

    /* JADX INFO: renamed from: q */
    public final void m79150q(View view) {
        gx40.m132744a(this, view);
    }

    /* JADX INFO: renamed from: r */
    public final void m79151r(@Nullable BLiveVoiceRoom bLiveVoiceRoom) {
        BLiveVoiceRoomCallPlaceResource bLiveVoiceRoomCallPlaceResource = bLiveVoiceRoom != null ? bLiveVoiceRoom.callPlaceResource : null;
        if (bLiveVoiceRoomCallPlaceResource == null) {
            m79159z();
            return;
        }
        if (!TextUtils.isEmpty(bLiveVoiceRoomCallPlaceResource.bgUrl)) {
            izs.m142874y(this.f53835c, bLiveVoiceRoomCallPlaceResource.bgUrl);
        }
        if (!TextUtils.isEmpty(bLiveVoiceRoomCallPlaceResource.addUrl)) {
            izs.m142874y(this.f53836d, bLiveVoiceRoomCallPlaceResource.addUrl);
        }
        if (!TextUtils.isEmpty(bLiveVoiceRoomCallPlaceResource.bossUrl)) {
            izs.m142874y(this.f53837e, bLiveVoiceRoomCallPlaceResource.bossUrl);
        }
        if (TextUtils.isEmpty(bLiveVoiceRoomCallPlaceResource.indexColor)) {
            return;
        }
        this.f53852t.setTextColor(n3d0.m161283g(bLiveVoiceRoomCallPlaceResource.indexColor));
    }

    /* JADX INFO: renamed from: s */
    public final void m79152s(nsv<h64> nsvVar) {
        if (wft.m206159b(3)) {
            return;
        }
        l6o0 l6o0VarM153068c = l6o0.m153068c(nsvVar);
        BLiveAvatarFrameConfig bLiveAvatarFrameConfig = l6o0VarM153068c.f130275b.avatarConfig.frameConfig;
        if (bLiveAvatarFrameConfig.changeVoiceNo == 0 || bLiveAvatarFrameConfig.remainingSec <= 0) {
            this.f53839g.m73303j0();
            return;
        }
        CommonMaskAvatarView commonMaskAvatarView = this.f53839g;
        int iM175859d = qa00.m175859d(58.0f);
        BLiveUserMask bLiveUserMask = l6o0VarM153068c.f130275b;
        biv.m104522g(commonMaskAvatarView, iM175859d, bLiveUserMask.avatar, bLiveUserMask.avatarConfig.frameConfig.staticUrl, "");
    }

    public void setItemPlaceRes(int i) {
        this.f53836d.setImageResource(i);
    }

    public void setVoiceAnimUrl(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f53857y = str;
    }

    /* JADX INFO: renamed from: t */
    public final void m79153t(wao0 wao0Var) {
        if (wao0Var == null) {
            mo79149j();
            return;
        }
        int iM205662b = wao0Var.m205662b();
        if (iM205662b == wao0.f188144f) {
            mo79143d(wao0Var.m205664d(), wao0Var.m205665e(), wao0Var.f188150e);
        } else if (iM205662b == wao0.f188145g) {
            mo79141b(wao0Var.m205664d(), wao0Var.m205665e());
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.oo2] */
    /* JADX INFO: renamed from: u */
    public final boolean m79154u(ixm0 ixm0Var, String str) {
        User userM168532l0 = ixm0Var.m213810E2().m168532l0();
        return userM168532l0 != null && TextUtils.equals(str, userM168532l0.f56859id);
    }

    /* JADX INFO: renamed from: v */
    public final boolean m79155v(List<VoiceMicEmoji.EmojiPlayResult> list, String str) {
        return "emojiRandomTripleDice".equals(str) && list.size() >= 3;
    }

    /* JADX INFO: renamed from: w */
    public final void m79156w() {
        if (this.f53838f.isAnimating()) {
            return;
        }
        this.f53838f.mo69685l(getVoiceAnimUrl(), -1, this.f53829A);
    }

    /* JADX INFO: renamed from: x */
    public final void m79157x(double d) {
        TextView textView = this.f53856x;
        if (d > 9.9999999E7d) {
            textView.setText(yau.m214935c(d));
        } else {
            textView.setText(m79139H(d));
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m79158y(BLiveVoiceCall bLiveVoiceCall, nsv<h64> nsvVar, BLiveVoice bLiveVoice) {
        this.f53853u.setVisibility(0);
        bnl0.m105524M(this.f53855w, false);
        this.f53856x.setTextColor(getContext().getResources().getColor(n9c0.f140823e1));
        bnl0.m105524M(this.f53833a, false);
        BLiveVoicePkCallInfo bLiveVoicePkCallInfo = bLiveVoiceCall.pkCallInfo;
        if (bLiveVoicePkCallInfo == null || !TextUtils.isEmpty(bLiveVoicePkCallInfo.mvpBg)) {
            bnl0.m105524M(this.f53833a, true);
            izs.m142868s("context_single_room", this.f53833a, bLiveVoiceCall.pkCallInfo.mvpBg);
        } else {
            bnl0.m105524M(this.f53833a, false);
        }
        if ("pkPoint".equals(bLiveVoiceCall.pointType)) {
            this.f53856x.setText(yau.m214935c(bLiveVoiceCall.pkCallInfo.point));
            boolean z = bLiveVoiceCall.pkCallInfo.isNewTopOne;
            ImageView imageView = this.f53854v;
            if (z) {
                imageView.setImageResource(obc0.f146242X9);
                this.f53856x.setTextColor(Color.parseColor("#FFB522"));
            } else {
                imageView.setImageResource(obc0.f146231W9);
            }
            if (bLiveVoiceCall.pkCallInfo.isShowAnim) {
                SVGALoader.with(getContext()).from("https://fe-static.tancdn.com/v1/raw/7cede117-0c4a-4dfd-99a4-4a3e353b993214.svga").autoPlay(true).repeatCount(1).animListener(this.f53832D).into(this.f53855w);
                bnl0.m105524M(this.f53855w, true);
            }
            biv.m104518c(this.f53839g, qa00.m175859d(58.0f), nsvVar, new qcj() { // from class: l.ex40
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((h64) obj).f107999c;
                }
            }, 1);
            return;
        }
        if ("lovePoint".equals(bLiveVoiceCall.pointType)) {
            BLiveVoiceCallHatInfo bLiveVoiceCallHatInfo = bLiveVoiceCall.hatInfo;
            TextView textView = this.f53856x;
            if (bLiveVoiceCallHatInfo == null) {
                textView.setText("0");
            } else {
                textView.setText(yau.m214935c(bLiveVoiceCallHatInfo.point));
            }
            this.f53854v.setImageResource(obc0.f146077J3);
            l6o0 l6o0VarM153068c = l6o0.m153068c(nsvVar);
            if (l6o0VarM153068c.m153072e()) {
                BLiveVoiceCallHatInfo bLiveVoiceCallHatInfo2 = bLiveVoiceCall.hatInfo;
                if (bLiveVoiceCallHatInfo2 == null || TextUtils.isEmpty(bLiveVoiceCallHatInfo2.hatUrl)) {
                    biv.m104526k(this.f53839g, qa00.m175859d(58.0f), l6o0VarM153068c.f130275b);
                    return;
                } else {
                    biv.m104522g(this.f53839g, qa00.m175859d(58.0f), l6o0VarM153068c.f130275b.avatar, "", bLiveVoiceCall.hatInfo.hatUrl);
                    return;
                }
            }
            return;
        }
        biv.m104518c(this.f53839g, qa00.m175859d(58.0f), nsvVar, new qcj() { // from class: l.fx40
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((h64) obj).f107999c;
            }
        }, 1);
        if (!NullChecker.m82486a(bLiveVoice) || !BLiveVoice.VOICE_LIVE_MODEL_BOSS.equals(bLiveVoice.liveMode)) {
            this.f53854v.setImageResource(((civ) zrv.m221194l(htd0.f111524f)).m109970n() ? obc0.f146455p9 : obc0.f146431n9);
            this.f53856x.setText(yau.m214935c(bLiveVoiceCall.userRecvRewardPoint));
            return;
        }
        if (bLiveVoiceCall.position != BLiveVoice.VOICE_NINE_MIC_BOSS_POSITION) {
            this.f53854v.setImageResource(obc0.f146220V9);
            m79157x(bLiveVoiceCall.popularity);
            return;
        }
        bnl0.m105524M(this.f53844l, false);
        bnl0.m105524M(this.f53845m, true);
        bnl0.m105524M(this.f53851s, false);
        und0.m196834b(this.f53852t, nsvVar.f143542a.f107998b, Color.parseColor("#FFE2AB"), bLiveVoiceCall.userNameGradientColors);
        this.f53856x.setTextColor(getContext().getResources().getColor(n9c0.f140788P0));
        this.f53854v.setImageResource(obc0.f146198T9);
        this.f53856x.setText(yau.m214935c(bLiveVoiceCall.contribution));
    }

    /* JADX INFO: renamed from: z */
    public final void m79159z() {
        this.f53835c.setImageResource(obc0.f146167R0);
        this.f53836d.setImageResource(obc0.f146419m9);
        this.f53837e.setImageResource(obc0.f146209U9);
        this.f53851s.setTextColor(Color.parseColor("#FFFFFF"));
    }

    public NormalVoiceDeputyItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public NormalVoiceDeputyItemView(Context context) {
        this(context, null);
    }
}
