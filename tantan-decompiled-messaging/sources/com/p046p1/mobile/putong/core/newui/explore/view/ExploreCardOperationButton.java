package com.p046p1.mobile.putong.core.newui.explore.view;

import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.DrawableRes;
import com.p046p1.mobile.putong.core.newui.home.opt.CardProgressAction;
import p147v.VFrame;
import p147v.VIcon;
import p149l.cof;
import p149l.e9c0;
import p149l.f6c0;

/* JADX INFO: loaded from: classes11.dex */
public class ExploreCardOperationButton extends VFrame {

    /* JADX INFO: renamed from: a */
    public Drawable f21422a;

    /* JADX INFO: renamed from: b */
    public Drawable f21423b;

    /* JADX INFO: renamed from: c */
    public int f21424c;

    /* JADX INFO: renamed from: d */
    public int f21425d;

    /* JADX INFO: renamed from: e */
    public int f21426e;

    /* JADX INFO: renamed from: f */
    public float f21427f;

    /* JADX INFO: renamed from: g */
    public Paint f21428g;

    /* JADX INFO: renamed from: h */
    public Path f21429h;

    /* JADX INFO: renamed from: i */
    public View f21430i;

    /* JADX INFO: renamed from: j */
    public View f21431j;

    /* JADX INFO: renamed from: k */
    public VIcon f21432k;

    public ExploreCardOperationButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e9c0.f90074u0);
        this.f21426e = typedArrayObtainStyledAttributes.getResourceId(e9c0.f90086y0, -1);
        this.f21425d = typedArrayObtainStyledAttributes.getColor(e9c0.f90077v0, -1);
        float f = typedArrayObtainStyledAttributes.getFloat(e9c0.f90083x0, 1.5f);
        this.f21427f = f;
        this.f21427f = Math.min(Math.max(0.5f, f), 1.5f);
        this.f21424c = typedArrayObtainStyledAttributes.getResourceId(e9c0.f90080w0, -1);
        this.f21423b = typedArrayObtainStyledAttributes.getDrawable(e9c0.f90089z0);
        this.f21422a = typedArrayObtainStyledAttributes.getDrawable(e9c0.f89940A0);
        typedArrayObtainStyledAttributes.recycle();
        m36393s();
    }

    /* JADX INFO: renamed from: a */
    public void m36389a(float f, CardProgressAction cardProgressAction) {
        float fMax = Math.max(Math.min(f, 1.0f), 0.0f);
        View view = this.f21431j;
        if (fMax > 0.0f) {
            view.setAlpha(fMax);
            this.f21432k.setColorFilter(this.f21425d);
        } else {
            view.setAlpha(0.0f);
            this.f21432k.clearColorFilter();
        }
        float f2 = ((this.f21427f - 1.0f) * fMax) + 1.0f;
        setScaleX(f2);
        setScaleY(f2);
    }

    /* JADX INFO: renamed from: c */
    public void m36390c(CardProgressAction cardProgressAction) {
        m36391j(0.0f);
    }

    /* JADX INFO: renamed from: j */
    public void m36391j(float f) {
        m36389a(f, CardProgressAction.UNKNOWN);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        View viewInflate = View.inflate(getContext(), f6c0.f95703b3, null);
        m36392p(viewInflate);
        addView(viewInflate);
        if (this.f21424c != -1) {
            this.f21432k.setStateListAnimator(AnimatorInflater.loadStateListAnimator(getContext(), this.f21424c));
        }
        int i = this.f21426e;
        if (i != -1) {
            this.f21432k.setImageResource(i);
        }
        setNormalStateLayerBackground(this.f21423b);
        setPressedStateLayerBackground(this.f21422a);
        this.f21431j.setAlpha(0.0f);
    }

    /* JADX INFO: renamed from: p */
    public final void m36392p(View view) {
        cof.m108009a(this, view);
    }

    public void reset() {
        m36390c(CardProgressAction.UNKNOWN);
    }

    /* JADX INFO: renamed from: s */
    public final void m36393s() {
        Paint paint = new Paint();
        this.f21428g = paint;
        paint.setColor(0);
        this.f21429h = new Path();
    }

    public void setNormalStateLayerBackground(Drawable drawable) {
        this.f21430i.setBackground(drawable);
    }

    public void setPressedStateLayerBackground(Drawable drawable) {
        this.f21431j.setBackground(drawable);
    }

    /* JADX INFO: renamed from: u */
    public void m36394u(@DrawableRes int i, @DrawableRes int i2) {
        this.f21430i.setBackgroundResource(i);
        this.f21432k.setImageResource(i2);
    }

    public ExploreCardOperationButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ExploreCardOperationButton(Context context) {
        this(context, null);
    }
}
