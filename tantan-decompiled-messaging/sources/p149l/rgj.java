package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.data.GPTopicCard;
import com.p046p1.mobile.putong.data.LookingFor;
import com.p046p1.mobile.putong.data.SuperlikeReason;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import com.tantanapp.media.ttmediautils.tinker.ShareConstants;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class rgj {

    /* JADX INFO: renamed from: a */
    public static String[] f159256a = {"nearby", "online", SuperlikeReason.popular, ShareConstants.NEW_VERSION, "select"};

    /* JADX INFO: renamed from: b */
    public static int[] f159257b = {x2c0.f190409nu, x2c0.f190473pu, x2c0.f190505qu, x2c0.f190441ou, x2c0.f190537ru};

    /* JADX INFO: renamed from: c */
    public static int[] f159258c = {R$string.f17862Jp, R$string.f17922Lp, R$string.f17832Ip, R$string.f17892Kp, R$string.f17802Hp};

    /* JADX INFO: renamed from: d */
    public static xaj0<Integer, Integer, Integer>[] f159259d = {xaj0.m207578a(Integer.valueOf(R$string.f18252Wp), Integer.valueOf(R$string.f18282Xp), Integer.valueOf(R$string.f18222Vp)), xaj0.m207578a(Integer.valueOf(R$string.f18435cq), Integer.valueOf(R$string.f18465dq), Integer.valueOf(R$string.f18404bq)), xaj0.m207578a(Integer.valueOf(R$string.f18162Tp), Integer.valueOf(R$string.f18192Up), Integer.valueOf(R$string.f18132Sp)), xaj0.m207578a(Integer.valueOf(R$string.f18342Zp), Integer.valueOf(R$string.f18373aq), Integer.valueOf(R$string.f18312Yp)), xaj0.m207578a(Integer.valueOf(R$string.f18072Qp), Integer.valueOf(R$string.f18102Rp), Integer.valueOf(R$string.f18042Pp))};

    /* JADX INFO: renamed from: e */
    public static int[] f159260e;

    static {
        int i = R$string.f18012Op;
        f159260e = new int[]{i, R$string.f17982Np, R$string.f17952Mp, i, i};
    }

    /* JADX INFO: renamed from: a */
    public static boolean m179167a(String str) {
        if (n3b0.m157742q()) {
            return TextUtils.equals(str, "online") || TextUtils.equals(str, SuperlikeReason.popular);
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static List<GPTopicCard> m179168b(List<GPTopicCard> list) {
        User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        LookingFor lookingFor = LookingFor.get("female");
        if (NullChecker.m81303a(userM169527p9)) {
            lookingFor = userM169527p9.settings.lookingFor;
        }
        for (int i = 0; i < list.size(); i++) {
            GPTopicCard gPTopicCard = list.get(i);
            if (TextUtils.isEmpty(gPTopicCard.name)) {
                gPTopicCard.name = f159256a[i];
            }
            gPTopicCard.topicName = f159258c[i];
            gPTopicCard.iconRes = f159257b[i];
            gPTopicCard.headerDesc = (TEnum.equals(lookingFor, "female") ? f159259d[i].f191751a : TEnum.equals(lookingFor, "male") ? f159259d[i].f191752b : f159259d[i].f191753c).intValue();
            gPTopicCard.payBtnDesc = f159260e[i];
        }
        return list;
    }
}
