package p153l;

import android.content.Context;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.util.SparseArray;
import com.google.android.gms.internal.ads.C2216m0;
import com.google.android.gms.internal.ads.C2232o0;
import com.google.android.gms.internal.ads.zzbec;
import com.p051p1.mobile.putong.data.Device;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class cav0 extends dav0 {

    /* JADX INFO: renamed from: h */
    public static final SparseArray f80622h;

    /* JADX INFO: renamed from: c */
    public final Context f80623c;

    /* JADX INFO: renamed from: d */
    public final m5u0 f80624d;

    /* JADX INFO: renamed from: e */
    public final TelephonyManager f80625e;

    /* JADX INFO: renamed from: f */
    public final u9v0 f80626f;

    /* JADX INFO: renamed from: g */
    public int f80627g;

    static {
        SparseArray sparseArray = new SparseArray();
        f80622h = sparseArray;
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

    public cav0(Context context, m5u0 m5u0Var, u9v0 u9v0Var, l9v0 l9v0Var, grw0 grw0Var) {
        super(l9v0Var, grw0Var);
        this.f80623c = context;
        this.f80624d = m5u0Var;
        this.f80626f = u9v0Var;
        this.f80625e = (TelephonyManager) context.getSystemService("phone");
    }

    /* JADX INFO: renamed from: b */
    public static /* bridge */ /* synthetic */ C2216m0 m108509b(cav0 cav0Var, Bundle bundle) {
        ces0 ces0VarM12947L = C2216m0.m12947L();
        int i = bundle.getInt("cnt", -2);
        int i2 = bundle.getInt("gnt", 0);
        int i3 = 2;
        if (i == -1) {
            cav0Var.f80627g = 2;
        } else {
            cav0Var.f80627g = 1;
            if (i == 0) {
                ces0VarM12947L.m109454r(2);
            } else if (i != 1) {
                ces0VarM12947L.m109454r(1);
            } else {
                ces0VarM12947L.m109454r(3);
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
            ces0VarM12947L.m109453q(i3);
        }
        return (C2216m0) ces0VarM12947L.m185950m();
    }

    /* JADX INFO: renamed from: c */
    public static /* bridge */ /* synthetic */ zzbec m108510c(cav0 cav0Var, Bundle bundle) {
        return (zzbec) f80622h.get(b8w0.m103038a(b8w0.m103038a(bundle, Device.TYPE), "network").getInt("active_network_state", -1), zzbec.UNSPECIFIED);
    }

    /* JADX INFO: renamed from: f */
    public static /* bridge */ /* synthetic */ byte[] m108512f(cav0 cav0Var, boolean z, ArrayList arrayList, C2216m0 c2216m0, zzbec zzbecVar) {
        les0 les0VarM13099T = C2232o0.m13099T();
        les0VarM13099T.m153943q(arrayList);
        les0VarM13099T.m153951y(m108513g(Settings.Global.getInt(cav0Var.f80623c.getContentResolver(), "airplane_mode_on", 0) != 0));
        les0VarM13099T.m153952z(bxy0.m106935s().mo109056h(cav0Var.f80623c, cav0Var.f80625e));
        les0VarM13099T.m153948v(cav0Var.f80626f.m195136e());
        les0VarM13099T.m153947u(cav0Var.f80626f.m195133b());
        les0VarM13099T.m153944r(cav0Var.f80626f.m195132a());
        les0VarM13099T.m153945s(zzbecVar);
        les0VarM13099T.m153946t(c2216m0);
        les0VarM13099T.m153940A(cav0Var.f80627g);
        les0VarM13099T.m153941B(m108513g(z));
        les0VarM13099T.m153950x(cav0Var.f80626f.m195135d());
        les0VarM13099T.m153949w(bxy0.m106918b().currentTimeMillis());
        les0VarM13099T.m153942C(m108513g(Settings.Global.getInt(cav0Var.f80623c.getContentResolver(), "wifi_on", 0) != 0));
        return ((C2232o0) les0VarM13099T.m185950m()).m12798h();
    }

    /* JADX INFO: renamed from: g */
    public static final int m108513g(boolean z) {
        return z ? 2 : 1;
    }

    /* JADX INFO: renamed from: e */
    public final void m108514e(boolean z) {
        pvw0.m173991r(this.f80624d.m157125b(), new bav0(this, z), oct0.f146738f);
    }
}
