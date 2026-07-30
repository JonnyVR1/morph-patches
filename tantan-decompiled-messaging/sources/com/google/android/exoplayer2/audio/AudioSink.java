package com.google.android.exoplayer2.audio;

import android.media.AudioDeviceInfo;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.C1871k;
import com.google.android.exoplayer2.C1930s;
import java.nio.ByteBuffer;
import p149l.pj1;
import p149l.v680;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public interface AudioSink {

    public static final class InitializationException extends Exception {
        public final int audioTrackState;
        public final C1871k format;
        public final boolean isRecoverable;

        public InitializationException(int i, int i2, int i3, int i4, C1871k c1871k, boolean z, @Nullable Exception exc) {
            StringBuilder sb = new StringBuilder("AudioTrack init failed ");
            sb.append(i);
            sb.append(" Config(");
            sb.append(i2);
            sb.append(", ");
            sb.append(i3);
            sb.append(", ");
            sb.append(i4);
            sb.append(") ");
            sb.append(c1871k);
            sb.append(z ? " (recoverable)" : "");
            super(sb.toString(), exc);
            this.audioTrackState = i;
            this.isRecoverable = z;
            this.format = c1871k;
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
        public final C1871k format;
        public final boolean isRecoverable;

        public WriteException(int i, C1871k c1871k, boolean z) {
            super("AudioTrack write failed: " + i);
            this.isRecoverable = z;
            this.errorCode = i;
            this.format = c1871k;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.audio.AudioSink$a */
    public interface InterfaceC1805a {
        /* JADX INFO: renamed from: a */
        void mo9439a(boolean z);

        /* JADX INFO: renamed from: b */
        default void mo9440b(Exception exc) {
        }

        /* JADX INFO: renamed from: c */
        default void mo9441c(long j) {
        }

        /* JADX INFO: renamed from: d */
        void mo9442d(int i, long j, long j2);

        /* JADX INFO: renamed from: e */
        default void mo9443e() {
        }

        /* JADX INFO: renamed from: f */
        default void mo9444f() {
        }

        /* JADX INFO: renamed from: g */
        void mo9445g();

        /* JADX INFO: renamed from: h */
        default void mo9446h() {
        }
    }

    /* JADX INFO: renamed from: a */
    boolean mo9423a(C1871k c1871k);

    /* JADX INFO: renamed from: b */
    void mo9424b();

    /* JADX INFO: renamed from: c */
    boolean mo9425c();

    /* JADX INFO: renamed from: d */
    void mo9426d(C1818a c1818a);

    /* JADX INFO: renamed from: e */
    void mo9427e();

    /* JADX INFO: renamed from: f */
    void mo9428f();

    void flush();

    /* JADX INFO: renamed from: g */
    boolean mo9429g();

    C1930s getPlaybackParameters();

    /* JADX INFO: renamed from: h */
    boolean mo9430h(ByteBuffer byteBuffer, long j, int i) throws WriteException, InitializationException;

    /* JADX INFO: renamed from: i */
    void mo9431i(InterfaceC1805a interfaceC1805a);

    /* JADX INFO: renamed from: j */
    int mo9432j(C1871k c1871k);

    /* JADX INFO: renamed from: k */
    void mo9433k() throws WriteException;

    /* JADX INFO: renamed from: l */
    long mo9434l(boolean z);

    /* JADX INFO: renamed from: m */
    default void m9435m(long j) {
    }

    /* JADX INFO: renamed from: n */
    void mo9436n();

    /* JADX INFO: renamed from: p */
    void mo9438p(C1871k c1871k, int i, @Nullable int[] iArr) throws ConfigurationException;

    void pause();

    void play();

    default void release() {
    }

    void reset();

    void setAudioSessionId(int i);

    void setAuxEffectInfo(pj1 pj1Var);

    void setPlaybackParameters(C1930s c1930s);

    @RequiresApi(23)
    default void setPreferredDevice(@Nullable AudioDeviceInfo audioDeviceInfo) {
    }

    void setSkipSilenceEnabled(boolean z);

    void setVolume(float f);

    public static final class ConfigurationException extends Exception {
        public final C1871k format;

        public ConfigurationException(Throwable th, C1871k c1871k) {
            super(th);
            this.format = c1871k;
        }

        public ConfigurationException(String str, C1871k c1871k) {
            super(str);
            this.format = c1871k;
        }
    }

    /* JADX INFO: renamed from: o */
    default void mo9437o(@Nullable v680 v680Var) {
    }
}
