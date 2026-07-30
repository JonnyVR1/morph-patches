package p153l;

import android.content.Context;
import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class m0r0 {
    /* JADX INFO: renamed from: a */
    public static String m156523a(gr60 gr60Var) {
        return gr60Var.f195947a + "#" + gr60Var.f195948b + "#" + gr60Var.f195949c + "#" + gr60Var.f106008h;
    }

    /* JADX INFO: renamed from: b */
    private static HashMap<String, String> m156524b(String str) throws Throwable {
        HashMap<String, String> map = new HashMap<>();
        if (TextUtils.isEmpty(str) || !new File(str).exists()) {
            return map;
        }
        BufferedReader bufferedReader = null;
        try {
            try {
                BufferedReader bufferedReader2 = new BufferedReader(new FileReader(str));
                while (true) {
                    try {
                        String line = bufferedReader2.readLine();
                        if (line == null) {
                            j6r0.m143691b(bufferedReader2);
                            return map;
                        }
                        String[] strArrSplit = line.split("%%%");
                        if (strArrSplit.length >= 2 && !TextUtils.isEmpty(strArrSplit[0]) && !TextUtils.isEmpty(strArrSplit[1])) {
                            map.put(strArrSplit[0], strArrSplit[1]);
                        }
                    } catch (Exception e) {
                        e = e;
                        bufferedReader = bufferedReader2;
                        ouq0.m169397q(e);
                        j6r0.m143691b(bufferedReader);
                        return map;
                    } catch (Throwable th) {
                        th = th;
                        bufferedReader = bufferedReader2;
                        j6r0.m143691b(bufferedReader);
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:110:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:77:0x00f7  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.io.BufferedReader, java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX INFO: renamed from: c */
    public static List<String> m156525c(Context context, String str) throws Throwable {
        File file;
        RandomAccessFile randomAccessFile;
        ?? bufferedReader;
        gr60 gr60VarM156527e;
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(str) && new File(str).exists()) {
            FileLock fileLock = null;
            try {
                file = new File(str + ".lock");
                try {
                    j6r0.m143695f(file);
                    randomAccessFile = new RandomAccessFile(file, "rw");
                    try {
                        FileLock fileLockLock = randomAccessFile.getChannel().lock();
                        try {
                            bufferedReader = new BufferedReader(new FileReader(str));
                            while (true) {
                                try {
                                    String line = bufferedReader.readLine();
                                    if (line == null) {
                                        break;
                                    }
                                    String[] strArrSplit = line.split("%%%");
                                    if (strArrSplit.length >= 2 && !TextUtils.isEmpty(strArrSplit[0]) && !TextUtils.isEmpty(strArrSplit[1]) && (gr60VarM156527e = m156527e(m156526d(strArrSplit[0]), strArrSplit[1])) != null) {
                                        arrayList.add(gr60VarM156527e.mo131534d());
                                    }
                                } catch (Exception e) {
                                    e = e;
                                    fileLock = fileLockLock;
                                    bufferedReader = bufferedReader;
                                    try {
                                        ouq0.m169397q(e);
                                        if (fileLock != null && fileLock.isValid()) {
                                            try {
                                                fileLock.release();
                                            } catch (IOException e2) {
                                                ouq0.m169397q(e2);
                                            }
                                        }
                                        j6r0.m143691b(randomAccessFile);
                                        j6r0.m143691b(bufferedReader);
                                        if (file != null) {
                                        }
                                        return arrayList;
                                    } catch (Throwable th) {
                                        th = th;
                                        if (fileLock != null && fileLock.isValid()) {
                                            try {
                                                fileLock.release();
                                            } catch (IOException e3) {
                                                ouq0.m169397q(e3);
                                            }
                                        }
                                        j6r0.m143691b(randomAccessFile);
                                        j6r0.m143691b(bufferedReader);
                                        if (file == null) {
                                            throw th;
                                        }
                                        file.delete();
                                        throw th;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    fileLock = fileLockLock;
                                    if (fileLock != null) {
                                        fileLock.release();
                                    }
                                    j6r0.m143691b(randomAccessFile);
                                    j6r0.m143691b(bufferedReader);
                                    if (file == null) {
                                        throw th;
                                    }
                                    file.delete();
                                    throw th;
                                }
                            }
                            if (fileLockLock != null && fileLockLock.isValid()) {
                                try {
                                    fileLockLock.release();
                                } catch (IOException e4) {
                                    ouq0.m169397q(e4);
                                }
                            }
                            j6r0.m143691b(randomAccessFile);
                            j6r0.m143691b(bufferedReader);
                        } catch (Exception e5) {
                            e = e5;
                            bufferedReader = 0;
                        } catch (Throwable th3) {
                            th = th3;
                            bufferedReader = 0;
                        }
                    } catch (Exception e6) {
                        e = e6;
                        bufferedReader = 0;
                    } catch (Throwable th4) {
                        th = th4;
                        bufferedReader = 0;
                    }
                } catch (Exception e7) {
                    e = e7;
                    randomAccessFile = null;
                    bufferedReader = randomAccessFile;
                    ouq0.m169397q(e);
                    if (fileLock != null) {
                        fileLock.release();
                    }
                    j6r0.m143691b(randomAccessFile);
                    j6r0.m143691b(bufferedReader);
                    if (file != null) {
                        file.delete();
                    }
                    return arrayList;
                } catch (Throwable th5) {
                    th = th5;
                    randomAccessFile = null;
                    bufferedReader = randomAccessFile;
                    if (fileLock != null) {
                        fileLock.release();
                    }
                    j6r0.m143691b(randomAccessFile);
                    j6r0.m143691b(bufferedReader);
                    if (file == null) {
                        throw th;
                    }
                    file.delete();
                    throw th;
                }
            } catch (Exception e8) {
                e = e8;
                file = null;
                randomAccessFile = null;
            } catch (Throwable th6) {
                th = th6;
                file = null;
                randomAccessFile = null;
            }
            file.delete();
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: d */
    private static gr60 m156526d(String str) {
        gr60 gr60VarM131532e = null;
        try {
            String[] strArrM156532j = m156532j(str);
            if (strArrM156532j == null || strArrM156532j.length < 4 || TextUtils.isEmpty(strArrM156532j[0]) || TextUtils.isEmpty(strArrM156532j[1]) || TextUtils.isEmpty(strArrM156532j[2]) || TextUtils.isEmpty(strArrM156532j[3])) {
                return null;
            }
            gr60VarM131532e = gr60.m131532e();
            gr60VarM131532e.f195947a = Integer.parseInt(strArrM156532j[0]);
            gr60VarM131532e.f195948b = strArrM156532j[1];
            gr60VarM131532e.f195949c = Integer.parseInt(strArrM156532j[2]);
            gr60VarM131532e.f106008h = Integer.parseInt(strArrM156532j[3]);
            return gr60VarM131532e;
        } catch (Exception unused) {
            ouq0.m169406z("parse per key error");
            return gr60VarM131532e;
        }
    }

    /* JADX INFO: renamed from: e */
    private static gr60 m156527e(gr60 gr60Var, String str) {
        long[] jArrM156531i;
        if (gr60Var == null || (jArrM156531i = m156531i(str)) == null) {
            return null;
        }
        gr60Var.f106009i = jArrM156531i[0];
        gr60Var.f106010j = jArrM156531i[1];
        return gr60Var;
    }

    /* JADX INFO: renamed from: f */
    private static void m156528f(String str, HashMap<String, String> map) throws Throwable {
        BufferedWriter bufferedWriter;
        Throwable th;
        Exception e;
        if (TextUtils.isEmpty(str) || map == null || map.size() == 0) {
            return;
        }
        File file = new File(str);
        if (file.exists()) {
            file.delete();
        }
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(file));
            try {
                try {
                    for (String str2 : map.keySet()) {
                        bufferedWriter.write(str2 + "%%%" + map.get(str2));
                        bufferedWriter.newLine();
                    }
                    j6r0.m143691b(bufferedWriter);
                } catch (Exception e2) {
                    e = e2;
                    ouq0.m169397q(e);
                    j6r0.m143691b(bufferedWriter);
                }
            } catch (Throwable th2) {
                th = th2;
                j6r0.m143691b(bufferedWriter);
                throw th;
            }
        } catch (Exception e3) {
            bufferedWriter = null;
            e = e3;
        } catch (Throwable th3) {
            bufferedWriter = null;
            th = th3;
            j6r0.m143691b(bufferedWriter);
            throw th;
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m156529g(String str, xrq0[] xrq0VarArr) {
        RandomAccessFile randomAccessFile;
        FileLock fileLock;
        if (xrq0VarArr == null || xrq0VarArr.length <= 0 || TextUtils.isEmpty(str)) {
            return;
        }
        FileLock fileLockLock = null;
        try {
            try {
                File file = new File(str + ".lock");
                j6r0.m143695f(file);
                randomAccessFile = new RandomAccessFile(file, "rw");
                try {
                    fileLockLock = randomAccessFile.getChannel().lock();
                    HashMap<String, String> mapM156524b = m156524b(str);
                    for (xrq0 xrq0Var : xrq0VarArr) {
                        if (xrq0Var != null) {
                            String strM156523a = m156523a((gr60) xrq0Var);
                            long j = ((gr60) xrq0Var).f106009i;
                            long j2 = ((gr60) xrq0Var).f106010j;
                            if (!TextUtils.isEmpty(strM156523a) && j > 0 && j2 >= 0) {
                                m156530h(mapM156524b, strM156523a, j, j2);
                            }
                        }
                    }
                    m156528f(str, mapM156524b);
                    if (fileLockLock != null && fileLockLock.isValid()) {
                        fileLockLock.release();
                    }
                } catch (Throwable unused) {
                    fileLock = fileLockLock;
                    try {
                        ouq0.m169406z("failed to write perf to file ");
                        if (fileLock != null && fileLock.isValid()) {
                            fileLock.release();
                        }
                    } finally {
                        if (fileLock != null && fileLock.isValid()) {
                            try {
                                fileLock.release();
                            } catch (IOException e) {
                                ouq0.m169397q(e);
                            }
                        }
                        j6r0.m143691b(randomAccessFile);
                    }
                }
            } catch (Throwable unused2) {
                fileLock = null;
                randomAccessFile = null;
            }
        } catch (IOException e2) {
            ouq0.m169397q(e2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0050  */
    /* JADX WARN: Instruction removed from duplicated block: B:14:0x0050, please report this as an issue */
    /* JADX INFO: renamed from: h */
    private static void m156530h(HashMap<String, String> map, String str, long j, long j2) {
        String str2;
        String str3 = map.get(str);
        if (TextUtils.isEmpty(str3)) {
            map.put(str, j + "#" + j2);
            return;
        }
        long[] jArrM156531i = m156531i(str3);
        if (jArrM156531i != null) {
            long j3 = jArrM156531i[0];
            if (j3 > 0) {
                long j4 = jArrM156531i[1];
                if (j4 < 0) {
                    str2 = j + "#" + j2;
                } else {
                    str2 = (j + j3) + "#" + (j2 + j4);
                }
            } else {
                str2 = j + "#" + j2;
            }
        } else {
            str2 = j + "#" + j2;
        }
        map.put(str, str2);
    }

    /* JADX INFO: renamed from: i */
    public static long[] m156531i(String str) {
        long[] jArr = new long[2];
        try {
            String[] strArrSplit = str.split("#");
            if (strArrSplit.length >= 2) {
                jArr[0] = Long.parseLong(strArrSplit[0].trim());
                jArr[1] = Long.parseLong(strArrSplit[1].trim());
            }
            return jArr;
        } catch (Exception e) {
            ouq0.m169397q(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: j */
    private static String[] m156532j(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return str.split("#");
    }
}
