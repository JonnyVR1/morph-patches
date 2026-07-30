package p153l;

import com.p051p1.mobile.putong.core.api.CoreSuggested;
import com.p051p1.mobile.putong.core.data.ContainerLabelsType;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class hh4 extends AbstractC17382h4 {
    public hh4(rql rqlVar, User user, CoreSuggested.UserInfo userInfo) {
        super(rqlVar, user, userInfo);
    }

    @Override // p153l.AbstractC17382h4
    /* JADX INFO: renamed from: b */
    public boolean mo133525b(ql4 ql4Var, List<AbstractC17382h4> list, AbstractC17382h4 abstractC17382h4) {
        if (list.contains(this) || abstractC17382h4 == this || !mo116206c()) {
            return false;
        }
        mo116209h();
        list.add(this);
        return true;
    }

    @Override // p153l.AbstractC17382h4
    /* JADX INFO: renamed from: c */
    public boolean mo116206c() {
        return NullChecker.m82486a(this.f107714b) && this.f107714b.meetAgain;
    }

    @Override // p153l.AbstractC17382h4
    /* JADX INFO: renamed from: d */
    public String mo116207d() {
        return ContainerLabelsType.old_match;
    }

    @Override // p153l.AbstractC17382h4
    /* JADX INFO: renamed from: h */
    public boolean mo116209h() {
        bnl0.m105524M(this.f107715c.m182645w0(), true);
        this.f107715c.m182645w0().setTypeface(lyh0.m156283c(3), 1);
        return true;
    }

    @Override // p153l.AbstractC17382h4
    /* JADX INFO: renamed from: j */
    public boolean mo133528j() {
        return false;
    }

    @Override // p153l.AbstractC17382h4
    /* JADX INFO: renamed from: a */
    public void mo116205a() {
    }
}
