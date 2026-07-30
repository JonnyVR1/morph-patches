package p149l;

import androidx.annotation.Nullable;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class c9r0 extends d9r0 {

    /* JADX INFO: renamed from: b */
    public long f79961b;

    /* JADX INFO: renamed from: c */
    public long[] f79962c;

    /* JADX INFO: renamed from: d */
    public long[] f79963d;

    public c9r0() {
        super(new i5r0());
        this.f79961b = -9223372036854775807L;
        this.f79962c = new long[0];
        this.f79963d = new long[0];
    }

    /* JADX INFO: renamed from: g */
    public static Double m105899g(v6w0 v6w0Var) {
        return Double.valueOf(Double.longBitsToDouble(v6w0Var.m197245I()));
    }

    @Nullable
    /* JADX INFO: renamed from: h */
    public static Object m105900h(v6w0 v6w0Var, int i) {
        if (i == 0) {
            return m105899g(v6w0Var);
        }
        if (i == 1) {
            return Boolean.valueOf(v6w0Var.m197238B() == 1);
        }
        if (i == 2) {
            return m105901i(v6w0Var);
        }
        if (i != 3) {
            if (i == 8) {
                return m105902j(v6w0Var);
            }
            if (i != 10) {
                if (i != 11) {
                    return null;
                }
                Date date = new Date((long) m105899g(v6w0Var).doubleValue());
                v6w0Var.m197263l(2);
                return date;
            }
            int iM197241E = v6w0Var.m197241E();
            ArrayList arrayList = new ArrayList(iM197241E);
            for (int i2 = 0; i2 < iM197241E; i2++) {
                Object objM105900h = m105900h(v6w0Var, v6w0Var.m197238B());
                if (objM105900h != null) {
                    arrayList.add(objM105900h);
                }
            }
            return arrayList;
        }
        HashMap map = new HashMap();
        while (true) {
            String strM105901i = m105901i(v6w0Var);
            int iM197238B = v6w0Var.m197238B();
            if (iM197238B == 9) {
                return map;
            }
            Object objM105900h2 = m105900h(v6w0Var, iM197238B);
            if (objM105900h2 != null) {
                map.put(strM105901i, objM105900h2);
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public static String m105901i(v6w0 v6w0Var) {
        int iM197242F = v6w0Var.m197242F();
        int iM197270s = v6w0Var.m197270s();
        v6w0Var.m197263l(iM197242F);
        return new String(v6w0Var.m197264m(), iM197270s, iM197242F);
    }

    /* JADX INFO: renamed from: j */
    public static HashMap m105902j(v6w0 v6w0Var) {
        int iM197241E = v6w0Var.m197241E();
        HashMap map = new HashMap(iM197241E);
        for (int i = 0; i < iM197241E; i++) {
            String strM105901i = m105901i(v6w0Var);
            Object objM105900h = m105900h(v6w0Var, v6w0Var.m197238B());
            if (objM105900h != null) {
                map.put(strM105901i, objM105900h);
            }
        }
        return map;
    }

    @Override // p149l.d9r0
    /* JADX INFO: renamed from: a */
    public final boolean mo105903a(v6w0 v6w0Var) {
        return true;
    }

    @Override // p149l.d9r0
    /* JADX INFO: renamed from: b */
    public final boolean mo105904b(v6w0 v6w0Var, long j) {
        if (v6w0Var.m197238B() == 2 && "onMetaData".equals(m105901i(v6w0Var)) && v6w0Var.m197268q() != 0 && v6w0Var.m197238B() == 8) {
            HashMap mapM105902j = m105902j(v6w0Var);
            Object obj = mapM105902j.get(BLiveOperationTitleShowType.duration);
            if (obj instanceof Double) {
                double dDoubleValue = ((Double) obj).doubleValue();
                if (dDoubleValue > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                    this.f79961b = (long) (dDoubleValue * 1000000.0d);
                }
            }
            Object obj2 = mapM105902j.get("keyframes");
            if (obj2 instanceof Map) {
                Map map = (Map) obj2;
                Object obj3 = map.get("filepositions");
                Object obj4 = map.get("times");
                if ((obj3 instanceof List) && (obj4 instanceof List)) {
                    List list = (List) obj3;
                    List list2 = (List) obj4;
                    int size = list2.size();
                    this.f79962c = new long[size];
                    this.f79963d = new long[size];
                    for (int i = 0; i < size; i++) {
                        Object obj5 = list.get(i);
                        Object obj6 = list2.get(i);
                        if (!(obj6 instanceof Double) || !(obj5 instanceof Double)) {
                            this.f79962c = new long[0];
                            this.f79963d = new long[0];
                            break;
                        }
                        this.f79962c[i] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                        this.f79963d[i] = ((Double) obj5).longValue();
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public final long m105905d() {
        return this.f79961b;
    }

    /* JADX INFO: renamed from: e */
    public final long[] m105906e() {
        return this.f79963d;
    }

    /* JADX INFO: renamed from: f */
    public final long[] m105907f() {
        return this.f79962c;
    }
}
