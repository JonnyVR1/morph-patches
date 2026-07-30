package com.tencent.iliveroom.p080a.p082b;

import com.tencent.iliveroom.TXILiveRoomDefine;
import com.tencent.liteav.basic.module.TXCStatus;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.tencent.iliveroom.a.b.a */
/* JADX INFO: loaded from: classes2.dex */
public class C13953a {

    /* JADX INFO: renamed from: a */
    private long f57818a;

    /* JADX INFO: renamed from: b */
    private AtomicInteger f57819b;

    /* JADX INFO: renamed from: c */
    private Map<Long, Long> f57820c;

    /* JADX INFO: renamed from: d */
    private final Object f57821d;

    /* JADX INFO: renamed from: e */
    private AtomicLong f57822e;

    /* JADX INFO: renamed from: f */
    private long f57823f;

    /* JADX INFO: renamed from: g */
    private AtomicReference<TXILiveRoomDefine.TXILiveRoomAVStatistic> f57824g;

    /* JADX INFO: renamed from: com.tencent.iliveroom.a.b.a$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public static C13953a f57825a = new C13953a();
    }

    private C13953a() {
        this.f57818a = 0L;
        this.f57822e = new AtomicLong(0L);
        this.f57819b = new AtomicInteger(2);
        this.f57824g = new AtomicReference<>(new TXILiveRoomDefine.TXILiveRoomAVStatistic());
        this.f57820c = new HashMap();
        this.f57821d = new Object();
    }

    /* JADX INFO: renamed from: e */
    private TXILiveRoomDefine.TXILiveRoomAVStatistic m82603e() {
        TXILiveRoomDefine.TXILiveRoomAVStatistic tXILiveRoomAVStatistic = new TXILiveRoomDefine.TXILiveRoomAVStatistic();
        if (this.f57819b.get() == 1) {
            tXILiveRoomAVStatistic.audioCapTotalBytes = C13954b.m82611a(0);
            tXILiveRoomAVStatistic.audioEncTotalBytes = C13954b.m82611a(1);
            tXILiveRoomAVStatistic.videoEncTotalBytes = C13954b.m82611a(2);
            tXILiveRoomAVStatistic.videoEncFrameTotalCount = this.f57822e.get();
            TXILiveRoomDefine.TXILiveRoomAVStatistic.TXUserAVStatistic tXUserAVStatistic = new TXILiveRoomDefine.TXILiveRoomAVStatistic.TXUserAVStatistic();
            tXUserAVStatistic.userId = this.f57818a;
            tXUserAVStatistic.videoTotalBytes = TXCStatus.m82991a("18446744073709551615", TXILiveRoomDefine.TXILiveRoomWarningAudioDecodeFailed);
            tXUserAVStatistic.audioTotalBytes = TXCStatus.m82991a("18446744073709551615", TXILiveRoomDefine.TXILiveRoomWarningVideoDecodeFailed);
            tXILiveRoomAVStatistic.userAVStatistics.add(tXUserAVStatistic);
        }
        synchronized (this.f57821d) {
            try {
                for (Long l2 : this.f57820c.keySet()) {
                    long jLongValue = l2.longValue();
                    TXILiveRoomDefine.TXILiveRoomAVStatistic.TXUserAVStatistic tXUserAVStatistic2 = new TXILiveRoomDefine.TXILiveRoomAVStatistic.TXUserAVStatistic();
                    tXUserAVStatistic2.userId = jLongValue;
                    tXUserAVStatistic2.audioTotalBytes = TXCStatus.m82999c(this.f57820c.get(l2) + "", 16006);
                    tXUserAVStatistic2.videoTotalBytes = TXCStatus.m82999c(this.f57820c.get(l2) + "", 16005);
                    tXILiveRoomAVStatistic.userAVStatistics.add(tXUserAVStatistic2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return tXILiveRoomAVStatistic;
    }

    /* JADX INFO: renamed from: a */
    public void m82606a(long j, long j2) {
        synchronized (this.f57821d) {
            this.f57820c.put(Long.valueOf(j), Long.valueOf(j2));
        }
    }

    /* JADX INFO: renamed from: b */
    public void m82607b() {
        synchronized (this.f57821d) {
            this.f57820c.clear();
        }
        this.f57822e.set(0L);
        this.f57819b.set(8);
        this.f57824g.set(new TXILiveRoomDefine.TXILiveRoomAVStatistic());
    }

    /* JADX INFO: renamed from: c */
    public TXILiveRoomDefine.TXILiveRoomAVStatistic m82609c() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.f57823f < 1000) {
            return this.f57824g.get();
        }
        this.f57823f = jCurrentTimeMillis;
        TXILiveRoomDefine.TXILiveRoomAVStatistic tXILiveRoomAVStatisticM82603e = m82603e();
        this.f57824g.set(tXILiveRoomAVStatisticM82603e);
        return tXILiveRoomAVStatisticM82603e;
    }

    /* JADX INFO: renamed from: d */
    public void m82610d() {
        this.f57822e.incrementAndGet();
    }

    /* JADX INFO: renamed from: a */
    public void m82605a(long j) {
        this.f57818a = j;
    }

    /* JADX INFO: renamed from: a */
    public static C13953a m82602a() {
        return a.f57825a;
    }

    /* JADX INFO: renamed from: a */
    public void m82604a(int i) {
        this.f57819b.set(i);
    }

    /* JADX INFO: renamed from: b */
    public void m82608b(long j, long j2) {
        synchronized (this.f57821d) {
            this.f57820c.remove(Long.valueOf(j));
        }
    }
}
