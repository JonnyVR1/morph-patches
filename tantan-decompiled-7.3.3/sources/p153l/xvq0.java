package p153l;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.push.C14892gj;
import java.text.SimpleDateFormat;

/* JADX INFO: loaded from: classes2.dex */
public class xvq0 {

    /* JADX INFO: renamed from: a */
    private static SimpleDateFormat f196419a;

    /* JADX INFO: renamed from: b */
    private static String f196420b;

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd");
        f196419a = simpleDateFormat;
        f196420b = simpleDateFormat.format(Long.valueOf(System.currentTimeMillis()));
    }

    /* JADX INFO: renamed from: a */
    public static C14892gj m213258a(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        C14892gj c14892gj = new C14892gj();
        c14892gj.m86803d("category_push_stat");
        c14892gj.m86784a("push_sdk_stat_channel");
        c14892gj.m86783a(1L);
        c14892gj.m86795b(str);
        c14892gj.m86786a(true);
        c14892gj.m86794b(System.currentTimeMillis());
        c14892gj.m86811g(nvq0.m164913d(context).m164919b());
        c14892gj.m86806e("com.xiaomi.xmsf");
        c14892gj.m86809f("");
        c14892gj.m86799c("push_stat");
        return c14892gj;
    }
}
