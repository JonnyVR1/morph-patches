package p003l;

import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.app.PutongAct;
import com.p1.mobile.putong.core.newui.home.frag.base.NewTanFragTag;
import com.p1.mobile.putong.core.newui.main.NewMainAct;
import com.tantanapp.common.utils.NullChecker;
import l.upa;
import l.w0c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class p8l {

    /* JADX INFO: renamed from: l.p8l$a */
    public static /* synthetic */ class C0469a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f6331a;

        static {
            int[] iArr = new int[NewTanFragTag.values().length];
            f6331a = iArr;
            try {
                iArr[NewTanFragTag.TOP_PICKS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m6803a(Act act, NewTanFragTag newTanFragTag) {
        if (C0469a.f6331a[newTanFragTag.ordinal()] != 1) {
            act.setStatusBarColor(upa.L3() ? 0 : act.getResources().getColor(w0c0.b2));
            PutongAct.setLightStatusBar(act.getWindow(), 16);
            if (NullChecker.a(act) && (act instanceof NewMainAct)) {
                NewMainAct newMainAct = (NewMainAct) act;
                newMainAct.Z5().G(act.getResources().getColor(w0c0.N));
                newMainAct.Z5().H(1.0f);
                act.setNavigationBarColor(act.color(w0c0.b2));
            }
        }
    }
}
