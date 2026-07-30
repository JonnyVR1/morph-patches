package com.p051p1.mobile.putong.live.livingroom.virtual.virtualmotion.creator.rightcall;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.live.base.data.BLiveCallEffectConfig;
import com.p051p1.mobile.putong.live.base.data.BLiveUserMask;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.common.avatar.CommonMaskAvatarView;
import com.tantanapp.common.utils.NullChecker;
import p151v.VDraweeView;
import p151v.VLinear;
import p151v.VText;
import p153l.biv;
import p153l.bnl0;
import p153l.d55;
import p153l.f3t;
import p153l.fc2;
import p153l.fhw;
import p153l.guk0;
import p153l.h64;
import p153l.i9o0;
import p153l.izs;
import p153l.l6o0;
import p153l.n3d0;
import p153l.n9c0;
import p153l.nsv;
import p153l.obc0;
import p153l.qa00;
import p153l.qcj;
import p153l.r7o0;
import p153l.rwn0;
import p153l.usm0;
import p153l.wo0;
import p153l.yau;

/* JADX INFO: loaded from: classes5.dex */
public class VoiceMemberItemView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public View f53658d;

    /* JADX INFO: renamed from: e */
    public CommonMaskAvatarView f53659e;

    /* JADX INFO: renamed from: f */
    public ImageView f53660f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f53661g;

    /* JADX INFO: renamed from: h */
    public VLinear f53662h;

    /* JADX INFO: renamed from: i */
    public VText f53663i;

    /* JADX INFO: renamed from: j */
    public View f53664j;

    /* JADX INFO: renamed from: k */
    public VDraweeView f53665k;

    /* JADX INFO: renamed from: l */
    public AnimEffectPlayer f53666l;

    /* JADX INFO: renamed from: m */
    public AnimEffectPlayer f53667m;

    /* JADX INFO: renamed from: n */
    public wo0 f53668n;

    /* JADX INFO: renamed from: o */
    public BLiveVoiceCall f53669o;

    /* JADX INFO: renamed from: p */
    public nsv<h64> f53670p;

    /* JADX INFO: renamed from: q */
    public d55 f53671q;

    /* JADX INFO: renamed from: r */
    public String f53672r;

    /* JADX INFO: renamed from: s */
    public String f53673s;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.virtual.virtualmotion.creator.rightcall.VoiceMemberItemView$a */
    public class C13150a extends wo0 {
        public C13150a() {
        }

        @Override // p153l.wo0
        /* JADX INFO: renamed from: b */
        public void mo70745b() {
            super.mo70745b();
            bnl0.m105524M(VoiceMemberItemView.this.f53663i, true);
            bnl0.m105524M(VoiceMemberItemView.this.f53664j, false);
            bnl0.m105524M(VoiceMemberItemView.this.f53666l, false);
        }

        @Override // p153l.wo0
        /* JADX INFO: renamed from: g */
        public void mo70786g() {
            super.mo70786g();
            bnl0.m105524M(VoiceMemberItemView.this.f53663i, false);
            bnl0.m105524M(VoiceMemberItemView.this.f53664j, true);
            bnl0.m105524M(VoiceMemberItemView.this.f53666l, true);
        }
    }

    public VoiceMemberItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: k0 */
    private void m78778k0(String str) {
        if (this.f53667m.isAnimating() && bnl0.m105529O0(this.f53667m) && TextUtils.equals(str, this.f53673s)) {
            return;
        }
        bnl0.m105524M(this.f53667m, true);
        this.f53673s = str;
        this.f53667m.m69683j(str, -1);
    }

    /* JADX INFO: renamed from: l0 */
    private void m78779l0(BLiveVoiceCall bLiveVoiceCall) {
        BLiveCallEffectConfig bLiveCallEffectConfig;
        String str = (bLiveVoiceCall == null || (bLiveCallEffectConfig = bLiveVoiceCall.callEffect) == null) ? "https://auto.tancdn.com/v1/raw/6b3f432c-10e8-4ccf-8482-230a304c68c711.pdf" : bLiveCallEffectConfig.verticalVoicingUrl;
        if (this.f53666l.isAnimating() && TextUtils.equals(str, this.f53672r)) {
            return;
        }
        this.f53672r = str;
        this.f53666l.mo69685l(str, -1, this.f53668n);
    }

    /* JADX INFO: renamed from: p0 */
    private void m78780p0() {
        if (NullChecker.m82486a(this.f53667m)) {
            this.f53667m.stopAnimation(true);
            bnl0.m105524M(this.f53667m, false);
            this.f53673s = "";
        }
    }

    /* JADX INFO: renamed from: q0 */
    private void m78781q0() {
        AnimEffectPlayer animEffectPlayer = this.f53666l;
        if (animEffectPlayer != null) {
            animEffectPlayer.stopAnimation(true);
            this.f53666l.setAnimListener(null);
            bnl0.m105524M(this.f53663i, true);
            bnl0.m105524M(this.f53664j, false);
            bnl0.m105524M(this.f53666l, false);
        }
        this.f53659e.m73312t0();
    }

    /* JADX INFO: renamed from: t0 */
    private void m78782t0(BLiveVoiceCall bLiveVoiceCall) {
        if (bLiveVoiceCall.mutedByAnchor || bLiveVoiceCall.mutedByUser || !bLiveVoiceCall.isSpeak || guk0.m132332k(bLiveVoiceCall)) {
            this.f53659e.m73312t0();
            return;
        }
        if (l6o0.m153068c(this.f53670p).m153071d()) {
            BLiveUserMask bLiveUserMask = l6o0.m153068c(this.f53670p).f130275b;
            if (NullChecker.m82486a(bLiveUserMask) && NullChecker.m82486a(bLiveUserMask.avatarConfig) && NullChecker.m82486a(bLiveUserMask.avatarConfig.frameConfig) && bLiveUserMask.avatarConfig.frameConfig.checkNeedChangeVoice()) {
                this.f53659e.m73311s0();
            }
        }
    }

    public nsv<h64> getCallUser() {
        return this.f53670p;
    }

    /* JADX INFO: renamed from: i0 */
    public final void m78783i0(View view) {
        r7o0.m180163a(this, view);
    }

    /* JADX INFO: renamed from: j0 */
    public final void m78784j0() {
        boolean zM214943k = yau.m214943k();
        VText vText = this.f53663i;
        if (!zM214943k) {
            vText.setRotation(0.0f);
            this.f53663i.setTranslationX(0.0f);
        } else {
            vText.setRotation(90.0f);
            this.f53663i.setTranslationX(qa00.m175859d(-6.0f));
            bnl0.m105507D0(qa00.m175859d(40.0f), this.f53663i);
        }
    }

    /* JADX INFO: renamed from: m0 */
    public void m78785m0(String str, nsv<h64> nsvVar) {
        if (TextUtils.equals(str, "guideGoCallUser")) {
            this.f53660f.setImageResource(obc0.f146076J2);
            bnl0.m105524M(this.f53660f, true);
            bnl0.m105524M(this.f53658d, true);
            this.f53658d.setBackgroundResource(obc0.f146121N);
            bnl0.m105525M0(this.f53659e, false);
            this.f53671q.m114258b();
            m78781q0();
            return;
        }
        bnl0.m105525M0(this.f53659e, true);
        bnl0.m105524M(this.f53660f, false);
        nsv<h64> nsvVarM123807h = f3t.m123807h(nsvVar);
        this.f53670p = nsvVarM123807h;
        l6o0 l6o0VarM153068c = l6o0.m153068c(nsvVarM123807h);
        biv.m104518c(this.f53659e, qa00.m175859d(58.0f), nsvVarM123807h, new qcj() { // from class: l.q7o0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((h64) obj).f107999c;
            }
        }, 1);
        if (!l6o0VarM153068c.m153071d() || !l6o0VarM153068c.f130275b.avatarConfig.frameConfig.checkNeedChangeVoice()) {
            bnl0.m105525M0(this.f53659e.getRealAvatarView(), true);
            bnl0.m105524M(this.f53658d, false);
            this.f53671q.m114258b();
        } else {
            bnl0.m105525M0(this.f53659e.getRealAvatarView(), false);
            bnl0.m105524M(this.f53658d, true);
            this.f53671q.m114261e(nsvVarM123807h);
            this.f53658d.setBackground(fc2.m124978h(Color.parseColor("#382121")));
        }
    }

    /* JADX INFO: renamed from: n0 */
    public void m78786n0() {
        if (this.f53659e != null) {
            m78781q0();
            bnl0.m105524M(this.f53665k, false);
            m78780p0();
        }
    }

    /* JADX INFO: renamed from: o0 */
    public void m78787o0(usm0<?> usm0Var, String str, int i, String str2) {
        this.f53661g.setActualImageResource(-1);
        boolean zM139137h = i9o0.m139137h(usm0Var);
        boolean zM139138i = i9o0.m139138i(usm0Var);
        this.f53662h.setMinimumHeight(qa00.m175859d(40.0f));
        bnl0.m105554f0(this.f53663i, guk0.m132329h(this.f53669o) ? qa00.m175859d(3.0f) : 0);
        if ("anchor".equals(str)) {
            if (usm0Var == null || !((rwn0) usm0Var.m213810E2()).m183434i3()) {
                this.f53663i.setText(R$string.f48416uf);
            } else {
                this.f53663i.setText(R$string.f48460wf);
            }
            this.f53663i.setTextColor(n3d0.m161277a(n9c0.f140877w1));
            this.f53661g.setBackground(fc2.m124979i(n3d0.m161277a(n9c0.f140759B), qa00.m175859d(10.0f)));
        } else if ("manager".equals(str)) {
            m78784j0();
            this.f53663i.setTextColor(n3d0.m161277a(n9c0.f140877w1));
            this.f53661g.setBackground(fc2.m124979i(n3d0.m161277a(n9c0.f140882z), qa00.m175859d(10.0f)));
            this.f53663i.setText(R$string.f48210l7);
        } else {
            if ("default".equals(str) && guk0.m132331j(this.f53669o)) {
                this.f53663i.setTextColor(n3d0.m161277a(n9c0.f140877w1));
                this.f53661g.setBackground(fc2.m124979i(n3d0.m161277a(n9c0.f140757A), qa00.m175859d(10.0f)));
                this.f53663i.setText(R$string.f48172jd);
            } else {
                this.f53663i.setTextColor(n3d0.m161277a(n9c0.f140856p1));
                this.f53661g.setBackground(fc2.m124979i(n3d0.m161277a(n9c0.f140781M), qa00.m175859d(10.0f)));
                if (guk0.m132330i(str2)) {
                    this.f53663i.setText(R$string.f48172jd);
                } else {
                    if (-1 != i) {
                        this.f53663i.setText(String.valueOf(i));
                    } else if (!zM139138i && !((rwn0) usm0Var.m213810E2()).mo118373p()) {
                        this.f53663i.setText(R$string.f48482xf);
                    } else if (zM139137h) {
                        this.f53663i.setText(R$string.f47631K6);
                    }
                    this.f53661g.setBackgroundResource(obc0.f146133O);
                    this.f53663i.setTextColor(n3d0.m161277a(n9c0.f140856p1));
                }
            }
            this.f53663i.setRotation(0.0f);
            this.f53663i.setTranslationX(0.0f);
            bnl0.m105554f0(this.f53663i, 1);
        }
        BLiveVoiceCall bLiveVoiceCall = this.f53669o;
        if (bLiveVoiceCall == null || bLiveVoiceCall.callEffect == null) {
            return;
        }
        this.f53661g.setBackground(null);
        izs.m142870u("context_livingAct", this.f53661g, this.f53669o.callEffect.verticalBg, qa00.m175859d(18.0f), qa00.f156339z);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m78786n0();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m78783i0(this);
        this.f53668n = new C13150a();
        this.f53659e.setMaskUnLimit(true);
        bnl0.m105507D0(qa00.m175859d(78.0f), this);
        this.f53671q = new d55(this.f53659e.getCountDownProgressView());
    }

    /* JADX INFO: renamed from: r0 */
    public void m78788r0(String str) {
        if (TextUtils.isEmpty(str)) {
            m78780p0();
        } else {
            m78778k0(str);
        }
    }

    /* JADX INFO: renamed from: s0 */
    public void m78789s0(BLiveVoiceCall bLiveVoiceCall) {
        if (bLiveVoiceCall.mutedByAnchor || bLiveVoiceCall.mutedByUser || !bLiveVoiceCall.isSpeak) {
            m78781q0();
        } else {
            m78779l0(bLiveVoiceCall);
        }
    }

    public void setCallInfo(BLiveVoiceCall bLiveVoiceCall) {
        this.f53669o = bLiveVoiceCall;
        if (bLiveVoiceCall == null) {
            fhw.m125605a("[live][voice]", "call is null");
            m78781q0();
            bnl0.m105524M(this.f53665k, false);
            return;
        }
        fhw.m125605a("[live][voice]", bLiveVoiceCall.toJson());
        bnl0.m105524M(this.f53665k, true);
        if (bLiveVoiceCall.mutedByAnchor || bLiveVoiceCall.mutedByUser) {
            BLiveCallEffectConfig bLiveCallEffectConfig = bLiveVoiceCall.callEffect;
            VDraweeView vDraweeView = this.f53665k;
            if (bLiveCallEffectConfig != null) {
                izs.m142869t("context_livingAct", vDraweeView, bLiveCallEffectConfig.muteIcon, qa00.m175859d(12.0f));
            } else {
                vDraweeView.setActualImageResource(obc0.f146176R9);
            }
        } else {
            BLiveCallEffectConfig bLiveCallEffectConfig2 = bLiveVoiceCall.callEffect;
            VDraweeView vDraweeView2 = this.f53665k;
            if (bLiveCallEffectConfig2 != null) {
                izs.m142869t("context_livingAct", vDraweeView2, bLiveCallEffectConfig2.defaultIcon, qa00.m175859d(12.0f));
            } else {
                vDraweeView2.setActualImageResource(obc0.f146187S9);
            }
        }
        m78789s0(bLiveVoiceCall);
        m78782t0(bLiveVoiceCall);
    }

    public VoiceMemberItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceMemberItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
