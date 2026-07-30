package tech.sud.logger;

import android.util.Log;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.tencent.could.huiyansdk.overseas.HuiYanResultSender;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes3.dex */
public final class Suddo implements Runnable {

    /* JADX INFO: renamed from: Suddo, reason: collision with root package name */
    public final /* synthetic */ int f210132Suddo;
    public final /* synthetic */ String Sudfor;

    /* JADX INFO: renamed from: Sudif, reason: collision with root package name */
    public final /* synthetic */ Sudelse f210133Sudif;
    public final /* synthetic */ long Sudint;
    public final /* synthetic */ String Sudnew;

    public Suddo(int i, Sudelse sudelse, String str, long j, String str2) {
        this.f210132Suddo = i;
        this.f210133Sudif = sudelse;
        this.Sudfor = str;
        this.Sudint = j;
        this.Sudnew = str2;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:31:0x00f2 A[LOOP:0: B:16:0x0098->B:31:0x00f2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:61:0x00ef A[SYNTHETIC] */
    @Override // java.lang.Runnable
    public final void run() {
        String string;
        int i;
        String str;
        int i2;
        int i3 = this.f210132Suddo;
        String str2 = this.f210133Sudif.f210134Suddo;
        String str3 = this.f210133Sudif.Sudfor + this.Sudfor;
        long j = this.Sudint;
        String str4 = this.Sudnew;
        int i4 = LogUtils.f207532V;
        Date date = new Date();
        if (LogUtils.Sudnew == null) {
            LogUtils.Sudnew = new SimpleDateFormat("yyyy_MM_dd HH:mm:ss.SSS ", Locale.US);
        }
        String str5 = LogUtils.Sudnew.format(date);
        String strSubstring = str5.substring(0, 10);
        if (LogUtils.Sudnew == null) {
            LogUtils.Sudnew = new SimpleDateFormat("yyyy_MM_dd HH:mm:ss.SSS ", Locale.US);
        }
        String strSubstring2 = LogUtils.Sudnew.format(date).substring(0, 10);
        StringBuilder sb = new StringBuilder();
        Sudcase sudcase = LogUtils.Sudfor;
        String str6 = sudcase.f210131Sudif;
        if (str6 == null) {
            str6 = sudcase.f210130Suddo;
        }
        sb.append(str6);
        sb.append(sudcase.Sudfor);
        sb.append("_");
        sb.append(strSubstring2);
        sb.append("_");
        String str7 = sudcase.Sudcase;
        sb.append(str7 == null ? "" : str7.replace(":", "_"));
        String string2 = sb.toString();
        String strConcat = string2.concat(".txt");
        int i5 = 0;
        while (true) {
            string = null;
            if (!"".equals(strConcat)) {
                File file = new File(strConcat);
                if (!file.exists()) {
                    i = i3;
                    str = str2;
                    break;
                }
                if (file.isFile()) {
                    Sudcase sudcase2 = LogUtils.Sudfor;
                    i = i3;
                    str = str2;
                    if (sudcase2.Sudgoto <= 1024 || file.length() <= sudcase2.Sudgoto) {
                        break;
                        break;
                    }
                } else {
                    i = i3;
                    str = str2;
                }
                i2 = i5 + 1;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(string2);
                sb2.append("_");
                sb2.append(i2);
                LogUtils.Sudfor.getClass();
                sb2.append(".txt");
                strConcat = sb2.toString();
                if (i2 > 100) {
                    strConcat = null;
                    break;
                } else {
                    i5 = i2;
                    i3 = i;
                    str2 = str;
                }
            } else {
                i = i3;
                str = str2;
                i2 = i5 + 1;
                StringBuilder sb3 = new StringBuilder();
                sb3.append(string2);
                sb3.append("_");
                sb3.append(i2);
                LogUtils.Sudfor.getClass();
                sb3.append(".txt");
                strConcat = sb3.toString();
                if (i2 > 100) {
                    strConcat = null;
                    break;
                } else {
                    i5 = i2;
                    i3 = i;
                    str2 = str;
                }
            }
        }
        try {
            if (!LogUtils.Suddo(strConcat, strSubstring)) {
                Log.e("LogUtils", "create " + strConcat + " failed!");
                return;
            }
            TimeZone timeZone = TimeZone.getDefault();
            if (timeZone != null) {
                int rawOffset = timeZone.getRawOffset();
                int i6 = rawOffset / 3600000;
                int iAbs = Math.abs((rawOffset / HuiYanResultSender.TIMEOUT_MS) % 60);
                String str8 = i6 >= 0 ? Marker.ANY_NON_NULL_MARKER : "-";
                StringBuilder sb4 = new StringBuilder("UTC");
                sb4.append(str8);
                sb4.append(Math.abs(i6));
                sb4.append(":");
                sb4.append(iAbs < 10 ? "0" : "");
                sb4.append(iAbs);
                sb4.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
                string = sb4.toString();
            }
            String str9 = string;
            String str10 = "(" + LogUtils.Sudtry + ":" + j + ":" + str4 + ")";
            try {
                LogUtils.Suddo(strConcat, str5.substring(11) + str9 + LogUtils.f210126Suddo[i - 2] + "/" + str + str10 + str3 + LogUtils.LINE_SEP, false);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }
}
