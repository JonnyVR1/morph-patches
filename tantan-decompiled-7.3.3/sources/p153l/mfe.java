package p153l;

import androidx.annotation.VisibleForTesting;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\n\u0018\u0000 \u00192\u00020\u0001:\u0001\u000eB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0016R\u0016\u0010\u0018\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0017¨\u0006\u001a"}, m88121d2 = {"Ll/mfe;", "Ll/u7j;", "Ll/kr0;", "animationInformation", "<init>", "(Ll/kr0;)V", "", "animationTimeMs", "lastFrameTimeMs", "", "b", "(JJ)I", Constants.INAPP_DATA_TAG, "()J", "a", "(J)J", "", "e", "()Z", "timeInCurrentLoopMs", "c", "(J)I", "Ll/kr0;", "J", "_loopDurationMs", "Companion", "animated-drawable_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public final class mfe implements u7j {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final kr0 animationInformation;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public long _loopDurationMs;

    public mfe(@NotNull kr0 kr0Var) {
        kr0Var.getClass();
        this.animationInformation = kr0Var;
        this._loopDurationMs = -1L;
    }

    @Override // p153l.u7j
    /* JADX INFO: renamed from: a */
    public long mo158166a(long animationTimeMs) {
        long jM158169d = m158169d();
        long jMo143073g = 0;
        if (jM158169d == 0) {
            return -1L;
        }
        if (!m158170e() && animationTimeMs / jM158169d >= this.animationInformation.getLoopCount()) {
            return -1L;
        }
        long j = animationTimeMs % jM158169d;
        int frameCount = this.animationInformation.getFrameCount();
        for (int i = 0; i < frameCount && jMo143073g <= j; i++) {
            jMo143073g += (long) this.animationInformation.mo143073g(i);
        }
        return animationTimeMs + (jMo143073g - j);
    }

    @Override // p153l.u7j
    /* JADX INFO: renamed from: b */
    public int mo158167b(long animationTimeMs, long lastFrameTimeMs) {
        long jM158169d = m158169d();
        if (jM158169d == 0) {
            return m158168c(0L);
        }
        if (m158170e() || animationTimeMs / jM158169d < this.animationInformation.getLoopCount()) {
            return m158168c(animationTimeMs % jM158169d);
        }
        return -1;
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: c */
    public final int m158168c(long timeInCurrentLoopMs) {
        int i = 0;
        long jMo143073g = 0;
        while (true) {
            jMo143073g += (long) this.animationInformation.mo143073g(i);
            int i2 = i + 1;
            if (timeInCurrentLoopMs < jMo143073g) {
                return i;
            }
            i = i2;
        }
    }

    /* JADX INFO: renamed from: d */
    public long m158169d() {
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
            this._loopDurationMs = j2 + ((long) this.animationInformation.mo143073g(i));
            i++;
        }
    }

    /* JADX INFO: renamed from: e */
    public boolean m158170e() {
        return this.animationInformation.getLoopCount() == 0;
    }
}
