package com.idv.identity.platform.log;

import android.content.Context;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import android.util.Log;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import p149l.hc20;
import p149l.ixq0;
import p149l.kcm;
import p149l.kuj0;
import p149l.ncm;

/* JADX INFO: loaded from: classes7.dex */
public class RecordService {
    private static final int MAX_RECORD_COUNT = 10;
    private static RecordService s_instance = new RecordService();
    private static String LOG_FILE_NAME = "idv_identity_platform_log";
    private SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");
    private int clientIdx = 0;
    private List<RecordBase> records = new ArrayList();

    /* JADX INFO: Access modifiers changed from: private */
    public void cacheLogs(List<String> list) {
        FileWriter fileWriter;
        StringBuilder sb;
        synchronized (RecordService.class) {
            try {
                if (list.size() == 0) {
                    return;
                }
                String logFilePath = RecordConst.getLogFilePath();
                if (!TextUtils.isEmpty(logFilePath)) {
                    File file = new File(logFilePath);
                    if (file.exists() && file.length() > PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) {
                        file.delete();
                    }
                }
                BufferedWriter bufferedWriter = null;
                try {
                    fileWriter = new FileWriter(logFilePath, true);
                    try {
                        try {
                            BufferedWriter bufferedWriter2 = new BufferedWriter(fileWriter);
                            try {
                                Iterator<String> it = list.iterator();
                                while (it.hasNext()) {
                                    bufferedWriter2.write(it.next());
                                    bufferedWriter2.write(SignParameters.NEW_LINE);
                                }
                                try {
                                    bufferedWriter2.close();
                                    fileWriter.close();
                                } catch (Exception e) {
                                    sb = new StringBuilder();
                                    sb.append("cacheLog error: ");
                                    sb.append(e.getMessage());
                                    ixq0.m138886c(sb.toString());
                                }
                            } catch (Exception e2) {
                                e = e2;
                                bufferedWriter = bufferedWriter2;
                                ixq0.m138886c("cacheLog error: " + e.getMessage());
                                if (bufferedWriter != null) {
                                    try {
                                        bufferedWriter.close();
                                    } catch (Exception e3) {
                                        sb = new StringBuilder();
                                        sb.append("cacheLog error: ");
                                        sb.append(e3.getMessage());
                                        ixq0.m138886c(sb.toString());
                                    }
                                }
                                if (fileWriter != null) {
                                    fileWriter.close();
                                }
                            } catch (Throwable th) {
                                th = th;
                                bufferedWriter = bufferedWriter2;
                                if (bufferedWriter != null) {
                                    try {
                                        bufferedWriter.close();
                                    } catch (Exception e4) {
                                        ixq0.m138886c("cacheLog error: " + e4.getMessage());
                                        throw th;
                                    }
                                }
                                if (fileWriter != null) {
                                    fileWriter.close();
                                }
                                throw th;
                            }
                        } catch (Exception e5) {
                            e = e5;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (Exception e6) {
                    e = e6;
                    fileWriter = null;
                } catch (Throwable th3) {
                    th = th3;
                    fileWriter = null;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    private void deleteLogFile() {
        File file = new File(RecordConst.getLogFilePath());
        if (file.exists()) {
            file.delete();
        }
    }

    public static RecordService getInstance() {
        return s_instance;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0059 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x005b A[Catch: Exception -> 0x005e, TRY_LEAVE, TryCatch #1 {Exception -> 0x005e, blocks: (B:34:0x0056, B:36:0x005b), top: B:41:0x0056 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x0056 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    private List<String> readCacheLogs() throws Throwable {
        BufferedReader bufferedReader;
        FileReader fileReader;
        Exception e;
        ArrayList arrayList = new ArrayList();
        String logFilePath = RecordConst.getLogFilePath();
        File file = new File(logFilePath);
        if (file.exists()) {
            FileReader fileReader2 = null;
            try {
                try {
                    fileReader = new FileReader(logFilePath);
                    try {
                        bufferedReader = new BufferedReader(fileReader);
                        while (true) {
                            try {
                                try {
                                    String line = bufferedReader.readLine();
                                    if (line == null) {
                                        break;
                                    }
                                    arrayList.add(line);
                                } catch (Exception e2) {
                                    e = e2;
                                    e.printStackTrace();
                                    if (fileReader != null) {
                                        fileReader.close();
                                    }
                                    if (bufferedReader != null) {
                                    }
                                    file.delete();
                                    return arrayList;
                                }
                            } catch (Throwable th) {
                                th = th;
                                fileReader2 = fileReader;
                                if (fileReader2 != null) {
                                    try {
                                        fileReader2.close();
                                        if (bufferedReader != null) {
                                            bufferedReader.close();
                                        }
                                    } catch (Exception unused) {
                                        file.delete();
                                        throw th;
                                    }
                                } else if (bufferedReader != null) {
                                    bufferedReader.close();
                                }
                                file.delete();
                                throw th;
                            }
                        }
                        fileReader.close();
                    } catch (Exception e3) {
                        e = e3;
                        bufferedReader = null;
                    } catch (Throwable th2) {
                        th = th2;
                        bufferedReader = null;
                        fileReader2 = fileReader;
                        if (fileReader2 != null) {
                            fileReader2.close();
                            if (bufferedReader != null) {
                                bufferedReader.close();
                            }
                        } else if (bufferedReader != null) {
                            bufferedReader.close();
                        }
                        file.delete();
                        throw th;
                    }
                } catch (Exception unused2) {
                }
            } catch (Exception e4) {
                fileReader = null;
                e = e4;
                bufferedReader = null;
            } catch (Throwable th3) {
                th = th3;
                bufferedReader = null;
                if (fileReader2 != null) {
                    fileReader2.close();
                    if (bufferedReader != null) {
                        bufferedReader.close();
                    }
                } else if (bufferedReader != null) {
                    bufferedReader.close();
                }
                file.delete();
                throw th;
            }
            bufferedReader.close();
            file.delete();
        }
        return arrayList;
    }

    public static void recordAlertAppear(String str) {
        String str2;
        if (ncm.f138196f.equalsIgnoreCase(str)) {
            str2 = "exitAlertAppear";
        } else if (str.equalsIgnoreCase("CODE_OVER_TIME")) {
            str2 = "timeOutAlertAppear";
        } else {
            str2 = str.equalsIgnoreCase(ncm.f138202l) ? "overTimesAlertAppear" : "interruptedAlertAppear";
        }
        getInstance().recordEventBehavior(RecordLevel.LOG_INFO, "PAGER_BEHAVIOR", str2, "FACE");
    }

    public static void recordAlertBtn(String str) {
        String str2;
        if (ncm.f138196f.equalsIgnoreCase(str)) {
            str2 = "exitConfirmBtn";
        } else if (str.equalsIgnoreCase("CODE_OVER_TIME")) {
            str2 = "timeOutRetryBtn";
        } else {
            str2 = str.equalsIgnoreCase(ncm.f138202l) ? "overTimesExitBtn" : "interruptedRetryBtn";
        }
        getInstance().recordEventBehavior(RecordLevel.LOG_INFO, "PAGER_BEHAVIOR", str2, "FACE");
    }

    public static void recordAlertCancel(String str) {
        String str2;
        if (ncm.f138196f.equalsIgnoreCase(str)) {
            str2 = "exitCancelBtn";
        } else if (str.equalsIgnoreCase("CODE_OVER_TIME")) {
            str2 = "timeOutExitBtn";
        } else {
            str2 = str.equalsIgnoreCase(ncm.f138202l) ? "overTimesExitBtn" : "interruptedRetryBtn";
        }
        getInstance().recordEventBehavior(RecordLevel.LOG_INFO, "PAGER_BEHAVIOR", str2, "FACE");
    }

    public static void recordAlertClose(String str) {
        String str2;
        if (ncm.f138196f.equalsIgnoreCase(str)) {
            str2 = "exitAlertClose";
        } else if (str.equalsIgnoreCase("CODE_OVER_TIME")) {
            str2 = "timeOutAlertClose";
        } else {
            str2 = str.equalsIgnoreCase(ncm.f138202l) ? "overTimesAlertClose" : "interruptedAlertClose";
        }
        getInstance().recordEventBehavior(RecordLevel.LOG_INFO, "PAGER_BEHAVIOR", str2, "FACE");
    }

    private void recordEventEx(RecordLevel recordLevel, String str, String... strArr) {
        int i = this.clientIdx + 1;
        this.clientIdx = i;
        if (i > 10000) {
            this.clientIdx = 0;
        }
        EventRecord eventRecord = new EventRecord();
        eventRecord.setLogIdx(String.valueOf(this.clientIdx));
        eventRecord.setLogLevel(String.valueOf(recordLevel));
        eventRecord.setActionName(str);
        HashMap map = new HashMap();
        if (strArr != null && strArr.length % 2 == 0) {
            for (int i2 = 0; i2 < strArr.length - 1; i2 += 2) {
                map.put(strArr[i2], strArr[i2 + 1]);
            }
        }
        if (map.isEmpty()) {
            return;
        }
        ixq0.m138884a("action(" + this.clientIdx + ")=> " + str + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + map.toString());
        eventRecord.setBizParam(map);
        this.records.add(eventRecord);
        tryUpload(false);
    }

    public static void recordOcrAlertAppear(String str, String str2) {
        String str3 = "interruptedAlertAppear";
        if (!"ocr_failed_code".equalsIgnoreCase(str)) {
            if ("ocr_over_time_code".equalsIgnoreCase(str)) {
                str3 = "overTimesAlertAppear";
            } else if ("ocr_exit_code".equalsIgnoreCase(str)) {
                str3 = "exitAlertAppear";
            } else if (!"ocr_network_error_code".equalsIgnoreCase(str)) {
                if ("ocr_out_time_code".equalsIgnoreCase(str)) {
                    str3 = "timeOutAlertAppear";
                } else if (!"ocr_msg_error_code".equalsIgnoreCase(str) && !"OCR_PERM_ERROR_CODE".equalsIgnoreCase(str) && !"OCR_TYPE_ERROR_CODE".equalsIgnoreCase(str) && !"ORC_RES_PAGE_EXIT_CODE".equalsIgnoreCase(str) && !"ORC_RES_PAGE_NET_ERROR_CODE".equalsIgnoreCase(str)) {
                    "ORC_RES_PAGE_INFO_EMPTY_CODE".equalsIgnoreCase(str);
                }
            }
        }
        getInstance().recordEventBehavior(RecordLevel.LOG_INFO, "PAGER_BEHAVIOR", str3, "OCR_SCAN");
    }

    public static void recordOcrAlertCancel(String str, String str2) {
        String str3 = "interruptedRetryBtn";
        if (!"ocr_failed_code".equalsIgnoreCase(str)) {
            if ("ocr_over_time_code".equalsIgnoreCase(str)) {
                str3 = "overTimesExitBtn";
            } else if ("ocr_exit_code".equalsIgnoreCase(str)) {
                str3 = "exitCancelBtn";
            } else if (!"ocr_network_error_code".equalsIgnoreCase(str)) {
                if ("ocr_out_time_code".equalsIgnoreCase(str)) {
                    str3 = "timeOutExitBtn";
                } else if (!"ocr_msg_error_code".equalsIgnoreCase(str) && !"OCR_PERM_ERROR_CODE".equalsIgnoreCase(str) && !"OCR_TYPE_ERROR_CODE".equalsIgnoreCase(str) && !"ORC_RES_PAGE_EXIT_CODE".equalsIgnoreCase(str) && !"ORC_RES_PAGE_NET_ERROR_CODE".equalsIgnoreCase(str)) {
                    "ORC_RES_PAGE_INFO_EMPTY_CODE".equalsIgnoreCase(str);
                }
            }
        }
        getInstance().recordEventBehavior(RecordLevel.LOG_INFO, "PAGER_BEHAVIOR", str3, str2);
    }

    public static void recordOcrAlertClose(String str, String str2) {
        String str3 = "interruptedAlertClose";
        if (!"ocr_failed_code".equalsIgnoreCase(str)) {
            if ("ocr_over_time_code".equalsIgnoreCase(str)) {
                str3 = "overTimesAlertClose";
            } else if ("ocr_exit_code".equalsIgnoreCase(str)) {
                str3 = "exitAlertClose";
            } else if (!"ocr_network_error_code".equalsIgnoreCase(str)) {
                if ("ocr_out_time_code".equalsIgnoreCase(str)) {
                    str3 = "timeOutAlertClose";
                } else if (!"ocr_msg_error_code".equalsIgnoreCase(str) && !"OCR_PERM_ERROR_CODE".equalsIgnoreCase(str) && !"OCR_TYPE_ERROR_CODE".equalsIgnoreCase(str) && !"ORC_RES_PAGE_EXIT_CODE".equalsIgnoreCase(str) && !"ORC_RES_PAGE_NET_ERROR_CODE".equalsIgnoreCase(str)) {
                    "ORC_RES_PAGE_INFO_EMPTY_CODE".equalsIgnoreCase(str);
                }
            }
        }
        getInstance().recordEventBehavior(RecordLevel.LOG_INFO, "PAGER_BEHAVIOR", str3, str2);
    }

    public static void recordOcrAlertConfirm(String str, String str2) {
        String str3 = "interruptedRetryBtn";
        if (!"ocr_failed_code".equalsIgnoreCase(str)) {
            if ("ocr_over_time_code".equalsIgnoreCase(str)) {
                str3 = "overTimesExitBtn";
            } else if ("ocr_exit_code".equalsIgnoreCase(str)) {
                str3 = "exitConfirmBtn";
            } else if (!"ocr_network_error_code".equalsIgnoreCase(str)) {
                if ("ocr_out_time_code".equalsIgnoreCase(str)) {
                    str3 = "timeOutRetryBtn";
                } else if (!"ocr_msg_error_code".equalsIgnoreCase(str) && !"OCR_PERM_ERROR_CODE".equalsIgnoreCase(str) && !"OCR_TYPE_ERROR_CODE".equalsIgnoreCase(str) && !"ORC_RES_PAGE_EXIT_CODE".equalsIgnoreCase(str) && !"ORC_RES_PAGE_NET_ERROR_CODE".equalsIgnoreCase(str)) {
                    "ORC_RES_PAGE_INFO_EMPTY_CODE".equalsIgnoreCase(str);
                }
            }
        }
        getInstance().recordEventBehavior(RecordLevel.LOG_INFO, "PAGER_BEHAVIOR", str3, str2);
    }

    private void tryUpload(boolean z) {
        if (this.records.size() >= 10 || z) {
            ArrayList arrayList = new ArrayList();
            Iterator<RecordBase> it = this.records.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().toString());
            }
            this.records.clear();
            arrayList.addAll(readCacheLogs());
            deleteLogFile();
            if (arrayList.size() <= 0) {
                return;
            }
            hc20.m130378j(arrayList, false, new kuj0() { // from class: com.idv.identity.platform.log.RecordService.1
                @Override // p149l.kuj0
                public void onFail(List<String> list) {
                    RecordService.this.cacheLogs(list);
                }

                @Override // p149l.kuj0
                public void onSuccess() {
                }
            });
        }
    }

    public void flush() {
        synchronized (RecordService.class) {
            tryUpload(true);
        }
    }

    public void init(Context context, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        if (context == null) {
            return;
        }
        this.clientIdx = 0;
        RecordConst.setClientId(str);
        RecordConst.setClientVersion(str2);
        RecordConst.setDeviceId(str3);
        RecordConst.setSessionId(str4);
        RecordConst.setPhonePrint(str5);
        RecordConst.setOsVersion(str6);
        RecordConst.setNetType(str7);
        RecordConst.setScreenMetrics(str8);
        RecordConst.setPackageName(context.getPackageName());
        String absolutePath = context.getFilesDir().getAbsolutePath();
        if (absolutePath.charAt(absolutePath.length() - 1) != '/') {
            absolutePath = absolutePath.concat("/");
        }
        String str9 = absolutePath + LOG_FILE_NAME;
        ixq0.m138884a("logFilePath: ".concat(str9));
        RecordConst.setLogFilePath(str9);
    }

    public void recordEvent(RecordLevel recordLevel, String str, String... strArr) {
        synchronized (RecordService.class) {
            recordEventEx(recordLevel, str, strArr);
        }
    }

    public void recordEventBehavior(RecordLevel recordLevel, String str, String str2, String str3, String str4, String str5) {
        recordEvent(recordLevel, str, "time", this.simpleDateFormat.format(new Date()), "productCode", kcm.m145452H().m145550i0(), "currentPage", str3, "cost", str5, "currentAlert", str4, "eventName", str2);
    }

    public void recordEventPage(RecordLevel recordLevel, String str, String str2, String str3, String str4) {
        recordEvent(recordLevel, str, "time", this.simpleDateFormat.format(new Date()), "currentPage", str2, "productCode", kcm.m145452H().m145550i0(), "cost", str3, "exitReason", str4);
    }

    public void recordException(Throwable th) {
        getInstance().recordEvent(RecordLevel.LOG_ERROR, "FaceVerify", "exception", Log.getStackTraceString(th), "errMsg", (th == null || TextUtils.isEmpty(th.getMessage())) ? "Null" : th.getMessage());
    }

    public void recordEventPage(RecordLevel recordLevel, String str, String str2) {
        recordEventPage(recordLevel, str, str2, "", "");
    }

    public void recordEventBehavior(RecordLevel recordLevel, String str, String str2, String str3) {
        recordEventBehavior(recordLevel, str, str2, str3, "", "");
    }

    public static void recordOcrAlertCancel(String str) {
        recordOcrAlertCancel(str, "OCR_SCAN");
    }

    public static void recordOcrAlertClose(String str) {
        recordOcrAlertClose(str, "OCR_SCAN");
    }

    public static void recordOcrAlertConfirm(String str) {
        recordOcrAlertConfirm(str, "OCR_SCAN");
    }

    public static void recordOcrAlertAppear(String str) {
        recordOcrAlertAppear(str, "OCR_SCAN");
    }
}
