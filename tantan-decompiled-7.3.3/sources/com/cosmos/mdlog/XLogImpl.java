package com.cosmos.mdlog;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public class XLogImpl implements MDLog.LogImp {
    public static final int AppednerModeAsync = 0;
    public static final int AppednerModeSync = 1;
    public static final int LEVEL_ALL = 0;
    public static final int LEVEL_DEBUG = 1;
    public static final int LEVEL_ERROR = 5;
    public static final int LEVEL_EVENT = 3;
    public static final int LEVEL_FATAL = 6;
    public static final int LEVEL_INFO = 2;
    public static final int LEVEL_NONE = 7;
    public static final int LEVEL_VERBOSE = 0;
    public static final int LEVEL_WARNING = 4;
    private static Map<Integer, List<String>> consoleTags = null;
    private static boolean isConsoleLogOpen = false;
    private static int level = 7;
    private static List<String> whiteListTags;

    public static class XLoggerInfo {
        public String filename;
        public String funcname;
        public int level;
        public int line;
        public long maintid;
        public long pid;
        public String tag;
        public long tid;
    }

    private static native void addTag(String str);

    private static native void appenderOpen(int i, int i2, String str, String str2, String str3);

    public static native void appenderSetMaxFileSize(long j);

    private static native void clearAllTags();

    private static String decryptTag(String str) {
        return str;
    }

    public static native void logWrite(XLoggerInfo xLoggerInfo, String str);

    public static native void logWrite2(int i, String str, String str2, String str3, int i2, int i3, long j, long j2, String str4);

    @Deprecated
    public static boolean mdConsolHook(String str, int i) {
        List<String> list;
        Map<Integer, List<String>> map = consoleTags;
        if (map == null || map.size() <= 0 || (list = consoleTags.get(Integer.valueOf(i))) == null || list.size() <= 0) {
            return true;
        }
        return list.contains(str);
    }

    public static void open(boolean z, int i, String str, String str2, String str3) {
        if (z) {
            System.loadLibrary("mdlog");
        }
        appenderOpen(7, i, str, str2, str3);
    }

    public static native void setAppenderMode(int i);

    public static native void setConsoleLogOpen(boolean z);

    public static native void setErrLogOpen(boolean z);

    public static native void setLogLevel(int i);

    @Deprecated
    public static void setShouldConsoleTags(List<String> list, int i) {
        if (i >= 4) {
            return;
        }
        if (consoleTags == null) {
            consoleTags = new ConcurrentHashMap();
        }
        List<String> arrayList = consoleTags.get(Integer.valueOf(i));
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        arrayList.addAll(list);
        consoleTags.put(Integer.valueOf(i), arrayList);
    }

    @Override // com.cosmos.mdlog.MDLog.LogImp
    public native void appenderClose();

    @Override // com.cosmos.mdlog.MDLog.LogImp
    public native void appenderFlush(boolean z);

    @Override // com.cosmos.mdlog.MDLog.LogImp
    public void clearAllWhiteList() {
        List<String> list = whiteListTags;
        if (list != null) {
            list.clear();
            whiteListTags = null;
        }
        clearAllTags();
    }

    @Override // com.cosmos.mdlog.MDLog.LogImp
    public int getLevel() {
        try {
            return getLogLevel();
        } catch (Throwable unused) {
            return level;
        }
    }

    public native int getLogLevel();

    @Override // com.cosmos.mdlog.MDLog.LogImp
    public List<String> getWhiteListTags() {
        return whiteListTags;
    }

    @Override // com.cosmos.mdlog.MDLog.LogImp
    public boolean isLogcatOpen() {
        return isConsoleLogOpen;
    }

    @Override // com.cosmos.mdlog.MDLog.LogImp
    public void logD(String str, String str2, String str3, int i, int i2, long j, long j2, String str4) {
        logWrite2(1, decryptTag(str), str2, str3, i, i2, j, j2, str4);
    }

    @Override // com.cosmos.mdlog.MDLog.LogImp
    public void logE(String str, String str2, String str3, int i, int i2, long j, long j2, String str4) {
        logWrite2(5, decryptTag(str), str2, str3, i, i2, j, j2, str4);
    }

    @Override // com.cosmos.mdlog.MDLog.LogImp
    public void logEvent(String str, String str2, String str3, int i, int i2, long j, long j2, String str4) {
        logWrite2(3, decryptTag(str), str2, str3, i, i2, j, j2, str4);
    }

    @Override // com.cosmos.mdlog.MDLog.LogImp
    public void logF(String str, String str2, String str3, int i, int i2, long j, long j2, String str4) {
        logWrite2(6, decryptTag(str), str2, str3, i, i2, j, j2, str4);
    }

    @Override // com.cosmos.mdlog.MDLog.LogImp
    public void logI(String str, String str2, String str3, int i, int i2, long j, long j2, String str4) {
        logWrite2(2, decryptTag(str), str2, str3, i, i2, j, j2, str4);
    }

    @Override // com.cosmos.mdlog.MDLog.LogImp
    public void logV(String str, String str2, String str3, int i, int i2, long j, long j2, String str4) {
        logWrite2(0, decryptTag(str), str2, str3, i, i2, j, j2, str4);
    }

    @Override // com.cosmos.mdlog.MDLog.LogImp
    public void logW(String str, String str2, String str3, int i, int i2, long j, long j2, String str4) {
        logWrite2(4, decryptTag(str), str2, str3, i, i2, j, j2, str4);
    }

    @Override // com.cosmos.mdlog.MDLog.LogImp
    public void registerWhiteList(List<String> list) {
        if (whiteListTags == null) {
            whiteListTags = new CopyOnWriteArrayList();
        }
        if (whiteListTags.size() > 0) {
            whiteListTags.clear();
            clearAllTags();
        }
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            addTag(it.next());
        }
        whiteListTags.addAll(list);
    }

    @Override // com.cosmos.mdlog.MDLog.LogImp
    public void setLevel(int i) {
        level = i;
        setLogLevel(i);
    }

    @Override // com.cosmos.mdlog.MDLog.LogImp
    public void setLogcatOpen(boolean z) {
        isConsoleLogOpen = z;
        setConsoleLogOpen(z);
    }
}
