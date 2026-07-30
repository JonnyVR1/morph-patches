package p149l;

import android.app.Activity;
import com.p046p1.mobile.share_sdk.content.Content;

/* JADX INFO: loaded from: classes11.dex */
public class whf0 implements q480 {

    /* JADX INFO: renamed from: b */
    public static String f186432b = "SINA_WEIBO";

    /* JADX INFO: renamed from: a */
    public knp0 f186433a;

    public whf0(Activity activity) {
        this.f186433a = new knp0(this, activity);
    }

    @Override // p149l.q480
    /* JADX INFO: renamed from: a */
    public void mo107747a(Content content) {
        this.f186433a.m146585i(content);
    }

    @Override // p149l.q480
    /* JADX INFO: renamed from: b */
    public void mo107748b(zue0 zue0Var) {
        this.f186433a.m146584h(zue0Var);
    }

    @Override // p149l.q480
    public String getName() {
        return f186432b;
    }
}
