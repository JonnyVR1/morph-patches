package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.aui;
import p153l.bui;
import p153l.fui;
import p153l.uyp;
import p153l.wtq0;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007¸\u0006\u0000"}, m88121d2 = {"l/gwd0", "Ll/aui;", "Ll/bui;", "collector", "", "collect", "(Ll/bui;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m88122k = 1, m88123mv = {1, 9, 0}, m88125xi = 48)
@SourceDebugExtension
public final class FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1<T> implements aui<T> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ aui f67488a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Function3 f67489b;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1$1 */
    @Metadata(m88122k = 3, m88123mv = {1, 9, 0}, m88125xi = 48)
    @DebugMetadata(m88262c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1", m88263f = "Errors.kt", m88264l = {112, 113}, m88265m = "collect")
    @SourceDebugExtension
    public static final class C155421 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C155421(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1.this.collect(null, this);
        }
    }

    public FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1(aui auiVar, Function3 function3) {
        this.f67488a = auiVar;
        this.f67489b = function3;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006a, code lost:
    
        if (r6 == r1) goto L23;
     */
    @Override // p153l.aui
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object collect(@NotNull bui<? super T> buiVar, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        C155421 c155421;
        if (continuation instanceof C155421) {
            c155421 = (C155421) continuation;
            int i = c155421.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c155421.label = i - Integer.MIN_VALUE;
            } else {
                c155421 = new C155421(continuation);
            }
        } else {
            c155421 = new C155421(continuation);
        }
        Object objM127483g = c155421.result;
        Object objM198688e = uyp.m198688e();
        int i2 = c155421.label;
        if (i2 == 0) {
            ResultKt.m88128b(objM127483g);
            aui auiVar = this.f67488a;
            c155421.L$0 = this;
            c155421.L$1 = buiVar;
            c155421.label = 1;
            objM127483g = fui.m127483g(auiVar, buiVar, c155421);
            if (objM127483g != objM198688e) {
            }
            return objM198688e;
        }
        if (i2 == 1) {
            buiVar = (bui) c155421.L$1;
            this = (FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1) c155421.L$0;
            ResultKt.m88128b(objM127483g);
        } else {
            if (i2 != 2) {
                wtq0.m207906a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ResultKt.m88128b(objM127483g);
        }
        return Unit.INSTANCE;
        Throwable th = (Throwable) objM127483g;
        if (th != null) {
            Function3 function3 = this.f67489b;
            c155421.L$0 = null;
            c155421.L$1 = null;
            c155421.label = 2;
            InlineMarker.m88373c(6);
            Object objInvoke = function3.invoke(buiVar, th, c155421);
            InlineMarker.m88373c(7);
        }
        return Unit.INSTANCE;
    }
}
