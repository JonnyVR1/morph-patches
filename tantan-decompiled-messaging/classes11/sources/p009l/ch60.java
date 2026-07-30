package p009l;

import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.data.Membership;
import com.p1.mobile.putong.data.MembershipType;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import java.util.ArrayList;
import java.util.List;
import l.g6a;
import l.roj0;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class ch60 {

    /* JADX INFO: renamed from: a */
    public bh60 f10593a;

    public ch60(PurchaseType purchaseType, f5f0 f5f0Var) {
        ArrayList<bh60> arrayList = new ArrayList();
        arrayList.add(new jmd0(purchaseType, f5f0Var));
        arrayList.add(new qpd(purchaseType, f5f0Var));
        arrayList.add(new anl0(purchaseType, f5f0Var));
        arrayList.add(new ill0(purchaseType, f5f0Var));
        arrayList.add(new wae0(purchaseType, f5f0Var));
        arrayList.add(new ql40(purchaseType));
        arrayList.add(new pw40(purchaseType, f5f0Var));
        if (CoreModule.o.d().Vd()) {
            arrayList.add(new ejj0(purchaseType, f5f0Var));
        }
        arrayList.add(new d580(purchaseType, f5f0Var));
        if (g6a.k()) {
            arrayList.add(new ndi(purchaseType, f5f0Var));
        }
        if (g6a.z()) {
            arrayList.add(new lfq0(purchaseType, f5f0Var));
        }
        if (CoreModule.c.y2.E3()) {
            arrayList.add(new qw40(purchaseType, f5f0Var));
            arrayList.add(new oq80(purchaseType, f5f0Var));
        }
        if (CoreModule.K().xf()) {
            arrayList.add(new o7n(purchaseType, f5f0Var));
        }
        for (bh60 bh60Var : arrayList) {
            if (bh60Var.mo11535e()) {
                this.f10593a = bh60Var;
                return;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static double m12550b(User user, MembershipType membershipType) {
        List list = user.memberships;
        if (list != null && list.size() != 0) {
            for (Membership membership : user.memberships) {
                if (TEnum.equals(membership.name, membershipType)) {
                    return membership.expiresTime;
                }
            }
        }
        return 0.0d;
    }

    /* JADX INFO: renamed from: a */
    public c<roj0> m12551a() {
        bh60 bh60Var = this.f10593a;
        return bh60Var == null ? c.just(roj0.a) : bh60Var.mo11532b();
    }

    /* JADX INFO: renamed from: c */
    public void m12552c() {
        this.f10593a.m12031a();
    }

    /* JADX INFO: renamed from: d */
    public void m12553d() {
        this.f10593a.mo11534d();
    }
}
