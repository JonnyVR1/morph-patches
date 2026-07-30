package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.data.UnPrivilegedVisitor;
import com.p046p1.mobile.putong.data.Visitor;
import com.tantanapp.media.ttmediautils.tinker.ShareConstants;

/* JADX INFO: loaded from: classes9.dex */
public class y5m0 {

    /* JADX INFO: renamed from: a */
    public int f196454a;

    /* JADX INFO: renamed from: b */
    public Visitor f196455b;

    /* JADX INFO: renamed from: c */
    public String f196456c;

    /* JADX INFO: renamed from: d */
    public UnPrivilegedVisitor f196457d;

    /* JADX INFO: renamed from: e */
    public boolean f196458e;

    /* JADX INFO: renamed from: f */
    public String f196459f;

    /* JADX INFO: renamed from: g */
    public boolean f196460g;

    public y5m0(String str, boolean z) {
        this.f196454a = -1;
        this.f196458e = false;
        this.f196459f = str;
        this.f196460g = z;
    }

    /* JADX INFO: renamed from: a */
    public String m213001a() {
        int i = this.f196454a;
        if (i == -1) {
            return ShareConstants.NEW_VERSION;
        }
        return i == -2 ? "recommend" : "all";
    }

    /* JADX INFO: renamed from: b */
    public boolean m213002b() {
        return this.f196457d != null;
    }

    /* JADX INFO: renamed from: c */
    public boolean m213003c() {
        return this.f196455b != null && TextUtils.isEmpty(this.f196456c);
    }

    public y5m0(UnPrivilegedVisitor unPrivilegedVisitor, boolean z) {
        this.f196454a = -1;
        this.f196457d = unPrivilegedVisitor;
        this.f196458e = z;
    }

    public y5m0(Visitor visitor, String str, int i) {
        this.f196458e = false;
        this.f196455b = visitor;
        this.f196456c = str;
        this.f196454a = i;
    }
}
