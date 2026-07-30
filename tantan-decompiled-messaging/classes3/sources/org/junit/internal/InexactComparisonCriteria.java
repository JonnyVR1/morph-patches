package org.junit.internal;

import org.junit.Assert;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class InexactComparisonCriteria extends ComparisonCriteria {
    public Object fDelta;

    public InexactComparisonCriteria(double d) {
        this.fDelta = Double.valueOf(d);
    }

    @Override // org.junit.internal.ComparisonCriteria
    public void assertElementsEqual(Object obj, Object obj2) {
        if (obj instanceof Double) {
            Assert.assertEquals(((Double) obj).doubleValue(), ((Double) obj2).doubleValue(), ((Double) this.fDelta).doubleValue());
        } else {
            Assert.assertEquals(((Float) obj).floatValue(), ((Float) obj2).floatValue(), ((Float) this.fDelta).floatValue());
        }
    }

    public InexactComparisonCriteria(float f) {
        this.fDelta = Float.valueOf(f);
    }
}
