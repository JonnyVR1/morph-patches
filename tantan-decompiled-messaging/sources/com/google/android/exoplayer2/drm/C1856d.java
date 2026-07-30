package com.google.android.exoplayer2.drm;

import android.media.DeniedByServerException;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.PlaybackException;
import p149l.vck0;
import p149l.x9g0;

/* JADX INFO: renamed from: com.google.android.exoplayer2.drm.d */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class C1856d {

    /* JADX INFO: renamed from: com.google.android.exoplayer2.drm.d$a */
    @RequiresApi(18)
    public static final class a {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static boolean m9936a(@Nullable Throwable th) {
            return th instanceof DeniedByServerException;
        }

        @DoNotInline
        /* JADX INFO: renamed from: b */
        public static boolean m9937b(@Nullable Throwable th) {
            return th instanceof NotProvisionedException;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.drm.d$b */
    @RequiresApi(21)
    public static final class b {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static boolean m9938a(@Nullable Throwable th) {
            return th instanceof MediaDrm.MediaDrmStateException;
        }

        @DoNotInline
        /* JADX INFO: renamed from: b */
        public static int m9939b(Throwable th) {
            return vck0.m197833X(vck0.m197835Y(((MediaDrm.MediaDrmStateException) th).getDiagnosticInfo()));
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.drm.d$c */
    @RequiresApi(23)
    public static final class c {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static boolean m9940a(@Nullable Throwable th) {
            return th instanceof MediaDrmResetException;
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m9935a(Exception exc, int i) {
        int i2 = vck0.f180948a;
        if (i2 >= 21 && b.m9938a(exc)) {
            return b.m9939b(exc);
        }
        if (i2 >= 23 && c.m9940a(exc)) {
            return PlaybackException.ERROR_CODE_DRM_SYSTEM_ERROR;
        }
        if (i2 >= 18 && a.m9937b(exc)) {
            return 6002;
        }
        if (i2 >= 18 && a.m9936a(exc)) {
            return PlaybackException.ERROR_CODE_DRM_DEVICE_REVOKED;
        }
        if (exc instanceof UnsupportedDrmException) {
            return 6001;
        }
        if (exc instanceof DefaultDrmSessionManager.MissingSchemeDataException) {
            return 6003;
        }
        if (exc instanceof KeysExpiredException) {
            return PlaybackException.ERROR_CODE_DRM_LICENSE_EXPIRED;
        }
        if (i == 1) {
            return PlaybackException.ERROR_CODE_DRM_SYSTEM_ERROR;
        }
        if (i == 2) {
            return 6004;
        }
        if (i == 3) {
            return 6002;
        }
        x9g0.m207497a();
        return 0;
    }
}
