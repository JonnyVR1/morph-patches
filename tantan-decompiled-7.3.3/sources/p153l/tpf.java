package p153l;

import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.card.VSwipeStack;

/* JADX INFO: loaded from: classes11.dex */
public class tpf extends rpf {
    @Override // p153l.g6m
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo38500a(spf.C20128a c20128a) {
        qyf.m178643f().m178647h(c20128a.f170041c);
        c20128a.f170049k.mo37357M3(c20128a.m187342a(), "other");
        return VSwipeStack.OnCardSwipeResult.back;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m192129i() {
        if (CoreModule.f18264c.f20381e0.m116537Z7()) {
            return true;
        }
        return CoreModule.f18264c.f20381e0.m116549c8() && !k3g.m148016a();
    }

    @Override // p153l.g6m
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public boolean mo38501b(spf.C20128a c20128a) {
        return m192129i();
    }
}
