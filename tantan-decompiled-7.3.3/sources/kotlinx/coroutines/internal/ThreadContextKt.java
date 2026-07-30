package kotlinx.coroutines.internal;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.eyi0;
import p153l.goh0;
import p153l.hxi0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a#\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a!\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\n\u0010\u000b\"\u0014\u0010\u000e\u001a\u00020\f8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\n\u0010\r\"*\u0010\u0012\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011\"2\u0010\u0014\u001a \u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u0013\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00130\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0011\"&\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00150\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0011¨\u0006\u0018"}, m88121d2 = {"Lkotlin/coroutines/CoroutineContext;", "context", "", "b", "(Lkotlin/coroutines/CoroutineContext;)Ljava/lang/Object;", "countOrElement", "c", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;)Ljava/lang/Object;", "oldState", "", "a", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;)V", "Ll/goh0;", "Ll/goh0;", "NO_THREAD_ELEMENTS", "Lkotlin/Function2;", "Lkotlin/coroutines/CoroutineContext$Element;", "Lkotlin/jvm/functions/Function2;", "countAll", "Ll/hxi0;", "findOne", "Ll/eyi0;", Constants.INAPP_DATA_TAG, "updateState", "kotlinx-coroutines-core"}, m88122k = 2, m88123mv = {1, 9, 0}, m88125xi = 48)
public final class ThreadContextKt {

    /* JADX INFO: renamed from: a */
    @JvmField
    @NotNull
    public static final goh0 f67579a = new goh0("NO_THREAD_ELEMENTS");

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Function2<Object, CoroutineContext.Element, Object> f67580b = new Function2<Object, CoroutineContext.Element, Object>() { // from class: kotlinx.coroutines.internal.ThreadContextKt$countAll$1
        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@Nullable Object obj, @NotNull CoroutineContext.Element element) {
            if (!(element instanceof hxi0)) {
                return obj;
            }
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            int iIntValue = num != null ? num.intValue() : 1;
            return iIntValue == 0 ? element : Integer.valueOf(iIntValue + 1);
        }
    };

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final Function2<hxi0<?>, CoroutineContext.Element, hxi0<?>> f67581c = new Function2<hxi0<?>, CoroutineContext.Element, hxi0<?>>() { // from class: kotlinx.coroutines.internal.ThreadContextKt$findOne$1
        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final hxi0<?> invoke(@Nullable hxi0<?> hxi0Var, @NotNull CoroutineContext.Element element) {
            if (hxi0Var != null) {
                return hxi0Var;
            }
            if (element instanceof hxi0) {
                return (hxi0) element;
            }
            return null;
        }
    };

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final Function2<eyi0, CoroutineContext.Element, eyi0> f67582d = new Function2<eyi0, CoroutineContext.Element, eyi0>() { // from class: kotlinx.coroutines.internal.ThreadContextKt$updateState$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final eyi0 invoke(@NotNull eyi0 eyi0Var, @NotNull CoroutineContext.Element element) {
            if (element instanceof hxi0) {
                hxi0<?> hxi0Var = (hxi0) element;
                eyi0Var.m123198a(hxi0Var, hxi0Var.mo94900U(eyi0Var.context));
            }
            return eyi0Var;
        }
    };

    /* JADX INFO: renamed from: a */
    public static final void m95108a(@NotNull CoroutineContext coroutineContext, @Nullable Object obj) {
        if (obj == f67579a) {
            return;
        }
        if (obj instanceof eyi0) {
            ((eyi0) obj).m123199b(coroutineContext);
            return;
        }
        Object objFold = coroutineContext.fold(null, f67581c);
        objFold.getClass();
        ((hxi0) objFold).mo94904e(coroutineContext, obj);
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final Object m95109b(@NotNull CoroutineContext coroutineContext) {
        Object objFold = coroutineContext.fold(0, f67580b);
        objFold.getClass();
        return objFold;
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public static final Object m95110c(@NotNull CoroutineContext coroutineContext, @Nullable Object obj) {
        if (obj == null) {
            obj = m95109b(coroutineContext);
        }
        if (obj == 0) {
            return f67579a;
        }
        if (obj instanceof Integer) {
            return coroutineContext.fold(new eyi0(coroutineContext, ((Number) obj).intValue()), f67582d);
        }
        obj.getClass();
        return ((hxi0) obj).mo94900U(coroutineContext);
    }
}
