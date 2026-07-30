package p153l;

import android.app.Activity;
import com.p051p1.mobile.share_sdk.content.Content;

/* JADX INFO: loaded from: classes10.dex */
public class hvb0 implements wc80 {

    /* JADX INFO: renamed from: b */
    public static String f111748b = "QQ_SESSION";

    /* JADX INFO: renamed from: a */
    public fvb0 f111749a;

    public hvb0(Activity activity) {
        this.f111749a = new fvb0(this, activity);
    }

    @Override // p153l.wc80
    /* JADX INFO: renamed from: a */
    public void mo126748a(Content content) {
        this.f111749a.m127602k(content, this);
    }

    @Override // p153l.wc80
    /* JADX INFO: renamed from: b */
    public void mo126749b(g3f0 g3f0Var) {
        this.f111749a.m127601j(g3f0Var);
    }

    @Override // p153l.wc80
    public String getName() {
        return f111748b;
    }
}
