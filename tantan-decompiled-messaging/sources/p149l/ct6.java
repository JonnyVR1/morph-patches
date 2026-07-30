package p149l;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import com.immomo.momosec.device.oaid.OAIDException;
import org.eclipse.jetty.http.HttpTokens;

/* JADX INFO: loaded from: classes7.dex */
public class ct6 implements kyl {

    /* JADX INFO: renamed from: a */
    private final Context f82455a;

    /* JADX INFO: renamed from: l.ct6$a */
    public class C16242a implements hv40.InterfaceC17408a {
        public C16242a() {
        }

        @Override // p149l.hv40.InterfaceC17408a
        /* JADX INFO: renamed from: a */
        public String mo99612a(IBinder iBinder) throws RemoteException, OAIDException {
            spl splVarM185379O = spl.AbstractBinderC20008a.m185379O(iBinder);
            if (splVarM185379O != null) {
                return splVarM185379O.mo185377k1(ct6.this.f82455a.getPackageName());
            }
            throw new OAIDException(rjw.m179664a(new byte[]{121, 34, 84, 65, 8, 5, 85, 47, 85, 122, 0, 8, 81, 1, 84, 69, 65, 15, 67, 70, 95, 66, HttpTokens.CARRIAGE_RETURN, 10}));
        }
    }

    public ct6(Context context) {
        if (context instanceof Application) {
            this.f82455a = context;
        } else {
            this.f82455a = context.getApplicationContext();
        }
    }

    @Override // p149l.kyl
    /* JADX INFO: renamed from: a */
    public boolean mo95912a() {
        Context context = this.f82455a;
        if (context == null) {
            return false;
        }
        try {
            return context.getPackageManager().getPackageInfo(rjw.m179664a(new byte[]{83, 9, 92, 25, 2, 9, 95, 10, 65, 86, 5, 72, 84, 3, 71, 94, 2, 3, 89, 2, 66, 66, 17, 22, 95, 20, 69}), 0) != null;
        } catch (Exception unused) {
        }
    }

    @Override // p149l.kyl
    /* JADX INFO: renamed from: b */
    public void mo95913b(bsl bslVar) {
        if (this.f82455a == null || bslVar == null) {
            return;
        }
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(rjw.m179664a(new byte[]{83, 9, 92, 25, 2, 9, 95, 10, 65, 86, 5, 72, 84, 3, 71, 94, 2, 3, 89, 2, 66, 66, 17, 22, 95, 20, 69}), rjw.m179664a(new byte[]{83, 9, 92, 25, 2, 9, 95, 10, 65, 86, 5, 72, 84, 3, 71, 94, 2, 3, 89, 2, 66, 66, 17, 22, 95, 20, 69, 25, 37, 3, 70, 15, 82, 82, 40, 2, 99, 3, 67, 65, 8, 5, 85})));
        hv40.m133147a(this.f82455a, intent, bslVar, new C16242a());
    }
}
