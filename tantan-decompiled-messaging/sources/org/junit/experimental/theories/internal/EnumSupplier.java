package org.junit.experimental.theories.internal;

import java.util.ArrayList;
import java.util.List;
import org.junit.experimental.theories.ParameterSignature;
import org.junit.experimental.theories.ParameterSupplier;
import org.junit.experimental.theories.PotentialAssignment;

/* JADX INFO: loaded from: classes3.dex */
public class EnumSupplier extends ParameterSupplier {
    private Class<?> enumType;

    public EnumSupplier(Class<?> cls) {
        this.enumType = cls;
    }

    @Override // org.junit.experimental.theories.ParameterSupplier
    public List<PotentialAssignment> getValueSources(ParameterSignature parameterSignature) {
        Object[] enumConstants = this.enumType.getEnumConstants();
        ArrayList arrayList = new ArrayList();
        for (Object obj : enumConstants) {
            arrayList.add(PotentialAssignment.forValue(obj.toString(), obj));
        }
        return arrayList;
    }
}
