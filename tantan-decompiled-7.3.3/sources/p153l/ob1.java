package p153l;

import com.core.glcore.util.ErrorCode;
import com.cosmos.mdlog.MDLog;
import com.immomo.moment.mediautils.AbstractC3987b;
import com.immomo.moment.mediautils.C3986a;
import com.immomo.moment.mediautils.C3988c;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes7.dex */
public class ob1 extends bc1 {

    /* JADX INFO: renamed from: e */
    private AbstractC3987b f145808e;

    /* JADX INFO: renamed from: g */
    private ByteBuffer f145810g;

    /* JADX INFO: renamed from: h */
    private ByteBuffer f145811h;

    /* JADX INFO: renamed from: n */
    byte[] f145817n;

    /* JADX INFO: renamed from: o */
    byte[] f145818o;

    /* JADX INFO: renamed from: p */
    private String f145819p;

    /* JADX INFO: renamed from: d */
    private String f145807d = "AudioMixerProcessor";

    /* JADX INFO: renamed from: f */
    private boolean f145809f = false;

    /* JADX INFO: renamed from: i */
    private float f145812i = 1.8f;

    /* JADX INFO: renamed from: j */
    private float f145813j = 0.4f;

    /* JADX INFO: renamed from: k */
    private Object f145814k = new Object();

    /* JADX INFO: renamed from: l */
    private long f145815l = 0;

    /* JADX INFO: renamed from: m */
    private long f145816m = 0;

    /* JADX INFO: renamed from: q */
    private spw f145820q = null;

    /* JADX INFO: renamed from: l.ob1$a */
    public class C19071a implements jpw {
        public C19071a() {
        }

        @Override // p153l.jpw
        /* JADX INFO: renamed from: a */
        public void mo115360a(int i, int i2, String str) {
            if (ob1.this.f145820q != null) {
                ob1.this.f145820q.onFail(ErrorCode.EDIT_AUDIOMIX_FAILED, "Audio Decode failed when audio mix!!! what:" + i + " errorCode:" + i2 + " msg:" + str);
            }
            MDLog.m7445e(ob1.this.f145807d, "Audio Decode failed when audio mix !!!" + str);
        }
    }

    /* JADX INFO: renamed from: g */
    private ByteBuffer m166906g(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, int i) {
        if (byteBuffer == null || byteBuffer2 == null || i == 0) {
            return null;
        }
        byte[] bArr = this.f145817n;
        if (bArr == null || bArr.length < i) {
            this.f145817n = new byte[i];
        }
        byte[] bArr2 = this.f145818o;
        if (bArr2 == null || bArr2.length < i) {
            this.f145818o = new byte[i];
        }
        byte[] bArr3 = this.f145817n;
        byte[] bArr4 = this.f145818o;
        byteBuffer.get(bArr3, 0, i);
        byteBuffer2.get(bArr4, 0, i);
        for (int i2 = 0; i2 < i / 2; i2++) {
            int i3 = i2 * 2;
            int i4 = i3 + 1;
            short s = (short) (((short) (((short) (((bArr3[i4] << 8) & 65280) | (bArr3[i3] & 255))) * this.f145812i)) + ((short) (((short) (((bArr4[i4] << 8) & 65280) | (bArr4[i3] & 255))) * this.f145813j)));
            bArr3[i4] = (byte) ((s >> 8) & 255);
            bArr3[i3] = (byte) (s & 255);
        }
        byteBuffer.clear();
        byteBuffer.put(bArr3);
        byteBuffer.rewind();
        return byteBuffer;
    }

    @Override // p153l.bc1
    /* JADX INFO: renamed from: b */
    public synchronized ad60 mo103472b(ad60 ad60Var, int i, long j) {
        try {
            ByteBuffer byteBuffer = this.f145810g;
            if (byteBuffer == null || i > byteBuffer.capacity()) {
                this.f145810g = ByteBuffer.allocate(i);
            }
            ByteBuffer byteBuffer2 = this.f145811h;
            if (byteBuffer2 == null || i > byteBuffer2.capacity()) {
                this.f145811h = ByteBuffer.allocate(i);
            }
            ByteBuffer byteBufferM97015a = ad60Var.m97015a();
            byteBufferM97015a.position(0);
            byteBufferM97015a.get(this.f145810g.array(), 0, i);
            AbstractC3987b abstractC3987b = this.f145808e;
            if (abstractC3987b != null) {
                abstractC3987b.mo19671b(this.f145811h, i);
            }
            this.f145811h.position(0);
            this.f145810g.position(0);
            m166906g(this.f145810g, this.f145811h, i);
            ad60Var.m97019e(this.f145810g);
        } catch (Throwable th) {
            throw th;
        }
        return ad60Var;
    }

    @Override // p153l.bc1
    /* JADX INFO: renamed from: c */
    public synchronized boolean mo103473c() throws Throwable {
        try {
            try {
                m166909j();
                return m166907h(this.f145819p, this.f145815l, this.f145816m);
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    /* JADX INFO: renamed from: h */
    public boolean m166907h(String str, long j, long j2) {
        synchronized (this.f145814k) {
            try {
                this.f145819p = str;
                this.f145815l = j;
                this.f145816m = j2;
                if (this.f145808e == null) {
                    this.f145808e = this.f145809f ? new C3988c() : new C3986a();
                }
                this.f145808e.m19684l(new C19071a());
                this.f145808e.mo19676g(j, j2 - j);
                this.f145808e.mo19675f(true);
                this.f145808e.mo19677k(this.f76086a, this.f76088c, this.f76087b);
                boolean zMo19674e = this.f145808e.mo19674e(str);
                if (!zMo19674e) {
                    return zMo19674e;
                }
                this.f145808e.mo19678m();
                return zMo19674e;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public boolean m166908i(String str, long j, long j2, long j3) {
        synchronized (this.f145814k) {
            try {
                this.f145819p = str;
                this.f145815l = j;
                this.f145816m = j2;
                if (this.f145808e == null) {
                    this.f145808e = this.f145809f ? new C3988c() : new C3986a();
                }
                this.f145808e.mo19676g(j, j2 - j);
                this.f145808e.mo19675f(true);
                this.f145808e.mo19677k(this.f76086a, this.f76088c, this.f76087b);
                boolean zMo19674e = this.f145808e.mo19674e(str);
                if (!zMo19674e) {
                    return zMo19674e;
                }
                this.f145808e.mo19678m();
                this.f145808e.mo19673d(j3 * 1000);
                return zMo19674e;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public synchronized void m166909j() {
        synchronized (this.f145814k) {
            try {
                AbstractC3987b abstractC3987b = this.f145808e;
                if (abstractC3987b != null) {
                    abstractC3987b.mo19672c();
                    this.f145808e = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public synchronized boolean m166910k(long j) throws Throwable {
        try {
            try {
                m166909j();
                if (j > 0) {
                    long j2 = this.f145815l;
                    long j3 = this.f145816m;
                    if (j2 != j3) {
                        return m166908i(this.f145819p, j2, j3, (j % (j3 - j2)) + j2);
                    }
                }
                return m166907h(this.f145819p, this.f145815l, this.f145816m);
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    /* JADX INFO: renamed from: l */
    public void m166911l(spw spwVar) {
        this.f145820q = spwVar;
    }

    /* JADX INFO: renamed from: m */
    public void m166912m(float f, float f2) {
        this.f145812i = f;
        this.f145813j = f2;
    }

    /* JADX INFO: renamed from: n */
    public void m166913n(float f) {
        this.f145813j = f;
    }

    /* JADX INFO: renamed from: o */
    public synchronized void m166914o(boolean z) {
        try {
            MDLog.m7443d(this.f145807d, "AudioDecoderType:".concat(z ? "Soft" : "Hard"));
            this.f145809f = z;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: p */
    public void m166915p(float f) {
        this.f145812i = f;
    }
}
