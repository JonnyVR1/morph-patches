package com.p046p1.mobile.android.geocoding;

import android.content.Context;
import com.immomo.momomediaext.sei.BaseSei;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p118io.CloseableKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m87230bv = {1, 0, 3}, m87231d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0017\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0002\u0010\bJ\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001fJ\u001c\u0010!\u001a\u00020\"*\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001fH\u0002J\u001c\u0010!\u001a\u00020\"*\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001fH\u0002J\u001c\u0010!\u001a\u00020\"*\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001fH\u0002J\u001c\u0010!\u001a\u00020\"*\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001fH\u0002R\u001a\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0082.¢\u0006\u0004\n\u0002\u0010\u0012R\u0018\u0010\u0013\u001a\u00020\u000b*\u00020\u00148BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0013\u001a\u00020\u000b*\u00020\u00178BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0018R\u0018\u0010\u0013\u001a\u00020\u000b*\u00020\u00198BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u001aR\u0018\u0010\u0013\u001a\u00020\u000b*\u00020\u001b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u001c¨\u0006#"}, m87232d2 = {"Lcom/p1/mobile/android/geocoding/Geocoder;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", BaseSei.INFO, "Ljava/io/InputStream;", "shapes", "(Ljava/io/InputStream;Ljava/io/InputStream;)V", "boxes", "", "Lcom/p1/mobile/android/geocoding/BoundingBox;", "countries", "", "Lcom/p1/mobile/android/geocoding/Geocoding$Country;", "features", "", "Lcom/p1/mobile/android/geocoding/Geocoding$Feature;", "[Lcom/p1/mobile/android/geocoding/Geocoding$Feature;", "bounding", "Lcom/p1/mobile/android/geocoding/Geocoding$Geometry;", "getBounding", "(Lcom/p1/mobile/android/geocoding/Geocoding$Geometry;)Lcom/p1/mobile/android/geocoding/BoundingBox;", "Lcom/p1/mobile/android/geocoding/Geocoding$MultiPolygon;", "(Lcom/p1/mobile/android/geocoding/Geocoding$MultiPolygon;)Lcom/p1/mobile/android/geocoding/BoundingBox;", "Lcom/p1/mobile/android/geocoding/Geocoding$Polygon;", "(Lcom/p1/mobile/android/geocoding/Geocoding$Polygon;)Lcom/p1/mobile/android/geocoding/BoundingBox;", "Lcom/p1/mobile/android/geocoding/Geocoding$Ring;", "(Lcom/p1/mobile/android/geocoding/Geocoding$Ring;)Lcom/p1/mobile/android/geocoding/BoundingBox;", "getCountry", "lat", "", "lon", "contains", "", "geocoding_release"}, m87233k = 1, m87234mv = {1, 1, 13})
public final class Geocoder {
    private final Map<Object, BoundingBox> boxes;
    private final Map<Integer, Geocoding.Country> countries;
    private Geocoding.Feature[] features;

    @Metadata(m87230bv = {1, 0, 3}, m87233k = 3, m87234mv = {1, 1, 13})
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[Geocoding.Geometry.PackedCase.values().length];
            $EnumSwitchMapping$0 = iArr;
            Geocoding.Geometry.PackedCase packedCase = Geocoding.Geometry.PackedCase.MULTIPOLYGON;
            iArr[packedCase.ordinal()] = 1;
            Geocoding.Geometry.PackedCase packedCase2 = Geocoding.Geometry.PackedCase.POLYGON;
            iArr[packedCase2.ordinal()] = 2;
            int[] iArr2 = new int[Geocoding.Geometry.PackedCase.values().length];
            $EnumSwitchMapping$1 = iArr2;
            iArr2[packedCase.ordinal()] = 1;
            iArr2[packedCase2.ordinal()] = 2;
        }
    }

    public Geocoder(@NotNull InputStream inputStream, @NotNull InputStream inputStream2) {
        inputStream.getClass();
        inputStream2.getClass();
        this.countries = new LinkedHashMap();
        this.boxes = new LinkedHashMap();
        while (inputStream.available() > 0) {
            try {
                Geocoding.Country delimitedFrom = Geocoding.Country.parseDelimitedFrom(inputStream);
                this.countries.put(Integer.valueOf(delimitedFrom.getId()), delimitedFrom);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    CloseableKt.m87404a(inputStream, th);
                    throw th2;
                }
            }
        }
        Unit unit = Unit.INSTANCE;
        CloseableKt.m87404a(inputStream, null);
        try {
            ArrayList arrayList = new ArrayList();
            while (inputStream2.available() > 0) {
                arrayList.add(Geocoding.Feature.parseDelimitedFrom(inputStream2));
            }
            Object[] array = arrayList.toArray(new Geocoding.Feature[0]);
            if (array == null) {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            this.features = (Geocoding.Feature[]) array;
            Unit unit2 = Unit.INSTANCE;
            CloseableKt.m87404a(inputStream2, null);
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                CloseableKt.m87404a(inputStream2, th3);
                throw th4;
            }
        }
    }

    private final boolean contains(@NotNull Geocoding.Geometry geometry, float f, float f2) {
        Geocoding.Geometry.PackedCase packedCase = geometry.getPackedCase();
        if (packedCase != null) {
            int i = WhenMappings.$EnumSwitchMapping$0[packedCase.ordinal()];
            if (i == 1) {
                Geocoding.MultiPolygon multiPolygon = geometry.getMultiPolygon();
                multiPolygon.getClass();
                return contains(multiPolygon, f, f2);
            }
            if (i == 2) {
                Geocoding.Polygon polygon = geometry.getPolygon();
                polygon.getClass();
                return contains(polygon, f, f2);
            }
        }
        Geocoding.Ring ring = geometry.getRing();
        ring.getClass();
        return contains(ring, f, f2);
    }

    private final BoundingBox getBounding(@NotNull Geocoding.Geometry geometry) {
        Geocoding.Geometry.PackedCase packedCase = geometry.getPackedCase();
        if (packedCase != null) {
            int i = WhenMappings.$EnumSwitchMapping$1[packedCase.ordinal()];
            if (i == 1) {
                Geocoding.MultiPolygon multiPolygon = geometry.getMultiPolygon();
                multiPolygon.getClass();
                return getBounding(multiPolygon);
            }
            if (i == 2) {
                Geocoding.Polygon polygon = geometry.getPolygon();
                polygon.getClass();
                return getBounding(polygon);
            }
        }
        Geocoding.Ring ring = geometry.getRing();
        ring.getClass();
        return getBounding(ring);
    }

    @Nullable
    public final Geocoding.Country getCountry(float lat, float lon) {
        Geocoding.Feature feature;
        Map<Integer, Geocoding.Country> map = this.countries;
        Geocoding.Feature[] featureArr = this.features;
        if (featureArr == null) {
            Intrinsics.m87502r("features");
        }
        int length = featureArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                feature = null;
                break;
            }
            feature = featureArr[i];
            Geocoding.Geometry geometry = feature.getGeometry();
            geometry.getClass();
            if (contains(geometry, lat, lon)) {
                break;
            }
            i++;
        }
        return map.get(feature != null ? Integer.valueOf(feature.getCountry()) : null);
    }

    private final boolean contains(@NotNull Geocoding.MultiPolygon multiPolygon, float f, float f2) {
        if (!getBounding(multiPolygon).contains(f, f2)) {
            return false;
        }
        for (Geocoding.Geometry geometry : multiPolygon.getGeometriesList()) {
            geometry.getClass();
            if (contains(geometry, f, f2)) {
                return true;
            }
        }
        return false;
    }

    private final BoundingBox getBounding(@NotNull Geocoding.MultiPolygon multiPolygon) {
        BoundingBox boundingBox = this.boxes.get(multiPolygon);
        if (boundingBox == null) {
            boundingBox = new BoundingBox();
            List<Geocoding.Geometry> geometriesList = multiPolygon.getGeometriesList();
            geometriesList.getClass();
            for (Geocoding.Geometry geometry : geometriesList) {
                geometry.getClass();
                boundingBox.accept(getBounding(geometry));
            }
            this.boxes.put(multiPolygon, boundingBox);
        }
        return boundingBox;
    }

    private final boolean contains(@NotNull Geocoding.Polygon polygon, float f, float f2) {
        Geocoding.Ring ring = polygon.getRing();
        ring.getClass();
        if (contains(ring, f, f2)) {
            Geocoding.MultiPolygon holes = polygon.getHoles();
            if (!(holes != null ? contains(holes, f, f2) : false)) {
                return true;
            }
        }
        return false;
    }

    private final boolean contains(@NotNull Geocoding.Ring ring, float f, float f2) {
        return getBounding(ring).contains(f, f2) && GeocoderKt.pnpoly(ring, f, f2);
    }

    private final BoundingBox getBounding(@NotNull Geocoding.Polygon polygon) {
        Geocoding.Ring ring = polygon.getRing();
        ring.getClass();
        return getBounding(ring);
    }

    private final BoundingBox getBounding(@NotNull Geocoding.Ring ring) {
        BoundingBox boundingBox = this.boxes.get(ring);
        if (boundingBox != null) {
            return boundingBox;
        }
        BoundingBox boundingBox2 = new BoundingBox();
        List<Float> latitudeList = ring.getLatitudeList();
        latitudeList.getClass();
        List<Float> longitudeList = ring.getLongitudeList();
        longitudeList.getClass();
        boundingBox2.accept(latitudeList, longitudeList);
        this.boxes.put(ring, boundingBox2);
        return boundingBox2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Geocoder(@NotNull Context context) throws IOException {
        context.getClass();
        InputStream inputStreamOpen = context.getAssets().open("geocoding/countries");
        inputStreamOpen.getClass();
        InputStream inputStreamOpen2 = context.getAssets().open("geocoding/shapes");
        inputStreamOpen2.getClass();
        this(inputStreamOpen, inputStreamOpen2);
    }
}
