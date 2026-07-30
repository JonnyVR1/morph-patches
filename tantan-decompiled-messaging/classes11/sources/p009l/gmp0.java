package p009l;

import android.app.Activity;
import com.p000p1.mobile.share_sdk.content.Content;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class gmp0 implements q480 {

    /* JADX INFO: renamed from: b */
    public static String f13644b = "WECHAT_MOMENT";

    /* JADX INFO: renamed from: a */
    public fmp0 f13645a;

    public gmp0(Activity activity) {
        this.f13645a = new fmp0(this, activity);
    }

    @Override // p009l.q480
    /* JADX INFO: renamed from: a */
    public void mo12719a(Content content) {
        this.f13645a.m14527p(content);
    }

    @Override // p009l.q480
    /* JADX INFO: renamed from: b */
    public void mo12720b(zue0 zue0Var) {
        this.f13645a.m14526o(zue0Var);
    }

    @Override // p009l.q480
    public String getName() {
        return f13644b;
    }
}
