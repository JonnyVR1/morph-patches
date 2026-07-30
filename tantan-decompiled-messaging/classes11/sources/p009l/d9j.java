package p009l;

import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.data.MatchFrom;
import com.tantanapp.common.utils.NullChecker;
import l.lac0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class d9j implements j4m {

    /* JADX INFO: renamed from: b */
    public static final j4m f11681b = new d9j();

    /* JADX INFO: renamed from: d */
    public static j4m m13021d() {
        return f11681b;
    }

    @Override // p009l.j4m
    /* JADX INFO: renamed from: a */
    public boolean mo11180a(pi6 pi6Var, Message message) {
        return lac0.m() && NullChecker.a(pi6Var.f18623b) && NullChecker.a(pi6Var.f18623b.localRelationship) && NullChecker.a(pi6Var.f18623b.localRelationship.status) && pi6Var.f18623b.localRelationship.status.contains(MatchFrom.get("boosted"));
    }

    @Override // p009l.j4m
    /* JADX INFO: renamed from: b */
    public CharSequence mo11181b(pi6 pi6Var, Message message) {
        return m16869c("来自加速配对");
    }
}
