package kotlin.internal;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.UInt;
import kotlin.ULong;
import p149l.ig3;
import p149l.wgj0;
import p149l.xgj0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\u001a'\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0001\u0010\u0004\u001a'\u0010\u0002\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0002\u0010\u0006\u001a'\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\tH\u0001¢\u0006\u0004\b\u000b\u0010\u0004\u001a'\u0010\u0003\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\fH\u0001¢\u0006\u0004\b\u0003\u0010\u0006¨\u0006\r"}, m87232d2 = {"Lkotlin/UInt;", "a", "b", "c", "(III)I", "Lkotlin/ULong;", "(JJJ)J", "start", "end", "", "step", Constants.INAPP_DATA_TAG, "", "kotlin-stdlib"}, m87233k = 2, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class UProgressionUtilKt {
    /* JADX INFO: renamed from: a */
    public static final int m87395a(int i, int i2, int i3) {
        int iM203059a = wgj0.m203059a(i, i3);
        int iM203059a2 = wgj0.m203059a(i2, i3);
        int iCompare = Integer.compare(iM203059a ^ Integer.MIN_VALUE, iM203059a2 ^ Integer.MIN_VALUE);
        int iM87265b = UInt.m87265b(iM203059a - iM203059a2);
        return iCompare >= 0 ? iM87265b : UInt.m87265b(iM87265b + i3);
    }

    /* JADX INFO: renamed from: b */
    public static final long m87396b(long j, long j2, long j3) {
        long jM208681a = xgj0.m208681a(j, j3);
        long jM208681a2 = xgj0.m208681a(j2, j3);
        int iCompare = Long.compare(jM208681a ^ Long.MIN_VALUE, jM208681a2 ^ Long.MIN_VALUE);
        long jM87288b = ULong.m87288b(jM208681a - jM208681a2);
        return iCompare >= 0 ? jM87288b : ULong.m87288b(jM87288b + j3);
    }

    @SinceKotlin
    @PublishedApi
    /* JADX INFO: renamed from: c */
    public static final long m87397c(long j, long j2, long j3) {
        if (j3 > 0) {
            return Long.compare(j ^ Long.MIN_VALUE, j2 ^ Long.MIN_VALUE) >= 0 ? j2 : ULong.m87288b(j2 - m87396b(j2, j, ULong.m87288b(j3)));
        }
        if (j3 < 0) {
            return Long.compare(j ^ Long.MIN_VALUE, j2 ^ Long.MIN_VALUE) <= 0 ? j2 : ULong.m87288b(j2 + m87396b(j, j2, ULong.m87288b(-j3)));
        }
        ig3.m135964a("Step is zero.");
        return 0L;
    }

    @SinceKotlin
    @PublishedApi
    /* JADX INFO: renamed from: d */
    public static final int m87398d(int i, int i2, int i3) {
        if (i3 > 0) {
            if (Integer.compare(i ^ Integer.MIN_VALUE, i2 ^ Integer.MIN_VALUE) < 0) {
                return UInt.m87265b(i2 - m87395a(i2, i, UInt.m87265b(i3)));
            }
        } else {
            if (i3 >= 0) {
                ig3.m135964a("Step is zero.");
                return 0;
            }
            if (Integer.compare(i ^ Integer.MIN_VALUE, i2 ^ Integer.MIN_VALUE) > 0) {
                return UInt.m87265b(i2 + m87395a(i, i2, UInt.m87265b(-i3)));
            }
        }
        return i2;
    }
}
