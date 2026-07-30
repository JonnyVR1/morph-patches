package p153l;

import androidx.annotation.Nullable;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class iir0 extends jir0 {

    /* JADX INFO: renamed from: b */
    public long f115119b;

    /* JADX INFO: renamed from: c */
    public long[] f115120c;

    /* JADX INFO: renamed from: d */
    public long[] f115121d;

    public iir0() {
        super(new oer0());
        this.f115119b = -9223372036854775807L;
        this.f115120c = new long[0];
        this.f115121d = new long[0];
    }

    /* JADX INFO: renamed from: g */
    public static Double m140073g(bgw0 bgw0Var) {
        return Double.valueOf(Double.longBitsToDouble(bgw0Var.m104252I()));
    }

    @Nullable
    /* JADX INFO: renamed from: h */
    public static Object m140074h(bgw0 bgw0Var, int i) {
        if (i == 0) {
            return m140073g(bgw0Var);
        }
        if (i == 1) {
            return Boolean.valueOf(bgw0Var.m104245B() == 1);
        }
        if (i == 2) {
            return m140075i(bgw0Var);
        }
        if (i != 3) {
            if (i == 8) {
                return m140076j(bgw0Var);
            }
            if (i != 10) {
                if (i != 11) {
                    return null;
                }
                Date date = new Date((long) m140073g(bgw0Var).doubleValue());
                bgw0Var.m104270l(2);
                return date;
            }
            int iM104248E = bgw0Var.m104248E();
            ArrayList arrayList = new ArrayList(iM104248E);
            for (int i2 = 0; i2 < iM104248E; i2++) {
                Object objM140074h = m140074h(bgw0Var, bgw0Var.m104245B());
                if (objM140074h != null) {
                    arrayList.add(objM140074h);
                }
            }
            return arrayList;
        }
        HashMap map = new HashMap();
        while (true) {
            String strM140075i = m140075i(bgw0Var);
            int iM104245B = bgw0Var.m104245B();
            if (iM104245B == 9) {
                return map;
            }
            Object objM140074h2 = m140074h(bgw0Var, iM104245B);
            if (objM140074h2 != null) {
                map.put(strM140075i, objM140074h2);
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public static String m140075i(bgw0 bgw0Var) {
        int iM104249F = bgw0Var.m104249F();
        int iM104277s = bgw0Var.m104277s();
        bgw0Var.m104270l(iM104249F);
        return new String(bgw0Var.m104271m(), iM104277s, iM104249F);
    }

    /* JADX INFO: renamed from: j */
    public static HashMap m140076j(bgw0 bgw0Var) {
        int iM104248E = bgw0Var.m104248E();
        HashMap map = new HashMap(iM104248E);
        for (int i = 0; i < iM104248E; i++) {
            String strM140075i = m140075i(bgw0Var);
            Object objM140074h = m140074h(bgw0Var, bgw0Var.m104245B());
            if (objM140074h != null) {
                map.put(strM140075i, objM140074h);
            }
        }
        return map;
    }

    @Override // p153l.jir0
    /* JADX INFO: renamed from: a */
    public final boolean mo125712a(bgw0 bgw0Var) {
        return true;
    }

    @Override // p153l.jir0
    /* JADX INFO: renamed from: b */
    public final boolean mo125713b(bgw0 bgw0Var, long j) {
        if (bgw0Var.m104245B() == 2 && "onMetaData".equals(m140075i(bgw0Var)) && bgw0Var.m104275q() != 0 && bgw0Var.m104245B() == 8) {
            HashMap mapM140076j = m140076j(bgw0Var);
            Object obj = mapM140076j.get(BLiveOperationTitleShowType.duration);
            if (obj instanceof Double) {
                double dDoubleValue = ((Double) obj).doubleValue();
                if (dDoubleValue > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                    this.f115119b = (long) (dDoubleValue * 1000000.0d);
                }
            }
            Object obj2 = mapM140076j.get("keyframes");
            if (obj2 instanceof Map) {
                Map map = (Map) obj2;
                Object obj3 = map.get("filepositions");
                Object obj4 = map.get("times");
                if ((obj3 instanceof List) && (obj4 instanceof List)) {
                    List list = (List) obj3;
                    List list2 = (List) obj4;
                    int size = list2.size();
                    this.f115120c = new long[size];
                    this.f115121d = new long[size];
                    for (int i = 0; i < size; i++) {
                        Object obj5 = list.get(i);
                        Object obj6 = list2.get(i);
                        if (!(obj6 instanceof Double) || !(obj5 instanceof Double)) {
                            this.f115120c = new long[0];
                            this.f115121d = new long[0];
                            break;
                        }
                        this.f115120c[i] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                        this.f115121d[i] = ((Double) obj5).longValue();
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public final long m140077d() {
        return this.f115119b;
    }

    /* JADX INFO: renamed from: e */
    public final long[] m140078e() {
        return this.f115121d;
    }

    /* JADX INFO: renamed from: f */
    public final long[] m140079f() {
        return this.f115120c;
    }
}
