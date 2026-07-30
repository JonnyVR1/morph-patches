package com.p000p1.mobile.putong.core.p004ui.vip.intlPrivilege;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.app.PutongFrag;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.R$string;
import com.p000p1.mobile.putong.core.p004ui.vip.intlPrivilege.IntlPrivilegeCard;
import com.p000p1.mobile.putong.p001ab.IntlCountryCodeController;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p1.mobile.putong.core.data.UserPrivilege;
import com.p1.mobile.putong.core.ui.purchase.c;
import com.p1.mobile.putong.data.Counter;
import com.p1.mobile.putong.data.User;
import l.cxo;
import l.d30;
import l.e30;
import l.j760;
import l.mkd0;
import l.t100;
import l.x9j;
import l.xdl0;
import l.y8p;
import l.zvf0;
import p006l.ndp;
import p006l.okp;
import p006l.owo;
import p006l.qgl0;
import p006l.u59;
import p006l.ugc0;
import p006l.x2c0;
import p006l.xma;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class IntlPrivilegeCard extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public VLinear f6876a;

    /* JADX INFO: renamed from: b */
    public VText f6877b;

    /* JADX INFO: renamed from: c */
    public ndp f6878c;

    /* JADX INFO: renamed from: d */
    public PutongFrag f6879d;

    /* JADX INFO: renamed from: e */
    public PurchaseType f6880e;

    /* JADX INFO: renamed from: f */
    public boolean f6881f;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.intlPrivilege.IntlPrivilegeCard$a */
    public static /* synthetic */ class C0383a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f6882a;

        static {
            int[] iArr = new int[PurchaseType.values().length];
            f6882a = iArr;
            try {
                iArr[PurchaseType.TYPE_GET_VIP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6882a[PurchaseType.TYPE_GET_LIKERS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6882a[PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f6882a[PurchaseType.TYPE_ULTRA_PREMIUM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public IntlPrivilegeCard(@NonNull Context context) {
        super(context);
        this.f6881f = false;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ j760 m9751d(Counter counter, User user) {
        return new j760(counter, user);
    }

    private String getSubtypeByPurchaseType() {
        PurchaseType purchaseType = this.f6880e;
        if (purchaseType == null) {
            return "";
        }
        int i = C0383a.f6882a[purchaseType.ordinal()];
        if (i == 1) {
            return "vip";
        }
        if (i == 2) {
            return "see";
        }
        if (i != 3) {
            return i != 4 ? "" : "ultraPremium";
        }
        return "premium";
    }

    /* JADX INFO: renamed from: A */
    public final void m9754A() {
        PutongFrag putongFrag = this.f6879d;
        if (putongFrag == null || putongFrag.act() == null) {
            return;
        }
        int i = C0383a.f6882a[this.f6880e.ordinal()];
        if (i == 1) {
            c.K1(this.f6879d.act(), "p_privileges_view,e_ttc_renew_membership_click,click", (Privilege) null, (d30) null, (d30) null);
            return;
        }
        if (i == 2) {
            c.A1(this.f6879d.act(), "p_privileges_view,e_ttc_renew_membership_click,click");
        } else if (i == 3) {
            c.x0(this.f6879d.act(), "p_privileges_view,e_ttc_renew_membership_click,click", (Privilege) null);
        } else {
            if (i != 4) {
                return;
            }
            c.K0(this.f6879d.act(), "p_privileges_view,e_ttc_renew_membership_click,click", (e30) null, (d30) null, (d30) null);
        }
    }

    /* JADX INFO: renamed from: B */
    public final void m9755B(String str, String str2, int i) {
        Drawable drawable;
        if (this.f6877b == null) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (str != null && !str.isEmpty()) {
            spannableStringBuilder.append((CharSequence) str);
        }
        if (str2 != null && !str2.isEmpty()) {
            spannableStringBuilder.append((CharSequence) "\n");
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) str2);
            int length2 = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) " ");
            spannableStringBuilder.setSpan(new StyleSpan(1), length, length2, 33);
            spannableStringBuilder.setSpan(new UnderlineSpan(), length, length2, 33);
            if (i != 0 && (drawable = getResources().getDrawable(i)) != null) {
                drawable.setBounds(0, 0, t100.d(5.0f), t100.d(8.0f));
                ImageSpan imageSpan = new ImageSpan(drawable, 1);
                spannableStringBuilder.append((CharSequence) " ");
                spannableStringBuilder.setSpan(imageSpan, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
            }
        }
        this.f6877b.setText(spannableStringBuilder);
    }

    /* JADX INFO: renamed from: g */
    public final void m9756g(View view) {
        cxo.a(this, view);
    }

    public PurchaseType getPurchaseType() {
        return this.f6880e;
    }

    /* JADX INFO: renamed from: h */
    public final void m9757h() {
        PutongFrag putongFrag = this.f6879d;
        if (putongFrag == null || putongFrag.act() == null || IntlCountryCodeController.m10k()) {
            return;
        }
        if (!m9761l()) {
            String strM20690b = okp.m20690b(this.f6879d.act(), this.f6880e);
            String string = (ugc0.m25215k(this.f6880e) || ugc0.m25214j(this.f6880e)) ? this.f6879d.act().getString(R$string.f3080yc) : "";
            m9755B(strM20690b, string, m9758i(this.f6880e, (string == null || string.isEmpty()) ? false : true));
            return;
        }
        boolean zM25214j = ugc0.m25214j(this.f6880e);
        boolean zM25215k = ugc0.m25215k(this.f6880e);
        if (!zM25214j || zM25215k) {
            m9755B(this.f6879d.act().getString(R$string.f1688Ec), "", 0);
            return;
        }
        String strM20690b2 = okp.m20690b(this.f6879d.act(), this.f6880e);
        String string2 = this.f6879d.act().getString(R$string.f3050xc);
        m9755B(strM20690b2, string2, m9758i(this.f6880e, (string2 == null || string2.isEmpty()) ? false : true));
    }

    /* JADX INFO: renamed from: i */
    public final int m9758i(PurchaseType purchaseType, boolean z) {
        if (!z || purchaseType == null) {
            return 0;
        }
        int i = C0383a.f6882a[purchaseType.ordinal()];
        if (i == 1) {
            return x2c0.f25923Ha;
        }
        if (i == 2) {
            return x2c0.f25860Fa;
        }
        if (i == 3) {
            return x2c0.f25828Ea;
        }
        if (i != 4) {
            return 0;
        }
        return x2c0.f25892Ga;
    }

    /* JADX INFO: renamed from: j */
    public final void m9759j() {
        PutongFrag putongFrag = this.f6879d;
        if (putongFrag == null || putongFrag.act() == null || this.f6877b == null || IntlCountryCodeController.m10k()) {
            return;
        }
        boolean zM25215k = ugc0.m25215k(this.f6880e);
        if (ugc0.m25214j(this.f6880e) && !zM25215k) {
            String subtypeByPurchaseType = getSubtypeByPurchaseType();
            if (m9761l()) {
                m9774y("active_non_renewal", subtypeByPurchaseType);
            } else {
                m9774y("expired", subtypeByPurchaseType);
            }
            y8p.e(this.f6879d.act());
            return;
        }
        if (!zM25215k) {
            if (m9761l()) {
                m9773x("active");
                return;
            }
            return;
        }
        String strM25212h = ugc0.m25212h(getPurchaseType());
        if (m9761l()) {
            m9774y("active", strM25212h);
        } else {
            m9774y("expired", strM25212h);
        }
        if (m9761l()) {
            return;
        }
        if (u59.m24988Z()) {
            m9754A();
            return;
        }
        PutongFrag putongFrag2 = this.f6879d;
        if (putongFrag2 instanceof IntlVipNewUiFrag) {
            ((IntlVipNewUiFrag) putongFrag2).m9793V4();
        }
    }

    /* JADX INFO: renamed from: k */
    public void m9760k(ndp ndpVar, PutongFrag putongFrag, PurchaseType purchaseType, int i) {
        this.f6878c = ndpVar;
        this.f6879d = putongFrag;
        this.f6880e = purchaseType;
        this.f6881f = false;
        if (IntlCountryCodeController.m10k()) {
            return;
        }
        m9775z();
    }

    /* JADX INFO: renamed from: l */
    public final boolean m9761l() {
        boolean zM27395m4;
        PurchaseType purchaseType = this.f6880e;
        if (purchaseType == null) {
            return false;
        }
        int i = C0383a.f6882a[purchaseType.ordinal()];
        if (i == 1) {
            zM27395m4 = xma.m27395m4();
        } else if (i == 2) {
            zM27395m4 = xma.m27385h4();
        } else if (i != 3) {
            zM27395m4 = i != 4 ? xma.m27371a4(this.f6880e) : xma.m27389j4();
        } else {
            zM27395m4 = xma.m27379e4();
        }
        return !zM27395m4;
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m9762m(UserPrivilege userPrivilege) {
        xdl0.M(this.f6876a, (u59.m24983U() && CoreModule.f1534c.f3628e0.m21483na().isUltraPremium()) ? false : true);
        if (IntlCountryCodeController.m10k()) {
            this.f6877b.setText(qgl0.m22046d(userPrivilege));
        } else {
            m9757h();
        }
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m9763n(j760 j760Var) {
        xdl0.M(this.f6876a, (u59.m24981S() && ((User) j760Var.b).isSVIP()) ? false : true);
        if (IntlCountryCodeController.m10k()) {
            this.f6877b.setText(qgl0.m22044b(this.f6879d.act()));
        } else {
            m9757h();
        }
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m9764o(UserPrivilege userPrivilege) {
        if (IntlCountryCodeController.m10k()) {
            this.f6877b.setText(qgl0.m22046d(userPrivilege));
        } else {
            m9757h();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m9756g(this);
        if (IntlCountryCodeController.m10k()) {
            return;
        }
        setClickable(true);
        setFocusable(true);
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m9765p(User user) {
        xdl0.M(this.f6876a, (u59.m24981S() && user.isSVIP()) ? false : true);
        if (IntlCountryCodeController.m10k()) {
            this.f6877b.setText(qgl0.m22045c(this.f6879d.act()));
        } else {
            m9757h();
        }
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m9766q(View view) {
        m9759j();
    }

    /* JADX INFO: renamed from: r */
    public void m9767r() {
        m9757h();
    }

    /* JADX INFO: renamed from: s */
    public void m9768s() {
        int i = C0383a.f6882a[this.f6880e.ordinal()];
        if (i == 1) {
            m9772w();
            return;
        }
        if (i == 2) {
            m9770u();
        } else if (i == 3) {
            m9769t();
        } else {
            if (i != 4) {
                return;
            }
            m9771v();
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m9769t() {
        this.f6877b.setTextColor(Color.parseColor("#A38F5F"));
        setBackground(getResources().getDrawable(x2c0.f26925na));
        if (this.f6881f) {
            return;
        }
        this.f6881f = true;
        this.f6878c.n(this.f6879d, CoreModule.f1534c.f3544C0.m27419u3(SummarizedPrivilegesId.get("svip"))).distinctUntilChanged().subscribe(mkd0.G(new e30() { // from class: l.ywo
            public final void call(Object obj) {
                this.f28458a.m9762m((UserPrivilege) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: u */
    public final void m9770u() {
        this.f6877b.setTextColor(Color.parseColor("#BA5E12"));
        setBackground(getResources().getDrawable(x2c0.f27053ra));
        if (this.f6881f) {
            return;
        }
        this.f6881f = true;
        this.f6878c.n(this.f6879d, mkd0.r(CoreModule.f1534c.m3413n3().distinctUntilChanged(), CoreModule.f1534c.f3628e0.m21486o9().distinctUntilChanged(), new x9j() { // from class: l.uwo
            public final Object call(Object obj, Object obj2) {
                return IntlPrivilegeCard.m9751d((Counter) obj, (User) obj2);
            }
        })).subscribe(mkd0.G(new e30() { // from class: l.wwo
            public final void call(Object obj) {
                this.f25448a.m9763n((j760) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: v */
    public final void m9771v() {
        this.f6877b.setTextColor(Color.parseColor("#66FFFFFF"));
        setBackground(getResources().getDrawable(x2c0.f27085sa));
        if (this.f6881f) {
            return;
        }
        this.f6881f = true;
        this.f6878c.n(this.f6879d, CoreModule.f1534c.f3544C0.m27419u3(SummarizedPrivilegesId.get("ultraPremium"))).distinctUntilChanged().subscribe(mkd0.G(new e30() { // from class: l.swo
            public final void call(Object obj) {
                this.f21734a.m9764o((UserPrivilege) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: w */
    public final void m9772w() {
        this.f6877b.setTextColor(Color.parseColor("#C58130"));
        setBackground(getResources().getDrawable(x2c0.f27117ta));
        if (this.f6881f) {
            return;
        }
        this.f6881f = true;
        this.f6878c.n(this.f6879d, CoreModule.f1534c.f3628e0.m21486o9()).distinctUntilChanged(new owo()).subscribe(mkd0.G(new e30() { // from class: l.qwo
            public final void call(Object obj) {
                this.f20121a.m9765p((User) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: x */
    public final void m9773x(String str) {
        m9774y(str, getSubtypeByPurchaseType());
    }

    /* JADX INFO: renamed from: y */
    public final void m9774y(String str, String str2) {
        PutongFrag putongFrag = this.f6879d;
        if (putongFrag == null || putongFrag.act() == null) {
            return;
        }
        zvf0.u("e_ttc_renew_membership_click", this.f6879d.pageId(), new j760[]{j760.a("subtype", str2), j760.a("subscription_status", str)});
    }

    /* JADX INFO: renamed from: z */
    public final void m9775z() {
        if (this.f6879d == null || this.f6878c == null) {
            return;
        }
        xdl0.E0(this, new View.OnClickListener() { // from class: l.axo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8591a.m9766q(view);
            }
        });
    }

    public IntlPrivilegeCard(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6881f = false;
    }

    public IntlPrivilegeCard(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f6881f = false;
    }
}
