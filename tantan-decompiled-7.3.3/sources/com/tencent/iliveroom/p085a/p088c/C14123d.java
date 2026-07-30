package com.tencent.iliveroom.p085a.p088c;

import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.module.TXCStatus;

/* JADX INFO: renamed from: com.tencent.iliveroom.a.c.d */
/* JADX INFO: loaded from: classes12.dex */
public class C14123d {

    /* JADX INFO: renamed from: b */
    private long f58694b;

    /* JADX INFO: renamed from: c */
    private long f58695c;

    /* JADX INFO: renamed from: d */
    private long f58696d;

    /* JADX INFO: renamed from: g */
    private long f58699g;

    /* JADX INFO: renamed from: a */
    private int f58693a = 2000;

    /* JADX INFO: renamed from: e */
    private long f58697e = 0;

    /* JADX INFO: renamed from: f */
    private long f58698f = 0;

    /* JADX INFO: renamed from: h */
    private long f58700h = 0;

    /* JADX INFO: renamed from: a */
    public void m83820a() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = this.f58697e;
        if (j != 0) {
            long j2 = jCurrentTimeMillis - j;
            if (j2 > 150 && this.f58696d < j2) {
                this.f58696d = j2;
            }
            if (j2 < 30) {
                if (this.f58695c == 0) {
                    this.f58695c = j2;
                }
                if (this.f58695c > j2) {
                    this.f58695c = j2;
                }
            }
            if (jCurrentTimeMillis - this.f58694b > this.f58693a) {
                if (this.f58696d != 0) {
                    TXCLog.m84149e("TRTCAdapter-VideoPath", "send custom video too slow " + this.f58696d);
                }
                if (this.f58695c != 0) {
                    TXCLog.m84149e("TRTCAdapter-VideoPath", "send custom video too fast " + this.f58695c);
                }
                this.f58694b = System.currentTimeMillis();
                this.f58696d = 0L;
                this.f58695c = 0L;
            }
        }
        this.f58697e = System.currentTimeMillis();
        long jCurrentTimeMillis2 = System.currentTimeMillis() - this.f58699g;
        long j3 = this.f58698f + 1;
        this.f58698f = j3;
        if (jCurrentTimeMillis2 >= 1000) {
            TXCStatus.m84177a("18446744073709551615", 1001, 2, Double.valueOf(((j3 - this.f58700h) * 1000.0d) / jCurrentTimeMillis2));
            this.f58700h = this.f58698f;
            this.f58699g += jCurrentTimeMillis2;
        }
    }
}
