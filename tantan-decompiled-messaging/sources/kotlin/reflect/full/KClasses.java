package kotlin.reflect.full;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KType;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0006\",\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00000\u0001*\u0006\u0012\u0002\b\u00030\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, m87232d2 = {"Lkotlin/reflect/KClass;", "", "a", "(Lkotlin/reflect/KClass;)Ljava/util/List;", "getSuperclasses$annotations", "(Lkotlin/reflect/KClass;)V", "superclasses", "kotlin-reflection"}, m87233k = 2, m87234mv = {2, 2, 0}, m87236xi = 48)
@JvmName
@SourceDebugExtension
public final class KClasses {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final List<KClass<?>> m87632a(@NotNull KClass<?> kClass) {
        kClass.getClass();
        List<KType> listMo87467c = kClass.mo87467c();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = listMo87467c.iterator();
        while (it.hasNext()) {
            KClassifier kClassifierMo87559i = ((KType) it.next()).mo87559i();
            KClass kClass2 = kClassifierMo87559i instanceof KClass ? (KClass) kClassifierMo87559i : null;
            if (kClass2 != null) {
                arrayList.add(kClass2);
            }
        }
        return arrayList;
    }
}
