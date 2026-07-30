package p149l;

import com.p046p1.mobile.putong.core.api.CoreSuggested;
import com.p046p1.mobile.putong.core.data.ContainerLabelsType;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class ig4 extends AbstractC17222h4 {
    public ig4(gol golVar, User user, CoreSuggested.UserInfo userInfo) {
        super(golVar, user, userInfo);
    }

    @Override // p149l.AbstractC17222h4
    /* JADX INFO: renamed from: b */
    public boolean mo129196b(rk4 rk4Var, List<AbstractC17222h4> list, AbstractC17222h4 abstractC17222h4) {
        if (list.contains(this) || abstractC17222h4 == this || !mo116769c()) {
            return false;
        }
        mo116772h();
        list.add(this);
        return true;
    }

    @Override // p149l.AbstractC17222h4
    /* JADX INFO: renamed from: c */
    public boolean mo116769c() {
        return NullChecker.m81303a(this.f105775b) && this.f105775b.meetAgain;
    }

    @Override // p149l.AbstractC17222h4
    /* JADX INFO: renamed from: d */
    public String mo116770d() {
        return ContainerLabelsType.old_match;
    }

    @Override // p149l.AbstractC17222h4
    /* JADX INFO: renamed from: h */
    public boolean mo116772h() {
        xdl0.m208344M(this.f105776c.m127252w0(), true);
        this.f105776c.m127252w0().setTypeface(eqh0.m117752c(3), 1);
        return true;
    }

    @Override // p149l.AbstractC17222h4
    /* JADX INFO: renamed from: j */
    public boolean mo129199j() {
        return false;
    }

    @Override // p149l.AbstractC17222h4
    /* JADX INFO: renamed from: a */
    public void mo116768a() {
    }
}
