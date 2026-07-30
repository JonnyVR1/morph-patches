package com.p051p1.mobile.putong.p070ui.splash;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
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
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.putong.common.R$string;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
import com.p051p1.mobile.putong.p070ui.splash.FakeSplashViewOld;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.p106mm.opensdk.openapi.IWXAPI;
import com.tencent.p106mm.opensdk.openapi.WXAPIFactory;
import java.util.Locale;
import p151v.VButton_FakeShadow;
import p151v.VDelegateLayout;
import p151v.VFrame_FixRatio;
import p151v.VImage;
import p151v.VPager;
import p151v.VPagerWormIndicator;
import p151v.VText;
import p153l.bnl0;
import p153l.cbc0;
import p153l.cf60;
import p153l.dox;
import p153l.h4g;
import p153l.i4g;
import p153l.i4g0;
import p153l.i6e;
import p153l.ive0;
import p153l.jec0;
import p153l.jor;
import p153l.l4g0;
import p153l.lyh0;
import p153l.q8g0;
import p153l.qa00;
import p153l.uqb0;
import p153l.w1e;
import p153l.x20;
import p153l.ycc0;
import p153l.zwk;

/* JADX INFO: loaded from: classes10.dex */
public class FakeSplashViewOld extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VDelegateLayout f55556a;

    /* JADX INFO: renamed from: b */
    public VPager f55557b;

    /* JADX INFO: renamed from: c */
    public VPagerWormIndicator f55558c;

    /* JADX INFO: renamed from: d */
    public FrameLayout f55559d;

    /* JADX INFO: renamed from: e */
    public VButton_FakeShadow f55560e;

    /* JADX INFO: renamed from: f */
    public VText f55561f;

    /* JADX INFO: renamed from: g */
    public FrameLayout f55562g;

    /* JADX INFO: renamed from: h */
    public VFrame_FixRatio f55563h;

    /* JADX INFO: renamed from: i */
    public VImage f55564i;

    /* JADX INFO: renamed from: j */
    public VText f55565j;

    /* JADX INFO: renamed from: k */
    public IWXAPI f55566k;

    /* JADX INFO: renamed from: l */
    public Runnable f55567l;

    /* JADX INFO: renamed from: m */
    public SpannableStringBuilder f55568m;

    /* JADX INFO: renamed from: n */
    public jor f55569n;

    /* JADX INFO: renamed from: o */
    public RelativeSizeSpan f55570o;

    /* JADX INFO: renamed from: p */
    public StyleSpan f55571p;

    /* JADX INFO: renamed from: com.p1.mobile.putong.ui.splash.FakeSplashViewOld$a */
    public class C13303a extends cf60 {
        public C13303a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: k */
        public /* synthetic */ void m81278k(View view) {
            FakeSplashViewOld fakeSplashViewOld = FakeSplashViewOld.this;
            fakeSplashViewOld.f55558c.setCurrentItem(fakeSplashViewOld.f55557b.getCurrentItem() == getCount() + (-1) ? 0 : FakeSplashViewOld.this.f55557b.getCurrentItem() + 1);
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
            String strM81264B;
            FakeSplashViewOld fakeSplashViewOld = FakeSplashViewOld.this;
            fakeSplashViewOld.m81266p(LayoutInflater.from(fakeSplashViewOld.getContext()), viewGroup);
            FakeSplashViewOld fakeSplashViewOld2 = FakeSplashViewOld.this;
            VText vText = fakeSplashViewOld2.f55565j;
            FrameLayout frameLayout = fakeSplashViewOld2.f55562g;
            int iM81268r = fakeSplashViewOld2.m81268r(i);
            FakeSplashViewOld.this.f55563h.f210016a = 1.2121212f;
            boolean zM142291e = ive0.m142291e();
            FakeSplashViewOld fakeSplashViewOld3 = FakeSplashViewOld.this;
            if (zM142291e) {
                fakeSplashViewOld3.f55565j.setTextSize(20.0f);
                FakeSplashViewOld.this.f55565j.setMinHeight(qa00.m175859d(36.0f));
                bnl0.m105540X(FakeSplashViewOld.this.f55563h, qa00.m175859d(36.0f));
            } else {
                fakeSplashViewOld3.f55565j.setTextSize(17.0f);
                FakeSplashViewOld.this.f55565j.setMinHeight(qa00.m175859d(23.0f));
                bnl0.m105540X(FakeSplashViewOld.this.f55563h, qa00.m175859d(23.0f));
            }
            FakeSplashViewOld.this.f55564i.setImageResource(iM81268r);
            if (i == 0) {
                boolean zM29125v = IntlCountryCodeController.m29125v();
                FakeSplashViewOld fakeSplashViewOld4 = FakeSplashViewOld.this;
                if (zM29125v) {
                    str = String.format(fakeSplashViewOld4.m81264B(R$string.f18055I2), FakeSplashViewOld.this.m81264B(R$string.f18059J2));
                    strM81264B = FakeSplashViewOld.this.m81264B(R$string.f18059J2);
                } else {
                    str = String.format("%1$s %2$s", fakeSplashViewOld4.m81264B(R$string.f18168i3), FakeSplashViewOld.this.m81264B(R$string.f18173j3));
                    strM81264B = FakeSplashViewOld.this.m81264B(R$string.f18168i3);
                }
            } else if (i == 1) {
                str = String.format(FakeSplashViewOld.this.m81264B(R$string.f18163h3), FakeSplashViewOld.this.m81264B(R$string.f18158g3));
                strM81264B = FakeSplashViewOld.this.m81264B(R$string.f18158g3);
            } else if (i == 2) {
                str = String.format(FakeSplashViewOld.this.m81264B(R$string.f18153f3), FakeSplashViewOld.this.m81264B(R$string.f18148e3));
                strM81264B = FakeSplashViewOld.this.m81264B(R$string.f18148e3);
            } else {
                str = null;
                strM81264B = null;
            }
            FakeSplashViewOld.this.m81269s(vText, str, strM81264B);
            FakeSplashViewOld.this.f55557b.addView(frameLayout);
            frameLayout.setOnClickListener(new View.OnClickListener() { // from class: l.g4g
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f102171a.m81278k(view);
                }
            });
            frameLayout.setTag(String.valueOf(i));
            return frameLayout;
        }

        @Override // p153l.cf60
        public boolean isViewFromObject(View view, Object obj) {
            return view == obj;
        }
    }

    public FakeSplashViewOld(@NonNull Context context) {
        super(context);
        this.f55567l = null;
        this.f55568m = new SpannableStringBuilder();
        this.f55569n = new jor(-48311, -96961, true);
        this.f55570o = new RelativeSizeSpan(1.2f);
        this.f55571p = new StyleSpan(1);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m81251c(Dialog[] dialogArr, l4g0 l4g0Var) {
        Dialog dialog = dialogArr[0];
        if (dialog != null) {
            dialog.show();
        }
        w1e.m204402f(l4g0Var);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ int[] m81253e(int i, int i2, int i3, int i4) {
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

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m81255g(Runnable runnable) {
        i4g0.m138520r("e_second_privacy_policy_popup_read_button", "p_second_privacy_policy_popup");
        runnable.run();
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m81257i(x20 x20Var) {
        i4g0.m138520r("e_first_privacy_policy_popup_refuse_button", "p_first_privacy_policy_popup");
        x20Var.call();
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m81259k() {
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m81260l(Runnable runnable) {
        i4g0.m138520r("e_second_privacy_policy_popup_leave_button", "p_second_privacy_policy_popup");
        runnable.run();
    }

    /* JADX INFO: renamed from: A */
    public final void m81263A(Activity activity, final Runnable runnable, final Runnable runnable2) {
        final l4g0 l4g0VarM204399c = w1e.m204399c("p_second_privacy_policy_popup", Dialog.class.getName());
        l4g0VarM204399c.m152780o(i6e.m138810b("passive", "alert", "alert_self_definition_basic", "null", "logon_page", "privacy_permission_make_sure"));
        new Dialog[]{new Dialog.C4460e(activity).m21502E0(R$string.f18042F1).m21499D(R$string.f18034D1).m21558v().m21495B(false).m21555t0(R$string.f18030C1, new Runnable() { // from class: l.f4g
            @Override // java.lang.Runnable
            public final void run() {
                FakeSplashViewOld.m81255g(runnable);
            }
        }).m21541l0(R$string.f18038E1, new Runnable() { // from class: l.v3g
            @Override // java.lang.Runnable
            public final void run() {
                FakeSplashViewOld.m81260l(runnable2);
            }
        }).m21525V(new DialogInterface.OnDismissListener() { // from class: l.w3g
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                w1e.m204401e(l4g0VarM204399c);
            }
        }).m21566z()}[0].show();
        w1e.m204402f(l4g0VarM204399c);
    }

    /* JADX INFO: renamed from: B */
    public String m81264B(int i) {
        return getContext().getResources().getString(i);
    }

    /* JADX INFO: renamed from: o */
    public final void m81265o(View view) {
        h4g.m133573a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m81265o(this);
        this.f55556a.setOnMeasureDelegate(new VDelegateLayout.InterfaceC22651a() { // from class: l.u3g
            @Override // p151v.VDelegateLayout.InterfaceC22651a
            /* JADX INFO: renamed from: a */
            public final int[] mo152702a(int i, int i2, int i3, int i4) {
                return FakeSplashViewOld.m81253e(i, i2, i3, i4);
            }
        });
        bnl0.m105524M(this.f55559d, m81270t());
        if (m81270t()) {
            bnl0.m105501A0(getContext(), this.f55560e, cbc0.f80768f);
            this.f55560e.setTextColor(-6710887);
        } else {
            bnl0.m105501A0(getContext(), this.f55560e, cbc0.f80770g);
            this.f55560e.setTextColor(-1);
        }
        this.f55560e.setText(m81264B(R$string.f18041F0));
        m81275y();
        boolean zEquals = "zh".equals(Locale.getDefault().getLanguage());
        Activity activity = (Activity) getContext();
        this.f55561f.setText(q8g0.m175770B(activity, zEquals ? activity.getString(R$string.f18222t2, String.format(" %s ", m81264B(R$string.f18125a0)), String.format(" %s", m81264B(R$string.f18236w1))) : activity.getString(R$string.f18222t2, m81264B(R$string.f18125a0), m81264B(R$string.f18236w1)), m81264B(R$string.f18125a0), zwk.m221910j(), m81264B(R$string.f18236w1), zwk.m221909i()));
        this.f55561f.setMovementMethod(LinkMovementMethod.getInstance());
        m81276z((Activity) getContext());
        bnl0.m105509E0(this.f55560e, new View.OnClickListener() { // from class: l.x3g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f192254a.m81271u(view);
            }
        });
        bnl0.m105509E0(this.f55559d, new View.OnClickListener() { // from class: l.y3g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f197363a.m81272v(view);
            }
        });
    }

    /* JADX INFO: renamed from: p */
    public View m81266p(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return i4g.m138491b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: q */
    public final void m81267q() {
        if (this.f55566k == null) {
            this.f55566k = WXAPIFactory.createWXAPI(getContext(), null);
        }
    }

    /* JADX INFO: renamed from: r */
    public final int m81268r(int i) {
        if (i != 0) {
            return i != 1 ? cbc0.f80766e : cbc0.f80764d;
        }
        return cbc0.f80762c;
    }

    /* JADX INFO: renamed from: s */
    public final void m81269s(TextView textView, String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (TextUtils.isEmpty(str2)) {
            textView.setText(str);
            return;
        }
        this.f55568m.clear();
        this.f55568m.clearSpans();
        this.f55568m.append((CharSequence) str);
        int iIndexOf = str.indexOf(str2);
        int length = str2.length() + iIndexOf;
        if (iIndexOf >= 0 && length <= str.length()) {
            this.f55568m.setSpan(this.f55570o, iIndexOf, length, 33);
            this.f55568m.setSpan(this.f55571p, iIndexOf, length, 33);
            this.f55568m.setSpan(this.f55569n, iIndexOf, length, 33);
        }
        textView.setText(this.f55568m);
    }

    /* JADX INFO: renamed from: t */
    public boolean m81270t() {
        m81267q();
        return this.f55566k.isWXAppInstalled();
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m81271u(View view) {
        m81276z((Activity) getContext());
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m81272v(View view) {
        m81276z((Activity) getContext());
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m81273w(Activity activity, final Dialog[] dialogArr, final l4g0 l4g0Var) {
        m81263A(activity, new Runnable() { // from class: l.d4g
            @Override // java.lang.Runnable
            public final void run() {
                FakeSplashViewOld.m81251c(dialogArr, l4g0Var);
            }
        }, new Runnable() { // from class: l.e4g
            @Override // java.lang.Runnable
            public final void run() {
                FakeSplashViewOld.m81259k();
            }
        });
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m81274x() {
        i4g0.m138520r("e_first_privacy_policy_popup_confirm_button", "p_first_privacy_policy_popup");
        uqb0.f180364B.put(Boolean.TRUE);
        if (NullChecker.m82486a(this.f55567l)) {
            this.f55567l.run();
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m81275y() {
        this.f55557b.setAdapter(new C13303a());
        this.f55558c.setViewPager(this.f55557b);
    }

    /* JADX INFO: renamed from: z */
    public final void m81276z(final Activity activity) {
        if (uqb0.f180364B.get().booleanValue()) {
            return;
        }
        final l4g0 l4g0VarM204399c = w1e.m204399c("p_first_privacy_policy_popup", Dialog.class.getName());
        l4g0VarM204399c.m152780o(i6e.m138810b("passive", "alert", "alert_self_definition_basic", "null", "logon_page", "privacy_permission_make_sure"));
        View viewInflate = activity.getLayoutInflater().inflate(jec0.f120445N, (ViewGroup) null, false);
        ((VText) viewInflate.findViewById(ycc0.f198481s0)).setTypeface(lyh0.m156283c(2));
        VText vText = (VText) viewInflate.findViewById(ycc0.f198493y0);
        final Dialog[] dialogArr = {dialogM21566z};
        final x20 x20Var = new x20() { // from class: l.z3g
            @Override // p153l.x20
            public final void call() {
                this.f202822a.m81273w(activity, dialogArr, l4g0VarM204399c);
            }
        };
        Dialog dialogM21566z = new Dialog.C4460e(activity).m21518O(viewInflate).m21497C(-1, -1, -1, qa00.m175859d(16.0f)).m21558v().m21495B(false).m21555t0(R$string.f18241x1, new Runnable() { // from class: l.a4g
            @Override // java.lang.Runnable
            public final void run() {
                this.f68388a.m81274x();
            }
        }).m21541l0(R$string.f18250z1, new Runnable() { // from class: l.b4g
            @Override // java.lang.Runnable
            public final void run() {
                FakeSplashViewOld.m81257i(x20Var);
            }
        }).m21525V(new DialogInterface.OnDismissListener() { // from class: l.c4g
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                w1e.m204401e(l4g0VarM204399c);
            }
        }).m21566z();
        dialogM21566z.show();
        w1e.m204402f(l4g0VarM204399c);
        String string = activity.getString(R$string.f18046G1);
        String string2 = activity.getString(R$string.f18026B1);
        vText.setText(q8g0.m175772D(activity, Color.parseColor("#027abb"), String.format(activity.getString(R$string.f18246y1), string, string2), string, zwk.m221910j(), string2, zwk.m221909i()));
        vText.setMovementMethod(LinkMovementMethod.getInstance());
    }

    public FakeSplashViewOld(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f55567l = null;
        this.f55568m = new SpannableStringBuilder();
        this.f55569n = new jor(-48311, -96961, true);
        this.f55570o = new RelativeSizeSpan(1.2f);
        this.f55571p = new StyleSpan(1);
    }

    public FakeSplashViewOld(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f55567l = null;
        this.f55568m = new SpannableStringBuilder();
        this.f55569n = new jor(-48311, -96961, true);
        this.f55570o = new RelativeSizeSpan(1.2f);
        this.f55571p = new StyleSpan(1);
    }
}
