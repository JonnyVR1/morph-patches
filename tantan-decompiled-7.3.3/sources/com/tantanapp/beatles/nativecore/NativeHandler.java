package com.tantanapp.beatles.nativecore;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import p153l.af20;
import p153l.duj0;
import p153l.et0;
import p153l.ptb;
import p153l.rrl;
import p153l.u4m;
import p153l.zol;

/* JADX INFO: loaded from: classes11.dex */
@SuppressLint({"StaticFieldLeak"})
public class NativeHandler {
    private static final NativeHandler sInstance = new NativeHandler();
    private zol mAnrCallback;
    private boolean mCommonInited;
    private Context mContext;

    /* JADX INFO: renamed from: com.tantanapp.beatles.nativecore.NativeHandler$a */
    public class C13718a implements u4m {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ rrl f56809a;

        public C13718a(rrl rrlVar) {
            this.f56809a = rrlVar;
        }

        @Override // p153l.u4m
        /* JADX INFO: renamed from: b */
        public void mo82350b(String str, String str2, boolean z, boolean z2, boolean z3, String str3) {
            this.f56809a.mo144518a(str, str2, z, z2, z3, str3);
        }
    }

    /* JADX INFO: renamed from: a */
    public static NativeHandler m82346a() {
        return sInstance;
    }

    private static void crashCallback(String str, String str2, boolean z, boolean z2, boolean z3, String str3) {
        duj0.m118149d().m118152f(str, str2, z, z2, z3, str3);
    }

    private static native int initAnr(boolean z, int i, int i2, int i3, boolean z2, String str, boolean z3);

    private static native int initCommon(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9);

    private static native int initCrash(boolean z, int i, int i2, int i3, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, int i4, String[] strArr, String str);

    private static void traceCallback(String str, String str2) {
        zol zolVar = m82346a().mAnrCallback;
        if (zolVar != null) {
            zolVar.mo128485a(str, str2);
        }
    }

    /* JADX INFO: renamed from: b */
    public int m82347b(et0 et0Var, zol zolVar, String str) {
        if (!this.mCommonInited) {
            return -3;
        }
        if (et0Var == null) {
            et0Var = new et0();
        }
        this.mAnrCallback = zolVar;
        return initAnr(et0Var.m122407f(), et0Var.m122404c(), et0Var.m122402a(), et0Var.m122403b(), et0Var.m122405d(), str, et0Var.m122406e());
    }

    /* JADX INFO: renamed from: c */
    public int m82348c(Context context, String str, String str2) {
        try {
            System.loadLibrary("xcrash");
            this.mContext = context;
            int iInitCommon = initCommon(Build.VERSION.SDK_INT, Build.VERSION.RELEASE, af20.m97277a(), Build.MANUFACTURER, Build.BRAND, Build.MODEL, Build.FINGERPRINT, str, str2, this.mContext.getApplicationInfo().nativeLibraryDir);
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
    public int m82349d(ptb ptbVar, rrl rrlVar, String str) {
        if (!this.mCommonInited) {
            return -3;
        }
        ptb ptbVar2 = ptbVar == null ? new ptb() : ptbVar;
        if (rrlVar != null) {
            duj0.m118149d().m118156j(new C13718a(rrlVar));
        }
        return initCrash(ptbVar2.m173764l(), ptbVar2.m173757e(), ptbVar2.m173755c(), ptbVar2.m173756d(), ptbVar2.m173760h(), ptbVar2.m173762j(), ptbVar2.m173761i(), ptbVar2.m173763k(), ptbVar2.m173759g(), ptbVar2.m173758f(), ptbVar2.m173753a(), ptbVar2.m173754b(), str);
    }
}
