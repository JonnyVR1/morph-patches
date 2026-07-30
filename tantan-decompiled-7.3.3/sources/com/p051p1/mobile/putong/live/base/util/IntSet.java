package com.p051p1.mobile.putong.live.base.util;

import com.google.android.gms.common.api.Api;
import java.util.Collections;
import java.util.HashSet;
import p153l.jyb;

/* JADX INFO: loaded from: classes13.dex */
public class IntSet extends HashSet<Integer> {
    public static IntSet emptySet() {
        return new IntSet();
    }

    public static IntSet interval(int i, int i2) {
        IntSet intSet = new IntSet();
        while (i <= i2) {
            intSet.add(Integer.valueOf(i));
            i++;
        }
        return intSet;
    }

    public IntSet difference(IntSet intSet) {
        if (jyb.m147479J(intSet)) {
            return this;
        }
        IntSet intSet2 = new IntSet();
        for (Integer num : this) {
            num.intValue();
            if (!intSet.contains(num)) {
                intSet2.add(num);
            }
        }
        return intSet2;
    }

    public int max() {
        if (isEmpty()) {
            return Integer.MIN_VALUE;
        }
        return ((Integer) Collections.max(this)).intValue();
    }

    public int min() {
        return isEmpty() ? Api.BaseClientBuilder.API_PRIORITY_OTHER : ((Integer) Collections.min(this)).intValue();
    }
}
