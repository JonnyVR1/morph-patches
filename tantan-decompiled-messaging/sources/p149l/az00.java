package p149l;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import android.os.RemoteException;
import com.immomo.momosec.device.oaid.OAIDException;
import org.eclipse.jetty.http.HttpTokens;
import org.spongycastle.math.p131ec.Tnaf;

/* JADX INFO: loaded from: classes7.dex */
public class az00 implements kyl {

    /* JADX INFO: renamed from: a */
    private final Context f72326a;

    /* JADX INFO: renamed from: l.az00$a */
    public class C15764a implements hv40.InterfaceC17408a {
        public C15764a() {
        }

        @Override // p149l.hv40.InterfaceC17408a
        /* JADX INFO: renamed from: a */
        public String mo99612a(IBinder iBinder) throws RemoteException, OAIDException {
            zy00 zy00VarM220880O = zy00.AbstractBinderC21819a.m220880O(iBinder);
            if (zy00VarM220880O == null) {
                throw new OAIDException(rjw.m179664a(new byte[]{125, 21, 80, 126, 5, 47, 94, 18, 84, 69, 7, 7, 83, 3, 17, 94, 18, 70, 94, 19, 93, 91}));
            }
            if (zy00VarM220880O.isSupported()) {
                return zy00VarM220880O.mo220878j();
            }
            throw new OAIDException(rjw.m179664a(new byte[]{125, 21, 80, 126, 5, 47, 94, 18, 84, 69, 7, 7, 83, 3, 18, 94, 18, 53, 69, 22, 65, 88, 19, 18, 85, 2, 17, 69, 4, 18, 69, 20, 95, 23, 7, 7, 92, 21, 84}));
        }
    }

    public az00(Context context) {
        this.f72326a = context;
    }

    /* JADX INFO: renamed from: c */
    private void m99611c() {
        try {
            Intent intent = new Intent(rjw.m179664a(new byte[]{83, 9, 92, 25, 3, 19, 94, 72, 92, 68, 0, 72, 81, 5, 69, 94, 14, 8, 30, 21, 69, 86, 19, 18, 30, 21, 84, 69, 23, 15, 83, 3}));
            intent.setClassName(rjw.m179664a(new byte[]{83, 9, 92, 25, 12, 2, 89, 2, 31, 90, 18, 7}), rjw.m179664a(new byte[]{83, 9, 92, 25, 12, 2, 89, 2, 31, 90, 18, 7, 30, 21, 84, 69, 23, 15, 83, 3, 31, 122, 18, 7, 123, 10, 98, 82, 19, Tnaf.POW_2_WIDTH, 89, 5, 84}));
            intent.putExtra(rjw.m179664a(new byte[]{83, 9, 92, 25, 3, 19, 94, 72, 92, 68, 0, 72, 64, 7, 67, 86, 12, 72, 64, HttpTokens.CARRIAGE_RETURN, 86, 89, 0, 11, 85}), this.f72326a.getPackageName());
            int i = Build.VERSION.SDK_INT;
            Context context = this.f72326a;
            if (i < 26) {
                context.startService(intent);
            } else {
                context.startForegroundService(intent);
            }
        } catch (Exception unused) {
        }
    }

    @Override // p149l.kyl
    /* JADX INFO: renamed from: a */
    public boolean mo95912a() {
        Context context = this.f72326a;
        if (context == null) {
            return false;
        }
        try {
            return context.getPackageManager().getPackageInfo(rjw.m179664a(new byte[]{83, 9, 92, 25, 12, 2, 89, 2, 31, 90, 18, 7}), 0) != null;
        } catch (Exception unused) {
        }
    }

    @Override // p149l.kyl
    /* JADX INFO: renamed from: b */
    public void mo95913b(bsl bslVar) {
        if (this.f72326a == null || bslVar == null) {
            return;
        }
        m99611c();
        Intent intent = new Intent(rjw.m179664a(new byte[]{83, 9, 92, 25, 3, 19, 94, 72, 92, 68, 0, 72, 81, 5, 69, 94, 14, 8, 30, 4, 88, 89, 5, 18, 95, 72, 66, 82, 19, Tnaf.POW_2_WIDTH, 89, 5, 84}));
        intent.setClassName(rjw.m179664a(new byte[]{83, 9, 92, 25, 12, 2, 89, 2, 31, 90, 18, 7}), rjw.m179664a(new byte[]{83, 9, 92, 25, 12, 2, 89, 2, 31, 90, 18, 7, 30, 21, 84, 69, 23, 15, 83, 3, 31, 122, 18, 7, 121, 2, 98, 82, 19, Tnaf.POW_2_WIDTH, 89, 5, 84}));
        intent.putExtra(rjw.m179664a(new byte[]{83, 9, 92, 25, 3, 19, 94, 72, 92, 68, 0, 72, 64, 7, 67, 86, 12, 72, 64, HttpTokens.CARRIAGE_RETURN, 86, 89, 0, 11, 85}), this.f72326a.getPackageName());
        hv40.m133147a(this.f72326a, intent, bslVar, new C15764a());
    }
}
