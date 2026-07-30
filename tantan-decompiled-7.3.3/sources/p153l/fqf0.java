package p153l;

import android.app.Activity;
import com.p051p1.mobile.share_sdk.content.Content;

/* JADX INFO: loaded from: classes10.dex */
public class fqf0 implements wc80 {

    /* JADX INFO: renamed from: b */
    public static String f100284b = "SINA_WEIBO";

    /* JADX INFO: renamed from: a */
    public owp0 f100285a;

    public fqf0(Activity activity) {
        this.f100285a = new owp0(this, activity);
    }

    @Override // p153l.wc80
    /* JADX INFO: renamed from: a */
    public void mo126748a(Content content) {
        this.f100285a.m169610i(content);
    }

    @Override // p153l.wc80
    /* JADX INFO: renamed from: b */
    public void mo126749b(g3f0 g3f0Var) {
        this.f100285a.m169609h(g3f0Var);
    }

    @Override // p153l.wc80
    public String getName() {
        return f100284b;
    }
}
