package p153l;

import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.data.Literatures;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.Iterator;

/* JADX INFO: loaded from: classes12.dex */
public class epc0 {
    /* JADX INFO: renamed from: a */
    public static String m121846a(Literatures literatures) {
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
    public static String m121847b(Literatures literatures) {
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
    public static boolean m121848c(String str) {
        Conversation conversationM33859Xe = CoreModule.f18264c.f20384f0.m33859Xe(str);
        return NullChecker.m82486a(conversationM33859Xe) && TEnum.equals(conversationM33859Xe.status, "default");
    }
}
