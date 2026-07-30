package androidx.work;

import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.work.OperationKt;
import com.google.firebase.messaging.Constants;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.gnr;
import p149l.kt10;
import p149l.p5j0;
import p149l.qkq0;
import p149l.uwp;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a\u0014\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0086H¢\u0006\u0004\b\u0002\u0010\u0003\u001a5\u0010\r\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0000¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m87232d2 = {"Landroidx/work/d;", "Landroidx/work/d$b$c;", "c", "(Landroidx/work/d;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ll/p5j0;", "tracer", "", Constants.ScionAnalytics.PARAM_LABEL, "Ljava/util/concurrent/Executor;", "executor", "Lkotlin/Function0;", "", "block", com.clevertap.android.sdk.Constants.INAPP_DATA_TAG, "(Ll/p5j0;Ljava/lang/String;Ljava/util/concurrent/Executor;Lkotlin/jvm/functions/Function0;)Landroidx/work/d;", "work-runtime_release"}, m87233k = 2, m87234mv = {1, 8, 0}, m87236xi = 48)
@SourceDebugExtension
public final class OperationKt {
    /* JADX INFO: renamed from: a */
    public static Unit m4342a(Executor executor, final p5j0 p5j0Var, final String str, final Function0 function0, final kt10 kt10Var, final CallbackToFutureAdapter.C0201a c0201a) {
        c0201a.getClass();
        executor.execute(new Runnable() { // from class: l.bt50
            @Override // java.lang.Runnable
            public final void run() {
                OperationKt.m4343b(p5j0Var, str, function0, kt10Var, c0201a);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: b */
    public static void m4343b(p5j0 p5j0Var, String str, Function0 function0, kt10 kt10Var, CallbackToFutureAdapter.C0201a c0201a) {
        boolean zIsEnabled = p5j0Var.isEnabled();
        if (zIsEnabled) {
            try {
                p5j0Var.mo167486a(str);
            } catch (Throwable th) {
                if (zIsEnabled) {
                    p5j0Var.mo167487b();
                }
                throw th;
            }
        }
        try {
            function0.invoke();
            InterfaceC0764d.b.c cVar = InterfaceC0764d.f3469a;
            kt10Var.mo2987m(cVar);
            c0201a.m867c(cVar);
        } catch (Throwable th2) {
            kt10Var.mo2987m(new InterfaceC0764d.b.a(th2));
            c0201a.m870f(th2);
        }
        Unit unit = Unit.INSTANCE;
        if (zIsEnabled) {
            p5j0Var.mo167487b();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: c */
    public static final Object m4344c(@NotNull InterfaceC0764d interfaceC0764d, @NotNull Continuation<? super InterfaceC0764d.b.c> continuation) throws Throwable {
        OperationKt$await$1 operationKt$await$1;
        if (continuation instanceof OperationKt$await$1) {
            operationKt$await$1 = (OperationKt$await$1) continuation;
            int i = operationKt$await$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                operationKt$await$1.label = i - Integer.MIN_VALUE;
            } else {
                operationKt$await$1 = new OperationKt$await$1(continuation);
            }
        } else {
            operationKt$await$1 = new OperationKt$await$1(continuation);
        }
        Object objM876b = operationKt$await$1.result;
        Object objM196133e = uwp.m196133e();
        int i2 = operationKt$await$1.label;
        if (i2 == 0) {
            ResultKt.m87239b(objM876b);
            gnr<InterfaceC0764d.b.c> result = interfaceC0764d.getResult();
            result.getClass();
            operationKt$await$1.label = 1;
            objM876b = androidx.concurrent.futures.ListenableFutureKt.m876b(result, operationKt$await$1);
            if (objM876b == objM196133e) {
                return objM196133e;
            }
        } else {
            if (i2 != 1) {
                qkq0.m175383a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ResultKt.m87239b(objM876b);
        }
        objM876b.getClass();
        return objM876b;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public static final InterfaceC0764d m4345d(@NotNull final p5j0 p5j0Var, @NotNull final String str, @NotNull final Executor executor, @NotNull final Function0<Unit> function0) {
        p5j0Var.getClass();
        str.getClass();
        executor.getClass();
        function0.getClass();
        final kt10 kt10Var = new kt10(InterfaceC0764d.f3470b);
        gnr gnrVarM864a = CallbackToFutureAdapter.m864a(new CallbackToFutureAdapter.InterfaceC0202b() { // from class: l.at50
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.InterfaceC0202b
            /* JADX INFO: renamed from: a */
            public final Object mo871a(CallbackToFutureAdapter.C0201a c0201a) {
                return OperationKt.m4342a(executor, p5j0Var, str, function0, kt10Var, c0201a);
            }
        });
        gnrVarM864a.getClass();
        return new C0765e(kt10Var, gnrVarM864a);
    }
}
