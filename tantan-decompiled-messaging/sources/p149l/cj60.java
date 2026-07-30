package p149l;

import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m87231d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b)\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\u0006J\u000f\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\u0006J\u000f\u0010\r\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\u0006J\u000f\u0010\u000e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u0006J\u000f\u0010\u000f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\u0006J\u000f\u0010\u0010\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u0006J\u0015\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0011¢\u0006\u0004\b\u0017\u0010\u0015J\u0015\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u0011¢\u0006\u0004\b\u0019\u0010\u0015J\u0015\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u0011¢\u0006\u0004\b\u001b\u0010\u0015J%\u0010\u001f\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u0004¢\u0006\u0004\b\u001f\u0010 J%\u0010$\u001a\u00020\u00132\u0006\u0010!\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u0004¢\u0006\u0004\b$\u0010 J%\u0010(\u001a\u00020\u00132\u0006\u0010%\u001a\u00020\u00042\u0006\u0010&\u001a\u00020\u00042\u0006\u0010'\u001a\u00020\u0004¢\u0006\u0004\b(\u0010 J\u001d\u0010+\u001a\u00020\u00132\u0006\u0010)\u001a\u00020\u00072\u0006\u0010*\u001a\u00020\u0007¢\u0006\u0004\b+\u0010,J\r\u0010-\u001a\u00020\u0013¢\u0006\u0004\b-\u0010\u0003J\r\u0010.\u001a\u00020\u0013¢\u0006\u0004\b.\u0010\u0003R\u0016\u0010\u0012\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010/R\u0016\u0010\u0016\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010/R\u0016\u0010\u0018\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010/R\u0016\u0010\u001a\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010/R\u0016\u00101\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u00100R\u0016\u00102\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u00100R\u0016\u00103\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u00100R\u0016\u00104\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u00100R\u0016\u00105\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u00100R\u0016\u00106\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u00100R\u0016\u00108\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u00107R\u0016\u00109\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u00107R\u0016\u0010:\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u00100R\u0016\u0010;\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u00100R\u0016\u0010<\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u00100R\"\u0010@\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010>\u0012\u0004\u0012\u00020\u00010=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010?¨\u0006A"}, m87232d2 = {"Ll/cj60;", "", "<init>", "()V", "", "f", "()I", "", "b", "()F", "j", "h", "e", "g", Constants.INAPP_DATA_TAG, "c", RXScreenCaptureService.KEY_INDEX, "", "isFpsMonitor", "", "o", "(Z)V", "isMemMonitor", "p", "isCpuMonitor", "n", "isTempMonitor", "q", "pageFps", "avgFps", "deviceFps", "m", "(III)V", "memUsage", "totalMem", "freeMem", "r", "cpuTemp", "skinTemp", "batteryTemp", BLiveStormDanmakuGiftResourceType.f44446s, "cpuUsage", "totalCpuUsage", BLiveStormDanmakuGiftResourceType.f44444l, "(FF)V", "a", "k", "Z", "I", "mPageFps", "mPageAvgFps", "mDeviceFps", "mMemUsage", "mMemTotal", "mMemFree", "F", "mAppCpuUsage", "mTotalCpuUsage", "mCpuTemp", "mSkinTemp", "mBatteryTemp", "Ljava/util/concurrent/ConcurrentHashMap;", "", "Ljava/util/concurrent/ConcurrentHashMap;", "jankScenesMap", "apm-tracer_release"}, m87233k = 1, m87234mv = {1, 4, 0})
public final class cj60 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private boolean isFpsMonitor;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private boolean isMemMonitor;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private boolean isCpuMonitor;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private boolean isTempMonitor;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private int mPageFps;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private int mPageAvgFps;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private int mDeviceFps;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private int mMemUsage;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private int mMemTotal;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private int mMemFree;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private float mAppCpuUsage;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private float mTotalCpuUsage;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private int mCpuTemp;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private int mSkinTemp;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private int mBatteryTemp;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private final ConcurrentHashMap<String, Object> jankScenesMap = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: a */
    public final void m107110a() {
        this.jankScenesMap.clear();
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public float getMAppCpuUsage() {
        return this.mAppCpuUsage;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public int getMCpuTemp() {
        return this.mCpuTemp;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public int getMMemFree() {
        return this.mMemFree;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public int getMMemTotal() {
        return this.mMemTotal;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public int getMMemUsage() {
        return this.mMemUsage;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public int getMPageAvgFps() {
        return this.mPageAvgFps;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public int getMPageFps() {
        return this.mPageFps;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public int getMSkinTemp() {
        return this.mSkinTemp;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public float getMTotalCpuUsage() {
        return this.mTotalCpuUsage;
    }

    /* JADX INFO: renamed from: k */
    public final void m107120k() {
        m107110a();
        m107122m(0, 0, 0);
        m107127r(0, 0, 0);
        m107128s(0, 0, 0);
        m107121l(0.0f, 0.0f);
    }

    /* JADX INFO: renamed from: l */
    public final void m107121l(float cpuUsage, float totalCpuUsage) {
        if (this.isCpuMonitor) {
            this.mAppCpuUsage = cpuUsage;
            this.mTotalCpuUsage = totalCpuUsage;
        } else {
            this.mAppCpuUsage = 0.0f;
            this.mTotalCpuUsage = 0.0f;
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m107122m(int pageFps, int avgFps, int deviceFps) {
        if (!this.isFpsMonitor) {
            this.mPageFps = 0;
            this.mDeviceFps = 0;
        } else {
            this.mPageFps = pageFps;
            this.mPageAvgFps = avgFps;
            this.mDeviceFps = deviceFps;
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m107123n(boolean isCpuMonitor) {
        this.isCpuMonitor = isCpuMonitor;
    }

    /* JADX INFO: renamed from: o */
    public final void m107124o(boolean isFpsMonitor) {
        this.isFpsMonitor = isFpsMonitor;
    }

    /* JADX INFO: renamed from: p */
    public final void m107125p(boolean isMemMonitor) {
        this.isMemMonitor = isMemMonitor;
    }

    /* JADX INFO: renamed from: q */
    public final void m107126q(boolean isTempMonitor) {
        this.isTempMonitor = isTempMonitor;
    }

    /* JADX INFO: renamed from: r */
    public final void m107127r(int memUsage, int totalMem, int freeMem) {
        if (!this.isMemMonitor) {
            this.mMemUsage = 0;
            return;
        }
        this.mMemUsage = memUsage;
        this.mMemTotal = totalMem;
        this.mMemFree = freeMem;
    }

    /* JADX INFO: renamed from: s */
    public final void m107128s(int cpuTemp, int skinTemp, int batteryTemp) {
        if (this.isTempMonitor) {
            this.mCpuTemp = cpuTemp;
            this.mSkinTemp = skinTemp;
            this.mBatteryTemp = batteryTemp;
        } else {
            this.mCpuTemp = 0;
            this.mSkinTemp = 0;
            this.mBatteryTemp = 0;
        }
    }
}
