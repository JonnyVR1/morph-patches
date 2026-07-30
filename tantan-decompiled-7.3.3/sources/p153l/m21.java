package p153l;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import com.immomo.momosec.device.oaid.OAIDException;
import org.eclipse.jetty.http.HttpTokens;
import org.spongycastle.math.p135ec.Tnaf;

/* JADX INFO: loaded from: classes7.dex */
public class m21 implements d1m {

    /* JADX INFO: renamed from: a */
    private final Context f134494a;

    /* JADX INFO: renamed from: l.m21$a */
    public class C18527a implements w350.InterfaceC21004a {
        public C18527a() {
        }

        @Override // p153l.w350.InterfaceC21004a
        /* JADX INFO: renamed from: a */
        public String mo106876a(IBinder iBinder) throws RemoteException, OAIDException {
            jsl jslVarM146848O = jsl.AbstractBinderC18024a.m146848O(iBinder);
            if (jslVarM146848O == null) {
                throw new OAIDException(qmw.m177151a(new byte[]{121, 34, 88, 83, HttpTokens.SPACE, 15, 84, 10, 120, 89, 21, 3, 66, 0, 80, 84, 4, 70, 89, 21, 17, 89, 20, 10, 92}));
            }
            if (jslVarM146848O.isSupport()) {
                return jslVarM146848O.mo146846j();
            }
            throw new OAIDException(qmw.m177151a(new byte[]{121, 34, 88, 83, HttpTokens.SPACE, 15, 84, 10, 120, 89, 21, 3, 66, 0, 80, 84, 4, 69, 89, 21, 98, 66, 17, 22, 95, 20, 69, 23, 19, 3, 68, 19, 67, 89, 65, 0, 81, 10, 66, 82}));
        }
    }

    public m21(Context context) {
        this.f134494a = context;
    }

    @Override // p153l.d1m
    /* JADX INFO: renamed from: a */
    public boolean mo106874a() {
        Context context = this.f134494a;
        if (context == null) {
            return false;
        }
        try {
            return context.getPackageManager().getPackageInfo(qmw.m177151a(new byte[]{83, 9, 92, 25, 0, 21, 69, 21, 31, 90, 18, 7, 30, 53, 68, 71, 17, 10, 85, 11, 84, 89, 21, 7, 66, 31, 117, 126, 37}), 0) != null;
        } catch (Exception unused) {
        }
    }

    @Override // p153l.d1m
    /* JADX INFO: renamed from: b */
    public void mo106875b(pul pulVar) {
        if (this.f134494a == null || pulVar == null) {
            return;
        }
        Intent intent = new Intent(qmw.m177151a(new byte[]{83, 9, 92, 25, 0, 21, 69, 21, 31, 90, 18, 7, 30, 7, 82, 67, 8, 9, 94, 72, 112, 116, 34, 35, 99, 53, 110, 115, 40, 34}));
        intent.setComponent(new ComponentName(qmw.m177151a(new byte[]{83, 9, 92, 25, 0, 21, 69, 21, 31, 90, 18, 7, 30, 53, 68, 71, 17, 10, 85, 11, 84, 89, 21, 7, 66, 31, 117, 126, 37}), qmw.m177151a(new byte[]{83, 9, 92, 25, 0, 21, 69, 21, 31, 90, 18, 7, 30, 53, 68, 71, 17, 10, 85, 11, 84, 89, 21, 7, 66, 31, 117, 126, 37, 72, 99, 19, 65, 71, HttpTokens.CARRIAGE_RETURN, 3, 93, 3, 95, 67, 0, 20, 73, 34, 120, 115, 50, 3, 66, Tnaf.POW_2_WIDTH, 88, 84, 4})));
        w350.m204736a(this.f134494a, intent, pulVar, new C18527a());
    }
}
