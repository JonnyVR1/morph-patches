package p149l;

import com.core.glcore.util.ErrorCode;
import com.cosmos.mdlog.MDLog;
import com.immomo.moment.mediautils.AbstractC3844b;
import com.immomo.moment.mediautils.C3843a;
import com.immomo.moment.mediautils.C3845c;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes7.dex */
public class hb1 extends ub1 {

    /* JADX INFO: renamed from: e */
    private AbstractC3844b f106860e;

    /* JADX INFO: renamed from: g */
    private ByteBuffer f106862g;

    /* JADX INFO: renamed from: h */
    private ByteBuffer f106863h;

    /* JADX INFO: renamed from: n */
    byte[] f106869n;

    /* JADX INFO: renamed from: o */
    byte[] f106870o;

    /* JADX INFO: renamed from: p */
    private String f106871p;

    /* JADX INFO: renamed from: d */
    private String f106859d = "AudioMixerProcessor";

    /* JADX INFO: renamed from: f */
    private boolean f106861f = false;

    /* JADX INFO: renamed from: i */
    private float f106864i = 1.8f;

    /* JADX INFO: renamed from: j */
    private float f106865j = 0.4f;

    /* JADX INFO: renamed from: k */
    private Object f106866k = new Object();

    /* JADX INFO: renamed from: l */
    private long f106867l = 0;

    /* JADX INFO: renamed from: m */
    private long f106868m = 0;

    /* JADX INFO: renamed from: q */
    private tmw f106872q = null;

    /* JADX INFO: renamed from: l.hb1$a */
    public class C17264a implements kmw {
        public C17264a() {
        }

        @Override // p149l.kmw
        /* JADX INFO: renamed from: a */
        public void mo130269a(int i, int i2, String str) {
            if (hb1.this.f106872q != null) {
                hb1.this.f106872q.onFail(ErrorCode.EDIT_AUDIOMIX_FAILED, "Audio Decode failed when audio mix!!! what:" + i + " errorCode:" + i2 + " msg:" + str);
            }
            MDLog.m7391e(hb1.this.f106859d, "Audio Decode failed when audio mix !!!" + str);
        }
    }

    /* JADX INFO: renamed from: g */
    private ByteBuffer m130257g(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, int i) {
        if (byteBuffer == null || byteBuffer2 == null || i == 0) {
            return null;
        }
        byte[] bArr = this.f106869n;
        if (bArr == null || bArr.length < i) {
            this.f106869n = new byte[i];
        }
        byte[] bArr2 = this.f106870o;
        if (bArr2 == null || bArr2.length < i) {
            this.f106870o = new byte[i];
        }
        byte[] bArr3 = this.f106869n;
        byte[] bArr4 = this.f106870o;
        byteBuffer.get(bArr3, 0, i);
        byteBuffer2.get(bArr4, 0, i);
        for (int i2 = 0; i2 < i / 2; i2++) {
            int i3 = i2 * 2;
            int i4 = i3 + 1;
            short s = (short) (((short) (((short) (((bArr3[i4] << 8) & 65280) | (bArr3[i3] & 255))) * this.f106864i)) + ((short) (((short) (((bArr4[i4] << 8) & 65280) | (bArr4[i3] & 255))) * this.f106865j)));
            bArr3[i4] = (byte) ((s >> 8) & 255);
            bArr3[i3] = (byte) (s & 255);
        }
        byteBuffer.clear();
        byteBuffer.put(bArr3);
        byteBuffer.rewind();
        return byteBuffer;
    }

    @Override // p149l.ub1
    /* JADX INFO: renamed from: b */
    public synchronized u460 mo130258b(u460 u460Var, int i, long j) {
        try {
            ByteBuffer byteBuffer = this.f106862g;
            if (byteBuffer == null || i > byteBuffer.capacity()) {
                this.f106862g = ByteBuffer.allocate(i);
            }
            ByteBuffer byteBuffer2 = this.f106863h;
            if (byteBuffer2 == null || i > byteBuffer2.capacity()) {
                this.f106863h = ByteBuffer.allocate(i);
            }
            ByteBuffer byteBufferM191672a = u460Var.m191672a();
            byteBufferM191672a.position(0);
            byteBufferM191672a.get(this.f106862g.array(), 0, i);
            AbstractC3844b abstractC3844b = this.f106860e;
            if (abstractC3844b != null) {
                abstractC3844b.mo18691b(this.f106863h, i);
            }
            this.f106863h.position(0);
            this.f106862g.position(0);
            m130257g(this.f106862g, this.f106863h, i);
            u460Var.m191676e(this.f106862g);
        } catch (Throwable th) {
            throw th;
        }
        return u460Var;
    }

    @Override // p149l.ub1
    /* JADX INFO: renamed from: c */
    public synchronized boolean mo130259c() throws Throwable {
        try {
            try {
                m130262j();
                return m130260h(this.f106871p, this.f106867l, this.f106868m);
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
    public boolean m130260h(String str, long j, long j2) {
        synchronized (this.f106866k) {
            try {
                this.f106871p = str;
                this.f106867l = j;
                this.f106868m = j2;
                if (this.f106860e == null) {
                    this.f106860e = this.f106861f ? new C3845c() : new C3843a();
                }
                this.f106860e.m18704l(new C17264a());
                this.f106860e.mo18696g(j, j2 - j);
                this.f106860e.mo18695f(true);
                this.f106860e.mo18697k(this.f175667a, this.f175669c, this.f175668b);
                boolean zMo18694e = this.f106860e.mo18694e(str);
                if (!zMo18694e) {
                    return zMo18694e;
                }
                this.f106860e.mo18698m();
                return zMo18694e;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public boolean m130261i(String str, long j, long j2, long j3) {
        synchronized (this.f106866k) {
            try {
                this.f106871p = str;
                this.f106867l = j;
                this.f106868m = j2;
                if (this.f106860e == null) {
                    this.f106860e = this.f106861f ? new C3845c() : new C3843a();
                }
                this.f106860e.mo18696g(j, j2 - j);
                this.f106860e.mo18695f(true);
                this.f106860e.mo18697k(this.f175667a, this.f175669c, this.f175668b);
                boolean zMo18694e = this.f106860e.mo18694e(str);
                if (!zMo18694e) {
                    return zMo18694e;
                }
                this.f106860e.mo18698m();
                this.f106860e.mo18693d(j3 * 1000);
                return zMo18694e;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public synchronized void m130262j() {
        synchronized (this.f106866k) {
            try {
                AbstractC3844b abstractC3844b = this.f106860e;
                if (abstractC3844b != null) {
                    abstractC3844b.mo18692c();
                    this.f106860e = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public synchronized boolean m130263k(long j) throws Throwable {
        try {
            try {
                m130262j();
                if (j > 0) {
                    long j2 = this.f106867l;
                    long j3 = this.f106868m;
                    if (j2 != j3) {
                        return m130261i(this.f106871p, j2, j3, (j % (j3 - j2)) + j2);
                    }
                }
                return m130260h(this.f106871p, this.f106867l, this.f106868m);
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
    public void m130264l(tmw tmwVar) {
        this.f106872q = tmwVar;
    }

    /* JADX INFO: renamed from: m */
    public void m130265m(float f, float f2) {
        this.f106864i = f;
        this.f106865j = f2;
    }

    /* JADX INFO: renamed from: n */
    public void m130266n(float f) {
        this.f106865j = f;
    }

    /* JADX INFO: renamed from: o */
    public synchronized void m130267o(boolean z) {
        try {
            MDLog.m7389d(this.f106859d, "AudioDecoderType:".concat(z ? "Soft" : "Hard"));
            this.f106861f = z;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: p */
    public void m130268p(float f) {
        this.f106864i = f;
    }
}
