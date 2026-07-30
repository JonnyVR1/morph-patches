package p009l;

import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.card.VSwipeStack;
import com.tantanapp.common.utils.NullChecker;
import l.xx0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class oof extends kof {
    @Override // p009l.p3m
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo1468a(lof.C1021a c1021a) {
        Act act = c1021a.f16274a;
        if (NullChecker.a(act)) {
            xx0.g(act);
            c1021a.f16284k.mo279M3(c1021a.m17971a(), "other");
        }
        return VSwipeStack.OnCardSwipeResult.back;
    }

    @Override // p009l.p3m
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public boolean mo1469b(lof.C1021a c1021a) {
        return CoreModule.c.e0.f8();
    }
}
