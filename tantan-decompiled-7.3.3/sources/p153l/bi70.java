package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.feed.newui.photoalbum.interaction.FeedInteractionAct;
import java.util.Arrays;

/* JADX INFO: loaded from: classes13.dex */
public interface bi70 {
    Act act();

    /* JADX INFO: renamed from: b */
    default void m104423b(int i, String str) {
        String strM104424c = m104424c(act());
        i4g0.m138523u("e_interested_user", strM104424c, m104425k(strM104424c, i, getEntranceType(), str));
    }

    /* JADX INFO: renamed from: c */
    default String m104424c(Act act) {
        return act instanceof FeedInteractionAct ? "p_interactcell_detail" : "p_activity";
    }

    String getEntranceType();

    /* JADX INFO: renamed from: k */
    default pf60[] m104425k(String str, int i, String str2, String str3) {
        pf60[] pf60VarArr = {pf60.m172085a("user_num", Integer.valueOf(i)), pf60.m172085a("interested_user_entrance_type", str2)};
        if (!str.equals("p_interactcell_detail") || TextUtils.isEmpty(str3)) {
            return pf60VarArr;
        }
        pf60[] pf60VarArr2 = (pf60[]) Arrays.copyOf(pf60VarArr, 3);
        pf60VarArr2[2] = pf60.m172085a("interact_type", str3);
        return pf60VarArr2;
    }

    /* JADX INFO: renamed from: n */
    default void m104426n(int i, String str) {
        String strM104424c = m104424c(act());
        i4g0.m138492A("e_interested_user", strM104424c, m104425k(strM104424c, i, getEntranceType(), str));
    }
}
