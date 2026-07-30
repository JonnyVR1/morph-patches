package p149l;

import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.tantanapp.beatles.p072v2.data.MonitorEvent;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes13.dex */
public final class gn4 {

    /* JADX INFO: renamed from: a */
    public static final Set<String> f103572a = new LinkedHashSet();

    /* JADX INFO: renamed from: b */
    public static final Map<String, String> f103573b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a */
    public static void m127111a(String str, Throwable th) {
        String strM143009b = jsb.m143009b(th);
        String strM154580e = mgw.m154580e(strM143009b);
        Set<String> set = f103572a;
        if (set.contains(strM154580e)) {
            return;
        }
        if (m127114d()) {
            m127112b(set.iterator().next());
        }
        set.add(strM154580e);
        f103573b.put(str, strM143009b);
    }

    /* JADX INFO: renamed from: b */
    public static void m127112b(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        f103572a.remove(str);
        f103573b.remove(str);
    }

    /* JADX INFO: renamed from: c */
    public static void m127113c(MonitorEvent monitorEvent) {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, String> entry : f103573b.entrySet()) {
            sb.append("eventId:");
            sb.append(entry.getKey());
            sb.append(SignParameters.NEW_LINE);
            sb.append(entry.getValue());
            sb.append("\n\n");
        }
        monitorEvent.setExtra("CaughtStackTrace", sb.toString());
    }

    /* JADX INFO: renamed from: d */
    public static boolean m127114d() {
        Map<String, String> map = f103573b;
        if (map.isEmpty()) {
            return false;
        }
        Iterator<String> it = map.values().iterator();
        long length = 0;
        while (it.hasNext()) {
            length += (long) it.next().length();
        }
        return length > PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
    }
}
