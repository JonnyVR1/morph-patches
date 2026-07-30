package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.data.UserPrivilege;
import java.util.Iterator;
import java.util.List;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes11.dex */
public class qpd extends bh60 {
    public qpd(PurchaseType purchaseType, f5f0 f5f0Var) {
        super(purchaseType, f5f0Var);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ Boolean m175822f(List list, List list2) {
        Iterator it = list2.iterator();
        boolean z = true;
        while (it.hasNext()) {
            final UserPrivilege userPrivilege = (UserPrivilege) it.next();
            z = userPrivilege.content.expiredTime == ((UserPrivilege) vwb.m200346r(list, new w9j() { // from class: l.ppd
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
        if (this.f75560a == PurchaseType.TYPE_GET_ONLINE_MATCH_TICKETS) {
            return CoreModule.f17545c.f19555C0.m210114x3().distinctUntilChanged(new x9j() { // from class: l.npd
                @Override // p149l.x9j
                public final Object call(Object obj, Object obj2) {
                    return qpd.m175822f((List) obj, (List) obj2);
                }
            }).skip(1).map(new w9j() { // from class: l.opd
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return roj0.f160388a;
                }
            });
        }
        return null;
    }

    @Override // p149l.bh60
    /* JADX INFO: renamed from: c */
    public void mo97763c() {
        if (this.f75560a == PurchaseType.TYPE_GET_ONLINE_MATCH_TICKETS) {
            CoreModule.f17545c.f19639e0.m169454W9(CoreModule.m29931H().userId());
        }
    }

    @Override // p149l.bh60
    /* JADX INFO: renamed from: d */
    public void mo97764d() {
        if (ura.m195053e().m195057d().mo33841h5() || ura.m195053e().m195057d().mo33697Hg()) {
            CoreModule.f17545c.f19639e0.m169454W9(qib0.f154713b0.f139230a.userId());
            CoreModule.f17545c.f19639e0.m169397H9();
        }
        CoreModule.f17545c.f19555C0.m210112u4();
    }

    @Override // p149l.bh60
    /* JADX INFO: renamed from: e */
    public boolean mo97765e() {
        return PurchaseType.TYPE_GET_ONLINE_MATCH_TICKETS == this.f75560a;
    }
}
