package kotlinx.coroutines.internal;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.cpi0;
import p149l.goi0;
import p149l.yfh0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a#\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a!\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\n\u0010\u000b\"\u0014\u0010\u000e\u001a\u00020\f8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\n\u0010\r\"*\u0010\u0012\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011\"2\u0010\u0014\u001a \u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u0013\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00130\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0011\"&\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00150\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0011¨\u0006\u0018"}, m87232d2 = {"Lkotlin/coroutines/CoroutineContext;", "context", "", "b", "(Lkotlin/coroutines/CoroutineContext;)Ljava/lang/Object;", "countOrElement", "c", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;)Ljava/lang/Object;", "oldState", "", "a", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;)V", "Ll/yfh0;", "Ll/yfh0;", "NO_THREAD_ELEMENTS", "Lkotlin/Function2;", "Lkotlin/coroutines/CoroutineContext$Element;", "Lkotlin/jvm/functions/Function2;", "countAll", "Ll/goi0;", "findOne", "Ll/cpi0;", Constants.INAPP_DATA_TAG, "updateState", "kotlinx-coroutines-core"}, m87233k = 2, m87234mv = {1, 9, 0}, m87236xi = 48)
public final class ThreadContextKt {

    /* JADX INFO: renamed from: a */
    @JvmField
    @NotNull
    public static final yfh0 f66905a = new yfh0("NO_THREAD_ELEMENTS");

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Function2<Object, CoroutineContext.Element, Object> f66906b = new Function2<Object, CoroutineContext.Element, Object>() { // from class: kotlinx.coroutines.internal.ThreadContextKt$countAll$1
        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@Nullable Object obj, @NotNull CoroutineContext.Element element) {
            if (!(element instanceof goi0)) {
                return obj;
            }
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            int iIntValue = num != null ? num.intValue() : 1;
            return iIntValue == 0 ? element : Integer.valueOf(iIntValue + 1);
        }
    };

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final Function2<goi0<?>, CoroutineContext.Element, goi0<?>> f66907c = new Function2<goi0<?>, CoroutineContext.Element, goi0<?>>() { // from class: kotlinx.coroutines.internal.ThreadContextKt$findOne$1
        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final goi0<?> invoke(@Nullable goi0<?> goi0Var, @NotNull CoroutineContext.Element element) {
            if (goi0Var != null) {
                return goi0Var;
            }
            if (element instanceof goi0) {
                return (goi0) element;
            }
            return null;
        }
    };

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final Function2<cpi0, CoroutineContext.Element, cpi0> f66908d = new Function2<cpi0, CoroutineContext.Element, cpi0>() { // from class: kotlinx.coroutines.internal.ThreadContextKt$updateState$1
        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final cpi0 invoke(@NotNull cpi0 cpi0Var, @NotNull CoroutineContext.Element element) {
            if (element instanceof goi0) {
                goi0<?> goi0Var = (goi0) element;
                cpi0Var.m108132a(goi0Var, goi0Var.mo94008T(cpi0Var.context));
            }
            return cpi0Var;
        }
    };

    /* JADX INFO: renamed from: a */
    public static final void m94215a(@NotNull CoroutineContext coroutineContext, @Nullable Object obj) {
        if (obj == f66905a) {
            return;
        }
        if (obj instanceof cpi0) {
            ((cpi0) obj).m108133b(coroutineContext);
            return;
        }
        Object objFold = coroutineContext.fold(null, f66907c);
        objFold.getClass();
        ((goi0) objFold).mo94012e(coroutineContext, obj);
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final Object m94216b(@NotNull CoroutineContext coroutineContext) {
        Object objFold = coroutineContext.fold(0, f66906b);
        objFold.getClass();
        return objFold;
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public static final Object m94217c(@NotNull CoroutineContext coroutineContext, @Nullable Object obj) {
        if (obj == null) {
            obj = m94216b(coroutineContext);
        }
        if (obj == 0) {
            return f66905a;
        }
        if (obj instanceof Integer) {
            return coroutineContext.fold(new cpi0(coroutineContext, ((Number) obj).intValue()), f66908d);
        }
        obj.getClass();
        return ((goi0) obj).mo94008T(coroutineContext);
    }
}
