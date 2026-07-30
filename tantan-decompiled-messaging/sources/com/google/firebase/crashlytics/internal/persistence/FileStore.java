package com.google.firebase.crashlytics.internal.persistence;

import android.content.Context;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.ProcessDetailsProvider;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class FileStore {
    private static final String CRASHLYTICS_PATH_V1 = ".com.google.firebase.crashlytics.files.v1";
    private static final String CRASHLYTICS_PATH_V2 = ".com.google.firebase.crashlytics.files.v2";
    private static final String CRASHLYTICS_PATH_V3 = ".crashlytics.v3";
    private static final String NATIVE_REPORTS_PATH = "native-reports";
    private static final String NATIVE_SESSION_SUBDIR = "native";
    private static final String PRIORITY_REPORTS_PATH = "priority-reports";
    private static final String REPORTS_PATH = "reports";
    private static final String SESSIONS_PATH = "open-sessions";
    private final File crashlyticsDir;
    private final File filesDir;
    private final File nativeReportsDir;
    private final File priorityReportsDir;
    final String processName;
    private final File reportsDir;
    private final File sessionsDir;

    public FileStore(Context context) {
        String str;
        String processName = ProcessDetailsProvider.INSTANCE.getCurrentProcessDetails(context).getProcessName();
        this.processName = processName;
        File filesDir = context.getFilesDir();
        this.filesDir = filesDir;
        if (useV3FileSystem()) {
            str = CRASHLYTICS_PATH_V3 + File.separator + sanitizeName(processName);
        } else {
            str = CRASHLYTICS_PATH_V1;
        }
        File filePrepareBaseDir = prepareBaseDir(new File(filesDir, str));
        this.crashlyticsDir = filePrepareBaseDir;
        this.sessionsDir = prepareBaseDir(new File(filePrepareBaseDir, SESSIONS_PATH));
        this.reportsDir = prepareBaseDir(new File(filePrepareBaseDir, REPORTS_PATH));
        this.priorityReportsDir = prepareBaseDir(new File(filePrepareBaseDir, PRIORITY_REPORTS_PATH));
        this.nativeReportsDir = prepareBaseDir(new File(filePrepareBaseDir, NATIVE_REPORTS_PATH));
    }

    private void cleanupFileSystemDir(String str) {
        File file = new File(this.filesDir, str);
        if (file.exists() && recursiveDelete(file)) {
            Logger.getLogger().m16721d("Deleted previous Crashlytics file system: " + file.getPath());
        }
    }

    private void cleanupFileSystemDirs(final String str) {
        String[] list;
        if (!this.filesDir.exists() || (list = this.filesDir.list(new FilenameFilter() { // from class: l.chi
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str2) {
                return str2.startsWith(str);
            }
        })) == null) {
            return;
        }
        for (String str2 : list) {
            cleanupFileSystemDir(str2);
        }
    }

    private File getSessionDir(String str) {
        return prepareDir(new File(this.sessionsDir, str));
    }

    private static synchronized File prepareBaseDir(File file) {
        try {
            if (file.exists()) {
                if (file.isDirectory()) {
                    return file;
                }
                Logger.getLogger().m16721d("Unexpected non-directory file: " + file + "; deleting file and creating new directory.");
                file.delete();
            }
            if (!file.mkdirs()) {
                Logger.getLogger().m16723e("Could not create Crashlytics-specific directory: " + file);
            }
            return file;
        } catch (Throwable th) {
            throw th;
        }
    }

    private static File prepareDir(File file) {
        file.mkdirs();
        return file;
    }

    public static boolean recursiveDelete(File file) {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                recursiveDelete(file2);
            }
        }
        return file.delete();
    }

    private static <T> List<T> safeArrayToList(@Nullable T[] tArr) {
        return tArr == null ? Collections.EMPTY_LIST : Arrays.asList(tArr);
    }

    @VisibleForTesting
    public static String sanitizeName(String str) {
        return str.length() > 40 ? CommonUtils.sha1(str) : str.replaceAll("[^a-zA-Z0-9.]", "_");
    }

    private boolean useV3FileSystem() {
        return !this.processName.isEmpty();
    }

    public void cleanupPreviousFileSystems() {
        cleanupFileSystemDir(".com.google.firebase.crashlytics");
        cleanupFileSystemDir(".com.google.firebase.crashlytics-ndk");
        if (useV3FileSystem()) {
            cleanupFileSystemDir(CRASHLYTICS_PATH_V1);
            cleanupFileSystemDirs(CRASHLYTICS_PATH_V2 + File.pathSeparator);
        }
    }

    @VisibleForTesting
    public void deleteAllCrashlyticsFiles() {
        recursiveDelete(this.crashlyticsDir);
    }

    public boolean deleteSessionFiles(String str) {
        return recursiveDelete(new File(this.sessionsDir, str));
    }

    public List<String> getAllOpenSessionIds() {
        return safeArrayToList(this.sessionsDir.list());
    }

    public File getCommonFile(String str) {
        return new File(this.crashlyticsDir, str);
    }

    public List<File> getCommonFiles(FilenameFilter filenameFilter) {
        return safeArrayToList(this.crashlyticsDir.listFiles(filenameFilter));
    }

    public File getNativeReport(String str) {
        return new File(this.nativeReportsDir, str);
    }

    public List<File> getNativeReports() {
        return safeArrayToList(this.nativeReportsDir.listFiles());
    }

    public File getNativeSessionDir(String str) {
        return prepareDir(new File(getSessionDir(str), "native"));
    }

    public File getPriorityReport(String str) {
        return new File(this.priorityReportsDir, str);
    }

    public List<File> getPriorityReports() {
        return safeArrayToList(this.priorityReportsDir.listFiles());
    }

    public File getReport(String str) {
        return new File(this.reportsDir, str);
    }

    public List<File> getReports() {
        return safeArrayToList(this.reportsDir.listFiles());
    }

    public File getSessionFile(String str, String str2) {
        return new File(getSessionDir(str), str2);
    }

    public List<File> getSessionFiles(String str, FilenameFilter filenameFilter) {
        return safeArrayToList(getSessionDir(str).listFiles(filenameFilter));
    }
}
