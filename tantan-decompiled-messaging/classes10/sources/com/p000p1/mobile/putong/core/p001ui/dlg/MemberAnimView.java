package com.p000p1.mobile.putong.core.p001ui.dlg;

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
import com.p1.mobile.android.ui.bubble.d;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.utils.NullChecker;
import l.eqh0;
import l.qib0;
import l.t100;
import l.xdl0;
import p003l.aey;
import p003l.b3c0;
import p003l.d8y;
import p003l.mey;
import v.VButton;
import v.VCheckBox;
import v.VDraweeView;
import v.VFrame;
import v.VImage;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class MemberAnimView extends VFrame {

    /* JADX INFO: renamed from: A */
    public View f1333A;

    /* JADX INFO: renamed from: B */
    public VFrame f1334B;

    /* JADX INFO: renamed from: C */
    public TextView f1335C;

    /* JADX INFO: renamed from: D */
    public final Path f1336D;

    /* JADX INFO: renamed from: E */
    public aey<String> f1337E;

    /* JADX INFO: renamed from: F */
    public float f1338F;

    /* JADX INFO: renamed from: G */
    public ObjectAnimator f1339G;

    /* JADX INFO: renamed from: H */
    public CompoundButton.OnCheckedChangeListener f1340H;

    /* JADX INFO: renamed from: a */
    public RelativeLayout f1341a;

    /* JADX INFO: renamed from: b */
    public VImage f1342b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f1343c;

    /* JADX INFO: renamed from: d */
    public FrameLayout f1344d;

    /* JADX INFO: renamed from: e */
    public SVGAnimationView f1345e;

    /* JADX INFO: renamed from: f */
    public SVGAnimationView f1346f;

    /* JADX INFO: renamed from: g */
    public ImageView f1347g;

    /* JADX INFO: renamed from: h */
    public VFrame f1348h;

    /* JADX INFO: renamed from: i */
    public VFrame f1349i;

    /* JADX INFO: renamed from: j */
    public VImage f1350j;

    /* JADX INFO: renamed from: k */
    public VImage f1351k;

    /* JADX INFO: renamed from: l */
    public VText f1352l;

    /* JADX INFO: renamed from: m */
    public TextView f1353m;

    /* JADX INFO: renamed from: n */
    public TextView f1354n;

    /* JADX INFO: renamed from: o */
    public TextView f1355o;

    /* JADX INFO: renamed from: p */
    public LinearLayout f1356p;

    /* JADX INFO: renamed from: q */
    public VCheckBox f1357q;

    /* JADX INFO: renamed from: r */
    public TextView f1358r;

    /* JADX INFO: renamed from: s */
    public VButton f1359s;

    /* JADX INFO: renamed from: t */
    public VLinear f1360t;

    /* JADX INFO: renamed from: u */
    public VText f1361u;

    /* JADX INFO: renamed from: v */
    public VText f1362v;

    /* JADX INFO: renamed from: w */
    public TextView f1363w;

    /* JADX INFO: renamed from: x */
    public LinearLayout f1364x;

    /* JADX INFO: renamed from: y */
    public VCheckBox f1365y;

    /* JADX INFO: renamed from: z */
    public TextView f1366z;

    public MemberAnimView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1338F = t100.d(20.0f);
        this.f1336D = new Path();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public /* synthetic */ void m2466S(Runnable runnable, View view) {
        runnable.run();
        if (NullChecker.a(this.f1340H)) {
            CompoundButton.OnCheckedChangeListener onCheckedChangeListener = this.f1340H;
            VCheckBox vCheckBox = this.f1357q;
            onCheckedChangeListener.onCheckedChanged(vCheckBox, vCheckBox.isChecked());
        }
    }

    /* JADX INFO: renamed from: B */
    public MemberAnimView m2471B(@DrawableRes int i) {
        xdl0.C0(this.f1343c, t100.d(250.0f));
        this.f1343c.setActualImageResource(i);
        return this;
    }

    /* JADX INFO: renamed from: C */
    public MemberAnimView m2472C(String str) {
        xdl0.C0(this.f1343c, t100.d(250.0f));
        qib0.G.D(this.f1343c, str);
        return this;
    }

    /* JADX INFO: renamed from: E */
    public MemberAnimView m2473E(String str, int i, int i2) {
        qib0.G.I0(this.f1343c, str, i, i2);
        xdl0.C0(this.f1343c, t100.d(250.0f));
        return this;
    }

    /* JADX INFO: renamed from: F */
    public MemberAnimView m2474F(@DrawableRes int i) {
        xdl0.M(this.f1347g, true);
        this.f1347g.setImageResource(i);
        return this;
    }

    /* JADX INFO: renamed from: G */
    public MemberAnimView m2475G(View view) {
        xdl0.M(this.f1348h, true);
        this.f1348h.addView(view);
        return this;
    }

    /* JADX INFO: renamed from: K */
    public MemberAnimView m2476K(String str, final Runnable runnable) {
        xdl0.M0(this.f1359s, false);
        xdl0.M0(this.f1360t, true);
        this.f1362v.setText(str);
        if (NullChecker.a(runnable)) {
            xdl0.E0(this.f1360t, new View.OnClickListener() { // from class: l.z7y
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    runnable.run();
                }
            });
        }
        return this;
    }

    /* JADX INFO: renamed from: L */
    public void m2477L(boolean z) {
        this.f1357q.setChecked(z);
    }

    /* JADX INFO: renamed from: M */
    public MemberAnimView m2478M(CharSequence charSequence) {
        if (NullChecker.a(charSequence)) {
            xdl0.M0(this.f1354n, true);
            this.f1354n.setText(charSequence);
        }
        return this;
    }

    /* JADX INFO: renamed from: N */
    public MemberAnimView m2479N(View view) {
        this.f1349i.removeAllViews();
        this.f1349i.addView(view);
        xdl0.M(this.f1344d, false);
        return this;
    }

    /* JADX INFO: renamed from: O */
    public MemberAnimView m2480O(String str) {
        qib0.G.D(this.f1341a, str);
        return this;
    }

    /* JADX INFO: renamed from: P */
    public MemberAnimView m2481P() {
        mey meyVar = new mey(this.f1345e, this.f1346f);
        this.f1337E = meyVar;
        meyVar.mo5377c("https://auto.tancdn.com/v1/raw/48b01864-e871-498a-9151-f761e3d3188708.so", -1);
        return this;
    }

    /* JADX INFO: renamed from: Q */
    public void m2482Q() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f1334B, "translationY", 0.0f, t100.d(7.0f), 0.0f);
        this.f1339G = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(1500L);
        this.f1339G.setInterpolator(new LinearInterpolator());
        this.f1339G.setRepeatCount(-1);
    }

    /* JADX INFO: renamed from: R */
    public void m2483R(@DrawableRes int i) {
        this.f1343c.setBackgroundResource(i);
    }

    /* JADX INFO: renamed from: T */
    public MemberAnimView m2484T(CharSequence charSequence, final Runnable runnable) {
        this.f1363w.setText(charSequence);
        if (NullChecker.a(runnable)) {
            this.f1363w.setOnClickListener(new View.OnClickListener() { // from class: l.b8y
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    runnable.run();
                }
            });
        }
        xdl0.M(this.f1342b, false);
        return this;
    }

    /* JADX INFO: renamed from: V */
    public MemberAnimView m2485V(int i, CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        xdl0.M0(this.f1356p, true);
        this.f1358r.setText(i);
        this.f1340H = onCheckedChangeListener;
        return this;
    }

    /* JADX INFO: renamed from: W */
    public MemberAnimView m2486W(CharSequence charSequence, final Runnable runnable) {
        this.f1359s.setText(charSequence);
        this.f1359s.setOnClickListener(new View.OnClickListener() { // from class: l.c8y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f3986a.m2466S(runnable, view);
            }
        });
        xdl0.M0(this.f1360t, false);
        return this;
    }

    /* JADX INFO: renamed from: X */
    public final void m2487X(int i, int i2) {
        Path path = this.f1336D;
        RectF rectF = new RectF(0.0f, 0.0f, i, i2);
        float f = this.f1338F;
        path.addRoundRect(rectF, f, f, Path.Direction.CW);
    }

    /* JADX INFO: renamed from: Y */
    public MemberAnimView m2488Y() {
        xdl0.M0(this.f1364x, true);
        this.f1365y.setChecked(true);
        return this;
    }

    /* JADX INFO: renamed from: Z */
    public MemberAnimView m2489Z(final Runnable runnable) {
        xdl0.M0(this.f1342b, true);
        if (NullChecker.a(runnable)) {
            this.f1342b.setOnClickListener(new View.OnClickListener() { // from class: l.a8y
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    runnable.run();
                }
            });
        }
        return this;
    }

    /* JADX INFO: renamed from: a0 */
    public void m2490a0() {
        this.f1339G.cancel();
        if (NullChecker.a(this.f1337E)) {
            this.f1337E.mo5375a();
        }
    }

    /* JADX INFO: renamed from: b0 */
    public MemberAnimView m2491b0() {
        if (NullChecker.a(this.f1337E)) {
            this.f1337E.mo5378d();
        }
        return this;
    }

    /* JADX INFO: renamed from: c0 */
    public MemberAnimView m2492c0(int i) {
        xdl0.X(this.f1354n, i);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void draw(Canvas canvas) {
        int iSave = canvas.save();
        canvas.clipPath(this.f1336D);
        super/*android.view.View*/.draw(canvas);
        canvas.restoreToCount(iSave);
    }

    /* JADX INFO: renamed from: e0 */
    public MemberAnimView m2493e0(CharSequence charSequence) {
        xdl0.M0(this.f1353m, true);
        this.f1353m.setText(charSequence);
        return this;
    }

    /* JADX INFO: renamed from: f0 */
    public MemberAnimView m2494f0(@ColorInt int i) {
        this.f1353m.setTextColor(i);
        return this;
    }

    /* JADX INFO: renamed from: g0 */
    public MemberAnimView m2495g0(float f, float f2) {
        this.f1353m.setLineSpacing(f, f2);
        return this;
    }

    /* JADX INFO: renamed from: h0 */
    public MemberAnimView m2496h0(int i) {
        xdl0.X(this.f1353m, i);
        return this;
    }

    /* JADX INFO: renamed from: j0 */
    public MemberAnimView m2497j0() {
        this.f1353m.setTypeface(Typeface.defaultFromStyle(0));
        return this;
    }

    /* JADX INFO: renamed from: k0 */
    public MemberAnimView m2498k0(String str) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        TextView textView = this.f1355o;
        if (zIsEmpty) {
            textView.setVisibility(8);
            return this;
        }
        textView.setVisibility(0);
        this.f1355o.setText(str);
        return this;
    }

    /* JADX INFO: renamed from: l0 */
    public MemberAnimView m2499l0(String str) {
        xdl0.M0(this.f1352l, true);
        this.f1352l.setText(str);
        return this;
    }

    /* JADX INFO: renamed from: m0 */
    public MemberAnimView m2500m0(int i) {
        xdl0.X(this.f1352l, i);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDetachedFromWindow() {
        m2490a0();
        d.l().k("boost_dlg_bubble");
        super/*android.view.View*/.onDetachedFromWindow();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m2501w(this);
        m2482Q();
        this.f1359s.setBackgroundResource(b3c0.f3121c);
        this.f1352l.setTypeface(eqh0.c(3), 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super/*android.view.View*/.onLayout(z, i, i2, i3, i4);
        m2487X(getWidth(), getHeight());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setRectRadius(float f) {
        this.f1338F = f;
        invalidate();
    }

    /* JADX INFO: renamed from: w */
    public final void m2501w(View view) {
        d8y.m6093a(this, view);
    }

    /* JADX INFO: renamed from: z */
    public MemberAnimView m2502z(String str, int i) {
        if (NullChecker.a(this.f1337E)) {
            this.f1337E.mo5376b(str, i);
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
