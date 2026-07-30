package p009l;

import android.app.Activity;
import com.p000p1.mobile.share_sdk.content.Content;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class dnb0 implements q480 {

    /* JADX INFO: renamed from: b */
    public static String f11916b = "QQ_SESSION";

    /* JADX INFO: renamed from: a */
    public bnb0 f11917a;

    public dnb0(Activity activity) {
        this.f11917a = new bnb0(this, activity);
    }

    @Override // p009l.q480
    /* JADX INFO: renamed from: a */
    public void mo12719a(Content content) {
        this.f11917a.m12152k(content, this);
    }

    @Override // p009l.q480
    /* JADX INFO: renamed from: b */
    public void mo12720b(zue0 zue0Var) {
        this.f11917a.m12151j(zue0Var);
    }

    @Override // p009l.q480
    public String getName() {
        return f11916b;
    }
}
