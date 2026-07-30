package p006l;

import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.app.PutongAct;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.RankingTopic;
import com.p1.mobile.putong.core.newui.immersionvideo.post.imagetovideo.IVPostImagesSelectAct;
import l.e30;
import l.e51;
import l.f30;
import l.vch;
import l.xck0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class m2e0 extends kxd0 {
    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m19116f(w2e0 w2e0Var, String str, String str2, String str3, String str4, String str5) {
        final Act actM26156b = w2e0Var.m26156b();
        vch feedMediaHandler = CoreModule.m1853N().getFeedMediaHandler(actM26156b);
        if (TextUtils.isEmpty(str)) {
            str = "other";
        }
        feedMediaHandler.e(actM26156b, true, str, str2, str3, xck0.a(400, new e30() { // from class: l.l2e0
            public final void call(Object obj) {
                actM26156b.startActivityForResult((Intent) obj, PutongAct.REQUEST_CODE_PICKER);
            }
        }), str4, str5);
    }

    @Override // p006l.kxd0
    /* JADX INFO: renamed from: a */
    public void mo11681a(final w2e0 w2e0Var, f30<String, String> f30Var) {
        final String str = w2e0Var.m26160f().get("topic_id");
        final String str2 = w2e0Var.m26160f().get("topic_name");
        final String str3 = w2e0Var.m26160f().get("from");
        final String str4 = w2e0Var.m26160f().get("user_id");
        final String str5 = w2e0Var.m26160f().get("moment_value");
        if (!TextUtils.isEmpty(w2e0Var.m26161g())) {
            String strReplaceFirst = w2e0Var.m26161g().replaceFirst("/", "");
            if ("hotTopic".equals(strReplaceFirst) && Build.VERSION.SDK_INT > 26) {
                RankingTopic rankingTopicNew_ = RankingTopic.new_();
                rankingTopicNew_.id = str;
                rankingTopicNew_.name = str2;
                Act actM26156b = w2e0Var.m26156b();
                actM26156b.startActivity(IVPostImagesSelectAct.k2(actM26156b, rankingTopicNew_, "hot_feed_shoot"));
                return;
            }
            if ("cartoon".equals(strReplaceFirst)) {
                CoreModule.m1853N().Qn(w2e0Var.m26156b());
                return;
            }
        }
        e51.G(new Runnable() { // from class: l.k2e0
            @Override // java.lang.Runnable
            public final void run() {
                m2e0.m19116f(w2e0Var, str3, str, str2, str4, str5);
            }
        });
    }

    @Override // p006l.kxd0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo11682c(w2e0 w2e0Var, f30<String, String> f30Var) {
        return null;
    }
}
