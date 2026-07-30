package com.tantanapp.beatles.p076fd;

import android.os.Process;
import android.text.TextUtils;
import com.tantanapp.beatles.p077v2.data.MonitorEvent;
import java.io.File;
import java.util.HashMap;
import p153l.f610;
import p153l.tlg;
import p153l.u21;
import p153l.ulg;
import p153l.uu2;

/* JADX INFO: renamed from: com.tantanapp.beatles.fd.a */
/* JADX INFO: loaded from: classes11.dex */
public class C13711a {

    /* JADX INFO: renamed from: a */
    public static boolean f56770a;

    /* JADX INFO: renamed from: b */
    public static tlg f56771b;

    /* JADX INFO: renamed from: c */
    public static int f56772c;

    /* JADX INFO: renamed from: d */
    public static Runnable f56773d = new a();

    /* JADX INFO: renamed from: com.tantanapp.beatles.fd.a$a */
    public class a implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            ulg ulgVarM82306c = C13711a.m82306c();
            if (ulgVarM82306c != null) {
                MonitorEvent monitorEvent = new MonitorEvent("exception", "fdSize", new FdException());
                monitorEvent.setExtra("fdinfo", ulgVarM82306c.toString());
                uu2.m198146h(monitorEvent);
            }
            u21.m194239c(this, C13711a.f56771b.m191637a());
        }
    }

    /* JADX INFO: renamed from: c */
    public static ulg m82306c() {
        String canonicalPath;
        File[] fileArrListFiles = new File(m82307d()).listFiles();
        if (fileArrListFiles == null || !m82310g(fileArrListFiles.length)) {
            return null;
        }
        HashMap map = new HashMap();
        try {
            for (File file : fileArrListFiles) {
                String[] strArrSplit = file.getCanonicalPath().split(":");
                if (strArrSplit.length == 2) {
                    canonicalPath = strArrSplit[0];
                    if (!TextUtils.isEmpty(canonicalPath)) {
                        canonicalPath = canonicalPath.trim();
                    }
                } else {
                    canonicalPath = file.getCanonicalPath();
                }
                Integer num = (Integer) map.get(canonicalPath);
                map.put(canonicalPath, num != null ? Integer.valueOf(num.intValue() + 1) : 1);
            }
        } catch (Exception unused) {
        }
        return new ulg(fileArrListFiles.length, map);
    }

    /* JADX INFO: renamed from: d */
    public static String m82307d() {
        return "/proc/" + Process.myPid() + "/fd";
    }

    /* JADX INFO: renamed from: e */
    public static void m82308e() {
        m82309f(new tlg());
    }

    /* JADX INFO: renamed from: f */
    public static void m82309f(tlg tlgVar) {
        if (f56770a) {
            return;
        }
        if (!uu2.m198142d()) {
            f610.m124264b("You should add ExceptionMonitor first!!!", new Object[0]);
            return;
        }
        if (tlgVar == null) {
            tlgVar = new tlg();
        }
        f56771b = tlgVar;
        f56772c = tlgVar.m191638b();
        u21.m194239c(f56773d, tlgVar.m191639c());
        f56770a = true;
    }

    /* JADX INFO: renamed from: g */
    public static boolean m82310g(int i) {
        int i2 = f56772c;
        if (i >= i2) {
            f56772c = i2 + 50;
            return true;
        }
        if (i < f56771b.m191638b()) {
            f56772c = f56771b.m191638b();
        }
        return false;
    }
}
