package com.google.common.collect;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;
import p153l.akq;

/* JADX INFO: loaded from: classes7.dex */
final class CompoundOrdering<T> extends Ordering<T> implements Serializable {
    private static final long serialVersionUID = 0;
    final Comparator<? super T>[] comparators;

    public CompoundOrdering(Comparator<? super T> comparator, Comparator<? super T> comparator2) {
        this.comparators = new Comparator[]{comparator, comparator2};
    }

    @Override // com.google.common.collect.Ordering, java.util.Comparator
    public int compare(T t, T t2) {
        int i = 0;
        while (true) {
            Comparator<? super T>[] comparatorArr = this.comparators;
            if (i >= comparatorArr.length) {
                return 0;
            }
            int iCompare = comparatorArr[i].compare(t, t2);
            if (iCompare != 0) {
                return iCompare;
            }
            i++;
        }
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CompoundOrdering) {
            return Arrays.equals(this.comparators, ((CompoundOrdering) obj).comparators);
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(this.comparators);
    }

    public String toString() {
        String string = Arrays.toString(this.comparators);
        StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 19);
        sb.append("Ordering.compound(");
        sb.append(string);
        sb.append(")");
        return sb.toString();
    }

    public CompoundOrdering(Iterable<? extends Comparator<? super T>> iterable) {
        this.comparators = (Comparator[]) akq.m98609q(iterable, new Comparator[0]);
    }
}
