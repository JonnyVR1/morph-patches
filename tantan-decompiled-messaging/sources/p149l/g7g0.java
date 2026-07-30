package p149l;

import java.io.File;
import tech.sud.logger.LogUtils;

/* JADX INFO: loaded from: classes.dex */
public abstract class g7g0 {
    /* JADX INFO: renamed from: a */
    public static boolean m124690a(String str) {
        File file = new File(str);
        if (file.isDirectory()) {
            return true;
        }
        if (file.isFile()) {
            return false;
        }
        String parent = file.getParent();
        if (parent == null || m124690a(parent)) {
            return file.mkdir();
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static void m124691b(String str) {
        String[] list;
        LogUtils.file("PathUtils", "start deleteFolderRecursive:" + str);
        File file = new File(str);
        if (!file.exists()) {
            LogUtils.file("PathUtils", "文件不存在 deleteFolderRecursive:" + str);
            return;
        }
        if (file.isDirectory() && (list = file.list()) != null) {
            for (String str2 : list) {
                m124691b(file.getPath() + File.separator + str2);
            }
        }
        LogUtils.file("PathUtils", "end deleteFolderRecursive:" + str + "  result:" + file.delete());
    }

    /* JADX INFO: renamed from: c */
    public static void m124692c(String str) {
        LogUtils.file("PathUtils", "start deleteFolderAllChilds:" + str);
        File file = new File(str);
        if (!file.exists() || !file.isDirectory()) {
            LogUtils.file("PathUtils", "目录不存在 deleteFolderAllChilds:" + str);
            return;
        }
        for (File file2 : file.listFiles()) {
            if (file2.isFile()) {
                file2.delete();
            } else if (file2.isDirectory()) {
                m124692c(file2.getAbsolutePath());
                file2.delete();
            }
        }
    }
}
