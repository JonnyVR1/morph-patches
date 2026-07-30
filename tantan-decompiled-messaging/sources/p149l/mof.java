package p149l;

import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.card.VSwipeStack;

/* JADX INFO: loaded from: classes11.dex */
public class mof extends kof {
    @Override // p149l.p3m
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo37497a(lof.C18270a c18270a) {
        cxf.m109094f().m109098h(c18270a.f129093c);
        c18270a.f129101k.mo36354M3(c18270a.m150772a(), "other");
        return VSwipeStack.OnCardSwipeResult.back;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m155676i() {
        if (CoreModule.f17545c.f19639e0.m169464Z7()) {
            return true;
        }
        return CoreModule.f17545c.f19639e0.m169476c8() && !w1g.m200928a();
    }

    @Override // p149l.p3m
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public boolean mo37498b(lof.C18270a c18270a) {
        return m155676i();
    }
}
