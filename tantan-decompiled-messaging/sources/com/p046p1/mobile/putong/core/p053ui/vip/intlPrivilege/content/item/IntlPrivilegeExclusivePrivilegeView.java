package com.p046p1.mobile.putong.core.p053ui.vip.intlPrivilege.content.item;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.p053ui.vip.intlPrivilege.IntlVipNewUiFrag;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import p147v.VText;
import p149l.bek;
import p149l.f6c0;
import p149l.fr0;
import p149l.fxo;
import p149l.fyo;
import p149l.kt80;
import p149l.mbe;
import p149l.pyg0;
import p149l.sab0;
import p149l.tb90;
import p149l.u4c0;
import p149l.v590;
import p149l.x590;
import p149l.xdl0;

/* JADX INFO: loaded from: classes9.dex */
public class IntlPrivilegeExclusivePrivilegeView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public FrameLayout f37176a;

    /* JADX INFO: renamed from: b */
    public LinearLayout f37177b;

    /* JADX INFO: renamed from: c */
    public VText f37178c;

    /* JADX INFO: renamed from: d */
    public LinearLayout f37179d;

    /* JADX INFO: renamed from: e */
    public IntlPrivilegeDescListItem f37180e;

    /* JADX INFO: renamed from: f */
    public IntlPrivilegeDescListItem f37181f;

    /* JADX INFO: renamed from: g */
    public IntlPrivilegeDescListItem f37182g;

    /* JADX INFO: renamed from: h */
    public IntlPrivilegeDescListItem f37183h;

    /* JADX INFO: renamed from: i */
    public IntlPrivilegeDescListItem f37184i;

    /* JADX INFO: renamed from: j */
    public PurchaseType f37185j;

    /* JADX INFO: renamed from: k */
    public PurchaseType f37186k;

    /* JADX INFO: renamed from: l */
    public v590 f37187l;

    /* JADX INFO: renamed from: m */
    public tb90 f37188m;

    /* JADX INFO: renamed from: n */
    public kt80 f37189n;

    /* JADX INFO: renamed from: o */
    public pyg0 f37190o;

    public IntlPrivilegeExclusivePrivilegeView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: b */
    public final void m56502b(View view) {
        fyo.m123787a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public Act m56503c() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: d */
    public void m56504d(PurchaseType purchaseType, PurchaseType purchaseType2, Runnable runnable) {
        fr0.C16912a c16912a = new fr0.C16912a();
        c16912a.f98868a = this.f37181f;
        c16912a.f98869b = this.f37182g;
        c16912a.f98870c = this.f37183h;
        c16912a.f98871d = this.f37184i;
        fr0.m122771c(purchaseType, purchaseType2, c16912a, runnable);
    }

    /* JADX INFO: renamed from: e */
    public final IntlPrivilegeDescListItem.C8953b m56505e(Privilege privilege, PurchaseType purchaseType, boolean z) {
        if (this.f37188m == null) {
            m56506f();
        }
        IntlPrivilegeDescListItem.C8953b c8953bM123641a = fxo.m123641a(privilege, purchaseType, z);
        String strM187851g = this.f37188m.m187851g(privilege, purchaseType);
        int iM187850f = this.f37188m.m187850f(privilege, purchaseType);
        int iM187846b = this.f37188m.m187846b(privilege);
        if (strM187851g != null) {
            c8953bM123641a.f37160a = strM187851g;
        } else if (iM187850f != 0) {
            c8953bM123641a.f37160a = m56503c().getString(iM187850f);
        }
        if (iM187846b != 0) {
            c8953bM123641a.f37161b = m56503c().getString(iM187846b);
        }
        return c8953bM123641a;
    }

    /* JADX INFO: renamed from: f */
    public final void m56506f() {
        Act actM56503c = m56503c();
        if (actM56503c != null) {
            this.f37187l = new v590(actM56503c);
            this.f37188m = new tb90(actM56503c);
            this.f37190o = new pyg0(getContext(), this.f37188m);
        }
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m56507g(x590 x590Var, PurchaseType purchaseType, View view) {
        boolean z = x590Var.f191100b;
        kt80 kt80Var = this.f37189n;
        if (z) {
            kt80Var.m147202e(x590Var.f191099a, purchaseType);
        } else {
            kt80Var.m147203f(x590Var.f191099a, purchaseType);
        }
    }

    /* JADX INFO: renamed from: h */
    public void m56508h(PurchaseType purchaseType, PurchaseType purchaseType2) {
        IntlPrivilegeDescListItem intlPrivilegeDescListItem;
        if (this.f37190o == null) {
            if (this.f37188m == null) {
                m56506f();
            }
            if (this.f37188m != null) {
                this.f37190o = new pyg0(getContext(), this.f37188m);
            }
        }
        pyg0 pyg0Var = this.f37190o;
        if (pyg0Var == null) {
            return;
        }
        if (pyg0Var.m172123g() == null && (intlPrivilegeDescListItem = this.f37180e) != null) {
            this.f37190o.m172119c(intlPrivilegeDescListItem, purchaseType2);
        }
        this.f37190o.m172126j(purchaseType, purchaseType2);
    }

    /* JADX INFO: renamed from: i */
    public void m56509i(PurchaseType purchaseType, IntlVipNewUiFrag intlVipNewUiFrag) {
        if (this.f37187l == null || this.f37188m == null) {
            m56506f();
        }
        if (this.f37189n == null && intlVipNewUiFrag != null) {
            this.f37189n = new kt80(intlVipNewUiFrag);
        }
        m56516p(purchaseType);
        m56513m();
        m56511k(this.f37187l.m197098c(purchaseType, this.f37187l.m197099d(purchaseType)), purchaseType, intlVipNewUiFrag);
    }

    /* JADX INFO: renamed from: j */
    public final void m56510j(String str, List<x590> list, PurchaseType purchaseType, IntlVipNewUiFrag intlVipNewUiFrag) {
        View viewInflate = m56503c().inflater().inflate(f6c0.f96061w5, (ViewGroup) this.f37179d, false);
        FrameLayout frameLayout = (FrameLayout) viewInflate.findViewById(u4c0.f174027S4);
        LinearLayout linearLayout = (LinearLayout) viewInflate.findViewById(u4c0.f174010R4);
        VText vText = (VText) viewInflate.findViewById(u4c0.f174044T4);
        vText.setText(str);
        frameLayout.setBackground(mbe.m153882a());
        if (sab0.m182904v(purchaseType)) {
            vText.setTextColor(Color.parseColor("#4D3D2747"));
            vText.setBackground(mbe.m153884c(purchaseType));
        } else {
            vText.setTextColor(Color.parseColor("#4D000000"));
            vText.setBackground(mbe.m153884c(purchaseType));
        }
        int i = 0;
        while (i < list.size()) {
            m56512l(linearLayout, list.get(i), purchaseType, intlVipNewUiFrag, i == list.size() - 1);
            i++;
        }
        this.f37179d.addView(viewInflate);
    }

    /* JADX INFO: renamed from: k */
    public final void m56511k(List<bek> list, PurchaseType purchaseType, IntlVipNewUiFrag intlVipNewUiFrag) {
        if (this.f37179d == null) {
            return;
        }
        HashSet hashSet = new HashSet();
        for (bek bekVar : list) {
            ArrayList arrayList = new ArrayList();
            for (x590 x590Var : bekVar.f75167b) {
                if (!hashSet.contains(x590Var.f191099a)) {
                    arrayList.add(x590Var);
                    hashSet.add(x590Var.f191099a);
                }
            }
            if (!arrayList.isEmpty()) {
                m56510j(bekVar.f75166a, arrayList, purchaseType, intlVipNewUiFrag);
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
    public final void m56512l(LinearLayout linearLayout, final x590 x590Var, final PurchaseType purchaseType, IntlVipNewUiFrag intlVipNewUiFrag, boolean z) {
        pyg0 pyg0Var;
        IntlPrivilegeDescListItem intlPrivilegeDescListItem = (IntlPrivilegeDescListItem) m56503c().inflater().inflate(f6c0.f95688a5, (ViewGroup) linearLayout, false);
        if (z) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) intlPrivilegeDescListItem.getLayoutParams();
            marginLayoutParams.bottomMargin = 0;
            intlPrivilegeDescListItem.setLayoutParams(marginLayoutParams);
        }
        IntlPrivilegeDescListItem.C8953b c8953bM56505e = m56505e(x590Var.f191099a, purchaseType, x590Var.f191100b);
        m56514n(intlPrivilegeDescListItem, purchaseType, x590Var.f191100b);
        Privilege privilege = x590Var.f191099a;
        if (privilege == Privilege.full_boost) {
            this.f37181f = intlPrivilegeDescListItem;
        }
        if (privilege == Privilege.immediately_match) {
            this.f37182g = intlPrivilegeDescListItem;
        }
        if (privilege == Privilege.premium_compliment) {
            this.f37183h = intlPrivilegeDescListItem;
        }
        if (privilege == Privilege.tribe) {
            this.f37184i = intlPrivilegeDescListItem;
        }
        if (privilege == Privilege.vip_super_like || privilege == Privilege.unlimit_free_super_like) {
            this.f37180e = intlPrivilegeDescListItem;
        }
        intlPrivilegeDescListItem.m56497i(c8953bM56505e, intlVipNewUiFrag);
        if (this.f37180e == intlPrivilegeDescListItem && (pyg0Var = this.f37190o) != null) {
            pyg0Var.m172119c(intlPrivilegeDescListItem, purchaseType);
        }
        if (this.f37189n != null) {
            intlPrivilegeDescListItem.setOnClickListener(new View.OnClickListener() { // from class: l.eyo
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f93778a.m56507g(x590Var, purchaseType, view);
                }
            });
        }
        linearLayout.addView(intlPrivilegeDescListItem);
    }

    /* JADX INFO: renamed from: m */
    public final void m56513m() {
        xdl0.m208344M(this.f37178c, true);
        xdl0.m208344M(this.f37176a, true);
        removeAllViews();
        pyg0 pyg0Var = this.f37190o;
        if (pyg0Var != null && pyg0Var.m172123g() != null) {
            View currentView = this.f37190o.m172123g().getCurrentView();
            if (currentView instanceof TextView) {
                this.f37190o.m172127k(((TextView) currentView).getText().toString());
            }
        }
        this.f37180e = null;
        this.f37181f = null;
        this.f37182g = null;
        this.f37183h = null;
        this.f37184i = null;
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        addView(linearLayout);
        this.f37179d = linearLayout;
    }

    /* JADX INFO: renamed from: n */
    public final void m56514n(IntlPrivilegeDescListItem intlPrivilegeDescListItem, PurchaseType purchaseType, boolean z) {
        if (sab0.m182904v(purchaseType)) {
            intlPrivilegeDescListItem.setPrivilegeTextColor(Color.parseColor("#3D2747"));
        } else {
            intlPrivilegeDescListItem.setPrivilegeTextColor(Color.parseColor(z ? Constants.BLACK : "#4D000000"));
        }
    }

    /* JADX INFO: renamed from: o */
    public void m56515o(PurchaseType purchaseType, PurchaseType purchaseType2) {
        IntlPrivilegeDescListItem intlPrivilegeDescListItem;
        if (this.f37190o == null) {
            if (this.f37188m == null) {
                m56506f();
            }
            if (this.f37188m != null) {
                this.f37190o = new pyg0(getContext(), this.f37188m);
            }
        }
        pyg0 pyg0Var = this.f37190o;
        if (pyg0Var == null) {
            return;
        }
        this.f37186k = purchaseType;
        this.f37185j = purchaseType2;
        if (pyg0Var.m172123g() == null && (intlPrivilegeDescListItem = this.f37180e) != null) {
            this.f37190o.m172119c(intlPrivilegeDescListItem, purchaseType2);
        }
        if (this.f37190o.m172123g() == null) {
            return;
        }
        boolean zM182904v = sab0.m182904v(purchaseType2);
        boolean z = false;
        boolean z2 = purchaseType == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE;
        if (purchaseType != null && sab0.m182904v(purchaseType)) {
            z = true;
        }
        if (!(zM182904v && z2) && (zM182904v || !z)) {
            this.f37190o.m172123g().setInAnimation(null);
            this.f37190o.m172123g().setOutAnimation(null);
        } else {
            fr0.m122779k(this.f37190o.m172123g(), zM182904v);
        }
        this.f37190o.m172129m(purchaseType, purchaseType2);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m56502b(this);
        m56506f();
    }

    /* JADX INFO: renamed from: p */
    public final void m56516p(PurchaseType purchaseType) {
        PurchaseType purchaseType2 = this.f37185j;
        if (purchaseType2 != purchaseType) {
            this.f37186k = purchaseType2;
            this.f37185j = purchaseType;
        }
    }

    public IntlPrivilegeExclusivePrivilegeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public IntlPrivilegeExclusivePrivilegeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
