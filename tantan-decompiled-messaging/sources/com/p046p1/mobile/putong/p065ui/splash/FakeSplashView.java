package com.p046p1.mobile.putong.p065ui.splash;

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
import com.p046p1.mobile.putong.common.R$string;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;
import com.p046p1.mobile.putong.p065ui.WebViewPreAct;
import com.p046p1.mobile.putong.p065ui.splash.FakeSplashView;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.utils.NullChecker;
import java.util.Locale;
import p147v.VCheckBox;
import p147v.VDelegateLayout;
import p147v.VFrame_FixRatio;
import p147v.VImage;
import p147v.VLinear;
import p147v.VPager;
import p147v.VPagerWormIndicator;
import p147v.VText;
import p149l.bne0;
import p149l.dd80;
import p149l.e30;
import p149l.ffx;
import p149l.gp80;
import p149l.hpd0;
import p149l.i0g0;
import p149l.imr;
import p149l.juk;
import p149l.mep0;
import p149l.t100;
import p149l.v2g;
import p149l.w2c0;
import p149l.w2g;
import p149l.w660;
import p149l.xdl0;

/* JADX INFO: loaded from: classes11.dex */
public class FakeSplashView extends FrameLayout {

    /* JADX INFO: renamed from: A */
    public static hpd0 f54679A = new hpd0("has_click_visitor", Boolean.FALSE);

    /* JADX INFO: renamed from: B */
    public static boolean f54680B = false;

    /* JADX INFO: renamed from: a */
    public FrameLayout f54681a;

    /* JADX INFO: renamed from: b */
    public VFrame_FixRatio f54682b;

    /* JADX INFO: renamed from: c */
    public VImage f54683c;

    /* JADX INFO: renamed from: d */
    public VText f54684d;

    /* JADX INFO: renamed from: e */
    public ConstraintLayout f54685e;

    /* JADX INFO: renamed from: f */
    public SVGAnimationView f54686f;

    /* JADX INFO: renamed from: g */
    public SVGAnimationView f54687g;

    /* JADX INFO: renamed from: h */
    public View f54688h;

    /* JADX INFO: renamed from: i */
    public LinearLayout f54689i;

    /* JADX INFO: renamed from: j */
    public VDelegateLayout f54690j;

    /* JADX INFO: renamed from: k */
    public VPager f54691k;

    /* JADX INFO: renamed from: l */
    public VPagerWormIndicator f54692l;

    /* JADX INFO: renamed from: m */
    public ConstraintLayout f54693m;

    /* JADX INFO: renamed from: n */
    public VImage f54694n;

    /* JADX INFO: renamed from: o */
    public VText f54695o;

    /* JADX INFO: renamed from: p */
    public ConstraintLayout f54696p;

    /* JADX INFO: renamed from: q */
    public VImage f54697q;

    /* JADX INFO: renamed from: r */
    public VText f54698r;

    /* JADX INFO: renamed from: s */
    public VLinear f54699s;

    /* JADX INFO: renamed from: t */
    public VCheckBox f54700t;

    /* JADX INFO: renamed from: u */
    public VText f54701u;

    /* JADX INFO: renamed from: v */
    public e30<dd80> f54702v;

    /* JADX INFO: renamed from: w */
    public SpannableStringBuilder f54703w;

    /* JADX INFO: renamed from: x */
    public imr f54704x;

    /* JADX INFO: renamed from: y */
    public RelativeSizeSpan f54705y;

    /* JADX INFO: renamed from: z */
    public StyleSpan f54706z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.ui.splash.FakeSplashView$a */
    public class C13139a extends w660 {
        public C13139a() {
        }

        @Override // p149l.w660
        public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
            viewGroup.removeView((View) obj);
        }

        @Override // p149l.w660
        public int getCount() {
            return 3;
        }

        @Override // p149l.w660
        public Object instantiateItem(ViewGroup viewGroup, int i) {
            String str;
            String strM80062w;
            FakeSplashView fakeSplashView = FakeSplashView.this;
            fakeSplashView.m80051l(LayoutInflater.from(fakeSplashView.getContext()), viewGroup);
            FakeSplashView fakeSplashView2 = FakeSplashView.this;
            VText vText = fakeSplashView2.f54684d;
            FrameLayout frameLayout = fakeSplashView2.f54681a;
            int iM80052m = fakeSplashView2.m80052m(i);
            FakeSplashView.this.f54682b.f209094a = 1.2121212f;
            boolean zM102776e = bne0.m102776e();
            FakeSplashView fakeSplashView3 = FakeSplashView.this;
            if (zM102776e) {
                fakeSplashView3.f54684d.setTextSize(20.0f);
                FakeSplashView.this.f54684d.setMinHeight(t100.m186890d(36.0f));
                xdl0.m208360X(FakeSplashView.this.f54682b, t100.m186890d(36.0f));
            } else {
                fakeSplashView3.f54684d.setTextSize(17.0f);
                FakeSplashView.this.f54684d.setMinHeight(t100.m186890d(23.0f));
                xdl0.m208360X(FakeSplashView.this.f54682b, t100.m186890d(23.0f));
            }
            FakeSplashView.this.f54683c.setImageResource(iM80052m);
            if (i == 0) {
                boolean zM28126v = IntlCountryCodeController.m28126v();
                FakeSplashView fakeSplashView4 = FakeSplashView.this;
                if (zM28126v) {
                    str = String.format(fakeSplashView4.m80062w(R$string.f17336I2), FakeSplashView.this.m80062w(R$string.f17340J2));
                    strM80062w = FakeSplashView.this.m80062w(R$string.f17340J2);
                } else {
                    str = String.format("%1$s %2$s", fakeSplashView4.m80062w(R$string.f17449i3), FakeSplashView.this.m80062w(R$string.f17454j3));
                    strM80062w = FakeSplashView.this.m80062w(R$string.f17449i3);
                }
            } else if (i == 1) {
                str = String.format(FakeSplashView.this.m80062w(R$string.f17444h3), FakeSplashView.this.m80062w(R$string.f17439g3));
                strM80062w = FakeSplashView.this.m80062w(R$string.f17439g3);
            } else if (i == 2) {
                str = String.format(FakeSplashView.this.m80062w(R$string.f17434f3), FakeSplashView.this.m80062w(R$string.f17429e3));
                strM80062w = FakeSplashView.this.m80062w(R$string.f17429e3);
            } else {
                str = null;
                strM80062w = null;
            }
            FakeSplashView.this.m80053n(vText, str, strM80062w);
            FakeSplashView.this.f54691k.addView(frameLayout);
            frameLayout.setOnClickListener(new View.OnClickListener() { // from class: l.f2g
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f94179a.m80065k(view);
                }
            });
            frameLayout.setTag(String.valueOf(i));
            return frameLayout;
        }

        @Override // p149l.w660
        public boolean isViewFromObject(View view, Object obj) {
            return view == obj;
        }

        /* JADX INFO: renamed from: k */
        public final /* synthetic */ void m80065k(View view) {
            FakeSplashView fakeSplashView = FakeSplashView.this;
            fakeSplashView.f54692l.setCurrentItem(fakeSplashView.f54691k.getCurrentItem() == getCount() + (-1) ? 0 : FakeSplashView.this.f54691k.getCurrentItem() + 1);
        }
    }

    public FakeSplashView(@NonNull Context context) {
        super(context);
        this.f54702v = null;
        this.f54703w = new SpannableStringBuilder();
        this.f54704x = new imr(-48311, -96961, true);
        this.f54705y = new RelativeSizeSpan(1.2f);
        this.f54706z = new StyleSpan(1);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ int[] m80042c(int i, int i2, int i3, int i4) {
        int[] iArr = new int[2];
        int iM186890d = (int) (((i3 - t100.m186890d(40.0f)) * 0.825f) + (bne0.m102776e() ? t100.f167275x : t100.m186890d(23.0f)));
        int iM121201d = ffx.m121201d(i2);
        iArr[0] = i;
        if (iM186890d <= iM121201d) {
            iArr[1] = ffx.m121199b(iM186890d);
            return iArr;
        }
        iArr[1] = i2;
        return iArr;
    }

    public static void setVisitorHasClick(boolean z) {
        f54679A.put(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: k */
    public final void m80050k(View view) {
        v2g.m196784a(this, view);
    }

    /* JADX INFO: renamed from: l */
    public View m80051l(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return w2g.m201113b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: m */
    public final int m80052m(int i) {
        if (i != 0) {
            return i != 1 ? w2c0.f184170e : w2c0.f184168d;
        }
        return w2c0.f184166c;
    }

    /* JADX INFO: renamed from: n */
    public final void m80053n(TextView textView, String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (TextUtils.isEmpty(str2)) {
            textView.setText(str);
            return;
        }
        this.f54703w.clear();
        this.f54703w.clearSpans();
        this.f54703w.append((CharSequence) str);
        int iIndexOf = str.indexOf(str2);
        int length = str2.length() + iIndexOf;
        if (iIndexOf >= 0 && length <= str.length()) {
            this.f54703w.setSpan(this.f54705y, iIndexOf, length, 33);
            this.f54703w.setSpan(this.f54706z, iIndexOf, length, 33);
            this.f54703w.setSpan(this.f54704x, iIndexOf, length, 33);
        }
        textView.setText(this.f54703w);
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m80054o(View view) {
        m80063x();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        String string;
        super.onFinishInflate();
        m80050k(this);
        xdl0.m208357U(this.f54696p, (int) (xdl0.m208408w0() * 0.15f));
        this.f54690j.setOnMeasureDelegate(new VDelegateLayout.InterfaceC22536a() { // from class: l.x1g
            @Override // p147v.VDelegateLayout.InterfaceC22536a
            /* JADX INFO: renamed from: a */
            public final int[] mo124158a(int i, int i2, int i3, int i4) {
                return FakeSplashView.m80042c(i, i2, i3, i4);
            }
        });
        xdl0.m208344M(this.f54693m, false);
        m80061v();
        boolean zEquals = "zh".equals(Locale.getDefault().getLanguage());
        Activity activity = (Activity) getContext();
        xdl0.m208329E0(this.f54700t, new View.OnClickListener() { // from class: l.y1g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f195410a.m80054o(view);
            }
        });
        xdl0.m208329E0(this.f54701u, new View.OnClickListener() { // from class: l.z1g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f201072a.m80055p(view);
            }
        });
        VText vText = this.f54701u;
        Typeface typeface = Typeface.DEFAULT_BOLD;
        if (zEquals) {
            string = activity.getString(R$string.f17508u2, String.format(" %s ", "《" + m80062w(R$string.f17406a0) + "》"), String.format(" %s", "《" + m80062w(R$string.f17517w1) + "》"));
        } else {
            string = activity.getString(R$string.f17508u2, "《" + m80062w(R$string.f17406a0) + "》", "《" + m80062w(R$string.f17517w1) + "》");
        }
        vText.setText(i0g0.m133834A(activity, typeface, string, "《" + m80062w(R$string.f17406a0) + "》", juk.m143328j(), "《" + m80062w(R$string.f17517w1) + "》", juk.m143327i()));
        this.f54701u.setMovementMethod(LinkMovementMethod.getInstance());
        if (f54679A.get().booleanValue()) {
            getContext().startActivity(WebViewPreAct.m79403K0((Activity) getContext(), juk.m143323e() ? "http://m.staging2.p1staff.com/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/growth/visitor-mode/index.html?speed=true#/" : "https://m.tantanapp.com/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/growth/visitor-mode/index.html?speed=true#/"));
        } else {
            gp80.m127343k(xdl0.m208328E(this), new e30() { // from class: l.a2g
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f67255a.m80056q((dd80) obj);
                }
            });
        }
        xdl0.m208329E0(this.f54696p, new View.OnClickListener() { // from class: l.b2g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f72694a.m80058s(view);
            }
        });
        xdl0.m208329E0(this.f54693m, new View.OnClickListener() { // from class: l.c2g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f78354a.m80060u(view);
            }
        });
        SVGALoader.with(getContext()).from("https://auto.tancdn.com/v1/raw/ea993b91-602c-476d-8727-17ec9436139f14.svga").autoPlay(true).repeatCount(1).into(this.f54687g);
        SVGALoader.with(getContext()).from("https://auto.tancdn.com/v1/raw/3b3b6a62-29e1-489f-ac59-bf4a287378a714.svga").autoPlay(true).repeatCount(1).into(this.f54686f);
        mep0.m154302d1(this.f54687g, t100.f167264m);
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m80055p(View view) {
        if (this.f54701u.getSelectionStart() == -1 && this.f54701u.getSelectionEnd() == -1) {
            m80063x();
        }
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m80056q(dd80 dd80Var) {
        if (NullChecker.m81303a(this.f54702v)) {
            this.f54702v.call(dd80Var);
        }
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m80057r(dd80 dd80Var) {
        if (NullChecker.m81303a(this.f54702v)) {
            this.f54702v.call(dd80Var);
        }
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m80058s(View view) {
        gp80.m127343k(xdl0.m208328E(this), new e30() { // from class: l.e2g
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f88918a.m80057r((dd80) obj);
            }
        });
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m80059t(dd80 dd80Var) {
        if (NullChecker.m81303a(this.f54702v)) {
            this.f54702v.call(dd80Var);
        }
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m80060u(View view) {
        gp80.m127343k(xdl0.m208328E(this), new e30() { // from class: l.d2g
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f83384a.m80059t((dd80) obj);
            }
        });
    }

    /* JADX INFO: renamed from: v */
    public final void m80061v() {
        this.f54691k.setAdapter(new C13139a());
        this.f54692l.setViewPager(this.f54691k);
    }

    /* JADX INFO: renamed from: w */
    public String m80062w(int i) {
        return getContext().getResources().getString(i);
    }

    /* JADX INFO: renamed from: x */
    public final void m80063x() {
        boolean z = !f54680B;
        f54680B = z;
        this.f54700t.setChecked(z);
    }

    public FakeSplashView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f54702v = null;
        this.f54703w = new SpannableStringBuilder();
        this.f54704x = new imr(-48311, -96961, true);
        this.f54705y = new RelativeSizeSpan(1.2f);
        this.f54706z = new StyleSpan(1);
    }

    public FakeSplashView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f54702v = null;
        this.f54703w = new SpannableStringBuilder();
        this.f54704x = new imr(-48311, -96961, true);
        this.f54705y = new RelativeSizeSpan(1.2f);
        this.f54706z = new StyleSpan(1);
    }
}
