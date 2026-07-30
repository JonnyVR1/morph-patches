package org.junit.internal;

import org.junit.Assert;

/* JADX INFO: loaded from: classes3.dex */
public class ExactComparisonCriteria extends ComparisonCriteria {
    @Override // org.junit.internal.ComparisonCriteria
    public void assertElementsEqual(Object obj, Object obj2) {
        Assert.assertEquals(obj, obj2);
    }
}
