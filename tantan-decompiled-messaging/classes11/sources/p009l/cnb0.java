package p009l;

import android.app.Activity;
import com.p000p1.mobile.share_sdk.content.Content;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class cnb0 implements q480 {

    /* JADX INFO: renamed from: b */
    public static String f10700b = "QQ_MOMENT";

    /* JADX INFO: renamed from: a */
    public bnb0 f10701a;

    public cnb0(Activity activity) {
        this.f10701a = new bnb0(this, activity);
    }

    @Override // p009l.q480
    /* JADX INFO: renamed from: a */
    public void mo12719a(Content content) {
        this.f10701a.m12152k(content, this);
    }

    @Override // p009l.q480
    /* JADX INFO: renamed from: b */
    public void mo12720b(zue0 zue0Var) {
        this.f10701a.m12151j(zue0Var);
    }

    @Override // p009l.q480
    public String getName() {
        return f10700b;
    }
}
