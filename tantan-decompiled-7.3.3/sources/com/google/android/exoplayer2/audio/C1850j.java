package com.google.android.exoplayer2.audio;

import androidx.annotation.Nullable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
import p153l.bmk0;
import p153l.w11;
import p153l.wtf0;

/* JADX INFO: renamed from: com.google.android.exoplayer2.audio.j */
/* JADX INFO: loaded from: classes6.dex */
public class C1850j implements AudioProcessor {

    /* JADX INFO: renamed from: b */
    public int f7286b;

    /* JADX INFO: renamed from: c */
    public float f7287c = 1.0f;

    /* JADX INFO: renamed from: d */
    public float f7288d = 1.0f;

    /* JADX INFO: renamed from: e */
    public AudioProcessor.C1827a f7289e;

    /* JADX INFO: renamed from: f */
    public AudioProcessor.C1827a f7290f;

    /* JADX INFO: renamed from: g */
    public AudioProcessor.C1827a f7291g;

    /* JADX INFO: renamed from: h */
    public AudioProcessor.C1827a f7292h;

    /* JADX INFO: renamed from: i */
    public boolean f7293i;

    /* JADX INFO: renamed from: j */
    @Nullable
    public wtf0 f7294j;

    /* JADX INFO: renamed from: k */
    public ByteBuffer f7295k;

    /* JADX INFO: renamed from: l */
    public ShortBuffer f7296l;

    /* JADX INFO: renamed from: m */
    public ByteBuffer f7297m;

    /* JADX INFO: renamed from: n */
    public long f7298n;

    /* JADX INFO: renamed from: o */
    public long f7299o;

    /* JADX INFO: renamed from: p */
    public boolean f7300p;

    public C1850j() {
        AudioProcessor.C1827a c1827a = AudioProcessor.C1827a.f7076e;
        this.f7289e = c1827a;
        this.f7290f = c1827a;
        this.f7291g = c1827a;
        this.f7292h = c1827a;
        ByteBuffer byteBuffer = AudioProcessor.f7075a;
        this.f7295k = byteBuffer;
        this.f7296l = byteBuffer.asShortBuffer();
        this.f7297m = byteBuffer;
        this.f7286b = -1;
    }

    /* JADX INFO: renamed from: a */
    public final long m9728a(long j) {
        if (this.f7299o < 1024) {
            return (long) (((double) this.f7287c) * j);
        }
        long jM207861l = this.f7298n - ((long) ((wtf0) w11.m204369e(this.f7294j)).m207861l());
        int i = this.f7292h.f7077a;
        int i2 = this.f7291g.f7077a;
        long j2 = this.f7299o;
        return i == i2 ? bmk0.m105110W0(j, jM207861l, j2) : bmk0.m105110W0(j, jM207861l * ((long) i), j2 * ((long) i2));
    }

    /* JADX INFO: renamed from: b */
    public final void m9729b(float f) {
        if (this.f7288d != f) {
            this.f7288d = f;
            this.f7293i = true;
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    /* JADX INFO: renamed from: c */
    public final boolean mo9471c() {
        if (!this.f7300p) {
            return false;
        }
        wtf0 wtf0Var = this.f7294j;
        return wtf0Var == null || wtf0Var.m207860k() == 0;
    }

    /* JADX INFO: renamed from: d */
    public final void m9730d(float f) {
        if (this.f7287c != f) {
            this.f7287c = f;
            this.f7293i = true;
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public final void flush() {
        if (mo9472k()) {
            AudioProcessor.C1827a c1827a = this.f7289e;
            this.f7291g = c1827a;
            AudioProcessor.C1827a c1827a2 = this.f7290f;
            this.f7292h = c1827a2;
            if (this.f7293i) {
                this.f7294j = new wtf0(c1827a.f7077a, c1827a.f7078b, this.f7287c, this.f7288d, c1827a2.f7077a);
            } else {
                wtf0 wtf0Var = this.f7294j;
                if (wtf0Var != null) {
                    wtf0Var.m207858i();
                }
            }
        }
        this.f7297m = AudioProcessor.f7075a;
        this.f7298n = 0L;
        this.f7299o = 0L;
        this.f7300p = false;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    /* JADX INFO: renamed from: k */
    public final boolean mo9472k() {
        if (this.f7290f.f7077a != -1) {
            return Math.abs(this.f7287c - 1.0f) >= 1.0E-4f || Math.abs(this.f7288d - 1.0f) >= 1.0E-4f || this.f7290f.f7077a != this.f7289e.f7077a;
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    /* JADX INFO: renamed from: l */
    public final void mo9473l(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            wtf0 wtf0Var = (wtf0) w11.m204369e(this.f7294j);
            ShortBuffer shortBufferAsShortBuffer = byteBuffer.asShortBuffer();
            int iRemaining = byteBuffer.remaining();
            this.f7298n += (long) iRemaining;
            wtf0Var.m207868t(shortBufferAsShortBuffer);
            byteBuffer.position(byteBuffer.position() + iRemaining);
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    /* JADX INFO: renamed from: m */
    public final void mo9474m() {
        wtf0 wtf0Var = this.f7294j;
        if (wtf0Var != null) {
            wtf0Var.m207867s();
        }
        this.f7300p = true;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    /* JADX INFO: renamed from: n */
    public final ByteBuffer mo9475n() {
        int iM207860k;
        wtf0 wtf0Var = this.f7294j;
        if (wtf0Var != null && (iM207860k = wtf0Var.m207860k()) > 0) {
            if (this.f7295k.capacity() < iM207860k) {
                ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(iM207860k).order(ByteOrder.nativeOrder());
                this.f7295k = byteBufferOrder;
                this.f7296l = byteBufferOrder.asShortBuffer();
            } else {
                this.f7295k.clear();
                this.f7296l.clear();
            }
            wtf0Var.m207859j(this.f7296l);
            this.f7299o += (long) iM207860k;
            this.f7295k.limit(iM207860k);
            this.f7297m = this.f7295k;
        }
        ByteBuffer byteBuffer = this.f7297m;
        this.f7297m = AudioProcessor.f7075a;
        return byteBuffer;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    /* JADX INFO: renamed from: o */
    public final AudioProcessor.C1827a mo9476o(AudioProcessor.C1827a c1827a) throws AudioProcessor.UnhandledAudioFormatException {
        if (c1827a.f7079c != 2) {
            throw new AudioProcessor.UnhandledAudioFormatException(c1827a);
        }
        int i = this.f7286b;
        if (i == -1) {
            i = c1827a.f7077a;
        }
        this.f7289e = c1827a;
        AudioProcessor.C1827a c1827a2 = new AudioProcessor.C1827a(i, c1827a.f7078b, 2);
        this.f7290f = c1827a2;
        this.f7293i = true;
        return c1827a2;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public final void reset() {
        this.f7287c = 1.0f;
        this.f7288d = 1.0f;
        AudioProcessor.C1827a c1827a = AudioProcessor.C1827a.f7076e;
        this.f7289e = c1827a;
        this.f7290f = c1827a;
        this.f7291g = c1827a;
        this.f7292h = c1827a;
        ByteBuffer byteBuffer = AudioProcessor.f7075a;
        this.f7295k = byteBuffer;
        this.f7296l = byteBuffer.asShortBuffer();
        this.f7297m = byteBuffer;
        this.f7286b = -1;
        this.f7293i = false;
        this.f7294j = null;
        this.f7298n = 0L;
        this.f7299o = 0L;
        this.f7300p = false;
    }
}
