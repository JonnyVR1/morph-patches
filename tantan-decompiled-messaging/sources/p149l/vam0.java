package p149l;

import android.content.ComponentName;
import android.content.ContentProviderClient;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.p046p1.mobile.putong.live.base.data.LovePlanetStage;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import org.seamless.xhtml.XHTML;

/* JADX INFO: loaded from: classes2.dex */
public class vam0 implements pc2 {
    /* JADX INFO: renamed from: c */
    public static boolean m197644c() throws Exception {
        Method method = Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class);
        method.setAccessible(true);
        String str = (String) method.invoke(null, "ro.vivo.os.name", "");
        String str2 = (String) method.invoke(null, "ro.vivo.os.version", "");
        if (TextUtils.equals(str, "Funtouch")) {
            return Double.parseDouble(str2) >= 12.0d;
        }
        return TextUtils.equals(str, "vos") && Double.parseDouble(str2) >= 2.0d;
    }

    @Override // p149l.pc2
    /* JADX INFO: renamed from: a */
    public List<String> mo114456a() {
        return Arrays.asList("com.vivo.launcher");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5, types: [android.content.ContentProviderClient] */
    /* JADX WARN: Type inference failed for: r5v6, types: [android.content.ContentProviderClient] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    @Override // p149l.pc2
    /* JADX INFO: renamed from: b */
    public void mo114457b(Context context, ComponentName componentName, int i) throws Throwable {
        Uri uri = Uri.parse("content://com.vivo.abe.provider.launcher.notification.num");
        Bundle bundle = new Bundle();
        bundle.putString("package", context.getPackageName());
        bundle.putString(XHTML.ATTR.CLASS, componentName.getClassName());
        bundle.putInt("badgenumber", i);
        ?? r5 = 0;
        r5 = 0;
        r5 = 0;
        try {
            try {
                ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(uri);
                if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                    try {
                        Bundle bundleCall = contentProviderClientAcquireUnstableContentProviderClient.call("change_badge", null, bundle);
                        String str = LovePlanetStage.result;
                        bundleCall.getInt(LovePlanetStage.result);
                        r5 = str;
                    } catch (Exception e) {
                        e = e;
                        r5 = contentProviderClientAcquireUnstableContentProviderClient;
                        e.printStackTrace();
                        if (r5 != 0) {
                            r5.close();
                        }
                    } catch (Throwable th) {
                        th = th;
                        r5 = contentProviderClientAcquireUnstableContentProviderClient;
                        if (r5 != 0) {
                            r5.close();
                        }
                        throw th;
                    }
                }
                if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                    contentProviderClientAcquireUnstableContentProviderClient.close();
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e2) {
            e = e2;
        }
    }
}
