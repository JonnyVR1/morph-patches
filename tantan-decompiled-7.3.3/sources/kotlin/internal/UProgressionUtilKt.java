package kotlin.internal;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.UInt;
import kotlin.ULong;
import p153l.aqj0;
import p153l.wg3;
import p153l.zpj0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\u001a'\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0001\u0010\u0004\u001a'\u0010\u0002\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0002\u0010\u0006\u001a'\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\tH\u0001¢\u0006\u0004\b\u000b\u0010\u0004\u001a'\u0010\u0003\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\fH\u0001¢\u0006\u0004\b\u0003\u0010\u0006¨\u0006\r"}, m88121d2 = {"Lkotlin/UInt;", "a", "b", "c", "(III)I", "Lkotlin/ULong;", "(JJJ)J", "start", "end", "", "step", Constants.INAPP_DATA_TAG, "", "kotlin-stdlib"}, m88122k = 2, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class UProgressionUtilKt {
    /* JADX INFO: renamed from: a */
    public static final int m88284a(int i, int i2, int i3) {
        int iM220848a = zpj0.m220848a(i, i3);
        int iM220848a2 = zpj0.m220848a(i2, i3);
        int iCompare = Integer.compare(iM220848a ^ Integer.MIN_VALUE, iM220848a2 ^ Integer.MIN_VALUE);
        int iM88154b = UInt.m88154b(iM220848a - iM220848a2);
        return iCompare >= 0 ? iM88154b : UInt.m88154b(iM88154b + i3);
    }

    /* JADX INFO: renamed from: b */
    public static final long m88285b(long j, long j2, long j3) {
        long jM99489a = aqj0.m99489a(j, j3);
        long jM99489a2 = aqj0.m99489a(j2, j3);
        int iCompare = Long.compare(jM99489a ^ Long.MIN_VALUE, jM99489a2 ^ Long.MIN_VALUE);
        long jM88177b = ULong.m88177b(jM99489a - jM99489a2);
        return iCompare >= 0 ? jM88177b : ULong.m88177b(jM88177b + j3);
    }

    @SinceKotlin
    @PublishedApi
    /* JADX INFO: renamed from: c */
    public static final long m88286c(long j, long j2, long j3) {
        if (j3 > 0) {
            return Long.compare(j ^ Long.MIN_VALUE, j2 ^ Long.MIN_VALUE) >= 0 ? j2 : ULong.m88177b(j2 - m88285b(j2, j, ULong.m88177b(j3)));
        }
        if (j3 < 0) {
            return Long.compare(j ^ Long.MIN_VALUE, j2 ^ Long.MIN_VALUE) <= 0 ? j2 : ULong.m88177b(j2 + m88285b(j, j2, ULong.m88177b(-j3)));
        }
        wg3.m206174a("Step is zero.");
        return 0L;
    }

    @SinceKotlin
    @PublishedApi
    /* JADX INFO: renamed from: d */
    public static final int m88287d(int i, int i2, int i3) {
        if (i3 > 0) {
            if (Integer.compare(i ^ Integer.MIN_VALUE, i2 ^ Integer.MIN_VALUE) < 0) {
                return UInt.m88154b(i2 - m88284a(i2, i, UInt.m88154b(i3)));
            }
        } else {
            if (i3 >= 0) {
                wg3.m206174a("Step is zero.");
                return 0;
            }
            if (Integer.compare(i ^ Integer.MIN_VALUE, i2 ^ Integer.MIN_VALUE) > 0) {
                return UInt.m88154b(i2 + m88284a(i, i2, UInt.m88154b(-i3)));
            }
        }
        return i2;
    }
}
