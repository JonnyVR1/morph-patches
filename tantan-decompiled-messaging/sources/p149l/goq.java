package p149l;

import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.app.web.WebViewX;

/* JADX INFO: loaded from: classes11.dex */
public class goq implements hoq {

    /* JADX INFO: renamed from: a */
    public final d2a f103702a = new d2a();

    /* JADX INFO: renamed from: b */
    public final PutongAct f103703b;

    /* JADX INFO: renamed from: c */
    public final WebViewX f103704c;

    public goq(@NonNull PutongAct putongAct, @NonNull WebViewX webViewX) {
        this.f103703b = putongAct;
        this.f103704c = webViewX;
    }

    @Override // p149l.hoq
    /* JADX INFO: renamed from: a */
    public void mo127284a(String str) {
        if (m127286c()) {
            return;
        }
        this.f103702a.m109721c(this.f103704c, str);
    }

    @Override // p149l.hoq
    /* JADX INFO: renamed from: b */
    public void mo127285b(String str, String... strArr) {
        if (m127286c()) {
            return;
        }
        this.f103702a.m109723e(this.f103704c, str, strArr);
    }

    /* JADX INFO: renamed from: c */
    public boolean m127286c() {
        return this.f103703b.isFinishing();
    }
}
