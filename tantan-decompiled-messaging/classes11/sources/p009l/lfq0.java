package p009l;

import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p1.mobile.putong.core.data.UserPrivilege;
import com.p1.mobile.putong.data.tenum.TEnum;
import l.roj0;
import l.sab0;
import l.w9j;
import l.x9j;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class lfq0 extends bh60 {
    public lfq0(PurchaseType purchaseType, f5f0 f5f0Var) {
        super(purchaseType, f5f0Var);
    }

    @Override // p009l.bh60
    /* JADX INFO: renamed from: b */
    public c<roj0> mo11532b() {
        return CoreModule.c.C0.u3(SummarizedPrivilegesId.get("youthVip")).distinctUntilChanged(new x9j() { // from class: l.jfq0
            public final Object call(Object obj, Object obj2) {
                return Boolean.valueOf(((UserPrivilege) obj).content.expiredTime == ((UserPrivilege) obj2).content.expiredTime);
            }
        }).skip(1).map(new w9j() { // from class: l.kfq0
            public final Object call(Object obj) {
                return roj0.a;
            }
        });
    }

    @Override // p009l.bh60
    /* JADX INFO: renamed from: c */
    public void mo11533c() {
        super.mo11533c();
    }

    @Override // p009l.bh60
    /* JADX INFO: renamed from: d */
    public void mo11534d() {
        if (TEnum.equals(this.f10107b.f12816d, "alipay")) {
            CoreModule.c.O0.C3();
            CoreModule.c.O0.B3();
        }
        CoreModule.c.C0.u4();
    }

    @Override // p009l.bh60
    /* JADX INFO: renamed from: e */
    public boolean mo11535e() {
        return sab0.x(this.f10106a);
    }
}
