package p003l;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.net.Uri;
import com.tantanapp.common.utils.CrashHelper;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import l.jfd0;
import org.eclipse.jetty.util.StringUtil;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class nim {

    /* JADX INFO: renamed from: a */
    public final Uri f5909a;

    /* JADX INFO: renamed from: b */
    public final Bitmap f5910b;

    /* JADX INFO: renamed from: c */
    public final Integer f5911c;

    /* JADX INFO: renamed from: d */
    public boolean f5912d;

    /* JADX INFO: renamed from: e */
    public int f5913e;

    /* JADX INFO: renamed from: f */
    public int f5914f;

    /* JADX INFO: renamed from: g */
    public Rect f5915g;

    /* JADX INFO: renamed from: h */
    public boolean f5916h;

    public nim(Uri uri) {
        String string = uri.toString();
        if (string.startsWith("file:///") && !new File(string.substring(7)).exists()) {
            try {
                uri = Uri.parse(URLDecoder.decode(string, StringUtil.__UTF8));
            } catch (UnsupportedEncodingException e) {
                CrashHelper.c(e);
            }
        }
        this.f5910b = null;
        this.f5909a = uri;
        this.f5911c = null;
        this.f5912d = true;
    }

    /* JADX INFO: renamed from: a */
    public static nim m6537a(String str) {
        if (str != null) {
            return m6539m("file:///android_asset/".concat(str));
        }
        jfd0.a("Asset name must not be null");
        return null;
    }

    /* JADX INFO: renamed from: j */
    public static nim m6538j(int i) {
        return new nim(i);
    }

    /* JADX INFO: renamed from: m */
    public static nim m6539m(String str) {
        if (str == null) {
            jfd0.a("Uri must not be null");
            return null;
        }
        if (!str.contains("://")) {
            if (str.startsWith("/")) {
                str = str.substring(1);
            }
            str = "file:///".concat(str);
        }
        return new nim(Uri.parse(str));
    }

    /* JADX INFO: renamed from: b */
    public final Bitmap m6540b() {
        return this.f5910b;
    }

    /* JADX INFO: renamed from: c */
    public final Integer m6541c() {
        return this.f5911c;
    }

    /* JADX INFO: renamed from: d */
    public final int m6542d() {
        return this.f5914f;
    }

    /* JADX INFO: renamed from: e */
    public final Rect m6543e() {
        return this.f5915g;
    }

    /* JADX INFO: renamed from: f */
    public final int m6544f() {
        return this.f5913e;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m6545g() {
        return this.f5912d;
    }

    /* JADX INFO: renamed from: h */
    public final Uri m6546h() {
        return this.f5909a;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m6547i() {
        return this.f5916h;
    }

    /* JADX INFO: renamed from: k */
    public nim m6548k(boolean z) {
        this.f5912d = z;
        return this;
    }

    /* JADX INFO: renamed from: l */
    public nim m6549l() {
        return m6548k(true);
    }

    public nim(int i) {
        this.f5910b = null;
        this.f5909a = null;
        this.f5911c = Integer.valueOf(i);
        this.f5912d = true;
    }
}
