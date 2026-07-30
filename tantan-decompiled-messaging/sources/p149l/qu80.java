package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.p053ui.vip.privilege.content.item.C9003a;
import com.p046p1.mobile.putong.core.p053ui.vip.privilege.content.item.PrivilegeDescListDiamondServiceItem;
import com.p046p1.mobile.putong.core.p053ui.vip.privilege.content.item.PrivilegeDescListDiamondSkinItem;
import com.p046p1.mobile.putong.core.p053ui.vip.privilege.content.item.PrivilegeDescListItem;
import com.p046p1.mobile.putong.core.p053ui.vip.privilege.content.item.PrivilegeDescListNearbyItem;
import com.p046p1.mobile.putong.core.p053ui.vip.privilege.content.item.PrivilegeDescListNoSVipItem;
import com.p046p1.mobile.putong.core.p053ui.vip.privilege.content.item.PrivilegeDescListPartnerDressUpItem;
import com.p046p1.mobile.putong.core.p053ui.vip.privilege.content.item.PrivilegeDescListPrivateCustomExtraItem;
import com.p046p1.mobile.putong.core.p053ui.vip.privilege.content.item.PrivilegeDescListSeeItem;
import com.p046p1.mobile.putong.core.p053ui.vip.privilege.content.item.PrivilegeDescListShowcaseItem;
import com.p046p1.mobile.putong.core.p053ui.vip.privilege.content.item.PrivilegeDescListSvipContainerItem;
import com.p046p1.mobile.putong.core.p053ui.vip.privilege.content.item.PrivilegeDescListTitle;
import com.p046p1.mobile.putong.core.p053ui.vip.privilege.content.item.PrivilegeDescListTopChatItem;
import com.p046p1.mobile.putong.core.p053ui.vip.privilege.content.item.PrivilegeDescListVisitorItem;
import com.p046p1.mobile.putong.core.p053ui.vip.privilege.vipfrag.VipFrag;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
public class qu80 extends dac0<dv80> {

    /* JADX INFO: renamed from: c */
    public ArrayList<dv80> f156455c;

    /* JADX INFO: renamed from: d */
    public final VipFrag f156456d;

    /* JADX INFO: renamed from: e */
    public final c3m f156457e;

    /* JADX INFO: renamed from: f */
    public final ku80 f156458f;

    /* JADX INFO: renamed from: g */
    public final PurchaseType f156459g;

    public qu80(VipFrag vipFrag, c3m c3mVar, ku80 ku80Var, PurchaseType purchaseType) {
        this.f156456d = vipFrag;
        this.f156457e = c3mVar;
        this.f156458f = ku80Var;
        this.f156459g = purchaseType;
    }

    /* JADX INFO: renamed from: G */
    private String m176576G() {
        if (sab0.m182891i(this.f156459g)) {
            return "PrivilegeODiamondContent";
        }
        return sab0.m182897o(this.f156459g) ? "PrivilegePlatinumContent" : wek0.f185947a;
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f156455c.size();
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: D */
    public View mo28825D(ViewGroup viewGroup, int i) {
        switch (i) {
            case 0:
            case 5:
                return this.f156456d.mo20578H2().inflate(f6c0.f95726c9, viewGroup, false);
            case 1:
                return this.f156456d.mo20578H2().inflate(f6c0.f95595U8, viewGroup, false);
            case 2:
                return this.f156456d.mo20578H2().inflate(f6c0.f95627W8, viewGroup, false);
            case 3:
                return this.f156456d.mo20578H2().inflate(f6c0.f95675Z8, viewGroup, false);
            case 4:
                return this.f156456d.mo20578H2().inflate(f6c0.f95709b9, viewGroup, false);
            case 6:
                return this.f156456d.mo20578H2().inflate(f6c0.f95547R8, viewGroup, false);
            case 7:
                return this.f156456d.mo20578H2().inflate(f6c0.f95760e9, viewGroup, false);
            case 8:
                return this.f156456d.mo20578H2().inflate(f6c0.f95563S8, viewGroup, false);
            case 9:
                return this.f156456d.mo20578H2().inflate(f6c0.f95743d9, viewGroup, false);
            case 10:
                return this.f156456d.mo20578H2().inflate(f6c0.f95777f9, viewGroup, false);
            case 11:
                return this.f156456d.mo20578H2().inflate(f6c0.f95611V8, viewGroup, false);
            case 12:
                PrivilegeDescListShowcaseItem privilegeDescListShowcaseItem = (PrivilegeDescListShowcaseItem) this.f156456d.mo20578H2().inflate(f6c0.f95692a9, viewGroup, false);
                privilegeDescListShowcaseItem.m57253i(this.f156456d, this.f156459g, m176576G(), this.f156456d.m57425Q4(this.f156459g));
                return privilegeDescListShowcaseItem;
            case 13:
                PrivilegeDescListPrivateCustomExtraItem privilegeDescListPrivateCustomExtraItem = (PrivilegeDescListPrivateCustomExtraItem) this.f156456d.mo20578H2().inflate(f6c0.f95643X8, viewGroup, false);
                privilegeDescListPrivateCustomExtraItem.m57213r0(this.f156456d, this.f156459g, m176576G(), this.f156456d.m57425Q4(this.f156459g));
                return privilegeDescListPrivateCustomExtraItem;
            default:
                return new View(this.f156456d.getContext());
        }
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void mo28823A(View view, dv80 dv80Var, int i, int i2) throws Exception {
        if (i == 1) {
            ((PrivilegeDescListItem) view).m57124h((PrivilegeDescListItem.C8988a) getItem(i2), this, this.f156456d);
            return;
        }
        if (i == 0) {
            ((PrivilegeDescListTitle) view).m57271d((PrivilegeDescListTitle.C8999a) getItem(i2));
            return;
        }
        if (i == 2) {
            ((PrivilegeDescListNoSVipItem) view).m57165n(this, this.f156456d, (PrivilegeDescListNoSVipItem.C8991a) getItem(i2), this.f156459g);
            return;
        }
        if (i == 3) {
            ((PrivilegeDescListSeeItem) view).m57233j(this, this.f156456d, (PrivilegeDescListSeeItem.C8996a) getItem(i2), this.f156459g);
            return;
        }
        if (i == 4) {
            ((PrivilegeDescListSvipContainerItem) view).m57267f((C9003a) getItem(i2), this.f156459g);
            return;
        }
        if (i == 12) {
            ((PrivilegeDescListShowcaseItem) view).m57256l((PrivilegeDescListShowcaseItem.C8998a) getItem(i2));
            return;
        }
        if (i == 5) {
            ((PrivilegeDescListTitle) view).m57271d((PrivilegeDescListTitle.C8999a) getItem(i2));
            return;
        }
        if (i == 6) {
            ((PrivilegeDescListDiamondSkinItem) view).m57114i((PrivilegeDescListDiamondSkinItem.C8987a) getItem(i2), this, this.f156456d, this.f156459g);
            return;
        }
        if (i == 7) {
            ((PrivilegeDescListVisitorItem) view).m57304r(this, this.f156456d, (PrivilegeDescListVisitorItem.C9001a) getItem(i2), this.f156459g);
            return;
        }
        if (i == 8) {
            ((PrivilegeDescListDiamondServiceItem) view).m57102w((PrivilegeDescListDiamondServiceItem.C8986a) getItem(i2));
            return;
        }
        if (i == 9) {
            final PrivilegeDescListTopChatItem.C9000a c9000a = (PrivilegeDescListTopChatItem.C9000a) getItem(i2);
            ((PrivilegeDescListTopChatItem) view).m57284f(this, this.f156456d, c9000a, this.f156459g, new d30() { // from class: l.pu80
                @Override // p149l.d30
                public final void call() {
                    this.f151259a.m176579I(c9000a);
                }
            });
        } else if (i == 10) {
            ((PrivilegeDescListPartnerDressUpItem) view).m57187p((PrivilegeDescListPartnerDressUpItem.C8992a) getItem(i2), this, this.f156456d);
        } else if (i == 11) {
            ((PrivilegeDescListNearbyItem) view).m57140h(this, this.f156456d, (PrivilegeDescListNearbyItem.C8989a) getItem(i2), this.f156459g);
        } else if (i == 13) {
            ((PrivilegeDescListPrivateCustomExtraItem) view).m57208B0(this, this.f156456d, (PrivilegeDescListPrivateCustomExtraItem.C8994b) getItem(i2), this.f156459g);
        }
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public dv80 getItem(int i) {
        return this.f156455c.get(i);
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m176579I(PrivilegeDescListTopChatItem.C9000a c9000a) {
        this.f156455c.remove(c9000a);
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: J */
    public void m176580J(ArrayList<dv80> arrayList) {
        this.f156455c = arrayList;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return getItem(i).getItemType();
    }
}
