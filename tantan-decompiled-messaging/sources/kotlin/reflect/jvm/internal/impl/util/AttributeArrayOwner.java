package kotlin.reflect.jvm.internal.impl.util;

import com.clevertap.android.sdk.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p149l.byv;
import p149l.qkq0;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public abstract class AttributeArrayOwner<K, T> extends AbstractArrayMapOwner<K, T> {

    /* JADX INFO: renamed from: a */
    @NotNull
    public ArrayMap<T> f66355a;

    public AttributeArrayOwner(@NotNull ArrayMap<T> arrayMap) {
        arrayMap.getClass();
        this.f66355a = arrayMap;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.AbstractArrayMapOwner
    @NotNull
    /* JADX INFO: renamed from: a */
    public final ArrayMap<T> mo93122a() {
        return this.f66355a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.reflect.jvm.internal.impl.util.AbstractArrayMapOwner
    /* JADX INFO: renamed from: f */
    public final void mo93123f(@NotNull String str, @NotNull T t) {
        str.getClass();
        t.getClass();
        int iM93167e = mo92700c().m93167e(str);
        int iMo93128a = this.f66355a.mo93128a();
        if (iMo93128a == 0) {
            ArrayMap<T> arrayMap = this.f66355a;
            if (arrayMap instanceof EmptyArrayMap) {
                this.f66355a = new OneElementArrayMap(t, iM93167e);
                return;
            } else {
                qkq0.m175383a(m93132h(arrayMap, 0, "EmptyArrayMap"));
                return;
            }
        }
        if (iMo93128a == 1) {
            ArrayMap<T> arrayMap2 = this.f66355a;
            try {
                arrayMap2.getClass();
                OneElementArrayMap oneElementArrayMap = (OneElementArrayMap) arrayMap2;
                if (oneElementArrayMap.m93147f() == iM93167e) {
                    this.f66355a = new OneElementArrayMap(t, iM93167e);
                    return;
                } else {
                    ArrayMapImpl arrayMapImpl = new ArrayMapImpl();
                    arrayMapImpl.mo93129c(oneElementArrayMap.m93147f(), oneElementArrayMap.m93148g());
                    this.f66355a = arrayMapImpl;
                }
            } catch (ClassCastException e) {
                byv.m104511a(m93132h(arrayMap2, 1, "OneElementArrayMap"), e);
                return;
            }
        }
        this.f66355a.mo93129c(iM93167e, t);
    }

    /* JADX INFO: renamed from: h */
    public final String m93132h(ArrayMap<T> arrayMap, int i, String str) {
        T next;
        StringBuilder sb = new StringBuilder();
        sb.append("Race condition happened, the size of ArrayMap is " + i + " but it isn't an `" + str + '`');
        sb.append('\n');
        StringBuilder sb2 = new StringBuilder("Type: ");
        sb2.append(arrayMap.getClass());
        sb.append(sb2.toString());
        sb.append('\n');
        StringBuilder sb3 = new StringBuilder();
        Map<String, Integer> mapM93165b = mo92700c().m93165b();
        sb3.append("[\n");
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayMap, 10));
        int i2 = 0;
        for (T t : arrayMap) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            Iterator<T> it = mapM93165b.entrySet().iterator();
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
