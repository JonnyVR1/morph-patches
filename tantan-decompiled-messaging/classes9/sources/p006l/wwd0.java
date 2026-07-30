package p006l;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService;
import l.f30;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class wwd0 extends kxd0 {
    @Override // p006l.kxd0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo11682c(w2e0 w2e0Var, f30<String, String> f30Var) {
        String str = w2e0Var.m26160f().get("type");
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.equals("question") || str.equals("qa")) {
            return CoreModule.m1853N().E6(w2e0Var.m26156b(), w2e0Var.m26160f().get("topic_id"), "p_assistant_operation");
        }
        if (str.equals("vote")) {
            return CoreModule.m1853N().Nh(w2e0Var.m26156b(), w2e0Var.m26160f().get("topic_id"), w2e0Var.m26160f().get("owner_id"), "", "p_assistant_operation");
        }
        FeedService feedServiceM1853N = CoreModule.m1853N();
        Context contextM26156b = w2e0Var.m26156b();
        String str2 = w2e0Var.m26160f().get("topic_id");
        "true".equals(w2e0Var.m26160f().get("is_anonymous"));
        return feedServiceM1853N.j8(contextM26156b, str2, "p_assistant_operation", true, "");
    }
}
