package p149l;

import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.card.VSwipeStack;

/* JADX INFO: loaded from: classes11.dex */
public class rph extends pph {
    /* JADX INFO: renamed from: i */
    private boolean m180327i() {
        if (CoreModule.f17545c.f19639e0.m169464Z7()) {
            return true;
        }
        return CoreModule.f17545c.f19639e0.m169476c8() && !w1g.m200928a();
    }

    @Override // p149l.p3m
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo37497a(qph.C19553a c19553a) {
        cxf.m109094f().m109098h(c19553a.f155759c);
        c19553a.f155763g.mo43130k2(c19553a.f155762f, "failFakeUser");
        return VSwipeStack.OnCardSwipeResult.back;
    }

    @Override // p149l.p3m
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public boolean mo37498b(qph.C19553a c19553a) {
        return m180327i();
    }
}
