package com.tantanapp.media.ttmediautils.tinker;

import android.util.Log;

/* JADX INFO: loaded from: classes12.dex */
public class TinkerLog {
    private static final String TAG = "Tinker.TinkerLog";
    private static TinkerLogImp debugLog;
    private static TinkerLogImp tinkerLogImp;

    public interface TinkerLogImp {
        /* JADX INFO: renamed from: d */
        void mo82609d(String str, String str2, Object... objArr);

        /* JADX INFO: renamed from: e */
        void mo82610e(String str, String str2, Object... objArr);

        /* JADX INFO: renamed from: i */
        void mo82611i(String str, String str2, Object... objArr);

        void printErrStackTrace(String str, Throwable th, String str2, Object... objArr);

        /* JADX INFO: renamed from: v */
        void mo82612v(String str, String str2, Object... objArr);

        /* JADX INFO: renamed from: w */
        void mo82613w(String str, String str2, Object... objArr);
    }

    static {
        TinkerLogImp tinkerLogImp2 = new TinkerLogImp() { // from class: com.tantanapp.media.ttmediautils.tinker.TinkerLog.1
            @Override // com.tantanapp.media.ttmediautils.tinker.TinkerLog.TinkerLogImp
            /* JADX INFO: renamed from: d */
            public void mo82609d(String str, String str2, Object... objArr) {
                if (objArr == null || objArr.length == 0) {
                    return;
                }
                String.format(str2, objArr);
            }

            @Override // com.tantanapp.media.ttmediautils.tinker.TinkerLog.TinkerLogImp
            /* JADX INFO: renamed from: e */
            public void mo82610e(String str, String str2, Object... objArr) {
                if (objArr != null && objArr.length != 0) {
                    str2 = String.format(str2, objArr);
                }
                Log.e(str, str2);
            }

            @Override // com.tantanapp.media.ttmediautils.tinker.TinkerLog.TinkerLogImp
            /* JADX INFO: renamed from: i */
            public void mo82611i(String str, String str2, Object... objArr) {
                if (objArr == null || objArr.length == 0) {
                    return;
                }
                String.format(str2, objArr);
            }

            @Override // com.tantanapp.media.ttmediautils.tinker.TinkerLog.TinkerLogImp
            public void printErrStackTrace(String str, Throwable th, String str2, Object... objArr) {
                if (objArr != null && objArr.length != 0) {
                    str2 = String.format(str2, objArr);
                }
                if (str2 == null) {
                    str2 = "";
                }
                Log.e(str, str2 + "  " + Log.getStackTraceString(th));
            }

            @Override // com.tantanapp.media.ttmediautils.tinker.TinkerLog.TinkerLogImp
            /* JADX INFO: renamed from: v */
            public void mo82612v(String str, String str2, Object... objArr) {
                if (objArr == null || objArr.length == 0) {
                    return;
                }
                String.format(str2, objArr);
            }

            @Override // com.tantanapp.media.ttmediautils.tinker.TinkerLog.TinkerLogImp
            /* JADX INFO: renamed from: w */
            public void mo82613w(String str, String str2, Object... objArr) {
                if (objArr == null || objArr.length == 0) {
                    return;
                }
                String.format(str2, objArr);
            }
        };
        debugLog = tinkerLogImp2;
        tinkerLogImp = tinkerLogImp2;
    }

    /* JADX INFO: renamed from: d */
    public static void m82604d(String str, String str2, Object... objArr) {
        TinkerLogImp tinkerLogImp2 = tinkerLogImp;
        if (tinkerLogImp2 != null) {
            tinkerLogImp2.mo82609d(str, str2, objArr);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m82605e(String str, String str2, Object... objArr) {
        TinkerLogImp tinkerLogImp2 = tinkerLogImp;
        if (tinkerLogImp2 != null) {
            tinkerLogImp2.mo82610e(str, str2, objArr);
        }
    }

    public static TinkerLogImp getImpl() {
        return tinkerLogImp;
    }

    /* JADX INFO: renamed from: i */
    public static void m82606i(String str, String str2, Object... objArr) {
        TinkerLogImp tinkerLogImp2 = tinkerLogImp;
        if (tinkerLogImp2 != null) {
            tinkerLogImp2.mo82611i(str, str2, objArr);
        }
    }

    public static void printErrStackTrace(String str, Throwable th, String str2, Object... objArr) {
        TinkerLogImp tinkerLogImp2 = tinkerLogImp;
        if (tinkerLogImp2 != null) {
            tinkerLogImp2.printErrStackTrace(str, th, str2, objArr);
        }
    }

    public static void setTinkerLogImp(TinkerLogImp tinkerLogImp2) {
        tinkerLogImp = tinkerLogImp2;
    }

    /* JADX INFO: renamed from: v */
    public static void m82607v(String str, String str2, Object... objArr) {
        TinkerLogImp tinkerLogImp2 = tinkerLogImp;
        if (tinkerLogImp2 != null) {
            tinkerLogImp2.mo82612v(str, str2, objArr);
        }
    }

    /* JADX INFO: renamed from: w */
    public static void m82608w(String str, String str2, Object... objArr) {
        TinkerLogImp tinkerLogImp2 = tinkerLogImp;
        if (tinkerLogImp2 != null) {
            tinkerLogImp2.mo82613w(str, str2, objArr);
        }
    }
}
