package com.p046p1.mobile.putong.core.p053ui.vip.intlPrivilege.content.item;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8764c;
import com.p046p1.mobile.putong.core.p053ui.vip.intlPrivilege.IntlVipNewUiFrag;
import com.p046p1.mobile.putong.core.p053ui.vip.intlPrivilege.content.item.IntlPrivilegeUnlockBenefitsView;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import p147v.VIcon;
import p147v.VLinear;
import p147v.VText;
import p149l.f6c0;
import p149l.p3p;
import p149l.t100;
import p149l.txo;
import p149l.u4c0;
import p149l.u59;
import p149l.ura;
import p149l.x2c0;
import p149l.xdl0;
import p149l.xma;
import p149l.zvf0;

/* JADX INFO: loaded from: classes9.dex */
public class IntlPrivilegeUnlockBenefitsView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public FrameLayout f37211a;

    /* JADX INFO: renamed from: b */
    public VText f37212b;

    /* JADX INFO: renamed from: c */
    public VLinear f37213c;

    /* JADX INFO: renamed from: d */
    public VText f37214d;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.intlPrivilege.content.item.IntlPrivilegeUnlockBenefitsView$a */
    public static /* synthetic */ class C8957a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f37215a;

        static {
            int[] iArr = new int[Privilege.values().length];
            f37215a = iArr;
            try {
                iArr[Privilege.vip_unlimited_likes.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f37215a[Privilege.vip_super_like.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f37215a[Privilege.premium_compliment.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f37215a[Privilege.boost.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f37215a[Privilege.intl_advanced_filter.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.intlPrivilege.content.item.IntlPrivilegeUnlockBenefitsView$b */
    public static class C8958b {

        /* JADX INFO: renamed from: a */
        public Privilege f37216a;

        public C8958b(Privilege privilege) {
            this.f37216a = privilege;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.intlPrivilege.content.item.IntlPrivilegeUnlockBenefitsView$c */
    public static class C8959c implements txo {

        /* JADX INFO: renamed from: a */
        public PurchaseType f37217a;

        public C8959c(PurchaseType purchaseType) {
            this.f37217a = purchaseType;
        }

        @Override // p149l.txo
        public int getItemType() {
            return 8;
        }
    }

    public IntlPrivilegeUnlockBenefitsView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m56524a(IntlVipNewUiFrag intlVipNewUiFrag) {
        if (intlVipNewUiFrag == null || intlVipNewUiFrag.act() == null) {
            return;
        }
        C8764c.m53504x0(intlVipNewUiFrag.act(), "p_privileges_view,e_ttc_subcription_privilege_description,click", null);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m56525b(final IntlVipNewUiFrag intlVipNewUiFrag, View view) {
        if (intlVipNewUiFrag != null && intlVipNewUiFrag.act() != null) {
            zvf0.m220396r("e_privileges_see_to_premium_click", intlVipNewUiFrag.pageId());
        }
        intlVipNewUiFrag.m56354T4();
        if (u59.m191817Z()) {
            View view2 = intlVipNewUiFrag.getView();
            if (view2 != null) {
                view2.postDelayed(new Runnable() { // from class: l.o3p
                    @Override // java.lang.Runnable
                    public final void run() {
                        IntlPrivilegeUnlockBenefitsView.m56524a(intlVipNewUiFrag);
                    }
                }, 300L);
            } else if (intlVipNewUiFrag.act() != null) {
                C8764c.m53504x0(intlVipNewUiFrag.act(), "p_privileges_view,e_ttc_subcription_privilege_description,click", null);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m56526c(View view) {
        p3p.m167266a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public Act m56527d() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: e */
    public final String m56528e(Privilege privilege, PurchaseType purchaseType) {
        int i;
        boolean zM28126v = IntlCountryCodeController.m28126v();
        int i2 = C8957a.f37215a[privilege.ordinal()];
        if (i2 == 1) {
            i = R$string.f18867qs;
        } else if (i2 != 2) {
            if (i2 == 3) {
                return String.format(m56527d().getString(R$string.f17638Cb), Integer.valueOf(xma.m210091r3()));
            }
            if (i2 == 4) {
                i = zM28126v ? R$string.f17882Kf : R$string.f17912Lf;
            } else {
                if (i2 != 5) {
                    return privilege.toString();
                }
                i = R$string.f18781o3;
            }
        } else if (ura.m195053e().m195057d().mo33734Oi()) {
            i = zM28126v ? R$string.f17788Hb : R$string.f17758Gb;
        } else {
            i = zM28126v ? R$string.f18092Rf : R$string.f18062Qf;
        }
        return i != 0 ? m56527d().getString(i) : privilege.toString();
    }

    /* JADX INFO: renamed from: f */
    public final boolean m56529f(Privilege privilege, PurchaseType purchaseType, ArrayList<Privilege> arrayList) {
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
    public void m56530g(PurchaseType purchaseType, final IntlVipNewUiFrag intlVipNewUiFrag) {
        this.f37212b.setText(m56527d().getString(R$string.f17579Ac));
        VText vText = this.f37212b;
        vText.setTypeface(vText.getTypeface(), 1);
        this.f37213c.removeAllViews();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C8958b(Privilege.vip_super_like));
        arrayList.add(new C8958b(Privilege.premium_compliment));
        arrayList.add(new C8958b(Privilege.boost));
        arrayList.add(new C8958b(Privilege.intl_advanced_filter));
        ArrayList<Privilege> privilegeDataForGP = purchaseType.getPrivilegeDataForGP(null);
        for (int i = 0; i < arrayList.size(); i++) {
            Privilege privilege = ((C8958b) arrayList.get(i)).f37216a;
            String strM56528e = m56528e(privilege, purchaseType);
            m56529f(privilege, purchaseType, privilegeDataForGP);
            View viewInflate = m56527d().inflater().inflate(f6c0.f95807h5, (ViewGroup) this.f37213c, false);
            VIcon vIcon = (VIcon) viewInflate.findViewById(u4c0.f173914La);
            VText vText2 = (VText) viewInflate.findViewById(u4c0.f173931Ma);
            vIcon.setImageResource(x2c0.f190421oa);
            vText2.setText(strM56528e);
            vText2.setTextColor(Color.parseColor(Constants.BLACK));
            vText2.setTypeface(vText2.getTypeface(), 1);
            if (i < arrayList.size() - 1) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) viewInflate.getLayoutParams();
                if (layoutParams == null) {
                    layoutParams = new LinearLayout.LayoutParams(-1, -2);
                }
                layoutParams.bottomMargin = t100.m186890d(12.0f);
                viewInflate.setLayoutParams(layoutParams);
            }
            this.f37213c.addView(viewInflate);
        }
        VText vText3 = this.f37214d;
        vText3.setTypeface(vText3.getTypeface(), 1);
        if (NullChecker.m81303a(intlVipNewUiFrag)) {
            xdl0.m208329E0(this.f37214d, new View.OnClickListener() { // from class: l.n3p
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    IntlPrivilegeUnlockBenefitsView.m56525b(intlVipNewUiFrag, view);
                }
            });
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m56526c(this);
    }

    public IntlPrivilegeUnlockBenefitsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public IntlPrivilegeUnlockBenefitsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
