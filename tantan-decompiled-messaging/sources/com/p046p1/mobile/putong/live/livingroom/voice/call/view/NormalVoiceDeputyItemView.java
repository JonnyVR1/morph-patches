package com.p046p1.mobile.putong.live.livingroom.voice.call.view;

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
import com.p046p1.mobile.longlink.msg.voicelivemessage.VoiceMicEmoji;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p046p1.mobile.putong.live.base.data.BLiveAvatarFrameConfig;
import com.p046p1.mobile.putong.live.base.data.BLiveMember;
import com.p046p1.mobile.putong.live.base.data.BLiveUserMask;
import com.p046p1.mobile.putong.live.base.data.BLiveVoice;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceCallHatInfo;
import com.p046p1.mobile.putong.live.base.data.BLiveVoicePkCallInfo;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceRoom;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceRoomCallPlaceResource;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.common.avatar.CommonMaskAvatarView;
import com.p046p1.mobile.putong.live.livingroom.royal.LiveGradientTextView;
import com.p046p1.mobile.putong.live.livingroom.voice.intl.emoji.VoiceTripleDiceView;
import com.tantan.library.svga.AnimListener;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;
import p147v.VDraweeView;
import p147v.VLinear;
import p147v.VText;
import p149l.agv;
import p149l.alk0;
import p149l.ap0;
import p149l.bgv;
import p149l.c4g0;
import p149l.eom0;
import p149l.fld0;
import p149l.h1c0;
import p149l.hxn0;
import p149l.hxs;
import p149l.i3c0;
import p149l.i54;
import p149l.i5h0;
import p149l.jkk0;
import p149l.kvc0;
import p149l.mkd0;
import p149l.mqv;
import p149l.nnn0;
import p149l.p3n0;
import p149l.rfd0;
import p149l.s1o0;
import p149l.so40;
import p149l.t100;
import p149l.vdt;
import p149l.w8u;
import p149l.w9j;
import p149l.x8u;
import p149l.xdl0;
import p149l.yb2;
import p149l.ypv;

/* JADX INFO: loaded from: classes5.dex */
public class NormalVoiceDeputyItemView extends RelativeLayout implements p3n0 {

    /* JADX INFO: renamed from: A */
    public i5h0 f52981A;

    /* JADX INFO: renamed from: B */
    public DecimalFormat f52982B;

    /* JADX INFO: renamed from: C */
    public c4g0 f52983C;

    /* JADX INFO: renamed from: D */
    public final AnimListener f52984D;

    /* JADX INFO: renamed from: a */
    public VDraweeView f52985a;

    /* JADX INFO: renamed from: b */
    public FrameLayout f52986b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f52987c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f52988d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f52989e;

    /* JADX INFO: renamed from: f */
    public AnimEffectPlayer f52990f;

    /* JADX INFO: renamed from: g */
    public CommonMaskAvatarView f52991g;

    /* JADX INFO: renamed from: h */
    public VDraweeView f52992h;

    /* JADX INFO: renamed from: i */
    public ImageView f52993i;

    /* JADX INFO: renamed from: j */
    public ImageView f52994j;

    /* JADX INFO: renamed from: k */
    public ImageView f52995k;

    /* JADX INFO: renamed from: l */
    public VText f52996l;

    /* JADX INFO: renamed from: m */
    public VText f52997m;

    /* JADX INFO: renamed from: n */
    public FrameLayout f52998n;

    /* JADX INFO: renamed from: o */
    public AnimEffectPlayer f52999o;

    /* JADX INFO: renamed from: p */
    public VoiceTripleDiceView f53000p;

    /* JADX INFO: renamed from: q */
    public VDraweeView f53001q;

    /* JADX INFO: renamed from: r */
    public VLinear f53002r;

    /* JADX INFO: renamed from: s */
    public VText f53003s;

    /* JADX INFO: renamed from: t */
    public LiveGradientTextView f53004t;

    /* JADX INFO: renamed from: u */
    public VLinear f53005u;

    /* JADX INFO: renamed from: v */
    public ImageView f53006v;

    /* JADX INFO: renamed from: w */
    public SVGAnimationView f53007w;

    /* JADX INFO: renamed from: x */
    public TextView f53008x;

    /* JADX INFO: renamed from: y */
    public String f53009y;

    /* JADX INFO: renamed from: z */
    public Drawable f53010z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.voice.call.view.NormalVoiceDeputyItemView$a */
    public class C13004a extends AnimListener {
        public C13004a() {
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onFinished() {
            super.onFinished();
            SVGAnimationView sVGAnimationView = NormalVoiceDeputyItemView.this.f53007w;
            if (sVGAnimationView != null) {
                xdl0.m208344M(sVGAnimationView, false);
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.voice.call.view.NormalVoiceDeputyItemView$b */
    public class C13005b extends ap0 {
        public C13005b() {
        }

        @Override // p149l.ap0
        /* JADX INFO: renamed from: g */
        public void mo69603g() {
            super.mo69603g();
            NormalVoiceDeputyItemView.this.m77950B(true, false, false);
        }
    }

    public NormalVoiceDeputyItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f53009y = "https://auto.tancdn.com/v1/raw/a5705b18-7436-41ec-8ab5-b094eacd298211.pdf";
        this.f53010z = yb2.m213883h(Integer.MIN_VALUE);
        this.f52984D = new C13004a();
    }

    private String getVoiceAnimUrl() {
        return this.f53009y;
    }

    /* JADX INFO: renamed from: A */
    public final void m77949A(TextView textView, int i) {
        textView.setMaxEms(i);
        textView.setEllipsize(TextUtils.TruncateAt.END);
    }

    /* JADX INFO: renamed from: B */
    public final void m77950B(boolean z, boolean z2, boolean z3) {
        xdl0.m208344M(this.f52998n, z || z2 || z3);
        xdl0.m208344M(this.f52999o, z);
        xdl0.m208344M(this.f53001q, z2);
        xdl0.m208344M(this.f53000p, z3);
    }

    /* JADX INFO: renamed from: C */
    public final void m77951C(boolean z) {
        this.f52991g.getRealAvatarView().getHierarchy().m112048C(z ? this.f53010z : null);
    }

    @Override // p149l.p3n0
    /* JADX INFO: renamed from: D */
    public void mo77952D(@NonNull BLiveVoiceCall bLiveVoiceCall) {
        if (bLiveVoiceCall.mutedByAnchor || bLiveVoiceCall.mutedByUser || !bLiveVoiceCall.isSpeak || alk0.m97312k(bLiveVoiceCall)) {
            this.f52991g.m72129t0();
        } else {
            this.f52991g.m72128s0();
        }
    }

    /* JADX INFO: renamed from: E */
    public final void m77953E(BLiveVoiceCall bLiveVoiceCall) {
        boolean zEquals = jkk0.f118395e.equals(bLiveVoiceCall.awayReason);
        ImageView imageView = this.f52995k;
        if (!zEquals) {
            xdl0.m208344M(imageView, false);
        } else {
            xdl0.m208344M(imageView, true);
            this.f52995k.setImageResource(i3c0.f110699F1);
        }
    }

    /* JADX INFO: renamed from: F */
    public void m77954F() {
        AnimEffectPlayer animEffectPlayer = this.f52999o;
        if (animEffectPlayer != null) {
            animEffectPlayer.m68504n();
        }
        VoiceTripleDiceView voiceTripleDiceView = this.f53000p;
        if (voiceTripleDiceView != null) {
            voiceTripleDiceView.m78131g();
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m77955G() {
        AnimEffectPlayer animEffectPlayer = this.f52990f;
        if (animEffectPlayer != null) {
            animEffectPlayer.stopAnimation(true);
        }
    }

    /* JADX INFO: renamed from: H */
    public String m77956H(double d) {
        if (this.f52982B == null) {
            try {
                DecimalFormat decimalFormat = (DecimalFormat) NumberFormat.getNumberInstance(new Locale("en", "US"));
                this.f52982B = decimalFormat;
                decimalFormat.applyPattern("#,###");
            } catch (Exception e) {
                CrashHelper.m81296c(e);
                this.f52982B = new DecimalFormat("#,###");
            }
        }
        return this.f52982B.format(d);
    }

    @Override // p149l.p3n0
    /* JADX INFO: renamed from: a */
    public void mo77957a(BLiveVoiceCall bLiveVoiceCall) {
        if (bLiveVoiceCall.mutedByAnchor || bLiveVoiceCall.mutedByUser || !bLiveVoiceCall.isSpeak || alk0.m97312k(bLiveVoiceCall)) {
            m77955G();
        } else {
            m77973w();
        }
    }

    @Override // p149l.p3n0
    /* JADX INFO: renamed from: b */
    public void mo77958b(List<VoiceMicEmoji.EmojiPlayResult> list, String str) {
        m77954F();
        if (m77972v(list, str)) {
            if (TextUtils.isEmpty(list.get(0).getContentPic())) {
                mo77966j();
                return;
            } else {
                this.f53000p.m78127c(list.get(0).getContentPic(), list.get(1).getContentPic(), list.get(2).getContentPic());
                m77950B(false, false, true);
                return;
            }
        }
        if (list.size() < 1 || TextUtils.isEmpty(list.get(0).getContentPic())) {
            mo77966j();
        } else {
            hxs.m133406s("context_single_room", this.f53001q, list.get(0).getContentPic());
            m77950B(false, true, false);
        }
    }

    @Override // p149l.p3n0
    /* JADX INFO: renamed from: c */
    public void mo77959c(final int i, @NonNull final eom0<?> eom0Var) {
        this.f52991g.setOnClickListener(new View.OnClickListener() { // from class: l.no40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                eom0Var.m117402i4(Integer.valueOf(i));
            }
        });
        this.f52988d.setOnClickListener(new View.OnClickListener() { // from class: l.oo40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                eom0Var.m117402i4(Integer.valueOf(i));
            }
        });
        this.f52989e.setOnClickListener(new View.OnClickListener() { // from class: l.po40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                eom0Var.m117402i4(Integer.valueOf(i));
            }
        });
    }

    @Override // p149l.p3n0
    /* JADX INFO: renamed from: d */
    public void mo77960d(List<VoiceMicEmoji.EmojiPlayResult> list, String str, String str2) {
        if (m77972v(list, str)) {
            m77950B(false, false, true);
            if (this.f53000p.m78126b() && this.f53000p.getTag() != null && ((String) this.f53000p.getTag()).equals(str2)) {
                return;
            }
            this.f53000p.m78130f(list);
            this.f53000p.setTag(str2);
            return;
        }
        if (list.size() < 1) {
            return;
        }
        if (this.f52999o.isAnimating() && this.f52999o.getTag() != null && ((String) this.f52999o.getTag()).equals(str2)) {
            m77950B(true, false, false);
        } else {
            this.f52999o.mo68502l(list.get(0).getLoadingSvg(), -1, new C13005b());
            this.f52999o.setTag(str2);
        }
    }

    @Override // p149l.p3n0
    /* JADX INFO: renamed from: e */
    public void mo77961e(@NonNull BLiveVoiceCall bLiveVoiceCall, @Nullable BLiveMember bLiveMember, @NonNull mqv<i54> mqvVar, @NonNull eom0<?> eom0Var, @Nullable s1o0 s1o0Var) {
        xdl0.m208344M(this.f52991g, true);
        BLiveVoice bLiveVoiceMo149813j = ((nnn0) eom0Var.m206027E2()).mo149813j();
        if (alk0.m97312k(bLiveVoiceCall)) {
            m77953E(bLiveVoiceCall);
            m77955G();
        } else if (bLiveVoiceCall.mutedByAnchor || bLiveVoiceCall.mutedByUser) {
            this.f52995k.setImageResource(i3c0.f111079l9);
            xdl0.m208344M(this.f52995k, true);
            m77951C(true);
            m77955G();
        } else {
            this.f52995k.setImageDrawable(null);
            m77951C(false);
        }
        rfd0.m179126b(this.f53004t, mqvVar.f135304a.f111521b, -1, bLiveVoiceCall.userNameGradientColors);
        this.f53003s.setText(String.valueOf(bLiveVoiceCall.position + 1));
        xdl0.m208344M(this.f53003s, true);
        xdl0.m208344M(this.f52988d, false);
        if (bLiveVoiceCall.intendPosition == 0 && m77971u(eom0Var, bLiveVoiceCall.user)) {
            boolean zM97305d = alk0.m97305d(bLiveVoiceCall);
            VText vText = this.f52996l;
            if (zM97305d) {
                vText.setText(w8u.m202217t(R$string.f47549ti));
                this.f52996l.setBackgroundResource(i3c0.f110637A);
            } else {
                vText.setText(w8u.m202217t(R$string.f47568uf));
                this.f52996l.setBackgroundResource(i3c0.f111154s0);
            }
            xdl0.m208344M(this.f52996l, true);
        } else if (bLiveMember == null || !bLiveMember.isManager) {
            xdl0.m208344M(this.f52996l, false);
        } else {
            this.f52996l.setBackgroundResource(i3c0.f110649B);
            this.f52996l.setText(w8u.m202217t(R$string.f47362l7));
            xdl0.m208344M(this.f52996l, true);
        }
        m77975y(bLiveVoiceCall, mqvVar, bLiveVoiceMo149813j);
        m77970t(s1o0Var);
        m77969s(mqvVar);
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r6v3, types: [l.ho2, l.lh20] */
    @Override // p149l.p3n0
    /* JADX INFO: renamed from: f */
    public void mo77962f(int i, eom0 eom0Var) {
        xdl0.m208344M(this.f53003s, false);
        xdl0.m208344M(this.f52994j, false);
        xdl0.m208344M(this.f52995k, false);
        this.f53004t.setTextColor(Color.parseColor("#4DFFFFFF"));
        this.f53004t.setText(getContext().getString(R$string.f46835Mf, Integer.valueOf(i)));
        m77949A(this.f53004t, 4);
        xdl0.m208344M(this.f52991g, false);
        xdl0.m208344M(this.f52988d, true);
        xdl0.m208344M(this.f52996l, false);
        this.f53005u.setVisibility(4);
        this.f53008x.setText("0");
        m77955G();
        m77951C(false);
        BLiveAbsData bLiveAbsDataMo149813j = eom0Var.m206027E2().mo149813j();
        if (NullChecker.m81303a(bLiveAbsDataMo149813j) && BLiveVoice.VOICE_LIVE_MODEL_BOSS.equals(bLiveAbsDataMo149813j.liveMode) && i == 9) {
            this.f53004t.setText("BOSS");
            xdl0.m208344M(this.f52997m, true);
            xdl0.m208344M(this.f52989e, true);
            xdl0.m208344M(this.f52988d, false);
        }
        xdl0.m208344M(this.f52985a, false);
        xdl0.m208344M(this.f53007w, false);
        m77950B(false, false, false);
        m77968r((BLiveVoiceRoom) eom0Var.m206027E2().mo149817n());
    }

    @Override // p149l.p3n0
    /* JADX INFO: renamed from: g */
    public void mo77963g(String str) {
        hxs.m133408u("context_single_room", this.f52992h, str, t100.m186890d(44.0f), t100.m186890d(44.0f));
    }

    public CommonMaskAvatarView getAvatarView() {
        return this.f52991g;
    }

    @Override // p149l.p3n0
    /* JADX INFO: renamed from: h */
    public void mo77964h(int i, boolean z, eom0 eom0Var) {
        mo77962f(i, eom0Var);
        if (z) {
            this.f52991g.m72119i0();
        }
    }

    @Override // p149l.p3n0
    /* JADX INFO: renamed from: i */
    public void mo77965i(float f) {
        CommonMaskAvatarView commonMaskAvatarView = this.f52991g;
        if (f > 0.0f) {
            commonMaskAvatarView.m72124n0(f);
        } else {
            commonMaskAvatarView.m72120j0();
        }
    }

    @Override // p149l.p3n0
    /* JADX INFO: renamed from: j */
    public void mo77966j() {
        m77954F();
        m77950B(false, false, false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m77955G();
        m77954F();
        this.f52991g.m72119i0();
        mkd0.m154992z(this.f52983C);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m77967q(this);
        this.f52981A = new i5h0(this.f52990f, null);
        this.f53000p.m78128d(t100.m186890d(33.0f), t100.m186890d(33.0f), -t100.m186890d(7.0f), -t100.m186890d(10.5f));
        this.f52999o.setClearsAfterStop(true);
    }

    /* JADX INFO: renamed from: q */
    public final void m77967q(View view) {
        so40.m185235a(this, view);
    }

    /* JADX INFO: renamed from: r */
    public final void m77968r(@Nullable BLiveVoiceRoom bLiveVoiceRoom) {
        BLiveVoiceRoomCallPlaceResource bLiveVoiceRoomCallPlaceResource = bLiveVoiceRoom != null ? bLiveVoiceRoom.callPlaceResource : null;
        if (bLiveVoiceRoomCallPlaceResource == null) {
            m77976z();
            return;
        }
        if (!TextUtils.isEmpty(bLiveVoiceRoomCallPlaceResource.bgUrl)) {
            hxs.m133412y(this.f52987c, bLiveVoiceRoomCallPlaceResource.bgUrl);
        }
        if (!TextUtils.isEmpty(bLiveVoiceRoomCallPlaceResource.addUrl)) {
            hxs.m133412y(this.f52988d, bLiveVoiceRoomCallPlaceResource.addUrl);
        }
        if (!TextUtils.isEmpty(bLiveVoiceRoomCallPlaceResource.bossUrl)) {
            hxs.m133412y(this.f52989e, bLiveVoiceRoomCallPlaceResource.bossUrl);
        }
        if (TextUtils.isEmpty(bLiveVoiceRoomCallPlaceResource.indexColor)) {
            return;
        }
        this.f53004t.setTextColor(kvc0.m147358g(bLiveVoiceRoomCallPlaceResource.indexColor));
    }

    /* JADX INFO: renamed from: s */
    public final void m77969s(mqv<i54> mqvVar) {
        if (vdt.m198092b(3)) {
            return;
        }
        hxn0 hxn0VarM133350c = hxn0.m133350c(mqvVar);
        BLiveAvatarFrameConfig bLiveAvatarFrameConfig = hxn0VarM133350c.f109896b.avatarConfig.frameConfig;
        if (bLiveAvatarFrameConfig.changeVoiceNo == 0 || bLiveAvatarFrameConfig.remainingSec <= 0) {
            this.f52991g.m72120j0();
            return;
        }
        CommonMaskAvatarView commonMaskAvatarView = this.f52991g;
        int iM186890d = t100.m186890d(58.0f);
        BLiveUserMask bLiveUserMask = hxn0VarM133350c.f109896b;
        agv.m96349g(commonMaskAvatarView, iM186890d, bLiveUserMask.avatar, bLiveUserMask.avatarConfig.frameConfig.staticUrl, "");
    }

    public void setItemPlaceRes(int i) {
        this.f52988d.setImageResource(i);
    }

    public void setVoiceAnimUrl(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f53009y = str;
    }

    /* JADX INFO: renamed from: t */
    public final void m77970t(s1o0 s1o0Var) {
        if (s1o0Var == null) {
            mo77966j();
            return;
        }
        int iM182012b = s1o0Var.m182012b();
        if (iM182012b == s1o0.f161919f) {
            mo77960d(s1o0Var.m182014d(), s1o0Var.m182015e(), s1o0Var.f161925e);
        } else if (iM182012b == s1o0.f161920g) {
            mo77958b(s1o0Var.m182014d(), s1o0Var.m182015e());
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.ho2] */
    /* JADX INFO: renamed from: u */
    public final boolean m77971u(eom0 eom0Var, String str) {
        User userM132146l0 = eom0Var.m206027E2().m132146l0();
        return userM132146l0 != null && TextUtils.equals(str, userM132146l0.f56011id);
    }

    /* JADX INFO: renamed from: v */
    public final boolean m77972v(List<VoiceMicEmoji.EmojiPlayResult> list, String str) {
        return "emojiRandomTripleDice".equals(str) && list.size() >= 3;
    }

    /* JADX INFO: renamed from: w */
    public final void m77973w() {
        if (this.f52990f.isAnimating()) {
            return;
        }
        this.f52990f.mo68502l(getVoiceAnimUrl(), -1, this.f52981A);
    }

    /* JADX INFO: renamed from: x */
    public final void m77974x(double d) {
        TextView textView = this.f53008x;
        if (d > 9.9999999E7d) {
            textView.setText(x8u.m207433c(d));
        } else {
            textView.setText(m77956H(d));
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m77975y(BLiveVoiceCall bLiveVoiceCall, mqv<i54> mqvVar, BLiveVoice bLiveVoice) {
        this.f53005u.setVisibility(0);
        xdl0.m208344M(this.f53007w, false);
        this.f53008x.setTextColor(getContext().getResources().getColor(h1c0.f105362e1));
        xdl0.m208344M(this.f52985a, false);
        BLiveVoicePkCallInfo bLiveVoicePkCallInfo = bLiveVoiceCall.pkCallInfo;
        if (bLiveVoicePkCallInfo == null || !TextUtils.isEmpty(bLiveVoicePkCallInfo.mvpBg)) {
            xdl0.m208344M(this.f52985a, true);
            hxs.m133406s("context_single_room", this.f52985a, bLiveVoiceCall.pkCallInfo.mvpBg);
        } else {
            xdl0.m208344M(this.f52985a, false);
        }
        if ("pkPoint".equals(bLiveVoiceCall.pointType)) {
            this.f53008x.setText(x8u.m207433c(bLiveVoiceCall.pkCallInfo.point));
            boolean z = bLiveVoiceCall.pkCallInfo.isNewTopOne;
            ImageView imageView = this.f53006v;
            if (z) {
                imageView.setImageResource(i3c0.f110914X9);
                this.f53008x.setTextColor(Color.parseColor("#FFB522"));
            } else {
                imageView.setImageResource(i3c0.f110903W9);
            }
            if (bLiveVoiceCall.pkCallInfo.isShowAnim) {
                SVGALoader.with(getContext()).from("https://fe-static.tancdn.com/v1/raw/7cede117-0c4a-4dfd-99a4-4a3e353b993214.svga").autoPlay(true).repeatCount(1).animListener(this.f52984D).into(this.f53007w);
                xdl0.m208344M(this.f53007w, true);
            }
            agv.m96345c(this.f52991g, t100.m186890d(58.0f), mqvVar, new w9j() { // from class: l.qo40
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((i54) obj).f111522c;
                }
            }, 1);
            return;
        }
        if ("lovePoint".equals(bLiveVoiceCall.pointType)) {
            BLiveVoiceCallHatInfo bLiveVoiceCallHatInfo = bLiveVoiceCall.hatInfo;
            TextView textView = this.f53008x;
            if (bLiveVoiceCallHatInfo == null) {
                textView.setText("0");
            } else {
                textView.setText(x8u.m207433c(bLiveVoiceCallHatInfo.point));
            }
            this.f53006v.setImageResource(i3c0.f110749J3);
            hxn0 hxn0VarM133350c = hxn0.m133350c(mqvVar);
            if (hxn0VarM133350c.m133354e()) {
                BLiveVoiceCallHatInfo bLiveVoiceCallHatInfo2 = bLiveVoiceCall.hatInfo;
                if (bLiveVoiceCallHatInfo2 == null || TextUtils.isEmpty(bLiveVoiceCallHatInfo2.hatUrl)) {
                    agv.m96353k(this.f52991g, t100.m186890d(58.0f), hxn0VarM133350c.f109896b);
                    return;
                } else {
                    agv.m96349g(this.f52991g, t100.m186890d(58.0f), hxn0VarM133350c.f109896b.avatar, "", bLiveVoiceCall.hatInfo.hatUrl);
                    return;
                }
            }
            return;
        }
        agv.m96345c(this.f52991g, t100.m186890d(58.0f), mqvVar, new w9j() { // from class: l.ro40
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((i54) obj).f111522c;
            }
        }, 1);
        if (!NullChecker.m81303a(bLiveVoice) || !BLiveVoice.VOICE_LIVE_MODEL_BOSS.equals(bLiveVoice.liveMode)) {
            this.f53006v.setImageResource(((bgv) ypv.m215673l(fld0.f98151f)).m101734n() ? i3c0.f111127p9 : i3c0.f111103n9);
            this.f53008x.setText(x8u.m207433c(bLiveVoiceCall.userRecvRewardPoint));
            return;
        }
        if (bLiveVoiceCall.position != BLiveVoice.VOICE_NINE_MIC_BOSS_POSITION) {
            this.f53006v.setImageResource(i3c0.f110892V9);
            m77974x(bLiveVoiceCall.popularity);
            return;
        }
        xdl0.m208344M(this.f52996l, false);
        xdl0.m208344M(this.f52997m, true);
        xdl0.m208344M(this.f53003s, false);
        rfd0.m179126b(this.f53004t, mqvVar.f135304a.f111521b, Color.parseColor("#FFE2AB"), bLiveVoiceCall.userNameGradientColors);
        this.f53008x.setTextColor(getContext().getResources().getColor(h1c0.f105327P0));
        this.f53006v.setImageResource(i3c0.f110870T9);
        this.f53008x.setText(x8u.m207433c(bLiveVoiceCall.contribution));
    }

    /* JADX INFO: renamed from: z */
    public final void m77976z() {
        this.f52987c.setImageResource(i3c0.f110839R0);
        this.f52988d.setImageResource(i3c0.f111091m9);
        this.f52989e.setImageResource(i3c0.f110881U9);
        this.f53003s.setTextColor(Color.parseColor("#FFFFFF"));
    }

    public NormalVoiceDeputyItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public NormalVoiceDeputyItemView(Context context) {
        this(context, null);
    }
}
