package p153l;

import android.content.Intent;
import android.net.Uri;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes7.dex */
public interface wam {
    /* JADX INFO: renamed from: a */
    boolean mo135784a(int i, int i2, Intent intent);

    /* JADX INFO: renamed from: b */
    void mo135785b(ValueCallback<Uri> valueCallback, ValueCallback<Uri[]> valueCallback2);

    /* JADX INFO: renamed from: c */
    void mo135786c(C21057a c21057a);

    /* JADX INFO: renamed from: d */
    boolean mo135787d();

    /* JADX INFO: renamed from: e */
    void mo135788e(int i, @NonNull String[] strArr, @NonNull int[] iArr);

    /* JADX INFO: renamed from: f */
    void mo135789f();

    /* JADX INFO: renamed from: g */
    void mo135790g();

    /* JADX INFO: renamed from: l.wam$a */
    public static class C21057a {

        /* JADX INFO: renamed from: a */
        private String f188140a;

        /* JADX INFO: renamed from: b */
        private WebChromeClient.FileChooserParams f188141b;

        public C21057a(String str) {
            this.f188140a = str;
        }

        /* JADX INFO: renamed from: a */
        public String[] m205660a() {
            WebChromeClient.FileChooserParams fileChooserParams = this.f188141b;
            if (fileChooserParams != null) {
                return fileChooserParams.getAcceptTypes();
            }
            String str = this.f188140a;
            if (str != null) {
                return new String[]{str};
            }
            return null;
        }

        public C21057a(WebChromeClient.FileChooserParams fileChooserParams) {
            this.f188141b = fileChooserParams;
        }
    }
}
