package com.p046p1.mobile.android.geocoding;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m87230bv = {1, 0, 3}, m87231d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\t¨\u0006\u0016"}, m87232d2 = {"Lcom/p1/mobile/android/geocoding/Point;", "", "latitude", "", "longitude", "(FF)V", "getLatitude", "()F", "setLatitude", "(F)V", "getLongitude", "setLongitude", "component1", "component2", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "", "geocoding_release"}, m87233k = 1, m87234mv = {1, 1, 13})
public final /* data */ class Point {
    private float latitude;
    private float longitude;

    public Point(float f, float f2) {
        this.latitude = f;
        this.longitude = f2;
    }

    @NotNull
    public static /* synthetic */ Point copy$default(Point point, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = point.latitude;
        }
        if ((i & 2) != 0) {
            f2 = point.longitude;
        }
        return point.copy(f, f2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final float getLatitude() {
        return this.latitude;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getLongitude() {
        return this.longitude;
    }

    @NotNull
    public final Point copy(float latitude, float longitude) {
        return new Point(latitude, longitude);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Point)) {
            return false;
        }
        Point point = (Point) other;
        return Float.compare(this.latitude, point.latitude) == 0 && Float.compare(this.longitude, point.longitude) == 0;
    }

    public final float getLatitude() {
        return this.latitude;
    }

    public final float getLongitude() {
        return this.longitude;
    }

    public int hashCode() {
        return (Float.floatToIntBits(this.latitude) * 31) + Float.floatToIntBits(this.longitude);
    }

    public final void setLatitude(float f) {
        this.latitude = f;
    }

    public final void setLongitude(float f) {
        this.longitude = f;
    }

    @NotNull
    public String toString() {
        return "Point(latitude=" + this.latitude + ", longitude=" + this.longitude + ")";
    }
}
