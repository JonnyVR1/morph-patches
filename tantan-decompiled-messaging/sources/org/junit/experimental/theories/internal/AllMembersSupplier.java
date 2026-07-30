package org.junit.experimental.theories.internal;

import com.clevertap.android.sdk.Constants;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.junit.Assume;
import org.junit.experimental.theories.DataPoint;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.ParameterSignature;
import org.junit.experimental.theories.ParameterSupplier;
import org.junit.experimental.theories.PotentialAssignment;
import org.junit.runners.model.FrameworkField;
import org.junit.runners.model.FrameworkMethod;
import org.junit.runners.model.TestClass;
import p149l.upk0;

/* JADX INFO: loaded from: classes3.dex */
public class AllMembersSupplier extends ParameterSupplier {
    private final TestClass clazz;

    public static class MethodParameterValue extends PotentialAssignment {
        private final FrameworkMethod method;

        private MethodParameterValue(FrameworkMethod frameworkMethod) {
            this.method = frameworkMethod;
        }

        @Override // org.junit.experimental.theories.PotentialAssignment
        public String getDescription() throws PotentialAssignment.CouldNotGenerateValueException {
            return this.method.getName();
        }

        @Override // org.junit.experimental.theories.PotentialAssignment
        public Object getValue() throws PotentialAssignment.CouldNotGenerateValueException {
            try {
                return this.method.invokeExplosively(null, new Object[0]);
            } catch (IllegalAccessException unused) {
                upk0.m194883a("unexpected: getMethods returned an inaccessible method");
                return null;
            } catch (IllegalArgumentException unused2) {
                upk0.m194883a("unexpected: argument length is checked");
                return null;
            } catch (Throwable th) {
                DataPoint dataPoint = (DataPoint) this.method.getAnnotation(DataPoint.class);
                Assume.assumeTrue(dataPoint == null || !AllMembersSupplier.isAssignableToAnyOf(dataPoint.ignoredExceptions(), th));
                throw new PotentialAssignment.CouldNotGenerateValueException(th);
            }
        }
    }

    public AllMembersSupplier(TestClass testClass) {
        this.clazz = testClass;
    }

    private void addArrayValues(ParameterSignature parameterSignature, String str, List<PotentialAssignment> list, Object obj) {
        for (int i = 0; i < Array.getLength(obj); i++) {
            Object obj2 = Array.get(obj, i);
            if (parameterSignature.canAcceptValue(obj2)) {
                list.add(PotentialAssignment.forValue(str + "[" + i + Constants.AES_SUFFIX, obj2));
            }
        }
    }

    private void addDataPointsValues(Class<?> cls, ParameterSignature parameterSignature, String str, List<PotentialAssignment> list, Object obj) {
        if (cls.isArray()) {
            addArrayValues(parameterSignature, str, list, obj);
        } else if (Iterable.class.isAssignableFrom(cls)) {
            addIterableValues(parameterSignature, str, list, (Iterable) obj);
        }
    }

    private void addIterableValues(ParameterSignature parameterSignature, String str, List<PotentialAssignment> list, Iterable<?> iterable) {
        int i = 0;
        for (Object obj : iterable) {
            if (parameterSignature.canAcceptValue(obj)) {
                list.add(PotentialAssignment.forValue(str + "[" + i + Constants.AES_SUFFIX, obj));
            }
            i++;
        }
    }

    private void addMultiPointFields(ParameterSignature parameterSignature, List<PotentialAssignment> list) {
        for (Field field : getDataPointsFields(parameterSignature)) {
            addDataPointsValues(field.getType(), parameterSignature, field.getName(), list, getStaticFieldValue(field));
        }
    }

    private void addMultiPointMethods(ParameterSignature parameterSignature, List<PotentialAssignment> list) throws Throwable {
        AllMembersSupplier allMembersSupplier;
        ParameterSignature parameterSignature2;
        List<PotentialAssignment> list2;
        for (FrameworkMethod frameworkMethod : getDataPointsMethods(parameterSignature)) {
            Class<?> returnType = frameworkMethod.getReturnType();
            if ((returnType.isArray() && parameterSignature.canPotentiallyAcceptType(returnType.getComponentType())) || Iterable.class.isAssignableFrom(returnType)) {
                try {
                    allMembersSupplier = this;
                    parameterSignature2 = parameterSignature;
                    list2 = list;
                    allMembersSupplier.addDataPointsValues(returnType, parameterSignature2, frameworkMethod.getName(), list2, frameworkMethod.invokeExplosively(null, new Object[0]));
                } catch (Throwable th) {
                    DataPoints dataPoints = (DataPoints) frameworkMethod.getAnnotation(DataPoints.class);
                    if (dataPoints == null || !isAssignableToAnyOf(dataPoints.ignoredExceptions(), th)) {
                        throw th;
                    }
                    return;
                }
            } else {
                allMembersSupplier = this;
                parameterSignature2 = parameterSignature;
                list2 = list;
            }
            this = allMembersSupplier;
            parameterSignature = parameterSignature2;
            list = list2;
        }
    }

    private void addSinglePointFields(ParameterSignature parameterSignature, List<PotentialAssignment> list) {
        for (Field field : getSingleDataPointFields(parameterSignature)) {
            Object staticFieldValue = getStaticFieldValue(field);
            if (parameterSignature.canAcceptValue(staticFieldValue)) {
                list.add(PotentialAssignment.forValue(field.getName(), staticFieldValue));
            }
        }
    }

    private void addSinglePointMethods(ParameterSignature parameterSignature, List<PotentialAssignment> list) {
        for (FrameworkMethod frameworkMethod : getSingleDataPointMethods(parameterSignature)) {
            if (parameterSignature.canAcceptType(frameworkMethod.getType())) {
                list.add(new MethodParameterValue(frameworkMethod));
            }
        }
    }

    private Object getStaticFieldValue(Field field) {
        try {
            return field.get(null);
        } catch (IllegalAccessException unused) {
            upk0.m194883a("unexpected: getFields returned an inaccessible field");
            return null;
        } catch (IllegalArgumentException unused2) {
            upk0.m194883a("unexpected: field from getClass doesn't exist on object");
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isAssignableToAnyOf(Class<?>[] clsArr, Object obj) {
        for (Class<?> cls : clsArr) {
            if (cls.isAssignableFrom(obj.getClass())) {
                return true;
            }
        }
        return false;
    }

    public Collection<Field> getDataPointsFields(ParameterSignature parameterSignature) {
        List<FrameworkField> annotatedFields = this.clazz.getAnnotatedFields(DataPoints.class);
        ArrayList arrayList = new ArrayList();
        Iterator<FrameworkField> it = annotatedFields.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getField());
        }
        return arrayList;
    }

    public Collection<FrameworkMethod> getDataPointsMethods(ParameterSignature parameterSignature) {
        return this.clazz.getAnnotatedMethods(DataPoints.class);
    }

    public Collection<Field> getSingleDataPointFields(ParameterSignature parameterSignature) {
        List<FrameworkField> annotatedFields = this.clazz.getAnnotatedFields(DataPoint.class);
        ArrayList arrayList = new ArrayList();
        Iterator<FrameworkField> it = annotatedFields.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getField());
        }
        return arrayList;
    }

    public Collection<FrameworkMethod> getSingleDataPointMethods(ParameterSignature parameterSignature) {
        return this.clazz.getAnnotatedMethods(DataPoint.class);
    }

    @Override // org.junit.experimental.theories.ParameterSupplier
    public List<PotentialAssignment> getValueSources(ParameterSignature parameterSignature) throws Throwable {
        ArrayList arrayList = new ArrayList();
        addSinglePointFields(parameterSignature, arrayList);
        addMultiPointFields(parameterSignature, arrayList);
        addSinglePointMethods(parameterSignature, arrayList);
        addMultiPointMethods(parameterSignature, arrayList);
        return arrayList;
    }
}
