package p149l;

import android.text.TextUtils;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.apm.lite.CrashType;
import com.apm.lite.nativecrash.NativeImpl;
import com.apm.lite.p009j.C0922e;
import com.apm.lite.p010k.C0923m;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import org.aspectj.lang.JoinPoint;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class luq0 {
    /* JADX INFO: renamed from: A */
    public static void m151780A(String str, String str2) throws Throwable {
        m151801o(str2, new File(str));
    }

    /* JADX INFO: renamed from: B */
    public static bjq0 m151781B(File file) {
        bjq0 bjq0VarM151792f = m151792f(new File(file, "logEventStack"), file.getName().contains("oom"));
        boolean z = false;
        for (int i = 0; i < moq0.m155704b(); i++) {
            File fileM113917e = dwq0.m113917e(file, "." + i);
            if (fileM113917e.exists()) {
                try {
                    bjq0VarM151792f.m102225y(new JSONObject(m151812z(fileM113917e.getAbsolutePath())));
                    z = true;
                } catch (Throwable unused) {
                }
            }
        }
        bjq0VarM151792f.m102210c("crash_type", z ? "step" : "simple");
        JSONObject jSONObjectOptJSONObject = bjq0VarM151792f.m102206G().optJSONObject("header");
        JSONObject jSONObjectM102857s = bnq0.m102833b(hrq0.m132700i(), bjq0VarM151792f.m102206G().optLong("crash_time", 0L)).m102857s();
        if (jSONObjectOptJSONObject == null) {
            bjq0VarM151792f.m102216i(jSONObjectM102857s);
        } else {
            nvq0.m161752e(jSONObjectOptJSONObject, jSONObjectM102857s);
        }
        return bjq0VarM151792f;
    }

    /* JADX INFO: renamed from: C */
    public static qoq0 m151782C(String str) {
        try {
            String strM151812z = m151812z(str);
            if (strM151812z == null) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(strM151812z);
            qoq0 qoq0Var = new qoq0();
            qoq0Var.m175755b(jSONObject.optString("url"));
            qoq0Var.m175757d(jSONObject.optJSONObject("body"));
            qoq0Var.m175760g(jSONObject.optString("dump_file"));
            qoq0Var.m175758e(jSONObject.optBoolean("encrypt", false));
            return qoq0Var;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: D */
    public static Map<String, String> m151783D(File file) throws Throwable {
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2 = null;
        try {
            Properties properties = new Properties();
            fileInputStream = new FileInputStream(file);
            try {
                try {
                    properties.load(fileInputStream);
                    Set<String> setStringPropertyNames = properties.stringPropertyNames();
                    HashMap map = new HashMap();
                    for (String str : setStringPropertyNames) {
                        map.put(str, properties.getProperty(str));
                    }
                    gvq0.m128290a(fileInputStream);
                    return map;
                } catch (IOException e) {
                    e = e;
                    kwq0.m147634g(e);
                    gvq0.m128290a(fileInputStream);
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                fileInputStream2 = fileInputStream;
                gvq0.m128290a(fileInputStream2);
                throw th;
            }
        } catch (IOException e2) {
            e = e2;
            fileInputStream = null;
        } catch (Throwable th2) {
            th = th2;
            gvq0.m128290a(fileInputStream2);
            throw th;
        }
    }

    /* JADX INFO: renamed from: E */
    public static qoq0 m151784E(String str) {
        try {
            JSONObject jSONObject = new JSONObject(m151812z(str));
            qoq0 qoq0Var = new qoq0();
            qoq0Var.m175764k(jSONObject.optString("aid"));
            qoq0Var.m175762i(jSONObject.optString("did"));
            qoq0Var.m175766m(jSONObject.optString("processName"));
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("alogFiles");
            if (jSONArrayOptJSONArray != null) {
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    arrayList.add(jSONArrayOptJSONArray.getString(i));
                }
                qoq0Var.m175756c(arrayList);
            }
            return qoq0Var;
        } catch (IOException | JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: renamed from: F */
    public static void m151785F(File file) {
        File file2 = new File(file, JoinPoint.SYNCHRONIZATION_LOCK);
        try {
            file2.createNewFile();
            NativeImpl.m5157e(file2.getAbsolutePath());
        } catch (Throwable th) {
            jnq0.m142383a();
            jnq0.m142384b("NPTH_CATCH", th);
        }
    }

    /* JADX INFO: renamed from: G */
    public static boolean m151786G(File file) {
        if (!file.isFile()) {
            file = new File(file, JoinPoint.SYNCHRONIZATION_LOCK);
        }
        if (!file.exists()) {
            return false;
        }
        try {
            int iM5157e = NativeImpl.m5157e(file.getAbsolutePath());
            if (iM5157e > 0) {
                NativeImpl.m5177y(iM5157e);
                return false;
            }
            if (iM5157e < 0) {
                return true;
            }
        } catch (Throwable th) {
            jnq0.m142383a();
            jnq0.m142384b("NPTH_CATCH", th);
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    public static String m151787a(File file, String str) {
        return m151788b(file, str, -1L);
    }

    /* JADX INFO: renamed from: b */
    public static String m151788b(File file, String str, long j) throws Throwable {
        StringBuilder sb = new StringBuilder();
        BufferedReader bufferedReader = null;
        try {
            BufferedReader bufferedReader2 = new BufferedReader(new FileReader(file));
            if (j > 0) {
                try {
                    bufferedReader2.skip(j);
                    bufferedReader2.readLine();
                } catch (Throwable th) {
                    th = th;
                    bufferedReader = bufferedReader2;
                    gvq0.m128290a(bufferedReader);
                    throw th;
                }
            }
            while (true) {
                String line = bufferedReader2.readLine();
                if (line == null) {
                    gvq0.m128290a(bufferedReader2);
                    return sb.toString();
                }
                if (sb.length() != 0 && str != null) {
                    sb.append(str);
                }
                sb.append(line);
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: c */
    public static String m151789c(File file, String str, String str2, JSONObject jSONObject, String str3, boolean z) {
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(file, str);
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("url", str2);
            jSONObject2.put("body", jSONObject);
            if (str3 == null) {
                str3 = "";
            }
            jSONObject2.put("dump_file", str3);
            jSONObject2.put("encrypt", z);
            m151799m(file2, jSONObject2, false);
        } catch (IOException e) {
            e = e;
            e.printStackTrace();
        } catch (JSONException e2) {
            e = e2;
            e.printStackTrace();
        }
        return file2.getAbsolutePath();
    }

    /* JADX INFO: renamed from: d */
    public static String m151790d(File file, String str, String str2, JSONObject jSONObject, boolean z) {
        return m151789c(file, str, str2, jSONObject, null, z);
    }

    /* JADX INFO: renamed from: e */
    public static String m151791e(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return m151787a(new File(str), str2);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX INFO: renamed from: f */
    public static bjq0 m151792f(File file, boolean z) {
        String strM151791e;
        String string;
        String str;
        String str2;
        bjq0 bjq0Var = new bjq0();
        String str3 = "InvalidStack.NoStackAvailable: not OOM.\n";
        if (file.exists()) {
            try {
                strM151791e = m151791e(file.getAbsolutePath(), SignParameters.NEW_LINE);
            } catch (IOException unused) {
                strM151791e = null;
            }
            if (TextUtils.isEmpty(strM151791e)) {
                if (z) {
                    str3 = "InvalidStack.NoStackAvailable: OOM.\n";
                }
                str2 = null;
                str = null;
            } else {
                String[] strArrSplit = strM151791e.split(SignParameters.NEW_LINE);
                ArrayList arrayList = new ArrayList();
                StringBuilder sb = new StringBuilder();
                StringBuilder sb2 = new StringBuilder();
                boolean z2 = false;
                boolean z3 = false;
                for (String str4 : strArrSplit) {
                    if (!z2 && str4.startsWith("stack:")) {
                        z2 = true;
                    } else if (!z3 && str4.startsWith("err:")) {
                        z3 = true;
                    } else if (z3) {
                        sb2.append(str4);
                        sb2.append(SignParameters.NEW_LINE);
                    } else if (z2) {
                        sb.append(str4);
                        sb.append(SignParameters.NEW_LINE);
                    } else {
                        arrayList.add(str4);
                    }
                }
                String str5 = arrayList.size() >= 1 ? (String) arrayList.get(0) : null;
                String str6 = arrayList.size() >= 2 ? (String) arrayList.get(1) : null;
                String str7 = arrayList.size() >= 3 ? (String) arrayList.get(2) : null;
                String str8 = arrayList.size() >= 4 ? (String) arrayList.get(3) : null;
                if (z2 && sb.length() > 0) {
                    string = sb.toString();
                } else if (str7 != null) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(str7);
                    sb3.append("\nCaused by: ");
                    sb3.append(z ? "InvalidStack.NoStackAvailable: OOM.\n" : "InvalidStack.NoStackAvailable: not OOM.\n");
                    string = sb3.toString();
                } else if (str6 != null) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(str6);
                    sb4.append("\nCaused by: ");
                    sb4.append(z ? "InvalidStack.NoStackAvailable: OOM.\n" : "InvalidStack.NoStackAvailable: not OOM.\n");
                    string = sb4.toString();
                } else {
                    string = z ? "InvalidStack.NoStackAvailable: OOM.\n" : "InvalidStack.NoStackAvailable: not OOM.\n";
                }
                if (z3 && sb2.length() > 0) {
                    string = string + "\nCaused by: InvalidStack.CrashWhenWriteStack: Npth ERROR:\n" + ((Object) sb2);
                }
                str3 = string;
                str = str5;
                str2 = str8;
            }
        } else {
            if (z) {
                str3 = "InvalidStack.NoStackAvailable: OOM.\n";
            }
            str2 = null;
            str = null;
        }
        bjq0Var.m102217j("data", str3);
        bjq0Var.m102217j("process_name", str);
        bjq0Var.m102217j("crash_thread_name", str2);
        bjq0Var.m102217j("isOOM", Boolean.valueOf(z));
        return bjq0Var;
    }

    /* JADX INFO: renamed from: g */
    public static qoq0 m151793g(File file, CrashType crashType) {
        bjq0 bjq0VarM151781B = m151781B(file);
        String name = file.getName();
        String strSubstring = name.substring(name.lastIndexOf(95) + 1);
        JSONObject jSONObjectOptJSONObject = bjq0VarM151781B.m102206G().optJSONObject("header");
        if (jSONObjectOptJSONObject.optString("unique_key", null) == null) {
            try {
                jSONObjectOptJSONObject.put("unique_key", "android_" + hrq0.m132696e().m138758a() + "_" + strSubstring + "_" + CrashType.LAUNCH);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        qoq0 qoq0Var = new qoq0();
        qoq0Var.m175755b(crashType == CrashType.LAUNCH ? C0922e.m5134v() : C0922e.m5131s());
        qoq0Var.m175757d(bjq0VarM151781B.m102206G());
        qoq0Var.m175758e(C0922e.m5121i());
        return qoq0Var;
    }

    /* JADX INFO: renamed from: h */
    public static JSONArray m151794h(File file, long j) throws Throwable {
        JSONArray jSONArray = new JSONArray();
        BufferedReader bufferedReader = null;
        try {
            BufferedReader bufferedReader2 = new BufferedReader(new FileReader(file));
            if (j > 0) {
                try {
                    bufferedReader2.skip(j);
                    bufferedReader2.readLine();
                } catch (Throwable th) {
                    th = th;
                    bufferedReader = bufferedReader2;
                    gvq0.m128290a(bufferedReader);
                    throw th;
                }
            }
            while (true) {
                String line = bufferedReader2.readLine();
                if (line == null) {
                    gvq0.m128290a(bufferedReader2);
                    return jSONArray;
                }
                jSONArray.put(line);
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m151795i(File file, File file2) throws Throwable {
        FileOutputStream fileOutputStream;
        if (file == null || file2 == null) {
            return;
        }
        FileInputStream fileInputStream = null;
        try {
            file2.getParentFile().mkdirs();
            FileInputStream fileInputStream2 = new FileInputStream(file);
            try {
                fileOutputStream = new FileOutputStream(file2);
                try {
                    byte[] bArr = new byte[8192];
                    while (true) {
                        int i = fileInputStream2.read(bArr);
                        if (i <= 0) {
                            break;
                        } else {
                            fileOutputStream.write(bArr, 0, i);
                        }
                    }
                    gvq0.m128290a(fileInputStream2);
                } catch (Exception e) {
                    e = e;
                    fileInputStream = fileInputStream2;
                    try {
                        e.printStackTrace();
                        gvq0.m128290a(fileInputStream);
                    } catch (Throwable th) {
                        th = th;
                        gvq0.m128290a(fileInputStream);
                        gvq0.m128290a(fileOutputStream);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileInputStream = fileInputStream2;
                    gvq0.m128290a(fileInputStream);
                    gvq0.m128290a(fileOutputStream);
                    throw th;
                }
            } catch (Exception e2) {
                e = e2;
                fileOutputStream = null;
            } catch (Throwable th3) {
                th = th3;
                fileOutputStream = null;
            }
        } catch (Exception e3) {
            e = e3;
            fileOutputStream = null;
        } catch (Throwable th4) {
            th = th4;
            fileOutputStream = null;
        }
        gvq0.m128290a(fileOutputStream);
    }

    /* JADX INFO: renamed from: j */
    public static void m151796j(File file, String str, boolean z) throws Throwable {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        file.getParentFile().mkdirs();
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(file, z);
            try {
                fileOutputStream2.write(str.getBytes());
                fileOutputStream2.flush();
                gvq0.m128290a(fileOutputStream2);
            } catch (Throwable th) {
                th = th;
                fileOutputStream = fileOutputStream2;
                gvq0.m128290a(fileOutputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: k */
    public static void m151797k(File file, Map<String, String> map) throws Throwable {
        if (map == null || map.isEmpty()) {
            return;
        }
        FileOutputStream fileOutputStream = null;
        try {
            try {
                Properties properties = new Properties();
                FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                try {
                    for (Map.Entry<String, String> entry : map.entrySet()) {
                        properties.setProperty(entry.getKey(), entry.getValue());
                    }
                    properties.store(fileOutputStream2, "no");
                    gvq0.m128290a(fileOutputStream2);
                } catch (IOException e) {
                    e = e;
                    fileOutputStream = fileOutputStream2;
                    kwq0.m147634g(e);
                    gvq0.m128290a(fileOutputStream);
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    gvq0.m128290a(fileOutputStream);
                    throw th;
                }
            } catch (IOException e2) {
                e = e2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: l */
    public static void m151798l(File file, JSONArray jSONArray, boolean z) {
        if (jSONArray == null) {
            return;
        }
        file.getParentFile().mkdirs();
        BufferedWriter bufferedWriter = null;
        try {
            BufferedWriter bufferedWriter2 = new BufferedWriter(new FileWriter(file));
            try {
                C0923m.m5138h(jSONArray, bufferedWriter2);
                gvq0.m128290a(bufferedWriter2);
            } catch (Throwable unused) {
                bufferedWriter = bufferedWriter2;
                gvq0.m128290a(bufferedWriter);
            }
        } catch (Throwable unused2) {
        }
    }

    /* JADX INFO: renamed from: m */
    public static void m151799m(File file, JSONObject jSONObject, boolean z) {
        if (jSONObject == null) {
            return;
        }
        file.getParentFile().mkdirs();
        BufferedWriter bufferedWriter = null;
        try {
            BufferedWriter bufferedWriter2 = new BufferedWriter(new FileWriter(file));
            try {
                C0923m.m5140j(jSONObject, bufferedWriter2);
                gvq0.m128290a(bufferedWriter2);
            } catch (Throwable unused) {
                bufferedWriter = bufferedWriter2;
                gvq0.m128290a(bufferedWriter);
            }
        } catch (Throwable unused2) {
        }
    }

    /* JADX INFO: renamed from: n */
    public static void m151800n(OutputStream outputStream, File... fileArr) throws Throwable {
        ZipOutputStream zipOutputStream = null;
        try {
            ZipOutputStream zipOutputStream2 = new ZipOutputStream(outputStream);
            try {
                zipOutputStream2.putNextEntry(new ZipEntry("/"));
                for (File file : fileArr) {
                    m151802p(zipOutputStream2, file);
                }
                gvq0.m128290a(zipOutputStream2);
            } catch (Throwable th) {
                th = th;
                zipOutputStream = zipOutputStream2;
                gvq0.m128290a(zipOutputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: o */
    private static void m151801o(String str, File file) throws Throwable {
        ZipOutputStream zipOutputStream = null;
        try {
            new File(str).getParentFile().mkdirs();
            ZipOutputStream zipOutputStream2 = new ZipOutputStream(new FileOutputStream(str));
            try {
                m151803q(zipOutputStream2, file, "");
                gvq0.m128290a(zipOutputStream2);
            } catch (Throwable th) {
                th = th;
                zipOutputStream = zipOutputStream2;
                gvq0.m128290a(zipOutputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: p */
    private static void m151802p(ZipOutputStream zipOutputStream, File file) throws Throwable {
        if (file == null || !file.exists()) {
            return;
        }
        File[] fileArrListFiles = file.isDirectory() ? file.listFiles() : new File[]{file};
        if (fileArrListFiles == null) {
            return;
        }
        for (File file2 : fileArrListFiles) {
            m151803q(zipOutputStream, file2, file2.getName());
        }
    }

    /* JADX INFO: renamed from: q */
    private static void m151803q(ZipOutputStream zipOutputStream, File file, String str) throws Throwable {
        if (file == null || !file.exists()) {
            return;
        }
        if (file.isDirectory()) {
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles == null) {
                return;
            }
            zipOutputStream.putNextEntry(new ZipEntry(str + "/"));
            String strConcat = str.length() == 0 ? "" : str.concat("/");
            for (int i = 0; i < fileArrListFiles.length; i++) {
                m151803q(zipOutputStream, fileArrListFiles[i], strConcat + fileArrListFiles[i].getName());
            }
            return;
        }
        zipOutputStream.putNextEntry(new ZipEntry(str));
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(file);
            try {
                byte[] bArr = new byte[4096];
                while (true) {
                    int i2 = fileInputStream2.read(bArr);
                    if (-1 == i2) {
                        gvq0.m128290a(fileInputStream2);
                        return;
                    }
                    zipOutputStream.write(bArr, 0, i2);
                }
            } catch (Throwable th) {
                th = th;
                fileInputStream = fileInputStream2;
                gvq0.m128290a(fileInputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: r */
    public static boolean m151804r(File file) {
        boolean zM151804r;
        boolean z = true;
        if (!file.exists()) {
            return true;
        }
        if (!file.canWrite()) {
            return false;
        }
        if (file.isFile()) {
            return file.delete();
        }
        if (!file.isDirectory()) {
            return true;
        }
        File[] fileArrListFiles = file.listFiles();
        for (int i = 0; fileArrListFiles != null && i < fileArrListFiles.length; i++) {
            if (fileArrListFiles[i].isFile()) {
                if (fileArrListFiles[i].canWrite()) {
                    zM151804r = fileArrListFiles[i].delete();
                } else {
                    z = false;
                }
            } else {
                zM151804r = m151804r(fileArrListFiles[i]);
            }
            z &= zM151804r;
        }
        return file.delete() & z;
    }

    /* JADX INFO: renamed from: s */
    public static boolean m151805s(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return m151804r(new File(str));
    }

    /* JADX INFO: renamed from: t */
    public static boolean m151806t(JSONArray jSONArray) {
        return jSONArray == null || jSONArray.length() == 0;
    }

    /* JADX INFO: renamed from: u */
    public static JSONArray m151807u(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return m151794h(new File(str), -1L);
    }

    /* JADX INFO: renamed from: v */
    public static JSONArray m151808v(String str, String str2) {
        JSONArray jSONArray = new JSONArray();
        if (str != null && str2 != null) {
            for (String str3 : str.split(str2)) {
                jSONArray.put(str3);
            }
        }
        return jSONArray;
    }

    /* JADX INFO: renamed from: w */
    public static void m151809w(File file, JSONObject jSONObject, boolean z) {
        if (jSONObject == null) {
            return;
        }
        file.getParentFile().mkdirs();
        BufferedWriter bufferedWriter = null;
        try {
            BufferedWriter bufferedWriter2 = new BufferedWriter(new FileWriter(file));
            try {
                C0923m.m5140j(jSONObject, bufferedWriter2);
                gvq0.m128290a(bufferedWriter2);
            } catch (Throwable th) {
                th = th;
                bufferedWriter = bufferedWriter2;
                try {
                    try {
                        jSONObject.put("err_write", th.toString());
                        bjq0.m102193k(jSONObject, "filters", "err_write", th.getLocalizedMessage());
                    } finally {
                        gvq0.m128290a(bufferedWriter);
                    }
                } catch (JSONException unused) {
                }
                jnq0.m142383a();
                jnq0.m142384b("NPTH_CATCH", th);
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: x */
    public static boolean m151810x(File file) {
        String[] list = file.list();
        return list == null || list.length == 0;
    }

    /* JADX INFO: renamed from: y */
    public static String m151811y(File file) {
        return m151787a(file, SignParameters.NEW_LINE);
    }

    /* JADX INFO: renamed from: z */
    public static String m151812z(String str) {
        return m151791e(str, SignParameters.NEW_LINE);
    }
}
