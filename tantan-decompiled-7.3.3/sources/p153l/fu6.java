package p153l;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import com.immomo.momosec.device.oaid.OAIDException;
import org.eclipse.jetty.http.HttpTokens;

/* JADX INFO: loaded from: classes7.dex */
public class fu6 implements d1m {

    /* JADX INFO: renamed from: a */
    private final Context f100881a;

    /* JADX INFO: renamed from: l.fu6$a */
    public class C17077a implements w350.InterfaceC21004a {
        public C17077a() {
        }

        @Override // p153l.w350.InterfaceC21004a
        /* JADX INFO: renamed from: a */
        public String mo106876a(IBinder iBinder) throws RemoteException, OAIDException {
            fsl fslVarM127208O = fsl.AbstractBinderC17066a.m127208O(iBinder);
            if (fslVarM127208O != null) {
                return fslVarM127208O.mo127206k1(fu6.this.f100881a.getPackageName());
            }
            throw new OAIDException(qmw.m177151a(new byte[]{121, 34, 84, 65, 8, 5, 85, 47, 85, 122, 0, 8, 81, 1, 84, 69, 65, 15, 67, 70, 95, 66, HttpTokens.CARRIAGE_RETURN, 10}));
        }
    }

    public fu6(Context context) {
        if (context instanceof Application) {
            this.f100881a = context;
        } else {
            this.f100881a = context.getApplicationContext();
        }
    }

    @Override // p153l.d1m
    /* JADX INFO: renamed from: a */
    public boolean mo106874a() {
        Context context = this.f100881a;
        if (context == null) {
            return false;
        }
        try {
            return context.getPackageManager().getPackageInfo(qmw.m177151a(new byte[]{83, 9, 92, 25, 2, 9, 95, 10, 65, 86, 5, 72, 84, 3, 71, 94, 2, 3, 89, 2, 66, 66, 17, 22, 95, 20, 69}), 0) != null;
        } catch (Exception unused) {
        }
    }

    @Override // p153l.d1m
    /* JADX INFO: renamed from: b */
    public void mo106875b(pul pulVar) {
        if (this.f100881a == null || pulVar == null) {
            return;
        }
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(qmw.m177151a(new byte[]{83, 9, 92, 25, 2, 9, 95, 10, 65, 86, 5, 72, 84, 3, 71, 94, 2, 3, 89, 2, 66, 66, 17, 22, 95, 20, 69}), qmw.m177151a(new byte[]{83, 9, 92, 25, 2, 9, 95, 10, 65, 86, 5, 72, 84, 3, 71, 94, 2, 3, 89, 2, 66, 66, 17, 22, 95, 20, 69, 25, 37, 3, 70, 15, 82, 82, 40, 2, 99, 3, 67, 65, 8, 5, 85})));
        w350.m204736a(this.f100881a, intent, pulVar, new C17077a());
    }
}
