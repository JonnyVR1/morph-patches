package com.p041mm.mmfile;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Process;
import com.p041mm.mmfile.core.FileWriteConfig;
import java.io.File;
import java.io.FileInputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class MMFileUtil {
    private static final String FILE_SUFFIX = ".xlog";

    public static int getFileCounts(FileWriteConfig fileWriteConfig) {
        File[] fileArrListFiles;
        if (fileWriteConfig == null) {
            return -1;
        }
        File file = new File(fileWriteConfig.getLogDir());
        if (!file.exists() || !file.isDirectory() || (fileArrListFiles = file.listFiles()) == null || fileArrListFiles.length == 0) {
            return 0;
        }
        return fileArrListFiles.length;
    }

    @Nullable
    @SuppressLint({"LogUse"})
    public static File[] getFiles(FileWriteConfig fileWriteConfig, final SortType sortType, int i, int i2, boolean z, boolean z2) {
        File[] fileArrListFiles;
        if (fileWriteConfig == null) {
            return null;
        }
        File file = new File(fileWriteConfig.getLogDir());
        if (!file.exists() || !file.isDirectory() || (fileArrListFiles = file.listFiles()) == null || fileArrListFiles.length == 0) {
            return null;
        }
        String str = fileWriteConfig.getFilePrefix() + "_";
        ArrayList arrayList = new ArrayList();
        for (File file2 : fileArrListFiles) {
            String name = file2.getName();
            if (name.startsWith(str) && name.endsWith(FILE_SUFFIX)) {
                arrayList.add(file2);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        final int length = str.length();
        final int i3 = length + 8;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            try {
                Long.parseLong(((File) it.next()).getName().substring(length, i3));
            } catch (Throwable unused) {
                it.remove();
            }
        }
        if (i >= 0) {
            String str2 = new SimpleDateFormat("yyyyMMdd").format(new Date(System.currentTimeMillis() - ((long) (86400000 * i))));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                File file3 = (File) it2.next();
                try {
                    if (Long.parseLong(file3.getName().substring(length, i3)) < Long.parseLong(str2)) {
                        if (z) {
                            try {
                                file3.delete();
                            } catch (Exception e) {
                                Logger.printErrStackTrace("MMFile", e);
                            }
                        }
                        it2.remove();
                    }
                } catch (Throwable th) {
                    Logger.printErrStackTrace("MMFile", th);
                }
            }
        }
        final int i4 = length + 9;
        if (sortType == SortType.POSITIVE || sortType == SortType.FLASHBACK) {
            Collections.sort(arrayList, new Comparator<File>() { // from class: com.mm.mmfile.MMFileUtil.1
                @Override // java.util.Comparator
                public int compare(File file4, File file5) {
                    String name2 = file4.getName();
                    String name3 = file5.getName();
                    try {
                        long j = Long.parseLong(name2.substring(length, i3));
                        long j2 = Long.parseLong(name3.substring(length, i3));
                        SortType sortType2 = sortType;
                        SortType sortType3 = SortType.POSITIVE;
                        long j3 = sortType2 == sortType3 ? j - j2 : j2 - j;
                        if (j3 != 0) {
                            return (int) j3;
                        }
                        try {
                            int iIndexOf = name2.indexOf(MMFileUtil.FILE_SUFFIX);
                            int iIndexOf2 = name3.indexOf(MMFileUtil.FILE_SUFFIX);
                            int i5 = i4;
                            int i6 = i5 >= iIndexOf ? 0 : Integer.parseInt(name2.substring(i5, iIndexOf));
                            int i7 = i4;
                            int i8 = i7 >= iIndexOf2 ? 0 : Integer.parseInt(name3.substring(i7, iIndexOf2));
                            return sortType == sortType3 ? i6 - i8 : i8 - i6;
                        } catch (Exception e2) {
                            Logger.printErrStackTrace("MMFile", e2);
                            return 0;
                        }
                    } catch (Throwable th2) {
                        Logger.printErrStackTrace("MMFile", th2);
                        return 0;
                    }
                }
            });
        }
        if (i2 > 0 && arrayList.size() > i2) {
            if (sortType == SortType.FLASHBACK) {
                for (int size = arrayList.size() - 1; size >= i2; size--) {
                    if (z2) {
                        try {
                            ((File) arrayList.get(size)).delete();
                        } catch (Exception e2) {
                            Logger.printErrStackTrace("MMFile", e2);
                        }
                    }
                    arrayList.remove(size);
                }
            } else {
                Iterator it3 = arrayList.iterator();
                int size2 = arrayList.size() - i2;
                for (int i5 = 0; i5 < size2; i5++) {
                    File file4 = (File) it3.next();
                    if (z2) {
                        try {
                            file4.delete();
                        } catch (Exception e3) {
                            Logger.printErrStackTrace("MMFile", e3);
                        }
                    }
                    it3.remove();
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return (File[]) arrayList.toArray(new File[arrayList.size()]);
    }

    public static String getProcessNameInternal(Context context) throws Throwable {
        int i;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        ActivityManager.RunningAppProcessInfo next;
        int iMyPid = Process.myPid();
        if (context != null && iMyPid > 0) {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            FileInputStream fileInputStream = null;
            if (activityManager != null && (runningAppProcesses = activityManager.getRunningAppProcesses()) != null) {
                try {
                    Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (next.pid != iMyPid);
                } catch (Exception unused) {
                }
                if (next != null) {
                    return next.processName;
                }
            }
            byte[] bArr = new byte[128];
            try {
                try {
                    FileInputStream fileInputStream2 = new FileInputStream("/proc/" + iMyPid + "/cmdline");
                    try {
                        int i2 = fileInputStream2.read(bArr);
                        if (i2 > 0) {
                            for (0; i < i2; i + 1) {
                                byte b = bArr[i];
                                i = ((b & 255) <= 128 && b > 0) ? i + 1 : 0;
                                i2 = i;
                                break;
                            }
                            String str = new String(bArr, 0, i2);
                            try {
                                fileInputStream2.close();
                            } catch (Exception unused2) {
                            }
                            return str;
                        }
                        fileInputStream2.close();
                    } catch (Exception unused3) {
                        fileInputStream = fileInputStream2;
                        if (fileInputStream != null) {
                            fileInputStream.close();
                        }
                        return "";
                    } catch (Throwable th) {
                        th = th;
                        fileInputStream = fileInputStream2;
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                            } catch (Exception unused4) {
                            }
                        }
                        throw th;
                    }
                } catch (Exception unused5) {
                }
            } catch (Exception unused6) {
            } catch (Throwable th2) {
                th = th2;
            }
        }
        return "";
    }

    public static FileUploadConfig getUploadConfigByFile(String str) {
        try {
            String name = new File(str).getName();
            for (Strategy strategy : MMFileRegister.strategies) {
                if (name.startsWith(strategy.getFileWriteConfig().getFilePrefix() + "_")) {
                    return strategy.getFileUploadConfig();
                }
            }
            return null;
        } catch (Exception e) {
            Logger.printErrStackTrace("MMFile", e);
            return null;
        }
    }

    @Nullable
    public static File[] getFiles(FileWriteConfig fileWriteConfig, SortType sortType, int i, int i2) {
        return getFiles(fileWriteConfig, sortType, i, i2, false, false);
    }

    @Nullable
    public static File[] getFiles(FileWriteConfig fileWriteConfig) {
        return getFiles(fileWriteConfig, SortType.POSITIVE, -1, -1);
    }
}
