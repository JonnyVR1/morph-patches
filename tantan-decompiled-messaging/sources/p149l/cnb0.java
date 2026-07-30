package p149l;

import android.app.Activity;
import com.p046p1.mobile.share_sdk.content.Content;

/* JADX INFO: loaded from: classes11.dex */
public class cnb0 implements q480 {

    /* JADX INFO: renamed from: b */
    public static String f81658b = "QQ_MOMENT";

    /* JADX INFO: renamed from: a */
    public bnb0 f81659a;

    public cnb0(Activity activity) {
        this.f81659a = new bnb0(this, activity);
    }

    @Override // p149l.q480
    /* JADX INFO: renamed from: a */
    public void mo107747a(Content content) {
        this.f81659a.m102763k(content, this);
    }

    @Override // p149l.q480
    /* JADX INFO: renamed from: b */
    public void mo107748b(zue0 zue0Var) {
        this.f81659a.m102762j(zue0Var);
    }

    @Override // p149l.q480
    public String getName() {
        return f81658b;
    }
}
