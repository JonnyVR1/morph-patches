package org.junit.internal;

import java.lang.reflect.Array;
import java.util.Arrays;
import org.junit.Assert;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public abstract class ComparisonCriteria {
    private int assertArraysAreSameLength(Object obj, Object obj2, String str) {
        if (obj == null) {
            Assert.fail(str + "expected array was null");
        }
        if (obj2 == null) {
            Assert.fail(str + "actual array was null");
        }
        int length = Array.getLength(obj2);
        int length2 = Array.getLength(obj);
        if (length != length2) {
            Assert.fail(str + "array lengths differed, expected.length=" + length2 + " actual.length=" + length);
        }
        return length2;
    }

    private boolean isArray(Object obj) {
        return obj != null && obj.getClass().isArray();
    }

    public void arrayEquals(String str, Object obj, Object obj2) throws ArrayComparisonFailure {
        if (obj == obj2 || Arrays.deepEquals(new Object[]{obj}, new Object[]{obj2})) {
            return;
        }
        String strConcat = str == null ? "" : str.concat(": ");
        int iAssertArraysAreSameLength = assertArraysAreSameLength(obj, obj2, strConcat);
        for (int i = 0; i < iAssertArraysAreSameLength; i++) {
            Object obj3 = Array.get(obj, i);
            Object obj4 = Array.get(obj2, i);
            if (isArray(obj3) && isArray(obj4)) {
                try {
                    arrayEquals(str, obj3, obj4);
                } catch (ArrayComparisonFailure e) {
                    e.addDimension(i);
                    throw e;
                }
            } else {
                try {
                    assertElementsEqual(obj3, obj4);
                } catch (AssertionError e2) {
                    throw new ArrayComparisonFailure(strConcat, e2, i);
                }
            }
        }
    }

    public abstract void assertElementsEqual(Object obj, Object obj2);
}
