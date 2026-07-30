package com.tencent.youtu.sdkkitframework.common;

import com.tencent.youtu.sdkkitframework.framework.YtFSM;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public class TimeoutCounter {

    /* JADX INFO: renamed from: a */
    public long f60558a = 0;

    /* JADX INFO: renamed from: b */
    public long f60559b = 0;

    /* JADX INFO: renamed from: c */
    public boolean f60560c = false;

    /* JADX INFO: renamed from: d */
    public boolean f60561d = true;

    /* JADX INFO: renamed from: e */
    public String f60562e;

    public TimeoutCounter(String str) {
        this.f60562e = str;
    }

    public void cancel() {
        YtLogger.m84639i("TimeoutCounter", this.f60562e + " cancel");
        this.f60560c = false;
    }

    public boolean checkTimeout() {
        return this.f60560c && this.f60559b > 0 && System.currentTimeMillis() - this.f60558a > this.f60559b;
    }

    public void init(long j, boolean z) {
        this.f60559b = j;
        this.f60561d = z;
        YtLogger.m84639i("TimeoutCounter", this.f60562e + " init with " + this.f60559b);
    }

    public boolean isRunning() {
        return this.f60560c && this.f60559b > 0;
    }

    public void reset() {
        YtLogger.m84639i("TimeoutCounter", this.f60562e + " reset");
        this.f60560c = true;
        if (this.f60559b > 0 && this.f60561d) {
            YtFSM.getInstance().sendFSMEvent(new HashMap<String, Object>() { // from class: com.tencent.youtu.sdkkitframework.common.TimeoutCounter.1
                {
                    put(StateEvent.Name.UI_ACTION, StateEvent.ActionValue.TIMEOUT_COUNTDOWN_BEGIN);
                    put(StateEvent.Name.COUNTDOWN_TIME, Long.valueOf(TimeoutCounter.this.f60559b));
                }
            });
        }
        this.f60558a = System.currentTimeMillis();
    }

    public void start() {
        reset();
    }
}
