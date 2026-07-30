package kotlin.reflect.full;

import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.KClass;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88122k = 3, m88123mv = {2, 2, 0}, m88125xi = 48)
final /* synthetic */ class KClasses$isSubclassOf$1 extends PropertyReference1Impl {
    public static final KClasses$isSubclassOf$1 INSTANCE = new KClasses$isSubclassOf$1();

    public KClasses$isSubclassOf$1() {
        super(KClasses.class, "superclasses", "getSuperclasses(Lkotlin/reflect/KClass;)Ljava/util/List;", 1);
    }

    @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.jvm.internal.PropertyReference1, kotlin.reflect.KProperty1
    public Object get(Object obj) {
        return KClasses.m88523a((KClass) obj);
    }
}
