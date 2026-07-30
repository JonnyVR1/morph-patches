package p149l;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.util.Log;
import dalvik.system.DexFile;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes13.dex */
public class i75 {

    /* JADX INFO: renamed from: a */
    public static final String f111826a = "code_cache" + File.separator + "secondary-dexes";

    /* JADX INFO: renamed from: l.i75$a */
    public class RunnableC17502a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f111827a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f111828b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Set f111829c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ CountDownLatch f111830d;

        public RunnableC17502a(String str, String str2, Set set, CountDownLatch countDownLatch) {
            this.f111827a = str;
            this.f111828b = str2;
            this.f111829c = set;
            this.f111830d = countDownLatch;
        }

        @Override // java.lang.Runnable
        public void run() {
            DexFile dexFile = null;
            try {
                try {
                    if (this.f111827a.endsWith(".zip")) {
                        dexFile = DexFile.loadDex(this.f111827a, this.f111827a + ".tmp", 0);
                    } else {
                        dexFile = new DexFile(this.f111827a);
                    }
                    Enumeration<String> enumerationEntries = dexFile.entries();
                    while (enumerationEntries.hasMoreElements()) {
                        String strNextElement = enumerationEntries.nextElement();
                        if (strNextElement.startsWith(this.f111828b)) {
                            this.f111829c.add(strNextElement);
                        }
                    }
                } catch (Throwable th) {
                    try {
                        Log.e("Injecter", "Scan map file in dex files made error.", th);
                    } finally {
                        if (dexFile != null) {
                            try {
                                dexFile.close();
                            } catch (Throwable unused) {
                            }
                        }
                        this.f111830d.countDown();
                    }
                }
            } catch (Throwable unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static Set<String> m134739a(Context context, String str) throws InterruptedException, IOException {
        HashSet hashSet = new HashSet();
        List<String> listM134741c = m134741c(context);
        CountDownLatch countDownLatch = new CountDownLatch(listM134741c.size());
        Iterator<String> it = listM134741c.iterator();
        while (it.hasNext()) {
            vpd.m199225k().execute(new RunnableC17502a(it.next(), str, hashSet, countDownLatch));
        }
        countDownLatch.await();
        hashSet.size();
        return hashSet;
    }

    /* JADX INFO: renamed from: b */
    public static SharedPreferences m134740b(Context context) {
        return context.getSharedPreferences("multidex.version", 4);
    }

    /* JADX INFO: renamed from: c */
    public static List<String> m134741c(Context context) throws IOException {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        File file = new File(applicationInfo.sourceDir);
        ArrayList arrayList = new ArrayList();
        arrayList.add(applicationInfo.sourceDir);
        String str = file.getName() + ".classes";
        if (!m134742d()) {
            int i = m134740b(context).getInt("dex.number", 1);
            File file2 = new File(applicationInfo.dataDir, f111826a);
            for (int i2 = 2; i2 <= i; i2++) {
                File file3 = new File(file2, str + i2 + ".zip");
                if (!file3.isFile()) {
                    kj10.m146167a("Missing extracted secondary dex file '", file3.getPath(), "'");
                    return null;
                }
                arrayList.add(file3.getAbsolutePath());
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    /* JADX INFO: renamed from: d */
    public static boolean m134742d() {
        boolean z = false;
        try {
            if (!m134743e()) {
                String property = System.getProperty("java.vm.version");
                if (property != null) {
                    Matcher matcher = Pattern.compile("(\\d+)\\.(\\d+)(\\.\\d+)?").matcher(property);
                    if (matcher.matches()) {
                        int i = Integer.parseInt(matcher.group(1));
                        int i2 = Integer.parseInt(matcher.group(2));
                        if (i > 2 || (i == 2 && i2 >= 1)) {
                            z = true;
                        }
                    }
                }
            } else if (Integer.valueOf(System.getProperty("ro.build.version.sdk")).intValue() >= 21) {
                z = true;
            }
        } catch (NumberFormatException | Exception unused) {
        }
        return z;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m134743e() {
        try {
            String property = System.getProperty("ro.yunos.version");
            String property2 = System.getProperty("java.vm.name");
            return (property2 != null && property2.toLowerCase().contains("lemur")) || (property != null && property.trim().length() > 0);
        } catch (Exception unused) {
            return false;
        }
    }
}
