package p149l;

import com.tantanapp.beatles.p072v2.data.MonitorEvent;
import java.io.File;
import java.io.FilenameFilter;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class c620 extends hnd {

    /* JADX INFO: renamed from: l.c620$a */
    public class C16081a implements FilenameFilter {
        public C16081a() {
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return str.endsWith(".dmp");
        }
    }

    /* JADX INFO: renamed from: l.c620$b */
    public static class C16082b {
        private static c620 INSTANCE = new c620();
    }

    /* JADX INFO: renamed from: d */
    public static c620 m105364d() {
        return C16082b.INSTANCE;
    }

    @Override // p149l.hnd, p149l.s1f
    /* JADX INFO: renamed from: a */
    public String mo104783a() {
        return "xcrash";
    }

    @Override // p149l.hnd, p149l.s1f
    /* JADX INFO: renamed from: b */
    public h3f mo104784b(MonitorEvent monitorEvent) {
        h3f h3fVarMo104784b = super.mo104784b(monitorEvent);
        if (qhi.m174550k(monitorEvent.getCacheDir())) {
            List<File> listM174547h = qhi.m174547h(new File(monitorEvent.getCacheDir()), new C16081a());
            if (listM174547h.size() == 1) {
                h3fVarMo104784b.m129169e(qhi.m174554o(listM174547h.get(0).getAbsolutePath()));
            }
        }
        return h3fVarMo104784b;
    }
}
