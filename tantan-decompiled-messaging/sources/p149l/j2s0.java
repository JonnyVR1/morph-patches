package p149l;

import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes6.dex */
public final class j2s0 {

    /* JADX INFO: renamed from: a */
    public final String f115951a;

    /* JADX INFO: renamed from: b */
    public final String f115952b;

    /* JADX INFO: renamed from: c */
    public final long f115953c;

    /* JADX INFO: renamed from: d */
    public final long f115954d;

    /* JADX INFO: renamed from: e */
    public final long f115955e;

    /* JADX INFO: renamed from: f */
    public final long f115956f;

    /* JADX INFO: renamed from: g */
    public final long f115957g;

    /* JADX INFO: renamed from: h */
    public final Long f115958h;

    /* JADX INFO: renamed from: i */
    public final Long f115959i;

    /* JADX INFO: renamed from: j */
    public final Long f115960j;

    /* JADX INFO: renamed from: k */
    public final Boolean f115961k;

    public j2s0(String str, String str2, long j, long j2, long j3, long j4, long j5, Long l2, Long l3, Long l4, Boolean bool) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkArgument(j >= 0);
        Preconditions.checkArgument(j2 >= 0);
        Preconditions.checkArgument(j3 >= 0);
        Preconditions.checkArgument(j5 >= 0);
        this.f115951a = str;
        this.f115952b = str2;
        this.f115953c = j;
        this.f115954d = j2;
        this.f115955e = j3;
        this.f115956f = j4;
        this.f115957g = j5;
        this.f115958h = l2;
        this.f115959i = l3;
        this.f115960j = l4;
        this.f115961k = bool;
    }

    /* JADX INFO: renamed from: a */
    public final j2s0 m139493a(long j) {
        return new j2s0(this.f115951a, this.f115952b, this.f115953c, this.f115954d, this.f115955e, j, this.f115957g, this.f115958h, this.f115959i, this.f115960j, this.f115961k);
    }

    /* JADX INFO: renamed from: b */
    public final j2s0 m139494b(long j, long j2) {
        return new j2s0(this.f115951a, this.f115952b, this.f115953c, this.f115954d, this.f115955e, this.f115956f, j, Long.valueOf(j2), this.f115959i, this.f115960j, this.f115961k);
    }

    /* JADX INFO: renamed from: c */
    public final j2s0 m139495c(Long l2, Long l3, Boolean bool) {
        return new j2s0(this.f115951a, this.f115952b, this.f115953c, this.f115954d, this.f115955e, this.f115956f, this.f115957g, this.f115958h, l2, l3, (bool == null || bool.booleanValue()) ? bool : null);
    }

    public j2s0(String str, String str2, long j, long j2, long j3, long j4, Long l2, Long l3, Long l4, Boolean bool) {
        this(str, str2, 0L, 0L, 0L, j3, 0L, null, null, null, null);
    }
}
