package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.app.PutongFrag;
import com.p051p1.mobile.putong.core.p058ui.vip.privilegeNewUi.content.item.IntlPrivilegeDescListImageItem;
import com.p051p1.mobile.putong.core.p058ui.vip.privilegeNewUi.content.item.IntlPrivilegeDescListItem;
import com.p051p1.mobile.putong.core.p058ui.vip.privilegeNewUi.content.item.IntlPrivilegeDescListSeeItem;
import com.p051p1.mobile.putong.core.p058ui.vip.privilegeNewUi.content.item.IntlPrivilegeDescListTitle;
import com.p051p1.mobile.putong.core.p058ui.vip.privilegeNewUi.content.item.IntlPrivilegePolicyItem;
import com.p051p1.mobile.putong.core.p058ui.vip.privilegeNewUi.content.item.IntlPrivilegeShowcaseWrapper;
import com.p051p1.mobile.putong.core.p058ui.vip.privilegeNewUi.content.item.IntlPrivilegeSubscriptionItem;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes12.dex */
public class izo extends jic0<szo> {

    /* JADX INFO: renamed from: c */
    public ArrayList<szo> f117725c;

    /* JADX INFO: renamed from: d */
    public final PutongFrag f117726d;

    /* JADX INFO: renamed from: e */
    public final t5m f117727e;

    /* JADX INFO: renamed from: f */
    public final gzo f117728f;

    /* JADX INFO: renamed from: g */
    public IntlPrivilegeShowcaseWrapper f117729g;

    public izo(PutongFrag putongFrag, t5m t5mVar, gzo gzoVar) {
        this.f117726d = putongFrag;
        this.f117727e = t5mVar;
        this.f117728f = gzoVar;
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f117725c.size();
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: D */
    public View mo29824D(ViewGroup viewGroup, int i) {
        switch (i) {
            case 0:
                return this.f117726d.mo21577H2().inflate(kec0.f126115w5, viewGroup, false);
            case 1:
                return this.f117726d.mo21577H2().inflate(kec0.f126081u5, viewGroup, false);
            case 2:
                return this.f117726d.mo21577H2().inflate(kec0.f126064t5, viewGroup, false);
            case 3:
                return this.f117726d.mo21577H2().inflate(kec0.f126098v5, viewGroup, false);
            case 4:
                IntlPrivilegeShowcaseWrapper intlPrivilegeShowcaseWrapper = this.f117729g;
                if (intlPrivilegeShowcaseWrapper != null) {
                    return intlPrivilegeShowcaseWrapper;
                }
                IntlPrivilegeShowcaseWrapper intlPrivilegeShowcaseWrapper2 = (IntlPrivilegeShowcaseWrapper) this.f117726d.mo21577H2().inflate(kec0.f126166z5, viewGroup, false);
                this.f117729g = intlPrivilegeShowcaseWrapper2;
                intlPrivilegeShowcaseWrapper2.setUpShowcaseComponent(this.f117727e);
                return this.f117729g;
            case 5:
                return this.f117726d.mo21577H2().inflate(kec0.f126149y5, viewGroup, false);
            case 6:
                return this.f117726d.mo21577H2().inflate(kec0.f125321A5, viewGroup, false);
            default:
                return new View(this.f117726d.getContext());
        }
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public void mo29822A(View view, szo szoVar, int i, int i2) {
        if (i == 1) {
            ((IntlPrivilegeDescListItem) view).m58834h((IntlPrivilegeDescListItem.C9183a) getItem(i2), this, this.f117726d);
            return;
        }
        if (i == 0) {
            ((IntlPrivilegeDescListTitle) view).m58843d((IntlPrivilegeDescListTitle.C9185a) getItem(i2));
            return;
        }
        if (i == 2) {
            ((IntlPrivilegeDescListImageItem) view).m58825b((IntlPrivilegeDescListImageItem.C9182a) getItem(i2));
            return;
        }
        if (i == 4) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.height = -2;
            view.setLayoutParams(layoutParams);
            ((q3p) getItem(i2)).m175153e((IntlPrivilegeShowcaseWrapper) view);
            return;
        }
        if (i == 5) {
            ((IntlPrivilegePolicyItem) view).m58851Q((IntlPrivilegePolicyItem.C9186a) getItem(i2), this.f117726d);
        } else if (i == 3) {
            ((IntlPrivilegeDescListSeeItem) view).m58839c((IntlPrivilegeDescListSeeItem.C9184a) getItem(i2));
        } else if (i == 6) {
            ((IntlPrivilegeSubscriptionItem) view).m58856q((mcg0) getItem(i2), this.f117726d);
        }
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public szo getItem(int i) {
        return this.f117725c.get(i);
    }

    /* JADX INFO: renamed from: G */
    public void m142815G(ArrayList<szo> arrayList) {
        this.f117725c = arrayList;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return getItem(i).getItemType();
    }
}
