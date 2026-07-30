package p009l;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p1.mobile.android.app.App;
import com.p1.mobile.putong.data.CommonAssetsSettings;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l.mr4;
import l.nip0;
import l.qib0;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class jkp0 {

    /* JADX INFO: renamed from: a */
    public static final List<String> f15219a;

    /* JADX INFO: renamed from: b */
    public static List<String> f15220b;

    static {
        ArrayList arrayList = new ArrayList();
        f15219a = arrayList;
        f15220b = new ArrayList();
        arrayList.add("omicdn.com");
        arrayList.add("tantanapp.net");
        arrayList.add("tantanapp.com");
        arrayList.add("tantanapp.cn");
        arrayList.add("tantanapp.cn");
        arrayList.add("p1.com");
        arrayList.add("p1.cn");
        arrayList.add("omiapp.me");
        arrayList.add("tancdn.com");
        arrayList.add("p1staff.com");
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public static List<String> m17143b() {
        return (List) qib0.X.f(new w9j() { // from class: l.ikp0
            public final Object call(Object obj) {
                return ((CommonAssetsSettings) obj).androidUrlHostTokenWhitelist;
            }
        }, f15219a);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m17144c() {
        return "360store".equals(mr4.a) || "baidu".equals(mr4.a) || "ppzhushou".equals(mr4.a) || "organic".equals(mr4.a);
    }

    /* JADX INFO: renamed from: d */
    public static boolean m17145d(String str) {
        String host;
        Iterator<String> it;
        boolean z;
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        List<String> listM17143b = m17143b();
        if (!NullChecker.a(listM17143b)) {
            return true;
        }
        try {
            Uri uri = Uri.parse(str);
            if (TextUtils.equals("file", uri.getScheme()) && m17146e(uri.getPath())) {
                return true;
            }
            host = uri.getHost();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                String next = it.next();
                if (!TextUtils.isEmpty(host)) {
                    if (!host.equals(next)) {
                        if (host.endsWith("." + next)) {
                        }
                    }
                    z = true;
                    break;
                }
            }
        } catch (Exception e) {
            CrashHelper.c(e);
            host = "";
        }
        it = listM17143b.iterator();
        for (String str2 : f15220b) {
            if (!TextUtils.isEmpty(host)) {
                if (host.equals(str2)) {
                    return true;
                }
                if (host.endsWith("." + str2)) {
                    return true;
                }
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m17146e(String str) {
        return !TextUtils.isEmpty(str) && str.contains(nip0.a(App.e));
    }

    /* JADX INFO: renamed from: f */
    public static void m17147f(String str) {
        if (m17144c()) {
            CrashHelper.c(new IllegalStateException(str));
        }
    }
}
