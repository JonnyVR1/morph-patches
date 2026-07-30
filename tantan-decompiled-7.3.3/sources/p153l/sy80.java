package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.data.UserPrivilege;
import java.util.Iterator;
import java.util.List;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes11.dex */
public class sy80 extends gp60 {
    public sy80(PurchaseType purchaseType, mdf0 mdf0Var) {
        super(purchaseType, mdf0Var);
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ Boolean m188535g(List list, List list2) {
        Iterator it = list2.iterator();
        boolean z = true;
        while (it.hasNext()) {
            final UserPrivilege userPrivilege = (UserPrivilege) it.next();
            z = userPrivilege.content.expiredTime == ((UserPrivilege) jyb.m147529r(list, new qcj() { // from class: l.ry80
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
        return CoreModule.f18264c.f20297C0.m146427y3().distinctUntilChanged(new rcj() { // from class: l.py80
            @Override // p153l.rcj
            public final Object call(Object obj, Object obj2) {
                return sy80.m188535g((List) obj, (List) obj2);
            }
        }).skip(1).map(new qcj() { // from class: l.qy80
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return uxj0.f181467a;
            }
        });
    }

    @Override // p153l.gp60
    /* JADX INFO: renamed from: d */
    public void mo104621d() {
        CoreModule.f18264c.f20297C0.m146425v4();
    }

    @Override // p153l.gp60
    /* JADX INFO: renamed from: e */
    public boolean mo104622e() {
        return wib0.m206572p(this.f105436a);
    }
}
