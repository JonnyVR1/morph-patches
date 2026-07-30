package p149l;

import android.content.Context;
import android.content.res.AssetManager;
import androidx.annotation.NonNull;
import com.cosmos.mdlog.MDLog;
import com.tantanapp.common.utils.CrashHelper;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* JADX INFO: loaded from: classes13.dex */
public final class wet {

    /* JADX INFO: renamed from: a */
    public static final String[] f185972a = {"../", "~/"};

    /* JADX INFO: renamed from: a */
    public static void m202922a(Context context, String str, File file) {
        try {
            AssetManager assets = context.getAssets();
            String[] list = assets.list(str);
            if (list != null && list.length != 0) {
                if (!file.exists()) {
                    file.mkdirs();
                }
                for (String str2 : list) {
                    String str3 = str + "/" + str2;
                    File file2 = new File(file, str2);
                    String[] list2 = assets.list(str3);
                    if (list2 == null || list2.length <= 0) {
                        m202923b(context, str3, file2);
                    } else {
                        m202922a(context, str3, file2);
                    }
                }
            }
        } catch (IOException unused) {
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m202923b(Context context, String str, File file) throws IOException {
        InputStream inputStreamOpen = context.getAssets().open(str);
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        byte[] bArr = new byte[4096];
        while (true) {
            int i = inputStreamOpen.read(bArr);
            if (i <= 0) {
                fileOutputStream.close();
                inputStreamOpen.close();
                return;
            }
            fileOutputStream.write(bArr, 0, i);
        }
    }

    /* JADX INFO: renamed from: c */
    public static boolean m202924c(File file) {
        if (file == null) {
            return false;
        }
        return file.isDirectory() ? m202925d(file) : m202926e(file);
    }

    /* JADX INFO: renamed from: d */
    public static boolean m202925d(File file) {
        if (file == null) {
            return false;
        }
        if (!file.exists()) {
            return true;
        }
        if (!file.isDirectory()) {
            return false;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null && fileArrListFiles.length != 0) {
            for (File file2 : fileArrListFiles) {
                if (file2.isFile()) {
                    if (!file2.delete()) {
                        return false;
                    }
                } else if (file2.isDirectory() && !m202925d(file2)) {
                    return false;
                }
            }
        }
        return file.delete();
    }

    /* JADX INFO: renamed from: e */
    public static boolean m202926e(File file) {
        if (file == null) {
            return false;
        }
        if (file.exists()) {
            return file.isFile() && file.delete();
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m202927f(File file) {
        return file != null && file.exists();
    }

    /* JADX INFO: renamed from: g */
    public static String m202928g(File file, String str) throws Throwable {
        if (file == null || !file.exists()) {
            return "";
        }
        BufferedReader bufferedReader = null;
        try {
            try {
                BufferedReader bufferedReader2 = new BufferedReader(new FileReader(file));
                try {
                    StringBuilder sb = new StringBuilder((int) file.length());
                    while (true) {
                        String line = bufferedReader2.readLine();
                        if (line == null) {
                            String string = sb.toString();
                            t95.m187604b(bufferedReader2);
                            return string;
                        }
                        if (sb.length() != 0) {
                            sb.append('\n');
                        }
                        sb.append(line);
                    }
                } catch (IOException e) {
                    e = e;
                    bufferedReader = bufferedReader2;
                    CrashHelper.m81296c(new Exception("effectId = " + str, e));
                    t95.m187604b(bufferedReader);
                    return "";
                } catch (Throwable th) {
                    th = th;
                    bufferedReader = bufferedReader2;
                    t95.m187604b(bufferedReader);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e2) {
            e = e2;
        }
    }

    /* JADX INFO: renamed from: h */
    public static boolean m202929h(String str, String str2, String str3) {
        try {
            m202931j(str, str2);
            return true;
        } catch (Exception e) {
            CrashHelper.m81296c(new Exception("effectId = " + str3, e));
            MDLog.printErrStackTrace("haniSDK unzip", e);
            return false;
        }
    }

    /* JADX INFO: renamed from: i */
    public static boolean m202930i(File file, File file2) throws Throwable {
        ZipInputStream zipInputStream = null;
        try {
            ZipInputStream zipInputStream2 = new ZipInputStream(new BufferedInputStream(new FileInputStream(file)));
            while (true) {
                try {
                    ZipEntry nextEntry = zipInputStream2.getNextEntry();
                    if (nextEntry == null) {
                        try {
                            break;
                        } catch (IOException unused) {
                        }
                    } else if (!nextEntry.isDirectory()) {
                        file2.createNewFile();
                        FileOutputStream fileOutputStream = new FileOutputStream(file2);
                        byte[] bArr = new byte[4096];
                        while (true) {
                            int i = zipInputStream2.read(bArr);
                            if (i == -1) {
                                break;
                            }
                            fileOutputStream.write(bArr, 0, i);
                            fileOutputStream.flush();
                        }
                        fileOutputStream.close();
                    }
                } catch (Exception unused2) {
                    zipInputStream = zipInputStream2;
                    if (zipInputStream == null) {
                        return false;
                    }
                    try {
                        zipInputStream.close();
                        return false;
                    } catch (IOException unused3) {
                        return false;
                    }
                } catch (Throwable th) {
                    th = th;
                    zipInputStream = zipInputStream2;
                    if (zipInputStream != null) {
                        try {
                            zipInputStream.close();
                        } catch (IOException unused4) {
                        }
                    }
                    throw th;
                }
            }
            zipInputStream2.close();
            return true;
        } catch (Exception unused5) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: j */
    public static void m202931j(String str, String str2) throws Exception {
        ZipInputStream zipInputStream = new ZipInputStream(new BufferedInputStream(new FileInputStream(str)));
        BufferedOutputStream bufferedOutputStream = null;
        while (true) {
            try {
                ZipEntry nextEntry = zipInputStream.getNextEntry();
                if (nextEntry == null) {
                    zipInputStream.close();
                    return;
                }
                byte[] bArr = new byte[4096];
                String name = nextEntry.getName();
                if (!m202932k(name)) {
                    throw new IllegalArgumentException("unSecurity zipfile!");
                }
                File file = new File(str2, name);
                if (!nextEntry.isDirectory()) {
                    File file2 = new File(file.getParent());
                    if (!file2.exists()) {
                        file2.mkdirs();
                    }
                    try {
                        BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(new FileOutputStream(file), 4096);
                        while (true) {
                            try {
                                int i = zipInputStream.read(bArr, 0, 4096);
                                if (i == -1) {
                                    break;
                                } else {
                                    bufferedOutputStream2.write(bArr, 0, i);
                                }
                            } catch (Throwable th) {
                                th = th;
                                bufferedOutputStream = bufferedOutputStream2;
                                if (bufferedOutputStream != null) {
                                    bufferedOutputStream.close();
                                }
                                throw th;
                            }
                        }
                        bufferedOutputStream2.flush();
                        bufferedOutputStream2.close();
                        bufferedOutputStream = bufferedOutputStream2;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } else if (!file.exists()) {
                    file.mkdirs();
                }
            } catch (Throwable th3) {
                zipInputStream.close();
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public static boolean m202932k(@NonNull String str) {
        for (String str2 : f185972a) {
            if (str.contains(str2)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: l */
    public static void m202933l(File file, String str) throws Throwable {
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(file);
            try {
                fileOutputStream2.write(str.getBytes(Charset.forName("UTF-8")));
                fileOutputStream2.flush();
                t95.m187604b(fileOutputStream2);
            } catch (Throwable th) {
                th = th;
                fileOutputStream = fileOutputStream2;
                t95.m187604b(fileOutputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
