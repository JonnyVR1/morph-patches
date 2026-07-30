package com.tencent.liteav.basic.util;

import android.os.Process;
import android.text.TextUtils;
import com.tencent.liteav.basic.log.TXCLog;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Locale;

/* JADX INFO: renamed from: com.tencent.liteav.basic.util.b */
/* JADX INFO: loaded from: classes2.dex */
public class C14211b {

    /* JADX INFO: renamed from: a */
    private static final long f59339a = 2000;

    /* JADX INFO: renamed from: d */
    private RandomAccessFile f59342d;

    /* JADX INFO: renamed from: e */
    private RandomAccessFile f59343e;

    /* JADX INFO: renamed from: f */
    private long f59344f = 0;

    /* JADX INFO: renamed from: g */
    private float f59345g = 0.0f;

    /* JADX INFO: renamed from: h */
    private float f59346h = 0.0f;

    /* JADX INFO: renamed from: i */
    private long f59347i = 0;

    /* JADX INFO: renamed from: j */
    private long f59348j = 0;

    /* JADX INFO: renamed from: k */
    private float f59349k = 0.0f;

    /* JADX INFO: renamed from: b */
    private final long f59340b = TXCTimeUtil.getClockTickInHz();

    /* JADX INFO: renamed from: c */
    private final int f59341c = Runtime.getRuntime().availableProcessors();

    public C14211b() {
        try {
            this.f59342d = new RandomAccessFile(String.format(Locale.ENGLISH, "/proc/%d/stat", Integer.valueOf(Process.myPid())), "r");
        } catch (IOException e) {
            TXCLog.m84149e("CpuUsageMeasurer", "open /proc/[PID]/stat failed. " + e.getMessage());
        }
        try {
            this.f59343e = new RandomAccessFile("/proc/stat", "r");
        } catch (IOException unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    private static String[] m84197a(RandomAccessFile randomAccessFile) {
        String line;
        if (randomAccessFile == null) {
            return null;
        }
        try {
            randomAccessFile.seek(0L);
            line = randomAccessFile.readLine();
        } catch (IOException e) {
            TXCLog.m84149e("CpuUsageMeasurer", "read line failed. " + e.getMessage());
            line = null;
        }
        if (TextUtils.isEmpty(line)) {
            return null;
        }
        return line.split("\\s+");
    }

    /* JADX INFO: renamed from: b */
    private void m84198b() {
        long timeTick;
        long j;
        String[] strArrM84197a = m84197a(this.f59342d);
        if (strArrM84197a == null || strArrM84197a.length < 52) {
            return;
        }
        long j2 = (long) (((((Long.parseLong(strArrM84197a[13]) + Long.parseLong(strArrM84197a[14])) + Long.parseLong(strArrM84197a[15])) + Long.parseLong(strArrM84197a[16])) * 1000.0f) / this.f59340b);
        String[] strArrM84197a2 = m84197a(this.f59343e);
        if (strArrM84197a2 == null || strArrM84197a2.length < 8) {
            timeTick = TXCTimeUtil.getTimeTick() * ((long) this.f59341c);
            j = timeTick;
        } else {
            long j3 = Long.parseLong(strArrM84197a2[1]) + Long.parseLong(strArrM84197a2[2]) + Long.parseLong(strArrM84197a2[3]) + Long.parseLong(strArrM84197a2[4]) + Long.parseLong(strArrM84197a2[5]) + Long.parseLong(strArrM84197a2[6]) + Long.parseLong(strArrM84197a2[7]);
            long j4 = Long.parseLong(strArrM84197a2[4]) + Long.parseLong(strArrM84197a2[5]);
            float f = j3 * 1000.0f;
            long j5 = this.f59340b;
            timeTick = (long) (f / j5);
            j = (long) ((j4 * 1000.0f) / j5);
        }
        long j6 = timeTick - this.f59347i;
        float f2 = j2;
        float f3 = j6;
        this.f59346h = ((f2 - this.f59345g) * 100.0f) / f3;
        this.f59349k = ((j6 - (j - this.f59348j)) * 100.0f) / f3;
        this.f59345g = f2;
        this.f59348j = j;
        this.f59347i = timeTick;
        this.f59344f = TXCTimeUtil.getTimeTick();
    }

    public void finalize() throws Throwable {
        super.finalize();
        C14212c.m84203a(this.f59342d);
        C14212c.m84203a(this.f59343e);
        TXCLog.m84152i("CpuUsageMeasurer", "measurer is released");
    }

    /* JADX INFO: renamed from: a */
    public int[] m84199a() {
        int[] iArr;
        synchronized (this) {
            try {
                if (TXCTimeUtil.getTimeTick() - this.f59344f >= f59339a) {
                    m84198b();
                }
                iArr = new int[]{(int) (this.f59346h * 10.0f), (int) (this.f59349k * 10.0f)};
            } catch (Throwable th) {
                throw th;
            }
        }
        return iArr;
    }
}
