package p009l;

import android.app.Activity;
import androidx.annotation.NonNull;
import com.p1.mobile.putong.app.web.WebViewX;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class he80 implements hoq {

    /* JADX INFO: renamed from: a */
    public final d2a f14014a = new d2a();

    /* JADX INFO: renamed from: b */
    public final Activity f14015b;

    /* JADX INFO: renamed from: c */
    public final WebViewX f14016c;

    public he80(@NonNull Activity activity, @NonNull WebViewX webViewX) {
        this.f14015b = activity;
        this.f14016c = webViewX;
    }

    @Override // p009l.hoq
    /* JADX INFO: renamed from: a */
    public void mo15129a(String str) {
        if (m15583c()) {
            return;
        }
        this.f14014a.m12899c(this.f14016c, str);
    }

    @Override // p009l.hoq
    /* JADX INFO: renamed from: b */
    public void mo15130b(String str, String... strArr) {
        if (m15583c()) {
            return;
        }
        this.f14014a.m12901e(this.f14016c, str, strArr);
    }

    /* JADX INFO: renamed from: c */
    public boolean m15583c() {
        return this.f14015b.isFinishing();
    }
}
