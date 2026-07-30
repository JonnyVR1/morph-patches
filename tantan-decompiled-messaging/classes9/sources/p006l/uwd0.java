package p006l;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.R$string;
import com.p1.mobile.putong.core.data.FreeTrialEnvelope;
import com.p1.mobile.putong.data.NavigationIntent;
import com.tantanapp.common.utils.NullChecker;
import l.e30;
import l.f30;
import l.jji0;
import l.lsi0;
import l.mkd0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class uwd0 extends kxd0 {
    @Override // p006l.kxd0
    /* JADX INFO: renamed from: a */
    public void mo11681a(final w2e0 w2e0Var, f30<String, String> f30Var) {
        final Long lM25578g = m25578g(w2e0Var);
        if (lM25578g.longValue() == 0) {
            lsi0.h(R$string.f1921M5);
        } else if (NullChecker.a(CoreModule.f1534c.f3643j0.m2504C4())) {
            m25579h(w2e0Var.m26156b(), lM25578g);
        } else {
            w2e0Var.m26156b().duringCreated(CoreModule.f1534c.f3643j0.m2512G4()).subscribe(mkd0.H(new e30() { // from class: l.swd0
                public final void call(Object obj) {
                    this.f21700a.m25580i(w2e0Var, lM25578g, (FreeTrialEnvelope) obj);
                }
            }, new e30() { // from class: l.twd0
                public final void call(Object obj) {
                    lsi0.h(R$string.f1921M5);
                }
            }));
        }
    }

    @Override // p006l.kxd0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo11682c(w2e0 w2e0Var, f30<String, String> f30Var) {
        return null;
    }

    /* JADX INFO: renamed from: g */
    public final Long m25578g(w2e0 w2e0Var) {
        long j = 0;
        try {
            String queryParameter = Uri.parse(w2e0Var.m26157c()).getQueryParameter("endTime");
            if (!jji0.b(queryParameter)) {
                j = Long.parseLong(queryParameter);
            }
        } catch (Exception unused) {
        }
        return Long.valueOf(j);
    }

    /* JADX INFO: renamed from: h */
    public final void m25579h(Context context, Long l2) {
        if (CoreModule.f1534c.f3643j0.m2504C4().startTime >= l2.longValue() || !CoreModule.f1534c.f3643j0.m2532Q4()) {
            lsi0.h(R$string.f1921M5);
        } else {
            context.startActivity(lva.m19032k(context, NavigationIntent.get("freeTrialPromotion")));
        }
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m25580i(w2e0 w2e0Var, Long l2, FreeTrialEnvelope freeTrialEnvelope) {
        if (NullChecker.a(CoreModule.f1534c.f3643j0.m2504C4())) {
            m25579h(w2e0Var.m26156b(), l2);
        } else {
            lsi0.h(R$string.f1921M5);
        }
    }
}
