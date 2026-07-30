package p149l;

import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.data.MatchFrom;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes11.dex */
public class d9j implements j4m {

    /* JADX INFO: renamed from: b */
    public static final j4m f85127b = new d9j();

    /* JADX INFO: renamed from: d */
    public static j4m m110461d() {
        return f85127b;
    }

    @Override // p149l.j4m
    /* JADX INFO: renamed from: a */
    public boolean mo94463a(pi6 pi6Var, Message message) {
        return lac0.m149136m() && NullChecker.m81303a(pi6Var.f149102b) && NullChecker.m81303a(pi6Var.f149102b.localRelationship) && NullChecker.m81303a(pi6Var.f149102b.localRelationship.status) && pi6Var.f149102b.localRelationship.status.contains(MatchFrom.get("boosted"));
    }

    @Override // p149l.j4m
    /* JADX INFO: renamed from: b */
    public CharSequence mo94464b(pi6 pi6Var, Message message) {
        return m139684c("来自加速配对");
    }
}
