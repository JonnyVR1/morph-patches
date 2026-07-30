package kotlin.reflect.jvm.internal;

import com.clevertap.android.sdk.Constants;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
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
import kotlin.text.C15386d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.bdk0;
import p149l.ddk0;
import p149l.l9r;
import p149l.lfj0;
import p149l.nnq;
import p149l.qkq0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000Ò\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0019\u0010\u0002\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a+\u0010\t\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0001*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\t\u0010\n\u001a5\u0010\u000f\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00012\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001b\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0001*\u0006\u0012\u0002\b\u00030\u0001H\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0015\u0010\u0015\u001a\u0004\u0018\u00010\u0014*\u00020\u0013H\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0019\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018*\u00020\u0017H\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018*\b\u0012\u0004\u0012\u00020\u00190\u0018¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u0015\u0010\u001f\u001a\u0004\u0018\u00010\u0019*\u00020\u001eH\u0002¢\u0006\u0004\b\u001f\u0010 \u001a!\u0010#\u001a\u0004\u0018\u00010\"*\u0006\u0012\u0002\b\u00030!2\u0006\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b#\u0010$\u001a\u001d\u0010&\u001a\u0004\u0018\u00010\"*\u00020%2\u0006\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b&\u0010'\u001a\u0017\u0010)\u001a\u0004\u0018\u00010(*\u0004\u0018\u00010\"H\u0000¢\u0006\u0004\b)\u0010*\u001a\u001b\u0010,\u001a\b\u0012\u0002\b\u0003\u0018\u00010+*\u0004\u0018\u00010\"H\u0000¢\u0006\u0004\b,\u0010-\u001a\u001b\u0010/\u001a\b\u0012\u0002\b\u0003\u0018\u00010.*\u0004\u0018\u00010\"H\u0000¢\u0006\u0004\b/\u00100\u001a\u0019\u00103\u001a\u0004\u0018\u00010\"2\u0006\u00102\u001a\u000201H\u0000¢\u0006\u0004\b3\u00104\u001a'\u00108\u001a\u00028\u0000\"\u0004\b\u0000\u001052\f\u00107\u001a\b\u0012\u0004\u0012\u00028\u000006H\u0080\bø\u0001\u0000¢\u0006\u0004\b8\u00109\u001an\u0010J\u001a\u00028\u0001\"\b\b\u0000\u0010;*\u00020:\"\b\b\u0001\u0010=*\u00020<2\n\u0010>\u001a\u0006\u0012\u0002\b\u00030\u00012\u0006\u0010?\u001a\u00028\u00002\u0006\u0010A\u001a\u00020@2\u0006\u0010C\u001a\u00020B2\u0006\u0010E\u001a\u00020D2\u001d\u0010I\u001a\u0019\u0012\u0004\u0012\u00020G\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010F¢\u0006\u0002\bHH\u0000¢\u0006\u0004\bJ\u0010K\"\u001a\u0010P\u001a\u00020L8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b&\u0010M\u001a\u0004\bN\u0010O\"\u0018\u0010U\u001a\u00020R*\u00020Q8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bS\u0010T\"\u0018\u0010W\u001a\u00020R*\u00020Q8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bV\u0010T\"\u001a\u0010[\u001a\u0004\u0018\u00010X*\u00020<8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bY\u0010Z\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\\"}, m87232d2 = {"Lkotlin/reflect/jvm/internal/impl/descriptors/ClassDescriptor;", "Ljava/lang/Class;", "q", "(Lkotlin/reflect/jvm/internal/impl/descriptors/ClassDescriptor;)Ljava/lang/Class;", "Ljava/lang/ClassLoader;", "Lkotlin/reflect/jvm/internal/impl/name/ClassId;", "kotlinClassId", "", "arrayDimensions", "n", "(Ljava/lang/ClassLoader;Lkotlin/reflect/jvm/internal/impl/name/ClassId;I)Ljava/lang/Class;", "classLoader", "", RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME, PushClientConstants.TAG_CLASS_NAME, "m", "(Ljava/lang/ClassLoader;Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/Class;", "f", "(Ljava/lang/Class;)Ljava/lang/Class;", "Lkotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibility;", "Lkotlin/reflect/KVisibility;", "r", "(Lkotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibility;)Lkotlin/reflect/KVisibility;", "Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/Annotated;", "", "", "e", "(Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/Annotated;)Ljava/util/List;", Constants.KEY_T, "(Ljava/util/List;)Ljava/util/List;", "Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotationDescriptor;", "p", "(Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotationDescriptor;)Ljava/lang/annotation/Annotation;", "Lkotlin/reflect/jvm/internal/impl/resolve/constants/ConstantValue;", "", BLiveStormDanmakuGiftResourceType.f44446s, "(Lkotlin/reflect/jvm/internal/impl/resolve/constants/ConstantValue;Ljava/lang/ClassLoader;)Ljava/lang/Object;", "Lkotlin/reflect/jvm/internal/impl/resolve/constants/ArrayValue;", "a", "(Lkotlin/reflect/jvm/internal/impl/resolve/constants/ArrayValue;Ljava/lang/ClassLoader;)Ljava/lang/Object;", "Lkotlin/reflect/jvm/internal/KFunctionImpl;", "c", "(Ljava/lang/Object;)Lkotlin/reflect/jvm/internal/KFunctionImpl;", "Lkotlin/reflect/jvm/internal/KPropertyImpl;", Constants.INAPP_DATA_TAG, "(Ljava/lang/Object;)Lkotlin/reflect/jvm/internal/KPropertyImpl;", "Lkotlin/reflect/jvm/internal/KCallableImpl;", "b", "(Ljava/lang/Object;)Lkotlin/reflect/jvm/internal/KCallableImpl;", "Ljava/lang/reflect/Type;", "type", "g", "(Ljava/lang/reflect/Type;)Ljava/lang/Object;", "R", "Lkotlin/Function0;", "block", "reflectionCall", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "Lkotlin/reflect/jvm/internal/impl/protobuf/MessageLite;", "M", "Lkotlin/reflect/jvm/internal/impl/descriptors/CallableDescriptor;", "D", "moduleAnchor", "proto", "Lkotlin/reflect/jvm/internal/impl/metadata/deserialization/NameResolver;", "nameResolver", "Lkotlin/reflect/jvm/internal/impl/metadata/deserialization/TypeTable;", "typeTable", "Lkotlin/reflect/jvm/internal/impl/metadata/deserialization/BinaryVersion;", "metadataVersion", "Lkotlin/Function2;", "Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/MemberDeserializer;", "Lkotlin/ExtensionFunctionType;", "createDescriptor", "deserializeToDescriptor", "(Ljava/lang/Class;Lorg/jetbrains/kotlin/protobuf/MessageLite;Lorg/jetbrains/kotlin/metadata/deserialization/NameResolver;Lorg/jetbrains/kotlin/metadata/deserialization/TypeTable;Lorg/jetbrains/kotlin/metadata/deserialization/BinaryVersion;Lkotlin/jvm/functions/Function2;)Lorg/jetbrains/kotlin/descriptors/CallableDescriptor;", "Lkotlin/reflect/jvm/internal/impl/name/FqName;", "Lkotlin/reflect/jvm/internal/impl/name/FqName;", "getJVM_STATIC", "()Lorg/jetbrains/kotlin/name/FqName;", "JVM_STATIC", "Lkotlin/reflect/KType;", "", BLiveStormDanmakuGiftResourceType.f44444l, "(Lkotlin/reflect/KType;)Z", "isInlineClassType", "k", "needsMultiFieldValueClassFlattening", "Lkotlin/reflect/jvm/internal/impl/descriptors/ReceiverParameterDescriptor;", "getInstanceReceiverParameter", "(Lorg/jetbrains/kotlin/descriptors/CallableDescriptor;)Lorg/jetbrains/kotlin/descriptors/ReceiverParameterDescriptor;", "instanceReceiverParameter", "kotlin-reflection"}, m87233k = 2, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class UtilKt {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final FqName f63724a = new FqName("kotlin.jvm.JvmStatic");

    @Metadata(m87233k = 3, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f63725a;

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
            f63725a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static final Object m88038a(ArrayValue arrayValue, ClassLoader classLoader) {
        KotlinType kotlinTypeM91961e;
        Class clsM88052o;
        TypedArrayValue typedArrayValue = arrayValue instanceof TypedArrayValue ? (TypedArrayValue) arrayValue : null;
        if (typedArrayValue != null && (kotlinTypeM91961e = typedArrayValue.m91961e()) != null) {
            List<? extends ConstantValue<?>> listMo91918b = arrayValue.mo91918b();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listMo91918b, 10));
            Iterator<T> it = listMo91918b.iterator();
            while (it.hasNext()) {
                arrayList.add(m88056s((ConstantValue) it.next(), classLoader));
            }
            PrimitiveType primitiveTypeM88172O = KotlinBuiltIns.m88172O(kotlinTypeM91961e);
            int i = 0;
            switch (primitiveTypeM88172O == null ? -1 : WhenMappings.f63725a[primitiveTypeM88172O.ordinal()]) {
                case -1:
                    if (KotlinBuiltIns.m88181d0(kotlinTypeM91961e)) {
                        KotlinType type = ((TypeProjection) CollectionsKt.single((List) kotlinTypeM91961e.mo91888E0())).getType();
                        type.getClass();
                        ClassifierDescriptor classifierDescriptorMo88316e = type.mo91890G0().mo88316e();
                        ClassDescriptor classDescriptor = classifierDescriptorMo88316e instanceof ClassDescriptor ? (ClassDescriptor) classifierDescriptorMo88316e : null;
                        if (classDescriptor == null) {
                            nnq.m160357a("Not a class type: ", type);
                            return null;
                        }
                        if (KotlinBuiltIns.m88201w0(type)) {
                            int size = arrayValue.mo91918b().size();
                            String[] strArr = new String[size];
                            while (i < size) {
                                Object obj = arrayList.get(i);
                                obj.getClass();
                                strArr[i] = obj;
                                i++;
                            }
                            return strArr;
                        }
                        if (KotlinBuiltIns.m88191m0(classDescriptor)) {
                            int size2 = arrayValue.mo91918b().size();
                            Class[] clsArr = new Class[size2];
                            while (i < size2) {
                                Object obj2 = arrayList.get(i);
                                obj2.getClass();
                                clsArr[i] = obj2;
                                i++;
                            }
                            return clsArr;
                        }
                        ClassId classIdM91981n = DescriptorUtilsKt.m91981n(classDescriptor);
                        if (classIdM91981n == null || (clsM88052o = m88052o(classLoader, classIdM91981n, 0, 2, null)) == null) {
                            return null;
                        }
                        Object objNewInstance = Array.newInstance((Class<?>) clsM88052o, arrayValue.mo91918b().size());
                        objNewInstance.getClass();
                        Object[] objArr = (Object[]) objNewInstance;
                        int size3 = arrayList.size();
                        while (i < size3) {
                            objArr[i] = arrayList.get(i);
                            i++;
                        }
                        return objArr;
                    }
                    ddk0.m111027a("Not an array type: ", kotlinTypeM91961e);
                    break;
                case 0:
                default:
                    l9r.m149037a();
                    return null;
                case 1:
                    int size4 = arrayValue.mo91918b().size();
                    boolean[] zArr = new boolean[size4];
                    while (i < size4) {
                        Object obj3 = arrayList.get(i);
                        obj3.getClass();
                        zArr[i] = ((Boolean) obj3).booleanValue();
                        i++;
                    }
                    return zArr;
                case 2:
                    int size5 = arrayValue.mo91918b().size();
                    char[] cArr = new char[size5];
                    while (i < size5) {
                        Object obj4 = arrayList.get(i);
                        obj4.getClass();
                        cArr[i] = ((Character) obj4).charValue();
                        i++;
                    }
                    return cArr;
                case 3:
                    int size6 = arrayValue.mo91918b().size();
                    byte[] bArr = new byte[size6];
                    while (i < size6) {
                        Object obj5 = arrayList.get(i);
                        obj5.getClass();
                        bArr[i] = ((Byte) obj5).byteValue();
                        i++;
                    }
                    return bArr;
                case 4:
                    int size7 = arrayValue.mo91918b().size();
                    short[] sArr = new short[size7];
                    while (i < size7) {
                        Object obj6 = arrayList.get(i);
                        obj6.getClass();
                        sArr[i] = ((Short) obj6).shortValue();
                        i++;
                    }
                    return sArr;
                case 5:
                    int size8 = arrayValue.mo91918b().size();
                    int[] iArr = new int[size8];
                    while (i < size8) {
                        Object obj7 = arrayList.get(i);
                        obj7.getClass();
                        iArr[i] = ((Integer) obj7).intValue();
                        i++;
                    }
                    return iArr;
                case 6:
                    int size9 = arrayValue.mo91918b().size();
                    float[] fArr = new float[size9];
                    while (i < size9) {
                        Object obj8 = arrayList.get(i);
                        obj8.getClass();
                        fArr[i] = ((Float) obj8).floatValue();
                        i++;
                    }
                    return fArr;
                case 7:
                    int size10 = arrayValue.mo91918b().size();
                    long[] jArr = new long[size10];
                    while (i < size10) {
                        Object obj9 = arrayList.get(i);
                        obj9.getClass();
                        jArr[i] = ((Long) obj9).longValue();
                        i++;
                    }
                    return jArr;
                case 8:
                    int size11 = arrayValue.mo91918b().size();
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
    public static final KCallableImpl<?> m88039b(@Nullable Object obj) {
        KCallableImpl<?> kCallableImpl = obj instanceof KCallableImpl ? (KCallableImpl) obj : null;
        if (kCallableImpl != null) {
            return kCallableImpl;
        }
        KFunctionImpl kFunctionImplM88040c = m88040c(obj);
        return kFunctionImplM88040c != null ? kFunctionImplM88040c : m88041d(obj);
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public static final KFunctionImpl m88040c(@Nullable Object obj) {
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
    public static final KPropertyImpl<?> m88041d(@Nullable Object obj) {
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
    public static final List<Annotation> m88042e(@NotNull Annotated annotated) {
        Annotation annotationM88053p;
        annotated.getClass();
        Annotations annotations = annotated.getAnnotations();
        ArrayList arrayList = new ArrayList();
        for (AnnotationDescriptor annotationDescriptor : annotations) {
            SourceElement source = annotationDescriptor.getSource();
            if (source instanceof ReflectAnnotationSource) {
                annotationM88053p = ((ReflectAnnotationSource) source).m88940d();
            } else if (source instanceof RuntimeSourceElementFactory.RuntimeSourceElement) {
                ReflectJavaElement reflectJavaElementMo88965c = ((RuntimeSourceElementFactory.RuntimeSourceElement) source).mo88965c();
                ReflectJavaAnnotation reflectJavaAnnotation = reflectJavaElementMo88965c instanceof ReflectJavaAnnotation ? (ReflectJavaAnnotation) reflectJavaElementMo88965c : null;
                annotationM88053p = reflectJavaAnnotation != null ? reflectJavaAnnotation.m89000I() : null;
            } else {
                annotationM88053p = m88053p(annotationDescriptor);
            }
            if (annotationM88053p != null) {
                arrayList.add(annotationM88053p);
            }
        }
        return m88057t(arrayList);
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public static final Class<?> m88043f(@NotNull Class<?> cls) {
        cls.getClass();
        return Array.newInstance(cls, 0).getClass();
    }

    @Nullable
    /* JADX INFO: renamed from: g */
    public static final Object m88044g(@NotNull Type type) {
        type.getClass();
        if (type instanceof Class) {
            Class cls = (Class) type;
            if (cls.isPrimitive()) {
                if (Intrinsics.m87488d(cls, Boolean.TYPE)) {
                    return Boolean.FALSE;
                }
                if (Intrinsics.m87488d(cls, Character.TYPE)) {
                    return (char) 0;
                }
                if (Intrinsics.m87488d(cls, Byte.TYPE)) {
                    return (byte) 0;
                }
                if (Intrinsics.m87488d(cls, Short.TYPE)) {
                    return (short) 0;
                }
                if (Intrinsics.m87488d(cls, Integer.TYPE)) {
                    return 0;
                }
                if (Intrinsics.m87488d(cls, Float.TYPE)) {
                    return Float.valueOf(0.0f);
                }
                if (Intrinsics.m87488d(cls, Long.TYPE)) {
                    return 0L;
                }
                if (Intrinsics.m87488d(cls, Double.TYPE)) {
                    return Double.valueOf(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
                }
                if (Intrinsics.m87488d(cls, Void.TYPE)) {
                    qkq0.m175383a("Parameter with void type is illegal");
                    return null;
                }
                lfj0.m149710a("Unknown primitive: ", type);
            }
        }
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public static final <M extends MessageLite, D extends CallableDescriptor> D m88045h(@NotNull Class<?> cls, @NotNull M m, @NotNull NameResolver nameResolver, @NotNull TypeTable typeTable, @NotNull BinaryVersion binaryVersion, @NotNull Function2<? super MemberDeserializer, ? super M, ? extends D> function2) {
        List<ProtoBuf.TypeParameter> typeParameterList;
        cls.getClass();
        m.getClass();
        nameResolver.getClass();
        typeTable.getClass();
        binaryVersion.getClass();
        function2.getClass();
        RuntimeModuleData runtimeModuleDataM87991a = ModuleByClassLoaderKt.m87991a(cls);
        if (m instanceof ProtoBuf.Function) {
            typeParameterList = ((ProtoBuf.Function) m).getTypeParameterList();
        } else {
            if (!(m instanceof ProtoBuf.Property)) {
                nnq.m160357a("Unsupported message: ", m);
                return null;
            }
            typeParameterList = ((ProtoBuf.Property) m).getTypeParameterList();
        }
        List<ProtoBuf.TypeParameter> list = typeParameterList;
        DeserializationComponents deserializationComponentsM88960a = runtimeModuleDataM87991a.m88960a();
        ModuleDescriptor moduleDescriptorM88961b = runtimeModuleDataM87991a.m88961b();
        VersionRequirementTable versionRequirementTableM90933b = VersionRequirementTable.Companion.m90933b();
        list.getClass();
        return function2.invoke(new MemberDeserializer(new DeserializationContext(deserializationComponentsM88960a, nameResolver, moduleDescriptorM88961b, typeTable, versionRequirementTableM90933b, binaryVersion, null, null, list)), m);
    }

    @Nullable
    /* JADX INFO: renamed from: i */
    public static final ReceiverParameterDescriptor m88046i(@NotNull CallableDescriptor callableDescriptor) {
        callableDescriptor.getClass();
        if (callableDescriptor.mo88444Y() == null) {
            return null;
        }
        DeclarationDescriptor declarationDescriptorMo88299b = callableDescriptor.mo88299b();
        declarationDescriptorMo88299b.getClass();
        return ((ClassDescriptor) declarationDescriptorMo88299b).mo88456R();
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public static final FqName m88047j() {
        return f63724a;
    }

    /* JADX INFO: renamed from: k */
    public static final boolean m88048k(@NotNull KType kType) {
        kType.getClass();
        KClassifier kClassifierMo87559i = kType.getClassifier();
        KClassImpl kClassImpl = kClassifierMo87559i instanceof KClassImpl ? (KClassImpl) kClassifierMo87559i : null;
        return (kClassImpl == null || !kClassImpl.mo87469q() || kClassImpl.m87757e0()) ? false : true;
    }

    /* JADX INFO: renamed from: l */
    public static final boolean m88049l(@NotNull KType kType) {
        kType.getClass();
        KClassifier kClassifierMo87559i = kType.getClassifier();
        KClassImpl kClassImpl = kClassifierMo87559i instanceof KClassImpl ? (KClassImpl) kClassifierMo87559i : null;
        return kClassImpl != null && kClassImpl.m87757e0();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: m */
    public static final Class<?> m88050m(ClassLoader classLoader, String str, String str2, int i) {
        if (Intrinsics.m87488d(str, "kotlin")) {
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
        sb.append(C15386d.m93478E(str2, '.', '$', false, 4, null));
        if (i > 0) {
            sb.append(com.meituan.robust.Constants.PACKNAME_END);
        }
        return ReflectJavaClassFinderKt.m88944a(classLoader, sb.toString());
    }

    @Nullable
    /* JADX INFO: renamed from: n */
    public static final Class<?> m88051n(@NotNull ClassLoader classLoader, @NotNull ClassId classId, int i) {
        classLoader.getClass();
        classId.getClass();
        ClassId classIdM88356n = JavaToKotlinClassMap.INSTANCE.m88356n(classId.m91034a().m91054i());
        if (classIdM88356n == null) {
            classIdM88356n = classId;
        }
        if (!Intrinsics.m87488d(classIdM88356n, classId)) {
            classLoader = ReflectClassUtilKt.m88996j(Unit.class);
        }
        return m88050m(classLoader, classIdM88356n.m91038f().m91046a(), classIdM88356n.m91039g().m91046a(), i);
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ Class m88052o(ClassLoader classLoader, ClassId classId, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return m88051n(classLoader, classId, i);
    }

    /* JADX INFO: renamed from: p */
    public static final Annotation m88053p(AnnotationDescriptor annotationDescriptor) {
        ClassDescriptor classDescriptorM91979l = DescriptorUtilsKt.m91979l(annotationDescriptor);
        Class<?> clsM88054q = classDescriptorM91979l != null ? m88054q(classDescriptorM91979l) : null;
        if (clsM88054q == null) {
            clsM88054q = null;
        }
        if (clsM88054q == null) {
            return null;
        }
        Set<Map.Entry<Name, ConstantValue<?>>> setEntrySet = annotationDescriptor.mo88630a().entrySet();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Name name = (Name) entry.getKey();
            ConstantValue constantValue = (ConstantValue) entry.getValue();
            ClassLoader classLoader = clsM88054q.getClassLoader();
            classLoader.getClass();
            Object objM88056s = m88056s(constantValue, classLoader);
            Pair pairM87240a = objM88056s != null ? TuplesKt.m87240a(name.m91082b(), objM88056s) : null;
            if (pairM87240a != null) {
                arrayList.add(pairM87240a);
            }
        }
        return (Annotation) AnnotationConstructorCallerKt.m88071h(clsM88054q, MapsKt.toMap(arrayList), null, 4, null);
    }

    @Nullable
    /* JADX INFO: renamed from: q */
    public static final Class<?> m88054q(@NotNull ClassDescriptor classDescriptor) {
        classDescriptor.getClass();
        SourceElement source = classDescriptor.getSource();
        source.getClass();
        if (source instanceof KotlinJvmBinarySourceElement) {
            KotlinJvmBinaryClass kotlinJvmBinaryClassM90368d = ((KotlinJvmBinarySourceElement) source).m90368d();
            kotlinJvmBinaryClassM90368d.getClass();
            return ((ReflectKotlinClass) kotlinJvmBinaryClassM90368d).m88948d();
        }
        if (source instanceof RuntimeSourceElementFactory.RuntimeSourceElement) {
            ReflectJavaElement reflectJavaElementMo88965c = ((RuntimeSourceElementFactory.RuntimeSourceElement) source).mo88965c();
            reflectJavaElementMo88965c.getClass();
            return ((ReflectJavaClass) reflectJavaElementMo88965c).getElement();
        }
        ClassId classIdM91981n = DescriptorUtilsKt.m91981n(classDescriptor);
        if (classIdM91981n == null) {
            return null;
        }
        return m88052o(ReflectClassUtilKt.m88996j(classDescriptor.getClass()), classIdM91981n, 0, 2, null);
    }

    @Nullable
    /* JADX INFO: renamed from: r */
    public static final KVisibility m88055r(@NotNull DescriptorVisibility descriptorVisibility) {
        descriptorVisibility.getClass();
        if (Intrinsics.m87488d(descriptorVisibility, DescriptorVisibilities.f64026e)) {
            return KVisibility.PUBLIC;
        }
        if (Intrinsics.m87488d(descriptorVisibility, DescriptorVisibilities.f64024c)) {
            return KVisibility.PROTECTED;
        }
        if (Intrinsics.m87488d(descriptorVisibility, DescriptorVisibilities.f64025d)) {
            return KVisibility.INTERNAL;
        }
        if (Intrinsics.m87488d(descriptorVisibility, DescriptorVisibilities.f64022a) || Intrinsics.m87488d(descriptorVisibility, DescriptorVisibilities.f64023b)) {
            return KVisibility.PRIVATE;
        }
        return null;
    }

    /* JADX INFO: renamed from: s */
    public static final Object m88056s(ConstantValue<?> constantValue, ClassLoader classLoader) {
        if (constantValue instanceof AnnotationValue) {
            return m88053p(((AnnotationValue) constantValue).mo91918b());
        }
        if (constantValue instanceof ArrayValue) {
            return m88038a((ArrayValue) constantValue, classLoader);
        }
        if (constantValue instanceof EnumValue) {
            Pair<? extends ClassId, ? extends Name> pairMo91918b = ((EnumValue) constantValue).mo91918b();
            ClassId classIdComponent1 = pairMo91918b.component1();
            Name nameComponent2 = pairMo91918b.component2();
            Class clsM88052o = m88052o(classLoader, classIdComponent1, 0, 2, null);
            if (clsM88052o != null) {
                return bdk0.m101184a(clsM88052o, nameComponent2.m91082b());
            }
            return null;
        }
        if (!(constantValue instanceof KClassValue)) {
            if ((constantValue instanceof ErrorValue) || (constantValue instanceof NullValue)) {
                return null;
            }
            return constantValue.mo91918b();
        }
        KClassValue.Value valueMo91918b = ((KClassValue) constantValue).mo91918b();
        if (valueMo91918b instanceof KClassValue.Value.NormalClass) {
            KClassValue.Value.NormalClass normalClass = (KClassValue.Value.NormalClass) valueMo91918b;
            return m88051n(classLoader, normalClass.m91952b(), normalClass.m91951a());
        }
        if (!(valueMo91918b instanceof KClassValue.Value.LocalClass)) {
            l9r.m149037a();
            return null;
        }
        ClassifierDescriptor classifierDescriptorMo88316e = ((KClassValue.Value.LocalClass) valueMo91918b).m91950a().mo91890G0().mo88316e();
        ClassDescriptor classDescriptor = classifierDescriptorMo88316e instanceof ClassDescriptor ? (ClassDescriptor) classifierDescriptorMo88316e : null;
        if (classDescriptor != null) {
            return m88054q(classDescriptor);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, java.util.List<? extends java.lang.annotation.Annotation>, java.util.List<java.lang.annotation.Annotation>] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.List<java.lang.annotation.Annotation>] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.ArrayList, java.util.Collection] */
    @NotNull
    /* JADX INFO: renamed from: t */
    public static final List<Annotation> m88057t(@NotNull List<? extends Annotation> list) throws IllegalAccessException, InvocationTargetException {
        List listListOf;
        list.getClass();
        Iterable<Annotation> iterable = (Iterable) list;
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return list;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            if (Intrinsics.m87488d(JvmClassMappingKt.m87452b(JvmClassMappingKt.m87451a((Annotation) it.next())).getSimpleName(), "Container")) {
                list = new ArrayList<>();
                for (Annotation annotation : iterable) {
                    Class clsM87452b = JvmClassMappingKt.m87452b(JvmClassMappingKt.m87451a(annotation));
                    if (!Intrinsics.m87488d(clsM87452b.getSimpleName(), "Container") || clsM87452b.getAnnotation(RepeatableContainer.class) == null) {
                        listListOf = CollectionsKt.listOf(annotation);
                    } else {
                        Object objInvoke = clsM87452b.getDeclaredMethod("value", null).invoke(annotation, null);
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
