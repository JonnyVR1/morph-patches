package com.p003p1.mobile.android.geocoding;

import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0002\u0010\u0006J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0000J\"\u0010\n\u001a\u00020\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eJ\t\u0010\u0011\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0004HÆ\u0003J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u000fJ\u001d\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00142\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\b\u0010\u001c\u001a\u00020\u001dH\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u001e"}, d2 = {"Lcom/p1/mobile/android/geocoding/BoundingBox;", "", "()V", "max", "Lcom/p1/mobile/android/geocoding/Point;", "min", "(Lcom/p1/mobile/android/geocoding/Point;Lcom/p1/mobile/android/geocoding/Point;)V", "getMax", "()Lcom/p1/mobile/android/geocoding/Point;", "getMin", "accept", "", "box", "latitude", "", "", "longitude", "component1", "component2", "contains", "", "lat", "lon", "copy", "equals", "other", "hashCode", "", "toString", "", "geocoding_release"}, k = 1, mv = {1, 1, 13})
public final /* data */ class BoundingBox {

    @NotNull
    private final Point max;

    @NotNull
    private final Point min;

    /* JADX WARN: Illegal instructions before constructor call */
    public BoundingBox() {
        FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
        this(new Point(floatCompanionObject.a(), floatCompanionObject.a()), new Point(floatCompanionObject.b(), floatCompanionObject.b()));
    }

    @NotNull
    public static /* synthetic */ BoundingBox copy$default(BoundingBox boundingBox, Point point, Point point2, int i, Object obj) {
        if ((i & 1) != 0) {
            point = boundingBox.max;
        }
        if ((i & 2) != 0) {
            point2 = boundingBox.min;
        }
        return boundingBox.copy(point, point2);
    }

    public final void accept(@NotNull List<Float> latitude, @NotNull List<Float> longitude) {
        latitude.getClass();
        longitude.getClass();
        Iterator<T> it = latitude.iterator();
        while (it.hasNext()) {
            float fFloatValue = ((Number) it.next()).floatValue();
            Point point = this.max;
            point.setLatitude(Math.max(point.getLatitude(), fFloatValue));
            Point point2 = this.min;
            point2.setLatitude(Math.min(point2.getLatitude(), fFloatValue));
        }
        Iterator<T> it2 = longitude.iterator();
        while (it2.hasNext()) {
            float fFloatValue2 = ((Number) it2.next()).floatValue();
            Point point3 = this.max;
            point3.setLongitude(Math.max(point3.getLongitude(), fFloatValue2));
            Point point4 = this.min;
            point4.setLongitude(Math.min(point4.getLongitude(), fFloatValue2));
        }
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Point getMax() {
        return this.max;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Point getMin() {
        return this.min;
    }

    public final boolean contains(float lat, float lon) {
        return lat <= this.max.getLatitude() && lon <= this.max.getLongitude() && lat >= this.min.getLatitude() && lon >= this.min.getLongitude();
    }

    @NotNull
    public final BoundingBox copy(@NotNull Point max, @NotNull Point min) {
        max.getClass();
        min.getClass();
        return new BoundingBox(max, min);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BoundingBox)) {
            return false;
        }
        BoundingBox boundingBox = (BoundingBox) other;
        return Intrinsics.d(this.max, boundingBox.max) && Intrinsics.d(this.min, boundingBox.min);
    }

    @NotNull
    public final Point getMax() {
        return this.max;
    }

    @NotNull
    public final Point getMin() {
        return this.min;
    }

    public int hashCode() {
        Point point = this.max;
        int iHashCode = (point != null ? point.hashCode() : 0) * 31;
        Point point2 = this.min;
        return iHashCode + (point2 != null ? point2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "BoundingBox(max=" + this.max + ", min=" + this.min + ')';
    }

    public BoundingBox(@NotNull Point point, @NotNull Point point2) {
        point.getClass();
        point2.getClass();
        this.max = point;
        this.min = point2;
    }

    public final void accept(@NotNull BoundingBox box) {
        box.getClass();
        Point point = this.max;
        point.setLatitude(Math.max(point.getLatitude(), box.max.getLatitude()));
        point.setLongitude(Math.max(point.getLongitude(), box.max.getLongitude()));
        Point point2 = this.min;
        point2.setLatitude(Math.min(point2.getLatitude(), box.min.getLatitude()));
        point2.setLongitude(Math.min(point2.getLongitude(), box.min.getLongitude()));
    }
}
