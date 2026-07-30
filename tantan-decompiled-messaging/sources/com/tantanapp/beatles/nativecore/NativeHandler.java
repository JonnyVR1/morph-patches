package com.tantanapp.beatles.nativecore;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import p149l.alj0;
import p149l.b2m;
import p149l.bsb;
import p149l.fpl;
import p149l.nml;
import p149l.s620;
import p149l.zs0;

/* JADX INFO: loaded from: classes13.dex */
@SuppressLint({"StaticFieldLeak"})
public class NativeHandler {
    private static final NativeHandler sInstance = new NativeHandler();
    private nml mAnrCallback;
    private boolean mCommonInited;
    private Context mContext;

    /* JADX INFO: renamed from: com.tantanapp.beatles.nativecore.NativeHandler$a */
    public class C13555a implements b2m {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ fpl f55961a;

        public C13555a(fpl fplVar) {
            this.f55961a = fplVar;
        }

        @Override // p149l.b2m
        /* JADX INFO: renamed from: b */
        public void mo81167b(String str, String str2, boolean z, boolean z2, boolean z3, String str3) {
            this.f55961a.mo100390a(str, str2, z, z2, z3, str3);
        }
    }

    /* JADX INFO: renamed from: a */
    public static NativeHandler m81163a() {
        return sInstance;
    }

    private static void crashCallback(String str, String str2, boolean z, boolean z2, boolean z3, String str3) {
        alj0.m97291d().m97294f(str, str2, z, z2, z3, str3);
    }

    private static native int initAnr(boolean z, int i, int i2, int i3, boolean z2, String str, boolean z3);

    private static native int initCommon(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9);

    private static native int initCrash(boolean z, int i, int i2, int i3, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, int i4, String[] strArr, String str);

    private static void traceCallback(String str, String str2) {
        nml nmlVar = m81163a().mAnrCallback;
        if (nmlVar != null) {
            nmlVar.mo124041a(str, str2);
        }
    }

    /* JADX INFO: renamed from: b */
    public int m81164b(zs0 zs0Var, nml nmlVar, String str) {
        if (!this.mCommonInited) {
            return -3;
        }
        if (zs0Var == null) {
            zs0Var = new zs0();
        }
        this.mAnrCallback = nmlVar;
        return initAnr(zs0Var.m219997f(), zs0Var.m219994c(), zs0Var.m219992a(), zs0Var.m219993b(), zs0Var.m219995d(), str, zs0Var.m219996e());
    }

    /* JADX INFO: renamed from: c */
    public int m81165c(Context context, String str, String str2) {
        try {
            System.loadLibrary("xcrash");
            this.mContext = context;
            int iInitCommon = initCommon(Build.VERSION.SDK_INT, Build.VERSION.RELEASE, s620.m182406a(), Build.MANUFACTURER, Build.BRAND, Build.MODEL, Build.FINGERPRINT, str, str2, this.mContext.getApplicationInfo().nativeLibraryDir);
            if (iInitCommon == 0) {
                this.mCommonInited = true;
            }
            return iInitCommon;
        } catch (Throwable th) {
            Log.e("NativeHandler", "NativeHandler System.loadLibrary failed -> e = " + th.getMessage());
            return -2;
        }
    }

    /* JADX INFO: renamed from: d */
    public int m81166d(bsb bsbVar, fpl fplVar, String str) {
        if (!this.mCommonInited) {
            return -3;
        }
        bsb bsbVar2 = bsbVar == null ? new bsb() : bsbVar;
        if (fplVar != null) {
            alj0.m97291d().m97298j(new C13555a(fplVar));
        }
        return initCrash(bsbVar2.m103671l(), bsbVar2.m103664e(), bsbVar2.m103662c(), bsbVar2.m103663d(), bsbVar2.m103667h(), bsbVar2.m103669j(), bsbVar2.m103668i(), bsbVar2.m103670k(), bsbVar2.m103666g(), bsbVar2.m103665f(), bsbVar2.m103660a(), bsbVar2.m103661b(), str);
    }
}
