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
import kotlin.ranges.C15274a;
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
import p153l.jmk0;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class AnnotationDeserializer {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final ModuleDescriptor f66638a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final NotFoundClasses f66639b;

    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f66640a;

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
            f66640a = iArr;
        }
    }

    public AnnotationDeserializer(@NotNull ModuleDescriptor moduleDescriptor, @NotNull NotFoundClasses notFoundClasses) {
        moduleDescriptor.getClass();
        notFoundClasses.getClass();
        this.f66638a = moduleDescriptor;
        this.f66639b = notFoundClasses;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final AnnotationDescriptor m93018a(@NotNull ProtoBuf.Annotation annotation, @NotNull NameResolver nameResolver) {
        annotation.getClass();
        nameResolver.getClass();
        ClassDescriptor classDescriptorM93022e = m93022e(NameResolverUtilKt.m93123a(nameResolver, annotation.getId()));
        Map mapEmptyMap = MapsKt.emptyMap();
        if (annotation.getArgumentCount() != 0 && !ErrorUtils.m93894m(classDescriptorM93022e) && DescriptorUtils.m92670t(classDescriptorM93022e)) {
            Collection<ClassConstructorDescriptor> constructors = classDescriptorM93022e.getConstructors();
            constructors.getClass();
            ClassConstructorDescriptor classConstructorDescriptor = (ClassConstructorDescriptor) CollectionsKt.singleOrNull(constructors);
            if (classConstructorDescriptor != null) {
                List<ValueParameterDescriptor> listMo89339g = classConstructorDescriptor.mo89339g();
                listMo89339g.getClass();
                List<ValueParameterDescriptor> list = listMo89339g;
                LinkedHashMap linkedHashMap = new LinkedHashMap(C15274a.m88486b(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list, 10)), 16));
                for (Object obj : list) {
                    linkedHashMap.put(((ValueParameterDescriptor) obj).getName(), obj);
                }
                List<ProtoBuf.Annotation.Argument> argumentList = annotation.getArgumentList();
                argumentList.getClass();
                ArrayList arrayList = new ArrayList();
                for (ProtoBuf.Annotation.Argument argument : argumentList) {
                    argument.getClass();
                    Pair<Name, ConstantValue<?>> pairM93021d = m93021d(argument, linkedHashMap, nameResolver);
                    if (pairM93021d != null) {
                        arrayList.add(pairM93021d);
                    }
                }
                mapEmptyMap = MapsKt.toMap(arrayList);
            }
        }
        return new AnnotationDescriptorImpl(classDescriptorM93022e.mo89349o(), mapEmptyMap, SourceElement.f64737a);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m93019b(ConstantValue<?> constantValue, KotlinType kotlinType, ProtoBuf.Annotation.Argument.Value value) {
        ProtoBuf.Annotation.Argument.Value.Type type = value.getType();
        int i = type == null ? -1 : WhenMappings.f66640a[type.ordinal()];
        if (i == 10) {
            ClassifierDescriptor classifierDescriptorMo89207e = kotlinType.mo92781G0().mo89207e();
            ClassDescriptor classDescriptor = classifierDescriptorMo89207e instanceof ClassDescriptor ? (ClassDescriptor) classifierDescriptorMo89207e : null;
            return classDescriptor == null || KotlinBuiltIns.m89082m0(classDescriptor);
        }
        if (i != 13) {
            return Intrinsics.m88377d(constantValue.mo92799a(this.f66638a), kotlinType);
        }
        if (!(constantValue instanceof ArrayValue) || ((ArrayValue) constantValue).mo92809b().size() != value.getArrayElementList().size()) {
            jmk0.m146166a("Deserialized ArrayValue should have the same number of elements as the original array value: ", constantValue);
            return false;
        }
        KotlinType kotlinTypeM89126l = m93020c().m89126l(kotlinType);
        if (kotlinTypeM89126l == null) {
            return false;
        }
        ArrayValue arrayValue = (ArrayValue) constantValue;
        Iterable indices = CollectionsKt.getIndices(arrayValue.mo92809b());
        if ((indices instanceof Collection) && ((Collection) indices).isEmpty()) {
            return true;
        }
        Iterator it = indices.iterator();
        while (it.hasNext()) {
            int iNextInt = ((IntIterator) it).nextInt();
            ConstantValue<?> constantValue2 = arrayValue.mo92809b().get(iNextInt);
            ProtoBuf.Annotation.Argument.Value arrayElement = value.getArrayElement(iNextInt);
            arrayElement.getClass();
            if (!m93019b(constantValue2, kotlinTypeM89126l, arrayElement)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: c */
    public final KotlinBuiltIns m93020c() {
        return this.f66638a.mo89437f();
    }

    /* JADX INFO: renamed from: d */
    public final Pair<Name, ConstantValue<?>> m93021d(ProtoBuf.Annotation.Argument argument, Map<Name, ? extends ValueParameterDescriptor> map, NameResolver nameResolver) {
        ValueParameterDescriptor valueParameterDescriptor = map.get(NameResolverUtilKt.m93124b(nameResolver, argument.getNameId()));
        if (valueParameterDescriptor == null) {
            return null;
        }
        Name nameM93124b = NameResolverUtilKt.m93124b(nameResolver, argument.getNameId());
        KotlinType type = valueParameterDescriptor.getType();
        type.getClass();
        ProtoBuf.Annotation.Argument.Value value = argument.getValue();
        value.getClass();
        return new Pair<>(nameM93124b, m93024g(type, value, nameResolver));
    }

    /* JADX INFO: renamed from: e */
    public final ClassDescriptor m93022e(ClassId classId) {
        return FindClassInModuleKt.m89400d(this.f66638a, classId, this.f66639b);
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final ConstantValue<?> m93023f(@NotNull KotlinType kotlinType, @NotNull ProtoBuf.Annotation.Argument.Value value, @NotNull NameResolver nameResolver) {
        kotlinType.getClass();
        value.getClass();
        nameResolver.getClass();
        Boolean boolMo91766d = Flags.f66032S.mo91766d(value.getFlags());
        boolMo91766d.getClass();
        boolean zBooleanValue = boolMo91766d.booleanValue();
        ProtoBuf.Annotation.Argument.Value.Type type = value.getType();
        switch (type == null ? -1 : WhenMappings.f66640a[type.ordinal()]) {
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
                return new KClassValue(NameResolverUtilKt.m93123a(nameResolver, value.getClassId()), value.getArrayDimensionCount());
            case 11:
                return new EnumValue(NameResolverUtilKt.m93123a(nameResolver, value.getClassId()), NameResolverUtilKt.m93124b(nameResolver, value.getEnumValueId()));
            case 12:
                ProtoBuf.Annotation annotation = value.getAnnotation();
                annotation.getClass();
                return new AnnotationValue(m93018a(annotation, nameResolver));
            case 13:
                ConstantValueFactory constantValueFactory = ConstantValueFactory.INSTANCE;
                List<ProtoBuf.Annotation.Argument.Value> arrayElementList = value.getArrayElementList();
                arrayElementList.getClass();
                List<ProtoBuf.Annotation.Argument.Value> list = arrayElementList;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                for (ProtoBuf.Annotation.Argument.Value value2 : list) {
                    SimpleType simpleTypeM89123i = m93020c().m89123i();
                    simpleTypeM89123i.getClass();
                    value2.getClass();
                    arrayList.add(m93023f(simpleTypeM89123i, value2, nameResolver));
                }
                return constantValueFactory.m92814c(arrayList, kotlinType);
            default:
                throw new IllegalStateException(("Unsupported annotation argument type: " + value.getType() + " (expected " + kotlinType + ')').toString());
        }
    }

    /* JADX INFO: renamed from: g */
    public final ConstantValue<?> m93024g(KotlinType kotlinType, ProtoBuf.Annotation.Argument.Value value, NameResolver nameResolver) {
        ConstantValue<?> constantValueM93023f = m93023f(kotlinType, value, nameResolver);
        if (!m93019b(constantValueM93023f, kotlinType, value)) {
            constantValueM93023f = null;
        }
        if (constantValueM93023f != null) {
            return constantValueM93023f;
        }
        return ErrorValue.Companion.m92819a("Unexpected argument value: actual type " + value.getType() + " != expected type " + kotlinType);
    }
}
