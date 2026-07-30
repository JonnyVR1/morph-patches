package com.google.android.exoplayer2.audio;

import android.media.AudioDeviceInfo;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.C1894k;
import com.google.android.exoplayer2.C1953s;
import java.nio.ByteBuffer;
import p153l.bf80;
import p153l.wj1;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public interface AudioSink {

    public static final class InitializationException extends Exception {
        public final int audioTrackState;
        public final C1894k format;
        public final boolean isRecoverable;

        public InitializationException(int i, int i2, int i3, int i4, C1894k c1894k, boolean z, @Nullable Exception exc) {
            StringBuilder sb = new StringBuilder("AudioTrack init failed ");
            sb.append(i);
            sb.append(" Config(");
            sb.append(i2);
            sb.append(", ");
            sb.append(i3);
            sb.append(", ");
            sb.append(i4);
            sb.append(") ");
            sb.append(c1894k);
            sb.append(z ? " (recoverable)" : "");
            super(sb.toString(), exc);
            this.audioTrackState = i;
            this.isRecoverable = z;
            this.format = c1894k;
        }
    }

    public static final class UnexpectedDiscontinuityException extends Exception {
        public final long actualPresentationTimeUs;
        public final long expectedPresentationTimeUs;

        public UnexpectedDiscontinuityException(long j, long j2) {
            super("Unexpected audio track timestamp discontinuity: expected " + j2 + ", got " + j);
            this.actualPresentationTimeUs = j;
            this.expectedPresentationTimeUs = j2;
        }
    }

    public static final class WriteException extends Exception {
        public final int errorCode;
        public final C1894k format;
        public final boolean isRecoverable;

        public WriteException(int i, C1894k c1894k, boolean z) {
            super("AudioTrack write failed: " + i);
            this.isRecoverable = z;
            this.errorCode = i;
            this.format = c1894k;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.audio.AudioSink$a */
    public interface InterfaceC1828a {
        /* JADX INFO: renamed from: a */
        void mo9493a(boolean z);

        /* JADX INFO: renamed from: b */
        default void mo9494b(Exception exc) {
        }

        /* JADX INFO: renamed from: c */
        default void mo9495c(long j) {
        }

        /* JADX INFO: renamed from: d */
        void mo9496d(int i, long j, long j2);

        /* JADX INFO: renamed from: e */
        default void mo9497e() {
        }

        /* JADX INFO: renamed from: f */
        default void mo9498f() {
        }

        /* JADX INFO: renamed from: g */
        void mo9499g();

        /* JADX INFO: renamed from: h */
        default void mo9500h() {
        }
    }

    /* JADX INFO: renamed from: a */
    boolean mo9477a(C1894k c1894k);

    /* JADX INFO: renamed from: b */
    void mo9478b();

    /* JADX INFO: renamed from: c */
    boolean mo9479c();

    /* JADX INFO: renamed from: d */
    void mo9480d(C1841a c1841a);

    /* JADX INFO: renamed from: e */
    void mo9481e();

    /* JADX INFO: renamed from: f */
    void mo9482f();

    void flush();

    /* JADX INFO: renamed from: g */
    boolean mo9483g();

    C1953s getPlaybackParameters();

    /* JADX INFO: renamed from: h */
    boolean mo9484h(ByteBuffer byteBuffer, long j, int i) throws WriteException, InitializationException;

    /* JADX INFO: renamed from: i */
    void mo9485i(InterfaceC1828a interfaceC1828a);

    /* JADX INFO: renamed from: j */
    int mo9486j(C1894k c1894k);

    /* JADX INFO: renamed from: k */
    void mo9487k() throws WriteException;

    /* JADX INFO: renamed from: l */
    long mo9488l(boolean z);

    /* JADX INFO: renamed from: m */
    default void m9489m(long j) {
    }

    /* JADX INFO: renamed from: n */
    void mo9490n();

    /* JADX INFO: renamed from: p */
    void mo9492p(C1894k c1894k, int i, @Nullable int[] iArr) throws ConfigurationException;

    void pause();

    void play();

    default void release() {
    }

    void reset();

    void setAudioSessionId(int i);

    void setAuxEffectInfo(wj1 wj1Var);

    void setPlaybackParameters(C1953s c1953s);

    @RequiresApi(23)
    default void setPreferredDevice(@Nullable AudioDeviceInfo audioDeviceInfo) {
    }

    void setSkipSilenceEnabled(boolean z);

    void setVolume(float f);

    public static final class ConfigurationException extends Exception {
        public final C1894k format;

        public ConfigurationException(Throwable th, C1894k c1894k) {
            super(th);
            this.format = c1894k;
        }

        public ConfigurationException(String str, C1894k c1894k) {
            super(str);
            this.format = c1894k;
        }
    }

    /* JADX INFO: renamed from: o */
    default void mo9491o(@Nullable bf80 bf80Var) {
    }
}
