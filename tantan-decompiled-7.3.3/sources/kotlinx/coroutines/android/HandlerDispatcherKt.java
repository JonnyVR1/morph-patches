package kotlinx.coroutines.android;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import androidx.annotation.VisibleForTesting;
import com.facebook.AuthenticationTokenClaims;
import java.lang.reflect.InvocationTargetException;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.C15514c;
import kotlinx.coroutines.android.HandlerDispatcherKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.ag4;
import p153l.r5e;
import p153l.uyp;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a\u001f\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\n\u001a\u00020\u0000*\u00020\u00072\u0006\u0010\t\u001a\u00020\bH\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a\u0010\u0010\r\u001a\u00020\fH\u0086@¢\u0006\u0004\b\r\u0010\u000e\u001a\u0010\u0010\u000f\u001a\u00020\fH\u0082@¢\u0006\u0004\b\u000f\u0010\u000e\u001a\u001d\u0010\u0013\u001a\u00020\u00122\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001a%\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00152\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u0010H\u0002¢\u0006\u0004\b\u0017\u0010\u0018\"\u0014\u0010\u0019\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a\"\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00038\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u0012\u0004\b\u001d\u0010\u001e\"\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u001f¨\u0006 "}, m88121d2 = {"Landroid/os/Handler;", "", AuthenticationTokenClaims.JSON_KEY_NAME, "Lkotlinx/coroutines/android/HandlerDispatcher;", "from", "(Landroid/os/Handler;Ljava/lang/String;)Lkotlinx/coroutines/android/HandlerDispatcher;", "asCoroutineDispatcher", "Landroid/os/Looper;", "", "async", "asHandler", "(Landroid/os/Looper;Z)Landroid/os/Handler;", "", "awaitFrame", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitFrameSlowPath", "Ll/ag4;", "cont", "", "updateChoreographerAndPostFrameCallback", "(Ll/ag4;)V", "Landroid/view/Choreographer;", "choreographer", "postFrameCallback", "(Landroid/view/Choreographer;Ll/ag4;)V", "MAX_DELAY", "J", "Main", "Lkotlinx/coroutines/android/HandlerDispatcher;", "getMain$annotations", "()V", "Landroid/view/Choreographer;", "kotlinx-coroutines-android"}, m88122k = 2, m88123mv = {1, 9, 0}, m88125xi = 48)
@SourceDebugExtension
public final class HandlerDispatcherKt {
    private static final long MAX_DELAY = 4611686018427387903L;

    @JvmField
    @Nullable
    public static final HandlerDispatcher Main;

    @Nullable
    private static volatile Choreographer choreographer;

    static {
        Object objM225066constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            objM225066constructorimpl = Result.m225066constructorimpl(new HandlerContext(asHandler(Looper.getMainLooper(), true), null, 2, null));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM225066constructorimpl = Result.m225066constructorimpl(ResultKt.m88127a(th));
        }
        Main = (HandlerDispatcher) (Result.m225072isFailureimpl(objM225066constructorimpl) ? null : objM225066constructorimpl);
    }

    /* JADX INFO: renamed from: a */
    public static void m94628a(ag4 ag4Var, long j) {
        ag4Var.mo94635B(r5e.m179862c(), Long.valueOf(j));
    }

    @VisibleForTesting
    @NotNull
    public static final Handler asHandler(@NotNull Looper looper, boolean z) throws IllegalAccessException, InvocationTargetException {
        if (!z) {
            return new Handler(looper);
        }
        if (Build.VERSION.SDK_INT < 28) {
            try {
                return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
            } catch (NoSuchMethodException unused) {
                return new Handler(looper);
            }
        }
        Object objInvoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
        objInvoke.getClass();
        return (Handler) objInvoke;
    }

    @Nullable
    public static final Object awaitFrame(@NotNull Continuation<? super Long> continuation) {
        Choreographer choreographer2 = choreographer;
        if (choreographer2 == null) {
            return awaitFrameSlowPath(continuation);
        }
        C15514c c15514c = new C15514c(IntrinsicsKt__IntrinsicsJvmKt.m88257c(continuation), 1);
        c15514c.m94637G();
        postFrameCallback(choreographer2, c15514c);
        Object objM94670v = c15514c.m94670v();
        if (objM94670v == uyp.m198688e()) {
            DebugProbesKt.m88272c(continuation);
        }
        return objM94670v;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object awaitFrameSlowPath(Continuation<? super Long> continuation) {
        final C15514c c15514c = new C15514c(IntrinsicsKt__IntrinsicsJvmKt.m88257c(continuation), 1);
        c15514c.m94637G();
        if (Looper.myLooper() == Looper.getMainLooper()) {
            updateChoreographerAndPostFrameCallback(c15514c);
        } else {
            r5e.m179862c().dispatch(c15514c.getContext(), new Runnable() { // from class: kotlinx.coroutines.android.HandlerDispatcherKt$awaitFrameSlowPath$lambda$3$$inlined$Runnable$1
                @Override // java.lang.Runnable
                public final void run() {
                    HandlerDispatcherKt.updateChoreographerAndPostFrameCallback(c15514c);
                }
            });
        }
        Object objM94670v = c15514c.m94670v();
        if (objM94670v == uyp.m198688e()) {
            DebugProbesKt.m88272c(continuation);
        }
        return objM94670v;
    }

    @JvmOverloads
    @JvmName
    @NotNull
    public static final HandlerDispatcher from(@NotNull Handler handler) {
        return from$default(handler, null, 1, null);
    }

    public static /* synthetic */ HandlerDispatcher from$default(Handler handler, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return from(handler, str);
    }

    @Deprecated
    public static /* synthetic */ void getMain$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void postFrameCallback(Choreographer choreographer2, final ag4<? super Long> ag4Var) {
        choreographer2.postFrameCallback(new Choreographer.FrameCallback() { // from class: l.mxk
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j) {
                HandlerDispatcherKt.m94628a(ag4Var, j);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateChoreographerAndPostFrameCallback(ag4<? super Long> ag4Var) {
        Choreographer choreographer2 = choreographer;
        if (choreographer2 == null) {
            choreographer2 = Choreographer.getInstance();
            choreographer2.getClass();
            choreographer = choreographer2;
        }
        postFrameCallback(choreographer2, ag4Var);
    }

    @JvmOverloads
    @JvmName
    @NotNull
    public static final HandlerDispatcher from(@NotNull Handler handler, @Nullable String str) {
        return new HandlerContext(handler, str);
    }
}
