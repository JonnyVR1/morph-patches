package com.p051p1.mobile.putong.core.p058ui.vip.privilegeNewUi;

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
import com.p051p1.mobile.putong.app.PutongFrag;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.data.Active;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p051p1.mobile.putong.core.data.UserPrivilege;
import com.p051p1.mobile.putong.core.p058ui.vip.privilegeNewUi.IntlPrivilegeCard;
import com.p051p1.mobile.putong.data.Counter;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;
import p153l.bnl0;
import p153l.bpc0;
import p153l.d79;
import p153l.dbc0;
import p153l.dzo;
import p153l.i4g0;
import p153l.joa;
import p153l.ofp;
import p153l.omp;
import p153l.oyo;
import p153l.pf60;
import p153l.psd0;
import p153l.qa00;
import p153l.qcj;
import p153l.rcj;
import p153l.upl0;
import p153l.uqb0;
import p153l.y20;
import p153l.yap;

/* JADX INFO: loaded from: classes12.dex */
public class IntlPrivilegeCard extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public LinearLayout f38695a;

    /* JADX INFO: renamed from: b */
    public VImage f38696b;

    /* JADX INFO: renamed from: c */
    public TextView f38697c;

    /* JADX INFO: renamed from: d */
    public VLinear f38698d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f38699e;

    /* JADX INFO: renamed from: f */
    public VText f38700f;

    /* JADX INFO: renamed from: g */
    public ofp f38701g;

    /* JADX INFO: renamed from: h */
    public PutongFrag f38702h;

    /* JADX INFO: renamed from: i */
    public PurchaseType f38703i;

    /* JADX INFO: renamed from: j */
    public String f38704j;

    /* JADX INFO: renamed from: k */
    public String f38705k;

    /* JADX INFO: renamed from: l */
    public int f38706l;

    /* JADX INFO: renamed from: m */
    public boolean f38707m;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.privilegeNewUi.IntlPrivilegeCard$a */
    public static /* synthetic */ class C9178a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f38708a;

        static {
            int[] iArr = new int[PurchaseType.values().length];
            f38708a = iArr;
            try {
                iArr[PurchaseType.TYPE_GET_VIP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f38708a[PurchaseType.TYPE_GET_LIKERS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f38708a[PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f38708a[PurchaseType.TYPE_ULTRA_PREMIUM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public IntlPrivilegeCard(@NonNull Context context) {
        super(context);
        this.f38704j = null;
        this.f38705k = null;
        this.f38706l = 0;
        this.f38707m = false;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ Pair m58644d(Counter counter, User user) {
        return new Pair(counter, user);
    }

    private String getSubtypeByPurchaseType() {
        PurchaseType purchaseType = this.f38703i;
        if (purchaseType == null) {
            return "";
        }
        int i = C9178a.f38708a[purchaseType.ordinal()];
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
    public final void m58649A() {
        bnl0.m105524M(this.f38697c, false);
        bnl0.m105524M(this.f38696b, true);
        this.f38696b.setImageDrawable(getResources().getDrawable(dbc0.f86629Uc));
        setBackground(getResources().getDrawable(dbc0.f86405Nc));
        m58668w();
        if (this.f38707m) {
            return;
        }
        this.f38707m = true;
        this.f38701g.m153557n(this.f38702h, CoreModule.f18264c.f20381e0.m116596o9()).distinctUntilChanged(new oyo()).subscribe(psd0.m173596G(new y20() { // from class: l.vyo
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f186413a.m58664s((User) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: B */
    public final void m58650B(String str) {
        m58651C(str, getSubtypeByPurchaseType());
    }

    /* JADX INFO: renamed from: C */
    public final void m58651C(String str, String str2) {
        PutongFrag putongFrag = this.f38702h;
        if (putongFrag == null || putongFrag.act() == null) {
            return;
        }
        i4g0.m138523u("e_ttc_renew_membership_click", this.f38702h.pageId(), pf60.m172085a("subtype", str2), pf60.m172085a("subscription_status", str));
    }

    /* JADX INFO: renamed from: D */
    public final void m58652D() {
        if (this.f38702h == null || this.f38701g == null) {
            return;
        }
        bnl0.m105509E0(this, new View.OnClickListener() { // from class: l.bzo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f79169a.m58665t(view);
            }
        });
    }

    /* JADX INFO: renamed from: E */
    public final void m58653E(String str, String str2, int i) {
        Drawable drawable;
        if (this.f38700f == null) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (str != null && !str.isEmpty()) {
            spannableStringBuilder.append((CharSequence) str);
        }
        if (i != 0 && (drawable = getResources().getDrawable(i)) != null) {
            int iM175859d = qa00.m175859d(12.0f);
            drawable.setBounds(0, 0, iM175859d, iM175859d);
            ImageSpan imageSpan = new ImageSpan(drawable, 1);
            spannableStringBuilder.append((CharSequence) MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
            spannableStringBuilder.setSpan(imageSpan, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        }
        this.f38700f.setText(spannableStringBuilder);
    }

    public PurchaseType getPurchaseType() {
        return this.f38703i;
    }

    /* JADX INFO: renamed from: i */
    public final void m58654i(View view) {
        dzo.m118756a(this, view);
    }

    /* JADX INFO: renamed from: j */
    public final void m58655j() {
        PutongFrag putongFrag = this.f38702h;
        if (putongFrag == null || putongFrag.act() == null || IntlCountryCodeController.m29114k()) {
            return;
        }
        if (!m58659n()) {
            String strM168277b = omp.m168277b(this.f38702h.act(), this.f38703i);
            String string = (bpc0.m105799k(this.f38703i) || bpc0.m105798j(this.f38703i)) ? this.f38702h.act().getString(R$string.f18699Nc) : "";
            m58653E(strM168277b, string, m58656k(this.f38703i, (string == null || string.isEmpty()) ? false : true));
            return;
        }
        boolean zM105798j = bpc0.m105798j(this.f38703i);
        boolean zM105799k = bpc0.m105799k(this.f38703i);
        if (!zM105798j || zM105799k) {
            m58653E(this.f38702h.act().getString(R$string.f18879Tc), "", 0);
            return;
        }
        String strM168277b2 = omp.m168277b(this.f38702h.act(), this.f38703i);
        String string2 = this.f38702h.act().getString(R$string.f18669Mc);
        m58653E(strM168277b2, string2, m58656k(this.f38703i, (string2 == null || string2.isEmpty()) ? false : true));
    }

    /* JADX INFO: renamed from: k */
    public final int m58656k(PurchaseType purchaseType, boolean z) {
        if (!z || purchaseType == null) {
            return 0;
        }
        int i = C9178a.f38708a[purchaseType.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return dbc0.f86115Ea;
        }
        if (i != 4) {
            return 0;
        }
        return dbc0.f86275Ja;
    }

    /* JADX INFO: renamed from: l */
    public final void m58657l() {
        PutongFrag putongFrag = this.f38702h;
        if (putongFrag == null || putongFrag.act() == null || this.f38700f == null || IntlCountryCodeController.m29114k()) {
            return;
        }
        boolean zM105799k = bpc0.m105799k(this.f38703i);
        if (bpc0.m105798j(this.f38703i) && !zM105799k) {
            String subtypeByPurchaseType = getSubtypeByPurchaseType();
            if (m58659n()) {
                m58651C("active_non_renewal", subtypeByPurchaseType);
            } else {
                m58651C("expired", subtypeByPurchaseType);
            }
            yap.m214903e(this.f38702h.act());
            return;
        }
        if (zM105799k) {
            String strM105796h = bpc0.m105796h(getPurchaseType());
            if (m58659n()) {
                m58651C(Active.TYPE, strM105796h);
            } else {
                m58651C("expired", strM105796h);
                PutongFrag putongFrag2 = this.f38702h;
                if (putongFrag2 instanceof VipNewUiFrag) {
                    ((VipNewUiFrag) putongFrag2).m58684T4();
                }
            }
        }
        if (m58659n()) {
            m58650B(Active.TYPE);
        }
    }

    /* JADX INFO: renamed from: m */
    public void m58658m(ofp ofpVar, PutongFrag putongFrag, PurchaseType purchaseType, int i) {
        this.f38701g = ofpVar;
        this.f38702h = putongFrag;
        this.f38703i = purchaseType;
        this.f38707m = false;
        this.f38704j = null;
        this.f38705k = null;
        this.f38706l = 0;
        if (IntlCountryCodeController.m29114k()) {
            return;
        }
        m58652D();
    }

    /* JADX INFO: renamed from: n */
    public final boolean m58659n() {
        boolean zM146401n4;
        PurchaseType purchaseType = this.f38703i;
        if (purchaseType == null) {
            return false;
        }
        int i = C9178a.f38708a[purchaseType.ordinal()];
        if (i == 1) {
            zM146401n4 = joa.m146401n4();
        } else if (i == 2) {
            zM146401n4 = joa.m146392i4();
        } else if (i != 3) {
            zM146401n4 = i != 4 ? joa.m146378b4(this.f38703i) : joa.m146396k4();
        } else {
            zM146401n4 = joa.m146386f4();
        }
        return !zM146401n4;
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m58660o(Picture.ImageUri imageUri) {
        uqb0.f180374G.m127125Q0(this.f38699e, imageUri);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m58654i(this);
        this.f38707m = false;
        this.f38704j = null;
        this.f38705k = null;
        this.f38706l = 0;
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m58661p(UserPrivilege userPrivilege) {
        bnl0.m105524M(this.f38698d, (d79.m114663V() && CoreModule.f18264c.f20381e0.m116593na().isUltraPremium()) ? false : true);
        if (IntlCountryCodeController.m29114k()) {
            this.f38700f.setText(upl0.m197103d(userPrivilege));
        } else {
            m58655j();
        }
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m58662q(Pair pair) {
        bnl0.m105524M(this.f38698d, (d79.m114661T() && ((User) pair.second).isSVIP()) ? false : true);
        if (IntlCountryCodeController.m29114k()) {
            this.f38700f.setText(upl0.m197101b(this.f38702h.act()));
        } else {
            m58655j();
        }
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m58663r(UserPrivilege userPrivilege) {
        if (IntlCountryCodeController.m29114k()) {
            this.f38700f.setText(upl0.m197103d(userPrivilege));
        } else {
            m58655j();
        }
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m58664s(User user) {
        bnl0.m105524M(this.f38698d, (d79.m114661T() && user.isSVIP()) ? false : true);
        if (IntlCountryCodeController.m29114k()) {
            this.f38700f.setText(upl0.m197102c(this.f38702h.act()));
        } else {
            m58655j();
        }
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m58665t(View view) {
        m58657l();
    }

    /* JADX INFO: renamed from: u */
    public void m58666u() {
        m58655j();
    }

    /* JADX INFO: renamed from: v */
    public void m58667v() {
        int i = C9178a.f38708a[this.f38703i.ordinal()];
        if (i == 1) {
            m58649A();
            return;
        }
        if (i == 2) {
            m58670y();
        } else if (i == 3) {
            m58669x();
        } else {
            if (i != 4) {
                return;
            }
            m58671z();
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m58668w() {
        this.f38701g.m153557n(this.f38702h, CoreModule.f18264c.f20381e0.m116596o9().map(new qcj() { // from class: l.xyo
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((User) obj).m61308fp().profileSmall();
            }
        })).subscribe(psd0.m173596G(new y20() { // from class: l.zyo
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f206620a.m58660o((Picture.ImageUri) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: x */
    public final void m58669x() {
        bnl0.m105524M(this.f38696b, true);
        bnl0.m105540X(this.f38696b, qa00.f156317d);
        bnl0.m105539W(this.f38696b, qa00.f156322i);
        bnl0.m105538V(this.f38695a, qa00.m175859d(17.0f));
        this.f38696b.setImageDrawable(getResources().getDrawable(dbc0.f86691Wa));
        this.f38697c.setText(R$string.f19310hh);
        setBackground(getResources().getDrawable(dbc0.f87244n9));
        m58668w();
        if (this.f38707m) {
            return;
        }
        this.f38707m = true;
        this.f38701g.m153557n(this.f38702h, CoreModule.f18264c.f20297C0.m146424v3(SummarizedPrivilegesId.get("svip"))).distinctUntilChanged().subscribe(psd0.m173596G(new y20() { // from class: l.pyo
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f154675a.m58661p((UserPrivilege) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: y */
    public final void m58670y() {
        setBackground(getResources().getDrawable(dbc0.f86500Qb));
        boolean zM219062g3 = CoreModule.f18264c.f20414p0.m219062g3();
        TextView textView = this.f38697c;
        if (zM219062g3) {
            textView.setText(R$string.f18608Kc);
        } else {
            textView.setText(R$string.f18680Mn);
        }
        m58668w();
        if (this.f38707m) {
            return;
        }
        this.f38707m = true;
        this.f38701g.m153557n(this.f38702h, psd0.m173625r(CoreModule.f18264c.m32486n3().distinctUntilChanged(), CoreModule.f18264c.f20381e0.m116596o9().distinctUntilChanged(), new rcj() { // from class: l.ryo
            @Override // p153l.rcj
            public final Object call(Object obj, Object obj2) {
                return IntlPrivilegeCard.m58644d((Counter) obj, (User) obj2);
            }
        })).subscribe(psd0.m173596G(new y20() { // from class: l.tyo
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f176691a.m58662q((Pair) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: z */
    public final void m58671z() {
        bnl0.m105524M(this.f38696b, true);
        bnl0.m105540X(this.f38696b, qa00.f156317d);
        bnl0.m105539W(this.f38696b, qa00.f156322i);
        bnl0.m105538V(this.f38695a, qa00.m175859d(17.0f));
        this.f38696b.setImageDrawable(getResources().getDrawable(dbc0.f87114jb));
        this.f38697c.setText(R$string.f19309hg);
        this.f38697c.setTextColor(Color.parseColor("#FFDEF4"));
        this.f38700f.setTextColor(Color.parseColor("#80FFFFFF"));
        setBackground(getResources().getDrawable(dbc0.f86373Mc));
        m58668w();
        if (this.f38707m) {
            return;
        }
        this.f38707m = true;
        this.f38701g.m153557n(this.f38702h, CoreModule.f18264c.f20297C0.m146424v3(SummarizedPrivilegesId.get(SummarizedPrivilegesId.ultraPremium))).distinctUntilChanged().subscribe(psd0.m173596G(new y20() { // from class: l.nyo
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f144343a.m58663r((UserPrivilege) obj);
            }
        }));
    }

    public IntlPrivilegeCard(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f38704j = null;
        this.f38705k = null;
        this.f38706l = 0;
        this.f38707m = false;
    }

    public IntlPrivilegeCard(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f38704j = null;
        this.f38705k = null;
        this.f38706l = 0;
        this.f38707m = false;
    }
}
