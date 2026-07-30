package kotlin.coroutines;

import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.core.data.MessageType;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftBubblePopupTitlePosition;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.Unit;
import kotlin.coroutines.CombinedContext;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.qkq0;

/* JADX INFO: loaded from: classes2.dex */
@SinceKotlin
@Metadata(m87231d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003:\u0001(B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ(\u0010\t\u001a\u0004\u0018\u0001H\n\"\b\b\u0000\u0010\n*\u00020\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\n0\fH\u0096\u0002¢\u0006\u0002\u0010\rJ5\u0010\u000e\u001a\u0002H\u000f\"\u0004\b\u0000\u0010\u000f2\u0006\u0010\u0010\u001a\u0002H\u000f2\u0018\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u0002H\u000f\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u0002H\u000f0\u0012H\u0016¢\u0006\u0002\u0010\u0013J\u0014\u0010\u0014\u001a\u00020\u00012\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\fH\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0002J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0010\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0000H\u0002J\u0013\u0010\u001b\u001a\u00020\u00182\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0096\u0002J\b\u0010\u001e\u001a\u00020\u0016H\u0016J\b\u0010\u001f\u001a\u00020 H\u0016J\b\u0010!\u001a\u00020\u001dH\u0002J\u0019\u0010\"\u001a\u00020#2\n\u0010$\u001a\u00060%j\u0002`&H\u0002¢\u0006\u0002\u0010'R\u000e\u0010\u0004\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006)"}, m87232d2 = {"Lkotlin/coroutines/CombinedContext;", "Lkotlin/coroutines/CoroutineContext;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", BLiveGiftBubblePopupTitlePosition.left, "element", "Lkotlin/coroutines/CoroutineContext$Element;", "<init>", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext$Element;)V", "get", "E", Constants.KEY_KEY, "Lkotlin/coroutines/CoroutineContext$Key;", "(Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext$Element;", "fold", "R", "initial", MessageType.operation, "Lkotlin/Function2;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "minusKey", "size", "", "contains", "", "containsAll", "context", "equals", "other", "", "hashCode", "toString", "", "writeReplace", "readObject", "", "input", "Ljava/io/ObjectInputStream;", "Lkotlin/internal/ReadObjectParameterType;", "(Ljava/io/ObjectInputStream;)V", "Serialized", "kotlin-stdlib"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class CombinedContext implements CoroutineContext, Serializable {

    @NotNull
    private final CoroutineContext.Element element;

    @NotNull
    private final CoroutineContext left;

    @Metadata(m87231d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0002\u0018\u0000 \r2\u00060\u0001j\u0002`\u0002:\u0001\rB\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u000b\u001a\u00020\fH\u0002R\u0019\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\t¨\u0006\u000e"}, m87232d2 = {"Lkotlin/coroutines/CombinedContext$Serialized;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "elements", "", "Lkotlin/coroutines/CoroutineContext;", "<init>", "([Lkotlin/coroutines/CoroutineContext;)V", "getElements", "()[Lkotlin/coroutines/CoroutineContext;", "[Lkotlin/coroutines/CoroutineContext;", "readResolve", "", "Companion", "kotlin-stdlib"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    @SourceDebugExtension
    public static final class Serialized implements Serializable {
        private static final long serialVersionUID = 0;

        @NotNull
        private final CoroutineContext[] elements;

        public Serialized(@NotNull CoroutineContext[] coroutineContextArr) {
            coroutineContextArr.getClass();
            this.elements = coroutineContextArr;
        }

        private final Object readResolve() {
            CoroutineContext[] coroutineContextArr = this.elements;
            CoroutineContext coroutineContextPlus = EmptyCoroutineContext.INSTANCE;
            for (CoroutineContext coroutineContext : coroutineContextArr) {
                coroutineContextPlus = coroutineContextPlus.plus(coroutineContext);
            }
            return coroutineContextPlus;
        }

        @NotNull
        public final CoroutineContext[] getElements() {
            return this.elements;
        }
    }

    public CombinedContext(@NotNull CoroutineContext coroutineContext, @NotNull CoroutineContext.Element element) {
        coroutineContext.getClass();
        element.getClass();
        this.left = coroutineContext;
        this.element = element;
    }

    /* JADX INFO: renamed from: a */
    public static Unit m87355a(CoroutineContext[] coroutineContextArr, Ref.IntRef intRef, Unit unit, CoroutineContext.Element element) {
        unit.getClass();
        element.getClass();
        int i = intRef.element;
        intRef.element = i + 1;
        coroutineContextArr[i] = element;
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: c */
    public static String m87356c(String str, CoroutineContext.Element element) {
        str.getClass();
        element.getClass();
        if (str.length() == 0) {
            return element.toString();
        }
        return str + ", " + element;
    }

    private final boolean contains(CoroutineContext.Element element) {
        return Intrinsics.m87488d(get(element.getKey()), element);
    }

    private final boolean containsAll(CombinedContext context) {
        while (contains(context.element)) {
            CoroutineContext coroutineContext = context.left;
            if (!(coroutineContext instanceof CombinedContext)) {
                coroutineContext.getClass();
                return contains((CoroutineContext.Element) coroutineContext);
            }
            context = (CombinedContext) coroutineContext;
        }
        return false;
    }

    private final void readObject(ObjectInputStream input) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final int size() {
        int i = 2;
        while (true) {
            CoroutineContext coroutineContext = this.left;
            this = coroutineContext instanceof CombinedContext ? (CombinedContext) coroutineContext : null;
            if (this == null) {
                return i;
            }
            i++;
        }
    }

    private final Object writeReplace() {
        int size = size();
        final CoroutineContext[] coroutineContextArr = new CoroutineContext[size];
        final Ref.IntRef intRef = new Ref.IntRef();
        fold(Unit.INSTANCE, new Function2() { // from class: l.ne5
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return CombinedContext.m87355a(coroutineContextArr, intRef, (Unit) obj, (CoroutineContext.Element) obj2);
            }
        });
        if (intRef.element == size) {
            return new Serialized(coroutineContextArr);
        }
        qkq0.m175383a("Check failed.");
        return null;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CombinedContext)) {
            return false;
        }
        CombinedContext combinedContext = (CombinedContext) other;
        return combinedContext.size() == size() && combinedContext.containsAll(this);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public <R> R fold(R initial, @NotNull Function2<? super R, ? super CoroutineContext.Element, ? extends R> operation) {
        operation.getClass();
        return operation.invoke((Object) this.left.fold(initial, operation), this.element);
    }

    @Override // kotlin.coroutines.CoroutineContext
    @Nullable
    public <E extends CoroutineContext.Element> E get(@NotNull CoroutineContext.Key<E> key) {
        key.getClass();
        while (true) {
            E e = (E) this.element.get(key);
            if (e != null) {
                return e;
            }
            CoroutineContext coroutineContext = this.left;
            if (!(coroutineContext instanceof CombinedContext)) {
                return (E) coroutineContext.get(key);
            }
            this = (CombinedContext) coroutineContext;
        }
    }

    public int hashCode() {
        return this.left.hashCode() + this.element.hashCode();
    }

    @Override // kotlin.coroutines.CoroutineContext
    @NotNull
    public CoroutineContext minusKey(@NotNull CoroutineContext.Key<?> key) {
        key.getClass();
        CoroutineContext.Element element = this.element.get(key);
        CoroutineContext coroutineContext = this.left;
        if (element != null) {
            return coroutineContext;
        }
        CoroutineContext coroutineContextMinusKey = coroutineContext.minusKey(key);
        if (coroutineContextMinusKey == this.left) {
            return this;
        }
        EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.INSTANCE;
        CoroutineContext.Element element2 = this.element;
        return coroutineContextMinusKey == emptyCoroutineContext ? element2 : new CombinedContext(coroutineContextMinusKey, element2);
    }

    @Override // kotlin.coroutines.CoroutineContext
    @NotNull
    public /* bridge */ CoroutineContext plus(@NotNull CoroutineContext coroutineContext) {
        return CoroutineContext.DefaultImpls.m87361b(this, coroutineContext);
    }

    @NotNull
    public String toString() {
        return "[" + ((String) fold("", new Function2() { // from class: l.oe5
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return CombinedContext.m87356c((String) obj, (CoroutineContext.Element) obj2);
            }
        })) + ']';
    }
}
