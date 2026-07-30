package p153l;

import com.baidu.mapapi.model.LatLng;
import com.baidu.mapapi.utils.CoordinateConverter;

/* JADX INFO: loaded from: classes10.dex */
public class xc2 {
    /* JADX INFO: renamed from: a */
    public static LatLng m210087a(LatLng latLng) {
        double d = latLng.longitude - 0.0065d;
        double d2 = latLng.latitude - 0.006d;
        double dSqrt = Math.sqrt((d * d) + (d2 * d2)) - (Math.sin(d2 * 52.35987755982988d) * 2.0E-5d);
        double dAtan2 = Math.atan2(d2, d) - (Math.cos(d * 52.35987755982988d) * 3.0E-6d);
        LatLng latLng2 = new LatLng(Math.sin(dAtan2) * dSqrt, dSqrt * Math.cos(dAtan2));
        dop0 dop0VarM125310c = new fej(latLng2.latitude, latLng2.longitude).m125310c();
        return new LatLng(dop0VarM125310c.m116960a(), dop0VarM125310c.m116961b());
    }

    /* JADX INFO: renamed from: b */
    public static LatLng m210088b(LatLng latLng) {
        fej fejVarM117359c = new dop0(latLng.latitude, latLng.longitude).m117359c();
        LatLng latLng2 = new LatLng(fejVarM117359c.m116960a(), fejVarM117359c.m116961b());
        CoordinateConverter coordinateConverter = new CoordinateConverter();
        coordinateConverter.from(CoordinateConverter.CoordType.COMMON);
        coordinateConverter.coord(latLng2);
        return coordinateConverter.convert();
    }
}
