package kotlinx.coroutines.flow;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.eri;
import p149l.fri;
import p149l.qkq0;
import p149l.uwp;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007¸\u0006\u0000"}, m87232d2 = {"l/eod0", "Ll/eri;", "Ll/fri;", "collector", "", "collect", "(Ll/fri;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m87233k = 1, m87234mv = {1, 9, 0}, m87236xi = 48)
@SourceDebugExtension
public final class FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3<T> implements eri<T> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Iterable f66801a;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3$1 */
    @Metadata(m87233k = 3, m87234mv = {1, 9, 0}, m87236xi = 48)
    @DebugMetadata(m87373c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3", m87374f = "Builders.kt", m87375l = {114}, m87376m = "collect")
    @SourceDebugExtension
    public static final class C154281 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C154281(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3.this.collect(null, this);
        }
    }

    public FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3(Iterable iterable) {
        this.f66801a = iterable;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p149l.eri
    @Nullable
    public Object collect(@NotNull fri<? super T> friVar, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        C154281 c154281;
        Iterator<T> it;
        if (continuation instanceof C154281) {
            c154281 = (C154281) continuation;
            int i = c154281.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c154281.label = i - Integer.MIN_VALUE;
            } else {
                c154281 = new C154281(continuation);
            }
        } else {
            c154281 = new C154281(continuation);
        }
        Object obj = c154281.result;
        Object objM196133e = uwp.m196133e();
        int i2 = c154281.label;
        if (i2 == 0) {
            ResultKt.m87239b(obj);
            it = this.f66801a.iterator();
        } else {
            if (i2 != 1) {
                qkq0.m175383a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            it = (Iterator) c154281.L$1;
            friVar = (fri) c154281.L$0;
            ResultKt.m87239b(obj);
        }
        while (it.hasNext()) {
            T next = it.next();
            c154281.L$0 = friVar;
            c154281.L$1 = it;
            c154281.label = 1;
            if (friVar.emit(next, c154281) == objM196133e) {
                return objM196133e;
            }
        }
        return Unit.INSTANCE;
    }
}
