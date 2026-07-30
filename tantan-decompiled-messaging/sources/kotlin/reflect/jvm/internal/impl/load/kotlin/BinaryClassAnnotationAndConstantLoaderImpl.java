package kotlin.reflect.jvm.internal.impl.load.kotlin;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.load.java.components.DescriptorResolverUtils;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.MetadataVersion;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.AnnotationValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ByteValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ClassLiteralValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValueFactory;
import kotlin.reflect.jvm.internal.impl.resolve.constants.EnumValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ErrorValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.IntValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.KClassValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.LongValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ShortValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.UByteValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.UIntValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ULongValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.UShortValue;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationDeserializer;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.b2s;
import p149l.j6f;
import p149l.y9g0;

/* JADX INFO: loaded from: classes2.dex */
public final class BinaryClassAnnotationAndConstantLoaderImpl extends AbstractBinaryClassAnnotationAndConstantLoader<AnnotationDescriptor, ConstantValue<?>> {

    /* JADX INFO: renamed from: c */
    @NotNull
    public final ModuleDescriptor f65009c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final NotFoundClasses f65010d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public final AnnotationDeserializer f65011e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public MetadataVersion f65012f;

    public abstract class AbstractAnnotationArgumentVisitor implements KotlinJvmBinaryClass.AnnotationArgumentVisitor {
        public AbstractAnnotationArgumentVisitor() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        /* JADX INFO: renamed from: a */
        public void mo90179a(@Nullable Name name, @NotNull ClassId classId, @NotNull Name name2) {
            classId.getClass();
            name2.getClass();
            mo90185g(name, new EnumValue(classId, name2));
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        @Nullable
        /* JADX INFO: renamed from: b */
        public KotlinJvmBinaryClass.AnnotationArgumentVisitor mo90180b(@Nullable final Name name, @NotNull ClassId classId) {
            classId.getClass();
            final ArrayList arrayList = new ArrayList();
            BinaryClassAnnotationAndConstantLoaderImpl binaryClassAnnotationAndConstantLoaderImpl = BinaryClassAnnotationAndConstantLoaderImpl.this;
            SourceElement sourceElement = SourceElement.f64063a;
            sourceElement.getClass();
            final KotlinJvmBinaryClass.AnnotationArgumentVisitor annotationArgumentVisitorMo90165z = binaryClassAnnotationAndConstantLoaderImpl.mo90165z(classId, sourceElement, arrayList);
            annotationArgumentVisitorMo90165z.getClass();
            return new KotlinJvmBinaryClass.AnnotationArgumentVisitor(this, name, arrayList) { // from class: kotlin.reflect.jvm.internal.impl.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl$AbstractAnnotationArgumentVisitor$visitAnnotation$1

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ KotlinJvmBinaryClass.AnnotationArgumentVisitor f65014a;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ BinaryClassAnnotationAndConstantLoaderImpl.AbstractAnnotationArgumentVisitor f65016c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ Name f65017d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ ArrayList<AnnotationDescriptor> f65018e;

                {
                    this.f65016c = this;
                    this.f65017d = name;
                    this.f65018e = arrayList;
                    this.f65014a = this.f65015b;
                }

                @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
                /* JADX INFO: renamed from: a */
                public void mo90179a(Name name2, ClassId classId2, Name name3) {
                    classId2.getClass();
                    name3.getClass();
                    this.f65014a.mo90179a(name2, classId2, name3);
                }

                @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
                /* JADX INFO: renamed from: b */
                public KotlinJvmBinaryClass.AnnotationArgumentVisitor mo90180b(Name name2, ClassId classId2) {
                    classId2.getClass();
                    return this.f65014a.mo90180b(name2, classId2);
                }

                @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
                /* JADX INFO: renamed from: c */
                public void mo90181c(Name name2, ClassLiteralValue classLiteralValue) {
                    classLiteralValue.getClass();
                    this.f65014a.mo90181c(name2, classLiteralValue);
                }

                @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
                /* JADX INFO: renamed from: d */
                public void mo90182d(Name name2, Object obj) {
                    this.f65014a.mo90182d(name2, obj);
                }

                @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
                /* JADX INFO: renamed from: e */
                public KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor mo90183e(Name name2) {
                    return this.f65014a.mo90183e(name2);
                }

                @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
                public void visitEnd() {
                    this.f65015b.visitEnd();
                    this.f65016c.mo90185g(this.f65017d, new AnnotationValue((AnnotationDescriptor) CollectionsKt.single((List) this.f65018e)));
                }
            };
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        /* JADX INFO: renamed from: c */
        public void mo90181c(@Nullable Name name, @NotNull ClassLiteralValue classLiteralValue) {
            classLiteralValue.getClass();
            mo90185g(name, new KClassValue(classLiteralValue));
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        /* JADX INFO: renamed from: d */
        public void mo90182d(@Nullable Name name, @Nullable Object obj) {
            mo90185g(name, BinaryClassAnnotationAndConstantLoaderImpl.this.m90173R(name, obj));
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        @Nullable
        /* JADX INFO: renamed from: e */
        public KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor mo90183e(@Nullable Name name) {
            return new C15226x4262547b(BinaryClassAnnotationAndConstantLoaderImpl.this, name, this);
        }

        /* JADX INFO: renamed from: f */
        public abstract void mo90184f(@Nullable Name name, @NotNull ArrayList<ConstantValue<?>> arrayList);

        /* JADX INFO: renamed from: g */
        public abstract void mo90185g(@Nullable Name name, @NotNull ConstantValue<?> constantValue);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinaryClassAnnotationAndConstantLoaderImpl(@NotNull ModuleDescriptor moduleDescriptor, @NotNull NotFoundClasses notFoundClasses, @NotNull StorageManager storageManager, @NotNull KotlinClassFinder kotlinClassFinder) {
        super(storageManager, kotlinClassFinder);
        moduleDescriptor.getClass();
        notFoundClasses.getClass();
        storageManager.getClass();
        kotlinClassFinder.getClass();
        this.f65009c = moduleDescriptor;
        this.f65010d = notFoundClasses;
        this.f65011e = new AnnotationDeserializer(moduleDescriptor, notFoundClasses);
        this.f65012f = MetadataVersion.INSTANCE;
    }

    /* JADX INFO: renamed from: R */
    public final ConstantValue<?> m90173R(Name name, Object obj) {
        ConstantValue<?> constantValueM91924e = ConstantValueFactory.INSTANCE.m91924e(obj, this.f65009c);
        if (constantValueM91924e != null) {
            return constantValueM91924e;
        }
        return ErrorValue.Companion.m91928a("Unsupported annotation argument: " + name);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationLoader, kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    @NotNull
    /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
    public AnnotationDescriptor mo90154l(@NotNull ProtoBuf.Annotation annotation, @NotNull NameResolver nameResolver) {
        annotation.getClass();
        nameResolver.getClass();
        return this.f65011e.m92127a(annotation, nameResolver);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader
    @Nullable
    /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
    public ConstantValue<?> mo90129L(@NotNull String str, @NotNull Object obj) {
        str.getClass();
        obj.getClass();
        if (StringsKt.m93412P("ZBCS", str, false, 2, null)) {
            int iIntValue = ((Integer) obj).intValue();
            int iHashCode = str.hashCode();
            if (iHashCode == 66) {
                if (str.equals("B")) {
                    obj = Byte.valueOf((byte) iIntValue);
                }
                y9g0.m213537a(str);
                return null;
            }
            if (iHashCode == 67) {
                if (str.equals(b2s.C_ZONE)) {
                    obj = Character.valueOf((char) iIntValue);
                }
                y9g0.m213537a(str);
                return null;
            }
            if (iHashCode == 83) {
                if (str.equals(j6f.LATITUDE_SOUTH)) {
                    obj = Short.valueOf((short) iIntValue);
                }
                y9g0.m213537a(str);
                return null;
            }
            if (iHashCode == 90 && str.equals("Z")) {
                obj = Boolean.valueOf(iIntValue != 0);
            }
            y9g0.m213537a(str);
            return null;
        }
        return ConstantValueFactory.INSTANCE.m91924e(obj, this.f65009c);
    }

    /* JADX INFO: renamed from: U */
    public final ClassDescriptor m90176U(ClassId classId) {
        return FindClassInModuleKt.m88509d(this.f65009c, classId, this.f65010d);
    }

    /* JADX INFO: renamed from: V */
    public void m90177V(@NotNull MetadataVersion metadataVersion) {
        metadataVersion.getClass();
        this.f65012f = metadataVersion;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader
    @Nullable
    /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
    public ConstantValue<?> mo90131P(@NotNull ConstantValue<?> constantValue) {
        constantValue.getClass();
        if (constantValue instanceof ByteValue) {
            return new UByteValue(((ByteValue) constantValue).mo91918b().byteValue());
        }
        if (constantValue instanceof ShortValue) {
            return new UShortValue(((ShortValue) constantValue).mo91918b().shortValue());
        }
        if (constantValue instanceof IntValue) {
            return new UIntValue(((IntValue) constantValue).mo91918b().intValue());
        }
        return constantValue instanceof LongValue ? new ULongValue(((LongValue) constantValue).mo91918b().longValue()) : constantValue;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationLoader
    @NotNull
    /* JADX INFO: renamed from: x */
    public MetadataVersion mo90163x() {
        return this.f65012f;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationLoader
    @Nullable
    /* JADX INFO: renamed from: z */
    public KotlinJvmBinaryClass.AnnotationArgumentVisitor mo90165z(@NotNull final ClassId classId, @NotNull final SourceElement sourceElement, @NotNull final List<AnnotationDescriptor> list) {
        classId.getClass();
        sourceElement.getClass();
        list.getClass();
        final ClassDescriptor classDescriptorM90176U = m90176U(classId);
        return new AbstractAnnotationArgumentVisitor() { // from class: kotlin.reflect.jvm.internal.impl.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl$loadAnnotation$1

            /* JADX INFO: renamed from: b */
            public final HashMap<Name, ConstantValue<?>> f65027b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
                this.f65027b = new HashMap<>();
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl.AbstractAnnotationArgumentVisitor
            /* JADX INFO: renamed from: f */
            public void mo90184f(Name name, ArrayList<ConstantValue<?>> arrayList) {
                arrayList.getClass();
                if (name == null) {
                    return;
                }
                ValueParameterDescriptor valueParameterDescriptorM89507b = DescriptorResolverUtils.m89507b(name, classDescriptorM90176U);
                if (valueParameterDescriptorM89507b != null) {
                    HashMap<Name, ConstantValue<?>> map = this.f65027b;
                    ConstantValueFactory constantValueFactory = ConstantValueFactory.INSTANCE;
                    List<? extends ConstantValue<?>> listM93180c = kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.m93180c(arrayList);
                    KotlinType type = valueParameterDescriptorM89507b.getType();
                    type.getClass();
                    map.put(name, constantValueFactory.m91923c(listM93180c, type));
                    return;
                }
                if (this.f65028c.m90164y(classId) && Intrinsics.m87488d(name.m91082b(), "value")) {
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj : arrayList) {
                        if (obj instanceof AnnotationValue) {
                            arrayList2.add(obj);
                        }
                    }
                    List<AnnotationDescriptor> list2 = list;
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        list2.add(((AnnotationValue) it.next()).mo91918b());
                    }
                }
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl.AbstractAnnotationArgumentVisitor
            /* JADX INFO: renamed from: g */
            public void mo90185g(Name name, ConstantValue<?> constantValue) {
                constantValue.getClass();
                if (name != null) {
                    this.f65027b.put(name, constantValue);
                }
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
            public void visitEnd() {
                if (this.f65028c.m90127I(classId, this.f65027b) || this.f65028c.m90164y(classId)) {
                    return;
                }
                list.add(new AnnotationDescriptorImpl(classDescriptorM90176U.mo88458o(), this.f65027b, sourceElement));
            }
        };
    }
}
