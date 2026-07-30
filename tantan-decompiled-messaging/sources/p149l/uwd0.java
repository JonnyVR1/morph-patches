package p149l;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.data.FreeTrialEnvelope;
import com.p046p1.mobile.putong.data.NavigationIntent;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes9.dex */
public class uwd0 extends kxd0 {
    @Override // p149l.kxd0
    /* JADX INFO: renamed from: a */
    public void mo94421a(final w2e0 w2e0Var, f30<String, String> f30Var) {
        final Long lM196125g = m196125g(w2e0Var);
        if (lM196125g.longValue() == 0) {
            lsi0.m151578h(R$string.f17932M5);
        } else if (NullChecker.m81303a(CoreModule.f17545c.f19654j0.m30576C4())) {
            m196126h(w2e0Var.m201094b(), lM196125g);
        } else {
            ((Act) w2e0Var.m201094b()).duringCreated(CoreModule.f17545c.f19654j0.m30584G4()).subscribe(mkd0.m154956H(new e30() { // from class: l.swd0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f166655a.m196127i(w2e0Var, lM196125g, (FreeTrialEnvelope) obj);
                }
            }, new e30() { // from class: l.twd0
                @Override // p149l.e30
                public final void call(Object obj) {
                    lsi0.m151578h(R$string.f17932M5);
                }
            }));
        }
    }

    @Override // p149l.kxd0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo94422c(w2e0 w2e0Var, f30<String, String> f30Var) {
        return null;
    }

    /* JADX INFO: renamed from: g */
    public final Long m196125g(w2e0 w2e0Var) {
        long j = 0;
        try {
            String queryParameter = Uri.parse(w2e0Var.m201095c()).getQueryParameter("endTime");
            if (!jji0.m141806b(queryParameter)) {
                j = Long.parseLong(queryParameter);
            }
        } catch (Exception unused) {
        }
        return Long.valueOf(j);
    }

    /* JADX INFO: renamed from: h */
    public final void m196126h(Context context, Long l2) {
        if (CoreModule.f17545c.f19654j0.m30576C4().startTime >= l2.longValue() || !CoreModule.f17545c.f19654j0.m30604Q4()) {
            lsi0.m151578h(R$string.f17932M5);
        } else {
            context.startActivity(lva.m151855k(context, NavigationIntent.get("freeTrialPromotion")));
        }
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m196127i(w2e0 w2e0Var, Long l2, FreeTrialEnvelope freeTrialEnvelope) {
        if (NullChecker.m81303a(CoreModule.f17545c.f19654j0.m30576C4())) {
            m196126h(w2e0Var.m201094b(), l2);
        } else {
            lsi0.m151578h(R$string.f17932M5);
        }
    }
}
