package p009l;

import com.p1.mobile.putong.core.api.CoreSuggested;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.eqh0;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class ig4 extends AbstractC0925h4 {
    public ig4(gol golVar, User user, CoreSuggested.UserInfo userInfo) {
        super(golVar, user, userInfo);
    }

    @Override // p009l.AbstractC0925h4
    /* JADX INFO: renamed from: b */
    public boolean mo15389b(rk4 rk4Var, List<AbstractC0925h4> list, AbstractC0925h4 abstractC0925h4) {
        if (list.contains(this) || abstractC0925h4 == this || !mo13954c()) {
            return false;
        }
        mo13957h();
        list.add(this);
        return true;
    }

    @Override // p009l.AbstractC0925h4
    /* JADX INFO: renamed from: c */
    public boolean mo13954c() {
        return NullChecker.a(this.f13855b) && this.f13855b.meetAgain;
    }

    @Override // p009l.AbstractC0925h4
    /* JADX INFO: renamed from: d */
    public String mo13955d() {
        return "old_match";
    }

    @Override // p009l.AbstractC0925h4
    /* JADX INFO: renamed from: h */
    public boolean mo13957h() {
        xdl0.M(this.f13856c.m15119w0(), true);
        this.f13856c.m15119w0().setTypeface(eqh0.c(3), 1);
        return true;
    }

    @Override // p009l.AbstractC0925h4
    /* JADX INFO: renamed from: j */
    public boolean mo15392j() {
        return false;
    }

    @Override // p009l.AbstractC0925h4
    /* JADX INFO: renamed from: a */
    public void mo13953a() {
    }
}
