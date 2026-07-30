package p149l;

import android.annotation.SuppressLint;
import android.webkit.WebResourceError;

/* JADX INFO: loaded from: classes9.dex */
@SuppressLint({"NewApi"})
public class vip0 {

    /* JADX INFO: renamed from: a */
    public WebResourceError f181630a;

    public vip0(WebResourceError webResourceError) {
        this.f181630a = webResourceError;
    }

    /* JADX INFO: renamed from: a */
    public CharSequence m198600a() {
        return this.f181630a.getDescription();
    }

    /* JADX INFO: renamed from: b */
    public int m198601b() {
        return this.f181630a.getErrorCode();
    }
}
