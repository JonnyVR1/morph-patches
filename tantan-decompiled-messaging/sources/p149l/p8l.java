package p149l;

import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.core.newui.home.frag.base.NewTanFragTag;
import com.p046p1.mobile.putong.core.newui.main.NewMainAct;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes3.dex */
public class p8l {

    /* JADX INFO: renamed from: l.p8l$a */
    public static /* synthetic */ class C19156a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f147612a;

        static {
            int[] iArr = new int[NewTanFragTag.values().length];
            f147612a = iArr;
            try {
                iArr[NewTanFragTag.TOP_PICKS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m167802a(Act act, NewTanFragTag newTanFragTag) {
        if (C19156a.f147612a[newTanFragTag.ordinal()] != 1) {
            act.setStatusBarColor(upa.m194665L3() ? 0 : act.getResources().getColor(w0c0.f183834b2));
            PutongAct.setLightStatusBar(act.getWindow(), 16);
            if (NullChecker.m81303a(act) && (act instanceof NewMainAct)) {
                NewMainAct newMainAct = (NewMainAct) act;
                newMainAct.m39801Z5().m39966G(act.getResources().getColor(w0c0.f183788N));
                newMainAct.m39801Z5().m39968H(1.0f);
                act.setNavigationBarColor(act.color(w0c0.f183834b2));
            }
        }
    }
}
