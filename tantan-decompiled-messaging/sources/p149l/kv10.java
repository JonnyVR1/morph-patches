package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.CoreSuggested;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.data.ValueObject;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes11.dex */
public class kv10 extends p3l {

    /* JADX INFO: renamed from: f */
    public String f124738f;

    @Override // p149l.p3l
    /* JADX INFO: renamed from: B */
    public void mo38150B(CoreSuggested.UserInfo userInfo, User user, int i, int i2, int i3) {
        this.f124738f = user.f56011id;
        m147344E(f4v.m119459f().m119461g(user.f56011id));
    }

    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public final void m147344E(xaj0<ValueObject, ValueObject, Boolean> xaj0Var) {
        if (TextUtils.equals(this.f124738f, CoreModule.m29931H().userId()) && NullChecker.m81303a(xaj0Var) && f4v.m119459f().m119462h(xaj0Var.f191751a)) {
            xaj0Var = xaj0.m207578a(null, xaj0Var.f191752b, xaj0Var.f191753c);
        }
        if (NullChecker.m81303a(xaj0Var) && (xaj0Var.f191751a != null || xaj0Var.f191752b != null)) {
            xdl0.m208344M(m209783m(), true);
            CoreModule.m29936Q().mo67276oj(m209783m(), xaj0Var, this.f124738f);
        } else if (xaj0Var != null && xaj0Var.f191753c.booleanValue()) {
            xdl0.m208344M(m209783m(), false);
        } else {
            xdl0.m208344M(m209783m(), false);
            m147346G(this.f124738f);
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m147346G(String str) {
        m209781k(m167252w(), f4v.m119459f().m119466l(str)).subscribe(mkd0.m154955G(new e30() { // from class: l.jv10
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f119848a.m147344E((xaj0) obj);
            }
        }));
    }
}
