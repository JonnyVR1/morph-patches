package com.tencent.liteav.basic.util;

import android.os.Process;
import android.text.TextUtils;
import com.tencent.liteav.basic.log.TXCLog;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Locale;

/* JADX INFO: renamed from: com.tencent.liteav.basic.util.b */
/* JADX INFO: loaded from: classes2.dex */
public class C14048b {

    /* JADX INFO: renamed from: a */
    private static final long f58491a = 2000;

    /* JADX INFO: renamed from: d */
    private RandomAccessFile f58494d;

    /* JADX INFO: renamed from: e */
    private RandomAccessFile f58495e;

    /* JADX INFO: renamed from: f */
    private long f58496f = 0;

    /* JADX INFO: renamed from: g */
    private float f58497g = 0.0f;

    /* JADX INFO: renamed from: h */
    private float f58498h = 0.0f;

    /* JADX INFO: renamed from: i */
    private long f58499i = 0;

    /* JADX INFO: renamed from: j */
    private long f58500j = 0;

    /* JADX INFO: renamed from: k */
    private float f58501k = 0.0f;

    /* JADX INFO: renamed from: b */
    private final long f58492b = TXCTimeUtil.getClockTickInHz();

    /* JADX INFO: renamed from: c */
    private final int f58493c = Runtime.getRuntime().availableProcessors();

    public C14048b() {
        try {
            this.f58494d = new RandomAccessFile(String.format(Locale.ENGLISH, "/proc/%d/stat", Integer.valueOf(Process.myPid())), "r");
        } catch (IOException e) {
            TXCLog.m82966e("CpuUsageMeasurer", "open /proc/[PID]/stat failed. " + e.getMessage());
        }
        try {
            this.f58495e = new RandomAccessFile("/proc/stat", "r");
        } catch (IOException unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    private static String[] m83014a(RandomAccessFile randomAccessFile) {
        String line;
        if (randomAccessFile == null) {
            return null;
        }
        try {
            randomAccessFile.seek(0L);
            line = randomAccessFile.readLine();
        } catch (IOException e) {
            TXCLog.m82966e("CpuUsageMeasurer", "read line failed. " + e.getMessage());
            line = null;
        }
        if (TextUtils.isEmpty(line)) {
            return null;
        }
        return line.split("\\s+");
    }

    /* JADX INFO: renamed from: b */
    private void m83015b() {
        long timeTick;
        long j;
        String[] strArrM83014a = m83014a(this.f58494d);
        if (strArrM83014a == null || strArrM83014a.length < 52) {
            return;
        }
        long j2 = (long) (((((Long.parseLong(strArrM83014a[13]) + Long.parseLong(strArrM83014a[14])) + Long.parseLong(strArrM83014a[15])) + Long.parseLong(strArrM83014a[16])) * 1000.0f) / this.f58492b);
        String[] strArrM83014a2 = m83014a(this.f58495e);
        if (strArrM83014a2 == null || strArrM83014a2.length < 8) {
            timeTick = TXCTimeUtil.getTimeTick() * ((long) this.f58493c);
            j = timeTick;
        } else {
            long j3 = Long.parseLong(strArrM83014a2[1]) + Long.parseLong(strArrM83014a2[2]) + Long.parseLong(strArrM83014a2[3]) + Long.parseLong(strArrM83014a2[4]) + Long.parseLong(strArrM83014a2[5]) + Long.parseLong(strArrM83014a2[6]) + Long.parseLong(strArrM83014a2[7]);
            long j4 = Long.parseLong(strArrM83014a2[4]) + Long.parseLong(strArrM83014a2[5]);
            float f = j3 * 1000.0f;
            long j5 = this.f58492b;
            timeTick = (long) (f / j5);
            j = (long) ((j4 * 1000.0f) / j5);
        }
        long j6 = timeTick - this.f58499i;
        float f2 = j2;
        float f3 = j6;
        this.f58498h = ((f2 - this.f58497g) * 100.0f) / f3;
        this.f58501k = ((j6 - (j - this.f58500j)) * 100.0f) / f3;
        this.f58497g = f2;
        this.f58500j = j;
        this.f58499i = timeTick;
        this.f58496f = TXCTimeUtil.getTimeTick();
    }

    public void finalize() throws Throwable {
        super.finalize();
        C14049c.m83020a(this.f58494d);
        C14049c.m83020a(this.f58495e);
        TXCLog.m82969i("CpuUsageMeasurer", "measurer is released");
    }

    /* JADX INFO: renamed from: a */
    public int[] m83016a() {
        int[] iArr;
        synchronized (this) {
            try {
                if (TXCTimeUtil.getTimeTick() - this.f58496f >= f58491a) {
                    m83015b();
                }
                iArr = new int[]{(int) (this.f58498h * 10.0f), (int) (this.f58501k * 10.0f)};
            } catch (Throwable th) {
                throw th;
            }
        }
        return iArr;
    }
}
