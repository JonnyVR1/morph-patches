package com.google.android.exoplayer2.audio;

import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p153l.bmk0;
import p153l.k950;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public interface AudioProcessor {

    /* JADX INFO: renamed from: a */
    public static final ByteBuffer f7075a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    /* JADX INFO: renamed from: com.google.android.exoplayer2.audio.AudioProcessor$a */
    public static final class C1827a {

        /* JADX INFO: renamed from: e */
        public static final C1827a f7076e = new C1827a(-1, -1, -1);

        /* JADX INFO: renamed from: a */
        public final int f7077a;

        /* JADX INFO: renamed from: b */
        public final int f7078b;

        /* JADX INFO: renamed from: c */
        public final int f7079c;

        /* JADX INFO: renamed from: d */
        public final int f7080d;

        public C1827a(int i, int i2, int i3) {
            this.f7077a = i;
            this.f7078b = i2;
            this.f7079c = i3;
            this.f7080d = bmk0.m105070C0(i3) ? bmk0.m105139h0(i3, i2) : -1;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1827a)) {
                return false;
            }
            C1827a c1827a = (C1827a) obj;
            return this.f7077a == c1827a.f7077a && this.f7078b == c1827a.f7078b && this.f7079c == c1827a.f7079c;
        }

        public int hashCode() {
            return k950.m148864b(Integer.valueOf(this.f7077a), Integer.valueOf(this.f7078b), Integer.valueOf(this.f7079c));
        }

        public String toString() {
            return "AudioFormat[sampleRate=" + this.f7077a + ", channelCount=" + this.f7078b + ", encoding=" + this.f7079c + ']';
        }
    }

    /* JADX INFO: renamed from: c */
    boolean mo9471c();

    void flush();

    /* JADX INFO: renamed from: k */
    boolean mo9472k();

    /* JADX INFO: renamed from: l */
    void mo9473l(ByteBuffer byteBuffer);

    /* JADX INFO: renamed from: m */
    void mo9474m();

    /* JADX INFO: renamed from: n */
    ByteBuffer mo9475n();

    /* JADX INFO: renamed from: o */
    C1827a mo9476o(C1827a c1827a) throws UnhandledAudioFormatException;

    void reset();

    public static final class UnhandledAudioFormatException extends Exception {
        public UnhandledAudioFormatException(String str, C1827a c1827a) {
            super(str + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + c1827a);
        }

        public UnhandledAudioFormatException(C1827a c1827a) {
            this("Unhandled input format:", c1827a);
        }
    }
}
