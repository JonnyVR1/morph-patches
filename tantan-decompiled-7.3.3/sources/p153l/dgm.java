package p153l;

import android.view.View;
import com.p051p1.mobile.putong.core.message.R$string;
import com.p051p1.mobile.putong.core.p058ui.intl.greet.message.IntlDynamicGreetListAct;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes12.dex */
public class dgm {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m115658a(Runnable runnable, View view) {
        if (NullChecker.m82486a(runnable)) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m115659b(IntlDynamicGreetListAct intlDynamicGreetListAct, final Runnable runnable) {
        new th0.C20312a(intlDynamicGreetListAct).m191148g(true).m191150i(R$string.f21681c4).m191146e(R$string.f21690d4).m191158q(R$string.f21699e4).m191156o(new View.OnClickListener() { // from class: l.cgm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                dgm.m115658a(runnable, view);
            }
        }).m191142a().m191141g();
    }
}
