package com.google.android.exoplayer2;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.InterfaceC1863e;
import java.io.IOException;
import p149l.ipx;
import p149l.p11;
import p149l.vck0;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class ExoPlaybackException extends PlaybackException {
    public static final int TYPE_REMOTE = 3;
    public static final int TYPE_RENDERER = 1;
    public static final int TYPE_SOURCE = 0;
    public static final int TYPE_UNEXPECTED = 2;
    final boolean isRecoverable;

    @Nullable
    public final ipx mediaPeriodId;

    @Nullable
    public final C1871k rendererFormat;
    public final int rendererFormatSupport;
    public final int rendererIndex;

    @Nullable
    public final String rendererName;
    public final int type;
    public static final InterfaceC1863e.a<ExoPlaybackException> CREATOR = new InterfaceC1863e.a() { // from class: l.p6f
        @Override // com.google.android.exoplayer2.InterfaceC1863e.a
        /* JADX INFO: renamed from: a */
        public final InterfaceC1863e mo9980a(Bundle bundle) {
            return ExoPlaybackException.m9355a(bundle);
        }
    };
    private static final String FIELD_TYPE = vck0.m197903z0(1001);
    private static final String FIELD_RENDERER_NAME = vck0.m197903z0(1002);
    private static final String FIELD_RENDERER_INDEX = vck0.m197903z0(1003);
    private static final String FIELD_RENDERER_FORMAT = vck0.m197903z0(1004);
    private static final String FIELD_RENDERER_FORMAT_SUPPORT = vck0.m197903z0(1005);
    private static final String FIELD_IS_RECOVERABLE = vck0.m197903z0(1006);

    private ExoPlaybackException(Bundle bundle) {
        super(bundle);
        this.type = bundle.getInt(FIELD_TYPE, 2);
        this.rendererName = bundle.getString(FIELD_RENDERER_NAME);
        this.rendererIndex = bundle.getInt(FIELD_RENDERER_INDEX, -1);
        Bundle bundle2 = bundle.getBundle(FIELD_RENDERER_FORMAT);
        this.rendererFormat = bundle2 == null ? null : (C1871k) C1871k.f7718R0.mo9980a(bundle2);
        this.rendererFormatSupport = bundle.getInt(FIELD_RENDERER_FORMAT_SUPPORT, 4);
        this.isRecoverable = bundle.getBoolean(FIELD_IS_RECOVERABLE, false);
        this.mediaPeriodId = null;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ ExoPlaybackException m9355a(Bundle bundle) {
        return new ExoPlaybackException(bundle);
    }

    public static ExoPlaybackException createForRemote(String str) {
        return new ExoPlaybackException(3, null, str, 1001, null, -1, null, 4, false);
    }

    public static ExoPlaybackException createForRenderer(Throwable th, String str, int i, @Nullable C1871k c1871k, int i2, boolean z, int i3) {
        if (c1871k == null) {
            i2 = 4;
        }
        return new ExoPlaybackException(1, th, null, i3, str, i, c1871k, i2, z);
    }

    public static ExoPlaybackException createForSource(IOException iOException, int i) {
        return new ExoPlaybackException(0, iOException, i);
    }

    @Deprecated
    public static ExoPlaybackException createForUnexpected(RuntimeException runtimeException) {
        return createForUnexpected(runtimeException, 1000);
    }

    private static String deriveMessage(int i, @Nullable String str, @Nullable String str2, int i2, @Nullable C1871k c1871k, int i3) {
        String str3;
        if (i == 0) {
            str3 = "Source error";
        } else if (i != 1) {
            str3 = i != 3 ? "Unexpected runtime error" : "Remote error";
        } else {
            str3 = str2 + " error, index=" + i2 + ", format=" + c1871k + ", format_supported=" + vck0.m197837Z(i3);
        }
        if (TextUtils.isEmpty(str)) {
            return str3;
        }
        return str3 + ": " + str;
    }

    @CheckResult
    public ExoPlaybackException copyWithMediaPeriodId(@Nullable ipx ipxVar) {
        return new ExoPlaybackException((String) vck0.m197866j(getMessage()), getCause(), this.errorCode, this.type, this.rendererName, this.rendererIndex, this.rendererFormat, this.rendererFormatSupport, ipxVar, this.timestampMs, this.isRecoverable);
    }

    @Override // com.google.android.exoplayer2.PlaybackException
    public boolean errorInfoEquals(@Nullable PlaybackException playbackException) {
        if (!super.errorInfoEquals(playbackException)) {
            return false;
        }
        ExoPlaybackException exoPlaybackException = (ExoPlaybackException) vck0.m197866j(playbackException);
        return this.type == exoPlaybackException.type && vck0.m197845c(this.rendererName, exoPlaybackException.rendererName) && this.rendererIndex == exoPlaybackException.rendererIndex && vck0.m197845c(this.rendererFormat, exoPlaybackException.rendererFormat) && this.rendererFormatSupport == exoPlaybackException.rendererFormatSupport && vck0.m197845c(this.mediaPeriodId, exoPlaybackException.mediaPeriodId) && this.isRecoverable == exoPlaybackException.isRecoverable;
    }

    public Exception getRendererException() {
        p11.m167013g(this.type == 1);
        return (Exception) p11.m167011e(getCause());
    }

    public IOException getSourceException() {
        p11.m167013g(this.type == 0);
        return (IOException) p11.m167011e(getCause());
    }

    public RuntimeException getUnexpectedException() {
        p11.m167013g(this.type == 2);
        return (RuntimeException) p11.m167011e(getCause());
    }

    @Override // com.google.android.exoplayer2.PlaybackException, com.google.android.exoplayer2.InterfaceC1863e
    public Bundle toBundle() {
        Bundle bundle = super.toBundle();
        bundle.putInt(FIELD_TYPE, this.type);
        bundle.putString(FIELD_RENDERER_NAME, this.rendererName);
        bundle.putInt(FIELD_RENDERER_INDEX, this.rendererIndex);
        C1871k c1871k = this.rendererFormat;
        if (c1871k != null) {
            bundle.putBundle(FIELD_RENDERER_FORMAT, c1871k.toBundle());
        }
        bundle.putInt(FIELD_RENDERER_FORMAT_SUPPORT, this.rendererFormatSupport);
        bundle.putBoolean(FIELD_IS_RECOVERABLE, this.isRecoverable);
        return bundle;
    }

    public static ExoPlaybackException createForUnexpected(RuntimeException runtimeException, int i) {
        return new ExoPlaybackException(2, runtimeException, i);
    }

    private ExoPlaybackException(int i, @Nullable Throwable th, @Nullable String str, int i2, @Nullable String str2, int i3, @Nullable C1871k c1871k, int i4, boolean z) {
        this(deriveMessage(i, str, str2, i3, c1871k, i4), th, i2, i, str2, i3, c1871k, i4, null, SystemClock.elapsedRealtime(), z);
    }

    private ExoPlaybackException(int i, Throwable th, int i2) {
        this(i, th, null, i2, null, -1, null, 4, false);
    }

    private ExoPlaybackException(String str, @Nullable Throwable th, int i, int i2, @Nullable String str2, int i3, @Nullable C1871k c1871k, int i4, @Nullable ipx ipxVar, long j, boolean z) {
        super(str, th, i, j);
        p11.m167007a(!z || i2 == 1);
        p11.m167007a(th != null || i2 == 3);
        this.type = i2;
        this.rendererName = str2;
        this.rendererIndex = i3;
        this.rendererFormat = c1871k;
        this.rendererFormatSupport = i4;
        this.mediaPeriodId = ipxVar;
        this.isRecoverable = z;
    }
}
