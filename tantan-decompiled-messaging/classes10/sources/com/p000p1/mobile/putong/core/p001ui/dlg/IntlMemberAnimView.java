package com.p000p1.mobile.putong.core.p001ui.dlg;

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
import com.p000p1.mobile.putong.core.member.R$string;
import com.p1.mobile.putong.ab.IntlCountryCodeController;
import com.p1.mobile.putong.core.CoreModule;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.utils.NullChecker;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import l.qib0;
import l.t100;
import l.xdl0;
import l.xma;
import p003l.aey;
import p003l.b3c0;
import p003l.mey;
import p003l.mko;
import v.VButton;
import v.VDraweeView;
import v.VFrame;
import v.VImage;
import v.VLinear;
import v.VRelative;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class IntlMemberAnimView extends VFrame {

    /* JADX INFO: renamed from: A */
    public VImage f1301A;

    /* JADX INFO: renamed from: B */
    public TextView f1302B;

    /* JADX INFO: renamed from: C */
    public VFrame f1303C;

    /* JADX INFO: renamed from: D */
    public TextView f1304D;

    /* JADX INFO: renamed from: E */
    public aey<String> f1305E;

    /* JADX INFO: renamed from: F */
    public ObjectAnimator f1306F;

    /* JADX INFO: renamed from: a */
    public RelativeLayout f1307a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f1308b;

    /* JADX INFO: renamed from: c */
    public FrameLayout f1309c;

    /* JADX INFO: renamed from: d */
    public SVGAnimationView f1310d;

    /* JADX INFO: renamed from: e */
    public SVGAnimationView f1311e;

    /* JADX INFO: renamed from: f */
    public ImageView f1312f;

    /* JADX INFO: renamed from: g */
    public ImageView f1313g;

    /* JADX INFO: renamed from: h */
    public VText f1314h;

    /* JADX INFO: renamed from: i */
    public VLinear f1315i;

    /* JADX INFO: renamed from: j */
    public VText f1316j;

    /* JADX INFO: renamed from: k */
    public VLinear f1317k;

    /* JADX INFO: renamed from: l */
    public VText f1318l;

    /* JADX INFO: renamed from: m */
    public VText f1319m;

    /* JADX INFO: renamed from: n */
    public TextView f1320n;

    /* JADX INFO: renamed from: o */
    public VRelative f1321o;

    /* JADX INFO: renamed from: p */
    public VLinear f1322p;

    /* JADX INFO: renamed from: q */
    public VRelative f1323q;

    /* JADX INFO: renamed from: r */
    public VText f1324r;

    /* JADX INFO: renamed from: s */
    public TextView f1325s;

    /* JADX INFO: renamed from: t */
    public VRelative f1326t;

    /* JADX INFO: renamed from: u */
    public VText f1327u;

    /* JADX INFO: renamed from: v */
    public ImageView f1328v;

    /* JADX INFO: renamed from: w */
    public VText f1329w;

    /* JADX INFO: renamed from: x */
    public TextView f1330x;

    /* JADX INFO: renamed from: y */
    public View f1331y;

    /* JADX INFO: renamed from: z */
    public VButton f1332z;

    public IntlMemberAnimView(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: F */
    public static String m2441F(int i, int i2, String str) {
        return m2442G(new BigDecimal(i), i2, str);
    }

    /* JADX INFO: renamed from: G */
    public static String m2442G(BigDecimal bigDecimal, int i, String str) {
        BigDecimal bigDecimalDivide = bigDecimal.divide(new BigDecimal(i));
        DecimalFormat decimalFormat = new DecimalFormat(str);
        decimalFormat.setRoundingMode(RoundingMode.DOWN);
        return decimalFormat.format(bigDecimalDivide);
    }

    @NonNull
    /* JADX INFO: renamed from: K */
    public static String m2443K(int i) {
        if (i < 10000) {
            return new DecimalFormat(",###").format(i);
        }
        if (i < 1000000) {
            return m2441F(i, 1000, "###.#") + "K";
        }
        if (i < 100000000) {
            return m2441F(i, 1000000, "###.#") + "M";
        }
        return m2441F(99999999, 1000000, "###.#") + "M";
    }

    /* JADX INFO: renamed from: B */
    public IntlMemberAnimView m2447B(String str) {
        qib0.G.D(this.f1308b, str);
        return this;
    }

    /* JADX INFO: renamed from: C */
    public IntlMemberAnimView m2448C(String str) {
        xdl0.M0(this.f1303C, true);
        xdl0.H0(this.f1304D, str);
        return this;
    }

    /* JADX INFO: renamed from: E */
    public IntlMemberAnimView m2449E(final Runnable runnable) {
        xdl0.M(this.f1313g, true);
        this.f1313g.setOnClickListener(new View.OnClickListener() { // from class: l.kko
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                runnable.run();
            }
        });
        return this;
    }

    /* JADX INFO: renamed from: L */
    public void m2450L() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f1303C, "translationY", 0.0f, t100.d(7.0f), 0.0f);
        this.f1306F = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(1500L);
        this.f1306F.setInterpolator(new LinearInterpolator());
        this.f1306F.setRepeatCount(-1);
    }

    /* JADX INFO: renamed from: M */
    public IntlMemberAnimView m2451M(CharSequence charSequence, final Runnable runnable) {
        this.f1302B.setText(charSequence);
        if (NullChecker.a(runnable)) {
            this.f1302B.setOnClickListener(new View.OnClickListener() { // from class: l.jko
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    runnable.run();
                }
            });
        }
        return this;
    }

    /* JADX INFO: renamed from: N */
    public IntlMemberAnimView m2452N(CharSequence charSequence, final Runnable runnable) {
        this.f1332z.setText(charSequence);
        this.f1332z.setOnClickListener(new View.OnClickListener() { // from class: l.lko
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                runnable.run();
            }
        });
        return this;
    }

    /* JADX INFO: renamed from: O */
    public IntlMemberAnimView m2453O(int i) {
        boolean z = i > 0;
        xdl0.M(this.f1331y, z);
        xdl0.M(this.f1323q, z);
        xdl0.H0(this.f1325s, String.valueOf(i));
        return this;
    }

    /* JADX INFO: renamed from: P */
    public IntlMemberAnimView m2454P(int i) {
        xdl0.M(this.f1321o, i >= 100);
        xdl0.H0(this.f1330x, CoreModule.o.d().Vd() ? m2443K(i) : String.valueOf(i));
        return this;
    }

    /* JADX INFO: renamed from: Q */
    public IntlMemberAnimView m2455Q(String str) {
        xdl0.H0(this.f1320n, str);
        return this;
    }

    /* JADX INFO: renamed from: R */
    public IntlMemberAnimView m2456R(String str) {
        xdl0.H0(this.f1316j, str);
        return this;
    }

    /* JADX INFO: renamed from: S */
    public IntlMemberAnimView m2457S(@DrawableRes int i) {
        xdl0.M0(this.f1312f, true);
        this.f1312f.setImageResource(i);
        return this;
    }

    /* JADX INFO: renamed from: T */
    public IntlMemberAnimView m2458T(boolean z) {
        xdl0.M(this.f1301A, z);
        return this;
    }

    /* JADX INFO: renamed from: V */
    public void m2459V() {
        this.f1306F.start();
        this.f1305E.mo5379e();
    }

    /* JADX INFO: renamed from: W */
    public void m2460W() {
        this.f1306F.cancel();
        this.f1305E.mo5375a();
    }

    /* JADX INFO: renamed from: X */
    public void m2461X(int i) {
        boolean z = i >= 100 && !xma.C3();
        xdl0.M(this.f1317k, z);
        xdl0.M(this.f1316j, z);
        if (xma.C3()) {
            xdl0.M(this.f1316j, true);
            if (IntlCountryCodeController.v()) {
                m2456R(CoreModule.b.getString(R$string.f365z0));
            } else {
                m2456R(CoreModule.b.getString(R$string.f362y0));
            }
        }
        if (z) {
            m2456R(CoreModule.b.getString(R$string.f322l));
            m2455Q(CoreModule.b.getString(R$string.f325m));
            xdl0.H0(this.f1318l, xma.C3() ? m2443K(i) : new DecimalFormat(",###").format(i));
        }
    }

    /* JADX INFO: renamed from: Y */
    public IntlMemberAnimView m2462Y(String str) {
        xdl0.M(this.f1314h, true);
        xdl0.H0(this.f1314h, str);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDetachedFromWindow() {
        m2460W();
        super/*android.view.View*/.onDetachedFromWindow();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m2463v(this);
        mey meyVar = new mey(this.f1310d, this.f1311e);
        this.f1305E = meyVar;
        meyVar.mo5377c("https://auto.tancdn.com/v1/raw/48b01864-e871-498a-9151-f761e3d3188708.so", -1);
        m2450L();
        this.f1332z.setBackgroundResource(b3c0.f3121c);
    }

    /* JADX INFO: renamed from: v */
    public final void m2463v(View view) {
        mko.m8165a(this, view);
    }

    /* JADX INFO: renamed from: w */
    public IntlMemberAnimView m2464w(String str, int i) {
        this.f1305E.mo5376b(str, i);
        return this;
    }

    /* JADX INFO: renamed from: z */
    public IntlMemberAnimView m2465z(@DrawableRes int i) {
        this.f1308b.setActualImageResource(i);
        return this;
    }

    public IntlMemberAnimView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public IntlMemberAnimView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
