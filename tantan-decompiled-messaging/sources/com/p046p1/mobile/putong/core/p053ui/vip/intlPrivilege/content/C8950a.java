package com.p046p1.mobile.putong.core.p053ui.vip.intlPrivilege.content;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.p053ui.vip.intlPrivilege.IntlVipNewUiFrag;
import com.p046p1.mobile.putong.core.p053ui.vip.intlPrivilege.content.item.IntlPrivilegeDescListImageItem;
import com.p046p1.mobile.putong.core.p053ui.vip.intlPrivilege.content.item.IntlPrivilegeDescListSeeItem;
import com.p046p1.mobile.putong.core.p053ui.vip.intlPrivilege.content.item.IntlPrivilegeExclusivePrivilegeView;
import com.p046p1.mobile.putong.core.p053ui.vip.intlPrivilege.content.item.IntlPrivilegePolicyItem;
import com.p046p1.mobile.putong.core.p053ui.vip.intlPrivilege.content.item.IntlPrivilegeShowcaseWrapper;
import com.p046p1.mobile.putong.core.p053ui.vip.intlPrivilege.content.item.IntlPrivilegeSubscriptionItem;
import com.p046p1.mobile.putong.core.p053ui.vip.intlPrivilege.content.item.IntlPrivilegeUnlockBenefitsView;
import java.util.ArrayList;
import p149l.c3m;
import p149l.dac0;
import p149l.f6c0;
import p149l.hxo;
import p149l.r1p;
import p149l.txo;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.intlPrivilege.content.a */
/* JADX INFO: loaded from: classes9.dex */
public class C8950a extends dac0<txo> {

    /* JADX INFO: renamed from: c */
    public ArrayList<txo> f37143c;

    /* JADX INFO: renamed from: d */
    public final IntlVipNewUiFrag f37144d;

    /* JADX INFO: renamed from: e */
    public final c3m f37145e;

    /* JADX INFO: renamed from: f */
    public final hxo f37146f;

    /* JADX INFO: renamed from: g */
    public IntlPrivilegeShowcaseWrapper f37147g;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.intlPrivilege.content.a$a */
    public static class a implements txo {

        /* JADX INFO: renamed from: a */
        public PurchaseType f37148a;

        public a(PurchaseType purchaseType) {
            this.f37148a = purchaseType;
        }

        @Override // p149l.txo
        public int getItemType() {
            return 7;
        }
    }

    public C8950a(IntlVipNewUiFrag intlVipNewUiFrag, c3m c3mVar, hxo hxoVar) {
        this.f37144d = intlVipNewUiFrag;
        this.f37145e = c3mVar;
        this.f37146f = hxoVar;
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f37143c.size();
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: D */
    public View mo28825D(ViewGroup viewGroup, int i) {
        switch (i) {
            case 2:
                return this.f37144d.mo20578H2().inflate(f6c0.f95671Z4, viewGroup, false);
            case 3:
                return this.f37144d.mo20578H2().inflate(f6c0.f95705b5, viewGroup, false);
            case 4:
                IntlPrivilegeShowcaseWrapper intlPrivilegeShowcaseWrapper = this.f37147g;
                if (intlPrivilegeShowcaseWrapper != null) {
                    return intlPrivilegeShowcaseWrapper;
                }
                IntlPrivilegeShowcaseWrapper intlPrivilegeShowcaseWrapper2 = (IntlPrivilegeShowcaseWrapper) this.f37144d.mo20578H2().inflate(f6c0.f95756e5, viewGroup, false);
                this.f37147g = intlPrivilegeShowcaseWrapper2;
                intlPrivilegeShowcaseWrapper2.setUpShowcaseComponent(this.f37145e);
                return this.f37147g;
            case 5:
                return this.f37144d.mo20578H2().inflate(f6c0.f95739d5, viewGroup, false);
            case 6:
                return this.f37144d.mo20578H2().inflate(f6c0.f95773f5, viewGroup, false);
            case 7:
                return this.f37144d.mo20578H2().inflate(f6c0.f95722c5, viewGroup, false);
            case 8:
                return this.f37144d.mo20578H2().inflate(f6c0.f95824i5, viewGroup, false);
            default:
                return new View(this.f37144d.getContext());
        }
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public void mo28823A(View view, txo txoVar, int i, int i2) {
        if (i == 2) {
            ((IntlPrivilegeDescListImageItem) view).m56488b((IntlPrivilegeDescListImageItem.C8951a) getItem(i2));
            return;
        }
        if (i == 4) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.height = -2;
            view.setLayoutParams(layoutParams);
            ((r1p) getItem(i2)).m177537e((IntlPrivilegeShowcaseWrapper) view);
            return;
        }
        if (i == 5) {
            ((IntlPrivilegePolicyItem) view).m56518Q((IntlPrivilegePolicyItem.C8955a) getItem(i2), this.f37144d);
            return;
        }
        if (i == 3) {
            ((IntlPrivilegeDescListSeeItem) view).m56499b((IntlPrivilegeDescListSeeItem.C8954a) getItem(i2));
            return;
        }
        if (i == 6) {
            ((IntlPrivilegeSubscriptionItem) view).m56523b((IntlPrivilegeSubscriptionItem.C8956a) getItem(i2), this.f37144d);
        } else if (i == 7) {
            ((IntlPrivilegeExclusivePrivilegeView) view).m56509i(((a) getItem(i2)).f37148a, this.f37144d);
        } else if (i == 8) {
            ((IntlPrivilegeUnlockBenefitsView) view).m56530g(((IntlPrivilegeUnlockBenefitsView.C8959c) getItem(i2)).f37217a, this.f37144d);
        }
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public txo getItem(int i) {
        return this.f37143c.get(i);
    }

    /* JADX INFO: renamed from: G */
    public void m56486G(ArrayList<txo> arrayList) {
        this.f37143c = arrayList;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return getItem(i).getItemType();
    }
}
