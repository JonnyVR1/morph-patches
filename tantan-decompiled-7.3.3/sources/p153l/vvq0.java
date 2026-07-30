package p153l;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public class vvq0 {

    /* JADX INFO: renamed from: e */
    private static volatile vvq0 f185952e;

    /* JADX INFO: renamed from: a */
    private Context f185953a;

    /* JADX INFO: renamed from: b */
    private final HashMap<String, uvq0> f185954b = new HashMap<>();

    /* JADX INFO: renamed from: c */
    private ThreadPoolExecutor f185955c = new ThreadPoolExecutor(1, 1, 15, TimeUnit.SECONDS, new LinkedBlockingQueue());

    /* JADX INFO: renamed from: d */
    private final ArrayList<AbstractRunnableC20940a> f185956d = new ArrayList<>();

    /* JADX INFO: renamed from: l.vvq0$b */
    public static abstract class AbstractC20941b<T> extends AbstractRunnableC20940a {

        /* JADX INFO: renamed from: h */
        private List<String> f185966h;

        /* JADX INFO: renamed from: i */
        private String f185967i;

        /* JADX INFO: renamed from: j */
        private String[] f185968j;

        /* JADX INFO: renamed from: k */
        private String f185969k;

        /* JADX INFO: renamed from: l */
        private String f185970l;

        /* JADX INFO: renamed from: m */
        private String f185971m;

        /* JADX INFO: renamed from: n */
        private int f185972n;

        /* JADX INFO: renamed from: o */
        private List<T> f185973o;

        public AbstractC20941b(String str, List<String> list, String str2, String[] strArr, String str3, String str4, String str5, int i) {
            super(str);
            this.f185973o = new ArrayList();
            this.f185966h = list;
            this.f185967i = str2;
            this.f185968j = strArr;
            this.f185969k = str3;
            this.f185970l = str4;
            this.f185971m = str5;
            this.f185972n = i;
        }

        @Override // p153l.vvq0.AbstractRunnableC20940a
        /* JADX INFO: renamed from: a */
        public SQLiteDatabase mo203030a() {
            return this.f185958b.getReadableDatabase();
        }

        @Override // p153l.vvq0.AbstractRunnableC20940a
        /* JADX INFO: renamed from: e */
        public void mo203033e(Context context, SQLiteDatabase sQLiteDatabase) {
            String[] strArr;
            this.f185973o.clear();
            List<String> list = this.f185966h;
            if (list == null || list.size() <= 0) {
                strArr = null;
            } else {
                String[] strArr2 = new String[this.f185966h.size()];
                this.f185966h.toArray(strArr2);
                strArr = strArr2;
            }
            int i = this.f185972n;
            Cursor cursorQuery = sQLiteDatabase.query(this.f185957a, strArr, this.f185967i, this.f185968j, this.f185969k, this.f185970l, this.f185971m, i > 0 ? String.valueOf(i) : null);
            if (cursorQuery != null && cursorQuery.moveToFirst()) {
                do {
                    T tMo183307i = mo183307i(context, cursorQuery);
                    if (tMo183307i != null) {
                        this.f185973o.add(tMo183307i);
                    }
                } while (cursorQuery.moveToNext());
                cursorQuery.close();
            }
            mo183308j(context, this.f185973o);
        }

        /* JADX INFO: renamed from: i */
        public abstract T mo183307i(Context context, Cursor cursor);

        /* JADX INFO: renamed from: j */
        public abstract void mo183308j(Context context, List<T> list);
    }

    /* JADX INFO: renamed from: l.vvq0$c */
    public static class C20942c extends AbstractRunnableC20940a {

        /* JADX INFO: renamed from: h */
        private String f185974h;

        /* JADX INFO: renamed from: i */
        protected String[] f185975i;

        public C20942c(String str, String str2, String[] strArr) {
            super(str);
            this.f185974h = str2;
            this.f185975i = strArr;
        }

        @Override // p153l.vvq0.AbstractRunnableC20940a
        /* JADX INFO: renamed from: e */
        public void mo203033e(Context context, SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.delete(this.f185957a, this.f185974h, this.f185975i);
        }
    }

    /* JADX INFO: renamed from: l.vvq0$d */
    public static class C20943d extends AbstractRunnableC20940a {

        /* JADX INFO: renamed from: h */
        private ContentValues f185976h;

        public C20943d(String str, ContentValues contentValues) {
            super(str);
            this.f185976h = contentValues;
        }

        @Override // p153l.vvq0.AbstractRunnableC20940a
        /* JADX INFO: renamed from: e */
        public void mo203033e(Context context, SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.insert(this.f185957a, null, this.f185976h);
        }
    }

    private vvq0(Context context) {
        this.f185953a = context;
    }

    /* JADX INFO: renamed from: b */
    private uvq0 m203025b(String str) {
        uvq0 uvq0Var = this.f185954b.get(str);
        if (uvq0Var != null) {
            return uvq0Var;
        }
        synchronized (this.f185954b) {
            try {
                if (uvq0Var == null) {
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return uvq0Var;
    }

    /* JADX INFO: renamed from: c */
    public static vvq0 m203026c(Context context) {
        if (f185952e == null) {
            synchronized (vvq0.class) {
                try {
                    if (f185952e == null) {
                        f185952e = new vvq0(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f185952e;
    }

    /* JADX INFO: renamed from: a */
    public String m203027a(String str) {
        return m203025b(str).m198304k();
    }

    /* JADX INFO: renamed from: d */
    public void m203028d(Runnable runnable) {
        if (this.f185955c.isShutdown()) {
            return;
        }
        this.f185955c.execute(runnable);
    }

    /* JADX INFO: renamed from: e */
    public void m203029e(AbstractRunnableC20940a abstractRunnableC20940a) {
        if (abstractRunnableC20940a == null) {
            return;
        }
        wtq0.m207906a("should exec init method first!");
    }

    /* JADX INFO: renamed from: l.vvq0$a */
    public static abstract class AbstractRunnableC20940a implements Runnable {

        /* JADX INFO: renamed from: a */
        protected String f185957a;

        /* JADX INFO: renamed from: c */
        private String f185959c;

        /* JADX INFO: renamed from: d */
        private WeakReference<Context> f185960d;

        /* JADX INFO: renamed from: g */
        private AbstractRunnableC20940a f185963g;

        /* JADX INFO: renamed from: b */
        protected uvq0 f185958b = null;

        /* JADX INFO: renamed from: e */
        private Random f185961e = new Random();

        /* JADX INFO: renamed from: f */
        private int f185962f = 0;

        /* JADX INFO: renamed from: l.vvq0$a$a */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ Context f185964a;

            public a(Context context) {
                this.f185964a = context;
            }

            /* JADX WARN: Code duplicated, block: B:19:0x002f A[Catch: Exception -> 0x0027, DONT_GENERATE, TRY_LEAVE, TryCatch #3 {Exception -> 0x0027, blocks: (B:14:0x0023, B:17:0x0029, B:19:0x002f), top: B:50:0x0023 }] */
            /* JADX WARN: Code duplicated, block: B:30:0x004f A[Catch: Exception -> 0x0047, DONT_GENERATE, TRY_LEAVE, TryCatch #2 {Exception -> 0x0047, blocks: (B:25:0x0043, B:28:0x0049, B:30:0x004f), top: B:48:0x0043 }] */
            /* JADX WARN: Code duplicated, block: B:39:0x0062 A[Catch: Exception -> 0x005a, FINALLY_INSNS, TRY_LEAVE, TryCatch #1 {Exception -> 0x005a, blocks: (B:34:0x0056, B:37:0x005c, B:39:0x0062), top: B:46:0x0056 }] */
            @Override // java.lang.Runnable
            public void run() {
                uvq0 uvq0Var;
                SQLiteDatabase sQLiteDatabaseMo203030a = null;
                try {
                    sQLiteDatabaseMo203030a = AbstractRunnableC20940a.this.mo203030a();
                    if (sQLiteDatabaseMo203030a != null && sQLiteDatabaseMo203030a.isOpen()) {
                        sQLiteDatabaseMo203030a.beginTransaction();
                        AbstractRunnableC20940a.this.mo203033e(this.f185964a, sQLiteDatabaseMo203030a);
                        sQLiteDatabaseMo203030a.setTransactionSuccessful();
                    }
                    if (sQLiteDatabaseMo203030a != null) {
                        try {
                            sQLiteDatabaseMo203030a.endTransaction();
                            if (AbstractRunnableC20940a.this.f185958b != null) {
                            }
                        } catch (Exception e) {
                            e = e;
                            ouq0.m169397q(e);
                        }
                    } else if (AbstractRunnableC20940a.this.f185958b != null) {
                    }
                } catch (Exception e2) {
                    ouq0.m169397q(e2);
                    if (sQLiteDatabaseMo203030a != null) {
                        try {
                            sQLiteDatabaseMo203030a.endTransaction();
                            if (AbstractRunnableC20940a.this.f185958b != null) {
                            }
                        } catch (Exception e3) {
                            e = e3;
                            ouq0.m169397q(e);
                        }
                    } else if (AbstractRunnableC20940a.this.f185958b != null) {
                    }
                } finally {
                    if (sQLiteDatabaseMo203030a != null) {
                        try {
                            sQLiteDatabaseMo203030a.endTransaction();
                            uvq0Var = AbstractRunnableC20940a.this.f185958b;
                            if (uvq0Var != null) {
                                uvq0Var.close();
                            }
                        } catch (Exception e4) {
                            ouq0.m169397q(e4);
                            AbstractRunnableC20940a.this.m203032d(this.f185964a);
                        }
                    } else {
                        uvq0Var = AbstractRunnableC20940a.this.f185958b;
                        if (uvq0Var != null) {
                            uvq0Var.close();
                        }
                    }
                    AbstractRunnableC20940a.this.m203032d(this.f185964a);
                }
            }
        }

        public AbstractRunnableC20940a(String str) {
            this.f185959c = str;
        }

        /* JADX INFO: renamed from: a */
        public SQLiteDatabase mo203030a() {
            return this.f185958b.getWritableDatabase();
        }

        /* JADX INFO: renamed from: b */
        public Object mo183306b() {
            return null;
        }

        /* JADX INFO: renamed from: c */
        public String m203031c() {
            return this.f185959c;
        }

        /* JADX INFO: renamed from: d */
        public void m203032d(Context context) {
            AbstractRunnableC20940a abstractRunnableC20940a = this.f185963g;
            if (abstractRunnableC20940a != null) {
                abstractRunnableC20940a.mo178376f(context, mo183306b());
            }
            m203035h(context);
        }

        /* JADX INFO: renamed from: e */
        public abstract void mo203033e(Context context, SQLiteDatabase sQLiteDatabase);

        /* JADX INFO: renamed from: f */
        public void mo178376f(Context context, Object obj) {
            vvq0.m203026c(context).m203029e(this);
        }

        /* JADX INFO: renamed from: g */
        public void m203034g(AbstractRunnableC20940a abstractRunnableC20940a) {
            this.f185963g = abstractRunnableC20940a;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Context context;
            WeakReference<Context> weakReference = this.f185960d;
            if (weakReference == null || (context = weakReference.get()) == null || context.getFilesDir() == null || this.f185958b == null || TextUtils.isEmpty(this.f185959c)) {
                return;
            }
            File file = new File(this.f185959c);
            a6r0.m96340b(context, new File(file.getParentFile(), zuq0.m221703d(file.getAbsolutePath())), new a(context));
        }

        /* JADX INFO: renamed from: h */
        public void m203035h(Context context) {
        }
    }
}
