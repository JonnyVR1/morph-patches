package p153l;

import android.content.Context;
import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public class qsq0 {
    /* JADX INFO: renamed from: a */
    public static boolean m177814a(Context context, String str, long j) throws Throwable {
        RandomAccessFile randomAccessFile;
        FileLock fileLockLock = null;
        try {
            try {
                File file = new File(context.getFilesDir(), "/.vdevdir/");
                if (!e6r0.m119667b(file)) {
                    j6r0.m143691b(null);
                    return true;
                }
                File file2 = new File(file, "lcfp.lock");
                j6r0.m143695f(file2);
                randomAccessFile = new RandomAccessFile(file2, "rw");
                try {
                    fileLockLock = randomAccessFile.getChannel().lock();
                    boolean zM177815b = m177815b(context, str, j);
                    if (fileLockLock != null && fileLockLock.isValid()) {
                        try {
                            fileLockLock.release();
                        } catch (IOException unused) {
                        }
                    }
                    j6r0.m143691b(randomAccessFile);
                    return zM177815b;
                } catch (IOException e) {
                    e = e;
                }
            } catch (Throwable th) {
                th = th;
                if (0 != 0 && fileLockLock.isValid()) {
                    try {
                        fileLockLock.release();
                    } catch (IOException unused2) {
                    }
                }
                j6r0.m143691b(null);
                throw th;
            }
        } catch (IOException e2) {
            e = e2;
            randomAccessFile = null;
        } catch (Throwable th2) {
            th = th2;
            if (0 != 0) {
                fileLockLock.release();
            }
            j6r0.m143691b(null);
            throw th;
        }
        e.printStackTrace();
        if (fileLockLock != null && fileLockLock.isValid()) {
            try {
                fileLockLock.release();
            } catch (IOException unused3) {
            }
        }
        j6r0.m143691b(randomAccessFile);
        return true;
    }

    /* JADX INFO: renamed from: b */
    private static boolean m177815b(Context context, String str, long j) throws Throwable {
        boolean z;
        BufferedReader bufferedReader;
        File file = new File(context.getFilesDir(), "/.vdevdir/");
        char c = 1;
        if (!e6r0.m119667b(file)) {
            return true;
        }
        File file2 = new File(file, "lcfp");
        ArrayList arrayList = new ArrayList();
        long jCurrentTimeMillis = System.currentTimeMillis();
        String str2 = str + ":" + context.getPackageName() + Constants.SEPARATOR_COMMA + jCurrentTimeMillis;
        Closeable closeable = null;
        if (file2.exists()) {
            try {
                bufferedReader = new BufferedReader(new FileReader(file2));
                while (true) {
                    try {
                        try {
                            String line = bufferedReader.readLine();
                            if (line == null) {
                                z = c == true ? 1 : 0;
                                break;
                            }
                            String[] strArrSplit = line.split(":");
                            if (strArrSplit.length == 2) {
                                String str3 = strArrSplit[0];
                                z = c == true ? 1 : 0;
                                try {
                                    if (TextUtils.equals(str3, String.valueOf(str))) {
                                        String[] strArrSplit2 = strArrSplit[z ? 1 : 0].split(Constants.SEPARATOR_COMMA);
                                        if (strArrSplit2.length == 2) {
                                            long j2 = Long.parseLong(strArrSplit2[z ? 1 : 0]);
                                            if (!TextUtils.equals(strArrSplit2[0], context.getPackageName()) && Math.abs(jCurrentTimeMillis - j2) < 1000 * j * 0.9f) {
                                                j6r0.m143691b(bufferedReader);
                                                return false;
                                            }
                                        }
                                    } else {
                                        arrayList.add(line);
                                    }
                                    c = z ? 1 : 0;
                                } catch (Exception unused) {
                                }
                            }
                        } catch (Throwable th) {
                            th = th;
                            closeable = bufferedReader;
                            j6r0.m143691b(closeable);
                            throw th;
                        }
                    } catch (Exception unused2) {
                        z = c == true ? 1 : 0;
                    }
                    arrayList.clear();
                }
            } catch (Exception unused3) {
                z = true;
                bufferedReader = null;
            } catch (Throwable th2) {
                th = th2;
                j6r0.m143691b(closeable);
                throw th;
            }
            j6r0.m143691b(bufferedReader);
        } else {
            z = true;
            if (!j6r0.m143695f(file2)) {
                return true;
            }
        }
        arrayList.add(str2);
        try {
            try {
                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file2));
                try {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        bufferedWriter.write((String) it.next());
                        bufferedWriter.newLine();
                        bufferedWriter.flush();
                    }
                    j6r0.m143691b(bufferedWriter);
                } catch (IOException e) {
                    e = e;
                    closeable = bufferedWriter;
                    ouq0.m169378B(e.toString());
                    j6r0.m143691b(closeable);
                } catch (Throwable th3) {
                    th = th3;
                    closeable = bufferedWriter;
                    j6r0.m143691b(closeable);
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (IOException e2) {
            e = e2;
        }
        return z;
    }
}
