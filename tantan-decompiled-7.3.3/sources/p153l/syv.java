package p153l;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.clevertap.android.sdk.Constants;
import com.tantanapp.beatles.p077v2.upload.UploadStatus;
import com.tencent.mars.xlog.Log;
import com.tencent.mars.xlog.Xlog;
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class syv {

    /* JADX INFO: renamed from: f */
    public static boolean f171297f = false;

    /* JADX INFO: renamed from: g */
    public static boolean f171298g;

    /* JADX INFO: renamed from: a */
    public String f171299a;

    /* JADX INFO: renamed from: c */
    public long f171301c;

    /* JADX INFO: renamed from: d */
    public long f171302d;

    /* JADX INFO: renamed from: b */
    public boolean f171300b = false;

    /* JADX INFO: renamed from: e */
    public Handler f171303e = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: l.syv$a */
    public class RunnableC20188a implements Runnable {
        public RunnableC20188a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            syv.this.m188595g();
        }
    }

    /* JADX INFO: renamed from: l.syv$b */
    public class RunnableC20189b implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Date f171305a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ b3k0 f171306b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f171307c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ long f171308d;

        public RunnableC20189b(Date date, b3k0 b3k0Var, String str, long j) {
            this.f171305a = date;
            this.f171306b = b3k0Var;
            this.f171307c = str;
            this.f171308d = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            String strM171230a = p8c.m171230a(this.f171305a);
            f610.m124263a("[LOG] sendLog date:" + strM171230a, new Object[0]);
            if (strM171230a.equals(p8c.m171232c())) {
                f610.m124263a("[LOG] flush data!!!", new Object[0]);
                syv.this.m188597i();
            }
            List<File> listM188599k = syv.this.m188599k(strM171230a);
            if (listM188599k.size() == 0) {
                f610.m124263a("[LOG] there is no file in %s ", new File(syv.this.f171299a, strM171230a).getAbsolutePath());
                b3k0 b3k0Var = this.f171306b;
                if (b3k0Var != null) {
                    syv.this.m188604p(b3k0Var);
                }
            } else {
                b3k0 b3k0Var2 = this.f171306b;
                if (b3k0Var2 != null) {
                    b3k0Var2.currentProgress = 0;
                    b3k0Var2.totalProgress = listM188599k.size() * 2;
                }
            }
            for (File file : listM188599k) {
                String name = TextUtils.isEmpty(this.f171307c) ? file.getName() : this.f171307c + "_" + file.getName();
                String strM163620c = nki.m163620c(file, new File(du2.m118056p().m110249e(), "log" + File.separator + name.replace(".xlog", "")), name);
                if (TextUtils.isEmpty(strM163620c)) {
                    b3k0 b3k0Var3 = this.f171306b;
                    if (b3k0Var3 != null) {
                        syv.this.m188603o(b3k0Var3, new RuntimeException("prepare log failed!"));
                        return;
                    }
                    return;
                }
                try {
                    String strM163635r = nki.m163635r(strM163620c);
                    f610.m124263a("[LOG] zip success,contains file: %s ", file.getName());
                    if (nki.m163631n(new File(strM163635r), 10485760L)) {
                        f610.m124264b("[LOG] zipFile is not valid!!!", new Object[0]);
                        nki.m163623f(new File(strM163635r));
                        b3k0 b3k0Var4 = this.f171306b;
                        if (b3k0Var4 != null) {
                            syv.this.m188603o(b3k0Var4, new RuntimeException("zipFile size is too large"));
                            return;
                        }
                        return;
                    }
                    b3k0 b3k0Var5 = this.f171306b;
                    if (b3k0Var5 != null) {
                        syv syvVar = syv.this;
                        int i = b3k0Var5.currentProgress;
                        b3k0Var5.currentProgress = i + 1;
                        syvVar.m188602n(b3k0Var5, i, b3k0Var5.totalProgress);
                    }
                    File file2 = new File(strM163635r);
                    if (du2.m118055o().m175145t(new tyv(vc60.m200791f(), file2.getAbsolutePath(), du2.m118056p().m110248d().getUserInfo().getUserId(), this.f171308d, this.f171305a)) != UploadStatus.SUCCESS) {
                        b3k0 b3k0Var6 = this.f171306b;
                        if (b3k0Var6 != null) {
                            syv.this.m188603o(b3k0Var6, new RuntimeException("upload fail!"));
                        }
                        f610.m124264b("[LOG] upload failed!!!", new Object[0]);
                        nki.m163623f(file2);
                        return;
                    }
                    f610.m124266d("[LOG] upload success:" + strM163635r, new Object[0]);
                    b3k0 b3k0Var7 = this.f171306b;
                    if (b3k0Var7 != null) {
                        syv syvVar2 = syv.this;
                        int i2 = b3k0Var7.currentProgress;
                        b3k0Var7.currentProgress = i2 + 1;
                        syvVar2.m188602n(b3k0Var7, i2, b3k0Var7.totalProgress);
                        b3k0 b3k0Var8 = this.f171306b;
                        if (b3k0Var8.currentProgress == b3k0Var8.totalProgress) {
                            syv.this.m188604p(b3k0Var8);
                        }
                    }
                    nki.m163623f(file2);
                } catch (Throwable th) {
                    nki.m163623f(new File(strM163620c));
                    f610.m124264b("[LOG] upload exception:" + th.getMessage(), new Object[0]);
                    b3k0 b3k0Var9 = this.f171306b;
                    if (b3k0Var9 != null) {
                        syv.this.m188603o(b3k0Var9, th);
                        return;
                    }
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: l.syv$c */
    public class RunnableC20190c implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ b3k0 f171310a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f171311b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ int f171312c;

        public RunnableC20190c(b3k0 b3k0Var, int i, int i2) {
            this.f171310a = b3k0Var;
            this.f171311b = i;
            this.f171312c = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f171310a.mo102341a(this.f171311b, this.f171312c);
        }
    }

    /* JADX INFO: renamed from: l.syv$d */
    public class RunnableC20191d implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ b3k0 f171314a;

        public RunnableC20191d(b3k0 b3k0Var) {
            this.f171314a = b3k0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f171314a.mo102343c();
        }
    }

    /* JADX INFO: renamed from: l.syv$e */
    public class RunnableC20192e implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ b3k0 f171316a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Throwable f171317b;

        public RunnableC20192e(b3k0 b3k0Var, Throwable th) {
            this.f171316a = b3k0Var;
            this.f171317b = th;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f171316a.mo102342b(this.f171317b);
        }
    }

    /* JADX INFO: renamed from: l.syv$f */
    public class C20193f implements FilenameFilter {
        public C20193f() {
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return str.endsWith(".xlog");
        }
    }

    static {
        try {
            System.loadLibrary("c++_shared");
            System.loadLibrary("marsxlog");
            f171298g = true;
        } catch (Throwable unused) {
            f171298g = false;
        }
    }

    public syv(Context context, cjk0 cjk0Var) {
        this.f171302d = 7L;
        qyv qyvVarM110251g = cjk0Var.m110251g();
        this.f171299a = qyvVarM110251g.f160189b;
        String str = qyvVarM110251g.f160189b + File.separator + p8c.m171230a(new Date(System.currentTimeMillis()));
        this.f171302d = qyvVarM110251g.f160191d;
        if (f171298g) {
            Xlog.appenderOpen(du2.m118061u() ? 1 : 2, 0, qyvVarM110251g.f160188a, str, "log", 0, qyvVarM110251g.f160190c);
            Xlog.setConsoleLogOpen(du2.m118061u());
            Xlog.setMaxFileSize(qyvVarM110251g.f160192e);
            Log.setLogImp(new Xlog());
            m188596h(new RunnableC20188a());
            f171297f = true;
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m188595g() {
        File[] fileArrListFiles;
        long jM171233d = p8c.m171233d() - (this.f171302d * 86400000);
        File file = new File(this.f171299a);
        if (!file.isDirectory() || (fileArrListFiles = file.listFiles()) == null || fileArrListFiles.length == 0) {
            return;
        }
        for (File file2 : fileArrListFiles) {
            long jM171237h = p8c.m171237h(file2.getName());
            if (jM171237h != 0 && jM171237h <= jM171233d) {
                nki.m163623f(file2);
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m188596h(Runnable runnable) {
        u21.m194238b(runnable);
    }

    /* JADX INFO: renamed from: i */
    public void m188597i() {
        if (f171297f) {
            Log.appenderFlush(true);
        }
    }

    /* JADX INFO: renamed from: j */
    public List<Date> m188598j() {
        File[] fileArrListFiles;
        File file = new File(this.f171299a);
        if (!file.exists() || !file.isDirectory() || (fileArrListFiles = file.listFiles()) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (File file2 : fileArrListFiles) {
            Date dateM171231b = p8c.m171231b(file2.getName());
            if (dateM171231b != null) {
                arrayList.add(dateM171231b);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: k */
    public final List<File> m188599k(String str) {
        return nki.m163625h(new File(this.f171299a, str), new C20193f());
    }

    /* JADX INFO: renamed from: l */
    public void m188600l(String str, String str2) {
        if (f171297f) {
            if (System.currentTimeMillis() - this.f171301c > Constants.ONE_MIN_IN_MILLIS) {
                this.f171301c = System.currentTimeMillis();
                this.f171300b = nki.m163627j(this.f171299a, 52428800L);
            }
            if (this.f171300b) {
                Log.m85338w(str, str2);
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public void m188601m(Date date, String str, long j, @Nullable b3k0 b3k0Var) {
        if (f171297f) {
            m188596h(new RunnableC20189b(date, b3k0Var, str, j));
        } else if (b3k0Var != null) {
            m188604p(b3k0Var);
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m188602n(b3k0 b3k0Var, int i, int i2) {
        this.f171303e.post(new RunnableC20190c(b3k0Var, i, i2));
    }

    /* JADX INFO: renamed from: o */
    public final void m188603o(b3k0 b3k0Var, Throwable th) {
        this.f171303e.post(new RunnableC20192e(b3k0Var, th));
    }

    /* JADX INFO: renamed from: p */
    public final void m188604p(b3k0 b3k0Var) {
        this.f171303e.post(new RunnableC20191d(b3k0Var));
    }
}
