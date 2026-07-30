package p149l;

import android.app.Activity;
import com.p046p1.mobile.share_sdk.content.Content;

/* JADX INFO: loaded from: classes11.dex */
public class dnb0 implements q480 {

    /* JADX INFO: renamed from: b */
    public static String f87044b = "QQ_SESSION";

    /* JADX INFO: renamed from: a */
    public bnb0 f87045a;

    public dnb0(Activity activity) {
        this.f87045a = new bnb0(this, activity);
    }

    @Override // p149l.q480
    /* JADX INFO: renamed from: a */
    public void mo107747a(Content content) {
        this.f87045a.m102763k(content, this);
    }

    @Override // p149l.q480
    /* JADX INFO: renamed from: b */
    public void mo107748b(zue0 zue0Var) {
        this.f87045a.m102762j(zue0Var);
    }

    @Override // p149l.q480
    public String getName() {
        return f87044b;
    }
}
