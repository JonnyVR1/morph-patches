package org.junit.experimental.theories.internal;

import java.util.Arrays;
import java.util.List;
import org.junit.experimental.theories.ParameterSignature;
import org.junit.experimental.theories.ParameterSupplier;
import org.junit.experimental.theories.PotentialAssignment;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class BooleanSupplier extends ParameterSupplier {
    @Override // org.junit.experimental.theories.ParameterSupplier
    public List<PotentialAssignment> getValueSources(ParameterSignature parameterSignature) {
        return Arrays.asList(PotentialAssignment.forValue("true", Boolean.TRUE), PotentialAssignment.forValue("false", Boolean.FALSE));
    }
}
