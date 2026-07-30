package p153l;

import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes6.dex */
public final class pbs0 {

    /* JADX INFO: renamed from: a */
    public final String f151417a;

    /* JADX INFO: renamed from: b */
    public final String f151418b;

    /* JADX INFO: renamed from: c */
    public final long f151419c;

    /* JADX INFO: renamed from: d */
    public final long f151420d;

    /* JADX INFO: renamed from: e */
    public final long f151421e;

    /* JADX INFO: renamed from: f */
    public final long f151422f;

    /* JADX INFO: renamed from: g */
    public final long f151423g;

    /* JADX INFO: renamed from: h */
    public final Long f151424h;

    /* JADX INFO: renamed from: i */
    public final Long f151425i;

    /* JADX INFO: renamed from: j */
    public final Long f151426j;

    /* JADX INFO: renamed from: k */
    public final Boolean f151427k;

    public pbs0(String str, String str2, long j, long j2, long j3, long j4, long j5, Long l2, Long l3, Long l4, Boolean bool) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkArgument(j >= 0);
        Preconditions.checkArgument(j2 >= 0);
        Preconditions.checkArgument(j3 >= 0);
        Preconditions.checkArgument(j5 >= 0);
        this.f151417a = str;
        this.f151418b = str2;
        this.f151419c = j;
        this.f151420d = j2;
        this.f151421e = j3;
        this.f151422f = j4;
        this.f151423g = j5;
        this.f151424h = l2;
        this.f151425i = l3;
        this.f151426j = l4;
        this.f151427k = bool;
    }

    /* JADX INFO: renamed from: a */
    public final pbs0 m171529a(long j) {
        return new pbs0(this.f151417a, this.f151418b, this.f151419c, this.f151420d, this.f151421e, j, this.f151423g, this.f151424h, this.f151425i, this.f151426j, this.f151427k);
    }

    /* JADX INFO: renamed from: b */
    public final pbs0 m171530b(long j, long j2) {
        return new pbs0(this.f151417a, this.f151418b, this.f151419c, this.f151420d, this.f151421e, this.f151422f, j, Long.valueOf(j2), this.f151425i, this.f151426j, this.f151427k);
    }

    /* JADX INFO: renamed from: c */
    public final pbs0 m171531c(Long l2, Long l3, Boolean bool) {
        return new pbs0(this.f151417a, this.f151418b, this.f151419c, this.f151420d, this.f151421e, this.f151422f, this.f151423g, this.f151424h, l2, l3, (bool == null || bool.booleanValue()) ? bool : null);
    }

    public pbs0(String str, String str2, long j, long j2, long j3, long j4, Long l2, Long l3, Long l4, Boolean bool) {
        this(str, str2, 0L, 0L, 0L, j3, 0L, null, null, null, null);
    }
}
