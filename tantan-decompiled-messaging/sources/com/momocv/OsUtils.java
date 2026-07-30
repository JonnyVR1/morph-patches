package com.momocv;

/* JADX INFO: loaded from: classes8.dex */
public final class OsUtils {

    /* JADX INFO: renamed from: OS */
    private static String f14766OS;
    private static int mace_sync_loading_counter;

    public static String getOsName() {
        if (f14766OS == null) {
            f14766OS = System.getProperty("os.name");
        }
        return f14766OS;
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
