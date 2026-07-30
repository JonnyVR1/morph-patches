package p153l;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.RemoteException;
import android.provider.Settings;
import android.text.TextUtils;
import com.immomo.momosec.device.oaid.OAIDException;
import org.spongycastle.math.p135ec.Tnaf;

/* JADX INFO: loaded from: classes7.dex */
public class gol implements d1m {

    /* JADX INFO: renamed from: a */
    private final Context f105306a;

    /* JADX INFO: renamed from: b */
    private String f105307b;

    /* JADX INFO: renamed from: l.gol$a */
    public class C17268a implements w350.InterfaceC21004a {
        public C17268a() {
        }

        @Override // p153l.w350.InterfaceC21004a
        /* JADX INFO: renamed from: a */
        public String mo106876a(IBinder iBinder) throws RemoteException, OAIDException {
            jx50 jx50VarM147331O = jx50.AbstractBinderC18050a.m147331O(iBinder);
            if (jx50VarM147331O.mo147329j5()) {
                throw new OAIDException(qmw.m177151a(new byte[]{101, 21, 84, 69, 65, 14, 81, 21, 17, 83, 8, 21, 81, 4, 93, 82, 5, 70, 81, 2, 71, 82, 19, 18, 89, 21, 88, 89, 6, 70, 89, 2, 84, 89, 21, 15, 86, 15, 84, 69}));
            }
            return jx50VarM147331O.mo147330k4();
        }
    }

    public gol(Context context) {
        this.f105306a = context;
    }

    @Override // p153l.d1m
    /* JADX INFO: renamed from: a */
    public boolean mo106874a() {
        Context context = this.f105306a;
        if (context == null) {
            return false;
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager.getPackageInfo(qmw.m177151a(new byte[]{83, 9, 92, 25, 9, 19, 81, 17, 84, 94, 79, 14, 71, 15, 85}), 0) != null) {
                this.f105307b = qmw.m177151a(new byte[]{83, 9, 92, 25, 9, 19, 81, 17, 84, 94, 79, 14, 71, 15, 85});
                return true;
            }
            if (packageManager.getPackageInfo(qmw.m177151a(new byte[]{83, 9, 92, 25, 9, 19, 81, 17, 84, 94, 79, 14, 71, 15, 85, 25, 21, Tnaf.POW_2_WIDTH}), 0) != null) {
                this.f105307b = qmw.m177151a(new byte[]{83, 9, 92, 25, 9, 19, 81, 17, 84, 94, 79, 14, 71, 15, 85, 25, 21, Tnaf.POW_2_WIDTH});
                return true;
            }
            String strM177151a = qmw.m177151a(new byte[]{83, 9, 92, 25, 9, 19, 81, 17, 84, 94, 79, 14, 93, 21});
            this.f105307b = strM177151a;
            return packageManager.getPackageInfo(strM177151a, 0) != null;
        } catch (Exception unused) {
        }
    }

    @Override // p153l.d1m
    /* JADX INFO: renamed from: b */
    public void mo106875b(pul pulVar) {
        Context context = this.f105306a;
        if (context == null || pulVar == null) {
            return;
        }
        try {
            String string = Settings.Global.getString(context.getContentResolver(), qmw.m177151a(new byte[]{64, 22, 66, 104, 14, 7, 89, 2}));
            if (!TextUtils.isEmpty(string)) {
                jmw.m146176a(qmw.m177151a(new byte[]{119, 3, 69, 23, 14, 7, 89, 2, 17, 81, 19, 9, 93, 70, 86, 91, 14, 4, 81, 10, 17, 68, 4, 18, 68, 15, 95, 80, 18, 92, Tnaf.POW_2_WIDTH}) + string);
                pulVar.mo173888a(string);
                return;
            }
        } catch (Exception unused) {
        }
        if (TextUtils.isEmpty(this.f105307b) && !mo106874a()) {
            pulVar.mo173889b(new OAIDException(qmw.m177151a(new byte[]{120, 19, 80, 64, 4, 15, Tnaf.POW_2_WIDTH, 39, 85, 65, 4, 20, 68, 15, 66, 94, 15, 1, Tnaf.POW_2_WIDTH, 47, 117, 23, 15, 9, 68, 70, 80, 65, 0, 15, 92, 7, 83, 91, 4})));
            return;
        }
        Intent intent = new Intent(qmw.m177151a(new byte[]{83, 9, 92, 25, 20, 9, 84, 15, 66, 25, 14, 22, 85, 8, 85, 82, 23, 15, 83, 3, 31, 120, 49, 35, 126, 47, 117, 100, 62, 53, 117, 52, 103, 126, 34, 35}));
        intent.setPackage(this.f105307b);
        w350.m204736a(this.f105306a, intent, pulVar, new C17268a());
    }
}
