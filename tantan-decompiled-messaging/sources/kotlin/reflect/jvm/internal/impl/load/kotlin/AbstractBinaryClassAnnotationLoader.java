package kotlin.reflect.jvm.internal.impl.load.kotlin;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.SpecialJvmAnnotations;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationLoader.AnnotationsContainer;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.MetadataVersion;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoBufUtilKt;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.ClassMapperLite;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmProtoBufUtil;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer;
import kotlin.text.C15386d;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.qq3;
import p149l.xdc0;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public abstract class AbstractBinaryClassAnnotationLoader<A, S extends AnnotationsContainer<? extends A>> implements AnnotationLoader<A> {

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: a */
    @NotNull
    public final KotlinClassFinder f65002a;

    public static abstract class AnnotationsContainer<A> {
        @NotNull
        /* JADX INFO: renamed from: a */
        public abstract Map<MemberSignature, List<A>> mo90166a();
    }

    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        /* JADX INFO: renamed from: a */
        public final KotlinJvmBinaryClass m90167a(@NotNull ProtoContainer protoContainer, boolean z, boolean z2, @Nullable Boolean bool, boolean z3, @NotNull KotlinClassFinder kotlinClassFinder, @NotNull MetadataVersion metadataVersion) {
            ProtoContainer.Class classM92242h;
            protoContainer.getClass();
            kotlinClassFinder.getClass();
            metadataVersion.getClass();
            if (z) {
                if (bool == null) {
                    throw new IllegalStateException(("isConst should not be null for property (container=" + protoContainer + ')').toString());
                }
                if (protoContainer instanceof ProtoContainer.Class) {
                    ProtoContainer.Class r8 = (ProtoContainer.Class) protoContainer;
                    if (r8.m92241g() == ProtoBuf.Class.Kind.INTERFACE) {
                        ClassId classIdM92239e = r8.m92239e();
                        Name nameM91079i = Name.m91079i("DefaultImpls");
                        nameM91079i.getClass();
                        return KotlinClassFinderKt.m90367b(kotlinClassFinder, classIdM92239e.m91036d(nameM91079i), metadataVersion);
                    }
                }
                if (bool.booleanValue() && (protoContainer instanceof ProtoContainer.Package)) {
                    SourceElement sourceElementM92237c = protoContainer.m92237c();
                    JvmPackagePartSource jvmPackagePartSource = sourceElementM92237c instanceof JvmPackagePartSource ? (JvmPackagePartSource) sourceElementM92237c : null;
                    JvmClassName jvmClassNameM90329f = jvmPackagePartSource != null ? jvmPackagePartSource.m90329f() : null;
                    if (jvmClassNameM90329f != null) {
                        ClassId.Companion companion = ClassId.Companion;
                        String strM92020f = jvmClassNameM90329f.m92020f();
                        strM92020f.getClass();
                        return KotlinClassFinderKt.m90367b(kotlinClassFinder, companion.m91045c(new FqName(C15386d.m93478E(strM92020f, '/', '.', false, 4, null))), metadataVersion);
                    }
                }
            }
            if (z2 && (protoContainer instanceof ProtoContainer.Class)) {
                ProtoContainer.Class r9 = (ProtoContainer.Class) protoContainer;
                if (r9.m92241g() == ProtoBuf.Class.Kind.COMPANION_OBJECT && (classM92242h = r9.m92242h()) != null && (classM92242h.m92241g() == ProtoBuf.Class.Kind.CLASS || classM92242h.m92241g() == ProtoBuf.Class.Kind.ENUM_CLASS || (z3 && (classM92242h.m92241g() == ProtoBuf.Class.Kind.INTERFACE || classM92242h.m92241g() == ProtoBuf.Class.Kind.ANNOTATION_CLASS)))) {
                    SourceElement sourceElementM92237c2 = classM92242h.m92237c();
                    KotlinJvmBinarySourceElement kotlinJvmBinarySourceElement = sourceElementM92237c2 instanceof KotlinJvmBinarySourceElement ? (KotlinJvmBinarySourceElement) sourceElementM92237c2 : null;
                    if (kotlinJvmBinarySourceElement != null) {
                        return kotlinJvmBinarySourceElement.m90368d();
                    }
                    return null;
                }
            }
            if (!(protoContainer instanceof ProtoContainer.Package) || !(protoContainer.m92237c() instanceof JvmPackagePartSource)) {
                return null;
            }
            SourceElement sourceElementM92237c3 = protoContainer.m92237c();
            sourceElementM92237c3.getClass();
            JvmPackagePartSource jvmPackagePartSource2 = (JvmPackagePartSource) sourceElementM92237c3;
            KotlinJvmBinaryClass kotlinJvmBinaryClassM90330g = jvmPackagePartSource2.m90330g();
            return kotlinJvmBinaryClassM90330g == null ? KotlinClassFinderKt.m90367b(kotlinClassFinder, jvmPackagePartSource2.m90327d(), metadataVersion) : kotlinJvmBinaryClassM90330g;
        }

        private Companion() {
        }
    }

    public enum PropertyRelatedElement {
        PROPERTY,
        BACKING_FIELD,
        DELEGATE_FIELD;

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.m87385a(values());
    }

    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f65003a;

        static {
            int[] iArr = new int[AnnotatedCallableKind.values().length];
            try {
                iArr[AnnotatedCallableKind.PROPERTY_GETTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AnnotatedCallableKind.PROPERTY_SETTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AnnotatedCallableKind.PROPERTY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f65003a = iArr;
        }
    }

    public AbstractBinaryClassAnnotationLoader(@NotNull KotlinClassFinder kotlinClassFinder) {
        kotlinClassFinder.getClass();
        this.f65002a = kotlinClassFinder;
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ List m90139p(AbstractBinaryClassAnnotationLoader abstractBinaryClassAnnotationLoader, ProtoContainer protoContainer, MemberSignature memberSignature, boolean z, boolean z2, Boolean bool, boolean z3, int i, Object obj) {
        if (obj != null) {
            qq3.m175877a("Super calls with default arguments not supported in this target, function: findClassAndLoadMemberAnnotations");
            return null;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        if ((i & 8) != 0) {
            z2 = false;
        }
        if ((i & 16) != 0) {
            bool = null;
        }
        if ((i & 32) != 0) {
            z3 = false;
        }
        return abstractBinaryClassAnnotationLoader.m90157o(protoContainer, memberSignature, z, z2, bool, z3);
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ MemberSignature m90140u(AbstractBinaryClassAnnotationLoader abstractBinaryClassAnnotationLoader, MessageLite messageLite, NameResolver nameResolver, TypeTable typeTable, AnnotatedCallableKind annotatedCallableKind, boolean z, int i, Object obj) {
        if (obj != null) {
            qq3.m175877a("Super calls with default arguments not supported in this target, function: getCallableSignature");
            return null;
        }
        if ((i & 16) != 0) {
            z = false;
        }
        return abstractBinaryClassAnnotationLoader.m90160t(messageLite, nameResolver, typeTable, annotatedCallableKind, z);
    }

    @Nullable
    /* JADX INFO: renamed from: A */
    public final KotlinJvmBinaryClass.AnnotationArgumentVisitor m90141A(@NotNull ClassId classId, @NotNull SourceElement sourceElement, @NotNull List<A> list) {
        classId.getClass();
        sourceElement.getClass();
        list.getClass();
        if (SpecialJvmAnnotations.INSTANCE.m88130b().contains(classId)) {
            return null;
        }
        return mo90165z(classId, sourceElement, list);
    }

    /* JADX INFO: renamed from: B */
    public final List<A> m90142B(ProtoContainer protoContainer, MessageLite messageLite, AnnotatedCallableKind annotatedCallableKind, int i) {
        MemberSignature memberSignatureM90140u = m90140u(this, messageLite, protoContainer.m92236b(), protoContainer.m92238d(), annotatedCallableKind, false, 16, null);
        return memberSignatureM90140u == null ? CollectionsKt.emptyList() : m90139p(this, protoContainer, MemberSignature.Companion.m90374e(memberSignatureM90140u, i), false, false, null, false, 60, null);
    }

    /* JADX INFO: renamed from: C */
    public final List<A> m90143C(ProtoContainer protoContainer, ProtoBuf.Property property, PropertyRelatedElement propertyRelatedElement) {
        Boolean boolMo90875d = Flags.f65343D.mo90875d(property.getFlags());
        boolMo90875d.getClass();
        boolMo90875d.booleanValue();
        boolean zM91019f = JvmProtoBufUtil.m91019f(property);
        if (propertyRelatedElement == PropertyRelatedElement.PROPERTY) {
            MemberSignature memberSignatureM90169b = AbstractBinaryClassAnnotationLoaderKt.m90169b(property, protoContainer.m92236b(), protoContainer.m92238d(), false, true, false, 40, null);
            return memberSignatureM90169b == null ? CollectionsKt.emptyList() : m90139p(this, protoContainer, memberSignatureM90169b, true, false, boolMo90875d, zM91019f, 8, null);
        }
        MemberSignature memberSignatureM90169b2 = AbstractBinaryClassAnnotationLoaderKt.m90169b(property, protoContainer.m92236b(), protoContainer.m92238d(), true, false, false, 48, null);
        if (memberSignatureM90169b2 == null) {
            return CollectionsKt.emptyList();
        }
        return StringsKt.m93412P(memberSignatureM90169b2.m90369a(), "$delegate", false, 2, null) != (propertyRelatedElement == PropertyRelatedElement.DELEGATE_FIELD) ? CollectionsKt.emptyList() : m90157o(protoContainer, memberSignatureM90169b2, true, true, boolMo90875d, zM91019f);
    }

    /* JADX INFO: renamed from: D */
    public final KotlinJvmBinaryClass m90144D(ProtoContainer.Class r2) {
        SourceElement sourceElementM92237c = r2.m92237c();
        KotlinJvmBinarySourceElement kotlinJvmBinarySourceElement = sourceElementM92237c instanceof KotlinJvmBinarySourceElement ? (KotlinJvmBinarySourceElement) sourceElementM92237c : null;
        if (kotlinJvmBinarySourceElement != null) {
            return kotlinJvmBinarySourceElement.m90368d();
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    @NotNull
    /* JADX INFO: renamed from: a */
    public List<A> mo90145a(@NotNull ProtoContainer protoContainer, @NotNull MessageLite messageLite, @NotNull AnnotatedCallableKind annotatedCallableKind, int i, @NotNull ProtoBuf.ValueParameter valueParameter) {
        protoContainer.getClass();
        messageLite.getClass();
        annotatedCallableKind.getClass();
        valueParameter.getClass();
        return m90142B(protoContainer, messageLite, annotatedCallableKind, i + m90156n(protoContainer, messageLite));
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    @NotNull
    /* JADX INFO: renamed from: b */
    public List<A> mo90146b(@NotNull ProtoContainer.Class r3) {
        r3.getClass();
        KotlinJvmBinaryClass kotlinJvmBinaryClassM90144D = m90144D(r3);
        if (kotlinJvmBinaryClassM90144D == null) {
            xdc0.m208279a("Class for loading annotations is not found: ", r3.mo92235a());
            return null;
        }
        final ArrayList arrayList = new ArrayList(1);
        kotlinJvmBinaryClassM90144D.mo88947c(new KotlinJvmBinaryClass.AnnotationVisitor(this) { // from class: kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationLoader$loadClassAnnotations$1

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ AbstractBinaryClassAnnotationLoader<A, S> f65004a;

            {
                this.f65004a = this;
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
                return this.f65004a.m90141A(classId, sourceElement, arrayList);
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationVisitor
            public void visitEnd() {
            }
        }, m90159s(kotlinJvmBinaryClassM90144D));
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    @NotNull
    /* JADX INFO: renamed from: c */
    public List<A> mo90147c(@NotNull ProtoContainer protoContainer, @NotNull ProtoBuf.EnumEntry enumEntry) {
        protoContainer.getClass();
        enumEntry.getClass();
        return m90139p(this, protoContainer, MemberSignature.Companion.m90370a(protoContainer.m92236b().getString(enumEntry.getName()), ClassMapperLite.m91006b(((ProtoContainer.Class) protoContainer).m92239e().m91035b())), false, false, null, false, 60, null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    @NotNull
    /* JADX INFO: renamed from: d */
    public List<A> mo90148d(@NotNull ProtoBuf.TypeParameter typeParameter, @NotNull NameResolver nameResolver) {
        typeParameter.getClass();
        nameResolver.getClass();
        Object extension = typeParameter.getExtension(JvmProtoBuf.f65414h);
        extension.getClass();
        Iterable<ProtoBuf.Annotation> iterable = (Iterable) extension;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
        for (ProtoBuf.Annotation annotation : iterable) {
            annotation.getClass();
            arrayList.add(mo90154l(annotation, nameResolver));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    @NotNull
    /* JADX INFO: renamed from: f */
    public List<A> mo90149f(@NotNull ProtoContainer protoContainer, @NotNull ProtoBuf.Property property) {
        protoContainer.getClass();
        property.getClass();
        return m90143C(protoContainer, property, PropertyRelatedElement.BACKING_FIELD);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    @NotNull
    /* JADX INFO: renamed from: g */
    public List<A> mo90150g(@NotNull ProtoContainer protoContainer, @NotNull MessageLite messageLite, @NotNull AnnotatedCallableKind annotatedCallableKind) {
        protoContainer.getClass();
        messageLite.getClass();
        annotatedCallableKind.getClass();
        return m90142B(protoContainer, messageLite, annotatedCallableKind, m90161v(messageLite));
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    @NotNull
    /* JADX INFO: renamed from: h */
    public List<A> mo90151h(@NotNull ProtoContainer protoContainer, @NotNull MessageLite messageLite, @NotNull AnnotatedCallableKind annotatedCallableKind, int i, @Nullable ProtoBuf.ValueParameter valueParameter) {
        protoContainer.getClass();
        messageLite.getClass();
        annotatedCallableKind.getClass();
        return m90142B(protoContainer, messageLite, annotatedCallableKind, i);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    @NotNull
    /* JADX INFO: renamed from: i */
    public List<A> mo90152i(@NotNull ProtoBuf.Type type, @NotNull NameResolver nameResolver) {
        type.getClass();
        nameResolver.getClass();
        Object extension = type.getExtension(JvmProtoBuf.f65412f);
        extension.getClass();
        Iterable<ProtoBuf.Annotation> iterable = (Iterable) extension;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
        for (ProtoBuf.Annotation annotation : iterable) {
            annotation.getClass();
            arrayList.add(mo90154l(annotation, nameResolver));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    @NotNull
    /* JADX INFO: renamed from: j */
    public List<A> mo90153j(@NotNull ProtoContainer protoContainer, @NotNull MessageLite messageLite, @NotNull AnnotatedCallableKind annotatedCallableKind) {
        protoContainer.getClass();
        messageLite.getClass();
        annotatedCallableKind.getClass();
        if (annotatedCallableKind == AnnotatedCallableKind.PROPERTY) {
            return m90143C(protoContainer, (ProtoBuf.Property) messageLite, PropertyRelatedElement.PROPERTY);
        }
        MemberSignature memberSignatureM90140u = m90140u(this, messageLite, protoContainer.m92236b(), protoContainer.m92238d(), annotatedCallableKind, false, 16, null);
        return memberSignatureM90140u == null ? CollectionsKt.emptyList() : m90139p(this, protoContainer, memberSignatureM90140u, false, false, null, false, 60, null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    @NotNull
    /* JADX INFO: renamed from: l */
    public abstract A mo90154l(@NotNull ProtoBuf.Annotation annotation, @NotNull NameResolver nameResolver);

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    @NotNull
    /* JADX INFO: renamed from: m */
    public List<A> mo90155m(@NotNull ProtoContainer protoContainer, @NotNull ProtoBuf.Property property) {
        protoContainer.getClass();
        property.getClass();
        return m90143C(protoContainer, property, PropertyRelatedElement.DELEGATE_FIELD);
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0012  */
    /* JADX INFO: renamed from: n */
    public final int m90156n(ProtoContainer protoContainer, MessageLite messageLite) {
        int iM90161v = m90161v(messageLite);
        int i = 0;
        if (messageLite instanceof ProtoBuf.Function) {
            if (ProtoTypeTableUtilKt.m90903g((ProtoBuf.Function) messageLite)) {
                i = 1;
            }
        } else if (messageLite instanceof ProtoBuf.Property) {
            if (ProtoTypeTableUtilKt.m90904h((ProtoBuf.Property) messageLite)) {
                i = 1;
            }
        } else {
            if (!(messageLite instanceof ProtoBuf.Constructor)) {
                throw new UnsupportedOperationException("Unsupported message: " + messageLite.getClass());
            }
            protoContainer.getClass();
            ProtoContainer.Class r4 = (ProtoContainer.Class) protoContainer;
            if (r4.m92241g() == ProtoBuf.Class.Kind.ENUM_CLASS) {
                i = 2;
            } else if (r4.m92243i()) {
                i = 1;
            }
        }
        return iM90161v + i;
    }

    /* JADX INFO: renamed from: o */
    public final List<A> m90157o(ProtoContainer protoContainer, MemberSignature memberSignature, boolean z, boolean z2, Boolean bool, boolean z3) {
        KotlinJvmBinaryClass kotlinJvmBinaryClassM90158q = m90158q(protoContainer, Companion.m90167a(protoContainer, z, z2, bool, z3, this.f65002a, mo90163x()));
        if (kotlinJvmBinaryClassM90158q == null) {
            return CollectionsKt.emptyList();
        }
        List<A> list = mo90134r(kotlinJvmBinaryClassM90158q).mo90166a().get(memberSignature);
        return list == null ? CollectionsKt.emptyList() : list;
    }

    @Nullable
    /* JADX INFO: renamed from: q */
    public final KotlinJvmBinaryClass m90158q(@NotNull ProtoContainer protoContainer, @Nullable KotlinJvmBinaryClass kotlinJvmBinaryClass) {
        protoContainer.getClass();
        if (kotlinJvmBinaryClass != null) {
            return kotlinJvmBinaryClass;
        }
        if (protoContainer instanceof ProtoContainer.Class) {
            return m90144D((ProtoContainer.Class) protoContainer);
        }
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: r */
    public abstract S mo90134r(@NotNull KotlinJvmBinaryClass kotlinJvmBinaryClass);

    @Nullable
    /* JADX INFO: renamed from: s */
    public byte[] m90159s(@NotNull KotlinJvmBinaryClass kotlinJvmBinaryClass) {
        kotlinJvmBinaryClass.getClass();
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: t */
    public final MemberSignature m90160t(@NotNull MessageLite messageLite, @NotNull NameResolver nameResolver, @NotNull TypeTable typeTable, @NotNull AnnotatedCallableKind annotatedCallableKind, boolean z) {
        messageLite.getClass();
        nameResolver.getClass();
        typeTable.getClass();
        annotatedCallableKind.getClass();
        if (messageLite instanceof ProtoBuf.Constructor) {
            MemberSignature.Companion companion = MemberSignature.Companion;
            JvmMemberSignature.Method methodM91026b = JvmProtoBufUtil.INSTANCE.m91026b((ProtoBuf.Constructor) messageLite, nameResolver, typeTable);
            if (methodM91026b == null) {
                return null;
            }
            return companion.m90371b(methodM91026b);
        }
        if (messageLite instanceof ProtoBuf.Function) {
            MemberSignature.Companion companion2 = MemberSignature.Companion;
            JvmMemberSignature.Method methodM91028e = JvmProtoBufUtil.INSTANCE.m91028e((ProtoBuf.Function) messageLite, nameResolver, typeTable);
            if (methodM91028e == null) {
                return null;
            }
            return companion2.m90371b(methodM91028e);
        }
        if (messageLite instanceof ProtoBuf.Property) {
            GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, JvmProtoBuf.JvmPropertySignature> generatedExtension = JvmProtoBuf.f65410d;
            generatedExtension.getClass();
            JvmProtoBuf.JvmPropertySignature jvmPropertySignature = (JvmProtoBuf.JvmPropertySignature) ProtoBufUtilKt.m90895a((GeneratedMessageLite.ExtendableMessage) messageLite, generatedExtension);
            if (jvmPropertySignature == null) {
                return null;
            }
            int i = WhenMappings.f65003a[annotatedCallableKind.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return AbstractBinaryClassAnnotationLoaderKt.m90168a((ProtoBuf.Property) messageLite, nameResolver, typeTable, true, true, z);
                }
                if (!jvmPropertySignature.hasSetter()) {
                    return null;
                }
                MemberSignature.Companion companion3 = MemberSignature.Companion;
                JvmProtoBuf.JvmMethodSignature setter = jvmPropertySignature.getSetter();
                setter.getClass();
                return companion3.m90372c(nameResolver, setter);
            }
            if (jvmPropertySignature.hasGetter()) {
                MemberSignature.Companion companion4 = MemberSignature.Companion;
                JvmProtoBuf.JvmMethodSignature getter = jvmPropertySignature.getGetter();
                getter.getClass();
                return companion4.m90372c(nameResolver, getter);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: v */
    public final int m90161v(MessageLite messageLite) {
        if (messageLite instanceof ProtoBuf.Function) {
            return ((ProtoBuf.Function) messageLite).getContextParameterCount();
        }
        if (messageLite instanceof ProtoBuf.Property) {
            return ((ProtoBuf.Property) messageLite).getContextParameterCount();
        }
        return 0;
    }

    @NotNull
    /* JADX INFO: renamed from: w */
    public final KotlinClassFinder m90162w() {
        return this.f65002a;
    }

    @NotNull
    /* JADX INFO: renamed from: x */
    public abstract MetadataVersion mo90163x();

    /* JADX INFO: renamed from: y */
    public final boolean m90164y(@NotNull ClassId classId) {
        KotlinJvmBinaryClass kotlinJvmBinaryClassM90367b;
        classId.getClass();
        return classId.m91037e() != null && Intrinsics.m87488d(classId.m91040h().m91082b(), "Container") && (kotlinJvmBinaryClassM90367b = KotlinClassFinderKt.m90367b(this.f65002a, classId, mo90163x())) != null && SpecialJvmAnnotations.INSTANCE.m88131c(kotlinJvmBinaryClassM90367b);
    }

    @Nullable
    /* JADX INFO: renamed from: z */
    public abstract KotlinJvmBinaryClass.AnnotationArgumentVisitor mo90165z(@NotNull ClassId classId, @NotNull SourceElement sourceElement, @NotNull List<A> list);
}
