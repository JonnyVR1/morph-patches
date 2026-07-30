package p149l;

import android.net.Uri;
import java.io.File;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes2.dex */
public class dod0 {

    /* JADX INFO: renamed from: a */
    private static Set<String> f87162a = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: b */
    private static boolean f87163b;

    static {
        f87163b = true;
        try {
            f87163b = mei.m154198d();
            f87162a.add("http");
            f87162a.add("https");
            f87162a.add("local");
            f87162a.addAll(mei.m154212r());
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m112803a(File file) {
        if (!f87163b) {
            return true;
        }
        if (file == null) {
            return false;
        }
        try {
            return !file.getAbsolutePath().contains("..");
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m112804b(String str) {
        if (!f87163b) {
            return true;
        }
        try {
            return f87162a.contains(Uri.parse(str).getScheme());
        } catch (Exception unused) {
            return false;
        }
    }
}
