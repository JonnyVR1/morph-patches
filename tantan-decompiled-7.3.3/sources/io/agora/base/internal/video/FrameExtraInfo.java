package io.agora.base.internal.video;

import io.agora.base.internal.CalledByNative;

/* JADX INFO: loaded from: classes2.dex */
public class FrameExtraInfo {
    public final long captureTimeNs;
    public final long captureTimeRtp;
    public final long ntpTimestamp;

    /* JADX INFO: renamed from: qp */
    public final int f64013qp;
    public final long rtpTimestampMs;

    public FrameExtraInfo() {
        this.captureTimeNs = 0L;
        this.captureTimeRtp = 0L;
        this.rtpTimestampMs = 0L;
        this.ntpTimestamp = 0L;
        this.f64013qp = 0;
    }

    @CalledByNative
    public long getCaptureTimeNs() {
        return this.captureTimeNs;
    }

    @CalledByNative
    public long getCaptureTimeRtp() {
        return this.captureTimeRtp;
    }

    @CalledByNative
    public long getNtpTimestamp() {
        return this.ntpTimestamp;
    }

    @CalledByNative
    public int getQp() {
        return this.f64013qp;
    }

    @CalledByNative
    public long getRtpTimestampMs() {
        return this.rtpTimestampMs;
    }

    @CalledByNative
    private FrameExtraInfo(long j, long j2, long j3, long j4, int i) {
        this.captureTimeNs = j;
        this.captureTimeRtp = j2;
        this.rtpTimestampMs = j3;
        this.ntpTimestamp = j4;
        this.f64013qp = i;
    }
}
