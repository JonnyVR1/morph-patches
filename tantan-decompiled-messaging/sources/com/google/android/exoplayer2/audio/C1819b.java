package com.google.android.exoplayer2.audio;

import androidx.annotation.Nullable;
import com.google.common.collect.ImmutableList;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import p149l.p11;

/* JADX INFO: renamed from: com.google.android.exoplayer2.audio.b */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class C1819b {

    /* JADX INFO: renamed from: a */
    public final ImmutableList<AudioProcessor> f7161a;

    /* JADX INFO: renamed from: b */
    public final List<AudioProcessor> f7162b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public ByteBuffer[] f7163c = new ByteBuffer[0];

    /* JADX INFO: renamed from: d */
    public AudioProcessor.C1804a f7164d;

    /* JADX INFO: renamed from: e */
    public AudioProcessor.C1804a f7165e;

    /* JADX INFO: renamed from: f */
    public boolean f7166f;

    public C1819b(ImmutableList<AudioProcessor> immutableList) {
        this.f7161a = immutableList;
        AudioProcessor.C1804a c1804a = AudioProcessor.C1804a.f7039e;
        this.f7164d = c1804a;
        this.f7165e = c1804a;
        this.f7166f = false;
    }

    /* JADX INFO: renamed from: a */
    public AudioProcessor.C1804a m9541a(AudioProcessor.C1804a c1804a) throws AudioProcessor.UnhandledAudioFormatException {
        if (c1804a.equals(AudioProcessor.C1804a.f7039e)) {
            throw new AudioProcessor.UnhandledAudioFormatException(c1804a);
        }
        for (int i = 0; i < this.f7161a.size(); i++) {
            AudioProcessor audioProcessor = this.f7161a.get(i);
            AudioProcessor.C1804a c1804aMo9422o = audioProcessor.mo9422o(c1804a);
            if (audioProcessor.mo9418k()) {
                p11.m167013g(!c1804aMo9422o.equals(AudioProcessor.C1804a.f7039e));
                c1804a = c1804aMo9422o;
            }
        }
        this.f7165e = c1804a;
        return c1804a;
    }

    /* JADX INFO: renamed from: b */
    public void m9542b() {
        this.f7162b.clear();
        this.f7164d = this.f7165e;
        this.f7166f = false;
        for (int i = 0; i < this.f7161a.size(); i++) {
            AudioProcessor audioProcessor = this.f7161a.get(i);
            audioProcessor.flush();
            if (audioProcessor.mo9418k()) {
                this.f7162b.add(audioProcessor);
            }
        }
        this.f7163c = new ByteBuffer[this.f7162b.size()];
        for (int i2 = 0; i2 <= m9543c(); i2++) {
            this.f7163c[i2] = this.f7162b.get(i2).mo9421n();
        }
    }

    /* JADX INFO: renamed from: c */
    public final int m9543c() {
        return this.f7163c.length - 1;
    }

    /* JADX INFO: renamed from: d */
    public ByteBuffer m9544d() {
        if (!m9546f()) {
            return AudioProcessor.f7038a;
        }
        ByteBuffer byteBuffer = this.f7163c[m9543c()];
        if (!byteBuffer.hasRemaining()) {
            m9547g(AudioProcessor.f7038a);
        }
        return byteBuffer;
    }

    /* JADX INFO: renamed from: e */
    public boolean m9545e() {
        return this.f7166f && this.f7162b.get(m9543c()).mo9417c() && !this.f7163c[m9543c()].hasRemaining();
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1819b)) {
            return false;
        }
        C1819b c1819b = (C1819b) obj;
        if (this.f7161a.size() != c1819b.f7161a.size()) {
            return false;
        }
        for (int i = 0; i < this.f7161a.size(); i++) {
            if (this.f7161a.get(i) != c1819b.f7161a.get(i)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public boolean m9546f() {
        return !this.f7162b.isEmpty();
    }

    /* JADX INFO: renamed from: g */
    public final void m9547g(ByteBuffer byteBuffer) {
        boolean z;
        for (boolean z2 = true; z2; z2 = z) {
            z = false;
            for (int i = 0; i <= m9543c(); i++) {
                if (!this.f7163c[i].hasRemaining()) {
                    AudioProcessor audioProcessor = this.f7162b.get(i);
                    if (!audioProcessor.mo9417c()) {
                        ByteBuffer byteBuffer2 = i > 0 ? this.f7163c[i - 1] : byteBuffer.hasRemaining() ? byteBuffer : AudioProcessor.f7038a;
                        long jRemaining = byteBuffer2.remaining();
                        audioProcessor.mo9419l(byteBuffer2);
                        this.f7163c[i] = audioProcessor.mo9421n();
                        z |= jRemaining - ((long) byteBuffer2.remaining()) > 0 || this.f7163c[i].hasRemaining();
                    } else if (!this.f7163c[i].hasRemaining() && i < m9543c()) {
                        this.f7162b.get(i + 1).mo9420m();
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public void m9548h() {
        if (!m9546f() || this.f7166f) {
            return;
        }
        this.f7166f = true;
        this.f7162b.get(0).mo9420m();
    }

    public int hashCode() {
        return this.f7161a.hashCode();
    }

    /* JADX INFO: renamed from: i */
    public void m9549i(ByteBuffer byteBuffer) {
        if (!m9546f() || this.f7166f) {
            return;
        }
        m9547g(byteBuffer);
    }

    /* JADX INFO: renamed from: j */
    public void m9550j() {
        for (int i = 0; i < this.f7161a.size(); i++) {
            AudioProcessor audioProcessor = this.f7161a.get(i);
            audioProcessor.flush();
            audioProcessor.reset();
        }
        this.f7163c = new ByteBuffer[0];
        AudioProcessor.C1804a c1804a = AudioProcessor.C1804a.f7039e;
        this.f7164d = c1804a;
        this.f7165e = c1804a;
        this.f7166f = false;
    }
}
