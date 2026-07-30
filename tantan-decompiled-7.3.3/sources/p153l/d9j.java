package p153l;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import com.immomo.momosec.device.oaid.OAIDException;
import org.spongycastle.math.p135ec.Tnaf;

/* JADX INFO: loaded from: classes7.dex */
public class d9j implements d1m {

    /* JADX INFO: renamed from: a */
    private final Context f85788a;

    /* JADX INFO: renamed from: l.d9j$a */
    public class C16492a implements w350.InterfaceC21004a {
        public C16492a() {
        }

        @Override // p153l.w350.InterfaceC21004a
        /* JADX INFO: renamed from: a */
        public String mo106876a(IBinder iBinder) throws RemoteException, OAIDException {
            ufm ufmVarM195848O = ufm.AbstractBinderC20560a.m195848O(iBinder);
            if (ufmVarM195848O != null) {
                return ufmVarM195848O.mo195845j();
            }
            throw new OAIDException(qmw.m177151a(new byte[]{121, 2, 66, 100, 20, 22, 64, 10, 88, 82, 19, 70, 89, 21, 17, 89, 20, 10, 92}));
        }
    }

    public d9j(Context context) {
        this.f85788a = context;
    }

    @Override // p153l.d1m
    /* JADX INFO: renamed from: a */
    public boolean mo106874a() {
        Context context = this.f85788a;
        if (context == null) {
            return false;
        }
        try {
            return context.getPackageManager().getPackageInfo(qmw.m177151a(new byte[]{83, 9, 92, 25, 0, 8, 84, 20, 94, 94, 5, 72, 83, 20, 84, 86, 21, 9, 66}), 0) != null;
        } catch (Exception unused) {
        }
    }

    @Override // p153l.d1m
    /* JADX INFO: renamed from: b */
    public void mo106875b(pul pulVar) {
        if (this.f85788a == null || pulVar == null) {
            return;
        }
        Intent intent = new Intent(qmw.m177151a(new byte[]{81, 8, 85, 69, 14, 15, 84, 72, 66, 82, 19, Tnaf.POW_2_WIDTH, 89, 5, 84, 25, 0, 5, 68, 15, 94, 89, 79, 11, 67, 7}));
        intent.setPackage(qmw.m177151a(new byte[]{83, 9, 92, 25, 0, 8, 84, 20, 94, 94, 5, 72, 83, 20, 84, 86, 21, 9, 66}));
        w350.m204736a(this.f85788a, intent, pulVar, new C16492a());
    }
}
