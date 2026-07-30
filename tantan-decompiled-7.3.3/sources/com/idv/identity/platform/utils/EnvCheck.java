package com.idv.identity.platform.utils;

import android.os.Build;
import p153l.un0;

/* JADX INFO: loaded from: classes7.dex */
public class EnvCheck {

    public enum EnvErrorType {
        ENV_SUCCESS,
        ENV_ERROR_LOW_OS,
        ENV_ERROR_UNSUPPORTED_CPU,
        ENV_ERROR_NO_PERMISSION_OF_CAMERA,
        ENV_ERROR_NO_FRONT_CAMERA,
        ENV_ERROR_NO_BACK_CAMERA
    }

    /* JADX INFO: renamed from: a */
    public static EnvErrorType m19202a() {
        if (m19206e()) {
            return EnvErrorType.ENV_ERROR_LOW_OS;
        }
        EnvErrorType envErrorTypeM19203b = m19203b();
        EnvErrorType envErrorType = EnvErrorType.ENV_SUCCESS;
        if (envErrorTypeM19203b != envErrorType) {
            return envErrorTypeM19203b;
        }
        EnvErrorType envErrorTypeM19204c = m19204c();
        return envErrorTypeM19204c != envErrorType ? envErrorTypeM19204c : envErrorType;
    }

    /* JADX INFO: renamed from: b */
    public static EnvErrorType m19203b() {
        return un0.m196815a() == -1 ? EnvErrorType.ENV_ERROR_NO_BACK_CAMERA : EnvErrorType.ENV_SUCCESS;
    }

    /* JADX INFO: renamed from: c */
    public static EnvErrorType m19204c() {
        return un0.m196816b() == -1 ? EnvErrorType.ENV_ERROR_NO_FRONT_CAMERA : EnvErrorType.ENV_SUCCESS;
    }

    /* JADX INFO: renamed from: d */
    public static EnvErrorType m19205d() {
        return m19206e() ? EnvErrorType.ENV_ERROR_LOW_OS : EnvErrorType.ENV_SUCCESS;
    }

    /* JADX INFO: renamed from: e */
    private static boolean m19206e() {
        String str = Build.VERSION.SDK;
        return str != null && Integer.parseInt(str) < 18;
    }
}
