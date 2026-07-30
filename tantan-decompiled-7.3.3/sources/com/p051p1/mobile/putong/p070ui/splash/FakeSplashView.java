package com.p051p1.mobile.putong.p070ui.splash;

import android.app.Activity;
import android.content.Context;
import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.RelativeSizeSpan;
import android.text.style.StyleSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.common.R$string;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
import com.p051p1.mobile.putong.p070ui.WebViewPreAct;
import com.p051p1.mobile.putong.p070ui.splash.FakeSplashView;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.utils.NullChecker;
import java.util.Locale;
import p151v.VCheckBox;
import p151v.VDelegateLayout;
import p151v.VFrame_FixRatio;
import p151v.VImage;
import p151v.VLinear;
import p151v.VPager;
import p151v.VPagerWormIndicator;
import p151v.VText;
import p153l.bnl0;
import p153l.cbc0;
import p153l.cf60;
import p153l.dox;
import p153l.ive0;
import p153l.j4g;
import p153l.jl80;
import p153l.jor;
import p153l.jxd0;
import p153l.k4g;
import p153l.kx80;
import p153l.q8g0;
import p153l.qa00;
import p153l.qnp0;
import p153l.y20;
import p153l.zwk;

/* JADX INFO: loaded from: classes10.dex */
public class FakeSplashView extends FrameLayout {

    /* JADX INFO: renamed from: A */
    public static jxd0 f55527A = new jxd0("has_click_visitor", Boolean.FALSE);

    /* JADX INFO: renamed from: B */
    public static boolean f55528B = false;

    /* JADX INFO: renamed from: a */
    public FrameLayout f55529a;

    /* JADX INFO: renamed from: b */
    public VFrame_FixRatio f55530b;

    /* JADX INFO: renamed from: c */
    public VImage f55531c;

    /* JADX INFO: renamed from: d */
    public VText f55532d;

    /* JADX INFO: renamed from: e */
    public ConstraintLayout f55533e;

    /* JADX INFO: renamed from: f */
    public SVGAnimationView f55534f;

    /* JADX INFO: renamed from: g */
    public SVGAnimationView f55535g;

    /* JADX INFO: renamed from: h */
    public View f55536h;

    /* JADX INFO: renamed from: i */
    public LinearLayout f55537i;

    /* JADX INFO: renamed from: j */
    public VDelegateLayout f55538j;

    /* JADX INFO: renamed from: k */
    public VPager f55539k;

    /* JADX INFO: renamed from: l */
    public VPagerWormIndicator f55540l;

    /* JADX INFO: renamed from: m */
    public ConstraintLayout f55541m;

    /* JADX INFO: renamed from: n */
    public VImage f55542n;

    /* JADX INFO: renamed from: o */
    public VText f55543o;

    /* JADX INFO: renamed from: p */
    public ConstraintLayout f55544p;

    /* JADX INFO: renamed from: q */
    public VImage f55545q;

    /* JADX INFO: renamed from: r */
    public VText f55546r;

    /* JADX INFO: renamed from: s */
    public VLinear f55547s;

    /* JADX INFO: renamed from: t */
    public VCheckBox f55548t;

    /* JADX INFO: renamed from: u */
    public VText f55549u;

    /* JADX INFO: renamed from: v */
    public y20<jl80> f55550v;

    /* JADX INFO: renamed from: w */
    public SpannableStringBuilder f55551w;

    /* JADX INFO: renamed from: x */
    public jor f55552x;

    /* JADX INFO: renamed from: y */
    public RelativeSizeSpan f55553y;

    /* JADX INFO: renamed from: z */
    public StyleSpan f55554z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.ui.splash.FakeSplashView$a */
    public class C13302a extends cf60 {
        public C13302a() {
        }

        @Override // p153l.cf60
        public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
            viewGroup.removeView((View) obj);
        }

        @Override // p153l.cf60
        public int getCount() {
            return 3;
        }

        @Override // p153l.cf60
        public Object instantiateItem(ViewGroup viewGroup, int i) {
            String str;
            String strM81245w;
            FakeSplashView fakeSplashView = FakeSplashView.this;
            fakeSplashView.m81234l(LayoutInflater.from(fakeSplashView.getContext()), viewGroup);
            FakeSplashView fakeSplashView2 = FakeSplashView.this;
            VText vText = fakeSplashView2.f55532d;
            FrameLayout frameLayout = fakeSplashView2.f55529a;
            int iM81235m = fakeSplashView2.m81235m(i);
            FakeSplashView.this.f55530b.f210016a = 1.2121212f;
            boolean zM142291e = ive0.m142291e();
            FakeSplashView fakeSplashView3 = FakeSplashView.this;
            if (zM142291e) {
                fakeSplashView3.f55532d.setTextSize(20.0f);
                FakeSplashView.this.f55532d.setMinHeight(qa00.m175859d(36.0f));
                bnl0.m105540X(FakeSplashView.this.f55530b, qa00.m175859d(36.0f));
            } else {
                fakeSplashView3.f55532d.setTextSize(17.0f);
                FakeSplashView.this.f55532d.setMinHeight(qa00.m175859d(23.0f));
                bnl0.m105540X(FakeSplashView.this.f55530b, qa00.m175859d(23.0f));
            }
            FakeSplashView.this.f55531c.setImageResource(iM81235m);
            if (i == 0) {
                boolean zM29125v = IntlCountryCodeController.m29125v();
                FakeSplashView fakeSplashView4 = FakeSplashView.this;
                if (zM29125v) {
                    str = String.format(fakeSplashView4.m81245w(R$string.f18055I2), FakeSplashView.this.m81245w(R$string.f18059J2));
                    strM81245w = FakeSplashView.this.m81245w(R$string.f18059J2);
                } else {
                    str = String.format("%1$s %2$s", fakeSplashView4.m81245w(R$string.f18168i3), FakeSplashView.this.m81245w(R$string.f18173j3));
                    strM81245w = FakeSplashView.this.m81245w(R$string.f18168i3);
                }
            } else if (i == 1) {
                str = String.format(FakeSplashView.this.m81245w(R$string.f18163h3), FakeSplashView.this.m81245w(R$string.f18158g3));
                strM81245w = FakeSplashView.this.m81245w(R$string.f18158g3);
            } else if (i == 2) {
                str = String.format(FakeSplashView.this.m81245w(R$string.f18153f3), FakeSplashView.this.m81245w(R$string.f18148e3));
                strM81245w = FakeSplashView.this.m81245w(R$string.f18148e3);
            } else {
                str = null;
                strM81245w = null;
            }
            FakeSplashView.this.m81236n(vText, str, strM81245w);
            FakeSplashView.this.f55539k.addView(frameLayout);
            frameLayout.setOnClickListener(new View.OnClickListener() { // from class: l.t3g
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f171919a.m81248k(view);
                }
            });
            frameLayout.setTag(String.valueOf(i));
            return frameLayout;
        }

        @Override // p153l.cf60
        public boolean isViewFromObject(View view, Object obj) {
            return view == obj;
        }

        /* JADX INFO: renamed from: k */
        public final /* synthetic */ void m81248k(View view) {
            FakeSplashView fakeSplashView = FakeSplashView.this;
            fakeSplashView.f55540l.setCurrentItem(fakeSplashView.f55539k.getCurrentItem() == getCount() + (-1) ? 0 : FakeSplashView.this.f55539k.getCurrentItem() + 1);
        }
    }

    public FakeSplashView(@NonNull Context context) {
        super(context);
        this.f55550v = null;
        this.f55551w = new SpannableStringBuilder();
        this.f55552x = new jor(-48311, -96961, true);
        this.f55553y = new RelativeSizeSpan(1.2f);
        this.f55554z = new StyleSpan(1);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ int[] m81225c(int i, int i2, int i3, int i4) {
        int[] iArr = new int[2];
        int iM175859d = (int) (((i3 - qa00.m175859d(40.0f)) * 0.825f) + (ive0.m142291e() ? qa00.f156337x : qa00.m175859d(23.0f)));
        int iM117366d = dox.m117366d(i2);
        iArr[0] = i;
        if (iM175859d <= iM117366d) {
            iArr[1] = dox.m117364b(iM175859d);
            return iArr;
        }
        iArr[1] = i2;
        return iArr;
    }

    public static void setVisitorHasClick(boolean z) {
        f55527A.put(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: k */
    public final void m81233k(View view) {
        j4g.m143414a(this, view);
    }

    /* JADX INFO: renamed from: l */
    public View m81234l(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return k4g.m148242b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: m */
    public final int m81235m(int i) {
        if (i != 0) {
            return i != 1 ? cbc0.f80766e : cbc0.f80764d;
        }
        return cbc0.f80762c;
    }

    /* JADX INFO: renamed from: n */
    public final void m81236n(TextView textView, String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (TextUtils.isEmpty(str2)) {
            textView.setText(str);
            return;
        }
        this.f55551w.clear();
        this.f55551w.clearSpans();
        this.f55551w.append((CharSequence) str);
        int iIndexOf = str.indexOf(str2);
        int length = str2.length() + iIndexOf;
        if (iIndexOf >= 0 && length <= str.length()) {
            this.f55551w.setSpan(this.f55553y, iIndexOf, length, 33);
            this.f55551w.setSpan(this.f55554z, iIndexOf, length, 33);
            this.f55551w.setSpan(this.f55552x, iIndexOf, length, 33);
        }
        textView.setText(this.f55551w);
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m81237o(View view) {
        m81246x();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        String string;
        super.onFinishInflate();
        m81233k(this);
        bnl0.m105537U(this.f55544p, (int) (bnl0.m105588w0() * 0.15f));
        this.f55538j.setOnMeasureDelegate(new VDelegateLayout.InterfaceC22651a() { // from class: l.l3g
            @Override // p151v.VDelegateLayout.InterfaceC22651a
            /* JADX INFO: renamed from: a */
            public final int[] mo152702a(int i, int i2, int i3, int i4) {
                return FakeSplashView.m81225c(i, i2, i3, i4);
            }
        });
        bnl0.m105524M(this.f55541m, false);
        m81244v();
        boolean zEquals = "zh".equals(Locale.getDefault().getLanguage());
        Activity activity = (Activity) getContext();
        bnl0.m105509E0(this.f55548t, new View.OnClickListener() { // from class: l.m3g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f134664a.m81237o(view);
            }
        });
        bnl0.m105509E0(this.f55549u, new View.OnClickListener() { // from class: l.n3g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f139981a.m81238p(view);
            }
        });
        VText vText = this.f55549u;
        Typeface typeface = Typeface.DEFAULT_BOLD;
        if (zEquals) {
            string = activity.getString(R$string.f18227u2, String.format(" %s ", "《" + m81245w(R$string.f18125a0) + "》"), String.format(" %s", "《" + m81245w(R$string.f18236w1) + "》"));
        } else {
            string = activity.getString(R$string.f18227u2, "《" + m81245w(R$string.f18125a0) + "》", "《" + m81245w(R$string.f18236w1) + "》");
        }
        vText.setText(q8g0.m175769A(activity, typeface, string, "《" + m81245w(R$string.f18125a0) + "》", zwk.m221910j(), "《" + m81245w(R$string.f18236w1) + "》", zwk.m221909i()));
        this.f55549u.setMovementMethod(LinkMovementMethod.getInstance());
        if (f55527A.get().booleanValue()) {
            getContext().startActivity(WebViewPreAct.m80586L0((Activity) getContext(), zwk.m221905e() ? "http://m.staging2.p1staff.com/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/growth/visitor-mode/index.html?speed=true#/" : "https://m.tantanapp.com/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/growth/visitor-mode/index.html?speed=true#/"));
        } else {
            kx80.m151819k(bnl0.m105508E(this), new y20() { // from class: l.o3g
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f144834a.m81239q((jl80) obj);
                }
            });
        }
        bnl0.m105509E0(this.f55544p, new View.OnClickListener() { // from class: l.p3g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f150400a.m81241s(view);
            }
        });
        bnl0.m105509E0(this.f55541m, new View.OnClickListener() { // from class: l.q3g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f155444a.m81243u(view);
            }
        });
        SVGALoader.with(getContext()).from("https://auto.tancdn.com/v1/raw/ea993b91-602c-476d-8727-17ec9436139f14.svga").autoPlay(true).repeatCount(1).into(this.f55535g);
        SVGALoader.with(getContext()).from("https://auto.tancdn.com/v1/raw/3b3b6a62-29e1-489f-ac59-bf4a287378a714.svga").autoPlay(true).repeatCount(1).into(this.f55534f);
        qnp0.m177261d1(this.f55535g, qa00.f156326m);
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m81238p(View view) {
        if (this.f55549u.getSelectionStart() == -1 && this.f55549u.getSelectionEnd() == -1) {
            m81246x();
        }
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m81239q(jl80 jl80Var) {
        if (NullChecker.m82486a(this.f55550v)) {
            this.f55550v.call(jl80Var);
        }
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m81240r(jl80 jl80Var) {
        if (NullChecker.m82486a(this.f55550v)) {
            this.f55550v.call(jl80Var);
        }
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m81241s(View view) {
        kx80.m151819k(bnl0.m105508E(this), new y20() { // from class: l.s3g
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f166012a.m81240r((jl80) obj);
            }
        });
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m81242t(jl80 jl80Var) {
        if (NullChecker.m82486a(this.f55550v)) {
            this.f55550v.call(jl80Var);
        }
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m81243u(View view) {
        kx80.m151819k(bnl0.m105508E(this), new y20() { // from class: l.r3g
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f161038a.m81242t((jl80) obj);
            }
        });
    }

    /* JADX INFO: renamed from: v */
    public final void m81244v() {
        this.f55539k.setAdapter(new C13302a());
        this.f55540l.setViewPager(this.f55539k);
    }

    /* JADX INFO: renamed from: w */
    public String m81245w(int i) {
        return getContext().getResources().getString(i);
    }

    /* JADX INFO: renamed from: x */
    public final void m81246x() {
        boolean z = !f55528B;
        f55528B = z;
        this.f55548t.setChecked(z);
    }

    public FakeSplashView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f55550v = null;
        this.f55551w = new SpannableStringBuilder();
        this.f55552x = new jor(-48311, -96961, true);
        this.f55553y = new RelativeSizeSpan(1.2f);
        this.f55554z = new StyleSpan(1);
    }

    public FakeSplashView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f55550v = null;
        this.f55551w = new SpannableStringBuilder();
        this.f55552x = new jor(-48311, -96961, true);
        this.f55553y = new RelativeSizeSpan(1.2f);
        this.f55554z = new StyleSpan(1);
    }
}
