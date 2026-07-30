package p007l;

import androidx.annotation.NonNull;
import com.google.common.base.Optional;
import com.p000p1.mobile.putong.feed.R$string;
import com.p000p1.mobile.putong.feed.api.C1579b;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.tantanapp.common.utils.NullChecker;
import l.e51;
import l.j760;
import l.lsi0;
import rx.subjects.a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class bt00 {

    /* JADX INFO: renamed from: a */
    public static a<Optional<j760<Integer, Moment>>> f6423a = a.c(Optional.absent());

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m9029a(j760 j760Var) {
        if (((Optional) f6423a.e()).isPresent() || ((Integer) j760Var.a).intValue() == 0) {
            f6423a.onNext(Optional.of(j760Var));
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m9030b() {
        f6423a.onNext(Optional.absent());
    }

    /* JADX INFO: renamed from: c */
    public static boolean m9031c() {
        if (!((Optional) f6423a.e()).isPresent()) {
            return false;
        }
        Moment moment = (Moment) ((j760) ((Optional) f6423a.e()).get()).b;
        if (!NullChecker.a(moment) || !C1579b.m1525Q3(moment.owner)) {
            return false;
        }
        lsi0.h(R$string.f488b2);
        return true;
    }

    /* JADX INFO: renamed from: d */
    public static void m9032d(@NonNull final j760<Integer, Moment> j760Var) {
        e51.M(new Runnable() { // from class: l.at00
            @Override // java.lang.Runnable
            public final void run() {
                bt00.m9029a(j760Var);
            }
        });
    }
}
