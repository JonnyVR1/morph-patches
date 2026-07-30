package com.google.android.exoplayer2.audio;

import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p149l.v050;
import p149l.vck0;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public interface AudioProcessor {

    /* JADX INFO: renamed from: a */
    public static final ByteBuffer f7038a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    /* JADX INFO: renamed from: com.google.android.exoplayer2.audio.AudioProcessor$a */
    public static final class C1804a {

        /* JADX INFO: renamed from: e */
        public static final C1804a f7039e = new C1804a(-1, -1, -1);

        /* JADX INFO: renamed from: a */
        public final int f7040a;

        /* JADX INFO: renamed from: b */
        public final int f7041b;

        /* JADX INFO: renamed from: c */
        public final int f7042c;

        /* JADX INFO: renamed from: d */
        public final int f7043d;

        public C1804a(int i, int i2, int i3) {
            this.f7040a = i;
            this.f7041b = i2;
            this.f7042c = i3;
            this.f7043d = vck0.m197792C0(i3) ? vck0.m197861h0(i3, i2) : -1;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1804a)) {
                return false;
            }
            C1804a c1804a = (C1804a) obj;
            return this.f7040a == c1804a.f7040a && this.f7041b == c1804a.f7041b && this.f7042c == c1804a.f7042c;
        }

        public int hashCode() {
            return v050.m196471b(Integer.valueOf(this.f7040a), Integer.valueOf(this.f7041b), Integer.valueOf(this.f7042c));
        }

        public String toString() {
            return "AudioFormat[sampleRate=" + this.f7040a + ", channelCount=" + this.f7041b + ", encoding=" + this.f7042c + ']';
        }
    }

    /* JADX INFO: renamed from: c */
    boolean mo9417c();

    void flush();

    /* JADX INFO: renamed from: k */
    boolean mo9418k();

    /* JADX INFO: renamed from: l */
    void mo9419l(ByteBuffer byteBuffer);

    /* JADX INFO: renamed from: m */
    void mo9420m();

    /* JADX INFO: renamed from: n */
    ByteBuffer mo9421n();

    /* JADX INFO: renamed from: o */
    C1804a mo9422o(C1804a c1804a) throws UnhandledAudioFormatException;

    void reset();

    public static final class UnhandledAudioFormatException extends Exception {
        public UnhandledAudioFormatException(String str, C1804a c1804a) {
            super(str + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + c1804a);
        }

        public UnhandledAudioFormatException(C1804a c1804a) {
            this("Unhandled input format:", c1804a);
        }
    }
}
