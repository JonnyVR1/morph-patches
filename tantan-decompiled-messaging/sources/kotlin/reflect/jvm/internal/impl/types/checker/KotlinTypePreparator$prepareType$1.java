package kotlin.reflect.jvm.internal.impl.types.checker;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class KotlinTypePreparator$prepareType$1 extends FunctionReferenceImpl implements Function1<KotlinTypeMarker, UnwrappedType> {
    public KotlinTypePreparator$prepareType$1(Object obj) {
        super(1, obj, KotlinTypePreparator.class, "prepareType", "prepareType(Lorg/jetbrains/kotlin/types/model/KotlinTypeMarker;)Lorg/jetbrains/kotlin/types/UnwrappedType;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final UnwrappedType invoke(KotlinTypeMarker kotlinTypeMarker) {
        kotlinTypeMarker.getClass();
        return ((KotlinTypePreparator) this.receiver).mo92558a(kotlinTypeMarker);
    }
}
