package p149l;

import androidx.annotation.NonNull;
import com.google.common.base.Optional;
import com.p046p1.mobile.putong.feed.R$string;
import com.p046p1.mobile.putong.feed.api.C10735b;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.tantanapp.common.utils.NullChecker;
import p133rx.subjects.C22392a;

/* JADX INFO: loaded from: classes12.dex */
public class bt00 {

    /* JADX INFO: renamed from: a */
    public static C22392a<Optional<j760<Integer, Moment>>> f77173a = C22392a.m221513c(Optional.absent());

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m103766a(j760 j760Var) {
        if (f77173a.m221515e().isPresent() || ((Integer) j760Var.f116564a).intValue() == 0) {
            f77173a.m132487l(Optional.m15413of(j760Var));
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m103767b() {
        f77173a.m132487l(Optional.absent());
    }

    /* JADX INFO: renamed from: c */
    public static boolean m103768c() {
        if (!f77173a.m221515e().isPresent()) {
            return false;
        }
        Moment moment = f77173a.m221515e().get().f116565b;
        if (!NullChecker.m81303a(moment) || !C10735b.m60599Q3(moment.owner)) {
            return false;
        }
        lsi0.m151578h(R$string.f39027b2);
        return true;
    }

    /* JADX INFO: renamed from: d */
    public static void m103769d(@NonNull final j760<Integer, Moment> j760Var) {
        e51.m114748M(new Runnable() { // from class: l.at00
            @Override // java.lang.Runnable
            public final void run() {
                bt00.m103766a(j760Var);
            }
        });
    }
}
