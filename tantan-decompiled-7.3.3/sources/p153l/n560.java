package p153l;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.RemoteException;
import com.immomo.momosec.device.oaid.OAIDException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import org.spongycastle.math.p135ec.Tnaf;

/* JADX INFO: loaded from: classes7.dex */
public class n560 implements d1m {

    /* JADX INFO: renamed from: a */
    private final Context f140308a;

    /* JADX INFO: renamed from: b */
    private String f140309b;

    /* JADX INFO: renamed from: l.n560$a */
    public class C18802a implements w350.InterfaceC21004a {
        public C18802a() {
        }

        @Override // p153l.w350.InterfaceC21004a
        /* JADX INFO: renamed from: a */
        public String mo106876a(IBinder iBinder) throws RemoteException, OAIDException {
            try {
                return n560.this.m161682d(iBinder);
            } catch (RemoteException | OAIDException e) {
                throw e;
            } catch (Exception e2) {
                throw new OAIDException(e2);
            }
        }
    }

    public n560(Context context) {
        if (context instanceof Application) {
            this.f140308a = context;
        } else {
            this.f140308a = context.getApplicationContext();
        }
    }

    /* JADX INFO: renamed from: c */
    private String m161681c(IBinder iBinder, String str, String str2) throws RemoteException, OAIDException {
        t1m t1mVarM188928O = t1m.AbstractBinderC20214a.m188928O(iBinder);
        if (t1mVarM188928O != null) {
            return t1mVarM188928O.mo188927n1(str, str2, qmw.m177151a(new byte[]{127, 51, 120, 115}));
        }
        throw new OAIDException(qmw.m177151a(new byte[]{121, 41, 65, 82, 15, 47, 116, 70, 88, 68, 65, 8, 69, 10, 93}));
    }

    @Override // p153l.d1m
    /* JADX INFO: renamed from: a */
    public boolean mo106874a() {
        Context context = this.f140308a;
        if (context == null) {
            return false;
        }
        try {
            return context.getPackageManager().getPackageInfo(qmw.m177151a(new byte[]{83, 9, 92, 25, 9, 3, 73, 18, 80, 71, 79, 9, 64, 3, 95, 94, 5}), 0) != null;
        } catch (Exception unused) {
        }
    }

    @Override // p153l.d1m
    /* JADX INFO: renamed from: b */
    public void mo106875b(pul pulVar) {
        if (this.f140308a == null || pulVar == null) {
            return;
        }
        Intent intent = new Intent(qmw.m177151a(new byte[]{81, 5, 69, 94, 14, 8, 30, 5, 94, 90, 79, 14, 85, 31, 69, 86, 17, 72, 95, 22, 84, 89, 8, 2, 30, 41, 97, 114, 47, 57, 121, 34, 110, 100, 36, 52, 102, 47, 114, 114}));
        intent.setComponent(new ComponentName(qmw.m177151a(new byte[]{83, 9, 92, 25, 9, 3, 73, 18, 80, 71, 79, 9, 64, 3, 95, 94, 5}), qmw.m177151a(new byte[]{83, 9, 92, 25, 9, 3, 73, 18, 80, 71, 79, 9, 64, 3, 95, 94, 5, 72, 121, 2, 84, 89, 21, 15, 86, 31, 98, 82, 19, Tnaf.POW_2_WIDTH, 89, 5, 84})));
        w350.m204736a(this.f140308a, intent, pulVar, new C18802a());
    }

    @SuppressLint({"PackageManagerGetSignatures"})
    /* JADX INFO: renamed from: d */
    public String m161682d(IBinder iBinder) throws PackageManager.NameNotFoundException, NoSuchAlgorithmException, RemoteException, OAIDException {
        String packageName = this.f140308a.getPackageName();
        String str = this.f140309b;
        if (str != null) {
            return m161681c(iBinder, packageName, str);
        }
        byte[] bArrDigest = MessageDigest.getInstance(qmw.m177151a(new byte[]{99, 46, 112, 6})).digest(this.f140308a.getPackageManager().getPackageInfo(packageName, 64).signatures[0].toByteArray());
        StringBuilder sb = new StringBuilder();
        for (byte b : bArrDigest) {
            sb.append(Integer.toHexString((b & 255) | 256).substring(1, 3));
        }
        String string = sb.toString();
        this.f140309b = string;
        return m161681c(iBinder, packageName, string);
    }
}
