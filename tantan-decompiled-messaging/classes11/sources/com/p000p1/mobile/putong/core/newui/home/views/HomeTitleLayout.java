package com.p000p1.mobile.putong.core.newui.home.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p000p1.mobile.putong.core.newui.view.BoostViewContainer;
import com.tantan.library.svga.SVGAnimationView;
import l.kdl;
import l.xdl0;
import v.VButton;
import v.VFrame;
import v.VIcon;
import v.VOnlineIndicator;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class HomeTitleLayout extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public HomeTitleLayout f2705a;

    /* JADX INFO: renamed from: b */
    public LinearLayoutCompat f2706b;

    /* JADX INFO: renamed from: c */
    public VButton f2707c;

    /* JADX INFO: renamed from: d */
    public ConstraintLayout f2708d;

    /* JADX INFO: renamed from: e */
    public View f2709e;

    /* JADX INFO: renamed from: f */
    public SVGAnimationView f2710f;

    /* JADX INFO: renamed from: g */
    public SVGAnimationView f2711g;

    /* JADX INFO: renamed from: h */
    public TextView f2712h;

    /* JADX INFO: renamed from: i */
    public VIcon f2713i;

    /* JADX INFO: renamed from: j */
    public VIcon f2714j;

    /* JADX INFO: renamed from: k */
    public VFrame f2715k;

    /* JADX INFO: renamed from: l */
    public VIcon f2716l;

    /* JADX INFO: renamed from: m */
    public VFrame f2717m;

    /* JADX INFO: renamed from: n */
    public BoostViewContainer f2718n;

    /* JADX INFO: renamed from: o */
    public VFrame f2719o;

    /* JADX INFO: renamed from: p */
    public VIcon f2720p;

    /* JADX INFO: renamed from: q */
    public TextView f2721q;

    /* JADX INFO: renamed from: r */
    public FrameLayout f2722r;

    /* JADX INFO: renamed from: s */
    public VIcon f2723s;

    /* JADX INFO: renamed from: t */
    public VFrame f2724t;

    /* JADX INFO: renamed from: u */
    public VIcon f2725u;

    /* JADX INFO: renamed from: v */
    public VOnlineIndicator f2726v;

    /* JADX INFO: renamed from: w */
    public ViewStub f2727w;

    /* JADX INFO: renamed from: x */
    public ViewStub f2728x;

    public HomeTitleLayout(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m3188a(View view) {
        kdl.a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m3188a(this);
        xdl0.M(this.f2706b, true);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (getAlpha() == 0.0f) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public HomeTitleLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public HomeTitleLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
