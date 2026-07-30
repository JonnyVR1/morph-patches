package com.p000p1.mobile.putong.p004ui.splash;

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
import com.p000p1.mobile.putong.p004ui.splash.FakeSplashViewOld;
import com.p1.mobile.android.app.Dialog;
import com.p1.mobile.putong.ab.IntlCountryCodeController;
import com.p1.mobile.putong.common.R;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.mm.opensdk.openapi.IWXAPI;
import com.tencent.mm.opensdk.openapi.WXAPIFactory;
import java.util.Locale;
import l.bne0;
import l.cwf0;
import l.d30;
import l.e6c0;
import l.eqh0;
import l.ffx;
import l.imr;
import l.qib0;
import l.s4c0;
import l.t100;
import l.t2g;
import l.u2g;
import l.w2c0;
import l.w660;
import l.xdl0;
import l.zvf0;
import p009l.i0e;
import p009l.i0g0;
import p009l.juk;
import p009l.u4e;
import v.VButton_FakeShadow;
import v.VDelegateLayout;
import v.VFrame_FixRatio;
import v.VImage;
import v.VPager;
import v.VPagerWormIndicator;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class FakeSplashViewOld extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VDelegateLayout f8314a;

    /* JADX INFO: renamed from: b */
    public VPager f8315b;

    /* JADX INFO: renamed from: c */
    public VPagerWormIndicator f8316c;

    /* JADX INFO: renamed from: d */
    public FrameLayout f8317d;

    /* JADX INFO: renamed from: e */
    public VButton_FakeShadow f8318e;

    /* JADX INFO: renamed from: f */
    public VText f8319f;

    /* JADX INFO: renamed from: g */
    public FrameLayout f8320g;

    /* JADX INFO: renamed from: h */
    public VFrame_FixRatio f8321h;

    /* JADX INFO: renamed from: i */
    public VImage f8322i;

    /* JADX INFO: renamed from: j */
    public VText f8323j;

    /* JADX INFO: renamed from: k */
    public IWXAPI f8324k;

    /* JADX INFO: renamed from: l */
    public Runnable f8325l;

    /* JADX INFO: renamed from: m */
    public SpannableStringBuilder f8326m;

    /* JADX INFO: renamed from: n */
    public imr f8327n;

    /* JADX INFO: renamed from: o */
    public RelativeSizeSpan f8328o;

    /* JADX INFO: renamed from: p */
    public StyleSpan f8329p;

    /* JADX INFO: renamed from: com.p1.mobile.putong.ui.splash.FakeSplashViewOld$a */
    public class C0542a extends w660 {
        public C0542a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: k */
        public /* synthetic */ void m10424k(View view) {
            FakeSplashViewOld fakeSplashViewOld = FakeSplashViewOld.this;
            fakeSplashViewOld.f8316c.setCurrentItem(fakeSplashViewOld.f8315b.getCurrentItem() == getCount() + (-1) ? 0 : FakeSplashViewOld.this.f8315b.getCurrentItem() + 1);
        }

        public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
            viewGroup.removeView((View) obj);
        }

        public int getCount() {
            return 3;
        }

        public Object instantiateItem(ViewGroup viewGroup, int i) {
            String str;
            String strM10410B;
            FakeSplashViewOld fakeSplashViewOld = FakeSplashViewOld.this;
            fakeSplashViewOld.m10412p(LayoutInflater.from(fakeSplashViewOld.getContext()), viewGroup);
            FakeSplashViewOld fakeSplashViewOld2 = FakeSplashViewOld.this;
            VText vText = fakeSplashViewOld2.f8323j;
            FrameLayout frameLayout = fakeSplashViewOld2.f8320g;
            int iM10414r = fakeSplashViewOld2.m10414r(i);
            FakeSplashViewOld.this.f8321h.a = 1.2121212f;
            boolean zE = bne0.e();
            FakeSplashViewOld fakeSplashViewOld3 = FakeSplashViewOld.this;
            if (zE) {
                fakeSplashViewOld3.f8323j.setTextSize(20.0f);
                FakeSplashViewOld.this.f8323j.setMinHeight(t100.d(36.0f));
                xdl0.X(FakeSplashViewOld.this.f8321h, t100.d(36.0f));
            } else {
                fakeSplashViewOld3.f8323j.setTextSize(17.0f);
                FakeSplashViewOld.this.f8323j.setMinHeight(t100.d(23.0f));
                xdl0.X(FakeSplashViewOld.this.f8321h, t100.d(23.0f));
            }
            FakeSplashViewOld.this.f8322i.setImageResource(iM10414r);
            if (i == 0) {
                boolean zV = IntlCountryCodeController.v();
                FakeSplashViewOld fakeSplashViewOld4 = FakeSplashViewOld.this;
                if (zV) {
                    str = String.format(fakeSplashViewOld4.m10410B(R.string.I2), FakeSplashViewOld.this.m10410B(R.string.J2));
                    strM10410B = FakeSplashViewOld.this.m10410B(R.string.J2);
                } else {
                    str = String.format("%1$s %2$s", fakeSplashViewOld4.m10410B(R.string.i3), FakeSplashViewOld.this.m10410B(R.string.j3));
                    strM10410B = FakeSplashViewOld.this.m10410B(R.string.i3);
                }
            } else if (i == 1) {
                str = String.format(FakeSplashViewOld.this.m10410B(R.string.h3), FakeSplashViewOld.this.m10410B(R.string.g3));
                strM10410B = FakeSplashViewOld.this.m10410B(R.string.g3);
            } else if (i == 2) {
                str = String.format(FakeSplashViewOld.this.m10410B(R.string.f3), FakeSplashViewOld.this.m10410B(R.string.e3));
                strM10410B = FakeSplashViewOld.this.m10410B(R.string.e3);
            } else {
                str = null;
                strM10410B = null;
            }
            FakeSplashViewOld.this.m10415s(vText, str, strM10410B);
            FakeSplashViewOld.this.f8315b.addView(frameLayout);
            frameLayout.setOnClickListener(new View.OnClickListener() { // from class: l.s2g
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f20079a.m10424k(view);
                }
            });
            frameLayout.setTag(String.valueOf(i));
            return frameLayout;
        }

        public boolean isViewFromObject(View view, Object obj) {
            return view == obj;
        }
    }

    public FakeSplashViewOld(@NonNull Context context) {
        super(context);
        this.f8325l = null;
        this.f8326m = new SpannableStringBuilder();
        this.f8327n = new imr(-48311, -96961, true);
        this.f8328o = new RelativeSizeSpan(1.2f);
        this.f8329p = new StyleSpan(1);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m10397c(Dialog[] dialogArr, cwf0 cwf0Var) {
        Dialog dialog = dialogArr[0];
        if (dialog != null) {
            dialog.show();
        }
        i0e.m16065f(cwf0Var);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ int[] m10399e(int i, int i2, int i3, int i4) {
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

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m10401g(Runnable runnable) {
        zvf0.r("e_second_privacy_policy_popup_read_button", "p_second_privacy_policy_popup");
        runnable.run();
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m10403i(d30 d30Var) {
        zvf0.r("e_first_privacy_policy_popup_refuse_button", "p_first_privacy_policy_popup");
        d30Var.call();
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m10405k() {
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m10406l(Runnable runnable) {
        zvf0.r("e_second_privacy_policy_popup_leave_button", "p_second_privacy_policy_popup");
        runnable.run();
    }

    /* JADX INFO: renamed from: A */
    public final void m10409A(Activity activity, final Runnable runnable, final Runnable runnable2) {
        final cwf0 cwf0VarM16062c = i0e.m16062c("p_second_privacy_policy_popup", Dialog.class.getName());
        cwf0VarM16062c.o(u4e.m22745b("passive", "alert", "alert_self_definition_basic", "null", "logon_page", "privacy_permission_make_sure"));
        new Dialog[]{new Dialog.e(activity).E0(R.string.F1).D(R.string.D1).v().B(false).t0(R.string.C1, new Runnable() { // from class: l.r2g
            @Override // java.lang.Runnable
            public final void run() {
                FakeSplashViewOld.m10401g(runnable);
            }
        }).l0(R.string.E1, new Runnable() { // from class: l.h2g
            @Override // java.lang.Runnable
            public final void run() {
                FakeSplashViewOld.m10406l(runnable2);
            }
        }).V(new DialogInterface.OnDismissListener() { // from class: l.i2g
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i0e.m16064e(cwf0VarM16062c);
            }
        }).z()}[0].show();
        i0e.m16065f(cwf0VarM16062c);
    }

    /* JADX INFO: renamed from: B */
    public String m10410B(int i) {
        return getContext().getResources().getString(i);
    }

    /* JADX INFO: renamed from: o */
    public final void m10411o(View view) {
        t2g.a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m10411o(this);
        this.f8314a.setOnMeasureDelegate(new VDelegateLayout.a() { // from class: l.g2g
            /* JADX INFO: renamed from: a */
            public final int[] m14763a(int i, int i2, int i3, int i4) {
                return FakeSplashViewOld.m10399e(i, i2, i3, i4);
            }
        });
        xdl0.M(this.f8317d, m10416t());
        if (m10416t()) {
            xdl0.A0(getContext(), this.f8318e, w2c0.f);
            this.f8318e.setTextColor(-6710887);
        } else {
            xdl0.A0(getContext(), this.f8318e, w2c0.g);
            this.f8318e.setTextColor(-1);
        }
        this.f8318e.setText(m10410B(R.string.F0));
        m10421y();
        boolean zEquals = "zh".equals(Locale.getDefault().getLanguage());
        Activity activity = (Activity) getContext();
        this.f8319f.setText(i0g0.m16103B(activity, zEquals ? activity.getString(R.string.t2, String.format(" %s ", m10410B(R.string.a0)), String.format(" %s", m10410B(R.string.w1))) : activity.getString(R.string.t2, m10410B(R.string.a0), m10410B(R.string.w1)), m10410B(R.string.a0), juk.m17226j(), m10410B(R.string.w1), juk.m17225i()));
        this.f8319f.setMovementMethod(LinkMovementMethod.getInstance());
        m10422z((Activity) getContext());
        xdl0.E0(this.f8318e, new View.OnClickListener() { // from class: l.j2g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f14919a.m10417u(view);
            }
        });
        xdl0.E0(this.f8317d, new View.OnClickListener() { // from class: l.k2g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f15392a.m10418v(view);
            }
        });
    }

    /* JADX INFO: renamed from: p */
    public View m10412p(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return u2g.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: q */
    public final void m10413q() {
        if (this.f8324k == null) {
            this.f8324k = WXAPIFactory.createWXAPI(getContext(), (String) null);
        }
    }

    /* JADX INFO: renamed from: r */
    public final int m10414r(int i) {
        if (i != 0) {
            return i != 1 ? w2c0.e : w2c0.d;
        }
        return w2c0.c;
    }

    /* JADX INFO: renamed from: s */
    public final void m10415s(TextView textView, String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (TextUtils.isEmpty(str2)) {
            textView.setText(str);
            return;
        }
        this.f8326m.clear();
        this.f8326m.clearSpans();
        this.f8326m.append((CharSequence) str);
        int iIndexOf = str.indexOf(str2);
        int length = str2.length() + iIndexOf;
        if (iIndexOf >= 0 && length <= str.length()) {
            this.f8326m.setSpan(this.f8328o, iIndexOf, length, 33);
            this.f8326m.setSpan(this.f8329p, iIndexOf, length, 33);
            this.f8326m.setSpan(this.f8327n, iIndexOf, length, 33);
        }
        textView.setText(this.f8326m);
    }

    /* JADX INFO: renamed from: t */
    public boolean m10416t() {
        m10413q();
        return this.f8324k.isWXAppInstalled();
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m10417u(View view) {
        m10422z((Activity) getContext());
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m10418v(View view) {
        m10422z((Activity) getContext());
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m10419w(Activity activity, final Dialog[] dialogArr, final cwf0 cwf0Var) {
        m10409A(activity, new Runnable() { // from class: l.p2g
            @Override // java.lang.Runnable
            public final void run() {
                FakeSplashViewOld.m10397c(dialogArr, cwf0Var);
            }
        }, new Runnable() { // from class: l.q2g
            @Override // java.lang.Runnable
            public final void run() {
                FakeSplashViewOld.m10405k();
            }
        });
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m10420x() {
        zvf0.r("e_first_privacy_policy_popup_confirm_button", "p_first_privacy_policy_popup");
        qib0.B.put(Boolean.TRUE);
        if (NullChecker.a(this.f8325l)) {
            this.f8325l.run();
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m10421y() {
        this.f8315b.setAdapter(new C0542a());
        this.f8316c.setViewPager(this.f8315b);
    }

    /* JADX INFO: renamed from: z */
    public final void m10422z(final Activity activity) {
        if (((Boolean) qib0.B.get()).booleanValue()) {
            return;
        }
        final cwf0 cwf0VarM16062c = i0e.m16062c("p_first_privacy_policy_popup", Dialog.class.getName());
        cwf0VarM16062c.o(u4e.m22745b("passive", "alert", "alert_self_definition_basic", "null", "logon_page", "privacy_permission_make_sure"));
        View viewInflate = activity.getLayoutInflater().inflate(e6c0.N, (ViewGroup) null, false);
        viewInflate.findViewById(s4c0.s0).setTypeface(eqh0.c(2));
        VText vTextFindViewById = viewInflate.findViewById(s4c0.y0);
        final Dialog[] dialogArr = {dialogZ};
        final d30 d30Var = new d30() { // from class: l.l2g
            public final void call() {
                this.f15913a.m10419w(activity, dialogArr, cwf0VarM16062c);
            }
        };
        Dialog dialogZ = new Dialog.e(activity).O(viewInflate).C(-1, -1, -1, t100.d(16.0f)).v().B(false).t0(R.string.x1, new Runnable() { // from class: l.m2g
            @Override // java.lang.Runnable
            public final void run() {
                this.f16489a.m10420x();
            }
        }).l0(R.string.z1, new Runnable() { // from class: l.n2g
            @Override // java.lang.Runnable
            public final void run() {
                FakeSplashViewOld.m10403i(d30Var);
            }
        }).V(new DialogInterface.OnDismissListener() { // from class: l.o2g
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i0e.m16064e(cwf0VarM16062c);
            }
        }).z();
        dialogZ.show();
        i0e.m16065f(cwf0VarM16062c);
        String string = activity.getString(R.string.G1);
        String string2 = activity.getString(R.string.B1);
        vTextFindViewById.setText(i0g0.m16105D(activity, Color.parseColor("#027abb"), String.format(activity.getString(R.string.y1), string, string2), string, juk.m17226j(), string2, juk.m17225i()));
        vTextFindViewById.setMovementMethod(LinkMovementMethod.getInstance());
    }

    public FakeSplashViewOld(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f8325l = null;
        this.f8326m = new SpannableStringBuilder();
        this.f8327n = new imr(-48311, -96961, true);
        this.f8328o = new RelativeSizeSpan(1.2f);
        this.f8329p = new StyleSpan(1);
    }

    public FakeSplashViewOld(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f8325l = null;
        this.f8326m = new SpannableStringBuilder();
        this.f8327n = new imr(-48311, -96961, true);
        this.f8328o = new RelativeSizeSpan(1.2f);
        this.f8329p = new StyleSpan(1);
    }
}
