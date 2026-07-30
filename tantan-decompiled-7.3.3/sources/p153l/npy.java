package p153l;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\f\u0018\u00002\u00020\u0001B;\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\rR\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\rR\u0014\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m88121d2 = {"Ll/npy;", "", "", "maxCacheSize", "maxCacheEntries", "maxEvictionQueueSize", "maxEvictionQueueEntries", "maxCacheEntrySize", "", "paramsCheckIntervalMs", "<init>", "(IIIIIJ)V", "a", "I", "b", "c", Constants.INAPP_DATA_TAG, "e", "f", "J", "imagepipeline-base_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public final class npy {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @JvmField
    public final int maxCacheSize;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @JvmField
    public final int maxCacheEntries;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @JvmField
    public final int maxEvictionQueueSize;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @JvmField
    public final int maxEvictionQueueEntries;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @JvmField
    public final int maxCacheEntrySize;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @JvmField
    public final long paramsCheckIntervalMs;

    public /* synthetic */ npy(int i, int i2, int i3, int i4, int i5, long j, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, i3, i4, i5, (i6 & 32) != 0 ? 300000L : j);
    }

    @JvmOverloads
    public npy(int i, int i2, int i3, int i4, int i5, long j) {
        this.maxCacheSize = i;
        this.maxCacheEntries = i2;
        this.maxEvictionQueueSize = i3;
        this.maxEvictionQueueEntries = i4;
        this.maxCacheEntrySize = i5;
        this.paramsCheckIntervalMs = j;
    }

    @JvmOverloads
    public npy(int i, int i2, int i3, int i4, int i5) {
        this(i, i2, i3, i4, i5, 0L, 32, null);
    }
}
