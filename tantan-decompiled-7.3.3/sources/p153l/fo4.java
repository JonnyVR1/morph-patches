package p153l;

import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.tantanapp.beatles.p077v2.data.MonitorEvent;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes11.dex */
public final class fo4 {

    /* JADX INFO: renamed from: a */
    public static final Set<String> f100007a = new LinkedHashSet();

    /* JADX INFO: renamed from: b */
    public static final Map<String, String> f100008b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a */
    public static void m126439a(String str, Throwable th) {
        String strM213048b = xtb.m213048b(th);
        String strM149980e = kiw.m149980e(strM213048b);
        Set<String> set = f100007a;
        if (set.contains(strM149980e)) {
            return;
        }
        if (m126442d()) {
            m126440b(set.iterator().next());
        }
        set.add(strM149980e);
        f100008b.put(str, strM213048b);
    }

    /* JADX INFO: renamed from: b */
    public static void m126440b(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        f100007a.remove(str);
        f100008b.remove(str);
    }

    /* JADX INFO: renamed from: c */
    public static void m126441c(MonitorEvent monitorEvent) {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, String> entry : f100008b.entrySet()) {
            sb.append("eventId:");
            sb.append(entry.getKey());
            sb.append(SignParameters.NEW_LINE);
            sb.append(entry.getValue());
            sb.append("\n\n");
        }
        monitorEvent.setExtra("CaughtStackTrace", sb.toString());
    }

    /* JADX INFO: renamed from: d */
    public static boolean m126442d() {
        Map<String, String> map = f100008b;
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
