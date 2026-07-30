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
import p153l.hpr;
import p153l.s120;
import p153l.tej0;
import p153l.uyp;
import p153l.wtq0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a\u0014\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0086H¢\u0006\u0004\b\u0002\u0010\u0003\u001a5\u0010\r\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0000¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m88121d2 = {"Landroidx/work/d;", "Landroidx/work/d$b$c;", "c", "(Landroidx/work/d;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ll/tej0;", "tracer", "", Constants.ScionAnalytics.PARAM_LABEL, "Ljava/util/concurrent/Executor;", "executor", "Lkotlin/Function0;", "", "block", com.clevertap.android.sdk.Constants.INAPP_DATA_TAG, "(Ll/tej0;Ljava/lang/String;Ljava/util/concurrent/Executor;Lkotlin/jvm/functions/Function0;)Landroidx/work/d;", "work-runtime_release"}, m88122k = 2, m88123mv = {1, 8, 0}, m88125xi = 48)
@SourceDebugExtension
public final class OperationKt {
    /* JADX INFO: renamed from: a */
    public static Unit m4344a(Executor executor, final tej0 tej0Var, final String str, final Function0 function0, final s120 s120Var, final CallbackToFutureAdapter.C0202a c0202a) {
        c0202a.getClass();
        executor.execute(new Runnable() { // from class: l.h160
            @Override // java.lang.Runnable
            public final void run() {
                OperationKt.m4345b(tej0Var, str, function0, s120Var, c0202a);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: b */
    public static void m4345b(tej0 tej0Var, String str, Function0 function0, s120 s120Var, CallbackToFutureAdapter.C0202a c0202a) {
        boolean zIsEnabled = tej0Var.isEnabled();
        if (zIsEnabled) {
            try {
                tej0Var.mo190709a(str);
            } catch (Throwable th) {
                if (zIsEnabled) {
                    tej0Var.mo190710b();
                }
                throw th;
            }
        }
        try {
            function0.invoke();
            InterfaceC0766d.b.c cVar = InterfaceC0766d.f3469a;
            s120Var.mo2988m(cVar);
            c0202a.m868c(cVar);
        } catch (Throwable th2) {
            s120Var.mo2988m(new InterfaceC0766d.b.a(th2));
            c0202a.m871f(th2);
        }
        Unit unit = Unit.INSTANCE;
        if (zIsEnabled) {
            tej0Var.mo190710b();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: c */
    public static final Object m4346c(@NotNull InterfaceC0766d interfaceC0766d, @NotNull Continuation<? super InterfaceC0766d.b.c> continuation) throws Throwable {
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
        Object objM877b = operationKt$await$1.result;
        Object objM198688e = uyp.m198688e();
        int i2 = operationKt$await$1.label;
        if (i2 == 0) {
            ResultKt.m88128b(objM877b);
            hpr<InterfaceC0766d.b.c> result = interfaceC0766d.getResult();
            result.getClass();
            operationKt$await$1.label = 1;
            objM877b = androidx.concurrent.futures.ListenableFutureKt.m877b(result, operationKt$await$1);
            if (objM877b == objM198688e) {
                return objM198688e;
            }
        } else {
            if (i2 != 1) {
                wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ResultKt.m88128b(objM877b);
        }
        objM877b.getClass();
        return objM877b;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public static final InterfaceC0766d m4347d(@NotNull final tej0 tej0Var, @NotNull final String str, @NotNull final Executor executor, @NotNull final Function0<Unit> function0) {
        tej0Var.getClass();
        str.getClass();
        executor.getClass();
        function0.getClass();
        final s120 s120Var = new s120(InterfaceC0766d.f3470b);
        hpr hprVarM865a = CallbackToFutureAdapter.m865a(new CallbackToFutureAdapter.InterfaceC0203b() { // from class: l.g160
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.InterfaceC0203b
            /* JADX INFO: renamed from: a */
            public final Object mo872a(CallbackToFutureAdapter.C0202a c0202a) {
                return OperationKt.m4344a(executor, tej0Var, str, function0, s120Var, c0202a);
            }
        });
        hprVarM865a.getClass();
        return new C0767e(s120Var, hprVarM865a);
    }
}
