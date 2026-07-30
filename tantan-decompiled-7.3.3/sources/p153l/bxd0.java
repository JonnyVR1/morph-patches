package p153l;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import com.immomo.momosec.device.oaid.OAIDException;
import org.eclipse.jetty.http.HttpTokens;
import org.spongycastle.math.p135ec.Tnaf;

/* JADX INFO: loaded from: classes7.dex */
public class bxd0 implements d1m {

    /* JADX INFO: renamed from: a */
    private final Context f78861a;

    /* JADX INFO: renamed from: l.bxd0$a */
    public class C16130a implements w350.InterfaceC21004a {
        public C16130a() {
        }

        @Override // p153l.w350.InterfaceC21004a
        /* JADX INFO: renamed from: a */
        public String mo106876a(IBinder iBinder) throws RemoteException, OAIDException {
            gsl gslVarM132067O = gsl.AbstractBinderC17297a.m132067O(iBinder);
            if (gslVarM132067O != null) {
                return gslVarM132067O.mo132065j();
            }
            throw new OAIDException(qmw.m177151a(new byte[]{121, 34, 84, 65, 8, 5, 85, 47, 85, 100, 4, 20, 70, 15, 82, 82, 65, 15, 67, 70, 95, 66, HttpTokens.CARRIAGE_RETURN, 10}));
        }
    }

    public bxd0(Context context) {
        this.f78861a = context;
    }

    @Override // p153l.d1m
    /* JADX INFO: renamed from: a */
    public boolean mo106874a() {
        Context context = this.f78861a;
        if (context == null) {
            return false;
        }
        try {
            return context.getPackageManager().getPackageInfo(qmw.m177151a(new byte[]{83, 9, 92, 25, 18, 7, 93, 21, 68, 89, 6, 72, 81, 8, 85, 69, 14, 15, 84, 72, 85, 82, 23, 15, 83, 3, 88, 83, 18, 3, 66, Tnaf.POW_2_WIDTH, 88, 84, 4}), 0) != null;
        } catch (Exception unused) {
        }
    }

    @Override // p153l.d1m
    /* JADX INFO: renamed from: b */
    public void mo106875b(pul pulVar) {
        if (this.f78861a == null || pulVar == null) {
            return;
        }
        Intent intent = new Intent();
        intent.setClassName(qmw.m177151a(new byte[]{83, 9, 92, 25, 18, 7, 93, 21, 68, 89, 6, 72, 81, 8, 85, 69, 14, 15, 84, 72, 85, 82, 23, 15, 83, 3, 88, 83, 18, 3, 66, Tnaf.POW_2_WIDTH, 88, 84, 4}), qmw.m177151a(new byte[]{83, 9, 92, 25, 18, 7, 93, 21, 68, 89, 6, 72, 81, 8, 85, 69, 14, 15, 84, 72, 85, 82, 23, 15, 83, 3, 88, 83, 18, 3, 66, Tnaf.POW_2_WIDTH, 88, 84, 4, 72, 116, 3, 71, 94, 2, 3, 121, 2, 98, 82, 19, Tnaf.POW_2_WIDTH, 89, 5, 84}));
        w350.m204736a(this.f78861a, intent, pulVar, new C16130a());
    }
}
