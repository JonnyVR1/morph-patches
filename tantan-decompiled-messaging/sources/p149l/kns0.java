package p149l;

import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.customevent.CustomEventAdapter;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;

/* JADX INFO: loaded from: classes6.dex */
public final class kns0 extends nns0 {

    /* JADX INFO: renamed from: a */
    public static final fqs0 f123910a = new fqs0();

    @Override // p149l.ons0
    /* JADX INFO: renamed from: c */
    public final boolean mo146589c(String str) throws RemoteException {
        try {
            return qxb.class.isAssignableFrom(Class.forName(str, false, kns0.class.getClassLoader()));
        } catch (Throwable unused) {
            x2t0.m206869g("Could not load custom event implementation class: " + str + ", trying Adapter implementation class.");
            return false;
        }
    }

    @Override // p149l.ons0
    /* JADX INFO: renamed from: z */
    public final boolean mo146590z(String str) throws RemoteException {
        try {
            return f80.class.isAssignableFrom(Class.forName(str, false, kns0.class.getClassLoader()));
        } catch (Throwable unused) {
            x2t0.m206869g("Could not load custom event implementation class as Adapter: " + str + ", assuming old custom event implementation.");
            return false;
        }
    }

    @Override // p149l.ons0
    public final rns0 zzb(String str) throws RemoteException {
        try {
            try {
                Class<?> cls = Class.forName(str, false, kns0.class.getClassLoader());
                if (yyx.class.isAssignableFrom(cls)) {
                    return new vos0((yyx) cls.getDeclaredConstructor(null).newInstance(null));
                }
                if (f80.class.isAssignableFrom(cls)) {
                    return new vos0((f80) cls.getDeclaredConstructor(null).newInstance(null));
                }
                x2t0.m206869g("Could not instantiate mediation adapter: " + str + " (not a valid adapter).");
                throw new RemoteException();
            } catch (Throwable th) {
                x2t0.m206870h("Could not instantiate mediation adapter: " + str + ". ", th);
                jhy0.m141614a();
                return null;
            }
        } catch (Throwable unused) {
            x2t0.m206864b("Reflection failed, retrying using direct instantiation");
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
                return new vos0(new AdMobAdapter());
            }
            if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                return new vos0(new CustomEventAdapter());
            }
            jhy0.m141614a();
            return null;
        }
    }

    @Override // p149l.ons0
    public final bqs0 zzc(String str) throws RemoteException {
        try {
            return new xqs0((RtbAdapter) Class.forName(str, false, fqs0.class.getClassLoader()).getDeclaredConstructor(null).newInstance(null));
        } catch (Throwable unused) {
            jhy0.m141614a();
            return null;
        }
    }
}
