package p153l;

import com.tantanapp.beatles.file.FileSizeException;
import com.tantanapp.beatles.p077v2.data.MonitorEvent;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class xji {

    /* JADX INFO: renamed from: a */
    public static boolean f194575a = false;

    /* JADX INFO: renamed from: b */
    public static nii f194576b = null;

    /* JADX INFO: renamed from: c */
    public static int f194577c = -1;

    /* JADX INFO: renamed from: d */
    public static Runnable f194578d = new RunnableC21351a();

    /* JADX INFO: renamed from: l.xji$a */
    public class RunnableC21351a implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            if (xji.m211226j()) {
                StringBuilder sb = new StringBuilder();
                long j = 0;
                for (String str : xji.f194576b.m163279e()) {
                    if (nki.m163629l(str) || nki.m163628k(str)) {
                        long jM163626i = nki.m163626i(new File(str));
                        sb.append(str);
                        sb.append("--->size:");
                        sb.append(jM163626i);
                        sb.append("  ");
                        j += jM163626i;
                    }
                }
                if (j >= xji.f194576b.m163280f()) {
                    FileSizeException fileSizeException = new FileSizeException("FileSize reached limit:" + xji.f194576b.m163280f() + " info:" + sb.toString());
                    xji.m211227k(xji.m211219c());
                    xji.m211224h(fileSizeException);
                }
                u21.m194239c(this, xji.f194576b.m163283i());
            }
        }
    }

    /* JADX INFO: renamed from: l.xji$b */
    public class C21352b implements Comparator<Map.Entry<String, Long>> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Map.Entry<String, Long> entry, Map.Entry<String, Long> entry2) {
            return entry2.getValue().compareTo(entry.getValue());
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ int m211219c() {
        int i = f194577c + 1;
        f194577c = i;
        return i;
    }

    /* JADX INFO: renamed from: f */
    public static int m211222f(String str) {
        String[] strArrSplit = str.split("_");
        String str2 = strArrSplit[0];
        if (strArrSplit.length == 2) {
            try {
                if (vc60.m200790e() == Long.valueOf(str2).longValue()) {
                    return Integer.valueOf(strArrSplit[1]).intValue();
                }
                return 0;
            } catch (NumberFormatException unused) {
                m211227k(0);
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: g */
    public static HashMap<String, Long> m211223g(File file, HashMap<String, Long> map) {
        if (file.isFile() || file.isDirectory()) {
            if (file.isDirectory()) {
                File[] fileArrListFiles = file.listFiles();
                if (fileArrListFiles != null) {
                    for (File file2 : fileArrListFiles) {
                        m211223g(file2, map);
                    }
                }
            } else if (file.length() > f194576b.m163281g()) {
                map.put(file.getAbsolutePath(), Long.valueOf(file.length()));
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: h */
    public static void m211224h(Exception exc) {
        MonitorEvent monitorEvent = new MonitorEvent("exception", "fileSize", exc);
        for (String str : f194576b.m163279e()) {
            HashMap map = new HashMap();
            m211223g(new File(str), map);
            ArrayList<Map.Entry> arrayList = new ArrayList(map.entrySet());
            Collections.sort(arrayList, new C21352b());
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
        uu2.m198146h(monitorEvent);
    }

    /* JADX INFO: renamed from: i */
    public static void m211225i(nii niiVar) {
        if (f194575a) {
            return;
        }
        if (niiVar == null) {
            wtq0.m207906a("FileConfig should not be null!!!");
        } else {
            if (!uu2.m198142d()) {
                f610.m124264b("You should add ExceptionMonitor first!!!", new Object[0]);
                return;
            }
            f194576b = niiVar;
            u21.m194239c(f194578d, niiVar.m163284j());
            f194575a = true;
        }
    }

    /* JADX INFO: renamed from: j */
    public static boolean m211226j() {
        if (f194577c == -1) {
            f194577c = m211222f(fq80.m126738a(du2.m118045e(), "beatles_file_check", ""));
        }
        return f194577c < f194576b.m163282h();
    }

    /* JADX INFO: renamed from: k */
    public static void m211227k(int i) {
        fq80.m126739b(du2.m118045e(), "beatles_file_check", vc60.m200790e() + "_" + i);
    }
}
