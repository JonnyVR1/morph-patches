package com.bytedance.bpea.basics;

import android.os.SystemClock;
import com.p051p1.mobile.putong.data.StudentVerRejectedReason;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88119bv = {1, 0, 3}, m88120d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0013B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u000e\u001a\u00020\u000fJ\u0006\u0010\u0010\u001a\u00020\u000fJ\b\u0010\u0011\u001a\u00020\u0012H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u001a\u0010\u000b\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\u0006\"\u0004\b\r\u0010\b¨\u0006\u0014"}, m88121d2 = {"Lcom/bytedance/bpea/basics/TimeAnchor;", "", "()V", "absoluteTime", "Lcom/bytedance/bpea/basics/TimeAnchor$TimeAnchorBean;", "getAbsoluteTime", "()Lcom/bytedance/bpea/basics/TimeAnchor$TimeAnchorBean;", "setAbsoluteTime", "(Lcom/bytedance/bpea/basics/TimeAnchor$TimeAnchorBean;)V", "nanoTime", "getNanoTime", "threadTime", "getThreadTime", "setThreadTime", "end", "", "start", "toString", "", "TimeAnchorBean", "basics_release"}, m88122k = 1, m88123mv = {1, 1, 16})
public final class TimeAnchor {

    @NotNull
    private TimeAnchorBean absoluteTime = new TimeAnchorBean();

    @NotNull
    private final TimeAnchorBean nanoTime = new TimeAnchorBean();

    @NotNull
    private TimeAnchorBean threadTime = new TimeAnchorBean();

    @Metadata(m88119bv = {1, 0, 3}, m88120d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\f\u001a\u00020\u0004J\b\u0010\r\u001a\u00020\u000eH\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\b¨\u0006\u000f"}, m88121d2 = {"Lcom/bytedance/bpea/basics/TimeAnchor$TimeAnchorBean;", "", "()V", "endTime", "", "getEndTime", "()J", "setEndTime", "(J)V", StudentVerRejectedReason.startTime, "getStartTime", "setStartTime", "getCostTime", "toString", "", "basics_release"}, m88122k = 1, m88123mv = {1, 1, 16})
    public static final class TimeAnchorBean {
        private long endTime;
        private long startTime;

        public final long getCostTime() {
            long j = this.endTime - this.startTime;
            if (j < 0) {
                return 0L;
            }
            return j;
        }

        public final long getEndTime() {
            return this.endTime;
        }

        public final long getStartTime() {
            return this.startTime;
        }

        public final void setEndTime(long j) {
            this.endTime = j;
        }

        public final void setStartTime(long j) {
            this.startTime = j;
        }

        @NotNull
        public String toString() {
            return "TimeAnchorBean(startTime=" + this.startTime + ", endTime=" + this.endTime + ",costTime=" + getCostTime() + ')';
        }
    }

    public TimeAnchor() {
        start();
    }

    public final void end() {
        this.absoluteTime.setEndTime(System.currentTimeMillis());
        this.nanoTime.setEndTime(System.nanoTime());
        this.threadTime.setEndTime(SystemClock.currentThreadTimeMillis());
    }

    @NotNull
    public final TimeAnchorBean getAbsoluteTime() {
        return this.absoluteTime;
    }

    @NotNull
    public final TimeAnchorBean getNanoTime() {
        return this.nanoTime;
    }

    @NotNull
    public final TimeAnchorBean getThreadTime() {
        return this.threadTime;
    }

    public final void setAbsoluteTime(@NotNull TimeAnchorBean timeAnchorBean) {
        timeAnchorBean.getClass();
        this.absoluteTime = timeAnchorBean;
    }

    public final void setThreadTime(@NotNull TimeAnchorBean timeAnchorBean) {
        timeAnchorBean.getClass();
        this.threadTime = timeAnchorBean;
    }

    public final void start() {
        this.absoluteTime.setStartTime(System.currentTimeMillis());
        this.nanoTime.setStartTime(System.nanoTime());
        this.threadTime.setStartTime(SystemClock.currentThreadTimeMillis());
    }

    @NotNull
    public String toString() {
        return "TimeAnchor(absoluteTime=" + this.absoluteTime + ", threadTime=" + this.threadTime + ", nanoTime=" + this.nanoTime + ')';
    }
}
