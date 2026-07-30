package p149l;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileLock;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class fmq0 {

    /* JADX INFO: renamed from: l.fmq0$a */
    public static class C16883a implements FilenameFilter {
        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return (TextUtils.isEmpty(str) || str.toLowerCase().endsWith(".lock")) ? false : true;
        }
    }

    /* JADX INFO: renamed from: l.fmq0$b */
    public static class C16884b implements FilenameFilter {
        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return (TextUtils.isEmpty(str) || str.toLowerCase().endsWith(".lock")) ? false : true;
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m122191a() {
        return Build.VERSION.RELEASE + "-" + Build.VERSION.INCREMENTAL;
    }

    /* JADX INFO: renamed from: b */
    public static String m122192b(Context context) {
        String strM127048b = gmq0.m127046c(context).m127048b("sp_client_report_status", "sp_client_report_key", "");
        if (!TextUtils.isEmpty(strM127048b)) {
            return strM127048b;
        }
        String strM198838a = vlq0.m198838a(20);
        gmq0.m127046c(context).m127050e("sp_client_report_status", "sp_client_report_key", strM198838a);
        return strM198838a;
    }

    /* JADX WARN: Code duplicated, block: B:109:0x0130 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x012d  */
    /* JADX INFO: renamed from: c */
    public static void m122193c(Context context, String str, String str2) throws Throwable {
        File file;
        RandomAccessFile randomAccessFile;
        Exception e;
        if (context == null || str == null || str2 == null) {
            return;
        }
        File file2 = new File(context.getFilesDir(), str2);
        if (!file2.exists()) {
            file2.mkdirs();
        }
        File file3 = new File(context.getFilesDir(), str);
        if (!file3.exists()) {
            file3.mkdirs();
            return;
        }
        File[] fileArrListFiles = file3.listFiles(new C16883a());
        if (fileArrListFiles == null || fileArrListFiles.length <= 0) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        FileLock fileLockLock = null;
        File file4 = null;
        RandomAccessFile randomAccessFile2 = null;
        for (File file5 : fileArrListFiles) {
            if (file5 != null) {
                try {
                    if (TextUtils.isEmpty(file5.getAbsolutePath())) {
                        if (fileLockLock != null && fileLockLock.isValid()) {
                            try {
                                fileLockLock.release();
                            } catch (IOException e2) {
                                ilq0.m137044q(e2);
                            }
                        }
                        dxq0.m114018b(randomAccessFile2);
                        if (file4 != null) {
                            file4.delete();
                        }
                    } else {
                        file = new File(file5.getAbsolutePath() + ".lock");
                        try {
                            dxq0.m114022f(file);
                            randomAccessFile = new RandomAccessFile(file, "rw");
                            try {
                                try {
                                    fileLockLock = randomAccessFile.getChannel().lock();
                                    File file6 = new File(file2.getAbsolutePath() + File.separator + file5.getName() + jCurrentTimeMillis);
                                    try {
                                        dxq0.m114025i(file5, file6);
                                    } catch (IOException e3) {
                                        e3.printStackTrace();
                                        file5.delete();
                                        file6.delete();
                                    }
                                    file5.delete();
                                    if (fileLockLock != null && fileLockLock.isValid()) {
                                        try {
                                            fileLockLock.release();
                                        } catch (IOException e4) {
                                            ilq0.m137044q(e4);
                                        }
                                    }
                                    dxq0.m114018b(randomAccessFile);
                                } catch (Throwable th) {
                                    th = th;
                                    randomAccessFile2 = randomAccessFile;
                                    file4 = file;
                                    if (fileLockLock != null && fileLockLock.isValid()) {
                                        try {
                                            fileLockLock.release();
                                        } catch (IOException e5) {
                                            ilq0.m137044q(e5);
                                        }
                                    }
                                    dxq0.m114018b(randomAccessFile2);
                                    if (file4 == null) {
                                        throw th;
                                    }
                                    file4.delete();
                                    throw th;
                                }
                            } catch (Exception e6) {
                                e = e6;
                                ilq0.m137044q(e);
                                if (fileLockLock != null) {
                                    try {
                                        fileLockLock.release();
                                    } catch (IOException e7) {
                                        ilq0.m137044q(e7);
                                    }
                                }
                                dxq0.m114018b(randomAccessFile);
                                if (file != null) {
                                }
                                randomAccessFile2 = randomAccessFile;
                                file4 = file;
                            }
                        } catch (Exception e8) {
                            randomAccessFile = randomAccessFile2;
                            e = e8;
                        } catch (Throwable th2) {
                            th = th2;
                        }
                        file.delete();
                        randomAccessFile2 = randomAccessFile;
                        file4 = file;
                    }
                } catch (Exception e9) {
                    file = file4;
                    randomAccessFile = randomAccessFile2;
                    e = e9;
                } catch (Throwable th3) {
                    th = th3;
                }
                ilq0.m137044q(e);
                if (fileLockLock != null && fileLockLock.isValid()) {
                    fileLockLock.release();
                }
                dxq0.m114018b(randomAccessFile);
                if (file != null) {
                    file.delete();
                }
                randomAccessFile2 = randomAccessFile;
                file4 = file;
            } else {
                if (fileLockLock != null) {
                    fileLockLock.release();
                }
                dxq0.m114018b(randomAccessFile2);
                if (file4 != null) {
                    file4.delete();
                }
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static boolean m122194d(Context context, String str) {
        File file = new File(str);
        long jM176520d = zhq0.m218833f(context).m218846d().m176520d();
        if (!file.exists()) {
            dxq0.m114022f(file);
            return true;
        }
        try {
            return file.length() <= jM176520d;
        } catch (Exception e) {
            ilq0.m137044q(e);
            return false;
        }
    }

    @TargetApi(9)
    /* JADX INFO: renamed from: e */
    public static byte[] m122195e(String str) {
        byte[] bArrCopyOf = Arrays.copyOf(jkq0.m141908b(str), 16);
        bArrCopyOf[0] = 68;
        bArrCopyOf[15] = 84;
        return bArrCopyOf;
    }

    /* JADX INFO: renamed from: f */
    public static File[] m122196f(Context context, String str) {
        return new File(context.getFilesDir(), str).listFiles(new C16884b());
    }
}
