package com.p046p1.mobile.putong.live.livingroom.virtual.virtualmotion.creator.rightcall;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.live.base.data.BLiveCallEffectConfig;
import com.p046p1.mobile.putong.live.base.data.BLiveUserMask;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.common.avatar.CommonMaskAvatarView;
import com.tantanapp.common.utils.NullChecker;
import p147v.VDraweeView;
import p147v.VLinear;
import p147v.VText;
import p149l.agv;
import p149l.alk0;
import p149l.ap0;
import p149l.c45;
import p149l.e0o0;
import p149l.e1t;
import p149l.h1c0;
import p149l.hfw;
import p149l.hxn0;
import p149l.hxs;
import p149l.i3c0;
import p149l.i54;
import p149l.kvc0;
import p149l.mqv;
import p149l.nnn0;
import p149l.nyn0;
import p149l.qjm0;
import p149l.t100;
import p149l.w9j;
import p149l.x8u;
import p149l.xdl0;
import p149l.yb2;

/* JADX INFO: loaded from: classes5.dex */
public class VoiceMemberItemView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public View f52810d;

    /* JADX INFO: renamed from: e */
    public CommonMaskAvatarView f52811e;

    /* JADX INFO: renamed from: f */
    public ImageView f52812f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f52813g;

    /* JADX INFO: renamed from: h */
    public VLinear f52814h;

    /* JADX INFO: renamed from: i */
    public VText f52815i;

    /* JADX INFO: renamed from: j */
    public View f52816j;

    /* JADX INFO: renamed from: k */
    public VDraweeView f52817k;

    /* JADX INFO: renamed from: l */
    public AnimEffectPlayer f52818l;

    /* JADX INFO: renamed from: m */
    public AnimEffectPlayer f52819m;

    /* JADX INFO: renamed from: n */
    public ap0 f52820n;

    /* JADX INFO: renamed from: o */
    public BLiveVoiceCall f52821o;

    /* JADX INFO: renamed from: p */
    public mqv<i54> f52822p;

    /* JADX INFO: renamed from: q */
    public c45 f52823q;

    /* JADX INFO: renamed from: r */
    public String f52824r;

    /* JADX INFO: renamed from: s */
    public String f52825s;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.virtual.virtualmotion.creator.rightcall.VoiceMemberItemView$a */
    public class C12987a extends ap0 {
        public C12987a() {
        }

        @Override // p149l.ap0
        /* JADX INFO: renamed from: b */
        public void mo69562b() {
            super.mo69562b();
            xdl0.m208344M(VoiceMemberItemView.this.f52815i, true);
            xdl0.m208344M(VoiceMemberItemView.this.f52816j, false);
            xdl0.m208344M(VoiceMemberItemView.this.f52818l, false);
        }

        @Override // p149l.ap0
        /* JADX INFO: renamed from: g */
        public void mo69603g() {
            super.mo69603g();
            xdl0.m208344M(VoiceMemberItemView.this.f52815i, false);
            xdl0.m208344M(VoiceMemberItemView.this.f52816j, true);
            xdl0.m208344M(VoiceMemberItemView.this.f52818l, true);
        }
    }

    public VoiceMemberItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: k0 */
    private void m77595k0(String str) {
        if (this.f52819m.isAnimating() && xdl0.m208349O0(this.f52819m) && TextUtils.equals(str, this.f52825s)) {
            return;
        }
        xdl0.m208344M(this.f52819m, true);
        this.f52825s = str;
        this.f52819m.m68500j(str, -1);
    }

    /* JADX INFO: renamed from: l0 */
    private void m77596l0(BLiveVoiceCall bLiveVoiceCall) {
        BLiveCallEffectConfig bLiveCallEffectConfig;
        String str = (bLiveVoiceCall == null || (bLiveCallEffectConfig = bLiveVoiceCall.callEffect) == null) ? "https://auto.tancdn.com/v1/raw/6b3f432c-10e8-4ccf-8482-230a304c68c711.pdf" : bLiveCallEffectConfig.verticalVoicingUrl;
        if (this.f52818l.isAnimating() && TextUtils.equals(str, this.f52824r)) {
            return;
        }
        this.f52824r = str;
        this.f52818l.mo68502l(str, -1, this.f52820n);
    }

    /* JADX INFO: renamed from: p0 */
    private void m77597p0() {
        if (NullChecker.m81303a(this.f52819m)) {
            this.f52819m.stopAnimation(true);
            xdl0.m208344M(this.f52819m, false);
            this.f52825s = "";
        }
    }

    /* JADX INFO: renamed from: q0 */
    private void m77598q0() {
        AnimEffectPlayer animEffectPlayer = this.f52818l;
        if (animEffectPlayer != null) {
            animEffectPlayer.stopAnimation(true);
            this.f52818l.setAnimListener(null);
            xdl0.m208344M(this.f52815i, true);
            xdl0.m208344M(this.f52816j, false);
            xdl0.m208344M(this.f52818l, false);
        }
        this.f52811e.m72129t0();
    }

    /* JADX INFO: renamed from: t0 */
    private void m77599t0(BLiveVoiceCall bLiveVoiceCall) {
        if (bLiveVoiceCall.mutedByAnchor || bLiveVoiceCall.mutedByUser || !bLiveVoiceCall.isSpeak || alk0.m97312k(bLiveVoiceCall)) {
            this.f52811e.m72129t0();
            return;
        }
        if (hxn0.m133350c(this.f52822p).m133353d()) {
            BLiveUserMask bLiveUserMask = hxn0.m133350c(this.f52822p).f109896b;
            if (NullChecker.m81303a(bLiveUserMask) && NullChecker.m81303a(bLiveUserMask.avatarConfig) && NullChecker.m81303a(bLiveUserMask.avatarConfig.frameConfig) && bLiveUserMask.avatarConfig.frameConfig.checkNeedChangeVoice()) {
                this.f52811e.m72128s0();
            }
        }
    }

    public mqv<i54> getCallUser() {
        return this.f52822p;
    }

    /* JADX INFO: renamed from: i0 */
    public final void m77600i0(View view) {
        nyn0.m162027a(this, view);
    }

    /* JADX INFO: renamed from: j0 */
    public final void m77601j0() {
        boolean zM207441k = x8u.m207441k();
        VText vText = this.f52815i;
        if (!zM207441k) {
            vText.setRotation(0.0f);
            this.f52815i.setTranslationX(0.0f);
        } else {
            vText.setRotation(90.0f);
            this.f52815i.setTranslationX(t100.m186890d(-6.0f));
            xdl0.m208327D0(t100.m186890d(40.0f), this.f52815i);
        }
    }

    /* JADX INFO: renamed from: m0 */
    public void m77602m0(String str, mqv<i54> mqvVar) {
        if (TextUtils.equals(str, "guideGoCallUser")) {
            this.f52812f.setImageResource(i3c0.f110748J2);
            xdl0.m208344M(this.f52812f, true);
            xdl0.m208344M(this.f52810d, true);
            this.f52810d.setBackgroundResource(i3c0.f110793N);
            xdl0.m208345M0(this.f52811e, false);
            this.f52823q.m105202b();
            m77598q0();
            return;
        }
        xdl0.m208345M0(this.f52811e, true);
        xdl0.m208344M(this.f52812f, false);
        mqv<i54> mqvVarM114446h = e1t.m114446h(mqvVar);
        this.f52822p = mqvVarM114446h;
        hxn0 hxn0VarM133350c = hxn0.m133350c(mqvVarM114446h);
        agv.m96345c(this.f52811e, t100.m186890d(58.0f), mqvVarM114446h, new w9j() { // from class: l.myn0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((i54) obj).f111522c;
            }
        }, 1);
        if (!hxn0VarM133350c.m133353d() || !hxn0VarM133350c.f109896b.avatarConfig.frameConfig.checkNeedChangeVoice()) {
            xdl0.m208345M0(this.f52811e.getRealAvatarView(), true);
            xdl0.m208344M(this.f52810d, false);
            this.f52823q.m105202b();
        } else {
            xdl0.m208345M0(this.f52811e.getRealAvatarView(), false);
            xdl0.m208344M(this.f52810d, true);
            this.f52823q.m105205e(mqvVarM114446h);
            this.f52810d.setBackground(yb2.m213883h(Color.parseColor("#382121")));
        }
    }

    /* JADX INFO: renamed from: n0 */
    public void m77603n0() {
        if (this.f52811e != null) {
            m77598q0();
            xdl0.m208344M(this.f52817k, false);
            m77597p0();
        }
    }

    /* JADX INFO: renamed from: o0 */
    public void m77604o0(qjm0<?> qjm0Var, String str, int i, String str2) {
        this.f52813g.setActualImageResource(-1);
        boolean zM114322h = e0o0.m114322h(qjm0Var);
        boolean zM114323i = e0o0.m114323i(qjm0Var);
        this.f52814h.setMinimumHeight(t100.m186890d(40.0f));
        xdl0.m208374f0(this.f52815i, alk0.m97309h(this.f52821o) ? t100.m186890d(3.0f) : 0);
        if ("anchor".equals(str)) {
            if (qjm0Var == null || !((nnn0) qjm0Var.m206027E2()).m160271i3()) {
                this.f52815i.setText(R$string.f47568uf);
            } else {
                this.f52815i.setText(R$string.f47612wf);
            }
            this.f52815i.setTextColor(kvc0.m147352a(h1c0.f105416w1));
            this.f52813g.setBackground(yb2.m213884i(kvc0.m147352a(h1c0.f105298B), t100.m186890d(10.0f)));
        } else if ("manager".equals(str)) {
            m77601j0();
            this.f52815i.setTextColor(kvc0.m147352a(h1c0.f105416w1));
            this.f52813g.setBackground(yb2.m213884i(kvc0.m147352a(h1c0.f105421z), t100.m186890d(10.0f)));
            this.f52815i.setText(R$string.f47362l7);
        } else {
            if ("default".equals(str) && alk0.m97311j(this.f52821o)) {
                this.f52815i.setTextColor(kvc0.m147352a(h1c0.f105416w1));
                this.f52813g.setBackground(yb2.m213884i(kvc0.m147352a(h1c0.f105296A), t100.m186890d(10.0f)));
                this.f52815i.setText(R$string.f47324jd);
            } else {
                this.f52815i.setTextColor(kvc0.m147352a(h1c0.f105395p1));
                this.f52813g.setBackground(yb2.m213884i(kvc0.m147352a(h1c0.f105320M), t100.m186890d(10.0f)));
                if (alk0.m97310i(str2)) {
                    this.f52815i.setText(R$string.f47324jd);
                } else {
                    if (-1 != i) {
                        this.f52815i.setText(String.valueOf(i));
                    } else if (!zM114323i && !((nnn0) qjm0Var.m206027E2()).mo97490p()) {
                        this.f52815i.setText(R$string.f47634xf);
                    } else if (zM114322h) {
                        this.f52815i.setText(R$string.f46783K6);
                    }
                    this.f52813g.setBackgroundResource(i3c0.f110805O);
                    this.f52815i.setTextColor(kvc0.m147352a(h1c0.f105395p1));
                }
            }
            this.f52815i.setRotation(0.0f);
            this.f52815i.setTranslationX(0.0f);
            xdl0.m208374f0(this.f52815i, 1);
        }
        BLiveVoiceCall bLiveVoiceCall = this.f52821o;
        if (bLiveVoiceCall == null || bLiveVoiceCall.callEffect == null) {
            return;
        }
        this.f52813g.setBackground(null);
        hxs.m133408u("context_livingAct", this.f52813g, this.f52821o.callEffect.verticalBg, t100.m186890d(18.0f), t100.f167277z);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m77603n0();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m77600i0(this);
        this.f52820n = new C12987a();
        this.f52811e.setMaskUnLimit(true);
        xdl0.m208327D0(t100.m186890d(78.0f), this);
        this.f52823q = new c45(this.f52811e.getCountDownProgressView());
    }

    /* JADX INFO: renamed from: r0 */
    public void m77605r0(String str) {
        if (TextUtils.isEmpty(str)) {
            m77597p0();
        } else {
            m77595k0(str);
        }
    }

    /* JADX INFO: renamed from: s0 */
    public void m77606s0(BLiveVoiceCall bLiveVoiceCall) {
        if (bLiveVoiceCall.mutedByAnchor || bLiveVoiceCall.mutedByUser || !bLiveVoiceCall.isSpeak) {
            m77598q0();
        } else {
            m77596l0(bLiveVoiceCall);
        }
    }

    public void setCallInfo(BLiveVoiceCall bLiveVoiceCall) {
        this.f52821o = bLiveVoiceCall;
        if (bLiveVoiceCall == null) {
            hfw.m130790a("[live][voice]", "call is null");
            m77598q0();
            xdl0.m208344M(this.f52817k, false);
            return;
        }
        hfw.m130790a("[live][voice]", bLiveVoiceCall.toJson());
        xdl0.m208344M(this.f52817k, true);
        if (bLiveVoiceCall.mutedByAnchor || bLiveVoiceCall.mutedByUser) {
            BLiveCallEffectConfig bLiveCallEffectConfig = bLiveVoiceCall.callEffect;
            VDraweeView vDraweeView = this.f52817k;
            if (bLiveCallEffectConfig != null) {
                hxs.m133407t("context_livingAct", vDraweeView, bLiveCallEffectConfig.muteIcon, t100.m186890d(12.0f));
            } else {
                vDraweeView.setActualImageResource(i3c0.f110848R9);
            }
        } else {
            BLiveCallEffectConfig bLiveCallEffectConfig2 = bLiveVoiceCall.callEffect;
            VDraweeView vDraweeView2 = this.f52817k;
            if (bLiveCallEffectConfig2 != null) {
                hxs.m133407t("context_livingAct", vDraweeView2, bLiveCallEffectConfig2.defaultIcon, t100.m186890d(12.0f));
            } else {
                vDraweeView2.setActualImageResource(i3c0.f110859S9);
            }
        }
        m77606s0(bLiveVoiceCall);
        m77599t0(bLiveVoiceCall);
    }

    public VoiceMemberItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceMemberItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
