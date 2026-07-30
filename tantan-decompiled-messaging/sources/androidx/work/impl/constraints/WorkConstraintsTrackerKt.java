package androidx.work.impl.constraints;

import android.content.Context;
import android.net.ConnectivityManager;
import androidx.annotation.RequiresApi;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import kotlinx.coroutines.C15424f;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.InterfaceC15486o;
import org.jetbrains.annotations.NotNull;
import p149l.haq0;
import p149l.jh3;
import p149l.ld50;
import p149l.txv;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a)\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\t\u001a\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000e\"\u0014\u0010\u0011\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0010*$\b\u0002\u0010\u0015\"\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u00122\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0012¨\u0006\u0016"}, m87232d2 = {"Landroidx/work/impl/constraints/WorkConstraintsTracker;", "Ll/haq0;", "spec", "Lkotlinx/coroutines/CoroutineDispatcher;", "dispatcher", "Ll/ld50;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lkotlinx/coroutines/o;", "c", "(Landroidx/work/impl/constraints/WorkConstraintsTracker;Ll/haq0;Lkotlinx/coroutines/CoroutineDispatcher;Ll/ld50;)Lkotlinx/coroutines/o;", "Landroid/content/Context;", "context", "Landroidx/work/impl/constraints/NetworkRequestConstraintController;", "a", "(Landroid/content/Context;)Landroidx/work/impl/constraints/NetworkRequestConstraintController;", "", "Ljava/lang/String;", "TAG", "Lkotlin/Function1;", "Landroidx/work/impl/constraints/a;", "", "OnConstraintState", "work-runtime_release"}, m87233k = 2, m87234mv = {1, 8, 0}, m87236xi = 48)
public final class WorkConstraintsTrackerKt {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final String f3586a;

    static {
        String strM190978i = txv.m190978i("WorkConstraintsTracker");
        strM190978i.getClass();
        f3586a = strM190978i;
    }

    @RequiresApi(28)
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final NetworkRequestConstraintController m4580a(@NotNull Context context) {
        context.getClass();
        Object systemService = context.getSystemService("connectivity");
        systemService.getClass();
        return new NetworkRequestConstraintController((ConnectivityManager) systemService, 0L, 2, null);
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static final InterfaceC15486o m4582c(@NotNull WorkConstraintsTracker workConstraintsTracker, @NotNull haq0 haq0Var, @NotNull CoroutineDispatcher coroutineDispatcher, @NotNull ld50 ld50Var) {
        workConstraintsTracker.getClass();
        haq0Var.getClass();
        coroutineDispatcher.getClass();
        ld50Var.getClass();
        return jh3.m141367d(C15424f.m94055a(coroutineDispatcher), null, null, new WorkConstraintsTrackerKt$listen$1(workConstraintsTracker, haq0Var, ld50Var, null), 3, null);
    }
}
