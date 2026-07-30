package kotlin.reflect.jvm;

import kotlin.Function;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import kotlin.reflect.jvm.internal.EmptyContainerForLocal;
import kotlin.reflect.jvm.internal.KFunctionImpl;
import kotlin.reflect.jvm.internal.UtilKt;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.MetadataVersion;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmNameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmProtoBufUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a'\u0010\u0003\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m87232d2 = {"R", "Lkotlin/Function;", "Lkotlin/reflect/KFunction;", "a", "(Lkotlin/Function;)Lkotlin/reflect/KFunction;", "kotlin-reflection"}, m87233k = 2, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class ReflectLambdaKt {
    @ExperimentalReflectionOnLambdas
    @Nullable
    /* JADX INFO: renamed from: a */
    public static final <R> KFunction<R> m87647a(@NotNull Function<? extends R> function) {
        function.getClass();
        Metadata metadata = (Metadata) function.getClass().getAnnotation(Metadata.class);
        if (metadata == null) {
            return null;
        }
        String[] strArrM87231d1 = metadata.m87231d1();
        if (strArrM87231d1.length == 0) {
            strArrM87231d1 = null;
        }
        if (strArrM87231d1 == null) {
            return null;
        }
        Pair<JvmNameResolver, ProtoBuf.Function> pairM91022j = JvmProtoBufUtil.m91022j(strArrM87231d1, metadata.m87232d2());
        JvmNameResolver jvmNameResolverComponent1 = pairM91022j.component1();
        ProtoBuf.Function functionComponent2 = pairM91022j.component2();
        MetadataVersion metadataVersion = new MetadataVersion(metadata.m87234mv(), (metadata.m87236xi() & 8) != 0);
        Class<?> cls = function.getClass();
        ProtoBuf.TypeTable typeTable = functionComponent2.getTypeTable();
        typeTable.getClass();
        return new KFunctionImpl(EmptyContainerForLocal.INSTANCE, (SimpleFunctionDescriptor) UtilKt.m88045h(cls, functionComponent2, jvmNameResolverComponent1, new TypeTable(typeTable), metadataVersion, ReflectLambdaKt$reflect$descriptor$1.INSTANCE));
    }
}
