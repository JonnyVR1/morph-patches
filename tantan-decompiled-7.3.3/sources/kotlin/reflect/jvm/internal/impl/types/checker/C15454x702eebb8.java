package kotlin.reflect.jvm.internal.impl.types.checker;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector$intersectTypesWithoutIntersectionType$filteredEqualTypes$1 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C15454x702eebb8 extends FunctionReferenceImpl implements Function2<KotlinType, KotlinType, Boolean> {
    public C15454x702eebb8(Object obj) {
        super(2, obj, TypeIntersector.class, "isStrictSupertype", "isStrictSupertype(Lorg/jetbrains/kotlin/types/KotlinType;Lorg/jetbrains/kotlin/types/KotlinType;)Z", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Boolean invoke(KotlinType kotlinType, KotlinType kotlinType2) {
        kotlinType.getClass();
        kotlinType2.getClass();
        return Boolean.valueOf(((TypeIntersector) this.receiver).m93871g(kotlinType, kotlinType2));
    }
}
