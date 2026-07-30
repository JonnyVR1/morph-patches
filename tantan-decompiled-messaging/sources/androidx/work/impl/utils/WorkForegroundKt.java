package androidx.work.impl.utils;

import android.content.Context;
import android.os.Build;
import androidx.work.AbstractC0762b;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.haq0;
import p149l.hh3;
import p149l.pyi;
import p149l.txv;
import p149l.uwp;
import p149l.z5f;
import p149l.zei0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a8\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0086@¢\u0006\u0004\b\u000b\u0010\f\"\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, m87232d2 = {"Landroid/content/Context;", "context", "Ll/haq0;", "spec", "Landroidx/work/b;", "worker", "Ll/pyi;", "foregroundUpdater", "Ll/zei0;", "taskExecutor", "", "b", "(Landroid/content/Context;Ll/haq0;Landroidx/work/b;Ll/pyi;Ll/zei0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "a", "Ljava/lang/String;", "TAG", "work-runtime_release"}, m87233k = 2, m87234mv = {1, 8, 0}, m87236xi = 48)
public final class WorkForegroundKt {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final String f3613a;

    static {
        String strM190978i = txv.m190978i("WorkForegroundRunnable");
        strM190978i.getClass();
        f3613a = strM190978i;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public static final Object m4631b(@NotNull Context context, @NotNull haq0 haq0Var, @NotNull AbstractC0762b abstractC0762b, @NotNull pyi pyiVar, @NotNull zei0 zei0Var, @NotNull Continuation<? super Unit> continuation) {
        if (!haq0Var.expedited || Build.VERSION.SDK_INT >= 31) {
            return Unit.INSTANCE;
        }
        Executor executorMo187637c = zei0Var.mo187637c();
        executorMo187637c.getClass();
        Object objM130938g = hh3.m130938g(z5f.m217297b(executorMo187637c), new WorkForegroundKt$workForeground$2(abstractC0762b, haq0Var, pyiVar, context, null), continuation);
        return objM130938g == uwp.m196133e() ? objM130938g : Unit.INSTANCE;
    }
}
