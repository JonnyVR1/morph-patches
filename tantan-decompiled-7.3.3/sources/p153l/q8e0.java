package p153l;

import android.content.Intent;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.CreditScoreTaskType;
import com.p051p1.mobile.putong.data.Link;
import com.p051p1.mobile.putong.p070ui.share.ShareHelper;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class q8e0 extends o5e0 {
    @Override // p153l.o5e0
    /* JADX INFO: renamed from: a */
    public void mo95798a(final abe0 abe0Var, z20<String, String> z20Var) {
        Map<String, String> mapM96743f = abe0Var.m96743f();
        final String strM166119b = o5e0.m166119b(mapM96743f, "platform");
        final String strM166119b2 = o5e0.m166119b(mapM96743f, "shareTitle");
        final String strM166119b3 = o5e0.m166119b(mapM96743f, "description");
        String strM166119b4 = o5e0.m166119b(mapM96743f, "url");
        final String strM166119b5 = o5e0.m166119b(mapM96743f, CreditScoreTaskType.pic);
        final String strM166119b6 = o5e0.m166119b(mapM96743f, "dialogTitle");
        final Link link = new Link();
        link.href = strM166119b4;
        if (abe0Var.m96739b() instanceof Act) {
            l51.m152893M(new Runnable() { // from class: l.p8e0
                @Override // java.lang.Runnable
                public final void run() {
                    Link link2 = link;
                    abe0 abe0Var2 = abe0Var;
                    new ShareHelper(link2).m81201v0((Act) abe0Var2.m96739b(), strM166119b6, strM166119b2, strM166119b3, ShareHelper.m81140X(strM166119b), true, strM166119b5);
                }
            });
        } else {
            abe0Var.m96739b().startActivity(xwa.m213311f(abe0Var.m96739b()));
        }
    }

    @Override // p153l.o5e0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo95799c(abe0 abe0Var, z20<String, String> z20Var) {
        return null;
    }
}
