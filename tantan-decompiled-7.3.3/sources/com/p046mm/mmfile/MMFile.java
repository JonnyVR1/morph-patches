package com.p046mm.mmfile;

import com.p046mm.mmfile.core.FileWriteConfig;
import com.p046mm.mmfile.core.IMMFileEventListener;
import com.p046mm.mmfile.core.MMLogInfo;
import java.util.HashMap;
import p153l.azk0;

/* JADX INFO: loaded from: classes6.dex */
class MMFile implements IMMFile {
    private static final HashMap<FileWriteConfig, MMFileInstanceFetcher> SYSTEM_SERVICE_FETCHERS = new HashMap<>();
    static final String TAG = "MMFile";
    private static volatile boolean isSoLoaded = false;
    private static volatile LibraryLoader libraryLoader;
    private long mNativePtr;

    public static class MMFileInstanceFetcher {
        private final FileWriteConfig mFileWriteConfig;
        private MMFile mmFile;

        private MMFileInstanceFetcher(FileWriteConfig fileWriteConfig) {
            this.mFileWriteConfig = fileWriteConfig;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void updateCommonInfo(MMLogInfo mMLogInfo) {
            FileWriteConfig fileWriteConfig = this.mFileWriteConfig;
            if (fileWriteConfig == null) {
                return;
            }
            fileWriteConfig.updateCommonInfo(mMLogInfo);
            MMFile mMFile = this.mmFile;
            if (mMFile != null) {
                mMFile.updateCommonInfo(mMLogInfo);
            }
        }

        public synchronized MMFile getMMFile() {
            try {
                if (this.mmFile == null) {
                    Logger.m20639i(MMFile.TAG, "create FileWriteConfig instance: %s", this.mFileWriteConfig.getFilePrefix());
                    this.mmFile = new MMFile(this.mFileWriteConfig);
                }
            } catch (Throwable th) {
                throw th;
            }
            return this.mmFile;
        }
    }

    private MMFile(FileWriteConfig fileWriteConfig) {
        this.mNativePtr = -1L;
        checkLoadLibrary();
        if (isSoLoaded) {
            try {
                this.mNativePtr = nativeCreate(fileWriteConfig);
            } catch (UnsatisfiedLinkError e) {
                Logger.printErrStackTrace(TAG, e);
                this.mNativePtr = -1L;
                isSoLoaded = false;
            }
        }
        setEventListener(new EventListenerWrapper(fileWriteConfig.getEventListener(), fileWriteConfig));
        long j = this.mNativePtr;
        if (j != -1) {
            try {
                nativeStart(j);
            } catch (UnsatisfiedLinkError e2) {
                Logger.printErrStackTrace(TAG, e2);
                this.mNativePtr = -1L;
            }
        }
    }

    private static void checkLoadLibrary() {
        if (isSoLoaded) {
            return;
        }
        synchronized (MMFile.class) {
            if (!isSoLoaded) {
                boolean z = true;
                if (libraryLoader != null) {
                    try {
                        boolean zLoadLibrary = libraryLoader.loadLibrary("c++_shared");
                        boolean zLoadLibrary2 = libraryLoader.loadLibrary("mmfile");
                        if (!zLoadLibrary || !zLoadLibrary2) {
                            z = false;
                        }
                        isSoLoaded = z;
                    } catch (UnsatisfiedLinkError unused) {
                        isSoLoaded = false;
                    }
                } else {
                    try {
                        System.loadLibrary("c++_shared");
                        System.loadLibrary("mmfile");
                        isSoLoaded = true;
                    } catch (UnsatisfiedLinkError unused2) {
                        isSoLoaded = false;
                    }
                }
                throw th;
            }
        }
    }

    @Nullable
    public static MMFile get(FileWriteConfig fileWriteConfig) {
        MMFileInstanceFetcher mMFileInstanceFetcher = SYSTEM_SERVICE_FETCHERS.get(fileWriteConfig);
        if (mMFileInstanceFetcher != null) {
            return mMFileInstanceFetcher.getMMFile();
        }
        return null;
    }

    @Nullable
    public static MMFile getIfCreated(FileWriteConfig fileWriteConfig) {
        MMFileInstanceFetcher mMFileInstanceFetcher = SYSTEM_SERVICE_FETCHERS.get(fileWriteConfig);
        if (mMFileInstanceFetcher == null) {
            return null;
        }
        return mMFileInstanceFetcher.mmFile;
    }

    private native void nativeClose(long j);

    private native long nativeCreate(FileWriteConfig fileWriteConfig);

    private native void nativeFlush(long j);

    private native void nativeOpenNewLogFile(long j);

    private static native void nativePauseAllLogWrite(boolean z);

    private native void nativePauseLogWrite(long j, boolean z);

    private native void nativeSetEventListener(long j, IMMFileEventListener iMMFileEventListener);

    private native void nativeStart(long j);

    private native void nativeUpdateCommonInfo(long j, String str, String[] strArr);

    private native void nativeWrite(long j, String[] strArr, String str);

    public static void register(FileWriteConfig fileWriteConfig) {
        HashMap<FileWriteConfig, MMFileInstanceFetcher> map = SYSTEM_SERVICE_FETCHERS;
        if (map.containsKey(fileWriteConfig)) {
            azk0.m101074a("fileWriteConfig is already registered");
        } else if (fileWriteConfig != null) {
            map.put(fileWriteConfig, new MMFileInstanceFetcher(fileWriteConfig));
        } else {
            azk0.m101074a("fileWriteConfig can not be null");
        }
    }

    public static void setAllPauseWrite(boolean z) {
        checkLoadLibrary();
        if (isSoLoaded) {
            try {
                nativePauseAllLogWrite(z);
            } catch (UnsatisfiedLinkError e) {
                Logger.printErrStackTrace(TAG, e);
                isSoLoaded = false;
            }
        }
    }

    private void setEventListener(IMMFileEventListener iMMFileEventListener) {
        if (iMMFileEventListener == null) {
            return;
        }
        long j = this.mNativePtr;
        if (j != -1) {
            try {
                nativeSetEventListener(j, iMMFileEventListener);
            } catch (UnsatisfiedLinkError e) {
                Logger.printErrStackTrace(TAG, e);
                this.mNativePtr = -1L;
            }
        }
    }

    public static void setLibraryLoader(LibraryLoader libraryLoader2) {
        libraryLoader = libraryLoader2;
    }

    public static void updateCommonInfoInner(FileWriteConfig fileWriteConfig, MMLogInfo mMLogInfo) {
        MMFileInstanceFetcher mMFileInstanceFetcher = SYSTEM_SERVICE_FETCHERS.get(fileWriteConfig);
        if (mMFileInstanceFetcher != null) {
            mMFileInstanceFetcher.updateCommonInfo(mMLogInfo);
        }
    }

    @Override // com.p046mm.mmfile.IMMFile
    public void close() {
        long j = this.mNativePtr;
        if (j != -1) {
            try {
                nativeClose(j);
            } catch (UnsatisfiedLinkError e) {
                Logger.printErrStackTrace(TAG, e);
                this.mNativePtr = -1L;
            }
        }
    }

    @Override // com.p046mm.mmfile.IMMFile
    public void flush() {
        long j = this.mNativePtr;
        if (j != -1) {
            try {
                nativeFlush(j);
            } catch (UnsatisfiedLinkError e) {
                Logger.printErrStackTrace(TAG, e);
                this.mNativePtr = -1L;
            }
        }
    }

    @Override // com.p046mm.mmfile.IMMFile
    public void openNewLogFile() {
        long j = this.mNativePtr;
        if (j != -1) {
            try {
                nativeOpenNewLogFile(j);
            } catch (UnsatisfiedLinkError e) {
                Logger.printErrStackTrace(TAG, e);
                this.mNativePtr = -1L;
            }
        }
    }

    @Override // com.p046mm.mmfile.IMMFile
    public void restart() {
        long j = this.mNativePtr;
        if (j != -1) {
            try {
                nativeStart(j);
            } catch (UnsatisfiedLinkError e) {
                Logger.printErrStackTrace(TAG, e);
                this.mNativePtr = -1L;
            }
        }
    }

    @Override // com.p046mm.mmfile.IMMFile
    public void setPauseWrite(boolean z) {
        long j = this.mNativePtr;
        if (j != -1) {
            try {
                nativePauseLogWrite(j, z);
            } catch (UnsatisfiedLinkError e) {
                Logger.printErrStackTrace(TAG, e);
                this.mNativePtr = -1L;
            }
        }
    }

    @Override // com.p046mm.mmfile.IMMFile
    public void updateCommonInfo(MMLogInfo mMLogInfo) {
        updateCommonInfo(mMLogInfo.getBody(), (String[]) mMLogInfo.getHeaders().toArray(new String[0]));
    }

    @Override // com.p046mm.mmfile.IMMFile
    public void write(String str, String... strArr) {
        long j = this.mNativePtr;
        if (j != -1) {
            try {
                nativeWrite(j, strArr, str);
            } catch (UnsatisfiedLinkError e) {
                Logger.printErrStackTrace(TAG, e);
                this.mNativePtr = -1L;
            }
        }
    }

    private void updateCommonInfo(String str, String... strArr) {
        long j = this.mNativePtr;
        if (j != -1) {
            try {
                nativeUpdateCommonInfo(j, str, strArr);
            } catch (UnsatisfiedLinkError e) {
                Logger.printErrStackTrace(TAG, e);
                this.mNativePtr = -1L;
            }
        }
    }
}
