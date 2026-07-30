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
import kotlin.text.C15493d;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.emc0;
import p153l.pr3;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public abstract class AbstractBinaryClassAnnotationLoader<A, S extends AnnotationsContainer<? extends A>> implements AnnotationLoader<A> {

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: a */
    @NotNull
    public final KotlinClassFinder f65676a;

    public static abstract class AnnotationsContainer<A> {
        @NotNull
        /* JADX INFO: renamed from: a */
        public abstract Map<MemberSignature, List<A>> mo91057a();
    }

    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        /* JADX INFO: renamed from: a */
        public final KotlinJvmBinaryClass m91058a(@NotNull ProtoContainer protoContainer, boolean z, boolean z2, @Nullable Boolean bool, boolean z3, @NotNull KotlinClassFinder kotlinClassFinder, @NotNull MetadataVersion metadataVersion) {
            ProtoContainer.Class classM93133h;
            protoContainer.getClass();
            kotlinClassFinder.getClass();
            metadataVersion.getClass();
            if (z) {
                if (bool == null) {
                    throw new IllegalStateException(("isConst should not be null for property (container=" + protoContainer + ')').toString());
                }
                if (protoContainer instanceof ProtoContainer.Class) {
                    ProtoContainer.Class r8 = (ProtoContainer.Class) protoContainer;
                    if (r8.m93132g() == ProtoBuf.Class.Kind.INTERFACE) {
                        ClassId classIdM93130e = r8.m93130e();
                        Name nameM91970i = Name.m91970i("DefaultImpls");
                        nameM91970i.getClass();
                        return KotlinClassFinderKt.m91258b(kotlinClassFinder, classIdM93130e.m91927d(nameM91970i), metadataVersion);
                    }
                }
                if (bool.booleanValue() && (protoContainer instanceof ProtoContainer.Package)) {
                    SourceElement sourceElementM93128c = protoContainer.m93128c();
                    JvmPackagePartSource jvmPackagePartSource = sourceElementM93128c instanceof JvmPackagePartSource ? (JvmPackagePartSource) sourceElementM93128c : null;
                    JvmClassName jvmClassNameM91220f = jvmPackagePartSource != null ? jvmPackagePartSource.m91220f() : null;
                    if (jvmClassNameM91220f != null) {
                        ClassId.Companion companion = ClassId.Companion;
                        String strM92911f = jvmClassNameM91220f.m92911f();
                        strM92911f.getClass();
                        return KotlinClassFinderKt.m91258b(kotlinClassFinder, companion.m91936c(new FqName(C15493d.m94369E(strM92911f, '/', '.', false, 4, null))), metadataVersion);
                    }
                }
            }
            if (z2 && (protoContainer instanceof ProtoContainer.Class)) {
                ProtoContainer.Class r9 = (ProtoContainer.Class) protoContainer;
                if (r9.m93132g() == ProtoBuf.Class.Kind.COMPANION_OBJECT && (classM93133h = r9.m93133h()) != null && (classM93133h.m93132g() == ProtoBuf.Class.Kind.CLASS || classM93133h.m93132g() == ProtoBuf.Class.Kind.ENUM_CLASS || (z3 && (classM93133h.m93132g() == ProtoBuf.Class.Kind.INTERFACE || classM93133h.m93132g() == ProtoBuf.Class.Kind.ANNOTATION_CLASS)))) {
                    SourceElement sourceElementM93128c2 = classM93133h.m93128c();
                    KotlinJvmBinarySourceElement kotlinJvmBinarySourceElement = sourceElementM93128c2 instanceof KotlinJvmBinarySourceElement ? (KotlinJvmBinarySourceElement) sourceElementM93128c2 : null;
                    if (kotlinJvmBinarySourceElement != null) {
                        return kotlinJvmBinarySourceElement.m91259d();
                    }
                    return null;
                }
            }
            if (!(protoContainer instanceof ProtoContainer.Package) || !(protoContainer.m93128c() instanceof JvmPackagePartSource)) {
                return null;
            }
            SourceElement sourceElementM93128c3 = protoContainer.m93128c();
            sourceElementM93128c3.getClass();
            JvmPackagePartSource jvmPackagePartSource2 = (JvmPackagePartSource) sourceElementM93128c3;
            KotlinJvmBinaryClass kotlinJvmBinaryClassM91221g = jvmPackagePartSource2.m91221g();
            return kotlinJvmBinaryClassM91221g == null ? KotlinClassFinderKt.m91258b(kotlinClassFinder, jvmPackagePartSource2.m91218d(), metadataVersion) : kotlinJvmBinaryClassM91221g;
        }

        private Companion() {
        }
    }

    public enum PropertyRelatedElement {
        PROPERTY,
        BACKING_FIELD,
        DELEGATE_FIELD;

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.m88274a(values());
    }

    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f65677a;

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
            f65677a = iArr;
        }
    }

    public AbstractBinaryClassAnnotationLoader(@NotNull KotlinClassFinder kotlinClassFinder) {
        kotlinClassFinder.getClass();
        this.f65676a = kotlinClassFinder;
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ List m91030p(AbstractBinaryClassAnnotationLoader abstractBinaryClassAnnotationLoader, ProtoContainer protoContainer, MemberSignature memberSignature, boolean z, boolean z2, Boolean bool, boolean z3, int i, Object obj) {
        if (obj != null) {
            pr3.m173429a("Super calls with default arguments not supported in this target, function: findClassAndLoadMemberAnnotations");
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
        return abstractBinaryClassAnnotationLoader.m91048o(protoContainer, memberSignature, z, z2, bool, z3);
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ MemberSignature m91031u(AbstractBinaryClassAnnotationLoader abstractBinaryClassAnnotationLoader, MessageLite messageLite, NameResolver nameResolver, TypeTable typeTable, AnnotatedCallableKind annotatedCallableKind, boolean z, int i, Object obj) {
        if (obj != null) {
            pr3.m173429a("Super calls with default arguments not supported in this target, function: getCallableSignature");
            return null;
        }
        if ((i & 16) != 0) {
            z = false;
        }
        return abstractBinaryClassAnnotationLoader.m91051t(messageLite, nameResolver, typeTable, annotatedCallableKind, z);
    }

    @Nullable
    /* JADX INFO: renamed from: A */
    public final KotlinJvmBinaryClass.AnnotationArgumentVisitor m91032A(@NotNull ClassId classId, @NotNull SourceElement sourceElement, @NotNull List<A> list) {
        classId.getClass();
        sourceElement.getClass();
        list.getClass();
        if (SpecialJvmAnnotations.INSTANCE.m89021b().contains(classId)) {
            return null;
        }
        return mo91056z(classId, sourceElement, list);
    }

    /* JADX INFO: renamed from: B */
    public final List<A> m91033B(ProtoContainer protoContainer, MessageLite messageLite, AnnotatedCallableKind annotatedCallableKind, int i) {
        MemberSignature memberSignatureM91031u = m91031u(this, messageLite, protoContainer.m93127b(), protoContainer.m93129d(), annotatedCallableKind, false, 16, null);
        return memberSignatureM91031u == null ? CollectionsKt.emptyList() : m91030p(this, protoContainer, MemberSignature.Companion.m91265e(memberSignatureM91031u, i), false, false, null, false, 60, null);
    }

    /* JADX INFO: renamed from: C */
    public final List<A> m91034C(ProtoContainer protoContainer, ProtoBuf.Property property, PropertyRelatedElement propertyRelatedElement) {
        Boolean boolMo91766d = Flags.f66017D.mo91766d(property.getFlags());
        boolMo91766d.getClass();
        boolMo91766d.booleanValue();
        boolean zM91910f = JvmProtoBufUtil.m91910f(property);
        if (propertyRelatedElement == PropertyRelatedElement.PROPERTY) {
            MemberSignature memberSignatureM91060b = AbstractBinaryClassAnnotationLoaderKt.m91060b(property, protoContainer.m93127b(), protoContainer.m93129d(), false, true, false, 40, null);
            return memberSignatureM91060b == null ? CollectionsKt.emptyList() : m91030p(this, protoContainer, memberSignatureM91060b, true, false, boolMo91766d, zM91910f, 8, null);
        }
        MemberSignature memberSignatureM91060b2 = AbstractBinaryClassAnnotationLoaderKt.m91060b(property, protoContainer.m93127b(), protoContainer.m93129d(), true, false, false, 48, null);
        if (memberSignatureM91060b2 == null) {
            return CollectionsKt.emptyList();
        }
        return StringsKt.m94303P(memberSignatureM91060b2.m91260a(), "$delegate", false, 2, null) != (propertyRelatedElement == PropertyRelatedElement.DELEGATE_FIELD) ? CollectionsKt.emptyList() : m91048o(protoContainer, memberSignatureM91060b2, true, true, boolMo91766d, zM91910f);
    }

    /* JADX INFO: renamed from: D */
    public final KotlinJvmBinaryClass m91035D(ProtoContainer.Class r2) {
        SourceElement sourceElementM93128c = r2.m93128c();
        KotlinJvmBinarySourceElement kotlinJvmBinarySourceElement = sourceElementM93128c instanceof KotlinJvmBinarySourceElement ? (KotlinJvmBinarySourceElement) sourceElementM93128c : null;
        if (kotlinJvmBinarySourceElement != null) {
            return kotlinJvmBinarySourceElement.m91259d();
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    @NotNull
    /* JADX INFO: renamed from: a */
    public List<A> mo91036a(@NotNull ProtoContainer protoContainer, @NotNull MessageLite messageLite, @NotNull AnnotatedCallableKind annotatedCallableKind, int i, @NotNull ProtoBuf.ValueParameter valueParameter) {
        protoContainer.getClass();
        messageLite.getClass();
        annotatedCallableKind.getClass();
        valueParameter.getClass();
        return m91033B(protoContainer, messageLite, annotatedCallableKind, i + m91047n(protoContainer, messageLite));
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    @NotNull
    /* JADX INFO: renamed from: b */
    public List<A> mo91037b(@NotNull ProtoContainer.Class r3) {
        r3.getClass();
        KotlinJvmBinaryClass kotlinJvmBinaryClassM91035D = m91035D(r3);
        if (kotlinJvmBinaryClassM91035D == null) {
            emc0.m121356a("Class for loading annotations is not found: ", r3.mo93126a());
            return null;
        }
        final ArrayList arrayList = new ArrayList(1);
        kotlinJvmBinaryClassM91035D.mo89838c(new KotlinJvmBinaryClass.AnnotationVisitor(this) { // from class: kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationLoader$loadClassAnnotations$1

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ AbstractBinaryClassAnnotationLoader<A, S> f65678a;

            {
                this.f65678a = this;
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
                return this.f65678a.m91032A(classId, sourceElement, arrayList);
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationVisitor
            public void visitEnd() {
            }
        }, m91050s(kotlinJvmBinaryClassM91035D));
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    @NotNull
    /* JADX INFO: renamed from: c */
    public List<A> mo91038c(@NotNull ProtoContainer protoContainer, @NotNull ProtoBuf.EnumEntry enumEntry) {
        protoContainer.getClass();
        enumEntry.getClass();
        return m91030p(this, protoContainer, MemberSignature.Companion.m91261a(protoContainer.m93127b().getString(enumEntry.getName()), ClassMapperLite.m91897b(((ProtoContainer.Class) protoContainer).m93130e().m91926b())), false, false, null, false, 60, null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    @NotNull
    /* JADX INFO: renamed from: d */
    public List<A> mo91039d(@NotNull ProtoBuf.TypeParameter typeParameter, @NotNull NameResolver nameResolver) {
        typeParameter.getClass();
        nameResolver.getClass();
        Object extension = typeParameter.getExtension(JvmProtoBuf.f66088h);
        extension.getClass();
        Iterable<ProtoBuf.Annotation> iterable = (Iterable) extension;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
        for (ProtoBuf.Annotation annotation : iterable) {
            annotation.getClass();
            arrayList.add(mo91045l(annotation, nameResolver));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    @NotNull
    /* JADX INFO: renamed from: f */
    public List<A> mo91040f(@NotNull ProtoContainer protoContainer, @NotNull ProtoBuf.Property property) {
        protoContainer.getClass();
        property.getClass();
        return m91034C(protoContainer, property, PropertyRelatedElement.BACKING_FIELD);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    @NotNull
    /* JADX INFO: renamed from: g */
    public List<A> mo91041g(@NotNull ProtoContainer protoContainer, @NotNull MessageLite messageLite, @NotNull AnnotatedCallableKind annotatedCallableKind) {
        protoContainer.getClass();
        messageLite.getClass();
        annotatedCallableKind.getClass();
        return m91033B(protoContainer, messageLite, annotatedCallableKind, m91052v(messageLite));
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    @NotNull
    /* JADX INFO: renamed from: h */
    public List<A> mo91042h(@NotNull ProtoContainer protoContainer, @NotNull MessageLite messageLite, @NotNull AnnotatedCallableKind annotatedCallableKind, int i, @Nullable ProtoBuf.ValueParameter valueParameter) {
        protoContainer.getClass();
        messageLite.getClass();
        annotatedCallableKind.getClass();
        return m91033B(protoContainer, messageLite, annotatedCallableKind, i);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    @NotNull
    /* JADX INFO: renamed from: i */
    public List<A> mo91043i(@NotNull ProtoBuf.Type type, @NotNull NameResolver nameResolver) {
        type.getClass();
        nameResolver.getClass();
        Object extension = type.getExtension(JvmProtoBuf.f66086f);
        extension.getClass();
        Iterable<ProtoBuf.Annotation> iterable = (Iterable) extension;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
        for (ProtoBuf.Annotation annotation : iterable) {
            annotation.getClass();
            arrayList.add(mo91045l(annotation, nameResolver));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    @NotNull
    /* JADX INFO: renamed from: j */
    public List<A> mo91044j(@NotNull ProtoContainer protoContainer, @NotNull MessageLite messageLite, @NotNull AnnotatedCallableKind annotatedCallableKind) {
        protoContainer.getClass();
        messageLite.getClass();
        annotatedCallableKind.getClass();
        if (annotatedCallableKind == AnnotatedCallableKind.PROPERTY) {
            return m91034C(protoContainer, (ProtoBuf.Property) messageLite, PropertyRelatedElement.PROPERTY);
        }
        MemberSignature memberSignatureM91031u = m91031u(this, messageLite, protoContainer.m93127b(), protoContainer.m93129d(), annotatedCallableKind, false, 16, null);
        return memberSignatureM91031u == null ? CollectionsKt.emptyList() : m91030p(this, protoContainer, memberSignatureM91031u, false, false, null, false, 60, null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    @NotNull
    /* JADX INFO: renamed from: l */
    public abstract A mo91045l(@NotNull ProtoBuf.Annotation annotation, @NotNull NameResolver nameResolver);

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    @NotNull
    /* JADX INFO: renamed from: m */
    public List<A> mo91046m(@NotNull ProtoContainer protoContainer, @NotNull ProtoBuf.Property property) {
        protoContainer.getClass();
        property.getClass();
        return m91034C(protoContainer, property, PropertyRelatedElement.DELEGATE_FIELD);
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0012  */
    /* JADX INFO: renamed from: n */
    public final int m91047n(ProtoContainer protoContainer, MessageLite messageLite) {
        int iM91052v = m91052v(messageLite);
        int i = 0;
        if (messageLite instanceof ProtoBuf.Function) {
            if (ProtoTypeTableUtilKt.m91794g((ProtoBuf.Function) messageLite)) {
                i = 1;
            }
        } else if (messageLite instanceof ProtoBuf.Property) {
            if (ProtoTypeTableUtilKt.m91795h((ProtoBuf.Property) messageLite)) {
                i = 1;
            }
        } else {
            if (!(messageLite instanceof ProtoBuf.Constructor)) {
                throw new UnsupportedOperationException("Unsupported message: " + messageLite.getClass());
            }
            protoContainer.getClass();
            ProtoContainer.Class r4 = (ProtoContainer.Class) protoContainer;
            if (r4.m93132g() == ProtoBuf.Class.Kind.ENUM_CLASS) {
                i = 2;
            } else if (r4.m93134i()) {
                i = 1;
            }
        }
        return iM91052v + i;
    }

    /* JADX INFO: renamed from: o */
    public final List<A> m91048o(ProtoContainer protoContainer, MemberSignature memberSignature, boolean z, boolean z2, Boolean bool, boolean z3) {
        KotlinJvmBinaryClass kotlinJvmBinaryClassM91049q = m91049q(protoContainer, Companion.m91058a(protoContainer, z, z2, bool, z3, this.f65676a, mo91054x()));
        if (kotlinJvmBinaryClassM91049q == null) {
            return CollectionsKt.emptyList();
        }
        List<A> list = mo91025r(kotlinJvmBinaryClassM91049q).mo91057a().get(memberSignature);
        return list == null ? CollectionsKt.emptyList() : list;
    }

    @Nullable
    /* JADX INFO: renamed from: q */
    public final KotlinJvmBinaryClass m91049q(@NotNull ProtoContainer protoContainer, @Nullable KotlinJvmBinaryClass kotlinJvmBinaryClass) {
        protoContainer.getClass();
        if (kotlinJvmBinaryClass != null) {
            return kotlinJvmBinaryClass;
        }
        if (protoContainer instanceof ProtoContainer.Class) {
            return m91035D((ProtoContainer.Class) protoContainer);
        }
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: r */
    public abstract S mo91025r(@NotNull KotlinJvmBinaryClass kotlinJvmBinaryClass);

    @Nullable
    /* JADX INFO: renamed from: s */
    public byte[] m91050s(@NotNull KotlinJvmBinaryClass kotlinJvmBinaryClass) {
        kotlinJvmBinaryClass.getClass();
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: t */
    public final MemberSignature m91051t(@NotNull MessageLite messageLite, @NotNull NameResolver nameResolver, @NotNull TypeTable typeTable, @NotNull AnnotatedCallableKind annotatedCallableKind, boolean z) {
        messageLite.getClass();
        nameResolver.getClass();
        typeTable.getClass();
        annotatedCallableKind.getClass();
        if (messageLite instanceof ProtoBuf.Constructor) {
            MemberSignature.Companion companion = MemberSignature.Companion;
            JvmMemberSignature.Method methodM91917b = JvmProtoBufUtil.INSTANCE.m91917b((ProtoBuf.Constructor) messageLite, nameResolver, typeTable);
            if (methodM91917b == null) {
                return null;
            }
            return companion.m91262b(methodM91917b);
        }
        if (messageLite instanceof ProtoBuf.Function) {
            MemberSignature.Companion companion2 = MemberSignature.Companion;
            JvmMemberSignature.Method methodM91919e = JvmProtoBufUtil.INSTANCE.m91919e((ProtoBuf.Function) messageLite, nameResolver, typeTable);
            if (methodM91919e == null) {
                return null;
            }
            return companion2.m91262b(methodM91919e);
        }
        if (messageLite instanceof ProtoBuf.Property) {
            GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, JvmProtoBuf.JvmPropertySignature> generatedExtension = JvmProtoBuf.f66084d;
            generatedExtension.getClass();
            JvmProtoBuf.JvmPropertySignature jvmPropertySignature = (JvmProtoBuf.JvmPropertySignature) ProtoBufUtilKt.m91786a((GeneratedMessageLite.ExtendableMessage) messageLite, generatedExtension);
            if (jvmPropertySignature == null) {
                return null;
            }
            int i = WhenMappings.f65677a[annotatedCallableKind.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return AbstractBinaryClassAnnotationLoaderKt.m91059a((ProtoBuf.Property) messageLite, nameResolver, typeTable, true, true, z);
                }
                if (!jvmPropertySignature.hasSetter()) {
                    return null;
                }
                MemberSignature.Companion companion3 = MemberSignature.Companion;
                JvmProtoBuf.JvmMethodSignature setter = jvmPropertySignature.getSetter();
                setter.getClass();
                return companion3.m91263c(nameResolver, setter);
            }
            if (jvmPropertySignature.hasGetter()) {
                MemberSignature.Companion companion4 = MemberSignature.Companion;
                JvmProtoBuf.JvmMethodSignature getter = jvmPropertySignature.getGetter();
                getter.getClass();
                return companion4.m91263c(nameResolver, getter);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: v */
    public final int m91052v(MessageLite messageLite) {
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
    public final KotlinClassFinder m91053w() {
        return this.f65676a;
    }

    @NotNull
    /* JADX INFO: renamed from: x */
    public abstract MetadataVersion mo91054x();

    /* JADX INFO: renamed from: y */
    public final boolean m91055y(@NotNull ClassId classId) {
        KotlinJvmBinaryClass kotlinJvmBinaryClassM91258b;
        classId.getClass();
        return classId.m91928e() != null && Intrinsics.m88377d(classId.m91931h().m91973b(), "Container") && (kotlinJvmBinaryClassM91258b = KotlinClassFinderKt.m91258b(this.f65676a, classId, mo91054x())) != null && SpecialJvmAnnotations.INSTANCE.m89022c(kotlinJvmBinaryClassM91258b);
    }

    @Nullable
    /* JADX INFO: renamed from: z */
    public abstract KotlinJvmBinaryClass.AnnotationArgumentVisitor mo91056z(@NotNull ClassId classId, @NotNull SourceElement sourceElement, @NotNull List<A> list);
}
