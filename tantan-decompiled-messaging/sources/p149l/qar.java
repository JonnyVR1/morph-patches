package p149l;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import com.immomo.momosec.device.oaid.OAIDException;
import org.spongycastle.math.p131ec.Tnaf;

/* JADX INFO: loaded from: classes7.dex */
public class qar implements kyl {

    /* JADX INFO: renamed from: a */
    private final Context f153566a;

    /* JADX INFO: renamed from: l.qar$a */
    public class C19452a implements hv40.InterfaceC17408a {
        public C19452a() {
        }

        @Override // p149l.hv40.InterfaceC17408a
        /* JADX INFO: renamed from: a */
        public String mo99612a(IBinder iBinder) throws RemoteException, OAIDException {
            upl uplVarM194889O = upl.AbstractBinderC20481a.m194889O(iBinder);
            if (uplVarM194889O == null) {
                throw new OAIDException(rjw.m179664a(new byte[]{121, 34, 84, 65, 8, 5, 85, 15, 85, 126, 15, 18, 85, 20, 87, 86, 2, 3, Tnaf.POW_2_WIDTH, 15, 66, 23, 15, 19, 92, 10}));
            }
            if (uplVarM194889O.isSupport()) {
                return uplVarM194889O.mo194887j();
            }
            throw new OAIDException(rjw.m179664a(new byte[]{121, 34, 84, 65, 8, 5, 85, 15, 85, 126, 15, 18, 85, 20, 87, 86, 2, 3, 19, 15, 66, 100, 20, 22, 64, 9, 67, 67, 65, 20, 85, 18, 68, 69, 15, 70, 86, 7, 93, 68, 4}));
        }
    }

    public qar(Context context) {
        this.f153566a = context;
    }

    @Override // p149l.kyl
    /* JADX INFO: renamed from: a */
    public boolean mo95912a() {
        Context context = this.f153566a;
        if (context == null) {
            return false;
        }
        try {
            return context.getPackageManager().getPackageInfo(rjw.m179664a(new byte[]{83, 9, 92, 25, 27, 19, 89, 72, 85, 82, 23, 15, 83, 3, 88, 83, 18, 3, 66, Tnaf.POW_2_WIDTH, 88, 84, 4}), 0) != null;
        } catch (Exception unused) {
        }
    }

    @Override // p149l.kyl
    /* JADX INFO: renamed from: b */
    public void mo95913b(bsl bslVar) {
        if (this.f153566a == null || bslVar == null) {
            return;
        }
        Intent intent = new Intent();
        intent.setClassName(rjw.m179664a(new byte[]{83, 9, 92, 25, 27, 19, 89, 72, 85, 82, 23, 15, 83, 3, 88, 83, 18, 3, 66, Tnaf.POW_2_WIDTH, 88, 84, 4}), rjw.m179664a(new byte[]{83, 9, 92, 25, 27, 19, 89, 72, 85, 82, 23, 15, 83, 3, 88, 83, 18, 3, 66, Tnaf.POW_2_WIDTH, 88, 84, 4, 72, 116, 3, 71, 94, 2, 3, 89, 2, 98, 82, 19, Tnaf.POW_2_WIDTH, 89, 5, 84}));
        hv40.m133147a(this.f153566a, intent, bslVar, new C19452a());
    }
}
