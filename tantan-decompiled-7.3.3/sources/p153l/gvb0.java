package p153l;

import android.app.Activity;
import com.p051p1.mobile.share_sdk.content.Content;

/* JADX INFO: loaded from: classes10.dex */
public class gvb0 implements wc80 {

    /* JADX INFO: renamed from: b */
    public static String f106619b = "QQ_MOMENT";

    /* JADX INFO: renamed from: a */
    public fvb0 f106620a;

    public gvb0(Activity activity) {
        this.f106620a = new fvb0(this, activity);
    }

    @Override // p153l.wc80
    /* JADX INFO: renamed from: a */
    public void mo126748a(Content content) {
        this.f106620a.m127602k(content, this);
    }

    @Override // p153l.wc80
    /* JADX INFO: renamed from: b */
    public void mo126749b(g3f0 g3f0Var) {
        this.f106620a.m127601j(g3f0Var);
    }

    @Override // p153l.wc80
    public String getName() {
        return f106619b;
    }
}
