package kotlin.reflect.jvm.internal.impl.types.checker;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector$intersectTypesWithoutIntersectionType$filteredSuperAndEqualTypes$1 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C15348xc97d8c34 extends FunctionReferenceImpl implements Function2<KotlinType, KotlinType, Boolean> {
    public C15348xc97d8c34(Object obj) {
        super(2, obj, NewKotlinTypeCheckerImpl.class, "equalTypes", "equalTypes(Lorg/jetbrains/kotlin/types/KotlinType;Lorg/jetbrains/kotlin/types/KotlinType;)Z", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Boolean invoke(KotlinType kotlinType, KotlinType kotlinType2) {
        kotlinType.getClass();
        kotlinType2.getClass();
        return Boolean.valueOf(((NewKotlinTypeCheckerImpl) this.receiver).mo92903a(kotlinType, kotlinType2));
    }
}
