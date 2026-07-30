package p149l;

import android.text.TextUtils;
import com.immomo.mmutil.FileUtil;
import com.immomo.mmutil.log.Log4Android;
import com.immomo.mwc.sdk.MWCEngine;
import com.p046p1.mobile.putong.data.ResourceDirection;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;

/* JADX INFO: loaded from: classes2.dex */
public class z750 {

    /* JADX INFO: renamed from: a */
    private static final String f201989a = "z750";

    /* JADX INFO: renamed from: a */
    public static boolean m217430a() {
        try {
            FileUtil.m18406c(ohw.m164475m());
            FileUtil.m18406c(ohw.m164473k());
            FileUtil.m18406c(ohw.m164474l());
            FileUtil.m18406c(ohw.m164471i());
            aow.m97986a();
            return true;
        } catch (Exception e) {
            Log4Android.m18417f().m18422e(e);
            return false;
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m217431b(String str, long j) {
        try {
            String strM217432c = m217432c(str, j, ".zip");
            String strM217432c2 = m217432c(str, j, ".7z");
            File[] fileArrListFiles = ohw.m164473k().listFiles();
            if (fileArrListFiles == null || fileArrListFiles.length <= 0) {
                return;
            }
            for (File file : fileArrListFiles) {
                if (file != null && !file.isDirectory() && !TextUtils.equals(strM217432c, file.getName()) && !TextUtils.equals(strM217432c2, file.getName()) && !TextUtils.isEmpty(file.getName())) {
                    if (file.getName().startsWith("backup_" + str)) {
                        file.delete();
                        mxv.m156926a(f201989a, "tang------删除多余备份包 " + file.getAbsolutePath());
                    } else {
                        continue;
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: c */
    private static String m217432c(String str, long j, String str2) {
        return "backup_" + str + ResourceDirection.f38808v + j + str2;
    }

    /* JADX INFO: renamed from: d */
    public static File m217433d(String str, long j, String str2) throws IOException {
        return new File(ohw.m164473k(), m217432c(str, j, str2));
    }

    /* JADX INFO: renamed from: e */
    public static List<String> m217434e() {
        File[] fileArrListFiles;
        File fileM164474l = ohw.m164474l();
        ArrayList arrayList = null;
        if (fileM164474l != null && fileM164474l.exists() && (fileArrListFiles = fileM164474l.listFiles()) != null && fileArrListFiles.length != 0) {
            arrayList = new ArrayList();
            for (File file : fileArrListFiles) {
                String name = file.getName();
                int iIndexOf = name.indexOf(".zip");
                if (iIndexOf < 0) {
                    iIndexOf = name.indexOf(".7z");
                }
                if (iIndexOf >= 0) {
                    arrayList.add(name.substring(0, iIndexOf));
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: f */
    public static File m217435f(String str, String str2) {
        return new File(ohw.m164474l(), str + str2);
    }

    /* JADX INFO: renamed from: g */
    public static File m217436g(String str) {
        return new File(str, "config.json");
    }

    /* JADX INFO: renamed from: h */
    public static File m217437h(String str) {
        return new File(ohw.m164475m(), str);
    }

    /* JADX INFO: renamed from: i */
    public static File m217438i(String str) {
        return new File(str, "verify.signature");
    }

    /* JADX INFO: renamed from: j */
    public static File m217439j(String str, MWCEngine.CodeType codeType) {
        return new File(str, codeType == MWCEngine.CodeType.BINARY ? "service-worker.bin" : "service-worker.js");
    }

    /* JADX INFO: renamed from: k */
    public static File m217440k(String str) {
        return new File(str, "verify.sign");
    }

    /* JADX INFO: renamed from: l */
    public static File m217441l(String str) {
        return new File(str, "verify.json");
    }

    /* JADX INFO: renamed from: m */
    public static File m217442m(String str) {
        return new File(ohw.m164475m(), str);
    }

    /* JADX INFO: renamed from: n */
    public static List<String> m217443n() {
        File[] fileArrListFiles;
        File fileM164475m = ohw.m164475m();
        ArrayList arrayList = null;
        if (fileM164475m != null && fileM164475m.exists() && (fileArrListFiles = fileM164475m.listFiles()) != null && fileArrListFiles.length != 0) {
            arrayList = new ArrayList();
            for (File file : fileArrListFiles) {
                String name = file.getName();
                if (name.startsWith(ohw.f144066m)) {
                    arrayList.add(name.substring(ohw.f144066m.length()));
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: o */
    public static String m217444o(File file) throws Throwable {
        String strM201812d = w6e0.m201812d(file, 1024);
        String strM168921e = pgw.m168921e(file);
        byte[] bytes = strM201812d.getBytes();
        byte[] bytes2 = strM168921e.getBytes();
        return new String(new byte[]{bytes[0], bytes[2], bytes[6], bytes[8], bytes[32], bytes[20], bytes[35], bytes[22], bytes2[1], bytes2[30], bytes2[2], bytes2[4], bytes2[6], bytes2[21], bytes2[0], bytes2[8]});
    }

    /* JADX INFO: renamed from: p */
    public static boolean m217445p(String str, long j) throws IOException {
        File fileM217433d = m217433d(str, j, ".zip");
        boolean z = fileM217433d.exists() && fileM217433d.length() > 0;
        if (z) {
            return z;
        }
        File fileM217433d2 = m217433d(str, j, ".7z");
        return fileM217433d2.exists() && fileM217433d2.length() > 0;
    }

    /* JADX INFO: renamed from: q */
    public static h460 m217446q(String str) throws IOException {
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strM18411h = FileUtil.m18411h(m217436g(str));
        h460 h460VarM129220a = null;
        if (TextUtils.isEmpty(strM18411h)) {
            return null;
        }
        try {
            h460VarM129220a = h460.m129220a(strM18411h);
        } catch (JSONException e) {
            Log4Android.m18417f().m18422e(e);
        }
        mxv.m156926a(f201989a, "tang------读取离线包配置 耗时 " + (System.currentTimeMillis() - jCurrentTimeMillis) + "   " + str);
        return h460VarM129220a;
    }

    /* JADX INFO: renamed from: r */
    public static boolean m217447r(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        File fileM217437h = m217437h(str);
        if (fileM217437h.exists()) {
            FileUtil.m18406c(fileM217437h);
        }
        try {
            File[] fileArrListFiles = ohw.m164473k().listFiles();
            if (fileArrListFiles != null && fileArrListFiles.length > 0) {
                for (File file : fileArrListFiles) {
                    if (file != null && !file.isDirectory() && !TextUtils.isEmpty(file.getName())) {
                        if (file.getName().startsWith("backup_" + str)) {
                            file.delete();
                        }
                    }
                }
            }
            File fileM217435f = m217435f(str, ".zip");
            if (fileM217435f.exists()) {
                fileM217435f.delete();
            }
            File fileM217435f2 = m217435f(str, ".7z");
            if (!fileM217435f2.exists()) {
                return true;
            }
            fileM217435f2.delete();
            return true;
        } catch (IOException e) {
            Log4Android.m18417f().m18422e(e);
            return true;
        }
    }
}
