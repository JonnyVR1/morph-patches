package p149l;

import android.net.NetworkInfo;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public class hkq0 {

    /* JADX INFO: renamed from: a */
    private final NetworkInfo f108261a;

    /* JADX INFO: renamed from: b */
    private final ConcurrentHashMap<String, Object> f108262b = new ConcurrentHashMap<>();

    public hkq0(NetworkInfo networkInfo) {
        this.f108261a = networkInfo;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0093  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: d */
    private <T> T m131577d(String str) {
        Object objValueOf;
        if (!this.f108262b.containsKey(str)) {
            synchronized (str) {
                try {
                    if (!this.f108262b.contains(str)) {
                        switch (str.hashCode()) {
                            case -830707388:
                                if (!str.equals("getSubtype")) {
                                    objValueOf = null;
                                } else {
                                    objValueOf = Integer.valueOf(this.f108261a.getSubtype());
                                }
                                break;
                            case -75106384:
                                if (!str.equals("getType")) {
                                    objValueOf = null;
                                } else {
                                    objValueOf = Integer.valueOf(this.f108261a.getType());
                                }
                                break;
                            case -66906641:
                                if (!str.equals("getSubtypeName")) {
                                    objValueOf = null;
                                } else {
                                    objValueOf = this.f108261a.getSubtypeName();
                                }
                                break;
                            case 599209215:
                                if (!str.equals("isConnected")) {
                                    objValueOf = null;
                                } else {
                                    objValueOf = Boolean.valueOf(this.f108261a.isConnected());
                                }
                                break;
                            case 711698955:
                                if (!str.equals("getDetailedState")) {
                                    objValueOf = null;
                                } else {
                                    objValueOf = this.f108261a.getDetailedState();
                                }
                                break;
                            case 1401392731:
                                if (!str.equals("getTypeName")) {
                                    objValueOf = null;
                                } else {
                                    objValueOf = this.f108261a.getTypeName();
                                }
                                break;
                            case 1965583067:
                                if (!str.equals("getState")) {
                                    objValueOf = null;
                                } else {
                                    objValueOf = this.f108261a.getState();
                                }
                                break;
                            default:
                                objValueOf = null;
                                break;
                        }
                        if (objValueOf != null) {
                            this.f108262b.put(str, objValueOf);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return (T) this.f108262b.get(str);
    }

    /* JADX INFO: renamed from: a */
    public int m131578a() {
        return ((Integer) m131577d("getType")).intValue();
    }

    /* JADX INFO: renamed from: b */
    public NetworkInfo.DetailedState m131579b() {
        return (NetworkInfo.DetailedState) m131577d("getDetailedState");
    }

    /* JADX INFO: renamed from: c */
    public NetworkInfo.State m131580c() {
        return (NetworkInfo.State) m131577d("getState");
    }

    /* JADX INFO: renamed from: e */
    public String m131581e() {
        return (String) m131577d("getTypeName");
    }

    /* JADX INFO: renamed from: f */
    public boolean m131582f() {
        return ((Boolean) m131577d("isConnected")).booleanValue();
    }

    /* JADX INFO: renamed from: g */
    public int m131583g() {
        return ((Integer) m131577d("getSubtype")).intValue();
    }

    /* JADX INFO: renamed from: h */
    public String m131584h() {
        return (String) m131577d("getSubtypeName");
    }
}
