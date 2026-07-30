package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class DeserializedClassDescriptor$computeValueClassRepresentation$2 extends FunctionReferenceImpl implements Function1<Name, SimpleType> {
    public DeserializedClassDescriptor$computeValueClassRepresentation$2(Object obj) {
        super(1, obj, DeserializedClassDescriptor.class, "getValueClassPropertyType", "getValueClassPropertyType(Lorg/jetbrains/kotlin/name/Name;)Lorg/jetbrains/kotlin/types/SimpleType;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final SimpleType invoke(Name name) {
        name.getClass();
        return ((DeserializedClassDescriptor) this.receiver).m92321c1(name);
    }
}
