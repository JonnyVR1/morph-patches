package p006l;

import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.account.data.CameraSticker;
import com.p000p1.mobile.putong.core.p004ui.vip.privilege.content.item.C0439a;
import com.p000p1.mobile.putong.core.p004ui.vip.privilege.content.item.PrivilegeDescListDiamondServiceItem;
import com.p000p1.mobile.putong.core.p004ui.vip.privilege.content.item.PrivilegeDescListDiamondSkinItem;
import com.p000p1.mobile.putong.core.p004ui.vip.privilege.content.item.PrivilegeDescListItem;
import com.p000p1.mobile.putong.core.p004ui.vip.privilege.content.item.PrivilegeDescListNearbyItem;
import com.p000p1.mobile.putong.core.p004ui.vip.privilege.content.item.PrivilegeDescListNoSVipItem;
import com.p000p1.mobile.putong.core.p004ui.vip.privilege.content.item.PrivilegeDescListPartnerDressUpItem;
import com.p000p1.mobile.putong.core.p004ui.vip.privilege.content.item.PrivilegeDescListPrivateCustomExtraItem;
import com.p000p1.mobile.putong.core.p004ui.vip.privilege.content.item.PrivilegeDescListSeeItem;
import com.p000p1.mobile.putong.core.p004ui.vip.privilege.content.item.PrivilegeDescListShowcaseItem;
import com.p000p1.mobile.putong.core.p004ui.vip.privilege.content.item.PrivilegeDescListSvipContainerItem;
import com.p000p1.mobile.putong.core.p004ui.vip.privilege.content.item.PrivilegeDescListTitle;
import com.p000p1.mobile.putong.core.p004ui.vip.privilege.content.item.PrivilegeDescListTopChatItem;
import com.p000p1.mobile.putong.core.p004ui.vip.privilege.content.item.PrivilegeDescListVisitorItem;
import com.p000p1.mobile.putong.core.p004ui.vip.privilege.vipfrag.VipFrag;
import com.p1.mobile.putong.core.data.PurchaseType;
import java.util.ArrayList;
import l.d30;
import l.dac0;
import l.sab0;
import l.wek0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class qu80 extends dac0<dv80> {

    /* JADX INFO: renamed from: c */
    public ArrayList<dv80> f20077c;

    /* JADX INFO: renamed from: d */
    public final VipFrag f20078d;

    /* JADX INFO: renamed from: e */
    public final c3m f20079e;

    /* JADX INFO: renamed from: f */
    public final ku80 f20080f;

    /* JADX INFO: renamed from: g */
    public final PurchaseType f20081g;

    public qu80(VipFrag vipFrag, c3m c3mVar, ku80 ku80Var, PurchaseType purchaseType) {
        this.f20078d = vipFrag;
        this.f20079e = c3mVar;
        this.f20080f = ku80Var;
        this.f20081g = purchaseType;
    }

    /* JADX INFO: renamed from: G */
    private String m22417G() {
        if (sab0.i(this.f20081g)) {
            return "PrivilegeODiamondContent";
        }
        return sab0.o(this.f20081g) ? "PrivilegePlatinumContent" : wek0.a;
    }

    /* JADX INFO: renamed from: C */
    public int m22419C() {
        return this.f20077c.size();
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [android.view.View, com.p1.mobile.putong.core.ui.vip.privilege.content.item.PrivilegeDescListPrivateCustomExtraItem] */
    /* JADX INFO: renamed from: D */
    public View m22420D(ViewGroup viewGroup, int i) {
        switch (i) {
            case 0:
            case 5:
                return this.f20078d.m1542H2().inflate(f6c0.f12140c9, viewGroup, false);
            case 1:
                return this.f20078d.m1542H2().inflate(f6c0.f12009U8, viewGroup, false);
            case 2:
                return this.f20078d.m1542H2().inflate(f6c0.f12041W8, viewGroup, false);
            case CameraSticker.STATE_COMPLETE /* 3 */:
                return this.f20078d.m1542H2().inflate(f6c0.f12089Z8, viewGroup, false);
            case CameraSticker.STATE_ERROR /* 4 */:
                return this.f20078d.m1542H2().inflate(f6c0.f12123b9, viewGroup, false);
            case 6:
                return this.f20078d.m1542H2().inflate(f6c0.f11961R8, viewGroup, false);
            case 7:
                return this.f20078d.m1542H2().inflate(f6c0.f12174e9, viewGroup, false);
            case 8:
                return this.f20078d.m1542H2().inflate(f6c0.f11977S8, viewGroup, false);
            case 9:
                return this.f20078d.m1542H2().inflate(f6c0.f12157d9, viewGroup, false);
            case 10:
                return this.f20078d.m1542H2().inflate(f6c0.f12191f9, viewGroup, false);
            case 11:
                return this.f20078d.m1542H2().inflate(f6c0.f12025V8, viewGroup, false);
            case 12:
                PrivilegeDescListShowcaseItem privilegeDescListShowcaseItem = (PrivilegeDescListShowcaseItem) this.f20078d.m1542H2().inflate(f6c0.f12106a9, viewGroup, false);
                privilegeDescListShowcaseItem.m10733i(this.f20078d, this.f20081g, m22417G(), this.f20078d.m10911Q4(this.f20081g));
                return privilegeDescListShowcaseItem;
            case 13:
                ?? r4 = (PrivilegeDescListPrivateCustomExtraItem) this.f20078d.m1542H2().inflate(f6c0.f12057X8, viewGroup, false);
                r4.m10687r0(this.f20078d, this.f20081g, m22417G(), this.f20078d.m10911Q4(this.f20081g));
                return r4;
            default:
                return new View(this.f20078d.getContext());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void m22418A(View view, dv80 dv80Var, int i, int i2) {
        if (i == 1) {
            ((PrivilegeDescListItem) view).m10595h((PrivilegeDescListItem.C0424a) getItem(i2), this, this.f20078d);
            return;
        }
        if (i == 0) {
            ((PrivilegeDescListTitle) view).m10751d((PrivilegeDescListTitle.C0435a) getItem(i2));
            return;
        }
        if (i == 2) {
            ((PrivilegeDescListNoSVipItem) view).m10639n(this, this.f20078d, (PrivilegeDescListNoSVipItem.C0427a) getItem(i2), this.f20081g);
            return;
        }
        if (i == 3) {
            ((PrivilegeDescListSeeItem) view).m10710j(this, this.f20078d, (PrivilegeDescListSeeItem.C0432a) getItem(i2), this.f20081g);
            return;
        }
        if (i == 4) {
            ((PrivilegeDescListSvipContainerItem) view).m10747f((C0439a) getItem(i2), this.f20081g);
            return;
        }
        if (i == 12) {
            ((PrivilegeDescListShowcaseItem) view).m10736l((PrivilegeDescListShowcaseItem.C0434a) getItem(i2));
            return;
        }
        if (i == 5) {
            ((PrivilegeDescListTitle) view).m10751d((PrivilegeDescListTitle.C0435a) getItem(i2));
            return;
        }
        if (i == 6) {
            ((PrivilegeDescListDiamondSkinItem) view).m10585i((PrivilegeDescListDiamondSkinItem.C0423a) getItem(i2), this, this.f20078d, this.f20081g);
            return;
        }
        if (i == 7) {
            ((PrivilegeDescListVisitorItem) view).m10784r(this, this.f20078d, (PrivilegeDescListVisitorItem.C0437a) getItem(i2), this.f20081g);
            return;
        }
        if (i == 8) {
            ((PrivilegeDescListDiamondServiceItem) view).m10573w((PrivilegeDescListDiamondServiceItem.C0422a) getItem(i2));
            return;
        }
        if (i == 9) {
            final PrivilegeDescListTopChatItem.C0436a c0436a = (PrivilegeDescListTopChatItem.C0436a) getItem(i2);
            ((PrivilegeDescListTopChatItem) view).m10764f(this, this.f20078d, c0436a, this.f20081g, new d30() { // from class: l.pu80
                public final void call() {
                    this.f19342a.m22423I(c0436a);
                }
            });
        } else if (i == 10) {
            ((PrivilegeDescListPartnerDressUpItem) view).m10661p((PrivilegeDescListPartnerDressUpItem.C0428a) getItem(i2), this, this.f20078d);
        } else if (i == 11) {
            ((PrivilegeDescListNearbyItem) view).m10611h(this, this.f20078d, (PrivilegeDescListNearbyItem.C0425a) getItem(i2), this.f20081g);
        } else if (i == 13) {
            ((PrivilegeDescListPrivateCustomExtraItem) view).m10682B0(this, this.f20078d, (PrivilegeDescListPrivateCustomExtraItem.C0430b) getItem(i2), this.f20081g);
        }
    }

    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public dv80 getItem(int i) {
        return this.f20077c.get(i);
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m22423I(PrivilegeDescListTopChatItem.C0436a c0436a) {
        this.f20077c.remove(c0436a);
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: J */
    public void m22424J(ArrayList<dv80> arrayList) {
        this.f20077c = arrayList;
        notifyDataSetChanged();
    }

    public int getItemViewType(int i) {
        return getItem(i).getItemType();
    }
}
