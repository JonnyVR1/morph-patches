package p153l;

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
public final class pzg0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final vwg0 f154845a;

    /* JADX INFO: renamed from: b */
    public File f154846b;

    /* JADX INFO: renamed from: c */
    public File f154847c;

    public pzg0(vwg0 vwg0Var) {
        this.f154845a = vwg0Var;
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
    public final void m174433a() throws Throwable {
        String string;
        BufferedReader bufferedReader;
        long j;
        List<File> logFiles;
        File file;
        String absolutePath;
        File fileM217611a;
        String absolutePath2;
        boolean zM217613c;
        int i;
        File file2;
        gvg0 gvg0Var;
        rhg0 rhg0Var;
        BufferedWriter bufferedWriter;
        int i2;
        gvg0 gvg0Var2;
        rng0 rng0Var;
        LogUtils.file("ReportSdkLogTask", "startReport logId：" + this.f154845a.f186137c + " uploadType:" + this.f154845a.f186139e);
        int i3 = this.f154845a.f186139e;
        if (i3 == 0) {
            string = kjg0.m150043a("TechSudMGPGlobal.sp").f127100a.getString("key_uploaded_log_id", "");
        } else if (i3 != 1) {
            return;
        } else {
            string = kjg0.m150043a("TechSudMGPGlobal.sp").f127100a.getString("key_upload_anr_log_id_completed", "");
        }
        boolean zEquals = this.f154845a.f186137c.equals(string);
        vwg0 vwg0Var = this.f154845a;
        if (zEquals) {
            LogUtils.file("ReportSdkLogTask", "当前logId已上报完成，不再重复上报：" + vwg0Var.f186137c);
            return;
        }
        if (vwg0Var.f186139e == 1) {
            SystemClock.sleep(10000L);
        }
        File filesDir = Utils.getApp().getFilesDir();
        this.f154846b = new File(filesDir, "sud/mgp/rplogtemp");
        this.f154847c = new File(filesDir, "sud/mgp/rplogtempzip");
        File file3 = this.f154846b;
        String absolutePath3 = file3.getAbsolutePath();
        if (file3.exists()) {
            ofg0.m167450c(absolutePath3);
        } else {
            ofg0.m167448a(absolutePath3);
        }
        ArrayList arrayList = new ArrayList();
        i0h0 i0h0Var = utg0.f180950e;
        long j2 = PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE;
        long j3 = (i0h0Var == null || (gvg0Var2 = i0h0Var.f112370c) == null || (rng0Var = gvg0Var2.f106641l) == null) ? 2097152L : rng0Var.f164040b;
        long j4 = 0;
        if (j3 > 0) {
            j2 = 20971520;
            if (j3 <= 20971520) {
                j2 = j3;
            }
        }
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec(this.f154845a.f186138d ? "logcat -d" : "logcat -d --pid=".concat(Process.myPid() + "")).getInputStream()));
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
                        xeg0.m210678c(bufferedReader);
                        throw th;
                    }
                } catch (IOException e2) {
                    e = e2;
                    j = j4;
                }
                e.printStackTrace();
                LogUtils.file("ReportSdkLogTask", "getCLog error:" + LogUtils.getErrorInfo(e));
                xeg0.m210678c(bufferedReader);
                if (arrayList.size() != 0) {
                    try {
                        bufferedWriter = new BufferedWriter(new FileWriter(new File(this.f154846b.getAbsolutePath(), "Sud_" + Utils.getApp().getPackageName() + "_" + new SimpleDateFormat("yyyy_MM_dd", Locale.US).format(Long.valueOf(System.currentTimeMillis())) + "_console.log")));
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
                                    xeg0.m210678c(bufferedWriter);
                                    logFiles = LogUtils.getLogFiles();
                                    if (logFiles != null) {
                                        while (r0.hasNext()) {
                                            if (file == null) {
                                            }
                                        }
                                    }
                                    file = this.f154847c;
                                    absolutePath = file.getAbsolutePath();
                                    if (file.exists()) {
                                        ofg0.m167450c(absolutePath);
                                    } else {
                                        ofg0.m167448a(absolutePath);
                                    }
                                    File file4 = new File(absolutePath, gxg0.m132863b(UUID.randomUUID().toString()));
                                    SudZipUtils.zipDirectory(this.f154846b, file4);
                                    ofg0.m167449b(this.f154846b.getAbsolutePath());
                                    fileM217611a = ywg0.m217611a(file4, new File(this.f154847c, this.f154845a.f186137c));
                                    file4.delete();
                                    if (fileM217611a == null) {
                                        return;
                                    }
                                    vwg0 vwg0Var2 = this.f154845a;
                                    String str2 = vwg0Var2.f186135a;
                                    long j6 = vwg0Var2.f186136b;
                                    String str3 = vwg0Var2.f186137c;
                                    absolutePath2 = fileM217611a.getAbsolutePath();
                                    if (TextUtils.isEmpty(absolutePath2)) {
                                        zM217613c = false;
                                    } else {
                                        file2 = new File(absolutePath2);
                                        if (file2.exists()) {
                                            zM217613c = false;
                                        } else {
                                            zM217613c = false;
                                        }
                                    }
                                    fileM217611a.delete();
                                    LogUtils.file("ReportSdkLogTask", "上传文件 requestId:" + str3 + " 结果：" + zM217613c + " 大小：" + fileM217611a.length() + " 路径：" + absolutePath2);
                                    if (zM217613c) {
                                        i = this.f154845a.f186139e;
                                        if (i == 0) {
                                            kjg0.m150043a("TechSudMGPGlobal.sp").m150045c("key_uploaded_log_id", this.f154845a.f186137c, false);
                                        } else if (i == 1) {
                                            kjg0.m150043a("TechSudMGPGlobal.sp").m150045c("key_upload_anr_log_id_completed", this.f154845a.f186137c, false);
                                            kjg0.m150043a("TechSudMGPGlobal.sp").m150046d("key_upload_anr_log_info");
                                        }
                                    }
                                    ofg0.m167449b(this.f154847c.getAbsolutePath());
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                xeg0.m210678c(bufferedWriter);
                                throw th;
                            }
                        }
                        xeg0.m210678c(bufferedWriter);
                    } catch (Exception e4) {
                        e = e4;
                        bufferedWriter = null;
                    } catch (Throwable th3) {
                        th = th3;
                        bufferedWriter = null;
                        xeg0.m210678c(bufferedWriter);
                        throw th;
                    }
                }
                logFiles = LogUtils.getLogFiles();
                if (logFiles != null) {
                    for (File file5 : logFiles) {
                        if (file5 == null && file5.exists()) {
                            rsg0.m182969b(file5.getAbsolutePath(), new File(this.f154846b, file5.getName()).getAbsolutePath());
                        }
                    }
                }
                file = this.f154847c;
                absolutePath = file.getAbsolutePath();
                if (file.exists()) {
                    ofg0.m167450c(absolutePath);
                } else {
                    ofg0.m167448a(absolutePath);
                }
                File file6 = new File(absolutePath, gxg0.m132863b(UUID.randomUUID().toString()));
                SudZipUtils.zipDirectory(this.f154846b, file6);
                ofg0.m167449b(this.f154846b.getAbsolutePath());
                fileM217611a = ywg0.m217611a(file6, new File(this.f154847c, this.f154845a.f186137c));
                file6.delete();
                if (fileM217611a == null) {
                    return;
                }
                vwg0 vwg0Var3 = this.f154845a;
                String str4 = vwg0Var3.f186135a;
                long j7 = vwg0Var3.f186136b;
                String str5 = vwg0Var3.f186137c;
                absolutePath2 = fileM217611a.getAbsolutePath();
                if (TextUtils.isEmpty(absolutePath2)) {
                    file2 = new File(absolutePath2);
                    if (file2.exists() || file2.length() <= j) {
                        zM217613c = false;
                    } else {
                        i0h0 i0h0Var2 = utg0.f180950e;
                        String str6 = (i0h0Var2 == null || (gvg0Var = i0h0Var2.f112370c) == null || (rhg0Var = gvg0Var.f106633d) == null) ? null : rhg0Var.f163167e;
                        if (TextUtils.isEmpty(str6)) {
                            zM217613c = false;
                        } else {
                            zM217613c = ywg0.m217613c(str6, str5, file2, str4, j7 + "");
                        }
                    }
                } else {
                    zM217613c = false;
                }
                fileM217611a.delete();
                LogUtils.file("ReportSdkLogTask", "上传文件 requestId:" + str5 + " 结果：" + zM217613c + " 大小：" + fileM217611a.length() + " 路径：" + absolutePath2);
                if (zM217613c) {
                    i = this.f154845a.f186139e;
                    if (i == 0) {
                        kjg0.m150043a("TechSudMGPGlobal.sp").m150045c("key_uploaded_log_id", this.f154845a.f186137c, false);
                    } else if (i == 1) {
                        kjg0.m150043a("TechSudMGPGlobal.sp").m150045c("key_upload_anr_log_id_completed", this.f154845a.f186137c, false);
                        kjg0.m150043a("TechSudMGPGlobal.sp").m150046d("key_upload_anr_log_info");
                    }
                }
                ofg0.m167449b(this.f154847c.getAbsolutePath());
            }
            j = j4;
            xeg0.m210678c(bufferedReader);
        } catch (IOException e5) {
            e = e5;
            j = 0;
            bufferedReader = null;
        } catch (Throwable th4) {
            th = th4;
            bufferedReader = null;
            xeg0.m210678c(bufferedReader);
            throw th;
        }
        if (arrayList.size() != 0) {
            bufferedWriter = new BufferedWriter(new FileWriter(new File(this.f154846b.getAbsolutePath(), "Sud_" + Utils.getApp().getPackageName() + "_" + new SimpleDateFormat("yyyy_MM_dd", Locale.US).format(Long.valueOf(System.currentTimeMillis())) + "_console.log")));
            while (i2 < arrayList.size()) {
                String str7 = (String) arrayList.get(i2);
                if (i2 > 0) {
                    bufferedWriter.newLine();
                }
                bufferedWriter.write(str7);
            }
            xeg0.m210678c(bufferedWriter);
        }
        logFiles = LogUtils.getLogFiles();
        if (logFiles != null) {
            while (r0.hasNext()) {
                if (file5 == null) {
                }
            }
        }
        file = this.f154847c;
        absolutePath = file.getAbsolutePath();
        if (file.exists()) {
            ofg0.m167450c(absolutePath);
        } else {
            ofg0.m167448a(absolutePath);
        }
        File file7 = new File(absolutePath, gxg0.m132863b(UUID.randomUUID().toString()));
        SudZipUtils.zipDirectory(this.f154846b, file7);
        ofg0.m167449b(this.f154846b.getAbsolutePath());
        fileM217611a = ywg0.m217611a(file7, new File(this.f154847c, this.f154845a.f186137c));
        file7.delete();
        if (fileM217611a == null) {
            return;
        }
        vwg0 vwg0Var4 = this.f154845a;
        String str8 = vwg0Var4.f186135a;
        long j8 = vwg0Var4.f186136b;
        String str9 = vwg0Var4.f186137c;
        absolutePath2 = fileM217611a.getAbsolutePath();
        if (TextUtils.isEmpty(absolutePath2)) {
            file2 = new File(absolutePath2);
            if (file2.exists()) {
                zM217613c = false;
            } else {
                zM217613c = false;
            }
        } else {
            zM217613c = false;
        }
        fileM217611a.delete();
        LogUtils.file("ReportSdkLogTask", "上传文件 requestId:" + str9 + " 结果：" + zM217613c + " 大小：" + fileM217611a.length() + " 路径：" + absolutePath2);
        if (zM217613c) {
            i = this.f154845a.f186139e;
            if (i == 0) {
                kjg0.m150043a("TechSudMGPGlobal.sp").m150045c("key_uploaded_log_id", this.f154845a.f186137c, false);
            } else if (i == 1) {
                kjg0.m150043a("TechSudMGPGlobal.sp").m150045c("key_upload_anr_log_id_completed", this.f154845a.f186137c, false);
                kjg0.m150043a("TechSudMGPGlobal.sp").m150046d("key_upload_anr_log_info");
            }
        }
        ofg0.m167449b(this.f154847c.getAbsolutePath());
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        try {
            vwg0 vwg0Var = this.f154845a;
            if (TextUtils.isEmpty(vwg0Var.f186135a) || TextUtils.isEmpty(vwg0Var.f186137c)) {
                return;
            }
            m174433a();
        } catch (Exception e) {
            e.printStackTrace();
            LogUtils.file("ReportSdkLogTask", "ReportConsoleLogTask error:" + LogUtils.getErrorInfo(e));
        }
    }
}
