package p007l;

import android.app.Activity;
import android.net.Uri;
import com.p000p1.mobile.putong.data.SchemeKey;
import l.j2e0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class cxh {
    /* JADX INFO: renamed from: a */
    public static void m9251a(Activity activity, String str, String str2) {
        j2e0.m(activity, Uri.parse("tantanapp://webview?title=" + str + "&url=" + str2));
    }

    /* JADX INFO: renamed from: b */
    public static void m9252b(Activity activity, Uri uri) {
        j2e0.m(activity, uri);
    }

    /* JADX INFO: renamed from: c */
    public static void m9253c() {
        j2e0.p(SchemeKey.topic_webview, new b7h());
        j2e0.p(SchemeKey.visitors, new z1h());
        j2e0.p(SchemeKey.moment_activities, new x1h());
        j2e0.p(SchemeKey.moment_inspire, new y1h());
        j2e0.p(SchemeKey.ai_story, new wlg());
    }
}
