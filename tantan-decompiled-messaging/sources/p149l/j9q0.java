package p149l;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.work.ListenableFutureKt;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.C0792a;
import java.util.UUID;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class j9q0 implements pyi {

    /* JADX INFO: renamed from: d */
    public static final String f116950d = txv.m190978i("WMFgUpdater");

    /* JADX INFO: renamed from: a */
    public final zei0 f116951a;

    /* JADX INFO: renamed from: b */
    public final oyi f116952b;

    /* JADX INFO: renamed from: c */
    public final iaq0 f116953c;

    @SuppressLint({"LambdaLast"})
    public j9q0(@NonNull WorkDatabase workDatabase, @NonNull oyi oyiVar, @NonNull zei0 zei0Var) {
        this.f116952b = oyiVar;
        this.f116951a = zei0Var;
        this.f116953c = workDatabase.workSpecDao();
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ Void m140584b(j9q0 j9q0Var, UUID uuid, nyi nyiVar, Context context) {
        j9q0Var.getClass();
        String string = uuid.toString();
        haq0 haq0VarMo135190v = j9q0Var.f116953c.mo135190v(string);
        if (haq0VarMo135190v == null || haq0VarMo135190v.state.isFinished()) {
            qkq0.m175383a("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
            return null;
        }
        j9q0Var.f116952b.mo4511a(string, nyiVar);
        context.startService(C0792a.m4597d(context, oaq0.m163363a(haq0VarMo135190v), nyiVar));
        return null;
    }

    @Override // p149l.pyi
    @NonNull
    /* JADX INFO: renamed from: a */
    public gnr<Void> mo140585a(@NonNull final Context context, @NonNull final UUID uuid, @NonNull final nyi nyiVar) {
        return ListenableFutureKt.m4339f(this.f116951a.mo187638d(), "setForegroundAsync", new Function0() { // from class: l.i9q0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return j9q0.m140584b(this.f112246a, uuid, nyiVar, context);
            }
        });
    }
}
