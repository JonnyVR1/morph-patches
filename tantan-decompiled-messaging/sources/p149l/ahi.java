package p149l;

import com.tantanapp.beatles.file.FileSizeException;
import com.tantanapp.beatles.p072v2.data.MonitorEvent;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
public class ahi {

    /* JADX INFO: renamed from: a */
    public static boolean f69603a = false;

    /* JADX INFO: renamed from: b */
    public static qfi f69604b = null;

    /* JADX INFO: renamed from: c */
    public static int f69605c = -1;

    /* JADX INFO: renamed from: d */
    public static Runnable f69606d = new RunnableC15620a();

    /* JADX INFO: renamed from: l.ahi$a */
    public class RunnableC15620a implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            if (ahi.m96484j()) {
                StringBuilder sb = new StringBuilder();
                long j = 0;
                for (String str : ahi.f69604b.m174324e()) {
                    if (qhi.m174551l(str) || qhi.m174550k(str)) {
                        long jM174548i = qhi.m174548i(new File(str));
                        sb.append(str);
                        sb.append("--->size:");
                        sb.append(jM174548i);
                        sb.append("  ");
                        j += jM174548i;
                    }
                }
                if (j >= ahi.f69604b.m174325f()) {
                    FileSizeException fileSizeException = new FileSizeException("FileSize reached limit:" + ahi.f69604b.m174325f() + " info:" + sb.toString());
                    ahi.m96485k(ahi.m96477c());
                    ahi.m96482h(fileSizeException);
                }
                n21.m157542c(this, ahi.f69604b.m174328i());
            }
        }
    }

    /* JADX INFO: renamed from: l.ahi$b */
    public class C15621b implements Comparator<Map.Entry<String, Long>> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Map.Entry<String, Long> entry, Map.Entry<String, Long> entry2) {
            return entry2.getValue().compareTo(entry.getValue());
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ int m96477c() {
        int i = f69605c + 1;
        f69605c = i;
        return i;
    }

    /* JADX INFO: renamed from: f */
    public static int m96480f(String str) {
        String[] strArrSplit = str.split("_");
        String str2 = strArrSplit[0];
        if (strArrSplit.length == 2) {
            try {
                if (p460.m167369e() == Long.valueOf(str2).longValue()) {
                    return Integer.valueOf(strArrSplit[1]).intValue();
                }
                return 0;
            } catch (NumberFormatException unused) {
                m96485k(0);
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: g */
    public static HashMap<String, Long> m96481g(File file, HashMap<String, Long> map) {
        if (file.isFile() || file.isDirectory()) {
            if (file.isDirectory()) {
                File[] fileArrListFiles = file.listFiles();
                if (fileArrListFiles != null) {
                    for (File file2 : fileArrListFiles) {
                        m96481g(file2, map);
                    }
                }
            } else if (file.length() > f69604b.m174326g()) {
                map.put(file.getAbsolutePath(), Long.valueOf(file.length()));
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: h */
    public static void m96482h(Exception exc) {
        MonitorEvent monitorEvent = new MonitorEvent("exception", "fileSize", exc);
        for (String str : f69604b.m174324e()) {
            HashMap map = new HashMap();
            m96481g(new File(str), map);
            ArrayList<Map.Entry> arrayList = new ArrayList(map.entrySet());
            Collections.sort(arrayList, new C15621b());
            JSONArray jSONArray = new JSONArray();
            JSONObject jSONObject = new JSONObject();
            try {
                for (Map.Entry entry : arrayList) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put((String) entry.getKey(), entry.getValue());
                    jSONArray.put(jSONObject2);
                }
                jSONObject.put(str, jSONArray);
            } catch (JSONException unused) {
            }
            monitorEvent.setExtra(str, jSONObject.toString());
        }
        monitorEvent.setCrashThread(Thread.currentThread());
        eu2.m118154h(monitorEvent);
    }

    /* JADX INFO: renamed from: i */
    public static void m96483i(qfi qfiVar) {
        if (f69603a) {
            return;
        }
        if (qfiVar == null) {
            qkq0.m175383a("FileConfig should not be null!!!");
        } else {
            if (!eu2.m118150d()) {
                vx00.m200472b("You should add ExceptionMonitor first!!!", new Object[0]);
                return;
            }
            f69604b = qfiVar;
            n21.m157542c(f69606d, qfiVar.m174329j());
            f69603a = true;
        }
    }

    /* JADX INFO: renamed from: j */
    public static boolean m96484j() {
        if (f69605c == -1) {
            f69605c = m96480f(ai80.m96792a(nt2.m160814e(), "beatles_file_check", ""));
        }
        return f69605c < f69604b.m174327h();
    }

    /* JADX INFO: renamed from: k */
    public static void m96485k(int i) {
        ai80.m96793b(nt2.m160814e(), "beatles_file_check", p460.m167369e() + "_" + i);
    }
}
