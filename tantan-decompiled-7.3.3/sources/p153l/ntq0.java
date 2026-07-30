package p153l;

import android.net.NetworkInfo;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public class ntq0 {

    /* JADX INFO: renamed from: a */
    private final NetworkInfo f143627a;

    /* JADX INFO: renamed from: b */
    private final ConcurrentHashMap<String, Object> f143628b = new ConcurrentHashMap<>();

    public ntq0(NetworkInfo networkInfo) {
        this.f143627a = networkInfo;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0093  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: d */
    private <T> T m164749d(String str) {
        Object objValueOf;
        if (!this.f143628b.containsKey(str)) {
            synchronized (str) {
                try {
                    if (!this.f143628b.contains(str)) {
                        switch (str.hashCode()) {
                            case -830707388:
                                if (!str.equals("getSubtype")) {
                                    objValueOf = null;
                                } else {
                                    objValueOf = Integer.valueOf(this.f143627a.getSubtype());
                                }
                                break;
                            case -75106384:
                                if (!str.equals("getType")) {
                                    objValueOf = null;
                                } else {
                                    objValueOf = Integer.valueOf(this.f143627a.getType());
                                }
                                break;
                            case -66906641:
                                if (!str.equals("getSubtypeName")) {
                                    objValueOf = null;
                                } else {
                                    objValueOf = this.f143627a.getSubtypeName();
                                }
                                break;
                            case 599209215:
                                if (!str.equals("isConnected")) {
                                    objValueOf = null;
                                } else {
                                    objValueOf = Boolean.valueOf(this.f143627a.isConnected());
                                }
                                break;
                            case 711698955:
                                if (!str.equals("getDetailedState")) {
                                    objValueOf = null;
                                } else {
                                    objValueOf = this.f143627a.getDetailedState();
                                }
                                break;
                            case 1401392731:
                                if (!str.equals("getTypeName")) {
                                    objValueOf = null;
                                } else {
                                    objValueOf = this.f143627a.getTypeName();
                                }
                                break;
                            case 1965583067:
                                if (!str.equals("getState")) {
                                    objValueOf = null;
                                } else {
                                    objValueOf = this.f143627a.getState();
                                }
                                break;
                            default:
                                objValueOf = null;
                                break;
                        }
                        if (objValueOf != null) {
                            this.f143628b.put(str, objValueOf);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return (T) this.f143628b.get(str);
    }

    /* JADX INFO: renamed from: a */
    public int m164750a() {
        return ((Integer) m164749d("getType")).intValue();
    }

    /* JADX INFO: renamed from: b */
    public NetworkInfo.DetailedState m164751b() {
        return (NetworkInfo.DetailedState) m164749d("getDetailedState");
    }

    /* JADX INFO: renamed from: c */
    public NetworkInfo.State m164752c() {
        return (NetworkInfo.State) m164749d("getState");
    }

    /* JADX INFO: renamed from: e */
    public String m164753e() {
        return (String) m164749d("getTypeName");
    }

    /* JADX INFO: renamed from: f */
    public boolean m164754f() {
        return ((Boolean) m164749d("isConnected")).booleanValue();
    }

    /* JADX INFO: renamed from: g */
    public int m164755g() {
        return ((Integer) m164749d("getSubtype")).intValue();
    }

    /* JADX INFO: renamed from: h */
    public String m164756h() {
        return (String) m164749d("getSubtypeName");
    }
}
