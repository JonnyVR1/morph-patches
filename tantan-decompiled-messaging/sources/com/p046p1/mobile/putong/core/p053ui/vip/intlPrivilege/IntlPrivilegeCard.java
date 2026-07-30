package com.p046p1.mobile.putong.core.p053ui.vip.intlPrivilege;

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
import com.p046p1.mobile.putong.app.PutongFrag;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.data.Active;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p046p1.mobile.putong.core.data.UserPrivilege;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8764c;
import com.p046p1.mobile.putong.core.p053ui.vip.intlPrivilege.IntlPrivilegeCard;
import com.p046p1.mobile.putong.data.Counter;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;
import p147v.VLinear;
import p147v.VText;
import p149l.cxo;
import p149l.e30;
import p149l.j760;
import p149l.mkd0;
import p149l.ndp;
import p149l.okp;
import p149l.owo;
import p149l.qgl0;
import p149l.t100;
import p149l.u59;
import p149l.ugc0;
import p149l.x2c0;
import p149l.x9j;
import p149l.xdl0;
import p149l.xma;
import p149l.y8p;
import p149l.zvf0;

/* JADX INFO: loaded from: classes9.dex */
public class IntlPrivilegeCard extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public VLinear f37095a;

    /* JADX INFO: renamed from: b */
    public VText f37096b;

    /* JADX INFO: renamed from: c */
    public ndp f37097c;

    /* JADX INFO: renamed from: d */
    public PutongFrag f37098d;

    /* JADX INFO: renamed from: e */
    public PurchaseType f37099e;

    /* JADX INFO: renamed from: f */
    public boolean f37100f;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.intlPrivilege.IntlPrivilegeCard$a */
    public static /* synthetic */ class C8947a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f37101a;

        static {
            int[] iArr = new int[PurchaseType.values().length];
            f37101a = iArr;
            try {
                iArr[PurchaseType.TYPE_GET_VIP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f37101a[PurchaseType.TYPE_GET_LIKERS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f37101a[PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f37101a[PurchaseType.TYPE_ULTRA_PREMIUM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public IntlPrivilegeCard(@NonNull Context context) {
        super(context);
        this.f37100f = false;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ j760 m56317d(Counter counter, User user) {
        return new j760(counter, user);
    }

    private String getSubtypeByPurchaseType() {
        PurchaseType purchaseType = this.f37099e;
        if (purchaseType == null) {
            return "";
        }
        int i = C8947a.f37101a[purchaseType.ordinal()];
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
    public final void m56320A() {
        PutongFrag putongFrag = this.f37098d;
        if (putongFrag == null || putongFrag.act() == null) {
            return;
        }
        int i = C8947a.f37101a[this.f37099e.ordinal()];
        if (i == 1) {
            C8764c.m53406K1(this.f37098d.act(), "p_privileges_view,e_ttc_renew_membership_click,click", null, null, null);
            return;
        }
        if (i == 2) {
            C8764c.m53376A1(this.f37098d.act(), "p_privileges_view,e_ttc_renew_membership_click,click");
        } else if (i == 3) {
            C8764c.m53504x0(this.f37098d.act(), "p_privileges_view,e_ttc_renew_membership_click,click", null);
        } else {
            if (i != 4) {
                return;
            }
            C8764c.m53405K0(this.f37098d.act(), "p_privileges_view,e_ttc_renew_membership_click,click", null, null, null);
        }
    }

    /* JADX INFO: renamed from: B */
    public final void m56321B(String str, String str2, int i) {
        Drawable drawable;
        if (this.f37096b == null) {
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
                drawable.setBounds(0, 0, t100.m186890d(5.0f), t100.m186890d(8.0f));
                ImageSpan imageSpan = new ImageSpan(drawable, 1);
                spannableStringBuilder.append((CharSequence) MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
                spannableStringBuilder.setSpan(imageSpan, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
            }
        }
        this.f37096b.setText(spannableStringBuilder);
    }

    /* JADX INFO: renamed from: g */
    public final void m56322g(View view) {
        cxo.m109102a(this, view);
    }

    public PurchaseType getPurchaseType() {
        return this.f37099e;
    }

    /* JADX INFO: renamed from: h */
    public final void m56323h() {
        PutongFrag putongFrag = this.f37098d;
        if (putongFrag == null || putongFrag.act() == null || IntlCountryCodeController.m28115k()) {
            return;
        }
        if (!m56327l()) {
            String strM164886b = okp.m164886b(this.f37098d.act(), this.f37099e);
            String string = (ugc0.m193544k(this.f37099e) || ugc0.m193543j(this.f37099e)) ? this.f37098d.act().getString(R$string.f19091yc) : "";
            m56321B(strM164886b, string, m56324i(this.f37099e, (string == null || string.isEmpty()) ? false : true));
            return;
        }
        boolean zM193543j = ugc0.m193543j(this.f37099e);
        boolean zM193544k = ugc0.m193544k(this.f37099e);
        if (!zM193543j || zM193544k) {
            m56321B(this.f37098d.act().getString(R$string.f17699Ec), "", 0);
            return;
        }
        String strM164886b2 = okp.m164886b(this.f37098d.act(), this.f37099e);
        String string2 = this.f37098d.act().getString(R$string.f19061xc);
        m56321B(strM164886b2, string2, m56324i(this.f37099e, (string2 == null || string2.isEmpty()) ? false : true));
    }

    /* JADX INFO: renamed from: i */
    public final int m56324i(PurchaseType purchaseType, boolean z) {
        if (!z || purchaseType == null) {
            return 0;
        }
        int i = C8947a.f37101a[purchaseType.ordinal()];
        if (i == 1) {
            return x2c0.f189387Ha;
        }
        if (i == 2) {
            return x2c0.f189324Fa;
        }
        if (i == 3) {
            return x2c0.f189292Ea;
        }
        if (i != 4) {
            return 0;
        }
        return x2c0.f189356Ga;
    }

    /* JADX INFO: renamed from: j */
    public final void m56325j() {
        PutongFrag putongFrag = this.f37098d;
        if (putongFrag == null || putongFrag.act() == null || this.f37096b == null || IntlCountryCodeController.m28115k()) {
            return;
        }
        boolean zM193544k = ugc0.m193544k(this.f37099e);
        if (ugc0.m193543j(this.f37099e) && !zM193544k) {
            String subtypeByPurchaseType = getSubtypeByPurchaseType();
            if (m56327l()) {
                m56340y("active_non_renewal", subtypeByPurchaseType);
            } else {
                m56340y("expired", subtypeByPurchaseType);
            }
            y8p.m213414e(this.f37098d.act());
            return;
        }
        if (!zM193544k) {
            if (m56327l()) {
                m56339x(Active.TYPE);
                return;
            }
            return;
        }
        String strM193541h = ugc0.m193541h(getPurchaseType());
        if (m56327l()) {
            m56340y(Active.TYPE, strM193541h);
        } else {
            m56340y("expired", strM193541h);
        }
        if (m56327l()) {
            return;
        }
        if (u59.m191817Z()) {
            m56320A();
            return;
        }
        PutongFrag putongFrag2 = this.f37098d;
        if (putongFrag2 instanceof IntlVipNewUiFrag) {
            ((IntlVipNewUiFrag) putongFrag2).m56356V4();
        }
    }

    /* JADX INFO: renamed from: k */
    public void m56326k(ndp ndpVar, PutongFrag putongFrag, PurchaseType purchaseType, int i) {
        this.f37097c = ndpVar;
        this.f37098d = putongFrag;
        this.f37099e = purchaseType;
        this.f37100f = false;
        if (IntlCountryCodeController.m28115k()) {
            return;
        }
        m56341z();
    }

    /* JADX INFO: renamed from: l */
    public final boolean m56327l() {
        boolean zM210087m4;
        PurchaseType purchaseType = this.f37099e;
        if (purchaseType == null) {
            return false;
        }
        int i = C8947a.f37101a[purchaseType.ordinal()];
        if (i == 1) {
            zM210087m4 = xma.m210087m4();
        } else if (i == 2) {
            zM210087m4 = xma.m210077h4();
        } else if (i != 3) {
            zM210087m4 = i != 4 ? xma.m210063a4(this.f37099e) : xma.m210081j4();
        } else {
            zM210087m4 = xma.m210071e4();
        }
        return !zM210087m4;
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m56328m(UserPrivilege userPrivilege) {
        xdl0.m208344M(this.f37095a, (u59.m191812U() && CoreModule.f17545c.f19639e0.m169520na().isUltraPremium()) ? false : true);
        if (IntlCountryCodeController.m28115k()) {
            this.f37096b.setText(qgl0.m174441d(userPrivilege));
        } else {
            m56323h();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m56329n(j760 j760Var) {
        xdl0.m208344M(this.f37095a, (u59.m191810S() && ((User) j760Var.f116565b).isSVIP()) ? false : true);
        if (IntlCountryCodeController.m28115k()) {
            this.f37096b.setText(qgl0.m174439b(this.f37098d.act()));
        } else {
            m56323h();
        }
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m56330o(UserPrivilege userPrivilege) {
        if (IntlCountryCodeController.m28115k()) {
            this.f37096b.setText(qgl0.m174441d(userPrivilege));
        } else {
            m56323h();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m56322g(this);
        if (IntlCountryCodeController.m28115k()) {
            return;
        }
        setClickable(true);
        setFocusable(true);
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m56331p(User user) {
        xdl0.m208344M(this.f37095a, (u59.m191810S() && user.isSVIP()) ? false : true);
        if (IntlCountryCodeController.m28115k()) {
            this.f37096b.setText(qgl0.m174440c(this.f37098d.act()));
        } else {
            m56323h();
        }
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m56332q(View view) {
        m56325j();
    }

    /* JADX INFO: renamed from: r */
    public void m56333r() {
        m56323h();
    }

    /* JADX INFO: renamed from: s */
    public void m56334s() {
        int i = C8947a.f37101a[this.f37099e.ordinal()];
        if (i == 1) {
            m56338w();
            return;
        }
        if (i == 2) {
            m56336u();
        } else if (i == 3) {
            m56335t();
        } else {
            if (i != 4) {
                return;
            }
            m56337v();
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m56335t() {
        this.f37096b.setTextColor(Color.parseColor("#A38F5F"));
        setBackground(getResources().getDrawable(x2c0.f190389na));
        if (this.f37100f) {
            return;
        }
        this.f37100f = true;
        this.f37097c.m115452n(this.f37098d, CoreModule.f17545c.f19555C0.m210111u3(SummarizedPrivilegesId.get("svip"))).distinctUntilChanged().subscribe(mkd0.m154955G(new e30() { // from class: l.ywo
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f200517a.m56328m((UserPrivilege) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: u */
    public final void m56336u() {
        this.f37096b.setTextColor(Color.parseColor("#BA5E12"));
        setBackground(getResources().getDrawable(x2c0.f190517ra));
        if (this.f37100f) {
            return;
        }
        this.f37100f = true;
        this.f37097c.m115452n(this.f37098d, mkd0.m154984r(CoreModule.f17545c.m31483n3().distinctUntilChanged(), CoreModule.f17545c.f19639e0.m169523o9().distinctUntilChanged(), new x9j() { // from class: l.uwo
            @Override // p149l.x9j
            public final Object call(Object obj, Object obj2) {
                return IntlPrivilegeCard.m56317d((Counter) obj, (User) obj2);
            }
        })).subscribe(mkd0.m154955G(new e30() { // from class: l.wwo
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f188395a.m56329n((j760) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: v */
    public final void m56337v() {
        this.f37096b.setTextColor(Color.parseColor("#66FFFFFF"));
        setBackground(getResources().getDrawable(x2c0.f190549sa));
        if (this.f37100f) {
            return;
        }
        this.f37100f = true;
        this.f37097c.m115452n(this.f37098d, CoreModule.f17545c.f19555C0.m210111u3(SummarizedPrivilegesId.get(SummarizedPrivilegesId.ultraPremium))).distinctUntilChanged().subscribe(mkd0.m154955G(new e30() { // from class: l.swo
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f166706a.m56330o((UserPrivilege) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: w */
    public final void m56338w() {
        this.f37096b.setTextColor(Color.parseColor("#C58130"));
        setBackground(getResources().getDrawable(x2c0.f190581ta));
        if (this.f37100f) {
            return;
        }
        this.f37100f = true;
        this.f37097c.m115452n(this.f37098d, CoreModule.f17545c.f19639e0.m169523o9()).distinctUntilChanged(new owo()).subscribe(mkd0.m154955G(new e30() { // from class: l.qwo
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f156745a.m56331p((User) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: x */
    public final void m56339x(String str) {
        m56340y(str, getSubtypeByPurchaseType());
    }

    /* JADX INFO: renamed from: y */
    public final void m56340y(String str, String str2) {
        PutongFrag putongFrag = this.f37098d;
        if (putongFrag == null || putongFrag.act() == null) {
            return;
        }
        zvf0.m220399u("e_ttc_renew_membership_click", this.f37098d.pageId(), j760.m140076a("subtype", str2), j760.m140076a("subscription_status", str));
    }

    /* JADX INFO: renamed from: z */
    public final void m56341z() {
        if (this.f37098d == null || this.f37097c == null) {
            return;
        }
        xdl0.m208329E0(this, new View.OnClickListener() { // from class: l.axo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f72196a.m56332q(view);
            }
        });
    }

    public IntlPrivilegeCard(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f37100f = false;
    }

    public IntlPrivilegeCard(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f37100f = false;
    }
}
