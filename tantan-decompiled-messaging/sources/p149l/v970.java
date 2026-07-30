package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.feed.newui.photoalbum.interaction.FeedInteractionAct;
import java.util.Arrays;

/* JADX INFO: loaded from: classes12.dex */
public interface v970 {
    Act act();

    /* JADX INFO: renamed from: b */
    default void m197543b(int i, String str) {
        String strM197544c = m197544c(act());
        zvf0.m220399u("e_interested_user", strM197544c, m197545k(strM197544c, i, getEntranceType(), str));
    }

    /* JADX INFO: renamed from: c */
    default String m197544c(Act act) {
        return act instanceof FeedInteractionAct ? "p_interactcell_detail" : "p_activity";
    }

    String getEntranceType();

    /* JADX INFO: renamed from: k */
    default j760[] m197545k(String str, int i, String str2, String str3) {
        j760[] j760VarArr = {j760.m140076a("user_num", Integer.valueOf(i)), j760.m140076a("interested_user_entrance_type", str2)};
        if (!str.equals("p_interactcell_detail") || TextUtils.isEmpty(str3)) {
            return j760VarArr;
        }
        j760[] j760VarArr2 = (j760[]) Arrays.copyOf(j760VarArr, 3);
        j760VarArr2[2] = j760.m140076a("interact_type", str3);
        return j760VarArr2;
    }

    /* JADX INFO: renamed from: n */
    default void m197546n(int i, String str) {
        String strM197544c = m197544c(act());
        zvf0.m220368A("e_interested_user", strM197544c, m197545k(strM197544c, i, getEntranceType(), str));
    }
}
