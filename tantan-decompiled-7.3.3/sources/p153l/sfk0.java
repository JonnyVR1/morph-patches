package p153l;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.RecentlyNonNull;
import com.google.android.ump.ConsentInformation;
import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
public final class sfk0 {

    /* JADX INFO: renamed from: l.sfk0$a */
    public interface InterfaceC20033a {
        /* JADX INFO: renamed from: b */
        void mo140415b(@RecentlyNonNull m1j m1jVar);
    }

    /* JADX INFO: renamed from: l.sfk0$b */
    public interface InterfaceC20034b {
        /* JADX INFO: renamed from: a */
        void mo98453a(@RecentlyNonNull vx5 vx5Var);
    }

    @RecentlyNonNull
    /* JADX INFO: renamed from: a */
    public static ConsentInformation m185624a(@RecentlyNonNull Context context) {
        return m9r0.m157594a(context).mo157595b();
    }

    /* JADX INFO: renamed from: b */
    public static void m185625b(@RecentlyNonNull final Activity activity, @RecentlyNonNull final vx5.InterfaceC20951a interfaceC20951a) {
        if (m9r0.m157594a(activity).mo157595b().mo15435b()) {
            interfaceC20951a.mo148588a(null);
            return;
        }
        ols0 ols0VarMo157596c = m9r0.m157594a(activity).mo157596c();
        pot0.m173113a();
        InterfaceC20034b interfaceC20034b = new InterfaceC20034b() { // from class: l.ajs0
            @Override // p153l.sfk0.InterfaceC20034b
            /* JADX INFO: renamed from: a */
            public final void mo98453a(vx5 vx5Var) {
                vx5Var.mo119672a(activity, interfaceC20951a);
            }
        };
        Objects.requireNonNull(interfaceC20951a);
        ols0VarMo157596c.m168166b(interfaceC20034b, new InterfaceC20033a() { // from class: l.iks0
            @Override // p153l.sfk0.InterfaceC20033a
            /* JADX INFO: renamed from: b */
            public final void mo140415b(m1j m1jVar) {
                interfaceC20951a.mo148588a(m1jVar);
            }
        });
    }
}
