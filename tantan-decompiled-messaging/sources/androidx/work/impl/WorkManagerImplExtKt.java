package androidx.work.impl;

import android.content.Context;
import androidx.work.C0761a;
import com.clevertap.android.sdk.Constants;
import com.facebook.AuthenticationTokenClaims;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function6;
import kotlinx.coroutines.C15424f;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;
import p149l.b7j0;
import p149l.dud0;
import p149l.jud0;
import p149l.o0c0;
import p149l.oie0;
import p149l.p9q0;
import p149l.ppb;
import p149l.s9q0;
import p149l.t9q0;
import p149l.v6k;
import p149l.zei0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aá\u0001\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0097\u0001\b\u0002\u0010\u0012\u001a\u0090\u0001\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0001\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0003\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0005\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\b¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\n¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\fj\u0002`\u0011H\u0007¢\u0006\u0004\b\u0014\u0010\u0015\u001aE\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u001a\u0010\u001b* \u0002\u0010\u001c\"\u008c\u0001\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0001\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0003\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0005\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\b¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\n¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\f2\u008c\u0001\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0001\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0003\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0005\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\b¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\n¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\f¨\u0006\u001d"}, m87232d2 = {"Landroid/content/Context;", "context", "Landroidx/work/a;", "configuration", "Ll/zei0;", "workTaskExecutor", "Landroidx/work/impl/WorkDatabase;", "workDatabase", "Ll/b7j0;", "trackers", "Landroidx/work/impl/a;", "processor", "Lkotlin/Function6;", "Lkotlin/ParameterName;", AuthenticationTokenClaims.JSON_KEY_NAME, "", "Ll/dud0;", "Landroidx/work/impl/SchedulersCreator;", "schedulersCreator", "Ll/s9q0;", Constants.INAPP_DATA_TAG, "(Landroid/content/Context;Landroidx/work/a;Ll/zei0;Landroidx/work/impl/WorkDatabase;Ll/b7j0;Landroidx/work/impl/a;Lkotlin/jvm/functions/Function6;)Ll/s9q0;", "b", "(Landroid/content/Context;Landroidx/work/a;Ll/zei0;Landroidx/work/impl/WorkDatabase;Ll/b7j0;Landroidx/work/impl/a;)Ljava/util/List;", "taskExecutor", "Ll/ppb;", "f", "(Ll/zei0;)Ll/ppb;", "SchedulersCreator", "work-runtime_release"}, m87233k = 2, m87234mv = {1, 8, 0}, m87236xi = 48)
public final class WorkManagerImplExtKt {
    /* JADX INFO: renamed from: b */
    public static final List<dud0> m4452b(Context context, C0761a c0761a, zei0 zei0Var, WorkDatabase workDatabase, b7j0 b7j0Var, C0773a c0773a) {
        dud0 dud0VarM143285c = jud0.m143285c(context, workDatabase, c0761a);
        dud0VarM143285c.getClass();
        return CollectionsKt.listOf((Object[]) new dud0[]{dud0VarM143285c, new v6k(context, c0761a, b7j0Var, c0773a, new p9q0(c0773a, zei0Var), zei0Var)});
    }

    @JvmOverloads
    @JvmName
    @NotNull
    /* JADX INFO: renamed from: c */
    public static final s9q0 m4453c(@NotNull Context context, @NotNull C0761a c0761a) {
        context.getClass();
        c0761a.getClass();
        return m4455e(context, c0761a, null, null, null, null, null, 124, null);
    }

    @JvmOverloads
    @JvmName
    @NotNull
    /* JADX INFO: renamed from: d */
    public static final s9q0 m4454d(@NotNull Context context, @NotNull C0761a c0761a, @NotNull zei0 zei0Var, @NotNull WorkDatabase workDatabase, @NotNull b7j0 b7j0Var, @NotNull C0773a c0773a, @NotNull Function6<? super Context, ? super C0761a, ? super zei0, ? super WorkDatabase, ? super b7j0, ? super C0773a, ? extends List<? extends dud0>> function6) {
        context.getClass();
        c0761a.getClass();
        zei0Var.getClass();
        workDatabase.getClass();
        b7j0Var.getClass();
        c0773a.getClass();
        function6.getClass();
        return new s9q0(context.getApplicationContext(), c0761a, zei0Var, workDatabase, function6.invoke(context, c0761a, zei0Var, workDatabase, b7j0Var, c0773a), c0773a, b7j0Var);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ s9q0 m4455e(Context context, C0761a c0761a, zei0 zei0Var, WorkDatabase workDatabase, b7j0 b7j0Var, C0773a c0773a, Function6 function6, int i, Object obj) {
        b7j0 b7j0Var2;
        if ((i & 4) != 0) {
            zei0Var = new t9q0(c0761a.getTaskExecutor());
        }
        zei0 zei0Var2 = zei0Var;
        if ((i & 8) != 0) {
            WorkDatabase.Companion companion = WorkDatabase.INSTANCE;
            Context applicationContext = context.getApplicationContext();
            applicationContext.getClass();
            oie0 oie0VarMo187638d = zei0Var2.mo187638d();
            oie0VarMo187638d.getClass();
            workDatabase = companion.m4450b(applicationContext, oie0VarMo187638d, c0761a.getClock(), context.getResources().getBoolean(o0c0.f141312a));
        }
        if ((i & 16) != 0) {
            Context applicationContext2 = context.getApplicationContext();
            applicationContext2.getClass();
            b7j0Var2 = new b7j0(applicationContext2, zei0Var2, null, null, null, null, 60, null);
        } else {
            b7j0Var2 = b7j0Var;
        }
        return m4454d(context, c0761a, zei0Var2, workDatabase, b7j0Var2, (i & 32) != 0 ? new C0773a(context.getApplicationContext(), c0761a, zei0Var2, workDatabase) : c0773a, (i & 64) != 0 ? WorkManagerImplExtKt$WorkManagerImpl$1.INSTANCE : function6);
    }

    @JvmName
    @NotNull
    /* JADX INFO: renamed from: f */
    public static final ppb m4456f(@NotNull zei0 zei0Var) {
        zei0Var.getClass();
        CoroutineDispatcher coroutineDispatcherMo187636a = zei0Var.mo187636a();
        coroutineDispatcherMo187636a.getClass();
        return C15424f.m94055a(coroutineDispatcherMo187636a);
    }
}
