package p149l;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.clevertap.android.sdk.Constants;
import com.tantanapp.beatles.p072v2.upload.UploadStatus;
import com.tencent.mars.xlog.Log;
import com.tencent.mars.xlog.Xlog;
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class swv {

    /* JADX INFO: renamed from: f */
    public static boolean f166725f = false;

    /* JADX INFO: renamed from: g */
    public static boolean f166726g;

    /* JADX INFO: renamed from: a */
    public String f166727a;

    /* JADX INFO: renamed from: c */
    public long f166729c;

    /* JADX INFO: renamed from: d */
    public long f166730d;

    /* JADX INFO: renamed from: b */
    public boolean f166728b = false;

    /* JADX INFO: renamed from: e */
    public Handler f166731e = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: l.swv$a */
    public class RunnableC20053a implements Runnable {
        public RunnableC20053a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            swv.this.m186368g();
        }
    }

    /* JADX INFO: renamed from: l.swv$b */
    public class RunnableC20054b implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Date f166733a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ytj0 f166734b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f166735c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ long f166736d;

        public RunnableC20054b(Date date, ytj0 ytj0Var, String str, long j) {
            this.f166733a = date;
            this.f166734b = ytj0Var;
            this.f166735c = str;
            this.f166736d = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            String strM140082a = j7c.m140082a(this.f166733a);
            vx00.m200471a("[LOG] sendLog date:" + strM140082a, new Object[0]);
            if (strM140082a.equals(j7c.m140084c())) {
                vx00.m200471a("[LOG] flush data!!!", new Object[0]);
                swv.this.m186370i();
            }
            List<File> listM186372k = swv.this.m186372k(strM140082a);
            if (listM186372k.size() == 0) {
                vx00.m200471a("[LOG] there is no file in %s ", new File(swv.this.f166727a, strM140082a).getAbsolutePath());
                ytj0 ytj0Var = this.f166734b;
                if (ytj0Var != null) {
                    swv.this.m186377p(ytj0Var);
                }
            } else {
                ytj0 ytj0Var2 = this.f166734b;
                if (ytj0Var2 != null) {
                    ytj0Var2.currentProgress = 0;
                    ytj0Var2.totalProgress = listM186372k.size() * 2;
                }
            }
            for (File file : listM186372k) {
                String name = TextUtils.isEmpty(this.f166735c) ? file.getName() : this.f166735c + "_" + file.getName();
                String strM174542c = qhi.m174542c(file, new File(nt2.m160825p().m202314e(), "log" + File.separator + name.replace(".xlog", "")), name);
                if (TextUtils.isEmpty(strM174542c)) {
                    ytj0 ytj0Var3 = this.f166734b;
                    if (ytj0Var3 != null) {
                        swv.this.m186376o(ytj0Var3, new RuntimeException("prepare log failed!"));
                        return;
                    }
                    return;
                }
                try {
                    String strM174557r = qhi.m174557r(strM174542c);
                    vx00.m200471a("[LOG] zip success,contains file: %s ", file.getName());
                    if (qhi.m174553n(new File(strM174557r), 10485760L)) {
                        vx00.m200472b("[LOG] zipFile is not valid!!!", new Object[0]);
                        qhi.m174545f(new File(strM174557r));
                        ytj0 ytj0Var4 = this.f166734b;
                        if (ytj0Var4 != null) {
                            swv.this.m186376o(ytj0Var4, new RuntimeException("zipFile size is too large"));
                            return;
                        }
                        return;
                    }
                    ytj0 ytj0Var5 = this.f166734b;
                    if (ytj0Var5 != null) {
                        swv swvVar = swv.this;
                        int i = ytj0Var5.currentProgress;
                        ytj0Var5.currentProgress = i + 1;
                        swvVar.m186375n(ytj0Var5, i, ytj0Var5.totalProgress);
                    }
                    File file2 = new File(strM174557r);
                    if (nt2.m160824o().m161506t(new twv(p460.m167370f(), file2.getAbsolutePath(), nt2.m160825p().m202313d().getUserInfo().getUserId(), this.f166736d, this.f166733a)) != UploadStatus.SUCCESS) {
                        ytj0 ytj0Var6 = this.f166734b;
                        if (ytj0Var6 != null) {
                            swv.this.m186376o(ytj0Var6, new RuntimeException("upload fail!"));
                        }
                        vx00.m200472b("[LOG] upload failed!!!", new Object[0]);
                        qhi.m174545f(file2);
                        return;
                    }
                    vx00.m200474d("[LOG] upload success:" + strM174557r, new Object[0]);
                    ytj0 ytj0Var7 = this.f166734b;
                    if (ytj0Var7 != null) {
                        swv swvVar2 = swv.this;
                        int i2 = ytj0Var7.currentProgress;
                        ytj0Var7.currentProgress = i2 + 1;
                        swvVar2.m186375n(ytj0Var7, i2, ytj0Var7.totalProgress);
                        ytj0 ytj0Var8 = this.f166734b;
                        if (ytj0Var8.currentProgress == ytj0Var8.totalProgress) {
                            swv.this.m186377p(ytj0Var8);
                        }
                    }
                    qhi.m174545f(file2);
                } catch (Throwable th) {
                    qhi.m174545f(new File(strM174542c));
                    vx00.m200472b("[LOG] upload exception:" + th.getMessage(), new Object[0]);
                    ytj0 ytj0Var9 = this.f166734b;
                    if (ytj0Var9 != null) {
                        swv.this.m186376o(ytj0Var9, th);
                        return;
                    }
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: l.swv$c */
    public class RunnableC20055c implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ytj0 f166738a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f166739b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ int f166740c;

        public RunnableC20055c(ytj0 ytj0Var, int i, int i2) {
            this.f166738a = ytj0Var;
            this.f166739b = i;
            this.f166740c = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f166738a.mo134437a(this.f166739b, this.f166740c);
        }
    }

    /* JADX INFO: renamed from: l.swv$d */
    public class RunnableC20056d implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ytj0 f166742a;

        public RunnableC20056d(ytj0 ytj0Var) {
            this.f166742a = ytj0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f166742a.mo134439c();
        }
    }

    /* JADX INFO: renamed from: l.swv$e */
    public class RunnableC20057e implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ytj0 f166744a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Throwable f166745b;

        public RunnableC20057e(ytj0 ytj0Var, Throwable th) {
            this.f166744a = ytj0Var;
            this.f166745b = th;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f166744a.mo134438b(this.f166745b);
        }
    }

    /* JADX INFO: renamed from: l.swv$f */
    public class C20058f implements FilenameFilter {
        public C20058f() {
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
            f166726g = true;
        } catch (Throwable unused) {
            f166726g = false;
        }
    }

    public swv(Context context, w9k0 w9k0Var) {
        this.f166730d = 7L;
        qwv qwvVarM202316g = w9k0Var.m202316g();
        this.f166727a = qwvVarM202316g.f156780b;
        String str = qwvVarM202316g.f156780b + File.separator + j7c.m140082a(new Date(System.currentTimeMillis()));
        this.f166730d = qwvVarM202316g.f156782d;
        if (f166726g) {
            Xlog.appenderOpen(nt2.m160830u() ? 1 : 2, 0, qwvVarM202316g.f156779a, str, "log", 0, qwvVarM202316g.f156781c);
            Xlog.setConsoleLogOpen(nt2.m160830u());
            Xlog.setMaxFileSize(qwvVarM202316g.f156783e);
            Log.setLogImp(new Xlog());
            m186369h(new RunnableC20053a());
            f166725f = true;
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m186368g() {
        File[] fileArrListFiles;
        long jM140085d = j7c.m140085d() - (this.f166730d * 86400000);
        File file = new File(this.f166727a);
        if (!file.isDirectory() || (fileArrListFiles = file.listFiles()) == null || fileArrListFiles.length == 0) {
            return;
        }
        for (File file2 : fileArrListFiles) {
            long jM140089h = j7c.m140089h(file2.getName());
            if (jM140089h != 0 && jM140089h <= jM140085d) {
                qhi.m174545f(file2);
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m186369h(Runnable runnable) {
        n21.m157541b(runnable);
    }

    /* JADX INFO: renamed from: i */
    public void m186370i() {
        if (f166725f) {
            Log.appenderFlush(true);
        }
    }

    /* JADX INFO: renamed from: j */
    public List<Date> m186371j() {
        File[] fileArrListFiles;
        File file = new File(this.f166727a);
        if (!file.exists() || !file.isDirectory() || (fileArrListFiles = file.listFiles()) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (File file2 : fileArrListFiles) {
            Date dateM140083b = j7c.m140083b(file2.getName());
            if (dateM140083b != null) {
                arrayList.add(dateM140083b);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: k */
    public final List<File> m186372k(String str) {
        return qhi.m174547h(new File(this.f166727a, str), new C20058f());
    }

    /* JADX INFO: renamed from: l */
    public void m186373l(String str, String str2) {
        if (f166725f) {
            if (System.currentTimeMillis() - this.f166729c > Constants.ONE_MIN_IN_MILLIS) {
                this.f166729c = System.currentTimeMillis();
                this.f166728b = qhi.m174549j(this.f166727a, 52428800L);
            }
            if (this.f166728b) {
                Log.m84155w(str, str2);
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public void m186374m(Date date, String str, long j, @Nullable ytj0 ytj0Var) {
        if (f166725f) {
            m186369h(new RunnableC20054b(date, ytj0Var, str, j));
        } else if (ytj0Var != null) {
            m186377p(ytj0Var);
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m186375n(ytj0 ytj0Var, int i, int i2) {
        this.f166731e.post(new RunnableC20055c(ytj0Var, i, i2));
    }

    /* JADX INFO: renamed from: o */
    public final void m186376o(ytj0 ytj0Var, Throwable th) {
        this.f166731e.post(new RunnableC20057e(ytj0Var, th));
    }

    /* JADX INFO: renamed from: p */
    public final void m186377p(ytj0 ytj0Var) {
        this.f166731e.post(new RunnableC20056d(ytj0Var));
    }
}
