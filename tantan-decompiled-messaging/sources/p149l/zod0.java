package p149l;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import com.immomo.momosec.device.oaid.OAIDException;
import org.eclipse.jetty.http.HttpTokens;
import org.spongycastle.math.p131ec.Tnaf;

/* JADX INFO: loaded from: classes7.dex */
public class zod0 implements kyl {

    /* JADX INFO: renamed from: a */
    private final Context f204101a;

    /* JADX INFO: renamed from: l.zod0$a */
    public class C21741a implements hv40.InterfaceC17408a {
        public C21741a() {
        }

        @Override // p149l.hv40.InterfaceC17408a
        /* JADX INFO: renamed from: a */
        public String mo99612a(IBinder iBinder) throws RemoteException, OAIDException {
            tpl tplVarM189995O = tpl.AbstractBinderC20236a.m189995O(iBinder);
            if (tplVarM189995O != null) {
                return tplVarM189995O.mo189993j();
            }
            throw new OAIDException(rjw.m179664a(new byte[]{121, 34, 84, 65, 8, 5, 85, 47, 85, 100, 4, 20, 70, 15, 82, 82, 65, 15, 67, 70, 95, 66, HttpTokens.CARRIAGE_RETURN, 10}));
        }
    }

    public zod0(Context context) {
        this.f204101a = context;
    }

    @Override // p149l.kyl
    /* JADX INFO: renamed from: a */
    public boolean mo95912a() {
        Context context = this.f204101a;
        if (context == null) {
            return false;
        }
        try {
            return context.getPackageManager().getPackageInfo(rjw.m179664a(new byte[]{83, 9, 92, 25, 18, 7, 93, 21, 68, 89, 6, 72, 81, 8, 85, 69, 14, 15, 84, 72, 85, 82, 23, 15, 83, 3, 88, 83, 18, 3, 66, Tnaf.POW_2_WIDTH, 88, 84, 4}), 0) != null;
        } catch (Exception unused) {
        }
    }

    @Override // p149l.kyl
    /* JADX INFO: renamed from: b */
    public void mo95913b(bsl bslVar) {
        if (this.f204101a == null || bslVar == null) {
            return;
        }
        Intent intent = new Intent();
        intent.setClassName(rjw.m179664a(new byte[]{83, 9, 92, 25, 18, 7, 93, 21, 68, 89, 6, 72, 81, 8, 85, 69, 14, 15, 84, 72, 85, 82, 23, 15, 83, 3, 88, 83, 18, 3, 66, Tnaf.POW_2_WIDTH, 88, 84, 4}), rjw.m179664a(new byte[]{83, 9, 92, 25, 18, 7, 93, 21, 68, 89, 6, 72, 81, 8, 85, 69, 14, 15, 84, 72, 85, 82, 23, 15, 83, 3, 88, 83, 18, 3, 66, Tnaf.POW_2_WIDTH, 88, 84, 4, 72, 116, 3, 71, 94, 2, 3, 121, 2, 98, 82, 19, Tnaf.POW_2_WIDTH, 89, 5, 84}));
        hv40.m133147a(this.f204101a, intent, bslVar, new C21741a());
    }
}
