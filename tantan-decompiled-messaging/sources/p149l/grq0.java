package p149l;

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
public class grq0 {
    /* JADX INFO: renamed from: a */
    public static String m127753a(bj60 bj60Var) {
        return bj60Var.f164730a + "#" + bj60Var.f164731b + "#" + bj60Var.f164732c + "#" + bj60Var.f75885h;
    }

    /* JADX INFO: renamed from: b */
    private static HashMap<String, String> m127754b(String str) throws Throwable {
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
                            dxq0.m114018b(bufferedReader2);
                            return map;
                        }
                        String[] strArrSplit = line.split("%%%");
                        if (strArrSplit.length >= 2 && !TextUtils.isEmpty(strArrSplit[0]) && !TextUtils.isEmpty(strArrSplit[1])) {
                            map.put(strArrSplit[0], strArrSplit[1]);
                        }
                    } catch (Exception e) {
                        e = e;
                        bufferedReader = bufferedReader2;
                        ilq0.m137044q(e);
                        dxq0.m114018b(bufferedReader);
                        return map;
                    } catch (Throwable th) {
                        th = th;
                        bufferedReader = bufferedReader2;
                        dxq0.m114018b(bufferedReader);
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
    public static List<String> m127755c(Context context, String str) throws Throwable {
        File file;
        RandomAccessFile randomAccessFile;
        ?? bufferedReader;
        bj60 bj60VarM127757e;
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(str) && new File(str).exists()) {
            FileLock fileLock = null;
            try {
                file = new File(str + ".lock");
                try {
                    dxq0.m114022f(file);
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
                                    if (strArrSplit.length >= 2 && !TextUtils.isEmpty(strArrSplit[0]) && !TextUtils.isEmpty(strArrSplit[1]) && (bj60VarM127757e = m127757e(m127756d(strArrSplit[0]), strArrSplit[1])) != null) {
                                        arrayList.add(bj60VarM127757e.mo102164d());
                                    }
                                } catch (Exception e) {
                                    e = e;
                                    fileLock = fileLockLock;
                                    bufferedReader = bufferedReader;
                                    try {
                                        ilq0.m137044q(e);
                                        if (fileLock != null && fileLock.isValid()) {
                                            try {
                                                fileLock.release();
                                            } catch (IOException e2) {
                                                ilq0.m137044q(e2);
                                            }
                                        }
                                        dxq0.m114018b(randomAccessFile);
                                        dxq0.m114018b(bufferedReader);
                                        if (file != null) {
                                        }
                                        return arrayList;
                                    } catch (Throwable th) {
                                        th = th;
                                        if (fileLock != null && fileLock.isValid()) {
                                            try {
                                                fileLock.release();
                                            } catch (IOException e3) {
                                                ilq0.m137044q(e3);
                                            }
                                        }
                                        dxq0.m114018b(randomAccessFile);
                                        dxq0.m114018b(bufferedReader);
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
                                    dxq0.m114018b(randomAccessFile);
                                    dxq0.m114018b(bufferedReader);
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
                                    ilq0.m137044q(e4);
                                }
                            }
                            dxq0.m114018b(randomAccessFile);
                            dxq0.m114018b(bufferedReader);
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
                    ilq0.m137044q(e);
                    if (fileLock != null) {
                        fileLock.release();
                    }
                    dxq0.m114018b(randomAccessFile);
                    dxq0.m114018b(bufferedReader);
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
                    dxq0.m114018b(randomAccessFile);
                    dxq0.m114018b(bufferedReader);
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
    private static bj60 m127756d(String str) {
        bj60 bj60VarM102162e = null;
        try {
            String[] strArrM127762j = m127762j(str);
            if (strArrM127762j == null || strArrM127762j.length < 4 || TextUtils.isEmpty(strArrM127762j[0]) || TextUtils.isEmpty(strArrM127762j[1]) || TextUtils.isEmpty(strArrM127762j[2]) || TextUtils.isEmpty(strArrM127762j[3])) {
                return null;
            }
            bj60VarM102162e = bj60.m102162e();
            bj60VarM102162e.f164730a = Integer.parseInt(strArrM127762j[0]);
            bj60VarM102162e.f164731b = strArrM127762j[1];
            bj60VarM102162e.f164732c = Integer.parseInt(strArrM127762j[2]);
            bj60VarM102162e.f75885h = Integer.parseInt(strArrM127762j[3]);
            return bj60VarM102162e;
        } catch (Exception unused) {
            ilq0.m137053z("parse per key error");
            return bj60VarM102162e;
        }
    }

    /* JADX INFO: renamed from: e */
    private static bj60 m127757e(bj60 bj60Var, String str) {
        long[] jArrM127761i;
        if (bj60Var == null || (jArrM127761i = m127761i(str)) == null) {
            return null;
        }
        bj60Var.f75886i = jArrM127761i[0];
        bj60Var.f75887j = jArrM127761i[1];
        return bj60Var;
    }

    /* JADX INFO: renamed from: f */
    private static void m127758f(String str, HashMap<String, String> map) throws Throwable {
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
                    dxq0.m114018b(bufferedWriter);
                } catch (Exception e2) {
                    e = e2;
                    ilq0.m137044q(e);
                    dxq0.m114018b(bufferedWriter);
                }
            } catch (Throwable th2) {
                th = th2;
                dxq0.m114018b(bufferedWriter);
                throw th;
            }
        } catch (Exception e3) {
            bufferedWriter = null;
            e = e3;
        } catch (Throwable th3) {
            bufferedWriter = null;
            th = th3;
            dxq0.m114018b(bufferedWriter);
            throw th;
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m127759g(String str, siq0[] siq0VarArr) {
        RandomAccessFile randomAccessFile;
        FileLock fileLock;
        if (siq0VarArr == null || siq0VarArr.length <= 0 || TextUtils.isEmpty(str)) {
            return;
        }
        FileLock fileLockLock = null;
        try {
            try {
                File file = new File(str + ".lock");
                dxq0.m114022f(file);
                randomAccessFile = new RandomAccessFile(file, "rw");
                try {
                    fileLockLock = randomAccessFile.getChannel().lock();
                    HashMap<String, String> mapM127754b = m127754b(str);
                    for (siq0 siq0Var : siq0VarArr) {
                        if (siq0Var != null) {
                            String strM127753a = m127753a((bj60) siq0Var);
                            long j = ((bj60) siq0Var).f75886i;
                            long j2 = ((bj60) siq0Var).f75887j;
                            if (!TextUtils.isEmpty(strM127753a) && j > 0 && j2 >= 0) {
                                m127760h(mapM127754b, strM127753a, j, j2);
                            }
                        }
                    }
                    m127758f(str, mapM127754b);
                    if (fileLockLock != null && fileLockLock.isValid()) {
                        fileLockLock.release();
                    }
                } catch (Throwable unused) {
                    fileLock = fileLockLock;
                    try {
                        ilq0.m137053z("failed to write perf to file ");
                        if (fileLock != null && fileLock.isValid()) {
                            fileLock.release();
                        }
                    } finally {
                        if (fileLock != null && fileLock.isValid()) {
                            try {
                                fileLock.release();
                            } catch (IOException e) {
                                ilq0.m137044q(e);
                            }
                        }
                        dxq0.m114018b(randomAccessFile);
                    }
                }
            } catch (Throwable unused2) {
                fileLock = null;
                randomAccessFile = null;
            }
        } catch (IOException e2) {
            ilq0.m137044q(e2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0050  */
    /* JADX WARN: Instruction removed from duplicated block: B:14:0x0050, please report this as an issue */
    /* JADX INFO: renamed from: h */
    private static void m127760h(HashMap<String, String> map, String str, long j, long j2) {
        String str2;
        String str3 = map.get(str);
        if (TextUtils.isEmpty(str3)) {
            map.put(str, j + "#" + j2);
            return;
        }
        long[] jArrM127761i = m127761i(str3);
        if (jArrM127761i != null) {
            long j3 = jArrM127761i[0];
            if (j3 > 0) {
                long j4 = jArrM127761i[1];
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
    public static long[] m127761i(String str) {
        long[] jArr = new long[2];
        try {
            String[] strArrSplit = str.split("#");
            if (strArrSplit.length >= 2) {
                jArr[0] = Long.parseLong(strArrSplit[0].trim());
                jArr[1] = Long.parseLong(strArrSplit[1].trim());
            }
            return jArr;
        } catch (Exception e) {
            ilq0.m137044q(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: j */
    private static String[] m127762j(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return str.split("#");
    }
}
