package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.app.PutongFrag;
import com.p046p1.mobile.putong.core.p053ui.vip.privilegeNewUi.content.item.IntlPrivilegeDescListImageItem;
import com.p046p1.mobile.putong.core.p053ui.vip.privilegeNewUi.content.item.IntlPrivilegeDescListItem;
import com.p046p1.mobile.putong.core.p053ui.vip.privilegeNewUi.content.item.IntlPrivilegeDescListSeeItem;
import com.p046p1.mobile.putong.core.p053ui.vip.privilegeNewUi.content.item.IntlPrivilegeDescListTitle;
import com.p046p1.mobile.putong.core.p053ui.vip.privilegeNewUi.content.item.IntlPrivilegePolicyItem;
import com.p046p1.mobile.putong.core.p053ui.vip.privilegeNewUi.content.item.IntlPrivilegeShowcaseWrapper;
import com.p046p1.mobile.putong.core.p053ui.vip.privilegeNewUi.content.item.IntlPrivilegeSubscriptionItem;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
public class ixo extends dac0<sxo> {

    /* JADX INFO: renamed from: c */
    public ArrayList<sxo> f115382c;

    /* JADX INFO: renamed from: d */
    public final PutongFrag f115383d;

    /* JADX INFO: renamed from: e */
    public final c3m f115384e;

    /* JADX INFO: renamed from: f */
    public final gxo f115385f;

    /* JADX INFO: renamed from: g */
    public IntlPrivilegeShowcaseWrapper f115386g;

    public ixo(PutongFrag putongFrag, c3m c3mVar, gxo gxoVar) {
        this.f115383d = putongFrag;
        this.f115384e = c3mVar;
        this.f115385f = gxoVar;
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f115382c.size();
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: D */
    public View mo28825D(ViewGroup viewGroup, int i) {
        switch (i) {
            case 0:
                return this.f115383d.mo20578H2().inflate(f6c0.f96044v5, viewGroup, false);
            case 1:
                return this.f115383d.mo20578H2().inflate(f6c0.f96010t5, viewGroup, false);
            case 2:
                return this.f115383d.mo20578H2().inflate(f6c0.f95993s5, viewGroup, false);
            case 3:
                return this.f115383d.mo20578H2().inflate(f6c0.f96027u5, viewGroup, false);
            case 4:
                IntlPrivilegeShowcaseWrapper intlPrivilegeShowcaseWrapper = this.f115386g;
                if (intlPrivilegeShowcaseWrapper != null) {
                    return intlPrivilegeShowcaseWrapper;
                }
                IntlPrivilegeShowcaseWrapper intlPrivilegeShowcaseWrapper2 = (IntlPrivilegeShowcaseWrapper) this.f115383d.mo20578H2().inflate(f6c0.f96095y5, viewGroup, false);
                this.f115386g = intlPrivilegeShowcaseWrapper2;
                intlPrivilegeShowcaseWrapper2.setUpShowcaseComponent(this.f115384e);
                return this.f115386g;
            case 5:
                return this.f115383d.mo20578H2().inflate(f6c0.f96078x5, viewGroup, false);
            case 6:
                return this.f115383d.mo20578H2().inflate(f6c0.f96111z5, viewGroup, false);
            default:
                return new View(this.f115383d.getContext());
        }
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public void mo28823A(View view, sxo sxoVar, int i, int i2) {
        if (i == 1) {
            ((IntlPrivilegeDescListItem) view).m57651h((IntlPrivilegeDescListItem.C9020a) getItem(i2), this, this.f115383d);
            return;
        }
        if (i == 0) {
            ((IntlPrivilegeDescListTitle) view).m57660d((IntlPrivilegeDescListTitle.C9022a) getItem(i2));
            return;
        }
        if (i == 2) {
            ((IntlPrivilegeDescListImageItem) view).m57642b((IntlPrivilegeDescListImageItem.C9019a) getItem(i2));
            return;
        }
        if (i == 4) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.height = -2;
            view.setLayoutParams(layoutParams);
            ((q1p) getItem(i2)).m172405e((IntlPrivilegeShowcaseWrapper) view);
            return;
        }
        if (i == 5) {
            ((IntlPrivilegePolicyItem) view).m57668Q((IntlPrivilegePolicyItem.C9023a) getItem(i2), this.f115383d);
        } else if (i == 3) {
            ((IntlPrivilegeDescListSeeItem) view).m57656c((IntlPrivilegeDescListSeeItem.C9021a) getItem(i2));
        } else if (i == 6) {
            ((IntlPrivilegeSubscriptionItem) view).m57673q((e4g0) getItem(i2), this.f115383d);
        }
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public sxo getItem(int i) {
        return this.f115382c.get(i);
    }

    /* JADX INFO: renamed from: G */
    public void m138877G(ArrayList<sxo> arrayList) {
        this.f115382c = arrayList;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return getItem(i).getItemType();
    }
}
