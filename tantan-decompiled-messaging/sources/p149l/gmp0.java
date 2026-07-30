package p149l;

import android.app.Activity;
import com.p046p1.mobile.share_sdk.content.Content;

/* JADX INFO: loaded from: classes11.dex */
public class gmp0 implements q480 {

    /* JADX INFO: renamed from: b */
    public static String f103510b = "WECHAT_MOMENT";

    /* JADX INFO: renamed from: a */
    public fmp0 f103511a;

    public gmp0(Activity activity) {
        this.f103511a = new fmp0(this, activity);
    }

    @Override // p149l.q480
    /* JADX INFO: renamed from: a */
    public void mo107747a(Content content) {
        this.f103511a.m122188p(content);
    }

    @Override // p149l.q480
    /* JADX INFO: renamed from: b */
    public void mo107748b(zue0 zue0Var) {
        this.f103511a.m122187o(zue0Var);
    }

    @Override // p149l.q480
    public String getName() {
        return f103510b;
    }
}
