package com.p051p1.mobile.backtrace;

import android.util.Log;

/* JADX INFO: loaded from: classes8.dex */
public class MatrixLog {
    private static MatrixLogImp debugLog;
    private static MatrixLogImp matrixLogImp;

    public interface MatrixLogImp {
        /* JADX INFO: renamed from: d */
        void mo22188d(String str, String str2, Object... objArr);

        /* JADX INFO: renamed from: e */
        void mo22189e(String str, String str2, Object... objArr);

        /* JADX INFO: renamed from: i */
        void mo22190i(String str, String str2, Object... objArr);

        void printErrStackTrace(String str, Throwable th, String str2, Object... objArr);

        /* JADX INFO: renamed from: v */
        void mo22191v(String str, String str2, Object... objArr);

        /* JADX INFO: renamed from: w */
        void mo22192w(String str, String str2, Object... objArr);
    }

    static {
        MatrixLogImp matrixLogImp2 = new MatrixLogImp() { // from class: com.p1.mobile.backtrace.MatrixLog.1
            @Override // com.p1.mobile.backtrace.MatrixLog.MatrixLogImp
            /* JADX INFO: renamed from: d */
            public void mo22188d(String str, String str2, Object... objArr) {
                if (objArr == null || objArr.length == 0) {
                    return;
                }
                String.format(str2, objArr);
            }

            @Override // com.p1.mobile.backtrace.MatrixLog.MatrixLogImp
            /* JADX INFO: renamed from: e */
            public void mo22189e(String str, String str2, Object... objArr) {
                if (objArr != null && objArr.length != 0) {
                    str2 = String.format(str2, objArr);
                }
                Log.e(str, str2);
            }

            @Override // com.p1.mobile.backtrace.MatrixLog.MatrixLogImp
            /* JADX INFO: renamed from: i */
            public void mo22190i(String str, String str2, Object... objArr) {
                if (objArr == null || objArr.length == 0) {
                    return;
                }
                String.format(str2, objArr);
            }

            @Override // com.p1.mobile.backtrace.MatrixLog.MatrixLogImp
            public void printErrStackTrace(String str, Throwable th, String str2, Object... objArr) {
                if (objArr != null && objArr.length != 0) {
                    str2 = String.format(str2, objArr);
                }
                if (str2 == null) {
                    str2 = "";
                }
                Log.e(str, str2 + "  " + Log.getStackTraceString(th));
            }

            @Override // com.p1.mobile.backtrace.MatrixLog.MatrixLogImp
            /* JADX INFO: renamed from: v */
            public void mo22191v(String str, String str2, Object... objArr) {
                if (objArr == null || objArr.length == 0) {
                    return;
                }
                String.format(str2, objArr);
            }

            @Override // com.p1.mobile.backtrace.MatrixLog.MatrixLogImp
            /* JADX INFO: renamed from: w */
            public void mo22192w(String str, String str2, Object... objArr) {
                if (objArr == null || objArr.length == 0) {
                    return;
                }
                String.format(str2, objArr);
            }
        };
        debugLog = matrixLogImp2;
        matrixLogImp = matrixLogImp2;
    }

    private MatrixLog() {
    }

    /* JADX INFO: renamed from: d */
    public static void m22183d(String str, String str2, Object... objArr) {
        MatrixLogImp matrixLogImp2 = matrixLogImp;
        if (matrixLogImp2 != null) {
            matrixLogImp2.mo22188d(str, str2, objArr);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m22184e(String str, String str2, Object... objArr) {
        MatrixLogImp matrixLogImp2 = matrixLogImp;
        if (matrixLogImp2 != null) {
            matrixLogImp2.mo22189e(str, str2, objArr);
        }
    }

    public static MatrixLogImp getImpl() {
        return matrixLogImp;
    }

    /* JADX INFO: renamed from: i */
    public static void m22185i(String str, String str2, Object... objArr) {
        MatrixLogImp matrixLogImp2 = matrixLogImp;
        if (matrixLogImp2 != null) {
            matrixLogImp2.mo22190i(str, str2, objArr);
        }
    }

    public static void printErrStackTrace(String str, Throwable th, String str2, Object... objArr) {
        MatrixLogImp matrixLogImp2 = matrixLogImp;
        if (matrixLogImp2 != null) {
            matrixLogImp2.printErrStackTrace(str, th, str2, objArr);
        }
    }

    public static void setMatrixLogImp(MatrixLogImp matrixLogImp2) {
        matrixLogImp = matrixLogImp2;
    }

    /* JADX INFO: renamed from: v */
    public static void m22186v(String str, String str2, Object... objArr) {
        MatrixLogImp matrixLogImp2 = matrixLogImp;
        if (matrixLogImp2 != null) {
            matrixLogImp2.mo22191v(str, str2, objArr);
        }
    }

    /* JADX INFO: renamed from: w */
    public static void m22187w(String str, String str2, Object... objArr) {
        MatrixLogImp matrixLogImp2 = matrixLogImp;
        if (matrixLogImp2 != null) {
            matrixLogImp2.mo22192w(str, str2, objArr);
        }
    }
}
