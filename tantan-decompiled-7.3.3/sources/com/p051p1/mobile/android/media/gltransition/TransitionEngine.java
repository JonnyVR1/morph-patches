package com.p051p1.mobile.android.media.gltransition;

import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.view.Surface;
import android.view.TextureView;
import androidx.annotation.MainThread;
import androidx.lifecycle.DefaultLifecycleObserver;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p051p1.mobile.android.media.gltransition.TransitionEngine;
import com.p051p1.mobile.android.media.gltransition.impl.TransitionEngineImpl;
import com.p051p1.mobile.putong.data.Owner;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.InterfaceC15593o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.ahj0;
import p153l.del0;
import p153l.gse;
import p153l.ker;
import p153l.pr3;
import p153l.vdl0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m88120d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u0000 O2\u00020\u0001:\u0003PQRB\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0007\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ?\u0010\u0011\u001a\u00020\u00052\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\b\b\u0002\u0010\r\u001a\u00020\f2\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00050\u000eH&¢\u0006\u0004\b\u0011\u0010\u0012J?\u0010\u0015\u001a\u00020\u00052\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\t2\b\b\u0002\u0010\r\u001a\u00020\f2\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00050\u000eH&¢\u0006\u0004\b\u0015\u0010\u0012J'\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0018H&¢\u0006\u0004\b\u001b\u0010\u001cJ%\u0010\u001f\u001a\u00020\u00052\u0014\b\u0002\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00050\u000eH&¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0005H&¢\u0006\u0004\b!\u0010\u0003J\u001f\u0010%\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020\n2\u0006\u0010$\u001a\u00020#H&¢\u0006\u0004\b%\u0010&J\u001f\u0010+\u001a\u00020\u00052\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)H&¢\u0006\u0004\b+\u0010,J\u001f\u00100\u001a\u00020\u00052\u0006\u0010-\u001a\u00020\u00182\u0006\u0010/\u001a\u00020.H&¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\u0005H&¢\u0006\u0004\b2\u0010\u0003J\u000f\u00103\u001a\u00020\u0005H&¢\u0006\u0004\b3\u0010\u0003J\u001f\u00106\u001a\u00020\u00052\u000e\b\u0002\u00104\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H ¢\u0006\u0004\b5\u0010\bJ5\u0010<\u001a\u00020\u00052\u0006\u00108\u001a\u0002072\u0006\u0010\u001e\u001a\u00020\u001d2\u0014\b\u0002\u00109\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00050\u000eH ¢\u0006\u0004\b:\u0010;J'\u0010B\u001a\u00020?2\u0006\u0010>\u001a\u00020=2\u000e\b\u0002\u00104\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H ¢\u0006\u0004\b@\u0010AJ\u0017\u0010G\u001a\u00020\u00052\u0006\u0010D\u001a\u00020CH ¢\u0006\u0004\bE\u0010FJ\u001f\u0010G\u001a\u00020\u00052\u0006\u0010I\u001a\u00020H2\u0006\u00103\u001a\u000207H ¢\u0006\u0004\bE\u0010JJ\u000f\u0010N\u001a\u00020KH ¢\u0006\u0004\bL\u0010M¨\u0006S"}, m88121d2 = {"Lcom/p1/mobile/android/media/gltransition/TransitionEngine;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "<init>", "()V", "Lkotlin/Function0;", "", "log", "setLogger", "(Lkotlin/jvm/functions/Function0;)V", "", "", "images", "Ll/del0;", "format", "Lkotlin/Function1;", "", "onLoaded", "loadImageFromPath", "(Ljava/util/List;Ll/del0;Lkotlin/jvm/functions/Function1;)V", "Landroid/net/Uri;", "uris", "loadImageFromUri", "Landroid/view/TextureView;", "textureView", "", "previewWidth", "previewHeight", "setPreview", "(Landroid/view/TextureView;II)V", "", "progress", "play", "(Lkotlin/jvm/functions/Function1;)V", "pause", "output", "Lcom/p1/mobile/android/media/gltransition/TransitionEngine$c;", "exportListener", "exportVideo", "(Ljava/lang/String;Lcom/p1/mobile/android/media/gltransition/TransitionEngine$c;)V", "Ll/vdl0;", "videoEntry", "Lcom/p1/mobile/android/media/gltransition/TransitionEngine$b;", "assembleListener", "assembleVideo", "(Ll/vdl0;Lcom/p1/mobile/android/media/gltransition/TransitionEngine$b;)V", FirebaseAnalytics.Param.INDEX, "Ll/ahj0;", "transition", "setTransitionAt", "(ILl/ahj0;)V", "cancel", "release", "runnable", "render$android_release", "render", "", "renderToSurface", "onDraw", "processFrame$android_release", "(ZFLkotlin/jvm/functions/Function1;)V", "processFrame", "Lkotlinx/coroutines/CoroutineDispatcher;", "dispatcher", "Lkotlinx/coroutines/o;", "launch$android_release", "(Lkotlinx/coroutines/CoroutineDispatcher;Lkotlin/jvm/functions/Function0;)Lkotlinx/coroutines/o;", "launch", "Landroid/graphics/SurfaceTexture;", "texture", "createWindowSurface$android_release", "(Landroid/graphics/SurfaceTexture;)V", "createWindowSurface", "Landroid/view/Surface;", "surface", "(Landroid/view/Surface;Z)V", "Ll/gse;", "requireEglCore$android_release", "()Ll/gse;", "requireEglCore", "Companion", "a", "c", "b", "android_release"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public abstract class TransitionEngine implements DefaultLifecycleObserver {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: com.p1.mobile.android.media.gltransition.TransitionEngine$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m88121d2 = {"Lcom/p1/mobile/android/media/gltransition/TransitionEngine$a;", "", "<init>", "()V", "Ll/ker;", Owner.TYPE, "Lcom/p1/mobile/android/media/gltransition/impl/TransitionEngineImpl;", "a", "(Ll/ker;)Lcom/p1/mobile/android/media/gltransition/impl/TransitionEngineImpl;", "android_release"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @MainThread
        @NotNull
        /* JADX INFO: renamed from: a */
        public final TransitionEngineImpl m21748a(@NotNull ker owner) {
            owner.getClass();
            return TransitionEngineImpl.Companion.m21772c(owner);
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.android.media.gltransition.TransitionEngine$b */
    @Metadata(m88120d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002À\u0006\u0003"}, m88121d2 = {"Lcom/p1/mobile/android/media/gltransition/TransitionEngine$b;", "", "android_release"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public interface InterfaceC4476b {
    }

    /* JADX INFO: renamed from: com.p1.mobile.android.media.gltransition.TransitionEngine$c */
    @Metadata(m88120d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H&¢\u0006\u0004\b\t\u0010\u0004J\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H&¢\u0006\u0004\b\u000e\u0010\u0004¨\u0006\u000fÀ\u0006\u0003"}, m88121d2 = {"Lcom/p1/mobile/android/media/gltransition/TransitionEngine$c;", "", "", Constants.INAPP_DATA_TAG, "()V", "", "progress", "e", "(F)V", "c", "", "error", "a", "(Ljava/lang/Throwable;)V", "b", "android_release"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public interface InterfaceC4477c {
        /* JADX INFO: renamed from: a */
        void mo21749a(@NotNull Throwable error);

        /* JADX INFO: renamed from: b */
        void mo21750b();

        /* JADX INFO: renamed from: c */
        void mo21751c();

        /* JADX INFO: renamed from: d */
        void mo21752d();

        /* JADX INFO: renamed from: e */
        void mo21753e(float progress);
    }

    /* JADX INFO: renamed from: a */
    public static Unit m21741a() {
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: b */
    public static Unit m21742b() {
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: c */
    public static Unit m21743c() {
        return Unit.INSTANCE;
    }

    @JvmStatic
    @MainThread
    @NotNull
    public static final TransitionEngineImpl create(@NotNull ker kerVar) {
        return INSTANCE.m21748a(kerVar);
    }

    /* JADX INFO: renamed from: d */
    public static Unit m21744d(long j) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: e */
    public static Unit m21745e(float f) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: f */
    public static Unit m21746f(int i) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: g */
    public static Unit m21747g(long j) {
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InterfaceC15593o launch$android_release$default(TransitionEngine transitionEngine, CoroutineDispatcher coroutineDispatcher, Function0 function0, int i, Object obj) {
        if (obj != null) {
            pr3.m173429a("Super calls with default arguments not supported in this target, function: launch");
            return null;
        }
        if ((i & 2) != 0) {
            function0 = new Function0() { // from class: l.hhj0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return TransitionEngine.m21741a();
                }
            };
        }
        return transitionEngine.launch$android_release(coroutineDispatcher, function0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void loadImageFromPath$default(TransitionEngine transitionEngine, List list, del0 del0Var, Function1 function1, int i, Object obj) {
        if (obj != null) {
            pr3.m173429a("Super calls with default arguments not supported in this target, function: loadImageFromPath");
            return;
        }
        if ((i & 2) != 0) {
            del0Var = del0.INSTANCE.m115433b();
        }
        if ((i & 4) != 0) {
            function1 = new Function1() { // from class: l.ehj0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return TransitionEngine.m21744d(((Long) obj2).longValue());
                }
            };
        }
        transitionEngine.loadImageFromPath(list, del0Var, function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void loadImageFromUri$default(TransitionEngine transitionEngine, List list, del0 del0Var, Function1 function1, int i, Object obj) {
        if (obj != null) {
            pr3.m173429a("Super calls with default arguments not supported in this target, function: loadImageFromUri");
            return;
        }
        if ((i & 2) != 0) {
            del0Var = del0.INSTANCE.m115433b();
        }
        if ((i & 4) != 0) {
            function1 = new Function1() { // from class: l.bhj0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return TransitionEngine.m21747g(((Long) obj2).longValue());
                }
            };
        }
        transitionEngine.loadImageFromUri(list, del0Var, function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void play$default(TransitionEngine transitionEngine, Function1 function1, int i, Object obj) {
        if (obj != null) {
            pr3.m173429a("Super calls with default arguments not supported in this target, function: play");
            return;
        }
        if ((i & 1) != 0) {
            function1 = new Function1() { // from class: l.dhj0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return TransitionEngine.m21745e(((Float) obj2).floatValue());
                }
            };
        }
        transitionEngine.play(function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void processFrame$android_release$default(TransitionEngine transitionEngine, boolean z, float f, Function1 function1, int i, Object obj) {
        if (obj != null) {
            pr3.m173429a("Super calls with default arguments not supported in this target, function: processFrame");
            return;
        }
        if ((i & 4) != 0) {
            function1 = new Function1() { // from class: l.chj0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return TransitionEngine.m21746f(((Integer) obj2).intValue());
                }
            };
        }
        transitionEngine.processFrame$android_release(z, f, function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void render$android_release$default(TransitionEngine transitionEngine, Function0 function0, int i, Object obj) {
        if (obj != null) {
            pr3.m173429a("Super calls with default arguments not supported in this target, function: render");
            return;
        }
        if ((i & 1) != 0) {
            function0 = new Function0() { // from class: l.ghj0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return TransitionEngine.m21743c();
                }
            };
        }
        transitionEngine.render$android_release(function0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setLogger$default(TransitionEngine transitionEngine, Function0 function0, int i, Object obj) {
        if (obj != null) {
            pr3.m173429a("Super calls with default arguments not supported in this target, function: setLogger");
            return;
        }
        if ((i & 1) != 0) {
            function0 = new Function0() { // from class: l.fhj0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return TransitionEngine.m21742b();
                }
            };
        }
        transitionEngine.setLogger(function0);
    }

    public abstract void assembleVideo(@NotNull vdl0 videoEntry, @NotNull InterfaceC4476b assembleListener);

    public abstract void cancel();

    public abstract void createWindowSurface$android_release(@NotNull SurfaceTexture texture);

    public abstract void createWindowSurface$android_release(@NotNull Surface surface, boolean release);

    public abstract void exportVideo(@NotNull String output, @NotNull InterfaceC4477c exportListener);

    @NotNull
    public abstract InterfaceC15593o launch$android_release(@NotNull CoroutineDispatcher dispatcher, @NotNull Function0<Unit> runnable);

    public abstract void loadImageFromPath(@Nullable List<String> images, @NotNull del0 format, @NotNull Function1<? super Long, Unit> onLoaded);

    public abstract void loadImageFromUri(@Nullable List<? extends Uri> uris, @NotNull del0 format, @NotNull Function1<? super Long, Unit> onLoaded);

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* bridge */ void onCreate(@NotNull ker kerVar) {
        super.onCreate(kerVar);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* bridge */ void onDestroy(@NotNull ker kerVar) {
        super.onDestroy(kerVar);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* bridge */ void onPause(@NotNull ker kerVar) {
        super.onPause(kerVar);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* bridge */ void onResume(@NotNull ker kerVar) {
        super.onResume(kerVar);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* bridge */ void onStart(@NotNull ker kerVar) {
        super.onStart(kerVar);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* bridge */ void onStop(@NotNull ker kerVar) {
        super.onStop(kerVar);
    }

    public abstract void pause();

    public abstract void play(@NotNull Function1<? super Float, Unit> progress);

    public abstract void processFrame$android_release(boolean renderToSurface, float progress, @NotNull Function1<? super Integer, Unit> onDraw);

    public abstract void release();

    public abstract void render$android_release(@NotNull Function0<Unit> runnable);

    @NotNull
    public abstract gse requireEglCore$android_release();

    public abstract void setLogger(@NotNull Function0<Unit> log);

    public abstract void setPreview(@NotNull TextureView textureView, int previewWidth, int previewHeight);

    public abstract void setTransitionAt(int index, @NotNull ahj0 transition);
}
