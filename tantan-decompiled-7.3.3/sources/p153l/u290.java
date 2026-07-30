package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.p058ui.vip.privilege.content.item.C9166a;
import com.p051p1.mobile.putong.core.p058ui.vip.privilege.content.item.PrivilegeDescListDiamondServiceItem;
import com.p051p1.mobile.putong.core.p058ui.vip.privilege.content.item.PrivilegeDescListDiamondSkinItem;
import com.p051p1.mobile.putong.core.p058ui.vip.privilege.content.item.PrivilegeDescListItem;
import com.p051p1.mobile.putong.core.p058ui.vip.privilege.content.item.PrivilegeDescListNearbyItem;
import com.p051p1.mobile.putong.core.p058ui.vip.privilege.content.item.PrivilegeDescListNoSVipItem;
import com.p051p1.mobile.putong.core.p058ui.vip.privilege.content.item.PrivilegeDescListPartnerDressUpItem;
import com.p051p1.mobile.putong.core.p058ui.vip.privilege.content.item.PrivilegeDescListPrivateCustomExtraItem;
import com.p051p1.mobile.putong.core.p058ui.vip.privilege.content.item.PrivilegeDescListSeeItem;
import com.p051p1.mobile.putong.core.p058ui.vip.privilege.content.item.PrivilegeDescListShowcaseItem;
import com.p051p1.mobile.putong.core.p058ui.vip.privilege.content.item.PrivilegeDescListSvipContainerItem;
import com.p051p1.mobile.putong.core.p058ui.vip.privilege.content.item.PrivilegeDescListTitle;
import com.p051p1.mobile.putong.core.p058ui.vip.privilege.content.item.PrivilegeDescListTopChatItem;
import com.p051p1.mobile.putong.core.p058ui.vip.privilege.content.item.PrivilegeDescListVisitorItem;
import com.p051p1.mobile.putong.core.p058ui.vip.privilege.vipfrag.VipFrag;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes12.dex */
public class u290 extends jic0<h390> {

    /* JADX INFO: renamed from: c */
    public ArrayList<h390> f177192c;

    /* JADX INFO: renamed from: d */
    public final VipFrag f177193d;

    /* JADX INFO: renamed from: e */
    public final t5m f177194e;

    /* JADX INFO: renamed from: f */
    public final o290 f177195f;

    /* JADX INFO: renamed from: g */
    public final PurchaseType f177196g;

    public u290(VipFrag vipFrag, t5m t5mVar, o290 o290Var, PurchaseType purchaseType) {
        this.f177193d = vipFrag;
        this.f177194e = t5mVar;
        this.f177195f = o290Var;
        this.f177196g = purchaseType;
    }

    /* JADX INFO: renamed from: G */
    private String m194249G() {
        if (wib0.m206565i(this.f177196g)) {
            return "PrivilegeODiamondContent";
        }
        return wib0.m206571o(this.f177196g) ? "PrivilegePlatinumContent" : cok0.f82895a;
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f177192c.size();
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: D */
    public View mo29824D(ViewGroup viewGroup, int i) {
        switch (i) {
            case 0:
            case 5:
                return this.f177193d.mo21577H2().inflate(kec0.f125898j9, viewGroup, false);
            case 1:
                return this.f177193d.mo21577H2().inflate(kec0.f125763b9, viewGroup, false);
            case 2:
                return this.f177193d.mo21577H2().inflate(kec0.f125797d9, viewGroup, false);
            case 3:
                return this.f177193d.mo21577H2().inflate(kec0.f125848g9, viewGroup, false);
            case 4:
                return this.f177193d.mo21577H2().inflate(kec0.f125882i9, viewGroup, false);
            case 6:
                return this.f177193d.mo21577H2().inflate(kec0.f125713Y8, viewGroup, false);
            case 7:
                return this.f177193d.mo21577H2().inflate(kec0.f125932l9, viewGroup, false);
            case 8:
                return this.f177193d.mo21577H2().inflate(kec0.f125729Z8, viewGroup, false);
            case 9:
                return this.f177193d.mo21577H2().inflate(kec0.f125915k9, viewGroup, false);
            case 10:
                return this.f177193d.mo21577H2().inflate(kec0.f125949m9, viewGroup, false);
            case 11:
                return this.f177193d.mo21577H2().inflate(kec0.f125780c9, viewGroup, false);
            case 12:
                PrivilegeDescListShowcaseItem privilegeDescListShowcaseItem = (PrivilegeDescListShowcaseItem) this.f177193d.mo21577H2().inflate(kec0.f125865h9, viewGroup, false);
                privilegeDescListShowcaseItem.m58436i(this.f177193d, this.f177196g, m194249G(), this.f177193d.m58608Q4(this.f177196g));
                return privilegeDescListShowcaseItem;
            case 13:
                PrivilegeDescListPrivateCustomExtraItem privilegeDescListPrivateCustomExtraItem = (PrivilegeDescListPrivateCustomExtraItem) this.f177193d.mo21577H2().inflate(kec0.f125814e9, viewGroup, false);
                privilegeDescListPrivateCustomExtraItem.m58396r0(this.f177193d, this.f177196g, m194249G(), this.f177193d.m58608Q4(this.f177196g));
                return privilegeDescListPrivateCustomExtraItem;
            default:
                return new View(this.f177193d.getContext());
        }
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void mo29822A(View view, h390 h390Var, int i, int i2) throws Exception {
        if (i == 1) {
            ((PrivilegeDescListItem) view).m58307h((PrivilegeDescListItem.C9151a) getItem(i2), this, this.f177193d);
            return;
        }
        if (i == 0) {
            ((PrivilegeDescListTitle) view).m58454d((PrivilegeDescListTitle.C9162a) getItem(i2));
            return;
        }
        if (i == 2) {
            ((PrivilegeDescListNoSVipItem) view).m58348n(this, this.f177193d, (PrivilegeDescListNoSVipItem.C9154a) getItem(i2), this.f177196g);
            return;
        }
        if (i == 3) {
            ((PrivilegeDescListSeeItem) view).m58416j(this, this.f177193d, (PrivilegeDescListSeeItem.C9159a) getItem(i2), this.f177196g);
            return;
        }
        if (i == 4) {
            ((PrivilegeDescListSvipContainerItem) view).m58450f((C9166a) getItem(i2), this.f177196g);
            return;
        }
        if (i == 12) {
            ((PrivilegeDescListShowcaseItem) view).m58439l((PrivilegeDescListShowcaseItem.C9161a) getItem(i2));
            return;
        }
        if (i == 5) {
            ((PrivilegeDescListTitle) view).m58454d((PrivilegeDescListTitle.C9162a) getItem(i2));
            return;
        }
        if (i == 6) {
            ((PrivilegeDescListDiamondSkinItem) view).m58297i((PrivilegeDescListDiamondSkinItem.C9150a) getItem(i2), this, this.f177193d, this.f177196g);
            return;
        }
        if (i == 7) {
            ((PrivilegeDescListVisitorItem) view).m58487r(this, this.f177193d, (PrivilegeDescListVisitorItem.C9164a) getItem(i2), this.f177196g);
            return;
        }
        if (i == 8) {
            ((PrivilegeDescListDiamondServiceItem) view).m58285w((PrivilegeDescListDiamondServiceItem.C9149a) getItem(i2));
            return;
        }
        if (i == 9) {
            final PrivilegeDescListTopChatItem.C9163a c9163a = (PrivilegeDescListTopChatItem.C9163a) getItem(i2);
            ((PrivilegeDescListTopChatItem) view).m58467f(this, this.f177193d, c9163a, this.f177196g, new x20() { // from class: l.t290
                @Override // p153l.x20
                public final void call() {
                    this.f171727a.m194252I(c9163a);
                }
            });
        } else if (i == 10) {
            ((PrivilegeDescListPartnerDressUpItem) view).m58370p((PrivilegeDescListPartnerDressUpItem.C9155a) getItem(i2), this, this.f177193d);
        } else if (i == 11) {
            ((PrivilegeDescListNearbyItem) view).m58323h(this, this.f177193d, (PrivilegeDescListNearbyItem.C9152a) getItem(i2), this.f177196g);
        } else if (i == 13) {
            ((PrivilegeDescListPrivateCustomExtraItem) view).m58391B0(this, this.f177193d, (PrivilegeDescListPrivateCustomExtraItem.C9157b) getItem(i2), this.f177196g);
        }
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public h390 getItem(int i) {
        return this.f177192c.get(i);
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m194252I(PrivilegeDescListTopChatItem.C9163a c9163a) {
        this.f177192c.remove(c9163a);
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: J */
    public void m194253J(ArrayList<h390> arrayList) {
        this.f177192c = arrayList;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return getItem(i).getItemType();
    }
}
