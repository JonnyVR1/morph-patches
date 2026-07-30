package p153l;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.data.LinkIntent;
import com.p051p1.mobile.putong.feed_api.api.serviceprovider.api.FeedService;

/* JADX INFO: loaded from: classes9.dex */
public class a5e0 extends o5e0 {
    @Override // p153l.o5e0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo95799c(abe0 abe0Var, z20<String, String> z20Var) {
        String str = abe0Var.m96743f().get("type");
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.equals("question") || str.equals("qa")) {
            return CoreModule.m30932N().mo61455E6(abe0Var.m96739b(), abe0Var.m96743f().get("topic_id"), "p_assistant_operation");
        }
        if (str.equals(LinkIntent.vote)) {
            return CoreModule.m30932N().mo61480Nh(abe0Var.m96739b(), abe0Var.m96743f().get("topic_id"), abe0Var.m96743f().get("owner_id"), "", "p_assistant_operation");
        }
        FeedService feedServiceM30932N = CoreModule.m30932N();
        Context contextM96739b = abe0Var.m96739b();
        String str2 = abe0Var.m96743f().get("topic_id");
        "true".equals(abe0Var.m96743f().get("is_anonymous"));
        return feedServiceM30932N.mo61544j8(contextM96739b, str2, "p_assistant_operation", true, "");
    }
}
