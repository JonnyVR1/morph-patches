package com.google.android.exoplayer2.drm;

import android.media.DeniedByServerException;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.PlaybackException;
import p153l.bmk0;
import p153l.fig0;

/* JADX INFO: renamed from: com.google.android.exoplayer2.drm.d */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class C1879d {

    /* JADX INFO: renamed from: com.google.android.exoplayer2.drm.d$a */
    @RequiresApi(18)
    public static final class a {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static boolean m9990a(@Nullable Throwable th) {
            return th instanceof DeniedByServerException;
        }

        @DoNotInline
        /* JADX INFO: renamed from: b */
        public static boolean m9991b(@Nullable Throwable th) {
            return th instanceof NotProvisionedException;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.drm.d$b */
    @RequiresApi(21)
    public static final class b {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static boolean m9992a(@Nullable Throwable th) {
            return th instanceof MediaDrm.MediaDrmStateException;
        }

        @DoNotInline
        /* JADX INFO: renamed from: b */
        public static int m9993b(Throwable th) {
            return bmk0.m105111X(bmk0.m105113Y(((MediaDrm.MediaDrmStateException) th).getDiagnosticInfo()));
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.drm.d$c */
    @RequiresApi(23)
    public static final class c {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static boolean m9994a(@Nullable Throwable th) {
            return th instanceof MediaDrmResetException;
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m9989a(Exception exc, int i) {
        int i2 = bmk0.f77313a;
        if (i2 >= 21 && b.m9992a(exc)) {
            return b.m9993b(exc);
        }
        if (i2 >= 23 && c.m9994a(exc)) {
            return PlaybackException.ERROR_CODE_DRM_SYSTEM_ERROR;
        }
        if (i2 >= 18 && a.m9991b(exc)) {
            return 6002;
        }
        if (i2 >= 18 && a.m9990a(exc)) {
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
        fig0.m125680a();
        return 0;
    }
}
