package com.p000p1.mobile.putong.core.p004ui.vip.intlPrivilege.content.item;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p000p1.mobile.putong.core.p004ui.vip.intlPrivilege.IntlVipNewUiFrag;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.data.PurchaseType;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import l.fyo;
import l.sab0;
import l.xdl0;
import p006l.bek;
import p006l.f6c0;
import p006l.fr0;
import p006l.fxo;
import p006l.kt80;
import p006l.mbe;
import p006l.pyg0;
import p006l.tb90;
import p006l.u4c0;
import p006l.v590;
import p006l.x590;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class IntlPrivilegeExclusivePrivilegeView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public FrameLayout f6957a;

    /* JADX INFO: renamed from: b */
    public LinearLayout f6958b;

    /* JADX INFO: renamed from: c */
    public VText f6959c;

    /* JADX INFO: renamed from: d */
    public LinearLayout f6960d;

    /* JADX INFO: renamed from: e */
    public IntlPrivilegeDescListItem f6961e;

    /* JADX INFO: renamed from: f */
    public IntlPrivilegeDescListItem f6962f;

    /* JADX INFO: renamed from: g */
    public IntlPrivilegeDescListItem f6963g;

    /* JADX INFO: renamed from: h */
    public IntlPrivilegeDescListItem f6964h;

    /* JADX INFO: renamed from: i */
    public IntlPrivilegeDescListItem f6965i;

    /* JADX INFO: renamed from: j */
    public PurchaseType f6966j;

    /* JADX INFO: renamed from: k */
    public PurchaseType f6967k;

    /* JADX INFO: renamed from: l */
    public v590 f6968l;

    /* JADX INFO: renamed from: m */
    public tb90 f6969m;

    /* JADX INFO: renamed from: n */
    public kt80 f6970n;

    /* JADX INFO: renamed from: o */
    public pyg0 f6971o;

    public IntlPrivilegeExclusivePrivilegeView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: b */
    public final void m9943b(View view) {
        fyo.a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public Act m9944c() {
        return getContext();
    }

    /* JADX INFO: renamed from: d */
    public void m9945d(PurchaseType purchaseType, PurchaseType purchaseType2, Runnable runnable) {
        fr0.C0731a c0731a = new fr0.C0731a();
        c0731a.f12859a = this.f6962f;
        c0731a.f12860b = this.f6963g;
        c0731a.f12861c = this.f6964h;
        c0731a.f12862d = this.f6965i;
        fr0.m15449c(purchaseType, purchaseType2, c0731a, runnable);
    }

    /* JADX INFO: renamed from: e */
    public final IntlPrivilegeDescListItem.C0389b m9946e(Privilege privilege, PurchaseType purchaseType, boolean z) {
        if (this.f6969m == null) {
            m9947f();
        }
        IntlPrivilegeDescListItem.C0389b c0389bM15509a = fxo.m15509a(privilege, purchaseType, z);
        String strM24605g = this.f6969m.m24605g(privilege, purchaseType);
        int iM24604f = this.f6969m.m24604f(privilege, purchaseType);
        int iM24600b = this.f6969m.m24600b(privilege);
        if (strM24605g != null) {
            c0389bM15509a.f6941a = strM24605g;
        } else if (iM24604f != 0) {
            c0389bM15509a.f6941a = m9944c().getString(iM24604f);
        }
        if (iM24600b != 0) {
            c0389bM15509a.f6942b = m9944c().getString(iM24600b);
        }
        return c0389bM15509a;
    }

    /* JADX INFO: renamed from: f */
    public final void m9947f() {
        Act actM9944c = m9944c();
        if (actM9944c != null) {
            this.f6968l = new v590(actM9944c);
            this.f6969m = new tb90(actM9944c);
            this.f6971o = new pyg0(getContext(), this.f6969m);
        }
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m9948g(x590 x590Var, PurchaseType purchaseType, View view) {
        boolean z = x590Var.f27353b;
        kt80 kt80Var = this.f6970n;
        if (z) {
            kt80Var.m18265e(x590Var.f27352a, purchaseType);
        } else {
            kt80Var.m18266f(x590Var.f27352a, purchaseType);
        }
    }

    /* JADX INFO: renamed from: h */
    public void m9949h(PurchaseType purchaseType, PurchaseType purchaseType2) {
        IntlPrivilegeDescListItem intlPrivilegeDescListItem;
        if (this.f6971o == null) {
            if (this.f6969m == null) {
                m9947f();
            }
            if (this.f6969m != null) {
                this.f6971o = new pyg0(getContext(), this.f6969m);
            }
        }
        pyg0 pyg0Var = this.f6971o;
        if (pyg0Var == null) {
            return;
        }
        if (pyg0Var.m21840g() == null && (intlPrivilegeDescListItem = this.f6961e) != null) {
            this.f6971o.m21836c(intlPrivilegeDescListItem, purchaseType2);
        }
        this.f6971o.m21843j(purchaseType, purchaseType2);
    }

    /* JADX INFO: renamed from: i */
    public void m9950i(PurchaseType purchaseType, IntlVipNewUiFrag intlVipNewUiFrag) {
        if (this.f6968l == null || this.f6969m == null) {
            m9947f();
        }
        if (this.f6970n == null && intlVipNewUiFrag != null) {
            this.f6970n = new kt80(intlVipNewUiFrag);
        }
        m9957p(purchaseType);
        m9954m();
        m9952k(this.f6968l.m25756c(purchaseType, this.f6968l.m25757d(purchaseType)), purchaseType, intlVipNewUiFrag);
    }

    /* JADX INFO: renamed from: j */
    public final void m9951j(String str, List<x590> list, PurchaseType purchaseType, IntlVipNewUiFrag intlVipNewUiFrag) {
        View viewInflate = m9944c().inflater().inflate(f6c0.f12475w5, (ViewGroup) this.f6960d, false);
        FrameLayout frameLayout = (FrameLayout) viewInflate.findViewById(u4c0.f22775S4);
        LinearLayout linearLayout = (LinearLayout) viewInflate.findViewById(u4c0.f22758R4);
        VText vTextFindViewById = viewInflate.findViewById(u4c0.f22792T4);
        vTextFindViewById.setText(str);
        frameLayout.setBackground(mbe.m19189a());
        if (sab0.v(purchaseType)) {
            vTextFindViewById.setTextColor(Color.parseColor("#4D3D2747"));
            vTextFindViewById.setBackground(mbe.m19191c(purchaseType));
        } else {
            vTextFindViewById.setTextColor(Color.parseColor("#4D000000"));
            vTextFindViewById.setBackground(mbe.m19191c(purchaseType));
        }
        int i = 0;
        while (i < list.size()) {
            m9953l(linearLayout, list.get(i), purchaseType, intlVipNewUiFrag, i == list.size() - 1);
            i++;
        }
        this.f6960d.addView(viewInflate);
    }

    /* JADX INFO: renamed from: k */
    public final void m9952k(List<bek> list, PurchaseType purchaseType, IntlVipNewUiFrag intlVipNewUiFrag) {
        if (this.f6960d == null) {
            return;
        }
        HashSet hashSet = new HashSet();
        for (bek bekVar : list) {
            ArrayList arrayList = new ArrayList();
            for (x590 x590Var : bekVar.f8853b) {
                if (!hashSet.contains(x590Var.f27352a)) {
                    arrayList.add(x590Var);
                    hashSet.add(x590Var.f27352a);
                }
            }
            if (!arrayList.isEmpty()) {
                m9951j(bekVar.f8852a, arrayList, purchaseType, intlVipNewUiFrag);
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
    public final void m9953l(LinearLayout linearLayout, final x590 x590Var, final PurchaseType purchaseType, IntlVipNewUiFrag intlVipNewUiFrag, boolean z) {
        pyg0 pyg0Var;
        IntlPrivilegeDescListItem intlPrivilegeDescListItem = (IntlPrivilegeDescListItem) m9944c().inflater().inflate(f6c0.f12102a5, (ViewGroup) linearLayout, false);
        if (z) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) intlPrivilegeDescListItem.getLayoutParams();
            marginLayoutParams.bottomMargin = 0;
            intlPrivilegeDescListItem.setLayoutParams(marginLayoutParams);
        }
        IntlPrivilegeDescListItem.C0389b c0389bM9946e = m9946e(x590Var.f27352a, purchaseType, x590Var.f27353b);
        m9955n(intlPrivilegeDescListItem, purchaseType, x590Var.f27353b);
        Privilege privilege = x590Var.f27352a;
        if (privilege == Privilege.full_boost) {
            this.f6962f = intlPrivilegeDescListItem;
        }
        if (privilege == Privilege.immediately_match) {
            this.f6963g = intlPrivilegeDescListItem;
        }
        if (privilege == Privilege.premium_compliment) {
            this.f6964h = intlPrivilegeDescListItem;
        }
        if (privilege == Privilege.tribe) {
            this.f6965i = intlPrivilegeDescListItem;
        }
        if (privilege == Privilege.vip_super_like || privilege == Privilege.unlimit_free_super_like) {
            this.f6961e = intlPrivilegeDescListItem;
        }
        intlPrivilegeDescListItem.m9938i(c0389bM9946e, intlVipNewUiFrag);
        if (this.f6961e == intlPrivilegeDescListItem && (pyg0Var = this.f6971o) != null) {
            pyg0Var.m21836c(intlPrivilegeDescListItem, purchaseType);
        }
        if (this.f6970n != null) {
            intlPrivilegeDescListItem.setOnClickListener(new View.OnClickListener() { // from class: l.eyo
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f11518a.m9948g(x590Var, purchaseType, view);
                }
            });
        }
        linearLayout.addView(intlPrivilegeDescListItem);
    }

    /* JADX INFO: renamed from: m */
    public final void m9954m() {
        xdl0.M(this.f6959c, true);
        xdl0.M(this.f6957a, true);
        removeAllViews();
        pyg0 pyg0Var = this.f6971o;
        if (pyg0Var != null && pyg0Var.m21840g() != null) {
            View currentView = this.f6971o.m21840g().getCurrentView();
            if (currentView instanceof TextView) {
                this.f6971o.m21844k(((TextView) currentView).getText().toString());
            }
        }
        this.f6961e = null;
        this.f6962f = null;
        this.f6963g = null;
        this.f6964h = null;
        this.f6965i = null;
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        addView(linearLayout);
        this.f6960d = linearLayout;
    }

    /* JADX INFO: renamed from: n */
    public final void m9955n(IntlPrivilegeDescListItem intlPrivilegeDescListItem, PurchaseType purchaseType, boolean z) {
        if (sab0.v(purchaseType)) {
            intlPrivilegeDescListItem.setPrivilegeTextColor(Color.parseColor("#3D2747"));
        } else {
            intlPrivilegeDescListItem.setPrivilegeTextColor(Color.parseColor(z ? "#000000" : "#4D000000"));
        }
    }

    /* JADX INFO: renamed from: o */
    public void m9956o(PurchaseType purchaseType, PurchaseType purchaseType2) {
        IntlPrivilegeDescListItem intlPrivilegeDescListItem;
        if (this.f6971o == null) {
            if (this.f6969m == null) {
                m9947f();
            }
            if (this.f6969m != null) {
                this.f6971o = new pyg0(getContext(), this.f6969m);
            }
        }
        pyg0 pyg0Var = this.f6971o;
        if (pyg0Var == null) {
            return;
        }
        this.f6967k = purchaseType;
        this.f6966j = purchaseType2;
        if (pyg0Var.m21840g() == null && (intlPrivilegeDescListItem = this.f6961e) != null) {
            this.f6971o.m21836c(intlPrivilegeDescListItem, purchaseType2);
        }
        if (this.f6971o.m21840g() == null) {
            return;
        }
        boolean zV = sab0.v(purchaseType2);
        boolean z = false;
        boolean z2 = purchaseType == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE;
        if (purchaseType != null && sab0.v(purchaseType)) {
            z = true;
        }
        if (!(zV && z2) && (zV || !z)) {
            this.f6971o.m21840g().setInAnimation(null);
            this.f6971o.m21840g().setOutAnimation(null);
        } else {
            fr0.m15457k(this.f6971o.m21840g(), zV);
        }
        this.f6971o.m21846m(purchaseType, purchaseType2);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m9943b(this);
        m9947f();
    }

    /* JADX INFO: renamed from: p */
    public final void m9957p(PurchaseType purchaseType) {
        PurchaseType purchaseType2 = this.f6966j;
        if (purchaseType2 != purchaseType) {
            this.f6967k = purchaseType2;
            this.f6966j = purchaseType;
        }
    }

    public IntlPrivilegeExclusivePrivilegeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public IntlPrivilegeExclusivePrivilegeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
