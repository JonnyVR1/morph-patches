package com.tantanapp.beatles.p071fd;

import android.os.Process;
import android.text.TextUtils;
import com.tantanapp.beatles.p072v2.data.MonitorEvent;
import java.io.File;
import java.util.HashMap;
import p149l.eu2;
import p149l.fkg;
import p149l.gkg;
import p149l.n21;
import p149l.vx00;

/* JADX INFO: renamed from: com.tantanapp.beatles.fd.a */
/* JADX INFO: loaded from: classes13.dex */
public class C13548a {

    /* JADX INFO: renamed from: a */
    public static boolean f55922a;

    /* JADX INFO: renamed from: b */
    public static fkg f55923b;

    /* JADX INFO: renamed from: c */
    public static int f55924c;

    /* JADX INFO: renamed from: d */
    public static Runnable f55925d = new a();

    /* JADX INFO: renamed from: com.tantanapp.beatles.fd.a$a */
    public class a implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            gkg gkgVarM81123c = C13548a.m81123c();
            if (gkgVarM81123c != null) {
                MonitorEvent monitorEvent = new MonitorEvent("exception", "fdSize", new FdException());
                monitorEvent.setExtra("fdinfo", gkgVarM81123c.toString());
                eu2.m118154h(monitorEvent);
            }
            n21.m157542c(this, C13548a.f55923b.m121849a());
        }
    }

    /* JADX INFO: renamed from: c */
    public static gkg m81123c() {
        String canonicalPath;
        File[] fileArrListFiles = new File(m81124d()).listFiles();
        if (fileArrListFiles == null || !m81127g(fileArrListFiles.length)) {
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
        return new gkg(fileArrListFiles.length, map);
    }

    /* JADX INFO: renamed from: d */
    public static String m81124d() {
        return "/proc/" + Process.myPid() + "/fd";
    }

    /* JADX INFO: renamed from: e */
    public static void m81125e() {
        m81126f(new fkg());
    }

    /* JADX INFO: renamed from: f */
    public static void m81126f(fkg fkgVar) {
        if (f55922a) {
            return;
        }
        if (!eu2.m118150d()) {
            vx00.m200472b("You should add ExceptionMonitor first!!!", new Object[0]);
            return;
        }
        if (fkgVar == null) {
            fkgVar = new fkg();
        }
        f55923b = fkgVar;
        f55924c = fkgVar.m121850b();
        n21.m157542c(f55925d, fkgVar.m121851c());
        f55922a = true;
    }

    /* JADX INFO: renamed from: g */
    public static boolean m81127g(int i) {
        int i2 = f55924c;
        if (i >= i2) {
            f55924c = i2 + 50;
            return true;
        }
        if (i < f55923b.m121850b()) {
            f55924c = f55923b.m121850b();
        }
        return false;
    }
}
