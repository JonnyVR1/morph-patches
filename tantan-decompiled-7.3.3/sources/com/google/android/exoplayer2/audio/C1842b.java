package com.google.android.exoplayer2.audio;

import androidx.annotation.Nullable;
import com.google.common.collect.ImmutableList;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import p153l.w11;

/* JADX INFO: renamed from: com.google.android.exoplayer2.audio.b */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class C1842b {

    /* JADX INFO: renamed from: a */
    public final ImmutableList<AudioProcessor> f7198a;

    /* JADX INFO: renamed from: b */
    public final List<AudioProcessor> f7199b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public ByteBuffer[] f7200c = new ByteBuffer[0];

    /* JADX INFO: renamed from: d */
    public AudioProcessor.C1827a f7201d;

    /* JADX INFO: renamed from: e */
    public AudioProcessor.C1827a f7202e;

    /* JADX INFO: renamed from: f */
    public boolean f7203f;

    public C1842b(ImmutableList<AudioProcessor> immutableList) {
        this.f7198a = immutableList;
        AudioProcessor.C1827a c1827a = AudioProcessor.C1827a.f7076e;
        this.f7201d = c1827a;
        this.f7202e = c1827a;
        this.f7203f = false;
    }

    /* JADX INFO: renamed from: a */
    public AudioProcessor.C1827a m9595a(AudioProcessor.C1827a c1827a) throws AudioProcessor.UnhandledAudioFormatException {
        if (c1827a.equals(AudioProcessor.C1827a.f7076e)) {
            throw new AudioProcessor.UnhandledAudioFormatException(c1827a);
        }
        for (int i = 0; i < this.f7198a.size(); i++) {
            AudioProcessor audioProcessor = this.f7198a.get(i);
            AudioProcessor.C1827a c1827aMo9476o = audioProcessor.mo9476o(c1827a);
            if (audioProcessor.mo9472k()) {
                w11.m204371g(!c1827aMo9476o.equals(AudioProcessor.C1827a.f7076e));
                c1827a = c1827aMo9476o;
            }
        }
        this.f7202e = c1827a;
        return c1827a;
    }

    /* JADX INFO: renamed from: b */
    public void m9596b() {
        this.f7199b.clear();
        this.f7201d = this.f7202e;
        this.f7203f = false;
        for (int i = 0; i < this.f7198a.size(); i++) {
            AudioProcessor audioProcessor = this.f7198a.get(i);
            audioProcessor.flush();
            if (audioProcessor.mo9472k()) {
                this.f7199b.add(audioProcessor);
            }
        }
        this.f7200c = new ByteBuffer[this.f7199b.size()];
        for (int i2 = 0; i2 <= m9597c(); i2++) {
            this.f7200c[i2] = this.f7199b.get(i2).mo9475n();
        }
    }

    /* JADX INFO: renamed from: c */
    public final int m9597c() {
        return this.f7200c.length - 1;
    }

    /* JADX INFO: renamed from: d */
    public ByteBuffer m9598d() {
        if (!m9600f()) {
            return AudioProcessor.f7075a;
        }
        ByteBuffer byteBuffer = this.f7200c[m9597c()];
        if (!byteBuffer.hasRemaining()) {
            m9601g(AudioProcessor.f7075a);
        }
        return byteBuffer;
    }

    /* JADX INFO: renamed from: e */
    public boolean m9599e() {
        return this.f7203f && this.f7199b.get(m9597c()).mo9471c() && !this.f7200c[m9597c()].hasRemaining();
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1842b)) {
            return false;
        }
        C1842b c1842b = (C1842b) obj;
        if (this.f7198a.size() != c1842b.f7198a.size()) {
            return false;
        }
        for (int i = 0; i < this.f7198a.size(); i++) {
            if (this.f7198a.get(i) != c1842b.f7198a.get(i)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public boolean m9600f() {
        return !this.f7199b.isEmpty();
    }

    /* JADX INFO: renamed from: g */
    public final void m9601g(ByteBuffer byteBuffer) {
        boolean z;
        for (boolean z2 = true; z2; z2 = z) {
            z = false;
            for (int i = 0; i <= m9597c(); i++) {
                if (!this.f7200c[i].hasRemaining()) {
                    AudioProcessor audioProcessor = this.f7199b.get(i);
                    if (!audioProcessor.mo9471c()) {
                        ByteBuffer byteBuffer2 = i > 0 ? this.f7200c[i - 1] : byteBuffer.hasRemaining() ? byteBuffer : AudioProcessor.f7075a;
                        long jRemaining = byteBuffer2.remaining();
                        audioProcessor.mo9473l(byteBuffer2);
                        this.f7200c[i] = audioProcessor.mo9475n();
                        z |= jRemaining - ((long) byteBuffer2.remaining()) > 0 || this.f7200c[i].hasRemaining();
                    } else if (!this.f7200c[i].hasRemaining() && i < m9597c()) {
                        this.f7199b.get(i + 1).mo9474m();
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public void m9602h() {
        if (!m9600f() || this.f7203f) {
            return;
        }
        this.f7203f = true;
        this.f7199b.get(0).mo9474m();
    }

    public int hashCode() {
        return this.f7198a.hashCode();
    }

    /* JADX INFO: renamed from: i */
    public void m9603i(ByteBuffer byteBuffer) {
        if (!m9600f() || this.f7203f) {
            return;
        }
        m9601g(byteBuffer);
    }

    /* JADX INFO: renamed from: j */
    public void m9604j() {
        for (int i = 0; i < this.f7198a.size(); i++) {
            AudioProcessor audioProcessor = this.f7198a.get(i);
            audioProcessor.flush();
            audioProcessor.reset();
        }
        this.f7200c = new ByteBuffer[0];
        AudioProcessor.C1827a c1827a = AudioProcessor.C1827a.f7076e;
        this.f7201d = c1827a;
        this.f7202e = c1827a;
        this.f7203f = false;
    }
}
