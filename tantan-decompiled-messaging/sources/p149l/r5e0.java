package p149l;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.extractor.flv.TagPayloadReader;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class r5e0 extends TagPayloadReader {

    /* JADX INFO: renamed from: b */
    public long f157814b;

    /* JADX INFO: renamed from: c */
    public long[] f157815c;

    /* JADX INFO: renamed from: d */
    public long[] f157816d;

    public r5e0() {
        super(new nee());
        this.f157814b = -9223372036854775807L;
        this.f157815c = new long[0];
        this.f157816d = new long[0];
    }

    /* JADX INFO: renamed from: g */
    public static Boolean m177931g(d860 d860Var) {
        return Boolean.valueOf(d860Var.m110279H() == 1);
    }

    @Nullable
    /* JADX INFO: renamed from: h */
    public static Object m177932h(d860 d860Var, int i) {
        if (i == 0) {
            return m177934j(d860Var);
        }
        if (i == 1) {
            return m177931g(d860Var);
        }
        if (i == 2) {
            return m177938n(d860Var);
        }
        if (i == 3) {
            return m177936l(d860Var);
        }
        if (i == 8) {
            return m177935k(d860Var);
        }
        if (i == 10) {
            return m177937m(d860Var);
        }
        if (i != 11) {
            return null;
        }
        return m177933i(d860Var);
    }

    /* JADX INFO: renamed from: i */
    public static Date m177933i(d860 d860Var) {
        Date date = new Date((long) m177934j(d860Var).doubleValue());
        d860Var.m110293V(2);
        return date;
    }

    /* JADX INFO: renamed from: j */
    public static Double m177934j(d860 d860Var) {
        return Double.valueOf(Double.longBitsToDouble(d860Var.m110272A()));
    }

    /* JADX INFO: renamed from: k */
    public static HashMap<String, Object> m177935k(d860 d860Var) {
        int iM110283L = d860Var.m110283L();
        HashMap<String, Object> map = new HashMap<>(iM110283L);
        for (int i = 0; i < iM110283L; i++) {
            String strM177938n = m177938n(d860Var);
            Object objM177932h = m177932h(d860Var, m177939o(d860Var));
            if (objM177932h != null) {
                map.put(strM177938n, objM177932h);
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: l */
    public static HashMap<String, Object> m177936l(d860 d860Var) {
        HashMap<String, Object> map = new HashMap<>();
        while (true) {
            String strM177938n = m177938n(d860Var);
            int iM177939o = m177939o(d860Var);
            if (iM177939o == 9) {
                return map;
            }
            Object objM177932h = m177932h(d860Var, iM177939o);
            if (objM177932h != null) {
                map.put(strM177938n, objM177932h);
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public static ArrayList<Object> m177937m(d860 d860Var) {
        int iM110283L = d860Var.m110283L();
        ArrayList<Object> arrayList = new ArrayList<>(iM110283L);
        for (int i = 0; i < iM110283L; i++) {
            Object objM177932h = m177932h(d860Var, m177939o(d860Var));
            if (objM177932h != null) {
                arrayList.add(objM177932h);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: n */
    public static String m177938n(d860 d860Var) {
        int iM110285N = d860Var.m110285N();
        int iM110300f = d860Var.m110300f();
        d860Var.m110293V(iM110285N);
        return new String(d860Var.m110299e(), iM110300f, iM110285N);
    }

    /* JADX INFO: renamed from: o */
    public static int m177939o(d860 d860Var) {
        return d860Var.m110279H();
    }

    @Override // com.google.android.exoplayer2.extractor.flv.TagPayloadReader
    /* JADX INFO: renamed from: b */
    public boolean mo9982b(d860 d860Var) {
        return true;
    }

    @Override // com.google.android.exoplayer2.extractor.flv.TagPayloadReader
    /* JADX INFO: renamed from: c */
    public boolean mo9983c(d860 d860Var, long j) {
        if (m177939o(d860Var) != 2 || !"onMetaData".equals(m177938n(d860Var)) || d860Var.m110295a() == 0 || m177939o(d860Var) != 8) {
            return false;
        }
        HashMap<String, Object> mapM177935k = m177935k(d860Var);
        Object obj = mapM177935k.get(BLiveOperationTitleShowType.duration);
        if (obj instanceof Double) {
            double dDoubleValue = ((Double) obj).doubleValue();
            if (dDoubleValue > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                this.f157814b = (long) (dDoubleValue * 1000000.0d);
            }
        }
        Object obj2 = mapM177935k.get("keyframes");
        if (obj2 instanceof Map) {
            Map map = (Map) obj2;
            Object obj3 = map.get("filepositions");
            Object obj4 = map.get("times");
            if ((obj3 instanceof List) && (obj4 instanceof List)) {
                List list = (List) obj3;
                List list2 = (List) obj4;
                int size = list2.size();
                this.f157815c = new long[size];
                this.f157816d = new long[size];
                for (int i = 0; i < size; i++) {
                    Object obj5 = list.get(i);
                    Object obj6 = list2.get(i);
                    if (!(obj6 instanceof Double) || !(obj5 instanceof Double)) {
                        this.f157815c = new long[0];
                        this.f157816d = new long[0];
                        break;
                    }
                    this.f157815c[i] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                    this.f157816d[i] = ((Double) obj5).longValue();
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public long m177940d() {
        return this.f157814b;
    }

    /* JADX INFO: renamed from: e */
    public long[] m177941e() {
        return this.f157816d;
    }

    /* JADX INFO: renamed from: f */
    public long[] m177942f() {
        return this.f157815c;
    }
}
