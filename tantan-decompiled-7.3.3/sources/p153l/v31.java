package p153l;

import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.NonNull;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.tantanapp.beatles.p077v2.data.MonitorEvent;
import com.tantanapp.beatles.p077v2.upload.UploadStatus;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class v31 {

    /* JADX INFO: renamed from: a */
    public String f182139a;

    /* JADX INFO: renamed from: b */
    public yni0 f182140b = xni0.m212212d();

    /* JADX INFO: renamed from: c */
    public q3k0 f182141c;

    /* JADX INFO: renamed from: l.v31$a */
    public class RunnableC20726a implements Runnable {
        public RunnableC20726a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            d7r.m114753a(new xx3.C21472b().m213494b(new File(v31.this.f182139a).getAbsolutePath()).m213493a());
        }
    }

    /* JADX INFO: renamed from: l.v31$b */
    public class RunnableC20727b implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ List f182143a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ MonitorEvent f182144b;

        public RunnableC20727b(List list, MonitorEvent monitorEvent) {
            this.f182143a = list;
            this.f182144b = monitorEvent;
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            File fileM199167h = v31.this.m199167h(this.f182143a, this.f182144b);
            f610.m124264b("createJsonFile zipFile!!!" + fileM199167h.getAbsolutePath(), new Object[0]);
            if (fileM199167h.exists()) {
                Pair pairM199169j = v31.this.m199169j(fileM199167h, this.f182144b);
                if (pairM199169j == null) {
                    nki.m163623f(fileM199167h.getParentFile());
                } else {
                    v31.this.m199174o(new u31((C20730e) pairM199169j.second));
                }
            }
        }
    }

    /* JADX INFO: renamed from: l.v31$c */
    public class C20728c implements FilenameFilter {
        public C20728c() {
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return str.equals("attachments.json");
        }
    }

    /* JADX INFO: renamed from: l.v31$d */
    public class RunnableC20729d implements Runnable {
        public RunnableC20729d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            v31.this.m199176q();
        }
    }

    /* JADX INFO: renamed from: l.v31$e */
    public static class C20730e {

        @SerializedName("app_version")
        private String appVersion;

        @SerializedName("event_id")
        private String eventId;
        private String filePath;
        private String md5;

        public C20730e(String str, String str2, String str3, String str4) {
            this.appVersion = str;
            this.filePath = str2;
            this.eventId = str3;
            this.md5 = str4;
        }

        /* JADX INFO: renamed from: a */
        public String m199177a() {
            return this.appVersion;
        }

        /* JADX INFO: renamed from: b */
        public String m199178b() {
            return this.eventId;
        }

        /* JADX INFO: renamed from: c */
        public String m199179c() {
            return this.filePath;
        }

        /* JADX INFO: renamed from: d */
        public String m199180d() {
            return this.md5;
        }
    }

    public v31(q3k0 q3k0Var, String str) {
        this.f182139a = str;
        this.f182141c = q3k0Var;
        m199165f();
    }

    /* JADX INFO: renamed from: f */
    public final void m199165f() {
        m199170k(new RunnableC20726a());
    }

    /* JADX INFO: renamed from: g */
    public void m199166g(File file) {
        if (file.exists()) {
            String absolutePath = file.getAbsolutePath();
            String strConcat = absolutePath.concat(".zip");
            try {
                nki.m163637t(absolutePath, strConcat);
                if (nki.m163631n(new File(strConcat), 10485760L)) {
                    du2.m118062v("[beatles]", "[upload] compressTraceFiles files reached limit size!");
                    nki.m163624g(strConcat);
                }
            } catch (IOException e) {
                du2.m118062v("[beatles]", "[upload] compressTraceFiles IOException" + e.getMessage());
            } finally {
                nki.m163623f(file);
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final File m199167h(@NonNull List<File> list, @NonNull MonitorEvent monitorEvent) {
        File next;
        File parentFile;
        File file = new File(this.f182139a, monitorEvent.getEventId());
        File file2 = new File(file, "trace");
        if (!file2.exists() && !file2.mkdirs()) {
            return null;
        }
        Iterator<File> it = list.iterator();
        while (it.hasNext() && ((parentFile = (next = it.next()).getParentFile()) == null || !TextUtils.equals(parentFile.getAbsolutePath(), file2.getAbsolutePath()))) {
            nki.m163620c(next, file2, next.getName());
        }
        m199166g(file2);
        return new File(file, file2.getName().concat(".zip"));
    }

    /* JADX INFO: renamed from: i */
    public final u31 m199168i(@NonNull File file) throws Throwable {
        FileReader fileReader;
        Throwable th;
        try {
            Gson gson = new Gson();
            fileReader = new FileReader(file);
            try {
                u31 u31Var = new u31((C20730e) gson.fromJson((Reader) fileReader, C20730e.class));
                m1m.m156698a(fileReader);
                return u31Var;
            } catch (FileNotFoundException unused) {
                m1m.m156698a(fileReader);
                return null;
            } catch (Throwable th2) {
                th = th2;
                m1m.m156698a(fileReader);
                throw th;
            }
        } catch (FileNotFoundException unused2) {
            fileReader = null;
        } catch (Throwable th3) {
            fileReader = null;
            th = th3;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX INFO: renamed from: j */
    public final Pair<File, C20730e> m199169j(File file, MonitorEvent monitorEvent) throws Throwable {
        PrintWriter printWriter;
        File file2 = new File(this.f182139a, monitorEvent.getEventId());
        String strM149979d = kiw.m149979d(file);
        ?? r2 = 0;
        try {
            try {
                File file3 = new File(file2, "attachments.json");
                file3.createNewFile();
                if (!file3.exists()) {
                    m1m.m156698a(null);
                    return null;
                }
                printWriter = new PrintWriter(new FileWriter(file3));
                try {
                    C20730e c20730e = new C20730e(monitorEvent.getApp().getAppVersion(), file.getAbsolutePath(), monitorEvent.getEventId(), strM149979d);
                    nki.m163633p(new Gson().toJson(c20730e), printWriter);
                    Pair<File, C20730e> pair = new Pair<>(file3, c20730e);
                    m1m.m156698a(printWriter);
                    return pair;
                } catch (Exception e) {
                    e = e;
                }
            } catch (Throwable th) {
                th = th;
                r2 = file2;
                m1m.m156698a(r2);
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            printWriter = null;
        } catch (Throwable th2) {
            th = th2;
            m1m.m156698a(r2);
            throw th;
        }
        f610.m124264b("createJsonFile failed!!!" + e.getMessage(), new Object[0]);
        m1m.m156698a(printWriter);
        return null;
    }

    /* JADX INFO: renamed from: k */
    public final void m199170k(Runnable runnable) {
        this.f182140b.m216870a(runnable);
    }

    /* JADX INFO: renamed from: l */
    public String m199171l() {
        return this.f182139a;
    }

    /* JADX INFO: renamed from: m */
    public final File m199172m(@NonNull File file) {
        List<File> listM163625h = nki.m163625h(file, new C20728c());
        if (listM163625h.size() > 0) {
            return listM163625h.get(0);
        }
        return null;
    }

    /* JADX INFO: renamed from: n */
    public void m199173n(@NonNull List<File> list, @NonNull MonitorEvent monitorEvent) {
        m199170k(new RunnableC20727b(list, monitorEvent));
    }

    /* JADX INFO: renamed from: o */
    public final void m199174o(@NonNull u31 u31Var) {
        UploadStatus uploadStatusM175144s = this.f182141c.m175144s(u31Var);
        if (uploadStatusM175144s == UploadStatus.SUCCESS || uploadStatusM175144s == UploadStatus.DISCARD) {
            nki.m163623f(new File(u31Var.m194320b()).getParentFile());
            f610.m124264b("upload attachment success eventId:" + u31Var.m194319a() + " status:" + uploadStatusM175144s, new Object[0]);
        }
    }

    /* JADX INFO: renamed from: p */
    public void m199175p() {
        this.f182140b.m216870a(new RunnableC20729d());
    }

    /* JADX INFO: renamed from: q */
    public final void m199176q() {
        File[] fileArrListFiles;
        if (!nki.m163628k(this.f182139a) || (fileArrListFiles = new File(this.f182139a).listFiles()) == null) {
            return;
        }
        for (File file : fileArrListFiles) {
            if (file.isDirectory()) {
                File fileM199172m = m199172m(file);
                if (fileM199172m != null) {
                    m199174o(m199168i(fileM199172m));
                } else {
                    nki.m163623f(file);
                }
            }
        }
    }
}
