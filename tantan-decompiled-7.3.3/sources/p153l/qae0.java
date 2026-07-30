package p153l;

import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.RankingTopic;
import com.p051p1.mobile.putong.core.newui.immersionvideo.post.imagetovideo.IVPostImagesSelectAct;

/* JADX INFO: loaded from: classes9.dex */
public class qae0 extends o5e0 {
    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m175919f(abe0 abe0Var, String str, String str2, String str3, String str4, String str5) {
        final Act act = (Act) abe0Var.m96739b();
        keh feedMediaHandler = CoreModule.m30932N().getFeedMediaHandler(act);
        if (TextUtils.isEmpty(str)) {
            str = "other";
        }
        feedMediaHandler.mo149323e(act, true, str, str2, str3, dmk0.m116962a(400, new y20() { // from class: l.pae0
            @Override // p153l.y20
            public final void call(Object obj) {
                act.startActivityForResult((Intent) obj, PutongAct.REQUEST_CODE_PICKER);
            }
        }), str4, str5);
    }

    @Override // p153l.o5e0
    /* JADX INFO: renamed from: a */
    public void mo95798a(final abe0 abe0Var, z20<String, String> z20Var) {
        final String str = abe0Var.m96743f().get("topic_id");
        final String str2 = abe0Var.m96743f().get("topic_name");
        final String str3 = abe0Var.m96743f().get("from");
        final String str4 = abe0Var.m96743f().get("user_id");
        final String str5 = abe0Var.m96743f().get("moment_value");
        if (!TextUtils.isEmpty(abe0Var.m96744g())) {
            String strReplaceFirst = abe0Var.m96744g().replaceFirst("/", "");
            if ("hotTopic".equals(strReplaceFirst) && Build.VERSION.SDK_INT > 26) {
                RankingTopic rankingTopicNew_ = RankingTopic.new_();
                rankingTopicNew_.f21228id = str;
                rankingTopicNew_.name = str2;
                Act act = (Act) abe0Var.m96739b();
                act.startActivity(IVPostImagesSelectAct.m40275l2(act, rankingTopicNew_, "hot_feed_shoot"));
                return;
            }
            if ("cartoon".equals(strReplaceFirst)) {
                CoreModule.m30932N().mo61493Qn((Act) abe0Var.m96739b());
                return;
            }
        }
        l51.m152887G(new Runnable() { // from class: l.oae0
            @Override // java.lang.Runnable
            public final void run() {
                qae0.m175919f(abe0Var, str3, str, str2, str4, str5);
            }
        });
    }

    @Override // p153l.o5e0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo95799c(abe0 abe0Var, z20<String, String> z20Var) {
        return null;
    }
}
