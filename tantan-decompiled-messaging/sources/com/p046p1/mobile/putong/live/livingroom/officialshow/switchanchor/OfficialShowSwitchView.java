package com.p046p1.mobile.putong.live.livingroom.officialshow.switchanchor;

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
import com.google.android.gms.common.ConnectionResult;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.p046p1.mobile.putong.live.base.data.BLiveOfficialShowCurrentAnchorInfo;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VLinear;
import p149l.bt0;
import p149l.d30;
import p149l.d8t;
import p149l.dt0;
import p149l.hxs;
import p149l.j750;
import p149l.s7m;
import p149l.t100;
import p149l.xdl0;

/* JADX INFO: loaded from: classes4.dex */
public class OfficialShowSwitchView extends FrameLayout implements s7m<d8t> {

    /* JADX INFO: renamed from: a */
    public VLinear f51145a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f51146b;

    /* JADX INFO: renamed from: c */
    public FrameLayout f51147c;

    /* JADX INFO: renamed from: d */
    public VImage f51148d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f51149e;

    /* JADX INFO: renamed from: f */
    public TextView f51150f;

    /* JADX INFO: renamed from: g */
    public TextView f51151g;

    /* JADX INFO: renamed from: h */
    public Animator f51152h;

    /* JADX INFO: renamed from: i */
    public Animator f51153i;

    /* JADX INFO: renamed from: j */
    public Animator f51154j;

    /* JADX INFO: renamed from: k */
    public d8t f51155k;

    public OfficialShowSwitchView(@NonNull Context context) {
        super(context);
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getContext();
    }

    @Override // p149l.s7m
    public void destroy() {
        dt0.m113503C(this.f51152h);
        dt0.m113503C(this.f51153i);
        dt0.m113503C(this.f51154j);
    }

    /* JADX INFO: renamed from: f */
    public final void m75424f(View view) {
        j750.m140075a(this, view);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(d8t d8tVar) {
        this.f51155k = d8tVar;
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m75426j(d30 d30Var, LinearInterpolator linearInterpolator, d30 d30Var2) {
        if (d30Var != null) {
            d30Var.call();
        }
        m75433s(linearInterpolator, d30Var2);
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m75427k() {
        xdl0.m208344M(this, false);
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m75428l() {
        xdl0.m208344M(this.f51147c, true);
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m75429m() {
        this.f51150f.setText("本场主播准备中");
        this.f51151g.setText("敬请期待");
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m75430n(d30 d30Var) {
        if (d30Var != null) {
            d30Var.call();
        }
        xdl0.m208344M(this, false);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m75424f(this);
    }

    /* JADX INFO: renamed from: p */
    public void m75431p(BLiveOfficialShowCurrentAnchorInfo bLiveOfficialShowCurrentAnchorInfo, BLiveOfficialShowCurrentAnchorInfo bLiveOfficialShowCurrentAnchorInfo2, final d30 d30Var, final d30 d30Var2) {
        xdl0.m208344M(this, true);
        this.f51150f.setText("当前主播已结束演出");
        this.f51151g.setText("下一位主播即将开始");
        if (bLiveOfficialShowCurrentAnchorInfo != null) {
            hxs.m133402o("context_single_room", this.f51146b, bLiveOfficialShowCurrentAnchorInfo.anchorAvatar);
        }
        if (bLiveOfficialShowCurrentAnchorInfo2 != null) {
            hxs.m133402o("context_single_room", this.f51149e, bLiveOfficialShowCurrentAnchorInfo2.anchorAvatar);
        }
        setAlpha(0.0f);
        this.f51145a.setAlpha(0.0f);
        xdl0.m208344M(this.f51147c, false);
        this.f51146b.setTranslationX(0.0f);
        final LinearInterpolator linearInterpolator = new LinearInterpolator();
        Animator animatorM103746s = bt0.m103746s(bt0.m103743p(this, "alpha", 0L, 333L, linearInterpolator, 0.0f, 1.0f), bt0.m103753z(bt0.m103739l(this.f51145a, View.TRANSLATION_Y, 0L, 333L, linearInterpolator, t100.f167271t, 0.0f), bt0.m103743p(this.f51145a, "alpha", 0L, 333L, linearInterpolator, 0.0f, 1.0f)));
        this.f51153i = animatorM103746s;
        bt0.m103733f(animatorM103746s, new Runnable() { // from class: l.f750
            @Override // java.lang.Runnable
            public final void run() {
                this.f96197a.m75426j(d30Var, linearInterpolator, d30Var2);
            }
        });
        this.f51153i.start();
    }

    /* JADX INFO: renamed from: q */
    public void m75432q(BLiveOfficialShowCurrentAnchorInfo bLiveOfficialShowCurrentAnchorInfo) {
        xdl0.m208344M(this, true);
        this.f51150f.setText("本场主播准备中");
        this.f51151g.setText("敬请期待");
        if (bLiveOfficialShowCurrentAnchorInfo != null) {
            hxs.m133402o("context_single_room", this.f51149e, bLiveOfficialShowCurrentAnchorInfo.anchorAvatar);
        }
        setAlpha(0.0f);
        this.f51145a.setAlpha(0.0f);
        LinearInterpolator linearInterpolator = new LinearInterpolator();
        Animator animatorM103746s = bt0.m103746s(bt0.m103743p(this, "alpha", 0L, 330L, linearInterpolator, 0.0f, 1.0f), bt0.m103753z(bt0.m103739l(this.f51145a, View.TRANSLATION_Y, 0L, 330L, linearInterpolator, t100.f167271t, 0.0f), bt0.m103743p(this.f51145a, "alpha", 0L, 330L, linearInterpolator, 0.0f, 1.0f)), bt0.m103743p(this.f51148d, BLiveGiftItem.TYPE_ROTATION, 0L, 2000L, new LinearInterpolator(), 0.0f, 720.0f), bt0.m103743p(this, "alpha", 0L, 500L, linearInterpolator, 1.0f, 0.0f));
        this.f51152h = animatorM103746s;
        bt0.m103733f(animatorM103746s, new Runnable() { // from class: l.e750
            @Override // java.lang.Runnable
            public final void run() {
                this.f89669a.m75427k();
            }
        });
        this.f51152h.start();
    }

    /* JADX INFO: renamed from: s */
    public final void m75433s(LinearInterpolator linearInterpolator, final d30 d30Var) {
        VDraweeView vDraweeView = this.f51146b;
        float[] fArr = {0.0f, -xdl0.m208412y0()};
        Property property = View.TRANSLATION_X;
        Animator animatorM103739l = bt0.m103739l(vDraweeView, property, 0L, 500L, linearInterpolator, fArr);
        Animator animatorM103739l2 = bt0.m103739l(this.f51147c, property, 0L, 500L, linearInterpolator, xdl0.m208412y0(), 0.0f);
        bt0.m103749v(animatorM103739l2, new Runnable() { // from class: l.g750
            @Override // java.lang.Runnable
            public final void run() {
                this.f101333a.m75428l();
            }
        });
        Animator animatorM103737j = bt0.m103737j(250);
        bt0.m103733f(animatorM103737j, new Runnable() { // from class: l.h750
            @Override // java.lang.Runnable
            public final void run() {
                this.f106195a.m75429m();
            }
        });
        Animator animatorM103746s = bt0.m103746s(bt0.m103737j(1333), bt0.m103753z(bt0.m103743p(this.f51148d, BLiveGiftItem.TYPE_ROTATION, 0L, 2000L, new LinearInterpolator(), 0.0f, 720.0f), bt0.m103746s(bt0.m103753z(animatorM103739l, animatorM103739l2, animatorM103737j), bt0.m103737j(ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED))), bt0.m103743p(this, "alpha", 0L, 500L, linearInterpolator, 1.0f, 0.0f));
        this.f51154j = animatorM103746s;
        bt0.m103733f(animatorM103746s, new Runnable() { // from class: l.i750
            @Override // java.lang.Runnable
            public final void run() {
                this.f111831a.m75430n(d30Var);
            }
        });
        this.f51154j.start();
    }

    public OfficialShowSwitchView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public OfficialShowSwitchView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
