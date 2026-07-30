package p149l;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Debug;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.Process;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;
import java.lang.ref.WeakReference;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes7.dex */
public final class s7y implements Handler.Callback {

    /* JADX INFO: renamed from: o */
    private static volatile s7y f162959o = null;

    /* JADX INFO: renamed from: p */
    public static boolean f162960p = false;

    /* JADX INFO: renamed from: q */
    private static final FileFilter f162961q = new C19869a();

    /* JADX INFO: renamed from: a */
    private WeakReference<Context> f162962a;

    /* JADX INFO: renamed from: b */
    private Long f162963b;

    /* JADX INFO: renamed from: c */
    private Long f162964c;

    /* JADX INFO: renamed from: d */
    private RandomAccessFile f162965d;

    /* JADX INFO: renamed from: e */
    private RandomAccessFile f162966e;

    /* JADX INFO: renamed from: g */
    private HandlerThread f162968g;

    /* JADX INFO: renamed from: h */
    private Handler f162969h;

    /* JADX INFO: renamed from: f */
    private boolean f162967f = true;

    /* JADX INFO: renamed from: i */
    private double f162970i = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;

    /* JADX INFO: renamed from: j */
    private double f162971j = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;

    /* JADX INFO: renamed from: k */
    private double f162972k = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;

    /* JADX INFO: renamed from: l */
    private volatile boolean f162973l = false;

    /* JADX INFO: renamed from: m */
    private long f162974m = 0;

    /* JADX INFO: renamed from: n */
    private int f162975n = 0;

    /* JADX INFO: renamed from: l.s7y$a */
    public class C19869a implements FileFilter {
        @Override // java.io.FileFilter
        public boolean accept(File file) {
            return Pattern.matches("cpu[0-9]", file.getName());
        }
    }

    private s7y() {
        HandlerThread handlerThread = new HandlerThread("MemAndCpuStatistics");
        this.f162968g = handlerThread;
        handlerThread.start();
        this.f162969h = new Handler(this.f162968g.getLooper(), this);
        hjx.m131418a("jzheng", " get new MemAndCpuStatistics " + this);
    }

    /* JADX INFO: renamed from: a */
    private int m182534a(String str) {
        if (!str.contains("CPU")) {
            return -1;
        }
        String[] strArrSplit = str.split("\\s+");
        for (int i = 0; i < strArrSplit.length; i++) {
            if (strArrSplit[i].contains("CPU")) {
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: c */
    private int m182535c(String str) {
        File[] fileArrListFiles = new File(str).listFiles(f162961q);
        if (fileArrListFiles == null) {
            return 0;
        }
        return fileArrListFiles.length;
    }

    /* JADX INFO: renamed from: d */
    private int m182536d(String str) throws Throwable {
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(str);
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream2, "UTF-8"));
                String line = bufferedReader.readLine();
                bufferedReader.close();
                if (line != null && line.matches("0-[\\d]+$")) {
                    int i = Integer.parseInt(line.substring(2)) + 1;
                    try {
                        fileInputStream2.close();
                    } catch (IOException unused) {
                    }
                    return i;
                }
                try {
                    fileInputStream2.close();
                } catch (IOException unused2) {
                }
                return 0;
            } catch (IOException unused3) {
                fileInputStream = fileInputStream2;
                if (fileInputStream != null) {
                    try {
                        fileInputStream.close();
                    } catch (IOException unused4) {
                    }
                }
                return 0;
            } catch (Throwable th) {
                th = th;
                fileInputStream = fileInputStream2;
                if (fileInputStream != null) {
                    try {
                        fileInputStream.close();
                    } catch (IOException unused5) {
                    }
                }
                throw th;
            }
        } catch (IOException unused6) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: f */
    private float m182537f() {
        int iMyPid = Process.myPid();
        Process processExec = null;
        try {
            processExec = Runtime.getRuntime().exec("top -n 1");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(processExec.getInputStream()));
            int i = -1;
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                String strTrim = line.trim();
                if (!TextUtils.isEmpty(strTrim)) {
                    int iM182534a = m182534a(strTrim);
                    if (iM182534a != -1) {
                        i = iM182534a;
                    } else if (strTrim.startsWith(String.valueOf(iMyPid)) && i != -1) {
                        String[] strArrSplit = strTrim.split("\\s+");
                        if (strArrSplit.length > i) {
                            String strSubstring = strArrSplit[i];
                            if (strSubstring.endsWith("%")) {
                                strSubstring = strSubstring.substring(0, strSubstring.lastIndexOf("%"));
                            }
                            float f = Float.parseFloat(strSubstring) / Runtime.getRuntime().availableProcessors();
                            processExec.destroy();
                            return f;
                        }
                    }
                }
            }
        } catch (IOException unused) {
            if (processExec == null) {
                return 0.0f;
            }
        } catch (Throwable th) {
            if (processExec != null) {
                processExec.destroy();
            }
            throw th;
        }
        processExec.destroy();
        return 0.0f;
    }

    /* JADX INFO: renamed from: g */
    private double m182538g() {
        boolean z = this.f162967f;
        double d = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        if (!z) {
            return FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream("/sys/class/thermal/thermal_zone0/temp");
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            String line = bufferedReader.readLine();
            if (!TextUtils.isEmpty(line)) {
                double d2 = Double.parseDouble(line);
                if (m182541o(d2)) {
                    d = d2;
                } else {
                    d2 /= 1000.0d;
                    if (m182541o(d2)) {
                        d = d2;
                    }
                }
            }
            fileInputStream.close();
            inputStreamReader.close();
            bufferedReader.close();
            return d;
        } catch (IOException e) {
            this.f162967f = false;
            e.printStackTrace();
            return d;
        } catch (NumberFormatException unused) {
            this.f162967f = false;
            return d;
        }
    }

    /* JADX INFO: renamed from: h */
    public static s7y m182539h() {
        if (f162959o == null) {
            synchronized (s7y.class) {
                try {
                    if (f162959o == null) {
                        f162959o = new s7y();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f162959o;
    }

    /* JADX INFO: renamed from: k */
    private void m182540k() throws Throwable {
        int iM182536d;
        try {
            iM182536d = m182536d("/sys/devices/system/cpu/possible");
            if (iM182536d == 0) {
                iM182536d = m182536d("/sys/devices/system/cpu/present");
            }
            if (iM182536d == 0) {
                iM182536d = m182535c("/sys/devices/system/cpu/");
            }
        } catch (Exception unused) {
            iM182536d = 0;
        }
        if (iM182536d == 0) {
            iM182536d = 1;
        }
        this.f162975n = iM182536d;
    }

    /* JADX INFO: renamed from: o */
    private static boolean m182541o(double d) {
        return d >= -30.0d && d <= 250.0d;
    }

    /* JADX INFO: renamed from: p */
    private double m182542p() {
        double d = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        try {
            try {
                if (f162960p) {
                    return m182537f();
                }
                RandomAccessFile randomAccessFile = this.f162965d;
                if (randomAccessFile == null || this.f162966e == null) {
                    this.f162965d = new RandomAccessFile("/proc/stat", "r");
                    this.f162966e = new RandomAccessFile("/proc/" + Process.myPid() + "/stat", "r");
                } else {
                    randomAccessFile.seek(0L);
                    this.f162966e.seek(0L);
                }
                String line = this.f162965d.readLine();
                String line2 = this.f162966e.readLine();
                String[] strArrSplit = line.split(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
                String[] strArrSplit2 = line2.split(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
                long j = Long.parseLong(strArrSplit[2]) + Long.parseLong(strArrSplit[3]) + Long.parseLong(strArrSplit[4]) + Long.parseLong(strArrSplit[5]) + Long.parseLong(strArrSplit[6]) + Long.parseLong(strArrSplit[7]) + Long.parseLong(strArrSplit[8]);
                long j2 = Long.parseLong(strArrSplit2[13]) + Long.parseLong(strArrSplit2[14]);
                if (this.f162963b == null && this.f162964c == null) {
                    this.f162963b = Long.valueOf(j);
                    this.f162964c = Long.valueOf(j2);
                    return FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
                }
                double dLongValue = ((j2 - this.f162964c.longValue()) / (j - this.f162963b.longValue())) * 100.0d;
                if (((int) dLongValue) >= 100) {
                    dLongValue = 0.0d;
                }
                try {
                    this.f162963b = Long.valueOf(j);
                    this.f162964c = Long.valueOf(j2);
                    d = dLongValue;
                } catch (Exception e) {
                    e = e;
                    d = dLongValue;
                    e.printStackTrace();
                }
                return Math.abs(d);
            } catch (FileNotFoundException unused) {
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    /* JADX INFO: renamed from: q */
    private double m182543q() {
        int totalPss;
        try {
            WeakReference<Context> weakReference = this.f162962a;
            ActivityManager activityManager = (weakReference == null || weakReference.get() == null) ? null : (ActivityManager) this.f162962a.get().getSystemService("activity");
            hjx.m131421d("MemAndCpuStatistics", "mContextRef " + this.f162962a + " / activityManager " + activityManager);
            if (activityManager != null) {
                Debug.MemoryInfo[] processMemoryInfo = activityManager.getProcessMemoryInfo(new int[]{Process.myPid()});
                if (processMemoryInfo.length > 0 && (totalPss = processMemoryInfo[0].getTotalPss()) >= 0) {
                    return ((double) totalPss) / 1024.0d;
                }
            }
            return FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        } catch (Exception e) {
            e.printStackTrace();
            return FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        }
    }

    /* JADX INFO: renamed from: b */
    public String m182544b() {
        int i = (int) this.f162970i;
        if (i > 100 || i < 0) {
            i = 0;
        }
        return "" + i + Constants.SEPARATOR_COMMA + ((int) this.f162971j);
    }

    /* JADX INFO: renamed from: e */
    public int m182545e() {
        return (int) this.f162970i;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) throws Throwable {
        int i = message.what;
        if (i != 256) {
            if (i != 257) {
                return false;
            }
            m182540k();
            return false;
        }
        this.f162969h.removeMessages(256);
        if (this.f162973l) {
            this.f162970i = Math.abs(m182542p());
            this.f162971j = Math.abs(m182543q());
            this.f162972k = m182538g();
        }
        this.f162969h.sendEmptyMessageDelayed(256, 10000L);
        return false;
    }

    /* JADX INFO: renamed from: i */
    public int m182546i() {
        return (int) this.f162971j;
    }

    /* JADX INFO: renamed from: j */
    public int m182547j() {
        return this.f162975n;
    }

    /* JADX INFO: renamed from: l */
    public int m182548l() {
        return (int) this.f162972k;
    }

    /* JADX INFO: renamed from: m */
    public long m182549m() {
        return this.f162974m;
    }

    /* JADX INFO: renamed from: n */
    public void m182550n(Context context) {
        this.f162962a = new WeakReference<>(context);
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        activityManager.getMemoryInfo(memoryInfo);
        this.f162974m = memoryInfo.totalMem / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
        hjx.m131421d("MemAndCpuStatistics", "context " + context + " / " + this.f162962a);
    }

    /* JADX INFO: renamed from: r */
    public void m182551r() {
        this.f162973l = true;
        this.f162969h.sendEmptyMessage(256);
        if (fjx.m121638R().m121693S0()) {
            this.f162969h.sendEmptyMessage(257);
        }
    }

    /* JADX INFO: renamed from: s */
    public void m182552s() {
        this.f162973l = false;
        WeakReference<Context> weakReference = this.f162962a;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f162962a = null;
        hjx.m131421d("MemAndCpuStatistics", "mContextRef " + this.f162962a);
    }
}
