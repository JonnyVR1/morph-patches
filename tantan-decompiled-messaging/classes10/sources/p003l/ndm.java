package p003l;

import android.view.View;
import com.p000p1.mobile.putong.core.message.R$string;
import com.p000p1.mobile.putong.core.p001ui.intl.greet.message.IntlDynamicGreetListAct;
import com.tantanapp.common.utils.NullChecker;
import l.xh0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class ndm {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m8326a(Runnable runnable, View view) {
        if (NullChecker.a(runnable)) {
            runnable.run();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static void m8327b(IntlDynamicGreetListAct intlDynamicGreetListAct, final Runnable runnable) {
        new xh0.a(intlDynamicGreetListAct).g(true).i(R$string.f601c4).e(R$string.f610d4).q(R$string.f619e4).o(new View.OnClickListener() { // from class: l.mdm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ndm.m8326a(runnable, view);
            }
        }).a().g();
    }
}
