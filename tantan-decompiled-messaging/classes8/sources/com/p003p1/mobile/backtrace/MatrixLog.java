package com.p003p1.mobile.backtrace;

import android.util.Log;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class MatrixLog {
    private static MatrixLogImp debugLog;
    private static MatrixLogImp matrixLogImp;

    public interface MatrixLogImp {
        /* JADX INFO: renamed from: d */
        void mo1461d(String str, String str2, Object... objArr);

        /* JADX INFO: renamed from: e */
        void mo1462e(String str, String str2, Object... objArr);

        /* JADX INFO: renamed from: i */
        void mo1463i(String str, String str2, Object... objArr);

        void printErrStackTrace(String str, Throwable th, String str2, Object... objArr);

        /* JADX INFO: renamed from: v */
        void mo1464v(String str, String str2, Object... objArr);

        /* JADX INFO: renamed from: w */
        void mo1465w(String str, String str2, Object... objArr);
    }

    static {
        MatrixLogImp matrixLogImp2 = new MatrixLogImp() { // from class: com.p1.mobile.backtrace.MatrixLog.1
            @Override // com.p1.mobile.backtrace.MatrixLog.MatrixLogImp
            /* JADX INFO: renamed from: d */
            public void mo1461d(String str, String str2, Object... objArr) {
                if (objArr == null || objArr.length == 0) {
                    return;
                }
                String.format(str2, objArr);
            }

            @Override // com.p1.mobile.backtrace.MatrixLog.MatrixLogImp
            /* JADX INFO: renamed from: e */
            public void mo1462e(String str, String str2, Object... objArr) {
                if (objArr != null && objArr.length != 0) {
                    str2 = String.format(str2, objArr);
                }
                Log.e(str, str2);
            }

            @Override // com.p1.mobile.backtrace.MatrixLog.MatrixLogImp
            /* JADX INFO: renamed from: i */
            public void mo1463i(String str, String str2, Object... objArr) {
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
            public void mo1464v(String str, String str2, Object... objArr) {
                if (objArr == null || objArr.length == 0) {
                    return;
                }
                String.format(str2, objArr);
            }

            @Override // com.p1.mobile.backtrace.MatrixLog.MatrixLogImp
            /* JADX INFO: renamed from: w */
            public void mo1465w(String str, String str2, Object... objArr) {
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
    public static void m1456d(String str, String str2, Object... objArr) {
        MatrixLogImp matrixLogImp2 = matrixLogImp;
        if (matrixLogImp2 != null) {
            matrixLogImp2.mo1461d(str, str2, objArr);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m1457e(String str, String str2, Object... objArr) {
        MatrixLogImp matrixLogImp2 = matrixLogImp;
        if (matrixLogImp2 != null) {
            matrixLogImp2.mo1462e(str, str2, objArr);
        }
    }

    public static MatrixLogImp getImpl() {
        return matrixLogImp;
    }

    /* JADX INFO: renamed from: i */
    public static void m1458i(String str, String str2, Object... objArr) {
        MatrixLogImp matrixLogImp2 = matrixLogImp;
        if (matrixLogImp2 != null) {
            matrixLogImp2.mo1463i(str, str2, objArr);
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
    public static void m1459v(String str, String str2, Object... objArr) {
        MatrixLogImp matrixLogImp2 = matrixLogImp;
        if (matrixLogImp2 != null) {
            matrixLogImp2.mo1464v(str, str2, objArr);
        }
    }

    /* JADX INFO: renamed from: w */
    public static void m1460w(String str, String str2, Object... objArr) {
        MatrixLogImp matrixLogImp2 = matrixLogImp;
        if (matrixLogImp2 != null) {
            matrixLogImp2.mo1465w(str, str2, objArr);
        }
    }
}
