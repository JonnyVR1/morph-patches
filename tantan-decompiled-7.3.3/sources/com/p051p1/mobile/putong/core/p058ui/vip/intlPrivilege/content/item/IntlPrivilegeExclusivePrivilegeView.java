package com.p051p1.mobile.putong.core.p058ui.vip.intlPrivilege.content.item;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.p058ui.vip.intlPrivilege.IntlVipNewUiFrag;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import p151v.VText;
import p153l.adc0;
import p153l.be90;
import p153l.bnl0;
import p153l.f0p;
import p153l.fzo;
import p153l.jr0;
import p153l.kec0;
import p153l.o190;
import p153l.qce;
import p153l.rgk;
import p153l.wib0;
import p153l.x6h0;
import p153l.xj90;
import p153l.zd90;

/* JADX INFO: loaded from: classes12.dex */
public class IntlPrivilegeExclusivePrivilegeView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public FrameLayout f38024a;

    /* JADX INFO: renamed from: b */
    public LinearLayout f38025b;

    /* JADX INFO: renamed from: c */
    public VText f38026c;

    /* JADX INFO: renamed from: d */
    public LinearLayout f38027d;

    /* JADX INFO: renamed from: e */
    public IntlPrivilegeDescListItem f38028e;

    /* JADX INFO: renamed from: f */
    public IntlPrivilegeDescListItem f38029f;

    /* JADX INFO: renamed from: g */
    public IntlPrivilegeDescListItem f38030g;

    /* JADX INFO: renamed from: h */
    public IntlPrivilegeDescListItem f38031h;

    /* JADX INFO: renamed from: i */
    public IntlPrivilegeDescListItem f38032i;

    /* JADX INFO: renamed from: j */
    public PurchaseType f38033j;

    /* JADX INFO: renamed from: k */
    public PurchaseType f38034k;

    /* JADX INFO: renamed from: l */
    public zd90 f38035l;

    /* JADX INFO: renamed from: m */
    public xj90 f38036m;

    /* JADX INFO: renamed from: n */
    public o190 f38037n;

    /* JADX INFO: renamed from: o */
    public x6h0 f38038o;

    public IntlPrivilegeExclusivePrivilegeView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: b */
    public final void m57685b(View view) {
        f0p.m123502a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public Act m57686c() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: d */
    public void m57687d(PurchaseType purchaseType, PurchaseType purchaseType2, Runnable runnable) {
        jr0.C18008a c18008a = new jr0.C18008a();
        c18008a.f122265a = this.f38029f;
        c18008a.f122266b = this.f38030g;
        c18008a.f122267c = this.f38031h;
        c18008a.f122268d = this.f38032i;
        jr0.m146645c(purchaseType, purchaseType2, c18008a, runnable);
    }

    /* JADX INFO: renamed from: e */
    public final IntlPrivilegeDescListItem.C9116b m57688e(Privilege privilege, PurchaseType purchaseType, boolean z) {
        if (this.f38036m == null) {
            m57689f();
        }
        IntlPrivilegeDescListItem.C9116b c9116bM128197a = fzo.m128197a(privilege, purchaseType, z);
        String strM211203g = this.f38036m.m211203g(privilege, purchaseType);
        int iM211202f = this.f38036m.m211202f(privilege, purchaseType);
        int iM211198b = this.f38036m.m211198b(privilege);
        if (strM211203g != null) {
            c9116bM128197a.f38008a = strM211203g;
        } else if (iM211202f != 0) {
            c9116bM128197a.f38008a = m57686c().getString(iM211202f);
        }
        if (iM211198b != 0) {
            c9116bM128197a.f38009b = m57686c().getString(iM211198b);
        }
        return c9116bM128197a;
    }

    /* JADX INFO: renamed from: f */
    public final void m57689f() {
        Act actM57686c = m57686c();
        if (actM57686c != null) {
            this.f38035l = new zd90(actM57686c);
            this.f38036m = new xj90(actM57686c);
            this.f38038o = new x6h0(getContext(), this.f38036m);
        }
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m57690g(be90 be90Var, PurchaseType purchaseType, View view) {
        boolean z = be90Var.f76352b;
        o190 o190Var = this.f38037n;
        if (z) {
            o190Var.m165585e(be90Var.f76351a, purchaseType);
        } else {
            o190Var.m165586f(be90Var.f76351a, purchaseType);
        }
    }

    /* JADX INFO: renamed from: h */
    public void m57691h(PurchaseType purchaseType, PurchaseType purchaseType2) {
        IntlPrivilegeDescListItem intlPrivilegeDescListItem;
        if (this.f38038o == null) {
            if (this.f38036m == null) {
                m57689f();
            }
            if (this.f38036m != null) {
                this.f38038o = new x6h0(getContext(), this.f38036m);
            }
        }
        x6h0 x6h0Var = this.f38038o;
        if (x6h0Var == null) {
            return;
        }
        if (x6h0Var.m209496g() == null && (intlPrivilegeDescListItem = this.f38028e) != null) {
            this.f38038o.m209492c(intlPrivilegeDescListItem, purchaseType2);
        }
        this.f38038o.m209499j(purchaseType, purchaseType2);
    }

    /* JADX INFO: renamed from: i */
    public void m57692i(PurchaseType purchaseType, IntlVipNewUiFrag intlVipNewUiFrag) {
        if (this.f38035l == null || this.f38036m == null) {
            m57689f();
        }
        if (this.f38037n == null && intlVipNewUiFrag != null) {
            this.f38037n = new o190(intlVipNewUiFrag);
        }
        m57699p(purchaseType);
        m57696m();
        m57694k(this.f38035l.m219284c(purchaseType, this.f38035l.m219285d(purchaseType)), purchaseType, intlVipNewUiFrag);
    }

    /* JADX INFO: renamed from: j */
    public final void m57693j(String str, List<be90> list, PurchaseType purchaseType, IntlVipNewUiFrag intlVipNewUiFrag) {
        View viewInflate = m57686c().inflater().inflate(kec0.f126132x5, (ViewGroup) this.f38027d, false);
        FrameLayout frameLayout = (FrameLayout) viewInflate.findViewById(adc0.f70149U4);
        LinearLayout linearLayout = (LinearLayout) viewInflate.findViewById(adc0.f70132T4);
        VText vText = (VText) viewInflate.findViewById(adc0.f70166V4);
        vText.setText(str);
        frameLayout.setBackground(qce.m176119a());
        if (wib0.m206578v(purchaseType)) {
            vText.setTextColor(Color.parseColor("#4D3D2747"));
            vText.setBackground(qce.m176121c(purchaseType));
        } else {
            vText.setTextColor(Color.parseColor("#4D000000"));
            vText.setBackground(qce.m176121c(purchaseType));
        }
        int i = 0;
        while (i < list.size()) {
            m57695l(linearLayout, list.get(i), purchaseType, intlVipNewUiFrag, i == list.size() - 1);
            i++;
        }
        this.f38027d.addView(viewInflate);
    }

    /* JADX INFO: renamed from: k */
    public final void m57694k(List<rgk> list, PurchaseType purchaseType, IntlVipNewUiFrag intlVipNewUiFrag) {
        if (this.f38027d == null) {
            return;
        }
        HashSet hashSet = new HashSet();
        for (rgk rgkVar : list) {
            ArrayList arrayList = new ArrayList();
            for (be90 be90Var : rgkVar.f163019b) {
                if (!hashSet.contains(be90Var.f76351a)) {
                    arrayList.add(be90Var);
                    hashSet.add(be90Var.f76351a);
                }
            }
            if (!arrayList.isEmpty()) {
                m57693j(rgkVar.f163018a, arrayList, purchaseType, intlVipNewUiFrag);
            }
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: l */
    public final void m57695l(LinearLayout linearLayout, final be90 be90Var, final PurchaseType purchaseType, IntlVipNewUiFrag intlVipNewUiFrag, boolean z) {
        x6h0 x6h0Var;
        IntlPrivilegeDescListItem intlPrivilegeDescListItem = (IntlPrivilegeDescListItem) m57686c().inflater().inflate(kec0.f125759b5, (ViewGroup) linearLayout, false);
        if (z) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) intlPrivilegeDescListItem.getLayoutParams();
            marginLayoutParams.bottomMargin = 0;
            intlPrivilegeDescListItem.setLayoutParams(marginLayoutParams);
        }
        IntlPrivilegeDescListItem.C9116b c9116bM57688e = m57688e(be90Var.f76351a, purchaseType, be90Var.f76352b);
        m57697n(intlPrivilegeDescListItem, purchaseType, be90Var.f76352b);
        Privilege privilege = be90Var.f76351a;
        if (privilege == Privilege.full_boost) {
            this.f38029f = intlPrivilegeDescListItem;
        }
        if (privilege == Privilege.immediately_match) {
            this.f38030g = intlPrivilegeDescListItem;
        }
        if (privilege == Privilege.premium_compliment) {
            this.f38031h = intlPrivilegeDescListItem;
        }
        if (privilege == Privilege.tribe) {
            this.f38032i = intlPrivilegeDescListItem;
        }
        if (privilege == Privilege.vip_super_like || privilege == Privilege.unlimit_free_super_like) {
            this.f38028e = intlPrivilegeDescListItem;
        }
        intlPrivilegeDescListItem.m57680i(c9116bM57688e, intlVipNewUiFrag);
        if (this.f38028e == intlPrivilegeDescListItem && (x6h0Var = this.f38038o) != null) {
            x6h0Var.m209492c(intlPrivilegeDescListItem, purchaseType);
        }
        if (this.f38037n != null) {
            intlPrivilegeDescListItem.setOnClickListener(new View.OnClickListener() { // from class: l.e0p
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f91542a.m57690g(be90Var, purchaseType, view);
                }
            });
        }
        linearLayout.addView(intlPrivilegeDescListItem);
    }

    /* JADX INFO: renamed from: m */
    public final void m57696m() {
        bnl0.m105524M(this.f38026c, true);
        bnl0.m105524M(this.f38024a, true);
        removeAllViews();
        x6h0 x6h0Var = this.f38038o;
        if (x6h0Var != null && x6h0Var.m209496g() != null) {
            View currentView = this.f38038o.m209496g().getCurrentView();
            if (currentView instanceof TextView) {
                this.f38038o.m209500k(((TextView) currentView).getText().toString());
            }
        }
        this.f38028e = null;
        this.f38029f = null;
        this.f38030g = null;
        this.f38031h = null;
        this.f38032i = null;
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        addView(linearLayout);
        this.f38027d = linearLayout;
    }

    /* JADX INFO: renamed from: n */
    public final void m57697n(IntlPrivilegeDescListItem intlPrivilegeDescListItem, PurchaseType purchaseType, boolean z) {
        if (wib0.m206578v(purchaseType)) {
            intlPrivilegeDescListItem.setPrivilegeTextColor(Color.parseColor("#3D2747"));
        } else {
            intlPrivilegeDescListItem.setPrivilegeTextColor(Color.parseColor(z ? Constants.BLACK : "#4D000000"));
        }
    }

    /* JADX INFO: renamed from: o */
    public void m57698o(PurchaseType purchaseType, PurchaseType purchaseType2) {
        IntlPrivilegeDescListItem intlPrivilegeDescListItem;
        if (this.f38038o == null) {
            if (this.f38036m == null) {
                m57689f();
            }
            if (this.f38036m != null) {
                this.f38038o = new x6h0(getContext(), this.f38036m);
            }
        }
        x6h0 x6h0Var = this.f38038o;
        if (x6h0Var == null) {
            return;
        }
        this.f38034k = purchaseType;
        this.f38033j = purchaseType2;
        if (x6h0Var.m209496g() == null && (intlPrivilegeDescListItem = this.f38028e) != null) {
            this.f38038o.m209492c(intlPrivilegeDescListItem, purchaseType2);
        }
        if (this.f38038o.m209496g() == null) {
            return;
        }
        boolean zM206578v = wib0.m206578v(purchaseType2);
        boolean z = false;
        boolean z2 = purchaseType == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE;
        if (purchaseType != null && wib0.m206578v(purchaseType)) {
            z = true;
        }
        if (!(zM206578v && z2) && (zM206578v || !z)) {
            this.f38038o.m209496g().setInAnimation(null);
            this.f38038o.m209496g().setOutAnimation(null);
        } else {
            jr0.m146653k(this.f38038o.m209496g(), zM206578v);
        }
        this.f38038o.m209502m(purchaseType, purchaseType2);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m57685b(this);
        m57689f();
    }

    /* JADX INFO: renamed from: p */
    public final void m57699p(PurchaseType purchaseType) {
        PurchaseType purchaseType2 = this.f38033j;
        if (purchaseType2 != purchaseType) {
            this.f38034k = purchaseType2;
            this.f38033j = purchaseType;
        }
    }

    public IntlPrivilegeExclusivePrivilegeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public IntlPrivilegeExclusivePrivilegeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
