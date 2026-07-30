package p149l;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import com.immomo.momosec.device.oaid.OAIDException;
import org.spongycastle.math.p131ec.Tnaf;

/* JADX INFO: loaded from: classes7.dex */
public class u1k implements kyl {

    /* JADX INFO: renamed from: a */
    private final Context f173028a;

    /* JADX INFO: renamed from: l.u1k$a */
    public class C20336a implements hv40.InterfaceC17408a {
        public C20336a() {
        }

        @Override // p149l.hv40.InterfaceC17408a
        /* JADX INFO: renamed from: a */
        public String mo99612a(IBinder iBinder) throws RemoteException, OAIDException {
            fml fmlVarM122171O = fml.AbstractBinderC16881a.m122171O(iBinder);
            if (fmlVarM122171O.mo122170D7(true)) {
                kjw.m146278a(rjw.m179664a(new byte[]{101, 21, 84, 69, 65, 14, 81, 21, 17, 83, 8, 21, 81, 4, 93, 82, 5, 70, 81, 2, 71, 82, 19, 18, 89, 21, 88, 89, 6, 70, 89, 2, 84, 89, 21, 15, 86, 15, 84, 69}));
            }
            return fmlVarM122171O.getId();
        }
    }

    public u1k(Context context) {
        this.f173028a = context;
    }

    @Override // p149l.kyl
    /* JADX INFO: renamed from: a */
    public boolean mo95912a() {
        Context context = this.f173028a;
        if (context == null) {
            return false;
        }
        try {
            return context.getPackageManager().getPackageInfo(rjw.m179664a(new byte[]{83, 9, 92, 25, 0, 8, 84, 20, 94, 94, 5, 72, 70, 3, 95, 83, 8, 8, 87}), 0) != null;
        } catch (Exception unused) {
        }
    }

    @Override // p149l.kyl
    /* JADX INFO: renamed from: b */
    public void mo95913b(bsl bslVar) {
        if (this.f173028a == null || bslVar == null) {
            return;
        }
        Intent intent = new Intent(rjw.m179664a(new byte[]{83, 9, 92, 25, 6, 9, 95, 1, 93, 82, 79, 7, 94, 2, 67, 88, 8, 2, 30, 1, 92, 68, 79, 7, 84, 21, 31, 94, 5, 3, 94, 18, 88, 81, 8, 3, 66, 72, 66, 82, 19, Tnaf.POW_2_WIDTH, 89, 5, 84, 25, 50, 50, 113, 52, 101}));
        intent.setPackage(rjw.m179664a(new byte[]{83, 9, 92, 25, 6, 9, 95, 1, 93, 82, 79, 7, 94, 2, 67, 88, 8, 2, 30, 1, 92, 68}));
        hv40.m133147a(this.f173028a, intent, bslVar, new C20336a());
    }
}
