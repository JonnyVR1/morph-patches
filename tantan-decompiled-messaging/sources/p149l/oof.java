package p149l;

import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.card.VSwipeStack;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes11.dex */
public class oof extends kof {
    @Override // p149l.p3m
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo37497a(lof.C18270a c18270a) {
        Act act = c18270a.f129091a;
        if (NullChecker.m81303a(act)) {
            xx0.m211438g(act);
            c18270a.f129101k.mo36354M3(c18270a.m150772a(), "other");
        }
        return VSwipeStack.OnCardSwipeResult.back;
    }

    @Override // p149l.p3m
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public boolean mo37498b(lof.C18270a c18270a) {
        return CoreModule.f17545c.f19639e0.m169486f8();
    }
}
