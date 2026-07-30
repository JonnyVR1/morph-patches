package p009l;

import android.text.TextUtils;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.data.GPTopicCard;
import com.p1.mobile.putong.data.LookingFor;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.n3b0;
import l.x2c0;
import l.xaj0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class rgj {

    /* JADX INFO: renamed from: a */
    public static String[] f19827a = {"nearby", "online", "popular", "new", "select"};

    /* JADX INFO: renamed from: b */
    public static int[] f19828b = {x2c0.nu, x2c0.pu, x2c0.qu, x2c0.ou, x2c0.ru};

    /* JADX INFO: renamed from: c */
    public static int[] f19829c = {R.string.Jp, R.string.Lp, R.string.Ip, R.string.Kp, R.string.Hp};

    /* JADX INFO: renamed from: d */
    public static xaj0<Integer, Integer, Integer>[] f19830d = {xaj0.a(Integer.valueOf(R.string.Wp), Integer.valueOf(R.string.Xp), Integer.valueOf(R.string.Vp)), xaj0.a(Integer.valueOf(R.string.cq), Integer.valueOf(R.string.dq), Integer.valueOf(R.string.bq)), xaj0.a(Integer.valueOf(R.string.Tp), Integer.valueOf(R.string.Up), Integer.valueOf(R.string.Sp)), xaj0.a(Integer.valueOf(R.string.Zp), Integer.valueOf(R.string.aq), Integer.valueOf(R.string.Yp)), xaj0.a(Integer.valueOf(R.string.Qp), Integer.valueOf(R.string.Rp), Integer.valueOf(R.string.Pp))};

    /* JADX INFO: renamed from: e */
    public static int[] f19831e;

    static {
        int i = R.string.Op;
        f19831e = new int[]{i, R.string.Np, R.string.Mp, i, i};
    }

    /* JADX INFO: renamed from: a */
    public static boolean m21658a(String str) {
        if (n3b0.q()) {
            return TextUtils.equals(str, "online") || TextUtils.equals(str, "popular");
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static List<GPTopicCard> m21659b(List<GPTopicCard> list) {
        User userP9 = CoreModule.c.e0.p9();
        LookingFor lookingFor = LookingFor.get("female");
        if (NullChecker.a(userP9)) {
            lookingFor = userP9.settings.lookingFor;
        }
        for (int i = 0; i < list.size(); i++) {
            GPTopicCard gPTopicCard = list.get(i);
            if (TextUtils.isEmpty(gPTopicCard.name)) {
                gPTopicCard.name = f19827a[i];
            }
            gPTopicCard.topicName = f19829c[i];
            gPTopicCard.iconRes = f19828b[i];
            gPTopicCard.headerDesc = ((Integer) (TEnum.equals(lookingFor, "female") ? f19830d[i].a : TEnum.equals(lookingFor, "male") ? f19830d[i].b : f19830d[i].c)).intValue();
            gPTopicCard.payBtnDesc = f19831e[i];
        }
        return list;
    }
}
