package p153l;

import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes.dex */
public class h5r0 {

    /* JADX INFO: renamed from: a */
    private static File f107967a;

    /* JADX INFO: renamed from: l.h5r0$a */
    public static class RunnableC17405a implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            h5r0.m133673c();
        }
    }

    /* JADX INFO: renamed from: l.h5r0$b */
    public static class C17406b {

        /* JADX INFO: renamed from: a */
        public String f107968a;

        /* JADX INFO: renamed from: b */
        public String f107969b;

        /* JADX INFO: renamed from: c */
        public long f107970c;

        public C17406b(String str) {
            String[] strArrSplit = str.split("\\s+");
            if (strArrSplit.length != 3) {
                pwq0.m174074a();
                pwq0.m174075b("NPTH_CATCH", new RuntimeException("err ProcessTrack line:".concat(str)));
                return;
            }
            this.f107968a = strArrSplit[0];
            this.f107969b = strArrSplit[1];
            try {
                this.f107970c = Long.parseLong(strArrSplit[2]);
            } catch (Throwable th) {
                pwq0.m174074a();
                pwq0.m174075b("NPTH_CATCH", new RuntimeException("err ProcessTrack line:".concat(str), th));
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static File m133671a(long j) {
        return new File(j5r0.m143557E(n0r0.m161022i()), "apmlite/ProcessTrack/" + ((j - (j % 86400000)) / 86400000));
    }

    /* JADX INFO: renamed from: b */
    public static HashMap<String, C17406b> m133672b(long j, String str) throws Throwable {
        File file = new File(j5r0.m143557E(n0r0.m161022i()), "apmlite/ProcessTrack/" + ((j - (j % 86400000)) / 86400000));
        String[] list = file.list();
        HashMap<String, C17406b> map = new HashMap<>();
        if (list != null) {
            for (String str2 : list) {
                File file2 = new File(file, str2);
                long length = file2.length();
                try {
                    JSONArray jSONArrayM179682h = r3r0.m179682h(file2, length > PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED ? length - PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED : 0L);
                    for (int length2 = jSONArrayM179682h.length() - 1; length2 >= 0; length2--) {
                        String strOptString = jSONArrayM179682h.optString(length2);
                        if (!TextUtils.isEmpty(strOptString) && strOptString.startsWith(str)) {
                            map.put(str2.replace('_', ':').replace(".txt", ""), new C17406b(strOptString));
                            break;
                        }
                    }
                } catch (IOException unused) {
                }
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: c */
    public static void m133673c() {
        File file;
        String[] list;
        if (lrq0.m155646j(n0r0.m161022i()) && (list = (file = new File(j5r0.m143557E(n0r0.m161022i()), "apmlite/ProcessTrack/")).list()) != null && list.length > 25) {
            Arrays.sort(list);
            for (int i = 0; i < list.length - 25; i++) {
                r3r0.m179692r(new File(file, list[i]));
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m133674d(String str, String str2) {
        try {
            File fileM133675e = m133675e();
            if (fileM133675e != null) {
                r3r0.m179684j(fileM133675e, str + ' ' + str2 + ' ' + System.currentTimeMillis() + '\n', true);
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: e */
    private static File m133675e() {
        if (f107967a == null) {
            String strM155648l = lrq0.m155648l(n0r0.m161022i());
            if (strM155648l == null) {
                return null;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            f107967a = new File(j5r0.m143557E(n0r0.m161022i()), "apmlite/ProcessTrack/" + ((jCurrentTimeMillis - (jCurrentTimeMillis % 86400000)) / 86400000) + '/' + strM155648l.replace(':', '_') + ".txt");
            c5r0.m108080b().m179946f(new RunnableC17405a(), 15000L);
        }
        return f107967a;
    }
}
