package p149l;

import java.io.File;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class zkq0 {

    /* JADX INFO: renamed from: a */
    private static HashMap<String, String> f203555a;

    /* JADX INFO: renamed from: l.zkq0$a */
    public static class RunnableC21724a implements Runnable {

        /* JADX INFO: renamed from: a */
        boolean f203556a = false;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f203557b;

        public RunnableC21724a(String str) {
            this.f203557b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            String strM112650a;
            String str;
            zkq0.m219203h();
            if (zkq0.m219205j(this.f203557b)) {
                return;
            }
            bwq0.m104241d("updateSo", this.f203557b);
            File file = new File(zkq0.m219197b(this.f203557b));
            file.getParentFile().mkdirs();
            if (file.exists()) {
                file.delete();
            }
            kwq0.m147629b("doUnpackLibrary: " + this.f203557b);
            try {
                strM112650a = dnq0.m112650a(hrq0.m132700i(), this.f203557b, file);
            } catch (Throwable th) {
                bwq0.m104241d("updateSoError", this.f203557b);
                jnq0.m142383a();
                jnq0.m142384b("NPTH_CATCH", th);
                strM112650a = null;
            }
            if (strM112650a == null) {
                zkq0.f203555a.put(file.getName(), "0.0.2");
                try {
                    luq0.m151796j(new File(zkq0.m219204i(this.f203557b)), "0.0.2", false);
                } catch (Throwable unused) {
                }
                str = "updateSoSuccess";
            } else {
                if (!this.f203556a) {
                    this.f203556a = true;
                    bwq0.m104241d("updateSoPostRetry", this.f203557b);
                    wvq0.m205758b().m151993f(this, 3000L);
                    return;
                }
                str = "updateSoFailed";
            }
            bwq0.m104241d(str, this.f203557b);
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m219196a() {
        return hrq0.m132700i().getFilesDir() + "/apmlite/selflib/";
    }

    /* JADX INFO: renamed from: b */
    public static String m219197b(String str) {
        return hrq0.m132700i().getFilesDir() + "/apmlite/selflib/lib" + str + ".so";
    }

    /* JADX INFO: renamed from: d */
    public static void m219199d(String str) {
        wvq0.m205758b().m151992e(new RunnableC21724a(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static void m219203h() {
        if (f203555a != null) {
            return;
        }
        f203555a = new HashMap<>();
        File file = new File(hrq0.m132700i().getFilesDir(), "/apmlite/selflib/");
        String[] list = file.list();
        if (list == null) {
            return;
        }
        for (String str : list) {
            if (str.endsWith(".ver")) {
                try {
                    f203555a.put(str.substring(0, str.length() - 4), luq0.m151812z(file.getAbsolutePath() + "/" + str));
                } catch (Throwable th) {
                    jnq0.m142383a();
                    jnq0.m142384b("NPTH_CATCH", th);
                }
            } else if (!str.endsWith(".so")) {
                luq0.m151804r(new File(file, str));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static String m219204i(String str) {
        return hrq0.m132700i().getFilesDir() + "/apmlite/selflib/" + str + ".ver";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static boolean m219205j(String str) {
        return "0.0.2".equals(f203555a.get(str)) && new File(m219197b(str)).exists();
    }
}
