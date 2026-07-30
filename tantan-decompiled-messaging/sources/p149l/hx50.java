package p149l;

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
import org.spongycastle.math.p131ec.Tnaf;

/* JADX INFO: loaded from: classes7.dex */
public class hx50 implements kyl {

    /* JADX INFO: renamed from: a */
    private final Context f109829a;

    /* JADX INFO: renamed from: b */
    private String f109830b;

    /* JADX INFO: renamed from: l.hx50$a */
    public class C17424a implements hv40.InterfaceC17408a {
        public C17424a() {
        }

        @Override // p149l.hv40.InterfaceC17408a
        /* JADX INFO: renamed from: a */
        public String mo99612a(IBinder iBinder) throws RemoteException, OAIDException {
            try {
                return hx50.this.m133298d(iBinder);
            } catch (RemoteException | OAIDException e) {
                throw e;
            } catch (Exception e2) {
                throw new OAIDException(e2);
            }
        }
    }

    public hx50(Context context) {
        if (context instanceof Application) {
            this.f109829a = context;
        } else {
            this.f109829a = context.getApplicationContext();
        }
    }

    /* JADX INFO: renamed from: c */
    private String m133297c(IBinder iBinder, String str, String str2) throws RemoteException, OAIDException {
        yyl yylVarM216542O = yyl.AbstractBinderC21582a.m216542O(iBinder);
        if (yylVarM216542O != null) {
            return yylVarM216542O.mo216541n1(str, str2, rjw.m179664a(new byte[]{127, 51, 120, 115}));
        }
        throw new OAIDException(rjw.m179664a(new byte[]{121, 41, 65, 82, 15, 47, 116, 70, 88, 68, 65, 8, 69, 10, 93}));
    }

    @Override // p149l.kyl
    /* JADX INFO: renamed from: a */
    public boolean mo95912a() {
        Context context = this.f109829a;
        if (context == null) {
            return false;
        }
        try {
            return context.getPackageManager().getPackageInfo(rjw.m179664a(new byte[]{83, 9, 92, 25, 9, 3, 73, 18, 80, 71, 79, 9, 64, 3, 95, 94, 5}), 0) != null;
        } catch (Exception unused) {
        }
    }

    @Override // p149l.kyl
    /* JADX INFO: renamed from: b */
    public void mo95913b(bsl bslVar) {
        if (this.f109829a == null || bslVar == null) {
            return;
        }
        Intent intent = new Intent(rjw.m179664a(new byte[]{81, 5, 69, 94, 14, 8, 30, 5, 94, 90, 79, 14, 85, 31, 69, 86, 17, 72, 95, 22, 84, 89, 8, 2, 30, 41, 97, 114, 47, 57, 121, 34, 110, 100, 36, 52, 102, 47, 114, 114}));
        intent.setComponent(new ComponentName(rjw.m179664a(new byte[]{83, 9, 92, 25, 9, 3, 73, 18, 80, 71, 79, 9, 64, 3, 95, 94, 5}), rjw.m179664a(new byte[]{83, 9, 92, 25, 9, 3, 73, 18, 80, 71, 79, 9, 64, 3, 95, 94, 5, 72, 121, 2, 84, 89, 21, 15, 86, 31, 98, 82, 19, Tnaf.POW_2_WIDTH, 89, 5, 84})));
        hv40.m133147a(this.f109829a, intent, bslVar, new C17424a());
    }

    @SuppressLint({"PackageManagerGetSignatures"})
    /* JADX INFO: renamed from: d */
    public String m133298d(IBinder iBinder) throws PackageManager.NameNotFoundException, NoSuchAlgorithmException, RemoteException, OAIDException {
        String packageName = this.f109829a.getPackageName();
        String str = this.f109830b;
        if (str != null) {
            return m133297c(iBinder, packageName, str);
        }
        byte[] bArrDigest = MessageDigest.getInstance(rjw.m179664a(new byte[]{99, 46, 112, 6})).digest(this.f109829a.getPackageManager().getPackageInfo(packageName, 64).signatures[0].toByteArray());
        StringBuilder sb = new StringBuilder();
        for (byte b : bArrDigest) {
            sb.append(Integer.toHexString((b & 255) | 256).substring(1, 3));
        }
        String string = sb.toString();
        this.f109830b = string;
        return m133297c(iBinder, packageName, string);
    }
}
