package com.tencent.youtu.sdkkitframework.common;

import com.tencent.youtu.sdkkitframework.framework.YtFSM;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public class TimeoutCounter {

    /* JADX INFO: renamed from: a */
    public long f61405a = 0;

    /* JADX INFO: renamed from: b */
    public long f61406b = 0;

    /* JADX INFO: renamed from: c */
    public boolean f61407c = false;

    /* JADX INFO: renamed from: d */
    public boolean f61408d = true;

    /* JADX INFO: renamed from: e */
    public String f61409e;

    public TimeoutCounter(String str) {
        this.f61409e = str;
    }

    public void cancel() {
        YtLogger.m85810i("TimeoutCounter", this.f61409e + " cancel");
        this.f61407c = false;
    }

    public boolean checkTimeout() {
        return this.f61407c && this.f61406b > 0 && System.currentTimeMillis() - this.f61405a > this.f61406b;
    }

    public void init(long j, boolean z) {
        this.f61406b = j;
        this.f61408d = z;
        YtLogger.m85810i("TimeoutCounter", this.f61409e + " init with " + this.f61406b);
    }

    public boolean isRunning() {
        return this.f61407c && this.f61406b > 0;
    }

    public void reset() {
        YtLogger.m85810i("TimeoutCounter", this.f61409e + " reset");
        this.f61407c = true;
        if (this.f61406b > 0 && this.f61408d) {
            YtFSM.getInstance().sendFSMEvent(new HashMap<String, Object>() { // from class: com.tencent.youtu.sdkkitframework.common.TimeoutCounter.1
                {
                    put(StateEvent.Name.UI_ACTION, StateEvent.ActionValue.TIMEOUT_COUNTDOWN_BEGIN);
                    put(StateEvent.Name.COUNTDOWN_TIME, Long.valueOf(TimeoutCounter.this.f61406b));
                }
            });
        }
        this.f61405a = System.currentTimeMillis();
    }

    public void start() {
        reset();
    }
}
