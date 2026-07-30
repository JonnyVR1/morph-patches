package p153l;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import com.immomo.momosec.device.oaid.OAIDException;
import org.spongycastle.math.p135ec.Tnaf;

/* JADX INFO: loaded from: classes7.dex */
public class scr implements d1m {

    /* JADX INFO: renamed from: a */
    private final Context f167277a;

    /* JADX INFO: renamed from: l.scr$a */
    public class C20017a implements w350.InterfaceC21004a {
        public C20017a() {
        }

        @Override // p153l.w350.InterfaceC21004a
        /* JADX INFO: renamed from: a */
        public String mo106876a(IBinder iBinder) throws RemoteException, OAIDException {
            hsl hslVarM136984O = hsl.AbstractBinderC17571a.m136984O(iBinder);
            if (hslVarM136984O == null) {
                throw new OAIDException(qmw.m177151a(new byte[]{121, 34, 84, 65, 8, 5, 85, 15, 85, 126, 15, 18, 85, 20, 87, 86, 2, 3, Tnaf.POW_2_WIDTH, 15, 66, 23, 15, 19, 92, 10}));
            }
            if (hslVarM136984O.isSupport()) {
                return hslVarM136984O.mo136982j();
            }
            throw new OAIDException(qmw.m177151a(new byte[]{121, 34, 84, 65, 8, 5, 85, 15, 85, 126, 15, 18, 85, 20, 87, 86, 2, 3, 19, 15, 66, 100, 20, 22, 64, 9, 67, 67, 65, 20, 85, 18, 68, 69, 15, 70, 86, 7, 93, 68, 4}));
        }
    }

    public scr(Context context) {
        this.f167277a = context;
    }

    @Override // p153l.d1m
    /* JADX INFO: renamed from: a */
    public boolean mo106874a() {
        Context context = this.f167277a;
        if (context == null) {
            return false;
        }
        try {
            return context.getPackageManager().getPackageInfo(qmw.m177151a(new byte[]{83, 9, 92, 25, 27, 19, 89, 72, 85, 82, 23, 15, 83, 3, 88, 83, 18, 3, 66, Tnaf.POW_2_WIDTH, 88, 84, 4}), 0) != null;
        } catch (Exception unused) {
        }
    }

    @Override // p153l.d1m
    /* JADX INFO: renamed from: b */
    public void mo106875b(pul pulVar) {
        if (this.f167277a == null || pulVar == null) {
            return;
        }
        Intent intent = new Intent();
        intent.setClassName(qmw.m177151a(new byte[]{83, 9, 92, 25, 27, 19, 89, 72, 85, 82, 23, 15, 83, 3, 88, 83, 18, 3, 66, Tnaf.POW_2_WIDTH, 88, 84, 4}), qmw.m177151a(new byte[]{83, 9, 92, 25, 27, 19, 89, 72, 85, 82, 23, 15, 83, 3, 88, 83, 18, 3, 66, Tnaf.POW_2_WIDTH, 88, 84, 4, 72, 116, 3, 71, 94, 2, 3, 89, 2, 98, 82, 19, Tnaf.POW_2_WIDTH, 89, 5, 84}));
        w350.m204736a(this.f167277a, intent, pulVar, new C20017a());
    }
}
