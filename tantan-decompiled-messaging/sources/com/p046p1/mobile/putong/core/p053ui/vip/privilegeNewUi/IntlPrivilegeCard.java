package com.p046p1.mobile.putong.core.p053ui.vip.privilegeNewUi;

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
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p046p1.mobile.putong.app.PutongFrag;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.data.Active;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p046p1.mobile.putong.core.data.UserPrivilege;
import com.p046p1.mobile.putong.core.p053ui.vip.privilegeNewUi.IntlPrivilegeCard;
import com.p046p1.mobile.putong.data.Counter;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;
import p149l.dxo;
import p149l.e30;
import p149l.j760;
import p149l.mkd0;
import p149l.odp;
import p149l.okp;
import p149l.owo;
import p149l.qgl0;
import p149l.qib0;
import p149l.t100;
import p149l.u59;
import p149l.ugc0;
import p149l.w9j;
import p149l.x2c0;
import p149l.x9j;
import p149l.xdl0;
import p149l.xma;
import p149l.y8p;
import p149l.zvf0;

/* JADX INFO: loaded from: classes9.dex */
public class IntlPrivilegeCard extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public LinearLayout f37847a;

    /* JADX INFO: renamed from: b */
    public VImage f37848b;

    /* JADX INFO: renamed from: c */
    public TextView f37849c;

    /* JADX INFO: renamed from: d */
    public VLinear f37850d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f37851e;

    /* JADX INFO: renamed from: f */
    public VText f37852f;

    /* JADX INFO: renamed from: g */
    public odp f37853g;

    /* JADX INFO: renamed from: h */
    public PutongFrag f37854h;

    /* JADX INFO: renamed from: i */
    public PurchaseType f37855i;

    /* JADX INFO: renamed from: j */
    public String f37856j;

    /* JADX INFO: renamed from: k */
    public String f37857k;

    /* JADX INFO: renamed from: l */
    public int f37858l;

    /* JADX INFO: renamed from: m */
    public boolean f37859m;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.privilegeNewUi.IntlPrivilegeCard$a */
    public static /* synthetic */ class C9015a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f37860a;

        static {
            int[] iArr = new int[PurchaseType.values().length];
            f37860a = iArr;
            try {
                iArr[PurchaseType.TYPE_GET_VIP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f37860a[PurchaseType.TYPE_GET_LIKERS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f37860a[PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f37860a[PurchaseType.TYPE_ULTRA_PREMIUM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public IntlPrivilegeCard(@NonNull Context context) {
        super(context);
        this.f37856j = null;
        this.f37857k = null;
        this.f37858l = 0;
        this.f37859m = false;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ Pair m57461d(Counter counter, User user) {
        return new Pair(counter, user);
    }

    private String getSubtypeByPurchaseType() {
        PurchaseType purchaseType = this.f37855i;
        if (purchaseType == null) {
            return "";
        }
        int i = C9015a.f37860a[purchaseType.ordinal()];
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
    public final void m57466A() {
        xdl0.m208344M(this.f37849c, false);
        xdl0.m208344M(this.f37848b, true);
        this.f37848b.setImageDrawable(getResources().getDrawable(x2c0.f189761Tc));
        setBackground(getResources().getDrawable(x2c0.f189544Mc));
        m57485w();
        if (this.f37859m) {
            return;
        }
        this.f37859m = true;
        this.f37853g.m115452n(this.f37854h, CoreModule.f17545c.f19639e0.m169523o9()).distinctUntilChanged(new owo()).subscribe(mkd0.m154955G(new e30() { // from class: l.vwo
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f183360a.m57481s((User) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: B */
    public final void m57467B(String str) {
        m57468C(str, getSubtypeByPurchaseType());
    }

    /* JADX INFO: renamed from: C */
    public final void m57468C(String str, String str2) {
        PutongFrag putongFrag = this.f37854h;
        if (putongFrag == null || putongFrag.act() == null) {
            return;
        }
        zvf0.m220399u("e_ttc_renew_membership_click", this.f37854h.pageId(), j760.m140076a("subtype", str2), j760.m140076a("subscription_status", str));
    }

    /* JADX INFO: renamed from: D */
    public final void m57469D() {
        if (this.f37854h == null || this.f37853g == null) {
            return;
        }
        xdl0.m208329E0(this, new View.OnClickListener() { // from class: l.bxo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f77817a.m57482t(view);
            }
        });
    }

    /* JADX INFO: renamed from: E */
    public final void m57470E(String str, String str2, int i) {
        Drawable drawable;
        if (this.f37852f == null) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (str != null && !str.isEmpty()) {
            spannableStringBuilder.append((CharSequence) str);
        }
        if (i != 0 && (drawable = getResources().getDrawable(i)) != null) {
            int iM186890d = t100.m186890d(12.0f);
            drawable.setBounds(0, 0, iM186890d, iM186890d);
            ImageSpan imageSpan = new ImageSpan(drawable, 1);
            spannableStringBuilder.append((CharSequence) MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
            spannableStringBuilder.setSpan(imageSpan, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        }
        this.f37852f.setText(spannableStringBuilder);
    }

    public PurchaseType getPurchaseType() {
        return this.f37855i;
    }

    /* JADX INFO: renamed from: i */
    public final void m57471i(View view) {
        dxo.m114016a(this, view);
    }

    /* JADX INFO: renamed from: j */
    public final void m57472j() {
        PutongFrag putongFrag = this.f37854h;
        if (putongFrag == null || putongFrag.act() == null || IntlCountryCodeController.m28115k()) {
            return;
        }
        if (!m57476n()) {
            String strM164886b = okp.m164886b(this.f37854h.act(), this.f37855i);
            String string = (ugc0.m193544k(this.f37855i) || ugc0.m193543j(this.f37855i)) ? this.f37854h.act().getString(R$string.f19091yc) : "";
            m57470E(strM164886b, string, m57473k(this.f37855i, (string == null || string.isEmpty()) ? false : true));
            return;
        }
        boolean zM193543j = ugc0.m193543j(this.f37855i);
        boolean zM193544k = ugc0.m193544k(this.f37855i);
        if (!zM193543j || zM193544k) {
            m57470E(this.f37854h.act().getString(R$string.f17699Ec), "", 0);
            return;
        }
        String strM164886b2 = okp.m164886b(this.f37854h.act(), this.f37855i);
        String string2 = this.f37854h.act().getString(R$string.f19061xc);
        m57470E(strM164886b2, string2, m57473k(this.f37855i, (string2 == null || string2.isEmpty()) ? false : true));
    }

    /* JADX INFO: renamed from: k */
    public final int m57473k(PurchaseType purchaseType, boolean z) {
        if (!z || purchaseType == null) {
            return 0;
        }
        int i = C9015a.f37860a[purchaseType.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return x2c0.f189260Da;
        }
        if (i != 4) {
            return 0;
        }
        return x2c0.f189418Ia;
    }

    /* JADX INFO: renamed from: l */
    public final void m57474l() {
        PutongFrag putongFrag = this.f37854h;
        if (putongFrag == null || putongFrag.act() == null || this.f37852f == null || IntlCountryCodeController.m28115k()) {
            return;
        }
        boolean zM193544k = ugc0.m193544k(this.f37855i);
        if (ugc0.m193543j(this.f37855i) && !zM193544k) {
            String subtypeByPurchaseType = getSubtypeByPurchaseType();
            if (m57476n()) {
                m57468C("active_non_renewal", subtypeByPurchaseType);
            } else {
                m57468C("expired", subtypeByPurchaseType);
            }
            y8p.m213414e(this.f37854h.act());
            return;
        }
        if (zM193544k) {
            String strM193541h = ugc0.m193541h(getPurchaseType());
            if (m57476n()) {
                m57468C(Active.TYPE, strM193541h);
            } else {
                m57468C("expired", strM193541h);
                PutongFrag putongFrag2 = this.f37854h;
                if (putongFrag2 instanceof VipNewUiFrag) {
                    ((VipNewUiFrag) putongFrag2).m57501T4();
                }
            }
        }
        if (m57476n()) {
            m57467B(Active.TYPE);
        }
    }

    /* JADX INFO: renamed from: m */
    public void m57475m(odp odpVar, PutongFrag putongFrag, PurchaseType purchaseType, int i) {
        this.f37853g = odpVar;
        this.f37854h = putongFrag;
        this.f37855i = purchaseType;
        this.f37859m = false;
        this.f37856j = null;
        this.f37857k = null;
        this.f37858l = 0;
        if (IntlCountryCodeController.m28115k()) {
            return;
        }
        m57469D();
    }

    /* JADX INFO: renamed from: n */
    public final boolean m57476n() {
        boolean zM210087m4;
        PurchaseType purchaseType = this.f37855i;
        if (purchaseType == null) {
            return false;
        }
        int i = C9015a.f37860a[purchaseType.ordinal()];
        if (i == 1) {
            zM210087m4 = xma.m210087m4();
        } else if (i == 2) {
            zM210087m4 = xma.m210077h4();
        } else if (i != 3) {
            zM210087m4 = i != 4 ? xma.m210063a4(this.f37855i) : xma.m210081j4();
        } else {
            zM210087m4 = xma.m210071e4();
        }
        return !zM210087m4;
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m57477o(Picture.ImageUri imageUri) {
        qib0.f154691G.m102341Q0(this.f37851e, imageUri);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m57471i(this);
        this.f37859m = false;
        this.f37856j = null;
        this.f37857k = null;
        this.f37858l = 0;
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m57478p(UserPrivilege userPrivilege) {
        xdl0.m208344M(this.f37850d, (u59.m191812U() && CoreModule.f17545c.f19639e0.m169520na().isUltraPremium()) ? false : true);
        if (IntlCountryCodeController.m28115k()) {
            this.f37852f.setText(qgl0.m174441d(userPrivilege));
        } else {
            m57472j();
        }
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m57479q(Pair pair) {
        xdl0.m208344M(this.f37850d, (u59.m191810S() && ((User) pair.second).isSVIP()) ? false : true);
        if (IntlCountryCodeController.m28115k()) {
            this.f37852f.setText(qgl0.m174439b(this.f37854h.act()));
        } else {
            m57472j();
        }
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m57480r(UserPrivilege userPrivilege) {
        if (IntlCountryCodeController.m28115k()) {
            this.f37852f.setText(qgl0.m174441d(userPrivilege));
        } else {
            m57472j();
        }
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m57481s(User user) {
        xdl0.m208344M(this.f37850d, (u59.m191810S() && user.isSVIP()) ? false : true);
        if (IntlCountryCodeController.m28115k()) {
            this.f37852f.setText(qgl0.m174440c(this.f37854h.act()));
        } else {
            m57472j();
        }
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m57482t(View view) {
        m57474l();
    }

    /* JADX INFO: renamed from: u */
    public void m57483u() {
        m57472j();
    }

    /* JADX INFO: renamed from: v */
    public void m57484v() {
        int i = C9015a.f37860a[this.f37855i.ordinal()];
        if (i == 1) {
            m57466A();
            return;
        }
        if (i == 2) {
            m57487y();
        } else if (i == 3) {
            m57486x();
        } else {
            if (i != 4) {
                return;
            }
            m57488z();
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m57485w() {
        this.f37853g.m115452n(this.f37854h, CoreModule.f17545c.f19639e0.m169523o9().map(new w9j() { // from class: l.xwo
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((User) obj).m60124fp().profileSmall();
            }
        })).subscribe(mkd0.m154955G(new e30() { // from class: l.zwo
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f205247a.m57477o((Picture.ImageUri) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: x */
    public final void m57486x() {
        xdl0.m208344M(this.f37848b, true);
        xdl0.m208360X(this.f37848b, t100.f167255d);
        xdl0.m208359W(this.f37848b, t100.f167260i);
        xdl0.m208358V(this.f37847a, t100.m186890d(17.0f));
        this.f37848b.setImageDrawable(getResources().getDrawable(x2c0.f189821Va));
        this.f37849c.setText(R$string.f17973Ng);
        setBackground(getResources().getDrawable(x2c0.f190356m9));
        m57485w();
        if (this.f37859m) {
            return;
        }
        this.f37859m = true;
        this.f37853g.m115452n(this.f37854h, CoreModule.f17545c.f19555C0.m210111u3(SummarizedPrivilegesId.get("svip"))).distinctUntilChanged().subscribe(mkd0.m154955G(new e30() { // from class: l.pwo
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f151586a.m57478p((UserPrivilege) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: y */
    public final void m57487y() {
        setBackground(getResources().getDrawable(x2c0.f189636Pb));
        boolean zM173359g3 = CoreModule.f17545c.f19672p0.m173359g3();
        TextView textView = this.f37849c;
        if (zM173359g3) {
            textView.setText(R$string.f19001vc);
        } else {
            textView.setText(R$string.f18862qn);
        }
        m57485w();
        if (this.f37859m) {
            return;
        }
        this.f37859m = true;
        this.f37853g.m115452n(this.f37854h, mkd0.m154984r(CoreModule.f17545c.m31483n3().distinctUntilChanged(), CoreModule.f17545c.f19639e0.m169523o9().distinctUntilChanged(), new x9j() { // from class: l.rwo
            @Override // p149l.x9j
            public final Object call(Object obj, Object obj2) {
                return IntlPrivilegeCard.m57461d((Counter) obj, (User) obj2);
            }
        })).subscribe(mkd0.m154955G(new e30() { // from class: l.two
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f172415a.m57479q((Pair) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: z */
    public final void m57488z() {
        xdl0.m208344M(this.f37848b, true);
        xdl0.m208360X(this.f37848b, t100.f167255d);
        xdl0.m208359W(this.f37848b, t100.f167260i);
        xdl0.m208358V(this.f37847a, t100.m186890d(17.0f));
        this.f37848b.setImageDrawable(getResources().getDrawable(x2c0.f190232ib));
        this.f37849c.setText(R$string.f18032Pf);
        this.f37849c.setTextColor(Color.parseColor("#FFDEF4"));
        this.f37852f.setTextColor(Color.parseColor("#80FFFFFF"));
        setBackground(getResources().getDrawable(x2c0.f189513Lc));
        m57485w();
        if (this.f37859m) {
            return;
        }
        this.f37859m = true;
        this.f37853g.m115452n(this.f37854h, CoreModule.f17545c.f19555C0.m210111u3(SummarizedPrivilegesId.get(SummarizedPrivilegesId.ultraPremium))).distinctUntilChanged().subscribe(mkd0.m154955G(new e30() { // from class: l.nwo
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f140958a.m57480r((UserPrivilege) obj);
            }
        }));
    }

    public IntlPrivilegeCard(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f37856j = null;
        this.f37857k = null;
        this.f37858l = 0;
        this.f37859m = false;
    }

    public IntlPrivilegeCard(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f37856j = null;
        this.f37857k = null;
        this.f37858l = 0;
        this.f37859m = false;
    }
}
