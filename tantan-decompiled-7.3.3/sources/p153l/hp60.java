package p153l;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.data.Membership;
import com.p051p1.mobile.putong.data.MembershipType;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import java.util.ArrayList;
import java.util.List;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes11.dex */
public class hp60 {

    /* JADX INFO: renamed from: a */
    public gp60 f110983a;

    public hp60(PurchaseType purchaseType, mdf0 mdf0Var) {
        ArrayList<gp60> arrayList = new ArrayList();
        arrayList.add(new lud0(purchaseType, mdf0Var));
        arrayList.add(new hrd(purchaseType, mdf0Var));
        arrayList.add(new ewl0(purchaseType, mdf0Var));
        arrayList.add(new mul0(purchaseType, mdf0Var));
        arrayList.add(new bje0(purchaseType, mdf0Var));
        arrayList.add(new eu40(purchaseType));
        arrayList.add(new e550(purchaseType, mdf0Var));
        if (CoreModule.f18276o.m132214d().mo34769Vd()) {
            arrayList.add(new hsj0(purchaseType, mdf0Var));
        }
        arrayList.add(new jd80(purchaseType, mdf0Var));
        if (s7a.m184982k()) {
            arrayList.add(new cfi(purchaseType, mdf0Var));
        }
        if (s7a.m184997z()) {
            arrayList.add(new qoq0(purchaseType, mdf0Var));
        }
        if (CoreModule.f18264c.f20443y2.m216799E3()) {
            arrayList.add(new f550(purchaseType, mdf0Var));
            arrayList.add(new sy80(purchaseType, mdf0Var));
        }
        if (CoreModule.m30930K().mo31838xf()) {
            arrayList.add(new o9n(purchaseType, mdf0Var));
        }
        for (gp60 gp60Var : arrayList) {
            if (gp60Var.mo104622e()) {
                this.f110983a = gp60Var;
                return;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static double m136478b(User user, MembershipType membershipType) {
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
    public C22421c<uxj0> m136479a() {
        gp60 gp60Var = this.f110983a;
        return gp60Var == null ? C22421c.just(uxj0.f181467a) : gp60Var.mo104620b();
    }

    /* JADX INFO: renamed from: c */
    public void m136480c() {
        this.f110983a.m131238a();
    }

    /* JADX INFO: renamed from: d */
    public void m136481d() {
        this.f110983a.mo104621d();
    }
}
