package p149l;

import android.content.Intent;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.CreditScoreTaskType;
import com.p046p1.mobile.putong.data.Link;
import com.p046p1.mobile.putong.p065ui.share.ShareHelper;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class m0e0 extends kxd0 {
    @Override // p149l.kxd0
    /* JADX INFO: renamed from: a */
    public void mo94421a(final w2e0 w2e0Var, f30<String, String> f30Var) {
        Map<String, String> mapM201098f = w2e0Var.m201098f();
        final String strM147736b = kxd0.m147736b(mapM201098f, "platform");
        final String strM147736b2 = kxd0.m147736b(mapM201098f, "shareTitle");
        final String strM147736b3 = kxd0.m147736b(mapM201098f, "description");
        String strM147736b4 = kxd0.m147736b(mapM201098f, "url");
        final String strM147736b5 = kxd0.m147736b(mapM201098f, CreditScoreTaskType.pic);
        final String strM147736b6 = kxd0.m147736b(mapM201098f, "dialogTitle");
        final Link link = new Link();
        link.href = strM147736b4;
        if (w2e0Var.m201094b() instanceof Act) {
            e51.m114748M(new Runnable() { // from class: l.l0e0
                @Override // java.lang.Runnable
                public final void run() {
                    Link link2 = link;
                    w2e0 w2e0Var2 = w2e0Var;
                    new ShareHelper(link2).m80018v0((Act) w2e0Var2.m201094b(), strM147736b6, strM147736b2, strM147736b3, ShareHelper.m79957X(strM147736b), true, strM147736b5);
                }
            });
        } else {
            w2e0Var.m201094b().startActivity(lva.m151850f(w2e0Var.m201094b()));
        }
    }

    @Override // p149l.kxd0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo94422c(w2e0 w2e0Var, f30<String, String> f30Var) {
        return null;
    }
}
