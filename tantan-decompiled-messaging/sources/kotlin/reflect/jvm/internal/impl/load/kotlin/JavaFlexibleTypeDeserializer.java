package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawTypeImpl;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.FlexibleTypeDeserializer;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class JavaFlexibleTypeDeserializer implements FlexibleTypeDeserializer {

    @NotNull
    public static final JavaFlexibleTypeDeserializer INSTANCE = new JavaFlexibleTypeDeserializer();

    private JavaFlexibleTypeDeserializer() {
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.FlexibleTypeDeserializer
    @NotNull
    /* JADX INFO: renamed from: a */
    public KotlinType mo90320a(@NotNull ProtoBuf.Type type, @NotNull String str, @NotNull SimpleType simpleType, @NotNull SimpleType simpleType2) {
        type.getClass();
        str.getClass();
        simpleType.getClass();
        simpleType2.getClass();
        if (Intrinsics.m87488d(str, "kotlin.jvm.PlatformType")) {
            return type.hasExtension(JvmProtoBuf.f65413g) ? new RawTypeImpl(simpleType, simpleType2) : KotlinTypeFactory.m92629e(simpleType, simpleType2);
        }
        return ErrorUtils.m93002d(ErrorTypeKind.ERROR_FLEXIBLE_TYPE, str, simpleType.toString(), simpleType2.toString());
    }
}
