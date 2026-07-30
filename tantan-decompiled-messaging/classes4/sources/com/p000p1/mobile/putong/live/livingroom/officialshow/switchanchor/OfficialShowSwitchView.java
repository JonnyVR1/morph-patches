package com.p000p1.mobile.putong.live.livingroom.officialshow.switchanchor;

import android.animation.Animator;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p1.mobile.putong.live.base.data.BLiveOfficialShowCurrentAnchorInfo;
import l.bt0;
import l.d30;
import l.dt0;
import l.hxs;
import l.s7m;
import l.t100;
import l.xdl0;
import p002l.d8t;
import p002l.j750;
import v.VDraweeView;
import v.VImage;
import v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class OfficialShowSwitchView extends FrameLayout implements s7m<d8t> {

    /* JADX INFO: renamed from: a */
    public VLinear f7187a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f7188b;

    /* JADX INFO: renamed from: c */
    public FrameLayout f7189c;

    /* JADX INFO: renamed from: d */
    public VImage f7190d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f7191e;

    /* JADX INFO: renamed from: f */
    public TextView f7192f;

    /* JADX INFO: renamed from: g */
    public TextView f7193g;

    /* JADX INFO: renamed from: h */
    public Animator f7194h;

    /* JADX INFO: renamed from: i */
    public Animator f7195i;

    /* JADX INFO: renamed from: j */
    public Animator f7196j;

    /* JADX INFO: renamed from: k */
    public d8t f7197k;

    public OfficialShowSwitchView(@NonNull Context context) {
        super(context);
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m9055C0() {
        return getContext();
    }

    public void destroy() {
        dt0.C(this.f7194h);
        dt0.C(this.f7195i);
        dt0.C(this.f7196j);
    }

    /* JADX INFO: renamed from: f */
    public final void m9056f(View view) {
        j750.m15720a(this, view);
    }

    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void m9058i1(d8t d8tVar) {
        this.f7197k = d8tVar;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m9059j(d30 d30Var, LinearInterpolator linearInterpolator, d30 d30Var2) {
        if (d30Var != null) {
            d30Var.call();
        }
        m9066s(linearInterpolator, d30Var2);
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m9060k() {
        xdl0.M(this, false);
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m9061l() {
        xdl0.M(this.f7189c, true);
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m9062m() {
        this.f7192f.setText("本场主播准备中");
        this.f7193g.setText("敬请期待");
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m9063n(d30 d30Var) {
        if (d30Var != null) {
            d30Var.call();
        }
        xdl0.M(this, false);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m9056f(this);
    }

    /* JADX INFO: renamed from: p */
    public void m9064p(BLiveOfficialShowCurrentAnchorInfo bLiveOfficialShowCurrentAnchorInfo, BLiveOfficialShowCurrentAnchorInfo bLiveOfficialShowCurrentAnchorInfo2, final d30 d30Var, final d30 d30Var2) {
        xdl0.M(this, true);
        this.f7192f.setText("当前主播已结束演出");
        this.f7193g.setText("下一位主播即将开始");
        if (bLiveOfficialShowCurrentAnchorInfo != null) {
            hxs.o("context_single_room", this.f7188b, bLiveOfficialShowCurrentAnchorInfo.anchorAvatar);
        }
        if (bLiveOfficialShowCurrentAnchorInfo2 != null) {
            hxs.o("context_single_room", this.f7191e, bLiveOfficialShowCurrentAnchorInfo2.anchorAvatar);
        }
        setAlpha(0.0f);
        this.f7187a.setAlpha(0.0f);
        xdl0.M(this.f7189c, false);
        this.f7188b.setTranslationX(0.0f);
        final LinearInterpolator linearInterpolator = new LinearInterpolator();
        Animator animatorS = bt0.s(new Animator[]{bt0.p(this, "alpha", 0L, 333L, linearInterpolator, new float[]{0.0f, 1.0f}), bt0.z(new Animator[]{bt0.l(this.f7187a, View.TRANSLATION_Y, 0L, 333L, linearInterpolator, new float[]{t100.t, 0.0f}), bt0.p(this.f7187a, "alpha", 0L, 333L, linearInterpolator, new float[]{0.0f, 1.0f})})});
        this.f7195i = animatorS;
        bt0.f(animatorS, new Runnable() { // from class: l.f750
            @Override // java.lang.Runnable
            public final void run() {
                this.f10159a.m9059j(d30Var, linearInterpolator, d30Var2);
            }
        });
        this.f7195i.start();
    }

    /* JADX INFO: renamed from: q */
    public void m9065q(BLiveOfficialShowCurrentAnchorInfo bLiveOfficialShowCurrentAnchorInfo) {
        xdl0.M(this, true);
        this.f7192f.setText("本场主播准备中");
        this.f7193g.setText("敬请期待");
        if (bLiveOfficialShowCurrentAnchorInfo != null) {
            hxs.o("context_single_room", this.f7191e, bLiveOfficialShowCurrentAnchorInfo.anchorAvatar);
        }
        setAlpha(0.0f);
        this.f7187a.setAlpha(0.0f);
        LinearInterpolator linearInterpolator = new LinearInterpolator();
        Animator animatorS = bt0.s(new Animator[]{bt0.p(this, "alpha", 0L, 330L, linearInterpolator, new float[]{0.0f, 1.0f}), bt0.z(new Animator[]{bt0.l(this.f7187a, View.TRANSLATION_Y, 0L, 330L, linearInterpolator, new float[]{t100.t, 0.0f}), bt0.p(this.f7187a, "alpha", 0L, 330L, linearInterpolator, new float[]{0.0f, 1.0f})}), bt0.p(this.f7190d, "rotation", 0L, 2000L, new LinearInterpolator(), new float[]{0.0f, 720.0f}), bt0.p(this, "alpha", 0L, 500L, linearInterpolator, new float[]{1.0f, 0.0f})});
        this.f7194h = animatorS;
        bt0.f(animatorS, new Runnable() { // from class: l.e750
            @Override // java.lang.Runnable
            public final void run() {
                this.f9602a.m9060k();
            }
        });
        this.f7194h.start();
    }

    /* JADX INFO: renamed from: s */
    public final void m9066s(LinearInterpolator linearInterpolator, final d30 d30Var) {
        VDraweeView vDraweeView = this.f7188b;
        float[] fArr = {0.0f, -xdl0.y0()};
        Property property = View.TRANSLATION_X;
        Animator animatorL = bt0.l(vDraweeView, property, 0L, 500L, linearInterpolator, fArr);
        Animator animatorL2 = bt0.l(this.f7189c, property, 0L, 500L, linearInterpolator, new float[]{xdl0.y0(), 0.0f});
        bt0.v(animatorL2, new Runnable() { // from class: l.g750
            @Override // java.lang.Runnable
            public final void run() {
                this.f11291a.m9061l();
            }
        });
        Animator animatorJ = bt0.j(250);
        bt0.f(animatorJ, new Runnable() { // from class: l.h750
            @Override // java.lang.Runnable
            public final void run() {
                this.f11903a.m9062m();
            }
        });
        Animator animatorS = bt0.s(new Animator[]{bt0.j(1333), bt0.z(new Animator[]{bt0.p(this.f7190d, "rotation", 0L, 2000L, new LinearInterpolator(), new float[]{0.0f, 720.0f}), bt0.s(new Animator[]{bt0.z(new Animator[]{animatorL, animatorL2, animatorJ}), bt0.j(1500)})}), bt0.p(this, "alpha", 0L, 500L, linearInterpolator, new float[]{1.0f, 0.0f})});
        this.f7196j = animatorS;
        bt0.f(animatorS, new Runnable() { // from class: l.i750
            @Override // java.lang.Runnable
            public final void run() {
                this.f13084a.m9063n(d30Var);
            }
        });
        this.f7196j.start();
    }

    public OfficialShowSwitchView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public OfficialShowSwitchView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
