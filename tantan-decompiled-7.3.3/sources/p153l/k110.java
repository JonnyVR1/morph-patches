package p153l;

import androidx.annotation.NonNull;
import com.google.common.base.Optional;
import com.p051p1.mobile.putong.feed.R$string;
import com.p051p1.mobile.putong.feed.api.C10898b;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.tantanapp.common.utils.NullChecker;
import p137rx.subjects.C22507a;

/* JADX INFO: loaded from: classes13.dex */
public class k110 {

    /* JADX INFO: renamed from: a */
    public static C22507a<Optional<pf60<Integer, Moment>>> f123440a = C22507a.m222759c(Optional.absent());

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m147840a(pf60 pf60Var) {
        if (f123440a.m222761e().isPresent() || ((Integer) pf60Var.f152156a).intValue() == 0) {
            f123440a.m137019l(Optional.m15467of(pf60Var));
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m147841b() {
        f123440a.m137019l(Optional.absent());
    }

    /* JADX INFO: renamed from: c */
    public static boolean m147842c() {
        if (!f123440a.m222761e().isPresent()) {
            return false;
        }
        Moment moment = f123440a.m222761e().get().f152157b;
        if (!NullChecker.m82486a(moment) || !C10898b.m61783Q3(moment.owner)) {
            return false;
        }
        o1j0.m165634h(R$string.f39875b2);
        return true;
    }

    /* JADX INFO: renamed from: d */
    public static void m147843d(@NonNull final pf60<Integer, Moment> pf60Var) {
        l51.m152893M(new Runnable() { // from class: l.j110
            @Override // java.lang.Runnable
            public final void run() {
                k110.m147840a(pf60Var);
            }
        });
    }
}
