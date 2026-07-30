package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.core.api.CoreSuggested;
import com.p051p1.mobile.putong.core.data.ContainerLabelsType;
import com.p051p1.mobile.putong.core.data.DynamicLable;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class zl4 {
    /* JADX INFO: renamed from: a */
    public static boolean m220165a(CoreSuggested.UserInfo userInfo, User user) {
        if (m220166b(ContainerLabelsType.membership_exclusive, userInfo)) {
            return true;
        }
        if (ti5.m191321g() && NullChecker.m82486a(userInfo) && !TextUtils.isEmpty(userInfo.payCardStyle) && ti5.m191319e(userInfo.payCardStyle) && !wi5.m206550d().m206552e()) {
            return true;
        }
        if (userInfo != null && user != null && !user.isMe() && TextUtils.isEmpty(k1l.m147864a(user, userInfo.getRecommendMessage())) && e760.INSTANCE.m119687c(userInfo) && spl0.m187367S()) {
            f760.Companion companion = f760.INSTANCE;
            if (companion.m124363j() && companion.m124365l()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m220166b(String str, CoreSuggested.UserInfo userInfo) {
        if (userInfo == null) {
            return false;
        }
        List<DynamicLable> list = userInfo.dynamicLabelList;
        if (jyb.m147479J(list)) {
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
    public static boolean m220167c(CoreSuggested.UserInfo userInfo, User user) {
        if ((!NullChecker.m82486a(userInfo) || TextUtils.isEmpty(userInfo.payCardStyle) || !"chat".equals(userInfo.payCardStyle)) && ((!NullChecker.m82486a(userInfo) || !f760.INSTANCE.m124364k(userInfo)) && !m220165a(userInfo, user))) {
            return false;
        }
        if (!m220165a(userInfo, user)) {
            return true;
        }
        userInfo.payCardStyle = "chat";
        return true;
    }
}
