package kotlin.reflect.jvm.internal.impl.load.kotlin;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.SpecialJvmAnnotations;
import kotlin.reflect.jvm.internal.impl.builtins.UnsignedTypes;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmProtoBufUtil;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.KClassValue;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationAndConstantLoader;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNotNull;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.C20811w6;
import p149l.C21036x6;
import p149l.C21312y6;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractBinaryClassAnnotationAndConstantLoader<A, C> extends AbstractBinaryClassAnnotationLoader<A, AnnotationsContainerWithConstants<? extends A, ? extends C>> implements AnnotationAndConstantLoader<A, C> {

    /* JADX INFO: renamed from: b */
    @NotNull
    public final MemoizedFunctionToNotNull<KotlinJvmBinaryClass, AnnotationsContainerWithConstants<A, C>> f64992b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractBinaryClassAnnotationAndConstantLoader(@NotNull StorageManager storageManager, @NotNull KotlinClassFinder kotlinClassFinder) {
        super(kotlinClassFinder);
        storageManager.getClass();
        kotlinClassFinder.getClass();
        this.f64992b = storageManager.mo92450i(new C20811w6(this));
    }

    /* JADX INFO: renamed from: J */
    public static final Object m90123J(AnnotationsContainerWithConstants annotationsContainerWithConstants, MemberSignature memberSignature) {
        annotationsContainerWithConstants.getClass();
        memberSignature.getClass();
        return annotationsContainerWithConstants.m90170b().get(memberSignature);
    }

    /* JADX INFO: renamed from: N */
    public static final Object m90124N(AnnotationsContainerWithConstants annotationsContainerWithConstants, MemberSignature memberSignature) {
        annotationsContainerWithConstants.getClass();
        memberSignature.getClass();
        return annotationsContainerWithConstants.m90171c().get(memberSignature);
    }

    /* JADX INFO: renamed from: O */
    public static final AnnotationsContainerWithConstants m90125O(AbstractBinaryClassAnnotationAndConstantLoader abstractBinaryClassAnnotationAndConstantLoader, KotlinJvmBinaryClass kotlinJvmBinaryClass) {
        kotlinJvmBinaryClass.getClass();
        return abstractBinaryClassAnnotationAndConstantLoader.m90128K(kotlinJvmBinaryClass);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationLoader
    @NotNull
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public AnnotationsContainerWithConstants<A, C> mo90134r(@NotNull KotlinJvmBinaryClass kotlinJvmBinaryClass) {
        kotlinJvmBinaryClass.getClass();
        return this.f64992b.invoke(kotlinJvmBinaryClass);
    }

    /* JADX INFO: renamed from: I */
    public final boolean m90127I(@NotNull ClassId classId, @NotNull Map<Name, ? extends ConstantValue<?>> map) {
        classId.getClass();
        map.getClass();
        if (!Intrinsics.m87488d(classId, SpecialJvmAnnotations.INSTANCE.m88129a())) {
            return false;
        }
        ConstantValue<?> constantValue = map.get(Name.m91079i("value"));
        KClassValue kClassValue = constantValue instanceof KClassValue ? (KClassValue) constantValue : null;
        if (kClassValue == null) {
            return false;
        }
        KClassValue.Value valueMo91918b = kClassValue.mo91918b();
        KClassValue.Value.NormalClass normalClass = valueMo91918b instanceof KClassValue.Value.NormalClass ? (KClassValue.Value.NormalClass) valueMo91918b : null;
        if (normalClass == null) {
            return false;
        }
        return m90164y(normalClass.m91952b());
    }

    /* JADX INFO: renamed from: K */
    public final AnnotationsContainerWithConstants<A, C> m90128K(final KotlinJvmBinaryClass kotlinJvmBinaryClass) {
        final HashMap map = new HashMap();
        final HashMap map2 = new HashMap();
        final HashMap map3 = new HashMap();
        kotlinJvmBinaryClass.mo88945a(new KotlinJvmBinaryClass.MemberVisitor(this) { // from class: kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader$loadAnnotationsAndInitializers$1

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ AbstractBinaryClassAnnotationAndConstantLoader<A, C> f64993a;

            /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader$loadAnnotationsAndInitializers$1$AnnotationVisitorForMethod */
            public final class AnnotationVisitorForMethod extends MemberAnnotationVisitor implements KotlinJvmBinaryClass.MethodAnnotationVisitor {

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ C15224x2cf49cf1 f64998d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnnotationVisitorForMethod(C15224x2cf49cf1 c15224x2cf49cf1, MemberSignature memberSignature) {
                    super(c15224x2cf49cf1, memberSignature);
                    memberSignature.getClass();
                    this.f64998d = c15224x2cf49cf1;
                }

                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.MethodAnnotationVisitor
                /* JADX INFO: renamed from: a */
                public KotlinJvmBinaryClass.AnnotationArgumentVisitor mo90137a(int i, ClassId classId, SourceElement sourceElement) {
                    classId.getClass();
                    sourceElement.getClass();
                    MemberSignature memberSignatureM90374e = MemberSignature.Companion.m90374e(m90138c(), i);
                    Collection arrayList = (List) map.get(memberSignatureM90374e);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        map.put(memberSignatureM90374e, arrayList);
                    }
                    return this.f64998d.f64993a.m90141A(classId, sourceElement, arrayList);
                }
            }

            /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader$loadAnnotationsAndInitializers$1$MemberAnnotationVisitor */
            public class MemberAnnotationVisitor implements KotlinJvmBinaryClass.AnnotationVisitor {

                /* JADX INFO: renamed from: a */
                public final MemberSignature f64999a;

                /* JADX INFO: renamed from: b */
                public final ArrayList<A> f65000b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ C15224x2cf49cf1 f65001c;

                public MemberAnnotationVisitor(C15224x2cf49cf1 c15224x2cf49cf1, MemberSignature memberSignature) {
                    memberSignature.getClass();
                    this.f65001c = c15224x2cf49cf1;
                    this.f64999a = memberSignature;
                    this.f65000b = new ArrayList<>();
                }

                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationVisitor
                /* JADX INFO: renamed from: b */
                public KotlinJvmBinaryClass.AnnotationArgumentVisitor mo88132b(ClassId classId, SourceElement sourceElement) {
                    classId.getClass();
                    sourceElement.getClass();
                    return this.f65001c.f64993a.m90141A(classId, sourceElement, this.f65000b);
                }

                /* JADX INFO: renamed from: c */
                public final MemberSignature m90138c() {
                    return this.f64999a;
                }

                /* JADX WARN: Type inference incomplete: some casts might be missing */
                @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationVisitor
                public void visitEnd() {
                    if (this.f65000b.isEmpty()) {
                        return;
                    }
                    map.put(this.f64999a, (List<A>) this.f65000b);
                }
            }

            {
                this.f64993a = this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.MemberVisitor
            /* JADX INFO: renamed from: a */
            public KotlinJvmBinaryClass.MethodAnnotationVisitor mo90135a(Name name, String str) {
                name.getClass();
                str.getClass();
                MemberSignature.Companion companion = MemberSignature.Companion;
                String strM91082b = name.m91082b();
                strM91082b.getClass();
                return new AnnotationVisitorForMethod(this, companion.m90373d(strM91082b, str));
            }

            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.MemberVisitor
            /* JADX INFO: renamed from: b */
            public KotlinJvmBinaryClass.AnnotationVisitor mo90136b(Name name, String str, Object obj) {
                Object objMo90129L;
                name.getClass();
                str.getClass();
                MemberSignature.Companion companion = MemberSignature.Companion;
                String strM91082b = name.m91082b();
                strM91082b.getClass();
                MemberSignature memberSignatureM90370a = companion.m90370a(strM91082b, str);
                if (obj != null && (objMo90129L = this.f64993a.mo90129L(str, obj)) != null) {
                    map2.put(memberSignatureM90370a, (C) objMo90129L);
                }
                return new MemberAnnotationVisitor(this, memberSignatureM90370a);
            }
        }, m90159s(kotlinJvmBinaryClass));
        return new AnnotationsContainerWithConstants<>(map, map2, map3);
    }

    @Nullable
    /* JADX INFO: renamed from: L */
    public abstract C mo90129L(@NotNull String str, @NotNull Object obj);

    /* JADX INFO: renamed from: M */
    public final C m90130M(ProtoContainer protoContainer, ProtoBuf.Property property, AnnotatedCallableKind annotatedCallableKind, KotlinType kotlinType, Function2<? super AnnotationsContainerWithConstants<? extends A, ? extends C>, ? super MemberSignature, ? extends C> function2) {
        C cInvoke;
        KotlinJvmBinaryClass kotlinJvmBinaryClassM90158q = m90158q(protoContainer, AbstractBinaryClassAnnotationLoader.Companion.m90167a(protoContainer, true, true, Flags.f65343D.mo90875d(property.getFlags()), JvmProtoBufUtil.m91019f(property), m90162w(), mo90163x()));
        if (kotlinJvmBinaryClassM90158q == null) {
            return null;
        }
        MemberSignature memberSignatureM90160t = m90160t(property, protoContainer.m92236b(), protoContainer.m92238d(), annotatedCallableKind, kotlinJvmBinaryClassM90158q.mo88946b().m90417d().m90869d(DeserializedDescriptorResolver.Companion.m90318a()));
        if (memberSignatureM90160t == null || (cInvoke = function2.invoke(this.f64992b.invoke(kotlinJvmBinaryClassM90158q), memberSignatureM90160t)) == null) {
            return null;
        }
        return UnsignedTypes.m88277d(kotlinType) ? mo90131P(cInvoke) : cInvoke;
    }

    @Nullable
    /* JADX INFO: renamed from: P */
    public abstract C mo90131P(@NotNull C c);

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationAndConstantLoader
    @Nullable
    /* JADX INFO: renamed from: e */
    public C mo90132e(@NotNull ProtoContainer protoContainer, @NotNull ProtoBuf.Property property, @NotNull KotlinType kotlinType) {
        protoContainer.getClass();
        property.getClass();
        kotlinType.getClass();
        return m90130M(protoContainer, property, AnnotatedCallableKind.PROPERTY, kotlinType, C21312y6.INSTANCE);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationAndConstantLoader
    @Nullable
    /* JADX INFO: renamed from: k */
    public C mo90133k(@NotNull ProtoContainer protoContainer, @NotNull ProtoBuf.Property property, @NotNull KotlinType kotlinType) {
        protoContainer.getClass();
        property.getClass();
        kotlinType.getClass();
        return m90130M(protoContainer, property, AnnotatedCallableKind.PROPERTY_GETTER, kotlinType, C21036x6.INSTANCE);
    }
}
