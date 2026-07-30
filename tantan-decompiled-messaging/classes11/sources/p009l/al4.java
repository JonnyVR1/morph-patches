package p009l;

import android.text.TextUtils;
import com.p1.mobile.putong.core.api.CoreSuggested;
import com.p1.mobile.putong.core.data.DynamicLable;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.Iterator;
import java.util.List;
import l.az50;
import l.ogl0;
import l.uyk;
import l.vwb;
import l.wh5;
import l.zy50;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class al4 {
    /* JADX INFO: renamed from: a */
    public static boolean m11500a(CoreSuggested.UserInfo userInfo, User user) {
        if (m11501b("membership_exclusive", userInfo)) {
            return true;
        }
        if (th5.m22533g() && NullChecker.a(userInfo) && !TextUtils.isEmpty(userInfo.payCardStyle) && th5.m22531e(userInfo.payCardStyle) && !wh5.d().e()) {
            return true;
        }
        if (userInfo != null && user != null && !user.isMe() && TextUtils.isEmpty(uyk.a(user, userInfo.getRecommendMessage())) && zy50.INSTANCE.c(userInfo) && ogl0.S()) {
            az50.a aVar = az50.Companion;
            if (aVar.j() && aVar.l()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m11501b(String str, CoreSuggested.UserInfo userInfo) {
        if (userInfo == null) {
            return false;
        }
        List list = userInfo.dynamicLabelList;
        if (vwb.J(list)) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (TextUtils.equals(((DynamicLable) it.next()).type, str)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m11502c(CoreSuggested.UserInfo userInfo, User user) {
        if ((!NullChecker.a(userInfo) || TextUtils.isEmpty(userInfo.payCardStyle) || !"chat".equals(userInfo.payCardStyle)) && ((!NullChecker.a(userInfo) || !az50.Companion.k(userInfo)) && !m11500a(userInfo, user))) {
            return false;
        }
        if (!m11500a(userInfo, user)) {
            return true;
        }
        userInfo.payCardStyle = "chat";
        return true;
    }
}
