package kotlin.internal;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.PublishedApi;
import p149l.ig3;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000\u0010\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\n\u001a\u001f\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a'\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0001\u0010\t\u001a'\u0010\u0002\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0002\u0010\n\u001a'\u0010\b\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\b\u0010\t\u001a'\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0005H\u0001¢\u0006\u0004\b\u000e\u0010\n¨\u0006\u000f"}, m87232d2 = {"", "a", "b", "e", "(II)I", "", "f", "(JJ)J", "c", "(III)I", "(JJJ)J", "start", "end", "step", Constants.INAPP_DATA_TAG, "kotlin-stdlib"}, m87233k = 2, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class ProgressionUtilKt {
    /* JADX INFO: renamed from: a */
    public static final int m87389a(int i, int i2, int i3) {
        return m87393e(m87393e(i, i3) - m87393e(i2, i3), i3);
    }

    /* JADX INFO: renamed from: b */
    public static final long m87390b(long j, long j2, long j3) {
        return m87394f(m87394f(j, j3) - m87394f(j2, j3), j3);
    }

    @PublishedApi
    /* JADX INFO: renamed from: c */
    public static final int m87391c(int i, int i2, int i3) {
        if (i3 > 0) {
            if (i < i2) {
                return i2 - m87389a(i2, i, i3);
            }
        } else {
            if (i3 >= 0) {
                ig3.m135964a("Step is zero.");
                return 0;
            }
            if (i > i2) {
                return i2 + m87389a(i, i2, -i3);
            }
        }
        return i2;
    }

    @PublishedApi
    /* JADX INFO: renamed from: d */
    public static final long m87392d(long j, long j2, long j3) {
        if (j3 > 0) {
            return j >= j2 ? j2 : j2 - m87390b(j2, j, j3);
        }
        if (j3 < 0) {
            return j <= j2 ? j2 : j2 + m87390b(j, j2, -j3);
        }
        ig3.m135964a("Step is zero.");
        return 0L;
    }

    /* JADX INFO: renamed from: e */
    public static final int m87393e(int i, int i2) {
        int i3 = i % i2;
        return i3 >= 0 ? i3 : i3 + i2;
    }

    /* JADX INFO: renamed from: f */
    public static final long m87394f(long j, long j2) {
        long j3 = j % j2;
        return j3 >= 0 ? j3 : j3 + j2;
    }
}
