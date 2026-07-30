package androidx.work.impl.utils;

import android.content.Context;
import android.os.Build;
import androidx.work.AbstractC0764b;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.f7f;
import p153l.k1j;
import p153l.mjq0;
import p153l.qzv;
import p153l.uyp;
import p153l.vh3;
import p153l.zni0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a8\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0086@¢\u0006\u0004\b\u000b\u0010\f\"\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, m88121d2 = {"Landroid/content/Context;", "context", "Ll/mjq0;", "spec", "Landroidx/work/b;", "worker", "Ll/k1j;", "foregroundUpdater", "Ll/zni0;", "taskExecutor", "", "b", "(Landroid/content/Context;Ll/mjq0;Landroidx/work/b;Ll/k1j;Ll/zni0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "a", "Ljava/lang/String;", "TAG", "work-runtime_release"}, m88122k = 2, m88123mv = {1, 8, 0}, m88125xi = 48)
public final class WorkForegroundKt {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final String f3613a;

    static {
        String strM178831i = qzv.m178831i("WorkForegroundRunnable");
        strM178831i.getClass();
        f3613a = strM178831i;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public static final Object m4633b(@NotNull Context context, @NotNull mjq0 mjq0Var, @NotNull AbstractC0764b abstractC0764b, @NotNull k1j k1jVar, @NotNull zni0 zni0Var, @NotNull Continuation<? super Unit> continuation) {
        if (!mjq0Var.expedited || Build.VERSION.SDK_INT >= 31) {
            return Unit.INSTANCE;
        }
        Executor executorMo216345c = zni0Var.mo216345c();
        executorMo216345c.getClass();
        Object objM201255g = vh3.m201255g(f7f.m124439b(executorMo216345c), new WorkForegroundKt$workForeground$2(abstractC0764b, mjq0Var, k1jVar, context, null), continuation);
        return objM201255g == uyp.m198688e() ? objM201255g : Unit.INSTANCE;
    }
}
