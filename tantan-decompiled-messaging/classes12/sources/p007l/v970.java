package p007l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.feed.newui.photoalbum.interaction.FeedInteractionAct;
import com.p1.mobile.android.app.Act;
import java.util.Arrays;
import l.j760;
import l.zvf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public interface v970 {
    Act act();

    /* JADX INFO: renamed from: b */
    default void m15369b(int i, String str) {
        String strM15370c = m15370c(act());
        zvf0.u("e_interested_user", strM15370c, m15371k(strM15370c, i, getEntranceType(), str));
    }

    /* JADX INFO: renamed from: c */
    default String m15370c(Act act) {
        return act instanceof FeedInteractionAct ? "p_interactcell_detail" : "p_activity";
    }

    String getEntranceType();

    /* JADX INFO: renamed from: k */
    default j760[] m15371k(String str, int i, String str2, String str3) {
        j760[] j760VarArr = {j760.a("user_num", Integer.valueOf(i)), j760.a("interested_user_entrance_type", str2)};
        if (!str.equals("p_interactcell_detail") || TextUtils.isEmpty(str3)) {
            return j760VarArr;
        }
        j760[] j760VarArr2 = (j760[]) Arrays.copyOf(j760VarArr, 3);
        j760VarArr2[2] = j760.a("interact_type", str3);
        return j760VarArr2;
    }

    /* JADX INFO: renamed from: n */
    default void m15372n(int i, String str) {
        String strM15370c = m15370c(act());
        zvf0.A("e_interested_user", strM15370c, m15371k(strM15370c, i, getEntranceType(), str));
    }
}
