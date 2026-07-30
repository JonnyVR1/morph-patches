package com.p000p1.mobile.putong.core.util;

import com.p1.mobile.putong.location.Location;
import java.util.List;
import l.knb0;
import l.vwb;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'tokyo_new' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:399)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:364)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:349)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:315)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:288)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public final class CityAreaScope {
    private static final /* synthetic */ CityAreaScope[] $VALUES;
    public static final CityAreaScope kanagawa_new;
    public static final CityAreaScope osaka_new;
    public static final CityAreaScope tokyo_first;
    public static final CityAreaScope tokyo_new;
    private String activeCity;
    private List<knb0<Double, Double, Double, Double>> areas;
    private String cityNameEn;
    private String cityNameZh;
    private String eventName;
    public static final CityAreaScope seoul = new CityAreaScope("seoul", 0, "首尔", "Seoul", "seoul", "active_in_kr_seoul", vwb.Z(Double.valueOf(37.621d), Double.valueOf(37.4718d), Double.valueOf(126.9064d), Double.valueOf(127.1158d)));
    public static final CityAreaScope daegu = new CityAreaScope("daegu", 1, "大邱广域市", "Daegu", "daegu", "active_in_kr_daegu", vwb.Z(Double.valueOf(35.9343d), Double.valueOf(35.7488d), Double.valueOf(128.4378d), Double.valueOf(128.6828d)));
    public static final CityAreaScope busan = new CityAreaScope("busan", 2, "釜山", "Busan", "busan", "active_in_kr_busan", vwb.Z(Double.valueOf(35.2294d), Double.valueOf(35.0649d), Double.valueOf(128.9866d), Double.valueOf(129.1823d)));
    public static final CityAreaScope tokyo = new CityAreaScope("tokyo", 3, "東京(年轻人聚集区）", "Tokyo", "tokyo", "active_in_jp_tokyo", vwb.Z(Double.valueOf(35.7893d), Double.valueOf(35.5446d), Double.valueOf(139.6377d), Double.valueOf(139.9007d)));
    public static final CityAreaScope kanagawa = new CityAreaScope("kanagawa", 4, "神奈川縣(年轻人聚集区）", "Kanagawa", "kanagawa", "active_in_jp_kanagawa", vwb.f0(new knb0[]{vwb.Z(Double.valueOf(35.6008d), Double.valueOf(35.467d), Double.valueOf(139.2293d), Double.valueOf(139.4747d)), vwb.Z(Double.valueOf(35.6412d), Double.valueOf(35.3037d), Double.valueOf(139.4704d), Double.valueOf(139.7361d)), vwb.Z(Double.valueOf(35.333d), Double.valueOf(35.2574d), Double.valueOf(139.0973d), Double.valueOf(139.2243d))}));

    private static /* synthetic */ CityAreaScope[] $values() {
        return new CityAreaScope[]{seoul, daegu, busan, tokyo, kanagawa, tokyo_new, osaka_new, kanagawa_new, tokyo_first};
    }

    static {
        Double dValueOf = Double.valueOf(35.8d);
        Double dValueOf2 = Double.valueOf(35.54d);
        Double dValueOf3 = Double.valueOf(139.57d);
        Double dValueOf4 = Double.valueOf(139.87d);
        tokyo_new = new CityAreaScope("tokyo_new", 5, "东京_新", "Tokyo_new", "Tokyo_new", "active_in_JP_Tokyo_new", vwb.Z(dValueOf, dValueOf2, dValueOf3, dValueOf4));
        osaka_new = new CityAreaScope("osaka_new", 6, "大阪府", "Osaka_new", "Osaka_new", "active_in_JP_Osaka_new", vwb.Z(Double.valueOf(34.72d), Double.valueOf(34.59d), Double.valueOf(135.42d), Double.valueOf(135.58d)));
        kanagawa_new = new CityAreaScope("kanagawa_new", 7, "神奈川_新", "Kanagawa_new", "Kanagawa_new", "active_in_JP_Kanagawa_new", vwb.Z(Double.valueOf(35.6d), Double.valueOf(35.31d), Double.valueOf(139.25d), Double.valueOf(139.7d)));
        tokyo_first = new CityAreaScope("tokyo_first", 8, "东京_首次活跃", "Tokyo_new_only_once_in_lifetime", "Tokyo_new_only_once_in_lifetime", "first_active_in_JP_Tokyo_new", vwb.Z(dValueOf, dValueOf2, dValueOf3, dValueOf4));
        $VALUES = $values();
    }

    private CityAreaScope(String str, int i, String str2, String str3, String str4, String str5, List list) {
        super(str, i);
        this.cityNameZh = str2;
        this.cityNameEn = str3;
        this.activeCity = str4;
        this.eventName = str5;
        this.areas = list;
    }

    public static List<CityAreaScope> getAllCheckCityAreas() {
        return vwb.f0(new CityAreaScope[]{seoul, daegu, busan, tokyo, kanagawa});
    }

    public static List<CityAreaScope> getAllCheckCityAreasV2() {
        return vwb.f0(new CityAreaScope[]{tokyo_new, osaka_new, kanagawa_new});
    }

    public static CityAreaScope valueOf(String str) {
        return (CityAreaScope) Enum.valueOf(CityAreaScope.class, str);
    }

    public static CityAreaScope[] values() {
        return (CityAreaScope[]) $VALUES.clone();
    }

    public boolean cover(Location location) {
        double dU = location.u();
        double dX = location.x();
        for (knb0<Double, Double, Double, Double> knb0Var : this.areas) {
            if (dU >= ((Double) knb0Var.b).doubleValue() && dU <= ((Double) knb0Var.a).doubleValue() && dX >= ((Double) knb0Var.c).doubleValue() && dX <= ((Double) knb0Var.d).doubleValue()) {
                return true;
            }
        }
        return false;
    }

    public String getActiveCity() {
        return this.activeCity;
    }

    public String getEventName() {
        return this.eventName;
    }

    private CityAreaScope(String str, int i, String str2, String str3, String str4, String str5, knb0 knb0Var) {
        this(str, i, str2, str3, str4, str5, vwb.M(knb0Var));
    }
}
