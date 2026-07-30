package com.p046p1.mobile.putong.live.livingroom.recreation.p062pk.view;

import android.animation.Animator;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.live.base.data.BLiveCommonViewConfig;
import java.util.ArrayList;
import java.util.List;
import p149l.bt0;
import p149l.e30;
import p149l.h1c0;
import p149l.i3c0;
import p149l.t100;
import p149l.t280;
import p149l.xdl0;

/* JADX INFO: loaded from: classes5.dex */
public class PkUpDownScorllView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public PkScorllItemView f51741a;

    /* JADX INFO: renamed from: b */
    public PkScorllItemView f51742b;

    /* JADX INFO: renamed from: c */
    public float f51743c;

    /* JADX INFO: renamed from: d */
    public float f51744d;

    /* JADX INFO: renamed from: e */
    public boolean f51745e;

    /* JADX INFO: renamed from: f */
    public int f51746f;

    /* JADX INFO: renamed from: g */
    public List<BLiveCommonViewConfig> f51747g;

    /* JADX INFO: renamed from: h */
    public Animator f51748h;

    /* JADX INFO: renamed from: i */
    public e30<String> f51749i;

    public PkUpDownScorllView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f51743c = 0.0f;
        this.f51744d = 0.0f;
        this.f51745e = false;
        this.f51746f = 0;
        this.f51747g = new ArrayList();
        this.f51748h = null;
    }

    /* JADX INFO: renamed from: e */
    public final void m76229e(View view) {
        t280.m186967a(this, view);
    }

    /* JADX INFO: renamed from: f */
    public void m76230f() {
        Animator animator = this.f51748h;
        if (animator != null) {
            animator.removeAllListeners();
            this.f51748h.cancel();
            this.f51748h = null;
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m76231g(View view) {
        e30<String> e30Var;
        BLiveCommonViewConfig bLiveCommonViewConfig = (BLiveCommonViewConfig) view.getTag();
        if (bLiveCommonViewConfig == null || TextUtils.isEmpty(bLiveCommonViewConfig.scheme) || (e30Var = this.f51749i) == null) {
            return;
        }
        e30Var.call(bLiveCommonViewConfig.scheme);
    }

    /* JADX INFO: renamed from: h */
    public void m76232h(BLiveCommonViewConfig bLiveCommonViewConfig, e30<String> e30Var) {
        this.f51749i = e30Var;
        PkScorllItemView pkScorllItemView = this.f51741a;
        if (pkScorllItemView != null) {
            pkScorllItemView.setX(this.f51743c);
            this.f51741a.setY(this.f51744d);
            this.f51741a.setAlpha(1.0f);
            this.f51741a.m76214b(bLiveCommonViewConfig);
            this.f51741a.setTag(bLiveCommonViewConfig);
            xdl0.m208344M(this.f51741a, true);
            xdl0.m208344M(this.f51742b, false);
        }
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m76233i(View view) {
        m76231g(this.f51741a);
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m76234j(View view) {
        m76231g(this.f51742b);
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m76235k() {
        xdl0.m208344M(this.f51742b, true);
    }

    /* JADX INFO: renamed from: l */
    public void m76236l() {
        this.f51741a.f51727a.setTextColor(getResources().getColor(h1c0.f105395p1));
        this.f51742b.f51727a.setTextColor(getResources().getColor(h1c0.f105395p1));
        this.f51741a.f51727a.setTextSize(2, 14.0f);
        this.f51742b.f51727a.setTextSize(2, 14.0f);
        this.f51741a.f51728b.setImageResource(i3c0.f111063k5);
        this.f51742b.f51728b.setImageResource(i3c0.f111063k5);
    }

    /* JADX INFO: renamed from: m */
    public final void m76237m() {
        m76230f();
        this.f51745e = !this.f51745e;
        List<BLiveCommonViewConfig> list = this.f51747g;
        int i = this.f51746f;
        this.f51746f = i + 1;
        BLiveCommonViewConfig bLiveCommonViewConfig = list.get(i);
        if (this.f51746f == this.f51747g.size()) {
            this.f51746f = 0;
        }
        BLiveCommonViewConfig bLiveCommonViewConfig2 = this.f51747g.get(this.f51746f);
        if (bLiveCommonViewConfig == null || bLiveCommonViewConfig2 == null) {
            return;
        }
        if (this.f51745e) {
            this.f51741a.m76214b(bLiveCommonViewConfig);
            this.f51742b.m76214b(bLiveCommonViewConfig2);
            this.f51741a.setTag(bLiveCommonViewConfig);
            this.f51742b.setTag(bLiveCommonViewConfig2);
        } else {
            this.f51742b.m76214b(bLiveCommonViewConfig);
            this.f51741a.m76214b(bLiveCommonViewConfig2);
            this.f51742b.setTag(bLiveCommonViewConfig);
            this.f51741a.setTag(bLiveCommonViewConfig2);
        }
        float fM186890d = this.f51745e ? 0.0f : t100.m186890d(24.0f);
        float f = this.f51745e ? -t100.m186890d(24.0f) : 0.0f;
        boolean z = this.f51745e;
        float f2 = z ? 1.0f : 0.0f;
        float f3 = z ? 0.0f : 1.0f;
        float fM186890d2 = z ? t100.m186890d(24.0f) : 0.0f;
        float f4 = this.f51745e ? 0.0f : -t100.m186890d(24.0f);
        boolean z2 = this.f51745e;
        float f5 = z2 ? 0.0f : 1.0f;
        float f6 = z2 ? 1.0f : 0.0f;
        Animator animatorM103743p = bt0.m103743p(this.f51741a, "translationY", 4000L, 300L, new AccelerateInterpolator(), fM186890d, f);
        Animator animatorM103743p2 = bt0.m103743p(this.f51741a, "alpha", 4000L, 300L, new AccelerateInterpolator(), f2, f3);
        Animator animatorM103743p3 = bt0.m103743p(this.f51742b, "translationY", 4000L, 300L, new AccelerateInterpolator(), fM186890d2, f4);
        Animator animatorM103743p4 = bt0.m103743p(this.f51742b, "alpha", 4000L, 300L, new AccelerateInterpolator(), f5, f6);
        bt0.m103749v(animatorM103743p4, new Runnable() { // from class: l.p280
            @Override // java.lang.Runnable
            public final void run() {
                this.f146820a.m76235k();
            }
        });
        Animator animatorM103753z = bt0.m103753z(bt0.m103753z(animatorM103743p, animatorM103743p2), bt0.m103753z(animatorM103743p3, animatorM103743p4));
        this.f51748h = animatorM103753z;
        bt0.m103733f(animatorM103753z, new Runnable() { // from class: l.q280
            @Override // java.lang.Runnable
            public final void run() {
                this.f152209a.m76237m();
            }
        });
        this.f51748h.start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m76230f();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m76229e(this);
        this.f51743c = this.f51741a.getX();
        this.f51744d = this.f51741a.getX();
        xdl0.m208329E0(this.f51741a, new View.OnClickListener() { // from class: l.r280
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f157390a.m76233i(view);
            }
        });
        xdl0.m208329E0(this.f51742b, new View.OnClickListener() { // from class: l.s280
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f161964a.m76234j(view);
            }
        });
    }

    public void setBroadCastInfos(List<BLiveCommonViewConfig> list) {
        this.f51747g = list;
        this.f51745e = false;
        this.f51746f = 0;
        m76237m();
    }

    public PkUpDownScorllView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public PkUpDownScorllView(@NonNull Context context) {
        this(context, null);
    }
}
