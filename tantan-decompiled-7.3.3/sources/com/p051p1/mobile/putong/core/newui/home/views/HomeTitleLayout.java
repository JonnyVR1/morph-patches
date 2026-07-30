package com.p051p1.mobile.putong.core.newui.home.views;

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
import com.p051p1.mobile.putong.core.newui.view.BoostViewContainer;
import com.tantan.library.svga.SVGAnimationView;
import p151v.VButton;
import p151v.VFrame;
import p151v.VIcon;
import p151v.VOnlineIndicator;
import p153l.agl;
import p153l.bnl0;

/* JADX INFO: loaded from: classes11.dex */
public class HomeTitleLayout extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public HomeTitleLayout f24669a;

    /* JADX INFO: renamed from: b */
    public LinearLayoutCompat f24670b;

    /* JADX INFO: renamed from: c */
    public VButton f24671c;

    /* JADX INFO: renamed from: d */
    public ConstraintLayout f24672d;

    /* JADX INFO: renamed from: e */
    public View f24673e;

    /* JADX INFO: renamed from: f */
    public SVGAnimationView f24674f;

    /* JADX INFO: renamed from: g */
    public SVGAnimationView f24675g;

    /* JADX INFO: renamed from: h */
    public TextView f24676h;

    /* JADX INFO: renamed from: i */
    public VIcon f24677i;

    /* JADX INFO: renamed from: j */
    public VIcon f24678j;

    /* JADX INFO: renamed from: k */
    public VFrame f24679k;

    /* JADX INFO: renamed from: l */
    public VIcon f24680l;

    /* JADX INFO: renamed from: m */
    public VFrame f24681m;

    /* JADX INFO: renamed from: n */
    public BoostViewContainer f24682n;

    /* JADX INFO: renamed from: o */
    public VFrame f24683o;

    /* JADX INFO: renamed from: p */
    public VIcon f24684p;

    /* JADX INFO: renamed from: q */
    public TextView f24685q;

    /* JADX INFO: renamed from: r */
    public FrameLayout f24686r;

    /* JADX INFO: renamed from: s */
    public VIcon f24687s;

    /* JADX INFO: renamed from: t */
    public VFrame f24688t;

    /* JADX INFO: renamed from: u */
    public VIcon f24689u;

    /* JADX INFO: renamed from: v */
    public VOnlineIndicator f24690v;

    /* JADX INFO: renamed from: w */
    public ViewStub f24691w;

    /* JADX INFO: renamed from: x */
    public ViewStub f24692x;

    public HomeTitleLayout(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m40175a(View view) {
        agl.m97702a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m40175a(this);
        bnl0.m105524M(this.f24670b, true);
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
