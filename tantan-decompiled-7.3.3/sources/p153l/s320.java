package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.CoreSuggested;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.data.ValueObject;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes11.dex */
public class s320 extends f6l {

    /* JADX INFO: renamed from: f */
    public String f165971f;

    @Override // p153l.f6l
    /* JADX INFO: renamed from: B */
    public void mo39153B(CoreSuggested.UserInfo userInfo, User user, int i, int i2, int i3) {
        this.f165971f = user.f56859id;
        m184208E(g6v.m129273f().m129275g(user.f56859id));
    }

    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public final void m184208E(bkj0<ValueObject, ValueObject, Boolean> bkj0Var) {
        if (TextUtils.equals(this.f165971f, CoreModule.m30929H().userId()) && NullChecker.m82486a(bkj0Var) && g6v.m129273f().m129276h(bkj0Var.f77081a)) {
            bkj0Var = bkj0.m104818a(null, bkj0Var.f77082b, bkj0Var.f77083c);
        }
        if (NullChecker.m82486a(bkj0Var) && (bkj0Var.f77081a != null || bkj0Var.f77082b != null)) {
            bnl0.m105524M(m116952m(), true);
            CoreModule.m30934Q().mo68459oj(m116952m(), bkj0Var, this.f165971f);
        } else if (bkj0Var != null && bkj0Var.f77083c.booleanValue()) {
            bnl0.m105524M(m116952m(), false);
        } else {
            bnl0.m105524M(m116952m(), false);
            m184210G(this.f165971f);
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m184210G(String str) {
        m116950k(m124283w(), g6v.m129273f().m129280l(str)).subscribe(psd0.m173596G(new y20() { // from class: l.r320
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f160994a.m184208E((bkj0) obj);
            }
        }));
    }
}
