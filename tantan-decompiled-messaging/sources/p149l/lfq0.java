package p149l;

import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p046p1.mobile.putong.core.data.UserPrivilege;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes11.dex */
public class lfq0 extends bh60 {
    public lfq0(PurchaseType purchaseType, f5f0 f5f0Var) {
        super(purchaseType, f5f0Var);
    }

    @Override // p149l.bh60
    /* JADX INFO: renamed from: b */
    public C22306c<roj0> mo97762b() {
        return CoreModule.f17545c.f19555C0.m210111u3(SummarizedPrivilegesId.get("youthVip")).distinctUntilChanged(new x9j() { // from class: l.jfq0
            @Override // p149l.x9j
            public final Object call(Object obj, Object obj2) {
                return Boolean.valueOf(((UserPrivilege) obj).content.expiredTime == ((UserPrivilege) obj2).content.expiredTime);
            }
        }).skip(1).map(new w9j() { // from class: l.kfq0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return roj0.f160388a;
            }
        });
    }

    @Override // p149l.bh60
    /* JADX INFO: renamed from: c */
    public void mo97763c() {
        super.mo97763c();
    }

    @Override // p149l.bh60
    /* JADX INFO: renamed from: d */
    public void mo97764d() {
        if (TEnum.equals(this.f75561b.f95180d, "alipay")) {
            CoreModule.f17545c.f19591O0.m30075C3();
            CoreModule.f17545c.f19591O0.m30074B3();
        }
        CoreModule.f17545c.f19555C0.m210112u4();
    }

    @Override // p149l.bh60
    /* JADX INFO: renamed from: e */
    public boolean mo97765e() {
        return sab0.m182906x(this.f75560a);
    }
}
