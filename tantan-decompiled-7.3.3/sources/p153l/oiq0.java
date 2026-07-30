package p153l;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.work.ListenableFutureKt;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.C0794a;
import java.util.UUID;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class oiq0 implements k1j {

    /* JADX INFO: renamed from: d */
    public static final String f147569d = qzv.m178831i("WMFgUpdater");

    /* JADX INFO: renamed from: a */
    public final zni0 f147570a;

    /* JADX INFO: renamed from: b */
    public final j1j f147571b;

    /* JADX INFO: renamed from: c */
    public final njq0 f147572c;

    @SuppressLint({"LambdaLast"})
    public oiq0(@NonNull WorkDatabase workDatabase, @NonNull j1j j1jVar, @NonNull zni0 zni0Var) {
        this.f147571b = j1jVar;
        this.f147570a = zni0Var;
        this.f147572c = workDatabase.workSpecDao();
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ Void m167797b(oiq0 oiq0Var, UUID uuid, i1j i1jVar, Context context) {
        oiq0Var.getClass();
        String string = uuid.toString();
        mjq0 mjq0VarMo163457v = oiq0Var.f147572c.mo163457v(string);
        if (mjq0VarMo163457v == null || mjq0VarMo163457v.state.isFinished()) {
            wtq0.m207906a("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
            return null;
        }
        oiq0Var.f147571b.mo4513a(string, i1jVar);
        context.startService(C0794a.m4599d(context, tjq0.m191450a(mjq0VarMo163457v), i1jVar));
        return null;
    }

    @Override // p153l.k1j
    @NonNull
    /* JADX INFO: renamed from: a */
    public hpr<Void> mo147863a(@NonNull final Context context, @NonNull final UUID uuid, @NonNull final i1j i1jVar) {
        return ListenableFutureKt.m4341f(this.f147570a.mo216346d(), "setForegroundAsync", new Function0() { // from class: l.niq0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return oiq0.m167797b(this.f142147a, uuid, i1jVar, context);
            }
        });
    }
}
