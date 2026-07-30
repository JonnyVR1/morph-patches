package p149l;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.gson.Gson;
import com.tantanapp.beatles.p072v2.data.MonitorEvent;
import java.io.File;
import java.io.FileReader;
import java.io.FilenameFilter;
import java.io.Reader;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class ax3 {

    /* JADX INFO: renamed from: a */
    public HashSet<sx00> f72103a = nt2.m160825p().m202318i();

    /* JADX INFO: renamed from: b */
    public yei0 f72104b = xei0.m208582d();

    /* JADX INFO: renamed from: l.ax3$a */
    public class RunnableC15745a implements Runnable {
        public RunnableC15745a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator<sx00> it = ax3.this.f72103a.iterator();
            while (it.hasNext()) {
                ax3.this.m99359d(it.next());
            }
        }
    }

    /* JADX INFO: renamed from: l.ax3$b */
    public class RunnableC15746b implements Runnable {
        public RunnableC15746b() {
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            Iterator<sx00> it = ax3.this.f72103a.iterator();
            while (it.hasNext()) {
                ax3.this.m99360e(it.next());
            }
        }
    }

    /* JADX INFO: renamed from: l.ax3$c */
    public class C15747c implements FilenameFilter {
        public C15747c() {
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return str.endsWith(".json");
        }
    }

    public ax3() {
        m99358c();
    }

    /* JADX INFO: renamed from: c */
    public final void m99358c() {
        this.f72104b.m214349a(new RunnableC15745a());
    }

    /* JADX INFO: renamed from: d */
    public final void m99359d(sx00 sx00Var) {
        c5r.m105354a(new yw3.C21551b().m216298b(new File(sx00Var.mo81108c()).getAbsolutePath()).m216297a());
    }

    /* JADX INFO: renamed from: e */
    public final void m99360e(sx00 sx00Var) throws Throwable {
        File[] fileArrListFiles;
        sx00Var.mo133937b();
        String strMo81108c = sx00Var.mo81108c();
        if (!qhi.m174550k(strMo81108c) || (fileArrListFiles = new File(strMo81108c).listFiles()) == null) {
            return;
        }
        for (File file : fileArrListFiles) {
            if (file.isDirectory()) {
                File fileM99361f = m99361f(file);
                if (fileM99361f != null) {
                    Gson gson = new Gson();
                    FileReader fileReader = null;
                    try {
                        try {
                            FileReader fileReader2 = new FileReader(fileM99361f);
                            try {
                                MonitorEvent monitorEvent = (MonitorEvent) gson.fromJson((Reader) fileReader2, MonitorEvent.class);
                                monitorEvent.setCacheDir(file.getAbsolutePath());
                                monitorEvent.setCache(true);
                                w3f.m201297m().m201307q(monitorEvent);
                                ryl.m181666a(fileReader2);
                            } catch (Exception e) {
                                e = e;
                                fileReader = fileReader2;
                                nt2.m160831v("[beatles]", "[check] checkV2CacheEvent exception:" + e.getMessage());
                                ryl.m181666a(fileReader);
                            } catch (Throwable th) {
                                th = th;
                                fileReader = fileReader2;
                                ryl.m181666a(fileReader);
                                throw th;
                            }
                        } catch (Exception e2) {
                            e = e2;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } else {
                    nt2.m160831v("[beatles]", "[check] checkV2CacheEvent jsonFile is null!" + sx00Var.mo81107a());
                }
            }
        }
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public final File m99361f(@NonNull File file) {
        List<File> listM174547h = qhi.m174547h(file, new C15747c());
        if (listM174547h.size() > 0) {
            return listM174547h.get(0);
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public void m99362g() {
        this.f72104b.m214349a(new RunnableC15746b());
    }
}
