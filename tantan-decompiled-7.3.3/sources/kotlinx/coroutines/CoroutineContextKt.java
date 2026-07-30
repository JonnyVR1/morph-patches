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
import p153l.drb;
import p153l.pu6;
import p153l.r5e;
import p153l.twj0;
import p153l.vwj0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a\u001b\u0010\u0003\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001b\u0010\u0006\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\t\u001a\u00020\b*\u00020\u0001H\u0002¢\u0006\u0004\b\t\u0010\n\u001a'\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a/\u0010\u0014\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0013*\u0006\u0012\u0002\b\u00030\u00102\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001a\u0010\u0017\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0013*\u00020\u0016H\u0080\u0010¢\u0006\u0004\b\u0017\u0010\u0018\"\u001a\u0010\u001c\u001a\u0004\u0018\u00010\u0019*\u00020\u00018@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, m88121d2 = {"Ll/drb;", "Lkotlin/coroutines/CoroutineContext;", "context", "e", "(Ll/drb;Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;", "addedContext", Constants.INAPP_DATA_TAG, "(Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;", "", "c", "(Lkotlin/coroutines/CoroutineContext;)Z", "originalContext", "appendContext", "isNewCoroutine", "a", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext;Z)Lkotlin/coroutines/CoroutineContext;", "Lkotlin/coroutines/Continuation;", "", Constants.KEY_OLD_VALUE, "Ll/twj0;", "g", "(Lkotlin/coroutines/Continuation;Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;)Ll/twj0;", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "f", "(Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;)Ll/twj0;", "", "b", "(Lkotlin/coroutines/CoroutineContext;)Ljava/lang/String;", "coroutineName", "kotlinx-coroutines-core"}, m88122k = 2, m88123mv = {1, 9, 0}, m88125xi = 48)
public final class CoroutineContextKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [T, java.lang.Object] */
    /* JADX INFO: renamed from: a */
    public static final CoroutineContext m94494a(CoroutineContext coroutineContext, CoroutineContext coroutineContext2, final boolean z) {
        boolean zM94496c = m94496c(coroutineContext);
        boolean zM94496c2 = m94496c(coroutineContext2);
        if (!zM94496c && !zM94496c2) {
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
                if (!(element instanceof pu6)) {
                    return coroutineContext4.plus(element);
                }
                CoroutineContext.Element element2 = objectRef.element.get(element.getKey());
                if (element2 == null) {
                    return coroutineContext4.plus(z ? ((pu6) element).m173834v() : (pu6) element);
                }
                Ref.ObjectRef<CoroutineContext> objectRef2 = objectRef;
                objectRef2.element = objectRef2.element.minusKey(element.getKey());
                return coroutineContext4.plus(((pu6) element).m173833b(element2));
            }
        });
        if (zM94496c2) {
            objectRef.element = ((CoroutineContext) objectRef.element).fold(emptyCoroutineContext, new Function2<CoroutineContext, CoroutineContext.Element, CoroutineContext>() { // from class: kotlinx.coroutines.CoroutineContextKt$foldCopies$1
                @Override // kotlin.jvm.functions.Function2
                @NotNull
                public final CoroutineContext invoke(@NotNull CoroutineContext coroutineContext4, @NotNull CoroutineContext.Element element) {
                    return element instanceof pu6 ? coroutineContext4.plus(((pu6) element).m173834v()) : coroutineContext4.plus(element);
                }
            });
        }
        return coroutineContext3.plus((CoroutineContext) objectRef.element);
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public static final String m94495b(@NotNull CoroutineContext coroutineContext) {
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m94496c(CoroutineContext coroutineContext) {
        return ((Boolean) coroutineContext.fold(Boolean.FALSE, new Function2<Boolean, CoroutineContext.Element, Boolean>() { // from class: kotlinx.coroutines.CoroutineContextKt$hasCopyableElements$1
            @NotNull
            public final Boolean invoke(boolean z, @NotNull CoroutineContext.Element element) {
                return Boolean.valueOf(z || (element instanceof pu6));
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool, CoroutineContext.Element element) {
                return invoke(bool.booleanValue(), element);
            }
        })).booleanValue();
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public static final CoroutineContext m94497d(@NotNull CoroutineContext coroutineContext, @NotNull CoroutineContext coroutineContext2) {
        return !m94496c(coroutineContext2) ? coroutineContext.plus(coroutineContext2) : m94494a(coroutineContext, coroutineContext2, false);
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public static final CoroutineContext m94498e(@NotNull drb drbVar, @NotNull CoroutineContext coroutineContext) {
        CoroutineContext coroutineContextM94494a = m94494a(drbVar.getCoroutineContext(), coroutineContext, true);
        return (coroutineContextM94494a == r5e.m179860a() || coroutineContextM94494a.get(ContinuationInterceptor.INSTANCE) != null) ? coroutineContextM94494a : coroutineContextM94494a.plus(r5e.m179860a());
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public static final twj0<?> m94499f(@NotNull CoroutineStackFrame coroutineStackFrame) {
        while (!(coroutineStackFrame instanceof C15585i) && (coroutineStackFrame = coroutineStackFrame.getCallerFrame()) != null) {
            if (coroutineStackFrame instanceof twj0) {
                return (twj0) coroutineStackFrame;
            }
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: g */
    public static final twj0<?> m94500g(@NotNull Continuation<?> continuation, @NotNull CoroutineContext coroutineContext, @Nullable Object obj) {
        if (!(continuation instanceof CoroutineStackFrame) || coroutineContext.get(vwj0.INSTANCE) == null) {
            return null;
        }
        twj0<?> twj0VarM94499f = m94499f((CoroutineStackFrame) continuation);
        if (twj0VarM94499f != null) {
            twj0VarM94499f.m193348i1(coroutineContext, obj);
        }
        return twj0VarM94499f;
    }
}
