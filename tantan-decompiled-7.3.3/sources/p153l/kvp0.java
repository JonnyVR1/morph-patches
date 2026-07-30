package p153l;

import android.app.Activity;
import com.p051p1.mobile.share_sdk.content.Content;

/* JADX INFO: loaded from: classes10.dex */
public class kvp0 implements wc80 {

    /* JADX INFO: renamed from: b */
    public static String f128981b = "WECHAT_MOMENT";

    /* JADX INFO: renamed from: a */
    public jvp0 f128982a;

    public kvp0(Activity activity) {
        this.f128982a = new jvp0(this, activity);
    }

    @Override // p153l.wc80
    /* JADX INFO: renamed from: a */
    public void mo126748a(Content content) {
        this.f128982a.m147094p(content);
    }

    @Override // p153l.wc80
    /* JADX INFO: renamed from: b */
    public void mo126749b(g3f0 g3f0Var) {
        this.f128982a.m147093o(g3f0Var);
    }

    @Override // p153l.wc80
    public String getName() {
        return f128981b;
    }
}
