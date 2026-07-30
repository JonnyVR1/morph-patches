package p149l;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.RecentlyNonNull;
import com.google.android.ump.ConsentInformation;
import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
public final class m6k0 {

    /* JADX INFO: renamed from: l.m6k0$a */
    public interface InterfaceC18403a {
        /* JADX INFO: renamed from: b */
        void mo106024b(@RecentlyNonNull ryi ryiVar);
    }

    /* JADX INFO: renamed from: l.m6k0$b */
    public interface InterfaceC18404b {
        /* JADX INFO: renamed from: a */
        void mo114527a(@RecentlyNonNull qw5 qw5Var);
    }

    @RecentlyNonNull
    /* JADX INFO: renamed from: a */
    public static ConsentInformation m153244a(@RecentlyNonNull Context context) {
        return g0r0.m123998a(context).mo123999b();
    }

    /* JADX INFO: renamed from: b */
    public static void m153245b(@RecentlyNonNull final Activity activity, @RecentlyNonNull final qw5.InterfaceC19595a interfaceC19595a) {
        if (g0r0.m123998a(activity).mo123999b().mo15381b()) {
            interfaceC19595a.mo162962a(null);
            return;
        }
        ics0 ics0VarMo124000c = g0r0.m123998a(activity).mo124000c();
        jft0.m141214a();
        InterfaceC18404b interfaceC18404b = new InterfaceC18404b() { // from class: l.u9s0
            @Override // p149l.m6k0.InterfaceC18404b
            /* JADX INFO: renamed from: a */
            public final void mo114527a(qw5 qw5Var) {
                qw5Var.mo176772a(activity, interfaceC19595a);
            }
        };
        Objects.requireNonNull(interfaceC19595a);
        ics0VarMo124000c.m135366b(interfaceC18404b, new InterfaceC18403a() { // from class: l.cbs0
            @Override // p149l.m6k0.InterfaceC18403a
            /* JADX INFO: renamed from: b */
            public final void mo106024b(ryi ryiVar) {
                interfaceC19595a.mo162962a(ryiVar);
            }
        });
    }
}
