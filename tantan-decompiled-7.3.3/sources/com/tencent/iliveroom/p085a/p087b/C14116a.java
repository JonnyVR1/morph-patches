package com.tencent.iliveroom.p085a.p087b;

import com.tencent.iliveroom.TXILiveRoomDefine;
import com.tencent.liteav.basic.module.TXCStatus;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.tencent.iliveroom.a.b.a */
/* JADX INFO: loaded from: classes12.dex */
public class C14116a {

    /* JADX INFO: renamed from: a */
    private long f58666a;

    /* JADX INFO: renamed from: b */
    private AtomicInteger f58667b;

    /* JADX INFO: renamed from: c */
    private Map<Long, Long> f58668c;

    /* JADX INFO: renamed from: d */
    private final Object f58669d;

    /* JADX INFO: renamed from: e */
    private AtomicLong f58670e;

    /* JADX INFO: renamed from: f */
    private long f58671f;

    /* JADX INFO: renamed from: g */
    private AtomicReference<TXILiveRoomDefine.TXILiveRoomAVStatistic> f58672g;

    /* JADX INFO: renamed from: com.tencent.iliveroom.a.b.a$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public static C14116a f58673a = new C14116a();
    }

    private C14116a() {
        this.f58666a = 0L;
        this.f58670e = new AtomicLong(0L);
        this.f58667b = new AtomicInteger(2);
        this.f58672g = new AtomicReference<>(new TXILiveRoomDefine.TXILiveRoomAVStatistic());
        this.f58668c = new HashMap();
        this.f58669d = new Object();
    }

    /* JADX INFO: renamed from: e */
    private TXILiveRoomDefine.TXILiveRoomAVStatistic m83786e() {
        TXILiveRoomDefine.TXILiveRoomAVStatistic tXILiveRoomAVStatistic = new TXILiveRoomDefine.TXILiveRoomAVStatistic();
        if (this.f58667b.get() == 1) {
            tXILiveRoomAVStatistic.audioCapTotalBytes = C14117b.m83794a(0);
            tXILiveRoomAVStatistic.audioEncTotalBytes = C14117b.m83794a(1);
            tXILiveRoomAVStatistic.videoEncTotalBytes = C14117b.m83794a(2);
            tXILiveRoomAVStatistic.videoEncFrameTotalCount = this.f58670e.get();
            TXILiveRoomDefine.TXILiveRoomAVStatistic.TXUserAVStatistic tXUserAVStatistic = new TXILiveRoomDefine.TXILiveRoomAVStatistic.TXUserAVStatistic();
            tXUserAVStatistic.userId = this.f58666a;
            tXUserAVStatistic.videoTotalBytes = TXCStatus.m84174a("18446744073709551615", TXILiveRoomDefine.TXILiveRoomWarningAudioDecodeFailed);
            tXUserAVStatistic.audioTotalBytes = TXCStatus.m84174a("18446744073709551615", TXILiveRoomDefine.TXILiveRoomWarningVideoDecodeFailed);
            tXILiveRoomAVStatistic.userAVStatistics.add(tXUserAVStatistic);
        }
        synchronized (this.f58669d) {
            try {
                for (Long l2 : this.f58668c.keySet()) {
                    long jLongValue = l2.longValue();
                    TXILiveRoomDefine.TXILiveRoomAVStatistic.TXUserAVStatistic tXUserAVStatistic2 = new TXILiveRoomDefine.TXILiveRoomAVStatistic.TXUserAVStatistic();
                    tXUserAVStatistic2.userId = jLongValue;
                    tXUserAVStatistic2.audioTotalBytes = TXCStatus.m84182c(this.f58668c.get(l2) + "", 16006);
                    tXUserAVStatistic2.videoTotalBytes = TXCStatus.m84182c(this.f58668c.get(l2) + "", 16005);
                    tXILiveRoomAVStatistic.userAVStatistics.add(tXUserAVStatistic2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return tXILiveRoomAVStatistic;
    }

    /* JADX INFO: renamed from: a */
    public void m83789a(long j, long j2) {
        synchronized (this.f58669d) {
            this.f58668c.put(Long.valueOf(j), Long.valueOf(j2));
        }
    }

    /* JADX INFO: renamed from: b */
    public void m83790b() {
        synchronized (this.f58669d) {
            this.f58668c.clear();
        }
        this.f58670e.set(0L);
        this.f58667b.set(8);
        this.f58672g.set(new TXILiveRoomDefine.TXILiveRoomAVStatistic());
    }

    /* JADX INFO: renamed from: c */
    public TXILiveRoomDefine.TXILiveRoomAVStatistic m83792c() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.f58671f < 1000) {
            return this.f58672g.get();
        }
        this.f58671f = jCurrentTimeMillis;
        TXILiveRoomDefine.TXILiveRoomAVStatistic tXILiveRoomAVStatisticM83786e = m83786e();
        this.f58672g.set(tXILiveRoomAVStatisticM83786e);
        return tXILiveRoomAVStatisticM83786e;
    }

    /* JADX INFO: renamed from: d */
    public void m83793d() {
        this.f58670e.incrementAndGet();
    }

    /* JADX INFO: renamed from: a */
    public void m83788a(long j) {
        this.f58666a = j;
    }

    /* JADX INFO: renamed from: a */
    public static C14116a m83785a() {
        return a.f58673a;
    }

    /* JADX INFO: renamed from: a */
    public void m83787a(int i) {
        this.f58667b.set(i);
    }

    /* JADX INFO: renamed from: b */
    public void m83791b(long j, long j2) {
        synchronized (this.f58669d) {
            this.f58668c.remove(Long.valueOf(j));
        }
    }
}
