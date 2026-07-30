package p149l;

import android.app.Activity;
import android.net.Uri;
import com.p046p1.mobile.putong.data.SchemeKey;

/* JADX INFO: loaded from: classes12.dex */
public class cxh {
    /* JADX INFO: renamed from: a */
    public static void m109099a(Activity activity, String str, String str2) {
        j2e0.m139446m(activity, Uri.parse("tantanapp://webview?title=" + str + "&url=" + str2));
    }

    /* JADX INFO: renamed from: b */
    public static void m109100b(Activity activity, Uri uri) {
        j2e0.m139446m(activity, uri);
    }

    /* JADX INFO: renamed from: c */
    public static void m109101c() {
        j2e0.m139449p(SchemeKey.topic_webview, new b7h());
        j2e0.m139449p(SchemeKey.visitors, new z1h());
        j2e0.m139449p(SchemeKey.moment_activities, new x1h());
        j2e0.m139449p(SchemeKey.moment_inspire, new y1h());
        j2e0.m139449p(SchemeKey.ai_story, new wlg());
    }
}
