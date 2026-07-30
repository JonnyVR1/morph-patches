package p153l;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class erq {

    /* JADX INFO: renamed from: a */
    public static final List<String> f95506a = jyb.m147507f0("weixin://", "alipay://", "alipays://", "mqqapi://");

    /* JADX INFO: renamed from: b */
    public static final Map<String, String> f95507b;

    static {
        HashMap map = new HashMap();
        f95507b = map;
        map.put("https://tantan.meituan.com/pay/beta", "https://g.51ping.com/fuse/SJZYJTCpf");
        map.put("https://tantan.meituan.com/pay/prod", "https://g.dianping.com/fuse/SkRlSFLRG");
    }

    /* JADX INFO: renamed from: a */
    public static boolean m122256a(String str) {
        Iterator<String> it = f95506a.iterator();
        while (it.hasNext()) {
            if (str.startsWith(it.next())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static void m122257b(Context context, String str) {
        try {
            Intent uri = Intent.parseUri(str, 1);
            uri.setFlags(805306368);
            uri.addCategory("android.intent.category.BROWSABLE");
            uri.setComponent(null);
            if (context.getPackageManager().queryIntentActivities(uri, 65536).size() > 0) {
                context.startActivity(uri);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m122258c(Context context, String str) {
        try {
            Intent intent = new Intent();
            intent.setAction("android.intent.action.VIEW");
            intent.setData(Uri.parse(str));
            if (context.getPackageManager().queryIntentActivities(intent, 65536).size() > 0) {
                context.startActivity(intent);
            } else {
                m122257b(context, str);
            }
        } catch (Exception unused) {
            m122257b(context, str);
        }
    }
}
