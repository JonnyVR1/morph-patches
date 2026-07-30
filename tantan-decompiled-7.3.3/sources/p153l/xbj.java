package p153l;

import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.data.MatchFrom;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes11.dex */
public class xbj implements z6m {

    /* JADX INFO: renamed from: b */
    public static final z6m f193165b = new xbj();

    /* JADX INFO: renamed from: d */
    public static z6m m209959d() {
        return f193165b;
    }

    @Override // p153l.z6m
    /* JADX INFO: renamed from: a */
    public boolean mo95724a(sj6 sj6Var, Message message) {
        return ric0.m181583m() && NullChecker.m82486a(sj6Var.f168927b) && NullChecker.m82486a(sj6Var.f168927b.localRelationship) && NullChecker.m82486a(sj6Var.f168927b.localRelationship.status) && sj6Var.f168927b.localRelationship.status.contains(MatchFrom.get("boosted"));
    }

    @Override // p153l.z6m
    /* JADX INFO: renamed from: b */
    public CharSequence mo95725b(sj6 sj6Var, Message message) {
        return m218804c("来自加速配对");
    }
}
