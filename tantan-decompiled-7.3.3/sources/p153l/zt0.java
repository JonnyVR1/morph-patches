package p153l;

import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0015\u0018\u00002\u00020\u0001BC\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0010\u001a\u0004\b\u001a\u0010\u0012\"\u0004\b\u001b\u0010\u0014R\"\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0010\u001a\u0004\b\u000f\u0010\u0012\"\u0004\b\u001d\u0010\u0014R\"\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0010\u001a\u0004\b\u001c\u0010\u0012\"\u0004\b\u001e\u0010\u0014R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u0010\u001a\u0004\b\u001f\u0010\u0012\"\u0004\b \u0010\u0014¨\u0006!"}, m88121d2 = {"Ll/zt0;", "", "", "enable", "", "sampleInterval", "fpsEnable", "cpuEnable", "memEnable", "tempEnable", "<init>", "(ZJZZZZ)V", "", "toString", "()Ljava/lang/String;", "a", "Z", "b", "()Z", "h", "(Z)V", "J", "e", "()J", "k", "(J)V", "c", RXScreenCaptureService.KEY_INDEX, Constants.INAPP_DATA_TAG, "g", "j", "f", BLiveStormDanmakuGiftResourceType.f45292l, "apm-tracer_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public final class zt0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private volatile boolean enable;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private long sampleInterval;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private boolean fpsEnable;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private boolean cpuEnable;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private boolean memEnable;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private boolean tempEnable;

    public /* synthetic */ zt0(boolean z, long j, boolean z2, boolean z3, boolean z4, boolean z5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? 2000L : j, (i & 4) != 0 ? true : z2, (i & 8) != 0 ? true : z3, (i & 16) != 0 ? true : z4, (i & 32) != 0 ? true : z5);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getCpuEnable() {
        return this.cpuEnable;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getEnable() {
        return this.enable;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getFpsEnable() {
        return this.fpsEnable;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getMemEnable() {
        return this.memEnable;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final long getSampleInterval() {
        return this.sampleInterval;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getTempEnable() {
        return this.tempEnable;
    }

    /* JADX INFO: renamed from: g */
    public final void m221374g(boolean z) {
        this.cpuEnable = z;
    }

    /* JADX INFO: renamed from: h */
    public final void m221375h(boolean z) {
        this.enable = z;
    }

    /* JADX INFO: renamed from: i */
    public final void m221376i(boolean z) {
        this.fpsEnable = z;
    }

    /* JADX INFO: renamed from: j */
    public final void m221377j(boolean z) {
        this.memEnable = z;
    }

    /* JADX INFO: renamed from: k */
    public final void m221378k(long j) {
        this.sampleInterval = j;
    }

    /* JADX INFO: renamed from: l */
    public final void m221379l(boolean z) {
        this.tempEnable = z;
    }

    @NotNull
    public String toString() {
        return "(enable=" + this.enable + ", sampleInterval=" + this.sampleInterval + ", fpsEnable=" + this.fpsEnable + ", cpuEnable=" + this.cpuEnable + ", memEnable=" + this.memEnable + ", tempEnable=" + this.tempEnable + ')';
    }

    public zt0(boolean z, long j, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.enable = z;
        this.sampleInterval = j;
        this.fpsEnable = z2;
        this.cpuEnable = z3;
        this.memEnable = z4;
        this.tempEnable = z5;
    }

    public zt0() {
        this(false, 0L, false, false, false, false, 63, null);
    }
}
