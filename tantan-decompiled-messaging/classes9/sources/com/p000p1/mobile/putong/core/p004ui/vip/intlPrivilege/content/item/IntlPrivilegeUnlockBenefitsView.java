package com.p000p1.mobile.putong.core.p004ui.vip.intlPrivilege.content.item;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p000p1.mobile.putong.core.R$string;
import com.p000p1.mobile.putong.core.p004ui.vip.intlPrivilege.IntlVipNewUiFrag;
import com.p000p1.mobile.putong.core.p004ui.vip.intlPrivilege.content.item.IntlPrivilegeUnlockBenefitsView;
import com.p000p1.mobile.putong.p001ab.IntlCountryCodeController;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.ui.purchase.c;
import com.p1.mobile.putong.data.Gender;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import l.p3p;
import l.t100;
import l.xdl0;
import l.zvf0;
import p006l.f6c0;
import p006l.txo;
import p006l.u4c0;
import p006l.u59;
import p006l.ura;
import p006l.x2c0;
import p006l.xma;
import v.VIcon;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class IntlPrivilegeUnlockBenefitsView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public FrameLayout f6992a;

    /* JADX INFO: renamed from: b */
    public VText f6993b;

    /* JADX INFO: renamed from: c */
    public VLinear f6994c;

    /* JADX INFO: renamed from: d */
    public VText f6995d;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.intlPrivilege.content.item.IntlPrivilegeUnlockBenefitsView$a */
    public static /* synthetic */ class C0393a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f6996a;

        static {
            int[] iArr = new int[Privilege.values().length];
            f6996a = iArr;
            try {
                iArr[Privilege.vip_unlimited_likes.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6996a[Privilege.vip_super_like.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6996a[Privilege.premium_compliment.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f6996a[Privilege.boost.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f6996a[Privilege.intl_advanced_filter.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.intlPrivilege.content.item.IntlPrivilegeUnlockBenefitsView$b */
    public static class C0394b {

        /* JADX INFO: renamed from: a */
        public Privilege f6997a;

        public C0394b(Privilege privilege) {
            this.f6997a = privilege;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.intlPrivilege.content.item.IntlPrivilegeUnlockBenefitsView$c */
    public static class C0395c implements txo {

        /* JADX INFO: renamed from: a */
        public PurchaseType f6998a;

        public C0395c(PurchaseType purchaseType) {
            this.f6998a = purchaseType;
        }

        @Override // p006l.txo
        public int getItemType() {
            return 8;
        }
    }

    public IntlPrivilegeUnlockBenefitsView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m9965a(IntlVipNewUiFrag intlVipNewUiFrag) {
        if (intlVipNewUiFrag == null || intlVipNewUiFrag.act() == null) {
            return;
        }
        c.x0(intlVipNewUiFrag.act(), "p_privileges_view,e_ttc_subcription_privilege_description,click", (Privilege) null);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m9966b(final IntlVipNewUiFrag intlVipNewUiFrag, View view) {
        if (intlVipNewUiFrag != null && intlVipNewUiFrag.act() != null) {
            zvf0.r("e_privileges_see_to_premium_click", intlVipNewUiFrag.pageId());
        }
        intlVipNewUiFrag.m9791T4();
        if (u59.m24988Z()) {
            View view2 = intlVipNewUiFrag.getView();
            if (view2 != null) {
                view2.postDelayed(new Runnable() { // from class: l.o3p
                    @Override // java.lang.Runnable
                    public final void run() {
                        IntlPrivilegeUnlockBenefitsView.m9965a(intlVipNewUiFrag);
                    }
                }, 300L);
            } else if (intlVipNewUiFrag.act() != null) {
                c.x0(intlVipNewUiFrag.act(), "p_privileges_view,e_ttc_subcription_privilege_description,click", (Privilege) null);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m9967c(View view) {
        p3p.a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public Act m9968d() {
        return getContext();
    }

    /* JADX INFO: renamed from: e */
    public final String m9969e(Privilege privilege, PurchaseType purchaseType) {
        int i;
        boolean zM21v = IntlCountryCodeController.m21v();
        int i2 = C0393a.f6996a[privilege.ordinal()];
        if (i2 == 1) {
            i = R$string.f2856qs;
        } else if (i2 != 2) {
            if (i2 == 3) {
                return String.format(m9968d().getString(R$string.f1627Cb), Integer.valueOf(xma.m27399r3()));
            }
            if (i2 == 4) {
                i = zM21v ? R$string.f1871Kf : R$string.f1901Lf;
            } else {
                if (i2 != 5) {
                    return privilege.toString();
                }
                i = R$string.f2770o3;
            }
        } else if (ura.m25555e().m25559d().m5671Oi()) {
            i = zM21v ? R$string.f1777Hb : R$string.f1747Gb;
        } else {
            i = zM21v ? R$string.f2081Rf : R$string.f2051Qf;
        }
        return i != 0 ? m9968d().getString(i) : privilege.toString();
    }

    /* JADX INFO: renamed from: f */
    public final boolean m9970f(Privilege privilege, PurchaseType purchaseType, ArrayList<Privilege> arrayList) {
        if (arrayList == null) {
            return false;
        }
        return arrayList.contains(privilege);
    }

    /* JADX INFO: renamed from: g */
    public void m9971g(PurchaseType purchaseType, final IntlVipNewUiFrag intlVipNewUiFrag) {
        this.f6993b.setText(m9968d().getString(R$string.f1568Ac));
        VText vText = this.f6993b;
        vText.setTypeface(vText.getTypeface(), 1);
        this.f6994c.removeAllViews();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C0394b(Privilege.vip_super_like));
        arrayList.add(new C0394b(Privilege.premium_compliment));
        arrayList.add(new C0394b(Privilege.boost));
        arrayList.add(new C0394b(Privilege.intl_advanced_filter));
        ArrayList<Privilege> privilegeDataForGP = purchaseType.getPrivilegeDataForGP((Gender) null);
        for (int i = 0; i < arrayList.size(); i++) {
            Privilege privilege = ((C0394b) arrayList.get(i)).f6997a;
            String strM9969e = m9969e(privilege, purchaseType);
            m9970f(privilege, purchaseType, privilegeDataForGP);
            View viewInflate = m9968d().inflater().inflate(f6c0.f12221h5, (ViewGroup) this.f6994c, false);
            VIcon vIconFindViewById = viewInflate.findViewById(u4c0.f22662La);
            VText vTextFindViewById = viewInflate.findViewById(u4c0.f22679Ma);
            vIconFindViewById.setImageResource(x2c0.f26957oa);
            vTextFindViewById.setText(strM9969e);
            vTextFindViewById.setTextColor(Color.parseColor("#000000"));
            vTextFindViewById.setTypeface(vTextFindViewById.getTypeface(), 1);
            if (i < arrayList.size() - 1) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) viewInflate.getLayoutParams();
                if (layoutParams == null) {
                    layoutParams = new LinearLayout.LayoutParams(-1, -2);
                }
                layoutParams.bottomMargin = t100.d(12.0f);
                viewInflate.setLayoutParams(layoutParams);
            }
            this.f6994c.addView(viewInflate);
        }
        VText vText2 = this.f6995d;
        vText2.setTypeface(vText2.getTypeface(), 1);
        if (NullChecker.a(intlVipNewUiFrag)) {
            xdl0.E0(this.f6995d, new View.OnClickListener() { // from class: l.n3p
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    IntlPrivilegeUnlockBenefitsView.m9966b(intlVipNewUiFrag, view);
                }
            });
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m9967c(this);
    }

    public IntlPrivilegeUnlockBenefitsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public IntlPrivilegeUnlockBenefitsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
