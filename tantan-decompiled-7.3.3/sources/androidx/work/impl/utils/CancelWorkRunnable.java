package androidx.work.impl.utils;

import androidx.work.InterfaceC0766d;
import androidx.work.OperationKt;
import androidx.work.WorkInfo;
import androidx.work.impl.C0775a;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.utils.CancelWorkRunnable;
import com.clevertap.android.sdk.Constants;
import com.facebook.AuthenticationTokenClaims;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import p153l.h2e0;
import p153l.mvd;
import p153l.n2e0;
import p153l.njq0;
import p153l.tej0;
import p153l.tqe0;
import p153l.xiq0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0007\u0010\b\u001a\u001f\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001d\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u001d\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0016\u0010\u0014\u001a\u001d\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, m88121d2 = {"Ll/xiq0;", "workManagerImpl", "", "workSpecId", "", Constants.INAPP_DATA_TAG, "(Ll/xiq0;Ljava/lang/String;)V", "j", "(Ll/xiq0;)V", "Landroidx/work/impl/WorkDatabase;", "workDatabase", RXScreenCaptureService.KEY_INDEX, "(Landroidx/work/impl/WorkDatabase;Ljava/lang/String;)V", "Ljava/util/UUID;", "id", "Landroidx/work/d;", "e", "(Ljava/util/UUID;Ll/xiq0;)Landroidx/work/d;", "tag", "h", "(Ljava/lang/String;Ll/xiq0;)Landroidx/work/d;", AuthenticationTokenClaims.JSON_KEY_NAME, "f", "g", "(Ljava/lang/String;Ll/xiq0;)V", "work-runtime_release"}, m88122k = 2, m88123mv = {1, 8, 0}, m88125xi = 48)
@JvmName
public final class CancelWorkRunnable {
    /* JADX INFO: renamed from: a */
    public static void m4610a(WorkDatabase workDatabase, String str, xiq0 xiq0Var) {
        Iterator<String> it = workDatabase.workSpecDao().mo163438c(str).iterator();
        while (it.hasNext()) {
            m4613d(xiq0Var, it.next());
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m4613d(xiq0 xiq0Var, String str) {
        WorkDatabase workDatabaseM211163u = xiq0Var.m211163u();
        workDatabaseM211163u.getClass();
        m4618i(workDatabaseM211163u, str);
        C0775a c0775aM211160r = xiq0Var.m211160r();
        c0775aM211160r.getClass();
        c0775aM211160r.m4525q(str, 1);
        Iterator<h2e0> it = xiq0Var.m211161s().iterator();
        while (it.hasNext()) {
            it.next().mo133387c(str);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public static final InterfaceC0766d m4614e(@NotNull UUID uuid, @NotNull xiq0 xiq0Var) {
        uuid.getClass();
        xiq0Var.getClass();
        tej0 tracer = xiq0Var.m211158n().getTracer();
        tqe0 tqe0VarMo216346d = xiq0Var.m211165w().mo216346d();
        tqe0VarMo216346d.getClass();
        return OperationKt.m4347d(tracer, "CancelWorkById", tqe0VarMo216346d, new CancelWorkRunnable$forId$1(xiq0Var, uuid));
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public static final InterfaceC0766d m4615f(@NotNull final String str, @NotNull final xiq0 xiq0Var) {
        str.getClass();
        xiq0Var.getClass();
        tej0 tracer = xiq0Var.m211158n().getTracer();
        String str2 = "CancelWorkByName_" + str;
        tqe0 tqe0VarMo216346d = xiq0Var.m211165w().mo216346d();
        tqe0VarMo216346d.getClass();
        return OperationKt.m4347d(tracer, str2, tqe0VarMo216346d, new Function0<Unit>() { // from class: androidx.work.impl.utils.CancelWorkRunnable$forName$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                CancelWorkRunnable.m4616g(str, xiq0Var);
                CancelWorkRunnable.m4619j(xiq0Var);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }
        });
    }

    /* JADX INFO: renamed from: g */
    public static final void m4616g(@NotNull final String str, @NotNull final xiq0 xiq0Var) {
        str.getClass();
        xiq0Var.getClass();
        final WorkDatabase workDatabaseM211163u = xiq0Var.m211163u();
        workDatabaseM211163u.getClass();
        workDatabaseM211163u.runInTransaction(new Runnable() { // from class: l.yf4
            @Override // java.lang.Runnable
            public final void run() {
                CancelWorkRunnable.m4610a(workDatabaseM211163u, str, xiq0Var);
            }
        });
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public static final InterfaceC0766d m4617h(@NotNull String str, @NotNull xiq0 xiq0Var) {
        str.getClass();
        xiq0Var.getClass();
        tej0 tracer = xiq0Var.m211158n().getTracer();
        String str2 = "CancelWorkByTag_" + str;
        tqe0 tqe0VarMo216346d = xiq0Var.m211165w().mo216346d();
        tqe0VarMo216346d.getClass();
        return OperationKt.m4347d(tracer, str2, tqe0VarMo216346d, new CancelWorkRunnable$forTag$1(xiq0Var, str));
    }

    /* JADX INFO: renamed from: i */
    public static final void m4618i(WorkDatabase workDatabase, String str) {
        njq0 njq0VarWorkSpecDao = workDatabase.workSpecDao();
        mvd mvdVarDependencyDao = workDatabase.dependencyDao();
        List listMutableListOf = CollectionsKt.mutableListOf(str);
        while (!listMutableListOf.isEmpty()) {
            String str2 = (String) CollectionsKt.removeLast(listMutableListOf);
            WorkInfo.State stateMo163439d = njq0VarWorkSpecDao.mo163439d(str2);
            if (stateMo163439d != WorkInfo.State.SUCCEEDED && stateMo163439d != WorkInfo.State.FAILED) {
                njq0VarWorkSpecDao.mo163440e(str2);
            }
            listMutableListOf.addAll(mvdVarDependencyDao.mo160261a(str2));
        }
    }

    /* JADX INFO: renamed from: j */
    public static final void m4619j(xiq0 xiq0Var) {
        n2e0.m161226f(xiq0Var.m211158n(), xiq0Var.m211163u(), xiq0Var.m211161s());
    }
}
