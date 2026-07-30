package p149l;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.net.Uri;
import com.tantanapp.common.utils.CrashHelper;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

/* JADX INFO: loaded from: classes3.dex */
public final class nim {

    /* JADX INFO: renamed from: a */
    public final Uri f139111a;

    /* JADX INFO: renamed from: b */
    public final Bitmap f139112b;

    /* JADX INFO: renamed from: c */
    public final Integer f139113c;

    /* JADX INFO: renamed from: d */
    public boolean f139114d;

    /* JADX INFO: renamed from: e */
    public int f139115e;

    /* JADX INFO: renamed from: f */
    public int f139116f;

    /* JADX INFO: renamed from: g */
    public Rect f139117g;

    /* JADX INFO: renamed from: h */
    public boolean f139118h;

    public nim(Uri uri) {
        String string = uri.toString();
        if (string.startsWith("file:///") && !new File(string.substring(7)).exists()) {
            try {
                uri = Uri.parse(URLDecoder.decode(string, "UTF-8"));
            } catch (UnsupportedEncodingException e) {
                CrashHelper.m81296c(e);
            }
        }
        this.f139112b = null;
        this.f139111a = uri;
        this.f139113c = null;
        this.f139114d = true;
    }

    /* JADX INFO: renamed from: a */
    public static nim m159526a(String str) {
        if (str != null) {
            return m159528m("file:///android_asset/".concat(str));
        }
        jfd0.m141176a("Asset name must not be null");
        return null;
    }

    /* JADX INFO: renamed from: j */
    public static nim m159527j(int i) {
        return new nim(i);
    }

    /* JADX INFO: renamed from: m */
    public static nim m159528m(String str) {
        if (str == null) {
            jfd0.m141176a("Uri must not be null");
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
    public final Bitmap m159529b() {
        return this.f139112b;
    }

    /* JADX INFO: renamed from: c */
    public final Integer m159530c() {
        return this.f139113c;
    }

    /* JADX INFO: renamed from: d */
    public final int m159531d() {
        return this.f139116f;
    }

    /* JADX INFO: renamed from: e */
    public final Rect m159532e() {
        return this.f139117g;
    }

    /* JADX INFO: renamed from: f */
    public final int m159533f() {
        return this.f139115e;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m159534g() {
        return this.f139114d;
    }

    /* JADX INFO: renamed from: h */
    public final Uri m159535h() {
        return this.f139111a;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m159536i() {
        return this.f139118h;
    }

    /* JADX INFO: renamed from: k */
    public nim m159537k(boolean z) {
        this.f139114d = z;
        return this;
    }

    /* JADX INFO: renamed from: l */
    public nim m159538l() {
        return m159537k(true);
    }

    public nim(int i) {
        this.f139112b = null;
        this.f139111a = null;
        this.f139113c = Integer.valueOf(i);
        this.f139114d = true;
    }
}
