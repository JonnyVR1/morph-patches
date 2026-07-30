package p153l;

import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.app.web.WebViewX;

/* JADX INFO: loaded from: classes10.dex */
public class gqq implements hqq {

    /* JADX INFO: renamed from: a */
    public final o3a f105718a = new o3a();

    /* JADX INFO: renamed from: b */
    public final PutongAct f105719b;

    /* JADX INFO: renamed from: c */
    public final WebViewX f105720c;

    public gqq(@NonNull PutongAct putongAct, @NonNull WebViewX webViewX) {
        this.f105719b = putongAct;
        this.f105720c = webViewX;
    }

    @Override // p153l.hqq
    /* JADX INFO: renamed from: a */
    public void mo97003a(String str) {
        if (m131419c()) {
            return;
        }
        this.f105718a.m165846c(this.f105720c, str);
    }

    @Override // p153l.hqq
    /* JADX INFO: renamed from: b */
    public void mo97004b(String str, String... strArr) {
        if (m131419c()) {
            return;
        }
        this.f105718a.m165848e(this.f105720c, str, strArr);
    }

    /* JADX INFO: renamed from: c */
    public boolean m131419c() {
        return this.f105719b.isFinishing();
    }
}
