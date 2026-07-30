package p153l;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.data.FreeTrialEnvelope;
import com.p051p1.mobile.putong.data.NavigationIntent;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes9.dex */
public class y4e0 extends o5e0 {
    @Override // p153l.o5e0
    /* JADX INFO: renamed from: a */
    public void mo95798a(final abe0 abe0Var, z20<String, String> z20Var) {
        final Long lM214200g = m214200g(abe0Var);
        if (lM214200g.longValue() == 0) {
            o1j0.m165634h(R$string.f18722O5);
        } else if (NullChecker.m82486a(CoreModule.f18264c.f20396j0.m31579C4())) {
            m214201h(abe0Var.m96739b(), lM214200g);
        } else {
            ((Act) abe0Var.m96739b()).duringCreated(CoreModule.f18264c.f20396j0.m31587G4()).subscribe(psd0.m173597H(new y20() { // from class: l.w4e0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f187401a.m214202i(abe0Var, lM214200g, (FreeTrialEnvelope) obj);
                }
            }, new y20() { // from class: l.x4e0
                @Override // p153l.y20
                public final void call(Object obj) {
                    o1j0.m165634h(R$string.f18722O5);
                }
            }));
        }
    }

    @Override // p153l.o5e0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo95799c(abe0 abe0Var, z20<String, String> z20Var) {
        return null;
    }

    /* JADX INFO: renamed from: g */
    public final Long m214200g(abe0 abe0Var) {
        long j = 0;
        try {
            String queryParameter = Uri.parse(abe0Var.m96740c()).getQueryParameter("endTime");
            if (!jsi0.m146843b(queryParameter)) {
                j = Long.parseLong(queryParameter);
            }
        } catch (Exception unused) {
        }
        return Long.valueOf(j);
    }

    /* JADX INFO: renamed from: h */
    public final void m214201h(Context context, Long l2) {
        if (CoreModule.f18264c.f20396j0.m31579C4().startTime >= l2.longValue() || !CoreModule.f18264c.f20396j0.m31607Q4()) {
            o1j0.m165634h(R$string.f18722O5);
        } else {
            context.startActivity(xwa.m213316k(context, NavigationIntent.get("freeTrialPromotion")));
        }
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m214202i(abe0 abe0Var, Long l2, FreeTrialEnvelope freeTrialEnvelope) {
        if (NullChecker.m82486a(CoreModule.f18264c.f20396j0.m31579C4())) {
            m214201h(abe0Var.m96739b(), l2);
        } else {
            o1j0.m165634h(R$string.f18722O5);
        }
    }
}
