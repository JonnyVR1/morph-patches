package com.p000p1.mobile.putong.core.p001ui.dlg.views;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import com.p1.mobile.android.ui.bubble.d;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.utils.NullChecker;
import l.eqh0;
import l.qib0;
import l.t100;
import l.x2c0;
import l.xdl0;
import p003l.hj3;
import p003l.hld0;
import p003l.r7i0;
import v.VButton;
import v.VCheckBox;
import v.VDraweeView;
import v.VFrame;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class BusinessAnimView extends VFrame {

    /* JADX INFO: renamed from: A */
    public CompoundButton.OnCheckedChangeListener f1377A;

    /* JADX INFO: renamed from: a */
    public RelativeLayout f1378a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f1379b;

    /* JADX INFO: renamed from: c */
    public FrameLayout f1380c;

    /* JADX INFO: renamed from: d */
    public SVGAnimationView f1381d;

    /* JADX INFO: renamed from: e */
    public SVGAnimationView f1382e;

    /* JADX INFO: renamed from: f */
    public ImageView f1383f;

    /* JADX INFO: renamed from: g */
    public VFrame f1384g;

    /* JADX INFO: renamed from: h */
    public VFrame f1385h;

    /* JADX INFO: renamed from: i */
    public VImage f1386i;

    /* JADX INFO: renamed from: j */
    public VImage f1387j;

    /* JADX INFO: renamed from: k */
    public VText f1388k;

    /* JADX INFO: renamed from: l */
    public TextView f1389l;

    /* JADX INFO: renamed from: m */
    public TextView f1390m;

    /* JADX INFO: renamed from: n */
    public TextView f1391n;

    /* JADX INFO: renamed from: o */
    public LinearLayout f1392o;

    /* JADX INFO: renamed from: p */
    public VCheckBox f1393p;

    /* JADX INFO: renamed from: q */
    public TextView f1394q;

    /* JADX INFO: renamed from: r */
    public VButton f1395r;

    /* JADX INFO: renamed from: s */
    public TextView f1396s;

    /* JADX INFO: renamed from: t */
    public View f1397t;

    /* JADX INFO: renamed from: u */
    public VFrame f1398u;

    /* JADX INFO: renamed from: v */
    public TextView f1399v;

    /* JADX INFO: renamed from: w */
    public final Path f1400w;

    /* JADX INFO: renamed from: x */
    public hld0<String> f1401x;

    /* JADX INFO: renamed from: y */
    public float f1402y;

    /* JADX INFO: renamed from: z */
    public ObjectAnimator f1403z;

    public BusinessAnimView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1402y = t100.d(20.0f);
        this.f1400w = new Path();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public /* synthetic */ void m2508K(Runnable runnable, View view) {
        runnable.run();
        if (NullChecker.a(this.f1377A)) {
            CompoundButton.OnCheckedChangeListener onCheckedChangeListener = this.f1377A;
            VCheckBox vCheckBox = this.f1393p;
            onCheckedChangeListener.onCheckedChanged(vCheckBox, vCheckBox.isChecked());
        }
    }

    /* JADX INFO: renamed from: P */
    private void m2509P(int i, int i2) {
        Path path = this.f1400w;
        RectF rectF = new RectF(0.0f, 0.0f, i, i2);
        float f = this.f1402y;
        path.addRoundRect(rectF, f, f, Path.Direction.CW);
    }

    /* JADX INFO: renamed from: B */
    public BusinessAnimView m2512B(CharSequence charSequence) {
        if (NullChecker.a(charSequence)) {
            xdl0.M0(this.f1390m, true);
            this.f1390m.setText(charSequence);
        }
        return this;
    }

    /* JADX INFO: renamed from: C */
    public BusinessAnimView m2513C(View view) {
        this.f1385h.removeAllViews();
        this.f1385h.addView(view);
        xdl0.M(this.f1380c, false);
        return this;
    }

    /* JADX INFO: renamed from: E */
    public BusinessAnimView m2514E(int i) {
        xdl0.M0(this.f1387j, true);
        this.f1387j.setImageResource(i);
        return this;
    }

    /* JADX INFO: renamed from: F */
    public BusinessAnimView m2515F() {
        r7i0 r7i0Var = new r7i0(this.f1381d, this.f1382e);
        this.f1401x = r7i0Var;
        r7i0Var.mo7014c("https://auto.tancdn.com/v1/raw/48b01864-e871-498a-9151-f761e3d3188708.so", -1);
        return this;
    }

    /* JADX INFO: renamed from: G */
    public void m2516G() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f1398u, "translationY", 0.0f, t100.d(7.0f), 0.0f);
        this.f1403z = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(1500L);
        this.f1403z.setInterpolator(new LinearInterpolator());
        this.f1403z.setRepeatCount(-1);
    }

    /* JADX INFO: renamed from: L */
    public BusinessAnimView m2517L(CharSequence charSequence, final Runnable runnable) {
        this.f1396s.setText(charSequence);
        if (NullChecker.a(runnable)) {
            this.f1396s.setOnClickListener(new View.OnClickListener() { // from class: l.gj3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    runnable.run();
                }
            });
        }
        return this;
    }

    /* JADX INFO: renamed from: M */
    public BusinessAnimView m2518M(int i, CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        xdl0.M0(this.f1392o, true);
        this.f1394q.setText(i);
        this.f1377A = onCheckedChangeListener;
        return this;
    }

    /* JADX INFO: renamed from: N */
    public BusinessAnimView m2519N(CharSequence charSequence, final Runnable runnable) {
        this.f1395r.setText(charSequence);
        this.f1395r.setOnClickListener(new View.OnClickListener() { // from class: l.fj3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f4442a.m2508K(runnable, view);
            }
        });
        return this;
    }

    /* JADX INFO: renamed from: O */
    public BusinessAnimView m2520O(String str) {
        xdl0.C0(this.f1379b, t100.d(250.0f));
        qib0.G.D(this.f1379b, str);
        return this;
    }

    /* JADX INFO: renamed from: Q */
    public void m2521Q() {
        this.f1403z.cancel();
        if (NullChecker.a(this.f1401x)) {
            this.f1401x.mo7012a();
        }
    }

    /* JADX INFO: renamed from: R */
    public BusinessAnimView m2522R(CharSequence charSequence) {
        xdl0.M0(this.f1389l, true);
        this.f1389l.setText(charSequence);
        return this;
    }

    /* JADX INFO: renamed from: S */
    public BusinessAnimView m2523S(@ColorInt int i) {
        this.f1389l.setTextColor(i);
        return this;
    }

    /* JADX INFO: renamed from: T */
    public BusinessAnimView m2524T(String str) {
        xdl0.M0(this.f1388k, true);
        this.f1388k.setText(str);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void draw(Canvas canvas) {
        int iSave = canvas.save();
        canvas.clipPath(this.f1400w);
        super/*android.view.View*/.draw(canvas);
        canvas.restoreToCount(iSave);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDetachedFromWindow() {
        m2521Q();
        d.l().k("boost_dlg_bubble");
        super/*android.view.View*/.onDetachedFromWindow();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m2525u(this);
        m2516G();
        this.f1395r.setBackgroundResource(x2c0.T);
        this.f1388k.setTypeface(eqh0.c(3), 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super/*android.view.View*/.onLayout(z, i, i2, i3, i4);
        m2509P(getWidth(), getHeight());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setRectRadius(float f) {
        this.f1402y = f;
        invalidate();
    }

    /* JADX INFO: renamed from: u */
    public final void m2525u(View view) {
        hj3.m7006a(this, view);
    }

    /* JADX INFO: renamed from: v */
    public BusinessAnimView m2526v(String str, int i) {
        if (NullChecker.a(this.f1401x)) {
            this.f1401x.mo7013b(str, i);
        }
        return this;
    }

    /* JADX INFO: renamed from: w */
    public BusinessAnimView m2527w(@DrawableRes int i) {
        this.f1379b.setActualImageResource(i);
        xdl0.C0(this.f1379b, t100.d(250.0f));
        return this;
    }

    /* JADX INFO: renamed from: z */
    public void m2528z(boolean z) {
        this.f1393p.setChecked(z);
    }

    public BusinessAnimView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BusinessAnimView(Context context) {
        this(context, null);
    }
}
