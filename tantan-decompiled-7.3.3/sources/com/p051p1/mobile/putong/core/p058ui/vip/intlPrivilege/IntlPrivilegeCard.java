package com.p051p1.mobile.putong.core.p058ui.vip.intlPrivilege;

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
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p051p1.mobile.putong.app.PutongFrag;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.data.Active;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p051p1.mobile.putong.core.data.UserPrivilege;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8927c;
import com.p051p1.mobile.putong.core.p058ui.vip.intlPrivilege.IntlPrivilegeCard;
import com.p051p1.mobile.putong.data.Counter;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
import p151v.VLinear;
import p151v.VText;
import p153l.bnl0;
import p153l.bpc0;
import p153l.czo;
import p153l.d79;
import p153l.dbc0;
import p153l.i4g0;
import p153l.joa;
import p153l.nfp;
import p153l.omp;
import p153l.oyo;
import p153l.pf60;
import p153l.psd0;
import p153l.qa00;
import p153l.rcj;
import p153l.upl0;
import p153l.y20;
import p153l.yap;

/* JADX INFO: loaded from: classes12.dex */
public class IntlPrivilegeCard extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public VLinear f37943a;

    /* JADX INFO: renamed from: b */
    public VText f37944b;

    /* JADX INFO: renamed from: c */
    public nfp f37945c;

    /* JADX INFO: renamed from: d */
    public PutongFrag f37946d;

    /* JADX INFO: renamed from: e */
    public PurchaseType f37947e;

    /* JADX INFO: renamed from: f */
    public boolean f37948f;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.intlPrivilege.IntlPrivilegeCard$a */
    public static /* synthetic */ class C9110a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f37949a;

        static {
            int[] iArr = new int[PurchaseType.values().length];
            f37949a = iArr;
            try {
                iArr[PurchaseType.TYPE_GET_VIP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f37949a[PurchaseType.TYPE_GET_LIKERS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f37949a[PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f37949a[PurchaseType.TYPE_ULTRA_PREMIUM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public IntlPrivilegeCard(@NonNull Context context) {
        super(context);
        this.f37948f = false;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ pf60 m57500d(Counter counter, User user) {
        return new pf60(counter, user);
    }

    private String getSubtypeByPurchaseType() {
        PurchaseType purchaseType = this.f37947e;
        if (purchaseType == null) {
            return "";
        }
        int i = C9110a.f37949a[purchaseType.ordinal()];
        if (i == 1) {
            return "vip";
        }
        if (i == 2) {
            return "see";
        }
        if (i != 3) {
            return i != 4 ? "" : SummarizedPrivilegesId.ultraPremium;
        }
        return "premium";
    }

    /* JADX INFO: renamed from: A */
    public final void m57503A() {
        PutongFrag putongFrag = this.f37946d;
        if (putongFrag == null || putongFrag.act() == null) {
            return;
        }
        int i = C9110a.f37949a[this.f37947e.ordinal()];
        if (i == 1) {
            C8927c.m54589K1(this.f37946d.act(), "p_privileges_view,e_ttc_renew_membership_click,click", null, null, null);
            return;
        }
        if (i == 2) {
            C8927c.m54559A1(this.f37946d.act(), "p_privileges_view,e_ttc_renew_membership_click,click");
        } else if (i == 3) {
            C8927c.m54687x0(this.f37946d.act(), "p_privileges_view,e_ttc_renew_membership_click,click", null);
        } else {
            if (i != 4) {
                return;
            }
            C8927c.m54588K0(this.f37946d.act(), "p_privileges_view,e_ttc_renew_membership_click,click", null, null, null);
        }
    }

    /* JADX INFO: renamed from: B */
    public final void m57504B(String str, String str2, int i) {
        Drawable drawable;
        if (this.f37944b == null) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (str != null && !str.isEmpty()) {
            spannableStringBuilder.append((CharSequence) str);
        }
        if (str2 != null && !str2.isEmpty()) {
            spannableStringBuilder.append((CharSequence) SignParameters.NEW_LINE);
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) str2);
            int length2 = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
            spannableStringBuilder.setSpan(new StyleSpan(1), length, length2, 33);
            spannableStringBuilder.setSpan(new UnderlineSpan(), length, length2, 33);
            if (i != 0 && (drawable = getResources().getDrawable(i)) != null) {
                drawable.setBounds(0, 0, qa00.m175859d(5.0f), qa00.m175859d(8.0f));
                ImageSpan imageSpan = new ImageSpan(drawable, 1);
                spannableStringBuilder.append((CharSequence) MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
                spannableStringBuilder.setSpan(imageSpan, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
            }
        }
        this.f37944b.setText(spannableStringBuilder);
    }

    /* JADX INFO: renamed from: g */
    public final void m57505g(View view) {
        czo.m113344a(this, view);
    }

    public PurchaseType getPurchaseType() {
        return this.f37947e;
    }

    /* JADX INFO: renamed from: h */
    public final void m57506h() {
        PutongFrag putongFrag = this.f37946d;
        if (putongFrag == null || putongFrag.act() == null || IntlCountryCodeController.m29114k()) {
            return;
        }
        if (!m57510l()) {
            String strM168277b = omp.m168277b(this.f37946d.act(), this.f37947e);
            String string = (bpc0.m105799k(this.f37947e) || bpc0.m105798j(this.f37947e)) ? this.f37946d.act().getString(R$string.f18699Nc) : "";
            m57504B(strM168277b, string, m57507i(this.f37947e, (string == null || string.isEmpty()) ? false : true));
            return;
        }
        boolean zM105798j = bpc0.m105798j(this.f37947e);
        boolean zM105799k = bpc0.m105799k(this.f37947e);
        if (!zM105798j || zM105799k) {
            m57504B(this.f37946d.act().getString(R$string.f18879Tc), "", 0);
            return;
        }
        String strM168277b2 = omp.m168277b(this.f37946d.act(), this.f37947e);
        String string2 = this.f37946d.act().getString(R$string.f18669Mc);
        m57504B(strM168277b2, string2, m57507i(this.f37947e, (string2 == null || string2.isEmpty()) ? false : true));
    }

    /* JADX INFO: renamed from: i */
    public final int m57507i(PurchaseType purchaseType, boolean z) {
        if (!z || purchaseType == null) {
            return 0;
        }
        int i = C9110a.f37949a[purchaseType.ordinal()];
        if (i == 1) {
            return dbc0.f86243Ia;
        }
        if (i == 2) {
            return dbc0.f86179Ga;
        }
        if (i == 3) {
            return dbc0.f86147Fa;
        }
        if (i != 4) {
            return 0;
        }
        return dbc0.f86211Ha;
    }

    /* JADX INFO: renamed from: j */
    public final void m57508j() {
        PutongFrag putongFrag = this.f37946d;
        if (putongFrag == null || putongFrag.act() == null || this.f37944b == null || IntlCountryCodeController.m29114k()) {
            return;
        }
        boolean zM105799k = bpc0.m105799k(this.f37947e);
        if (bpc0.m105798j(this.f37947e) && !zM105799k) {
            String subtypeByPurchaseType = getSubtypeByPurchaseType();
            if (m57510l()) {
                m57523y("active_non_renewal", subtypeByPurchaseType);
            } else {
                m57523y("expired", subtypeByPurchaseType);
            }
            yap.m214903e(this.f37946d.act());
            return;
        }
        if (!zM105799k) {
            if (m57510l()) {
                m57522x(Active.TYPE);
                return;
            }
            return;
        }
        String strM105796h = bpc0.m105796h(getPurchaseType());
        if (m57510l()) {
            m57523y(Active.TYPE, strM105796h);
        } else {
            m57523y("expired", strM105796h);
        }
        if (m57510l()) {
            return;
        }
        if (d79.m114668a0()) {
            m57503A();
            return;
        }
        PutongFrag putongFrag2 = this.f37946d;
        if (putongFrag2 instanceof IntlVipNewUiFrag) {
            ((IntlVipNewUiFrag) putongFrag2).m57539V4();
        }
    }

    /* JADX INFO: renamed from: k */
    public void m57509k(nfp nfpVar, PutongFrag putongFrag, PurchaseType purchaseType, int i) {
        this.f37945c = nfpVar;
        this.f37946d = putongFrag;
        this.f37947e = purchaseType;
        this.f37948f = false;
        if (IntlCountryCodeController.m29114k()) {
            return;
        }
        m57524z();
    }

    /* JADX INFO: renamed from: l */
    public final boolean m57510l() {
        boolean zM146401n4;
        PurchaseType purchaseType = this.f37947e;
        if (purchaseType == null) {
            return false;
        }
        int i = C9110a.f37949a[purchaseType.ordinal()];
        if (i == 1) {
            zM146401n4 = joa.m146401n4();
        } else if (i == 2) {
            zM146401n4 = joa.m146392i4();
        } else if (i != 3) {
            zM146401n4 = i != 4 ? joa.m146378b4(this.f37947e) : joa.m146396k4();
        } else {
            zM146401n4 = joa.m146386f4();
        }
        return !zM146401n4;
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m57511m(UserPrivilege userPrivilege) {
        bnl0.m105524M(this.f37943a, (d79.m114663V() && CoreModule.f18264c.f20381e0.m116593na().isUltraPremium()) ? false : true);
        if (IntlCountryCodeController.m29114k()) {
            this.f37944b.setText(upl0.m197103d(userPrivilege));
        } else {
            m57506h();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m57512n(pf60 pf60Var) {
        bnl0.m105524M(this.f37943a, (d79.m114661T() && ((User) pf60Var.f152157b).isSVIP()) ? false : true);
        if (IntlCountryCodeController.m29114k()) {
            this.f37944b.setText(upl0.m197101b(this.f37946d.act()));
        } else {
            m57506h();
        }
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m57513o(UserPrivilege userPrivilege) {
        if (IntlCountryCodeController.m29114k()) {
            this.f37944b.setText(upl0.m197103d(userPrivilege));
        } else {
            m57506h();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m57505g(this);
        if (IntlCountryCodeController.m29114k()) {
            return;
        }
        setClickable(true);
        setFocusable(true);
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m57514p(User user) {
        bnl0.m105524M(this.f37943a, (d79.m114661T() && user.isSVIP()) ? false : true);
        if (IntlCountryCodeController.m29114k()) {
            this.f37944b.setText(upl0.m197102c(this.f37946d.act()));
        } else {
            m57506h();
        }
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m57515q(View view) {
        m57508j();
    }

    /* JADX INFO: renamed from: r */
    public void m57516r() {
        m57506h();
    }

    /* JADX INFO: renamed from: s */
    public void m57517s() {
        int i = C9110a.f37949a[this.f37947e.ordinal()];
        if (i == 1) {
            m57521w();
            return;
        }
        if (i == 2) {
            m57519u();
        } else if (i == 3) {
            m57518t();
        } else {
            if (i != 4) {
                return;
            }
            m57520v();
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m57518t() {
        this.f37944b.setTextColor(Color.parseColor("#A38F5F"));
        setBackground(getResources().getDrawable(dbc0.f87278oa));
        if (this.f37948f) {
            return;
        }
        this.f37948f = true;
        this.f37945c.m153557n(this.f37946d, CoreModule.f18264c.f20297C0.m146424v3(SummarizedPrivilegesId.get("svip"))).distinctUntilChanged().subscribe(psd0.m173596G(new y20() { // from class: l.yyo
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f202121a.m57511m((UserPrivilege) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: u */
    public final void m57519u() {
        this.f37944b.setTextColor(Color.parseColor("#BA5E12"));
        setBackground(getResources().getDrawable(dbc0.f87410sa));
        if (this.f37948f) {
            return;
        }
        this.f37948f = true;
        this.f37945c.m153557n(this.f37946d, psd0.m173625r(CoreModule.f18264c.m32486n3().distinctUntilChanged(), CoreModule.f18264c.f20381e0.m116596o9().distinctUntilChanged(), new rcj() { // from class: l.uyo
            @Override // p153l.rcj
            public final Object call(Object obj, Object obj2) {
                return IntlPrivilegeCard.m57500d((Counter) obj, (User) obj2);
            }
        })).subscribe(psd0.m173596G(new y20() { // from class: l.wyo
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f191670a.m57512n((pf60) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: v */
    public final void m57520v() {
        this.f37944b.setTextColor(Color.parseColor("#66FFFFFF"));
        setBackground(getResources().getDrawable(dbc0.f87443ta));
        if (this.f37948f) {
            return;
        }
        this.f37948f = true;
        this.f37945c.m153557n(this.f37946d, CoreModule.f18264c.f20297C0.m146424v3(SummarizedPrivilegesId.get(SummarizedPrivilegesId.ultraPremium))).distinctUntilChanged().subscribe(psd0.m173596G(new y20() { // from class: l.syo
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f171280a.m57513o((UserPrivilege) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: w */
    public final void m57521w() {
        this.f37944b.setTextColor(Color.parseColor("#C58130"));
        setBackground(getResources().getDrawable(dbc0.f87476ua));
        if (this.f37948f) {
            return;
        }
        this.f37948f = true;
        this.f37945c.m153557n(this.f37946d, CoreModule.f18264c.f20381e0.m116596o9()).distinctUntilChanged(new oyo()).subscribe(psd0.m173596G(new y20() { // from class: l.qyo
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f160172a.m57514p((User) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: x */
    public final void m57522x(String str) {
        m57523y(str, getSubtypeByPurchaseType());
    }

    /* JADX INFO: renamed from: y */
    public final void m57523y(String str, String str2) {
        PutongFrag putongFrag = this.f37946d;
        if (putongFrag == null || putongFrag.act() == null) {
            return;
        }
        i4g0.m138523u("e_ttc_renew_membership_click", this.f37946d.pageId(), pf60.m172085a("subtype", str2), pf60.m172085a("subscription_status", str));
    }

    /* JADX INFO: renamed from: z */
    public final void m57524z() {
        if (this.f37946d == null || this.f37945c == null) {
            return;
        }
        bnl0.m105509E0(this, new View.OnClickListener() { // from class: l.azo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f74175a.m57515q(view);
            }
        });
    }

    public IntlPrivilegeCard(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f37948f = false;
    }

    public IntlPrivilegeCard(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f37948f = false;
    }
}
