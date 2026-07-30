package com.p000p1.mobile.putong.core.p004ui.vip.privilegeNewUi;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.app.PutongFrag;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.R$string;
import com.p000p1.mobile.putong.core.p004ui.vip.privilegeNewUi.IntlPrivilegeCard;
import com.p000p1.mobile.putong.p001ab.IntlCountryCodeController;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p1.mobile.putong.core.data.UserPrivilege;
import com.p1.mobile.putong.data.Counter;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.User;
import l.dxo;
import l.e30;
import l.j760;
import l.mkd0;
import l.t100;
import l.w9j;
import l.x9j;
import l.xdl0;
import l.y8p;
import l.zvf0;
import p006l.odp;
import p006l.okp;
import p006l.owo;
import p006l.qgl0;
import p006l.qib0;
import p006l.u59;
import p006l.ugc0;
import p006l.x2c0;
import p006l.xma;
import v.VDraweeView;
import v.VImage;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class IntlPrivilegeCard extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public LinearLayout f7628a;

    /* JADX INFO: renamed from: b */
    public VImage f7629b;

    /* JADX INFO: renamed from: c */
    public TextView f7630c;

    /* JADX INFO: renamed from: d */
    public VLinear f7631d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f7632e;

    /* JADX INFO: renamed from: f */
    public VText f7633f;

    /* JADX INFO: renamed from: g */
    public odp f7634g;

    /* JADX INFO: renamed from: h */
    public PutongFrag f7635h;

    /* JADX INFO: renamed from: i */
    public PurchaseType f7636i;

    /* JADX INFO: renamed from: j */
    public String f7637j;

    /* JADX INFO: renamed from: k */
    public String f7638k;

    /* JADX INFO: renamed from: l */
    public int f7639l;

    /* JADX INFO: renamed from: m */
    public boolean f7640m;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.privilegeNewUi.IntlPrivilegeCard$a */
    public static /* synthetic */ class C0451a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f7641a;

        static {
            int[] iArr = new int[PurchaseType.values().length];
            f7641a = iArr;
            try {
                iArr[PurchaseType.TYPE_GET_VIP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7641a[PurchaseType.TYPE_GET_LIKERS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7641a[PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f7641a[PurchaseType.TYPE_ULTRA_PREMIUM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public IntlPrivilegeCard(@NonNull Context context) {
        super(context);
        this.f7637j = null;
        this.f7638k = null;
        this.f7639l = 0;
        this.f7640m = false;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ Pair m10949d(Counter counter, User user) {
        return new Pair(counter, user);
    }

    private String getSubtypeByPurchaseType() {
        PurchaseType purchaseType = this.f7636i;
        if (purchaseType == null) {
            return "";
        }
        int i = C0451a.f7641a[purchaseType.ordinal()];
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
    public final void m10954A() {
        xdl0.M(this.f7630c, false);
        xdl0.M(this.f7629b, true);
        this.f7629b.setImageDrawable(getResources().getDrawable(x2c0.f26297Tc));
        setBackground(getResources().getDrawable(x2c0.f26080Mc));
        m10973w();
        if (this.f7640m) {
            return;
        }
        this.f7640m = true;
        this.f7634g.n(this.f7635h, CoreModule.f1534c.f3628e0.m21486o9()).distinctUntilChanged(new owo()).subscribe(mkd0.G(new e30() { // from class: l.vwo
            public final void call(Object obj) {
                this.f24509a.m10969s((User) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: B */
    public final void m10955B(String str) {
        m10956C(str, getSubtypeByPurchaseType());
    }

    /* JADX INFO: renamed from: C */
    public final void m10956C(String str, String str2) {
        PutongFrag putongFrag = this.f7635h;
        if (putongFrag == null || putongFrag.act() == null) {
            return;
        }
        zvf0.u("e_ttc_renew_membership_click", this.f7635h.pageId(), new j760[]{j760.a("subtype", str2), j760.a("subscription_status", str)});
    }

    /* JADX INFO: renamed from: D */
    public final void m10957D() {
        if (this.f7635h == null || this.f7634g == null) {
            return;
        }
        xdl0.E0(this, new View.OnClickListener() { // from class: l.bxo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9206a.m10970t(view);
            }
        });
    }

    /* JADX INFO: renamed from: E */
    public final void m10958E(String str, String str2, int i) {
        Drawable drawable;
        if (this.f7633f == null) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (str != null && !str.isEmpty()) {
            spannableStringBuilder.append((CharSequence) str);
        }
        if (i != 0 && (drawable = getResources().getDrawable(i)) != null) {
            int iD = t100.d(12.0f);
            drawable.setBounds(0, 0, iD, iD);
            ImageSpan imageSpan = new ImageSpan(drawable, 1);
            spannableStringBuilder.append((CharSequence) " ");
            spannableStringBuilder.setSpan(imageSpan, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        }
        this.f7633f.setText(spannableStringBuilder);
    }

    public PurchaseType getPurchaseType() {
        return this.f7636i;
    }

    /* JADX INFO: renamed from: i */
    public final void m10959i(View view) {
        dxo.a(this, view);
    }

    /* JADX INFO: renamed from: j */
    public final void m10960j() {
        PutongFrag putongFrag = this.f7635h;
        if (putongFrag == null || putongFrag.act() == null || IntlCountryCodeController.m10k()) {
            return;
        }
        if (!m10964n()) {
            String strM20690b = okp.m20690b(this.f7635h.act(), this.f7636i);
            String string = (ugc0.m25215k(this.f7636i) || ugc0.m25214j(this.f7636i)) ? this.f7635h.act().getString(R$string.f3080yc) : "";
            m10958E(strM20690b, string, m10961k(this.f7636i, (string == null || string.isEmpty()) ? false : true));
            return;
        }
        boolean zM25214j = ugc0.m25214j(this.f7636i);
        boolean zM25215k = ugc0.m25215k(this.f7636i);
        if (!zM25214j || zM25215k) {
            m10958E(this.f7635h.act().getString(R$string.f1688Ec), "", 0);
            return;
        }
        String strM20690b2 = okp.m20690b(this.f7635h.act(), this.f7636i);
        String string2 = this.f7635h.act().getString(R$string.f3050xc);
        m10958E(strM20690b2, string2, m10961k(this.f7636i, (string2 == null || string2.isEmpty()) ? false : true));
    }

    /* JADX INFO: renamed from: k */
    public final int m10961k(PurchaseType purchaseType, boolean z) {
        if (!z || purchaseType == null) {
            return 0;
        }
        int i = C0451a.f7641a[purchaseType.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return x2c0.f25796Da;
        }
        if (i != 4) {
            return 0;
        }
        return x2c0.f25954Ia;
    }

    /* JADX INFO: renamed from: l */
    public final void m10962l() {
        PutongFrag putongFrag = this.f7635h;
        if (putongFrag == null || putongFrag.act() == null || this.f7633f == null || IntlCountryCodeController.m10k()) {
            return;
        }
        boolean zM25215k = ugc0.m25215k(this.f7636i);
        if (ugc0.m25214j(this.f7636i) && !zM25215k) {
            String subtypeByPurchaseType = getSubtypeByPurchaseType();
            if (m10964n()) {
                m10956C("active_non_renewal", subtypeByPurchaseType);
            } else {
                m10956C("expired", subtypeByPurchaseType);
            }
            y8p.e(this.f7635h.act());
            return;
        }
        if (zM25215k) {
            String strM25212h = ugc0.m25212h(getPurchaseType());
            if (m10964n()) {
                m10956C("active", strM25212h);
            } else {
                m10956C("expired", strM25212h);
                PutongFrag putongFrag2 = this.f7635h;
                if (putongFrag2 instanceof VipNewUiFrag) {
                    ((VipNewUiFrag) putongFrag2).m10992T4();
                }
            }
        }
        if (m10964n()) {
            m10955B("active");
        }
    }

    /* JADX INFO: renamed from: m */
    public void m10963m(odp odpVar, PutongFrag putongFrag, PurchaseType purchaseType, int i) {
        this.f7634g = odpVar;
        this.f7635h = putongFrag;
        this.f7636i = purchaseType;
        this.f7640m = false;
        this.f7637j = null;
        this.f7638k = null;
        this.f7639l = 0;
        if (IntlCountryCodeController.m10k()) {
            return;
        }
        m10957D();
    }

    /* JADX INFO: renamed from: n */
    public final boolean m10964n() {
        boolean zM27395m4;
        PurchaseType purchaseType = this.f7636i;
        if (purchaseType == null) {
            return false;
        }
        int i = C0451a.f7641a[purchaseType.ordinal()];
        if (i == 1) {
            zM27395m4 = xma.m27395m4();
        } else if (i == 2) {
            zM27395m4 = xma.m27385h4();
        } else if (i != 3) {
            zM27395m4 = i != 4 ? xma.m27371a4(this.f7636i) : xma.m27389j4();
        } else {
            zM27395m4 = xma.m27379e4();
        }
        return !zM27395m4;
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m10965o(Picture.ImageUri imageUri) {
        qib0.f19782G.m12754Q0(this.f7632e, imageUri);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m10959i(this);
        this.f7640m = false;
        this.f7637j = null;
        this.f7638k = null;
        this.f7639l = 0;
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m10966p(UserPrivilege userPrivilege) {
        xdl0.M(this.f7631d, (u59.m24983U() && CoreModule.f1534c.f3628e0.m21483na().isUltraPremium()) ? false : true);
        if (IntlCountryCodeController.m10k()) {
            this.f7633f.setText(qgl0.m22046d(userPrivilege));
        } else {
            m10960j();
        }
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m10967q(Pair pair) {
        xdl0.M(this.f7631d, (u59.m24981S() && ((User) pair.second).isSVIP()) ? false : true);
        if (IntlCountryCodeController.m10k()) {
            this.f7633f.setText(qgl0.m22044b(this.f7635h.act()));
        } else {
            m10960j();
        }
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m10968r(UserPrivilege userPrivilege) {
        if (IntlCountryCodeController.m10k()) {
            this.f7633f.setText(qgl0.m22046d(userPrivilege));
        } else {
            m10960j();
        }
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m10969s(User user) {
        xdl0.M(this.f7631d, (u59.m24981S() && user.isSVIP()) ? false : true);
        if (IntlCountryCodeController.m10k()) {
            this.f7633f.setText(qgl0.m22045c(this.f7635h.act()));
        } else {
            m10960j();
        }
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m10970t(View view) {
        m10962l();
    }

    /* JADX INFO: renamed from: u */
    public void m10971u() {
        m10960j();
    }

    /* JADX INFO: renamed from: v */
    public void m10972v() {
        int i = C0451a.f7641a[this.f7636i.ordinal()];
        if (i == 1) {
            m10954A();
            return;
        }
        if (i == 2) {
            m10975y();
        } else if (i == 3) {
            m10974x();
        } else {
            if (i != 4) {
                return;
            }
            m10976z();
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m10973w() {
        this.f7634g.n(this.f7635h, CoreModule.f1534c.f3628e0.m21486o9().map(new w9j() { // from class: l.xwo
            public final Object call(Object obj) {
                return ((User) obj).fp().profileSmall();
            }
        })).subscribe(mkd0.G(new e30() { // from class: l.zwo
            public final void call(Object obj) {
                this.f29010a.m10965o((Picture.ImageUri) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: x */
    public final void m10974x() {
        xdl0.M(this.f7629b, true);
        xdl0.X(this.f7629b, t100.d);
        xdl0.W(this.f7629b, t100.i);
        xdl0.V(this.f7628a, t100.d(17.0f));
        this.f7629b.setImageDrawable(getResources().getDrawable(x2c0.f26357Va));
        this.f7630c.setText(R$string.f1962Ng);
        setBackground(getResources().getDrawable(x2c0.f26892m9));
        m10973w();
        if (this.f7640m) {
            return;
        }
        this.f7640m = true;
        this.f7634g.n(this.f7635h, CoreModule.f1534c.f3544C0.m27419u3(SummarizedPrivilegesId.get("svip"))).distinctUntilChanged().subscribe(mkd0.G(new e30() { // from class: l.pwo
            public final void call(Object obj) {
                this.f19400a.m10966p((UserPrivilege) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: y */
    public final void m10975y() {
        setBackground(getResources().getDrawable(x2c0.f26172Pb));
        boolean zM21963g3 = CoreModule.f1534c.f3661p0.m21963g3();
        TextView textView = this.f7630c;
        if (zM21963g3) {
            textView.setText(R$string.f2990vc);
        } else {
            textView.setText(R$string.f2851qn);
        }
        m10973w();
        if (this.f7640m) {
            return;
        }
        this.f7640m = true;
        this.f7634g.n(this.f7635h, mkd0.r(CoreModule.f1534c.m3413n3().distinctUntilChanged(), CoreModule.f1534c.f3628e0.m21486o9().distinctUntilChanged(), new x9j() { // from class: l.rwo
            public final Object call(Object obj, Object obj2) {
                return IntlPrivilegeCard.m10949d((Counter) obj, (User) obj2);
            }
        })).subscribe(mkd0.G(new e30() { // from class: l.two
            public final void call(Object obj) {
                this.f22313a.m10967q((Pair) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: z */
    public final void m10976z() {
        xdl0.M(this.f7629b, true);
        xdl0.X(this.f7629b, t100.d);
        xdl0.W(this.f7629b, t100.i);
        xdl0.V(this.f7628a, t100.d(17.0f));
        this.f7629b.setImageDrawable(getResources().getDrawable(x2c0.f26768ib));
        this.f7630c.setText(R$string.f2021Pf);
        this.f7630c.setTextColor(Color.parseColor("#FFDEF4"));
        this.f7633f.setTextColor(Color.parseColor("#80FFFFFF"));
        setBackground(getResources().getDrawable(x2c0.f26049Lc));
        m10973w();
        if (this.f7640m) {
            return;
        }
        this.f7640m = true;
        this.f7634g.n(this.f7635h, CoreModule.f1534c.f3544C0.m27419u3(SummarizedPrivilegesId.get("ultraPremium"))).distinctUntilChanged().subscribe(mkd0.G(new e30() { // from class: l.nwo
            public final void call(Object obj) {
                this.f17908a.m10968r((UserPrivilege) obj);
            }
        }));
    }

    public IntlPrivilegeCard(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7637j = null;
        this.f7638k = null;
        this.f7639l = 0;
        this.f7640m = false;
    }

    public IntlPrivilegeCard(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f7637j = null;
        this.f7638k = null;
        this.f7639l = 0;
        this.f7640m = false;
    }
}
