package com.p046p1.mobile.putong.live.external.square.api;

import com.facebook.AuthenticationTokenClaims;
import com.p046p1.mobile.putong.live.external.square.api.BaseAsyncPlug;
import com.p046p1.mobile.putong.live.external.square.api.ModelData;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p133rx.C22306c;
import p133rx.subjects.C22392a;
import p149l.e30;
import p149l.ffw;
import p149l.hfw;
import p149l.j6f;
import p149l.mcr;
import p149l.v9j;
import p149l.w9j;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m87231d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\u0007\u0010\bJ0\u0010\u000f\u001a\u00020\u00062!\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u00060\t¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\bJ\u0015\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0011\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\bJ\r\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u0006¢\u0006\u0004\b\u0019\u0010\bJ\u0015\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u001e\u0010\u0014J%\u0010\"\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u001f2\u000e\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000 ¢\u0006\u0004\b\"\u0010#J5\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000&\"\u0004\b\u0000\u0010$2\u0012\u0010'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000&0%2\u0006\u0010(\u001a\u00020\u0016¢\u0006\u0004\b)\u0010*J-\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000&\"\u0004\b\u0000\u0010$2\u0012\u0010'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000&0%¢\u0006\u0004\b)\u0010+J'\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000&\"\u0004\b\u0000\u0010$2\f\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000&¢\u0006\u0004\b)\u0010-R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010.R!\u00104\u001a\b\u0012\u0004\u0012\u00020\n0/8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103¨\u00065"}, m87232d2 = {"Lcom/p1/mobile/putong/live/external/square/api/BaseAsyncPlug;", "", "Ll/mcr;", "lifecycleProvider", "<init>", "(Ll/mcr;)V", "", "getData", "()V", "Lkotlin/Function1;", "Lcom/p1/mobile/putong/live/external/square/api/ModelData;", "Lkotlin/ParameterName;", AuthenticationTokenClaims.JSON_KEY_NAME, "data", "call", "observe", "(Lkotlin/jvm/functions/Function1;)V", "success", "", "message", "(Ljava/lang/String;)V", "loading", "", "isLoading", "()Z", "complete", "", "throwable", "error", "(Ljava/lang/Throwable;)V", "getDataError", "P", "Lkotlin/Function0;", "func", "safeFunc", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", j6f.GPS_DIRECTION_TRUE, "Ll/v9j;", "Lrx/c;", "func0", "delayOnStop", "duringCreated", "(Ll/v9j;Z)Lrx/c;", "(Ll/v9j;)Lrx/c;", "org", "(Lrx/c;)Lrx/c;", "Ll/mcr;", "Lrx/subjects/a;", "behaviorSubject$delegate", "Lkotlin/Lazy;", "getBehaviorSubject", "()Lrx/subjects/a;", "behaviorSubject", "external_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public abstract class BaseAsyncPlug {

    /* JADX INFO: renamed from: behaviorSubject$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy behaviorSubject;

    @NotNull
    private final mcr lifecycleProvider;

    public BaseAsyncPlug(@NotNull mcr mcrVar) {
        mcrVar.getClass();
        this.lifecycleProvider = mcrVar;
        this.behaviorSubject = LazyKt__LazyJVMKt.m87229b(new Function0() { // from class: l.ue2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BaseAsyncPlug.m70809e();
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static void m70805a(BaseAsyncPlug baseAsyncPlug, final Function1 function1, final ModelData modelData) {
        baseAsyncPlug.safeFunc(new Function0() { // from class: l.ve2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BaseAsyncPlug.observe$lambda$2$0(function1, modelData);
            }
        });
    }

    /* JADX INFO: renamed from: c */
    public static Boolean m70807c(ModelData modelData) {
        return Boolean.valueOf(modelData != null);
    }

    /* JADX INFO: renamed from: d */
    public static Boolean m70808d(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: e */
    public static C22392a m70809e() {
        return C22392a.m221512b();
    }

    private final C22392a<ModelData> getBehaviorSubject() {
        Object value = this.behaviorSubject.getValue();
        value.getClass();
        return (C22392a) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit observe$lambda$2$0(Function1 function1, ModelData modelData) {
        modelData.getClass();
        function1.invoke(modelData);
        return Unit.INSTANCE;
    }

    public final void complete() {
        getBehaviorSubject().onNext(new ModelData().complete());
    }

    @NotNull
    public final <T> C22306c<T> duringCreated(@NotNull v9j<C22306c<T>> func0, boolean delayOnStop) {
        func0.getClass();
        C22306c<T> c22306cDuringCreated = this.lifecycleProvider.duringCreated(func0, delayOnStop);
        c22306cDuringCreated.getClass();
        return c22306cDuringCreated;
    }

    public final void error(@NotNull Throwable throwable) {
        throwable.getClass();
        Objects.toString(throwable);
        getBehaviorSubject().onNext(new ModelData().error(throwable));
    }

    public abstract void getData();

    public final void getDataError(@NotNull String message) {
        message.getClass();
        getBehaviorSubject().onNext(new ModelData().getDataError(message));
    }

    public final boolean isLoading() {
        return getBehaviorSubject().m221515e() != null && getBehaviorSubject().m221515e().isLoading();
    }

    public final void loading() {
        getBehaviorSubject().onNext(new ModelData().loading());
    }

    public final void observe(@NotNull final Function1<? super ModelData, Unit> call) {
        call.getClass();
        C22306c c22306cDuringCreated = duringCreated(getBehaviorSubject());
        final Function1 function1 = new Function1() { // from class: l.we2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BaseAsyncPlug.m70807c((ModelData) obj);
            }
        };
        c22306cDuringCreated.filter(new w9j() { // from class: l.xe2
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return BaseAsyncPlug.m70808d(function1, obj);
            }
        }).subscribe(ffw.m121193d(new e30() { // from class: l.ye2
            @Override // p149l.e30
            public final void call(Object obj) {
                BaseAsyncPlug.m70805a(this.f197655a, call, (ModelData) obj);
            }
        }));
    }

    @Nullable
    public final <P> P safeFunc(@NotNull Function0<? extends P> func) {
        func.getClass();
        try {
            return func.invoke();
        } catch (Exception e) {
            getDataError(e.toString());
            hfw.m130791b("safeFunc", e);
            return null;
        }
    }

    public final void success(@NotNull String message) {
        message.getClass();
        getBehaviorSubject().onNext(new ModelData().success(message));
    }

    @NotNull
    public final <T> C22306c<T> duringCreated(@NotNull v9j<C22306c<T>> func0) {
        func0.getClass();
        C22306c<T> c22306cDuringCreated = this.lifecycleProvider.duringCreated(func0);
        c22306cDuringCreated.getClass();
        return c22306cDuringCreated;
    }

    @NotNull
    public final <T> C22306c<T> duringCreated(@NotNull C22306c<T> org2) {
        org2.getClass();
        C22306c<T> c22306cDuringCreated = this.lifecycleProvider.duringCreated(org2);
        c22306cDuringCreated.getClass();
        return c22306cDuringCreated;
    }

    public final void success() {
        getBehaviorSubject().onNext(new ModelData().success());
    }
}
