package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.SpreadBuilder;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibility;
import kotlin.reflect.jvm.internal.impl.descriptors.java.JavaVisibilities;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaRecordComponent;
import kotlin.reflect.jvm.internal.impl.load.java.structure.LightClassOriginKind;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.omc0;
import p149l.pmc0;
import p149l.qmc0;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class ReflectJavaClass extends ReflectJavaElement implements ReflectJavaAnnotationOwner, ReflectJavaModifierListOwner, JavaClass {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final Class<?> f64354a;

    public ReflectJavaClass(@NotNull Class<?> cls) {
        cls.getClass();
        this.f64354a = cls;
    }

    /* JADX INFO: renamed from: I */
    public static final boolean m89015I(Class cls) {
        return cls.getSimpleName().length() == 0;
    }

    /* JADX INFO: renamed from: J */
    public static final Name m89016J(Class cls) {
        String simpleName = cls.getSimpleName();
        if (!Name.m91080m(simpleName)) {
            simpleName = null;
        }
        if (simpleName != null) {
            return Name.m91079i(simpleName);
        }
        return null;
    }

    /* JADX INFO: renamed from: K */
    public static final boolean m89017K(ReflectJavaClass reflectJavaClass, Method method) {
        if (method.isSynthetic()) {
            return false;
        }
        return (reflectJavaClass.isEnum() && reflectJavaClass.m89030U(method)) ? false : true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    /* JADX INFO: renamed from: A */
    public boolean mo89021A() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    /* JADX INFO: renamed from: D */
    public boolean mo89022D() throws IllegalAccessException, InvocationTargetException {
        Boolean boolM88978f = Java16SealedRecordLoader.INSTANCE.m88978f(this.f64354a);
        if (boolM88978f != null) {
            return boolM88978f.booleanValue();
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaModifierListOwner
    /* JADX INFO: renamed from: H */
    public boolean mo89023H() {
        return Modifier.isStatic(getModifiers());
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    @NotNull
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public List<ReflectJavaConstructor> getConstructors() {
        Constructor<?>[] declaredConstructors = this.f64354a.getDeclaredConstructors();
        declaredConstructors.getClass();
        return SequencesKt___SequencesKt.m93302V(SequencesKt___SequencesKt.m93294N(SequencesKt___SequencesKt.m93285E(ArraysKt.asSequence(declaredConstructors), ReflectJavaClass$constructors$1.INSTANCE), ReflectJavaClass$constructors$2.INSTANCE));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaAnnotationOwner
    @NotNull
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public Class<?> getElement() {
        return this.f64354a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    @NotNull
    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public List<ReflectJavaField> getFields() {
        Field[] declaredFields = this.f64354a.getDeclaredFields();
        declaredFields.getClass();
        return SequencesKt___SequencesKt.m93302V(SequencesKt___SequencesKt.m93294N(SequencesKt___SequencesKt.m93285E(ArraysKt.asSequence(declaredFields), ReflectJavaClass$fields$1.INSTANCE), ReflectJavaClass$fields$2.INSTANCE));
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    @NotNull
    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    public List<Name> mo89035q() {
        Class<?>[] declaredClasses = this.f64354a.getDeclaredClasses();
        declaredClasses.getClass();
        return SequencesKt___SequencesKt.m93302V(SequencesKt___SequencesKt.m93295O(SequencesKt___SequencesKt.m93285E(ArraysKt.asSequence(declaredClasses), omc0.INSTANCE), pmc0.INSTANCE));
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    @NotNull
    /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
    public List<ReflectJavaMethod> getMethods() {
        Method[] declaredMethods = this.f64354a.getDeclaredMethods();
        declaredMethods.getClass();
        return SequencesKt___SequencesKt.m93302V(SequencesKt___SequencesKt.m93294N(SequencesKt___SequencesKt.m93281A(ArraysKt.asSequence(declaredMethods), new qmc0(this)), ReflectJavaClass$methods$2.INSTANCE));
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    @Nullable
    /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
    public ReflectJavaClass mo89033h() {
        Class<?> declaringClass = this.f64354a.getDeclaringClass();
        if (declaringClass != null) {
            return new ReflectJavaClass(declaringClass);
        }
        return null;
    }

    /* JADX INFO: renamed from: U */
    public final boolean m89030U(Method method) {
        String name = method.getName();
        if (Intrinsics.m87488d(name, "values")) {
            Class<?>[] parameterTypes = method.getParameterTypes();
            parameterTypes.getClass();
            return parameterTypes.length == 0;
        }
        if (Intrinsics.m87488d(name, "valueOf")) {
            return Arrays.equals(method.getParameterTypes(), new Class[]{String.class});
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaAnnotationOwner, kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    @Nullable
    /* JADX INFO: renamed from: b */
    public ReflectJavaAnnotation mo89007b(FqName fqName) {
        Annotation[] declaredAnnotations;
        fqName.getClass();
        AnnotatedElement element = getElement();
        if (element == null || (declaredAnnotations = element.getDeclaredAnnotations()) == null) {
            return null;
        }
        return ReflectJavaAnnotationOwnerKt.m89008a(declaredAnnotations, fqName);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    @NotNull
    /* JADX INFO: renamed from: c */
    public Collection<JavaClassifierType> mo89031c() {
        if (Intrinsics.m87488d(this.f64354a, Object.class)) {
            return CollectionsKt.emptyList();
        }
        SpreadBuilder spreadBuilder = new SpreadBuilder(2);
        Type genericSuperclass = this.f64354a.getGenericSuperclass();
        spreadBuilder.m87530a(genericSuperclass != null ? genericSuperclass : Object.class);
        spreadBuilder.m87531b(this.f64354a.getGenericInterfaces());
        List listListOf = CollectionsKt.listOf(spreadBuilder.m87533d(new Type[spreadBuilder.m87532c()]));
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listListOf, 10));
        Iterator it = listListOf.iterator();
        while (it.hasNext()) {
            arrayList.add(new ReflectJavaClassifierType((Type) it.next()));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    @NotNull
    /* JADX INFO: renamed from: d */
    public FqName mo89032d() {
        return ReflectClassUtilKt.m88991e(this.f64354a).m91034a();
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof ReflectJavaClass) && Intrinsics.m87488d(this.f64354a, ((ReflectJavaClass) obj).f64354a);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaAnnotationOwner, kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    @NotNull
    public List<ReflectJavaAnnotation> getAnnotations() {
        Annotation[] declaredAnnotations;
        List<ReflectJavaAnnotation> listM89009b;
        AnnotatedElement element = getElement();
        return (element == null || (declaredAnnotations = element.getDeclaredAnnotations()) == null || (listM89009b = ReflectJavaAnnotationOwnerKt.m89009b(declaredAnnotations)) == null) ? CollectionsKt.emptyList() : listM89009b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaModifierListOwner
    public int getModifiers() {
        return this.f64354a.getModifiers();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaNamedElement
    @NotNull
    public Name getName() {
        boolean zIsAnonymousClass = this.f64354a.isAnonymousClass();
        Class<?> cls = this.f64354a;
        if (zIsAnonymousClass) {
            Name nameM91079i = Name.m91079i(StringsKt.m93417R0(cls.getName(), ".", null, 2, null));
            nameM91079i.getClass();
            return nameM91079i;
        }
        Name nameM91079i2 = Name.m91079i(cls.getSimpleName());
        nameM91079i2.getClass();
        return nameM91079i2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameterListOwner
    @NotNull
    public List<ReflectJavaTypeParameter> getTypeParameters() {
        TypeVariable<Class<?>>[] typeParameters = this.f64354a.getTypeParameters();
        typeParameters.getClass();
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable<Class<?>> typeVariable : typeParameters) {
            arrayList.add(new ReflectJavaTypeParameter(typeVariable));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaModifierListOwner
    @NotNull
    public Visibility getVisibility() {
        int modifiers = getModifiers();
        if (Modifier.isPublic(modifiers)) {
            return Visibilities.Public.INSTANCE;
        }
        if (Modifier.isPrivate(modifiers)) {
            return Visibilities.Private.INSTANCE;
        }
        if (Modifier.isProtected(modifiers)) {
            return Modifier.isStatic(modifiers) ? JavaVisibilities.ProtectedStaticVisibility.INSTANCE : JavaVisibilities.ProtectedAndPackage.INSTANCE;
        }
        return JavaVisibilities.PackageVisibility.INSTANCE;
    }

    public int hashCode() {
        return this.f64354a.hashCode();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaModifierListOwner
    public boolean isAbstract() {
        return Modifier.isAbstract(getModifiers());
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    public boolean isEnum() {
        return this.f64354a.isEnum();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaModifierListOwner
    public boolean isFinal() {
        return Modifier.isFinal(getModifiers());
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    public boolean isInterface() {
        return this.f64354a.isInterface();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    /* JADX INFO: renamed from: l */
    public boolean mo89034l() {
        return this.f64354a.isAnnotation();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    /* JADX INFO: renamed from: r */
    public boolean mo89014r() {
        return false;
    }

    @NotNull
    public String toString() {
        return ReflectJavaClass.class.getName() + ": " + this.f64354a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    @Nullable
    /* JADX INFO: renamed from: v */
    public LightClassOriginKind mo89036v() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    @NotNull
    /* JADX INFO: renamed from: y */
    public Collection<JavaRecordComponent> mo89037y() {
        Object[] objArrM88976d = Java16SealedRecordLoader.INSTANCE.m88976d(this.f64354a);
        if (objArrM88976d == null) {
            objArrM88976d = new Object[0];
        }
        ArrayList arrayList = new ArrayList(objArrM88976d.length);
        for (Object obj : objArrM88976d) {
            arrayList.add(new ReflectJavaRecordComponent(obj));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    /* JADX INFO: renamed from: z */
    public boolean mo89038z() throws IllegalAccessException, InvocationTargetException {
        Boolean boolM88977e = Java16SealedRecordLoader.INSTANCE.m88977e(this.f64354a);
        if (boolM88977e != null) {
            return boolM88977e.booleanValue();
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    /* JADX INFO: renamed from: b */
    public /* bridge */ /* synthetic */ JavaAnnotation mo89007b(FqName fqName) {
        return mo89007b(fqName);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public /* bridge */ /* synthetic */ Collection getAnnotations() {
        return getAnnotations();
    }
}
