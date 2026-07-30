package com.google.android.exoplayer2.audio;

import androidx.annotation.Nullable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
import p149l.nlf0;
import p149l.p11;
import p149l.vck0;

/* JADX INFO: renamed from: com.google.android.exoplayer2.audio.j */
/* JADX INFO: loaded from: classes6.dex */
public class C1827j implements AudioProcessor {

    /* JADX INFO: renamed from: b */
    public int f7249b;

    /* JADX INFO: renamed from: c */
    public float f7250c = 1.0f;

    /* JADX INFO: renamed from: d */
    public float f7251d = 1.0f;

    /* JADX INFO: renamed from: e */
    public AudioProcessor.C1804a f7252e;

    /* JADX INFO: renamed from: f */
    public AudioProcessor.C1804a f7253f;

    /* JADX INFO: renamed from: g */
    public AudioProcessor.C1804a f7254g;

    /* JADX INFO: renamed from: h */
    public AudioProcessor.C1804a f7255h;

    /* JADX INFO: renamed from: i */
    public boolean f7256i;

    /* JADX INFO: renamed from: j */
    @Nullable
    public nlf0 f7257j;

    /* JADX INFO: renamed from: k */
    public ByteBuffer f7258k;

    /* JADX INFO: renamed from: l */
    public ShortBuffer f7259l;

    /* JADX INFO: renamed from: m */
    public ByteBuffer f7260m;

    /* JADX INFO: renamed from: n */
    public long f7261n;

    /* JADX INFO: renamed from: o */
    public long f7262o;

    /* JADX INFO: renamed from: p */
    public boolean f7263p;

    public C1827j() {
        AudioProcessor.C1804a c1804a = AudioProcessor.C1804a.f7039e;
        this.f7252e = c1804a;
        this.f7253f = c1804a;
        this.f7254g = c1804a;
        this.f7255h = c1804a;
        ByteBuffer byteBuffer = AudioProcessor.f7038a;
        this.f7258k = byteBuffer;
        this.f7259l = byteBuffer.asShortBuffer();
        this.f7260m = byteBuffer;
        this.f7249b = -1;
    }

    /* JADX INFO: renamed from: a */
    public final long m9674a(long j) {
        if (this.f7262o < 1024) {
            return (long) (((double) this.f7250c) * j);
        }
        long jM160032l = this.f7261n - ((long) ((nlf0) p11.m167011e(this.f7257j)).m160032l());
        int i = this.f7255h.f7040a;
        int i2 = this.f7254g.f7040a;
        long j2 = this.f7262o;
        return i == i2 ? vck0.m197832W0(j, jM160032l, j2) : vck0.m197832W0(j, jM160032l * ((long) i), j2 * ((long) i2));
    }

    /* JADX INFO: renamed from: b */
    public final void m9675b(float f) {
        if (this.f7251d != f) {
            this.f7251d = f;
            this.f7256i = true;
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    /* JADX INFO: renamed from: c */
    public final boolean mo9417c() {
        if (!this.f7263p) {
            return false;
        }
        nlf0 nlf0Var = this.f7257j;
        return nlf0Var == null || nlf0Var.m160031k() == 0;
    }

    /* JADX INFO: renamed from: d */
    public final void m9676d(float f) {
        if (this.f7250c != f) {
            this.f7250c = f;
            this.f7256i = true;
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public final void flush() {
        if (mo9418k()) {
            AudioProcessor.C1804a c1804a = this.f7252e;
            this.f7254g = c1804a;
            AudioProcessor.C1804a c1804a2 = this.f7253f;
            this.f7255h = c1804a2;
            if (this.f7256i) {
                this.f7257j = new nlf0(c1804a.f7040a, c1804a.f7041b, this.f7250c, this.f7251d, c1804a2.f7040a);
            } else {
                nlf0 nlf0Var = this.f7257j;
                if (nlf0Var != null) {
                    nlf0Var.m160029i();
                }
            }
        }
        this.f7260m = AudioProcessor.f7038a;
        this.f7261n = 0L;
        this.f7262o = 0L;
        this.f7263p = false;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    /* JADX INFO: renamed from: k */
    public final boolean mo9418k() {
        if (this.f7253f.f7040a != -1) {
            return Math.abs(this.f7250c - 1.0f) >= 1.0E-4f || Math.abs(this.f7251d - 1.0f) >= 1.0E-4f || this.f7253f.f7040a != this.f7252e.f7040a;
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    /* JADX INFO: renamed from: l */
    public final void mo9419l(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            nlf0 nlf0Var = (nlf0) p11.m167011e(this.f7257j);
            ShortBuffer shortBufferAsShortBuffer = byteBuffer.asShortBuffer();
            int iRemaining = byteBuffer.remaining();
            this.f7261n += (long) iRemaining;
            nlf0Var.m160039t(shortBufferAsShortBuffer);
            byteBuffer.position(byteBuffer.position() + iRemaining);
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    /* JADX INFO: renamed from: m */
    public final void mo9420m() {
        nlf0 nlf0Var = this.f7257j;
        if (nlf0Var != null) {
            nlf0Var.m160038s();
        }
        this.f7263p = true;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    /* JADX INFO: renamed from: n */
    public final ByteBuffer mo9421n() {
        int iM160031k;
        nlf0 nlf0Var = this.f7257j;
        if (nlf0Var != null && (iM160031k = nlf0Var.m160031k()) > 0) {
            if (this.f7258k.capacity() < iM160031k) {
                ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(iM160031k).order(ByteOrder.nativeOrder());
                this.f7258k = byteBufferOrder;
                this.f7259l = byteBufferOrder.asShortBuffer();
            } else {
                this.f7258k.clear();
                this.f7259l.clear();
            }
            nlf0Var.m160030j(this.f7259l);
            this.f7262o += (long) iM160031k;
            this.f7258k.limit(iM160031k);
            this.f7260m = this.f7258k;
        }
        ByteBuffer byteBuffer = this.f7260m;
        this.f7260m = AudioProcessor.f7038a;
        return byteBuffer;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    /* JADX INFO: renamed from: o */
    public final AudioProcessor.C1804a mo9422o(AudioProcessor.C1804a c1804a) throws AudioProcessor.UnhandledAudioFormatException {
        if (c1804a.f7042c != 2) {
            throw new AudioProcessor.UnhandledAudioFormatException(c1804a);
        }
        int i = this.f7249b;
        if (i == -1) {
            i = c1804a.f7040a;
        }
        this.f7252e = c1804a;
        AudioProcessor.C1804a c1804a2 = new AudioProcessor.C1804a(i, c1804a.f7041b, 2);
        this.f7253f = c1804a2;
        this.f7256i = true;
        return c1804a2;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public final void reset() {
        this.f7250c = 1.0f;
        this.f7251d = 1.0f;
        AudioProcessor.C1804a c1804a = AudioProcessor.C1804a.f7039e;
        this.f7252e = c1804a;
        this.f7253f = c1804a;
        this.f7254g = c1804a;
        this.f7255h = c1804a;
        ByteBuffer byteBuffer = AudioProcessor.f7038a;
        this.f7258k = byteBuffer;
        this.f7259l = byteBuffer.asShortBuffer();
        this.f7260m = byteBuffer;
        this.f7249b = -1;
        this.f7256i = false;
        this.f7257j = null;
        this.f7261n = 0L;
        this.f7262o = 0L;
        this.f7263p = false;
    }
}
