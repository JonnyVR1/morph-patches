package kotlin.reflect.jvm.internal;

import com.clevertap.android.sdk.Constants;
import com.facebook.AuthenticationTokenClaims;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p051p1.mobile.putong.data.BloodType;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.KProperty;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeParameter;
import kotlin.reflect.jvm.internal.impl.SpecialJvmAnnotations;
import kotlin.reflect.jvm.internal.impl.builtins.CompanionObjectMapping;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.EmptyPackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectKotlinClass;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.RuntimeModuleData;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.Java16SealedRecordLoader;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoBufUtilKt;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.p124km.Attributes;
import kotlin.reflect.jvm.internal.impl.p124km.ClassKind;
import kotlin.reflect.jvm.internal.impl.p124km.KmClass;
import kotlin.reflect.jvm.internal.impl.p124km.internal.ReadersKt;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.GivenFunctionsMemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.text.C15493d;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.axq;
import p153l.azq;
import p153l.bxq;
import p153l.c4s;
import p153l.cxq;
import p153l.dxq;
import p153l.exq;
import p153l.fxq;
import p153l.gxq;
import p153l.hxq;
import p153l.ixq;
import p153l.jxq;
import p153l.kxq;
import p153l.nbr;
import p153l.nwq;
import p153l.owq;
import p153l.p7f;
import p153l.pwq;
import p153l.qwq;
import p153l.rwq;
import p153l.swq;
import p153l.twq;
import p153l.uwq;
import p153l.vwq;
import p153l.wwq;
import p153l.xwq;
import p153l.ywq;
import p153l.zwq;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 ^*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00028\u00000\u00042\u00020\u00052\u00020\u0006:\u0002_^B\u0015\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0002\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0002\u0010\u0011J\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0019\u0010\u0017J\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b \u0010!J\u001a\u0010#\u001a\u00020\u001f2\b\u0010\"\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b#\u0010!J\u000f\u0010$\u001a\u00020\u001aH\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b'\u0010(R \u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R'\u00102\u001a\u0012\u0012\u000e\u0012\f0.R\b\u0012\u0004\u0012\u00028\u00000\u00000-8\u0006¢\u0006\f\n\u0004\b+\u0010/\u001a\u0004\b0\u00101R\u001a\u00106\u001a\b\u0012\u0004\u0012\u0002030\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b4\u00105R\u0016\u00108\u001a\u0004\u0018\u00010&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b7\u0010(R\u0016\u0010:\u001a\u0004\u0018\u00010&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b9\u0010(R\u001a\u0010?\u001a\b\u0012\u0004\u0012\u00020<0;8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b=\u0010>R\u001a\u0010A\u001a\b\u0012\u0004\u0012\u00020@0;8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010>R\u0014\u0010D\u001a\u00020\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bB\u0010CR\u0014\u0010F\u001a\u00020\u001f8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bE\u0010CR\u0014\u0010I\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bG\u0010HR\u0016\u0010M\u001a\u0004\u0018\u00010J8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bK\u0010LR\u0014\u0010\f\u001a\u00020\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bN\u0010OR\u0014\u0010S\u001a\u00020P8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010RR\u0014\u0010W\u001a\u00020T8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bU\u0010VR\u0014\u0010Y\u001a\u00020T8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bX\u0010VR\u0014\u0010]\u001a\u00020Z8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b[\u0010\\¨\u0006`"}, m88121d2 = {"Lkotlin/reflect/jvm/internal/KClassImpl;", "", p7f.GPS_DIRECTION_TRUE, "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "Lkotlin/reflect/KClass;", "Lkotlin/reflect/jvm/internal/KClassifierImpl;", "Lkotlin/reflect/jvm/internal/KTypeParameterOwnerImpl;", "Ljava/lang/Class;", "jClass", "<init>", "(Ljava/lang/Class;)V", "Lkotlin/reflect/jvm/internal/impl/name/ClassId;", "classId", "Lkotlin/reflect/jvm/internal/impl/descriptors/runtime/components/RuntimeModuleData;", "moduleData", "Lkotlin/reflect/jvm/internal/impl/descriptors/ClassDescriptor;", "U", "(Lkotlin/reflect/jvm/internal/impl/name/ClassId;Lkotlin/reflect/jvm/internal/impl/descriptors/runtime/components/RuntimeModuleData;)Lkotlin/reflect/jvm/internal/impl/descriptors/ClassDescriptor;", "Lkotlin/reflect/jvm/internal/impl/name/Name;", AuthenticationTokenClaims.JSON_KEY_NAME, "", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "I", "(Lkotlin/reflect/jvm/internal/impl/name/Name;)Ljava/util/Collection;", "Lkotlin/reflect/jvm/internal/impl/descriptors/FunctionDescriptor;", "E", "", FirebaseAnalytics.Param.INDEX, "F", "(I)Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "value", "", "isInstance", "(Ljava/lang/Object;)Z", "other", "equals", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "c", "Ljava/lang/Class;", Constants.INAPP_DATA_TAG, "()Ljava/lang/Class;", "Lkotlin/Lazy;", "Lkotlin/reflect/jvm/internal/KClassImpl$Data;", "Lkotlin/Lazy;", "Y", "()Lkotlin/Lazy;", "data", "Lkotlin/reflect/jvm/internal/impl/descriptors/ConstructorDescriptor;", "D", "()Ljava/util/Collection;", "constructorDescriptors", BLiveStormDanmakuGiftResourceType.f45294s, "simpleName", "r", "qualifiedName", "", "Lkotlin/reflect/KTypeParameter;", "getTypeParameters", "()Ljava/util/List;", "typeParameters", "Lkotlin/reflect/KType;", "supertypes", "q", "()Z", "isValue", "e0", "isInline", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", "descriptor", "Lkotlin/reflect/jvm/internal/impl/km/KmClass;", "getKmClass", "()Lkotlin/metadata/KmClass;", "kmClass", "getClassId", "()Lorg/jetbrains/kotlin/name/ClassId;", "Lkotlin/reflect/jvm/internal/impl/km/ClassKind;", "getClassKind$kotlin_reflection", "()Lkotlin/metadata/ClassKind;", "classKind", "Lkotlin/reflect/jvm/internal/impl/resolve/scopes/MemberScope;", "getMemberScope$kotlin_reflection", "()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;", "memberScope", "getStaticScope$kotlin_reflection", "staticScope", "Lkotlin/reflect/jvm/internal/impl/km/Modality;", "getModality", "()Lkotlin/metadata/Modality;", "modality", "Companion", "Data", "kotlin-reflection"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class KClassImpl<T> extends KDeclarationContainerImpl implements KClass<T>, KClassifierImpl, KTypeParameterOwnerImpl {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final Set<String> f64291e;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final Class<T> jClass;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final Lazy<KClassImpl<T>.Data> data;

    @Metadata(m88120d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m88121d2 = {"Lkotlin/reflect/jvm/internal/KClassImpl$Companion;", "", "<init>", "()V", "SPECIAL_JVM_ANNOTATION_NAMES", "", "", "kotlin-reflection"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(m88120d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u000b\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0086\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001b\u0010\b\u001a\u00020\u00072\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0005H\u0002¢\u0006\u0004\b\b\u0010\tR\u001d\u0010\u000f\u001a\u0004\u0018\u00010\n8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0015\u001a\u00020\u00108FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R!\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0012\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\u001f\u001a\u0004\u0018\u00010\u00078FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0012\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010\"\u001a\u0004\u0018\u00010\u00078FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u0012\u001a\u0004\b!\u0010\u001eR-\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000$0#8FX\u0086\u0084\u0002¢\u0006\u0012\n\u0004\b%\u0010\u0012\u0012\u0004\b(\u0010)\u001a\u0004\b&\u0010'R%\u0010.\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030+0#8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b,\u0010\u0012\u001a\u0004\b-\u0010'R#\u00103\u001a\u0004\u0018\u00018\u00008FX\u0086\u0084\u0002¢\u0006\u0012\n\u0004\b/\u0010\f\u0012\u0004\b2\u0010)\u001a\u0004\b0\u00101R!\u00107\u001a\b\u0012\u0004\u0012\u0002040\u00168FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b5\u0010\u0012\u001a\u0004\b6\u0010\u001aR!\u0010;\u001a\b\u0012\u0004\u0012\u0002080\u00168FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b9\u0010\u0012\u001a\u0004\b:\u0010\u001aR)\u0010>\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000+0\u00168FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b<\u0010\u0012\u001a\u0004\b=\u0010\u001aR%\u0010B\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030?0#8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b@\u0010\u0012\u001a\u0004\bA\u0010'R%\u0010E\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030?0#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bC\u0010\u0012\u001a\u0004\bD\u0010'R%\u0010H\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030?0#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bF\u0010\u0012\u001a\u0004\bG\u0010'R%\u0010K\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030?0#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bI\u0010\u0012\u001a\u0004\bJ\u0010'R%\u0010N\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030?0#8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bL\u0010\u0012\u001a\u0004\bM\u0010'R%\u0010Q\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030?0#8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bO\u0010\u0012\u001a\u0004\bP\u0010'R%\u0010T\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030?0#8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bR\u0010\u0012\u001a\u0004\bS\u0010'R%\u0010W\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030?0#8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bU\u0010\u0012\u001a\u0004\bV\u0010'¨\u0006X"}, m88121d2 = {"Lkotlin/reflect/jvm/internal/KClassImpl$Data;", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$Data;", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "<init>", "(Lkotlin/reflect/jvm/internal/KClassImpl;)V", "Ljava/lang/Class;", "jClass", "", c4s.C_ZONE, "(Ljava/lang/Class;)Ljava/lang/String;", "Lkotlin/reflect/jvm/internal/impl/km/KmClass;", Constants.INAPP_DATA_TAG, "Lkotlin/Lazy;", "getKmClass", "()Lkotlin/metadata/KmClass;", "kmClass", "Lkotlin/reflect/jvm/internal/impl/descriptors/ClassDescriptor;", "e", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", "descriptor", "", "", "f", "getAnnotations", "()Ljava/util/List;", "annotations", "g", "R", "()Ljava/lang/String;", "simpleName", "h", "Q", "qualifiedName", "", "Lkotlin/reflect/KFunction;", RXScreenCaptureService.KEY_INDEX, "getConstructors", "()Ljava/util/Collection;", "getConstructors$annotations", "()V", "constructors", "Lkotlin/reflect/KClass;", "j", "getNestedClasses", "nestedClasses", "k", "getObjectInstance", "()Ljava/lang/Object;", "getObjectInstance$annotations", "objectInstance", "Lkotlin/reflect/KTypeParameter;", BLiveStormDanmakuGiftResourceType.f45292l, p7f.GPS_DIRECTION_TRUE, "typeParameters", "Lkotlin/reflect/KType;", "m", p7f.LATITUDE_SOUTH, "supertypes", "n", "getSealedSubclasses", "sealedSubclasses", "Lkotlin/reflect/jvm/internal/KCallableImpl;", "o", "K", "declaredNonStaticMembers", "p", "L", "declaredStaticMembers", "q", "N", "inheritedNonStaticMembers", "r", BloodType.f39576O, "inheritedStaticMembers", BLiveStormDanmakuGiftResourceType.f45294s, "I", "allNonStaticMembers", Constants.KEY_T, "J", "allStaticMembers", "u", "getDeclaredMembers", "declaredMembers", ResourceDirection.f39656v, "getAllMembers", "allMembers", "kotlin-reflection"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    @SourceDebugExtension
    public final class Data extends KDeclarationContainerImpl.Data {

        /* JADX INFO: renamed from: x */
        public static final /* synthetic */ KProperty<Object>[] f64294x = {Reflection.m88403i(new PropertyReference1Impl(Data.class, "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", 0)), Reflection.m88403i(new PropertyReference1Impl(Data.class, "annotations", "getAnnotations()Ljava/util/List;", 0)), Reflection.m88403i(new PropertyReference1Impl(Data.class, "simpleName", "getSimpleName()Ljava/lang/String;", 0)), Reflection.m88403i(new PropertyReference1Impl(Data.class, "qualifiedName", "getQualifiedName()Ljava/lang/String;", 0)), Reflection.m88403i(new PropertyReference1Impl(Data.class, "constructors", "getConstructors()Ljava/util/Collection;", 0)), Reflection.m88403i(new PropertyReference1Impl(Data.class, "nestedClasses", "getNestedClasses()Ljava/util/Collection;", 0)), Reflection.m88403i(new PropertyReference1Impl(Data.class, "typeParameters", "getTypeParameters()Ljava/util/List;", 0)), Reflection.m88403i(new PropertyReference1Impl(Data.class, "supertypes", "getSupertypes()Ljava/util/List;", 0)), Reflection.m88403i(new PropertyReference1Impl(Data.class, "sealedSubclasses", "getSealedSubclasses()Ljava/util/List;", 0)), Reflection.m88403i(new PropertyReference1Impl(Data.class, "declaredNonStaticMembers", "getDeclaredNonStaticMembers()Ljava/util/Collection;", 0)), Reflection.m88403i(new PropertyReference1Impl(Data.class, "declaredStaticMembers", "getDeclaredStaticMembers()Ljava/util/Collection;", 0)), Reflection.m88403i(new PropertyReference1Impl(Data.class, "inheritedNonStaticMembers", "getInheritedNonStaticMembers()Ljava/util/Collection;", 0)), Reflection.m88403i(new PropertyReference1Impl(Data.class, "inheritedStaticMembers", "getInheritedStaticMembers()Ljava/util/Collection;", 0)), Reflection.m88403i(new PropertyReference1Impl(Data.class, "allNonStaticMembers", "getAllNonStaticMembers()Ljava/util/Collection;", 0)), Reflection.m88403i(new PropertyReference1Impl(Data.class, "allStaticMembers", "getAllStaticMembers()Ljava/util/Collection;", 0)), Reflection.m88403i(new PropertyReference1Impl(Data.class, "declaredMembers", "getDeclaredMembers()Ljava/util/Collection;", 0)), Reflection.m88403i(new PropertyReference1Impl(Data.class, "allMembers", "getAllMembers()Ljava/util/Collection;", 0))};

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @NotNull
        public final Lazy kmClass;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @NotNull
        public final ReflectProperties.LazySoftVal descriptor;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @NotNull
        public final ReflectProperties.LazySoftVal annotations;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        @NotNull
        public final ReflectProperties.LazySoftVal simpleName;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        @NotNull
        public final ReflectProperties.LazySoftVal qualifiedName;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        @NotNull
        public final ReflectProperties.LazySoftVal constructors;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata */
        @NotNull
        public final ReflectProperties.LazySoftVal nestedClasses;

        /* JADX INFO: renamed from: k, reason: from kotlin metadata */
        @NotNull
        public final Lazy objectInstance;

        /* JADX INFO: renamed from: l, reason: from kotlin metadata */
        @NotNull
        public final ReflectProperties.LazySoftVal typeParameters;

        /* JADX INFO: renamed from: m, reason: from kotlin metadata */
        @NotNull
        public final ReflectProperties.LazySoftVal supertypes;

        /* JADX INFO: renamed from: n, reason: from kotlin metadata */
        @NotNull
        public final ReflectProperties.LazySoftVal sealedSubclasses;

        /* JADX INFO: renamed from: o, reason: from kotlin metadata */
        @NotNull
        public final ReflectProperties.LazySoftVal declaredNonStaticMembers;

        /* JADX INFO: renamed from: p, reason: from kotlin metadata */
        @NotNull
        public final ReflectProperties.LazySoftVal declaredStaticMembers;

        /* JADX INFO: renamed from: q, reason: from kotlin metadata */
        @NotNull
        public final ReflectProperties.LazySoftVal inheritedNonStaticMembers;

        /* JADX INFO: renamed from: r, reason: from kotlin metadata */
        @NotNull
        public final ReflectProperties.LazySoftVal inheritedStaticMembers;

        /* JADX INFO: renamed from: s, reason: from kotlin metadata */
        @NotNull
        public final ReflectProperties.LazySoftVal allNonStaticMembers;

        /* JADX INFO: renamed from: t, reason: from kotlin metadata */
        @NotNull
        public final ReflectProperties.LazySoftVal allStaticMembers;

        /* JADX INFO: renamed from: u, reason: from kotlin metadata */
        @NotNull
        public final ReflectProperties.LazySoftVal declaredMembers;

        /* JADX INFO: renamed from: v, reason: from kotlin metadata */
        @NotNull
        public final ReflectProperties.LazySoftVal allMembers;

        public Data() {
            super();
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            this.kmClass = LazyKt__LazyJVMKt.m88117a(lazyThreadSafetyMode, new qwq(this));
            this.descriptor = ReflectProperties.m88885c(new bxq(KClassImpl.this));
            this.annotations = ReflectProperties.m88885c(new dxq(KClassImpl.this));
            this.simpleName = ReflectProperties.m88885c(new exq(KClassImpl.this, this));
            this.qualifiedName = ReflectProperties.m88885c(new fxq(KClassImpl.this));
            this.constructors = ReflectProperties.m88885c(new gxq(KClassImpl.this));
            this.nestedClasses = ReflectProperties.m88885c(new hxq(this, KClassImpl.this));
            this.objectInstance = LazyKt__LazyJVMKt.m88117a(lazyThreadSafetyMode, new ixq(this, KClassImpl.this));
            this.typeParameters = ReflectProperties.m88885c(new jxq(this, KClassImpl.this));
            this.supertypes = ReflectProperties.m88885c(new kxq(this, KClassImpl.this));
            this.sealedSubclasses = ReflectProperties.m88885c(new rwq(KClassImpl.this, this));
            this.declaredNonStaticMembers = ReflectProperties.m88885c(new swq(KClassImpl.this));
            this.declaredStaticMembers = ReflectProperties.m88885c(new twq(KClassImpl.this));
            this.inheritedNonStaticMembers = ReflectProperties.m88885c(new uwq(KClassImpl.this));
            this.inheritedStaticMembers = ReflectProperties.m88885c(new vwq(KClassImpl.this));
            this.allNonStaticMembers = ReflectProperties.m88885c(new wwq(this));
            this.allStaticMembers = ReflectProperties.m88885c(new xwq(this));
            this.declaredMembers = ReflectProperties.m88885c(new ywq(this));
            this.allMembers = ReflectProperties.m88885c(new zwq(this));
        }

        /* JADX INFO: renamed from: A */
        public static final List m88649A(Data data) {
            return CollectionsKt.plus((Collection) data.m88695L(), (Iterable) data.m88698O());
        }

        /* JADX INFO: renamed from: B */
        public static final List m88650B(KClassImpl kClassImpl) {
            Annotation[] annotations = kClassImpl.mo88354d().getAnnotations();
            annotations.getClass();
            ArrayList arrayList = new ArrayList();
            for (Annotation annotation : annotations) {
                if (!KClassImpl.f64291e.contains(JvmClassMappingKt.m88341b(JvmClassMappingKt.m88340a(annotation)).getName())) {
                    arrayList.add(annotation);
                }
            }
            return UtilKt.m88948t(arrayList);
        }

        /* JADX INFO: renamed from: D */
        public static final List m88651D(KClassImpl kClassImpl) {
            Collection<ConstructorDescriptor> collectionMo88565D = kClassImpl.mo88565D();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(collectionMo88565D, 10));
            Iterator<T> it = collectionMo88565D.iterator();
            while (it.hasNext()) {
                arrayList.add(new KFunctionImpl(kClassImpl, (ConstructorDescriptor) it.next()));
            }
            return arrayList;
        }

        /* JADX INFO: renamed from: E */
        public static final List m88652E(Data data) {
            return CollectionsKt.plus((Collection) data.m88694K(), (Iterable) data.m88695L());
        }

        /* JADX INFO: renamed from: F */
        public static final Collection m88653F(KClassImpl kClassImpl) {
            return kClassImpl.m88714G(kClassImpl.m88645c0(), KDeclarationContainerImpl.MemberBelonginess.DECLARED);
        }

        /* JADX INFO: renamed from: G */
        public static final Collection m88654G(KClassImpl kClassImpl) {
            return kClassImpl.m88714G(kClassImpl.m88646d0(), KDeclarationContainerImpl.MemberBelonginess.DECLARED);
        }

        /* JADX INFO: renamed from: H */
        public static final ClassDescriptor m88655H(KClassImpl kClassImpl) {
            ClassId classIdM88640W = kClassImpl.m88640W();
            RuntimeModuleData runtimeModuleDataM88731b = kClassImpl.m88642Y().getValue().m88731b();
            ClassDescriptor classDescriptorM93041b = (classIdM88640W.m91932i() && kClassImpl.mo88354d().isAnnotationPresent(Metadata.class)) ? runtimeModuleDataM88731b.m89851a().m93041b(classIdM88640W) : FindClassInModuleKt.m89398b(runtimeModuleDataM88731b.m89852b(), classIdM88640W);
            return classDescriptorM93041b == null ? kClassImpl.m88639U(classIdM88640W, runtimeModuleDataM88731b) : classDescriptorM93041b;
        }

        /* JADX INFO: renamed from: U */
        public static final Collection m88656U(KClassImpl kClassImpl) {
            return kClassImpl.m88714G(kClassImpl.m88645c0(), KDeclarationContainerImpl.MemberBelonginess.INHERITED);
        }

        /* JADX INFO: renamed from: V */
        public static final Collection m88657V(KClassImpl kClassImpl) {
            return kClassImpl.m88714G(kClassImpl.m88646d0(), KDeclarationContainerImpl.MemberBelonginess.INHERITED);
        }

        /* JADX INFO: renamed from: W */
        public static final KmClass m88658W(Data data) {
            ClassDescriptor classDescriptorM88696M = data.m88696M();
            DeserializedClassDescriptor deserializedClassDescriptor = classDescriptorM88696M instanceof DeserializedClassDescriptor ? (DeserializedClassDescriptor) classDescriptorM88696M : null;
            if (deserializedClassDescriptor != null) {
                return ReadersKt.m90134j(deserializedClassDescriptor.m93207X0(), deserializedClassDescriptor.m93206W0().m93075g(), false, null, 6, null);
            }
            return null;
        }

        /* JADX INFO: renamed from: X */
        public static final List m88659X(Data data, KClassImpl kClassImpl) {
            KmClass kmClassM88699P = data.m88699P();
            if (kmClassM88699P == null) {
                Class<?>[] declaredClasses = kClassImpl.mo88354d().getDeclaredClasses();
                declaredClasses.getClass();
                ArrayList arrayList = new ArrayList();
                for (Class<?> cls : declaredClasses) {
                    cls.getClass();
                    KClass kClassM88344e = JvmClassMappingKt.m88344e(cls);
                    if (kClassM88344e != null) {
                        arrayList.add(kClassM88344e);
                    }
                }
                return arrayList;
            }
            ClassId classIdM88880b = MetadataUtilKt.m88880b(kmClassM88699P.m90001l());
            ClassLoader classLoaderM89887j = ReflectClassUtilKt.m89887j(kClassImpl.mo88354d());
            List<String> listM90002m = kmClassM88699P.m90002m();
            ArrayList arrayList2 = new ArrayList();
            Iterator<T> it = listM90002m.iterator();
            while (it.hasNext()) {
                Name nameM91970i = Name.m91970i((String) it.next());
                nameM91970i.getClass();
                Class clsM88943o = UtilKt.m88943o(classLoaderM89887j, classIdM88880b.m91927d(nameM91970i), 0, 2, null);
                KClass kClassM88344e2 = clsM88943o != null ? JvmClassMappingKt.m88344e(clsM88943o) : null;
                if (kClassM88344e2 != null) {
                    arrayList2.add(kClassM88344e2);
                }
            }
            return arrayList2;
        }

        /* JADX INFO: renamed from: Y */
        public static final Object m88660Y(Data data, KClassImpl kClassImpl) throws IllegalAccessException {
            KmClass kmClassM88699P = data.m88699P();
            if (kmClassM88699P == null || !(Attributes.m89972a(kmClassM88699P) == ClassKind.OBJECT || Attributes.m89972a(kmClassM88699P) == ClassKind.COMPANION_OBJECT)) {
                return null;
            }
            Object obj = ((Attributes.m89972a(kmClassM88699P) != ClassKind.COMPANION_OBJECT || CollectionsKt.contains(CompanionObjectMapping.INSTANCE.m89029b(), MetadataUtilKt.m88880b(kmClassM88699P.m90001l()).m91928e())) ? kClassImpl.mo88354d().getDeclaredField("INSTANCE") : kClassImpl.mo88354d().getEnclosingClass().getDeclaredField(MetadataUtilKt.m88881c(kmClassM88699P.m90001l()))).get(null);
            obj.getClass();
            return obj;
        }

        /* JADX INFO: renamed from: Z */
        public static final String m88661Z(KClassImpl kClassImpl) {
            if (kClassImpl.mo88354d().isAnonymousClass()) {
                return null;
            }
            ClassId classIdM88640W = kClassImpl.m88640W();
            if (classIdM88640W.m91932i()) {
                return null;
            }
            return classIdM88640W.m91925a().m91937a();
        }

        /* JADX INFO: renamed from: a0 */
        public static final List m88662a0(KClassImpl kClassImpl, Data data) throws IllegalAccessException, InvocationTargetException {
            List listEmptyList;
            ClassLoader classLoaderM89887j = ReflectClassUtilKt.m89887j(kClassImpl.mo88354d());
            KmClass kmClassM88699P = data.m88699P();
            if (kmClassM88699P != null) {
                List<String> listM90003n = kmClassM88699P.m90003n();
                listEmptyList = new ArrayList();
                Iterator<T> it = listM90003n.iterator();
                while (it.hasNext()) {
                    KClass<?> kClassM88879a = MetadataUtilKt.m88879a(classLoaderM89887j, (String) it.next());
                    if (kClassM88879a != null) {
                        listEmptyList.add(kClassM88879a);
                    }
                }
            } else {
                Java16SealedRecordLoader java16SealedRecordLoader = Java16SealedRecordLoader.INSTANCE;
                if (Intrinsics.m88377d(java16SealedRecordLoader.m89869f(kClassImpl.mo88354d()), Boolean.TRUE)) {
                    Class<?>[] clsArrM89866c = java16SealedRecordLoader.m89866c(kClassImpl.mo88354d());
                    if (clsArrM89866c != null) {
                        listEmptyList = new ArrayList(clsArrM89866c.length);
                        for (Class<?> cls : clsArrM89866c) {
                            listEmptyList.add(JvmClassMappingKt.m88344e(cls));
                        }
                    } else {
                        listEmptyList = null;
                    }
                    if (listEmptyList == null) {
                        listEmptyList = CollectionsKt.emptyList();
                    }
                } else {
                    listEmptyList = CollectionsKt.emptyList();
                }
            }
            listEmptyList.getClass();
            return listEmptyList;
        }

        /* JADX INFO: renamed from: b0 */
        public static final String m88663b0(KClassImpl kClassImpl, Data data) {
            if (kClassImpl.mo88354d().isAnonymousClass()) {
                return null;
            }
            ClassId classIdM88640W = kClassImpl.m88640W();
            if (classIdM88640W.m91932i()) {
                return data.m88691C(kClassImpl.mo88354d());
            }
            String strM91973b = classIdM88640W.m91931h().m91973b();
            strM91973b.getClass();
            return strM91973b;
        }

        /* JADX INFO: renamed from: c0 */
        public static final List m88664c0(Data data, KClassImpl kClassImpl) {
            Collection<KotlinType> collectionMo89569c = data.m88696M().mo89196l().mo89569c();
            collectionMo89569c.getClass();
            ArrayList arrayList = new ArrayList(collectionMo89569c.size());
            for (KotlinType kotlinType : collectionMo89569c) {
                kotlinType.getClass();
                arrayList.add(new KTypeImpl(kotlinType, new axq(kotlinType, data, kClassImpl)));
            }
            if (!KotlinBuiltIns.m89091v0(data.m88696M())) {
                if (arrayList.isEmpty()) {
                    SimpleType simpleTypeM89123i = DescriptorUtilsKt.m92871m(data.m88696M()).m89123i();
                    simpleTypeM89123i.getClass();
                    arrayList.add(new KTypeImpl(simpleTypeM89123i, cxq.INSTANCE));
                } else {
                    Iterator<T> it = arrayList.iterator();
                    while (it.hasNext()) {
                        kotlin.reflect.jvm.internal.impl.descriptors.ClassKind kind = DescriptorUtils.m92655e(((KTypeImpl) it.next()).getType()).getKind();
                        kind.getClass();
                        if (kind == kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.INTERFACE || kind == kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.ANNOTATION_CLASS) {
                        }
                    }
                    SimpleType simpleTypeM89123i2 = DescriptorUtilsKt.m92871m(data.m88696M()).m89123i();
                    simpleTypeM89123i2.getClass();
                    arrayList.add(new KTypeImpl(simpleTypeM89123i2, cxq.INSTANCE));
                }
            }
            return kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.m94071c(arrayList);
        }

        /* JADX INFO: renamed from: d0 */
        public static final Type m88666d0(KotlinType kotlinType, Data data, KClassImpl kClassImpl) {
            ClassifierDescriptor classifierDescriptorMo89207e = kotlinType.mo92781G0().mo89207e();
            if (!(classifierDescriptorMo89207e instanceof ClassDescriptor)) {
                azq.m101080a("Supertype not a class: ", classifierDescriptorMo89207e);
                return null;
            }
            Class<?> clsM88945q = UtilKt.m88945q((ClassDescriptor) classifierDescriptorMo89207e);
            if (clsM88945q == null) {
                throw new KotlinReflectionInternalError("Unsupported superclass of " + data + ": " + classifierDescriptorMo89207e);
            }
            if (Intrinsics.m88377d(kClassImpl.mo88354d().getSuperclass(), clsM88945q)) {
                Type genericSuperclass = kClassImpl.mo88354d().getGenericSuperclass();
                genericSuperclass.getClass();
                return genericSuperclass;
            }
            Class<?>[] interfaces = kClassImpl.mo88354d().getInterfaces();
            interfaces.getClass();
            int iIndexOf = ArraysKt.indexOf(interfaces, clsM88945q);
            if (iIndexOf >= 0) {
                Type type = kClassImpl.mo88354d().getGenericInterfaces()[iIndexOf];
                type.getClass();
                return type;
            }
            throw new KotlinReflectionInternalError("No superclass of " + data + " in Java reflection for " + classifierDescriptorMo89207e);
        }

        /* JADX INFO: renamed from: e0 */
        public static final Type m88668e0() {
            return Object.class;
        }

        /* JADX INFO: renamed from: f0 */
        public static final List m88670f0(Data data, KClassImpl kClassImpl) {
            List<TypeParameterDescriptor> listMo89200p = data.m88696M().mo89200p();
            listMo89200p.getClass();
            List<TypeParameterDescriptor> list = listMo89200p;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            for (TypeParameterDescriptor typeParameterDescriptor : list) {
                typeParameterDescriptor.getClass();
                arrayList.add(new KTypeParameterImpl(kClassImpl, typeParameterDescriptor));
            }
            return arrayList;
        }

        /* JADX INFO: renamed from: y */
        public static final List m88689y(Data data) {
            return CollectionsKt.plus((Collection) data.m88692I(), (Iterable) data.m88693J());
        }

        /* JADX INFO: renamed from: z */
        public static final List m88690z(Data data) {
            return CollectionsKt.plus((Collection) data.m88694K(), (Iterable) data.m88697N());
        }

        /* JADX INFO: renamed from: C */
        public final String m88691C(Class<?> jClass) {
            String simpleName = jClass.getSimpleName();
            Method enclosingMethod = jClass.getEnclosingMethod();
            if (enclosingMethod != null) {
                return StringsKt.m94300N0(simpleName, enclosingMethod.getName() + '$', null, 2, null);
            }
            Constructor<?> enclosingConstructor = jClass.getEnclosingConstructor();
            if (enclosingConstructor == null) {
                return StringsKt.m94298M0(simpleName, '$', null, 2, null);
            }
            return StringsKt.m94300N0(simpleName, enclosingConstructor.getName() + '$', null, 2, null);
        }

        @NotNull
        /* JADX INFO: renamed from: I */
        public final Collection<KCallableImpl<?>> m88692I() {
            T tM88888b = this.allNonStaticMembers.m88888b(this, f64294x[13]);
            tM88888b.getClass();
            return (Collection) tM88888b;
        }

        @NotNull
        /* JADX INFO: renamed from: J */
        public final Collection<KCallableImpl<?>> m88693J() {
            T tM88888b = this.allStaticMembers.m88888b(this, f64294x[14]);
            tM88888b.getClass();
            return (Collection) tM88888b;
        }

        @NotNull
        /* JADX INFO: renamed from: K */
        public final Collection<KCallableImpl<?>> m88694K() {
            T tM88888b = this.declaredNonStaticMembers.m88888b(this, f64294x[9]);
            tM88888b.getClass();
            return (Collection) tM88888b;
        }

        /* JADX INFO: renamed from: L */
        public final Collection<KCallableImpl<?>> m88695L() {
            T tM88888b = this.declaredStaticMembers.m88888b(this, f64294x[10]);
            tM88888b.getClass();
            return (Collection) tM88888b;
        }

        @NotNull
        /* JADX INFO: renamed from: M */
        public final ClassDescriptor m88696M() {
            T tM88888b = this.descriptor.m88888b(this, f64294x[0]);
            tM88888b.getClass();
            return (ClassDescriptor) tM88888b;
        }

        /* JADX INFO: renamed from: N */
        public final Collection<KCallableImpl<?>> m88697N() {
            T tM88888b = this.inheritedNonStaticMembers.m88888b(this, f64294x[11]);
            tM88888b.getClass();
            return (Collection) tM88888b;
        }

        /* JADX INFO: renamed from: O */
        public final Collection<KCallableImpl<?>> m88698O() {
            T tM88888b = this.inheritedStaticMembers.m88888b(this, f64294x[12]);
            tM88888b.getClass();
            return (Collection) tM88888b;
        }

        @Nullable
        /* JADX INFO: renamed from: P */
        public final KmClass m88699P() {
            return (KmClass) this.kmClass.getValue();
        }

        @Nullable
        /* JADX INFO: renamed from: Q */
        public final String m88700Q() {
            return (String) this.qualifiedName.m88888b(this, f64294x[3]);
        }

        @Nullable
        /* JADX INFO: renamed from: R */
        public final String m88701R() {
            return (String) this.simpleName.m88888b(this, f64294x[2]);
        }

        @NotNull
        /* JADX INFO: renamed from: S */
        public final List<KType> m88702S() {
            T tM88888b = this.supertypes.m88888b(this, f64294x[7]);
            tM88888b.getClass();
            return (List) tM88888b;
        }

        @NotNull
        /* JADX INFO: renamed from: T */
        public final List<KTypeParameter> m88703T() {
            T tM88888b = this.typeParameters.m88888b(this, f64294x[6]);
            tM88888b.getClass();
            return (List) tM88888b;
        }
    }

    @Metadata(m88122k = 3, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f64315a;

        static {
            int[] iArr = new int[KotlinClassHeader.Kind.values().length];
            try {
                iArr[KotlinClassHeader.Kind.FILE_FACADE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[KotlinClassHeader.Kind.MULTIFILE_CLASS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[KotlinClassHeader.Kind.MULTIFILE_CLASS_PART.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[KotlinClassHeader.Kind.SYNTHETIC_CLASS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[KotlinClassHeader.Kind.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[KotlinClassHeader.Kind.CLASS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f64315a = iArr;
        }
    }

    static {
        Set<ClassId> setM89021b = SpecialJvmAnnotations.INSTANCE.m89021b();
        HashSet hashSet = new HashSet();
        Iterator<T> it = setM89021b.iterator();
        while (it.hasNext()) {
            hashSet.add(((ClassId) it.next()).m91925a().toString());
        }
        f64291e = hashSet;
    }

    public KClassImpl(@NotNull Class<T> cls) {
        cls.getClass();
        this.jClass = cls;
        this.data = LazyKt__LazyJVMKt.m88117a(LazyThreadSafetyMode.PUBLICATION, new owq(this));
    }

    /* JADX INFO: renamed from: V */
    public static final Data m88636V(KClassImpl kClassImpl) {
        return new Data();
    }

    /* JADX INFO: renamed from: b0 */
    public static final PropertyDescriptor m88637b0(MemberDeserializer memberDeserializer, ProtoBuf.Property property) {
        memberDeserializer.getClass();
        property.getClass();
        return memberDeserializer.m93122x(property, true);
    }

    @Override // kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    @NotNull
    /* JADX INFO: renamed from: D */
    public Collection<ConstructorDescriptor> mo88565D() {
        ClassDescriptor classDescriptorMo88647e = mo88647e();
        if (classDescriptorMo88647e.getKind() == kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.INTERFACE || classDescriptorMo88647e.getKind() == kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.OBJECT) {
            return CollectionsKt.emptyList();
        }
        Collection<ClassConstructorDescriptor> constructors = classDescriptorMo88647e.getConstructors();
        constructors.getClass();
        return constructors;
    }

    @Override // kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    @NotNull
    /* JADX INFO: renamed from: E */
    public Collection<FunctionDescriptor> mo88566E(@NotNull Name name) {
        name.getClass();
        MemberScope memberScopeM88645c0 = m88645c0();
        NoLookupLocation noLookupLocation = NoLookupLocation.FROM_REFLECTION;
        return CollectionsKt.plus((Collection) memberScopeM88645c0.mo89611b(name, noLookupLocation), (Iterable) m88646d0().mo89611b(name, noLookupLocation));
    }

    @Override // kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    @Nullable
    /* JADX INFO: renamed from: F */
    public PropertyDescriptor mo88567F(int index) {
        Class<?> declaringClass;
        if (Intrinsics.m88377d(mo88354d().getSimpleName(), "DefaultImpls") && (declaringClass = mo88354d().getDeclaringClass()) != null && declaringClass.isInterface()) {
            KClass kClassM88344e = JvmClassMappingKt.m88344e(declaringClass);
            kClassM88344e.getClass();
            return ((KClassImpl) kClassM88344e).mo88567F(index);
        }
        ClassDescriptor classDescriptorMo88647e = mo88647e();
        DeserializedClassDescriptor deserializedClassDescriptor = classDescriptorMo88647e instanceof DeserializedClassDescriptor ? (DeserializedClassDescriptor) classDescriptorMo88647e : null;
        if (deserializedClassDescriptor != null) {
            ProtoBuf.Class classM93207X0 = deserializedClassDescriptor.m93207X0();
            GeneratedMessageLite.GeneratedExtension<ProtoBuf.Class, List<ProtoBuf.Property>> generatedExtension = JvmProtoBuf.f66090j;
            generatedExtension.getClass();
            ProtoBuf.Property property = (ProtoBuf.Property) ProtoBufUtilKt.m91787b(classM93207X0, generatedExtension, index);
            if (property != null) {
                return (PropertyDescriptor) UtilKt.m88936h(mo88354d(), property, deserializedClassDescriptor.m93206W0().m93075g(), deserializedClassDescriptor.m93206W0().m93078j(), deserializedClassDescriptor.m93209Z0(), pwq.INSTANCE);
            }
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    @NotNull
    /* JADX INFO: renamed from: I */
    public Collection<PropertyDescriptor> mo88568I(@NotNull Name name) {
        name.getClass();
        MemberScope memberScopeM88645c0 = m88645c0();
        NoLookupLocation noLookupLocation = NoLookupLocation.FROM_REFLECTION;
        return CollectionsKt.plus((Collection) memberScopeM88645c0.mo89612c(name, noLookupLocation), (Iterable) m88646d0().mo89612c(name, noLookupLocation));
    }

    /* JADX INFO: renamed from: T */
    public final ClassDescriptor m88638T(ClassId classId, RuntimeModuleData moduleData) {
        final ClassDescriptorImpl classDescriptorImpl = new ClassDescriptorImpl(new EmptyPackageFragmentDescriptor(moduleData.m89852b(), classId.m91929f()), classId.m91931h(), Modality.FINAL, kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.CLASS, CollectionsKt.listOf(moduleData.m89852b().mo89437f().m89122h().mo89349o()), SourceElement.f64737a, false, moduleData.m89851a().m93060u());
        final StorageManager storageManagerM93060u = moduleData.m89851a().m93060u();
        classDescriptorImpl.m89596D0(new GivenFunctionsMemberScope(classDescriptorImpl, storageManagerM93060u) { // from class: kotlin.reflect.jvm.internal.KClassImpl$createSyntheticClass$1$1
            @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.GivenFunctionsMemberScope
            /* JADX INFO: renamed from: j */
            public List<FunctionDescriptor> mo88704j() {
                return CollectionsKt.emptyList();
            }
        }, SetsKt.emptySet(), null);
        return classDescriptorImpl;
    }

    /* JADX INFO: renamed from: U */
    public final ClassDescriptor m88639U(ClassId classId, RuntimeModuleData moduleData) {
        KotlinClassHeader kotlinClassHeaderMo89837b;
        if (mo88354d().isSynthetic()) {
            return m88638T(classId, moduleData);
        }
        ReflectKotlinClass reflectKotlinClassM89841a = ReflectKotlinClass.f64995c.m89841a(mo88354d());
        KotlinClassHeader.Kind kindM91307c = (reflectKotlinClassM89841a == null || (kotlinClassHeaderMo89837b = reflectKotlinClassM89841a.mo89837b()) == null) ? null : kotlinClassHeaderMo89837b.m91307c();
        switch (kindM91307c == null ? -1 : WhenMappings.f64315a[kindM91307c.ordinal()]) {
            case -1:
            case 6:
                nwq.m165002a("Unresolved class: ", mo88354d(), " (kind = ", kindM91307c);
                return null;
            case 0:
            default:
                nbr.m162172a();
                return null;
            case 1:
            case 2:
            case 3:
            case 4:
                return m88638T(classId, moduleData);
            case 5:
                nwq.m165002a("Unknown class: ", mo88354d(), " (kind = ", kindM91307c);
                return null;
        }
    }

    /* JADX INFO: renamed from: W */
    public final ClassId m88640W() {
        return RuntimeTypeMapper.INSTANCE.m88920c(mo88354d());
    }

    @NotNull
    /* JADX INFO: renamed from: X */
    public final ClassKind m88641X() {
        ClassKind classKindM89972a;
        KmClass kmClassM88644a0 = m88644a0();
        if (kmClassM88644a0 != null && (classKindM89972a = Attributes.m89972a(kmClassM88644a0)) != null) {
            return classKindM89972a;
        }
        if (mo88354d().isAnnotation()) {
            return ClassKind.ANNOTATION_CLASS;
        }
        if (mo88354d().isInterface()) {
            return ClassKind.INTERFACE;
        }
        if (mo88354d().isEnum()) {
            return ClassKind.ENUM_CLASS;
        }
        return mo88354d().getSuperclass().isEnum() ? ClassKind.ENUM_ENTRY : ClassKind.CLASS;
    }

    @NotNull
    /* JADX INFO: renamed from: Y */
    public final Lazy<KClassImpl<T>.Data> m88642Y() {
        return this.data;
    }

    @Override // kotlin.reflect.jvm.internal.KClassifierImpl
    @NotNull
    /* JADX INFO: renamed from: Z, reason: merged with bridge method [inline-methods] */
    public ClassDescriptor getDescriptor() {
        return this.data.getValue().m88696M();
    }

    /* JADX INFO: renamed from: a0 */
    public final KmClass m88644a0() {
        return this.data.getValue().m88699P();
    }

    @Override // kotlin.reflect.KClass
    @NotNull
    /* JADX INFO: renamed from: c */
    public List<KType> mo88356c() {
        return this.data.getValue().m88702S();
    }

    @NotNull
    /* JADX INFO: renamed from: c0 */
    public final MemberScope m88645c0() {
        return mo88647e().mo89349o().mo90791n();
    }

    @Override // kotlin.jvm.internal.ClassBasedDeclarationContainer
    @NotNull
    /* JADX INFO: renamed from: d */
    public Class<T> mo88354d() {
        return this.jClass;
    }

    @NotNull
    /* JADX INFO: renamed from: d0 */
    public final MemberScope m88646d0() {
        MemberScope memberScopeMo89199o0 = mo88647e().mo89199o0();
        memberScopeMo89199o0.getClass();
        return memberScopeMo89199o0;
    }

    /* JADX INFO: renamed from: e0 */
    public final boolean m88648e0() {
        KmClass kmClassM88644a0 = m88644a0();
        return (kmClassM88644a0 != null ? kmClassM88644a0.m89999j() : null) != null;
    }

    public boolean equals(@Nullable Object other) {
        return (other instanceof KClassImpl) && Intrinsics.m88377d(JvmClassMappingKt.m88342c(this), JvmClassMappingKt.m88342c((KClass) other));
    }

    @Override // kotlin.reflect.KClass
    @NotNull
    public List<KTypeParameter> getTypeParameters() {
        return this.data.getValue().m88703T();
    }

    @Override // kotlin.reflect.KClass
    public int hashCode() {
        return JvmClassMappingKt.m88342c(this).hashCode();
    }

    @Override // kotlin.reflect.KClass
    public boolean isInstance(@Nullable Object value) {
        Integer numM89884g = ReflectClassUtilKt.m89884g(mo88354d());
        if (numM89884g != null) {
            return TypeIntrinsics.m88437o(value, numM89884g.intValue());
        }
        Class clsM89888k = ReflectClassUtilKt.m89888k(mo88354d());
        if (clsM89888k == null) {
            clsM89888k = mo88354d();
        }
        return clsM89888k.isInstance(value);
    }

    @Override // kotlin.reflect.KClass
    /* JADX INFO: renamed from: q */
    public boolean mo88358q() {
        KmClass kmClassM88644a0 = m88644a0();
        return kmClassM88644a0 != null && Attributes.m89973b(kmClassM88644a0);
    }

    @Override // kotlin.reflect.KClass
    @Nullable
    /* JADX INFO: renamed from: r */
    public String mo88359r() {
        return this.data.getValue().m88700Q();
    }

    @Override // kotlin.reflect.KClass
    @Nullable
    /* JADX INFO: renamed from: s */
    public String mo88360s() {
        return this.data.getValue().m88701R();
    }

    @NotNull
    public String toString() {
        String str;
        ClassId classIdM88640W = m88640W();
        FqName fqNameM91929f = classIdM88640W.m91929f();
        if (fqNameM91929f.m91939c()) {
            str = "";
        } else {
            str = fqNameM91929f.m91937a() + '.';
        }
        return "class ".concat(str + C15493d.m94369E(classIdM88640W.m91930g().m91937a(), '.', '$', false, 4, null));
    }
}
