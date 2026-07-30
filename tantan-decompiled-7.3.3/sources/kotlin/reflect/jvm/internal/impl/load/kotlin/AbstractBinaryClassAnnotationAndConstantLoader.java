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
import p153l.C20241t6;
import p153l.C20496u6;
import p153l.C20767v6;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractBinaryClassAnnotationAndConstantLoader<A, C> extends AbstractBinaryClassAnnotationLoader<A, AnnotationsContainerWithConstants<? extends A, ? extends C>> implements AnnotationAndConstantLoader<A, C> {

    /* JADX INFO: renamed from: b */
    @NotNull
    public final MemoizedFunctionToNotNull<KotlinJvmBinaryClass, AnnotationsContainerWithConstants<A, C>> f65666b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractBinaryClassAnnotationAndConstantLoader(@NotNull StorageManager storageManager, @NotNull KotlinClassFinder kotlinClassFinder) {
        super(kotlinClassFinder);
        storageManager.getClass();
        kotlinClassFinder.getClass();
        this.f65666b = storageManager.mo93341i(new C20241t6(this));
    }

    /* JADX INFO: renamed from: J */
    public static final Object m91014J(AnnotationsContainerWithConstants annotationsContainerWithConstants, MemberSignature memberSignature) {
        annotationsContainerWithConstants.getClass();
        memberSignature.getClass();
        return annotationsContainerWithConstants.m91061b().get(memberSignature);
    }

    /* JADX INFO: renamed from: N */
    public static final Object m91015N(AnnotationsContainerWithConstants annotationsContainerWithConstants, MemberSignature memberSignature) {
        annotationsContainerWithConstants.getClass();
        memberSignature.getClass();
        return annotationsContainerWithConstants.m91062c().get(memberSignature);
    }

    /* JADX INFO: renamed from: O */
    public static final AnnotationsContainerWithConstants m91016O(AbstractBinaryClassAnnotationAndConstantLoader abstractBinaryClassAnnotationAndConstantLoader, KotlinJvmBinaryClass kotlinJvmBinaryClass) {
        kotlinJvmBinaryClass.getClass();
        return abstractBinaryClassAnnotationAndConstantLoader.m91019K(kotlinJvmBinaryClass);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationLoader
    @NotNull
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public AnnotationsContainerWithConstants<A, C> mo91025r(@NotNull KotlinJvmBinaryClass kotlinJvmBinaryClass) {
        kotlinJvmBinaryClass.getClass();
        return this.f65666b.invoke(kotlinJvmBinaryClass);
    }

    /* JADX INFO: renamed from: I */
    public final boolean m91018I(@NotNull ClassId classId, @NotNull Map<Name, ? extends ConstantValue<?>> map) {
        classId.getClass();
        map.getClass();
        if (!Intrinsics.m88377d(classId, SpecialJvmAnnotations.INSTANCE.m89020a())) {
            return false;
        }
        ConstantValue<?> constantValue = map.get(Name.m91970i("value"));
        KClassValue kClassValue = constantValue instanceof KClassValue ? (KClassValue) constantValue : null;
        if (kClassValue == null) {
            return false;
        }
        KClassValue.Value valueMo92809b = kClassValue.mo92809b();
        KClassValue.Value.NormalClass normalClass = valueMo92809b instanceof KClassValue.Value.NormalClass ? (KClassValue.Value.NormalClass) valueMo92809b : null;
        if (normalClass == null) {
            return false;
        }
        return m91055y(normalClass.m92843b());
    }

    /* JADX INFO: renamed from: K */
    public final AnnotationsContainerWithConstants<A, C> m91019K(final KotlinJvmBinaryClass kotlinJvmBinaryClass) {
        final HashMap map = new HashMap();
        final HashMap map2 = new HashMap();
        final HashMap map3 = new HashMap();
        kotlinJvmBinaryClass.mo89836a(new KotlinJvmBinaryClass.MemberVisitor(this) { // from class: kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader$loadAnnotationsAndInitializers$1

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ AbstractBinaryClassAnnotationAndConstantLoader<A, C> f65667a;

            /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader$loadAnnotationsAndInitializers$1$AnnotationVisitorForMethod */
            public final class AnnotationVisitorForMethod extends MemberAnnotationVisitor implements KotlinJvmBinaryClass.MethodAnnotationVisitor {

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ C15331x2cf49cf1 f65672d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnnotationVisitorForMethod(C15331x2cf49cf1 c15331x2cf49cf1, MemberSignature memberSignature) {
                    super(c15331x2cf49cf1, memberSignature);
                    memberSignature.getClass();
                    this.f65672d = c15331x2cf49cf1;
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
                public KotlinJvmBinaryClass.AnnotationArgumentVisitor mo91028a(int i, ClassId classId, SourceElement sourceElement) {
                    classId.getClass();
                    sourceElement.getClass();
                    MemberSignature memberSignatureM91265e = MemberSignature.Companion.m91265e(m91029c(), i);
                    Collection arrayList = (List) map.get(memberSignatureM91265e);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        map.put(memberSignatureM91265e, arrayList);
                    }
                    return this.f65672d.f65667a.m91032A(classId, sourceElement, arrayList);
                }
            }

            /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader$loadAnnotationsAndInitializers$1$MemberAnnotationVisitor */
            public class MemberAnnotationVisitor implements KotlinJvmBinaryClass.AnnotationVisitor {

                /* JADX INFO: renamed from: a */
                public final MemberSignature f65673a;

                /* JADX INFO: renamed from: b */
                public final ArrayList<A> f65674b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ C15331x2cf49cf1 f65675c;

                public MemberAnnotationVisitor(C15331x2cf49cf1 c15331x2cf49cf1, MemberSignature memberSignature) {
                    memberSignature.getClass();
                    this.f65675c = c15331x2cf49cf1;
                    this.f65673a = memberSignature;
                    this.f65674b = new ArrayList<>();
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
                public KotlinJvmBinaryClass.AnnotationArgumentVisitor mo89023b(ClassId classId, SourceElement sourceElement) {
                    classId.getClass();
                    sourceElement.getClass();
                    return this.f65675c.f65667a.m91032A(classId, sourceElement, this.f65674b);
                }

                /* JADX INFO: renamed from: c */
                public final MemberSignature m91029c() {
                    return this.f65673a;
                }

                /* JADX WARN: Type inference incomplete: some casts might be missing */
                @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationVisitor
                public void visitEnd() {
                    if (this.f65674b.isEmpty()) {
                        return;
                    }
                    map.put(this.f65673a, (List<A>) this.f65674b);
                }
            }

            {
                this.f65667a = this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.MemberVisitor
            /* JADX INFO: renamed from: a */
            public KotlinJvmBinaryClass.MethodAnnotationVisitor mo91026a(Name name, String str) {
                name.getClass();
                str.getClass();
                MemberSignature.Companion companion = MemberSignature.Companion;
                String strM91973b = name.m91973b();
                strM91973b.getClass();
                return new AnnotationVisitorForMethod(this, companion.m91264d(strM91973b, str));
            }

            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.MemberVisitor
            /* JADX INFO: renamed from: b */
            public KotlinJvmBinaryClass.AnnotationVisitor mo91027b(Name name, String str, Object obj) {
                Object objMo91020L;
                name.getClass();
                str.getClass();
                MemberSignature.Companion companion = MemberSignature.Companion;
                String strM91973b = name.m91973b();
                strM91973b.getClass();
                MemberSignature memberSignatureM91261a = companion.m91261a(strM91973b, str);
                if (obj != null && (objMo91020L = this.f65667a.mo91020L(str, obj)) != null) {
                    map2.put(memberSignatureM91261a, (C) objMo91020L);
                }
                return new MemberAnnotationVisitor(this, memberSignatureM91261a);
            }
        }, m91050s(kotlinJvmBinaryClass));
        return new AnnotationsContainerWithConstants<>(map, map2, map3);
    }

    @Nullable
    /* JADX INFO: renamed from: L */
    public abstract C mo91020L(@NotNull String str, @NotNull Object obj);

    /* JADX INFO: renamed from: M */
    public final C m91021M(ProtoContainer protoContainer, ProtoBuf.Property property, AnnotatedCallableKind annotatedCallableKind, KotlinType kotlinType, Function2<? super AnnotationsContainerWithConstants<? extends A, ? extends C>, ? super MemberSignature, ? extends C> function2) {
        C cInvoke;
        KotlinJvmBinaryClass kotlinJvmBinaryClassM91049q = m91049q(protoContainer, AbstractBinaryClassAnnotationLoader.Companion.m91058a(protoContainer, true, true, Flags.f66017D.mo91766d(property.getFlags()), JvmProtoBufUtil.m91910f(property), m91053w(), mo91054x()));
        if (kotlinJvmBinaryClassM91049q == null) {
            return null;
        }
        MemberSignature memberSignatureM91051t = m91051t(property, protoContainer.m93127b(), protoContainer.m93129d(), annotatedCallableKind, kotlinJvmBinaryClassM91049q.mo89837b().m91308d().m91760d(DeserializedDescriptorResolver.Companion.m91209a()));
        if (memberSignatureM91051t == null || (cInvoke = function2.invoke(this.f65666b.invoke(kotlinJvmBinaryClassM91049q), memberSignatureM91051t)) == null) {
            return null;
        }
        return UnsignedTypes.m89168d(kotlinType) ? mo91022P(cInvoke) : cInvoke;
    }

    @Nullable
    /* JADX INFO: renamed from: P */
    public abstract C mo91022P(@NotNull C c);

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationAndConstantLoader
    @Nullable
    /* JADX INFO: renamed from: e */
    public C mo91023e(@NotNull ProtoContainer protoContainer, @NotNull ProtoBuf.Property property, @NotNull KotlinType kotlinType) {
        protoContainer.getClass();
        property.getClass();
        kotlinType.getClass();
        return m91021M(protoContainer, property, AnnotatedCallableKind.PROPERTY, kotlinType, C20767v6.INSTANCE);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationAndConstantLoader
    @Nullable
    /* JADX INFO: renamed from: k */
    public C mo91024k(@NotNull ProtoContainer protoContainer, @NotNull ProtoBuf.Property property, @NotNull KotlinType kotlinType) {
        protoContainer.getClass();
        property.getClass();
        kotlinType.getClass();
        return m91021M(protoContainer, property, AnnotatedCallableKind.PROPERTY_GETTER, kotlinType, C20496u6.INSTANCE);
    }
}
