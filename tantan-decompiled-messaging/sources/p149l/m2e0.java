package p149l;

import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.RankingTopic;
import com.p046p1.mobile.putong.core.newui.immersionvideo.post.imagetovideo.IVPostImagesSelectAct;

/* JADX INFO: loaded from: classes9.dex */
public class m2e0 extends kxd0 {
    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m152686f(w2e0 w2e0Var, String str, String str2, String str3, String str4, String str5) {
        final Act act = (Act) w2e0Var.m201094b();
        vch feedMediaHandler = CoreModule.m29934N().getFeedMediaHandler(act);
        if (TextUtils.isEmpty(str)) {
            str = "other";
        }
        feedMediaHandler.mo197766e(act, true, str, str2, str3, xck0.m208120a(400, new e30() { // from class: l.l2e0
            @Override // p149l.e30
            public final void call(Object obj) {
                act.startActivityForResult((Intent) obj, PutongAct.REQUEST_CODE_PICKER);
            }
        }), str4, str5);
    }

    @Override // p149l.kxd0
    /* JADX INFO: renamed from: a */
    public void mo94421a(final w2e0 w2e0Var, f30<String, String> f30Var) {
        final String str = w2e0Var.m201098f().get("topic_id");
        final String str2 = w2e0Var.m201098f().get("topic_name");
        final String str3 = w2e0Var.m201098f().get("from");
        final String str4 = w2e0Var.m201098f().get("user_id");
        final String str5 = w2e0Var.m201098f().get("moment_value");
        if (!TextUtils.isEmpty(w2e0Var.m201099g())) {
            String strReplaceFirst = w2e0Var.m201099g().replaceFirst("/", "");
            if ("hotTopic".equals(strReplaceFirst) && Build.VERSION.SDK_INT > 26) {
                RankingTopic rankingTopicNew_ = RankingTopic.new_();
                rankingTopicNew_.f20486id = str;
                rankingTopicNew_.name = str2;
                Act act = (Act) w2e0Var.m201094b();
                act.startActivity(IVPostImagesSelectAct.m39272k2(act, rankingTopicNew_, "hot_feed_shoot"));
                return;
            }
            if ("cartoon".equals(strReplaceFirst)) {
                CoreModule.m29934N().mo60309Qn((Act) w2e0Var.m201094b());
                return;
            }
        }
        e51.m114742G(new Runnable() { // from class: l.k2e0
            @Override // java.lang.Runnable
            public final void run() {
                m2e0.m152686f(w2e0Var, str3, str, str2, str4, str5);
            }
        });
    }

    @Override // p149l.kxd0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo94422c(w2e0 w2e0Var, f30<String, String> f30Var) {
        return null;
    }
}
