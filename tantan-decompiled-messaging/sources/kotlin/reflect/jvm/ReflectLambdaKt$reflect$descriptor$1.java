package kotlin.reflect.jvm;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87233k = 3, m87234mv = {2, 2, 0}, m87236xi = 48)
public final /* synthetic */ class ReflectLambdaKt$reflect$descriptor$1 extends FunctionReferenceImpl implements Function2<MemberDeserializer, ProtoBuf.Function, SimpleFunctionDescriptor> {
    public static final ReflectLambdaKt$reflect$descriptor$1 INSTANCE = new ReflectLambdaKt$reflect$descriptor$1();

    public ReflectLambdaKt$reflect$descriptor$1() {
        super(2, MemberDeserializer.class, "loadFunction", "loadFunction(Lorg/jetbrains/kotlin/metadata/ProtoBuf$Function;)Lorg/jetbrains/kotlin/descriptors/SimpleFunctionDescriptor;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final SimpleFunctionDescriptor invoke(MemberDeserializer memberDeserializer, ProtoBuf.Function function) {
        memberDeserializer.getClass();
        function.getClass();
        return memberDeserializer.m92229v(function);
    }
}
