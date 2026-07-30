package p149l;

import com.baidu.mapapi.model.LatLng;
import com.baidu.mapapi.utils.CoordinateConverter;

/* JADX INFO: loaded from: classes11.dex */
public class qc2 {
    /* JADX INFO: renamed from: a */
    public static LatLng m173859a(LatLng latLng) {
        double d = latLng.longitude - 0.0065d;
        double d2 = latLng.latitude - 0.006d;
        double dSqrt = Math.sqrt((d * d) + (d2 * d2)) - (Math.sin(d2 * 52.35987755982988d) * 2.0E-5d);
        double dAtan2 = Math.atan2(d2, d) - (Math.cos(d * 52.35987755982988d) * 3.0E-6d);
        LatLng latLng2 = new LatLng(Math.sin(dAtan2) * dSqrt, dSqrt * Math.cos(dAtan2));
        zep0 zep0VarM149229c = new lbj(latLng2.latitude, latLng2.longitude).m149229c();
        return new LatLng(zep0VarM149229c.m146236a(), zep0VarM149229c.m146237b());
    }

    /* JADX INFO: renamed from: b */
    public static LatLng m173860b(LatLng latLng) {
        lbj lbjVarM218386c = new zep0(latLng.latitude, latLng.longitude).m218386c();
        LatLng latLng2 = new LatLng(lbjVarM218386c.m146236a(), lbjVarM218386c.m146237b());
        CoordinateConverter coordinateConverter = new CoordinateConverter();
        coordinateConverter.from(CoordinateConverter.CoordType.COMMON);
        coordinateConverter.coord(latLng2);
        return coordinateConverter.convert();
    }
}
