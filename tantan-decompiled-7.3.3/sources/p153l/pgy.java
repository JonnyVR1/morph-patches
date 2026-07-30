package p153l;

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
public final class pgy implements Handler.Callback {

    /* JADX INFO: renamed from: o */
    private static volatile pgy f152352o = null;

    /* JADX INFO: renamed from: p */
    public static boolean f152353p = false;

    /* JADX INFO: renamed from: q */
    private static final FileFilter f152354q = new C19369a();

    /* JADX INFO: renamed from: a */
    private WeakReference<Context> f152355a;

    /* JADX INFO: renamed from: b */
    private Long f152356b;

    /* JADX INFO: renamed from: c */
    private Long f152357c;

    /* JADX INFO: renamed from: d */
    private RandomAccessFile f152358d;

    /* JADX INFO: renamed from: e */
    private RandomAccessFile f152359e;

    /* JADX INFO: renamed from: g */
    private HandlerThread f152361g;

    /* JADX INFO: renamed from: h */
    private Handler f152362h;

    /* JADX INFO: renamed from: f */
    private boolean f152360f = true;

    /* JADX INFO: renamed from: i */
    private double f152363i = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;

    /* JADX INFO: renamed from: j */
    private double f152364j = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;

    /* JADX INFO: renamed from: k */
    private double f152365k = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;

    /* JADX INFO: renamed from: l */
    private volatile boolean f152366l = false;

    /* JADX INFO: renamed from: m */
    private long f152367m = 0;

    /* JADX INFO: renamed from: n */
    private int f152368n = 0;

    /* JADX INFO: renamed from: l.pgy$a */
    public class C19369a implements FileFilter {
        @Override // java.io.FileFilter
        public boolean accept(File file) {
            return Pattern.matches("cpu[0-9]", file.getName());
        }
    }

    private pgy() {
        HandlerThread handlerThread = new HandlerThread("MemAndCpuStatistics");
        this.f152361g = handlerThread;
        handlerThread.start();
        this.f152362h = new Handler(this.f152361g.getLooper(), this);
        esx.m122396a("jzheng", " get new MemAndCpuStatistics " + this);
    }

    /* JADX INFO: renamed from: a */
    private int m172285a(String str) {
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
    private int m172286c(String str) {
        File[] fileArrListFiles = new File(str).listFiles(f152354q);
        if (fileArrListFiles == null) {
            return 0;
        }
        return fileArrListFiles.length;
    }

    /* JADX INFO: renamed from: d */
    private int m172287d(String str) throws Throwable {
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
    private float m172288f() {
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
                    int iM172285a = m172285a(strTrim);
                    if (iM172285a != -1) {
                        i = iM172285a;
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
    private double m172289g() {
        boolean z = this.f152360f;
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
                if (m172292o(d2)) {
                    d = d2;
                } else {
                    d2 /= 1000.0d;
                    if (m172292o(d2)) {
                        d = d2;
                    }
                }
            }
            fileInputStream.close();
            inputStreamReader.close();
            bufferedReader.close();
            return d;
        } catch (IOException e) {
            this.f152360f = false;
            e.printStackTrace();
            return d;
        } catch (NumberFormatException unused) {
            this.f152360f = false;
            return d;
        }
    }

    /* JADX INFO: renamed from: h */
    public static pgy m172290h() {
        if (f152352o == null) {
            synchronized (pgy.class) {
                try {
                    if (f152352o == null) {
                        f152352o = new pgy();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f152352o;
    }

    /* JADX INFO: renamed from: k */
    private void m172291k() throws Throwable {
        int iM172287d;
        try {
            iM172287d = m172287d("/sys/devices/system/cpu/possible");
            if (iM172287d == 0) {
                iM172287d = m172287d("/sys/devices/system/cpu/present");
            }
            if (iM172287d == 0) {
                iM172287d = m172286c("/sys/devices/system/cpu/");
            }
        } catch (Exception unused) {
            iM172287d = 0;
        }
        if (iM172287d == 0) {
            iM172287d = 1;
        }
        this.f152368n = iM172287d;
    }

    /* JADX INFO: renamed from: o */
    private static boolean m172292o(double d) {
        return d >= -30.0d && d <= 250.0d;
    }

    /* JADX INFO: renamed from: p */
    private double m172293p() {
        double d = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        try {
            try {
                if (f152353p) {
                    return m172288f();
                }
                RandomAccessFile randomAccessFile = this.f152358d;
                if (randomAccessFile == null || this.f152359e == null) {
                    this.f152358d = new RandomAccessFile("/proc/stat", "r");
                    this.f152359e = new RandomAccessFile("/proc/" + Process.myPid() + "/stat", "r");
                } else {
                    randomAccessFile.seek(0L);
                    this.f152359e.seek(0L);
                }
                String line = this.f152358d.readLine();
                String line2 = this.f152359e.readLine();
                String[] strArrSplit = line.split(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
                String[] strArrSplit2 = line2.split(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
                long j = Long.parseLong(strArrSplit[2]) + Long.parseLong(strArrSplit[3]) + Long.parseLong(strArrSplit[4]) + Long.parseLong(strArrSplit[5]) + Long.parseLong(strArrSplit[6]) + Long.parseLong(strArrSplit[7]) + Long.parseLong(strArrSplit[8]);
                long j2 = Long.parseLong(strArrSplit2[13]) + Long.parseLong(strArrSplit2[14]);
                if (this.f152356b == null && this.f152357c == null) {
                    this.f152356b = Long.valueOf(j);
                    this.f152357c = Long.valueOf(j2);
                    return FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
                }
                double dLongValue = ((j2 - this.f152357c.longValue()) / (j - this.f152356b.longValue())) * 100.0d;
                if (((int) dLongValue) >= 100) {
                    dLongValue = 0.0d;
                }
                try {
                    this.f152356b = Long.valueOf(j);
                    this.f152357c = Long.valueOf(j2);
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
    private double m172294q() {
        int totalPss;
        try {
            WeakReference<Context> weakReference = this.f152355a;
            ActivityManager activityManager = (weakReference == null || weakReference.get() == null) ? null : (ActivityManager) this.f152355a.get().getSystemService("activity");
            esx.m122399d("MemAndCpuStatistics", "mContextRef " + this.f152355a + " / activityManager " + activityManager);
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
    public String m172295b() {
        int i = (int) this.f152363i;
        if (i > 100 || i < 0) {
            i = 0;
        }
        return "" + i + Constants.SEPARATOR_COMMA + ((int) this.f152364j);
    }

    /* JADX INFO: renamed from: e */
    public int m172296e() {
        return (int) this.f152363i;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) throws Throwable {
        int i = message.what;
        if (i != 256) {
            if (i != 257) {
                return false;
            }
            m172291k();
            return false;
        }
        this.f152362h.removeMessages(256);
        if (this.f152366l) {
            this.f152363i = Math.abs(m172293p());
            this.f152364j = Math.abs(m172294q());
            this.f152365k = m172289g();
        }
        this.f152362h.sendEmptyMessageDelayed(256, 10000L);
        return false;
    }

    /* JADX INFO: renamed from: i */
    public int m172297i() {
        return (int) this.f152364j;
    }

    /* JADX INFO: renamed from: j */
    public int m172298j() {
        return this.f152368n;
    }

    /* JADX INFO: renamed from: l */
    public int m172299l() {
        return (int) this.f152365k;
    }

    /* JADX INFO: renamed from: m */
    public long m172300m() {
        return this.f152367m;
    }

    /* JADX INFO: renamed from: n */
    public void m172301n(Context context) {
        this.f152355a = new WeakReference<>(context);
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        activityManager.getMemoryInfo(memoryInfo);
        this.f152367m = memoryInfo.totalMem / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
        esx.m122399d("MemAndCpuStatistics", "context " + context + " / " + this.f152355a);
    }

    /* JADX INFO: renamed from: r */
    public void m172302r() {
        this.f152366l = true;
        this.f152362h.sendEmptyMessage(256);
        if (csx.m112235R().m112290S0()) {
            this.f152362h.sendEmptyMessage(257);
        }
    }

    /* JADX INFO: renamed from: s */
    public void m172303s() {
        this.f152366l = false;
        WeakReference<Context> weakReference = this.f152355a;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f152355a = null;
        esx.m122399d("MemAndCpuStatistics", "mContextRef " + this.f152355a);
    }
}
