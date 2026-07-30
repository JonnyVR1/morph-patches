package p149l;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.data.Membership;
import com.p046p1.mobile.putong.data.MembershipType;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import java.util.ArrayList;
import java.util.List;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes11.dex */
public class ch60 {

    /* JADX INFO: renamed from: a */
    public bh60 f80834a;

    public ch60(PurchaseType purchaseType, f5f0 f5f0Var) {
        ArrayList<bh60> arrayList = new ArrayList();
        arrayList.add(new jmd0(purchaseType, f5f0Var));
        arrayList.add(new qpd(purchaseType, f5f0Var));
        arrayList.add(new anl0(purchaseType, f5f0Var));
        arrayList.add(new ill0(purchaseType, f5f0Var));
        arrayList.add(new wae0(purchaseType, f5f0Var));
        arrayList.add(new ql40(purchaseType));
        arrayList.add(new pw40(purchaseType, f5f0Var));
        if (CoreModule.f17557o.m195057d().mo33766Vd()) {
            arrayList.add(new ejj0(purchaseType, f5f0Var));
        }
        arrayList.add(new d580(purchaseType, f5f0Var));
        if (g6a.m124562k()) {
            arrayList.add(new ndi(purchaseType, f5f0Var));
        }
        if (g6a.m124577z()) {
            arrayList.add(new lfq0(purchaseType, f5f0Var));
        }
        if (CoreModule.f17545c.f19701y2.m155330E3()) {
            arrayList.add(new qw40(purchaseType, f5f0Var));
            arrayList.add(new oq80(purchaseType, f5f0Var));
        }
        if (CoreModule.m29932K().mo30835xf()) {
            arrayList.add(new o7n(purchaseType, f5f0Var));
        }
        for (bh60 bh60Var : arrayList) {
            if (bh60Var.mo97765e()) {
                this.f80834a = bh60Var;
                return;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static double m106851b(User user, MembershipType membershipType) {
        List<Membership> list = user.memberships;
        if (list != null && list.size() != 0) {
            for (Membership membership : user.memberships) {
                if (TEnum.equals(membership.name, membershipType)) {
                    return membership.expiresTime;
                }
            }
        }
        return FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
    }

    /* JADX INFO: renamed from: a */
    public C22306c<roj0> m106852a() {
        bh60 bh60Var = this.f80834a;
        return bh60Var == null ? C22306c.just(roj0.f160388a) : bh60Var.mo97762b();
    }

    /* JADX INFO: renamed from: c */
    public void m106853c() {
        this.f80834a.m101765a();
    }

    /* JADX INFO: renamed from: d */
    public void m106854d() {
        this.f80834a.mo97764d();
    }
}
