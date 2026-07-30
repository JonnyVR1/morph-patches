package com.tencent.liteav.basic.util;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.text.TextUtils;
import com.tencent.liteav.basic.log.TXCLog;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import p153l.vtq0;

/* JADX INFO: renamed from: com.tencent.liteav.basic.util.c */
/* JADX INFO: loaded from: classes2.dex */
public class C14212c {
    /* JADX INFO: renamed from: a */
    public static boolean m84208a(Context context, String str) {
        try {
            for (String str2 : context.getAssets().list("")) {
                if (str2.equals(str.trim())) {
                    TXCLog.m84152i("isAssetFileExists", str + " exist");
                    return true;
                }
            }
            TXCLog.m84152i("isAssetFileExists", str + " not exist");
            return false;
        } catch (IOException unused) {
            TXCLog.m84152i("isAssetFileExists", str + " not exist");
            return false;
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m84211b(String str) throws Throwable {
        BufferedReader bufferedReader;
        File file = new File(str);
        StringBuilder sb = new StringBuilder("");
        try {
            if (!file.isFile()) {
                return null;
            }
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
                while (true) {
                    try {
                        try {
                            String line = bufferedReader.readLine();
                            if (line == null) {
                                bufferedReader.close();
                                String string = sb.toString();
                                bufferedReader.close();
                                return string;
                            }
                            sb.append(line);
                        } catch (IOException e) {
                            e = e;
                            throw new RuntimeException("IOException occurred. ", e);
                        }
                    } catch (Throwable th) {
                        th = th;
                    }
                    th = th;
                    if (bufferedReader != null) {
                        bufferedReader.close();
                    }
                    throw th;
                }
            } catch (IOException e2) {
                e = e2;
                bufferedReader = null;
            } catch (Throwable th2) {
                th = th2;
                bufferedReader = null;
            }
        } catch (IOException e3) {
            vtq0.m202761a("IOException occurred. ", e3);
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m84210b(Context context, String str) {
        InputStream inputStreamOpen = null;
        try {
            try {
                inputStreamOpen = context.getAssets().open(str);
                byte[] bArr = new byte[inputStreamOpen.available()];
                if (inputStreamOpen.read(bArr) <= 0) {
                    try {
                        inputStreamOpen.close();
                    } catch (IOException unused) {
                    }
                    return "";
                }
                inputStreamOpen.close();
                String str2 = new String(bArr, "utf-8");
                try {
                    inputStreamOpen.close();
                } catch (IOException unused2) {
                }
                return str2;
            } catch (Throwable th) {
                if (inputStreamOpen != null) {
                    try {
                        inputStreamOpen.close();
                    } catch (IOException unused3) {
                    }
                }
                throw th;
            }
        } catch (IOException e) {
            TXCLog.m84150e("FileUtil", "read asset file failed.", e);
            if (inputStreamOpen != null) {
                try {
                    inputStreamOpen.close();
                } catch (IOException unused4) {
                }
            }
            return "";
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m84207a(Context context) {
        NetworkInfo activeNetworkInfo;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        return (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnectedOrConnecting()) ? false : true;
    }

    /* JADX INFO: renamed from: a */
    public static long m84200a(File file) {
        return m84201a(file, 5);
    }

    /* JADX INFO: renamed from: a */
    public static long m84201a(File file, int i) {
        long length;
        long j = 0;
        if (i <= 0) {
            return 0L;
        }
        try {
            for (File file2 : file.listFiles()) {
                if (file2.isDirectory()) {
                    length = m84201a(file2, i - 1);
                } else {
                    length = file2.length();
                }
                j += length;
            }
            return j;
        } catch (Exception e) {
            TXCLog.m84152i("FileUtil", "getFolderSize exception " + e.toString());
            return j;
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0045 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    public static void m84202a(Context context, String str, String str2) throws Throwable {
        FileOutputStream fileOutputStream;
        InputStream inputStream = null;
        try {
            try {
                InputStream inputStreamOpen = context.getAssets().open(str);
                try {
                    fileOutputStream = new FileOutputStream(str2);
                    try {
                        m84204a(inputStreamOpen, fileOutputStream);
                        m84203a(inputStreamOpen);
                        fileOutputStream.flush();
                        fileOutputStream.close();
                    } catch (IOException e) {
                        e = e;
                        inputStream = inputStreamOpen;
                        try {
                            TXCLog.m84150e("FileUtil", "copy asset file failed.", e);
                            m84203a(inputStream);
                            if (fileOutputStream != null) {
                                fileOutputStream.flush();
                                fileOutputStream.close();
                            }
                        } catch (Throwable th) {
                            th = th;
                            m84203a(inputStream);
                            if (fileOutputStream != null) {
                                try {
                                    fileOutputStream.flush();
                                    fileOutputStream.close();
                                } catch (IOException unused) {
                                }
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        inputStream = inputStreamOpen;
                        m84203a(inputStream);
                        if (fileOutputStream != null) {
                            fileOutputStream.flush();
                            fileOutputStream.close();
                        }
                        throw th;
                    }
                } catch (IOException e2) {
                    e = e2;
                    fileOutputStream = null;
                } catch (Throwable th3) {
                    th = th3;
                    fileOutputStream = null;
                }
            } catch (IOException unused2) {
            }
        } catch (IOException e3) {
            e = e3;
            fileOutputStream = null;
        } catch (Throwable th4) {
            th = th4;
            fileOutputStream = null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m84204a(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[1024];
        while (true) {
            int i = inputStream.read(bArr);
            if (i == -1) {
                return;
            } else {
                outputStream.write(bArr, 0, i);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m84209a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        File file = new File(str);
        return file.exists() && file.isFile();
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0042 A[Catch: Exception -> 0x0045, TRY_LEAVE, TryCatch #6 {Exception -> 0x0045, blocks: (B:27:0x003d, B:29:0x0042), top: B:37:0x003d }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.io.FileOutputStream, java.io.OutputStream] */
    /* JADX INFO: renamed from: a */
    public static void m84205a(String str, byte[] bArr) throws Throwable {
        BufferedOutputStream bufferedOutputStream = null;
        try {
            try {
                try {
                    str = new FileOutputStream(new File((String) str));
                    try {
                        BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(str);
                        try {
                            bufferedOutputStream2.write(bArr);
                            bufferedOutputStream2.close();
                            str.close();
                        } catch (Exception e) {
                            e = e;
                            bufferedOutputStream = bufferedOutputStream2;
                            TXCLog.m84150e("FileUtil", "write file failed.", e);
                            if (bufferedOutputStream != null) {
                                bufferedOutputStream.close();
                            }
                            if (str != 0) {
                                str.close();
                            }
                        } catch (Throwable th) {
                            th = th;
                            bufferedOutputStream = bufferedOutputStream2;
                            if (bufferedOutputStream != null) {
                                try {
                                    bufferedOutputStream.close();
                                    if (str != 0) {
                                        str.close();
                                    }
                                } catch (Exception unused) {
                                    throw th;
                                }
                            } else if (str != 0) {
                                str.close();
                            }
                            throw th;
                        }
                    } catch (Exception e2) {
                        e = e2;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Exception e3) {
                e = e3;
                str = 0;
            } catch (Throwable th3) {
                th = th3;
                str = 0;
            }
        } catch (Exception unused2) {
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m84206a(long j) {
        return true;
    }

    /* JADX INFO: renamed from: a */
    public static void m84203a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }
}
