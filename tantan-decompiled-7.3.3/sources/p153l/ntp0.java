package p153l;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.putong.data.CommonAssetsSettings;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class ntp0 {

    /* JADX INFO: renamed from: a */
    public static final List<String> f143623a;

    /* JADX INFO: renamed from: b */
    public static List<String> f143624b;

    static {
        ArrayList arrayList = new ArrayList();
        f143623a = arrayList;
        f143624b = new ArrayList();
        arrayList.add("omicdn.com");
        arrayList.add("tantanapp.net");
        arrayList.add("tantanapp.com");
        arrayList.add("tantanapp.cn");
        arrayList.add("tantantribe.com");
        arrayList.add("p1.com");
        arrayList.add("p1.cn");
        arrayList.add("omiapp.me");
        arrayList.add("tancdn.com");
        arrayList.add("p1staff.com");
        arrayList.add("tantantribe.com");
        arrayList.add("tantantribecdn.com");
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public static List<String> m164744b() {
        return (List) uqb0.f180392X.m144644f(new qcj() { // from class: l.mtp0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((CommonAssetsSettings) obj).androidUrlHostTokenWhitelist;
            }
        }, f143623a);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m164745c() {
        return "360store".equals(ls4.f133389a) || "baidu".equals(ls4.f133389a) || "ppzhushou".equals(ls4.f133389a) || "organic".equals(ls4.f133389a);
    }

    /* JADX INFO: renamed from: d */
    public static boolean m164746d(String str) {
        String host;
        Iterator<String> it;
        boolean z;
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        List<String> listM164744b = m164744b();
        if (!NullChecker.m82486a(listM164744b)) {
            return true;
        }
        try {
            Uri uri = Uri.parse(str);
            if (TextUtils.equals("file", uri.getScheme()) && m164747e(uri.getPath())) {
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
            CrashHelper.m82479c(e);
            host = "";
        }
        it = listM164744b.iterator();
        for (String str2 : f143624b) {
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
    public static boolean m164747e(String str) {
        return !TextUtils.isEmpty(str) && str.contains(rrp0.m182805a(App.f16088e));
    }

    /* JADX INFO: renamed from: f */
    public static void m164748f(String str) {
        if (m164745c()) {
            CrashHelper.m82479c(new IllegalStateException(str));
        }
    }
}
