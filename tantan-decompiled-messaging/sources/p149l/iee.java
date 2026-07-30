package p149l;

import androidx.annotation.VisibleForTesting;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\n\u0018\u0000 \u00192\u00020\u0001:\u0001\u000eB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0016R\u0016\u0010\u0018\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0017¨\u0006\u001a"}, m87232d2 = {"Ll/iee;", "Ll/z4j;", "Ll/gr0;", "animationInformation", "<init>", "(Ll/gr0;)V", "", "animationTimeMs", "lastFrameTimeMs", "", "b", "(JJ)I", Constants.INAPP_DATA_TAG, "()J", "a", "(J)J", "", "e", "()Z", "timeInCurrentLoopMs", "c", "(J)I", "Ll/gr0;", "J", "_loopDurationMs", "Companion", "animated-drawable_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public final class iee implements z4j {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final gr0 animationInformation;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public long _loopDurationMs;

    public iee(@NotNull gr0 gr0Var) {
        gr0Var.getClass();
        this.animationInformation = gr0Var;
        this._loopDurationMs = -1L;
    }

    @Override // p149l.z4j
    /* JADX INFO: renamed from: a */
    public long mo135669a(long animationTimeMs) {
        long jM135672d = m135672d();
        long jMo108211g = 0;
        if (jM135672d == 0) {
            return -1L;
        }
        if (!m135673e() && animationTimeMs / jM135672d >= this.animationInformation.getLoopCount()) {
            return -1L;
        }
        long j = animationTimeMs % jM135672d;
        int frameCount = this.animationInformation.getFrameCount();
        for (int i = 0; i < frameCount && jMo108211g <= j; i++) {
            jMo108211g += (long) this.animationInformation.mo108211g(i);
        }
        return animationTimeMs + (jMo108211g - j);
    }

    @Override // p149l.z4j
    /* JADX INFO: renamed from: b */
    public int mo135670b(long animationTimeMs, long lastFrameTimeMs) {
        long jM135672d = m135672d();
        if (jM135672d == 0) {
            return m135671c(0L);
        }
        if (m135673e() || animationTimeMs / jM135672d < this.animationInformation.getLoopCount()) {
            return m135671c(animationTimeMs % jM135672d);
        }
        return -1;
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: c */
    public final int m135671c(long timeInCurrentLoopMs) {
        int i = 0;
        long jMo108211g = 0;
        while (true) {
            jMo108211g += (long) this.animationInformation.mo108211g(i);
            int i2 = i + 1;
            if (timeInCurrentLoopMs < jMo108211g) {
                return i;
            }
            i = i2;
        }
    }

    /* JADX INFO: renamed from: d */
    public long m135672d() {
        long j = this._loopDurationMs;
        if (j != -1) {
            return j;
        }
        this._loopDurationMs = 0L;
        int frameCount = this.animationInformation.getFrameCount();
        int i = 0;
        while (true) {
            long j2 = this._loopDurationMs;
            if (i >= frameCount) {
                return j2;
            }
            this._loopDurationMs = j2 + ((long) this.animationInformation.mo108211g(i));
            i++;
        }
    }

    /* JADX INFO: renamed from: e */
    public boolean m135673e() {
        return this.animationInformation.getLoopCount() == 0;
    }
}
