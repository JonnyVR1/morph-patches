package p153l;

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

/* JADX INFO: loaded from: classes11.dex */
public class j85 {

    /* JADX INFO: renamed from: a */
    public static final String f118751a = "code_cache" + File.separator + "secondary-dexes";

    /* JADX INFO: renamed from: l.j85$a */
    public class RunnableC17894a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f118752a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f118753b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Set f118754c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ CountDownLatch f118755d;

        public RunnableC17894a(String str, String str2, Set set, CountDownLatch countDownLatch) {
            this.f118752a = str;
            this.f118753b = str2;
            this.f118754c = set;
            this.f118755d = countDownLatch;
        }

        @Override // java.lang.Runnable
        public void run() {
            DexFile dexFile = null;
            try {
                try {
                    if (this.f118752a.endsWith(".zip")) {
                        dexFile = DexFile.loadDex(this.f118752a, this.f118752a + ".tmp", 0);
                    } else {
                        dexFile = new DexFile(this.f118752a);
                    }
                    Enumeration<String> enumerationEntries = dexFile.entries();
                    while (enumerationEntries.hasMoreElements()) {
                        String strNextElement = enumerationEntries.nextElement();
                        if (strNextElement.startsWith(this.f118753b)) {
                            this.f118754c.add(strNextElement);
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
                        this.f118755d.countDown();
                    }
                }
            } catch (Throwable unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static Set<String> m143823a(Context context, String str) throws InterruptedException, IOException {
        HashSet hashSet = new HashSet();
        List<String> listM143825c = m143825c(context);
        CountDownLatch countDownLatch = new CountDownLatch(listM143825c.size());
        Iterator<String> it = listM143825c.iterator();
        while (it.hasNext()) {
            mrd.m159673k().execute(new RunnableC17894a(it.next(), str, hashSet, countDownLatch));
        }
        countDownLatch.await();
        hashSet.size();
        return hashSet;
    }

    /* JADX INFO: renamed from: b */
    public static SharedPreferences m143824b(Context context) {
        return context.getSharedPreferences("multidex.version", 4);
    }

    /* JADX INFO: renamed from: c */
    public static List<String> m143825c(Context context) throws IOException {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        File file = new File(applicationInfo.sourceDir);
        ArrayList arrayList = new ArrayList();
        arrayList.add(applicationInfo.sourceDir);
        String str = file.getName() + ".classes";
        if (!m143826d()) {
            int i = m143824b(context).getInt("dex.number", 1);
            File file2 = new File(applicationInfo.dataDir, f118751a);
            for (int i2 = 2; i2 <= i; i2++) {
                File file3 = new File(file2, str + i2 + ".zip");
                if (!file3.isFile()) {
                    ur10.m197443a("Missing extracted secondary dex file '", file3.getPath(), "'");
                    return null;
                }
                arrayList.add(file3.getAbsolutePath());
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    /* JADX INFO: renamed from: d */
    public static boolean m143826d() {
        boolean z = false;
        try {
            if (!m143827e()) {
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
    public static boolean m143827e() {
        try {
            String property = System.getProperty("ro.yunos.version");
            String property2 = System.getProperty("java.vm.name");
            return (property2 != null && property2.toLowerCase().contains("lemur")) || (property != null && property.trim().length() > 0);
        } catch (Exception unused) {
            return false;
        }
    }
}
