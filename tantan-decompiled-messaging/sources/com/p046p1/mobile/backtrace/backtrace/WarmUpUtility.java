package com.p046p1.mobile.backtrace.backtrace;

import android.content.Context;
import android.os.CancellationSignal;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.p046p1.mobile.backtrace.MatrixLog;
import java.io.File;
import java.io.FileFilter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
class WarmUpUtility {
    private static final String DIR_WECHAT_BACKTRACE = "wechat-backtrace";
    static final long DURATION_CLEAN_UP = 259200000;
    static final long DURATION_CLEAN_UP_EXPIRED = 259200000;
    static final long DURATION_DISK_USAGE_COMPUTATION = 259200000;
    static final long DURATION_LAST_ACCESS_EXPIRED = 5184000000L;
    static final long DURATION_LAST_ACCESS_FAR_FUTURE = 2592000000L;
    private static final String FILE_BLOCKED_LIST = "blocked-list";
    private static final String FILE_CLEAN_UP_TIMESTAMP = "clean-up.timestamp";
    private static final String FILE_DEFAULT_SAVING_PATH = "saving-cache";
    private static final String FILE_DISK_USAGE = "disk-usage.timestamp";
    private static final String FILE_UNFINISHED = "unfinished";
    private static final String FILE_WARMED_UP = "warmed-up";
    private static final String TAG = "Matrix.Backtrace.WarmUp";
    static final String UNFINISHED_KEY_SPLIT = ":";
    static final String UNFINISHED_RETRY_SPLIT = "|";
    static final int WARM_UP_FILE_MAX_RETRY = 3;

    public static class UnfinishedManagement {
        private static Map<String, Integer> mUnfinishedWarmUp;

        public static boolean check(Context context, String str, int i) {
            return retryCount(context, WarmUpUtility.unfinishedKey(str, i)) < 3;
        }

        public static boolean checkAndMark(Context context, String str, int i) {
            String strUnfinishedKey = WarmUpUtility.unfinishedKey(str, i);
            int iRetryCount = retryCount(context, strUnfinishedKey);
            if (iRetryCount >= 3) {
                return false;
            }
            mUnfinishedWarmUp.put(strUnfinishedKey, Integer.valueOf(iRetryCount + 1));
            WarmUpUtility.flushUnfinishedMaps(context, mUnfinishedWarmUp);
            return true;
        }

        public static void result(Context context, String str, int i, boolean z) {
            String strUnfinishedKey = WarmUpUtility.unfinishedKey(str, i);
            int iRetryCount = retryCount(context, strUnfinishedKey);
            if (z) {
                mUnfinishedWarmUp.remove(strUnfinishedKey);
            } else {
                mUnfinishedWarmUp.put(strUnfinishedKey, Integer.valueOf(iRetryCount + 1));
            }
            WarmUpUtility.flushUnfinishedMaps(context, mUnfinishedWarmUp);
        }

        private static int retryCount(Context context, String str) {
            if (mUnfinishedWarmUp == null) {
                mUnfinishedWarmUp = WarmUpUtility.readUnfinishedMaps(context);
            }
            Integer num = mUnfinishedWarmUp.get(str);
            if (num != null) {
                return num.intValue();
            }
            return 0;
        }
    }

    public static File cleanUpTimestampFile(Context context) {
        File file = new File(context.getFilesDir().getAbsolutePath() + "/wechat-backtrace/clean-up.timestamp");
        file.getParentFile().mkdirs();
        return file;
    }

    public static String defaultSavingPath(WeChatBacktrace.Configuration configuration) {
        return configuration.mContext.getFilesDir().getAbsolutePath() + "/wechat-backtrace/saving-cache/";
    }

    public static File diskUsageFile(Context context) {
        File file = new File(context.getFilesDir().getAbsolutePath() + "/wechat-backtrace/disk-usage.timestamp");
        file.getParentFile().mkdirs();
        return file;
    }

    public static void flushUnfinishedMaps(Context context, Map<String, Integer> map) {
        File fileUnfinishedFile = unfinishedFile(context);
        StringBuffer stringBuffer = new StringBuffer();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            stringBuffer.append(entry.getKey() + UNFINISHED_RETRY_SPLIT + entry.getValue() + SignParameters.NEW_LINE);
        }
        writeContentToFile(fileUnfinishedFile, stringBuffer.toString());
    }

    public static boolean hasWarmedUp(Context context) {
        return warmUpMarkedFile(context).exists();
    }

    public static void iterateTargetDirectory(File file, CancellationSignal cancellationSignal, FileFilter fileFilter) {
        if (!file.isDirectory()) {
            fileFilter.accept(file);
            cancellationSignal.throwIfCanceled();
            return;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                iterateTargetDirectory(file2, cancellationSignal, fileFilter);
                cancellationSignal.throwIfCanceled();
            }
        }
    }

    public static void markCleanUpTimestamp(Context context) {
        File fileCleanUpTimestampFile = cleanUpTimestampFile(context);
        try {
            fileCleanUpTimestampFile.createNewFile();
            fileCleanUpTimestampFile.setLastModified(System.currentTimeMillis());
        } catch (IOException e) {
            MatrixLog.printErrStackTrace(TAG, e, "", new Object[0]);
        }
    }

    public static void markComputeDiskUsageTimestamp(Context context) {
        File fileDiskUsageFile = diskUsageFile(context);
        try {
            fileDiskUsageFile.createNewFile();
            fileDiskUsageFile.setLastModified(System.currentTimeMillis());
        } catch (IOException e) {
            MatrixLog.printErrStackTrace(TAG, e, "", new Object[0]);
        }
    }

    public static boolean needCleanUp(Context context) {
        File fileCleanUpTimestampFile = cleanUpTimestampFile(context);
        if (fileCleanUpTimestampFile.exists()) {
            return System.currentTimeMillis() - fileCleanUpTimestampFile.lastModified() >= 259200000;
        }
        try {
            fileCleanUpTimestampFile.createNewFile();
        } catch (IOException e) {
            MatrixLog.printErrStackTrace(TAG, e, "", new Object[0]);
        }
        return false;
    }

    public static boolean pathValidation(WeChatBacktrace.Configuration configuration) {
        if (configuration.mSavingPath == null) {
            return false;
        }
        try {
            if (new File(configuration.mSavingPath).getCanonicalPath().startsWith(configuration.mContext.getFilesDir().getParentFile().getCanonicalFile().getAbsolutePath())) {
                return true;
            }
            MatrixLog.m21185e(TAG, "Saving path should under private storage path %s", configuration.mContext.getFilesDir().getParentFile().getAbsolutePath());
        } catch (IOException e) {
            MatrixLog.printErrStackTrace(TAG, e, "", new Object[0]);
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0060 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002d, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002e, code lost:
    
        com.p046p1.mobile.backtrace.MatrixLog.printErrStackTrace(com.p046p1.mobile.backtrace.backtrace.WarmUpUtility.TAG, r8, "", new java.lang.Object[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
    
        return null;
     */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x0035: MOVE (r3 I:??[OBJECT, ARRAY]) = (r5 I:??[OBJECT, ARRAY]) (LINE:54), block:B:19:0x0035 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String readFileContent(java.io.File r8, int r9) throws java.lang.Throwable {
        /*
            java.lang.String r0 = ""
            java.lang.String r1 = "Matrix.Backtrace.WarmUp"
            boolean r2 = r8.isFile()
            r3 = 0
            if (r2 == 0) goto L6b
            r2 = 0
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L4a
            r5 = 4096(0x1000, float:5.74E-42)
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L4a
            java.io.FileReader r5 = new java.io.FileReader     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L4a
            r5.<init>(r8)     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L4a
            r8 = 1024(0x400, float:1.435E-42)
            char[] r8 = new char[r8]     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L37
            r6 = r2
        L1d:
            int r7 = r5.read(r8)     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L37
            if (r7 <= 0) goto L39
            r4.append(r8, r2, r7)     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L37
            int r6 = r6 + r7
            if (r6 <= r9) goto L1d
            r5.close()     // Catch: java.io.IOException -> L2d
            return r3
        L2d:
            r8 = move-exception
            java.lang.Object[] r9 = new java.lang.Object[r2]
            com.p046p1.mobile.backtrace.MatrixLog.printErrStackTrace(r1, r8, r0, r9)
            return r3
        L34:
            r8 = move-exception
            r3 = r5
            goto L5e
        L37:
            r8 = move-exception
            goto L4c
        L39:
            java.lang.String r8 = r4.toString()     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L37
            r5.close()     // Catch: java.io.IOException -> L41
            return r8
        L41:
            r9 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r2]
            com.p046p1.mobile.backtrace.MatrixLog.printErrStackTrace(r1, r9, r0, r2)
            return r8
        L48:
            r8 = move-exception
            goto L5e
        L4a:
            r8 = move-exception
            r5 = r3
        L4c:
            java.lang.Object[] r9 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L34
            com.p046p1.mobile.backtrace.MatrixLog.printErrStackTrace(r1, r8, r0, r9)     // Catch: java.lang.Throwable -> L34
            if (r5 == 0) goto L6b
            r5.close()     // Catch: java.io.IOException -> L57
            goto L6b
        L57:
            r8 = move-exception
            java.lang.Object[] r9 = new java.lang.Object[r2]
            com.p046p1.mobile.backtrace.MatrixLog.printErrStackTrace(r1, r8, r0, r9)
            goto L6b
        L5e:
            if (r3 == 0) goto L6a
            r3.close()     // Catch: java.io.IOException -> L64
            goto L6a
        L64:
            r9 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r2]
            com.p046p1.mobile.backtrace.MatrixLog.printErrStackTrace(r1, r9, r0, r2)
        L6a:
            throw r8
        L6b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p046p1.mobile.backtrace.backtrace.WarmUpUtility.readFileContent(java.io.File, int):java.lang.String");
    }

    public static Map<String, Integer> readUnfinishedMaps(Context context) throws Throwable {
        HashMap map = new HashMap();
        File fileUnfinishedFile = unfinishedFile(context);
        String fileContent = readFileContent(fileUnfinishedFile, 512000);
        if (fileContent == null) {
            MatrixLog.m21188w(TAG, "Read unfinished maps file failed, file size %s", Long.valueOf(fileUnfinishedFile.length()));
            if (fileUnfinishedFile.length() > 512000) {
                fileUnfinishedFile.delete();
                return map;
            }
        } else {
            for (String str : fileContent.split(SignParameters.NEW_LINE)) {
                int iLastIndexOf = str.lastIndexOf(UNFINISHED_RETRY_SPLIT);
                if (iLastIndexOf >= 0) {
                    try {
                        map.put(str.substring(0, iLastIndexOf), Integer.valueOf(Integer.parseInt(str.substring(iLastIndexOf + 1))));
                    } catch (Throwable th) {
                        MatrixLog.printErrStackTrace(TAG, th, "", new Object[0]);
                    }
                }
            }
        }
        return map;
    }

    public static boolean shouldComputeDiskUsage(Context context) {
        File fileDiskUsageFile = diskUsageFile(context);
        if (fileDiskUsageFile.exists()) {
            return System.currentTimeMillis() - fileDiskUsageFile.lastModified() >= 259200000;
        }
        try {
            fileDiskUsageFile.createNewFile();
        } catch (IOException e) {
            MatrixLog.printErrStackTrace(TAG, e, "", new Object[0]);
        }
        return false;
    }

    public static File unfinishedFile(Context context) {
        File file = new File(context.getFilesDir().getAbsolutePath() + "/wechat-backtrace/unfinished");
        file.getParentFile().mkdirs();
        if (!file.exists()) {
            try {
                file.createNewFile();
                return file;
            } catch (IOException e) {
                MatrixLog.printErrStackTrace(TAG, e, "", new Object[0]);
            }
        }
        return file;
    }

    public static String unfinishedKey(String str, int i) {
        return str + UNFINISHED_KEY_SPLIT + i;
    }

    public static String validateSavingPath(WeChatBacktrace.Configuration configuration) {
        return pathValidation(configuration) ? configuration.mSavingPath : defaultSavingPath(configuration);
    }

    public static File warmUpMarkedFile(Context context) {
        File file = new File(context.getFilesDir().getAbsolutePath() + "/wechat-backtrace/warmed-up");
        file.getParentFile().mkdirs();
        return file;
    }

    public static boolean writeContentToFile(File file, String str) {
        if (file.isFile()) {
            FileWriter fileWriter = null;
            try {
                try {
                    FileWriter fileWriter2 = new FileWriter(file);
                    try {
                        fileWriter2.write(str);
                        try {
                            fileWriter2.close();
                            return true;
                        } catch (IOException e) {
                            MatrixLog.printErrStackTrace(TAG, e, "", new Object[0]);
                            return true;
                        }
                    } catch (Exception e2) {
                        e = e2;
                        fileWriter = fileWriter2;
                        MatrixLog.printErrStackTrace(TAG, e, "", new Object[0]);
                        if (fileWriter != null) {
                            try {
                                fileWriter.close();
                            } catch (IOException e3) {
                                MatrixLog.printErrStackTrace(TAG, e3, "", new Object[0]);
                            }
                        }
                        return false;
                    } catch (Throwable th) {
                        th = th;
                        fileWriter = fileWriter2;
                        if (fileWriter != null) {
                            try {
                                fileWriter.close();
                            } catch (IOException e4) {
                                MatrixLog.printErrStackTrace(TAG, e4, "", new Object[0]);
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Exception e5) {
                e = e5;
            }
        }
        return false;
    }
}
