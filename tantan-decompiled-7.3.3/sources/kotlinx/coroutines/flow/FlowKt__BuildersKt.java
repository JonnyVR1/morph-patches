package kotlinx.coroutines.flow;

import com.clevertap.android.sdk.Constants;
import kotlin.BuilderInference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.aui;
import p153l.bui;
import p153l.el90;
import p153l.hwd0;
import p153l.p7f;
import p153l.uyp;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aJ\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u00002/\b\u0001\u0010\u0007\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001¢\u0006\u0002\b\u0006¢\u0006\u0004\b\t\u0010\n\u001a#\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000b¢\u0006\u0004\b\f\u0010\r\u001a!\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u000e\u001a\u00028\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001aJ\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u00002/\b\u0001\u0010\u0007\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001¢\u0006\u0002\b\u0006¢\u0006\u0004\b\u0012\u0010\n¨\u0006\u0013"}, m88121d2 = {p7f.GPS_DIRECTION_TRUE, "Lkotlin/Function2;", "Ll/bui;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "block", "Ll/aui;", "c", "(Lkotlin/jvm/functions/Function2;)Ll/aui;", "", "a", "(Ljava/lang/Iterable;)Ll/aui;", "value", Constants.INAPP_DATA_TAG, "(Ljava/lang/Object;)Ll/aui;", "Ll/el90;", "b", "kotlinx-coroutines-core"}, m88122k = 5, m88123mv = {1, 9, 0}, m88125xi = 48, m88126xs = "kotlinx/coroutines/flow/FlowKt")
@SourceDebugExtension
public final /* synthetic */ class FlowKt__BuildersKt {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__BuildersKt$a */
    @Metadata(m88120d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007¸\u0006\u0000"}, m88121d2 = {"l/gwd0", "Ll/aui;", "Ll/bui;", "collector", "", "collect", "(Ll/bui;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m88122k = 1, m88123mv = {1, 9, 0}, m88125xi = 48)
    @SourceDebugExtension
    public static final class C15534a<T> implements aui<T> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Object f67474a;

        public C15534a(Object obj) {
            this.f67474a = obj;
        }

        @Override // p153l.aui
        @Nullable
        public Object collect(@NotNull bui<? super T> buiVar, @NotNull Continuation<? super Unit> continuation) {
            Object objEmit = buiVar.emit((Object) this.f67474a, continuation);
            return objEmit == uyp.m198688e() ? objEmit : Unit.INSTANCE;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public static final <T> aui<T> m94958a(@NotNull Iterable<? extends T> iterable) {
        return new FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3(iterable);
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final <T> aui<T> m94959b(@BuilderInference @NotNull Function2<? super el90<? super T>, ? super Continuation<? super Unit>, ? extends Object> function2) {
        return new CallbackFlowBuilder(function2, null, 0, null, 14, null);
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static final <T> aui<T> m94960c(@BuilderInference @NotNull Function2<? super bui<? super T>, ? super Continuation<? super Unit>, ? extends Object> function2) {
        return new hwd0(function2);
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public static final <T> aui<T> m94961d(T t) {
        return new C15534a(t);
    }
}
