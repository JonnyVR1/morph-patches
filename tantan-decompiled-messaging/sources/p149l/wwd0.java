package p149l;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.data.LinkIntent;
import com.p046p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService;

/* JADX INFO: loaded from: classes9.dex */
public class wwd0 extends kxd0 {
    @Override // p149l.kxd0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo94422c(w2e0 w2e0Var, f30<String, String> f30Var) {
        String str = w2e0Var.m201098f().get("type");
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.equals("question") || str.equals("qa")) {
            return CoreModule.m29934N().mo60271E6(w2e0Var.m201094b(), w2e0Var.m201098f().get("topic_id"), "p_assistant_operation");
        }
        if (str.equals(LinkIntent.vote)) {
            return CoreModule.m29934N().mo60296Nh(w2e0Var.m201094b(), w2e0Var.m201098f().get("topic_id"), w2e0Var.m201098f().get("owner_id"), "", "p_assistant_operation");
        }
        FeedService feedServiceM29934N = CoreModule.m29934N();
        Context contextM201094b = w2e0Var.m201094b();
        String str2 = w2e0Var.m201098f().get("topic_id");
        "true".equals(w2e0Var.m201098f().get("is_anonymous"));
        return feedServiceM29934N.mo60360j8(contextM201094b, str2, "p_assistant_operation", true, "");
    }
}
