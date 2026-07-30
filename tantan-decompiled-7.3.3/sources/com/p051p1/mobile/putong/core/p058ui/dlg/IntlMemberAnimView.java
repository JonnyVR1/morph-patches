package com.p051p1.mobile.putong.core.p058ui.dlg;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import com.google.android.exoplayer2.PlaybackException;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.member.R$string;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.utils.NullChecker;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import p151v.VButton;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VImage;
import p151v.VLinear;
import p151v.VRelative;
import p151v.VText;
import p153l.bnl0;
import p153l.gbc0;
import p153l.jny;
import p153l.joa;
import p153l.mmo;
import p153l.qa00;
import p153l.uqb0;
import p153l.xmy;

/* JADX INFO: loaded from: classes2.dex */
public class IntlMemberAnimView extends VFrame {

    /* JADX INFO: renamed from: A */
    public VImage f29755A;

    /* JADX INFO: renamed from: B */
    public TextView f29756B;

    /* JADX INFO: renamed from: C */
    public VFrame f29757C;

    /* JADX INFO: renamed from: D */
    public TextView f29758D;

    /* JADX INFO: renamed from: E */
    public xmy<String> f29759E;

    /* JADX INFO: renamed from: F */
    public ObjectAnimator f29760F;

    /* JADX INFO: renamed from: a */
    public RelativeLayout f29761a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f29762b;

    /* JADX INFO: renamed from: c */
    public FrameLayout f29763c;

    /* JADX INFO: renamed from: d */
    public SVGAnimationView f29764d;

    /* JADX INFO: renamed from: e */
    public SVGAnimationView f29765e;

    /* JADX INFO: renamed from: f */
    public ImageView f29766f;

    /* JADX INFO: renamed from: g */
    public ImageView f29767g;

    /* JADX INFO: renamed from: h */
    public VText f29768h;

    /* JADX INFO: renamed from: i */
    public VLinear f29769i;

    /* JADX INFO: renamed from: j */
    public VText f29770j;

    /* JADX INFO: renamed from: k */
    public VLinear f29771k;

    /* JADX INFO: renamed from: l */
    public VText f29772l;

    /* JADX INFO: renamed from: m */
    public VText f29773m;

    /* JADX INFO: renamed from: n */
    public TextView f29774n;

    /* JADX INFO: renamed from: o */
    public VRelative f29775o;

    /* JADX INFO: renamed from: p */
    public VLinear f29776p;

    /* JADX INFO: renamed from: q */
    public VRelative f29777q;

    /* JADX INFO: renamed from: r */
    public VText f29778r;

    /* JADX INFO: renamed from: s */
    public TextView f29779s;

    /* JADX INFO: renamed from: t */
    public VRelative f29780t;

    /* JADX INFO: renamed from: u */
    public VText f29781u;

    /* JADX INFO: renamed from: v */
    public ImageView f29782v;

    /* JADX INFO: renamed from: w */
    public VText f29783w;

    /* JADX INFO: renamed from: x */
    public TextView f29784x;

    /* JADX INFO: renamed from: y */
    public View f29785y;

    /* JADX INFO: renamed from: z */
    public VButton f29786z;

    public IntlMemberAnimView(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: F */
    public static String m46307F(int i, int i2, String str) {
        return m46308G(new BigDecimal(i), i2, str);
    }

    /* JADX INFO: renamed from: G */
    public static String m46308G(BigDecimal bigDecimal, int i, String str) {
        BigDecimal bigDecimalDivide = bigDecimal.divide(new BigDecimal(i));
        DecimalFormat decimalFormat = new DecimalFormat(str);
        decimalFormat.setRoundingMode(RoundingMode.DOWN);
        return decimalFormat.format(bigDecimalDivide);
    }

    @NonNull
    /* JADX INFO: renamed from: K */
    public static String m46309K(int i) {
        if (i < 10000) {
            return new DecimalFormat(",###").format(i);
        }
        if (i < 1000000) {
            return m46307F(i, 1000, "###.#") + "K";
        }
        if (i < 100000000) {
            return m46307F(i, PlaybackException.CUSTOM_ERROR_CODE_BASE, "###.#") + "M";
        }
        return m46307F(99999999, PlaybackException.CUSTOM_ERROR_CODE_BASE, "###.#") + "M";
    }

    /* JADX INFO: renamed from: B */
    public IntlMemberAnimView m46313B(String str) {
        uqb0.f180374G.m127098D(this.f29762b, str);
        return this;
    }

    /* JADX INFO: renamed from: C */
    public IntlMemberAnimView m46314C(String str) {
        bnl0.m105525M0(this.f29757C, true);
        bnl0.m105515H0(this.f29758D, str);
        return this;
    }

    /* JADX INFO: renamed from: E */
    public IntlMemberAnimView m46315E(final Runnable runnable) {
        bnl0.m105524M(this.f29767g, true);
        this.f29767g.setOnClickListener(new View.OnClickListener() { // from class: l.kmo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                runnable.run();
            }
        });
        return this;
    }

    /* JADX INFO: renamed from: L */
    public void m46316L() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f29757C, "translationY", 0.0f, qa00.m175859d(7.0f), 0.0f);
        this.f29760F = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(1500L);
        this.f29760F.setInterpolator(new LinearInterpolator());
        this.f29760F.setRepeatCount(-1);
    }

    /* JADX INFO: renamed from: M */
    public IntlMemberAnimView m46317M(CharSequence charSequence, final Runnable runnable) {
        this.f29756B.setText(charSequence);
        if (NullChecker.m82486a(runnable)) {
            this.f29756B.setOnClickListener(new View.OnClickListener() { // from class: l.jmo
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    runnable.run();
                }
            });
        }
        return this;
    }

    /* JADX INFO: renamed from: N */
    public IntlMemberAnimView m46318N(CharSequence charSequence, final Runnable runnable) {
        this.f29786z.setText(charSequence);
        this.f29786z.setOnClickListener(new View.OnClickListener() { // from class: l.lmo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                runnable.run();
            }
        });
        return this;
    }

    /* JADX INFO: renamed from: O */
    public IntlMemberAnimView m46319O(int i) {
        boolean z = i > 0;
        bnl0.m105524M(this.f29785y, z);
        bnl0.m105524M(this.f29777q, z);
        bnl0.m105515H0(this.f29779s, String.valueOf(i));
        return this;
    }

    /* JADX INFO: renamed from: P */
    public IntlMemberAnimView m46320P(int i) {
        bnl0.m105524M(this.f29775o, i >= 100);
        bnl0.m105515H0(this.f29784x, CoreModule.f18276o.m132214d().mo34769Vd() ? m46309K(i) : String.valueOf(i));
        return this;
    }

    /* JADX INFO: renamed from: Q */
    public IntlMemberAnimView m46321Q(String str) {
        bnl0.m105515H0(this.f29774n, str);
        return this;
    }

    /* JADX INFO: renamed from: R */
    public IntlMemberAnimView m46322R(String str) {
        bnl0.m105515H0(this.f29770j, str);
        return this;
    }

    /* JADX INFO: renamed from: S */
    public IntlMemberAnimView m46323S(@DrawableRes int i) {
        bnl0.m105525M0(this.f29766f, true);
        this.f29766f.setImageResource(i);
        return this;
    }

    /* JADX INFO: renamed from: T */
    public IntlMemberAnimView m46324T(boolean z) {
        bnl0.m105524M(this.f29755A, z);
        return this;
    }

    /* JADX INFO: renamed from: V */
    public void m46325V() {
        this.f29760F.start();
        this.f29759E.mo146293e();
    }

    /* JADX INFO: renamed from: W */
    public void m46326W() {
        this.f29760F.cancel();
        this.f29759E.mo146289a();
    }

    /* JADX INFO: renamed from: X */
    public void m46327X(int i) {
        boolean z = i >= 100 && !joa.m146354D3();
        bnl0.m105524M(this.f29771k, z);
        bnl0.m105524M(this.f29770j, z);
        if (joa.m146354D3()) {
            bnl0.m105524M(this.f29770j, true);
            if (IntlCountryCodeController.m29125v()) {
                m46322R(CoreModule.f18263b.getString(R$string.f21445z0));
            } else {
                m46322R(CoreModule.f18263b.getString(R$string.f21442y0));
            }
        }
        if (z) {
            m46322R(CoreModule.f18263b.getString(R$string.f21402l));
            m46321Q(CoreModule.f18263b.getString(R$string.f21405m));
            bnl0.m105515H0(this.f29772l, joa.m146354D3() ? m46309K(i) : new DecimalFormat(",###").format(i));
        }
    }

    /* JADX INFO: renamed from: Y */
    public IntlMemberAnimView m46328Y(String str) {
        bnl0.m105524M(this.f29768h, true);
        bnl0.m105515H0(this.f29768h, str);
        return this;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        m46326W();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m46329v(this);
        jny jnyVar = new jny(this.f29764d, this.f29765e);
        this.f29759E = jnyVar;
        jnyVar.mo146291c("https://auto.tancdn.com/v1/raw/48b01864-e871-498a-9151-f761e3d3188708.so", -1);
        m46316L();
        this.f29786z.setBackgroundResource(gbc0.f103269c);
    }

    /* JADX INFO: renamed from: v */
    public final void m46329v(View view) {
        mmo.m159091a(this, view);
    }

    /* JADX INFO: renamed from: w */
    public IntlMemberAnimView m46330w(String str, int i) {
        this.f29759E.mo146290b(str, i);
        return this;
    }

    /* JADX INFO: renamed from: z */
    public IntlMemberAnimView m46331z(@DrawableRes int i) {
        this.f29762b.setActualImageResource(i);
        return this;
    }

    public IntlMemberAnimView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public IntlMemberAnimView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
