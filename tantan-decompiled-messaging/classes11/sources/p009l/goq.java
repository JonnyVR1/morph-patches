package p009l;

import androidx.annotation.NonNull;
import com.p1.mobile.putong.app.PutongAct;
import com.p1.mobile.putong.app.web.WebViewX;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class goq implements hoq {

    /* JADX INFO: renamed from: a */
    public final d2a f13656a = new d2a();

    /* JADX INFO: renamed from: b */
    public final PutongAct f13657b;

    /* JADX INFO: renamed from: c */
    public final WebViewX f13658c;

    public goq(@NonNull PutongAct putongAct, @NonNull WebViewX webViewX) {
        this.f13657b = putongAct;
        this.f13658c = webViewX;
    }

    @Override // p009l.hoq
    /* JADX INFO: renamed from: a */
    public void mo15129a(String str) {
        if (m15131c()) {
            return;
        }
        this.f13656a.m12899c(this.f13658c, str);
    }

    @Override // p009l.hoq
    /* JADX INFO: renamed from: b */
    public void mo15130b(String str, String... strArr) {
        if (m15131c()) {
            return;
        }
        this.f13656a.m12901e(this.f13658c, str, strArr);
    }

    /* JADX INFO: renamed from: c */
    public boolean m15131c() {
        return this.f13657b.isFinishing();
    }
}
