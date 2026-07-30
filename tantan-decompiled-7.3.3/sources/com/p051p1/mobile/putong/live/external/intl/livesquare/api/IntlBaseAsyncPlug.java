package com.p051p1.mobile.putong.live.external.intl.livesquare.api;

import com.facebook.AuthenticationTokenClaims;
import com.p051p1.mobile.putong.live.external.intl.livesquare.api.IntlBaseAsyncPlug;
import com.p051p1.mobile.putong.live.external.intl.livesquare.api.IntlModelData;
import java.util.Objects;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p137rx.C22421c;
import p137rx.subjects.C22507a;
import p153l.dhw;
import p153l.fhw;
import p153l.ner;
import p153l.p7f;
import p153l.pcj;
import p153l.qcj;
import p153l.y20;

/* JADX INFO: loaded from: classes9.dex */
@Deprecated
@Metadata(m88120d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b'\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\u0007\u0010\bJ0\u0010\u000f\u001a\u00020\u00062!\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u00060\t¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\bJ\u0015\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0011\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\bJ\r\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u0006¢\u0006\u0004\b\u0019\u0010\bJ\u0015\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u001e\u0010\u0014J%\u0010\"\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u001f2\u000e\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000 ¢\u0006\u0004\b\"\u0010#J5\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000&\"\u0004\b\u0000\u0010$2\u0012\u0010'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000&0%2\u0006\u0010(\u001a\u00020\u0016¢\u0006\u0004\b)\u0010*J-\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000&\"\u0004\b\u0000\u0010$2\u0012\u0010'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000&0%¢\u0006\u0004\b)\u0010+J'\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000&\"\u0004\b\u0000\u0010$2\f\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000&¢\u0006\u0004\b)\u0010-R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010.R!\u00104\u001a\b\u0012\u0004\u0012\u00020\n0/8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103¨\u00065"}, m88121d2 = {"Lcom/p1/mobile/putong/live/external/intl/livesquare/api/IntlBaseAsyncPlug;", "", "Ll/ner;", "lifecycleProvider", "<init>", "(Ll/ner;)V", "", "getData", "()V", "Lkotlin/Function1;", "Lcom/p1/mobile/putong/live/external/intl/livesquare/api/IntlModelData;", "Lkotlin/ParameterName;", AuthenticationTokenClaims.JSON_KEY_NAME, "data", "call", "observe", "(Lkotlin/jvm/functions/Function1;)V", "success", "", "message", "(Ljava/lang/String;)V", "loading", "", "isLoading", "()Z", "complete", "", "throwable", "error", "(Ljava/lang/Throwable;)V", "getDataError", "P", "Lkotlin/Function0;", "func", "safeFunc", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", p7f.GPS_DIRECTION_TRUE, "Ll/pcj;", "Lrx/c;", "func0", "delayOnStop", "duringCreated", "(Ll/pcj;Z)Lrx/c;", "(Ll/pcj;)Lrx/c;", "org", "(Lrx/c;)Lrx/c;", "Ll/ner;", "Lrx/subjects/a;", "behaviorSubject$delegate", "Lkotlin/Lazy;", "getBehaviorSubject", "()Lrx/subjects/a;", "behaviorSubject", "external_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public abstract class IntlBaseAsyncPlug {

    /* JADX INFO: renamed from: behaviorSubject$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy behaviorSubject;

    @NotNull
    private final ner lifecycleProvider;

    public IntlBaseAsyncPlug(@NotNull ner nerVar) {
        nerVar.getClass();
        this.lifecycleProvider = nerVar;
        this.behaviorSubject = LazyKt__LazyJVMKt.m88118b(new Function0() { // from class: l.b4n
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return IntlBaseAsyncPlug.m71152d();
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public static Boolean m71149a(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: b */
    public static void m71150b(IntlBaseAsyncPlug intlBaseAsyncPlug, final Function1 function1, final IntlModelData intlModelData) {
        intlBaseAsyncPlug.safeFunc(new Function0() { // from class: l.c4n
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return IntlBaseAsyncPlug.observe$lambda$2$0(function1, intlModelData);
            }
        });
    }

    /* JADX INFO: renamed from: d */
    public static C22507a m71152d() {
        return C22507a.m222758b();
    }

    /* JADX INFO: renamed from: e */
    public static Boolean m71153e(IntlModelData intlModelData) {
        return Boolean.valueOf(intlModelData != null);
    }

    private final C22507a<IntlModelData> getBehaviorSubject() {
        Object value = this.behaviorSubject.getValue();
        value.getClass();
        return (C22507a) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit observe$lambda$2$0(Function1 function1, IntlModelData intlModelData) {
        intlModelData.getClass();
        function1.invoke(intlModelData);
        return Unit.INSTANCE;
    }

    public final void complete() {
        getBehaviorSubject().onNext(new IntlModelData().complete());
    }

    @NotNull
    public final <T> C22421c<T> duringCreated(@NotNull pcj<C22421c<T>> func0, boolean delayOnStop) {
        func0.getClass();
        C22421c<T> c22421cDuringCreated = this.lifecycleProvider.duringCreated(func0, delayOnStop);
        c22421cDuringCreated.getClass();
        return c22421cDuringCreated;
    }

    public final void error(@NotNull Throwable throwable) {
        throwable.getClass();
        Objects.toString(throwable);
        getBehaviorSubject().onNext(new IntlModelData().error(throwable));
    }

    public abstract void getData();

    public final void getDataError(@NotNull String message) {
        message.getClass();
        getBehaviorSubject().onNext(new IntlModelData().getDataError(message));
    }

    public final boolean isLoading() {
        return getBehaviorSubject().m222761e() != null && getBehaviorSubject().m222761e().isLoading();
    }

    public final void loading() {
        getBehaviorSubject().onNext(new IntlModelData().loading());
    }

    public final void observe(@NotNull final Function1<? super IntlModelData, Unit> call) {
        call.getClass();
        C22421c c22421cDuringCreated = duringCreated(getBehaviorSubject());
        final Function1 function1 = new Function1() { // from class: l.y3n
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return IntlBaseAsyncPlug.m71153e((IntlModelData) obj);
            }
        };
        c22421cDuringCreated.filter(new qcj() { // from class: l.z3n
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return IntlBaseAsyncPlug.m71149a(function1, obj);
            }
        }).subscribe(dhw.m115825d(new y20() { // from class: l.a4n
            @Override // p153l.y20
            public final void call(Object obj) {
                IntlBaseAsyncPlug.m71150b(this.f68431a, call, (IntlModelData) obj);
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
            fhw.m125606b("safeFunc", e);
            return null;
        }
    }

    public final void success(@NotNull String message) {
        message.getClass();
        getBehaviorSubject().onNext(new IntlModelData().success(message));
    }

    @NotNull
    public final <T> C22421c<T> duringCreated(@NotNull pcj<C22421c<T>> func0) {
        func0.getClass();
        C22421c<T> c22421cDuringCreated = this.lifecycleProvider.duringCreated(func0);
        c22421cDuringCreated.getClass();
        return c22421cDuringCreated;
    }

    @NotNull
    public final <T> C22421c<T> duringCreated(@NotNull C22421c<T> org2) {
        org2.getClass();
        C22421c<T> c22421cDuringCreated = this.lifecycleProvider.duringCreated(org2);
        c22421cDuringCreated.getClass();
        return c22421cDuringCreated;
    }

    public final void success() {
        getBehaviorSubject().onNext(new IntlModelData().success());
    }
}
