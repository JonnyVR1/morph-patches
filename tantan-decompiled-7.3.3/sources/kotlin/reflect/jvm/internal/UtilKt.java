package kotlin.reflect.jvm.internal;

import com.clevertap.android.sdk.Constants;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.vivo.push.PushClientConstants;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference;
import kotlin.jvm.internal.RepeatableContainer;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KCallable;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KType;
import kotlin.reflect.KVisibility;
import kotlin.reflect.jvm.internal.calls.AnnotationConstructorCallerKt;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectAnnotationSource;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectJavaClassFinderKt;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectKotlinClass;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.RuntimeModuleData;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.RuntimeSourceElementFactory;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaAnnotation;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaClass;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaElement;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinarySourceElement;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;
import kotlin.reflect.jvm.internal.impl.resolve.constants.AnnotationValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ArrayValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.EnumValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ErrorValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.KClassValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.NullValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.TypedArrayValue;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationComponents;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.text.C15493d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.hmk0;
import p153l.jmk0;
import p153l.mpq;
import p153l.nbr;
import p153l.poj0;
import p153l.wtq0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000Ò\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0019\u0010\u0002\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a+\u0010\t\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0001*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\t\u0010\n\u001a5\u0010\u000f\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00012\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001b\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0001*\u0006\u0012\u0002\b\u00030\u0001H\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0015\u0010\u0015\u001a\u0004\u0018\u00010\u0014*\u00020\u0013H\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0019\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018*\u00020\u0017H\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018*\b\u0012\u0004\u0012\u00020\u00190\u0018¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u0015\u0010\u001f\u001a\u0004\u0018\u00010\u0019*\u00020\u001eH\u0002¢\u0006\u0004\b\u001f\u0010 \u001a!\u0010#\u001a\u0004\u0018\u00010\"*\u0006\u0012\u0002\b\u00030!2\u0006\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b#\u0010$\u001a\u001d\u0010&\u001a\u0004\u0018\u00010\"*\u00020%2\u0006\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b&\u0010'\u001a\u0017\u0010)\u001a\u0004\u0018\u00010(*\u0004\u0018\u00010\"H\u0000¢\u0006\u0004\b)\u0010*\u001a\u001b\u0010,\u001a\b\u0012\u0002\b\u0003\u0018\u00010+*\u0004\u0018\u00010\"H\u0000¢\u0006\u0004\b,\u0010-\u001a\u001b\u0010/\u001a\b\u0012\u0002\b\u0003\u0018\u00010.*\u0004\u0018\u00010\"H\u0000¢\u0006\u0004\b/\u00100\u001a\u0019\u00103\u001a\u0004\u0018\u00010\"2\u0006\u00102\u001a\u000201H\u0000¢\u0006\u0004\b3\u00104\u001a'\u00108\u001a\u00028\u0000\"\u0004\b\u0000\u001052\f\u00107\u001a\b\u0012\u0004\u0012\u00028\u000006H\u0080\bø\u0001\u0000¢\u0006\u0004\b8\u00109\u001an\u0010J\u001a\u00028\u0001\"\b\b\u0000\u0010;*\u00020:\"\b\b\u0001\u0010=*\u00020<2\n\u0010>\u001a\u0006\u0012\u0002\b\u00030\u00012\u0006\u0010?\u001a\u00028\u00002\u0006\u0010A\u001a\u00020@2\u0006\u0010C\u001a\u00020B2\u0006\u0010E\u001a\u00020D2\u001d\u0010I\u001a\u0019\u0012\u0004\u0012\u00020G\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010F¢\u0006\u0002\bHH\u0000¢\u0006\u0004\bJ\u0010K\"\u001a\u0010P\u001a\u00020L8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b&\u0010M\u001a\u0004\bN\u0010O\"\u0018\u0010U\u001a\u00020R*\u00020Q8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bS\u0010T\"\u0018\u0010W\u001a\u00020R*\u00020Q8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bV\u0010T\"\u001a\u0010[\u001a\u0004\u0018\u00010X*\u00020<8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bY\u0010Z\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\\"}, m88121d2 = {"Lkotlin/reflect/jvm/internal/impl/descriptors/ClassDescriptor;", "Ljava/lang/Class;", "q", "(Lkotlin/reflect/jvm/internal/impl/descriptors/ClassDescriptor;)Ljava/lang/Class;", "Ljava/lang/ClassLoader;", "Lkotlin/reflect/jvm/internal/impl/name/ClassId;", "kotlinClassId", "", "arrayDimensions", "n", "(Ljava/lang/ClassLoader;Lkotlin/reflect/jvm/internal/impl/name/ClassId;I)Ljava/lang/Class;", "classLoader", "", RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME, PushClientConstants.TAG_CLASS_NAME, "m", "(Ljava/lang/ClassLoader;Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/Class;", "f", "(Ljava/lang/Class;)Ljava/lang/Class;", "Lkotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibility;", "Lkotlin/reflect/KVisibility;", "r", "(Lkotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibility;)Lkotlin/reflect/KVisibility;", "Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/Annotated;", "", "", "e", "(Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/Annotated;)Ljava/util/List;", Constants.KEY_T, "(Ljava/util/List;)Ljava/util/List;", "Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotationDescriptor;", "p", "(Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotationDescriptor;)Ljava/lang/annotation/Annotation;", "Lkotlin/reflect/jvm/internal/impl/resolve/constants/ConstantValue;", "", BLiveStormDanmakuGiftResourceType.f45294s, "(Lkotlin/reflect/jvm/internal/impl/resolve/constants/ConstantValue;Ljava/lang/ClassLoader;)Ljava/lang/Object;", "Lkotlin/reflect/jvm/internal/impl/resolve/constants/ArrayValue;", "a", "(Lkotlin/reflect/jvm/internal/impl/resolve/constants/ArrayValue;Ljava/lang/ClassLoader;)Ljava/lang/Object;", "Lkotlin/reflect/jvm/internal/KFunctionImpl;", "c", "(Ljava/lang/Object;)Lkotlin/reflect/jvm/internal/KFunctionImpl;", "Lkotlin/reflect/jvm/internal/KPropertyImpl;", Constants.INAPP_DATA_TAG, "(Ljava/lang/Object;)Lkotlin/reflect/jvm/internal/KPropertyImpl;", "Lkotlin/reflect/jvm/internal/KCallableImpl;", "b", "(Ljava/lang/Object;)Lkotlin/reflect/jvm/internal/KCallableImpl;", "Ljava/lang/reflect/Type;", "type", "g", "(Ljava/lang/reflect/Type;)Ljava/lang/Object;", "R", "Lkotlin/Function0;", "block", "reflectionCall", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "Lkotlin/reflect/jvm/internal/impl/protobuf/MessageLite;", "M", "Lkotlin/reflect/jvm/internal/impl/descriptors/CallableDescriptor;", "D", "moduleAnchor", "proto", "Lkotlin/reflect/jvm/internal/impl/metadata/deserialization/NameResolver;", "nameResolver", "Lkotlin/reflect/jvm/internal/impl/metadata/deserialization/TypeTable;", "typeTable", "Lkotlin/reflect/jvm/internal/impl/metadata/deserialization/BinaryVersion;", "metadataVersion", "Lkotlin/Function2;", "Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/MemberDeserializer;", "Lkotlin/ExtensionFunctionType;", "createDescriptor", "deserializeToDescriptor", "(Ljava/lang/Class;Lorg/jetbrains/kotlin/protobuf/MessageLite;Lorg/jetbrains/kotlin/metadata/deserialization/NameResolver;Lorg/jetbrains/kotlin/metadata/deserialization/TypeTable;Lorg/jetbrains/kotlin/metadata/deserialization/BinaryVersion;Lkotlin/jvm/functions/Function2;)Lorg/jetbrains/kotlin/descriptors/CallableDescriptor;", "Lkotlin/reflect/jvm/internal/impl/name/FqName;", "Lkotlin/reflect/jvm/internal/impl/name/FqName;", "getJVM_STATIC", "()Lorg/jetbrains/kotlin/name/FqName;", "JVM_STATIC", "Lkotlin/reflect/KType;", "", BLiveStormDanmakuGiftResourceType.f45292l, "(Lkotlin/reflect/KType;)Z", "isInlineClassType", "k", "needsMultiFieldValueClassFlattening", "Lkotlin/reflect/jvm/internal/impl/descriptors/ReceiverParameterDescriptor;", "getInstanceReceiverParameter", "(Lorg/jetbrains/kotlin/descriptors/CallableDescriptor;)Lorg/jetbrains/kotlin/descriptors/ReceiverParameterDescriptor;", "instanceReceiverParameter", "kotlin-reflection"}, m88122k = 2, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class UtilKt {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final FqName f64398a = new FqName("kotlin.jvm.JvmStatic");

    @Metadata(m88122k = 3, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f64399a;

        static {
            int[] iArr = new int[PrimitiveType.values().length];
            try {
                iArr[PrimitiveType.BOOLEAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PrimitiveType.CHAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PrimitiveType.BYTE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PrimitiveType.SHORT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PrimitiveType.INT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[PrimitiveType.FLOAT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[PrimitiveType.LONG.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[PrimitiveType.DOUBLE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            f64399a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static final Object m88929a(ArrayValue arrayValue, ClassLoader classLoader) {
        KotlinType kotlinTypeM92852e;
        Class clsM88943o;
        TypedArrayValue typedArrayValue = arrayValue instanceof TypedArrayValue ? (TypedArrayValue) arrayValue : null;
        if (typedArrayValue != null && (kotlinTypeM92852e = typedArrayValue.m92852e()) != null) {
            List<? extends ConstantValue<?>> listMo92809b = arrayValue.mo92809b();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listMo92809b, 10));
            Iterator<T> it = listMo92809b.iterator();
            while (it.hasNext()) {
                arrayList.add(m88947s((ConstantValue) it.next(), classLoader));
            }
            PrimitiveType primitiveTypeM89063O = KotlinBuiltIns.m89063O(kotlinTypeM92852e);
            int i = 0;
            switch (primitiveTypeM89063O == null ? -1 : WhenMappings.f64399a[primitiveTypeM89063O.ordinal()]) {
                case -1:
                    if (KotlinBuiltIns.m89072d0(kotlinTypeM92852e)) {
                        KotlinType type = ((TypeProjection) CollectionsKt.single((List) kotlinTypeM92852e.mo92779E0())).getType();
                        type.getClass();
                        ClassifierDescriptor classifierDescriptorMo89207e = type.mo92781G0().mo89207e();
                        ClassDescriptor classDescriptor = classifierDescriptorMo89207e instanceof ClassDescriptor ? (ClassDescriptor) classifierDescriptorMo89207e : null;
                        if (classDescriptor == null) {
                            mpq.m159379a("Not a class type: ", type);
                            return null;
                        }
                        if (KotlinBuiltIns.m89092w0(type)) {
                            int size = arrayValue.mo92809b().size();
                            String[] strArr = new String[size];
                            while (i < size) {
                                Object obj = arrayList.get(i);
                                obj.getClass();
                                strArr[i] = obj;
                                i++;
                            }
                            return strArr;
                        }
                        if (KotlinBuiltIns.m89082m0(classDescriptor)) {
                            int size2 = arrayValue.mo92809b().size();
                            Class[] clsArr = new Class[size2];
                            while (i < size2) {
                                Object obj2 = arrayList.get(i);
                                obj2.getClass();
                                clsArr[i] = obj2;
                                i++;
                            }
                            return clsArr;
                        }
                        ClassId classIdM92872n = DescriptorUtilsKt.m92872n(classDescriptor);
                        if (classIdM92872n == null || (clsM88943o = m88943o(classLoader, classIdM92872n, 0, 2, null)) == null) {
                            return null;
                        }
                        Object objNewInstance = Array.newInstance((Class<?>) clsM88943o, arrayValue.mo92809b().size());
                        objNewInstance.getClass();
                        Object[] objArr = (Object[]) objNewInstance;
                        int size3 = arrayList.size();
                        while (i < size3) {
                            objArr[i] = arrayList.get(i);
                            i++;
                        }
                        return objArr;
                    }
                    jmk0.m146166a("Not an array type: ", kotlinTypeM92852e);
                    break;
                case 0:
                default:
                    nbr.m162172a();
                    return null;
                case 1:
                    int size4 = arrayValue.mo92809b().size();
                    boolean[] zArr = new boolean[size4];
                    while (i < size4) {
                        Object obj3 = arrayList.get(i);
                        obj3.getClass();
                        zArr[i] = ((Boolean) obj3).booleanValue();
                        i++;
                    }
                    return zArr;
                case 2:
                    int size5 = arrayValue.mo92809b().size();
                    char[] cArr = new char[size5];
                    while (i < size5) {
                        Object obj4 = arrayList.get(i);
                        obj4.getClass();
                        cArr[i] = ((Character) obj4).charValue();
                        i++;
                    }
                    return cArr;
                case 3:
                    int size6 = arrayValue.mo92809b().size();
                    byte[] bArr = new byte[size6];
                    while (i < size6) {
                        Object obj5 = arrayList.get(i);
                        obj5.getClass();
                        bArr[i] = ((Byte) obj5).byteValue();
                        i++;
                    }
                    return bArr;
                case 4:
                    int size7 = arrayValue.mo92809b().size();
                    short[] sArr = new short[size7];
                    while (i < size7) {
                        Object obj6 = arrayList.get(i);
                        obj6.getClass();
                        sArr[i] = ((Short) obj6).shortValue();
                        i++;
                    }
                    return sArr;
                case 5:
                    int size8 = arrayValue.mo92809b().size();
                    int[] iArr = new int[size8];
                    while (i < size8) {
                        Object obj7 = arrayList.get(i);
                        obj7.getClass();
                        iArr[i] = ((Integer) obj7).intValue();
                        i++;
                    }
                    return iArr;
                case 6:
                    int size9 = arrayValue.mo92809b().size();
                    float[] fArr = new float[size9];
                    while (i < size9) {
                        Object obj8 = arrayList.get(i);
                        obj8.getClass();
                        fArr[i] = ((Float) obj8).floatValue();
                        i++;
                    }
                    return fArr;
                case 7:
                    int size10 = arrayValue.mo92809b().size();
                    long[] jArr = new long[size10];
                    while (i < size10) {
                        Object obj9 = arrayList.get(i);
                        obj9.getClass();
                        jArr[i] = ((Long) obj9).longValue();
                        i++;
                    }
                    return jArr;
                case 8:
                    int size11 = arrayValue.mo92809b().size();
                    double[] dArr = new double[size11];
                    while (i < size11) {
                        Object obj10 = arrayList.get(i);
                        obj10.getClass();
                        dArr[i] = ((Double) obj10).doubleValue();
                        i++;
                    }
                    return dArr;
            }
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public static final KCallableImpl<?> m88930b(@Nullable Object obj) {
        KCallableImpl<?> kCallableImpl = obj instanceof KCallableImpl ? (KCallableImpl) obj : null;
        if (kCallableImpl != null) {
            return kCallableImpl;
        }
        KFunctionImpl kFunctionImplM88931c = m88931c(obj);
        return kFunctionImplM88931c != null ? kFunctionImplM88931c : m88932d(obj);
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public static final KFunctionImpl m88931c(@Nullable Object obj) {
        KFunctionImpl kFunctionImpl = obj instanceof KFunctionImpl ? (KFunctionImpl) obj : null;
        if (kFunctionImpl != null) {
            return kFunctionImpl;
        }
        FunctionReference functionReference = obj instanceof FunctionReference ? (FunctionReference) obj : null;
        KCallable kCallableCompute = functionReference != null ? functionReference.compute() : null;
        if (kCallableCompute instanceof KFunctionImpl) {
            return (KFunctionImpl) kCallableCompute;
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public static final KPropertyImpl<?> m88932d(@Nullable Object obj) {
        KPropertyImpl<?> kPropertyImpl = obj instanceof KPropertyImpl ? (KPropertyImpl) obj : null;
        if (kPropertyImpl != null) {
            return kPropertyImpl;
        }
        PropertyReference propertyReference = obj instanceof PropertyReference ? (PropertyReference) obj : null;
        KCallable kCallableCompute = propertyReference != null ? propertyReference.compute() : null;
        if (kCallableCompute instanceof KPropertyImpl) {
            return (KPropertyImpl) kCallableCompute;
        }
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public static final List<Annotation> m88933e(@NotNull Annotated annotated) {
        Annotation annotationM88944p;
        annotated.getClass();
        Annotations annotations = annotated.getAnnotations();
        ArrayList arrayList = new ArrayList();
        for (AnnotationDescriptor annotationDescriptor : annotations) {
            SourceElement source = annotationDescriptor.getSource();
            if (source instanceof ReflectAnnotationSource) {
                annotationM88944p = ((ReflectAnnotationSource) source).m89831d();
            } else if (source instanceof RuntimeSourceElementFactory.RuntimeSourceElement) {
                ReflectJavaElement reflectJavaElementMo89856c = ((RuntimeSourceElementFactory.RuntimeSourceElement) source).mo89856c();
                ReflectJavaAnnotation reflectJavaAnnotation = reflectJavaElementMo89856c instanceof ReflectJavaAnnotation ? (ReflectJavaAnnotation) reflectJavaElementMo89856c : null;
                annotationM88944p = reflectJavaAnnotation != null ? reflectJavaAnnotation.m89891I() : null;
            } else {
                annotationM88944p = m88944p(annotationDescriptor);
            }
            if (annotationM88944p != null) {
                arrayList.add(annotationM88944p);
            }
        }
        return m88948t(arrayList);
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public static final Class<?> m88934f(@NotNull Class<?> cls) {
        cls.getClass();
        return Array.newInstance(cls, 0).getClass();
    }

    @Nullable
    /* JADX INFO: renamed from: g */
    public static final Object m88935g(@NotNull Type type) {
        type.getClass();
        if (type instanceof Class) {
            Class cls = (Class) type;
            if (cls.isPrimitive()) {
                if (Intrinsics.m88377d(cls, Boolean.TYPE)) {
                    return Boolean.FALSE;
                }
                if (Intrinsics.m88377d(cls, Character.TYPE)) {
                    return (char) 0;
                }
                if (Intrinsics.m88377d(cls, Byte.TYPE)) {
                    return (byte) 0;
                }
                if (Intrinsics.m88377d(cls, Short.TYPE)) {
                    return (short) 0;
                }
                if (Intrinsics.m88377d(cls, Integer.TYPE)) {
                    return 0;
                }
                if (Intrinsics.m88377d(cls, Float.TYPE)) {
                    return Float.valueOf(0.0f);
                }
                if (Intrinsics.m88377d(cls, Long.TYPE)) {
                    return 0L;
                }
                if (Intrinsics.m88377d(cls, Double.TYPE)) {
                    return Double.valueOf(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
                }
                if (Intrinsics.m88377d(cls, Void.TYPE)) {
                    wtq0.m207906a("Parameter with void type is illegal");
                    return null;
                }
                poj0.m173108a("Unknown primitive: ", type);
            }
        }
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public static final <M extends MessageLite, D extends CallableDescriptor> D m88936h(@NotNull Class<?> cls, @NotNull M m, @NotNull NameResolver nameResolver, @NotNull TypeTable typeTable, @NotNull BinaryVersion binaryVersion, @NotNull Function2<? super MemberDeserializer, ? super M, ? extends D> function2) {
        List<ProtoBuf.TypeParameter> typeParameterList;
        cls.getClass();
        m.getClass();
        nameResolver.getClass();
        typeTable.getClass();
        binaryVersion.getClass();
        function2.getClass();
        RuntimeModuleData runtimeModuleDataM88882a = ModuleByClassLoaderKt.m88882a(cls);
        if (m instanceof ProtoBuf.Function) {
            typeParameterList = ((ProtoBuf.Function) m).getTypeParameterList();
        } else {
            if (!(m instanceof ProtoBuf.Property)) {
                mpq.m159379a("Unsupported message: ", m);
                return null;
            }
            typeParameterList = ((ProtoBuf.Property) m).getTypeParameterList();
        }
        List<ProtoBuf.TypeParameter> list = typeParameterList;
        DeserializationComponents deserializationComponentsM89851a = runtimeModuleDataM88882a.m89851a();
        ModuleDescriptor moduleDescriptorM89852b = runtimeModuleDataM88882a.m89852b();
        VersionRequirementTable versionRequirementTableM91824b = VersionRequirementTable.Companion.m91824b();
        list.getClass();
        return function2.invoke(new MemberDeserializer(new DeserializationContext(deserializationComponentsM89851a, nameResolver, moduleDescriptorM89852b, typeTable, versionRequirementTableM91824b, binaryVersion, null, null, list)), m);
    }

    @Nullable
    /* JADX INFO: renamed from: i */
    public static final ReceiverParameterDescriptor m88937i(@NotNull CallableDescriptor callableDescriptor) {
        callableDescriptor.getClass();
        if (callableDescriptor.mo89335Y() == null) {
            return null;
        }
        DeclarationDescriptor declarationDescriptorMo89190b = callableDescriptor.mo89190b();
        declarationDescriptorMo89190b.getClass();
        return ((ClassDescriptor) declarationDescriptorMo89190b).mo89347R();
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public static final FqName m88938j() {
        return f64398a;
    }

    /* JADX INFO: renamed from: k */
    public static final boolean m88939k(@NotNull KType kType) {
        kType.getClass();
        KClassifier kClassifierMo88449i = kType.getClassifier();
        KClassImpl kClassImpl = kClassifierMo88449i instanceof KClassImpl ? (KClassImpl) kClassifierMo88449i : null;
        return (kClassImpl == null || !kClassImpl.mo88358q() || kClassImpl.m88648e0()) ? false : true;
    }

    /* JADX INFO: renamed from: l */
    public static final boolean m88940l(@NotNull KType kType) {
        kType.getClass();
        KClassifier kClassifierMo88449i = kType.getClassifier();
        KClassImpl kClassImpl = kClassifierMo88449i instanceof KClassImpl ? (KClassImpl) kClassifierMo88449i : null;
        return kClassImpl != null && kClassImpl.m88648e0();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: m */
    public static final Class<?> m88941m(ClassLoader classLoader, String str, String str2, int i) {
        if (Intrinsics.m88377d(str, "kotlin")) {
            switch (str2.hashCode()) {
                case -901856463:
                    if (str2.equals("BooleanArray")) {
                        return boolean[].class;
                    }
                    break;
                case -763279523:
                    if (str2.equals("ShortArray")) {
                        return short[].class;
                    }
                    break;
                case -755911549:
                    if (str2.equals("CharArray")) {
                        return char[].class;
                    }
                    break;
                case -74930671:
                    if (str2.equals("ByteArray")) {
                        return byte[].class;
                    }
                    break;
                case 22374632:
                    if (str2.equals("DoubleArray")) {
                        return double[].class;
                    }
                    break;
                case 63537721:
                    if (str2.equals("Array")) {
                        return Object[].class;
                    }
                    break;
                case 601811914:
                    if (str2.equals("IntArray")) {
                        return int[].class;
                    }
                    break;
                case 948852093:
                    if (str2.equals("FloatArray")) {
                        return float[].class;
                    }
                    break;
                case 2104330525:
                    if (str2.equals("LongArray")) {
                        return long[].class;
                    }
                    break;
            }
        }
        StringBuilder sb = new StringBuilder();
        if (i > 0) {
            for (int i2 = 0; i2 < i; i2++) {
                sb.append("[");
            }
            sb.append("L");
        }
        if (str.length() > 0) {
            sb.append(str + '.');
        }
        sb.append(C15493d.m94369E(str2, '.', '$', false, 4, null));
        if (i > 0) {
            sb.append(com.meituan.robust.Constants.PACKNAME_END);
        }
        return ReflectJavaClassFinderKt.m89835a(classLoader, sb.toString());
    }

    @Nullable
    /* JADX INFO: renamed from: n */
    public static final Class<?> m88942n(@NotNull ClassLoader classLoader, @NotNull ClassId classId, int i) {
        classLoader.getClass();
        classId.getClass();
        ClassId classIdM89247n = JavaToKotlinClassMap.INSTANCE.m89247n(classId.m91925a().m91945i());
        if (classIdM89247n == null) {
            classIdM89247n = classId;
        }
        if (!Intrinsics.m88377d(classIdM89247n, classId)) {
            classLoader = ReflectClassUtilKt.m89887j(Unit.class);
        }
        return m88941m(classLoader, classIdM89247n.m91929f().m91937a(), classIdM89247n.m91930g().m91937a(), i);
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ Class m88943o(ClassLoader classLoader, ClassId classId, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return m88942n(classLoader, classId, i);
    }

    /* JADX INFO: renamed from: p */
    public static final Annotation m88944p(AnnotationDescriptor annotationDescriptor) {
        ClassDescriptor classDescriptorM92870l = DescriptorUtilsKt.m92870l(annotationDescriptor);
        Class<?> clsM88945q = classDescriptorM92870l != null ? m88945q(classDescriptorM92870l) : null;
        if (clsM88945q == null) {
            clsM88945q = null;
        }
        if (clsM88945q == null) {
            return null;
        }
        Set<Map.Entry<Name, ConstantValue<?>>> setEntrySet = annotationDescriptor.mo89521a().entrySet();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Name name = (Name) entry.getKey();
            ConstantValue constantValue = (ConstantValue) entry.getValue();
            ClassLoader classLoader = clsM88945q.getClassLoader();
            classLoader.getClass();
            Object objM88947s = m88947s(constantValue, classLoader);
            Pair pairM88129a = objM88947s != null ? TuplesKt.m88129a(name.m91973b(), objM88947s) : null;
            if (pairM88129a != null) {
                arrayList.add(pairM88129a);
            }
        }
        return (Annotation) AnnotationConstructorCallerKt.m88962h(clsM88945q, MapsKt.toMap(arrayList), null, 4, null);
    }

    @Nullable
    /* JADX INFO: renamed from: q */
    public static final Class<?> m88945q(@NotNull ClassDescriptor classDescriptor) {
        classDescriptor.getClass();
        SourceElement source = classDescriptor.getSource();
        source.getClass();
        if (source instanceof KotlinJvmBinarySourceElement) {
            KotlinJvmBinaryClass kotlinJvmBinaryClassM91259d = ((KotlinJvmBinarySourceElement) source).m91259d();
            kotlinJvmBinaryClassM91259d.getClass();
            return ((ReflectKotlinClass) kotlinJvmBinaryClassM91259d).m89839d();
        }
        if (source instanceof RuntimeSourceElementFactory.RuntimeSourceElement) {
            ReflectJavaElement reflectJavaElementMo89856c = ((RuntimeSourceElementFactory.RuntimeSourceElement) source).mo89856c();
            reflectJavaElementMo89856c.getClass();
            return ((ReflectJavaClass) reflectJavaElementMo89856c).getElement();
        }
        ClassId classIdM92872n = DescriptorUtilsKt.m92872n(classDescriptor);
        if (classIdM92872n == null) {
            return null;
        }
        return m88943o(ReflectClassUtilKt.m89887j(classDescriptor.getClass()), classIdM92872n, 0, 2, null);
    }

    @Nullable
    /* JADX INFO: renamed from: r */
    public static final KVisibility m88946r(@NotNull DescriptorVisibility descriptorVisibility) {
        descriptorVisibility.getClass();
        if (Intrinsics.m88377d(descriptorVisibility, DescriptorVisibilities.f64700e)) {
            return KVisibility.PUBLIC;
        }
        if (Intrinsics.m88377d(descriptorVisibility, DescriptorVisibilities.f64698c)) {
            return KVisibility.PROTECTED;
        }
        if (Intrinsics.m88377d(descriptorVisibility, DescriptorVisibilities.f64699d)) {
            return KVisibility.INTERNAL;
        }
        if (Intrinsics.m88377d(descriptorVisibility, DescriptorVisibilities.f64696a) || Intrinsics.m88377d(descriptorVisibility, DescriptorVisibilities.f64697b)) {
            return KVisibility.PRIVATE;
        }
        return null;
    }

    /* JADX INFO: renamed from: s */
    public static final Object m88947s(ConstantValue<?> constantValue, ClassLoader classLoader) {
        if (constantValue instanceof AnnotationValue) {
            return m88944p(((AnnotationValue) constantValue).mo92809b());
        }
        if (constantValue instanceof ArrayValue) {
            return m88929a((ArrayValue) constantValue, classLoader);
        }
        if (constantValue instanceof EnumValue) {
            Pair<? extends ClassId, ? extends Name> pairMo92809b = ((EnumValue) constantValue).mo92809b();
            ClassId classIdComponent1 = pairMo92809b.component1();
            Name nameComponent2 = pairMo92809b.component2();
            Class clsM88943o = m88943o(classLoader, classIdComponent1, 0, 2, null);
            if (clsM88943o != null) {
                return hmk0.m135922a(clsM88943o, nameComponent2.m91973b());
            }
            return null;
        }
        if (!(constantValue instanceof KClassValue)) {
            if ((constantValue instanceof ErrorValue) || (constantValue instanceof NullValue)) {
                return null;
            }
            return constantValue.mo92809b();
        }
        KClassValue.Value valueMo92809b = ((KClassValue) constantValue).mo92809b();
        if (valueMo92809b instanceof KClassValue.Value.NormalClass) {
            KClassValue.Value.NormalClass normalClass = (KClassValue.Value.NormalClass) valueMo92809b;
            return m88942n(classLoader, normalClass.m92843b(), normalClass.m92842a());
        }
        if (!(valueMo92809b instanceof KClassValue.Value.LocalClass)) {
            nbr.m162172a();
            return null;
        }
        ClassifierDescriptor classifierDescriptorMo89207e = ((KClassValue.Value.LocalClass) valueMo92809b).m92841a().mo92781G0().mo89207e();
        ClassDescriptor classDescriptor = classifierDescriptorMo89207e instanceof ClassDescriptor ? (ClassDescriptor) classifierDescriptorMo89207e : null;
        if (classDescriptor != null) {
            return m88945q(classDescriptor);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, java.util.List<? extends java.lang.annotation.Annotation>, java.util.List<java.lang.annotation.Annotation>] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.List<java.lang.annotation.Annotation>] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.ArrayList, java.util.Collection] */
    @NotNull
    /* JADX INFO: renamed from: t */
    public static final List<Annotation> m88948t(@NotNull List<? extends Annotation> list) throws IllegalAccessException, InvocationTargetException {
        List listListOf;
        list.getClass();
        Iterable<Annotation> iterable = (Iterable) list;
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return list;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            if (Intrinsics.m88377d(JvmClassMappingKt.m88341b(JvmClassMappingKt.m88340a((Annotation) it.next())).getSimpleName(), "Container")) {
                list = new ArrayList<>();
                for (Annotation annotation : iterable) {
                    Class clsM88341b = JvmClassMappingKt.m88341b(JvmClassMappingKt.m88340a(annotation));
                    if (!Intrinsics.m88377d(clsM88341b.getSimpleName(), "Container") || clsM88341b.getAnnotation(RepeatableContainer.class) == null) {
                        listListOf = CollectionsKt.listOf(annotation);
                    } else {
                        Object objInvoke = clsM88341b.getDeclaredMethod("value", null).invoke(annotation, null);
                        objInvoke.getClass();
                        listListOf = ArraysKt.asList((Annotation[]) objInvoke);
                    }
                    CollectionsKt.addAll((Collection) list, listListOf);
                }
                break;
            }
        }
        return list;
    }
}
