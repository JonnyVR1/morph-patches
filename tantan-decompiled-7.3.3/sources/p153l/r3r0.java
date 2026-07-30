package p153l;

import android.text.TextUtils;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.apm.lite.CrashType;
import com.apm.lite.nativecrash.NativeImpl;
import com.apm.lite.p010j.C0926e;
import com.apm.lite.p011k.C0927m;
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
public class r3r0 {
    /* JADX INFO: renamed from: A */
    public static void m179668A(String str, String str2) throws Throwable {
        m179689o(str2, new File(str));
    }

    /* JADX INFO: renamed from: B */
    public static gsq0 m179669B(File file) {
        gsq0 gsq0VarM179680f = m179680f(new File(file, "logEventStack"), file.getName().contains("oom"));
        boolean z = false;
        for (int i = 0; i < sxq0.m188483b(); i++) {
            File fileM143569e = j5r0.m143569e(file, "." + i);
            if (fileM143569e.exists()) {
                try {
                    gsq0VarM179680f.m132144y(new JSONObject(m179700z(fileM143569e.getAbsolutePath())));
                    z = true;
                } catch (Throwable unused) {
                }
            }
        }
        gsq0VarM179680f.m132129c("crash_type", z ? "step" : "simple");
        JSONObject jSONObjectOptJSONObject = gsq0VarM179680f.m132125G().optJSONObject("header");
        JSONObject jSONObjectM137501s = hwq0.m137477b(n0r0.m161022i(), gsq0VarM179680f.m132125G().optLong("crash_time", 0L)).m137501s();
        if (jSONObjectOptJSONObject == null) {
            gsq0VarM179680f.m132135i(jSONObjectM137501s);
        } else {
            t4r0.m189301e(jSONObjectOptJSONObject, jSONObjectM137501s);
        }
        return gsq0VarM179680f;
    }

    /* JADX INFO: renamed from: C */
    public static wxq0 m179670C(String str) {
        try {
            String strM179700z = m179700z(str);
            if (strM179700z == null) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(strM179700z);
            wxq0 wxq0Var = new wxq0();
            wxq0Var.m208425b(jSONObject.optString("url"));
            wxq0Var.m208427d(jSONObject.optJSONObject("body"));
            wxq0Var.m208430g(jSONObject.optString("dump_file"));
            wxq0Var.m208428e(jSONObject.optBoolean("encrypt", false));
            return wxq0Var;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: D */
    public static Map<String, String> m179671D(File file) throws Throwable {
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
                    m4r0.m157051a(fileInputStream);
                    return map;
                } catch (IOException e) {
                    e = e;
                    q5r0.m175517g(e);
                    m4r0.m157051a(fileInputStream);
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                fileInputStream2 = fileInputStream;
                m4r0.m157051a(fileInputStream2);
                throw th;
            }
        } catch (IOException e2) {
            e = e2;
            fileInputStream = null;
        } catch (Throwable th2) {
            th = th2;
            m4r0.m157051a(fileInputStream2);
            throw th;
        }
    }

    /* JADX INFO: renamed from: E */
    public static wxq0 m179672E(String str) {
        try {
            JSONObject jSONObject = new JSONObject(m179700z(str));
            wxq0 wxq0Var = new wxq0();
            wxq0Var.m208434k(jSONObject.optString("aid"));
            wxq0Var.m208432i(jSONObject.optString("did"));
            wxq0Var.m208436m(jSONObject.optString("processName"));
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("alogFiles");
            if (jSONArrayOptJSONArray != null) {
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    arrayList.add(jSONArrayOptJSONArray.getString(i));
                }
                wxq0Var.m208426c(arrayList);
            }
            return wxq0Var;
        } catch (IOException | JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: renamed from: F */
    public static void m179673F(File file) {
        File file2 = new File(file, JoinPoint.SYNCHRONIZATION_LOCK);
        try {
            file2.createNewFile();
            NativeImpl.m5167e(file2.getAbsolutePath());
        } catch (Throwable th) {
            pwq0.m174074a();
            pwq0.m174075b("NPTH_CATCH", th);
        }
    }

    /* JADX INFO: renamed from: G */
    public static boolean m179674G(File file) {
        if (!file.isFile()) {
            file = new File(file, JoinPoint.SYNCHRONIZATION_LOCK);
        }
        if (!file.exists()) {
            return false;
        }
        try {
            int iM5167e = NativeImpl.m5167e(file.getAbsolutePath());
            if (iM5167e > 0) {
                NativeImpl.m5187y(iM5167e);
                return false;
            }
            if (iM5167e < 0) {
                return true;
            }
        } catch (Throwable th) {
            pwq0.m174074a();
            pwq0.m174075b("NPTH_CATCH", th);
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    public static String m179675a(File file, String str) {
        return m179676b(file, str, -1L);
    }

    /* JADX INFO: renamed from: b */
    public static String m179676b(File file, String str, long j) throws Throwable {
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
                    m4r0.m157051a(bufferedReader);
                    throw th;
                }
            }
            while (true) {
                String line = bufferedReader2.readLine();
                if (line == null) {
                    m4r0.m157051a(bufferedReader2);
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
    public static String m179677c(File file, String str, String str2, JSONObject jSONObject, String str3, boolean z) {
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
            m179687m(file2, jSONObject2, false);
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
    public static String m179678d(File file, String str, String str2, JSONObject jSONObject, boolean z) {
        return m179677c(file, str, str2, jSONObject, null, z);
    }

    /* JADX INFO: renamed from: e */
    public static String m179679e(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return m179675a(new File(str), str2);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX INFO: renamed from: f */
    public static gsq0 m179680f(File file, boolean z) {
        String strM179679e;
        String string;
        String str;
        String str2;
        gsq0 gsq0Var = new gsq0();
        String str3 = "InvalidStack.NoStackAvailable: not OOM.\n";
        if (file.exists()) {
            try {
                strM179679e = m179679e(file.getAbsolutePath(), SignParameters.NEW_LINE);
            } catch (IOException unused) {
                strM179679e = null;
            }
            if (TextUtils.isEmpty(strM179679e)) {
                if (z) {
                    str3 = "InvalidStack.NoStackAvailable: OOM.\n";
                }
                str2 = null;
                str = null;
            } else {
                String[] strArrSplit = strM179679e.split(SignParameters.NEW_LINE);
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
        gsq0Var.m132136j("data", str3);
        gsq0Var.m132136j("process_name", str);
        gsq0Var.m132136j("crash_thread_name", str2);
        gsq0Var.m132136j("isOOM", Boolean.valueOf(z));
        return gsq0Var;
    }

    /* JADX INFO: renamed from: g */
    public static wxq0 m179681g(File file, CrashType crashType) {
        gsq0 gsq0VarM179669B = m179669B(file);
        String name = file.getName();
        String strSubstring = name.substring(name.lastIndexOf(95) + 1);
        JSONObject jSONObjectOptJSONObject = gsq0VarM179669B.m132125G().optJSONObject("header");
        if (jSONObjectOptJSONObject.optString("unique_key", null) == null) {
            try {
                jSONObjectOptJSONObject.put("unique_key", "android_" + n0r0.m161018e().m166169a() + "_" + strSubstring + "_" + CrashType.LAUNCH);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        wxq0 wxq0Var = new wxq0();
        wxq0Var.m208425b(crashType == CrashType.LAUNCH ? C0926e.m5144v() : C0926e.m5141s());
        wxq0Var.m208427d(gsq0VarM179669B.m132125G());
        wxq0Var.m208428e(C0926e.m5131i());
        return wxq0Var;
    }

    /* JADX INFO: renamed from: h */
    public static JSONArray m179682h(File file, long j) throws Throwable {
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
                    m4r0.m157051a(bufferedReader);
                    throw th;
                }
            }
            while (true) {
                String line = bufferedReader2.readLine();
                if (line == null) {
                    m4r0.m157051a(bufferedReader2);
                    return jSONArray;
                }
                jSONArray.put(line);
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m179683i(File file, File file2) throws Throwable {
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
                    m4r0.m157051a(fileInputStream2);
                } catch (Exception e) {
                    e = e;
                    fileInputStream = fileInputStream2;
                    try {
                        e.printStackTrace();
                        m4r0.m157051a(fileInputStream);
                    } catch (Throwable th) {
                        th = th;
                        m4r0.m157051a(fileInputStream);
                        m4r0.m157051a(fileOutputStream);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileInputStream = fileInputStream2;
                    m4r0.m157051a(fileInputStream);
                    m4r0.m157051a(fileOutputStream);
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
        m4r0.m157051a(fileOutputStream);
    }

    /* JADX INFO: renamed from: j */
    public static void m179684j(File file, String str, boolean z) throws Throwable {
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
                m4r0.m157051a(fileOutputStream2);
            } catch (Throwable th) {
                th = th;
                fileOutputStream = fileOutputStream2;
                m4r0.m157051a(fileOutputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: k */
    public static void m179685k(File file, Map<String, String> map) throws Throwable {
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
                    m4r0.m157051a(fileOutputStream2);
                } catch (IOException e) {
                    e = e;
                    fileOutputStream = fileOutputStream2;
                    q5r0.m175517g(e);
                    m4r0.m157051a(fileOutputStream);
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    m4r0.m157051a(fileOutputStream);
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
    public static void m179686l(File file, JSONArray jSONArray, boolean z) {
        if (jSONArray == null) {
            return;
        }
        file.getParentFile().mkdirs();
        BufferedWriter bufferedWriter = null;
        try {
            BufferedWriter bufferedWriter2 = new BufferedWriter(new FileWriter(file));
            try {
                C0927m.m5148h(jSONArray, bufferedWriter2);
                m4r0.m157051a(bufferedWriter2);
            } catch (Throwable unused) {
                bufferedWriter = bufferedWriter2;
                m4r0.m157051a(bufferedWriter);
            }
        } catch (Throwable unused2) {
        }
    }

    /* JADX INFO: renamed from: m */
    public static void m179687m(File file, JSONObject jSONObject, boolean z) {
        if (jSONObject == null) {
            return;
        }
        file.getParentFile().mkdirs();
        BufferedWriter bufferedWriter = null;
        try {
            BufferedWriter bufferedWriter2 = new BufferedWriter(new FileWriter(file));
            try {
                C0927m.m5150j(jSONObject, bufferedWriter2);
                m4r0.m157051a(bufferedWriter2);
            } catch (Throwable unused) {
                bufferedWriter = bufferedWriter2;
                m4r0.m157051a(bufferedWriter);
            }
        } catch (Throwable unused2) {
        }
    }

    /* JADX INFO: renamed from: n */
    public static void m179688n(OutputStream outputStream, File... fileArr) throws Throwable {
        ZipOutputStream zipOutputStream = null;
        try {
            ZipOutputStream zipOutputStream2 = new ZipOutputStream(outputStream);
            try {
                zipOutputStream2.putNextEntry(new ZipEntry("/"));
                for (File file : fileArr) {
                    m179690p(zipOutputStream2, file);
                }
                m4r0.m157051a(zipOutputStream2);
            } catch (Throwable th) {
                th = th;
                zipOutputStream = zipOutputStream2;
                m4r0.m157051a(zipOutputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: o */
    private static void m179689o(String str, File file) throws Throwable {
        ZipOutputStream zipOutputStream = null;
        try {
            new File(str).getParentFile().mkdirs();
            ZipOutputStream zipOutputStream2 = new ZipOutputStream(new FileOutputStream(str));
            try {
                m179691q(zipOutputStream2, file, "");
                m4r0.m157051a(zipOutputStream2);
            } catch (Throwable th) {
                th = th;
                zipOutputStream = zipOutputStream2;
                m4r0.m157051a(zipOutputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: p */
    private static void m179690p(ZipOutputStream zipOutputStream, File file) throws Throwable {
        if (file == null || !file.exists()) {
            return;
        }
        File[] fileArrListFiles = file.isDirectory() ? file.listFiles() : new File[]{file};
        if (fileArrListFiles == null) {
            return;
        }
        for (File file2 : fileArrListFiles) {
            m179691q(zipOutputStream, file2, file2.getName());
        }
    }

    /* JADX INFO: renamed from: q */
    private static void m179691q(ZipOutputStream zipOutputStream, File file, String str) throws Throwable {
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
                m179691q(zipOutputStream, fileArrListFiles[i], strConcat + fileArrListFiles[i].getName());
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
                        m4r0.m157051a(fileInputStream2);
                        return;
                    }
                    zipOutputStream.write(bArr, 0, i2);
                }
            } catch (Throwable th) {
                th = th;
                fileInputStream = fileInputStream2;
                m4r0.m157051a(fileInputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: r */
    public static boolean m179692r(File file) {
        boolean zM179692r;
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
                    zM179692r = fileArrListFiles[i].delete();
                } else {
                    z = false;
                }
            } else {
                zM179692r = m179692r(fileArrListFiles[i]);
            }
            z &= zM179692r;
        }
        return file.delete() & z;
    }

    /* JADX INFO: renamed from: s */
    public static boolean m179693s(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return m179692r(new File(str));
    }

    /* JADX INFO: renamed from: t */
    public static boolean m179694t(JSONArray jSONArray) {
        return jSONArray == null || jSONArray.length() == 0;
    }

    /* JADX INFO: renamed from: u */
    public static JSONArray m179695u(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return m179682h(new File(str), -1L);
    }

    /* JADX INFO: renamed from: v */
    public static JSONArray m179696v(String str, String str2) {
        JSONArray jSONArray = new JSONArray();
        if (str != null && str2 != null) {
            for (String str3 : str.split(str2)) {
                jSONArray.put(str3);
            }
        }
        return jSONArray;
    }

    /* JADX INFO: renamed from: w */
    public static void m179697w(File file, JSONObject jSONObject, boolean z) {
        if (jSONObject == null) {
            return;
        }
        file.getParentFile().mkdirs();
        BufferedWriter bufferedWriter = null;
        try {
            BufferedWriter bufferedWriter2 = new BufferedWriter(new FileWriter(file));
            try {
                C0927m.m5150j(jSONObject, bufferedWriter2);
                m4r0.m157051a(bufferedWriter2);
            } catch (Throwable th) {
                th = th;
                bufferedWriter = bufferedWriter2;
                try {
                    try {
                        jSONObject.put("err_write", th.toString());
                        gsq0.m132112k(jSONObject, "filters", "err_write", th.getLocalizedMessage());
                    } finally {
                        m4r0.m157051a(bufferedWriter);
                    }
                } catch (JSONException unused) {
                }
                pwq0.m174074a();
                pwq0.m174075b("NPTH_CATCH", th);
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: x */
    public static boolean m179698x(File file) {
        String[] list = file.list();
        return list == null || list.length == 0;
    }

    /* JADX INFO: renamed from: y */
    public static String m179699y(File file) {
        return m179675a(file, SignParameters.NEW_LINE);
    }

    /* JADX INFO: renamed from: z */
    public static String m179700z(String str) {
        return m179679e(str, SignParameters.NEW_LINE);
    }
}
