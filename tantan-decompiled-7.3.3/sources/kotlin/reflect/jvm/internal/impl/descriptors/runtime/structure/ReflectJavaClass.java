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
import p153l.tuc0;
import p153l.uuc0;
import p153l.vuc0;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class ReflectJavaClass extends ReflectJavaElement implements ReflectJavaAnnotationOwner, ReflectJavaModifierListOwner, JavaClass {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final Class<?> f65028a;

    public ReflectJavaClass(@NotNull Class<?> cls) {
        cls.getClass();
        this.f65028a = cls;
    }

    /* JADX INFO: renamed from: I */
    public static final boolean m89906I(Class cls) {
        return cls.getSimpleName().length() == 0;
    }

    /* JADX INFO: renamed from: J */
    public static final Name m89907J(Class cls) {
        String simpleName = cls.getSimpleName();
        if (!Name.m91971m(simpleName)) {
            simpleName = null;
        }
        if (simpleName != null) {
            return Name.m91970i(simpleName);
        }
        return null;
    }

    /* JADX INFO: renamed from: K */
    public static final boolean m89908K(ReflectJavaClass reflectJavaClass, Method method) {
        if (method.isSynthetic()) {
            return false;
        }
        return (reflectJavaClass.isEnum() && reflectJavaClass.m89921U(method)) ? false : true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    /* JADX INFO: renamed from: A */
    public boolean mo89912A() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    /* JADX INFO: renamed from: D */
    public boolean mo89913D() throws IllegalAccessException, InvocationTargetException {
        Boolean boolM89869f = Java16SealedRecordLoader.INSTANCE.m89869f(this.f65028a);
        if (boolM89869f != null) {
            return boolM89869f.booleanValue();
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaModifierListOwner
    /* JADX INFO: renamed from: H */
    public boolean mo89914H() {
        return Modifier.isStatic(getModifiers());
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    @NotNull
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public List<ReflectJavaConstructor> getConstructors() {
        Constructor<?>[] declaredConstructors = this.f65028a.getDeclaredConstructors();
        declaredConstructors.getClass();
        return SequencesKt___SequencesKt.m94193V(SequencesKt___SequencesKt.m94185N(SequencesKt___SequencesKt.m94176E(ArraysKt.asSequence(declaredConstructors), ReflectJavaClass$constructors$1.INSTANCE), ReflectJavaClass$constructors$2.INSTANCE));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaAnnotationOwner
    @NotNull
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public Class<?> getElement() {
        return this.f65028a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    @NotNull
    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public List<ReflectJavaField> getFields() {
        Field[] declaredFields = this.f65028a.getDeclaredFields();
        declaredFields.getClass();
        return SequencesKt___SequencesKt.m94193V(SequencesKt___SequencesKt.m94185N(SequencesKt___SequencesKt.m94176E(ArraysKt.asSequence(declaredFields), ReflectJavaClass$fields$1.INSTANCE), ReflectJavaClass$fields$2.INSTANCE));
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    @NotNull
    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    public List<Name> mo89926q() {
        Class<?>[] declaredClasses = this.f65028a.getDeclaredClasses();
        declaredClasses.getClass();
        return SequencesKt___SequencesKt.m94193V(SequencesKt___SequencesKt.m94186O(SequencesKt___SequencesKt.m94176E(ArraysKt.asSequence(declaredClasses), tuc0.INSTANCE), uuc0.INSTANCE));
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    @NotNull
    /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
    public List<ReflectJavaMethod> getMethods() {
        Method[] declaredMethods = this.f65028a.getDeclaredMethods();
        declaredMethods.getClass();
        return SequencesKt___SequencesKt.m94193V(SequencesKt___SequencesKt.m94185N(SequencesKt___SequencesKt.m94172A(ArraysKt.asSequence(declaredMethods), new vuc0(this)), ReflectJavaClass$methods$2.INSTANCE));
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    @Nullable
    /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
    public ReflectJavaClass mo89924h() {
        Class<?> declaringClass = this.f65028a.getDeclaringClass();
        if (declaringClass != null) {
            return new ReflectJavaClass(declaringClass);
        }
        return null;
    }

    /* JADX INFO: renamed from: U */
    public final boolean m89921U(Method method) {
        String name = method.getName();
        if (Intrinsics.m88377d(name, "values")) {
            Class<?>[] parameterTypes = method.getParameterTypes();
            parameterTypes.getClass();
            return parameterTypes.length == 0;
        }
        if (Intrinsics.m88377d(name, "valueOf")) {
            return Arrays.equals(method.getParameterTypes(), new Class[]{String.class});
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaAnnotationOwner, kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    @Nullable
    /* JADX INFO: renamed from: b */
    public ReflectJavaAnnotation mo89898b(FqName fqName) {
        Annotation[] declaredAnnotations;
        fqName.getClass();
        AnnotatedElement element = getElement();
        if (element == null || (declaredAnnotations = element.getDeclaredAnnotations()) == null) {
            return null;
        }
        return ReflectJavaAnnotationOwnerKt.m89899a(declaredAnnotations, fqName);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    @NotNull
    /* JADX INFO: renamed from: c */
    public Collection<JavaClassifierType> mo89922c() {
        if (Intrinsics.m88377d(this.f65028a, Object.class)) {
            return CollectionsKt.emptyList();
        }
        SpreadBuilder spreadBuilder = new SpreadBuilder(2);
        Type genericSuperclass = this.f65028a.getGenericSuperclass();
        spreadBuilder.m88419a(genericSuperclass != null ? genericSuperclass : Object.class);
        spreadBuilder.m88420b(this.f65028a.getGenericInterfaces());
        List listListOf = CollectionsKt.listOf(spreadBuilder.m88422d(new Type[spreadBuilder.m88421c()]));
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
    public FqName mo89923d() {
        return ReflectClassUtilKt.m89882e(this.f65028a).m91925a();
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof ReflectJavaClass) && Intrinsics.m88377d(this.f65028a, ((ReflectJavaClass) obj).f65028a);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaAnnotationOwner, kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    @NotNull
    public List<ReflectJavaAnnotation> getAnnotations() {
        Annotation[] declaredAnnotations;
        List<ReflectJavaAnnotation> listM89900b;
        AnnotatedElement element = getElement();
        return (element == null || (declaredAnnotations = element.getDeclaredAnnotations()) == null || (listM89900b = ReflectJavaAnnotationOwnerKt.m89900b(declaredAnnotations)) == null) ? CollectionsKt.emptyList() : listM89900b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaModifierListOwner
    public int getModifiers() {
        return this.f65028a.getModifiers();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaNamedElement
    @NotNull
    public Name getName() {
        boolean zIsAnonymousClass = this.f65028a.isAnonymousClass();
        Class<?> cls = this.f65028a;
        if (zIsAnonymousClass) {
            Name nameM91970i = Name.m91970i(StringsKt.m94308R0(cls.getName(), ".", null, 2, null));
            nameM91970i.getClass();
            return nameM91970i;
        }
        Name nameM91970i2 = Name.m91970i(cls.getSimpleName());
        nameM91970i2.getClass();
        return nameM91970i2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameterListOwner
    @NotNull
    public List<ReflectJavaTypeParameter> getTypeParameters() {
        TypeVariable<Class<?>>[] typeParameters = this.f65028a.getTypeParameters();
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
        return this.f65028a.hashCode();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaModifierListOwner
    public boolean isAbstract() {
        return Modifier.isAbstract(getModifiers());
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    public boolean isEnum() {
        return this.f65028a.isEnum();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaModifierListOwner
    public boolean isFinal() {
        return Modifier.isFinal(getModifiers());
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    public boolean isInterface() {
        return this.f65028a.isInterface();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    /* JADX INFO: renamed from: l */
    public boolean mo89925l() {
        return this.f65028a.isAnnotation();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    /* JADX INFO: renamed from: r */
    public boolean mo89905r() {
        return false;
    }

    @NotNull
    public String toString() {
        return ReflectJavaClass.class.getName() + ": " + this.f65028a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    @Nullable
    /* JADX INFO: renamed from: v */
    public LightClassOriginKind mo89927v() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    @NotNull
    /* JADX INFO: renamed from: y */
    public Collection<JavaRecordComponent> mo89928y() {
        Object[] objArrM89867d = Java16SealedRecordLoader.INSTANCE.m89867d(this.f65028a);
        if (objArrM89867d == null) {
            objArrM89867d = new Object[0];
        }
        ArrayList arrayList = new ArrayList(objArrM89867d.length);
        for (Object obj : objArrM89867d) {
            arrayList.add(new ReflectJavaRecordComponent(obj));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
    /* JADX INFO: renamed from: z */
    public boolean mo89929z() throws IllegalAccessException, InvocationTargetException {
        Boolean boolM89868e = Java16SealedRecordLoader.INSTANCE.m89868e(this.f65028a);
        if (boolM89868e != null) {
            return boolM89868e.booleanValue();
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    /* JADX INFO: renamed from: b */
    public /* bridge */ /* synthetic */ JavaAnnotation mo89898b(FqName fqName) {
        return mo89898b(fqName);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public /* bridge */ /* synthetic */ Collection getAnnotations() {
        return getAnnotations();
    }
}
