package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.data.UserPrivilege;
import java.util.Iterator;
import java.util.List;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes11.dex */
public class oq80 extends bh60 {
    public oq80(PurchaseType purchaseType, f5f0 f5f0Var) {
        super(purchaseType, f5f0Var);
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ Boolean m165404g(List list, List list2) {
        Iterator it = list2.iterator();
        boolean z = true;
        while (it.hasNext()) {
            final UserPrivilege userPrivilege = (UserPrivilege) it.next();
            z = userPrivilege.content.expiredTime == ((UserPrivilege) vwb.m200346r(list, new w9j() { // from class: l.nq80
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(TextUtils.equals(userPrivilege.f56011id, ((UserPrivilege) obj).f56011id));
                }
            })).content.expiredTime;
            if (!z) {
                break;
            }
        }
        return Boolean.valueOf(z);
    }

    @Override // p149l.bh60
    /* JADX INFO: renamed from: b */
    public C22306c<roj0> mo97762b() {
        return CoreModule.f17545c.f19555C0.m210114x3().distinctUntilChanged(new x9j() { // from class: l.lq80
            @Override // p149l.x9j
            public final Object call(Object obj, Object obj2) {
                return oq80.m165404g((List) obj, (List) obj2);
            }
        }).skip(1).map(new w9j() { // from class: l.mq80
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return roj0.f160388a;
            }
        });
    }

    @Override // p149l.bh60
    /* JADX INFO: renamed from: d */
    public void mo97764d() {
        CoreModule.f17545c.f19555C0.m210112u4();
    }

    @Override // p149l.bh60
    /* JADX INFO: renamed from: e */
    public boolean mo97765e() {
        return sab0.m182898p(this.f75560a);
    }
}
