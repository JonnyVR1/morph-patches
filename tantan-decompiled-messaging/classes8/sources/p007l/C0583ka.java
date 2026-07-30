package p007l;

import com.p003p1.mobile.android.app.Act;
import com.p003p1.mobile.longlink.msg.connector.LongLinkMessage;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.ui.seepage.likers.FakeLikersAct;
import java.util.Random;

/* JADX INFO: renamed from: l.ka */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public final class C0583ka {

    /* JADX INFO: renamed from: a */
    public static float f3044a;

    /* JADX INFO: renamed from: b */
    public static int f3045b;

    /* JADX INFO: renamed from: a */
    public static float m9573a(int i, long j) {
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
    public static float m9574b(int i, long j, boolean z) {
        if (z || f3045b % 4 == 0) {
            f3044a = m9573a(i, j);
            f3045b = 0;
        }
        f3045b++;
        return f3044a;
    }

    /* JADX INFO: renamed from: c */
    public static int m9575c(long j) {
        return (int) ((1.0d - ((j * 1.0d) / ((double) (CoreModule.c.c2.p3() * LongLinkMessage.MsgTypeEnum.MSG_TYPE_COMMON_VALUE)))) * 100.0d);
    }

    /* JADX INFO: renamed from: d */
    public static String m9576d(Act act, boolean z) {
        if (z) {
            return "p_accelerate_data,again";
        }
        if (CoreModule.P().a().he(act)) {
            return "p_home,accelerate_entrance";
        }
        if (CoreModule.P().g().Zn(act)) {
            return "p_wallet,e_wallet_boost_button,click";
        }
        return act instanceof FakeLikersAct ? "p_intl_plm,e_intl_plm_turbo_card,click" : "";
    }
}
