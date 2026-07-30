package com.p051p1.mobile.putong.core.p058ui.dlg.views;

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
import com.p051p1.mobile.android.p053ui.bubble.C4499d;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.utils.NullChecker;
import p151v.VButton;
import p151v.VCheckBox;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VImage;
import p151v.VText;
import p153l.bnl0;
import p153l.dbc0;
import p153l.jtd0;
import p153l.lyh0;
import p153l.qa00;
import p153l.rgi0;
import p153l.uqb0;
import p153l.xj3;

/* JADX INFO: loaded from: classes2.dex */
public class BusinessAnimView extends VFrame {

    /* JADX INFO: renamed from: A */
    public CompoundButton.OnCheckedChangeListener f29831A;

    /* JADX INFO: renamed from: a */
    public RelativeLayout f29832a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f29833b;

    /* JADX INFO: renamed from: c */
    public FrameLayout f29834c;

    /* JADX INFO: renamed from: d */
    public SVGAnimationView f29835d;

    /* JADX INFO: renamed from: e */
    public SVGAnimationView f29836e;

    /* JADX INFO: renamed from: f */
    public ImageView f29837f;

    /* JADX INFO: renamed from: g */
    public VFrame f29838g;

    /* JADX INFO: renamed from: h */
    public VFrame f29839h;

    /* JADX INFO: renamed from: i */
    public VImage f29840i;

    /* JADX INFO: renamed from: j */
    public VImage f29841j;

    /* JADX INFO: renamed from: k */
    public VText f29842k;

    /* JADX INFO: renamed from: l */
    public TextView f29843l;

    /* JADX INFO: renamed from: m */
    public TextView f29844m;

    /* JADX INFO: renamed from: n */
    public TextView f29845n;

    /* JADX INFO: renamed from: o */
    public LinearLayout f29846o;

    /* JADX INFO: renamed from: p */
    public VCheckBox f29847p;

    /* JADX INFO: renamed from: q */
    public TextView f29848q;

    /* JADX INFO: renamed from: r */
    public VButton f29849r;

    /* JADX INFO: renamed from: s */
    public TextView f29850s;

    /* JADX INFO: renamed from: t */
    public View f29851t;

    /* JADX INFO: renamed from: u */
    public VFrame f29852u;

    /* JADX INFO: renamed from: v */
    public TextView f29853v;

    /* JADX INFO: renamed from: w */
    public final Path f29854w;

    /* JADX INFO: renamed from: x */
    public jtd0<String> f29855x;

    /* JADX INFO: renamed from: y */
    public float f29856y;

    /* JADX INFO: renamed from: z */
    public ObjectAnimator f29857z;

    public BusinessAnimView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f29856y = qa00.m175859d(20.0f);
        this.f29854w = new Path();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public /* synthetic */ void m46374K(Runnable runnable, View view) {
        runnable.run();
        if (NullChecker.m82486a(this.f29831A)) {
            CompoundButton.OnCheckedChangeListener onCheckedChangeListener = this.f29831A;
            VCheckBox vCheckBox = this.f29847p;
            onCheckedChangeListener.onCheckedChanged(vCheckBox, vCheckBox.isChecked());
        }
    }

    /* JADX INFO: renamed from: P */
    private void m46375P(int i, int i2) {
        Path path = this.f29854w;
        RectF rectF = new RectF(0.0f, 0.0f, i, i2);
        float f = this.f29856y;
        path.addRoundRect(rectF, f, f, Path.Direction.CW);
    }

    /* JADX INFO: renamed from: B */
    public BusinessAnimView m46378B(CharSequence charSequence) {
        if (NullChecker.m82486a(charSequence)) {
            bnl0.m105525M0(this.f29844m, true);
            this.f29844m.setText(charSequence);
        }
        return this;
    }

    /* JADX INFO: renamed from: C */
    public BusinessAnimView m46379C(View view) {
        this.f29839h.removeAllViews();
        this.f29839h.addView(view);
        bnl0.m105524M(this.f29834c, false);
        return this;
    }

    /* JADX INFO: renamed from: E */
    public BusinessAnimView m46380E(int i) {
        bnl0.m105525M0(this.f29841j, true);
        this.f29841j.setImageResource(i);
        return this;
    }

    /* JADX INFO: renamed from: F */
    public BusinessAnimView m46381F() {
        rgi0 rgi0Var = new rgi0(this.f29835d, this.f29836e);
        this.f29855x = rgi0Var;
        rgi0Var.mo146904c("https://auto.tancdn.com/v1/raw/48b01864-e871-498a-9151-f761e3d3188708.so", -1);
        return this;
    }

    /* JADX INFO: renamed from: G */
    public void m46382G() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f29852u, "translationY", 0.0f, qa00.m175859d(7.0f), 0.0f);
        this.f29857z = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(1500L);
        this.f29857z.setInterpolator(new LinearInterpolator());
        this.f29857z.setRepeatCount(-1);
    }

    /* JADX INFO: renamed from: L */
    public BusinessAnimView m46383L(CharSequence charSequence, final Runnable runnable) {
        this.f29850s.setText(charSequence);
        if (NullChecker.m82486a(runnable)) {
            this.f29850s.setOnClickListener(new View.OnClickListener() { // from class: l.wj3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    runnable.run();
                }
            });
        }
        return this;
    }

    /* JADX INFO: renamed from: M */
    public BusinessAnimView m46384M(int i, CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        bnl0.m105525M0(this.f29846o, true);
        this.f29848q.setText(i);
        this.f29831A = onCheckedChangeListener;
        return this;
    }

    /* JADX INFO: renamed from: N */
    public BusinessAnimView m46385N(CharSequence charSequence, final Runnable runnable) {
        this.f29849r.setText(charSequence);
        this.f29849r.setOnClickListener(new View.OnClickListener() { // from class: l.vj3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f184345a.m46374K(runnable, view);
            }
        });
        return this;
    }

    /* JADX INFO: renamed from: O */
    public BusinessAnimView m46386O(String str) {
        bnl0.m105505C0(this.f29833b, qa00.m175859d(250.0f));
        uqb0.f180374G.m127098D(this.f29833b, str);
        return this;
    }

    /* JADX INFO: renamed from: Q */
    public void m46387Q() {
        this.f29857z.cancel();
        if (NullChecker.m82486a(this.f29855x)) {
            this.f29855x.mo146902a();
        }
    }

    /* JADX INFO: renamed from: R */
    public BusinessAnimView m46388R(CharSequence charSequence) {
        bnl0.m105525M0(this.f29843l, true);
        this.f29843l.setText(charSequence);
        return this;
    }

    /* JADX INFO: renamed from: S */
    public BusinessAnimView m46389S(@ColorInt int i) {
        this.f29843l.setTextColor(i);
        return this;
    }

    /* JADX INFO: renamed from: T */
    public BusinessAnimView m46390T(String str) {
        bnl0.m105525M0(this.f29842k, true);
        this.f29842k.setText(str);
        return this;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int iSave = canvas.save();
        canvas.clipPath(this.f29854w);
        super.draw(canvas);
        canvas.restoreToCount(iSave);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        m46387Q();
        C4499d.m21895l().m21899k("boost_dlg_bubble");
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m46391u(this);
        m46382G();
        this.f29849r.setBackgroundResource(dbc0.f86616U);
        this.f29842k.setTypeface(lyh0.m156283c(3), 1);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        m46375P(getWidth(), getHeight());
    }

    public void setRectRadius(float f) {
        this.f29856y = f;
        invalidate();
    }

    /* JADX INFO: renamed from: u */
    public final void m46391u(View view) {
        xj3.m211194a(this, view);
    }

    /* JADX INFO: renamed from: v */
    public BusinessAnimView m46392v(String str, int i) {
        if (NullChecker.m82486a(this.f29855x)) {
            this.f29855x.mo146903b(str, i);
        }
        return this;
    }

    /* JADX INFO: renamed from: w */
    public BusinessAnimView m46393w(@DrawableRes int i) {
        this.f29833b.setActualImageResource(i);
        bnl0.m105505C0(this.f29833b, qa00.m175859d(250.0f));
        return this;
    }

    /* JADX INFO: renamed from: z */
    public void m46394z(boolean z) {
        this.f29847p.setChecked(z);
    }

    public BusinessAnimView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BusinessAnimView(Context context) {
        this(context, null);
    }
}
