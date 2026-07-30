package p149l;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.work.Data;
import androidx.work.ListenableFutureKt;
import androidx.work.WorkInfo;
import androidx.work.impl.WorkDatabase;
import java.util.UUID;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class caq0 implements owa0 {

    /* JADX INFO: renamed from: c */
    public static final String f80047c = txv.m190978i("WorkProgressUpdater");

    /* JADX INFO: renamed from: a */
    public final WorkDatabase f80048a;

    /* JADX INFO: renamed from: b */
    public final zei0 f80049b;

    public caq0(@NonNull WorkDatabase workDatabase, @NonNull zei0 zei0Var) {
        this.f80048a = workDatabase;
        this.f80049b = zei0Var;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ Void m105930b(caq0 caq0Var, UUID uuid, Data data) {
        caq0Var.getClass();
        String string = uuid.toString();
        txv txvVarM190976e = txv.m190976e();
        String str = f80047c;
        txvVarM190976e.mo190979a(str, "Updating progress for " + uuid + " (" + data + ")");
        caq0Var.f80048a.beginTransaction();
        try {
            haq0 haq0VarMo135190v = caq0Var.f80048a.workSpecDao().mo135190v(string);
            if (haq0VarMo135190v == null) {
                throw new IllegalStateException("Calls to setProgressAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
            }
            if (haq0VarMo135190v.state == WorkInfo.State.RUNNING) {
                caq0Var.f80048a.workProgressDao().mo95567a(new y9q0(string, data));
            } else {
                txv.m190976e().mo190986k(str, "Ignoring setProgressAsync(...). WorkSpec (" + string + ") is not in a RUNNING state.");
            }
            caq0Var.f80048a.setTransactionSuccessful();
            caq0Var.f80048a.endTransaction();
            return null;
        } catch (Throwable th) {
            try {
                txv.m190976e().mo190982d(f80047c, "Error updating Worker progress", th);
                throw th;
            } catch (Throwable th2) {
                caq0Var.f80048a.endTransaction();
                throw th2;
            }
        }
    }

    @Override // p149l.owa0
    @NonNull
    /* JADX INFO: renamed from: a */
    public gnr<Void> mo105931a(@NonNull Context context, @NonNull final UUID uuid, @NonNull final Data data) {
        return ListenableFutureKt.m4339f(this.f80049b.mo187638d(), "updateProgress", new Function0() { // from class: l.baq0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return caq0.m105930b(this.f74712a, uuid, data);
            }
        });
    }
}
