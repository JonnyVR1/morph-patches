package kotlin.reflect.jvm.internal;

import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.live.base.data.BLiveTraceServerLocation;
import com.tencent.open.SocialOperation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import kotlin.reflect.jvm.internal.impl.load.java.JvmAbi;
import kotlin.reflect.jvm.internal.impl.load.kotlin.JvmPackagePartSource;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoBufUtilKt;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmProtoBufUtil;
import kotlin.reflect.jvm.internal.impl.name.NameUtils;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerSource;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedPropertyDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.zwq;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0004\u0007\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0001\u0004\u000b\f\r\u000e¨\u0006\u000f"}, m87232d2 = {"Lkotlin/reflect/jvm/internal/JvmPropertySignature;", "", "<init>", "()V", "", "a", "()Ljava/lang/String;", "KotlinProperty", "JavaMethodProperty", "JavaField", "MappedKotlinProperty", "Lkotlin/reflect/jvm/internal/JvmPropertySignature$JavaField;", "Lkotlin/reflect/jvm/internal/JvmPropertySignature$JavaMethodProperty;", "Lkotlin/reflect/jvm/internal/JvmPropertySignature$KotlinProperty;", "Lkotlin/reflect/jvm/internal/JvmPropertySignature$MappedKotlinProperty;", "kotlin-reflection"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public abstract class JvmPropertySignature {

    @Metadata(m87231d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, m87232d2 = {"Lkotlin/reflect/jvm/internal/JvmPropertySignature$JavaField;", "Lkotlin/reflect/jvm/internal/JvmPropertySignature;", "Ljava/lang/reflect/Field;", "field", "<init>", "(Ljava/lang/reflect/Field;)V", "", "a", "()Ljava/lang/String;", "Ljava/lang/reflect/Field;", "b", "()Ljava/lang/reflect/Field;", "kotlin-reflection"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class JavaField extends JvmPropertySignature {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final Field field;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public JavaField(@NotNull Field field) {
            super(null);
            field.getClass();
            this.field = field;
        }

        @Override // kotlin.reflect.jvm.internal.JvmPropertySignature
        @NotNull
        /* JADX INFO: renamed from: a */
        public String getString() {
            StringBuilder sb = new StringBuilder();
            String name = this.field.getName();
            name.getClass();
            sb.append(JvmAbi.m89431b(name));
            sb.append("()");
            Class<?> type = this.field.getType();
            type.getClass();
            sb.append(ReflectClassUtilKt.m88992f(type));
            return sb.toString();
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final Field getField() {
            return this.field;
        }
    }

    @Metadata(m87231d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\n\u001a\u0004\b\r\u0010\f¨\u0006\u000e"}, m87232d2 = {"Lkotlin/reflect/jvm/internal/JvmPropertySignature$JavaMethodProperty;", "Lkotlin/reflect/jvm/internal/JvmPropertySignature;", "Ljava/lang/reflect/Method;", "getterMethod", "setterMethod", "<init>", "(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V", "", "a", "()Ljava/lang/String;", "Ljava/lang/reflect/Method;", "b", "()Ljava/lang/reflect/Method;", "c", "kotlin-reflection"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class JavaMethodProperty extends JvmPropertySignature {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final Method getterMethod;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @Nullable
        public final Method setterMethod;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public JavaMethodProperty(@NotNull Method method, @Nullable Method method2) {
            super(null);
            method.getClass();
            this.getterMethod = method;
            this.setterMethod = method2;
        }

        @Override // kotlin.reflect.jvm.internal.JvmPropertySignature
        @NotNull
        /* JADX INFO: renamed from: a */
        public String getString() {
            return RuntimeTypeMapperKt.m88037d(this.getterMethod);
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final Method getGetterMethod() {
            return this.getterMethod;
        }

        @Nullable
        /* JADX INFO: renamed from: c, reason: from getter */
        public final Method getSetterMethod() {
            return this.setterMethod;
        }
    }

    @Metadata(m87231d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0019\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0014\u0010&\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006'"}, m87232d2 = {"Lkotlin/reflect/jvm/internal/JvmPropertySignature$KotlinProperty;", "Lkotlin/reflect/jvm/internal/JvmPropertySignature;", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "descriptor", "Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Property;", "proto", "Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$JvmPropertySignature;", SocialOperation.GAME_SIGNATURE, "Lkotlin/reflect/jvm/internal/impl/metadata/deserialization/NameResolver;", "nameResolver", "Lkotlin/reflect/jvm/internal/impl/metadata/deserialization/TypeTable;", "typeTable", "<init>", "(Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;Lorg/jetbrains/kotlin/metadata/ProtoBuf$Property;Lorg/jetbrains/kotlin/metadata/jvm/JvmProtoBuf$JvmPropertySignature;Lorg/jetbrains/kotlin/metadata/deserialization/NameResolver;Lorg/jetbrains/kotlin/metadata/deserialization/TypeTable;)V", "", "a", "()Ljava/lang/String;", "c", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;", "b", "Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Property;", "getProto", "()Lorg/jetbrains/kotlin/metadata/ProtoBuf$Property;", "Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$JvmPropertySignature;", "getSignature", "()Lorg/jetbrains/kotlin/metadata/jvm/JvmProtoBuf$JvmPropertySignature;", Constants.INAPP_DATA_TAG, "Lkotlin/reflect/jvm/internal/impl/metadata/deserialization/NameResolver;", "getNameResolver", "()Lorg/jetbrains/kotlin/metadata/deserialization/NameResolver;", "e", "Lkotlin/reflect/jvm/internal/impl/metadata/deserialization/TypeTable;", "getTypeTable", "()Lorg/jetbrains/kotlin/metadata/deserialization/TypeTable;", "f", "Ljava/lang/String;", "string", "kotlin-reflection"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    @SourceDebugExtension
    public static final class KotlinProperty extends JvmPropertySignature {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final PropertyDescriptor descriptor;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final ProtoBuf.Property proto;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @NotNull
        public final JvmProtoBuf.JvmPropertySignature signature;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @NotNull
        public final NameResolver nameResolver;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @NotNull
        public final TypeTable typeTable;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @NotNull
        public final String string;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public KotlinProperty(@NotNull PropertyDescriptor propertyDescriptor, @NotNull ProtoBuf.Property property, @NotNull JvmProtoBuf.JvmPropertySignature jvmPropertySignature, @NotNull NameResolver nameResolver, @NotNull TypeTable typeTable) {
            String str;
            super(null);
            propertyDescriptor.getClass();
            property.getClass();
            jvmPropertySignature.getClass();
            nameResolver.getClass();
            typeTable.getClass();
            this.descriptor = propertyDescriptor;
            this.proto = property;
            this.signature = jvmPropertySignature;
            this.nameResolver = nameResolver;
            this.typeTable = typeTable;
            if (jvmPropertySignature.hasGetter()) {
                str = nameResolver.getString(jvmPropertySignature.getGetter().getName()) + nameResolver.getString(jvmPropertySignature.getGetter().getDesc());
            } else {
                JvmMemberSignature.Field fieldM91018d = JvmProtoBufUtil.m91018d(JvmProtoBufUtil.INSTANCE, property, nameResolver, typeTable, false, 8, null);
                if (fieldM91018d == null) {
                    zwq.m220685a("No field signature for property: ", propertyDescriptor);
                    throw null;
                }
                String strM91009b = fieldM91018d.m91009b();
                str = JvmAbi.m89431b(strM91009b) + m87695c() + "()" + fieldM91018d.m91010c();
            }
            this.string = str;
        }

        @Override // kotlin.reflect.jvm.internal.JvmPropertySignature
        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public String getString() {
            return this.string;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final PropertyDescriptor getDescriptor() {
            return this.descriptor;
        }

        /* JADX INFO: renamed from: c */
        public final String m87695c() {
            String string;
            DeclarationDescriptor declarationDescriptorMo88299b = this.descriptor.mo88299b();
            declarationDescriptorMo88299b.getClass();
            if (Intrinsics.m87488d(this.descriptor.getVisibility(), DescriptorVisibilities.f64025d) && (declarationDescriptorMo88299b instanceof DeserializedClassDescriptor)) {
                ProtoBuf.Class classM92316X0 = ((DeserializedClassDescriptor) declarationDescriptorMo88299b).m92316X0();
                GeneratedMessageLite.GeneratedExtension<ProtoBuf.Class, Integer> generatedExtension = JvmProtoBuf.f65415i;
                generatedExtension.getClass();
                Integer num = (Integer) ProtoBufUtilKt.m90895a(classM92316X0, generatedExtension);
                if (num == null || (string = this.nameResolver.getString(num.intValue())) == null) {
                    string = BLiveTraceServerLocation.main;
                }
                return "$" + NameUtils.m91087b(string);
            }
            if (!Intrinsics.m87488d(this.descriptor.getVisibility(), DescriptorVisibilities.f64022a) || !(declarationDescriptorMo88299b instanceof PackageFragmentDescriptor)) {
                return "";
            }
            PropertyDescriptor propertyDescriptor = this.descriptor;
            propertyDescriptor.getClass();
            DeserializedContainerSource deserializedContainerSourceMo92288X = ((DeserializedPropertyDescriptor) propertyDescriptor).mo92288X();
            if (!(deserializedContainerSourceMo92288X instanceof JvmPackagePartSource)) {
                return "";
            }
            JvmPackagePartSource jvmPackagePartSource = (JvmPackagePartSource) deserializedContainerSourceMo92288X;
            if (jvmPackagePartSource.m90329f() == null) {
                return "";
            }
            return "$" + jvmPackagePartSource.m90331h().m91082b();
        }

        @NotNull
        /* JADX INFO: renamed from: d, reason: from getter */
        public final NameResolver getNameResolver() {
            return this.nameResolver;
        }

        @NotNull
        /* JADX INFO: renamed from: e, reason: from getter */
        public final ProtoBuf.Property getProto() {
            return this.proto;
        }

        @NotNull
        /* JADX INFO: renamed from: f, reason: from getter */
        public final JvmProtoBuf.JvmPropertySignature getSignature() {
            return this.signature;
        }

        @NotNull
        /* JADX INFO: renamed from: g, reason: from getter */
        public final TypeTable getTypeTable() {
            return this.typeTable;
        }
    }

    @Metadata(m87231d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\n\u001a\u0004\b\r\u0010\f¨\u0006\u000e"}, m87232d2 = {"Lkotlin/reflect/jvm/internal/JvmPropertySignature$MappedKotlinProperty;", "Lkotlin/reflect/jvm/internal/JvmPropertySignature;", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature$KotlinFunction;", "getterSignature", "setterSignature", "<init>", "(Lkotlin/reflect/jvm/internal/JvmFunctionSignature$KotlinFunction;Lkotlin/reflect/jvm/internal/JvmFunctionSignature$KotlinFunction;)V", "", "a", "()Ljava/lang/String;", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature$KotlinFunction;", "b", "()Lkotlin/reflect/jvm/internal/JvmFunctionSignature$KotlinFunction;", "c", "kotlin-reflection"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class MappedKotlinProperty extends JvmPropertySignature {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final JvmFunctionSignature.KotlinFunction getterSignature;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @Nullable
        public final JvmFunctionSignature.KotlinFunction setterSignature;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MappedKotlinProperty(@NotNull JvmFunctionSignature.KotlinFunction kotlinFunction, @Nullable JvmFunctionSignature.KotlinFunction kotlinFunction2) {
            super(null);
            kotlinFunction.getClass();
            this.getterSignature = kotlinFunction;
            this.setterSignature = kotlinFunction2;
        }

        @Override // kotlin.reflect.jvm.internal.JvmPropertySignature
        @NotNull
        /* JADX INFO: renamed from: a */
        public String getString() {
            return this.getterSignature.get_signature();
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final JvmFunctionSignature.KotlinFunction getGetterSignature() {
            return this.getterSignature;
        }

        @Nullable
        /* JADX INFO: renamed from: c, reason: from getter */
        public final JvmFunctionSignature.KotlinFunction getSetterSignature() {
            return this.setterSignature;
        }
    }

    public /* synthetic */ JvmPropertySignature(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public abstract String getString();

    private JvmPropertySignature() {
    }
}
