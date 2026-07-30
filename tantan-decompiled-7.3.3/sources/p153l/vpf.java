package p153l;

import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.card.VSwipeStack;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes11.dex */
public class vpf extends rpf {
    @Override // p153l.g6m
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo38500a(spf.C20128a c20128a) {
        Act act = c20128a.f170039a;
        if (NullChecker.m82486a(act)) {
            ey0.m123125g(act);
            c20128a.f170049k.mo37357M3(c20128a.m187342a(), "other");
        }
        return VSwipeStack.OnCardSwipeResult.back;
    }

    @Override // p153l.g6m
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public boolean mo38501b(spf.C20128a c20128a) {
        return CoreModule.f18264c.f20381e0.m116559f8();
    }
}
