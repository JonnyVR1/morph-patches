package p149l;

import android.app.Activity;
import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.app.web.WebViewX;

/* JADX INFO: loaded from: classes11.dex */
public class he80 implements hoq {

    /* JADX INFO: renamed from: a */
    public final d2a f107336a = new d2a();

    /* JADX INFO: renamed from: b */
    public final Activity f107337b;

    /* JADX INFO: renamed from: c */
    public final WebViewX f107338c;

    public he80(@NonNull Activity activity, @NonNull WebViewX webViewX) {
        this.f107337b = activity;
        this.f107338c = webViewX;
    }

    @Override // p149l.hoq
    /* JADX INFO: renamed from: a */
    public void mo127284a(String str) {
        if (m130622c()) {
            return;
        }
        this.f107336a.m109721c(this.f107338c, str);
    }

    @Override // p149l.hoq
    /* JADX INFO: renamed from: b */
    public void mo127285b(String str, String... strArr) {
        if (m130622c()) {
            return;
        }
        this.f107336a.m109723e(this.f107338c, str, strArr);
    }

    /* JADX INFO: renamed from: c */
    public boolean m130622c() {
        return this.f107337b.isFinishing();
    }
}
