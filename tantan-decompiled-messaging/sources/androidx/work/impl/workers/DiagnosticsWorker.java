package androidx.work.impl.workers;

import android.content.Context;
import androidx.work.AbstractC0762b;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p149l.bhh0;
import p149l.ezd;
import p149l.haq0;
import p149l.iaq0;
import p149l.qaq0;
import p149l.s9q0;
import p149l.txv;
import p149l.w9q0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m87232d2 = {"Landroidx/work/impl/workers/DiagnosticsWorker;", "Landroidx/work/Worker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "parameters", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Landroidx/work/b$a;", "doWork", "()Landroidx/work/b$a;", "work-runtime_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
public final class DiagnosticsWorker extends Worker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiagnosticsWorker(@NotNull Context context, @NotNull WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
    }

    @Override // androidx.work.Worker
    @NotNull
    public AbstractC0762b.a doWork() {
        s9q0 s9q0VarM182740p = s9q0.m182740p(getApplicationContext());
        s9q0VarM182740p.getClass();
        WorkDatabase workDatabaseM182750u = s9q0VarM182740p.m182750u();
        workDatabaseM182750u.getClass();
        iaq0 iaq0VarWorkSpecDao = workDatabaseM182750u.workSpecDao();
        w9q0 w9q0VarWorkNameDao = workDatabaseM182750u.workNameDao();
        qaq0 qaq0VarWorkTagDao = workDatabaseM182750u.workTagDao();
        bhh0 bhh0VarSystemIdInfoDao = workDatabaseM182750u.systemIdInfoDao();
        List<haq0> listMo135187s = iaq0VarWorkSpecDao.mo135187s(s9q0VarM182740p.m182745n().getClock().currentTimeMillis() - 86400000);
        List<haq0> listMo135165D = iaq0VarWorkSpecDao.mo135165D();
        List<haq0> listMo135177i = iaq0VarWorkSpecDao.mo135177i(200);
        if (!listMo135187s.isEmpty()) {
            txv.m190976e().mo190983f(ezd.f93893a, "Recently completed work:\n\n");
            txv.m190976e().mo190983f(ezd.f93893a, ezd.m118926d(w9q0VarWorkNameDao, qaq0VarWorkTagDao, bhh0VarSystemIdInfoDao, listMo135187s));
        }
        if (!listMo135165D.isEmpty()) {
            txv.m190976e().mo190983f(ezd.f93893a, "Running work:\n\n");
            txv.m190976e().mo190983f(ezd.f93893a, ezd.m118926d(w9q0VarWorkNameDao, qaq0VarWorkTagDao, bhh0VarSystemIdInfoDao, listMo135165D));
        }
        if (!listMo135177i.isEmpty()) {
            txv.m190976e().mo190983f(ezd.f93893a, "Enqueued work:\n\n");
            txv.m190976e().mo190983f(ezd.f93893a, ezd.m118926d(w9q0VarWorkNameDao, qaq0VarWorkTagDao, bhh0VarSystemIdInfoDao, listMo135177i));
        }
        AbstractC0762b.a aVarM4415c = AbstractC0762b.a.m4415c();
        aVarM4415c.getClass();
        return aVarM4415c;
    }
}
