package p009l;

import android.text.TextUtils;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.api.CoreSuggested;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.data.ValueObject;
import com.tantanapp.common.utils.NullChecker;
import l.e30;
import l.mkd0;
import l.xaj0;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class kv10 extends p3l {

    /* JADX INFO: renamed from: f */
    public String f15863f;

    @Override // p009l.p3l
    /* JADX INFO: renamed from: B */
    public void mo2124B(CoreSuggested.UserInfo userInfo, User user, int i, int i2, int i3) {
        this.f15863f = ((DbObject) user).id;
        m17602E(f4v.m14251f().m14253g(((DbObject) user).id));
    }

    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public final void m17602E(xaj0<ValueObject, ValueObject, Boolean> xaj0Var) {
        if (TextUtils.equals(this.f15863f, CoreModule.H().userId()) && NullChecker.a(xaj0Var) && f4v.m14251f().m14254h((ValueObject) xaj0Var.a)) {
            xaj0Var = xaj0.a((Object) null, (ValueObject) xaj0Var.b, (Boolean) xaj0Var.c);
        }
        if (NullChecker.a(xaj0Var) && (xaj0Var.a != null || xaj0Var.b != null)) {
            xdl0.M(m24921m(), true);
            CoreModule.Q().m9061oj(m24921m(), xaj0Var, this.f15863f);
        } else if (xaj0Var != null && ((Boolean) xaj0Var.c).booleanValue()) {
            xdl0.M(m24921m(), false);
        } else {
            xdl0.M(m24921m(), false);
            m17604G(this.f15863f);
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m17604G(String str) {
        m24919k(m20098w(), f4v.m14251f().m14258l(str)).subscribe(mkd0.G(new e30() { // from class: l.jv10
            public final void call(Object obj) {
                this.f15336a.m17602E((xaj0) obj);
            }
        }));
    }
}
