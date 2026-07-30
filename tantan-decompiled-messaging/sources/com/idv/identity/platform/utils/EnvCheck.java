package com.idv.identity.platform.utils;

import android.os.Build;
import p149l.yn0;

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
    public static EnvErrorType m18125a() {
        if (m18129e()) {
            return EnvErrorType.ENV_ERROR_LOW_OS;
        }
        EnvErrorType envErrorTypeM18126b = m18126b();
        EnvErrorType envErrorType = EnvErrorType.ENV_SUCCESS;
        if (envErrorTypeM18126b != envErrorType) {
            return envErrorTypeM18126b;
        }
        EnvErrorType envErrorTypeM18127c = m18127c();
        return envErrorTypeM18127c != envErrorType ? envErrorTypeM18127c : envErrorType;
    }

    /* JADX INFO: renamed from: b */
    public static EnvErrorType m18126b() {
        return yn0.m215382a() == -1 ? EnvErrorType.ENV_ERROR_NO_BACK_CAMERA : EnvErrorType.ENV_SUCCESS;
    }

    /* JADX INFO: renamed from: c */
    public static EnvErrorType m18127c() {
        return yn0.m215383b() == -1 ? EnvErrorType.ENV_ERROR_NO_FRONT_CAMERA : EnvErrorType.ENV_SUCCESS;
    }

    /* JADX INFO: renamed from: d */
    public static EnvErrorType m18128d() {
        return m18129e() ? EnvErrorType.ENV_ERROR_LOW_OS : EnvErrorType.ENV_SUCCESS;
    }

    /* JADX INFO: renamed from: e */
    private static boolean m18129e() {
        String str = Build.VERSION.SDK;
        return str != null && Integer.parseInt(str) < 18;
    }
}
