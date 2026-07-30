package p153l;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import com.immomo.momosec.device.oaid.OAIDException;
import org.spongycastle.math.p135ec.Tnaf;

/* JADX INFO: loaded from: classes7.dex */
public class m4k implements d1m {

    /* JADX INFO: renamed from: a */
    private final Context f134807a;

    /* JADX INFO: renamed from: l.m4k$a */
    public class C18546a implements w350.InterfaceC21004a {
        public C18546a() {
        }

        @Override // p153l.w350.InterfaceC21004a
        /* JADX INFO: renamed from: a */
        public String mo106876a(IBinder iBinder) throws RemoteException, OAIDException {
            rol rolVarM182413O = rol.AbstractBinderC19890a.m182413O(iBinder);
            if (rolVarM182413O.mo182412D7(true)) {
                jmw.m146176a(qmw.m177151a(new byte[]{101, 21, 84, 69, 65, 14, 81, 21, 17, 83, 8, 21, 81, 4, 93, 82, 5, 70, 81, 2, 71, 82, 19, 18, 89, 21, 88, 89, 6, 70, 89, 2, 84, 89, 21, 15, 86, 15, 84, 69}));
            }
            return rolVarM182413O.getId();
        }
    }

    public m4k(Context context) {
        this.f134807a = context;
    }

    @Override // p153l.d1m
    /* JADX INFO: renamed from: a */
    public boolean mo106874a() {
        Context context = this.f134807a;
        if (context == null) {
            return false;
        }
        try {
            return context.getPackageManager().getPackageInfo(qmw.m177151a(new byte[]{83, 9, 92, 25, 0, 8, 84, 20, 94, 94, 5, 72, 70, 3, 95, 83, 8, 8, 87}), 0) != null;
        } catch (Exception unused) {
        }
    }

    @Override // p153l.d1m
    /* JADX INFO: renamed from: b */
    public void mo106875b(pul pulVar) {
        if (this.f134807a == null || pulVar == null) {
            return;
        }
        Intent intent = new Intent(qmw.m177151a(new byte[]{83, 9, 92, 25, 6, 9, 95, 1, 93, 82, 79, 7, 94, 2, 67, 88, 8, 2, 30, 1, 92, 68, 79, 7, 84, 21, 31, 94, 5, 3, 94, 18, 88, 81, 8, 3, 66, 72, 66, 82, 19, Tnaf.POW_2_WIDTH, 89, 5, 84, 25, 50, 50, 113, 52, 101}));
        intent.setPackage(qmw.m177151a(new byte[]{83, 9, 92, 25, 6, 9, 95, 1, 93, 82, 79, 7, 94, 2, 67, 88, 8, 2, 30, 1, 92, 68}));
        w350.m204736a(this.f134807a, intent, pulVar, new C18546a());
    }
}
