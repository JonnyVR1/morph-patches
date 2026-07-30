package androidx.work.impl.utils;

import androidx.work.InterfaceC0764d;
import androidx.work.OperationKt;
import androidx.work.WorkInfo;
import androidx.work.impl.C0773a;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.utils.CancelWorkRunnable;
import com.clevertap.android.sdk.Constants;
import com.facebook.AuthenticationTokenClaims;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import p149l.dud0;
import p149l.iaq0;
import p149l.jud0;
import p149l.oie0;
import p149l.p5j0;
import p149l.s9q0;
import p149l.ytd;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0007\u0010\b\u001a\u001f\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001d\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u001d\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0016\u0010\u0014\u001a\u001d\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, m87232d2 = {"Ll/s9q0;", "workManagerImpl", "", "workSpecId", "", Constants.INAPP_DATA_TAG, "(Ll/s9q0;Ljava/lang/String;)V", "j", "(Ll/s9q0;)V", "Landroidx/work/impl/WorkDatabase;", "workDatabase", RXScreenCaptureService.KEY_INDEX, "(Landroidx/work/impl/WorkDatabase;Ljava/lang/String;)V", "Ljava/util/UUID;", "id", "Landroidx/work/d;", "e", "(Ljava/util/UUID;Ll/s9q0;)Landroidx/work/d;", "tag", "h", "(Ljava/lang/String;Ll/s9q0;)Landroidx/work/d;", AuthenticationTokenClaims.JSON_KEY_NAME, "f", "g", "(Ljava/lang/String;Ll/s9q0;)V", "work-runtime_release"}, m87233k = 2, m87234mv = {1, 8, 0}, m87236xi = 48)
@JvmName
public final class CancelWorkRunnable {
    /* JADX INFO: renamed from: a */
    public static void m4608a(WorkDatabase workDatabase, String str, s9q0 s9q0Var) {
        Iterator<String> it = workDatabase.workSpecDao().mo135171c(str).iterator();
        while (it.hasNext()) {
            m4611d(s9q0Var, it.next());
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m4611d(s9q0 s9q0Var, String str) {
        WorkDatabase workDatabaseM182750u = s9q0Var.m182750u();
        workDatabaseM182750u.getClass();
        m4616i(workDatabaseM182750u, str);
        C0773a c0773aM182747r = s9q0Var.m182747r();
        c0773aM182747r.getClass();
        c0773aM182747r.m4523q(str, 1);
        Iterator<dud0> it = s9q0Var.m182748s().iterator();
        while (it.hasNext()) {
            it.next().mo113683c(str);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public static final InterfaceC0764d m4612e(@NotNull UUID uuid, @NotNull s9q0 s9q0Var) {
        uuid.getClass();
        s9q0Var.getClass();
        p5j0 tracer = s9q0Var.m182745n().getTracer();
        oie0 oie0VarMo187638d = s9q0Var.m182752w().mo187638d();
        oie0VarMo187638d.getClass();
        return OperationKt.m4345d(tracer, "CancelWorkById", oie0VarMo187638d, new CancelWorkRunnable$forId$1(s9q0Var, uuid));
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public static final InterfaceC0764d m4613f(@NotNull final String str, @NotNull final s9q0 s9q0Var) {
        str.getClass();
        s9q0Var.getClass();
        p5j0 tracer = s9q0Var.m182745n().getTracer();
        String str2 = "CancelWorkByName_" + str;
        oie0 oie0VarMo187638d = s9q0Var.m182752w().mo187638d();
        oie0VarMo187638d.getClass();
        return OperationKt.m4345d(tracer, str2, oie0VarMo187638d, new Function0<Unit>() { // from class: androidx.work.impl.utils.CancelWorkRunnable$forName$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                CancelWorkRunnable.m4614g(str, s9q0Var);
                CancelWorkRunnable.m4617j(s9q0Var);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }
        });
    }

    /* JADX INFO: renamed from: g */
    public static final void m4614g(@NotNull final String str, @NotNull final s9q0 s9q0Var) {
        str.getClass();
        s9q0Var.getClass();
        final WorkDatabase workDatabaseM182750u = s9q0Var.m182750u();
        workDatabaseM182750u.getClass();
        workDatabaseM182750u.runInTransaction(new Runnable() { // from class: l.ze4
            @Override // java.lang.Runnable
            public final void run() {
                CancelWorkRunnable.m4608a(workDatabaseM182750u, str, s9q0Var);
            }
        });
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public static final InterfaceC0764d m4615h(@NotNull String str, @NotNull s9q0 s9q0Var) {
        str.getClass();
        s9q0Var.getClass();
        p5j0 tracer = s9q0Var.m182745n().getTracer();
        String str2 = "CancelWorkByTag_" + str;
        oie0 oie0VarMo187638d = s9q0Var.m182752w().mo187638d();
        oie0VarMo187638d.getClass();
        return OperationKt.m4345d(tracer, str2, oie0VarMo187638d, new CancelWorkRunnable$forTag$1(s9q0Var, str));
    }

    /* JADX INFO: renamed from: i */
    public static final void m4616i(WorkDatabase workDatabase, String str) {
        iaq0 iaq0VarWorkSpecDao = workDatabase.workSpecDao();
        ytd ytdVarDependencyDao = workDatabase.dependencyDao();
        List listMutableListOf = CollectionsKt.mutableListOf(str);
        while (!listMutableListOf.isEmpty()) {
            String str2 = (String) CollectionsKt.removeLast(listMutableListOf);
            WorkInfo.State stateMo135172d = iaq0VarWorkSpecDao.mo135172d(str2);
            if (stateMo135172d != WorkInfo.State.SUCCEEDED && stateMo135172d != WorkInfo.State.FAILED) {
                iaq0VarWorkSpecDao.mo135173e(str2);
            }
            listMutableListOf.addAll(ytdVarDependencyDao.mo216001a(str2));
        }
    }

    /* JADX INFO: renamed from: j */
    public static final void m4617j(s9q0 s9q0Var) {
        jud0.m143288f(s9q0Var.m182745n(), s9q0Var.m182750u(), s9q0Var.m182748s());
    }
}
