package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.data.GPTopicCard;
import com.p051p1.mobile.putong.data.LookingFor;
import com.p051p1.mobile.putong.data.SuperlikeReason;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import com.tantanapp.media.ttmediautils.tinker.ShareConstants;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class ljj {

    /* JADX INFO: renamed from: a */
    public static String[] f132338a = {"nearby", "online", SuperlikeReason.popular, ShareConstants.NEW_VERSION, "select"};

    /* JADX INFO: renamed from: b */
    public static int[] f132339b = {dbc0.f86873bv, dbc0.f86938dv, dbc0.f86971ev, dbc0.f86906cv, dbc0.f87004fv};

    /* JADX INFO: renamed from: c */
    public static int[] f132340c = {R$string.f19226eq, R$string.f19288gq, R$string.f19195dq, R$string.f19257fq, R$string.f19165cq};

    /* JADX INFO: renamed from: d */
    public static bkj0<Integer, Integer, Integer>[] f132341d = {bkj0.m104818a(Integer.valueOf(R$string.f19627rq), Integer.valueOf(R$string.f19658sq), Integer.valueOf(R$string.f19596qq)), bkj0.m104818a(Integer.valueOf(R$string.f19813xq), Integer.valueOf(R$string.f19844yq), Integer.valueOf(R$string.f19782wq)), bkj0.m104818a(Integer.valueOf(R$string.f19534oq), Integer.valueOf(R$string.f19565pq), Integer.valueOf(R$string.f19503nq)), bkj0.m104818a(Integer.valueOf(R$string.f19720uq), Integer.valueOf(R$string.f19751vq), Integer.valueOf(R$string.f19689tq)), bkj0.m104818a(Integer.valueOf(R$string.f19441lq), Integer.valueOf(R$string.f19472mq), Integer.valueOf(R$string.f19410kq))};

    /* JADX INFO: renamed from: e */
    public static int[] f132342e;

    static {
        int i = R$string.f19379jq;
        f132342e = new int[]{i, R$string.f19349iq, R$string.f19319hq, i, i};
    }

    /* JADX INFO: renamed from: a */
    public static boolean m154509a(String str) {
        if (rbb0.m180744q()) {
            return TextUtils.equals(str, "online") || TextUtils.equals(str, SuperlikeReason.popular);
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static List<GPTopicCard> m154510b(List<GPTopicCard> list) {
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        LookingFor lookingFor = LookingFor.get("female");
        if (NullChecker.m82486a(userM116600p9)) {
            lookingFor = userM116600p9.settings.lookingFor;
        }
        for (int i = 0; i < list.size(); i++) {
            GPTopicCard gPTopicCard = list.get(i);
            if (TextUtils.isEmpty(gPTopicCard.name)) {
                gPTopicCard.name = f132338a[i];
            }
            gPTopicCard.topicName = f132340c[i];
            gPTopicCard.iconRes = f132339b[i];
            gPTopicCard.headerDesc = (TEnum.equals(lookingFor, "female") ? f132341d[i].f77081a : TEnum.equals(lookingFor, "male") ? f132341d[i].f77082b : f132341d[i].f77083c).intValue();
            gPTopicCard.payBtnDesc = f132342e[i];
        }
        return list;
    }
}
