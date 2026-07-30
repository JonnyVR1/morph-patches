package com.cosmos.photon.push.channel.inner;

import com.cosmos.mdlog.MDLog;
import com.cosmos.photon.push.log.LogTag;
import com.cosmos.photon.push.util.AppContext;
import com.cosmos.photon.push.util.FileUtil;
import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class FileChannel {
    private static final String DIR = AppContext.getContext().getExternalFilesDir("COSMOS_PUSH") + "/.DOS_STORE";

    public static void deleteConfig(String str) {
        new File(DIR, "." + str).delete();
    }

    public static String readConfig(String str) {
        File file = new File(DIR, "." + str);
        if (!file.exists()) {
            return null;
        }
        try {
            return FileUtil.readStr(file);
        } catch (IOException e) {
            MDLog.printErrStackTrace(LogTag.CHANNEL, e);
            return null;
        }
    }

    public static void writeConfig(String str, String str2) throws Throwable {
        String str3 = DIR;
        File file = new File(str3);
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(str3, "." + str);
        MDLog.m7450i(LogTag.CHANNEL, "write %s %s", file2.getAbsolutePath(), str2);
        try {
            FileUtil.writeStr(file2, str2);
        } catch (IOException e) {
            MDLog.printErrStackTrace(LogTag.CHANNEL, e);
        }
    }
}
