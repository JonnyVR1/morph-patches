package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.C15167a;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.constants.AnnotationValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ArrayValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.BooleanValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ByteValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.CharValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValueFactory;
import kotlin.reflect.jvm.internal.impl.resolve.constants.DoubleValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.EnumValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ErrorValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.FloatValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.IntValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.KClassValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.LongValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ShortValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.StringValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.UByteValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.UIntValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ULongValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.UShortValue;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import org.jetbrains.annotations.NotNull;
import p149l.ddk0;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class AnnotationDeserializer {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final ModuleDescriptor f65964a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final NotFoundClasses f65965b;

    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f65966a;

        static {
            int[] iArr = new int[ProtoBuf.Annotation.Argument.Value.Type.values().length];
            try {
                iArr[ProtoBuf.Annotation.Argument.Value.Type.BYTE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ProtoBuf.Annotation.Argument.Value.Type.CHAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ProtoBuf.Annotation.Argument.Value.Type.SHORT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ProtoBuf.Annotation.Argument.Value.Type.INT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ProtoBuf.Annotation.Argument.Value.Type.LONG.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ProtoBuf.Annotation.Argument.Value.Type.FLOAT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ProtoBuf.Annotation.Argument.Value.Type.DOUBLE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ProtoBuf.Annotation.Argument.Value.Type.BOOLEAN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[ProtoBuf.Annotation.Argument.Value.Type.STRING.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[ProtoBuf.Annotation.Argument.Value.Type.CLASS.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[ProtoBuf.Annotation.Argument.Value.Type.ENUM.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[ProtoBuf.Annotation.Argument.Value.Type.ANNOTATION.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[ProtoBuf.Annotation.Argument.Value.Type.ARRAY.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            f65966a = iArr;
        }
    }

    public AnnotationDeserializer(@NotNull ModuleDescriptor moduleDescriptor, @NotNull NotFoundClasses notFoundClasses) {
        moduleDescriptor.getClass();
        notFoundClasses.getClass();
        this.f65964a = moduleDescriptor;
        this.f65965b = notFoundClasses;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final AnnotationDescriptor m92127a(@NotNull ProtoBuf.Annotation annotation, @NotNull NameResolver nameResolver) {
        annotation.getClass();
        nameResolver.getClass();
        ClassDescriptor classDescriptorM92131e = m92131e(NameResolverUtilKt.m92232a(nameResolver, annotation.getId()));
        Map mapEmptyMap = MapsKt.emptyMap();
        if (annotation.getArgumentCount() != 0 && !ErrorUtils.m93003m(classDescriptorM92131e) && DescriptorUtils.m91779t(classDescriptorM92131e)) {
            Collection<ClassConstructorDescriptor> constructors = classDescriptorM92131e.getConstructors();
            constructors.getClass();
            ClassConstructorDescriptor classConstructorDescriptor = (ClassConstructorDescriptor) CollectionsKt.singleOrNull(constructors);
            if (classConstructorDescriptor != null) {
                List<ValueParameterDescriptor> listMo88448g = classConstructorDescriptor.mo88448g();
                listMo88448g.getClass();
                List<ValueParameterDescriptor> list = listMo88448g;
                LinkedHashMap linkedHashMap = new LinkedHashMap(C15167a.m87596b(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list, 10)), 16));
                for (Object obj : list) {
                    linkedHashMap.put(((ValueParameterDescriptor) obj).getName(), obj);
                }
                List<ProtoBuf.Annotation.Argument> argumentList = annotation.getArgumentList();
                argumentList.getClass();
                ArrayList arrayList = new ArrayList();
                for (ProtoBuf.Annotation.Argument argument : argumentList) {
                    argument.getClass();
                    Pair<Name, ConstantValue<?>> pairM92130d = m92130d(argument, linkedHashMap, nameResolver);
                    if (pairM92130d != null) {
                        arrayList.add(pairM92130d);
                    }
                }
                mapEmptyMap = MapsKt.toMap(arrayList);
            }
        }
        return new AnnotationDescriptorImpl(classDescriptorM92131e.mo88458o(), mapEmptyMap, SourceElement.f64063a);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m92128b(ConstantValue<?> constantValue, KotlinType kotlinType, ProtoBuf.Annotation.Argument.Value value) {
        ProtoBuf.Annotation.Argument.Value.Type type = value.getType();
        int i = type == null ? -1 : WhenMappings.f65966a[type.ordinal()];
        if (i == 10) {
            ClassifierDescriptor classifierDescriptorMo88316e = kotlinType.mo91890G0().mo88316e();
            ClassDescriptor classDescriptor = classifierDescriptorMo88316e instanceof ClassDescriptor ? (ClassDescriptor) classifierDescriptorMo88316e : null;
            return classDescriptor == null || KotlinBuiltIns.m88191m0(classDescriptor);
        }
        if (i != 13) {
            return Intrinsics.m87488d(constantValue.mo91908a(this.f65964a), kotlinType);
        }
        if (!(constantValue instanceof ArrayValue) || ((ArrayValue) constantValue).mo91918b().size() != value.getArrayElementList().size()) {
            ddk0.m111027a("Deserialized ArrayValue should have the same number of elements as the original array value: ", constantValue);
            return false;
        }
        KotlinType kotlinTypeM88235l = m92129c().m88235l(kotlinType);
        if (kotlinTypeM88235l == null) {
            return false;
        }
        ArrayValue arrayValue = (ArrayValue) constantValue;
        Iterable indices = CollectionsKt.getIndices(arrayValue.mo91918b());
        if ((indices instanceof Collection) && ((Collection) indices).isEmpty()) {
            return true;
        }
        Iterator it = indices.iterator();
        while (it.hasNext()) {
            int iNextInt = ((IntIterator) it).nextInt();
            ConstantValue<?> constantValue2 = arrayValue.mo91918b().get(iNextInt);
            ProtoBuf.Annotation.Argument.Value arrayElement = value.getArrayElement(iNextInt);
            arrayElement.getClass();
            if (!m92128b(constantValue2, kotlinTypeM88235l, arrayElement)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: c */
    public final KotlinBuiltIns m92129c() {
        return this.f65964a.mo88546f();
    }

    /* JADX INFO: renamed from: d */
    public final Pair<Name, ConstantValue<?>> m92130d(ProtoBuf.Annotation.Argument argument, Map<Name, ? extends ValueParameterDescriptor> map, NameResolver nameResolver) {
        ValueParameterDescriptor valueParameterDescriptor = map.get(NameResolverUtilKt.m92233b(nameResolver, argument.getNameId()));
        if (valueParameterDescriptor == null) {
            return null;
        }
        Name nameM92233b = NameResolverUtilKt.m92233b(nameResolver, argument.getNameId());
        KotlinType type = valueParameterDescriptor.getType();
        type.getClass();
        ProtoBuf.Annotation.Argument.Value value = argument.getValue();
        value.getClass();
        return new Pair<>(nameM92233b, m92133g(type, value, nameResolver));
    }

    /* JADX INFO: renamed from: e */
    public final ClassDescriptor m92131e(ClassId classId) {
        return FindClassInModuleKt.m88509d(this.f65964a, classId, this.f65965b);
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final ConstantValue<?> m92132f(@NotNull KotlinType kotlinType, @NotNull ProtoBuf.Annotation.Argument.Value value, @NotNull NameResolver nameResolver) {
        kotlinType.getClass();
        value.getClass();
        nameResolver.getClass();
        Boolean boolMo90875d = Flags.f65358S.mo90875d(value.getFlags());
        boolMo90875d.getClass();
        boolean zBooleanValue = boolMo90875d.booleanValue();
        ProtoBuf.Annotation.Argument.Value.Type type = value.getType();
        switch (type == null ? -1 : WhenMappings.f65966a[type.ordinal()]) {
            case 1:
                byte intValue = (byte) value.getIntValue();
                return zBooleanValue ? new UByteValue(intValue) : new ByteValue(intValue);
            case 2:
                return new CharValue((char) value.getIntValue());
            case 3:
                short intValue2 = (short) value.getIntValue();
                return zBooleanValue ? new UShortValue(intValue2) : new ShortValue(intValue2);
            case 4:
                int intValue3 = (int) value.getIntValue();
                return zBooleanValue ? new UIntValue(intValue3) : new IntValue(intValue3);
            case 5:
                long intValue4 = value.getIntValue();
                return zBooleanValue ? new ULongValue(intValue4) : new LongValue(intValue4);
            case 6:
                return new FloatValue(value.getFloatValue());
            case 7:
                return new DoubleValue(value.getDoubleValue());
            case 8:
                return new BooleanValue(value.getIntValue() != 0);
            case 9:
                return new StringValue(nameResolver.getString(value.getStringValue()));
            case 10:
                return new KClassValue(NameResolverUtilKt.m92232a(nameResolver, value.getClassId()), value.getArrayDimensionCount());
            case 11:
                return new EnumValue(NameResolverUtilKt.m92232a(nameResolver, value.getClassId()), NameResolverUtilKt.m92233b(nameResolver, value.getEnumValueId()));
            case 12:
                ProtoBuf.Annotation annotation = value.getAnnotation();
                annotation.getClass();
                return new AnnotationValue(m92127a(annotation, nameResolver));
            case 13:
                ConstantValueFactory constantValueFactory = ConstantValueFactory.INSTANCE;
                List<ProtoBuf.Annotation.Argument.Value> arrayElementList = value.getArrayElementList();
                arrayElementList.getClass();
                List<ProtoBuf.Annotation.Argument.Value> list = arrayElementList;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                for (ProtoBuf.Annotation.Argument.Value value2 : list) {
                    SimpleType simpleTypeM88232i = m92129c().m88232i();
                    simpleTypeM88232i.getClass();
                    value2.getClass();
                    arrayList.add(m92132f(simpleTypeM88232i, value2, nameResolver));
                }
                return constantValueFactory.m91923c(arrayList, kotlinType);
            default:
                throw new IllegalStateException(("Unsupported annotation argument type: " + value.getType() + " (expected " + kotlinType + ')').toString());
        }
    }

    /* JADX INFO: renamed from: g */
    public final ConstantValue<?> m92133g(KotlinType kotlinType, ProtoBuf.Annotation.Argument.Value value, NameResolver nameResolver) {
        ConstantValue<?> constantValueM92132f = m92132f(kotlinType, value, nameResolver);
        if (!m92128b(constantValueM92132f, kotlinType, value)) {
            constantValueM92132f = null;
        }
        if (constantValueM92132f != null) {
            return constantValueM92132f;
        }
        return ErrorValue.Companion.m91928a("Unexpected argument value: actual type " + value.getType() + " != expected type " + kotlinType);
    }
}
