package p153l;

import android.app.KeyguardManager;
import android.content.Context;
import com.immomo.momosec.device.oaid.OAIDException;
import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
public class ku6 implements d1m {

    /* JADX INFO: renamed from: a */
    private final Context f128817a;

    /* JADX INFO: renamed from: b */
    private final KeyguardManager f128818b;

    public ku6(Context context) {
        this.f128817a = context;
        this.f128818b = (KeyguardManager) context.getSystemService(qmw.m177151a(new byte[]{91, 3, 72, 80, 20, 7, 66, 2}));
    }

    @Override // p153l.d1m
    /* JADX INFO: renamed from: a */
    public boolean mo106874a() {
        KeyguardManager keyguardManager;
        if (this.f128817a != null && (keyguardManager = this.f128818b) != null) {
            try {
                Object objInvoke = keyguardManager.getClass().getDeclaredMethod(qmw.m177151a(new byte[]{89, 21, 98, 66, 17, 22, 95, 20, 69, 82, 5}), null).invoke(this.f128818b, null);
                Objects.requireNonNull(objInvoke);
                return ((Boolean) objInvoke).booleanValue();
            } catch (Exception unused) {
            }
        }
        return false;
    }

    @Override // p153l.d1m
    /* JADX INFO: renamed from: b */
    public void mo106875b(pul pulVar) {
        if (this.f128817a == null || pulVar == null) {
            return;
        }
        KeyguardManager keyguardManager = this.f128818b;
        if (keyguardManager == null) {
            pulVar.mo173889b(new OAIDException(qmw.m177151a(new byte[]{123, 3, 72, 80, 20, 7, 66, 2, 124, 86, 15, 7, 87, 3, 67, 23, 15, 9, 68, 70, 87, 88, 20, 8, 84})));
            return;
        }
        try {
            Object objInvoke = keyguardManager.getClass().getDeclaredMethod(qmw.m177151a(new byte[]{95, 4, 69, 86, 8, 8, 127, 7, 88, 83}), null).invoke(this.f128818b, null);
            if (objInvoke == null) {
                throw new OAIDException(qmw.m177151a(new byte[]{127, 39, 120, 115, 65, 9, 82, 18, 80, 94, 15, 70, 86, 7, 88, 91, 4, 2}));
            }
            String string = objInvoke.toString();
            jmw.m146176a(qmw.m177151a(new byte[]{127, 39, 120, 115, 65, 9, 82, 18, 80, 94, 15, 70, 67, 19, 82, 84, 4, 21, 67, 92, 17}) + string);
            pulVar.mo173888a(string);
        } catch (Exception unused) {
        }
    }
}
