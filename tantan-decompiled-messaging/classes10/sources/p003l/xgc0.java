package p003l;

import com.p000p1.mobile.putong.core.data.Conversation;
import com.p000p1.mobile.putong.core.data.Literatures;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.Iterator;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class xgc0 {
    /* JADX INFO: renamed from: a */
    public static String m10795a(Literatures literatures) {
        if (literatures == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        Iterator<String> it = literatures.kinds.iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            sb.append("/");
        }
        Iterator<String> it2 = literatures.authors.iterator();
        while (it2.hasNext()) {
            sb.append(it2.next());
            sb.append("/");
        }
        if (sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: b */
    public static String m10796b(Literatures literatures) {
        String str = literatures.category;
        str.getClass();
        switch (str) {
            case "teleplay":
                return "tv_show";
            case "book":
                return "book";
            case "movie":
                return "movie";
            default:
                return literatures.category;
        }
    }

    /* JADX INFO: renamed from: c */
    public static boolean m10797c(String str) {
        Conversation conversationXe = CoreModule.c.f0.Xe(str);
        return NullChecker.a(conversationXe) && TEnum.equals(conversationXe.status, "default");
    }
}
