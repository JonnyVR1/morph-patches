package p153l;

import android.app.Activity;
import com.p051p1.mobile.share_sdk.content.Content;

/* JADX INFO: loaded from: classes10.dex */
public class vvp0 implements wc80 {

    /* JADX INFO: renamed from: b */
    public static String f185950b = "WECHAT_SESSION";

    /* JADX INFO: renamed from: a */
    public jvp0 f185951a;

    public vvp0(Activity activity) {
        this.f185951a = new jvp0(this, activity);
    }

    @Override // p153l.wc80
    /* JADX INFO: renamed from: a */
    public void mo126748a(Content content) {
        this.f185951a.m147094p(content);
    }

    @Override // p153l.wc80
    /* JADX INFO: renamed from: b */
    public void mo126749b(g3f0 g3f0Var) {
        this.f185951a.m147093o(g3f0Var);
    }

    @Override // p153l.wc80
    public String getName() {
        return f185950b;
    }
}
