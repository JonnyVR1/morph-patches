package p149l;

import android.os.Process;
import android.os.SystemClock;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import tech.sud.base.utils.SudZipUtils;
import tech.sud.base.utils.Utils;
import tech.sud.logger.LogUtils;

/* JADX INFO: loaded from: classes2.dex */
public final class hrg0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final nog0 f109218a;

    /* JADX INFO: renamed from: b */
    public File f109219b;

    /* JADX INFO: renamed from: c */
    public File f109220c;

    public hrg0(nog0 nog0Var) {
        this.f109218a = nog0Var;
    }

    /* JADX WARN: Code duplicated, block: B:105:0x0253  */
    /* JADX WARN: Code duplicated, block: B:106:0x0257  */
    /* JADX WARN: Code duplicated, block: B:110:0x028f  */
    /* JADX WARN: Code duplicated, block: B:112:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:114:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:129:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:132:0x0313  */
    /* JADX WARN: Code duplicated, block: B:134:0x0319  */
    /* JADX WARN: Code duplicated, block: B:135:0x0325  */
    /* JADX WARN: Code duplicated, block: B:137:0x0328  */
    /* JADX WARN: Code duplicated, block: B:163:0x0229 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:166:0x021b A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:169:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x017d  */
    /* JADX WARN: Code duplicated, block: B:75:0x01d1 A[Catch: all -> 0x01dd, Exception -> 0x01e0, TryCatch #0 {Exception -> 0x01e0, blocks: (B:73:0x01cb, B:75:0x01d1, B:77:0x01d9, B:82:0x01e2), top: B:145:0x01cb }] */
    /* JADX WARN: Code duplicated, block: B:77:0x01d9 A[Catch: all -> 0x01dd, Exception -> 0x01e0, TryCatch #0 {Exception -> 0x01e0, blocks: (B:73:0x01cb, B:75:0x01d1, B:77:0x01d9, B:82:0x01e2), top: B:145:0x01cb }] */
    /* JADX WARN: Code duplicated, block: B:94:0x0217  */
    /* JADX WARN: Code duplicated, block: B:97:0x0221  */
    /* JADX WARN: Instruction removed from duplicated block: B:70:0x017d, please report this as an issue */
    /* JADX INFO: renamed from: a */
    public final void m132685a() throws Throwable {
        String string;
        BufferedReader bufferedReader;
        long j;
        List<File> logFiles;
        File file;
        String absolutePath;
        File fileM175736a;
        String absolutePath2;
        boolean zM175738c;
        int i;
        File file2;
        ymg0 ymg0Var;
        j9g0 j9g0Var;
        BufferedWriter bufferedWriter;
        int i2;
        ymg0 ymg0Var2;
        jfg0 jfg0Var;
        LogUtils.file("ReportSdkLogTask", "startReport logId：" + this.f109218a.f139842c + " uploadType:" + this.f109218a.f139844e);
        int i3 = this.f109218a.f139844e;
        if (i3 == 0) {
            string = cbg0.m105995a("TechSudMGPGlobal.sp").f80140a.getString("key_uploaded_log_id", "");
        } else if (i3 != 1) {
            return;
        } else {
            string = cbg0.m105995a("TechSudMGPGlobal.sp").f80140a.getString("key_upload_anr_log_id_completed", "");
        }
        boolean zEquals = this.f109218a.f139842c.equals(string);
        nog0 nog0Var = this.f109218a;
        if (zEquals) {
            LogUtils.file("ReportSdkLogTask", "当前logId已上报完成，不再重复上报：" + nog0Var.f139842c);
            return;
        }
        if (nog0Var.f139844e == 1) {
            SystemClock.sleep(10000L);
        }
        File filesDir = Utils.getApp().getFilesDir();
        this.f109219b = new File(filesDir, "sud/mgp/rplogtemp");
        this.f109220c = new File(filesDir, "sud/mgp/rplogtempzip");
        File file3 = this.f109219b;
        String absolutePath3 = file3.getAbsolutePath();
        if (file3.exists()) {
            g7g0.m124692c(absolutePath3);
        } else {
            g7g0.m124690a(absolutePath3);
        }
        ArrayList arrayList = new ArrayList();
        asg0 asg0Var = mlg0.f134430e;
        long j2 = PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE;
        long j3 = (asg0Var == null || (ymg0Var2 = asg0Var.f71451c) == null || (jfg0Var = ymg0Var2.f199010l) == null) ? 2097152L : jfg0Var.f117658b;
        long j4 = 0;
        if (j3 > 0) {
            j2 = 20971520;
            if (j3 <= 20971520) {
                j2 = j3;
            }
        }
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec(this.f109218a.f139843d ? "logcat -d" : "logcat -d --pid=".concat(Process.myPid() + "")).getInputStream()));
            long j5 = 0;
            long length = 0;
            while (j5 < 500000) {
                try {
                    try {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            break;
                        }
                        arrayList.add(line);
                        j = j4;
                        length += (long) line.length();
                        j5++;
                        while (length > j2) {
                            try {
                                if (arrayList.size() <= 0) {
                                    break;
                                } else {
                                    length -= (long) ((String) arrayList.remove(0)).length();
                                }
                            } catch (IOException e) {
                                e = e;
                            }
                        }
                        j4 = j;
                    } catch (Throwable th) {
                        th = th;
                        p6g0.m167665c(bufferedReader);
                        throw th;
                    }
                } catch (IOException e2) {
                    e = e2;
                    j = j4;
                }
                e.printStackTrace();
                LogUtils.file("ReportSdkLogTask", "getCLog error:" + LogUtils.getErrorInfo(e));
                p6g0.m167665c(bufferedReader);
                if (arrayList.size() != 0) {
                    try {
                        bufferedWriter = new BufferedWriter(new FileWriter(new File(this.f109219b.getAbsolutePath(), "Sud_" + Utils.getApp().getPackageName() + "_" + new SimpleDateFormat("yyyy_MM_dd", Locale.US).format(Long.valueOf(System.currentTimeMillis())) + "_console.log")));
                        for (i2 = 0; i2 < arrayList.size(); i2++) {
                            try {
                                try {
                                    String str = (String) arrayList.get(i2);
                                    if (i2 > 0) {
                                        bufferedWriter.newLine();
                                    }
                                    bufferedWriter.write(str);
                                } catch (Exception e3) {
                                    e = e3;
                                    e.printStackTrace();
                                    LogUtils.file("ReportSdkLogTask", "writeLogToTempPath error:" + LogUtils.getErrorInfo(e));
                                    p6g0.m167665c(bufferedWriter);
                                    logFiles = LogUtils.getLogFiles();
                                    if (logFiles != null) {
                                        while (r0.hasNext()) {
                                            if (file == null) {
                                            }
                                        }
                                    }
                                    file = this.f109220c;
                                    absolutePath = file.getAbsolutePath();
                                    if (file.exists()) {
                                        g7g0.m124692c(absolutePath);
                                    } else {
                                        g7g0.m124690a(absolutePath);
                                    }
                                    File file4 = new File(absolutePath, yog0.m215499b(UUID.randomUUID().toString()));
                                    SudZipUtils.zipDirectory(this.f109219b, file4);
                                    g7g0.m124691b(this.f109219b.getAbsolutePath());
                                    fileM175736a = qog0.m175736a(file4, new File(this.f109220c, this.f109218a.f139842c));
                                    file4.delete();
                                    if (fileM175736a == null) {
                                        return;
                                    }
                                    nog0 nog0Var2 = this.f109218a;
                                    String str2 = nog0Var2.f139840a;
                                    long j6 = nog0Var2.f139841b;
                                    String str3 = nog0Var2.f139842c;
                                    absolutePath2 = fileM175736a.getAbsolutePath();
                                    if (TextUtils.isEmpty(absolutePath2)) {
                                        zM175738c = false;
                                    } else {
                                        file2 = new File(absolutePath2);
                                        if (file2.exists()) {
                                            zM175738c = false;
                                        } else {
                                            zM175738c = false;
                                        }
                                    }
                                    fileM175736a.delete();
                                    LogUtils.file("ReportSdkLogTask", "上传文件 requestId:" + str3 + " 结果：" + zM175738c + " 大小：" + fileM175736a.length() + " 路径：" + absolutePath2);
                                    if (zM175738c) {
                                        i = this.f109218a.f139844e;
                                        if (i == 0) {
                                            cbg0.m105995a("TechSudMGPGlobal.sp").m105997c("key_uploaded_log_id", this.f109218a.f139842c, false);
                                        } else if (i == 1) {
                                            cbg0.m105995a("TechSudMGPGlobal.sp").m105997c("key_upload_anr_log_id_completed", this.f109218a.f139842c, false);
                                            cbg0.m105995a("TechSudMGPGlobal.sp").m105998d("key_upload_anr_log_info");
                                        }
                                    }
                                    g7g0.m124691b(this.f109220c.getAbsolutePath());
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                p6g0.m167665c(bufferedWriter);
                                throw th;
                            }
                        }
                        p6g0.m167665c(bufferedWriter);
                    } catch (Exception e4) {
                        e = e4;
                        bufferedWriter = null;
                    } catch (Throwable th3) {
                        th = th3;
                        bufferedWriter = null;
                        p6g0.m167665c(bufferedWriter);
                        throw th;
                    }
                }
                logFiles = LogUtils.getLogFiles();
                if (logFiles != null) {
                    for (File file5 : logFiles) {
                        if (file5 == null && file5.exists()) {
                            jkg0.m141870b(file5.getAbsolutePath(), new File(this.f109219b, file5.getName()).getAbsolutePath());
                        }
                    }
                }
                file = this.f109220c;
                absolutePath = file.getAbsolutePath();
                if (file.exists()) {
                    g7g0.m124692c(absolutePath);
                } else {
                    g7g0.m124690a(absolutePath);
                }
                File file6 = new File(absolutePath, yog0.m215499b(UUID.randomUUID().toString()));
                SudZipUtils.zipDirectory(this.f109219b, file6);
                g7g0.m124691b(this.f109219b.getAbsolutePath());
                fileM175736a = qog0.m175736a(file6, new File(this.f109220c, this.f109218a.f139842c));
                file6.delete();
                if (fileM175736a == null) {
                    return;
                }
                nog0 nog0Var3 = this.f109218a;
                String str4 = nog0Var3.f139840a;
                long j7 = nog0Var3.f139841b;
                String str5 = nog0Var3.f139842c;
                absolutePath2 = fileM175736a.getAbsolutePath();
                if (TextUtils.isEmpty(absolutePath2)) {
                    file2 = new File(absolutePath2);
                    if (file2.exists() || file2.length() <= j) {
                        zM175738c = false;
                    } else {
                        asg0 asg0Var2 = mlg0.f134430e;
                        String str6 = (asg0Var2 == null || (ymg0Var = asg0Var2.f71451c) == null || (j9g0Var = ymg0Var.f199002d) == null) ? null : j9g0Var.f116902e;
                        if (TextUtils.isEmpty(str6)) {
                            zM175738c = false;
                        } else {
                            zM175738c = qog0.m175738c(str6, str5, file2, str4, j7 + "");
                        }
                    }
                } else {
                    zM175738c = false;
                }
                fileM175736a.delete();
                LogUtils.file("ReportSdkLogTask", "上传文件 requestId:" + str5 + " 结果：" + zM175738c + " 大小：" + fileM175736a.length() + " 路径：" + absolutePath2);
                if (zM175738c) {
                    i = this.f109218a.f139844e;
                    if (i == 0) {
                        cbg0.m105995a("TechSudMGPGlobal.sp").m105997c("key_uploaded_log_id", this.f109218a.f139842c, false);
                    } else if (i == 1) {
                        cbg0.m105995a("TechSudMGPGlobal.sp").m105997c("key_upload_anr_log_id_completed", this.f109218a.f139842c, false);
                        cbg0.m105995a("TechSudMGPGlobal.sp").m105998d("key_upload_anr_log_info");
                    }
                }
                g7g0.m124691b(this.f109220c.getAbsolutePath());
            }
            j = j4;
            p6g0.m167665c(bufferedReader);
        } catch (IOException e5) {
            e = e5;
            j = 0;
            bufferedReader = null;
        } catch (Throwable th4) {
            th = th4;
            bufferedReader = null;
            p6g0.m167665c(bufferedReader);
            throw th;
        }
        if (arrayList.size() != 0) {
            bufferedWriter = new BufferedWriter(new FileWriter(new File(this.f109219b.getAbsolutePath(), "Sud_" + Utils.getApp().getPackageName() + "_" + new SimpleDateFormat("yyyy_MM_dd", Locale.US).format(Long.valueOf(System.currentTimeMillis())) + "_console.log")));
            while (i2 < arrayList.size()) {
                String str7 = (String) arrayList.get(i2);
                if (i2 > 0) {
                    bufferedWriter.newLine();
                }
                bufferedWriter.write(str7);
            }
            p6g0.m167665c(bufferedWriter);
        }
        logFiles = LogUtils.getLogFiles();
        if (logFiles != null) {
            while (r0.hasNext()) {
                if (file5 == null) {
                }
            }
        }
        file = this.f109220c;
        absolutePath = file.getAbsolutePath();
        if (file.exists()) {
            g7g0.m124692c(absolutePath);
        } else {
            g7g0.m124690a(absolutePath);
        }
        File file7 = new File(absolutePath, yog0.m215499b(UUID.randomUUID().toString()));
        SudZipUtils.zipDirectory(this.f109219b, file7);
        g7g0.m124691b(this.f109219b.getAbsolutePath());
        fileM175736a = qog0.m175736a(file7, new File(this.f109220c, this.f109218a.f139842c));
        file7.delete();
        if (fileM175736a == null) {
            return;
        }
        nog0 nog0Var4 = this.f109218a;
        String str8 = nog0Var4.f139840a;
        long j8 = nog0Var4.f139841b;
        String str9 = nog0Var4.f139842c;
        absolutePath2 = fileM175736a.getAbsolutePath();
        if (TextUtils.isEmpty(absolutePath2)) {
            file2 = new File(absolutePath2);
            if (file2.exists()) {
                zM175738c = false;
            } else {
                zM175738c = false;
            }
        } else {
            zM175738c = false;
        }
        fileM175736a.delete();
        LogUtils.file("ReportSdkLogTask", "上传文件 requestId:" + str9 + " 结果：" + zM175738c + " 大小：" + fileM175736a.length() + " 路径：" + absolutePath2);
        if (zM175738c) {
            i = this.f109218a.f139844e;
            if (i == 0) {
                cbg0.m105995a("TechSudMGPGlobal.sp").m105997c("key_uploaded_log_id", this.f109218a.f139842c, false);
            } else if (i == 1) {
                cbg0.m105995a("TechSudMGPGlobal.sp").m105997c("key_upload_anr_log_id_completed", this.f109218a.f139842c, false);
                cbg0.m105995a("TechSudMGPGlobal.sp").m105998d("key_upload_anr_log_info");
            }
        }
        g7g0.m124691b(this.f109220c.getAbsolutePath());
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        try {
            nog0 nog0Var = this.f109218a;
            if (TextUtils.isEmpty(nog0Var.f139840a) || TextUtils.isEmpty(nog0Var.f139842c)) {
                return;
            }
            m132685a();
        } catch (Exception e) {
            e.printStackTrace();
            LogUtils.file("ReportSdkLogTask", "ReportConsoleLogTask error:" + LogUtils.getErrorInfo(e));
        }
    }
}
