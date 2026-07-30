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
import p153l.aui;
import p153l.bui;
import p153l.uyp;
import p153l.wtq0;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007¸\u0006\u0000"}, m88121d2 = {"l/gwd0", "Ll/aui;", "Ll/bui;", "collector", "", "collect", "(Ll/bui;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m88122k = 1, m88123mv = {1, 9, 0}, m88125xi = 48)
@SourceDebugExtension
public final class FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3<T> implements aui<T> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Iterable f67475a;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3$1 */
    @Metadata(m88122k = 3, m88123mv = {1, 9, 0}, m88125xi = 48)
    @DebugMetadata(m88262c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3", m88263f = "Builders.kt", m88264l = {114}, m88265m = "collect")
    @SourceDebugExtension
    public static final class C155351 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C155351(Continuation continuation) {
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
        this.f67475a = iterable;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p153l.aui
    @Nullable
    public Object collect(@NotNull bui<? super T> buiVar, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        C155351 c155351;
        Iterator<T> it;
        if (continuation instanceof C155351) {
            c155351 = (C155351) continuation;
            int i = c155351.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c155351.label = i - Integer.MIN_VALUE;
            } else {
                c155351 = new C155351(continuation);
            }
        } else {
            c155351 = new C155351(continuation);
        }
        Object obj = c155351.result;
        Object objM198688e = uyp.m198688e();
        int i2 = c155351.label;
        if (i2 == 0) {
            ResultKt.m88128b(obj);
            it = this.f67475a.iterator();
        } else {
            if (i2 != 1) {
                wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            it = (Iterator) c155351.L$1;
            buiVar = (bui) c155351.L$0;
            ResultKt.m88128b(obj);
        }
        while (it.hasNext()) {
            T next = it.next();
            c155351.L$0 = buiVar;
            c155351.L$1 = it;
            c155351.label = 1;
            if (buiVar.emit(next, c155351) == objM198688e) {
                return objM198688e;
            }
        }
        return Unit.INSTANCE;
    }
}
