package p153l;

import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.customevent.CustomEventAdapter;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;

/* JADX INFO: loaded from: classes6.dex */
public final class qws0 extends tws0 {

    /* JADX INFO: renamed from: a */
    public static final lzs0 f159967a = new lzs0();

    @Override // p153l.uws0
    /* JADX INFO: renamed from: c */
    public final boolean mo178536c(String str) throws RemoteException {
        try {
            return ezb.class.isAssignableFrom(Class.forName(str, false, qws0.class.getClassLoader()));
        } catch (Throwable unused) {
            dct0.m115298g("Could not load custom event implementation class: " + str + ", trying Adapter implementation class.");
            return false;
        }
    }

    @Override // p153l.uws0
    /* JADX INFO: renamed from: z */
    public final boolean mo178537z(String str) throws RemoteException {
        try {
            return b80.class.isAssignableFrom(Class.forName(str, false, qws0.class.getClassLoader()));
        } catch (Throwable unused) {
            dct0.m115298g("Could not load custom event implementation class as Adapter: " + str + ", assuming old custom event implementation.");
            return false;
        }
    }

    @Override // p153l.uws0
    public final xws0 zzb(String str) throws RemoteException {
        try {
            try {
                Class<?> cls = Class.forName(str, false, qws0.class.getClassLoader());
                if (v7y.class.isAssignableFrom(cls)) {
                    return new bys0((v7y) cls.getDeclaredConstructor(null).newInstance(null));
                }
                if (b80.class.isAssignableFrom(cls)) {
                    return new bys0((b80) cls.getDeclaredConstructor(null).newInstance(null));
                }
                dct0.m115298g("Could not instantiate mediation adapter: " + str + " (not a valid adapter).");
                throw new RemoteException();
            } catch (Throwable th) {
                dct0.m115299h("Could not instantiate mediation adapter: " + str + ". ", th);
                pqy0.m173422a();
                return null;
            }
        } catch (Throwable unused) {
            dct0.m115293b("Reflection failed, retrying using direct instantiation");
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
                return new bys0(new AdMobAdapter());
            }
            if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                return new bys0(new CustomEventAdapter());
            }
            pqy0.m173422a();
            return null;
        }
    }

    @Override // p153l.uws0
    public final hzs0 zzc(String str) throws RemoteException {
        try {
            return new d0t0((RtbAdapter) Class.forName(str, false, lzs0.class.getClassLoader()).getDeclaredConstructor(null).newInstance(null));
        } catch (Throwable unused) {
            pqy0.m173422a();
            return null;
        }
    }
}
