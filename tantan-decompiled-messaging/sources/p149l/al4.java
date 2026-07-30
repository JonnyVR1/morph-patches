package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.core.api.CoreSuggested;
import com.p046p1.mobile.putong.core.data.ContainerLabelsType;
import com.p046p1.mobile.putong.core.data.DynamicLable;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class al4 {
    /* JADX INFO: renamed from: a */
    public static boolean m97264a(CoreSuggested.UserInfo userInfo, User user) {
        if (m97265b(ContainerLabelsType.membership_exclusive, userInfo)) {
            return true;
        }
        if (th5.m188864g() && NullChecker.m81303a(userInfo) && !TextUtils.isEmpty(userInfo.payCardStyle) && th5.m188862e(userInfo.payCardStyle) && !wh5.m203106d().m203108e()) {
            return true;
        }
        if (userInfo != null && user != null && !user.isMe() && TextUtils.isEmpty(uyk.m196292a(user, userInfo.getRecommendMessage())) && zy50.INSTANCE.m220890c(userInfo) && ogl0.m164240S()) {
            az50.Companion companion = az50.INSTANCE;
            if (companion.m99630j() && companion.m99632l()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m97265b(String str, CoreSuggested.UserInfo userInfo) {
        if (userInfo == null) {
            return false;
        }
        List<DynamicLable> list = userInfo.dynamicLabelList;
        if (vwb.m200296J(list)) {
            return false;
        }
        Iterator<DynamicLable> it = list.iterator();
        while (it.hasNext()) {
            if (TextUtils.equals(it.next().type, str)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m97266c(CoreSuggested.UserInfo userInfo, User user) {
        if ((!NullChecker.m81303a(userInfo) || TextUtils.isEmpty(userInfo.payCardStyle) || !"chat".equals(userInfo.payCardStyle)) && ((!NullChecker.m81303a(userInfo) || !az50.INSTANCE.m99631k(userInfo)) && !m97264a(userInfo, user))) {
            return false;
        }
        if (!m97264a(userInfo, user)) {
            return true;
        }
        userInfo.payCardStyle = "chat";
        return true;
    }
}
