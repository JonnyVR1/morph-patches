package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.data.UserPrivilege;
import java.util.Iterator;
import java.util.List;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes11.dex */
public class hrd extends gp60 {
    public hrd(PurchaseType purchaseType, mdf0 mdf0Var) {
        super(purchaseType, mdf0Var);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ Boolean m136780f(List list, List list2) {
        Iterator it = list2.iterator();
        boolean z = true;
        while (it.hasNext()) {
            final UserPrivilege userPrivilege = (UserPrivilege) it.next();
            z = userPrivilege.content.expiredTime == ((UserPrivilege) jyb.m147529r(list, new qcj() { // from class: l.grd
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(TextUtils.equals(userPrivilege.f56859id, ((UserPrivilege) obj).f56859id));
                }
            })).content.expiredTime;
            if (!z) {
                break;
            }
        }
        return Boolean.valueOf(z);
    }

    @Override // p153l.gp60
    /* JADX INFO: renamed from: b */
    public C22421c<uxj0> mo104620b() {
        if (this.f105436a == PurchaseType.TYPE_GET_ONLINE_MATCH_TICKETS) {
            return CoreModule.f18264c.f20297C0.m146427y3().distinctUntilChanged(new rcj() { // from class: l.erd
                @Override // p153l.rcj
                public final Object call(Object obj, Object obj2) {
                    return hrd.m136780f((List) obj, (List) obj2);
                }
            }).skip(1).map(new qcj() { // from class: l.frd
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return uxj0.f181467a;
                }
            });
        }
        return null;
    }

    @Override // p153l.gp60
    /* JADX INFO: renamed from: c */
    public void mo109543c() {
        if (this.f105436a == PurchaseType.TYPE_GET_ONLINE_MATCH_TICKETS) {
            CoreModule.f18264c.f20381e0.m116527W9(CoreModule.m30929H().userId());
        }
    }

    @Override // p153l.gp60
    /* JADX INFO: renamed from: d */
    public void mo104621d() {
        if (gta.m132210e().m132214d().mo34844h5() || gta.m132210e().m132214d().mo34700Hg()) {
            CoreModule.f18264c.f20381e0.m116527W9(uqb0.f180396b0.f170324a.userId());
            CoreModule.f18264c.f20381e0.m116470H9();
        }
        CoreModule.f18264c.f20297C0.m146425v4();
    }

    @Override // p153l.gp60
    /* JADX INFO: renamed from: e */
    public boolean mo104622e() {
        return PurchaseType.TYPE_GET_ONLINE_MATCH_TICKETS == this.f105436a;
    }
}
