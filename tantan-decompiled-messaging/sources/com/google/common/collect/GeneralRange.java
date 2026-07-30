package com.google.common.collect;

import java.io.Serializable;
import java.util.Comparator;
import p149l.sf80;
import p149l.v050;
import p149l.vu40;

/* JADX INFO: loaded from: classes7.dex */
final class GeneralRange<T> implements Serializable {
    private final Comparator<? super T> comparator;
    private final boolean hasLowerBound;
    private final boolean hasUpperBound;
    private final BoundType lowerBoundType;
    private final T lowerEndpoint;
    private transient GeneralRange<T> reverse;
    private final BoundType upperBoundType;
    private final T upperEndpoint;

    private GeneralRange(Comparator<? super T> comparator, boolean z, T t, BoundType boundType, boolean z2, T t2, BoundType boundType2) {
        this.comparator = (Comparator) sf80.m183894p(comparator);
        this.hasLowerBound = z;
        this.hasUpperBound = z2;
        this.lowerEndpoint = t;
        this.lowerBoundType = (BoundType) sf80.m183894p(boundType);
        this.upperEndpoint = t2;
        this.upperBoundType = (BoundType) sf80.m183894p(boundType2);
        if (z) {
            comparator.compare((Object) vu40.m200060a(t), (Object) vu40.m200060a(t));
        }
        if (z2) {
            comparator.compare((Object) vu40.m200060a(t2), (Object) vu40.m200060a(t2));
        }
        if (z && z2) {
            int iCompare = comparator.compare((Object) vu40.m200060a(t), (Object) vu40.m200060a(t2));
            sf80.m183890l(iCompare <= 0, "lowerEndpoint (%s) > upperEndpoint (%s)", t, t2);
            if (iCompare == 0) {
                BoundType boundType3 = BoundType.OPEN;
                sf80.m183882d((boundType == boundType3 && boundType2 == boundType3) ? false : true);
            }
        }
    }

    public static <T> GeneralRange<T> all(Comparator<? super T> comparator) {
        BoundType boundType = BoundType.OPEN;
        return new GeneralRange<>(comparator, false, null, boundType, false, null, boundType);
    }

    public static <T> GeneralRange<T> downTo(Comparator<? super T> comparator, T t, BoundType boundType) {
        return new GeneralRange<>(comparator, true, t, boundType, false, null, BoundType.OPEN);
    }

    public static <T extends Comparable> GeneralRange<T> from(Range<T> range) {
        return new GeneralRange<>(Ordering.natural(), range.hasLowerBound(), range.hasLowerBound() ? range.lowerEndpoint() : null, range.hasLowerBound() ? range.lowerBoundType() : BoundType.OPEN, range.hasUpperBound(), range.hasUpperBound() ? range.upperEndpoint() : null, range.hasUpperBound() ? range.upperBoundType() : BoundType.OPEN);
    }

    public static <T> GeneralRange<T> range(Comparator<? super T> comparator, T t, BoundType boundType, T t2, BoundType boundType2) {
        return new GeneralRange<>(comparator, true, t, boundType, true, t2, boundType2);
    }

    public static <T> GeneralRange<T> upTo(Comparator<? super T> comparator, T t, BoundType boundType) {
        return new GeneralRange<>(comparator, false, null, BoundType.OPEN, true, t, boundType);
    }

    public Comparator<? super T> comparator() {
        return this.comparator;
    }

    public boolean contains(T t) {
        return (tooLow(t) || tooHigh(t)) ? false : true;
    }

    public boolean equals(Object obj) {
        if (obj instanceof GeneralRange) {
            GeneralRange generalRange = (GeneralRange) obj;
            if (this.comparator.equals(generalRange.comparator) && this.hasLowerBound == generalRange.hasLowerBound && this.hasUpperBound == generalRange.hasUpperBound && getLowerBoundType().equals(generalRange.getLowerBoundType()) && getUpperBoundType().equals(generalRange.getUpperBoundType()) && v050.m196470a(getLowerEndpoint(), generalRange.getLowerEndpoint()) && v050.m196470a(getUpperEndpoint(), generalRange.getUpperEndpoint())) {
                return true;
            }
        }
        return false;
    }

    public BoundType getLowerBoundType() {
        return this.lowerBoundType;
    }

    public T getLowerEndpoint() {
        return this.lowerEndpoint;
    }

    public BoundType getUpperBoundType() {
        return this.upperBoundType;
    }

    public T getUpperEndpoint() {
        return this.upperEndpoint;
    }

    public boolean hasLowerBound() {
        return this.hasLowerBound;
    }

    public boolean hasUpperBound() {
        return this.hasUpperBound;
    }

    public int hashCode() {
        return v050.m196471b(this.comparator, getLowerEndpoint(), getLowerBoundType(), getUpperEndpoint(), getUpperBoundType());
    }

    public GeneralRange<T> intersect(GeneralRange<T> generalRange) {
        int iCompare;
        int iCompare2;
        T t;
        int iCompare3;
        BoundType boundType;
        sf80.m183894p(generalRange);
        sf80.m183882d(this.comparator.equals(generalRange.comparator));
        boolean z = this.hasLowerBound;
        T lowerEndpoint = getLowerEndpoint();
        BoundType lowerBoundType = getLowerBoundType();
        if (!hasLowerBound()) {
            z = generalRange.hasLowerBound;
            lowerEndpoint = generalRange.getLowerEndpoint();
            lowerBoundType = generalRange.getLowerBoundType();
        } else if (generalRange.hasLowerBound() && ((iCompare = this.comparator.compare(getLowerEndpoint(), generalRange.getLowerEndpoint())) < 0 || (iCompare == 0 && generalRange.getLowerBoundType() == BoundType.OPEN))) {
            lowerEndpoint = generalRange.getLowerEndpoint();
            lowerBoundType = generalRange.getLowerBoundType();
        }
        boolean z2 = z;
        boolean z3 = this.hasUpperBound;
        T upperEndpoint = getUpperEndpoint();
        BoundType upperBoundType = getUpperBoundType();
        if (!hasUpperBound()) {
            z3 = generalRange.hasUpperBound;
            upperEndpoint = generalRange.getUpperEndpoint();
            upperBoundType = generalRange.getUpperBoundType();
        } else if (generalRange.hasUpperBound() && ((iCompare2 = this.comparator.compare(getUpperEndpoint(), generalRange.getUpperEndpoint())) > 0 || (iCompare2 == 0 && generalRange.getUpperBoundType() == BoundType.OPEN))) {
            upperEndpoint = generalRange.getUpperEndpoint();
            upperBoundType = generalRange.getUpperBoundType();
        }
        boolean z4 = z3;
        T t2 = upperEndpoint;
        if (z2 && z4 && ((iCompare3 = this.comparator.compare(lowerEndpoint, t2)) > 0 || (iCompare3 == 0 && lowerBoundType == (boundType = BoundType.OPEN) && upperBoundType == boundType))) {
            lowerBoundType = BoundType.OPEN;
            upperBoundType = BoundType.CLOSED;
            t = t2;
        } else {
            t = lowerEndpoint;
        }
        return new GeneralRange<>(this.comparator, z2, t, lowerBoundType, z4, t2, upperBoundType);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean isEmpty() {
        if (hasUpperBound() && tooLow(vu40.m200060a(getUpperEndpoint()))) {
            return true;
        }
        return hasLowerBound() && tooHigh(vu40.m200060a(getLowerEndpoint()));
    }

    public GeneralRange<T> reverse() {
        GeneralRange<T> generalRange = this.reverse;
        if (generalRange != null) {
            return generalRange;
        }
        GeneralRange<T> generalRange2 = new GeneralRange<>(Ordering.from(this.comparator).reverse(), this.hasUpperBound, getUpperEndpoint(), getUpperBoundType(), this.hasLowerBound, getLowerEndpoint(), getLowerBoundType());
        generalRange2.reverse = this;
        this.reverse = generalRange2;
        return generalRange2;
    }

    public String toString() {
        String strValueOf = String.valueOf(this.comparator);
        BoundType boundType = this.lowerBoundType;
        BoundType boundType2 = BoundType.CLOSED;
        char c = boundType == boundType2 ? '[' : '(';
        String strValueOf2 = String.valueOf(this.hasLowerBound ? this.lowerEndpoint : "-∞");
        String strValueOf3 = String.valueOf(this.hasUpperBound ? this.upperEndpoint : "∞");
        char c2 = this.upperBoundType == boundType2 ? ']' : ')';
        StringBuilder sb = new StringBuilder(strValueOf.length() + 4 + strValueOf2.length() + strValueOf3.length());
        sb.append(strValueOf);
        sb.append(":");
        sb.append(c);
        sb.append(strValueOf2);
        sb.append(',');
        sb.append(strValueOf3);
        sb.append(c2);
        return sb.toString();
    }

    public boolean tooHigh(T t) {
        if (!hasUpperBound()) {
            return false;
        }
        int iCompare = this.comparator.compare(t, vu40.m200060a(getUpperEndpoint()));
        return ((iCompare == 0) & (getUpperBoundType() == BoundType.OPEN)) | (iCompare > 0);
    }

    public boolean tooLow(T t) {
        if (!hasLowerBound()) {
            return false;
        }
        int iCompare = this.comparator.compare(t, vu40.m200060a(getLowerEndpoint()));
        return ((iCompare == 0) & (getLowerBoundType() == BoundType.OPEN)) | (iCompare < 0);
    }
}
