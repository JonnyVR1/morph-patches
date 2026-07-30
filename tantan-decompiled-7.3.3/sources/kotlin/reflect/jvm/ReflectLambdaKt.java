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
@Metadata(m88120d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a'\u0010\u0003\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m88121d2 = {"R", "Lkotlin/Function;", "Lkotlin/reflect/KFunction;", "a", "(Lkotlin/Function;)Lkotlin/reflect/KFunction;", "kotlin-reflection"}, m88122k = 2, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class ReflectLambdaKt {
    @ExperimentalReflectionOnLambdas
    @Nullable
    /* JADX INFO: renamed from: a */
    public static final <R> KFunction<R> m88538a(@NotNull Function<? extends R> function) {
        function.getClass();
        Metadata metadata = (Metadata) function.getClass().getAnnotation(Metadata.class);
        if (metadata == null) {
            return null;
        }
        String[] strArrM88120d1 = metadata.m88120d1();
        if (strArrM88120d1.length == 0) {
            strArrM88120d1 = null;
        }
        if (strArrM88120d1 == null) {
            return null;
        }
        Pair<JvmNameResolver, ProtoBuf.Function> pairM91913j = JvmProtoBufUtil.m91913j(strArrM88120d1, metadata.m88121d2());
        JvmNameResolver jvmNameResolverComponent1 = pairM91913j.component1();
        ProtoBuf.Function functionComponent2 = pairM91913j.component2();
        MetadataVersion metadataVersion = new MetadataVersion(metadata.m88123mv(), (metadata.m88125xi() & 8) != 0);
        Class<?> cls = function.getClass();
        ProtoBuf.TypeTable typeTable = functionComponent2.getTypeTable();
        typeTable.getClass();
        return new KFunctionImpl(EmptyContainerForLocal.INSTANCE, (SimpleFunctionDescriptor) UtilKt.m88936h(cls, functionComponent2, jvmNameResolverComponent1, new TypeTable(typeTable), metadataVersion, ReflectLambdaKt$reflect$descriptor$1.INSTANCE));
    }
}
