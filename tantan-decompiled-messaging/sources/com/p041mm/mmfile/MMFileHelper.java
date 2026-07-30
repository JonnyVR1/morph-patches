package com.p041mm.mmfile;

import android.content.Context;
import com.p041mm.mmfile.core.MMLogInfo;

/* JADX INFO: loaded from: classes7.dex */
public class MMFileHelper {
    private static IMMFileWriter sMMFileWriter = new MMFileWriterImpl();

    public static void flush(String str) {
        MMFile mMFile;
        Strategy strategy = MMFileRegister.getStrategy(str);
        if (strategy == null || (mMFile = MMFile.get(strategy.getFileWriteConfig())) == null) {
            return;
        }
        mMFile.flush();
    }

    public static void forceUploadMMFile() {
        MMFileUploader.get().forceUploadMMFile();
    }

    @Nullable
    public static IMMFile getMMFileInstance(String str) {
        Strategy strategy = MMFileRegister.getStrategy(str);
        if (strategy == null) {
            return null;
        }
        return MMFile.get(strategy.getFileWriteConfig());
    }

    public static void install(Strategy... strategyArr) {
        MMFileRegister.install(strategyArr);
    }

    public static boolean isBindStrategy(String str) {
        return MMFileRegister.isRegistered(str);
    }

    public static void openNewLogFile(String str) {
        MMFile mMFile;
        Strategy strategy = MMFileRegister.getStrategy(str);
        if (strategy == null || (mMFile = MMFile.get(strategy.getFileWriteConfig())) == null) {
            return;
        }
        mMFile.openNewLogFile();
    }

    public static void pauseWrite(boolean z) {
        MMFile.setAllPauseWrite(z);
    }

    public static void setLibraryLoader(LibraryLoader libraryLoader) {
        MMFile.setLibraryLoader(libraryLoader);
    }

    public static void setPauseUploadTaskWhenExitApp(Context context, String... strArr) throws Throwable {
        UploaderHelper.setPauseUploadTaskWhenExitApp(context, strArr);
    }

    public static void setUploadClockTimeSeconds(String str, long j) {
        Strategy strategy = MMFileRegister.getStrategy(str);
        if (strategy == null) {
            return;
        }
        MMFileUploader.get().setUploadClockTimeSeconds(strategy.getFileUploadConfig(), j);
    }

    public static void updateCommonInfo(Strategy strategy, MMLogInfo mMLogInfo) {
        if (mMLogInfo == null) {
            return;
        }
        MMFile.updateCommonInfoInner(strategy.getFileWriteConfig(), mMLogInfo);
    }

    public static void write(String str, String str2) {
        sMMFileWriter.write(str, str2);
    }

    public static void write(String str, String... strArr) {
        sMMFileWriter.write(str, strArr);
    }
}
