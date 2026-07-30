package p153l;

import android.app.Activity;
import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.app.web.WebViewX;

/* JADX INFO: loaded from: classes10.dex */
public class nm80 implements hqq {

    /* JADX INFO: renamed from: a */
    public final o3a f142626a = new o3a();

    /* JADX INFO: renamed from: b */
    public final Activity f142627b;

    /* JADX INFO: renamed from: c */
    public final WebViewX f142628c;

    public nm80(@NonNull Activity activity, @NonNull WebViewX webViewX) {
        this.f142627b = activity;
        this.f142628c = webViewX;
    }

    @Override // p153l.hqq
    /* JADX INFO: renamed from: a */
    public void mo97003a(String str) {
        if (m163805c()) {
            return;
        }
        this.f142626a.m165846c(this.f142628c, str);
    }

    @Override // p153l.hqq
    /* JADX INFO: renamed from: b */
    public void mo97004b(String str, String... strArr) {
        if (m163805c()) {
            return;
        }
        this.f142626a.m165848e(this.f142628c, str, strArr);
    }

    /* JADX INFO: renamed from: c */
    public boolean m163805c() {
        return this.f142627b.isFinishing();
    }
}
