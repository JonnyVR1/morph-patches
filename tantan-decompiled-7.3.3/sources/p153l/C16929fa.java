package p153l;

import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.p058ui.seepage.likers.FakeLikersAct;
import java.util.Random;

/* JADX INFO: renamed from: l.fa */
/* JADX INFO: loaded from: classes6.dex */
public final class C16929fa {

    /* JADX INFO: renamed from: a */
    public static float f97929a;

    /* JADX INFO: renamed from: b */
    public static int f97930b;

    /* JADX INFO: renamed from: a */
    public static float m124690a(int i, long j) {
        float fNextFloat;
        float f;
        if (i < 67) {
            fNextFloat = new Random().nextFloat();
            f = 8.0f;
        } else {
            fNextFloat = new Random().nextFloat();
            f = 9.0f;
        }
        return fNextFloat + f;
    }

    /* JADX INFO: renamed from: b */
    public static float m124691b(int i, long j, boolean z) {
        if (z || f97930b % 4 == 0) {
            f97929a = m124690a(i, j);
            f97930b = 0;
        }
        f97930b++;
        return f97929a;
    }

    /* JADX INFO: renamed from: c */
    public static int m124692c(long j) {
        return (int) ((1.0d - ((j * 1.0d) / ((double) (CoreModule.f18264c.f20377c2.m118404p3() * 1000)))) * 100.0d);
    }

    /* JADX INFO: renamed from: d */
    public static String m124693d(Act act, boolean z) {
        if (z) {
            return "p_accelerate_data,again";
        }
        if (CoreModule.m30933P().m143405a().mo34514he(act)) {
            return "p_home,accelerate_entrance";
        }
        if (CoreModule.m30933P().m143410g().mo36047Zn(act)) {
            return "p_wallet,e_wallet_boost_button,click";
        }
        return act instanceof FakeLikersAct ? "p_intl_plm,e_intl_plm_turbo_card,click" : "";
    }
}
