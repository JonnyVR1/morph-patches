package p149l;

import android.app.KeyguardManager;
import android.content.Context;
import com.immomo.momosec.device.oaid.OAIDException;
import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
public class ht6 implements kyl {

    /* JADX INFO: renamed from: a */
    private final Context f109366a;

    /* JADX INFO: renamed from: b */
    private final KeyguardManager f109367b;

    public ht6(Context context) {
        this.f109366a = context;
        this.f109367b = (KeyguardManager) context.getSystemService(rjw.m179664a(new byte[]{91, 3, 72, 80, 20, 7, 66, 2}));
    }

    @Override // p149l.kyl
    /* JADX INFO: renamed from: a */
    public boolean mo95912a() {
        KeyguardManager keyguardManager;
        if (this.f109366a != null && (keyguardManager = this.f109367b) != null) {
            try {
                Object objInvoke = keyguardManager.getClass().getDeclaredMethod(rjw.m179664a(new byte[]{89, 21, 98, 66, 17, 22, 95, 20, 69, 82, 5}), null).invoke(this.f109367b, null);
                Objects.requireNonNull(objInvoke);
                return ((Boolean) objInvoke).booleanValue();
            } catch (Exception unused) {
            }
        }
        return false;
    }

    @Override // p149l.kyl
    /* JADX INFO: renamed from: b */
    public void mo95913b(bsl bslVar) {
        if (this.f109366a == null || bslVar == null) {
            return;
        }
        KeyguardManager keyguardManager = this.f109367b;
        if (keyguardManager == null) {
            bslVar.mo103721b(new OAIDException(rjw.m179664a(new byte[]{123, 3, 72, 80, 20, 7, 66, 2, 124, 86, 15, 7, 87, 3, 67, 23, 15, 9, 68, 70, 87, 88, 20, 8, 84})));
            return;
        }
        try {
            Object objInvoke = keyguardManager.getClass().getDeclaredMethod(rjw.m179664a(new byte[]{95, 4, 69, 86, 8, 8, 127, 7, 88, 83}), null).invoke(this.f109367b, null);
            if (objInvoke == null) {
                throw new OAIDException(rjw.m179664a(new byte[]{127, 39, 120, 115, 65, 9, 82, 18, 80, 94, 15, 70, 86, 7, 88, 91, 4, 2}));
            }
            String string = objInvoke.toString();
            kjw.m146278a(rjw.m179664a(new byte[]{127, 39, 120, 115, 65, 9, 82, 18, 80, 94, 15, 70, 67, 19, 82, 84, 4, 21, 67, 92, 17}) + string);
            bslVar.mo103720a(string);
        } catch (Exception unused) {
        }
    }
}
