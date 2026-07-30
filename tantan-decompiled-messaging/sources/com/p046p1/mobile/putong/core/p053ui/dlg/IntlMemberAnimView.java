package com.p046p1.mobile.putong.core.p053ui.dlg;

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
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.member.R$string;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.utils.NullChecker;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import p147v.VButton;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VImage;
import p147v.VLinear;
import p147v.VRelative;
import p147v.VText;
import p149l.aey;
import p149l.b3c0;
import p149l.mey;
import p149l.mko;
import p149l.qib0;
import p149l.t100;
import p149l.xdl0;
import p149l.xma;

/* JADX INFO: loaded from: classes10.dex */
public class IntlMemberAnimView extends VFrame {

    /* JADX INFO: renamed from: A */
    public VImage f28907A;

    /* JADX INFO: renamed from: B */
    public TextView f28908B;

    /* JADX INFO: renamed from: C */
    public VFrame f28909C;

    /* JADX INFO: renamed from: D */
    public TextView f28910D;

    /* JADX INFO: renamed from: E */
    public aey<String> f28911E;

    /* JADX INFO: renamed from: F */
    public ObjectAnimator f28912F;

    /* JADX INFO: renamed from: a */
    public RelativeLayout f28913a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f28914b;

    /* JADX INFO: renamed from: c */
    public FrameLayout f28915c;

    /* JADX INFO: renamed from: d */
    public SVGAnimationView f28916d;

    /* JADX INFO: renamed from: e */
    public SVGAnimationView f28917e;

    /* JADX INFO: renamed from: f */
    public ImageView f28918f;

    /* JADX INFO: renamed from: g */
    public ImageView f28919g;

    /* JADX INFO: renamed from: h */
    public VText f28920h;

    /* JADX INFO: renamed from: i */
    public VLinear f28921i;

    /* JADX INFO: renamed from: j */
    public VText f28922j;

    /* JADX INFO: renamed from: k */
    public VLinear f28923k;

    /* JADX INFO: renamed from: l */
    public VText f28924l;

    /* JADX INFO: renamed from: m */
    public VText f28925m;

    /* JADX INFO: renamed from: n */
    public TextView f28926n;

    /* JADX INFO: renamed from: o */
    public VRelative f28927o;

    /* JADX INFO: renamed from: p */
    public VLinear f28928p;

    /* JADX INFO: renamed from: q */
    public VRelative f28929q;

    /* JADX INFO: renamed from: r */
    public VText f28930r;

    /* JADX INFO: renamed from: s */
    public TextView f28931s;

    /* JADX INFO: renamed from: t */
    public VRelative f28932t;

    /* JADX INFO: renamed from: u */
    public VText f28933u;

    /* JADX INFO: renamed from: v */
    public ImageView f28934v;

    /* JADX INFO: renamed from: w */
    public VText f28935w;

    /* JADX INFO: renamed from: x */
    public TextView f28936x;

    /* JADX INFO: renamed from: y */
    public View f28937y;

    /* JADX INFO: renamed from: z */
    public VButton f28938z;

    public IntlMemberAnimView(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: F */
    public static String m45124F(int i, int i2, String str) {
        return m45125G(new BigDecimal(i), i2, str);
    }

    /* JADX INFO: renamed from: G */
    public static String m45125G(BigDecimal bigDecimal, int i, String str) {
        BigDecimal bigDecimalDivide = bigDecimal.divide(new BigDecimal(i));
        DecimalFormat decimalFormat = new DecimalFormat(str);
        decimalFormat.setRoundingMode(RoundingMode.DOWN);
        return decimalFormat.format(bigDecimalDivide);
    }

    @NonNull
    /* JADX INFO: renamed from: K */
    public static String m45126K(int i) {
        if (i < 10000) {
            return new DecimalFormat(",###").format(i);
        }
        if (i < 1000000) {
            return m45124F(i, 1000, "###.#") + "K";
        }
        if (i < 100000000) {
            return m45124F(i, PlaybackException.CUSTOM_ERROR_CODE_BASE, "###.#") + "M";
        }
        return m45124F(99999999, PlaybackException.CUSTOM_ERROR_CODE_BASE, "###.#") + "M";
    }

    /* JADX INFO: renamed from: B */
    public IntlMemberAnimView m45130B(String str) {
        qib0.f154691G.m102314D(this.f28914b, str);
        return this;
    }

    /* JADX INFO: renamed from: C */
    public IntlMemberAnimView m45131C(String str) {
        xdl0.m208345M0(this.f28909C, true);
        xdl0.m208335H0(this.f28910D, str);
        return this;
    }

    /* JADX INFO: renamed from: E */
    public IntlMemberAnimView m45132E(final Runnable runnable) {
        xdl0.m208344M(this.f28919g, true);
        this.f28919g.setOnClickListener(new View.OnClickListener() { // from class: l.kko
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                runnable.run();
            }
        });
        return this;
    }

    /* JADX INFO: renamed from: L */
    public void m45133L() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f28909C, "translationY", 0.0f, t100.m186890d(7.0f), 0.0f);
        this.f28912F = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(1500L);
        this.f28912F.setInterpolator(new LinearInterpolator());
        this.f28912F.setRepeatCount(-1);
    }

    /* JADX INFO: renamed from: M */
    public IntlMemberAnimView m45134M(CharSequence charSequence, final Runnable runnable) {
        this.f28908B.setText(charSequence);
        if (NullChecker.m81303a(runnable)) {
            this.f28908B.setOnClickListener(new View.OnClickListener() { // from class: l.jko
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    runnable.run();
                }
            });
        }
        return this;
    }

    /* JADX INFO: renamed from: N */
    public IntlMemberAnimView m45135N(CharSequence charSequence, final Runnable runnable) {
        this.f28938z.setText(charSequence);
        this.f28938z.setOnClickListener(new View.OnClickListener() { // from class: l.lko
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                runnable.run();
            }
        });
        return this;
    }

    /* JADX INFO: renamed from: O */
    public IntlMemberAnimView m45136O(int i) {
        boolean z = i > 0;
        xdl0.m208344M(this.f28937y, z);
        xdl0.m208344M(this.f28929q, z);
        xdl0.m208335H0(this.f28931s, String.valueOf(i));
        return this;
    }

    /* JADX INFO: renamed from: P */
    public IntlMemberAnimView m45137P(int i) {
        xdl0.m208344M(this.f28927o, i >= 100);
        xdl0.m208335H0(this.f28936x, CoreModule.f17557o.m195057d().mo33766Vd() ? m45126K(i) : String.valueOf(i));
        return this;
    }

    /* JADX INFO: renamed from: Q */
    public IntlMemberAnimView m45138Q(String str) {
        xdl0.m208335H0(this.f28926n, str);
        return this;
    }

    /* JADX INFO: renamed from: R */
    public IntlMemberAnimView m45139R(String str) {
        xdl0.m208335H0(this.f28922j, str);
        return this;
    }

    /* JADX INFO: renamed from: S */
    public IntlMemberAnimView m45140S(@DrawableRes int i) {
        xdl0.m208345M0(this.f28918f, true);
        this.f28918f.setImageResource(i);
        return this;
    }

    /* JADX INFO: renamed from: T */
    public IntlMemberAnimView m45141T(boolean z) {
        xdl0.m208344M(this.f28907A, z);
        return this;
    }

    /* JADX INFO: renamed from: V */
    public void m45142V() {
        this.f28912F.start();
        this.f28911E.mo96156e();
    }

    /* JADX INFO: renamed from: W */
    public void m45143W() {
        this.f28912F.cancel();
        this.f28911E.mo96152a();
    }

    /* JADX INFO: renamed from: X */
    public void m45144X(int i) {
        boolean z = i >= 100 && !xma.m210040C3();
        xdl0.m208344M(this.f28923k, z);
        xdl0.m208344M(this.f28922j, z);
        if (xma.m210040C3()) {
            xdl0.m208344M(this.f28922j, true);
            if (IntlCountryCodeController.m28126v()) {
                m45139R(CoreModule.f17544b.getString(R$string.f20703z0));
            } else {
                m45139R(CoreModule.f17544b.getString(R$string.f20700y0));
            }
        }
        if (z) {
            m45139R(CoreModule.f17544b.getString(R$string.f20660l));
            m45138Q(CoreModule.f17544b.getString(R$string.f20663m));
            xdl0.m208335H0(this.f28924l, xma.m210040C3() ? m45126K(i) : new DecimalFormat(",###").format(i));
        }
    }

    /* JADX INFO: renamed from: Y */
    public IntlMemberAnimView m45145Y(String str) {
        xdl0.m208344M(this.f28920h, true);
        xdl0.m208335H0(this.f28920h, str);
        return this;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        m45143W();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m45146v(this);
        mey meyVar = new mey(this.f28916d, this.f28917e);
        this.f28911E = meyVar;
        meyVar.mo96154c("https://auto.tancdn.com/v1/raw/48b01864-e871-498a-9151-f761e3d3188708.so", -1);
        m45133L();
        this.f28938z.setBackgroundResource(b3c0.f73018c);
    }

    /* JADX INFO: renamed from: v */
    public final void m45146v(View view) {
        mko.m155059a(this, view);
    }

    /* JADX INFO: renamed from: w */
    public IntlMemberAnimView m45147w(String str, int i) {
        this.f28911E.mo96153b(str, i);
        return this;
    }

    /* JADX INFO: renamed from: z */
    public IntlMemberAnimView m45148z(@DrawableRes int i) {
        this.f28914b.setActualImageResource(i);
        return this;
    }

    public IntlMemberAnimView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public IntlMemberAnimView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
