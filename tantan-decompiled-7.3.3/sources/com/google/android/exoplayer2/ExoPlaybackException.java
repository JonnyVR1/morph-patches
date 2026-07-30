package com.google.android.exoplayer2;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.InterfaceC1886e;
import java.io.IOException;
import p153l.bmk0;
import p153l.fyx;
import p153l.w11;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class ExoPlaybackException extends PlaybackException {
    public static final int TYPE_REMOTE = 3;
    public static final int TYPE_RENDERER = 1;
    public static final int TYPE_SOURCE = 0;
    public static final int TYPE_UNEXPECTED = 2;
    final boolean isRecoverable;

    @Nullable
    public final fyx mediaPeriodId;

    @Nullable
    public final C1894k rendererFormat;
    public final int rendererFormatSupport;
    public final int rendererIndex;

    @Nullable
    public final String rendererName;
    public final int type;
    public static final InterfaceC1886e.a<ExoPlaybackException> CREATOR = new InterfaceC1886e.a() { // from class: l.v7f
        @Override // com.google.android.exoplayer2.InterfaceC1886e.a
        /* JADX INFO: renamed from: a */
        public final InterfaceC1886e mo10034a(Bundle bundle) {
            return ExoPlaybackException.m9409a(bundle);
        }
    };
    private static final String FIELD_TYPE = bmk0.m105181z0(1001);
    private static final String FIELD_RENDERER_NAME = bmk0.m105181z0(1002);
    private static final String FIELD_RENDERER_INDEX = bmk0.m105181z0(1003);
    private static final String FIELD_RENDERER_FORMAT = bmk0.m105181z0(1004);
    private static final String FIELD_RENDERER_FORMAT_SUPPORT = bmk0.m105181z0(1005);
    private static final String FIELD_IS_RECOVERABLE = bmk0.m105181z0(1006);

    private ExoPlaybackException(Bundle bundle) {
        super(bundle);
        this.type = bundle.getInt(FIELD_TYPE, 2);
        this.rendererName = bundle.getString(FIELD_RENDERER_NAME);
        this.rendererIndex = bundle.getInt(FIELD_RENDERER_INDEX, -1);
        Bundle bundle2 = bundle.getBundle(FIELD_RENDERER_FORMAT);
        this.rendererFormat = bundle2 == null ? null : (C1894k) C1894k.f7755R0.mo10034a(bundle2);
        this.rendererFormatSupport = bundle.getInt(FIELD_RENDERER_FORMAT_SUPPORT, 4);
        this.isRecoverable = bundle.getBoolean(FIELD_IS_RECOVERABLE, false);
        this.mediaPeriodId = null;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ ExoPlaybackException m9409a(Bundle bundle) {
        return new ExoPlaybackException(bundle);
    }

    public static ExoPlaybackException createForRemote(String str) {
        return new ExoPlaybackException(3, null, str, 1001, null, -1, null, 4, false);
    }

    public static ExoPlaybackException createForRenderer(Throwable th, String str, int i, @Nullable C1894k c1894k, int i2, boolean z, int i3) {
        if (c1894k == null) {
            i2 = 4;
        }
        return new ExoPlaybackException(1, th, null, i3, str, i, c1894k, i2, z);
    }

    public static ExoPlaybackException createForSource(IOException iOException, int i) {
        return new ExoPlaybackException(0, iOException, i);
    }

    @Deprecated
    public static ExoPlaybackException createForUnexpected(RuntimeException runtimeException) {
        return createForUnexpected(runtimeException, 1000);
    }

    private static String deriveMessage(int i, @Nullable String str, @Nullable String str2, int i2, @Nullable C1894k c1894k, int i3) {
        String str3;
        if (i == 0) {
            str3 = "Source error";
        } else if (i != 1) {
            str3 = i != 3 ? "Unexpected runtime error" : "Remote error";
        } else {
            str3 = str2 + " error, index=" + i2 + ", format=" + c1894k + ", format_supported=" + bmk0.m105115Z(i3);
        }
        if (TextUtils.isEmpty(str)) {
            return str3;
        }
        return str3 + ": " + str;
    }

    @CheckResult
    public ExoPlaybackException copyWithMediaPeriodId(@Nullable fyx fyxVar) {
        return new ExoPlaybackException((String) bmk0.m105144j(getMessage()), getCause(), this.errorCode, this.type, this.rendererName, this.rendererIndex, this.rendererFormat, this.rendererFormatSupport, fyxVar, this.timestampMs, this.isRecoverable);
    }

    @Override // com.google.android.exoplayer2.PlaybackException
    public boolean errorInfoEquals(@Nullable PlaybackException playbackException) {
        if (!super.errorInfoEquals(playbackException)) {
            return false;
        }
        ExoPlaybackException exoPlaybackException = (ExoPlaybackException) bmk0.m105144j(playbackException);
        return this.type == exoPlaybackException.type && bmk0.m105123c(this.rendererName, exoPlaybackException.rendererName) && this.rendererIndex == exoPlaybackException.rendererIndex && bmk0.m105123c(this.rendererFormat, exoPlaybackException.rendererFormat) && this.rendererFormatSupport == exoPlaybackException.rendererFormatSupport && bmk0.m105123c(this.mediaPeriodId, exoPlaybackException.mediaPeriodId) && this.isRecoverable == exoPlaybackException.isRecoverable;
    }

    public Exception getRendererException() {
        w11.m204371g(this.type == 1);
        return (Exception) w11.m204369e(getCause());
    }

    public IOException getSourceException() {
        w11.m204371g(this.type == 0);
        return (IOException) w11.m204369e(getCause());
    }

    public RuntimeException getUnexpectedException() {
        w11.m204371g(this.type == 2);
        return (RuntimeException) w11.m204369e(getCause());
    }

    @Override // com.google.android.exoplayer2.PlaybackException, com.google.android.exoplayer2.InterfaceC1886e
    public Bundle toBundle() {
        Bundle bundle = super.toBundle();
        bundle.putInt(FIELD_TYPE, this.type);
        bundle.putString(FIELD_RENDERER_NAME, this.rendererName);
        bundle.putInt(FIELD_RENDERER_INDEX, this.rendererIndex);
        C1894k c1894k = this.rendererFormat;
        if (c1894k != null) {
            bundle.putBundle(FIELD_RENDERER_FORMAT, c1894k.toBundle());
        }
        bundle.putInt(FIELD_RENDERER_FORMAT_SUPPORT, this.rendererFormatSupport);
        bundle.putBoolean(FIELD_IS_RECOVERABLE, this.isRecoverable);
        return bundle;
    }

    public static ExoPlaybackException createForUnexpected(RuntimeException runtimeException, int i) {
        return new ExoPlaybackException(2, runtimeException, i);
    }

    private ExoPlaybackException(int i, @Nullable Throwable th, @Nullable String str, int i2, @Nullable String str2, int i3, @Nullable C1894k c1894k, int i4, boolean z) {
        this(deriveMessage(i, str, str2, i3, c1894k, i4), th, i2, i, str2, i3, c1894k, i4, null, SystemClock.elapsedRealtime(), z);
    }

    private ExoPlaybackException(int i, Throwable th, int i2) {
        this(i, th, null, i2, null, -1, null, 4, false);
    }

    private ExoPlaybackException(String str, @Nullable Throwable th, int i, int i2, @Nullable String str2, int i3, @Nullable C1894k c1894k, int i4, @Nullable fyx fyxVar, long j, boolean z) {
        super(str, th, i, j);
        w11.m204365a(!z || i2 == 1);
        w11.m204365a(th != null || i2 == 3);
        this.type = i2;
        this.rendererName = str2;
        this.rendererIndex = i3;
        this.rendererFormat = c1894k;
        this.rendererFormatSupport = i4;
        this.mediaPeriodId = fyxVar;
        this.isRecoverable = z;
    }
}
