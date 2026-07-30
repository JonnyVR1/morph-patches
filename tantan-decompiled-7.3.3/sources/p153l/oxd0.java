package p153l;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes7.dex */
public class oxd0 {

    /* JADX INFO: renamed from: a */
    public byte[] f149638a;

    /* JADX INFO: renamed from: b */
    public ByteBuffer f149639b;

    /* JADX INFO: renamed from: c */
    public long f149640c;

    /* JADX INFO: renamed from: d */
    public String f149641d;

    /* JADX INFO: renamed from: e */
    public int f149642e;

    /* JADX INFO: renamed from: f */
    public int f149643f;

    /* JADX INFO: renamed from: g */
    private boolean f149644g;

    public oxd0(byte[] bArr, long j, int i) {
        this.f149639b = null;
        this.f149640c = 0L;
        this.f149641d = null;
        this.f149642e = 0;
        this.f149643f = 2;
        this.f149644g = true;
        this.f149638a = bArr;
        this.f149639b = ByteBuffer.wrap(bArr);
        this.f149643f = i;
        this.f149640c = j;
        if (bArr != null) {
            this.f149642e = bArr.length;
        }
    }

    /* JADX INFO: renamed from: a */
    public boolean m169685a() {
        return this.f149644g;
    }

    /* JADX INFO: renamed from: b */
    public ByteBuffer m169686b() {
        return this.f149639b;
    }

    /* JADX INFO: renamed from: c */
    public byte[] m169687c() {
        return this.f149638a;
    }

    /* JADX INFO: renamed from: d */
    public long m169688d() {
        return this.f149640c;
    }

    /* JADX INFO: renamed from: e */
    public int m169689e() {
        return this.f149642e;
    }

    /* JADX INFO: renamed from: f */
    public void m169690f() {
        this.f149642e = 0;
        this.f149638a = null;
        this.f149639b = null;
        this.f149640c = 0L;
        this.f149641d = null;
    }

    /* JADX INFO: renamed from: g */
    public void m169691g(boolean z) {
        this.f149644g = z;
    }

    public oxd0(ByteBuffer byteBuffer, long j, int i) {
        this.f149638a = null;
        this.f149641d = null;
        this.f149642e = 0;
        this.f149644g = true;
        this.f149639b = byteBuffer;
        this.f149640c = j;
        this.f149643f = i;
        byte[] bArrArray = byteBuffer.array();
        this.f149638a = bArrArray;
        if (bArrArray != null) {
            this.f149642e = this.f149639b.limit();
        }
    }

    public oxd0() {
        this.f149639b = null;
        this.f149643f = 2;
        this.f149644g = true;
        this.f149642e = 0;
        this.f149638a = new byte[0];
        this.f149640c = 0L;
        this.f149641d = null;
    }
}
