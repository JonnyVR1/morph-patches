package p153l;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.extractor.flv.TagPayloadReader;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class wde0 extends TagPayloadReader {

    /* JADX INFO: renamed from: b */
    public long f188543b;

    /* JADX INFO: renamed from: c */
    public long[] f188544c;

    /* JADX INFO: renamed from: d */
    public long[] f188545d;

    public wde0() {
        super(new rfe());
        this.f188543b = -9223372036854775807L;
        this.f188544c = new long[0];
        this.f188545d = new long[0];
    }

    /* JADX INFO: renamed from: g */
    public static Boolean m205855g(ig60 ig60Var) {
        return Boolean.valueOf(ig60Var.m139795H() == 1);
    }

    @Nullable
    /* JADX INFO: renamed from: h */
    public static Object m205856h(ig60 ig60Var, int i) {
        if (i == 0) {
            return m205858j(ig60Var);
        }
        if (i == 1) {
            return m205855g(ig60Var);
        }
        if (i == 2) {
            return m205862n(ig60Var);
        }
        if (i == 3) {
            return m205860l(ig60Var);
        }
        if (i == 8) {
            return m205859k(ig60Var);
        }
        if (i == 10) {
            return m205861m(ig60Var);
        }
        if (i != 11) {
            return null;
        }
        return m205857i(ig60Var);
    }

    /* JADX INFO: renamed from: i */
    public static Date m205857i(ig60 ig60Var) {
        Date date = new Date((long) m205858j(ig60Var).doubleValue());
        ig60Var.m139809V(2);
        return date;
    }

    /* JADX INFO: renamed from: j */
    public static Double m205858j(ig60 ig60Var) {
        return Double.valueOf(Double.longBitsToDouble(ig60Var.m139788A()));
    }

    /* JADX INFO: renamed from: k */
    public static HashMap<String, Object> m205859k(ig60 ig60Var) {
        int iM139799L = ig60Var.m139799L();
        HashMap<String, Object> map = new HashMap<>(iM139799L);
        for (int i = 0; i < iM139799L; i++) {
            String strM205862n = m205862n(ig60Var);
            Object objM205856h = m205856h(ig60Var, m205863o(ig60Var));
            if (objM205856h != null) {
                map.put(strM205862n, objM205856h);
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: l */
    public static HashMap<String, Object> m205860l(ig60 ig60Var) {
        HashMap<String, Object> map = new HashMap<>();
        while (true) {
            String strM205862n = m205862n(ig60Var);
            int iM205863o = m205863o(ig60Var);
            if (iM205863o == 9) {
                return map;
            }
            Object objM205856h = m205856h(ig60Var, iM205863o);
            if (objM205856h != null) {
                map.put(strM205862n, objM205856h);
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public static ArrayList<Object> m205861m(ig60 ig60Var) {
        int iM139799L = ig60Var.m139799L();
        ArrayList<Object> arrayList = new ArrayList<>(iM139799L);
        for (int i = 0; i < iM139799L; i++) {
            Object objM205856h = m205856h(ig60Var, m205863o(ig60Var));
            if (objM205856h != null) {
                arrayList.add(objM205856h);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: n */
    public static String m205862n(ig60 ig60Var) {
        int iM139801N = ig60Var.m139801N();
        int iM139816f = ig60Var.m139816f();
        ig60Var.m139809V(iM139801N);
        return new String(ig60Var.m139815e(), iM139816f, iM139801N);
    }

    /* JADX INFO: renamed from: o */
    public static int m205863o(ig60 ig60Var) {
        return ig60Var.m139795H();
    }

    @Override // com.google.android.exoplayer2.extractor.flv.TagPayloadReader
    /* JADX INFO: renamed from: b */
    public boolean mo10036b(ig60 ig60Var) {
        return true;
    }

    @Override // com.google.android.exoplayer2.extractor.flv.TagPayloadReader
    /* JADX INFO: renamed from: c */
    public boolean mo10037c(ig60 ig60Var, long j) {
        if (m205863o(ig60Var) != 2 || !"onMetaData".equals(m205862n(ig60Var)) || ig60Var.m139811a() == 0 || m205863o(ig60Var) != 8) {
            return false;
        }
        HashMap<String, Object> mapM205859k = m205859k(ig60Var);
        Object obj = mapM205859k.get(BLiveOperationTitleShowType.duration);
        if (obj instanceof Double) {
            double dDoubleValue = ((Double) obj).doubleValue();
            if (dDoubleValue > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                this.f188543b = (long) (dDoubleValue * 1000000.0d);
            }
        }
        Object obj2 = mapM205859k.get("keyframes");
        if (obj2 instanceof Map) {
            Map map = (Map) obj2;
            Object obj3 = map.get("filepositions");
            Object obj4 = map.get("times");
            if ((obj3 instanceof List) && (obj4 instanceof List)) {
                List list = (List) obj3;
                List list2 = (List) obj4;
                int size = list2.size();
                this.f188544c = new long[size];
                this.f188545d = new long[size];
                for (int i = 0; i < size; i++) {
                    Object obj5 = list.get(i);
                    Object obj6 = list2.get(i);
                    if (!(obj6 instanceof Double) || !(obj5 instanceof Double)) {
                        this.f188544c = new long[0];
                        this.f188545d = new long[0];
                        break;
                    }
                    this.f188544c[i] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                    this.f188545d[i] = ((Double) obj5).longValue();
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public long m205864d() {
        return this.f188543b;
    }

    /* JADX INFO: renamed from: e */
    public long[] m205865e() {
        return this.f188545d;
    }

    /* JADX INFO: renamed from: f */
    public long[] m205866f() {
        return this.f188544c;
    }
}
