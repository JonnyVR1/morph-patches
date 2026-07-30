package p153l;

import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.oms.OmsDialog;

/* JADX INFO: loaded from: classes12.dex */
public class gg50 extends o8l {
    public gg50(String str, boolean z) {
        super(str, z);
    }

    @Override // p153l.o8l
    /* JADX INFO: renamed from: d */
    public boolean mo130140d(p8l.C19323a c19323a) {
        j7d0.m143779h0(c19323a.f151041b);
        return true;
    }

    @Override // p153l.o8l, p153l.g6m
    /* JADX INFO: renamed from: e */
    public boolean mo38501b(p8l.C19323a c19323a) {
        boolean zM143777f0 = j7d0.m143777f0();
        if (CoreModule.f18264c.f20381e0.m116600p9().isBanned()) {
            return false;
        }
        if (!spl0.m187354F() || pk50.m172568j().m172574f().m181649M(OmsDialog.p_offline_popup.getIdentifier(), false)) {
            return zM143777f0;
        }
        j7d0.m143774c0().f118681f = true;
        return false;
    }

    @Override // p153l.o8l
    /* JADX INFO: renamed from: f */
    public boolean mo130142f(p8l.C19323a c19323a) {
        return false;
    }
}
