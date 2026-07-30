package com.momo.rtcbase;

/* JADX INFO: loaded from: classes8.dex */
class NativeLibrary {
    private static String TAG = "NativeLibrary";
    private static boolean libraryLoaded;
    private static Object lock = new Object();

    public static class DefaultLoader implements NativeLibraryLoader {
        @Override // com.momo.rtcbase.NativeLibraryLoader
        public boolean load(String str) {
            Logging.m20197d(NativeLibrary.TAG, "Loading library: " + str);
            try {
                System.loadLibrary(str);
                return true;
            } catch (UnsatisfiedLinkError e) {
                Logging.m20199e(NativeLibrary.TAG, "Failed to load native library: " + str, e);
                return false;
            }
        }
    }

    public static void initialize(NativeLibraryLoader nativeLibraryLoader, String str) {
        synchronized (lock) {
            try {
                if (libraryLoaded) {
                    Logging.m20197d(TAG, "Native library has already been loaded.");
                    return;
                }
                Logging.m20197d(TAG, "Loading native library: " + str);
                libraryLoaded = nativeLibraryLoader.load(str);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static boolean isLoaded() {
        boolean z;
        synchronized (lock) {
            z = libraryLoaded;
        }
        return z;
    }
}
