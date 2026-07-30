package p153l;

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
public class hjq0 implements s4b0 {

    /* JADX INFO: renamed from: c */
    public static final String f110294c = qzv.m178831i("WorkProgressUpdater");

    /* JADX INFO: renamed from: a */
    public final WorkDatabase f110295a;

    /* JADX INFO: renamed from: b */
    public final zni0 f110296b;

    public hjq0(@NonNull WorkDatabase workDatabase, @NonNull zni0 zni0Var) {
        this.f110295a = workDatabase;
        this.f110296b = zni0Var;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ Void m135501b(hjq0 hjq0Var, UUID uuid, Data data) {
        hjq0Var.getClass();
        String string = uuid.toString();
        qzv qzvVarM178829e = qzv.m178829e();
        String str = f110294c;
        qzvVarM178829e.mo178832a(str, "Updating progress for " + uuid + " (" + data + ")");
        hjq0Var.f110295a.beginTransaction();
        try {
            mjq0 mjq0VarMo163457v = hjq0Var.f110295a.workSpecDao().mo163457v(string);
            if (mjq0VarMo163457v == null) {
                throw new IllegalStateException("Calls to setProgressAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
            }
            if (mjq0VarMo163457v.state == WorkInfo.State.RUNNING) {
                hjq0Var.f110295a.workProgressDao().mo120985a(new djq0(string, data));
            } else {
                qzv.m178829e().mo178839k(str, "Ignoring setProgressAsync(...). WorkSpec (" + string + ") is not in a RUNNING state.");
            }
            hjq0Var.f110295a.setTransactionSuccessful();
            hjq0Var.f110295a.endTransaction();
            return null;
        } catch (Throwable th) {
            try {
                qzv.m178829e().mo178835d(f110294c, "Error updating Worker progress", th);
                throw th;
            } catch (Throwable th2) {
                hjq0Var.f110295a.endTransaction();
                throw th2;
            }
        }
    }

    @Override // p153l.s4b0
    @NonNull
    /* JADX INFO: renamed from: a */
    public hpr<Void> mo135502a(@NonNull Context context, @NonNull final UUID uuid, @NonNull final Data data) {
        return ListenableFutureKt.m4341f(this.f110296b.mo216346d(), "updateProgress", new Function0() { // from class: l.gjq0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return hjq0.m135501b(this.f104643a, uuid, data);
            }
        });
    }
}
