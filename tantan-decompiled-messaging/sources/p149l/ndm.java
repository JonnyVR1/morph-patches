package p149l;

import android.view.View;
import com.p046p1.mobile.putong.core.message.R$string;
import com.p046p1.mobile.putong.core.p053ui.intl.greet.message.IntlDynamicGreetListAct;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes10.dex */
public class ndm {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m158995a(Runnable runnable, View view) {
        if (NullChecker.m81303a(runnable)) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m158996b(IntlDynamicGreetListAct intlDynamicGreetListAct, final Runnable runnable) {
        new xh0.C21150a(intlDynamicGreetListAct).m208728g(true).m208730i(R$string.f20939c4).m208726e(R$string.f20948d4).m208738q(R$string.f20957e4).m208736o(new View.OnClickListener() { // from class: l.mdm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ndm.m158995a(runnable, view);
            }
        }).m208722a().m208721g();
    }
}
