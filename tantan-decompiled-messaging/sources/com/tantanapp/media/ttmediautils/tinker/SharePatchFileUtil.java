package com.tantanapp.media.ttmediautils.tinker;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.util.Log;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.clevertap.android.sdk.Constants;
import com.tantanapp.media.ttmediautils.log.SLog;
import io.agora.base.internal.voiceengine.earmonitor.HardwareEarMonitorUtils;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import p149l.k5e;
import p149l.o5d0;
import p149l.qtc0;

/* JADX INFO: loaded from: classes13.dex */
public class SharePatchFileUtil {
    private static final String TAG = "Tinker.PatchFileUtil";
    private static char[] hexDigits = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', Constants.INAPP_POSITION_BOTTOM, Constants.INAPP_POSITION_CENTER, 'd', 'e', 'f'};

    public static boolean checkIfMd5Valid(String str) {
        return str != null && str.length() == 32;
    }

    public static boolean checkResourceArscMd5(File file, String str) throws Throwable {
        ZipFile zipFile = null;
        InputStream inputStream = null;
        zipFile = null;
        try {
            try {
                ZipFile zipFile2 = new ZipFile(file);
                try {
                    ZipEntry entry = zipFile2.getEntry(ShareConstants.RES_ARSC);
                    if (entry == null) {
                        closeZip(zipFile2);
                        return false;
                    }
                    try {
                        inputStream = zipFile2.getInputStream(entry);
                        String md5 = getMD5(inputStream);
                        if (md5 != null && md5.equals(str)) {
                            closeQuietly(inputStream);
                            closeZip(zipFile2);
                            return true;
                        }
                        closeQuietly(inputStream);
                        closeZip(zipFile2);
                    } catch (Throwable th) {
                        closeQuietly(inputStream);
                        throw th;
                    }
                } catch (IOException e) {
                    e = e;
                    zipFile = zipFile2;
                    SLog.printStackTrace(e);
                    e.getMessage();
                    closeZip(zipFile);
                } catch (Throwable th2) {
                    th = th2;
                    zipFile = zipFile2;
                    closeZip(zipFile);
                    throw th;
                }
            } catch (IOException e2) {
                e = e2;
            }
            return false;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static String checkTinkerLastUncaughtCrash(Context context) throws Throwable {
        BufferedReader bufferedReader;
        File patchLastCrashFile = getPatchLastCrashFile(context);
        BufferedReader bufferedReader2 = null;
        if (!isLegalFile(patchLastCrashFile)) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(patchLastCrashFile)));
            while (true) {
                try {
                    try {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            closeQuietly(bufferedReader);
                            return stringBuffer.toString();
                        }
                        stringBuffer.append(line);
                        stringBuffer.append(SignParameters.NEW_LINE);
                    } catch (IOException e) {
                        e = e;
                        SLog.printStackTrace(e);
                        Log.e(TAG, "checkTinkerLastUncaughtCrash exception: " + e);
                        closeQuietly(bufferedReader);
                        return null;
                    }
                } catch (Throwable th) {
                    th = th;
                    bufferedReader2 = bufferedReader;
                }
                th = th;
                bufferedReader2 = bufferedReader;
                closeQuietly(bufferedReader2);
                throw th;
            }
        } catch (IOException e2) {
            e = e2;
            bufferedReader = null;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @SuppressLint({"NewApi"})
    public static void closeQuietly(Object obj) {
        if (obj == null) {
            return;
        }
        if (obj instanceof Closeable) {
            try {
                ((Closeable) obj).close();
                return;
            } catch (Throwable th) {
                SLog.printStackTrace(th);
                return;
            }
        }
        if (obj instanceof AutoCloseable) {
            try {
                k5e.m144528a((AutoCloseable) obj);
                return;
            } catch (Throwable th2) {
                SLog.printStackTrace(th2);
                return;
            }
        }
        if (!(obj instanceof ZipFile)) {
            qtc0.m176411a("obj: ", obj, " cannot be closed.");
            return;
        }
        try {
            ((ZipFile) obj).close();
        } catch (Throwable th3) {
            SLog.printStackTrace(th3);
        }
    }

    public static void closeZip(ZipFile zipFile) {
        if (zipFile != null) {
            try {
                zipFile.close();
            } catch (IOException e) {
                SLog.printStackTrace(e);
            }
        }
    }

    public static void copyFileUsingStream(File file, File file2) throws Throwable {
        FileOutputStream fileOutputStream;
        if (!isLegalFile(file) || file2 == null || file.getAbsolutePath().equals(file2.getAbsolutePath())) {
            return;
        }
        File parentFile = file2.getParentFile();
        if (parentFile != null && !parentFile.exists()) {
            parentFile.mkdirs();
        }
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(file);
            try {
                fileOutputStream = new FileOutputStream(file2, false);
                try {
                    byte[] bArr = new byte[16384];
                    while (true) {
                        int i = fileInputStream2.read(bArr);
                        if (i <= 0) {
                            closeQuietly(fileInputStream2);
                            closeQuietly(fileOutputStream);
                            return;
                        }
                        fileOutputStream.write(bArr, 0, i);
                    }
                } catch (Throwable th) {
                    th = th;
                    fileInputStream = fileInputStream2;
                    closeQuietly(fileInputStream);
                    closeQuietly(fileOutputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = null;
            }
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream = null;
        }
    }

    public static final boolean deleteDir(File file) {
        File[] fileArrListFiles;
        if (file == null || !file.exists()) {
            return false;
        }
        if (file.isFile()) {
            safeDeleteFile(file);
            return true;
        }
        if (!file.isDirectory() || (fileArrListFiles = file.listFiles()) == null) {
            return true;
        }
        for (File file2 : fileArrListFiles) {
            deleteDir(file2);
        }
        safeDeleteFile(file);
        return true;
    }

    public static void ensureDirectory(File file) {
        if (file == null) {
            return;
        }
        if (!file.exists()) {
            if (file.mkdirs()) {
                return;
            }
            o5d0.m162778a("mkdirs fail : ", file.getAbsolutePath());
        } else if (file.isFile()) {
            if (!file.delete()) {
                o5d0.m162778a("delete file fail : ", file.getAbsolutePath());
            } else {
                if (file.mkdirs()) {
                    return;
                }
                o5d0.m162778a("mkdirs fail : ", file.getAbsolutePath());
            }
        }
    }

    public static long getFileOrDirectorySize(File file) {
        long fileOrDirectorySize = 0;
        if (file != null && file.exists()) {
            if (file.isFile()) {
                return file.length();
            }
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles != null) {
                for (File file2 : fileArrListFiles) {
                    fileOrDirectorySize += file2.isDirectory() ? getFileOrDirectorySize(file2) : file2.length();
                }
            }
        }
        return fileOrDirectorySize;
    }

    public static final String getMD5(InputStream inputStream) {
        int i;
        if (inputStream == null) {
            return null;
        }
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            StringBuilder sb = new StringBuilder(32);
            byte[] bArr = new byte[ShareConstants.MD5_FILE_BUF_LENGTH];
            while (true) {
                int i2 = bufferedInputStream.read(bArr);
                if (i2 == -1) {
                    break;
                }
                messageDigest.update(bArr, 0, i2);
            }
            for (byte b : messageDigest.digest()) {
                sb.append(Integer.toString((b & 255) + 256, 16).substring(1));
            }
            return sb.toString();
        } catch (IOException e) {
            SLog.printStackTrace(e);
            return null;
        } catch (NoSuchAlgorithmException e2) {
            SLog.printStackTrace(e2);
            return null;
        }
    }

    public static File getPatchDirectory(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        if (applicationInfo == null) {
            return null;
        }
        return new File(applicationInfo.dataDir, "camera");
    }

    public static File getPatchInfoFile(String str) {
        return new File(str + "/patch.info");
    }

    public static File getPatchInfoLockFile(String str) {
        return new File(str + "/info.lock");
    }

    public static File getPatchLastCrashFile(Context context) {
        File patchTempDirectory = getPatchTempDirectory(context);
        if (patchTempDirectory == null) {
            return null;
        }
        return new File(patchTempDirectory, ShareConstants.PATCH_TEMP_LAST_CRASH_NAME);
    }

    public static File getPatchTempDirectory(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        if (applicationInfo == null) {
            return null;
        }
        return new File(applicationInfo.dataDir, ShareConstants.PATCH_TEMP_DIRECTORY_NAME);
    }

    public static String getPatchVersionDirectory(String str) {
        if (str == null || str.length() != 32) {
            return null;
        }
        return ShareConstants.PATCH_BASE_NAME.concat(str.substring(0, 8));
    }

    public static String getPatchVersionFile(String str) {
        if (str == null || str.length() != 32) {
            return null;
        }
        return getPatchVersionDirectory(str) + ShareConstants.PATCH_SUFFIX;
    }

    public static final boolean isLegalFile(File file) {
        return file != null && file.exists() && file.canRead() && file.isFile() && file.length() > 0;
    }

    public static boolean isRawDexFile(String str) {
        if (str == null) {
            return false;
        }
        return str.endsWith(ShareConstants.DEX_SUFFIX);
    }

    public static String loadDigestes(JarFile jarFile, JarEntry jarEntry) throws Exception {
        StringBuilder sb = new StringBuilder();
        BufferedInputStream bufferedInputStream = null;
        try {
            InputStream inputStream = jarFile.getInputStream(jarEntry);
            byte[] bArr = new byte[16384];
            BufferedInputStream bufferedInputStream2 = new BufferedInputStream(inputStream);
            while (true) {
                try {
                    int i = bufferedInputStream2.read(bArr);
                    if (i <= 0) {
                        closeQuietly(bufferedInputStream2);
                        return sb.toString();
                    }
                    sb.append(new String(bArr, 0, i));
                } catch (Throwable th) {
                    th = th;
                    bufferedInputStream = bufferedInputStream2;
                    closeQuietly(bufferedInputStream);
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static String optimizedPathFor(File file, File file2) {
        String name = file.getName();
        if (!name.endsWith(ShareConstants.DEX_SUFFIX)) {
            int iLastIndexOf = name.lastIndexOf(".");
            if (iLastIndexOf < 0) {
                name = name.concat(ShareConstants.DEX_SUFFIX);
            } else {
                StringBuilder sb = new StringBuilder(iLastIndexOf + 4);
                sb.append((CharSequence) name, 0, iLastIndexOf);
                sb.append(ShareConstants.DEX_SUFFIX);
                name = sb.toString();
            }
        }
        return new File(file2, name).getPath();
    }

    public static final boolean safeDeleteFile(File file) {
        boolean zDelete = true;
        if (file == null) {
            return true;
        }
        if (file.exists()) {
            file.getPath();
            zDelete = file.delete();
            if (!zDelete) {
                Log.e(TAG, "Failed to delete file, try to delete when exit. path: " + file.getPath());
                file.deleteOnExit();
            }
        }
        return zDelete;
    }

    public static final boolean shouldAcceptEvenIfIllegal(File file) {
        String str = Build.MANUFACTURER;
        if (HardwareEarMonitorUtils.MANUFACTURER_VIVO.equalsIgnoreCase(str) || HardwareEarMonitorUtils.MANUFACTURER_OPPO.equalsIgnoreCase(str)) {
            return !file.exists() || file.length() == 0;
        }
        return false;
    }

    public static boolean verifyDexFileMd5(File file, String str, String str2) throws Throwable {
        String md5;
        if (file == null || str2 == null || str == null) {
            return false;
        }
        if (isRawDexFile(file.getName())) {
            md5 = getMD5(file);
        } else {
            ZipFile zipFile = null;
            inputStream = null;
            InputStream inputStream = null;
            zipFile = null;
            try {
                try {
                    ZipFile zipFile2 = new ZipFile(file);
                    try {
                        ZipEntry entry = zipFile2.getEntry(str);
                        if (entry == null) {
                            Log.e(TAG, "There's no entry named: classes.dex in " + file.getAbsolutePath());
                            closeZip(zipFile2);
                            return false;
                        }
                        try {
                            try {
                                inputStream = zipFile2.getInputStream(entry);
                                String md6 = getMD5(inputStream);
                                closeQuietly(inputStream);
                                md5 = md6;
                            } catch (IOException e) {
                                SLog.printStackTrace(e);
                                Log.e(TAG, "exception occurred when get md5: " + file.getAbsolutePath(), e);
                                closeQuietly(inputStream);
                                md5 = "";
                            }
                            closeZip(zipFile2);
                        } catch (Throwable th) {
                            closeQuietly(inputStream);
                            throw th;
                        }
                    } catch (IOException e2) {
                        e = e2;
                        zipFile = zipFile2;
                        SLog.printStackTrace(e);
                        Log.e(TAG, "Bad dex jar file: " + file.getAbsolutePath(), e);
                        closeZip(zipFile);
                        return false;
                    } catch (Throwable th2) {
                        th = th2;
                        zipFile = zipFile2;
                        closeZip(zipFile);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (IOException e3) {
                e = e3;
            }
        }
        return str2.equals(md5);
    }

    public static boolean verifyFileMd5(File file, String str) {
        String md5;
        if (str == null || (md5 = getMD5(file)) == null) {
            return false;
        }
        return str.equals(md5);
    }

    public static final boolean deleteDir(String str) {
        if (str == null) {
            return false;
        }
        return deleteDir(new File(str));
    }

    public static String getMD5(byte[] bArr) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(bArr);
            byte[] bArrDigest = messageDigest.digest();
            char[] cArr = new char[bArrDigest.length * 2];
            int i = 0;
            for (byte b : bArrDigest) {
                int i2 = i + 1;
                char[] cArr2 = hexDigits;
                cArr[i] = cArr2[(b >>> 4) & 15];
                i += 2;
                cArr[i2] = cArr2[b & 15];
            }
            return new String(cArr);
        } catch (NoSuchAlgorithmException e) {
            SLog.printStackTrace(e);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [boolean] */
    public static String getMD5(File file) throws Throwable {
        FileInputStream fileInputStream;
        ?? r0 = 0;
        if (file != null) {
            ?? Exists = file.exists();
            try {
                if (Exists != 0) {
                    try {
                        fileInputStream = new FileInputStream(file);
                        try {
                            String md5 = getMD5(fileInputStream);
                            closeQuietly(fileInputStream);
                            return md5;
                        } catch (FileNotFoundException e) {
                            e = e;
                            SLog.printStackTrace(e);
                            closeQuietly(fileInputStream);
                            return null;
                        }
                    } catch (FileNotFoundException e2) {
                        e = e2;
                        fileInputStream = null;
                    } catch (Throwable th) {
                        th = th;
                        closeQuietly(r0);
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                r0 = Exists;
            }
        }
        return null;
    }

    public static boolean verifyDexFileMd5(File file, String str) {
        return verifyDexFileMd5(file, "classes.dex", str);
    }
}
