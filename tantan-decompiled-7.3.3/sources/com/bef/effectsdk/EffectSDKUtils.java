package com.bef.effectsdk;

import android.content.Context;
import android.text.TextUtils;
import java.io.Closeable;
import java.io.File;
import java.io.FileFilter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class EffectSDKUtils {
    private static Set<File> localFiles = new HashSet();
    private static List<String> assetFiles = ModelsList.list;
    private static Set<File> needRemoveFiles = new HashSet();

    /* JADX INFO: Access modifiers changed from: private */
    public static void closeQuietly(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    private static void copyAssets(Context context, String str, String[] strArr, boolean z) throws Throwable {
        if (!needRemoveFiles.isEmpty()) {
            needRemoveFiles.clear();
        }
        needRemoveFiles.addAll(localFiles);
        if (!str.endsWith("/")) {
            str = str.concat("/");
        }
        for (String str2 : assetFiles) {
            final String fileName = getFileName(str2);
            File fileTakeFirstMatchingOrNull = takeFirstMatchingOrNull(needRemoveFiles, new FileFilter() { // from class: com.bef.effectsdk.EffectSDKUtils.2
                @Override // java.io.FileFilter
                public boolean accept(File file) {
                    return file.getName().contains(fileName);
                }
            });
            if (fileTakeFirstMatchingOrNull == null || !new File(str, getAssetRelativePath(str2)).exists()) {
                boolean z2 = false;
                if (strArr != null && !TextUtils.isEmpty(fileName)) {
                    for (String str3 : strArr) {
                        if (fileName.equals(str3)) {
                            z2 = true;
                            break;
                        }
                    }
                }
                if (z2 && z) {
                    copyFile(context, str2, str);
                }
                if (!z2 && !z) {
                    copyFile(context, str2, str);
                }
            } else {
                needRemoveFiles.remove(fileTakeFirstMatchingOrNull);
            }
        }
    }

    private static void copyFile(Context context, String str, String str2) throws Throwable {
        FileOutputStream fileOutputStream;
        InputStream inputStream = null;
        try {
            InputStream inputStreamOpen = context.getAssets().open(str);
            try {
                String str3 = str2 + str.substring(str.indexOf("model") + 6, str.lastIndexOf("/"));
                File file = new File(str3);
                if (!file.exists() && !file.mkdirs()) {
                    throw new IOException("Can not mkdirs " + file.getPath());
                }
                FileOutputStream fileOutputStream2 = new FileOutputStream(new File(str3 + "/" + getFileName(str)));
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int i = inputStreamOpen.read(bArr);
                        if (i <= 0) {
                            try {
                                closeQuietly(inputStreamOpen);
                                return;
                            } finally {
                                closeQuietly(fileOutputStream2);
                            }
                        }
                        fileOutputStream2.write(bArr, 0, i);
                    }
                } catch (Throwable th) {
                    inputStream = inputStreamOpen;
                    fileOutputStream = fileOutputStream2;
                    th = th;
                    try {
                        closeQuietly(inputStream);
                        throw th;
                    } finally {
                        closeQuietly(fileOutputStream);
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                inputStream = inputStreamOpen;
                fileOutputStream = null;
            }
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream = null;
        }
    }

    private static void deleteNoUseModel() {
        for (File file : localFiles) {
            if (needRemoveFiles.contains(file) && file.exists()) {
                file.delete();
            }
        }
    }

    public static void flushAlgorithmModelFiles(Context context, String str) throws Throwable {
        if (!localFiles.isEmpty()) {
            localFiles.clear();
        }
        scanRecursive(str, localFiles);
        copyAssets(context, str, null, false);
        deleteNoUseModel();
        localFiles.clear();
    }

    private static String getAssetRelativePath(String str) {
        int iIndexOf = str.indexOf("model/");
        return iIndexOf >= 0 ? str.substring(iIndexOf + 6, str.length()) : str;
    }

    private static String getFileName(String str) {
        int iLastIndexOf = str.lastIndexOf("/");
        return iLastIndexOf != -1 ? str.substring(iLastIndexOf + 1, str.length()) : "";
    }

    public static String getSdkVersion() {
        return nativeGetSdkVersion();
    }

    private static native String nativeGetSdkVersion();

    public static boolean needUpdate(final Context context, String str) {
        if (!localFiles.isEmpty()) {
            localFiles.clear();
        }
        scanRecursive(str, localFiles);
        try {
            if (assetFiles.size() > localFiles.size()) {
                return true;
            }
            for (final String str2 : assetFiles) {
                if (takeFirstMatchingOrNull(localFiles, new FileFilter() { // from class: com.bef.effectsdk.EffectSDKUtils.1
                    @Override // java.io.FileFilter
                    public boolean accept(File file) {
                        if (str2.contains(file.getName())) {
                            InputStream inputStreamOpen = null;
                            try {
                                inputStreamOpen = context.getAssets().open(str2);
                                return file.length() == ((long) inputStreamOpen.available());
                            } catch (IOException unused) {
                            } finally {
                                EffectSDKUtils.closeQuietly(inputStreamOpen);
                            }
                        }
                        return false;
                    }
                }) == null) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            th.printStackTrace();
            return true;
        }
    }

    private static void scanRecursive(String str, Set<File> set) {
        File[] fileArrListFiles;
        File file = new File(str);
        if (file.exists() && (fileArrListFiles = file.listFiles()) != null) {
            for (File file2 : fileArrListFiles) {
                if (file2.isDirectory()) {
                    scanRecursive(file2.getAbsolutePath(), set);
                } else {
                    set.add(file2);
                }
            }
        }
    }

    private static File takeFirstMatchingOrNull(Set<File> set, FileFilter fileFilter) {
        for (File file : set) {
            if (fileFilter.accept(file)) {
                return file;
            }
        }
        return null;
    }

    public static void flushAlgorithmModelFiles(Context context, String str, String[] strArr, boolean z) throws Throwable {
        if (!localFiles.isEmpty()) {
            localFiles.clear();
        }
        scanRecursive(str, localFiles);
        copyAssets(context, str, strArr, z);
        deleteNoUseModel();
        localFiles.clear();
    }
}
