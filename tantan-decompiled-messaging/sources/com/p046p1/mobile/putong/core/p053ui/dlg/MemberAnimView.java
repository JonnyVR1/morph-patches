package com.p046p1.mobile.putong.core.p053ui.dlg;

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
import com.p046p1.mobile.android.p048ui.bubble.C4348d;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.utils.NullChecker;
import p147v.VButton;
import p147v.VCheckBox;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;
import p149l.aey;
import p149l.b3c0;
import p149l.d8y;
import p149l.eqh0;
import p149l.mey;
import p149l.qib0;
import p149l.t100;
import p149l.xdl0;

/* JADX INFO: loaded from: classes10.dex */
public class MemberAnimView extends VFrame {

    /* JADX INFO: renamed from: A */
    public View f28939A;

    /* JADX INFO: renamed from: B */
    public VFrame f28940B;

    /* JADX INFO: renamed from: C */
    public TextView f28941C;

    /* JADX INFO: renamed from: D */
    public final Path f28942D;

    /* JADX INFO: renamed from: E */
    public aey<String> f28943E;

    /* JADX INFO: renamed from: F */
    public float f28944F;

    /* JADX INFO: renamed from: G */
    public ObjectAnimator f28945G;

    /* JADX INFO: renamed from: H */
    public CompoundButton.OnCheckedChangeListener f28946H;

    /* JADX INFO: renamed from: a */
    public RelativeLayout f28947a;

    /* JADX INFO: renamed from: b */
    public VImage f28948b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f28949c;

    /* JADX INFO: renamed from: d */
    public FrameLayout f28950d;

    /* JADX INFO: renamed from: e */
    public SVGAnimationView f28951e;

    /* JADX INFO: renamed from: f */
    public SVGAnimationView f28952f;

    /* JADX INFO: renamed from: g */
    public ImageView f28953g;

    /* JADX INFO: renamed from: h */
    public VFrame f28954h;

    /* JADX INFO: renamed from: i */
    public VFrame f28955i;

    /* JADX INFO: renamed from: j */
    public VImage f28956j;

    /* JADX INFO: renamed from: k */
    public VImage f28957k;

    /* JADX INFO: renamed from: l */
    public VText f28958l;

    /* JADX INFO: renamed from: m */
    public TextView f28959m;

    /* JADX INFO: renamed from: n */
    public TextView f28960n;

    /* JADX INFO: renamed from: o */
    public TextView f28961o;

    /* JADX INFO: renamed from: p */
    public LinearLayout f28962p;

    /* JADX INFO: renamed from: q */
    public VCheckBox f28963q;

    /* JADX INFO: renamed from: r */
    public TextView f28964r;

    /* JADX INFO: renamed from: s */
    public VButton f28965s;

    /* JADX INFO: renamed from: t */
    public VLinear f28966t;

    /* JADX INFO: renamed from: u */
    public VText f28967u;

    /* JADX INFO: renamed from: v */
    public VText f28968v;

    /* JADX INFO: renamed from: w */
    public TextView f28969w;

    /* JADX INFO: renamed from: x */
    public LinearLayout f28970x;

    /* JADX INFO: renamed from: y */
    public VCheckBox f28971y;

    /* JADX INFO: renamed from: z */
    public TextView f28972z;

    public MemberAnimView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f28944F = t100.m186890d(20.0f);
        this.f28942D = new Path();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public /* synthetic */ void m45149S(Runnable runnable, View view) {
        runnable.run();
        if (NullChecker.m81303a(this.f28946H)) {
            CompoundButton.OnCheckedChangeListener onCheckedChangeListener = this.f28946H;
            VCheckBox vCheckBox = this.f28963q;
            onCheckedChangeListener.onCheckedChanged(vCheckBox, vCheckBox.isChecked());
        }
    }

    /* JADX INFO: renamed from: B */
    public MemberAnimView m45154B(@DrawableRes int i) {
        xdl0.m208325C0(this.f28949c, t100.m186890d(250.0f));
        this.f28949c.setActualImageResource(i);
        return this;
    }

    /* JADX INFO: renamed from: C */
    public MemberAnimView m45155C(String str) {
        xdl0.m208325C0(this.f28949c, t100.m186890d(250.0f));
        qib0.f154691G.m102314D(this.f28949c, str);
        return this;
    }

    /* JADX INFO: renamed from: E */
    public MemberAnimView m45156E(String str, int i, int i2) {
        qib0.f154691G.m102325I0(this.f28949c, str, i, i2);
        xdl0.m208325C0(this.f28949c, t100.m186890d(250.0f));
        return this;
    }

    /* JADX INFO: renamed from: F */
    public MemberAnimView m45157F(@DrawableRes int i) {
        xdl0.m208344M(this.f28953g, true);
        this.f28953g.setImageResource(i);
        return this;
    }

    /* JADX INFO: renamed from: G */
    public MemberAnimView m45158G(View view) {
        xdl0.m208344M(this.f28954h, true);
        this.f28954h.addView(view);
        return this;
    }

    /* JADX INFO: renamed from: K */
    public MemberAnimView m45159K(String str, final Runnable runnable) {
        xdl0.m208345M0(this.f28965s, false);
        xdl0.m208345M0(this.f28966t, true);
        this.f28968v.setText(str);
        if (NullChecker.m81303a(runnable)) {
            xdl0.m208329E0(this.f28966t, new View.OnClickListener() { // from class: l.z7y
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    runnable.run();
                }
            });
        }
        return this;
    }

    /* JADX INFO: renamed from: L */
    public void m45160L(boolean z) {
        this.f28963q.setChecked(z);
    }

    /* JADX INFO: renamed from: M */
    public MemberAnimView m45161M(CharSequence charSequence) {
        if (NullChecker.m81303a(charSequence)) {
            xdl0.m208345M0(this.f28960n, true);
            this.f28960n.setText(charSequence);
        }
        return this;
    }

    /* JADX INFO: renamed from: N */
    public MemberAnimView m45162N(View view) {
        this.f28955i.removeAllViews();
        this.f28955i.addView(view);
        xdl0.m208344M(this.f28950d, false);
        return this;
    }

    /* JADX INFO: renamed from: O */
    public MemberAnimView m45163O(String str) {
        qib0.f154691G.m102314D(this.f28947a, str);
        return this;
    }

    /* JADX INFO: renamed from: P */
    public MemberAnimView m45164P() {
        mey meyVar = new mey(this.f28951e, this.f28952f);
        this.f28943E = meyVar;
        meyVar.mo96154c("https://auto.tancdn.com/v1/raw/48b01864-e871-498a-9151-f761e3d3188708.so", -1);
        return this;
    }

    /* JADX INFO: renamed from: Q */
    public void m45165Q() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f28940B, "translationY", 0.0f, t100.m186890d(7.0f), 0.0f);
        this.f28945G = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(1500L);
        this.f28945G.setInterpolator(new LinearInterpolator());
        this.f28945G.setRepeatCount(-1);
    }

    /* JADX INFO: renamed from: R */
    public void m45166R(@DrawableRes int i) {
        this.f28949c.setBackgroundResource(i);
    }

    /* JADX INFO: renamed from: T */
    public MemberAnimView m45167T(CharSequence charSequence, final Runnable runnable) {
        this.f28969w.setText(charSequence);
        if (NullChecker.m81303a(runnable)) {
            this.f28969w.setOnClickListener(new View.OnClickListener() { // from class: l.b8y
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    runnable.run();
                }
            });
        }
        xdl0.m208344M(this.f28948b, false);
        return this;
    }

    /* JADX INFO: renamed from: V */
    public MemberAnimView m45168V(int i, CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        xdl0.m208345M0(this.f28962p, true);
        this.f28964r.setText(i);
        this.f28946H = onCheckedChangeListener;
        return this;
    }

    /* JADX INFO: renamed from: W */
    public MemberAnimView m45169W(CharSequence charSequence, final Runnable runnable) {
        this.f28965s.setText(charSequence);
        this.f28965s.setOnClickListener(new View.OnClickListener() { // from class: l.c8y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f79827a.m45149S(runnable, view);
            }
        });
        xdl0.m208345M0(this.f28966t, false);
        return this;
    }

    /* JADX INFO: renamed from: X */
    public final void m45170X(int i, int i2) {
        Path path = this.f28942D;
        RectF rectF = new RectF(0.0f, 0.0f, i, i2);
        float f = this.f28944F;
        path.addRoundRect(rectF, f, f, Path.Direction.CW);
    }

    /* JADX INFO: renamed from: Y */
    public MemberAnimView m45171Y() {
        xdl0.m208345M0(this.f28970x, true);
        this.f28971y.setChecked(true);
        return this;
    }

    /* JADX INFO: renamed from: Z */
    public MemberAnimView m45172Z(final Runnable runnable) {
        xdl0.m208345M0(this.f28948b, true);
        if (NullChecker.m81303a(runnable)) {
            this.f28948b.setOnClickListener(new View.OnClickListener() { // from class: l.a8y
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    runnable.run();
                }
            });
        }
        return this;
    }

    /* JADX INFO: renamed from: a0 */
    public void m45173a0() {
        this.f28945G.cancel();
        if (NullChecker.m81303a(this.f28943E)) {
            this.f28943E.mo96152a();
        }
    }

    /* JADX INFO: renamed from: b0 */
    public MemberAnimView m45174b0() {
        if (NullChecker.m81303a(this.f28943E)) {
            this.f28943E.mo96155d();
        }
        return this;
    }

    /* JADX INFO: renamed from: c0 */
    public MemberAnimView m45175c0(int i) {
        xdl0.m208360X(this.f28960n, i);
        return this;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int iSave = canvas.save();
        canvas.clipPath(this.f28942D);
        super.draw(canvas);
        canvas.restoreToCount(iSave);
    }

    /* JADX INFO: renamed from: e0 */
    public MemberAnimView m45176e0(CharSequence charSequence) {
        xdl0.m208345M0(this.f28959m, true);
        this.f28959m.setText(charSequence);
        return this;
    }

    /* JADX INFO: renamed from: f0 */
    public MemberAnimView m45177f0(@ColorInt int i) {
        this.f28959m.setTextColor(i);
        return this;
    }

    /* JADX INFO: renamed from: g0 */
    public MemberAnimView m45178g0(float f, float f2) {
        this.f28959m.setLineSpacing(f, f2);
        return this;
    }

    /* JADX INFO: renamed from: h0 */
    public MemberAnimView m45179h0(int i) {
        xdl0.m208360X(this.f28959m, i);
        return this;
    }

    /* JADX INFO: renamed from: j0 */
    public MemberAnimView m45180j0() {
        this.f28959m.setTypeface(Typeface.defaultFromStyle(0));
        return this;
    }

    /* JADX INFO: renamed from: k0 */
    public MemberAnimView m45181k0(String str) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        TextView textView = this.f28961o;
        if (zIsEmpty) {
            textView.setVisibility(8);
            return this;
        }
        textView.setVisibility(0);
        this.f28961o.setText(str);
        return this;
    }

    /* JADX INFO: renamed from: l0 */
    public MemberAnimView m45182l0(String str) {
        xdl0.m208345M0(this.f28958l, true);
        this.f28958l.setText(str);
        return this;
    }

    /* JADX INFO: renamed from: m0 */
    public MemberAnimView m45183m0(int i) {
        xdl0.m208360X(this.f28958l, i);
        return this;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        m45173a0();
        C4348d.m20896l().m20900k("boost_dlg_bubble");
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m45184w(this);
        m45165Q();
        this.f28965s.setBackgroundResource(b3c0.f73018c);
        this.f28958l.setTypeface(eqh0.m117752c(3), 1);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        m45170X(getWidth(), getHeight());
    }

    public void setRectRadius(float f) {
        this.f28944F = f;
        invalidate();
    }

    /* JADX INFO: renamed from: w */
    public final void m45184w(View view) {
        d8y.m110400a(this, view);
    }

    /* JADX INFO: renamed from: z */
    public MemberAnimView m45185z(String str, int i) {
        if (NullChecker.m81303a(this.f28943E)) {
            this.f28943E.mo96153b(str, i);
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
