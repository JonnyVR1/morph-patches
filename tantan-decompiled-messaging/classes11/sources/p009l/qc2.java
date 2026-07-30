package p009l;

import com.baidu.mapapi.model.LatLng;
import com.baidu.mapapi.utils.CoordinateConverter;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class qc2 {
    /* JADX INFO: renamed from: a */
    public static LatLng m20851a(LatLng latLng) {
        double d = latLng.longitude - 0.0065d;
        double d2 = latLng.latitude - 0.006d;
        double dSqrt = Math.sqrt((d * d) + (d2 * d2)) - (Math.sin(d2 * 52.35987755982988d) * 2.0E-5d);
        double dAtan2 = Math.atan2(d2, d) - (Math.cos(d * 52.35987755982988d) * 3.0E-6d);
        LatLng latLng2 = new LatLng(Math.sin(dAtan2) * dSqrt, dSqrt * Math.cos(dAtan2));
        zep0 zep0VarM17786c = new lbj(latLng2.latitude, latLng2.longitude).m17786c();
        return new LatLng(zep0VarM17786c.m17544a(), zep0VarM17786c.m17545b());
    }

    /* JADX INFO: renamed from: b */
    public static LatLng m20852b(LatLng latLng) {
        lbj lbjVarM25763c = new zep0(latLng.latitude, latLng.longitude).m25763c();
        LatLng latLng2 = new LatLng(lbjVarM25763c.m17544a(), lbjVarM25763c.m17545b());
        CoordinateConverter coordinateConverter = new CoordinateConverter();
        coordinateConverter.from(CoordinateConverter.CoordType.COMMON);
        coordinateConverter.coord(latLng2);
        return coordinateConverter.convert();
    }
}
