package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoBufUtilKt;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmProtoBufUtil;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class AbstractBinaryClassAnnotationLoaderKt {
    @Nullable
    /* JADX INFO: renamed from: a */
    public static final MemberSignature m90168a(@NotNull ProtoBuf.Property property, @NotNull NameResolver nameResolver, @NotNull TypeTable typeTable, boolean z, boolean z2, boolean z3) {
        property.getClass();
        nameResolver.getClass();
        typeTable.getClass();
        GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, JvmProtoBuf.JvmPropertySignature> generatedExtension = JvmProtoBuf.f65410d;
        generatedExtension.getClass();
        JvmProtoBuf.JvmPropertySignature jvmPropertySignature = (JvmProtoBuf.JvmPropertySignature) ProtoBufUtilKt.m90895a(property, generatedExtension);
        if (jvmPropertySignature == null) {
            return null;
        }
        if (z) {
            JvmMemberSignature.Field fieldM91027c = JvmProtoBufUtil.INSTANCE.m91027c(property, nameResolver, typeTable, z3);
            if (fieldM91027c == null) {
                return null;
            }
            return MemberSignature.Companion.m90371b(fieldM91027c);
        }
        if (!z2 || !jvmPropertySignature.hasSyntheticMethod()) {
            return null;
        }
        MemberSignature.Companion companion = MemberSignature.Companion;
        JvmProtoBuf.JvmMethodSignature syntheticMethod = jvmPropertySignature.getSyntheticMethod();
        syntheticMethod.getClass();
        return companion.m90372c(nameResolver, syntheticMethod);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ MemberSignature m90169b(ProtoBuf.Property property, NameResolver nameResolver, TypeTable typeTable, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 8) != 0) {
            z = false;
        }
        if ((i & 16) != 0) {
            z2 = false;
        }
        if ((i & 32) != 0) {
            z3 = true;
        }
        return m90168a(property, nameResolver, typeTable, z, z2, z3);
    }
}
