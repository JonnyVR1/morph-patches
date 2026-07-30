package p149l;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import com.immomo.momosec.device.oaid.OAIDException;
import org.spongycastle.math.p131ec.Tnaf;

/* JADX INFO: loaded from: classes7.dex */
public class j6j implements kyl {

    /* JADX INFO: renamed from: a */
    private final Context f116480a;

    /* JADX INFO: renamed from: l.j6j$a */
    public class C17703a implements hv40.InterfaceC17408a {
        public C17703a() {
        }

        @Override // p149l.hv40.InterfaceC17408a
        /* JADX INFO: renamed from: a */
        public String mo99612a(IBinder iBinder) throws RemoteException, OAIDException {
            edm edmVarM115825O = edm.AbstractBinderC16581a.m115825O(iBinder);
            if (edmVarM115825O != null) {
                return edmVarM115825O.mo115822j();
            }
            throw new OAIDException(rjw.m179664a(new byte[]{121, 2, 66, 100, 20, 22, 64, 10, 88, 82, 19, 70, 89, 21, 17, 89, 20, 10, 92}));
        }
    }

    public j6j(Context context) {
        this.f116480a = context;
    }

    @Override // p149l.kyl
    /* JADX INFO: renamed from: a */
    public boolean mo95912a() {
        Context context = this.f116480a;
        if (context == null) {
            return false;
        }
        try {
            return context.getPackageManager().getPackageInfo(rjw.m179664a(new byte[]{83, 9, 92, 25, 0, 8, 84, 20, 94, 94, 5, 72, 83, 20, 84, 86, 21, 9, 66}), 0) != null;
        } catch (Exception unused) {
        }
    }

    @Override // p149l.kyl
    /* JADX INFO: renamed from: b */
    public void mo95913b(bsl bslVar) {
        if (this.f116480a == null || bslVar == null) {
            return;
        }
        Intent intent = new Intent(rjw.m179664a(new byte[]{81, 8, 85, 69, 14, 15, 84, 72, 66, 82, 19, Tnaf.POW_2_WIDTH, 89, 5, 84, 25, 0, 5, 68, 15, 94, 89, 79, 11, 67, 7}));
        intent.setPackage(rjw.m179664a(new byte[]{83, 9, 92, 25, 0, 8, 84, 20, 94, 94, 5, 72, 83, 20, 84, 86, 21, 9, 66}));
        hv40.m133147a(this.f116480a, intent, bslVar, new C17703a());
    }
}
