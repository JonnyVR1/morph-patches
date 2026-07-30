package p153l;

import java.io.File;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class fuq0 {

    /* JADX INFO: renamed from: a */
    private static HashMap<String, String> f100934a;

    /* JADX INFO: renamed from: l.fuq0$a */
    public static class RunnableC17080a implements Runnable {

        /* JADX INFO: renamed from: a */
        boolean f100935a = false;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f100936b;

        public RunnableC17080a(String str) {
            this.f100936b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            String strM147185a;
            String str;
            fuq0.m127531h();
            if (fuq0.m127533j(this.f100936b)) {
                return;
            }
            h5r0.m133674d("updateSo", this.f100936b);
            File file = new File(fuq0.m127525b(this.f100936b));
            file.getParentFile().mkdirs();
            if (file.exists()) {
                file.delete();
            }
            q5r0.m175512b("doUnpackLibrary: " + this.f100936b);
            try {
                strM147185a = jwq0.m147185a(n0r0.m161022i(), this.f100936b, file);
            } catch (Throwable th) {
                h5r0.m133674d("updateSoError", this.f100936b);
                pwq0.m174074a();
                pwq0.m174075b("NPTH_CATCH", th);
                strM147185a = null;
            }
            if (strM147185a == null) {
                fuq0.f100934a.put(file.getName(), "0.0.2");
                try {
                    r3r0.m179684j(new File(fuq0.m127532i(this.f100936b)), "0.0.2", false);
                } catch (Throwable unused) {
                }
                str = "updateSoSuccess";
            } else {
                if (!this.f100935a) {
                    this.f100935a = true;
                    h5r0.m133674d("updateSoPostRetry", this.f100936b);
                    c5r0.m108080b().m179946f(this, 3000L);
                    return;
                }
                str = "updateSoFailed";
            }
            h5r0.m133674d(str, this.f100936b);
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m127524a() {
        return n0r0.m161022i().getFilesDir() + "/apmlite/selflib/";
    }

    /* JADX INFO: renamed from: b */
    public static String m127525b(String str) {
        return n0r0.m161022i().getFilesDir() + "/apmlite/selflib/lib" + str + ".so";
    }

    /* JADX INFO: renamed from: d */
    public static void m127527d(String str) {
        c5r0.m108080b().m179945e(new RunnableC17080a(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static void m127531h() {
        if (f100934a != null) {
            return;
        }
        f100934a = new HashMap<>();
        File file = new File(n0r0.m161022i().getFilesDir(), "/apmlite/selflib/");
        String[] list = file.list();
        if (list == null) {
            return;
        }
        for (String str : list) {
            if (str.endsWith(".ver")) {
                try {
                    f100934a.put(str.substring(0, str.length() - 4), r3r0.m179700z(file.getAbsolutePath() + "/" + str));
                } catch (Throwable th) {
                    pwq0.m174074a();
                    pwq0.m174075b("NPTH_CATCH", th);
                }
            } else if (!str.endsWith(".so")) {
                r3r0.m179692r(new File(file, str));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static String m127532i(String str) {
        return n0r0.m161022i().getFilesDir() + "/apmlite/selflib/" + str + ".ver";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static boolean m127533j(String str) {
        return "0.0.2".equals(f100934a.get(str)) && new File(m127525b(str)).exists();
    }
}
