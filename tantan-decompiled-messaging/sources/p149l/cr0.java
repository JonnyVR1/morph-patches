package p149l;

import android.os.SystemClock;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b!\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\bJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\bJ\u000f\u0010\u0014\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0014\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0015R\"\u0010\u001a\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0018\u0010\u0019R\"\u0010\u001f\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u001b\u001a\u0004\b\u001c\u0010\u000f\"\u0004\b\u001d\u0010\u001eR\"\u0010\"\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u001b\u001a\u0004\b \u0010\u000f\"\u0004\b!\u0010\u001eR\u0016\u0010#\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u001bR\u0016\u0010%\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010\u001bR\u0016\u0010&\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u001bR\u0016\u0010'\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u001bR\u0016\u0010(\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u001bR\"\u0010,\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010)\u001a\u0004\b*\u0010\f\"\u0004\b$\u0010+R\u0016\u0010.\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010)R\u0016\u00100\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010)¨\u00061"}, m87232d2 = {"Ll/cr0;", "", "Ll/z4j;", "frameScheduler", "<init>", "(Ll/z4j;)V", "", RXScreenCaptureService.KEY_INDEX, "()V", "j", "", "a", "()I", "", "c", "()J", "", "h", "()Z", "e", Constants.INAPP_DATA_TAG, "Ll/z4j;", "b", "Z", "g", "(Z)V", "running", "J", "getFrameSchedulingDelayMs", "setFrameSchedulingDelayMs", "(J)V", "frameSchedulingDelayMs", "getFrameSchedulingOffsetMs", "setFrameSchedulingOffsetMs", "frameSchedulingOffsetMs", "pauseTimeMs", "f", "startMs", "expectedRenderTimeMs", "lastFrameAnimationTimeMs", "lastFrameAnimationTimeDifferenceMs", "I", "getLastDrawnFrameNumber", "(I)V", "lastDrawnFrameNumber", "k", "pausedLastDrawnFrameNumber", BLiveStormDanmakuGiftResourceType.f44444l, "framesDropped", "animated-drawable_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public final class cr0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final z4j frameScheduler;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public boolean running;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public long frameSchedulingDelayMs;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public long frameSchedulingOffsetMs;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public long pauseTimeMs;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public long startMs;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public long expectedRenderTimeMs;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public long lastFrameAnimationTimeMs;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public long lastFrameAnimationTimeDifferenceMs;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public int lastDrawnFrameNumber;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public int pausedLastDrawnFrameNumber;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public int framesDropped;

    public cr0(@NotNull z4j z4jVar) {
        z4jVar.getClass();
        this.frameScheduler = z4jVar;
        this.frameSchedulingDelayMs = 8L;
        this.lastDrawnFrameNumber = -1;
        this.pausedLastDrawnFrameNumber = -1;
    }

    /* JADX INFO: renamed from: a */
    public final int m108310a() {
        long jM108313d = this.running ? (m108313d() - this.startMs) + this.frameSchedulingOffsetMs : Math.max(this.lastFrameAnimationTimeMs, 0L);
        int iMo135670b = this.frameScheduler.mo135670b(jM108313d, this.lastFrameAnimationTimeMs);
        this.lastFrameAnimationTimeMs = jM108313d;
        return iMo135670b;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getRunning() {
        return this.running;
    }

    /* JADX INFO: renamed from: c */
    public final long m108312c() {
        if (!this.running) {
            return -1L;
        }
        long jMo135669a = this.frameScheduler.mo135669a(m108313d() - this.startMs);
        if (jMo135669a == -1) {
            this.running = false;
            return -1L;
        }
        long j = jMo135669a + this.frameSchedulingDelayMs;
        this.expectedRenderTimeMs = this.startMs + j;
        return j;
    }

    /* JADX INFO: renamed from: d */
    public final long m108313d() {
        return SystemClock.uptimeMillis();
    }

    /* JADX INFO: renamed from: e */
    public final void m108314e() {
        this.framesDropped++;
    }

    /* JADX INFO: renamed from: f */
    public final void m108315f(int i) {
        this.lastDrawnFrameNumber = i;
    }

    /* JADX INFO: renamed from: g */
    public final void m108316g(boolean z) {
        this.running = z;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m108317h() {
        return this.lastDrawnFrameNumber != -1 && m108313d() >= this.expectedRenderTimeMs;
    }

    /* JADX INFO: renamed from: i */
    public final void m108318i() {
        if (this.running) {
            return;
        }
        long jM108313d = m108313d();
        long j = jM108313d - this.pauseTimeMs;
        this.startMs = j;
        this.expectedRenderTimeMs = j;
        this.lastFrameAnimationTimeMs = jM108313d - this.lastFrameAnimationTimeDifferenceMs;
        this.lastDrawnFrameNumber = this.pausedLastDrawnFrameNumber;
        this.running = true;
    }

    /* JADX INFO: renamed from: j */
    public final void m108319j() {
        if (this.running) {
            long jM108313d = m108313d();
            this.pauseTimeMs = jM108313d - this.startMs;
            this.lastFrameAnimationTimeDifferenceMs = jM108313d - this.lastFrameAnimationTimeMs;
            this.startMs = 0L;
            this.expectedRenderTimeMs = 0L;
            this.lastFrameAnimationTimeMs = -1L;
            this.lastDrawnFrameNumber = -1;
            this.running = false;
        }
    }
}
