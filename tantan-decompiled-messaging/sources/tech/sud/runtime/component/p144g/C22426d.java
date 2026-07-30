package tech.sud.runtime.component.p144g;

import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;

/* JADX INFO: renamed from: tech.sud.runtime.component.g.d */
/* JADX INFO: loaded from: classes3.dex */
public class C22426d {

    /* JADX INFO: renamed from: a */
    private final byte[] f207759a;

    /* JADX INFO: renamed from: b */
    private long f207760b;

    /* JADX INFO: renamed from: c */
    private long f207761c;

    public C22426d(long j, long j2) {
        this.f207759a = new byte[4];
        this.f207760b = j;
        this.f207761c = j2;
    }

    /* JADX INFO: renamed from: a */
    public String m221831a(C22424b c22424b) {
        this.f207759a[0] = c22424b.m221820b();
        this.f207759a[1] = c22424b.m221820b();
        this.f207759a[2] = c22424b.m221820b();
        this.f207759a[3] = c22424b.m221820b();
        c22424b.m221821b(4L);
        this.f207760b = c22424b.m221824e();
        this.f207761c = c22424b.m221824e();
        return new String(this.f207759a, "ISO-8859-1");
    }

    public String toString() {
        return "Read dir tab [" + ((int) this.f207759a[0]) + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + ((int) this.f207759a[1]) + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + ((int) this.f207759a[2]) + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + ((int) this.f207759a[3]) + "] offset: " + this.f207760b + " bytesToUpload: " + this.f207761c + " name: " + this.f207759a;
    }

    public C22426d() {
        this.f207759a = new byte[4];
    }

    /* JADX INFO: renamed from: a */
    public long m221830a() {
        return this.f207760b;
    }
}
