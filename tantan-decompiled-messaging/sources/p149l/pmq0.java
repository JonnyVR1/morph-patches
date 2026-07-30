package p149l;

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
public class pmq0 {

    /* JADX INFO: renamed from: e */
    private static volatile pmq0 f150259e;

    /* JADX INFO: renamed from: a */
    private Context f150260a;

    /* JADX INFO: renamed from: b */
    private final HashMap<String, omq0> f150261b = new HashMap<>();

    /* JADX INFO: renamed from: c */
    private ThreadPoolExecutor f150262c = new ThreadPoolExecutor(1, 1, 15, TimeUnit.SECONDS, new LinkedBlockingQueue());

    /* JADX INFO: renamed from: d */
    private final ArrayList<AbstractRunnableC19283a> f150263d = new ArrayList<>();

    /* JADX INFO: renamed from: l.pmq0$b */
    public static abstract class AbstractC19284b<T> extends AbstractRunnableC19283a {

        /* JADX INFO: renamed from: h */
        private List<String> f150273h;

        /* JADX INFO: renamed from: i */
        private String f150274i;

        /* JADX INFO: renamed from: j */
        private String[] f150275j;

        /* JADX INFO: renamed from: k */
        private String f150276k;

        /* JADX INFO: renamed from: l */
        private String f150277l;

        /* JADX INFO: renamed from: m */
        private String f150278m;

        /* JADX INFO: renamed from: n */
        private int f150279n;

        /* JADX INFO: renamed from: o */
        private List<T> f150280o;

        public AbstractC19284b(String str, List<String> list, String str2, String[] strArr, String str3, String str4, String str5, int i) {
            super(str);
            this.f150280o = new ArrayList();
            this.f150273h = list;
            this.f150274i = str2;
            this.f150275j = strArr;
            this.f150276k = str3;
            this.f150277l = str4;
            this.f150278m = str5;
            this.f150279n = i;
        }

        @Override // p149l.pmq0.AbstractRunnableC19283a
        /* JADX INFO: renamed from: a */
        public SQLiteDatabase mo170368a() {
            return this.f150265b.getReadableDatabase();
        }

        @Override // p149l.pmq0.AbstractRunnableC19283a
        /* JADX INFO: renamed from: e */
        public void mo170371e(Context context, SQLiteDatabase sQLiteDatabase) {
            String[] strArr;
            this.f150280o.clear();
            List<String> list = this.f150273h;
            if (list == null || list.size() <= 0) {
                strArr = null;
            } else {
                String[] strArr2 = new String[this.f150273h.size()];
                this.f150273h.toArray(strArr2);
                strArr = strArr2;
            }
            int i = this.f150279n;
            Cursor cursorQuery = sQLiteDatabase.query(this.f150264a, strArr, this.f150274i, this.f150275j, this.f150276k, this.f150277l, this.f150278m, i > 0 ? String.valueOf(i) : null);
            if (cursorQuery != null && cursorQuery.moveToFirst()) {
                do {
                    T tMo150598i = mo150598i(context, cursorQuery);
                    if (tMo150598i != null) {
                        this.f150280o.add(tMo150598i);
                    }
                } while (cursorQuery.moveToNext());
                cursorQuery.close();
            }
            mo150599j(context, this.f150280o);
        }

        /* JADX INFO: renamed from: i */
        public abstract T mo150598i(Context context, Cursor cursor);

        /* JADX INFO: renamed from: j */
        public abstract void mo150599j(Context context, List<T> list);
    }

    /* JADX INFO: renamed from: l.pmq0$c */
    public static class C19285c extends AbstractRunnableC19283a {

        /* JADX INFO: renamed from: h */
        private String f150281h;

        /* JADX INFO: renamed from: i */
        protected String[] f150282i;

        public C19285c(String str, String str2, String[] strArr) {
            super(str);
            this.f150281h = str2;
            this.f150282i = strArr;
        }

        @Override // p149l.pmq0.AbstractRunnableC19283a
        /* JADX INFO: renamed from: e */
        public void mo170371e(Context context, SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.delete(this.f150264a, this.f150281h, this.f150282i);
        }
    }

    /* JADX INFO: renamed from: l.pmq0$d */
    public static class C19286d extends AbstractRunnableC19283a {

        /* JADX INFO: renamed from: h */
        private ContentValues f150283h;

        public C19286d(String str, ContentValues contentValues) {
            super(str);
            this.f150283h = contentValues;
        }

        @Override // p149l.pmq0.AbstractRunnableC19283a
        /* JADX INFO: renamed from: e */
        public void mo170371e(Context context, SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.insert(this.f150264a, null, this.f150283h);
        }
    }

    private pmq0(Context context) {
        this.f150260a = context;
    }

    /* JADX INFO: renamed from: b */
    private omq0 m170363b(String str) {
        omq0 omq0Var = this.f150261b.get(str);
        if (omq0Var != null) {
            return omq0Var;
        }
        synchronized (this.f150261b) {
            try {
                if (omq0Var == null) {
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return omq0Var;
    }

    /* JADX INFO: renamed from: c */
    public static pmq0 m170364c(Context context) {
        if (f150259e == null) {
            synchronized (pmq0.class) {
                try {
                    if (f150259e == null) {
                        f150259e = new pmq0(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f150259e;
    }

    /* JADX INFO: renamed from: a */
    public String m170365a(String str) {
        return m170363b(str).m165147k();
    }

    /* JADX INFO: renamed from: d */
    public void m170366d(Runnable runnable) {
        if (this.f150262c.isShutdown()) {
            return;
        }
        this.f150262c.execute(runnable);
    }

    /* JADX INFO: renamed from: e */
    public void m170367e(AbstractRunnableC19283a abstractRunnableC19283a) {
        if (abstractRunnableC19283a == null) {
            return;
        }
        qkq0.m175383a("should exec init method first!");
    }

    /* JADX INFO: renamed from: l.pmq0$a */
    public static abstract class AbstractRunnableC19283a implements Runnable {

        /* JADX INFO: renamed from: a */
        protected String f150264a;

        /* JADX INFO: renamed from: c */
        private String f150266c;

        /* JADX INFO: renamed from: d */
        private WeakReference<Context> f150267d;

        /* JADX INFO: renamed from: g */
        private AbstractRunnableC19283a f150270g;

        /* JADX INFO: renamed from: b */
        protected omq0 f150265b = null;

        /* JADX INFO: renamed from: e */
        private Random f150268e = new Random();

        /* JADX INFO: renamed from: f */
        private int f150269f = 0;

        /* JADX INFO: renamed from: l.pmq0$a$a */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ Context f150271a;

            public a(Context context) {
                this.f150271a = context;
            }

            /* JADX WARN: Code duplicated, block: B:19:0x002f A[Catch: Exception -> 0x0027, DONT_GENERATE, TRY_LEAVE, TryCatch #3 {Exception -> 0x0027, blocks: (B:14:0x0023, B:17:0x0029, B:19:0x002f), top: B:50:0x0023 }] */
            /* JADX WARN: Code duplicated, block: B:30:0x004f A[Catch: Exception -> 0x0047, DONT_GENERATE, TRY_LEAVE, TryCatch #2 {Exception -> 0x0047, blocks: (B:25:0x0043, B:28:0x0049, B:30:0x004f), top: B:48:0x0043 }] */
            /* JADX WARN: Code duplicated, block: B:39:0x0062 A[Catch: Exception -> 0x005a, FINALLY_INSNS, TRY_LEAVE, TryCatch #1 {Exception -> 0x005a, blocks: (B:34:0x0056, B:37:0x005c, B:39:0x0062), top: B:46:0x0056 }] */
            @Override // java.lang.Runnable
            public void run() {
                omq0 omq0Var;
                SQLiteDatabase sQLiteDatabaseMo170368a = null;
                try {
                    sQLiteDatabaseMo170368a = AbstractRunnableC19283a.this.mo170368a();
                    if (sQLiteDatabaseMo170368a != null && sQLiteDatabaseMo170368a.isOpen()) {
                        sQLiteDatabaseMo170368a.beginTransaction();
                        AbstractRunnableC19283a.this.mo170371e(this.f150271a, sQLiteDatabaseMo170368a);
                        sQLiteDatabaseMo170368a.setTransactionSuccessful();
                    }
                    if (sQLiteDatabaseMo170368a != null) {
                        try {
                            sQLiteDatabaseMo170368a.endTransaction();
                            if (AbstractRunnableC19283a.this.f150265b != null) {
                            }
                        } catch (Exception e) {
                            e = e;
                            ilq0.m137044q(e);
                        }
                    } else if (AbstractRunnableC19283a.this.f150265b != null) {
                    }
                } catch (Exception e2) {
                    ilq0.m137044q(e2);
                    if (sQLiteDatabaseMo170368a != null) {
                        try {
                            sQLiteDatabaseMo170368a.endTransaction();
                            if (AbstractRunnableC19283a.this.f150265b != null) {
                            }
                        } catch (Exception e3) {
                            e = e3;
                            ilq0.m137044q(e);
                        }
                    } else if (AbstractRunnableC19283a.this.f150265b != null) {
                    }
                } finally {
                    if (sQLiteDatabaseMo170368a != null) {
                        try {
                            sQLiteDatabaseMo170368a.endTransaction();
                            omq0Var = AbstractRunnableC19283a.this.f150265b;
                            if (omq0Var != null) {
                                omq0Var.close();
                            }
                        } catch (Exception e4) {
                            ilq0.m137044q(e4);
                            AbstractRunnableC19283a.this.m170370d(this.f150271a);
                        }
                    } else {
                        omq0Var = AbstractRunnableC19283a.this.f150265b;
                        if (omq0Var != null) {
                            omq0Var.close();
                        }
                    }
                    AbstractRunnableC19283a.this.m170370d(this.f150271a);
                }
            }
        }

        public AbstractRunnableC19283a(String str) {
            this.f150266c = str;
        }

        /* JADX INFO: renamed from: a */
        public SQLiteDatabase mo170368a() {
            return this.f150265b.getWritableDatabase();
        }

        /* JADX INFO: renamed from: b */
        public Object mo150597b() {
            return null;
        }

        /* JADX INFO: renamed from: c */
        public String m170369c() {
            return this.f150266c;
        }

        /* JADX INFO: renamed from: d */
        public void m170370d(Context context) {
            AbstractRunnableC19283a abstractRunnableC19283a = this.f150270g;
            if (abstractRunnableC19283a != null) {
                abstractRunnableC19283a.mo146553f(context, mo150597b());
            }
            m170373h(context);
        }

        /* JADX INFO: renamed from: e */
        public abstract void mo170371e(Context context, SQLiteDatabase sQLiteDatabase);

        /* JADX INFO: renamed from: f */
        public void mo146553f(Context context, Object obj) {
            pmq0.m170364c(context).m170367e(this);
        }

        /* JADX INFO: renamed from: g */
        public void m170372g(AbstractRunnableC19283a abstractRunnableC19283a) {
            this.f150270g = abstractRunnableC19283a;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Context context;
            WeakReference<Context> weakReference = this.f150267d;
            if (weakReference == null || (context = weakReference.get()) == null || context.getFilesDir() == null || this.f150265b == null || TextUtils.isEmpty(this.f150266c)) {
                return;
            }
            File file = new File(this.f150266c);
            uwq0.m196134b(context, new File(file.getParentFile(), tlq0.m189625d(file.getAbsolutePath())), new a(context));
        }

        /* JADX INFO: renamed from: h */
        public void m170373h(Context context) {
        }
    }
}
