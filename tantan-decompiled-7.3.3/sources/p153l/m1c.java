package p153l;

import android.database.sqlite.SQLiteDatabase;
import java.io.File;
import java.util.HashMap;

/* JADX INFO: loaded from: classes11.dex */
public class m1c {

    /* JADX INFO: renamed from: a */
    public HashMap<String, f6m> f134404a;

    /* JADX INFO: renamed from: b */
    public HashMap<String, Object> f134405b;

    /* JADX INFO: renamed from: l.m1c$a */
    public class RunnableC18523a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ f6m f134406a;

        public RunnableC18523a(f6m f6mVar) {
            this.f134406a = f6mVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            File databasePath = du2.m118045e().getDatabasePath("beatles_" + this.f134406a.mo124287a());
            if (databasePath == null || !databasePath.exists()) {
                return;
            }
            SQLiteDatabase.deleteDatabase(databasePath);
        }
    }

    /* JADX INFO: renamed from: l.m1c$b */
    public static class C18524b {
        private static m1c INSTANCE = new m1c(null);
    }

    public m1c() {
        this.f134404a = new HashMap<>();
        this.f134405b = new HashMap<>();
    }

    /* JADX INFO: renamed from: b */
    public static m1c m156638b() {
        return C18524b.INSTANCE;
    }

    /* JADX INFO: renamed from: a */
    public void m156639a(f6m f6mVar) {
        xni0.m212209a().m216870a(new RunnableC18523a(f6mVar));
    }

    public /* synthetic */ m1c(RunnableC18523a runnableC18523a) {
        this();
    }
}
