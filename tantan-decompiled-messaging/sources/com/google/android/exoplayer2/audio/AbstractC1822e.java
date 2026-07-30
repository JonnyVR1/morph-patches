package com.google.android.exoplayer2.audio;

import androidx.annotation.CallSuper;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: renamed from: com.google.android.exoplayer2.audio.e */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public abstract class AbstractC1822e implements AudioProcessor {

    /* JADX INFO: renamed from: b */
    public AudioProcessor.C1804a f7202b;

    /* JADX INFO: renamed from: c */
    public AudioProcessor.C1804a f7203c;

    /* JADX INFO: renamed from: d */
    public AudioProcessor.C1804a f7204d;

    /* JADX INFO: renamed from: e */
    public AudioProcessor.C1804a f7205e;

    /* JADX INFO: renamed from: f */
    public ByteBuffer f7206f;

    /* JADX INFO: renamed from: g */
    public ByteBuffer f7207g;

    /* JADX INFO: renamed from: h */
    public boolean f7208h;

    public AbstractC1822e() {
        ByteBuffer byteBuffer = AudioProcessor.f7038a;
        this.f7206f = byteBuffer;
        this.f7207g = byteBuffer;
        AudioProcessor.C1804a c1804a = AudioProcessor.C1804a.f7039e;
        this.f7204d = c1804a;
        this.f7205e = c1804a;
        this.f7202b = c1804a;
        this.f7203c = c1804a;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m9603a() {
        return this.f7207g.hasRemaining();
    }

    /* JADX INFO: renamed from: b */
    public AudioProcessor.C1804a mo9604b(AudioProcessor.C1804a c1804a) throws AudioProcessor.UnhandledAudioFormatException {
        return AudioProcessor.C1804a.f7039e;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    @CallSuper
    /* JADX INFO: renamed from: c */
    public boolean mo9417c() {
        return this.f7208h && this.f7207g == AudioProcessor.f7038a;
    }

    /* JADX INFO: renamed from: d */
    public void mo9605d() {
    }

    /* JADX INFO: renamed from: e */
    public void mo9606e() {
    }

    /* JADX INFO: renamed from: f */
    public void mo9607f() {
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public final void flush() {
        this.f7207g = AudioProcessor.f7038a;
        this.f7208h = false;
        this.f7202b = this.f7204d;
        this.f7203c = this.f7205e;
        mo9605d();
    }

    /* JADX INFO: renamed from: g */
    public final ByteBuffer m9608g(int i) {
        if (this.f7206f.capacity() < i) {
            this.f7206f = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.f7206f.clear();
        }
        ByteBuffer byteBuffer = this.f7206f;
        this.f7207g = byteBuffer;
        return byteBuffer;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    /* JADX INFO: renamed from: k */
    public boolean mo9418k() {
        return this.f7205e != AudioProcessor.C1804a.f7039e;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    /* JADX INFO: renamed from: m */
    public final void mo9420m() {
        this.f7208h = true;
        mo9606e();
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    @CallSuper
    /* JADX INFO: renamed from: n */
    public ByteBuffer mo9421n() {
        ByteBuffer byteBuffer = this.f7207g;
        this.f7207g = AudioProcessor.f7038a;
        return byteBuffer;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    /* JADX INFO: renamed from: o */
    public final AudioProcessor.C1804a mo9422o(AudioProcessor.C1804a c1804a) throws AudioProcessor.UnhandledAudioFormatException {
        this.f7204d = c1804a;
        this.f7205e = mo9604b(c1804a);
        return mo9418k() ? this.f7205e : AudioProcessor.C1804a.f7039e;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public final void reset() {
        flush();
        this.f7206f = AudioProcessor.f7038a;
        AudioProcessor.C1804a c1804a = AudioProcessor.C1804a.f7039e;
        this.f7204d = c1804a;
        this.f7205e = c1804a;
        this.f7202b = c1804a;
        this.f7203c = c1804a;
        mo9607f();
    }
}
