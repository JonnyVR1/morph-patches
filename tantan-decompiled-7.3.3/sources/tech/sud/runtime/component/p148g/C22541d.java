package tech.sud.runtime.component.p148g;

import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;

/* JADX INFO: renamed from: tech.sud.runtime.component.g.d */
/* JADX INFO: loaded from: classes3.dex */
public class C22541d {

    /* JADX INFO: renamed from: a */
    private final byte[] f208681a;

    /* JADX INFO: renamed from: b */
    private long f208682b;

    /* JADX INFO: renamed from: c */
    private long f208683c;

    public C22541d(long j, long j2) {
        this.f208681a = new byte[4];
        this.f208682b = j;
        this.f208683c = j2;
    }

    /* JADX INFO: renamed from: a */
    public String m223077a(C22539b c22539b) {
        this.f208681a[0] = c22539b.m223066b();
        this.f208681a[1] = c22539b.m223066b();
        this.f208681a[2] = c22539b.m223066b();
        this.f208681a[3] = c22539b.m223066b();
        c22539b.m223067b(4L);
        this.f208682b = c22539b.m223070e();
        this.f208683c = c22539b.m223070e();
        return new String(this.f208681a, "ISO-8859-1");
    }

    public String toString() {
        return "Read dir tab [" + ((int) this.f208681a[0]) + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + ((int) this.f208681a[1]) + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + ((int) this.f208681a[2]) + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + ((int) this.f208681a[3]) + "] offset: " + this.f208682b + " bytesToUpload: " + this.f208683c + " name: " + this.f208681a;
    }

    public C22541d() {
        this.f208681a = new byte[4];
    }

    /* JADX INFO: renamed from: a */
    public long m223076a() {
        return this.f208682b;
    }
}
