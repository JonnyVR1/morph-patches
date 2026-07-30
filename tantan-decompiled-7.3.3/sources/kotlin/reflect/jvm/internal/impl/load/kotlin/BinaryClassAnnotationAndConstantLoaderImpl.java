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
import p153l.c4s;
import p153l.gig0;
import p153l.p7f;

/* JADX INFO: loaded from: classes2.dex */
public final class BinaryClassAnnotationAndConstantLoaderImpl extends AbstractBinaryClassAnnotationAndConstantLoader<AnnotationDescriptor, ConstantValue<?>> {

    /* JADX INFO: renamed from: c */
    @NotNull
    public final ModuleDescriptor f65683c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final NotFoundClasses f65684d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public final AnnotationDeserializer f65685e;

    /* JADX INFO: renamed from: f */
    @NotNull
    public MetadataVersion f65686f;

    public abstract class AbstractAnnotationArgumentVisitor implements KotlinJvmBinaryClass.AnnotationArgumentVisitor {
        public AbstractAnnotationArgumentVisitor() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        /* JADX INFO: renamed from: a */
        public void mo91070a(@Nullable Name name, @NotNull ClassId classId, @NotNull Name name2) {
            classId.getClass();
            name2.getClass();
            mo91076g(name, new EnumValue(classId, name2));
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        @Nullable
        /* JADX INFO: renamed from: b */
        public KotlinJvmBinaryClass.AnnotationArgumentVisitor mo91071b(@Nullable final Name name, @NotNull ClassId classId) {
            classId.getClass();
            final ArrayList arrayList = new ArrayList();
            BinaryClassAnnotationAndConstantLoaderImpl binaryClassAnnotationAndConstantLoaderImpl = BinaryClassAnnotationAndConstantLoaderImpl.this;
            SourceElement sourceElement = SourceElement.f64737a;
            sourceElement.getClass();
            final KotlinJvmBinaryClass.AnnotationArgumentVisitor annotationArgumentVisitorMo91056z = binaryClassAnnotationAndConstantLoaderImpl.mo91056z(classId, sourceElement, arrayList);
            annotationArgumentVisitorMo91056z.getClass();
            return new KotlinJvmBinaryClass.AnnotationArgumentVisitor(this, name, arrayList) { // from class: kotlin.reflect.jvm.internal.impl.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl$AbstractAnnotationArgumentVisitor$visitAnnotation$1

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ KotlinJvmBinaryClass.AnnotationArgumentVisitor f65688a;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ BinaryClassAnnotationAndConstantLoaderImpl.AbstractAnnotationArgumentVisitor f65690c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ Name f65691d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ ArrayList<AnnotationDescriptor> f65692e;

                {
                    this.f65690c = this;
                    this.f65691d = name;
                    this.f65692e = arrayList;
                    this.f65688a = this.f65689b;
                }

                @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
                /* JADX INFO: renamed from: a */
                public void mo91070a(Name name2, ClassId classId2, Name name3) {
                    classId2.getClass();
                    name3.getClass();
                    this.f65688a.mo91070a(name2, classId2, name3);
                }

                @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
                /* JADX INFO: renamed from: b */
                public KotlinJvmBinaryClass.AnnotationArgumentVisitor mo91071b(Name name2, ClassId classId2) {
                    classId2.getClass();
                    return this.f65688a.mo91071b(name2, classId2);
                }

                @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
                /* JADX INFO: renamed from: c */
                public void mo91072c(Name name2, ClassLiteralValue classLiteralValue) {
                    classLiteralValue.getClass();
                    this.f65688a.mo91072c(name2, classLiteralValue);
                }

                @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
                /* JADX INFO: renamed from: d */
                public void mo91073d(Name name2, Object obj) {
                    this.f65688a.mo91073d(name2, obj);
                }

                @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
                /* JADX INFO: renamed from: e */
                public KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor mo91074e(Name name2) {
                    return this.f65688a.mo91074e(name2);
                }

                @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
                public void visitEnd() {
                    this.f65689b.visitEnd();
                    this.f65690c.mo91076g(this.f65691d, new AnnotationValue((AnnotationDescriptor) CollectionsKt.single((List) this.f65692e)));
                }
            };
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        /* JADX INFO: renamed from: c */
        public void mo91072c(@Nullable Name name, @NotNull ClassLiteralValue classLiteralValue) {
            classLiteralValue.getClass();
            mo91076g(name, new KClassValue(classLiteralValue));
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        /* JADX INFO: renamed from: d */
        public void mo91073d(@Nullable Name name, @Nullable Object obj) {
            mo91076g(name, BinaryClassAnnotationAndConstantLoaderImpl.this.m91064R(name, obj));
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
        @Nullable
        /* JADX INFO: renamed from: e */
        public KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor mo91074e(@Nullable Name name) {
            return new C15333x4262547b(BinaryClassAnnotationAndConstantLoaderImpl.this, name, this);
        }

        /* JADX INFO: renamed from: f */
        public abstract void mo91075f(@Nullable Name name, @NotNull ArrayList<ConstantValue<?>> arrayList);

        /* JADX INFO: renamed from: g */
        public abstract void mo91076g(@Nullable Name name, @NotNull ConstantValue<?> constantValue);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinaryClassAnnotationAndConstantLoaderImpl(@NotNull ModuleDescriptor moduleDescriptor, @NotNull NotFoundClasses notFoundClasses, @NotNull StorageManager storageManager, @NotNull KotlinClassFinder kotlinClassFinder) {
        super(storageManager, kotlinClassFinder);
        moduleDescriptor.getClass();
        notFoundClasses.getClass();
        storageManager.getClass();
        kotlinClassFinder.getClass();
        this.f65683c = moduleDescriptor;
        this.f65684d = notFoundClasses;
        this.f65685e = new AnnotationDeserializer(moduleDescriptor, notFoundClasses);
        this.f65686f = MetadataVersion.INSTANCE;
    }

    /* JADX INFO: renamed from: R */
    public final ConstantValue<?> m91064R(Name name, Object obj) {
        ConstantValue<?> constantValueM92815e = ConstantValueFactory.INSTANCE.m92815e(obj, this.f65683c);
        if (constantValueM92815e != null) {
            return constantValueM92815e;
        }
        return ErrorValue.Companion.m92819a("Unsupported annotation argument: " + name);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationLoader, kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    @NotNull
    /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
    public AnnotationDescriptor mo91045l(@NotNull ProtoBuf.Annotation annotation, @NotNull NameResolver nameResolver) {
        annotation.getClass();
        nameResolver.getClass();
        return this.f65685e.m93018a(annotation, nameResolver);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader
    @Nullable
    /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
    public ConstantValue<?> mo91020L(@NotNull String str, @NotNull Object obj) {
        str.getClass();
        obj.getClass();
        if (StringsKt.m94303P("ZBCS", str, false, 2, null)) {
            int iIntValue = ((Integer) obj).intValue();
            int iHashCode = str.hashCode();
            if (iHashCode == 66) {
                if (str.equals("B")) {
                    obj = Byte.valueOf((byte) iIntValue);
                }
                gig0.m130323a(str);
                return null;
            }
            if (iHashCode == 67) {
                if (str.equals(c4s.C_ZONE)) {
                    obj = Character.valueOf((char) iIntValue);
                }
                gig0.m130323a(str);
                return null;
            }
            if (iHashCode == 83) {
                if (str.equals(p7f.LATITUDE_SOUTH)) {
                    obj = Short.valueOf((short) iIntValue);
                }
                gig0.m130323a(str);
                return null;
            }
            if (iHashCode == 90 && str.equals("Z")) {
                obj = Boolean.valueOf(iIntValue != 0);
            }
            gig0.m130323a(str);
            return null;
        }
        return ConstantValueFactory.INSTANCE.m92815e(obj, this.f65683c);
    }

    /* JADX INFO: renamed from: U */
    public final ClassDescriptor m91067U(ClassId classId) {
        return FindClassInModuleKt.m89400d(this.f65683c, classId, this.f65684d);
    }

    /* JADX INFO: renamed from: V */
    public void m91068V(@NotNull MetadataVersion metadataVersion) {
        metadataVersion.getClass();
        this.f65686f = metadataVersion;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader
    @Nullable
    /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
    public ConstantValue<?> mo91022P(@NotNull ConstantValue<?> constantValue) {
        constantValue.getClass();
        if (constantValue instanceof ByteValue) {
            return new UByteValue(((ByteValue) constantValue).mo92809b().byteValue());
        }
        if (constantValue instanceof ShortValue) {
            return new UShortValue(((ShortValue) constantValue).mo92809b().shortValue());
        }
        if (constantValue instanceof IntValue) {
            return new UIntValue(((IntValue) constantValue).mo92809b().intValue());
        }
        return constantValue instanceof LongValue ? new ULongValue(((LongValue) constantValue).mo92809b().longValue()) : constantValue;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationLoader
    @NotNull
    /* JADX INFO: renamed from: x */
    public MetadataVersion mo91054x() {
        return this.f65686f;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationLoader
    @Nullable
    /* JADX INFO: renamed from: z */
    public KotlinJvmBinaryClass.AnnotationArgumentVisitor mo91056z(@NotNull final ClassId classId, @NotNull final SourceElement sourceElement, @NotNull final List<AnnotationDescriptor> list) {
        classId.getClass();
        sourceElement.getClass();
        list.getClass();
        final ClassDescriptor classDescriptorM91067U = m91067U(classId);
        return new AbstractAnnotationArgumentVisitor() { // from class: kotlin.reflect.jvm.internal.impl.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl$loadAnnotation$1

            /* JADX INFO: renamed from: b */
            public final HashMap<Name, ConstantValue<?>> f65701b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
                this.f65701b = new HashMap<>();
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl.AbstractAnnotationArgumentVisitor
            /* JADX INFO: renamed from: f */
            public void mo91075f(Name name, ArrayList<ConstantValue<?>> arrayList) {
                arrayList.getClass();
                if (name == null) {
                    return;
                }
                ValueParameterDescriptor valueParameterDescriptorM90398b = DescriptorResolverUtils.m90398b(name, classDescriptorM91067U);
                if (valueParameterDescriptorM90398b != null) {
                    HashMap<Name, ConstantValue<?>> map = this.f65701b;
                    ConstantValueFactory constantValueFactory = ConstantValueFactory.INSTANCE;
                    List<? extends ConstantValue<?>> listM94071c = kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.m94071c(arrayList);
                    KotlinType type = valueParameterDescriptorM90398b.getType();
                    type.getClass();
                    map.put(name, constantValueFactory.m92814c(listM94071c, type));
                    return;
                }
                if (this.f65702c.m91055y(classId) && Intrinsics.m88377d(name.m91973b(), "value")) {
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj : arrayList) {
                        if (obj instanceof AnnotationValue) {
                            arrayList2.add(obj);
                        }
                    }
                    List<AnnotationDescriptor> list2 = list;
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        list2.add(((AnnotationValue) it.next()).mo92809b());
                    }
                }
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.BinaryClassAnnotationAndConstantLoaderImpl.AbstractAnnotationArgumentVisitor
            /* JADX INFO: renamed from: g */
            public void mo91076g(Name name, ConstantValue<?> constantValue) {
                constantValue.getClass();
                if (name != null) {
                    this.f65701b.put(name, constantValue);
                }
            }

            @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
            public void visitEnd() {
                if (this.f65702c.m91018I(classId, this.f65701b) || this.f65702c.m91055y(classId)) {
                    return;
                }
                list.add(new AnnotationDescriptorImpl(classDescriptorM91067U.mo89349o(), this.f65701b, sourceElement));
            }
        };
    }
}
