package com.p046p1.mobile.putong.core.newui.home.views;

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
import com.p046p1.mobile.putong.core.newui.view.BoostViewContainer;
import com.tantan.library.svga.SVGAnimationView;
import p147v.VButton;
import p147v.VFrame;
import p147v.VIcon;
import p147v.VOnlineIndicator;
import p149l.kdl;
import p149l.xdl0;

/* JADX INFO: loaded from: classes11.dex */
public class HomeTitleLayout extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public HomeTitleLayout f23927a;

    /* JADX INFO: renamed from: b */
    public LinearLayoutCompat f23928b;

    /* JADX INFO: renamed from: c */
    public VButton f23929c;

    /* JADX INFO: renamed from: d */
    public ConstraintLayout f23930d;

    /* JADX INFO: renamed from: e */
    public View f23931e;

    /* JADX INFO: renamed from: f */
    public SVGAnimationView f23932f;

    /* JADX INFO: renamed from: g */
    public SVGAnimationView f23933g;

    /* JADX INFO: renamed from: h */
    public TextView f23934h;

    /* JADX INFO: renamed from: i */
    public VIcon f23935i;

    /* JADX INFO: renamed from: j */
    public VIcon f23936j;

    /* JADX INFO: renamed from: k */
    public VFrame f23937k;

    /* JADX INFO: renamed from: l */
    public VIcon f23938l;

    /* JADX INFO: renamed from: m */
    public VFrame f23939m;

    /* JADX INFO: renamed from: n */
    public BoostViewContainer f23940n;

    /* JADX INFO: renamed from: o */
    public VFrame f23941o;

    /* JADX INFO: renamed from: p */
    public VIcon f23942p;

    /* JADX INFO: renamed from: q */
    public TextView f23943q;

    /* JADX INFO: renamed from: r */
    public FrameLayout f23944r;

    /* JADX INFO: renamed from: s */
    public VIcon f23945s;

    /* JADX INFO: renamed from: t */
    public VFrame f23946t;

    /* JADX INFO: renamed from: u */
    public VIcon f23947u;

    /* JADX INFO: renamed from: v */
    public VOnlineIndicator f23948v;

    /* JADX INFO: renamed from: w */
    public ViewStub f23949w;

    /* JADX INFO: renamed from: x */
    public ViewStub f23950x;

    public HomeTitleLayout(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m39172a(View view) {
        kdl.m145646a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m39172a(this);
        xdl0.m208344M(this.f23928b, true);
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
