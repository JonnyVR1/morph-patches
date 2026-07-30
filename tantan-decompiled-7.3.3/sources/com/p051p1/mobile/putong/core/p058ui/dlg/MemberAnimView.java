package com.p051p1.mobile.putong.core.p058ui.dlg;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.TextUtils;
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
import p151v.VLinear;
import p151v.VText;
import p153l.ahy;
import p153l.bnl0;
import p153l.gbc0;
import p153l.jny;
import p153l.lyh0;
import p153l.qa00;
import p153l.uqb0;
import p153l.xmy;

/* JADX INFO: loaded from: classes2.dex */
public class MemberAnimView extends VFrame {

    /* JADX INFO: renamed from: A */
    public View f29787A;

    /* JADX INFO: renamed from: B */
    public VFrame f29788B;

    /* JADX INFO: renamed from: C */
    public TextView f29789C;

    /* JADX INFO: renamed from: D */
    public final Path f29790D;

    /* JADX INFO: renamed from: E */
    public xmy<String> f29791E;

    /* JADX INFO: renamed from: F */
    public float f29792F;

    /* JADX INFO: renamed from: G */
    public ObjectAnimator f29793G;

    /* JADX INFO: renamed from: H */
    public CompoundButton.OnCheckedChangeListener f29794H;

    /* JADX INFO: renamed from: a */
    public RelativeLayout f29795a;

    /* JADX INFO: renamed from: b */
    public VImage f29796b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f29797c;

    /* JADX INFO: renamed from: d */
    public FrameLayout f29798d;

    /* JADX INFO: renamed from: e */
    public SVGAnimationView f29799e;

    /* JADX INFO: renamed from: f */
    public SVGAnimationView f29800f;

    /* JADX INFO: renamed from: g */
    public ImageView f29801g;

    /* JADX INFO: renamed from: h */
    public VFrame f29802h;

    /* JADX INFO: renamed from: i */
    public VFrame f29803i;

    /* JADX INFO: renamed from: j */
    public VImage f29804j;

    /* JADX INFO: renamed from: k */
    public VImage f29805k;

    /* JADX INFO: renamed from: l */
    public VText f29806l;

    /* JADX INFO: renamed from: m */
    public TextView f29807m;

    /* JADX INFO: renamed from: n */
    public TextView f29808n;

    /* JADX INFO: renamed from: o */
    public TextView f29809o;

    /* JADX INFO: renamed from: p */
    public LinearLayout f29810p;

    /* JADX INFO: renamed from: q */
    public VCheckBox f29811q;

    /* JADX INFO: renamed from: r */
    public TextView f29812r;

    /* JADX INFO: renamed from: s */
    public VButton f29813s;

    /* JADX INFO: renamed from: t */
    public VLinear f29814t;

    /* JADX INFO: renamed from: u */
    public VText f29815u;

    /* JADX INFO: renamed from: v */
    public VText f29816v;

    /* JADX INFO: renamed from: w */
    public TextView f29817w;

    /* JADX INFO: renamed from: x */
    public LinearLayout f29818x;

    /* JADX INFO: renamed from: y */
    public VCheckBox f29819y;

    /* JADX INFO: renamed from: z */
    public TextView f29820z;

    public MemberAnimView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f29792F = qa00.m175859d(20.0f);
        this.f29790D = new Path();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public /* synthetic */ void m46332S(Runnable runnable, View view) {
        runnable.run();
        if (NullChecker.m82486a(this.f29794H)) {
            CompoundButton.OnCheckedChangeListener onCheckedChangeListener = this.f29794H;
            VCheckBox vCheckBox = this.f29811q;
            onCheckedChangeListener.onCheckedChanged(vCheckBox, vCheckBox.isChecked());
        }
    }

    /* JADX INFO: renamed from: B */
    public MemberAnimView m46337B(@DrawableRes int i) {
        bnl0.m105505C0(this.f29797c, qa00.m175859d(250.0f));
        this.f29797c.setActualImageResource(i);
        return this;
    }

    /* JADX INFO: renamed from: C */
    public MemberAnimView m46338C(String str) {
        bnl0.m105505C0(this.f29797c, qa00.m175859d(250.0f));
        uqb0.f180374G.m127098D(this.f29797c, str);
        return this;
    }

    /* JADX INFO: renamed from: E */
    public MemberAnimView m46339E(String str, int i, int i2) {
        uqb0.f180374G.m127109I0(this.f29797c, str, i, i2);
        bnl0.m105505C0(this.f29797c, qa00.m175859d(250.0f));
        return this;
    }

    /* JADX INFO: renamed from: F */
    public MemberAnimView m46340F(@DrawableRes int i) {
        bnl0.m105524M(this.f29801g, true);
        this.f29801g.setImageResource(i);
        return this;
    }

    /* JADX INFO: renamed from: G */
    public MemberAnimView m46341G(View view) {
        bnl0.m105524M(this.f29802h, true);
        this.f29802h.addView(view);
        return this;
    }

    /* JADX INFO: renamed from: K */
    public MemberAnimView m46342K(String str, final Runnable runnable) {
        bnl0.m105525M0(this.f29813s, false);
        bnl0.m105525M0(this.f29814t, true);
        this.f29816v.setText(str);
        if (NullChecker.m82486a(runnable)) {
            bnl0.m105509E0(this.f29814t, new View.OnClickListener() { // from class: l.wgy
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    runnable.run();
                }
            });
        }
        return this;
    }

    /* JADX INFO: renamed from: L */
    public void m46343L(boolean z) {
        this.f29811q.setChecked(z);
    }

    /* JADX INFO: renamed from: M */
    public MemberAnimView m46344M(CharSequence charSequence) {
        if (NullChecker.m82486a(charSequence)) {
            bnl0.m105525M0(this.f29808n, true);
            this.f29808n.setText(charSequence);
        }
        return this;
    }

    /* JADX INFO: renamed from: N */
    public MemberAnimView m46345N(View view) {
        this.f29803i.removeAllViews();
        this.f29803i.addView(view);
        bnl0.m105524M(this.f29798d, false);
        return this;
    }

    /* JADX INFO: renamed from: O */
    public MemberAnimView m46346O(String str) {
        uqb0.f180374G.m127098D(this.f29795a, str);
        return this;
    }

    /* JADX INFO: renamed from: P */
    public MemberAnimView m46347P() {
        jny jnyVar = new jny(this.f29799e, this.f29800f);
        this.f29791E = jnyVar;
        jnyVar.mo146291c("https://auto.tancdn.com/v1/raw/48b01864-e871-498a-9151-f761e3d3188708.so", -1);
        return this;
    }

    /* JADX INFO: renamed from: Q */
    public void m46348Q() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f29788B, "translationY", 0.0f, qa00.m175859d(7.0f), 0.0f);
        this.f29793G = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(1500L);
        this.f29793G.setInterpolator(new LinearInterpolator());
        this.f29793G.setRepeatCount(-1);
    }

    /* JADX INFO: renamed from: R */
    public void m46349R(@DrawableRes int i) {
        this.f29797c.setBackgroundResource(i);
    }

    /* JADX INFO: renamed from: T */
    public MemberAnimView m46350T(CharSequence charSequence, final Runnable runnable) {
        this.f29817w.setText(charSequence);
        if (NullChecker.m82486a(runnable)) {
            this.f29817w.setOnClickListener(new View.OnClickListener() { // from class: l.ygy
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    runnable.run();
                }
            });
        }
        bnl0.m105524M(this.f29796b, false);
        return this;
    }

    /* JADX INFO: renamed from: V */
    public MemberAnimView m46351V(int i, CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        bnl0.m105525M0(this.f29810p, true);
        this.f29812r.setText(i);
        this.f29794H = onCheckedChangeListener;
        return this;
    }

    /* JADX INFO: renamed from: W */
    public MemberAnimView m46352W(CharSequence charSequence, final Runnable runnable) {
        this.f29813s.setText(charSequence);
        this.f29813s.setOnClickListener(new View.OnClickListener() { // from class: l.zgy
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f204365a.m46332S(runnable, view);
            }
        });
        bnl0.m105525M0(this.f29814t, false);
        return this;
    }

    /* JADX INFO: renamed from: X */
    public final void m46353X(int i, int i2) {
        Path path = this.f29790D;
        RectF rectF = new RectF(0.0f, 0.0f, i, i2);
        float f = this.f29792F;
        path.addRoundRect(rectF, f, f, Path.Direction.CW);
    }

    /* JADX INFO: renamed from: Y */
    public MemberAnimView m46354Y() {
        bnl0.m105525M0(this.f29818x, true);
        this.f29819y.setChecked(true);
        return this;
    }

    /* JADX INFO: renamed from: Z */
    public MemberAnimView m46355Z(final Runnable runnable) {
        bnl0.m105525M0(this.f29796b, true);
        if (NullChecker.m82486a(runnable)) {
            this.f29796b.setOnClickListener(new View.OnClickListener() { // from class: l.xgy
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    runnable.run();
                }
            });
        }
        return this;
    }

    /* JADX INFO: renamed from: a0 */
    public void m46356a0() {
        this.f29793G.cancel();
        if (NullChecker.m82486a(this.f29791E)) {
            this.f29791E.mo146289a();
        }
    }

    /* JADX INFO: renamed from: b0 */
    public MemberAnimView m46357b0() {
        if (NullChecker.m82486a(this.f29791E)) {
            this.f29791E.mo146292d();
        }
        return this;
    }

    /* JADX INFO: renamed from: c0 */
    public MemberAnimView m46358c0(int i) {
        bnl0.m105540X(this.f29808n, i);
        return this;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int iSave = canvas.save();
        canvas.clipPath(this.f29790D);
        super.draw(canvas);
        canvas.restoreToCount(iSave);
    }

    /* JADX INFO: renamed from: e0 */
    public MemberAnimView m46359e0(CharSequence charSequence) {
        bnl0.m105525M0(this.f29807m, true);
        this.f29807m.setText(charSequence);
        return this;
    }

    /* JADX INFO: renamed from: f0 */
    public MemberAnimView m46360f0(@ColorInt int i) {
        this.f29807m.setTextColor(i);
        return this;
    }

    /* JADX INFO: renamed from: g0 */
    public MemberAnimView m46361g0(float f, float f2) {
        this.f29807m.setLineSpacing(f, f2);
        return this;
    }

    /* JADX INFO: renamed from: h0 */
    public MemberAnimView m46362h0(int i) {
        bnl0.m105540X(this.f29807m, i);
        return this;
    }

    /* JADX INFO: renamed from: j0 */
    public MemberAnimView m46363j0() {
        this.f29807m.setTypeface(Typeface.defaultFromStyle(0));
        return this;
    }

    /* JADX INFO: renamed from: k0 */
    public MemberAnimView m46364k0(String str) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        TextView textView = this.f29809o;
        if (zIsEmpty) {
            textView.setVisibility(8);
            return this;
        }
        textView.setVisibility(0);
        this.f29809o.setText(str);
        return this;
    }

    /* JADX INFO: renamed from: l0 */
    public MemberAnimView m46365l0(String str) {
        bnl0.m105525M0(this.f29806l, true);
        this.f29806l.setText(str);
        return this;
    }

    /* JADX INFO: renamed from: m0 */
    public MemberAnimView m46366m0(int i) {
        bnl0.m105540X(this.f29806l, i);
        return this;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        m46356a0();
        C4499d.m21895l().m21899k("boost_dlg_bubble");
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m46367w(this);
        m46348Q();
        this.f29813s.setBackgroundResource(gbc0.f103269c);
        this.f29806l.setTypeface(lyh0.m156283c(3), 1);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        m46353X(getWidth(), getHeight());
    }

    public void setRectRadius(float f) {
        this.f29792F = f;
        invalidate();
    }

    /* JADX INFO: renamed from: w */
    public final void m46367w(View view) {
        ahy.m97940a(this, view);
    }

    /* JADX INFO: renamed from: z */
    public MemberAnimView m46368z(String str, int i) {
        if (NullChecker.m82486a(this.f29791E)) {
            this.f29791E.mo146290b(str, i);
        }
        return this;
    }

    public MemberAnimView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MemberAnimView(Context context) {
        this(context, null);
    }
}
