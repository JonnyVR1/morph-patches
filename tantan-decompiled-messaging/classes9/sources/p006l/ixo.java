package p006l;

import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.account.data.CameraSticker;
import com.p000p1.mobile.putong.app.PutongFrag;
import com.p000p1.mobile.putong.core.p004ui.vip.privilegeNewUi.content.item.IntlPrivilegeDescListImageItem;
import com.p000p1.mobile.putong.core.p004ui.vip.privilegeNewUi.content.item.IntlPrivilegeDescListItem;
import com.p000p1.mobile.putong.core.p004ui.vip.privilegeNewUi.content.item.IntlPrivilegeDescListSeeItem;
import com.p000p1.mobile.putong.core.p004ui.vip.privilegeNewUi.content.item.IntlPrivilegeDescListTitle;
import com.p000p1.mobile.putong.core.p004ui.vip.privilegeNewUi.content.item.IntlPrivilegePolicyItem;
import com.p000p1.mobile.putong.core.p004ui.vip.privilegeNewUi.content.item.IntlPrivilegeShowcaseWrapper;
import com.p000p1.mobile.putong.core.p004ui.vip.privilegeNewUi.content.item.IntlPrivilegeSubscriptionItem;
import java.util.ArrayList;
import l.dac0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class ixo extends dac0<sxo> {

    /* JADX INFO: renamed from: c */
    public ArrayList<sxo> f14865c;

    /* JADX INFO: renamed from: d */
    public final PutongFrag f14866d;

    /* JADX INFO: renamed from: e */
    public final c3m f14867e;

    /* JADX INFO: renamed from: f */
    public final gxo f14868f;

    /* JADX INFO: renamed from: g */
    public IntlPrivilegeShowcaseWrapper f14869g;

    public ixo(PutongFrag putongFrag, c3m c3mVar, gxo gxoVar) {
        this.f14866d = putongFrag;
        this.f14867e = c3mVar;
        this.f14868f = gxoVar;
    }

    /* JADX INFO: renamed from: C */
    public int m17143C() {
        return this.f14865c.size();
    }

    /* JADX INFO: renamed from: D */
    public View m17144D(ViewGroup viewGroup, int i) {
        switch (i) {
            case 0:
                return this.f14866d.m1542H2().inflate(f6c0.f12458v5, viewGroup, false);
            case 1:
                return this.f14866d.m1542H2().inflate(f6c0.f12424t5, viewGroup, false);
            case 2:
                return this.f14866d.m1542H2().inflate(f6c0.f12407s5, viewGroup, false);
            case CameraSticker.STATE_COMPLETE /* 3 */:
                return this.f14866d.m1542H2().inflate(f6c0.f12441u5, viewGroup, false);
            case CameraSticker.STATE_ERROR /* 4 */:
                IntlPrivilegeShowcaseWrapper intlPrivilegeShowcaseWrapper = this.f14869g;
                if (intlPrivilegeShowcaseWrapper != null) {
                    return intlPrivilegeShowcaseWrapper;
                }
                IntlPrivilegeShowcaseWrapper intlPrivilegeShowcaseWrapper2 = (IntlPrivilegeShowcaseWrapper) this.f14866d.m1542H2().inflate(f6c0.f12509y5, viewGroup, false);
                this.f14869g = intlPrivilegeShowcaseWrapper2;
                intlPrivilegeShowcaseWrapper2.setUpShowcaseComponent(this.f14867e);
                return this.f14869g;
            case 5:
                return this.f14866d.m1542H2().inflate(f6c0.f12492x5, viewGroup, false);
            case 6:
                return this.f14866d.m1542H2().inflate(f6c0.f12525z5, viewGroup, false);
            default:
                return new View(this.f14866d.getContext());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public void m17142A(View view, sxo sxoVar, int i, int i2) {
        if (i == 1) {
            ((IntlPrivilegeDescListItem) view).m11143h((IntlPrivilegeDescListItem.C0456a) getItem(i2), this, this.f14866d);
            return;
        }
        if (i == 0) {
            ((IntlPrivilegeDescListTitle) view).m11152d((IntlPrivilegeDescListTitle.C0458a) getItem(i2));
            return;
        }
        if (i == 2) {
            ((IntlPrivilegeDescListImageItem) view).m11134b((IntlPrivilegeDescListImageItem.C0455a) getItem(i2));
            return;
        }
        if (i == 4) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.height = -2;
            view.setLayoutParams(layoutParams);
            ((q1p) getItem(i2)).m21923e((IntlPrivilegeShowcaseWrapper) view);
            return;
        }
        if (i == 5) {
            ((IntlPrivilegePolicyItem) view).m11160Q((IntlPrivilegePolicyItem.C0459a) getItem(i2), this.f14866d);
        } else if (i == 3) {
            ((IntlPrivilegeDescListSeeItem) view).m11148c((IntlPrivilegeDescListSeeItem.C0457a) getItem(i2));
        } else if (i == 6) {
            ((IntlPrivilegeSubscriptionItem) view).m11165q((e4g0) getItem(i2), this.f14866d);
        }
    }

    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public sxo getItem(int i) {
        return this.f14865c.get(i);
    }

    /* JADX INFO: renamed from: G */
    public void m17147G(ArrayList<sxo> arrayList) {
        this.f14865c = arrayList;
        notifyDataSetChanged();
    }

    public int getItemViewType(int i) {
        return getItem(i).getItemType();
    }
}
