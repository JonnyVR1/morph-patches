package com.google.android.exoplayer2.audio;

import androidx.annotation.CallSuper;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: renamed from: com.google.android.exoplayer2.audio.e */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public abstract class AbstractC1845e implements AudioProcessor {

    /* JADX INFO: renamed from: b */
    public AudioProcessor.C1827a f7239b;

    /* JADX INFO: renamed from: c */
    public AudioProcessor.C1827a f7240c;

    /* JADX INFO: renamed from: d */
    public AudioProcessor.C1827a f7241d;

    /* JADX INFO: renamed from: e */
    public AudioProcessor.C1827a f7242e;

    /* JADX INFO: renamed from: f */
    public ByteBuffer f7243f;

    /* JADX INFO: renamed from: g */
    public ByteBuffer f7244g;

    /* JADX INFO: renamed from: h */
    public boolean f7245h;

    public AbstractC1845e() {
        ByteBuffer byteBuffer = AudioProcessor.f7075a;
        this.f7243f = byteBuffer;
        this.f7244g = byteBuffer;
        AudioProcessor.C1827a c1827a = AudioProcessor.C1827a.f7076e;
        this.f7241d = c1827a;
        this.f7242e = c1827a;
        this.f7239b = c1827a;
        this.f7240c = c1827a;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m9657a() {
        return this.f7244g.hasRemaining();
    }

    /* JADX INFO: renamed from: b */
    public AudioProcessor.C1827a mo9658b(AudioProcessor.C1827a c1827a) throws AudioProcessor.UnhandledAudioFormatException {
        return AudioProcessor.C1827a.f7076e;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    @CallSuper
    /* JADX INFO: renamed from: c */
    public boolean mo9471c() {
        return this.f7245h && this.f7244g == AudioProcessor.f7075a;
    }

    /* JADX INFO: renamed from: d */
    public void mo9659d() {
    }

    /* JADX INFO: renamed from: e */
    public void mo9660e() {
    }

    /* JADX INFO: renamed from: f */
    public void mo9661f() {
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public final void flush() {
        this.f7244g = AudioProcessor.f7075a;
        this.f7245h = false;
        this.f7239b = this.f7241d;
        this.f7240c = this.f7242e;
        mo9659d();
    }

    /* JADX INFO: renamed from: g */
    public final ByteBuffer m9662g(int i) {
        if (this.f7243f.capacity() < i) {
            this.f7243f = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.f7243f.clear();
        }
        ByteBuffer byteBuffer = this.f7243f;
        this.f7244g = byteBuffer;
        return byteBuffer;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    /* JADX INFO: renamed from: k */
    public boolean mo9472k() {
        return this.f7242e != AudioProcessor.C1827a.f7076e;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    /* JADX INFO: renamed from: m */
    public final void mo9474m() {
        this.f7245h = true;
        mo9660e();
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    @CallSuper
    /* JADX INFO: renamed from: n */
    public ByteBuffer mo9475n() {
        ByteBuffer byteBuffer = this.f7244g;
        this.f7244g = AudioProcessor.f7075a;
        return byteBuffer;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    /* JADX INFO: renamed from: o */
    public final AudioProcessor.C1827a mo9476o(AudioProcessor.C1827a c1827a) throws AudioProcessor.UnhandledAudioFormatException {
        this.f7241d = c1827a;
        this.f7242e = mo9658b(c1827a);
        return mo9472k() ? this.f7242e : AudioProcessor.C1827a.f7076e;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public final void reset() {
        flush();
        this.f7243f = AudioProcessor.f7075a;
        AudioProcessor.C1827a c1827a = AudioProcessor.C1827a.f7076e;
        this.f7241d = c1827a;
        this.f7242e = c1827a;
        this.f7239b = c1827a;
        this.f7240c = c1827a;
        mo9661f();
    }
}
