package p006l;

import android.annotation.SuppressLint;
import android.webkit.WebResourceError;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@SuppressLint({"NewApi"})
public class vip0 {

    /* JADX INFO: renamed from: a */
    public WebResourceError f24338a;

    public vip0(WebResourceError webResourceError) {
        this.f24338a = webResourceError;
    }

    /* JADX INFO: renamed from: a */
    public CharSequence m25825a() {
        return this.f24338a.getDescription();
    }

    /* JADX INFO: renamed from: b */
    public int m25826b() {
        return this.f24338a.getErrorCode();
    }
}
