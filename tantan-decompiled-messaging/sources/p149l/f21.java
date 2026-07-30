package p149l;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import com.immomo.momosec.device.oaid.OAIDException;
import org.eclipse.jetty.http.HttpTokens;
import org.spongycastle.math.p131ec.Tnaf;

/* JADX INFO: loaded from: classes7.dex */
public class f21 implements kyl {

    /* JADX INFO: renamed from: a */
    private final Context f94136a;

    /* JADX INFO: renamed from: l.f21$a */
    public class C16741a implements hv40.InterfaceC17408a {
        public C16741a() {
        }

        @Override // p149l.hv40.InterfaceC17408a
        /* JADX INFO: renamed from: a */
        public String mo99612a(IBinder iBinder) throws RemoteException, OAIDException {
            wpl wplVarM204925O = wpl.AbstractBinderC20936a.m204925O(iBinder);
            if (wplVarM204925O == null) {
                throw new OAIDException(rjw.m179664a(new byte[]{121, 34, 88, 83, HttpTokens.SPACE, 15, 84, 10, 120, 89, 21, 3, 66, 0, 80, 84, 4, 70, 89, 21, 17, 89, 20, 10, 92}));
            }
            if (wplVarM204925O.isSupport()) {
                return wplVarM204925O.mo204923j();
            }
            throw new OAIDException(rjw.m179664a(new byte[]{121, 34, 88, 83, HttpTokens.SPACE, 15, 84, 10, 120, 89, 21, 3, 66, 0, 80, 84, 4, 69, 89, 21, 98, 66, 17, 22, 95, 20, 69, 23, 19, 3, 68, 19, 67, 89, 65, 0, 81, 10, 66, 82}));
        }
    }

    public f21(Context context) {
        this.f94136a = context;
    }

    @Override // p149l.kyl
    /* JADX INFO: renamed from: a */
    public boolean mo95912a() {
        Context context = this.f94136a;
        if (context == null) {
            return false;
        }
        try {
            return context.getPackageManager().getPackageInfo(rjw.m179664a(new byte[]{83, 9, 92, 25, 0, 21, 69, 21, 31, 90, 18, 7, 30, 53, 68, 71, 17, 10, 85, 11, 84, 89, 21, 7, 66, 31, 117, 126, 37}), 0) != null;
        } catch (Exception unused) {
        }
    }

    @Override // p149l.kyl
    /* JADX INFO: renamed from: b */
    public void mo95913b(bsl bslVar) {
        if (this.f94136a == null || bslVar == null) {
            return;
        }
        Intent intent = new Intent(rjw.m179664a(new byte[]{83, 9, 92, 25, 0, 21, 69, 21, 31, 90, 18, 7, 30, 7, 82, 67, 8, 9, 94, 72, 112, 116, 34, 35, 99, 53, 110, 115, 40, 34}));
        intent.setComponent(new ComponentName(rjw.m179664a(new byte[]{83, 9, 92, 25, 0, 21, 69, 21, 31, 90, 18, 7, 30, 53, 68, 71, 17, 10, 85, 11, 84, 89, 21, 7, 66, 31, 117, 126, 37}), rjw.m179664a(new byte[]{83, 9, 92, 25, 0, 21, 69, 21, 31, 90, 18, 7, 30, 53, 68, 71, 17, 10, 85, 11, 84, 89, 21, 7, 66, 31, 117, 126, 37, 72, 99, 19, 65, 71, HttpTokens.CARRIAGE_RETURN, 3, 93, 3, 95, 67, 0, 20, 73, 34, 120, 115, 50, 3, 66, Tnaf.POW_2_WIDTH, 88, 84, 4})));
        hv40.m133147a(this.f94136a, intent, bslVar, new C16741a());
    }
}
