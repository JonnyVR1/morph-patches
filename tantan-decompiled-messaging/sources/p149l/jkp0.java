package p149l;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.putong.data.CommonAssetsSettings;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class jkp0 {

    /* JADX INFO: renamed from: a */
    public static final List<String> f118403a;

    /* JADX INFO: renamed from: b */
    public static List<String> f118404b;

    static {
        ArrayList arrayList = new ArrayList();
        f118403a = arrayList;
        f118404b = new ArrayList();
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
    public static List<String> m141902b() {
        return (List) qib0.f154709X.m95176f(new w9j() { // from class: l.ikp0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((CommonAssetsSettings) obj).androidUrlHostTokenWhitelist;
            }
        }, f118403a);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m141903c() {
        return "360store".equals(mr4.f135329a) || "baidu".equals(mr4.f135329a) || "ppzhushou".equals(mr4.f135329a) || "organic".equals(mr4.f135329a);
    }

    /* JADX INFO: renamed from: d */
    public static boolean m141904d(String str) {
        String host;
        Iterator<String> it;
        boolean z;
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        List<String> listM141902b = m141902b();
        if (!NullChecker.m81303a(listM141902b)) {
            return true;
        }
        try {
            Uri uri = Uri.parse(str);
            if (TextUtils.equals("file", uri.getScheme()) && m141905e(uri.getPath())) {
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
            CrashHelper.m81296c(e);
            host = "";
        }
        it = listM141902b.iterator();
        for (String str2 : f118404b) {
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
    public static boolean m141905e(String str) {
        return !TextUtils.isEmpty(str) && str.contains(nip0.m159542a(App.f15369e));
    }

    /* JADX INFO: renamed from: f */
    public static void m141906f(String str) {
        if (m141903c()) {
            CrashHelper.m81296c(new IllegalStateException(str));
        }
    }
}
