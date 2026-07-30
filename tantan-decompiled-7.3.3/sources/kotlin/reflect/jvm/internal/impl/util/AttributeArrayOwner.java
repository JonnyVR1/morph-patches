package kotlin.reflect.jvm.internal.impl.util;

import com.clevertap.android.sdk.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p153l.wtq0;
import p153l.yzv;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public abstract class AttributeArrayOwner<K, T> extends AbstractArrayMapOwner<K, T> {

    /* JADX INFO: renamed from: a */
    @NotNull
    public ArrayMap<T> f67029a;

    public AttributeArrayOwner(@NotNull ArrayMap<T> arrayMap) {
        arrayMap.getClass();
        this.f67029a = arrayMap;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.AbstractArrayMapOwner
    @NotNull
    /* JADX INFO: renamed from: a */
    public final ArrayMap<T> mo94013a() {
        return this.f67029a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.reflect.jvm.internal.impl.util.AbstractArrayMapOwner
    /* JADX INFO: renamed from: f */
    public final void mo94014f(@NotNull String str, @NotNull T t) {
        str.getClass();
        t.getClass();
        int iM94058e = mo93591c().m94058e(str);
        int iMo94019a = this.f67029a.mo94019a();
        if (iMo94019a == 0) {
            ArrayMap<T> arrayMap = this.f67029a;
            if (arrayMap instanceof EmptyArrayMap) {
                this.f67029a = new OneElementArrayMap(t, iM94058e);
                return;
            } else {
                wtq0.m207906a(m94023h(arrayMap, 0, "EmptyArrayMap"));
                return;
            }
        }
        if (iMo94019a == 1) {
            ArrayMap<T> arrayMap2 = this.f67029a;
            try {
                arrayMap2.getClass();
                OneElementArrayMap oneElementArrayMap = (OneElementArrayMap) arrayMap2;
                if (oneElementArrayMap.m94038f() == iM94058e) {
                    this.f67029a = new OneElementArrayMap(t, iM94058e);
                    return;
                } else {
                    ArrayMapImpl arrayMapImpl = new ArrayMapImpl();
                    arrayMapImpl.mo94020c(oneElementArrayMap.m94038f(), oneElementArrayMap.m94039g());
                    this.f67029a = arrayMapImpl;
                }
            } catch (ClassCastException e) {
                yzv.m218057a(m94023h(arrayMap2, 1, "OneElementArrayMap"), e);
                return;
            }
        }
        this.f67029a.mo94020c(iM94058e, t);
    }

    /* JADX INFO: renamed from: h */
    public final String m94023h(ArrayMap<T> arrayMap, int i, String str) {
        T next;
        StringBuilder sb = new StringBuilder();
        sb.append("Race condition happened, the size of ArrayMap is " + i + " but it isn't an `" + str + '`');
        sb.append('\n');
        StringBuilder sb2 = new StringBuilder("Type: ");
        sb2.append(arrayMap.getClass());
        sb.append(sb2.toString());
        sb.append('\n');
        StringBuilder sb3 = new StringBuilder();
        Map<String, Integer> mapM94056b = mo93591c().m94056b();
        sb3.append("[\n");
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayMap, 10));
        int i2 = 0;
        for (T t : arrayMap) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            Iterator<T> it = mapM94056b.entrySet().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((Number) ((Map.Entry) next).getValue()).intValue() != i2);
            sb3.append("  " + ((Map.Entry) next) + '[' + i2 + "]: " + t);
            sb3.append('\n');
            arrayList.add(sb3);
            i2 = i3;
        }
        sb3.append(Constants.AES_SUFFIX);
        sb3.append('\n');
        sb.append("Content: ".concat(sb3.toString()));
        sb.append('\n');
        return sb.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AttributeArrayOwner() {
        EmptyArrayMap emptyArrayMap = EmptyArrayMap.INSTANCE;
        emptyArrayMap.getClass();
        this(emptyArrayMap);
    }
}
