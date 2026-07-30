package androidx.work.impl;

import android.content.Context;
import androidx.work.C0763a;
import com.clevertap.android.sdk.Constants;
import com.facebook.AuthenticationTokenClaims;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function6;
import kotlinx.coroutines.C15531f;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;
import p153l.drb;
import p153l.fgj0;
import p153l.h2e0;
import p153l.n2e0;
import p153l.n9k;
import p153l.t8c0;
import p153l.tqe0;
import p153l.uiq0;
import p153l.xiq0;
import p153l.yiq0;
import p153l.zni0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aá\u0001\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0097\u0001\b\u0002\u0010\u0012\u001a\u0090\u0001\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0001\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0003\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0005\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\b¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\n¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\fj\u0002`\u0011H\u0007¢\u0006\u0004\b\u0014\u0010\u0015\u001aE\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u001a\u0010\u001b* \u0002\u0010\u001c\"\u008c\u0001\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0001\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0003\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0005\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\b¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\n¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\f2\u008c\u0001\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0001\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0003\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0005\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\b¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\n¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\f¨\u0006\u001d"}, m88121d2 = {"Landroid/content/Context;", "context", "Landroidx/work/a;", "configuration", "Ll/zni0;", "workTaskExecutor", "Landroidx/work/impl/WorkDatabase;", "workDatabase", "Ll/fgj0;", "trackers", "Landroidx/work/impl/a;", "processor", "Lkotlin/Function6;", "Lkotlin/ParameterName;", AuthenticationTokenClaims.JSON_KEY_NAME, "", "Ll/h2e0;", "Landroidx/work/impl/SchedulersCreator;", "schedulersCreator", "Ll/xiq0;", Constants.INAPP_DATA_TAG, "(Landroid/content/Context;Landroidx/work/a;Ll/zni0;Landroidx/work/impl/WorkDatabase;Ll/fgj0;Landroidx/work/impl/a;Lkotlin/jvm/functions/Function6;)Ll/xiq0;", "b", "(Landroid/content/Context;Landroidx/work/a;Ll/zni0;Landroidx/work/impl/WorkDatabase;Ll/fgj0;Landroidx/work/impl/a;)Ljava/util/List;", "taskExecutor", "Ll/drb;", "f", "(Ll/zni0;)Ll/drb;", "SchedulersCreator", "work-runtime_release"}, m88122k = 2, m88123mv = {1, 8, 0}, m88125xi = 48)
public final class WorkManagerImplExtKt {
    /* JADX INFO: renamed from: b */
    public static final List<h2e0> m4454b(Context context, C0763a c0763a, zni0 zni0Var, WorkDatabase workDatabase, fgj0 fgj0Var, C0775a c0775a) {
        h2e0 h2e0VarM161223c = n2e0.m161223c(context, workDatabase, c0763a);
        h2e0VarM161223c.getClass();
        return CollectionsKt.listOf((Object[]) new h2e0[]{h2e0VarM161223c, new n9k(context, c0763a, fgj0Var, c0775a, new uiq0(c0775a, zni0Var), zni0Var)});
    }

    @JvmOverloads
    @JvmName
    @NotNull
    /* JADX INFO: renamed from: c */
    public static final xiq0 m4455c(@NotNull Context context, @NotNull C0763a c0763a) {
        context.getClass();
        c0763a.getClass();
        return m4457e(context, c0763a, null, null, null, null, null, 124, null);
    }

    @JvmOverloads
    @JvmName
    @NotNull
    /* JADX INFO: renamed from: d */
    public static final xiq0 m4456d(@NotNull Context context, @NotNull C0763a c0763a, @NotNull zni0 zni0Var, @NotNull WorkDatabase workDatabase, @NotNull fgj0 fgj0Var, @NotNull C0775a c0775a, @NotNull Function6<? super Context, ? super C0763a, ? super zni0, ? super WorkDatabase, ? super fgj0, ? super C0775a, ? extends List<? extends h2e0>> function6) {
        context.getClass();
        c0763a.getClass();
        zni0Var.getClass();
        workDatabase.getClass();
        fgj0Var.getClass();
        c0775a.getClass();
        function6.getClass();
        return new xiq0(context.getApplicationContext(), c0763a, zni0Var, workDatabase, function6.invoke(context, c0763a, zni0Var, workDatabase, fgj0Var, c0775a), c0775a, fgj0Var);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ xiq0 m4457e(Context context, C0763a c0763a, zni0 zni0Var, WorkDatabase workDatabase, fgj0 fgj0Var, C0775a c0775a, Function6 function6, int i, Object obj) {
        fgj0 fgj0Var2;
        if ((i & 4) != 0) {
            zni0Var = new yiq0(c0763a.getTaskExecutor());
        }
        zni0 zni0Var2 = zni0Var;
        if ((i & 8) != 0) {
            WorkDatabase.Companion companion = WorkDatabase.INSTANCE;
            Context applicationContext = context.getApplicationContext();
            applicationContext.getClass();
            tqe0 tqe0VarMo216346d = zni0Var2.mo216346d();
            tqe0VarMo216346d.getClass();
            workDatabase = companion.m4452b(applicationContext, tqe0VarMo216346d, c0763a.getClock(), context.getResources().getBoolean(t8c0.f172524a));
        }
        if ((i & 16) != 0) {
            Context applicationContext2 = context.getApplicationContext();
            applicationContext2.getClass();
            fgj0Var2 = new fgj0(applicationContext2, zni0Var2, null, null, null, null, 60, null);
        } else {
            fgj0Var2 = fgj0Var;
        }
        return m4456d(context, c0763a, zni0Var2, workDatabase, fgj0Var2, (i & 32) != 0 ? new C0775a(context.getApplicationContext(), c0763a, zni0Var2, workDatabase) : c0775a, (i & 64) != 0 ? WorkManagerImplExtKt$WorkManagerImpl$1.INSTANCE : function6);
    }

    @JvmName
    @NotNull
    /* JADX INFO: renamed from: f */
    public static final drb m4458f(@NotNull zni0 zni0Var) {
        zni0Var.getClass();
        CoroutineDispatcher coroutineDispatcherMo216344a = zni0Var.mo216344a();
        coroutineDispatcherMo216344a.getClass();
        return C15531f.m94947a(coroutineDispatcherMo216344a);
    }
}
