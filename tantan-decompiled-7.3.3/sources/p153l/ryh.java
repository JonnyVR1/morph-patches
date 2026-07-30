package p153l;

import android.app.Activity;
import android.net.Uri;
import com.p051p1.mobile.putong.data.SchemeKey;

/* JADX INFO: loaded from: classes13.dex */
public class ryh {
    /* JADX INFO: renamed from: a */
    public static void m183606a(Activity activity, String str, String str2) {
        nae0.m162083m(activity, Uri.parse("tantanapp://webview?title=" + str + "&url=" + str2));
    }

    /* JADX INFO: renamed from: b */
    public static void m183607b(Activity activity, Uri uri) {
        nae0.m162083m(activity, uri);
    }

    /* JADX INFO: renamed from: c */
    public static void m183608c() {
        nae0.m162086p(SchemeKey.topic_webview, new q8h());
        nae0.m162086p(SchemeKey.visitors, new o3h());
        nae0.m162086p(SchemeKey.moment_activities, new m3h());
        nae0.m162086p(SchemeKey.moment_inspire, new n3h());
        nae0.m162086p(SchemeKey.ai_story, new lng());
    }
}
