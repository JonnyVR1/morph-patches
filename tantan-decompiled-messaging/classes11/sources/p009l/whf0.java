package p009l;

import android.app.Activity;
import com.p000p1.mobile.share_sdk.content.Content;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class whf0 implements q480 {

    /* JADX INFO: renamed from: b */
    public static String f22112b = "SINA_WEIBO";

    /* JADX INFO: renamed from: a */
    public knp0 f22113a;

    public whf0(Activity activity) {
        this.f22113a = new knp0(this, activity);
    }

    @Override // p009l.q480
    /* JADX INFO: renamed from: a */
    public void mo12719a(Content content) {
        this.f22113a.m17563i(content);
    }

    @Override // p009l.q480
    /* JADX INFO: renamed from: b */
    public void mo12720b(zue0 zue0Var) {
        this.f22113a.m17562h(zue0Var);
    }

    @Override // p009l.q480
    public String getName() {
        return f22112b;
    }
}
