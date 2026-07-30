package com.p051p1.mobile.putong.core.newui.explore.view;

import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.DrawableRes;
import com.p051p1.mobile.putong.core.newui.home.opt.CardProgressAction;
import p151v.VFrame;
import p151v.VIcon;
import p153l.jpf;
import p153l.kec0;
import p153l.khc0;

/* JADX INFO: loaded from: classes11.dex */
public class ExploreCardOperationButton extends VFrame {

    /* JADX INFO: renamed from: a */
    public Drawable f22164a;

    /* JADX INFO: renamed from: b */
    public Drawable f22165b;

    /* JADX INFO: renamed from: c */
    public int f22166c;

    /* JADX INFO: renamed from: d */
    public int f22167d;

    /* JADX INFO: renamed from: e */
    public int f22168e;

    /* JADX INFO: renamed from: f */
    public float f22169f;

    /* JADX INFO: renamed from: g */
    public Paint f22170g;

    /* JADX INFO: renamed from: h */
    public Path f22171h;

    /* JADX INFO: renamed from: i */
    public View f22172i;

    /* JADX INFO: renamed from: j */
    public View f22173j;

    /* JADX INFO: renamed from: k */
    public VIcon f22174k;

    public ExploreCardOperationButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, khc0.f126844u0);
        this.f22168e = typedArrayObtainStyledAttributes.getResourceId(khc0.f126856y0, -1);
        this.f22167d = typedArrayObtainStyledAttributes.getColor(khc0.f126847v0, -1);
        float f = typedArrayObtainStyledAttributes.getFloat(khc0.f126853x0, 1.5f);
        this.f22169f = f;
        this.f22169f = Math.min(Math.max(0.5f, f), 1.5f);
        this.f22166c = typedArrayObtainStyledAttributes.getResourceId(khc0.f126850w0, -1);
        this.f22165b = typedArrayObtainStyledAttributes.getDrawable(khc0.f126859z0);
        this.f22164a = typedArrayObtainStyledAttributes.getDrawable(khc0.f126710A0);
        typedArrayObtainStyledAttributes.recycle();
        m37396s();
    }

    /* JADX INFO: renamed from: a */
    public void m37392a(float f, CardProgressAction cardProgressAction) {
        float fMax = Math.max(Math.min(f, 1.0f), 0.0f);
        View view = this.f22173j;
        if (fMax > 0.0f) {
            view.setAlpha(fMax);
            this.f22174k.setColorFilter(this.f22167d);
        } else {
            view.setAlpha(0.0f);
            this.f22174k.clearColorFilter();
        }
        float f2 = ((this.f22169f - 1.0f) * fMax) + 1.0f;
        setScaleX(f2);
        setScaleY(f2);
    }

    /* JADX INFO: renamed from: c */
    public void m37393c(CardProgressAction cardProgressAction) {
        m37394j(0.0f);
    }

    /* JADX INFO: renamed from: j */
    public void m37394j(float f) {
        m37392a(f, CardProgressAction.UNKNOWN);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        View viewInflate = View.inflate(getContext(), kec0.f125757b3, null);
        m37395p(viewInflate);
        addView(viewInflate);
        if (this.f22166c != -1) {
            this.f22174k.setStateListAnimator(AnimatorInflater.loadStateListAnimator(getContext(), this.f22166c));
        }
        int i = this.f22168e;
        if (i != -1) {
            this.f22174k.setImageResource(i);
        }
        setNormalStateLayerBackground(this.f22165b);
        setPressedStateLayerBackground(this.f22164a);
        this.f22173j.setAlpha(0.0f);
    }

    /* JADX INFO: renamed from: p */
    public final void m37395p(View view) {
        jpf.m146491a(this, view);
    }

    public void reset() {
        m37393c(CardProgressAction.UNKNOWN);
    }

    /* JADX INFO: renamed from: s */
    public final void m37396s() {
        Paint paint = new Paint();
        this.f22170g = paint;
        paint.setColor(0);
        this.f22171h = new Path();
    }

    public void setNormalStateLayerBackground(Drawable drawable) {
        this.f22172i.setBackground(drawable);
    }

    public void setPressedStateLayerBackground(Drawable drawable) {
        this.f22173j.setBackground(drawable);
    }

    /* JADX INFO: renamed from: u */
    public void m37397u(@DrawableRes int i, @DrawableRes int i2) {
        this.f22172i.setBackgroundResource(i);
        this.f22174k.setImageResource(i2);
    }

    public ExploreCardOperationButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ExploreCardOperationButton(Context context) {
        this(context, null);
    }
}
