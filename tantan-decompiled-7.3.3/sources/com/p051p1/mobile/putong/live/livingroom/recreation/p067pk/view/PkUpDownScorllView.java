package com.p051p1.mobile.putong.live.livingroom.recreation.p067pk.view;

import android.animation.Animator;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.live.base.data.BLiveCommonViewConfig;
import java.util.ArrayList;
import java.util.List;
import p153l.bnl0;
import p153l.gt0;
import p153l.n9c0;
import p153l.obc0;
import p153l.qa00;
import p153l.y20;
import p153l.za80;

/* JADX INFO: loaded from: classes5.dex */
public class PkUpDownScorllView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public PkScorllItemView f52589a;

    /* JADX INFO: renamed from: b */
    public PkScorllItemView f52590b;

    /* JADX INFO: renamed from: c */
    public float f52591c;

    /* JADX INFO: renamed from: d */
    public float f52592d;

    /* JADX INFO: renamed from: e */
    public boolean f52593e;

    /* JADX INFO: renamed from: f */
    public int f52594f;

    /* JADX INFO: renamed from: g */
    public List<BLiveCommonViewConfig> f52595g;

    /* JADX INFO: renamed from: h */
    public Animator f52596h;

    /* JADX INFO: renamed from: i */
    public y20<String> f52597i;

    public PkUpDownScorllView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f52591c = 0.0f;
        this.f52592d = 0.0f;
        this.f52593e = false;
        this.f52594f = 0;
        this.f52595g = new ArrayList();
        this.f52596h = null;
    }

    /* JADX INFO: renamed from: e */
    public final void m77412e(View view) {
        za80.m219102a(this, view);
    }

    /* JADX INFO: renamed from: f */
    public void m77413f() {
        Animator animator = this.f52596h;
        if (animator != null) {
            animator.removeAllListeners();
            this.f52596h.cancel();
            this.f52596h = null;
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m77414g(View view) {
        y20<String> y20Var;
        BLiveCommonViewConfig bLiveCommonViewConfig = (BLiveCommonViewConfig) view.getTag();
        if (bLiveCommonViewConfig == null || TextUtils.isEmpty(bLiveCommonViewConfig.scheme) || (y20Var = this.f52597i) == null) {
            return;
        }
        y20Var.call(bLiveCommonViewConfig.scheme);
    }

    /* JADX INFO: renamed from: h */
    public void m77415h(BLiveCommonViewConfig bLiveCommonViewConfig, y20<String> y20Var) {
        this.f52597i = y20Var;
        PkScorllItemView pkScorllItemView = this.f52589a;
        if (pkScorllItemView != null) {
            pkScorllItemView.setX(this.f52591c);
            this.f52589a.setY(this.f52592d);
            this.f52589a.setAlpha(1.0f);
            this.f52589a.m77397b(bLiveCommonViewConfig);
            this.f52589a.setTag(bLiveCommonViewConfig);
            bnl0.m105524M(this.f52589a, true);
            bnl0.m105524M(this.f52590b, false);
        }
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m77416i(View view) {
        m77414g(this.f52589a);
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m77417j(View view) {
        m77414g(this.f52590b);
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m77418k() {
        bnl0.m105524M(this.f52590b, true);
    }

    /* JADX INFO: renamed from: l */
    public void m77419l() {
        this.f52589a.f52575a.setTextColor(getResources().getColor(n9c0.f140856p1));
        this.f52590b.f52575a.setTextColor(getResources().getColor(n9c0.f140856p1));
        this.f52589a.f52575a.setTextSize(2, 14.0f);
        this.f52590b.f52575a.setTextSize(2, 14.0f);
        this.f52589a.f52576b.setImageResource(obc0.f146391k5);
        this.f52590b.f52576b.setImageResource(obc0.f146391k5);
    }

    /* JADX INFO: renamed from: m */
    public final void m77420m() {
        m77413f();
        this.f52593e = !this.f52593e;
        List<BLiveCommonViewConfig> list = this.f52595g;
        int i = this.f52594f;
        this.f52594f = i + 1;
        BLiveCommonViewConfig bLiveCommonViewConfig = list.get(i);
        if (this.f52594f == this.f52595g.size()) {
            this.f52594f = 0;
        }
        BLiveCommonViewConfig bLiveCommonViewConfig2 = this.f52595g.get(this.f52594f);
        if (bLiveCommonViewConfig == null || bLiveCommonViewConfig2 == null) {
            return;
        }
        if (this.f52593e) {
            this.f52589a.m77397b(bLiveCommonViewConfig);
            this.f52590b.m77397b(bLiveCommonViewConfig2);
            this.f52589a.setTag(bLiveCommonViewConfig);
            this.f52590b.setTag(bLiveCommonViewConfig2);
        } else {
            this.f52590b.m77397b(bLiveCommonViewConfig);
            this.f52589a.m77397b(bLiveCommonViewConfig2);
            this.f52590b.setTag(bLiveCommonViewConfig);
            this.f52589a.setTag(bLiveCommonViewConfig2);
        }
        float fM175859d = this.f52593e ? 0.0f : qa00.m175859d(24.0f);
        float f = this.f52593e ? -qa00.m175859d(24.0f) : 0.0f;
        boolean z = this.f52593e;
        float f2 = z ? 1.0f : 0.0f;
        float f3 = z ? 0.0f : 1.0f;
        float fM175859d2 = z ? qa00.m175859d(24.0f) : 0.0f;
        float f4 = this.f52593e ? 0.0f : -qa00.m175859d(24.0f);
        boolean z2 = this.f52593e;
        float f5 = z2 ? 0.0f : 1.0f;
        float f6 = z2 ? 1.0f : 0.0f;
        Animator animatorM132170p = gt0.m132170p(this.f52589a, "translationY", 4000L, 300L, new AccelerateInterpolator(), fM175859d, f);
        Animator animatorM132170p2 = gt0.m132170p(this.f52589a, "alpha", 4000L, 300L, new AccelerateInterpolator(), f2, f3);
        Animator animatorM132170p3 = gt0.m132170p(this.f52590b, "translationY", 4000L, 300L, new AccelerateInterpolator(), fM175859d2, f4);
        Animator animatorM132170p4 = gt0.m132170p(this.f52590b, "alpha", 4000L, 300L, new AccelerateInterpolator(), f5, f6);
        gt0.m132176v(animatorM132170p4, new Runnable() { // from class: l.va80
            @Override // java.lang.Runnable
            public final void run() {
                this.f183071a.m77418k();
            }
        });
        Animator animatorM132180z = gt0.m132180z(gt0.m132180z(animatorM132170p, animatorM132170p2), gt0.m132180z(animatorM132170p3, animatorM132170p4));
        this.f52596h = animatorM132180z;
        gt0.m132160f(animatorM132180z, new Runnable() { // from class: l.wa80
            @Override // java.lang.Runnable
            public final void run() {
                this.f188096a.m77420m();
            }
        });
        this.f52596h.start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m77413f();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m77412e(this);
        this.f52591c = this.f52589a.getX();
        this.f52592d = this.f52589a.getX();
        bnl0.m105509E0(this.f52589a, new View.OnClickListener() { // from class: l.xa80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f192995a.m77416i(view);
            }
        });
        bnl0.m105509E0(this.f52590b, new View.OnClickListener() { // from class: l.ya80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f198157a.m77417j(view);
            }
        });
    }

    public void setBroadCastInfos(List<BLiveCommonViewConfig> list) {
        this.f52595g = list;
        this.f52593e = false;
        this.f52594f = 0;
        m77420m();
    }

    public PkUpDownScorllView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public PkUpDownScorllView(@NonNull Context context) {
        this(context, null);
    }
}
