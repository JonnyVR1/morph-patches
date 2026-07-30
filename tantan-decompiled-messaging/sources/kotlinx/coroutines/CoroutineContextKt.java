package kotlinx.coroutines;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.d4e;
import p149l.mt6;
import p149l.ppb;
import p149l.qnj0;
import p149l.snj0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a\u001b\u0010\u0003\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001b\u0010\u0006\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\t\u001a\u00020\b*\u00020\u0001H\u0002¢\u0006\u0004\b\t\u0010\n\u001a'\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a/\u0010\u0014\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0013*\u0006\u0012\u0002\b\u00030\u00102\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001a\u0010\u0017\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0013*\u00020\u0016H\u0080\u0010¢\u0006\u0004\b\u0017\u0010\u0018\"\u001a\u0010\u001c\u001a\u0004\u0018\u00010\u0019*\u00020\u00018@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, m87232d2 = {"Ll/ppb;", "Lkotlin/coroutines/CoroutineContext;", "context", "e", "(Ll/ppb;Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;", "addedContext", Constants.INAPP_DATA_TAG, "(Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;", "", "c", "(Lkotlin/coroutines/CoroutineContext;)Z", "originalContext", "appendContext", "isNewCoroutine", "a", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext;Z)Lkotlin/coroutines/CoroutineContext;", "Lkotlin/coroutines/Continuation;", "", Constants.KEY_OLD_VALUE, "Ll/qnj0;", "g", "(Lkotlin/coroutines/Continuation;Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;)Ll/qnj0;", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "f", "(Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;)Ll/qnj0;", "", "b", "(Lkotlin/coroutines/CoroutineContext;)Ljava/lang/String;", "coroutineName", "kotlinx-coroutines-core"}, m87233k = 2, m87234mv = {1, 9, 0}, m87236xi = 48)
public final class CoroutineContextKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [T, java.lang.Object] */
    /* JADX INFO: renamed from: a */
    public static final CoroutineContext m93603a(CoroutineContext coroutineContext, CoroutineContext coroutineContext2, final boolean z) {
        boolean zM93605c = m93605c(coroutineContext);
        boolean zM93605c2 = m93605c(coroutineContext2);
        if (!zM93605c && !zM93605c2) {
            return coroutineContext.plus(coroutineContext2);
        }
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = coroutineContext2;
        EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.INSTANCE;
        CoroutineContext coroutineContext3 = (CoroutineContext) coroutineContext.fold(emptyCoroutineContext, new Function2<CoroutineContext, CoroutineContext.Element, CoroutineContext>() { // from class: kotlinx.coroutines.CoroutineContextKt$foldCopies$folded$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            /* JADX WARN: Type inference failed for: r1v3, types: [T, kotlin.coroutines.CoroutineContext] */
            @Override // kotlin.jvm.functions.Function2
            @NotNull
            public final CoroutineContext invoke(@NotNull CoroutineContext coroutineContext4, @NotNull CoroutineContext.Element element) {
                if (!(element instanceof mt6)) {
                    return coroutineContext4.plus(element);
                }
                CoroutineContext.Element element2 = objectRef.element.get(element.getKey());
                if (element2 == null) {
                    return coroutineContext4.plus(z ? ((mt6) element).m156181v() : (mt6) element);
                }
                Ref.ObjectRef<CoroutineContext> objectRef2 = objectRef;
                objectRef2.element = objectRef2.element.minusKey(element.getKey());
                return coroutineContext4.plus(((mt6) element).m156180b(element2));
            }
        });
        if (zM93605c2) {
            objectRef.element = ((CoroutineContext) objectRef.element).fold(emptyCoroutineContext, new Function2<CoroutineContext, CoroutineContext.Element, CoroutineContext>() { // from class: kotlinx.coroutines.CoroutineContextKt$foldCopies$1
                @Override // kotlin.jvm.functions.Function2
                @NotNull
                public final CoroutineContext invoke(@NotNull CoroutineContext coroutineContext4, @NotNull CoroutineContext.Element element) {
                    return element instanceof mt6 ? coroutineContext4.plus(((mt6) element).m156181v()) : coroutineContext4.plus(element);
                }
            });
        }
        return coroutineContext3.plus((CoroutineContext) objectRef.element);
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public static final String m93604b(@NotNull CoroutineContext coroutineContext) {
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m93605c(CoroutineContext coroutineContext) {
        return ((Boolean) coroutineContext.fold(Boolean.FALSE, new Function2<Boolean, CoroutineContext.Element, Boolean>() { // from class: kotlinx.coroutines.CoroutineContextKt$hasCopyableElements$1
            @NotNull
            public final Boolean invoke(boolean z, @NotNull CoroutineContext.Element element) {
                return Boolean.valueOf(z || (element instanceof mt6));
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool, CoroutineContext.Element element) {
                return invoke(bool.booleanValue(), element);
            }
        })).booleanValue();
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public static final CoroutineContext m93606d(@NotNull CoroutineContext coroutineContext, @NotNull CoroutineContext coroutineContext2) {
        return !m93605c(coroutineContext2) ? coroutineContext.plus(coroutineContext2) : m93603a(coroutineContext, coroutineContext2, false);
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public static final CoroutineContext m93607e(@NotNull ppb ppbVar, @NotNull CoroutineContext coroutineContext) {
        CoroutineContext coroutineContextM93603a = m93603a(ppbVar.getCoroutineContext(), coroutineContext, true);
        return (coroutineContextM93603a == d4e.m109980a() || coroutineContextM93603a.get(ContinuationInterceptor.INSTANCE) != null) ? coroutineContextM93603a : coroutineContextM93603a.plus(d4e.m109980a());
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public static final qnj0<?> m93608f(@NotNull CoroutineStackFrame coroutineStackFrame) {
        while (!(coroutineStackFrame instanceof C15478i) && (coroutineStackFrame = coroutineStackFrame.getCallerFrame()) != null) {
            if (coroutineStackFrame instanceof qnj0) {
                return (qnj0) coroutineStackFrame;
            }
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: g */
    public static final qnj0<?> m93609g(@NotNull Continuation<?> continuation, @NotNull CoroutineContext coroutineContext, @Nullable Object obj) {
        if (!(continuation instanceof CoroutineStackFrame) || coroutineContext.get(snj0.INSTANCE) == null) {
            return null;
        }
        qnj0<?> qnj0VarM93608f = m93608f((CoroutineStackFrame) continuation);
        if (qnj0VarM93608f != null) {
            qnj0VarM93608f.m175682i1(coroutineContext, obj);
        }
        return qnj0VarM93608f;
    }
}
