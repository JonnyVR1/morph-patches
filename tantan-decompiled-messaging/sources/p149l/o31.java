package p149l;

import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.NonNull;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.tantanapp.beatles.p072v2.data.MonitorEvent;
import com.tantanapp.beatles.p072v2.upload.UploadStatus;
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

/* JADX INFO: loaded from: classes13.dex */
public class o31 {

    /* JADX INFO: renamed from: a */
    public String f141585a;

    /* JADX INFO: renamed from: b */
    public yei0 f141586b = xei0.m208582d();

    /* JADX INFO: renamed from: c */
    public nuj0 f141587c;

    /* JADX INFO: renamed from: l.o31$a */
    public class RunnableC18821a implements Runnable {
        public RunnableC18821a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            c5r.m105354a(new yw3.C21551b().m216298b(new File(o31.this.f141585a).getAbsolutePath()).m216297a());
        }
    }

    /* JADX INFO: renamed from: l.o31$b */
    public class RunnableC18822b implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ List f141589a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ MonitorEvent f141590b;

        public RunnableC18822b(List list, MonitorEvent monitorEvent) {
            this.f141589a = list;
            this.f141590b = monitorEvent;
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            File fileM162338h = o31.this.m162338h(this.f141589a, this.f141590b);
            vx00.m200472b("createJsonFile zipFile!!!" + fileM162338h.getAbsolutePath(), new Object[0]);
            if (fileM162338h.exists()) {
                Pair pairM162340j = o31.this.m162340j(fileM162338h, this.f141590b);
                if (pairM162340j == null) {
                    qhi.m174545f(fileM162338h.getParentFile());
                } else {
                    o31.this.m162345o(new n31((C18825e) pairM162340j.second));
                }
            }
        }
    }

    /* JADX INFO: renamed from: l.o31$c */
    public class C18823c implements FilenameFilter {
        public C18823c() {
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return str.equals("attachments.json");
        }
    }

    /* JADX INFO: renamed from: l.o31$d */
    public class RunnableC18824d implements Runnable {
        public RunnableC18824d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            o31.this.m162347q();
        }
    }

    /* JADX INFO: renamed from: l.o31$e */
    public static class C18825e {

        @SerializedName("app_version")
        private String appVersion;

        @SerializedName("event_id")
        private String eventId;
        private String filePath;
        private String md5;

        public C18825e(String str, String str2, String str3, String str4) {
            this.appVersion = str;
            this.filePath = str2;
            this.eventId = str3;
            this.md5 = str4;
        }

        /* JADX INFO: renamed from: a */
        public String m162348a() {
            return this.appVersion;
        }

        /* JADX INFO: renamed from: b */
        public String m162349b() {
            return this.eventId;
        }

        /* JADX INFO: renamed from: c */
        public String m162350c() {
            return this.filePath;
        }

        /* JADX INFO: renamed from: d */
        public String m162351d() {
            return this.md5;
        }
    }

    public o31(nuj0 nuj0Var, String str) {
        this.f141585a = str;
        this.f141587c = nuj0Var;
        m162336f();
    }

    /* JADX INFO: renamed from: f */
    public final void m162336f() {
        m162341k(new RunnableC18821a());
    }

    /* JADX INFO: renamed from: g */
    public void m162337g(File file) {
        if (file.exists()) {
            String absolutePath = file.getAbsolutePath();
            String strConcat = absolutePath.concat(".zip");
            try {
                qhi.m174559t(absolutePath, strConcat);
                if (qhi.m174553n(new File(strConcat), 10485760L)) {
                    nt2.m160831v("[beatles]", "[upload] compressTraceFiles files reached limit size!");
                    qhi.m174546g(strConcat);
                }
            } catch (IOException e) {
                nt2.m160831v("[beatles]", "[upload] compressTraceFiles IOException" + e.getMessage());
            } finally {
                qhi.m174545f(file);
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final File m162338h(@NonNull List<File> list, @NonNull MonitorEvent monitorEvent) {
        File next;
        File parentFile;
        File file = new File(this.f141585a, monitorEvent.getEventId());
        File file2 = new File(file, "trace");
        if (!file2.exists() && !file2.mkdirs()) {
            return null;
        }
        Iterator<File> it = list.iterator();
        while (it.hasNext() && ((parentFile = (next = it.next()).getParentFile()) == null || !TextUtils.equals(parentFile.getAbsolutePath(), file2.getAbsolutePath()))) {
            qhi.m174542c(next, file2, next.getName());
        }
        m162337g(file2);
        return new File(file, file2.getName().concat(".zip"));
    }

    /* JADX INFO: renamed from: i */
    public final n31 m162339i(@NonNull File file) throws Throwable {
        FileReader fileReader;
        Throwable th;
        try {
            Gson gson = new Gson();
            fileReader = new FileReader(file);
            try {
                n31 n31Var = new n31((C18825e) gson.fromJson((Reader) fileReader, C18825e.class));
                ryl.m181666a(fileReader);
                return n31Var;
            } catch (FileNotFoundException unused) {
                ryl.m181666a(fileReader);
                return null;
            } catch (Throwable th2) {
                th = th2;
                ryl.m181666a(fileReader);
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
    public final Pair<File, C18825e> m162340j(File file, MonitorEvent monitorEvent) throws Throwable {
        PrintWriter printWriter;
        File file2 = new File(this.f141585a, monitorEvent.getEventId());
        String strM154579d = mgw.m154579d(file);
        ?? r2 = 0;
        try {
            try {
                File file3 = new File(file2, "attachments.json");
                file3.createNewFile();
                if (!file3.exists()) {
                    ryl.m181666a(null);
                    return null;
                }
                printWriter = new PrintWriter(new FileWriter(file3));
                try {
                    C18825e c18825e = new C18825e(monitorEvent.getApp().getAppVersion(), file.getAbsolutePath(), monitorEvent.getEventId(), strM154579d);
                    qhi.m174555p(new Gson().toJson(c18825e), printWriter);
                    Pair<File, C18825e> pair = new Pair<>(file3, c18825e);
                    ryl.m181666a(printWriter);
                    return pair;
                } catch (Exception e) {
                    e = e;
                }
            } catch (Throwable th) {
                th = th;
                r2 = file2;
                ryl.m181666a(r2);
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            printWriter = null;
        } catch (Throwable th2) {
            th = th2;
            ryl.m181666a(r2);
            throw th;
        }
        vx00.m200472b("createJsonFile failed!!!" + e.getMessage(), new Object[0]);
        ryl.m181666a(printWriter);
        return null;
    }

    /* JADX INFO: renamed from: k */
    public final void m162341k(Runnable runnable) {
        this.f141586b.m214349a(runnable);
    }

    /* JADX INFO: renamed from: l */
    public String m162342l() {
        return this.f141585a;
    }

    /* JADX INFO: renamed from: m */
    public final File m162343m(@NonNull File file) {
        List<File> listM174547h = qhi.m174547h(file, new C18823c());
        if (listM174547h.size() > 0) {
            return listM174547h.get(0);
        }
        return null;
    }

    /* JADX INFO: renamed from: n */
    public void m162344n(@NonNull List<File> list, @NonNull MonitorEvent monitorEvent) {
        m162341k(new RunnableC18822b(list, monitorEvent));
    }

    /* JADX INFO: renamed from: o */
    public final void m162345o(@NonNull n31 n31Var) {
        UploadStatus uploadStatusM161505s = this.f141587c.m161505s(n31Var);
        if (uploadStatusM161505s == UploadStatus.SUCCESS || uploadStatusM161505s == UploadStatus.DISCARD) {
            qhi.m174545f(new File(n31Var.m157687b()).getParentFile());
            vx00.m200472b("upload attachment success eventId:" + n31Var.m157686a() + " status:" + uploadStatusM161505s, new Object[0]);
        }
    }

    /* JADX INFO: renamed from: p */
    public void m162346p() {
        this.f141586b.m214349a(new RunnableC18824d());
    }

    /* JADX INFO: renamed from: q */
    public final void m162347q() {
        File[] fileArrListFiles;
        if (!qhi.m174550k(this.f141585a) || (fileArrListFiles = new File(this.f141585a).listFiles()) == null) {
            return;
        }
        for (File file : fileArrListFiles) {
            if (file.isDirectory()) {
                File fileM162343m = m162343m(file);
                if (fileM162343m != null) {
                    m162345o(m162339i(fileM162343m));
                } else {
                    qhi.m174545f(file);
                }
            }
        }
    }
}
