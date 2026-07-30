package p153l;

import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.core.newui.home.frag.base.NewTanFragTag;
import com.p051p1.mobile.putong.core.newui.main.NewMainAct;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes3.dex */
public class fbl {

    /* JADX INFO: renamed from: l.fbl$a */
    public static /* synthetic */ class C16937a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f98117a;

        static {
            int[] iArr = new int[NewTanFragTag.values().length];
            f98117a = iArr;
            try {
                iArr[NewTanFragTag.TOP_PICKS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m124897a(Act act, NewTanFragTag newTanFragTag) {
        if (C16937a.f98117a[newTanFragTag.ordinal()] != 1) {
            act.setStatusBarColor(gra.m131596L3() ? 0 : act.getResources().getColor(c9c0.f80407c2));
            PutongAct.setLightStatusBar(act.getWindow(), 16);
            if (NullChecker.m82486a(act) && (act instanceof NewMainAct)) {
                NewMainAct newMainAct = (NewMainAct) act;
                newMainAct.m40810d6().m40973G(act.getResources().getColor(c9c0.f80357N));
                newMainAct.m40810d6().m40975H(1.0f);
                act.setNavigationBarColor(act.color(c9c0.f80407c2));
            }
        }
    }
}
