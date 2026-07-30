package p149l;

import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.p053ui.seepage.likers.FakeLikersAct;
import java.util.Random;

/* JADX INFO: renamed from: l.ka */
/* JADX INFO: loaded from: classes8.dex */
public final class C17963ka {

    /* JADX INFO: renamed from: a */
    public static float f122081a;

    /* JADX INFO: renamed from: b */
    public static int f122082b;

    /* JADX INFO: renamed from: a */
    public static float m145127a(int i, long j) {
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
    public static float m145128b(int i, long j, boolean z) {
        if (z || f122082b % 4 == 0) {
            f122081a = m145127a(i, j);
            f122082b = 0;
        }
        f122082b++;
        return f122081a;
    }

    /* JADX INFO: renamed from: c */
    public static int m145129c(long j) {
        return (int) ((1.0d - ((j * 1.0d) / ((double) (CoreModule.f17545c.f19635c2.m99144p3() * 1000)))) * 100.0d);
    }

    /* JADX INFO: renamed from: d */
    public static String m145130d(Act act, boolean z) {
        if (z) {
            return "p_accelerate_data,again";
        }
        if (CoreModule.m29935P().m94651a().mo33511he(act)) {
            return "p_home,accelerate_entrance";
        }
        if (CoreModule.m29935P().m94656g().mo35044Zn(act)) {
            return "p_wallet,e_wallet_boost_button,click";
        }
        return act instanceof FakeLikersAct ? "p_intl_plm,e_intl_plm_turbo_card,click" : "";
    }
}
