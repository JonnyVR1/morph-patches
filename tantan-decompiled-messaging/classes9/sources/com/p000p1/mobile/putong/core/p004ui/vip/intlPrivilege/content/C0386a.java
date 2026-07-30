package com.p000p1.mobile.putong.core.p004ui.vip.intlPrivilege.content;

import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.account.data.CameraSticker;
import com.p000p1.mobile.putong.core.p004ui.vip.intlPrivilege.IntlVipNewUiFrag;
import com.p000p1.mobile.putong.core.p004ui.vip.intlPrivilege.content.item.IntlPrivilegeDescListImageItem;
import com.p000p1.mobile.putong.core.p004ui.vip.intlPrivilege.content.item.IntlPrivilegeDescListSeeItem;
import com.p000p1.mobile.putong.core.p004ui.vip.intlPrivilege.content.item.IntlPrivilegeExclusivePrivilegeView;
import com.p000p1.mobile.putong.core.p004ui.vip.intlPrivilege.content.item.IntlPrivilegePolicyItem;
import com.p000p1.mobile.putong.core.p004ui.vip.intlPrivilege.content.item.IntlPrivilegeShowcaseWrapper;
import com.p000p1.mobile.putong.core.p004ui.vip.intlPrivilege.content.item.IntlPrivilegeSubscriptionItem;
import com.p000p1.mobile.putong.core.p004ui.vip.intlPrivilege.content.item.IntlPrivilegeUnlockBenefitsView;
import com.p1.mobile.putong.core.data.PurchaseType;
import java.util.ArrayList;
import l.dac0;
import p006l.c3m;
import p006l.f6c0;
import p006l.hxo;
import p006l.r1p;
import p006l.txo;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.intlPrivilege.content.a */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class C0386a extends dac0<txo> {

    /* JADX INFO: renamed from: c */
    public ArrayList<txo> f6924c;

    /* JADX INFO: renamed from: d */
    public final IntlVipNewUiFrag f6925d;

    /* JADX INFO: renamed from: e */
    public final c3m f6926e;

    /* JADX INFO: renamed from: f */
    public final hxo f6927f;

    /* JADX INFO: renamed from: g */
    public IntlPrivilegeShowcaseWrapper f6928g;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.intlPrivilege.content.a$a */
    public static class a implements txo {

        /* JADX INFO: renamed from: a */
        public PurchaseType f6929a;

        public a(PurchaseType purchaseType) {
            this.f6929a = purchaseType;
        }

        @Override // p006l.txo
        public int getItemType() {
            return 7;
        }
    }

    public C0386a(IntlVipNewUiFrag intlVipNewUiFrag, c3m c3mVar, hxo hxoVar) {
        this.f6925d = intlVipNewUiFrag;
        this.f6926e = c3mVar;
        this.f6927f = hxoVar;
    }

    /* JADX INFO: renamed from: C */
    public int m9923C() {
        return this.f6924c.size();
    }

    /* JADX INFO: renamed from: D */
    public View m9924D(ViewGroup viewGroup, int i) {
        switch (i) {
            case 2:
                return this.f6925d.m1542H2().inflate(f6c0.f12085Z4, viewGroup, false);
            case CameraSticker.STATE_COMPLETE /* 3 */:
                return this.f6925d.m1542H2().inflate(f6c0.f12119b5, viewGroup, false);
            case CameraSticker.STATE_ERROR /* 4 */:
                IntlPrivilegeShowcaseWrapper intlPrivilegeShowcaseWrapper = this.f6928g;
                if (intlPrivilegeShowcaseWrapper != null) {
                    return intlPrivilegeShowcaseWrapper;
                }
                IntlPrivilegeShowcaseWrapper intlPrivilegeShowcaseWrapper2 = (IntlPrivilegeShowcaseWrapper) this.f6925d.m1542H2().inflate(f6c0.f12170e5, viewGroup, false);
                this.f6928g = intlPrivilegeShowcaseWrapper2;
                intlPrivilegeShowcaseWrapper2.setUpShowcaseComponent(this.f6926e);
                return this.f6928g;
            case 5:
                return this.f6925d.m1542H2().inflate(f6c0.f12153d5, viewGroup, false);
            case 6:
                return this.f6925d.m1542H2().inflate(f6c0.f12187f5, viewGroup, false);
            case 7:
                return this.f6925d.m1542H2().inflate(f6c0.f12136c5, viewGroup, false);
            case 8:
                return this.f6925d.m1542H2().inflate(f6c0.f12238i5, viewGroup, false);
            default:
                return new View(this.f6925d.getContext());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public void m9922A(View view, txo txoVar, int i, int i2) {
        if (i == 2) {
            ((IntlPrivilegeDescListImageItem) view).m9929b((IntlPrivilegeDescListImageItem.C0387a) getItem(i2));
            return;
        }
        if (i == 4) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.height = -2;
            view.setLayoutParams(layoutParams);
            ((r1p) getItem(i2)).m22596e((IntlPrivilegeShowcaseWrapper) view);
            return;
        }
        if (i == 5) {
            ((IntlPrivilegePolicyItem) view).m9959Q((IntlPrivilegePolicyItem.C0391a) getItem(i2), this.f6925d);
            return;
        }
        if (i == 3) {
            ((IntlPrivilegeDescListSeeItem) view).m9940b((IntlPrivilegeDescListSeeItem.C0390a) getItem(i2));
            return;
        }
        if (i == 6) {
            ((IntlPrivilegeSubscriptionItem) view).m9964b((IntlPrivilegeSubscriptionItem.C0392a) getItem(i2), this.f6925d);
        } else if (i == 7) {
            ((IntlPrivilegeExclusivePrivilegeView) view).m9950i(((a) getItem(i2)).f6929a, this.f6925d);
        } else if (i == 8) {
            ((IntlPrivilegeUnlockBenefitsView) view).m9971g(((IntlPrivilegeUnlockBenefitsView.C0395c) getItem(i2)).f6998a, this.f6925d);
        }
    }

    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public txo getItem(int i) {
        return this.f6924c.get(i);
    }

    /* JADX INFO: renamed from: G */
    public void m9927G(ArrayList<txo> arrayList) {
        this.f6924c = arrayList;
        notifyDataSetChanged();
    }

    public int getItemViewType(int i) {
        return getItem(i).getItemType();
    }
}
