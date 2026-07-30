package com.tencent.iliveroom.p080a.p083c;

import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.module.TXCStatus;

/* JADX INFO: renamed from: com.tencent.iliveroom.a.c.d */
/* JADX INFO: loaded from: classes2.dex */
public class C13960d {

    /* JADX INFO: renamed from: b */
    private long f57846b;

    /* JADX INFO: renamed from: c */
    private long f57847c;

    /* JADX INFO: renamed from: d */
    private long f57848d;

    /* JADX INFO: renamed from: g */
    private long f57851g;

    /* JADX INFO: renamed from: a */
    private int f57845a = 2000;

    /* JADX INFO: renamed from: e */
    private long f57849e = 0;

    /* JADX INFO: renamed from: f */
    private long f57850f = 0;

    /* JADX INFO: renamed from: h */
    private long f57852h = 0;

    /* JADX INFO: renamed from: a */
    public void m82637a() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = this.f57849e;
        if (j != 0) {
            long j2 = jCurrentTimeMillis - j;
            if (j2 > 150 && this.f57848d < j2) {
                this.f57848d = j2;
            }
            if (j2 < 30) {
                if (this.f57847c == 0) {
                    this.f57847c = j2;
                }
                if (this.f57847c > j2) {
                    this.f57847c = j2;
                }
            }
            if (jCurrentTimeMillis - this.f57846b > this.f57845a) {
                if (this.f57848d != 0) {
                    TXCLog.m82966e("TRTCAdapter-VideoPath", "send custom video too slow " + this.f57848d);
                }
                if (this.f57847c != 0) {
                    TXCLog.m82966e("TRTCAdapter-VideoPath", "send custom video too fast " + this.f57847c);
                }
                this.f57846b = System.currentTimeMillis();
                this.f57848d = 0L;
                this.f57847c = 0L;
            }
        }
        this.f57849e = System.currentTimeMillis();
        long jCurrentTimeMillis2 = System.currentTimeMillis() - this.f57851g;
        long j3 = this.f57850f + 1;
        this.f57850f = j3;
        if (jCurrentTimeMillis2 >= 1000) {
            TXCStatus.m82994a("18446744073709551615", 1001, 2, Double.valueOf(((j3 - this.f57852h) * 1000.0d) / jCurrentTimeMillis2));
            this.f57852h = this.f57850f;
            this.f57851g += jCurrentTimeMillis2;
        }
    }
}
