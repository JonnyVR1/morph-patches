package p149l;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.RemoteException;
import android.provider.Settings;
import android.text.TextUtils;
import com.immomo.momosec.device.oaid.OAIDException;
import org.spongycastle.math.p131ec.Tnaf;

/* JADX INFO: loaded from: classes7.dex */
public class ull implements kyl {

    /* JADX INFO: renamed from: a */
    private final Context f177075a;

    /* JADX INFO: renamed from: b */
    private String f177076b;

    /* JADX INFO: renamed from: l.ull$a */
    public class C20454a implements hv40.InterfaceC17408a {
        public C20454a() {
        }

        @Override // p149l.hv40.InterfaceC17408a
        /* JADX INFO: renamed from: a */
        public String mo99612a(IBinder iBinder) throws RemoteException, OAIDException {
            dp50 dp50VarM112866O = dp50.AbstractBinderC16421a.m112866O(iBinder);
            if (dp50VarM112866O.mo112864j5()) {
                throw new OAIDException(rjw.m179664a(new byte[]{101, 21, 84, 69, 65, 14, 81, 21, 17, 83, 8, 21, 81, 4, 93, 82, 5, 70, 81, 2, 71, 82, 19, 18, 89, 21, 88, 89, 6, 70, 89, 2, 84, 89, 21, 15, 86, 15, 84, 69}));
            }
            return dp50VarM112866O.mo112865k4();
        }
    }

    public ull(Context context) {
        this.f177075a = context;
    }

    @Override // p149l.kyl
    /* JADX INFO: renamed from: a */
    public boolean mo95912a() {
        Context context = this.f177075a;
        if (context == null) {
            return false;
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager.getPackageInfo(rjw.m179664a(new byte[]{83, 9, 92, 25, 9, 19, 81, 17, 84, 94, 79, 14, 71, 15, 85}), 0) != null) {
                this.f177076b = rjw.m179664a(new byte[]{83, 9, 92, 25, 9, 19, 81, 17, 84, 94, 79, 14, 71, 15, 85});
                return true;
            }
            if (packageManager.getPackageInfo(rjw.m179664a(new byte[]{83, 9, 92, 25, 9, 19, 81, 17, 84, 94, 79, 14, 71, 15, 85, 25, 21, Tnaf.POW_2_WIDTH}), 0) != null) {
                this.f177076b = rjw.m179664a(new byte[]{83, 9, 92, 25, 9, 19, 81, 17, 84, 94, 79, 14, 71, 15, 85, 25, 21, Tnaf.POW_2_WIDTH});
                return true;
            }
            String strM179664a = rjw.m179664a(new byte[]{83, 9, 92, 25, 9, 19, 81, 17, 84, 94, 79, 14, 93, 21});
            this.f177076b = strM179664a;
            return packageManager.getPackageInfo(strM179664a, 0) != null;
        } catch (Exception unused) {
        }
    }

    @Override // p149l.kyl
    /* JADX INFO: renamed from: b */
    public void mo95913b(bsl bslVar) {
        Context context = this.f177075a;
        if (context == null || bslVar == null) {
            return;
        }
        try {
            String string = Settings.Global.getString(context.getContentResolver(), rjw.m179664a(new byte[]{64, 22, 66, 104, 14, 7, 89, 2}));
            if (!TextUtils.isEmpty(string)) {
                kjw.m146278a(rjw.m179664a(new byte[]{119, 3, 69, 23, 14, 7, 89, 2, 17, 81, 19, 9, 93, 70, 86, 91, 14, 4, 81, 10, 17, 68, 4, 18, 68, 15, 95, 80, 18, 92, Tnaf.POW_2_WIDTH}) + string);
                bslVar.mo103720a(string);
                return;
            }
        } catch (Exception unused) {
        }
        if (TextUtils.isEmpty(this.f177076b) && !mo95912a()) {
            bslVar.mo103721b(new OAIDException(rjw.m179664a(new byte[]{120, 19, 80, 64, 4, 15, Tnaf.POW_2_WIDTH, 39, 85, 65, 4, 20, 68, 15, 66, 94, 15, 1, Tnaf.POW_2_WIDTH, 47, 117, 23, 15, 9, 68, 70, 80, 65, 0, 15, 92, 7, 83, 91, 4})));
            return;
        }
        Intent intent = new Intent(rjw.m179664a(new byte[]{83, 9, 92, 25, 20, 9, 84, 15, 66, 25, 14, 22, 85, 8, 85, 82, 23, 15, 83, 3, 31, 120, 49, 35, 126, 47, 117, 100, 62, 53, 117, 52, 103, 126, 34, 35}));
        intent.setPackage(this.f177076b);
        hv40.m133147a(this.f177075a, intent, bslVar, new C20454a());
    }
}
