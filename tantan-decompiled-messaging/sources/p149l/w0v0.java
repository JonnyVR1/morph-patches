package p149l;

import android.content.Context;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.util.SparseArray;
import com.google.android.gms.internal.ads.C2193m0;
import com.google.android.gms.internal.ads.C2209o0;
import com.google.android.gms.internal.ads.zzbec;
import com.p046p1.mobile.putong.data.Device;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class w0v0 extends x0v0 {

    /* JADX INFO: renamed from: h */
    public static final SparseArray f183953h;

    /* JADX INFO: renamed from: c */
    public final Context f183954c;

    /* JADX INFO: renamed from: d */
    public final gwt0 f183955d;

    /* JADX INFO: renamed from: e */
    public final TelephonyManager f183956e;

    /* JADX INFO: renamed from: f */
    public final o0v0 f183957f;

    /* JADX INFO: renamed from: g */
    public int f183958g;

    static {
        SparseArray sparseArray = new SparseArray();
        f183953h = sparseArray;
        sparseArray.put(NetworkInfo.DetailedState.CONNECTED.ordinal(), zzbec.CONNECTED);
        int iOrdinal = NetworkInfo.DetailedState.AUTHENTICATING.ordinal();
        zzbec zzbecVar = zzbec.CONNECTING;
        sparseArray.put(iOrdinal, zzbecVar);
        sparseArray.put(NetworkInfo.DetailedState.CONNECTING.ordinal(), zzbecVar);
        sparseArray.put(NetworkInfo.DetailedState.OBTAINING_IPADDR.ordinal(), zzbecVar);
        sparseArray.put(NetworkInfo.DetailedState.DISCONNECTING.ordinal(), zzbec.DISCONNECTING);
        int iOrdinal2 = NetworkInfo.DetailedState.BLOCKED.ordinal();
        zzbec zzbecVar2 = zzbec.DISCONNECTED;
        sparseArray.put(iOrdinal2, zzbecVar2);
        sparseArray.put(NetworkInfo.DetailedState.DISCONNECTED.ordinal(), zzbecVar2);
        sparseArray.put(NetworkInfo.DetailedState.FAILED.ordinal(), zzbecVar2);
        sparseArray.put(NetworkInfo.DetailedState.IDLE.ordinal(), zzbecVar2);
        sparseArray.put(NetworkInfo.DetailedState.SCANNING.ordinal(), zzbecVar2);
        sparseArray.put(NetworkInfo.DetailedState.SUSPENDED.ordinal(), zzbec.SUSPENDED);
        sparseArray.put(NetworkInfo.DetailedState.CAPTIVE_PORTAL_CHECK.ordinal(), zzbecVar);
        sparseArray.put(NetworkInfo.DetailedState.VERIFYING_POOR_LINK.ordinal(), zzbecVar);
    }

    public w0v0(Context context, gwt0 gwt0Var, o0v0 o0v0Var, f0v0 f0v0Var, aiw0 aiw0Var) {
        super(f0v0Var, aiw0Var);
        this.f183954c = context;
        this.f183955d = gwt0Var;
        this.f183957f = o0v0Var;
        this.f183956e = (TelephonyManager) context.getSystemService("phone");
    }

    /* JADX INFO: renamed from: b */
    public static /* bridge */ /* synthetic */ C2193m0 m200903b(w0v0 w0v0Var, Bundle bundle) {
        w4s0 w4s0VarM12893L = C2193m0.m12893L();
        int i = bundle.getInt("cnt", -2);
        int i2 = bundle.getInt("gnt", 0);
        int i3 = 2;
        if (i == -1) {
            w0v0Var.f183958g = 2;
        } else {
            w0v0Var.f183958g = 1;
            if (i == 0) {
                w4s0VarM12893L.m201573r(2);
            } else if (i != 1) {
                w4s0VarM12893L.m201573r(1);
            } else {
                w4s0VarM12893L.m201573r(3);
            }
            switch (i2) {
                case 1:
                case 2:
                case 4:
                case 7:
                case 11:
                case 16:
                    break;
                case 3:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                case 12:
                case 14:
                case 15:
                case 17:
                    i3 = 3;
                    break;
                case 13:
                    i3 = 5;
                    break;
                default:
                    i3 = 1;
                    break;
            }
            w4s0VarM12893L.m201572q(i3);
        }
        return (C2193m0) w4s0VarM12893L.m153521m();
    }

    /* JADX INFO: renamed from: c */
    public static /* bridge */ /* synthetic */ zzbec m200904c(w0v0 w0v0Var, Bundle bundle) {
        return (zzbec) f183953h.get(vyv0.m200674a(vyv0.m200674a(bundle, Device.TYPE), "network").getInt("active_network_state", -1), zzbec.UNSPECIFIED);
    }

    /* JADX INFO: renamed from: f */
    public static /* bridge */ /* synthetic */ byte[] m200906f(w0v0 w0v0Var, boolean z, ArrayList arrayList, C2193m0 c2193m0, zzbec zzbecVar) {
        f5s0 f5s0VarM13045T = C2209o0.m13045T();
        f5s0VarM13045T.m119520q(arrayList);
        f5s0VarM13045T.m119528y(m200907g(Settings.Global.getInt(w0v0Var.f183954c.getContentResolver(), "airplane_mode_on", 0) != 0));
        f5s0VarM13045T.m119529z(vny0.m199081s().mo138095h(w0v0Var.f183954c, w0v0Var.f183956e));
        f5s0VarM13045T.m119525v(w0v0Var.f183957f.m162181e());
        f5s0VarM13045T.m119524u(w0v0Var.f183957f.m162178b());
        f5s0VarM13045T.m119521r(w0v0Var.f183957f.m162177a());
        f5s0VarM13045T.m119522s(zzbecVar);
        f5s0VarM13045T.m119523t(c2193m0);
        f5s0VarM13045T.m119517A(w0v0Var.f183958g);
        f5s0VarM13045T.m119518B(m200907g(z));
        f5s0VarM13045T.m119527x(w0v0Var.f183957f.m162180d());
        f5s0VarM13045T.m119526w(vny0.m199064b().currentTimeMillis());
        f5s0VarM13045T.m119519C(m200907g(Settings.Global.getInt(w0v0Var.f183954c.getContentResolver(), "wifi_on", 0) != 0));
        return ((C2209o0) f5s0VarM13045T.m153521m()).m12744h();
    }

    /* JADX INFO: renamed from: g */
    public static final int m200907g(boolean z) {
        return z ? 2 : 1;
    }

    /* JADX INFO: renamed from: e */
    public final void m200908e(boolean z) {
        jmw0.m142245r(this.f183955d.m128513b(), new v0v0(this, z), i3t0.f111377f);
    }
}
