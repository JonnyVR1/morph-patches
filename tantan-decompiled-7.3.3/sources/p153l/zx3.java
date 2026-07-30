package p153l;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.gson.Gson;
import com.tantanapp.beatles.p077v2.data.MonitorEvent;
import java.io.File;
import java.io.FileReader;
import java.io.FilenameFilter;
import java.io.Reader;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class zx3 {

    /* JADX INFO: renamed from: a */
    public HashSet<c610> f206426a = du2.m118056p().m110253i();

    /* JADX INFO: renamed from: b */
    public yni0 f206427b = xni0.m212212d();

    /* JADX INFO: renamed from: l.zx3$a */
    public class RunnableC21915a implements Runnable {
        public RunnableC21915a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator<c610> it = zx3.this.f206426a.iterator();
            while (it.hasNext()) {
                zx3.this.m221974d(it.next());
            }
        }
    }

    /* JADX INFO: renamed from: l.zx3$b */
    public class RunnableC21916b implements Runnable {
        public RunnableC21916b() {
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            Iterator<c610> it = zx3.this.f206426a.iterator();
            while (it.hasNext()) {
                zx3.this.m221975e(it.next());
            }
        }
    }

    /* JADX INFO: renamed from: l.zx3$c */
    public class C21917c implements FilenameFilter {
        public C21917c() {
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return str.endsWith(".json");
        }
    }

    public zx3() {
        m221973c();
    }

    /* JADX INFO: renamed from: c */
    public final void m221973c() {
        this.f206427b.m216870a(new RunnableC21915a());
    }

    /* JADX INFO: renamed from: d */
    public final void m221974d(c610 c610Var) {
        d7r.m114753a(new xx3.C21472b().m213494b(new File(c610Var.mo82291c()).getAbsolutePath()).m213493a());
    }

    /* JADX INFO: renamed from: e */
    public final void m221975e(c610 c610Var) throws Throwable {
        File[] fileArrListFiles;
        c610Var.mo108089b();
        String strMo82291c = c610Var.mo82291c();
        if (!nki.m163628k(strMo82291c) || (fileArrListFiles = new File(strMo82291c).listFiles()) == null) {
            return;
        }
        for (File file : fileArrListFiles) {
            if (file.isDirectory()) {
                File fileM221976f = m221976f(file);
                if (fileM221976f != null) {
                    Gson gson = new Gson();
                    FileReader fileReader = null;
                    try {
                        try {
                            FileReader fileReader2 = new FileReader(fileM221976f);
                            try {
                                MonitorEvent monitorEvent = (MonitorEvent) gson.fromJson((Reader) fileReader2, MonitorEvent.class);
                                monitorEvent.setCacheDir(file.getAbsolutePath());
                                monitorEvent.setCache(true);
                                a5f.m96060m().m96070q(monitorEvent);
                                m1m.m156698a(fileReader2);
                            } catch (Exception e) {
                                e = e;
                                fileReader = fileReader2;
                                du2.m118062v("[beatles]", "[check] checkV2CacheEvent exception:" + e.getMessage());
                                m1m.m156698a(fileReader);
                            } catch (Throwable th) {
                                th = th;
                                fileReader = fileReader2;
                                m1m.m156698a(fileReader);
                                throw th;
                            }
                        } catch (Exception e2) {
                            e = e2;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } else {
                    du2.m118062v("[beatles]", "[check] checkV2CacheEvent jsonFile is null!" + c610Var.mo82290a());
                }
            }
        }
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public final File m221976f(@NonNull File file) {
        List<File> listM163625h = nki.m163625h(file, new C21917c());
        if (listM163625h.size() > 0) {
            return listM163625h.get(0);
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public void m221977g() {
        this.f206427b.m216870a(new RunnableC21916b());
    }
}
