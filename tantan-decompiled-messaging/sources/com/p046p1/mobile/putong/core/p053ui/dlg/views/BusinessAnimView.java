package com.p046p1.mobile.putong.core.p053ui.dlg.views;

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
import com.p046p1.mobile.android.p048ui.bubble.C4348d;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.utils.NullChecker;
import p147v.VButton;
import p147v.VCheckBox;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VImage;
import p147v.VText;
import p149l.eqh0;
import p149l.hj3;
import p149l.hld0;
import p149l.qib0;
import p149l.r7i0;
import p149l.t100;
import p149l.x2c0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes10.dex */
public class BusinessAnimView extends VFrame {

    /* JADX INFO: renamed from: A */
    public CompoundButton.OnCheckedChangeListener f28983A;

    /* JADX INFO: renamed from: a */
    public RelativeLayout f28984a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f28985b;

    /* JADX INFO: renamed from: c */
    public FrameLayout f28986c;

    /* JADX INFO: renamed from: d */
    public SVGAnimationView f28987d;

    /* JADX INFO: renamed from: e */
    public SVGAnimationView f28988e;

    /* JADX INFO: renamed from: f */
    public ImageView f28989f;

    /* JADX INFO: renamed from: g */
    public VFrame f28990g;

    /* JADX INFO: renamed from: h */
    public VFrame f28991h;

    /* JADX INFO: renamed from: i */
    public VImage f28992i;

    /* JADX INFO: renamed from: j */
    public VImage f28993j;

    /* JADX INFO: renamed from: k */
    public VText f28994k;

    /* JADX INFO: renamed from: l */
    public TextView f28995l;

    /* JADX INFO: renamed from: m */
    public TextView f28996m;

    /* JADX INFO: renamed from: n */
    public TextView f28997n;

    /* JADX INFO: renamed from: o */
    public LinearLayout f28998o;

    /* JADX INFO: renamed from: p */
    public VCheckBox f28999p;

    /* JADX INFO: renamed from: q */
    public TextView f29000q;

    /* JADX INFO: renamed from: r */
    public VButton f29001r;

    /* JADX INFO: renamed from: s */
    public TextView f29002s;

    /* JADX INFO: renamed from: t */
    public View f29003t;

    /* JADX INFO: renamed from: u */
    public VFrame f29004u;

    /* JADX INFO: renamed from: v */
    public TextView f29005v;

    /* JADX INFO: renamed from: w */
    public final Path f29006w;

    /* JADX INFO: renamed from: x */
    public hld0<String> f29007x;

    /* JADX INFO: renamed from: y */
    public float f29008y;

    /* JADX INFO: renamed from: z */
    public ObjectAnimator f29009z;

    public BusinessAnimView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f29008y = t100.m186890d(20.0f);
        this.f29006w = new Path();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public /* synthetic */ void m45191K(Runnable runnable, View view) {
        runnable.run();
        if (NullChecker.m81303a(this.f28983A)) {
            CompoundButton.OnCheckedChangeListener onCheckedChangeListener = this.f28983A;
            VCheckBox vCheckBox = this.f28999p;
            onCheckedChangeListener.onCheckedChanged(vCheckBox, vCheckBox.isChecked());
        }
    }

    /* JADX INFO: renamed from: P */
    private void m45192P(int i, int i2) {
        Path path = this.f29006w;
        RectF rectF = new RectF(0.0f, 0.0f, i, i2);
        float f = this.f29008y;
        path.addRoundRect(rectF, f, f, Path.Direction.CW);
    }

    /* JADX INFO: renamed from: B */
    public BusinessAnimView m45195B(CharSequence charSequence) {
        if (NullChecker.m81303a(charSequence)) {
            xdl0.m208345M0(this.f28996m, true);
            this.f28996m.setText(charSequence);
        }
        return this;
    }

    /* JADX INFO: renamed from: C */
    public BusinessAnimView m45196C(View view) {
        this.f28991h.removeAllViews();
        this.f28991h.addView(view);
        xdl0.m208344M(this.f28986c, false);
        return this;
    }

    /* JADX INFO: renamed from: E */
    public BusinessAnimView m45197E(int i) {
        xdl0.m208345M0(this.f28993j, true);
        this.f28993j.setImageResource(i);
        return this;
    }

    /* JADX INFO: renamed from: F */
    public BusinessAnimView m45198F() {
        r7i0 r7i0Var = new r7i0(this.f28987d, this.f28988e);
        this.f29007x = r7i0Var;
        r7i0Var.mo131651c("https://auto.tancdn.com/v1/raw/48b01864-e871-498a-9151-f761e3d3188708.so", -1);
        return this;
    }

    /* JADX INFO: renamed from: G */
    public void m45199G() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f29004u, "translationY", 0.0f, t100.m186890d(7.0f), 0.0f);
        this.f29009z = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(1500L);
        this.f29009z.setInterpolator(new LinearInterpolator());
        this.f29009z.setRepeatCount(-1);
    }

    /* JADX INFO: renamed from: L */
    public BusinessAnimView m45200L(CharSequence charSequence, final Runnable runnable) {
        this.f29002s.setText(charSequence);
        if (NullChecker.m81303a(runnable)) {
            this.f29002s.setOnClickListener(new View.OnClickListener() { // from class: l.gj3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    runnable.run();
                }
            });
        }
        return this;
    }

    /* JADX INFO: renamed from: M */
    public BusinessAnimView m45201M(int i, CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        xdl0.m208345M0(this.f28998o, true);
        this.f29000q.setText(i);
        this.f28983A = onCheckedChangeListener;
        return this;
    }

    /* JADX INFO: renamed from: N */
    public BusinessAnimView m45202N(CharSequence charSequence, final Runnable runnable) {
        this.f29001r.setText(charSequence);
        this.f29001r.setOnClickListener(new View.OnClickListener() { // from class: l.fj3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f97753a.m45191K(runnable, view);
            }
        });
        return this;
    }

    /* JADX INFO: renamed from: O */
    public BusinessAnimView m45203O(String str) {
        xdl0.m208325C0(this.f28985b, t100.m186890d(250.0f));
        qib0.f154691G.m102314D(this.f28985b, str);
        return this;
    }

    /* JADX INFO: renamed from: Q */
    public void m45204Q() {
        this.f29009z.cancel();
        if (NullChecker.m81303a(this.f29007x)) {
            this.f29007x.mo131649a();
        }
    }

    /* JADX INFO: renamed from: R */
    public BusinessAnimView m45205R(CharSequence charSequence) {
        xdl0.m208345M0(this.f28995l, true);
        this.f28995l.setText(charSequence);
        return this;
    }

    /* JADX INFO: renamed from: S */
    public BusinessAnimView m45206S(@ColorInt int i) {
        this.f28995l.setTextColor(i);
        return this;
    }

    /* JADX INFO: renamed from: T */
    public BusinessAnimView m45207T(String str) {
        xdl0.m208345M0(this.f28994k, true);
        this.f28994k.setText(str);
        return this;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int iSave = canvas.save();
        canvas.clipPath(this.f29006w);
        super.draw(canvas);
        canvas.restoreToCount(iSave);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        m45204Q();
        C4348d.m20896l().m20900k("boost_dlg_bubble");
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m45208u(this);
        m45199G();
        this.f29001r.setBackgroundResource(x2c0.f189748T);
        this.f28994k.setTypeface(eqh0.m117752c(3), 1);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        m45192P(getWidth(), getHeight());
    }

    public void setRectRadius(float f) {
        this.f29008y = f;
        invalidate();
    }

    /* JADX INFO: renamed from: u */
    public final void m45208u(View view) {
        hj3.m131353a(this, view);
    }

    /* JADX INFO: renamed from: v */
    public BusinessAnimView m45209v(String str, int i) {
        if (NullChecker.m81303a(this.f29007x)) {
            this.f29007x.mo131650b(str, i);
        }
        return this;
    }

    /* JADX INFO: renamed from: w */
    public BusinessAnimView m45210w(@DrawableRes int i) {
        this.f28985b.setActualImageResource(i);
        xdl0.m208325C0(this.f28985b, t100.m186890d(250.0f));
        return this;
    }

    /* JADX INFO: renamed from: z */
    public void m45211z(boolean z) {
        this.f28999p.setChecked(z);
    }

    public BusinessAnimView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BusinessAnimView(Context context) {
        this(context, null);
    }
}
