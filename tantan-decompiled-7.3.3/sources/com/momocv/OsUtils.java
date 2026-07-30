package com.momocv;

/* JADX INFO: loaded from: classes8.dex */
public final class OsUtils {

    /* JADX INFO: renamed from: OS */
    private static String f15485OS;
    private static int mace_sync_loading_counter;

    public static String getOsName() {
        if (f15485OS == null) {
            f15485OS = System.getProperty("os.name");
        }
        return f15485OS;
    }

    public static boolean isWindows() {
        return getOsName().startsWith("Windows");
    }

    public static synchronized void maceSyncLoadFinished() {
        int i = mace_sync_loading_counter;
        if (i > 0) {
            mace_sync_loading_counter = i - 1;
        }
    }

    public static synchronized void maceSyncLoadStart() {
        mace_sync_loading_counter++;
    }

    public static synchronized boolean maceSyncLoading() {
        return mace_sync_loading_counter > 0;
    }
}
