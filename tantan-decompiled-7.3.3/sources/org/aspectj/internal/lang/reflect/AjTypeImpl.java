package org.aspectj.internal.lang.reflect;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
import org.aspectj.internal.lang.annotation.ajcDeclareAnnotation;
import org.aspectj.internal.lang.annotation.ajcDeclareEoW;
import org.aspectj.internal.lang.annotation.ajcDeclareParents;
import org.aspectj.internal.lang.annotation.ajcDeclarePrecedence;
import org.aspectj.internal.lang.annotation.ajcDeclareSoft;
import org.aspectj.internal.lang.annotation.ajcITD;
import org.aspectj.internal.lang.annotation.ajcPrivileged;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.DeclareError;
import org.aspectj.lang.annotation.DeclareWarning;
import org.aspectj.lang.reflect.Advice;
import org.aspectj.lang.reflect.AdviceKind;
import org.aspectj.lang.reflect.AjType;
import org.aspectj.lang.reflect.AjTypeSystem;
import org.aspectj.lang.reflect.DeclareAnnotation;
import org.aspectj.lang.reflect.DeclareErrorOrWarning;
import org.aspectj.lang.reflect.DeclareParents;
import org.aspectj.lang.reflect.DeclarePrecedence;
import org.aspectj.lang.reflect.DeclareSoft;
import org.aspectj.lang.reflect.InterTypeConstructorDeclaration;
import org.aspectj.lang.reflect.InterTypeFieldDeclaration;
import org.aspectj.lang.reflect.InterTypeMethodDeclaration;
import org.aspectj.lang.reflect.NoSuchAdviceException;
import org.aspectj.lang.reflect.NoSuchPointcutException;
import org.aspectj.lang.reflect.PerClause;
import org.aspectj.lang.reflect.PerClauseKind;
import org.aspectj.lang.reflect.Pointcut;
import p153l.qg50;
import p153l.wg3;
import p153l.wtq0;

/* JADX INFO: loaded from: classes2.dex */
public class AjTypeImpl<T> implements AjType<T> {
    private static final String ajcMagic = "ajc$";
    private Class<T> clazz;
    private Pointcut[] declaredPointcuts = null;
    private Pointcut[] pointcuts = null;
    private Advice[] declaredAdvice = null;
    private Advice[] advice = null;
    private InterTypeMethodDeclaration[] declaredITDMethods = null;
    private InterTypeMethodDeclaration[] itdMethods = null;
    private InterTypeFieldDeclaration[] declaredITDFields = null;
    private InterTypeFieldDeclaration[] itdFields = null;
    private InterTypeConstructorDeclaration[] itdCons = null;
    private InterTypeConstructorDeclaration[] declaredITDCons = null;

    public AjTypeImpl(Class<T> cls) {
        this.clazz = cls;
    }

    private void addAnnotationStyleDeclareParents(List<DeclareParents> list) {
        for (Field field : this.clazz.getDeclaredFields()) {
            if (field.isAnnotationPresent(org.aspectj.lang.annotation.DeclareParents.class) && field.getType().isInterface()) {
                list.add(new DeclareParentsImpl(((org.aspectj.lang.annotation.DeclareParents) field.getAnnotation(org.aspectj.lang.annotation.DeclareParents.class)).value(), field.getType().getName(), false, this));
            }
        }
    }

    private void addAnnotationStyleITDFields(List<InterTypeFieldDeclaration> list, boolean z) {
    }

    private void addAnnotationStyleITDMethods(List<InterTypeMethodDeclaration> list, boolean z) {
        if (isAspect()) {
            for (Field field : this.clazz.getDeclaredFields()) {
                if (field.getType().isInterface() && field.isAnnotationPresent(org.aspectj.lang.annotation.DeclareParents.class) && ((org.aspectj.lang.annotation.DeclareParents) field.getAnnotation(org.aspectj.lang.annotation.DeclareParents.class)).defaultImpl() != org.aspectj.lang.annotation.DeclareParents.class) {
                    for (Method method : field.getType().getDeclaredMethods()) {
                        if (Modifier.isPublic(method.getModifiers()) || !z) {
                            list.add(new InterTypeMethodDeclarationImpl(this, AjTypeSystem.getAjType(field.getType()), method, 1));
                        }
                    }
                }
            }
        }
    }

    private Advice asAdvice(Method method) {
        if (method.getAnnotations().length == 0) {
            return null;
        }
        Before before = (Before) method.getAnnotation(Before.class);
        if (before != null) {
            return new AdviceImpl(method, before.value(), AdviceKind.BEFORE);
        }
        After after = (After) method.getAnnotation(After.class);
        if (after != null) {
            return new AdviceImpl(method, after.value(), AdviceKind.AFTER);
        }
        AfterReturning afterReturning = (AfterReturning) method.getAnnotation(AfterReturning.class);
        if (afterReturning != null) {
            String strPointcut = afterReturning.pointcut();
            if (strPointcut.equals("")) {
                strPointcut = afterReturning.value();
            }
            return new AdviceImpl(method, strPointcut, AdviceKind.AFTER_RETURNING, afterReturning.returning());
        }
        AfterThrowing afterThrowing = (AfterThrowing) method.getAnnotation(AfterThrowing.class);
        if (afterThrowing != null) {
            String strPointcut2 = afterThrowing.pointcut();
            if (strPointcut2 == null) {
                strPointcut2 = afterThrowing.value();
            }
            return new AdviceImpl(method, strPointcut2, AdviceKind.AFTER_THROWING, afterThrowing.throwing());
        }
        Around around = (Around) method.getAnnotation(Around.class);
        if (around != null) {
            return new AdviceImpl(method, around.value(), AdviceKind.AROUND);
        }
        return null;
    }

    private Pointcut asPointcut(Method method) {
        int iIndexOf;
        org.aspectj.lang.annotation.Pointcut pointcut = (org.aspectj.lang.annotation.Pointcut) method.getAnnotation(org.aspectj.lang.annotation.Pointcut.class);
        if (pointcut == null) {
            return null;
        }
        String name = method.getName();
        if (name.startsWith(ajcMagic) && (iIndexOf = (name = name.substring(name.indexOf("$$") + 2, name.length())).indexOf("$")) != -1) {
            name = name.substring(0, iIndexOf);
        }
        return new PointcutImpl(name, pointcut.value(), method, AjTypeSystem.getAjType(method.getDeclaringClass()), pointcut.argNames());
    }

    private void initAdvice() {
        Method[] methods = this.clazz.getMethods();
        ArrayList arrayList = new ArrayList();
        for (Method method : methods) {
            Advice adviceAsAdvice = asAdvice(method);
            if (adviceAsAdvice != null) {
                arrayList.add(adviceAsAdvice);
            }
        }
        Advice[] adviceArr = new Advice[arrayList.size()];
        this.advice = adviceArr;
        arrayList.toArray(adviceArr);
    }

    private void initDeclaredAdvice() {
        Method[] declaredMethods = this.clazz.getDeclaredMethods();
        ArrayList arrayList = new ArrayList();
        for (Method method : declaredMethods) {
            Advice adviceAsAdvice = asAdvice(method);
            if (adviceAsAdvice != null) {
                arrayList.add(adviceAsAdvice);
            }
        }
        Advice[] adviceArr = new Advice[arrayList.size()];
        this.declaredAdvice = adviceArr;
        arrayList.toArray(adviceArr);
    }

    private boolean isReallyAMethod(Method method) {
        if (method.getName().startsWith(ajcMagic)) {
            return false;
        }
        if (method.getAnnotations().length == 0) {
            return true;
        }
        return (method.isAnnotationPresent(org.aspectj.lang.annotation.Pointcut.class) || method.isAnnotationPresent(Before.class) || method.isAnnotationPresent(After.class) || method.isAnnotationPresent(AfterReturning.class) || method.isAnnotationPresent(AfterThrowing.class) || method.isAnnotationPresent(Around.class)) ? false : true;
    }

    private AjType<?>[] toAjTypeArray(Class<?>[] clsArr) {
        int length = clsArr.length;
        AjType<?>[] ajTypeArr = new AjType[length];
        for (int i = 0; i < length; i++) {
            ajTypeArr[i] = AjTypeSystem.getAjType(clsArr[i]);
        }
        return ajTypeArr;
    }

    private Class<?>[] toClassArray(AjType<?>[] ajTypeArr) {
        int length = ajTypeArr.length;
        Class<?>[] clsArr = new Class[length];
        for (int i = 0; i < length; i++) {
            clsArr[i] = ajTypeArr[i].getJavaClass();
        }
        return clsArr;
    }

    public boolean equals(Object obj) {
        if (obj instanceof AjTypeImpl) {
            return ((AjTypeImpl) obj).clazz.equals(this.clazz);
        }
        return false;
    }

    @Override // org.aspectj.lang.reflect.AjType
    public Advice getAdvice(String str) throws NoSuchAdviceException {
        if (str.equals("")) {
            wg3.m206174a("use getAdvice(AdviceType...) instead for un-named advice");
            return null;
        }
        if (this.advice == null) {
            initAdvice();
        }
        for (Advice advice : this.advice) {
            if (advice.getName().equals(str)) {
                return advice;
            }
        }
        throw new NoSuchAdviceException(str);
    }

    @Override // org.aspectj.lang.reflect.AjType
    public AjType<?>[] getAjTypes() {
        return toAjTypeArray(this.clazz.getClasses());
    }

    @Override // java.lang.reflect.AnnotatedElement
    public <A extends Annotation> A getAnnotation(Class<A> cls) {
        return (A) this.clazz.getAnnotation(cls);
    }

    @Override // java.lang.reflect.AnnotatedElement
    public Annotation[] getAnnotations() {
        return this.clazz.getAnnotations();
    }

    @Override // org.aspectj.lang.reflect.AjType
    public Constructor getConstructor(AjType<?>... ajTypeArr) throws NoSuchMethodException {
        return this.clazz.getConstructor(toClassArray(ajTypeArr));
    }

    @Override // org.aspectj.lang.reflect.AjType
    public Constructor[] getConstructors() {
        return this.clazz.getConstructors();
    }

    @Override // org.aspectj.lang.reflect.AjType
    public DeclareAnnotation[] getDeclareAnnotations() {
        Annotation annotation;
        ArrayList arrayList = new ArrayList();
        for (Method method : this.clazz.getDeclaredMethods()) {
            if (method.isAnnotationPresent(ajcDeclareAnnotation.class)) {
                ajcDeclareAnnotation ajcdeclareannotation = (ajcDeclareAnnotation) method.getAnnotation(ajcDeclareAnnotation.class);
                Annotation[] annotations = method.getAnnotations();
                int length = annotations.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        annotation = null;
                        break;
                    }
                    annotation = annotations[i];
                    if (annotation.annotationType() != ajcDeclareAnnotation.class) {
                        break;
                    }
                    i++;
                }
                arrayList.add(new DeclareAnnotationImpl(this, ajcdeclareannotation.kind(), ajcdeclareannotation.pattern(), annotation, ajcdeclareannotation.annotation()));
            }
        }
        if (getSupertype().isAspect()) {
            arrayList.addAll(Arrays.asList(getSupertype().getDeclareAnnotations()));
        }
        DeclareAnnotation[] declareAnnotationArr = new DeclareAnnotation[arrayList.size()];
        arrayList.toArray(declareAnnotationArr);
        return declareAnnotationArr;
    }

    @Override // org.aspectj.lang.reflect.AjType
    public DeclareErrorOrWarning[] getDeclareErrorOrWarnings() {
        ArrayList arrayList = new ArrayList();
        for (Field field : this.clazz.getDeclaredFields()) {
            try {
                if (field.isAnnotationPresent(DeclareWarning.class)) {
                    DeclareWarning declareWarning = (DeclareWarning) field.getAnnotation(DeclareWarning.class);
                    if (Modifier.isPublic(field.getModifiers()) && Modifier.isStatic(field.getModifiers())) {
                        arrayList.add(new DeclareErrorOrWarningImpl(declareWarning.value(), (String) field.get(null), false, this));
                    }
                } else if (field.isAnnotationPresent(DeclareError.class)) {
                    DeclareError declareError = (DeclareError) field.getAnnotation(DeclareError.class);
                    if (Modifier.isPublic(field.getModifiers()) && Modifier.isStatic(field.getModifiers())) {
                        arrayList.add(new DeclareErrorOrWarningImpl(declareError.value(), (String) field.get(null), true, this));
                    }
                }
            } catch (IllegalAccessException | IllegalArgumentException unused) {
            }
        }
        for (Method method : this.clazz.getDeclaredMethods()) {
            if (method.isAnnotationPresent(ajcDeclareEoW.class)) {
                ajcDeclareEoW ajcdeclareeow = (ajcDeclareEoW) method.getAnnotation(ajcDeclareEoW.class);
                arrayList.add(new DeclareErrorOrWarningImpl(ajcdeclareeow.pointcut(), ajcdeclareeow.message(), ajcdeclareeow.isError(), this));
            }
        }
        DeclareErrorOrWarning[] declareErrorOrWarningArr = new DeclareErrorOrWarning[arrayList.size()];
        arrayList.toArray(declareErrorOrWarningArr);
        return declareErrorOrWarningArr;
    }

    @Override // org.aspectj.lang.reflect.AjType
    public DeclareParents[] getDeclareParents() {
        List<DeclareParents> arrayList = new ArrayList<>();
        for (Method method : this.clazz.getDeclaredMethods()) {
            if (method.isAnnotationPresent(ajcDeclareParents.class)) {
                ajcDeclareParents ajcdeclareparents = (ajcDeclareParents) method.getAnnotation(ajcDeclareParents.class);
                arrayList.add(new DeclareParentsImpl(ajcdeclareparents.targetTypePattern(), ajcdeclareparents.parentTypes(), ajcdeclareparents.isExtends(), this));
            }
        }
        addAnnotationStyleDeclareParents(arrayList);
        if (getSupertype().isAspect()) {
            arrayList.addAll(Arrays.asList(getSupertype().getDeclareParents()));
        }
        DeclareParents[] declareParentsArr = new DeclareParents[arrayList.size()];
        arrayList.toArray(declareParentsArr);
        return declareParentsArr;
    }

    @Override // org.aspectj.lang.reflect.AjType
    public DeclarePrecedence[] getDeclarePrecedence() {
        ArrayList arrayList = new ArrayList();
        if (this.clazz.isAnnotationPresent(org.aspectj.lang.annotation.DeclarePrecedence.class)) {
            arrayList.add(new DeclarePrecedenceImpl(((org.aspectj.lang.annotation.DeclarePrecedence) this.clazz.getAnnotation(org.aspectj.lang.annotation.DeclarePrecedence.class)).value(), this));
        }
        for (Method method : this.clazz.getDeclaredMethods()) {
            if (method.isAnnotationPresent(ajcDeclarePrecedence.class)) {
                arrayList.add(new DeclarePrecedenceImpl(((ajcDeclarePrecedence) method.getAnnotation(ajcDeclarePrecedence.class)).value(), this));
            }
        }
        if (getSupertype().isAspect()) {
            arrayList.addAll(Arrays.asList(getSupertype().getDeclarePrecedence()));
        }
        DeclarePrecedence[] declarePrecedenceArr = new DeclarePrecedence[arrayList.size()];
        arrayList.toArray(declarePrecedenceArr);
        return declarePrecedenceArr;
    }

    @Override // org.aspectj.lang.reflect.AjType
    public DeclareSoft[] getDeclareSofts() {
        ArrayList arrayList = new ArrayList();
        for (Method method : this.clazz.getDeclaredMethods()) {
            if (method.isAnnotationPresent(ajcDeclareSoft.class)) {
                ajcDeclareSoft ajcdeclaresoft = (ajcDeclareSoft) method.getAnnotation(ajcDeclareSoft.class);
                arrayList.add(new DeclareSoftImpl(this, ajcdeclaresoft.pointcut(), ajcdeclaresoft.exceptionType()));
            }
        }
        if (getSupertype().isAspect()) {
            arrayList.addAll(Arrays.asList(getSupertype().getDeclareSofts()));
        }
        DeclareSoft[] declareSoftArr = new DeclareSoft[arrayList.size()];
        arrayList.toArray(declareSoftArr);
        return declareSoftArr;
    }

    @Override // org.aspectj.lang.reflect.AjType
    public Advice getDeclaredAdvice(String str) throws NoSuchAdviceException {
        if (str.equals("")) {
            wg3.m206174a("use getAdvice(AdviceType...) instead for un-named advice");
            return null;
        }
        if (this.declaredAdvice == null) {
            initDeclaredAdvice();
        }
        for (Advice advice : this.declaredAdvice) {
            if (advice.getName().equals(str)) {
                return advice;
            }
        }
        throw new NoSuchAdviceException(str);
    }

    @Override // org.aspectj.lang.reflect.AjType
    public AjType<?>[] getDeclaredAjTypes() {
        return toAjTypeArray(this.clazz.getDeclaredClasses());
    }

    @Override // java.lang.reflect.AnnotatedElement
    public Annotation[] getDeclaredAnnotations() {
        return this.clazz.getDeclaredAnnotations();
    }

    @Override // org.aspectj.lang.reflect.AjType
    public Constructor getDeclaredConstructor(AjType<?>... ajTypeArr) throws NoSuchMethodException {
        return this.clazz.getDeclaredConstructor(toClassArray(ajTypeArr));
    }

    @Override // org.aspectj.lang.reflect.AjType
    public Constructor[] getDeclaredConstructors() {
        return this.clazz.getDeclaredConstructors();
    }

    @Override // org.aspectj.lang.reflect.AjType
    public Field getDeclaredField(String str) throws NoSuchFieldException {
        Field declaredField = this.clazz.getDeclaredField(str);
        if (declaredField.getName().startsWith(ajcMagic)) {
            throw new NoSuchFieldException(str);
        }
        return declaredField;
    }

    @Override // org.aspectj.lang.reflect.AjType
    public Field[] getDeclaredFields() {
        Field[] declaredFields = this.clazz.getDeclaredFields();
        ArrayList arrayList = new ArrayList();
        for (Field field : declaredFields) {
            if (!field.getName().startsWith(ajcMagic) && !field.isAnnotationPresent(DeclareWarning.class) && !field.isAnnotationPresent(DeclareError.class)) {
                arrayList.add(field);
            }
        }
        Field[] fieldArr = new Field[arrayList.size()];
        arrayList.toArray(fieldArr);
        return fieldArr;
    }

    @Override // org.aspectj.lang.reflect.AjType
    public InterTypeConstructorDeclaration getDeclaredITDConstructor(AjType<?> ajType, AjType<?>... ajTypeArr) throws NoSuchMethodException {
        for (InterTypeConstructorDeclaration interTypeConstructorDeclaration : getDeclaredITDConstructors()) {
            try {
                if (interTypeConstructorDeclaration.getTargetType().equals(ajType)) {
                    AjType<?>[] parameterTypes = interTypeConstructorDeclaration.getParameterTypes();
                    if (parameterTypes.length == ajTypeArr.length) {
                        for (int i = 0; i < parameterTypes.length; i++) {
                            if (parameterTypes[i].equals(ajTypeArr[i])) {
                            }
                        }
                        return interTypeConstructorDeclaration;
                    }
                    continue;
                } else {
                    continue;
                }
            } catch (ClassNotFoundException unused) {
            }
        }
        throw new NoSuchMethodException();
    }

    @Override // org.aspectj.lang.reflect.AjType
    public InterTypeConstructorDeclaration[] getDeclaredITDConstructors() {
        if (this.declaredITDCons == null) {
            ArrayList arrayList = new ArrayList();
            for (Method method : this.clazz.getDeclaredMethods()) {
                if (method.getName().contains("ajc$postInterConstructor") && method.isAnnotationPresent(ajcITD.class)) {
                    ajcITD ajcitd = (ajcITD) method.getAnnotation(ajcITD.class);
                    arrayList.add(new InterTypeConstructorDeclarationImpl(this, ajcitd.targetType(), ajcitd.modifiers(), method));
                }
            }
            InterTypeConstructorDeclaration[] interTypeConstructorDeclarationArr = new InterTypeConstructorDeclaration[arrayList.size()];
            this.declaredITDCons = interTypeConstructorDeclarationArr;
            arrayList.toArray(interTypeConstructorDeclarationArr);
        }
        return this.declaredITDCons;
    }

    @Override // org.aspectj.lang.reflect.AjType
    public InterTypeFieldDeclaration getDeclaredITDField(String str, AjType<?> ajType) throws NoSuchFieldException {
        for (InterTypeFieldDeclaration interTypeFieldDeclaration : getDeclaredITDFields()) {
            if (interTypeFieldDeclaration.getName().equals(str)) {
                try {
                    if (interTypeFieldDeclaration.getTargetType().equals(ajType)) {
                        return interTypeFieldDeclaration;
                    }
                } catch (ClassNotFoundException unused) {
                    continue;
                }
            }
        }
        throw new NoSuchFieldException(str);
    }

    @Override // org.aspectj.lang.reflect.AjType
    public InterTypeFieldDeclaration[] getDeclaredITDFields() {
        AjTypeImpl<T> ajTypeImpl;
        AjTypeImpl<T> ajTypeImpl2;
        List<InterTypeFieldDeclaration> arrayList = new ArrayList<>();
        if (this.declaredITDFields == null) {
            Method[] declaredMethods = this.clazz.getDeclaredMethods();
            int length = declaredMethods.length;
            int i = 0;
            while (i < length) {
                Method method = declaredMethods[i];
                if (method.isAnnotationPresent(ajcITD.class) && method.getName().contains("ajc$interFieldInit")) {
                    ajcITD ajcitd = (ajcITD) method.getAnnotation(ajcITD.class);
                    try {
                        Method declaredMethod = this.clazz.getDeclaredMethod(method.getName().replace("FieldInit", "FieldGetDispatch"), method.getParameterTypes());
                        ajTypeImpl2 = this;
                        arrayList.add(new InterTypeFieldDeclarationImpl(ajTypeImpl2, ajcitd.targetType(), ajcitd.modifiers(), ajcitd.name(), AjTypeSystem.getAjType(declaredMethod.getReturnType()), declaredMethod.getGenericReturnType()));
                    } catch (NoSuchMethodException unused) {
                        qg50.m176437a("Can't find field get dispatch method for ", method.getName());
                        return null;
                    }
                } else {
                    ajTypeImpl2 = this;
                }
                i++;
                this = ajTypeImpl2;
            }
            ajTypeImpl = this;
            ajTypeImpl.addAnnotationStyleITDFields(arrayList, false);
            InterTypeFieldDeclaration[] interTypeFieldDeclarationArr = new InterTypeFieldDeclaration[arrayList.size()];
            ajTypeImpl.declaredITDFields = interTypeFieldDeclarationArr;
            arrayList.toArray(interTypeFieldDeclarationArr);
        } else {
            ajTypeImpl = this;
        }
        return ajTypeImpl.declaredITDFields;
    }

    @Override // org.aspectj.lang.reflect.AjType
    public InterTypeMethodDeclaration getDeclaredITDMethod(String str, AjType<?> ajType, AjType<?>... ajTypeArr) throws NoSuchMethodException {
        for (InterTypeMethodDeclaration interTypeMethodDeclaration : getDeclaredITDMethods()) {
            try {
                if (interTypeMethodDeclaration.getName().equals(str) && interTypeMethodDeclaration.getTargetType().equals(ajType)) {
                    AjType<?>[] parameterTypes = interTypeMethodDeclaration.getParameterTypes();
                    if (parameterTypes.length == ajTypeArr.length) {
                        for (int i = 0; i < parameterTypes.length; i++) {
                            if (parameterTypes[i].equals(ajTypeArr[i])) {
                            }
                        }
                        return interTypeMethodDeclaration;
                    }
                    continue;
                }
            } catch (ClassNotFoundException unused) {
            }
        }
        throw new NoSuchMethodException(str);
    }

    @Override // org.aspectj.lang.reflect.AjType
    public InterTypeMethodDeclaration[] getDeclaredITDMethods() {
        AjTypeImpl<T> ajTypeImpl;
        AjTypeImpl<T> ajTypeImpl2;
        if (this.declaredITDMethods == null) {
            List<InterTypeMethodDeclaration> arrayList = new ArrayList<>();
            Method[] declaredMethods = this.clazz.getDeclaredMethods();
            int length = declaredMethods.length;
            int i = 0;
            while (i < length) {
                Method method = declaredMethods[i];
                if (method.getName().contains("ajc$interMethodDispatch1$") && method.isAnnotationPresent(ajcITD.class)) {
                    ajcITD ajcitd = (ajcITD) method.getAnnotation(ajcITD.class);
                    ajTypeImpl2 = this;
                    arrayList.add(new InterTypeMethodDeclarationImpl(ajTypeImpl2, ajcitd.targetType(), ajcitd.modifiers(), ajcitd.name(), method));
                } else {
                    ajTypeImpl2 = this;
                }
                i++;
                this = ajTypeImpl2;
            }
            ajTypeImpl = this;
            ajTypeImpl.addAnnotationStyleITDMethods(arrayList, false);
            InterTypeMethodDeclaration[] interTypeMethodDeclarationArr = new InterTypeMethodDeclaration[arrayList.size()];
            ajTypeImpl.declaredITDMethods = interTypeMethodDeclarationArr;
            arrayList.toArray(interTypeMethodDeclarationArr);
        } else {
            ajTypeImpl = this;
        }
        return ajTypeImpl.declaredITDMethods;
    }

    @Override // org.aspectj.lang.reflect.AjType
    public Method getDeclaredMethod(String str, AjType<?>... ajTypeArr) throws NoSuchMethodException {
        Method declaredMethod = this.clazz.getDeclaredMethod(str, toClassArray(ajTypeArr));
        if (isReallyAMethod(declaredMethod)) {
            return declaredMethod;
        }
        throw new NoSuchMethodException(str);
    }

    @Override // org.aspectj.lang.reflect.AjType
    public Method[] getDeclaredMethods() {
        Method[] declaredMethods = this.clazz.getDeclaredMethods();
        ArrayList arrayList = new ArrayList();
        for (Method method : declaredMethods) {
            if (isReallyAMethod(method)) {
                arrayList.add(method);
            }
        }
        Method[] methodArr = new Method[arrayList.size()];
        arrayList.toArray(methodArr);
        return methodArr;
    }

    @Override // org.aspectj.lang.reflect.AjType
    public Pointcut getDeclaredPointcut(String str) throws NoSuchPointcutException {
        for (Pointcut pointcut : getDeclaredPointcuts()) {
            if (pointcut.getName().equals(str)) {
                return pointcut;
            }
        }
        throw new NoSuchPointcutException(str);
    }

    @Override // org.aspectj.lang.reflect.AjType
    public Pointcut[] getDeclaredPointcuts() {
        Pointcut[] pointcutArr = this.declaredPointcuts;
        if (pointcutArr != null) {
            return pointcutArr;
        }
        ArrayList arrayList = new ArrayList();
        for (Method method : this.clazz.getDeclaredMethods()) {
            Pointcut pointcutAsPointcut = asPointcut(method);
            if (pointcutAsPointcut != null) {
                arrayList.add(pointcutAsPointcut);
            }
        }
        Pointcut[] pointcutArr2 = new Pointcut[arrayList.size()];
        arrayList.toArray(pointcutArr2);
        this.declaredPointcuts = pointcutArr2;
        return pointcutArr2;
    }

    @Override // org.aspectj.lang.reflect.AjType
    public AjType<?> getDeclaringType() {
        Class<?> declaringClass = this.clazz.getDeclaringClass();
        if (declaringClass != null) {
            return new AjTypeImpl(declaringClass);
        }
        return null;
    }

    @Override // org.aspectj.lang.reflect.AjType
    public Constructor getEnclosingConstructor() {
        return this.clazz.getEnclosingConstructor();
    }

    @Override // org.aspectj.lang.reflect.AjType
    public Method getEnclosingMethod() {
        return this.clazz.getEnclosingMethod();
    }

    @Override // org.aspectj.lang.reflect.AjType
    public AjType<?> getEnclosingType() {
        Class<?> enclosingClass = this.clazz.getEnclosingClass();
        if (enclosingClass != null) {
            return new AjTypeImpl(enclosingClass);
        }
        return null;
    }

    @Override // org.aspectj.lang.reflect.AjType
    public T[] getEnumConstants() {
        return this.clazz.getEnumConstants();
    }

    @Override // org.aspectj.lang.reflect.AjType
    public Field getField(String str) throws NoSuchFieldException {
        Field field = this.clazz.getField(str);
        if (field.getName().startsWith(ajcMagic)) {
            throw new NoSuchFieldException(str);
        }
        return field;
    }

    @Override // org.aspectj.lang.reflect.AjType
    public Field[] getFields() {
        Field[] fields = this.clazz.getFields();
        ArrayList arrayList = new ArrayList();
        for (Field field : fields) {
            if (!field.getName().startsWith(ajcMagic) && !field.isAnnotationPresent(DeclareWarning.class) && !field.isAnnotationPresent(DeclareError.class)) {
                arrayList.add(field);
            }
        }
        Field[] fieldArr = new Field[arrayList.size()];
        arrayList.toArray(fieldArr);
        return fieldArr;
    }

    @Override // org.aspectj.lang.reflect.AjType
    public Type getGenericSupertype() {
        return this.clazz.getGenericSuperclass();
    }

    @Override // org.aspectj.lang.reflect.AjType
    public InterTypeConstructorDeclaration getITDConstructor(AjType<?> ajType, AjType<?>... ajTypeArr) throws NoSuchMethodException {
        for (InterTypeConstructorDeclaration interTypeConstructorDeclaration : getITDConstructors()) {
            try {
                if (interTypeConstructorDeclaration.getTargetType().equals(ajType)) {
                    AjType<?>[] parameterTypes = interTypeConstructorDeclaration.getParameterTypes();
                    if (parameterTypes.length == ajTypeArr.length) {
                        for (int i = 0; i < parameterTypes.length; i++) {
                            if (parameterTypes[i].equals(ajTypeArr[i])) {
                            }
                        }
                        return interTypeConstructorDeclaration;
                    }
                    continue;
                } else {
                    continue;
                }
            } catch (ClassNotFoundException unused) {
            }
        }
        throw new NoSuchMethodException();
    }

    @Override // org.aspectj.lang.reflect.AjType
    public InterTypeConstructorDeclaration[] getITDConstructors() {
        if (this.itdCons == null) {
            ArrayList arrayList = new ArrayList();
            for (Method method : this.clazz.getMethods()) {
                if (method.getName().contains("ajc$postInterConstructor") && method.isAnnotationPresent(ajcITD.class)) {
                    ajcITD ajcitd = (ajcITD) method.getAnnotation(ajcITD.class);
                    if (Modifier.isPublic(ajcitd.modifiers())) {
                        arrayList.add(new InterTypeConstructorDeclarationImpl(this, ajcitd.targetType(), ajcitd.modifiers(), method));
                    }
                }
            }
            InterTypeConstructorDeclaration[] interTypeConstructorDeclarationArr = new InterTypeConstructorDeclaration[arrayList.size()];
            this.itdCons = interTypeConstructorDeclarationArr;
            arrayList.toArray(interTypeConstructorDeclarationArr);
        }
        return this.itdCons;
    }

    @Override // org.aspectj.lang.reflect.AjType
    public InterTypeFieldDeclaration getITDField(String str, AjType<?> ajType) throws NoSuchFieldException {
        for (InterTypeFieldDeclaration interTypeFieldDeclaration : getITDFields()) {
            if (interTypeFieldDeclaration.getName().equals(str)) {
                try {
                    if (interTypeFieldDeclaration.getTargetType().equals(ajType)) {
                        return interTypeFieldDeclaration;
                    }
                } catch (ClassNotFoundException unused) {
                    continue;
                }
            }
        }
        throw new NoSuchFieldException(str);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002f  */
    @Override // org.aspectj.lang.reflect.AjType
    public InterTypeFieldDeclaration[] getITDFields() {
        AjTypeImpl<T> ajTypeImpl;
        AjTypeImpl<T> ajTypeImpl2;
        List<InterTypeFieldDeclaration> arrayList = new ArrayList<>();
        if (this.itdFields == null) {
            Method[] methods = this.clazz.getMethods();
            int length = methods.length;
            int i = 0;
            while (i < length) {
                Method method = methods[i];
                if (method.isAnnotationPresent(ajcITD.class)) {
                    ajcITD ajcitd = (ajcITD) method.getAnnotation(ajcITD.class);
                    if (method.getName().contains("ajc$interFieldInit") && Modifier.isPublic(ajcitd.modifiers())) {
                        try {
                            Method declaredMethod = method.getDeclaringClass().getDeclaredMethod(method.getName().replace("FieldInit", "FieldGetDispatch"), method.getParameterTypes());
                            ajTypeImpl2 = this;
                            arrayList.add(new InterTypeFieldDeclarationImpl(ajTypeImpl2, ajcitd.targetType(), ajcitd.modifiers(), ajcitd.name(), AjTypeSystem.getAjType(declaredMethod.getReturnType()), declaredMethod.getGenericReturnType()));
                        } catch (NoSuchMethodException unused) {
                            qg50.m176437a("Can't find field get dispatch method for ", method.getName());
                            return null;
                        }
                    } else {
                        ajTypeImpl2 = this;
                    }
                } else {
                    ajTypeImpl2 = this;
                }
                i++;
                this = ajTypeImpl2;
            }
            ajTypeImpl = this;
            ajTypeImpl.addAnnotationStyleITDFields(arrayList, true);
            InterTypeFieldDeclaration[] interTypeFieldDeclarationArr = new InterTypeFieldDeclaration[arrayList.size()];
            ajTypeImpl.itdFields = interTypeFieldDeclarationArr;
            arrayList.toArray(interTypeFieldDeclarationArr);
        } else {
            ajTypeImpl = this;
        }
        return ajTypeImpl.itdFields;
    }

    @Override // org.aspectj.lang.reflect.AjType
    public InterTypeMethodDeclaration getITDMethod(String str, AjType<?> ajType, AjType<?>... ajTypeArr) throws NoSuchMethodException {
        for (InterTypeMethodDeclaration interTypeMethodDeclaration : getITDMethods()) {
            try {
                if (interTypeMethodDeclaration.getName().equals(str) && interTypeMethodDeclaration.getTargetType().equals(ajType)) {
                    AjType<?>[] parameterTypes = interTypeMethodDeclaration.getParameterTypes();
                    if (parameterTypes.length == ajTypeArr.length) {
                        for (int i = 0; i < parameterTypes.length; i++) {
                            if (parameterTypes[i].equals(ajTypeArr[i])) {
                            }
                        }
                        return interTypeMethodDeclaration;
                    }
                    continue;
                }
            } catch (ClassNotFoundException unused) {
            }
        }
        throw new NoSuchMethodException(str);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    @Override // org.aspectj.lang.reflect.AjType
    public InterTypeMethodDeclaration[] getITDMethods() {
        AjTypeImpl<T> ajTypeImpl;
        AjTypeImpl<T> ajTypeImpl2;
        if (this.itdMethods == null) {
            List<InterTypeMethodDeclaration> arrayList = new ArrayList<>();
            Method[] declaredMethods = this.clazz.getDeclaredMethods();
            int length = declaredMethods.length;
            int i = 0;
            while (i < length) {
                Method method = declaredMethods[i];
                if (method.getName().contains("ajc$interMethod$") && method.isAnnotationPresent(ajcITD.class)) {
                    ajcITD ajcitd = (ajcITD) method.getAnnotation(ajcITD.class);
                    if (Modifier.isPublic(ajcitd.modifiers())) {
                        ajTypeImpl2 = this;
                        arrayList.add(new InterTypeMethodDeclarationImpl(ajTypeImpl2, ajcitd.targetType(), ajcitd.modifiers(), ajcitd.name(), method));
                    } else {
                        ajTypeImpl2 = this;
                    }
                } else {
                    ajTypeImpl2 = this;
                }
                i++;
                this = ajTypeImpl2;
            }
            ajTypeImpl = this;
            ajTypeImpl.addAnnotationStyleITDMethods(arrayList, true);
            InterTypeMethodDeclaration[] interTypeMethodDeclarationArr = new InterTypeMethodDeclaration[arrayList.size()];
            ajTypeImpl.itdMethods = interTypeMethodDeclarationArr;
            arrayList.toArray(interTypeMethodDeclarationArr);
        } else {
            ajTypeImpl = this;
        }
        return ajTypeImpl.itdMethods;
    }

    @Override // org.aspectj.lang.reflect.AjType
    public AjType<?>[] getInterfaces() {
        return toAjTypeArray(this.clazz.getInterfaces());
    }

    @Override // org.aspectj.lang.reflect.AjType
    public Class<T> getJavaClass() {
        return this.clazz;
    }

    @Override // org.aspectj.lang.reflect.AjType
    public Method getMethod(String str, AjType<?>... ajTypeArr) throws NoSuchMethodException {
        Method method = this.clazz.getMethod(str, toClassArray(ajTypeArr));
        if (isReallyAMethod(method)) {
            return method;
        }
        throw new NoSuchMethodException(str);
    }

    @Override // org.aspectj.lang.reflect.AjType
    public Method[] getMethods() {
        Method[] methods = this.clazz.getMethods();
        ArrayList arrayList = new ArrayList();
        for (Method method : methods) {
            if (isReallyAMethod(method)) {
                arrayList.add(method);
            }
        }
        Method[] methodArr = new Method[arrayList.size()];
        arrayList.toArray(methodArr);
        return methodArr;
    }

    @Override // org.aspectj.lang.reflect.AjType
    public int getModifiers() {
        return this.clazz.getModifiers();
    }

    @Override // org.aspectj.lang.reflect.AjType
    public String getName() {
        return this.clazz.getName();
    }

    @Override // org.aspectj.lang.reflect.AjType
    public Package getPackage() {
        return this.clazz.getPackage();
    }

    @Override // org.aspectj.lang.reflect.AjType
    public PerClause getPerClause() {
        if (isAspect()) {
            String strValue = ((Aspect) this.clazz.getAnnotation(Aspect.class)).value();
            if (strValue.equals("")) {
                return getSupertype().isAspect() ? getSupertype().getPerClause() : new PerClauseImpl(PerClauseKind.SINGLETON);
            }
            if (strValue.startsWith("perthis(")) {
                return new PointcutBasedPerClauseImpl(PerClauseKind.PERTHIS, strValue.substring(8, strValue.length() - 1));
            }
            if (strValue.startsWith("pertarget(")) {
                return new PointcutBasedPerClauseImpl(PerClauseKind.PERTARGET, strValue.substring(10, strValue.length() - 1));
            }
            if (strValue.startsWith("percflow(")) {
                return new PointcutBasedPerClauseImpl(PerClauseKind.PERCFLOW, strValue.substring(9, strValue.length() - 1));
            }
            if (strValue.startsWith("percflowbelow(")) {
                return new PointcutBasedPerClauseImpl(PerClauseKind.PERCFLOWBELOW, strValue.substring(14, strValue.length() - 1));
            }
            if (strValue.startsWith("pertypewithin")) {
                return new TypePatternBasedPerClauseImpl(PerClauseKind.PERTYPEWITHIN, strValue.substring(14, strValue.length() - 1));
            }
            wtq0.m207906a("Per-clause not recognized: ".concat(strValue));
        }
        return null;
    }

    @Override // org.aspectj.lang.reflect.AjType
    public Pointcut getPointcut(String str) throws NoSuchPointcutException {
        for (Pointcut pointcut : getPointcuts()) {
            if (pointcut.getName().equals(str)) {
                return pointcut;
            }
        }
        throw new NoSuchPointcutException(str);
    }

    @Override // org.aspectj.lang.reflect.AjType
    public Pointcut[] getPointcuts() {
        Pointcut[] pointcutArr = this.pointcuts;
        if (pointcutArr != null) {
            return pointcutArr;
        }
        ArrayList arrayList = new ArrayList();
        for (Method method : this.clazz.getMethods()) {
            Pointcut pointcutAsPointcut = asPointcut(method);
            if (pointcutAsPointcut != null) {
                arrayList.add(pointcutAsPointcut);
            }
        }
        Pointcut[] pointcutArr2 = new Pointcut[arrayList.size()];
        arrayList.toArray(pointcutArr2);
        this.pointcuts = pointcutArr2;
        return pointcutArr2;
    }

    @Override // org.aspectj.lang.reflect.AjType
    public AjType<? super T> getSupertype() {
        Class<? super T> superclass = this.clazz.getSuperclass();
        if (superclass == null) {
            return null;
        }
        return new AjTypeImpl(superclass);
    }

    @Override // org.aspectj.lang.reflect.AjType
    public TypeVariable<Class<T>>[] getTypeParameters() {
        return this.clazz.getTypeParameters();
    }

    public int hashCode() {
        return this.clazz.hashCode();
    }

    @Override // java.lang.reflect.AnnotatedElement
    public boolean isAnnotationPresent(Class<? extends Annotation> cls) {
        return this.clazz.isAnnotationPresent(cls);
    }

    @Override // org.aspectj.lang.reflect.AjType
    public boolean isArray() {
        return this.clazz.isArray();
    }

    @Override // org.aspectj.lang.reflect.AjType
    public boolean isAspect() {
        return this.clazz.getAnnotation(Aspect.class) != null;
    }

    @Override // org.aspectj.lang.reflect.AjType
    public boolean isEnum() {
        return this.clazz.isEnum();
    }

    @Override // org.aspectj.lang.reflect.AjType
    public boolean isInstance(Object obj) {
        return this.clazz.isInstance(obj);
    }

    @Override // org.aspectj.lang.reflect.AjType
    public boolean isInterface() {
        return this.clazz.isInterface();
    }

    @Override // org.aspectj.lang.reflect.AjType
    public boolean isLocalClass() {
        return this.clazz.isLocalClass() && !isAspect();
    }

    @Override // org.aspectj.lang.reflect.AjType
    public boolean isMemberAspect() {
        return this.clazz.isMemberClass() && isAspect();
    }

    @Override // org.aspectj.lang.reflect.AjType
    public boolean isMemberClass() {
        return this.clazz.isMemberClass() && !isAspect();
    }

    @Override // org.aspectj.lang.reflect.AjType
    public boolean isPrimitive() {
        return this.clazz.isPrimitive();
    }

    @Override // org.aspectj.lang.reflect.AjType
    public boolean isPrivileged() {
        return isAspect() && this.clazz.isAnnotationPresent(ajcPrivileged.class);
    }

    public String toString() {
        return getName();
    }

    private Advice[] getAdvice(Set set) {
        if (this.advice == null) {
            initAdvice();
        }
        ArrayList arrayList = new ArrayList();
        for (Advice advice : this.advice) {
            if (set.contains(advice.getKind())) {
                arrayList.add(advice);
            }
        }
        Advice[] adviceArr = new Advice[arrayList.size()];
        arrayList.toArray(adviceArr);
        return adviceArr;
    }

    private Advice[] getDeclaredAdvice(Set set) {
        if (this.declaredAdvice == null) {
            initDeclaredAdvice();
        }
        ArrayList arrayList = new ArrayList();
        for (Advice advice : this.declaredAdvice) {
            if (set.contains(advice.getKind())) {
                arrayList.add(advice);
            }
        }
        Advice[] adviceArr = new Advice[arrayList.size()];
        arrayList.toArray(adviceArr);
        return adviceArr;
    }

    @Override // org.aspectj.lang.reflect.AjType
    public Advice[] getAdvice(AdviceKind... adviceKindArr) {
        EnumSet enumSetAllOf;
        if (adviceKindArr.length == 0) {
            enumSetAllOf = EnumSet.allOf(AdviceKind.class);
        } else {
            EnumSet enumSetNoneOf = EnumSet.noneOf(AdviceKind.class);
            enumSetNoneOf.addAll(Arrays.asList(adviceKindArr));
            enumSetAllOf = enumSetNoneOf;
        }
        return getAdvice(enumSetAllOf);
    }

    @Override // org.aspectj.lang.reflect.AjType
    public Advice[] getDeclaredAdvice(AdviceKind... adviceKindArr) {
        EnumSet enumSetAllOf;
        if (adviceKindArr.length == 0) {
            enumSetAllOf = EnumSet.allOf(AdviceKind.class);
        } else {
            EnumSet enumSetNoneOf = EnumSet.noneOf(AdviceKind.class);
            enumSetNoneOf.addAll(Arrays.asList(adviceKindArr));
            enumSetAllOf = enumSetNoneOf;
        }
        return getDeclaredAdvice(enumSetAllOf);
    }
}
