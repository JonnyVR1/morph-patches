package p153l;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import android.os.RemoteException;
import com.immomo.momosec.device.oaid.OAIDException;
import org.eclipse.jetty.http.HttpTokens;
import org.spongycastle.math.p135ec.Tnaf;

/* JADX INFO: loaded from: classes7.dex */
public class k710 implements d1m {

    /* JADX INFO: renamed from: a */
    private final Context f124234a;

    /* JADX INFO: renamed from: l.k710$a */
    public class C18113a implements w350.InterfaceC21004a {
        public C18113a() {
        }

        @Override // p153l.w350.InterfaceC21004a
        /* JADX INFO: renamed from: a */
        public String mo106876a(IBinder iBinder) throws RemoteException, OAIDException {
            j710 j710VarM143742O = j710.AbstractBinderC17891a.m143742O(iBinder);
            if (j710VarM143742O == null) {
                throw new OAIDException(qmw.m177151a(new byte[]{125, 21, 80, 126, 5, 47, 94, 18, 84, 69, 7, 7, 83, 3, 17, 94, 18, 70, 94, 19, 93, 91}));
            }
            if (j710VarM143742O.isSupported()) {
                return j710VarM143742O.mo143740j();
            }
            throw new OAIDException(qmw.m177151a(new byte[]{125, 21, 80, 126, 5, 47, 94, 18, 84, 69, 7, 7, 83, 3, 18, 94, 18, 53, 69, 22, 65, 88, 19, 18, 85, 2, 17, 69, 4, 18, 69, 20, 95, 23, 7, 7, 92, 21, 84}));
        }
    }

    public k710(Context context) {
        this.f124234a = context;
    }

    /* JADX INFO: renamed from: c */
    private void m148589c() {
        try {
            Intent intent = new Intent(qmw.m177151a(new byte[]{83, 9, 92, 25, 3, 19, 94, 72, 92, 68, 0, 72, 81, 5, 69, 94, 14, 8, 30, 21, 69, 86, 19, 18, 30, 21, 84, 69, 23, 15, 83, 3}));
            intent.setClassName(qmw.m177151a(new byte[]{83, 9, 92, 25, 12, 2, 89, 2, 31, 90, 18, 7}), qmw.m177151a(new byte[]{83, 9, 92, 25, 12, 2, 89, 2, 31, 90, 18, 7, 30, 21, 84, 69, 23, 15, 83, 3, 31, 122, 18, 7, 123, 10, 98, 82, 19, Tnaf.POW_2_WIDTH, 89, 5, 84}));
            intent.putExtra(qmw.m177151a(new byte[]{83, 9, 92, 25, 3, 19, 94, 72, 92, 68, 0, 72, 64, 7, 67, 86, 12, 72, 64, HttpTokens.CARRIAGE_RETURN, 86, 89, 0, 11, 85}), this.f124234a.getPackageName());
            int i = Build.VERSION.SDK_INT;
            Context context = this.f124234a;
            if (i < 26) {
                context.startService(intent);
            } else {
                context.startForegroundService(intent);
            }
        } catch (Exception unused) {
        }
    }

    @Override // p153l.d1m
    /* JADX INFO: renamed from: a */
    public boolean mo106874a() {
        Context context = this.f124234a;
        if (context == null) {
            return false;
        }
        try {
            return context.getPackageManager().getPackageInfo(qmw.m177151a(new byte[]{83, 9, 92, 25, 12, 2, 89, 2, 31, 90, 18, 7}), 0) != null;
        } catch (Exception unused) {
        }
    }

    @Override // p153l.d1m
    /* JADX INFO: renamed from: b */
    public void mo106875b(pul pulVar) {
        if (this.f124234a == null || pulVar == null) {
            return;
        }
        m148589c();
        Intent intent = new Intent(qmw.m177151a(new byte[]{83, 9, 92, 25, 3, 19, 94, 72, 92, 68, 0, 72, 81, 5, 69, 94, 14, 8, 30, 4, 88, 89, 5, 18, 95, 72, 66, 82, 19, Tnaf.POW_2_WIDTH, 89, 5, 84}));
        intent.setClassName(qmw.m177151a(new byte[]{83, 9, 92, 25, 12, 2, 89, 2, 31, 90, 18, 7}), qmw.m177151a(new byte[]{83, 9, 92, 25, 12, 2, 89, 2, 31, 90, 18, 7, 30, 21, 84, 69, 23, 15, 83, 3, 31, 122, 18, 7, 121, 2, 98, 82, 19, Tnaf.POW_2_WIDTH, 89, 5, 84}));
        intent.putExtra(qmw.m177151a(new byte[]{83, 9, 92, 25, 3, 19, 94, 72, 92, 68, 0, 72, 64, 7, 67, 86, 12, 72, 64, HttpTokens.CARRIAGE_RETURN, 86, 89, 0, 11, 85}), this.f124234a.getPackageName());
        w350.m204736a(this.f124234a, intent, pulVar, new C18113a());
    }
}
