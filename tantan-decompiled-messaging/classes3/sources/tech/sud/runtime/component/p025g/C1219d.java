package tech.sud.runtime.component.p025g;

/* JADX INFO: renamed from: tech.sud.runtime.component.g.d */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class C1219d {

    /* JADX INFO: renamed from: a */
    private final byte[] f11384a;

    /* JADX INFO: renamed from: b */
    private long f11385b;

    /* JADX INFO: renamed from: c */
    private long f11386c;

    public C1219d(long j, long j2) {
        this.f11384a = new byte[4];
        this.f11385b = j;
        this.f11386c = j2;
    }

    /* JADX INFO: renamed from: a */
    public String m10302a(C1217b c1217b) {
        this.f11384a[0] = c1217b.m10291b();
        this.f11384a[1] = c1217b.m10291b();
        this.f11384a[2] = c1217b.m10291b();
        this.f11384a[3] = c1217b.m10291b();
        c1217b.m10292b(4L);
        this.f11385b = c1217b.m10295e();
        this.f11386c = c1217b.m10295e();
        return new String(this.f11384a, "ISO-8859-1");
    }

    public String toString() {
        return "Read dir tab [" + ((int) this.f11384a[0]) + " " + ((int) this.f11384a[1]) + " " + ((int) this.f11384a[2]) + " " + ((int) this.f11384a[3]) + "] offset: " + this.f11385b + " bytesToUpload: " + this.f11386c + " name: " + this.f11384a;
    }

    public C1219d() {
        this.f11384a = new byte[4];
    }

    /* JADX INFO: renamed from: a */
    public long m10301a() {
        return this.f11385b;
    }
}
