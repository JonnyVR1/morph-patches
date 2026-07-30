package com.p046p1.mobile.putong.p065ui.splash;

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
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.putong.common.R$string;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;
import com.p046p1.mobile.putong.p065ui.splash.FakeSplashViewOld;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.p101mm.opensdk.openapi.IWXAPI;
import com.tencent.p101mm.opensdk.openapi.WXAPIFactory;
import java.util.Locale;
import p147v.VButton_FakeShadow;
import p147v.VDelegateLayout;
import p147v.VFrame_FixRatio;
import p147v.VImage;
import p147v.VPager;
import p147v.VPagerWormIndicator;
import p147v.VText;
import p149l.bne0;
import p149l.cwf0;
import p149l.d30;
import p149l.e6c0;
import p149l.eqh0;
import p149l.ffx;
import p149l.i0e;
import p149l.i0g0;
import p149l.imr;
import p149l.juk;
import p149l.qib0;
import p149l.s4c0;
import p149l.t100;
import p149l.t2g;
import p149l.u2g;
import p149l.u4e;
import p149l.w2c0;
import p149l.w660;
import p149l.xdl0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes11.dex */
public class FakeSplashViewOld extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VDelegateLayout f54708a;

    /* JADX INFO: renamed from: b */
    public VPager f54709b;

    /* JADX INFO: renamed from: c */
    public VPagerWormIndicator f54710c;

    /* JADX INFO: renamed from: d */
    public FrameLayout f54711d;

    /* JADX INFO: renamed from: e */
    public VButton_FakeShadow f54712e;

    /* JADX INFO: renamed from: f */
    public VText f54713f;

    /* JADX INFO: renamed from: g */
    public FrameLayout f54714g;

    /* JADX INFO: renamed from: h */
    public VFrame_FixRatio f54715h;

    /* JADX INFO: renamed from: i */
    public VImage f54716i;

    /* JADX INFO: renamed from: j */
    public VText f54717j;

    /* JADX INFO: renamed from: k */
    public IWXAPI f54718k;

    /* JADX INFO: renamed from: l */
    public Runnable f54719l;

    /* JADX INFO: renamed from: m */
    public SpannableStringBuilder f54720m;

    /* JADX INFO: renamed from: n */
    public imr f54721n;

    /* JADX INFO: renamed from: o */
    public RelativeSizeSpan f54722o;

    /* JADX INFO: renamed from: p */
    public StyleSpan f54723p;

    /* JADX INFO: renamed from: com.p1.mobile.putong.ui.splash.FakeSplashViewOld$a */
    public class C13140a extends w660 {
        public C13140a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: k */
        public /* synthetic */ void m80095k(View view) {
            FakeSplashViewOld fakeSplashViewOld = FakeSplashViewOld.this;
            fakeSplashViewOld.f54710c.setCurrentItem(fakeSplashViewOld.f54709b.getCurrentItem() == getCount() + (-1) ? 0 : FakeSplashViewOld.this.f54709b.getCurrentItem() + 1);
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
            String strM80081B;
            FakeSplashViewOld fakeSplashViewOld = FakeSplashViewOld.this;
            fakeSplashViewOld.m80083p(LayoutInflater.from(fakeSplashViewOld.getContext()), viewGroup);
            FakeSplashViewOld fakeSplashViewOld2 = FakeSplashViewOld.this;
            VText vText = fakeSplashViewOld2.f54717j;
            FrameLayout frameLayout = fakeSplashViewOld2.f54714g;
            int iM80085r = fakeSplashViewOld2.m80085r(i);
            FakeSplashViewOld.this.f54715h.f209094a = 1.2121212f;
            boolean zM102776e = bne0.m102776e();
            FakeSplashViewOld fakeSplashViewOld3 = FakeSplashViewOld.this;
            if (zM102776e) {
                fakeSplashViewOld3.f54717j.setTextSize(20.0f);
                FakeSplashViewOld.this.f54717j.setMinHeight(t100.m186890d(36.0f));
                xdl0.m208360X(FakeSplashViewOld.this.f54715h, t100.m186890d(36.0f));
            } else {
                fakeSplashViewOld3.f54717j.setTextSize(17.0f);
                FakeSplashViewOld.this.f54717j.setMinHeight(t100.m186890d(23.0f));
                xdl0.m208360X(FakeSplashViewOld.this.f54715h, t100.m186890d(23.0f));
            }
            FakeSplashViewOld.this.f54716i.setImageResource(iM80085r);
            if (i == 0) {
                boolean zM28126v = IntlCountryCodeController.m28126v();
                FakeSplashViewOld fakeSplashViewOld4 = FakeSplashViewOld.this;
                if (zM28126v) {
                    str = String.format(fakeSplashViewOld4.m80081B(R$string.f17336I2), FakeSplashViewOld.this.m80081B(R$string.f17340J2));
                    strM80081B = FakeSplashViewOld.this.m80081B(R$string.f17340J2);
                } else {
                    str = String.format("%1$s %2$s", fakeSplashViewOld4.m80081B(R$string.f17449i3), FakeSplashViewOld.this.m80081B(R$string.f17454j3));
                    strM80081B = FakeSplashViewOld.this.m80081B(R$string.f17449i3);
                }
            } else if (i == 1) {
                str = String.format(FakeSplashViewOld.this.m80081B(R$string.f17444h3), FakeSplashViewOld.this.m80081B(R$string.f17439g3));
                strM80081B = FakeSplashViewOld.this.m80081B(R$string.f17439g3);
            } else if (i == 2) {
                str = String.format(FakeSplashViewOld.this.m80081B(R$string.f17434f3), FakeSplashViewOld.this.m80081B(R$string.f17429e3));
                strM80081B = FakeSplashViewOld.this.m80081B(R$string.f17429e3);
            } else {
                str = null;
                strM80081B = null;
            }
            FakeSplashViewOld.this.m80086s(vText, str, strM80081B);
            FakeSplashViewOld.this.f54709b.addView(frameLayout);
            frameLayout.setOnClickListener(new View.OnClickListener() { // from class: l.s2g
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f161977a.m80095k(view);
                }
            });
            frameLayout.setTag(String.valueOf(i));
            return frameLayout;
        }

        @Override // p149l.w660
        public boolean isViewFromObject(View view, Object obj) {
            return view == obj;
        }
    }

    public FakeSplashViewOld(@NonNull Context context) {
        super(context);
        this.f54719l = null;
        this.f54720m = new SpannableStringBuilder();
        this.f54721n = new imr(-48311, -96961, true);
        this.f54722o = new RelativeSizeSpan(1.2f);
        this.f54723p = new StyleSpan(1);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m80068c(Dialog[] dialogArr, cwf0 cwf0Var) {
        Dialog dialog = dialogArr[0];
        if (dialog != null) {
            dialog.show();
        }
        i0e.m133797f(cwf0Var);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ int[] m80070e(int i, int i2, int i3, int i4) {
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

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m80072g(Runnable runnable) {
        zvf0.m220396r("e_second_privacy_policy_popup_read_button", "p_second_privacy_policy_popup");
        runnable.run();
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m80074i(d30 d30Var) {
        zvf0.m220396r("e_first_privacy_policy_popup_refuse_button", "p_first_privacy_policy_popup");
        d30Var.call();
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m80076k() {
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m80077l(Runnable runnable) {
        zvf0.m220396r("e_second_privacy_policy_popup_leave_button", "p_second_privacy_policy_popup");
        runnable.run();
    }

    /* JADX INFO: renamed from: A */
    public final void m80080A(Activity activity, final Runnable runnable, final Runnable runnable2) {
        final cwf0 cwf0VarM133794c = i0e.m133794c("p_second_privacy_policy_popup", Dialog.class.getName());
        cwf0VarM133794c.m109039o(u4e.m191727b("passive", "alert", "alert_self_definition_basic", "null", "logon_page", "privacy_permission_make_sure"));
        new Dialog[]{new Dialog.C4309e(activity).m20503E0(R$string.f17323F1).m20500D(R$string.f17315D1).m20559v().m20496B(false).m20556t0(R$string.f17311C1, new Runnable() { // from class: l.r2g
            @Override // java.lang.Runnable
            public final void run() {
                FakeSplashViewOld.m80072g(runnable);
            }
        }).m20542l0(R$string.f17319E1, new Runnable() { // from class: l.h2g
            @Override // java.lang.Runnable
            public final void run() {
                FakeSplashViewOld.m80077l(runnable2);
            }
        }).m20526V(new DialogInterface.OnDismissListener() { // from class: l.i2g
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i0e.m133796e(cwf0VarM133794c);
            }
        }).m20567z()}[0].show();
        i0e.m133797f(cwf0VarM133794c);
    }

    /* JADX INFO: renamed from: B */
    public String m80081B(int i) {
        return getContext().getResources().getString(i);
    }

    /* JADX INFO: renamed from: o */
    public final void m80082o(View view) {
        t2g.m186969a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m80082o(this);
        this.f54708a.setOnMeasureDelegate(new VDelegateLayout.InterfaceC22536a() { // from class: l.g2g
            @Override // p147v.VDelegateLayout.InterfaceC22536a
            /* JADX INFO: renamed from: a */
            public final int[] mo124158a(int i, int i2, int i3, int i4) {
                return FakeSplashViewOld.m80070e(i, i2, i3, i4);
            }
        });
        xdl0.m208344M(this.f54711d, m80087t());
        if (m80087t()) {
            xdl0.m208321A0(getContext(), this.f54712e, w2c0.f184172f);
            this.f54712e.setTextColor(-6710887);
        } else {
            xdl0.m208321A0(getContext(), this.f54712e, w2c0.f184174g);
            this.f54712e.setTextColor(-1);
        }
        this.f54712e.setText(m80081B(R$string.f17322F0));
        m80092y();
        boolean zEquals = "zh".equals(Locale.getDefault().getLanguage());
        Activity activity = (Activity) getContext();
        this.f54713f.setText(i0g0.m133835B(activity, zEquals ? activity.getString(R$string.f17503t2, String.format(" %s ", m80081B(R$string.f17406a0)), String.format(" %s", m80081B(R$string.f17517w1))) : activity.getString(R$string.f17503t2, m80081B(R$string.f17406a0), m80081B(R$string.f17517w1)), m80081B(R$string.f17406a0), juk.m143328j(), m80081B(R$string.f17517w1), juk.m143327i()));
        this.f54713f.setMovementMethod(LinkMovementMethod.getInstance());
        m80093z((Activity) getContext());
        xdl0.m208329E0(this.f54712e, new View.OnClickListener() { // from class: l.j2g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f115927a.m80088u(view);
            }
        });
        xdl0.m208329E0(this.f54711d, new View.OnClickListener() { // from class: l.k2g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f120734a.m80089v(view);
            }
        });
    }

    /* JADX INFO: renamed from: p */
    public View m80083p(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return u2g.m191491b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: q */
    public final void m80084q() {
        if (this.f54718k == null) {
            this.f54718k = WXAPIFactory.createWXAPI(getContext(), null);
        }
    }

    /* JADX INFO: renamed from: r */
    public final int m80085r(int i) {
        if (i != 0) {
            return i != 1 ? w2c0.f184170e : w2c0.f184168d;
        }
        return w2c0.f184166c;
    }

    /* JADX INFO: renamed from: s */
    public final void m80086s(TextView textView, String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (TextUtils.isEmpty(str2)) {
            textView.setText(str);
            return;
        }
        this.f54720m.clear();
        this.f54720m.clearSpans();
        this.f54720m.append((CharSequence) str);
        int iIndexOf = str.indexOf(str2);
        int length = str2.length() + iIndexOf;
        if (iIndexOf >= 0 && length <= str.length()) {
            this.f54720m.setSpan(this.f54722o, iIndexOf, length, 33);
            this.f54720m.setSpan(this.f54723p, iIndexOf, length, 33);
            this.f54720m.setSpan(this.f54721n, iIndexOf, length, 33);
        }
        textView.setText(this.f54720m);
    }

    /* JADX INFO: renamed from: t */
    public boolean m80087t() {
        m80084q();
        return this.f54718k.isWXAppInstalled();
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m80088u(View view) {
        m80093z((Activity) getContext());
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m80089v(View view) {
        m80093z((Activity) getContext());
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m80090w(Activity activity, final Dialog[] dialogArr, final cwf0 cwf0Var) {
        m80080A(activity, new Runnable() { // from class: l.p2g
            @Override // java.lang.Runnable
            public final void run() {
                FakeSplashViewOld.m80068c(dialogArr, cwf0Var);
            }
        }, new Runnable() { // from class: l.q2g
            @Override // java.lang.Runnable
            public final void run() {
                FakeSplashViewOld.m80076k();
            }
        });
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m80091x() {
        zvf0.m220396r("e_first_privacy_policy_popup_confirm_button", "p_first_privacy_policy_popup");
        qib0.f154681B.put(Boolean.TRUE);
        if (NullChecker.m81303a(this.f54719l)) {
            this.f54719l.run();
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m80092y() {
        this.f54709b.setAdapter(new C13140a());
        this.f54710c.setViewPager(this.f54709b);
    }

    /* JADX INFO: renamed from: z */
    public final void m80093z(final Activity activity) {
        if (qib0.f154681B.get().booleanValue()) {
            return;
        }
        final cwf0 cwf0VarM133794c = i0e.m133794c("p_first_privacy_policy_popup", Dialog.class.getName());
        cwf0VarM133794c.m109039o(u4e.m191727b("passive", "alert", "alert_self_definition_basic", "null", "logon_page", "privacy_permission_make_sure"));
        View viewInflate = activity.getLayoutInflater().inflate(e6c0.f89532N, (ViewGroup) null, false);
        ((VText) viewInflate.findViewById(s4c0.f162360s0)).setTypeface(eqh0.m117752c(2));
        VText vText = (VText) viewInflate.findViewById(s4c0.f162372y0);
        final Dialog[] dialogArr = {dialogM20567z};
        final d30 d30Var = new d30() { // from class: l.l2g
            @Override // p149l.d30
            public final void call() {
                this.f125776a.m80090w(activity, dialogArr, cwf0VarM133794c);
            }
        };
        Dialog dialogM20567z = new Dialog.C4309e(activity).m20519O(viewInflate).m20498C(-1, -1, -1, t100.m186890d(16.0f)).m20559v().m20496B(false).m20556t0(R$string.f17522x1, new Runnable() { // from class: l.m2g
            @Override // java.lang.Runnable
            public final void run() {
                this.f130922a.m80091x();
            }
        }).m20542l0(R$string.f17531z1, new Runnable() { // from class: l.n2g
            @Override // java.lang.Runnable
            public final void run() {
                FakeSplashViewOld.m80074i(d30Var);
            }
        }).m20526V(new DialogInterface.OnDismissListener() { // from class: l.o2g
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i0e.m133796e(cwf0VarM133794c);
            }
        }).m20567z();
        dialogM20567z.show();
        i0e.m133797f(cwf0VarM133794c);
        String string = activity.getString(R$string.f17327G1);
        String string2 = activity.getString(R$string.f17307B1);
        vText.setText(i0g0.m133837D(activity, Color.parseColor("#027abb"), String.format(activity.getString(R$string.f17527y1), string, string2), string, juk.m143328j(), string2, juk.m143327i()));
        vText.setMovementMethod(LinkMovementMethod.getInstance());
    }

    public FakeSplashViewOld(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f54719l = null;
        this.f54720m = new SpannableStringBuilder();
        this.f54721n = new imr(-48311, -96961, true);
        this.f54722o = new RelativeSizeSpan(1.2f);
        this.f54723p = new StyleSpan(1);
    }

    public FakeSplashViewOld(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f54719l = null;
        this.f54720m = new SpannableStringBuilder();
        this.f54721n = new imr(-48311, -96961, true);
        this.f54722o = new RelativeSizeSpan(1.2f);
        this.f54723p = new StyleSpan(1);
    }
}
