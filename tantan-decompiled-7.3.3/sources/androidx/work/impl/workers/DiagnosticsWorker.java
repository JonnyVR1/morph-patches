package androidx.work.impl.workers;

import android.content.Context;
import androidx.work.AbstractC0764b;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p153l.bjq0;
import p153l.iph0;
import p153l.mjq0;
import p153l.njq0;
import p153l.qzv;
import p153l.s0e;
import p153l.vjq0;
import p153l.xiq0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m88121d2 = {"Landroidx/work/impl/workers/DiagnosticsWorker;", "Landroidx/work/Worker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "parameters", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Landroidx/work/b$a;", "doWork", "()Landroidx/work/b$a;", "work-runtime_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
public final class DiagnosticsWorker extends Worker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiagnosticsWorker(@NotNull Context context, @NotNull WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
    }

    @Override // androidx.work.Worker
    @NotNull
    public AbstractC0764b.a doWork() {
        xiq0 xiq0VarM211153p = xiq0.m211153p(getApplicationContext());
        xiq0VarM211153p.getClass();
        WorkDatabase workDatabaseM211163u = xiq0VarM211153p.m211163u();
        workDatabaseM211163u.getClass();
        njq0 njq0VarWorkSpecDao = workDatabaseM211163u.workSpecDao();
        bjq0 bjq0VarWorkNameDao = workDatabaseM211163u.workNameDao();
        vjq0 vjq0VarWorkTagDao = workDatabaseM211163u.workTagDao();
        iph0 iph0VarSystemIdInfoDao = workDatabaseM211163u.systemIdInfoDao();
        List<mjq0> listMo163454s = njq0VarWorkSpecDao.mo163454s(xiq0VarM211153p.m211158n().getClock().currentTimeMillis() - 86400000);
        List<mjq0> listMo163432D = njq0VarWorkSpecDao.mo163432D();
        List<mjq0> listMo163444i = njq0VarWorkSpecDao.mo163444i(200);
        if (!listMo163454s.isEmpty()) {
            qzv.m178829e().mo178836f(s0e.f165677a, "Recently completed work:\n\n");
            qzv.m178829e().mo178836f(s0e.f165677a, s0e.m183921d(bjq0VarWorkNameDao, vjq0VarWorkTagDao, iph0VarSystemIdInfoDao, listMo163454s));
        }
        if (!listMo163432D.isEmpty()) {
            qzv.m178829e().mo178836f(s0e.f165677a, "Running work:\n\n");
            qzv.m178829e().mo178836f(s0e.f165677a, s0e.m183921d(bjq0VarWorkNameDao, vjq0VarWorkTagDao, iph0VarSystemIdInfoDao, listMo163432D));
        }
        if (!listMo163444i.isEmpty()) {
            qzv.m178829e().mo178836f(s0e.f165677a, "Enqueued work:\n\n");
            qzv.m178829e().mo178836f(s0e.f165677a, s0e.m183921d(bjq0VarWorkNameDao, vjq0VarWorkTagDao, iph0VarSystemIdInfoDao, listMo163444i));
        }
        AbstractC0764b.a aVarM4417c = AbstractC0764b.a.m4417c();
        aVarM4417c.getClass();
        return aVarM4417c;
    }
}
