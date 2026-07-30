package com.p051p1.mobile.putong.core.p058ui.vip.intlPrivilege.content.item;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8927c;
import com.p051p1.mobile.putong.core.p058ui.vip.intlPrivilege.IntlVipNewUiFrag;
import com.p051p1.mobile.putong.core.p058ui.vip.intlPrivilege.content.item.IntlPrivilegeUnlockBenefitsView;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import p151v.VIcon;
import p151v.VLinear;
import p151v.VText;
import p153l.adc0;
import p153l.bnl0;
import p153l.d79;
import p153l.dbc0;
import p153l.gta;
import p153l.i4g0;
import p153l.joa;
import p153l.kec0;
import p153l.p5p;
import p153l.qa00;
import p153l.tzo;

/* JADX INFO: loaded from: classes12.dex */
public class IntlPrivilegeUnlockBenefitsView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public FrameLayout f38059a;

    /* JADX INFO: renamed from: b */
    public VText f38060b;

    /* JADX INFO: renamed from: c */
    public VLinear f38061c;

    /* JADX INFO: renamed from: d */
    public VText f38062d;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.intlPrivilege.content.item.IntlPrivilegeUnlockBenefitsView$a */
    public static /* synthetic */ class C9120a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f38063a;

        static {
            int[] iArr = new int[Privilege.values().length];
            f38063a = iArr;
            try {
                iArr[Privilege.vip_unlimited_likes.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f38063a[Privilege.vip_super_like.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f38063a[Privilege.premium_compliment.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f38063a[Privilege.boost.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f38063a[Privilege.intl_advanced_filter.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.intlPrivilege.content.item.IntlPrivilegeUnlockBenefitsView$b */
    public static class C9121b {

        /* JADX INFO: renamed from: a */
        public Privilege f38064a;

        public C9121b(Privilege privilege) {
            this.f38064a = privilege;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.intlPrivilege.content.item.IntlPrivilegeUnlockBenefitsView$c */
    public static class C9122c implements tzo {

        /* JADX INFO: renamed from: a */
        public PurchaseType f38065a;

        public C9122c(PurchaseType purchaseType) {
            this.f38065a = purchaseType;
        }

        @Override // p153l.tzo
        public int getItemType() {
            return 8;
        }
    }

    public IntlPrivilegeUnlockBenefitsView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m57707a(IntlVipNewUiFrag intlVipNewUiFrag) {
        if (intlVipNewUiFrag == null || intlVipNewUiFrag.act() == null) {
            return;
        }
        C8927c.m54687x0(intlVipNewUiFrag.act(), "p_privileges_view,e_ttc_subcription_privilege_description,click", null);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m57708b(final IntlVipNewUiFrag intlVipNewUiFrag, View view) {
        if (intlVipNewUiFrag != null && intlVipNewUiFrag.act() != null) {
            i4g0.m138520r("e_privileges_see_to_premium_click", intlVipNewUiFrag.pageId());
        }
        intlVipNewUiFrag.m57537T4();
        if (d79.m114668a0()) {
            View view2 = intlVipNewUiFrag.getView();
            if (view2 != null) {
                view2.postDelayed(new Runnable() { // from class: l.o5p
                    @Override // java.lang.Runnable
                    public final void run() {
                        IntlPrivilegeUnlockBenefitsView.m57707a(intlVipNewUiFrag);
                    }
                }, 300L);
            } else if (intlVipNewUiFrag.act() != null) {
                C8927c.m54687x0(intlVipNewUiFrag.act(), "p_privileges_view,e_ttc_subcription_privilege_description,click", null);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m57709c(View view) {
        p5p.m170678a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public Act m57710d() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: e */
    public final String m57711e(Privilege privilege, PurchaseType purchaseType) {
        int i;
        boolean zM29125v = IntlCountryCodeController.m29125v();
        int i2 = C9120a.f38063a[privilege.ordinal()];
        if (i2 == 1) {
            i = R$string.f18685Ms;
        } else if (i2 != 2) {
            if (i2 == 3) {
                return String.format(m57710d().getString(R$string.f18818Rb), Integer.valueOf(joa.m146406s3()));
            }
            if (i2 == 4) {
                i = zM29125v ? R$string.f19155cg : R$string.f19186dg;
            } else {
                if (i2 != 5) {
                    return privilege.toString();
                }
                i = R$string.f19573q3;
            }
        } else if (gta.m132210e().m132214d().mo34737Oi()) {
            i = zM29125v ? R$string.f18968Wb : R$string.f18938Vb;
        } else {
            i = zM29125v ? R$string.f19369jg : R$string.f19339ig;
        }
        return i != 0 ? m57710d().getString(i) : privilege.toString();
    }

    /* JADX INFO: renamed from: f */
    public final boolean m57712f(Privilege privilege, PurchaseType purchaseType, ArrayList<Privilege> arrayList) {
        if (arrayList == null) {
            return false;
        }
        return arrayList.contains(privilege);
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
    /* JADX INFO: renamed from: g */
    public void m57713g(PurchaseType purchaseType, final IntlVipNewUiFrag intlVipNewUiFrag) {
        this.f38060b.setText(m57710d().getString(R$string.f18759Pc));
        VText vText = this.f38060b;
        vText.setTypeface(vText.getTypeface(), 1);
        this.f38061c.removeAllViews();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C9121b(Privilege.vip_super_like));
        arrayList.add(new C9121b(Privilege.premium_compliment));
        arrayList.add(new C9121b(Privilege.boost));
        arrayList.add(new C9121b(Privilege.intl_advanced_filter));
        ArrayList<Privilege> privilegeDataForGP = purchaseType.getPrivilegeDataForGP(null);
        for (int i = 0; i < arrayList.size(); i++) {
            Privilege privilege = ((C9121b) arrayList.get(i)).f38064a;
            String strM57711e = m57711e(privilege, purchaseType);
            m57712f(privilege, purchaseType, privilegeDataForGP);
            View viewInflate = m57710d().inflater().inflate(kec0.f125878i5, (ViewGroup) this.f38061c, false);
            VIcon vIcon = (VIcon) viewInflate.findViewById(adc0.f70036Na);
            VText vText2 = (VText) viewInflate.findViewById(adc0.f70053Oa);
            vIcon.setImageResource(dbc0.f87311pa);
            vText2.setText(strM57711e);
            vText2.setTextColor(Color.parseColor(Constants.BLACK));
            vText2.setTypeface(vText2.getTypeface(), 1);
            if (i < arrayList.size() - 1) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) viewInflate.getLayoutParams();
                if (layoutParams == null) {
                    layoutParams = new LinearLayout.LayoutParams(-1, -2);
                }
                layoutParams.bottomMargin = qa00.m175859d(12.0f);
                viewInflate.setLayoutParams(layoutParams);
            }
            this.f38061c.addView(viewInflate);
        }
        VText vText3 = this.f38062d;
        vText3.setTypeface(vText3.getTypeface(), 1);
        if (NullChecker.m82486a(intlVipNewUiFrag)) {
            bnl0.m105509E0(this.f38062d, new View.OnClickListener() { // from class: l.n5p
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    IntlPrivilegeUnlockBenefitsView.m57708b(intlVipNewUiFrag, view);
                }
            });
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m57709c(this);
    }

    public IntlPrivilegeUnlockBenefitsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public IntlPrivilegeUnlockBenefitsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
