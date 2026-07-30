package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p046p1.mobile.putong.core.data.UserPrivilege;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes11.dex */
public class ndi extends bh60 {
    public ndi(PurchaseType purchaseType, f5f0 f5f0Var) {
        super(purchaseType, f5f0Var);
    }

    @Override // p149l.bh60
    /* JADX INFO: renamed from: b */
    public C22306c<roj0> mo97762b() {
        return CoreModule.f17545c.f19555C0.m210111u3(SummarizedPrivilegesId.get("femaleVip")).distinctUntilChanged(new x9j() { // from class: l.ldi
            @Override // p149l.x9j
            public final Object call(Object obj, Object obj2) {
                return Boolean.valueOf(((UserPrivilege) obj).content.expiredTime == ((UserPrivilege) obj2).content.expiredTime);
            }
        }).skip(1).map(new w9j() { // from class: l.mdi
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
        CoreModule.f17545c.f19561E0.m203789S3();
        CoreModule.f17545c.f19639e0.m169454W9(CoreModule.m29931H().userId());
        CoreModule.f17545c.f19561E0.m203796Z3();
    }

    @Override // p149l.bh60
    /* JADX INFO: renamed from: d */
    public void mo97764d() {
        if (TEnum.equals(this.f75561b.f95180d, "alipay")) {
            CoreModule.f17545c.f19591O0.m30075C3();
            CoreModule.f17545c.f19591O0.m30074B3();
        }
        CoreModule.f17545c.f19555C0.m210112u4();
        if (NullChecker.m81303a(this.f75561b) && NullChecker.m81303a(this.f75561b.f95177a) && !TextUtils.isEmpty(this.f75561b.f95177a.couponId)) {
            CoreModule.f17545c.f19634c1.m137864N3();
        }
    }

    @Override // p149l.bh60
    /* JADX INFO: renamed from: e */
    public boolean mo97765e() {
        return sab0.m182889g(this.f75560a);
    }
}
