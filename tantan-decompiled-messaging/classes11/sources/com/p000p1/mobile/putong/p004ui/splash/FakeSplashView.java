package com.p000p1.mobile.putong.p004ui.splash;

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
import com.p000p1.mobile.putong.p004ui.WebViewPreAct;
import com.p000p1.mobile.putong.p004ui.splash.FakeSplashView;
import com.p1.mobile.putong.ab.IntlCountryCodeController;
import com.p1.mobile.putong.common.R;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.utils.NullChecker;
import java.util.Locale;
import l.bne0;
import l.dd80;
import l.e30;
import l.ffx;
import l.hpd0;
import l.imr;
import l.mep0;
import l.t100;
import l.v2g;
import l.w2c0;
import l.w2g;
import l.w660;
import l.xdl0;
import p009l.gp80;
import p009l.i0g0;
import p009l.juk;
import v.VCheckBox;
import v.VDelegateLayout;
import v.VFrame_FixRatio;
import v.VImage;
import v.VLinear;
import v.VPager;
import v.VPagerWormIndicator;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class FakeSplashView extends FrameLayout {

    /* JADX INFO: renamed from: A */
    public static hpd0 f8285A = new hpd0("has_click_visitor", Boolean.FALSE);

    /* JADX INFO: renamed from: B */
    public static boolean f8286B = false;

    /* JADX INFO: renamed from: a */
    public FrameLayout f8287a;

    /* JADX INFO: renamed from: b */
    public VFrame_FixRatio f8288b;

    /* JADX INFO: renamed from: c */
    public VImage f8289c;

    /* JADX INFO: renamed from: d */
    public VText f8290d;

    /* JADX INFO: renamed from: e */
    public ConstraintLayout f8291e;

    /* JADX INFO: renamed from: f */
    public SVGAnimationView f8292f;

    /* JADX INFO: renamed from: g */
    public SVGAnimationView f8293g;

    /* JADX INFO: renamed from: h */
    public View f8294h;

    /* JADX INFO: renamed from: i */
    public LinearLayout f8295i;

    /* JADX INFO: renamed from: j */
    public VDelegateLayout f8296j;

    /* JADX INFO: renamed from: k */
    public VPager f8297k;

    /* JADX INFO: renamed from: l */
    public VPagerWormIndicator f8298l;

    /* JADX INFO: renamed from: m */
    public ConstraintLayout f8299m;

    /* JADX INFO: renamed from: n */
    public VImage f8300n;

    /* JADX INFO: renamed from: o */
    public VText f8301o;

    /* JADX INFO: renamed from: p */
    public ConstraintLayout f8302p;

    /* JADX INFO: renamed from: q */
    public VImage f8303q;

    /* JADX INFO: renamed from: r */
    public VText f8304r;

    /* JADX INFO: renamed from: s */
    public VLinear f8305s;

    /* JADX INFO: renamed from: t */
    public VCheckBox f8306t;

    /* JADX INFO: renamed from: u */
    public VText f8307u;

    /* JADX INFO: renamed from: v */
    public e30<dd80> f8308v;

    /* JADX INFO: renamed from: w */
    public SpannableStringBuilder f8309w;

    /* JADX INFO: renamed from: x */
    public imr f8310x;

    /* JADX INFO: renamed from: y */
    public RelativeSizeSpan f8311y;

    /* JADX INFO: renamed from: z */
    public StyleSpan f8312z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.ui.splash.FakeSplashView$a */
    public class C0541a extends w660 {
        public C0541a() {
        }

        public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
            viewGroup.removeView((View) obj);
        }

        public int getCount() {
            return 3;
        }

        public Object instantiateItem(ViewGroup viewGroup, int i) {
            String str;
            String strM10391w;
            FakeSplashView fakeSplashView = FakeSplashView.this;
            fakeSplashView.m10380l(LayoutInflater.from(fakeSplashView.getContext()), viewGroup);
            FakeSplashView fakeSplashView2 = FakeSplashView.this;
            VText vText = fakeSplashView2.f8290d;
            FrameLayout frameLayout = fakeSplashView2.f8287a;
            int iM10381m = fakeSplashView2.m10381m(i);
            FakeSplashView.this.f8288b.a = 1.2121212f;
            boolean zE = bne0.e();
            FakeSplashView fakeSplashView3 = FakeSplashView.this;
            if (zE) {
                fakeSplashView3.f8290d.setTextSize(20.0f);
                FakeSplashView.this.f8290d.setMinHeight(t100.d(36.0f));
                xdl0.X(FakeSplashView.this.f8288b, t100.d(36.0f));
            } else {
                fakeSplashView3.f8290d.setTextSize(17.0f);
                FakeSplashView.this.f8290d.setMinHeight(t100.d(23.0f));
                xdl0.X(FakeSplashView.this.f8288b, t100.d(23.0f));
            }
            FakeSplashView.this.f8289c.setImageResource(iM10381m);
            if (i == 0) {
                boolean zV = IntlCountryCodeController.v();
                FakeSplashView fakeSplashView4 = FakeSplashView.this;
                if (zV) {
                    str = String.format(fakeSplashView4.m10391w(R.string.I2), FakeSplashView.this.m10391w(R.string.J2));
                    strM10391w = FakeSplashView.this.m10391w(R.string.J2);
                } else {
                    str = String.format("%1$s %2$s", fakeSplashView4.m10391w(R.string.i3), FakeSplashView.this.m10391w(R.string.j3));
                    strM10391w = FakeSplashView.this.m10391w(R.string.i3);
                }
            } else if (i == 1) {
                str = String.format(FakeSplashView.this.m10391w(R.string.h3), FakeSplashView.this.m10391w(R.string.g3));
                strM10391w = FakeSplashView.this.m10391w(R.string.g3);
            } else if (i == 2) {
                str = String.format(FakeSplashView.this.m10391w(R.string.f3), FakeSplashView.this.m10391w(R.string.e3));
                strM10391w = FakeSplashView.this.m10391w(R.string.e3);
            } else {
                str = null;
                strM10391w = null;
            }
            FakeSplashView.this.m10382n(vText, str, strM10391w);
            FakeSplashView.this.f8297k.addView(frameLayout);
            frameLayout.setOnClickListener(new View.OnClickListener() { // from class: l.f2g
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f12754a.m10394k(view);
                }
            });
            frameLayout.setTag(String.valueOf(i));
            return frameLayout;
        }

        public boolean isViewFromObject(View view, Object obj) {
            return view == obj;
        }

        /* JADX INFO: renamed from: k */
        public final /* synthetic */ void m10394k(View view) {
            FakeSplashView fakeSplashView = FakeSplashView.this;
            fakeSplashView.f8298l.setCurrentItem(fakeSplashView.f8297k.getCurrentItem() == getCount() + (-1) ? 0 : FakeSplashView.this.f8297k.getCurrentItem() + 1);
        }
    }

    public FakeSplashView(@NonNull Context context) {
        super(context);
        this.f8308v = null;
        this.f8309w = new SpannableStringBuilder();
        this.f8310x = new imr(-48311, -96961, true);
        this.f8311y = new RelativeSizeSpan(1.2f);
        this.f8312z = new StyleSpan(1);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ int[] m10371c(int i, int i2, int i3, int i4) {
        int[] iArr = new int[2];
        int iD = (int) (((i3 - t100.d(40.0f)) * 0.825f) + (bne0.e() ? t100.x : t100.d(23.0f)));
        int iD2 = ffx.d(i2);
        iArr[0] = i;
        if (iD <= iD2) {
            iArr[1] = ffx.b(iD);
            return iArr;
        }
        iArr[1] = i2;
        return iArr;
    }

    public static void setVisitorHasClick(boolean z) {
        f8285A.put(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: k */
    public final void m10379k(View view) {
        v2g.a(this, view);
    }

    /* JADX INFO: renamed from: l */
    public View m10380l(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return w2g.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: m */
    public final int m10381m(int i) {
        if (i != 0) {
            return i != 1 ? w2c0.e : w2c0.d;
        }
        return w2c0.c;
    }

    /* JADX INFO: renamed from: n */
    public final void m10382n(TextView textView, String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (TextUtils.isEmpty(str2)) {
            textView.setText(str);
            return;
        }
        this.f8309w.clear();
        this.f8309w.clearSpans();
        this.f8309w.append((CharSequence) str);
        int iIndexOf = str.indexOf(str2);
        int length = str2.length() + iIndexOf;
        if (iIndexOf >= 0 && length <= str.length()) {
            this.f8309w.setSpan(this.f8311y, iIndexOf, length, 33);
            this.f8309w.setSpan(this.f8312z, iIndexOf, length, 33);
            this.f8309w.setSpan(this.f8310x, iIndexOf, length, 33);
        }
        textView.setText(this.f8309w);
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m10383o(View view) {
        m10392x();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        String string;
        super.onFinishInflate();
        m10379k(this);
        xdl0.U(this.f8302p, (int) (xdl0.w0() * 0.15f));
        this.f8296j.setOnMeasureDelegate(new VDelegateLayout.a() { // from class: l.x1g
            /* JADX INFO: renamed from: a */
            public final int[] m24678a(int i, int i2, int i3, int i4) {
                return FakeSplashView.m10371c(i, i2, i3, i4);
            }
        });
        xdl0.M(this.f8299m, false);
        m10390v();
        boolean zEquals = "zh".equals(Locale.getDefault().getLanguage());
        Activity activity = (Activity) getContext();
        xdl0.E0(this.f8306t, new View.OnClickListener() { // from class: l.y1g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f22853a.m10383o(view);
            }
        });
        xdl0.E0(this.f8307u, new View.OnClickListener() { // from class: l.z1g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f23319a.m10384p(view);
            }
        });
        VText vText = this.f8307u;
        Typeface typeface = Typeface.DEFAULT_BOLD;
        if (zEquals) {
            string = activity.getString(R.string.u2, String.format(" %s ", "《" + m10391w(R.string.a0) + "》"), String.format(" %s", "《" + m10391w(R.string.w1) + "》"));
        } else {
            string = activity.getString(R.string.u2, "《" + m10391w(R.string.a0) + "》", "《" + m10391w(R.string.w1) + "》");
        }
        vText.setText(i0g0.m16102A(activity, typeface, string, "《" + m10391w(R.string.a0) + "》", juk.m17226j(), "《" + m10391w(R.string.w1) + "》", juk.m17225i()));
        this.f8307u.setMovementMethod(LinkMovementMethod.getInstance());
        if (((Boolean) f8285A.get()).booleanValue()) {
            getContext().startActivity(WebViewPreAct.m9724K0((Activity) getContext(), juk.m17221e() ? "http://m.staging2.p1staff.com/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/growth/visitor-mode/index.html?speed=true#/" : "https://m.tantanapp.com/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/growth/visitor-mode/index.html?speed=true#/"));
        } else {
            gp80.m15142k(xdl0.E(this), new e30() { // from class: l.a2g
                public final void call(Object obj) {
                    this.f9189a.m10385q((dd80) obj);
                }
            });
        }
        xdl0.E0(this.f8302p, new View.OnClickListener() { // from class: l.b2g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9883a.m10387s(view);
            }
        });
        xdl0.E0(this.f8299m, new View.OnClickListener() { // from class: l.c2g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f10423a.m10389u(view);
            }
        });
        SVGALoader.with(getContext()).from("https://auto.tancdn.com/v1/raw/ea993b91-602c-476d-8727-17ec9436139f14.svga").autoPlay(true).repeatCount(1).into(this.f8293g);
        SVGALoader.with(getContext()).from("https://auto.tancdn.com/v1/raw/3b3b6a62-29e1-489f-ac59-bf4a287378a714.svga").autoPlay(true).repeatCount(1).into(this.f8292f);
        mep0.d1(this.f8293g, t100.m);
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m10384p(View view) {
        if (this.f8307u.getSelectionStart() == -1 && this.f8307u.getSelectionEnd() == -1) {
            m10392x();
        }
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m10385q(dd80 dd80Var) {
        if (NullChecker.a(this.f8308v)) {
            this.f8308v.call(dd80Var);
        }
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m10386r(dd80 dd80Var) {
        if (NullChecker.a(this.f8308v)) {
            this.f8308v.call(dd80Var);
        }
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m10387s(View view) {
        gp80.m15142k(xdl0.E(this), new e30() { // from class: l.e2g
            public final void call(Object obj) {
                this.f12163a.m10386r((dd80) obj);
            }
        });
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m10388t(dd80 dd80Var) {
        if (NullChecker.a(this.f8308v)) {
            this.f8308v.call(dd80Var);
        }
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m10389u(View view) {
        gp80.m15142k(xdl0.E(this), new e30() { // from class: l.d2g
            public final void call(Object obj) {
                this.f10876a.m10388t((dd80) obj);
            }
        });
    }

    /* JADX INFO: renamed from: v */
    public final void m10390v() {
        this.f8297k.setAdapter(new C0541a());
        this.f8298l.setViewPager(this.f8297k);
    }

    /* JADX INFO: renamed from: w */
    public String m10391w(int i) {
        return getContext().getResources().getString(i);
    }

    /* JADX INFO: renamed from: x */
    public final void m10392x() {
        boolean z = !f8286B;
        f8286B = z;
        this.f8306t.setChecked(z);
    }

    public FakeSplashView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f8308v = null;
        this.f8309w = new SpannableStringBuilder();
        this.f8310x = new imr(-48311, -96961, true);
        this.f8311y = new RelativeSizeSpan(1.2f);
        this.f8312z = new StyleSpan(1);
    }

    public FakeSplashView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f8308v = null;
        this.f8309w = new SpannableStringBuilder();
        this.f8310x = new imr(-48311, -96961, true);
        this.f8311y = new RelativeSizeSpan(1.2f);
        this.f8312z = new StyleSpan(1);
    }
}
