package androidx.work.impl.constraints;

import android.content.Context;
import android.net.ConnectivityManager;
import androidx.annotation.RequiresApi;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import kotlinx.coroutines.C15531f;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.InterfaceC15593o;
import org.jetbrains.annotations.NotNull;
import p153l.mjq0;
import p153l.qzv;
import p153l.sl50;
import p153l.xh3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a)\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\t\u001a\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000e\"\u0014\u0010\u0011\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0010*$\b\u0002\u0010\u0015\"\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u00122\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0012¨\u0006\u0016"}, m88121d2 = {"Landroidx/work/impl/constraints/WorkConstraintsTracker;", "Ll/mjq0;", "spec", "Lkotlinx/coroutines/CoroutineDispatcher;", "dispatcher", "Ll/sl50;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lkotlinx/coroutines/o;", "c", "(Landroidx/work/impl/constraints/WorkConstraintsTracker;Ll/mjq0;Lkotlinx/coroutines/CoroutineDispatcher;Ll/sl50;)Lkotlinx/coroutines/o;", "Landroid/content/Context;", "context", "Landroidx/work/impl/constraints/NetworkRequestConstraintController;", "a", "(Landroid/content/Context;)Landroidx/work/impl/constraints/NetworkRequestConstraintController;", "", "Ljava/lang/String;", "TAG", "Lkotlin/Function1;", "Landroidx/work/impl/constraints/a;", "", "OnConstraintState", "work-runtime_release"}, m88122k = 2, m88123mv = {1, 8, 0}, m88125xi = 48)
public final class WorkConstraintsTrackerKt {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final String f3586a;

    static {
        String strM178831i = qzv.m178831i("WorkConstraintsTracker");
        strM178831i.getClass();
        f3586a = strM178831i;
    }

    @RequiresApi(28)
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final NetworkRequestConstraintController m4582a(@NotNull Context context) {
        context.getClass();
        Object systemService = context.getSystemService("connectivity");
        systemService.getClass();
        return new NetworkRequestConstraintController((ConnectivityManager) systemService, 0L, 2, null);
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static final InterfaceC15593o m4584c(@NotNull WorkConstraintsTracker workConstraintsTracker, @NotNull mjq0 mjq0Var, @NotNull CoroutineDispatcher coroutineDispatcher, @NotNull sl50 sl50Var) {
        workConstraintsTracker.getClass();
        mjq0Var.getClass();
        coroutineDispatcher.getClass();
        sl50Var.getClass();
        return xh3.m210980d(C15531f.m94947a(coroutineDispatcher), null, null, new WorkConstraintsTrackerKt$listen$1(workConstraintsTracker, mjq0Var, sl50Var, null), 3, null);
    }
}
