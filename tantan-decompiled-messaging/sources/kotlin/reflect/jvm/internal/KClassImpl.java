package kotlin.reflect.jvm.internal;

import com.clevertap.android.sdk.Constants;
import com.facebook.AuthenticationTokenClaims;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p046p1.mobile.putong.data.BloodType;
import com.p046p1.mobile.putong.data.ResourceDirection;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
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
import kotlin.reflect.jvm.internal.impl.p120km.Attributes;
import kotlin.reflect.jvm.internal.impl.p120km.ClassKind;
import kotlin.reflect.jvm.internal.impl.p120km.KmClass;
import kotlin.reflect.jvm.internal.impl.p120km.internal.ReadersKt;
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
import kotlin.text.C15386d;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.avq;
import p149l.b2s;
import p149l.bvq;
import p149l.cvq;
import p149l.dvq;
import p149l.evq;
import p149l.fvq;
import p149l.gvq;
import p149l.hvq;
import p149l.ivq;
import p149l.j6f;
import p149l.jvq;
import p149l.l9r;
import p149l.muq;
import p149l.nuq;
import p149l.ouq;
import p149l.puq;
import p149l.quq;
import p149l.ruq;
import p149l.suq;
import p149l.tuq;
import p149l.uuq;
import p149l.vuq;
import p149l.wuq;
import p149l.xuq;
import p149l.yuq;
import p149l.zuq;
import p149l.zwq;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 ^*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00028\u00000\u00042\u00020\u00052\u00020\u0006:\u0002_^B\u0015\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0002\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0002\u0010\u0011J\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0019\u0010\u0017J\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b \u0010!J\u001a\u0010#\u001a\u00020\u001f2\b\u0010\"\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b#\u0010!J\u000f\u0010$\u001a\u00020\u001aH\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b'\u0010(R \u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R'\u00102\u001a\u0012\u0012\u000e\u0012\f0.R\b\u0012\u0004\u0012\u00028\u00000\u00000-8\u0006¢\u0006\f\n\u0004\b+\u0010/\u001a\u0004\b0\u00101R\u001a\u00106\u001a\b\u0012\u0004\u0012\u0002030\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b4\u00105R\u0016\u00108\u001a\u0004\u0018\u00010&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b7\u0010(R\u0016\u0010:\u001a\u0004\u0018\u00010&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b9\u0010(R\u001a\u0010?\u001a\b\u0012\u0004\u0012\u00020<0;8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b=\u0010>R\u001a\u0010A\u001a\b\u0012\u0004\u0012\u00020@0;8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010>R\u0014\u0010D\u001a\u00020\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bB\u0010CR\u0014\u0010F\u001a\u00020\u001f8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bE\u0010CR\u0014\u0010I\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bG\u0010HR\u0016\u0010M\u001a\u0004\u0018\u00010J8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bK\u0010LR\u0014\u0010\f\u001a\u00020\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bN\u0010OR\u0014\u0010S\u001a\u00020P8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010RR\u0014\u0010W\u001a\u00020T8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bU\u0010VR\u0014\u0010Y\u001a\u00020T8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bX\u0010VR\u0014\u0010]\u001a\u00020Z8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b[\u0010\\¨\u0006`"}, m87232d2 = {"Lkotlin/reflect/jvm/internal/KClassImpl;", "", j6f.GPS_DIRECTION_TRUE, "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "Lkotlin/reflect/KClass;", "Lkotlin/reflect/jvm/internal/KClassifierImpl;", "Lkotlin/reflect/jvm/internal/KTypeParameterOwnerImpl;", "Ljava/lang/Class;", "jClass", "<init>", "(Ljava/lang/Class;)V", "Lkotlin/reflect/jvm/internal/impl/name/ClassId;", "classId", "Lkotlin/reflect/jvm/internal/impl/descriptors/runtime/components/RuntimeModuleData;", "moduleData", "Lkotlin/reflect/jvm/internal/impl/descriptors/ClassDescriptor;", "U", "(Lkotlin/reflect/jvm/internal/impl/name/ClassId;Lkotlin/reflect/jvm/internal/impl/descriptors/runtime/components/RuntimeModuleData;)Lkotlin/reflect/jvm/internal/impl/descriptors/ClassDescriptor;", "Lkotlin/reflect/jvm/internal/impl/name/Name;", AuthenticationTokenClaims.JSON_KEY_NAME, "", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "I", "(Lkotlin/reflect/jvm/internal/impl/name/Name;)Ljava/util/Collection;", "Lkotlin/reflect/jvm/internal/impl/descriptors/FunctionDescriptor;", "E", "", FirebaseAnalytics.Param.INDEX, "F", "(I)Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "value", "", "isInstance", "(Ljava/lang/Object;)Z", "other", "equals", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "c", "Ljava/lang/Class;", Constants.INAPP_DATA_TAG, "()Ljava/lang/Class;", "Lkotlin/Lazy;", "Lkotlin/reflect/jvm/internal/KClassImpl$Data;", "Lkotlin/Lazy;", "Y", "()Lkotlin/Lazy;", "data", "Lkotlin/reflect/jvm/internal/impl/descriptors/ConstructorDescriptor;", "D", "()Ljava/util/Collection;", "constructorDescriptors", BLiveStormDanmakuGiftResourceType.f44446s, "simpleName", "r", "qualifiedName", "", "Lkotlin/reflect/KTypeParameter;", "getTypeParameters", "()Ljava/util/List;", "typeParameters", "Lkotlin/reflect/KType;", "supertypes", "q", "()Z", "isValue", "e0", "isInline", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", "descriptor", "Lkotlin/reflect/jvm/internal/impl/km/KmClass;", "getKmClass", "()Lkotlin/metadata/KmClass;", "kmClass", "getClassId", "()Lorg/jetbrains/kotlin/name/ClassId;", "Lkotlin/reflect/jvm/internal/impl/km/ClassKind;", "getClassKind$kotlin_reflection", "()Lkotlin/metadata/ClassKind;", "classKind", "Lkotlin/reflect/jvm/internal/impl/resolve/scopes/MemberScope;", "getMemberScope$kotlin_reflection", "()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;", "memberScope", "getStaticScope$kotlin_reflection", "staticScope", "Lkotlin/reflect/jvm/internal/impl/km/Modality;", "getModality", "()Lkotlin/metadata/Modality;", "modality", "Companion", "Data", "kotlin-reflection"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class KClassImpl<T> extends KDeclarationContainerImpl implements KClass<T>, KClassifierImpl, KTypeParameterOwnerImpl {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final Set<String> f63617e;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final Class<T> jClass;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final Lazy<KClassImpl<T>.Data> data;

    @Metadata(m87231d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m87232d2 = {"Lkotlin/reflect/jvm/internal/KClassImpl$Companion;", "", "<init>", "()V", "SPECIAL_JVM_ANNOTATION_NAMES", "", "", "kotlin-reflection"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(m87231d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u000b\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0086\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001b\u0010\b\u001a\u00020\u00072\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0005H\u0002¢\u0006\u0004\b\b\u0010\tR\u001d\u0010\u000f\u001a\u0004\u0018\u00010\n8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0015\u001a\u00020\u00108FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R!\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0012\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\u001f\u001a\u0004\u0018\u00010\u00078FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0012\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010\"\u001a\u0004\u0018\u00010\u00078FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u0012\u001a\u0004\b!\u0010\u001eR-\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000$0#8FX\u0086\u0084\u0002¢\u0006\u0012\n\u0004\b%\u0010\u0012\u0012\u0004\b(\u0010)\u001a\u0004\b&\u0010'R%\u0010.\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030+0#8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b,\u0010\u0012\u001a\u0004\b-\u0010'R#\u00103\u001a\u0004\u0018\u00018\u00008FX\u0086\u0084\u0002¢\u0006\u0012\n\u0004\b/\u0010\f\u0012\u0004\b2\u0010)\u001a\u0004\b0\u00101R!\u00107\u001a\b\u0012\u0004\u0012\u0002040\u00168FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b5\u0010\u0012\u001a\u0004\b6\u0010\u001aR!\u0010;\u001a\b\u0012\u0004\u0012\u0002080\u00168FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b9\u0010\u0012\u001a\u0004\b:\u0010\u001aR)\u0010>\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000+0\u00168FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b<\u0010\u0012\u001a\u0004\b=\u0010\u001aR%\u0010B\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030?0#8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b@\u0010\u0012\u001a\u0004\bA\u0010'R%\u0010E\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030?0#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bC\u0010\u0012\u001a\u0004\bD\u0010'R%\u0010H\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030?0#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bF\u0010\u0012\u001a\u0004\bG\u0010'R%\u0010K\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030?0#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bI\u0010\u0012\u001a\u0004\bJ\u0010'R%\u0010N\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030?0#8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bL\u0010\u0012\u001a\u0004\bM\u0010'R%\u0010Q\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030?0#8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bO\u0010\u0012\u001a\u0004\bP\u0010'R%\u0010T\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030?0#8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bR\u0010\u0012\u001a\u0004\bS\u0010'R%\u0010W\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030?0#8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bU\u0010\u0012\u001a\u0004\bV\u0010'¨\u0006X"}, m87232d2 = {"Lkotlin/reflect/jvm/internal/KClassImpl$Data;", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$Data;", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "<init>", "(Lkotlin/reflect/jvm/internal/KClassImpl;)V", "Ljava/lang/Class;", "jClass", "", b2s.C_ZONE, "(Ljava/lang/Class;)Ljava/lang/String;", "Lkotlin/reflect/jvm/internal/impl/km/KmClass;", Constants.INAPP_DATA_TAG, "Lkotlin/Lazy;", "getKmClass", "()Lkotlin/metadata/KmClass;", "kmClass", "Lkotlin/reflect/jvm/internal/impl/descriptors/ClassDescriptor;", "e", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", "descriptor", "", "", "f", "getAnnotations", "()Ljava/util/List;", "annotations", "g", "R", "()Ljava/lang/String;", "simpleName", "h", "Q", "qualifiedName", "", "Lkotlin/reflect/KFunction;", RXScreenCaptureService.KEY_INDEX, "getConstructors", "()Ljava/util/Collection;", "getConstructors$annotations", "()V", "constructors", "Lkotlin/reflect/KClass;", "j", "getNestedClasses", "nestedClasses", "k", "getObjectInstance", "()Ljava/lang/Object;", "getObjectInstance$annotations", "objectInstance", "Lkotlin/reflect/KTypeParameter;", BLiveStormDanmakuGiftResourceType.f44444l, j6f.GPS_DIRECTION_TRUE, "typeParameters", "Lkotlin/reflect/KType;", "m", j6f.LATITUDE_SOUTH, "supertypes", "n", "getSealedSubclasses", "sealedSubclasses", "Lkotlin/reflect/jvm/internal/KCallableImpl;", "o", "K", "declaredNonStaticMembers", "p", "L", "declaredStaticMembers", "q", "N", "inheritedNonStaticMembers", "r", BloodType.f38728O, "inheritedStaticMembers", BLiveStormDanmakuGiftResourceType.f44446s, "I", "allNonStaticMembers", Constants.KEY_T, "J", "allStaticMembers", "u", "getDeclaredMembers", "declaredMembers", ResourceDirection.f38808v, "getAllMembers", "allMembers", "kotlin-reflection"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    @SourceDebugExtension
    public final class Data extends KDeclarationContainerImpl.Data {

        /* JADX INFO: renamed from: x */
        public static final /* synthetic */ KProperty<Object>[] f63620x = {Reflection.m87514i(new PropertyReference1Impl(Data.class, "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", 0)), Reflection.m87514i(new PropertyReference1Impl(Data.class, "annotations", "getAnnotations()Ljava/util/List;", 0)), Reflection.m87514i(new PropertyReference1Impl(Data.class, "simpleName", "getSimpleName()Ljava/lang/String;", 0)), Reflection.m87514i(new PropertyReference1Impl(Data.class, "qualifiedName", "getQualifiedName()Ljava/lang/String;", 0)), Reflection.m87514i(new PropertyReference1Impl(Data.class, "constructors", "getConstructors()Ljava/util/Collection;", 0)), Reflection.m87514i(new PropertyReference1Impl(Data.class, "nestedClasses", "getNestedClasses()Ljava/util/Collection;", 0)), Reflection.m87514i(new PropertyReference1Impl(Data.class, "typeParameters", "getTypeParameters()Ljava/util/List;", 0)), Reflection.m87514i(new PropertyReference1Impl(Data.class, "supertypes", "getSupertypes()Ljava/util/List;", 0)), Reflection.m87514i(new PropertyReference1Impl(Data.class, "sealedSubclasses", "getSealedSubclasses()Ljava/util/List;", 0)), Reflection.m87514i(new PropertyReference1Impl(Data.class, "declaredNonStaticMembers", "getDeclaredNonStaticMembers()Ljava/util/Collection;", 0)), Reflection.m87514i(new PropertyReference1Impl(Data.class, "declaredStaticMembers", "getDeclaredStaticMembers()Ljava/util/Collection;", 0)), Reflection.m87514i(new PropertyReference1Impl(Data.class, "inheritedNonStaticMembers", "getInheritedNonStaticMembers()Ljava/util/Collection;", 0)), Reflection.m87514i(new PropertyReference1Impl(Data.class, "inheritedStaticMembers", "getInheritedStaticMembers()Ljava/util/Collection;", 0)), Reflection.m87514i(new PropertyReference1Impl(Data.class, "allNonStaticMembers", "getAllNonStaticMembers()Ljava/util/Collection;", 0)), Reflection.m87514i(new PropertyReference1Impl(Data.class, "allStaticMembers", "getAllStaticMembers()Ljava/util/Collection;", 0)), Reflection.m87514i(new PropertyReference1Impl(Data.class, "declaredMembers", "getDeclaredMembers()Ljava/util/Collection;", 0)), Reflection.m87514i(new PropertyReference1Impl(Data.class, "allMembers", "getAllMembers()Ljava/util/Collection;", 0))};

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
            this.kmClass = LazyKt__LazyJVMKt.m87228a(lazyThreadSafetyMode, new puq(this));
            this.descriptor = ReflectProperties.m87994c(new avq(KClassImpl.this));
            this.annotations = ReflectProperties.m87994c(new cvq(KClassImpl.this));
            this.simpleName = ReflectProperties.m87994c(new dvq(KClassImpl.this, this));
            this.qualifiedName = ReflectProperties.m87994c(new evq(KClassImpl.this));
            this.constructors = ReflectProperties.m87994c(new fvq(KClassImpl.this));
            this.nestedClasses = ReflectProperties.m87994c(new gvq(this, KClassImpl.this));
            this.objectInstance = LazyKt__LazyJVMKt.m87228a(lazyThreadSafetyMode, new hvq(this, KClassImpl.this));
            this.typeParameters = ReflectProperties.m87994c(new ivq(this, KClassImpl.this));
            this.supertypes = ReflectProperties.m87994c(new jvq(this, KClassImpl.this));
            this.sealedSubclasses = ReflectProperties.m87994c(new quq(KClassImpl.this, this));
            this.declaredNonStaticMembers = ReflectProperties.m87994c(new ruq(KClassImpl.this));
            this.declaredStaticMembers = ReflectProperties.m87994c(new suq(KClassImpl.this));
            this.inheritedNonStaticMembers = ReflectProperties.m87994c(new tuq(KClassImpl.this));
            this.inheritedStaticMembers = ReflectProperties.m87994c(new uuq(KClassImpl.this));
            this.allNonStaticMembers = ReflectProperties.m87994c(new vuq(this));
            this.allStaticMembers = ReflectProperties.m87994c(new wuq(this));
            this.declaredMembers = ReflectProperties.m87994c(new xuq(this));
            this.allMembers = ReflectProperties.m87994c(new yuq(this));
        }

        /* JADX INFO: renamed from: A */
        public static final List m87758A(Data data) {
            return CollectionsKt.plus((Collection) data.m87804L(), (Iterable) data.m87807O());
        }

        /* JADX INFO: renamed from: B */
        public static final List m87759B(KClassImpl kClassImpl) {
            Annotation[] annotations = kClassImpl.mo87465d().getAnnotations();
            annotations.getClass();
            ArrayList arrayList = new ArrayList();
            for (Annotation annotation : annotations) {
                if (!KClassImpl.f63617e.contains(JvmClassMappingKt.m87452b(JvmClassMappingKt.m87451a(annotation)).getName())) {
                    arrayList.add(annotation);
                }
            }
            return UtilKt.m88057t(arrayList);
        }

        /* JADX INFO: renamed from: D */
        public static final List m87760D(KClassImpl kClassImpl) {
            Collection<ConstructorDescriptor> collectionMo87674D = kClassImpl.mo87674D();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(collectionMo87674D, 10));
            Iterator<T> it = collectionMo87674D.iterator();
            while (it.hasNext()) {
                arrayList.add(new KFunctionImpl(kClassImpl, (ConstructorDescriptor) it.next()));
            }
            return arrayList;
        }

        /* JADX INFO: renamed from: E */
        public static final List m87761E(Data data) {
            return CollectionsKt.plus((Collection) data.m87803K(), (Iterable) data.m87804L());
        }

        /* JADX INFO: renamed from: F */
        public static final Collection m87762F(KClassImpl kClassImpl) {
            return kClassImpl.m87823G(kClassImpl.m87754c0(), KDeclarationContainerImpl.MemberBelonginess.DECLARED);
        }

        /* JADX INFO: renamed from: G */
        public static final Collection m87763G(KClassImpl kClassImpl) {
            return kClassImpl.m87823G(kClassImpl.m87755d0(), KDeclarationContainerImpl.MemberBelonginess.DECLARED);
        }

        /* JADX INFO: renamed from: H */
        public static final ClassDescriptor m87764H(KClassImpl kClassImpl) {
            ClassId classIdM87749W = kClassImpl.m87749W();
            RuntimeModuleData runtimeModuleDataM87840b = kClassImpl.m87751Y().getValue().m87840b();
            ClassDescriptor classDescriptorM92150b = (classIdM87749W.m91041i() && kClassImpl.mo87465d().isAnnotationPresent(Metadata.class)) ? runtimeModuleDataM87840b.m88960a().m92150b(classIdM87749W) : FindClassInModuleKt.m88507b(runtimeModuleDataM87840b.m88961b(), classIdM87749W);
            return classDescriptorM92150b == null ? kClassImpl.m87748U(classIdM87749W, runtimeModuleDataM87840b) : classDescriptorM92150b;
        }

        /* JADX INFO: renamed from: U */
        public static final Collection m87765U(KClassImpl kClassImpl) {
            return kClassImpl.m87823G(kClassImpl.m87754c0(), KDeclarationContainerImpl.MemberBelonginess.INHERITED);
        }

        /* JADX INFO: renamed from: V */
        public static final Collection m87766V(KClassImpl kClassImpl) {
            return kClassImpl.m87823G(kClassImpl.m87755d0(), KDeclarationContainerImpl.MemberBelonginess.INHERITED);
        }

        /* JADX INFO: renamed from: W */
        public static final KmClass m87767W(Data data) {
            ClassDescriptor classDescriptorM87805M = data.m87805M();
            DeserializedClassDescriptor deserializedClassDescriptor = classDescriptorM87805M instanceof DeserializedClassDescriptor ? (DeserializedClassDescriptor) classDescriptorM87805M : null;
            if (deserializedClassDescriptor != null) {
                return ReadersKt.m89243j(deserializedClassDescriptor.m92316X0(), deserializedClassDescriptor.m92315W0().m92184g(), false, null, 6, null);
            }
            return null;
        }

        /* JADX INFO: renamed from: X */
        public static final List m87768X(Data data, KClassImpl kClassImpl) {
            KmClass kmClassM87808P = data.m87808P();
            if (kmClassM87808P == null) {
                Class<?>[] declaredClasses = kClassImpl.mo87465d().getDeclaredClasses();
                declaredClasses.getClass();
                ArrayList arrayList = new ArrayList();
                for (Class<?> cls : declaredClasses) {
                    cls.getClass();
                    KClass kClassM87455e = JvmClassMappingKt.m87455e(cls);
                    if (kClassM87455e != null) {
                        arrayList.add(kClassM87455e);
                    }
                }
                return arrayList;
            }
            ClassId classIdM87989b = MetadataUtilKt.m87989b(kmClassM87808P.m89110l());
            ClassLoader classLoaderM88996j = ReflectClassUtilKt.m88996j(kClassImpl.mo87465d());
            List<String> listM89111m = kmClassM87808P.m89111m();
            ArrayList arrayList2 = new ArrayList();
            Iterator<T> it = listM89111m.iterator();
            while (it.hasNext()) {
                Name nameM91079i = Name.m91079i((String) it.next());
                nameM91079i.getClass();
                Class clsM88052o = UtilKt.m88052o(classLoaderM88996j, classIdM87989b.m91036d(nameM91079i), 0, 2, null);
                KClass kClassM87455e2 = clsM88052o != null ? JvmClassMappingKt.m87455e(clsM88052o) : null;
                if (kClassM87455e2 != null) {
                    arrayList2.add(kClassM87455e2);
                }
            }
            return arrayList2;
        }

        /* JADX INFO: renamed from: Y */
        public static final Object m87769Y(Data data, KClassImpl kClassImpl) throws IllegalAccessException {
            KmClass kmClassM87808P = data.m87808P();
            if (kmClassM87808P == null || !(Attributes.m89081a(kmClassM87808P) == ClassKind.OBJECT || Attributes.m89081a(kmClassM87808P) == ClassKind.COMPANION_OBJECT)) {
                return null;
            }
            Object obj = ((Attributes.m89081a(kmClassM87808P) != ClassKind.COMPANION_OBJECT || CollectionsKt.contains(CompanionObjectMapping.INSTANCE.m88138b(), MetadataUtilKt.m87989b(kmClassM87808P.m89110l()).m91037e())) ? kClassImpl.mo87465d().getDeclaredField("INSTANCE") : kClassImpl.mo87465d().getEnclosingClass().getDeclaredField(MetadataUtilKt.m87990c(kmClassM87808P.m89110l()))).get(null);
            obj.getClass();
            return obj;
        }

        /* JADX INFO: renamed from: Z */
        public static final String m87770Z(KClassImpl kClassImpl) {
            if (kClassImpl.mo87465d().isAnonymousClass()) {
                return null;
            }
            ClassId classIdM87749W = kClassImpl.m87749W();
            if (classIdM87749W.m91041i()) {
                return null;
            }
            return classIdM87749W.m91034a().m91046a();
        }

        /* JADX INFO: renamed from: a0 */
        public static final List m87771a0(KClassImpl kClassImpl, Data data) throws IllegalAccessException, InvocationTargetException {
            List listEmptyList;
            ClassLoader classLoaderM88996j = ReflectClassUtilKt.m88996j(kClassImpl.mo87465d());
            KmClass kmClassM87808P = data.m87808P();
            if (kmClassM87808P != null) {
                List<String> listM89112n = kmClassM87808P.m89112n();
                listEmptyList = new ArrayList();
                Iterator<T> it = listM89112n.iterator();
                while (it.hasNext()) {
                    KClass<?> kClassM87988a = MetadataUtilKt.m87988a(classLoaderM88996j, (String) it.next());
                    if (kClassM87988a != null) {
                        listEmptyList.add(kClassM87988a);
                    }
                }
            } else {
                Java16SealedRecordLoader java16SealedRecordLoader = Java16SealedRecordLoader.INSTANCE;
                if (Intrinsics.m87488d(java16SealedRecordLoader.m88978f(kClassImpl.mo87465d()), Boolean.TRUE)) {
                    Class<?>[] clsArrM88975c = java16SealedRecordLoader.m88975c(kClassImpl.mo87465d());
                    if (clsArrM88975c != null) {
                        listEmptyList = new ArrayList(clsArrM88975c.length);
                        for (Class<?> cls : clsArrM88975c) {
                            listEmptyList.add(JvmClassMappingKt.m87455e(cls));
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
        public static final String m87772b0(KClassImpl kClassImpl, Data data) {
            if (kClassImpl.mo87465d().isAnonymousClass()) {
                return null;
            }
            ClassId classIdM87749W = kClassImpl.m87749W();
            if (classIdM87749W.m91041i()) {
                return data.m87800C(kClassImpl.mo87465d());
            }
            String strM91082b = classIdM87749W.m91040h().m91082b();
            strM91082b.getClass();
            return strM91082b;
        }

        /* JADX INFO: renamed from: c0 */
        public static final List m87773c0(Data data, KClassImpl kClassImpl) {
            Collection<KotlinType> collectionMo88678c = data.m87805M().mo88305l().mo88678c();
            collectionMo88678c.getClass();
            ArrayList arrayList = new ArrayList(collectionMo88678c.size());
            for (KotlinType kotlinType : collectionMo88678c) {
                kotlinType.getClass();
                arrayList.add(new KTypeImpl(kotlinType, new zuq(kotlinType, data, kClassImpl)));
            }
            if (!KotlinBuiltIns.m88200v0(data.m87805M())) {
                if (arrayList.isEmpty()) {
                    SimpleType simpleTypeM88232i = DescriptorUtilsKt.m91980m(data.m87805M()).m88232i();
                    simpleTypeM88232i.getClass();
                    arrayList.add(new KTypeImpl(simpleTypeM88232i, bvq.INSTANCE));
                } else {
                    Iterator<T> it = arrayList.iterator();
                    while (it.hasNext()) {
                        kotlin.reflect.jvm.internal.impl.descriptors.ClassKind kind = DescriptorUtils.m91764e(((KTypeImpl) it.next()).getType()).getKind();
                        kind.getClass();
                        if (kind == kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.INTERFACE || kind == kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.ANNOTATION_CLASS) {
                        }
                    }
                    SimpleType simpleTypeM88232i2 = DescriptorUtilsKt.m91980m(data.m87805M()).m88232i();
                    simpleTypeM88232i2.getClass();
                    arrayList.add(new KTypeImpl(simpleTypeM88232i2, bvq.INSTANCE));
                }
            }
            return kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.m93180c(arrayList);
        }

        /* JADX INFO: renamed from: d0 */
        public static final Type m87775d0(KotlinType kotlinType, Data data, KClassImpl kClassImpl) {
            ClassifierDescriptor classifierDescriptorMo88316e = kotlinType.mo91890G0().mo88316e();
            if (!(classifierDescriptorMo88316e instanceof ClassDescriptor)) {
                zwq.m220685a("Supertype not a class: ", classifierDescriptorMo88316e);
                return null;
            }
            Class<?> clsM88054q = UtilKt.m88054q((ClassDescriptor) classifierDescriptorMo88316e);
            if (clsM88054q == null) {
                throw new KotlinReflectionInternalError("Unsupported superclass of " + data + ": " + classifierDescriptorMo88316e);
            }
            if (Intrinsics.m87488d(kClassImpl.mo87465d().getSuperclass(), clsM88054q)) {
                Type genericSuperclass = kClassImpl.mo87465d().getGenericSuperclass();
                genericSuperclass.getClass();
                return genericSuperclass;
            }
            Class<?>[] interfaces = kClassImpl.mo87465d().getInterfaces();
            interfaces.getClass();
            int iIndexOf = ArraysKt.indexOf(interfaces, clsM88054q);
            if (iIndexOf >= 0) {
                Type type = kClassImpl.mo87465d().getGenericInterfaces()[iIndexOf];
                type.getClass();
                return type;
            }
            throw new KotlinReflectionInternalError("No superclass of " + data + " in Java reflection for " + classifierDescriptorMo88316e);
        }

        /* JADX INFO: renamed from: e0 */
        public static final Type m87777e0() {
            return Object.class;
        }

        /* JADX INFO: renamed from: f0 */
        public static final List m87779f0(Data data, KClassImpl kClassImpl) {
            List<TypeParameterDescriptor> listMo88309p = data.m87805M().mo88309p();
            listMo88309p.getClass();
            List<TypeParameterDescriptor> list = listMo88309p;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            for (TypeParameterDescriptor typeParameterDescriptor : list) {
                typeParameterDescriptor.getClass();
                arrayList.add(new KTypeParameterImpl(kClassImpl, typeParameterDescriptor));
            }
            return arrayList;
        }

        /* JADX INFO: renamed from: y */
        public static final List m87798y(Data data) {
            return CollectionsKt.plus((Collection) data.m87801I(), (Iterable) data.m87802J());
        }

        /* JADX INFO: renamed from: z */
        public static final List m87799z(Data data) {
            return CollectionsKt.plus((Collection) data.m87803K(), (Iterable) data.m87806N());
        }

        /* JADX INFO: renamed from: C */
        public final String m87800C(Class<?> jClass) {
            String simpleName = jClass.getSimpleName();
            Method enclosingMethod = jClass.getEnclosingMethod();
            if (enclosingMethod != null) {
                return StringsKt.m93409N0(simpleName, enclosingMethod.getName() + '$', null, 2, null);
            }
            Constructor<?> enclosingConstructor = jClass.getEnclosingConstructor();
            if (enclosingConstructor == null) {
                return StringsKt.m93407M0(simpleName, '$', null, 2, null);
            }
            return StringsKt.m93409N0(simpleName, enclosingConstructor.getName() + '$', null, 2, null);
        }

        @NotNull
        /* JADX INFO: renamed from: I */
        public final Collection<KCallableImpl<?>> m87801I() {
            T tM87997b = this.allNonStaticMembers.m87997b(this, f63620x[13]);
            tM87997b.getClass();
            return (Collection) tM87997b;
        }

        @NotNull
        /* JADX INFO: renamed from: J */
        public final Collection<KCallableImpl<?>> m87802J() {
            T tM87997b = this.allStaticMembers.m87997b(this, f63620x[14]);
            tM87997b.getClass();
            return (Collection) tM87997b;
        }

        @NotNull
        /* JADX INFO: renamed from: K */
        public final Collection<KCallableImpl<?>> m87803K() {
            T tM87997b = this.declaredNonStaticMembers.m87997b(this, f63620x[9]);
            tM87997b.getClass();
            return (Collection) tM87997b;
        }

        /* JADX INFO: renamed from: L */
        public final Collection<KCallableImpl<?>> m87804L() {
            T tM87997b = this.declaredStaticMembers.m87997b(this, f63620x[10]);
            tM87997b.getClass();
            return (Collection) tM87997b;
        }

        @NotNull
        /* JADX INFO: renamed from: M */
        public final ClassDescriptor m87805M() {
            T tM87997b = this.descriptor.m87997b(this, f63620x[0]);
            tM87997b.getClass();
            return (ClassDescriptor) tM87997b;
        }

        /* JADX INFO: renamed from: N */
        public final Collection<KCallableImpl<?>> m87806N() {
            T tM87997b = this.inheritedNonStaticMembers.m87997b(this, f63620x[11]);
            tM87997b.getClass();
            return (Collection) tM87997b;
        }

        /* JADX INFO: renamed from: O */
        public final Collection<KCallableImpl<?>> m87807O() {
            T tM87997b = this.inheritedStaticMembers.m87997b(this, f63620x[12]);
            tM87997b.getClass();
            return (Collection) tM87997b;
        }

        @Nullable
        /* JADX INFO: renamed from: P */
        public final KmClass m87808P() {
            return (KmClass) this.kmClass.getValue();
        }

        @Nullable
        /* JADX INFO: renamed from: Q */
        public final String m87809Q() {
            return (String) this.qualifiedName.m87997b(this, f63620x[3]);
        }

        @Nullable
        /* JADX INFO: renamed from: R */
        public final String m87810R() {
            return (String) this.simpleName.m87997b(this, f63620x[2]);
        }

        @NotNull
        /* JADX INFO: renamed from: S */
        public final List<KType> m87811S() {
            T tM87997b = this.supertypes.m87997b(this, f63620x[7]);
            tM87997b.getClass();
            return (List) tM87997b;
        }

        @NotNull
        /* JADX INFO: renamed from: T */
        public final List<KTypeParameter> m87812T() {
            T tM87997b = this.typeParameters.m87997b(this, f63620x[6]);
            tM87997b.getClass();
            return (List) tM87997b;
        }
    }

    @Metadata(m87233k = 3, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f63641a;

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
            f63641a = iArr;
        }
    }

    static {
        Set<ClassId> setM88130b = SpecialJvmAnnotations.INSTANCE.m88130b();
        HashSet hashSet = new HashSet();
        Iterator<T> it = setM88130b.iterator();
        while (it.hasNext()) {
            hashSet.add(((ClassId) it.next()).m91034a().toString());
        }
        f63617e = hashSet;
    }

    public KClassImpl(@NotNull Class<T> cls) {
        cls.getClass();
        this.jClass = cls;
        this.data = LazyKt__LazyJVMKt.m87228a(LazyThreadSafetyMode.PUBLICATION, new nuq(this));
    }

    /* JADX INFO: renamed from: V */
    public static final Data m87745V(KClassImpl kClassImpl) {
        return new Data();
    }

    /* JADX INFO: renamed from: b0 */
    public static final PropertyDescriptor m87746b0(MemberDeserializer memberDeserializer, ProtoBuf.Property property) {
        memberDeserializer.getClass();
        property.getClass();
        return memberDeserializer.m92231x(property, true);
    }

    @Override // kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    @NotNull
    /* JADX INFO: renamed from: D */
    public Collection<ConstructorDescriptor> mo87674D() {
        ClassDescriptor classDescriptorMo87756e = mo87756e();
        if (classDescriptorMo87756e.getKind() == kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.INTERFACE || classDescriptorMo87756e.getKind() == kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.OBJECT) {
            return CollectionsKt.emptyList();
        }
        Collection<ClassConstructorDescriptor> constructors = classDescriptorMo87756e.getConstructors();
        constructors.getClass();
        return constructors;
    }

    @Override // kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    @NotNull
    /* JADX INFO: renamed from: E */
    public Collection<FunctionDescriptor> mo87675E(@NotNull Name name) {
        name.getClass();
        MemberScope memberScopeM87754c0 = m87754c0();
        NoLookupLocation noLookupLocation = NoLookupLocation.FROM_REFLECTION;
        return CollectionsKt.plus((Collection) memberScopeM87754c0.mo88720b(name, noLookupLocation), (Iterable) m87755d0().mo88720b(name, noLookupLocation));
    }

    @Override // kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    @Nullable
    /* JADX INFO: renamed from: F */
    public PropertyDescriptor mo87676F(int index) {
        Class<?> declaringClass;
        if (Intrinsics.m87488d(mo87465d().getSimpleName(), "DefaultImpls") && (declaringClass = mo87465d().getDeclaringClass()) != null && declaringClass.isInterface()) {
            KClass kClassM87455e = JvmClassMappingKt.m87455e(declaringClass);
            kClassM87455e.getClass();
            return ((KClassImpl) kClassM87455e).mo87676F(index);
        }
        ClassDescriptor classDescriptorMo87756e = mo87756e();
        DeserializedClassDescriptor deserializedClassDescriptor = classDescriptorMo87756e instanceof DeserializedClassDescriptor ? (DeserializedClassDescriptor) classDescriptorMo87756e : null;
        if (deserializedClassDescriptor != null) {
            ProtoBuf.Class classM92316X0 = deserializedClassDescriptor.m92316X0();
            GeneratedMessageLite.GeneratedExtension<ProtoBuf.Class, List<ProtoBuf.Property>> generatedExtension = JvmProtoBuf.f65416j;
            generatedExtension.getClass();
            ProtoBuf.Property property = (ProtoBuf.Property) ProtoBufUtilKt.m90896b(classM92316X0, generatedExtension, index);
            if (property != null) {
                return (PropertyDescriptor) UtilKt.m88045h(mo87465d(), property, deserializedClassDescriptor.m92315W0().m92184g(), deserializedClassDescriptor.m92315W0().m92187j(), deserializedClassDescriptor.m92318Z0(), ouq.INSTANCE);
            }
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    @NotNull
    /* JADX INFO: renamed from: I */
    public Collection<PropertyDescriptor> mo87677I(@NotNull Name name) {
        name.getClass();
        MemberScope memberScopeM87754c0 = m87754c0();
        NoLookupLocation noLookupLocation = NoLookupLocation.FROM_REFLECTION;
        return CollectionsKt.plus((Collection) memberScopeM87754c0.mo88721c(name, noLookupLocation), (Iterable) m87755d0().mo88721c(name, noLookupLocation));
    }

    /* JADX INFO: renamed from: T */
    public final ClassDescriptor m87747T(ClassId classId, RuntimeModuleData moduleData) {
        final ClassDescriptorImpl classDescriptorImpl = new ClassDescriptorImpl(new EmptyPackageFragmentDescriptor(moduleData.m88961b(), classId.m91038f()), classId.m91040h(), Modality.FINAL, kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.CLASS, CollectionsKt.listOf(moduleData.m88961b().mo88546f().m88231h().mo88458o()), SourceElement.f64063a, false, moduleData.m88960a().m92169u());
        final StorageManager storageManagerM92169u = moduleData.m88960a().m92169u();
        classDescriptorImpl.m88705D0(new GivenFunctionsMemberScope(classDescriptorImpl, storageManagerM92169u) { // from class: kotlin.reflect.jvm.internal.KClassImpl$createSyntheticClass$1$1
            @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.GivenFunctionsMemberScope
            /* JADX INFO: renamed from: j */
            public List<FunctionDescriptor> mo87813j() {
                return CollectionsKt.emptyList();
            }
        }, SetsKt.emptySet(), null);
        return classDescriptorImpl;
    }

    /* JADX INFO: renamed from: U */
    public final ClassDescriptor m87748U(ClassId classId, RuntimeModuleData moduleData) {
        KotlinClassHeader kotlinClassHeaderMo88946b;
        if (mo87465d().isSynthetic()) {
            return m87747T(classId, moduleData);
        }
        ReflectKotlinClass reflectKotlinClassM88950a = ReflectKotlinClass.f64321c.m88950a(mo87465d());
        KotlinClassHeader.Kind kindM90416c = (reflectKotlinClassM88950a == null || (kotlinClassHeaderMo88946b = reflectKotlinClassM88950a.mo88946b()) == null) ? null : kotlinClassHeaderMo88946b.m90416c();
        switch (kindM90416c == null ? -1 : WhenMappings.f63641a[kindM90416c.ordinal()]) {
            case -1:
            case 6:
                muq.m156427a("Unresolved class: ", mo87465d(), " (kind = ", kindM90416c);
                return null;
            case 0:
            default:
                l9r.m149037a();
                return null;
            case 1:
            case 2:
            case 3:
            case 4:
                return m87747T(classId, moduleData);
            case 5:
                muq.m156427a("Unknown class: ", mo87465d(), " (kind = ", kindM90416c);
                return null;
        }
    }

    /* JADX INFO: renamed from: W */
    public final ClassId m87749W() {
        return RuntimeTypeMapper.INSTANCE.m88029c(mo87465d());
    }

    @NotNull
    /* JADX INFO: renamed from: X */
    public final ClassKind m87750X() {
        ClassKind classKindM89081a;
        KmClass kmClassM87753a0 = m87753a0();
        if (kmClassM87753a0 != null && (classKindM89081a = Attributes.m89081a(kmClassM87753a0)) != null) {
            return classKindM89081a;
        }
        if (mo87465d().isAnnotation()) {
            return ClassKind.ANNOTATION_CLASS;
        }
        if (mo87465d().isInterface()) {
            return ClassKind.INTERFACE;
        }
        if (mo87465d().isEnum()) {
            return ClassKind.ENUM_CLASS;
        }
        return mo87465d().getSuperclass().isEnum() ? ClassKind.ENUM_ENTRY : ClassKind.CLASS;
    }

    @NotNull
    /* JADX INFO: renamed from: Y */
    public final Lazy<KClassImpl<T>.Data> m87751Y() {
        return this.data;
    }

    @Override // kotlin.reflect.jvm.internal.KClassifierImpl
    @NotNull
    /* JADX INFO: renamed from: Z, reason: merged with bridge method [inline-methods] */
    public ClassDescriptor getDescriptor() {
        return this.data.getValue().m87805M();
    }

    /* JADX INFO: renamed from: a0 */
    public final KmClass m87753a0() {
        return this.data.getValue().m87808P();
    }

    @Override // kotlin.reflect.KClass
    @NotNull
    /* JADX INFO: renamed from: c */
    public List<KType> mo87467c() {
        return this.data.getValue().m87811S();
    }

    @NotNull
    /* JADX INFO: renamed from: c0 */
    public final MemberScope m87754c0() {
        return mo87756e().mo88458o().mo89900n();
    }

    @Override // kotlin.jvm.internal.ClassBasedDeclarationContainer
    @NotNull
    /* JADX INFO: renamed from: d */
    public Class<T> mo87465d() {
        return this.jClass;
    }

    @NotNull
    /* JADX INFO: renamed from: d0 */
    public final MemberScope m87755d0() {
        MemberScope memberScopeMo88308o0 = mo87756e().mo88308o0();
        memberScopeMo88308o0.getClass();
        return memberScopeMo88308o0;
    }

    /* JADX INFO: renamed from: e0 */
    public final boolean m87757e0() {
        KmClass kmClassM87753a0 = m87753a0();
        return (kmClassM87753a0 != null ? kmClassM87753a0.m89108j() : null) != null;
    }

    public boolean equals(@Nullable Object other) {
        return (other instanceof KClassImpl) && Intrinsics.m87488d(JvmClassMappingKt.m87453c(this), JvmClassMappingKt.m87453c((KClass) other));
    }

    @Override // kotlin.reflect.KClass
    @NotNull
    public List<KTypeParameter> getTypeParameters() {
        return this.data.getValue().m87812T();
    }

    @Override // kotlin.reflect.KClass
    public int hashCode() {
        return JvmClassMappingKt.m87453c(this).hashCode();
    }

    @Override // kotlin.reflect.KClass
    public boolean isInstance(@Nullable Object value) {
        Integer numM88993g = ReflectClassUtilKt.m88993g(mo87465d());
        if (numM88993g != null) {
            return TypeIntrinsics.m87548o(value, numM88993g.intValue());
        }
        Class clsM88997k = ReflectClassUtilKt.m88997k(mo87465d());
        if (clsM88997k == null) {
            clsM88997k = mo87465d();
        }
        return clsM88997k.isInstance(value);
    }

    @Override // kotlin.reflect.KClass
    /* JADX INFO: renamed from: q */
    public boolean mo87469q() {
        KmClass kmClassM87753a0 = m87753a0();
        return kmClassM87753a0 != null && Attributes.m89082b(kmClassM87753a0);
    }

    @Override // kotlin.reflect.KClass
    @Nullable
    /* JADX INFO: renamed from: r */
    public String mo87470r() {
        return this.data.getValue().m87809Q();
    }

    @Override // kotlin.reflect.KClass
    @Nullable
    /* JADX INFO: renamed from: s */
    public String mo87471s() {
        return this.data.getValue().m87810R();
    }

    @NotNull
    public String toString() {
        String str;
        ClassId classIdM87749W = m87749W();
        FqName fqNameM91038f = classIdM87749W.m91038f();
        if (fqNameM91038f.m91048c()) {
            str = "";
        } else {
            str = fqNameM91038f.m91046a() + '.';
        }
        return "class ".concat(str + C15386d.m93478E(classIdM87749W.m91039g().m91046a(), '.', '$', false, 4, null));
    }
}
