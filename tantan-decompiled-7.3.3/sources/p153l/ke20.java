package p153l;

import com.tantanapp.beatles.p077v2.data.MonitorEvent;
import java.io.File;
import java.io.FilenameFilter;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class ke20 extends mod {

    /* JADX INFO: renamed from: l.ke20$a */
    public class C18143a implements FilenameFilter {
        public C18143a() {
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return str.endsWith(".dmp");
        }
    }

    /* JADX INFO: renamed from: l.ke20$b */
    public static class C18144b {
        private static ke20 INSTANCE = new ke20();
    }

    /* JADX INFO: renamed from: d */
    public static ke20 m149293d() {
        return C18144b.INSTANCE;
    }

    @Override // p153l.mod, p153l.x2f
    /* JADX INFO: renamed from: a */
    public String mo107477a() {
        return "xcrash";
    }

    @Override // p153l.mod, p153l.x2f
    /* JADX INFO: renamed from: b */
    public m4f mo107478b(MonitorEvent monitorEvent) {
        m4f m4fVarMo107478b = super.mo107478b(monitorEvent);
        if (nki.m163628k(monitorEvent.getCacheDir())) {
            List<File> listM163625h = nki.m163625h(new File(monitorEvent.getCacheDir()), new C18143a());
            if (listM163625h.size() == 1) {
                m4fVarMo107478b.m157007e(nki.m163632o(listM163625h.get(0).getAbsolutePath()));
            }
        }
        return m4fVarMo107478b;
    }
}
