package p009l;

import android.text.TextUtils;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.data.UserPrivilege;
import com.tantanapp.common.data.DbObject;
import java.util.Iterator;
import java.util.List;
import l.qib0;
import l.roj0;
import l.ura;
import l.vwb;
import l.w9j;
import l.x9j;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class qpd extends bh60 {
    public qpd(PurchaseType purchaseType, f5f0 f5f0Var) {
        super(purchaseType, f5f0Var);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ Boolean m21129f(List list, List list2) {
        Iterator it = list2.iterator();
        boolean z = true;
        while (it.hasNext()) {
            final UserPrivilege userPrivilege = (UserPrivilege) it.next();
            z = userPrivilege.content.expiredTime == ((UserPrivilege) vwb.r(list, new w9j() { // from class: l.ppd
                public final Object call(Object obj) {
                    return Boolean.valueOf(TextUtils.equals(((DbObject) userPrivilege).id, ((DbObject) ((UserPrivilege) obj)).id));
                }
            })).content.expiredTime;
            if (!z) {
                break;
            }
        }
        return Boolean.valueOf(z);
    }

    @Override // p009l.bh60
    /* JADX INFO: renamed from: b */
    public c<roj0> mo11532b() {
        if (this.f10106a == PurchaseType.TYPE_GET_ONLINE_MATCH_TICKETS) {
            return CoreModule.c.C0.x3().distinctUntilChanged(new x9j() { // from class: l.npd
                public final Object call(Object obj, Object obj2) {
                    return qpd.m21129f((List) obj, (List) obj2);
                }
            }).skip(1).map(new w9j() { // from class: l.opd
                public final Object call(Object obj) {
                    return roj0.a;
                }
            });
        }
        return null;
    }

    @Override // p009l.bh60
    /* JADX INFO: renamed from: c */
    public void mo11533c() {
        if (this.f10106a == PurchaseType.TYPE_GET_ONLINE_MATCH_TICKETS) {
            CoreModule.c.e0.W9(CoreModule.H().userId());
        }
    }

    @Override // p009l.bh60
    /* JADX INFO: renamed from: d */
    public void mo11534d() {
        if (ura.e().d().h5() || ura.e().d().Hg()) {
            CoreModule.c.e0.W9(qib0.b0.a.userId());
            CoreModule.c.e0.H9();
        }
        CoreModule.c.C0.u4();
    }

    @Override // p009l.bh60
    /* JADX INFO: renamed from: e */
    public boolean mo11535e() {
        return PurchaseType.TYPE_GET_ONLINE_MATCH_TICKETS == this.f10106a;
    }
}
