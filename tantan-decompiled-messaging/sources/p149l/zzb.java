package p149l;

import android.database.sqlite.SQLiteDatabase;
import java.io.File;
import java.util.HashMap;

/* JADX INFO: loaded from: classes13.dex */
public class zzb {

    /* JADX INFO: renamed from: a */
    public HashMap<String, o3m> f205788a;

    /* JADX INFO: renamed from: b */
    public HashMap<String, Object> f205789b;

    /* JADX INFO: renamed from: l.zzb$a */
    public class RunnableC21826a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ o3m f205790a;

        public RunnableC21826a(o3m o3mVar) {
            this.f205790a = o3mVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            File databasePath = nt2.m160814e().getDatabasePath("beatles_" + this.f205790a.mo162457a());
            if (databasePath == null || !databasePath.exists()) {
                return;
            }
            SQLiteDatabase.deleteDatabase(databasePath);
        }
    }

    /* JADX INFO: renamed from: l.zzb$b */
    public static class C21827b {
        private static zzb INSTANCE = new zzb(null);
    }

    public zzb() {
        this.f205788a = new HashMap<>();
        this.f205789b = new HashMap<>();
    }

    /* JADX INFO: renamed from: b */
    public static zzb m221009b() {
        return C21827b.INSTANCE;
    }

    /* JADX INFO: renamed from: a */
    public void m221010a(o3m o3mVar) {
        xei0.m208579a().m214349a(new RunnableC21826a(o3mVar));
    }

    public /* synthetic */ zzb(RunnableC21826a runnableC21826a) {
        this();
    }
}
