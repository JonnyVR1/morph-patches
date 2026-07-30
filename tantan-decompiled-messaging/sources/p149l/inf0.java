package p149l;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m87231d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u0000 \u00182\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u0003R\u0014\u0010\u000f\u001a\u00020\t8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u000b\u0010\u000eR\u0016\u0010\u0010\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0011\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u000eR\u0016\u0010\u0013\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u000eR\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, m87232d2 = {"Ll/inf0;", "", "<init>", "()V", "", "fps", "", "c", "(I)V", "", "presentationTimeUsec", "a", "(J)V", "b", "J", "ONE_MILLION", "prevPresentUsec", "prevMonoUsec", Constants.INAPP_DATA_TAG, "fixedFrameDurationUsec", "", "e", "Z", "loopReset", "Companion", "base_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class inf0 {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public long prevPresentUsec;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public long prevMonoUsec;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public long fixedFrameDurationUsec;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final long ONE_MILLION = 1000000;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public boolean loopReset = true;

    /* JADX INFO: renamed from: a */
    public final void m137137a(long presentationTimeUsec) {
        long j = this.prevMonoUsec;
        long j2 = 0;
        if (j == 0) {
            this.prevMonoUsec = System.nanoTime() / 1000;
            this.prevPresentUsec = presentationTimeUsec;
            return;
        }
        if (this.loopReset) {
            this.prevPresentUsec = presentationTimeUsec - (this.ONE_MILLION / 30);
            this.loopReset = false;
        }
        long j3 = this.fixedFrameDurationUsec;
        if (j3 == 0) {
            j3 = presentationTimeUsec - this.prevPresentUsec;
        }
        if (j3 >= 0) {
            long j4 = this.ONE_MILLION;
            j2 = j3 > 10 * j4 ? 5 * j4 : j3;
        }
        long j5 = j + j2;
        long jNanoTime = System.nanoTime();
        while (true) {
            long j6 = jNanoTime / 1000;
            if (j6 >= j5 - 100) {
                this.prevMonoUsec += j2;
                this.prevPresentUsec += j2;
                return;
            }
            long j7 = j5 - j6;
            if (j7 > 500000) {
                j7 = 500000;
            }
            try {
                Thread.sleep(j7 / 1000, ((int) (j7 % 1000)) * 1000);
            } catch (InterruptedException e) {
                C21588z0.INSTANCE.m216708c("AnimPlayer.SpeedControlUtil", "e=" + e, e);
            }
            jNanoTime = System.nanoTime();
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m137138b() {
        this.prevPresentUsec = 0L;
        this.prevMonoUsec = 0L;
    }

    /* JADX INFO: renamed from: c */
    public final void m137139c(int fps) {
        if (fps <= 0) {
            return;
        }
        this.fixedFrameDurationUsec = this.ONE_MILLION / ((long) fps);
    }
}
