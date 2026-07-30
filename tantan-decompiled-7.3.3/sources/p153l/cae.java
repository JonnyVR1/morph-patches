package p153l;

import com.p051p1.mobile.putong.data.StudentVerRejectedReason;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000e\u001a\u0004\b\b\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m88121d2 = {"Ll/cae;", "", "", "isDownloading", "", StudentVerRejectedReason.startTime, "<init>", "(ZJ)V", "a", "Z", "b", "()Z", "setDownloading", "(Z)V", "J", "()J", "setStartTime", "(J)V", "FEP_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public final class cae {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private boolean isDownloading;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private long startTime;

    public cae(boolean z, long j) {
        this.isDownloading = z;
        this.startTime = j;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getStartTime() {
        return this.startTime;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getIsDownloading() {
        return this.isDownloading;
    }
}
