package p009l;

import android.text.TextUtils;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.data.UserPrivilege;
import com.tantanapp.common.data.DbObject;
import java.util.Iterator;
import java.util.List;
import l.roj0;
import l.sab0;
import l.vwb;
import l.w9j;
import l.x9j;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class oq80 extends bh60 {
    public oq80(PurchaseType purchaseType, f5f0 f5f0Var) {
        super(purchaseType, f5f0Var);
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ Boolean m19977g(List list, List list2) {
        Iterator it = list2.iterator();
        boolean z = true;
        while (it.hasNext()) {
            final UserPrivilege userPrivilege = (UserPrivilege) it.next();
            z = userPrivilege.content.expiredTime == ((UserPrivilege) vwb.r(list, new w9j() { // from class: l.nq80
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
        return CoreModule.c.C0.x3().distinctUntilChanged(new x9j() { // from class: l.lq80
            public final Object call(Object obj, Object obj2) {
                return oq80.m19977g((List) obj, (List) obj2);
            }
        }).skip(1).map(new w9j() { // from class: l.mq80
            public final Object call(Object obj) {
                return roj0.a;
            }
        });
    }

    @Override // p009l.bh60
    /* JADX INFO: renamed from: d */
    public void mo11534d() {
        CoreModule.c.C0.u4();
    }

    @Override // p009l.bh60
    /* JADX INFO: renamed from: e */
    public boolean mo11535e() {
        return sab0.p(this.f10106a);
    }
}
