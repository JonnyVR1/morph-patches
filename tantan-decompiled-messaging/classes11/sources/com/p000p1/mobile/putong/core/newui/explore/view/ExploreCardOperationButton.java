package com.p000p1.mobile.putong.core.newui.explore.view;

import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.DrawableRes;
import com.p000p1.mobile.putong.core.newui.home.opt.CardProgressAction;
import l.cof;
import l.e9c0;
import l.f6c0;
import v.VFrame;
import v.VIcon;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class ExploreCardOperationButton extends VFrame {

    /* JADX INFO: renamed from: a */
    public Drawable f200a;

    /* JADX INFO: renamed from: b */
    public Drawable f201b;

    /* JADX INFO: renamed from: c */
    public int f202c;

    /* JADX INFO: renamed from: d */
    public int f203d;

    /* JADX INFO: renamed from: e */
    public int f204e;

    /* JADX INFO: renamed from: f */
    public float f205f;

    /* JADX INFO: renamed from: g */
    public Paint f206g;

    /* JADX INFO: renamed from: h */
    public Path f207h;

    /* JADX INFO: renamed from: i */
    public View f208i;

    /* JADX INFO: renamed from: j */
    public View f209j;

    /* JADX INFO: renamed from: k */
    public VIcon f210k;

    public ExploreCardOperationButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e9c0.u0);
        this.f204e = typedArrayObtainStyledAttributes.getResourceId(e9c0.y0, -1);
        this.f203d = typedArrayObtainStyledAttributes.getColor(e9c0.v0, -1);
        float f = typedArrayObtainStyledAttributes.getFloat(e9c0.x0, 1.5f);
        this.f205f = f;
        this.f205f = Math.min(Math.max(0.5f, f), 1.5f);
        this.f202c = typedArrayObtainStyledAttributes.getResourceId(e9c0.w0, -1);
        this.f201b = typedArrayObtainStyledAttributes.getDrawable(e9c0.z0);
        this.f200a = typedArrayObtainStyledAttributes.getDrawable(e9c0.A0);
        typedArrayObtainStyledAttributes.recycle();
        m322s();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public void m318a(float f, CardProgressAction cardProgressAction) {
        float fMax = Math.max(Math.min(f, 1.0f), 0.0f);
        View view = this.f209j;
        if (fMax > 0.0f) {
            view.setAlpha(fMax);
            this.f210k.setColorFilter(this.f203d);
        } else {
            view.setAlpha(0.0f);
            this.f210k.clearColorFilter();
        }
        float f2 = ((this.f205f - 1.0f) * fMax) + 1.0f;
        setScaleX(f2);
        setScaleY(f2);
    }

    /* JADX INFO: renamed from: c */
    public void m319c(CardProgressAction cardProgressAction) {
        m320j(0.0f);
    }

    /* JADX INFO: renamed from: j */
    public void m320j(float f) {
        m318a(f, CardProgressAction.UNKNOWN);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        View viewInflate = View.inflate(getContext(), f6c0.b3, null);
        m321p(viewInflate);
        addView(viewInflate);
        if (this.f202c != -1) {
            this.f210k.setStateListAnimator(AnimatorInflater.loadStateListAnimator(getContext(), this.f202c));
        }
        int i = this.f204e;
        if (i != -1) {
            this.f210k.setImageResource(i);
        }
        setNormalStateLayerBackground(this.f201b);
        setPressedStateLayerBackground(this.f200a);
        this.f209j.setAlpha(0.0f);
    }

    /* JADX INFO: renamed from: p */
    public final void m321p(View view) {
        cof.a(this, view);
    }

    public void reset() {
        m319c(CardProgressAction.UNKNOWN);
    }

    /* JADX INFO: renamed from: s */
    public final void m322s() {
        Paint paint = new Paint();
        this.f206g = paint;
        paint.setColor(0);
        this.f207h = new Path();
    }

    public void setNormalStateLayerBackground(Drawable drawable) {
        this.f208i.setBackground(drawable);
    }

    public void setPressedStateLayerBackground(Drawable drawable) {
        this.f209j.setBackground(drawable);
    }

    /* JADX INFO: renamed from: u */
    public void m323u(@DrawableRes int i, @DrawableRes int i2) {
        this.f208i.setBackgroundResource(i);
        this.f210k.setImageResource(i2);
    }

    public ExploreCardOperationButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ExploreCardOperationButton(Context context) {
        this(context, null);
    }
}
