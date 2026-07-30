package com.hellogroup.p036mk.core.utils;

import android.util.Log;
import com.hellogroup.common.thread.MMDispatchers;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.dkw;
import p153l.drb;
import p153l.fkw;
import p153l.oiw;
import p153l.uyp;
import p153l.vh3;
import p153l.wtq0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m88121d2 = {"Ll/drb;", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, m88122k = 3, m88123mv = {1, 4, 0})
@DebugMetadata(m88262c = "com.hellogroup.mk.core.utils.MKFileManager$insertFiles$1", m88263f = "MKFileInterceptWhiteListRecorder.kt", m88264l = {55}, m88265m = "invokeSuspend")
final class MKFileManager$insertFiles$1 extends SuspendLambda implements Function2<drb, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function1 $onSuccess;
    final /* synthetic */ List $paths;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX INFO: renamed from: p$ */
    private drb f12534p$;

    /* JADX INFO: renamed from: com.hellogroup.mk.core.utils.MKFileManager$insertFiles$1$2 */
    @Metadata(m88120d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m88121d2 = {"Ll/drb;", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, m88122k = 3, m88123mv = {1, 4, 0})
    @DebugMetadata(m88262c = "com.hellogroup.mk.core.utils.MKFileManager$insertFiles$1$2", m88263f = "MKFileInterceptWhiteListRecorder.kt", m88264l = {}, m88265m = "invokeSuspend")
    public static final class C36032 extends SuspendLambda implements Function2<drb, Continuation<? super Unit>, Object> {
        final /* synthetic */ Ref.ObjectRef $md5Data;
        int label;

        /* JADX INFO: renamed from: p$ */
        private drb f12535p$;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C36032(Ref.ObjectRef objectRef, Continuation continuation) {
            super(2, continuation);
            this.$md5Data = objectRef;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            continuation.getClass();
            C36032 c36032 = MKFileManager$insertFiles$1.this.new C36032(this.$md5Data, continuation);
            c36032.f12535p$ = (drb) obj;
            return c36032;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(drb drbVar, Continuation<? super Unit> continuation) {
            return ((C36032) create(drbVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            uyp.m198688e();
            if (this.label != 0) {
                wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ResultKt.m88128b(obj);
            Function1 function1 = MKFileManager$insertFiles$1.this.$onSuccess;
            if (function1 != null) {
                return (Unit) function1.invoke((List) this.$md5Data.element);
            }
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MKFileManager$insertFiles$1(List list, Function1 function1, Continuation continuation) {
        super(2, continuation);
        this.$paths = list;
        this.$onSuccess = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        continuation.getClass();
        MKFileManager$insertFiles$1 mKFileManager$insertFiles$1 = new MKFileManager$insertFiles$1(this.$paths, this.$onSuccess, continuation);
        mKFileManager$insertFiles$1.f12534p$ = (drb) obj;
        return mKFileManager$insertFiles$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(drb drbVar, Continuation<? super Unit> continuation) {
        return ((MKFileManager$insertFiles$1) create(drbVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [T, java.util.ArrayList] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        Object objM198688e = uyp.m198688e();
        int i = this.label;
        if (i == 0) {
            ResultKt.m88128b(obj);
            drb drbVar = this.f12534p$;
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.element = new ArrayList();
            HashMap map = new HashMap();
            for (String str : this.$paths) {
                try {
                    String strM167803f = oiw.m167803f(str);
                    List list = (List) objectRef.element;
                    strM167803f.getClass();
                    list.add(strM167803f);
                    dkw dkwVar = new dkw();
                    dkwVar.m116689b(fkw.m126058d(str));
                    dkwVar.m116690c(str);
                    map.put(strM167803f, dkwVar);
                    String mkFilePath = dkwVar.getMkFilePath();
                    if (mkFilePath != null) {
                        fkw fkwVar = fkw.INSTANCE;
                        fkw.whitePaths.add(mkFilePath);
                    }
                } catch (Throwable th) {
                    Log.e("MKFileManager", "", th);
                }
            }
            fkw fkwVar2 = fkw.INSTANCE;
            fkw.data.putAll(map);
            CoroutineDispatcher coroutineDispatcherM17547a = MMDispatchers.INSTANCE.m17547a();
            C36032 c36032 = new C36032(objectRef, null);
            this.L$0 = drbVar;
            this.L$1 = objectRef;
            this.L$2 = map;
            this.label = 1;
            if (vh3.m201255g(coroutineDispatcherM17547a, c36032, this) == objM198688e) {
                return objM198688e;
            }
        } else {
            if (i != 1) {
                wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ResultKt.m88128b(obj);
        }
        return Unit.INSTANCE;
    }
}
