package p153l;

import android.annotation.SuppressLint;
import android.webkit.WebResourceError;

/* JADX INFO: loaded from: classes9.dex */
@SuppressLint({"NewApi"})
public class asp0 {

    /* JADX INFO: renamed from: a */
    public WebResourceError f73162a;

    public asp0(WebResourceError webResourceError) {
        this.f73162a = webResourceError;
    }

    /* JADX INFO: renamed from: a */
    public CharSequence m99963a() {
        return this.f73162a.getDescription();
    }

    /* JADX INFO: renamed from: b */
    public int m99964b() {
        return this.f73162a.getErrorCode();
    }
}
