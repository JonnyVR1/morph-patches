package p006l;

import android.content.Intent;
import androidx.annotation.Nullable;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.data.Link;
import com.p1.mobile.putong.ui.share.ShareHelper;
import java.util.Map;
import l.e51;
import l.f30;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class m0e0 extends kxd0 {
    @Override // p006l.kxd0
    /* JADX INFO: renamed from: a */
    public void mo11681a(final w2e0 w2e0Var, f30<String, String> f30Var) {
        Map<String, String> mapM26160f = w2e0Var.m26160f();
        final String strM18317b = kxd0.m18317b(mapM26160f, "platform");
        final String strM18317b2 = kxd0.m18317b(mapM26160f, "shareTitle");
        final String strM18317b3 = kxd0.m18317b(mapM26160f, "description");
        String strM18317b4 = kxd0.m18317b(mapM26160f, "url");
        final String strM18317b5 = kxd0.m18317b(mapM26160f, "pic");
        final String strM18317b6 = kxd0.m18317b(mapM26160f, "dialogTitle");
        final Link link = new Link();
        link.href = strM18317b4;
        if (w2e0Var.m26156b() instanceof Act) {
            e51.M(new Runnable() { // from class: l.l0e0
                @Override // java.lang.Runnable
                public final void run() {
                    Link link2 = link;
                    w2e0 w2e0Var2 = w2e0Var;
                    new ShareHelper(link2).v0(w2e0Var2.m26156b(), strM18317b6, strM18317b2, strM18317b3, ShareHelper.X(strM18317b), true, strM18317b5);
                }
            });
        } else {
            w2e0Var.m26156b().startActivity(lva.m19027f(w2e0Var.m26156b()));
        }
    }

    @Override // p006l.kxd0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo11682c(w2e0 w2e0Var, f30<String, String> f30Var) {
        return null;
    }
}
