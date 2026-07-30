package p153l;

import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Message;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes11.dex */
public class ccj implements z6m {

    /* JADX INFO: renamed from: b */
    public static final z6m f80971b = new ccj();

    /* JADX INFO: renamed from: d */
    public static z6m m108710d() {
        return f80971b;
    }

    @Override // p153l.z6m
    /* JADX INFO: renamed from: a */
    public boolean mo95724a(sj6 sj6Var, Message message) {
        if (CoreModule.f18276o.m132214d().mo34703I5() && NullChecker.m82486a(sj6Var.f168926a) && NullChecker.m82486a(sj6Var.f168926a.additional) && NullChecker.m82486a(sj6Var.f168926a.additional.greetingInfo) && sj6Var.f168926a.additional.greetingInfo.fromGreeting) {
            return true;
        }
        if (CoreModule.m30933P().m143410g().mo36088xn() && NullChecker.m82486a(sj6Var.f168926a) && sj6Var.f168926a.isConfessionFirstConv()) {
            return true;
        }
        return CoreModule.m30933P().m143405a().mo34529jj() && NullChecker.m82486a(sj6Var.f168926a) && sj6Var.f168926a.isConfessionFirstConv();
    }

    @Override // p153l.z6m
    /* JADX INFO: renamed from: b */
    public CharSequence mo95725b(sj6 sj6Var, Message message) {
        return m218804c("来自抢先告白");
    }
}
