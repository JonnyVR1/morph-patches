package com.p051p1.mobile.putong.core.p058ui.vip.intlPrivilege.content;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.p058ui.vip.intlPrivilege.IntlVipNewUiFrag;
import com.p051p1.mobile.putong.core.p058ui.vip.intlPrivilege.content.item.IntlPrivilegeDescListImageItem;
import com.p051p1.mobile.putong.core.p058ui.vip.intlPrivilege.content.item.IntlPrivilegeDescListSeeItem;
import com.p051p1.mobile.putong.core.p058ui.vip.intlPrivilege.content.item.IntlPrivilegeExclusivePrivilegeView;
import com.p051p1.mobile.putong.core.p058ui.vip.intlPrivilege.content.item.IntlPrivilegePolicyItem;
import com.p051p1.mobile.putong.core.p058ui.vip.intlPrivilege.content.item.IntlPrivilegeShowcaseWrapper;
import com.p051p1.mobile.putong.core.p058ui.vip.intlPrivilege.content.item.IntlPrivilegeSubscriptionItem;
import com.p051p1.mobile.putong.core.p058ui.vip.intlPrivilege.content.item.IntlPrivilegeUnlockBenefitsView;
import java.util.ArrayList;
import p153l.hzo;
import p153l.jic0;
import p153l.kec0;
import p153l.r3p;
import p153l.t5m;
import p153l.tzo;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.intlPrivilege.content.a */
/* JADX INFO: loaded from: classes12.dex */
public class C9113a extends jic0<tzo> {

    /* JADX INFO: renamed from: c */
    public ArrayList<tzo> f37991c;

    /* JADX INFO: renamed from: d */
    public final IntlVipNewUiFrag f37992d;

    /* JADX INFO: renamed from: e */
    public final t5m f37993e;

    /* JADX INFO: renamed from: f */
    public final hzo f37994f;

    /* JADX INFO: renamed from: g */
    public IntlPrivilegeShowcaseWrapper f37995g;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.intlPrivilege.content.a$a */
    public static class a implements tzo {

        /* JADX INFO: renamed from: a */
        public PurchaseType f37996a;

        public a(PurchaseType purchaseType) {
            this.f37996a = purchaseType;
        }

        @Override // p153l.tzo
        public int getItemType() {
            return 7;
        }
    }

    public C9113a(IntlVipNewUiFrag intlVipNewUiFrag, t5m t5mVar, hzo hzoVar) {
        this.f37992d = intlVipNewUiFrag;
        this.f37993e = t5mVar;
        this.f37994f = hzoVar;
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f37991c.size();
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: D */
    public View mo29824D(ViewGroup viewGroup, int i) {
        switch (i) {
            case 2:
                return this.f37992d.mo21577H2().inflate(kec0.f125742a5, viewGroup, false);
            case 3:
                return this.f37992d.mo21577H2().inflate(kec0.f125776c5, viewGroup, false);
            case 4:
                IntlPrivilegeShowcaseWrapper intlPrivilegeShowcaseWrapper = this.f37995g;
                if (intlPrivilegeShowcaseWrapper != null) {
                    return intlPrivilegeShowcaseWrapper;
                }
                IntlPrivilegeShowcaseWrapper intlPrivilegeShowcaseWrapper2 = (IntlPrivilegeShowcaseWrapper) this.f37992d.mo21577H2().inflate(kec0.f125827f5, viewGroup, false);
                this.f37995g = intlPrivilegeShowcaseWrapper2;
                intlPrivilegeShowcaseWrapper2.setUpShowcaseComponent(this.f37993e);
                return this.f37995g;
            case 5:
                return this.f37992d.mo21577H2().inflate(kec0.f125810e5, viewGroup, false);
            case 6:
                return this.f37992d.mo21577H2().inflate(kec0.f125844g5, viewGroup, false);
            case 7:
                return this.f37992d.mo21577H2().inflate(kec0.f125793d5, viewGroup, false);
            case 8:
                return this.f37992d.mo21577H2().inflate(kec0.f125894j5, viewGroup, false);
            default:
                return new View(this.f37992d.getContext());
        }
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public void mo29822A(View view, tzo tzoVar, int i, int i2) {
        if (i == 2) {
            ((IntlPrivilegeDescListImageItem) view).m57671b((IntlPrivilegeDescListImageItem.C9114a) getItem(i2));
            return;
        }
        if (i == 4) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.height = -2;
            view.setLayoutParams(layoutParams);
            ((r3p) getItem(i2)).m179661e((IntlPrivilegeShowcaseWrapper) view);
            return;
        }
        if (i == 5) {
            ((IntlPrivilegePolicyItem) view).m57701Q((IntlPrivilegePolicyItem.C9118a) getItem(i2), this.f37992d);
            return;
        }
        if (i == 3) {
            ((IntlPrivilegeDescListSeeItem) view).m57682b((IntlPrivilegeDescListSeeItem.C9117a) getItem(i2));
            return;
        }
        if (i == 6) {
            ((IntlPrivilegeSubscriptionItem) view).m57706b((IntlPrivilegeSubscriptionItem.C9119a) getItem(i2), this.f37992d);
        } else if (i == 7) {
            ((IntlPrivilegeExclusivePrivilegeView) view).m57692i(((a) getItem(i2)).f37996a, this.f37992d);
        } else if (i == 8) {
            ((IntlPrivilegeUnlockBenefitsView) view).m57713g(((IntlPrivilegeUnlockBenefitsView.C9122c) getItem(i2)).f38065a, this.f37992d);
        }
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public tzo getItem(int i) {
        return this.f37991c.get(i);
    }

    /* JADX INFO: renamed from: G */
    public void m57669G(ArrayList<tzo> arrayList) {
        this.f37991c = arrayList;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return getItem(i).getItemType();
    }
}
