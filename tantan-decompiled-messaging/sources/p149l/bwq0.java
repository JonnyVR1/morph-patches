package p149l;

import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes.dex */
public class bwq0 {

    /* JADX INFO: renamed from: a */
    private static File f77700a;

    /* JADX INFO: renamed from: l.bwq0$a */
    public static class RunnableC15999a implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            bwq0.m104240c();
        }
    }

    /* JADX INFO: renamed from: l.bwq0$b */
    public static class C16000b {

        /* JADX INFO: renamed from: a */
        public String f77701a;

        /* JADX INFO: renamed from: b */
        public String f77702b;

        /* JADX INFO: renamed from: c */
        public long f77703c;

        public C16000b(String str) {
            String[] strArrSplit = str.split("\\s+");
            if (strArrSplit.length != 3) {
                jnq0.m142383a();
                jnq0.m142384b("NPTH_CATCH", new RuntimeException("err ProcessTrack line:".concat(str)));
                return;
            }
            this.f77701a = strArrSplit[0];
            this.f77702b = strArrSplit[1];
            try {
                this.f77703c = Long.parseLong(strArrSplit[2]);
            } catch (Throwable th) {
                jnq0.m142383a();
                jnq0.m142384b("NPTH_CATCH", new RuntimeException("err ProcessTrack line:".concat(str), th));
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static File m104238a(long j) {
        return new File(dwq0.m113905E(hrq0.m132700i()), "apmlite/ProcessTrack/" + ((j - (j % 86400000)) / 86400000));
    }

    /* JADX INFO: renamed from: b */
    public static HashMap<String, C16000b> m104239b(long j, String str) throws Throwable {
        File file = new File(dwq0.m113905E(hrq0.m132700i()), "apmlite/ProcessTrack/" + ((j - (j % 86400000)) / 86400000));
        String[] list = file.list();
        HashMap<String, C16000b> map = new HashMap<>();
        if (list != null) {
            for (String str2 : list) {
                File file2 = new File(file, str2);
                long length = file2.length();
                try {
                    JSONArray jSONArrayM151794h = luq0.m151794h(file2, length > PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED ? length - PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED : 0L);
                    for (int length2 = jSONArrayM151794h.length() - 1; length2 >= 0; length2--) {
                        String strOptString = jSONArrayM151794h.optString(length2);
                        if (!TextUtils.isEmpty(strOptString) && strOptString.startsWith(str)) {
                            map.put(str2.replace('_', ':').replace(".txt", ""), new C16000b(strOptString));
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
    public static void m104240c() {
        File file;
        String[] list;
        if (giq0.m126395j(hrq0.m132700i()) && (list = (file = new File(dwq0.m113905E(hrq0.m132700i()), "apmlite/ProcessTrack/")).list()) != null && list.length > 25) {
            Arrays.sort(list);
            for (int i = 0; i < list.length - 25; i++) {
                luq0.m151804r(new File(file, list[i]));
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m104241d(String str, String str2) {
        try {
            File fileM104242e = m104242e();
            if (fileM104242e != null) {
                luq0.m151796j(fileM104242e, str + ' ' + str2 + ' ' + System.currentTimeMillis() + '\n', true);
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: e */
    private static File m104242e() {
        if (f77700a == null) {
            String strM126397l = giq0.m126397l(hrq0.m132700i());
            if (strM126397l == null) {
                return null;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            f77700a = new File(dwq0.m113905E(hrq0.m132700i()), "apmlite/ProcessTrack/" + ((jCurrentTimeMillis - (jCurrentTimeMillis % 86400000)) / 86400000) + '/' + strM126397l.replace(':', '_') + ".txt");
            wvq0.m205758b().m151993f(new RunnableC15999a(), 15000L);
        }
        return f77700a;
    }
}
