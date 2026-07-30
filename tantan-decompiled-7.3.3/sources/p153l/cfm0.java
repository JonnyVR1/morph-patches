package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.data.UnPrivilegedVisitor;
import com.p051p1.mobile.putong.data.Visitor;
import com.tantanapp.media.ttmediautils.tinker.ShareConstants;

/* JADX INFO: loaded from: classes12.dex */
public class cfm0 {

    /* JADX INFO: renamed from: a */
    public int f81523a;

    /* JADX INFO: renamed from: b */
    public Visitor f81524b;

    /* JADX INFO: renamed from: c */
    public String f81525c;

    /* JADX INFO: renamed from: d */
    public UnPrivilegedVisitor f81526d;

    /* JADX INFO: renamed from: e */
    public boolean f81527e;

    /* JADX INFO: renamed from: f */
    public String f81528f;

    /* JADX INFO: renamed from: g */
    public boolean f81529g;

    public cfm0(String str, boolean z) {
        this.f81523a = -1;
        this.f81527e = false;
        this.f81528f = str;
        this.f81529g = z;
    }

    /* JADX INFO: renamed from: a */
    public String m109545a() {
        int i = this.f81523a;
        if (i == -1) {
            return ShareConstants.NEW_VERSION;
        }
        return i == -2 ? "recommend" : "all";
    }

    /* JADX INFO: renamed from: b */
    public boolean m109546b() {
        return this.f81526d != null;
    }

    /* JADX INFO: renamed from: c */
    public boolean m109547c() {
        return this.f81524b != null && TextUtils.isEmpty(this.f81525c);
    }

    public cfm0(UnPrivilegedVisitor unPrivilegedVisitor, boolean z) {
        this.f81523a = -1;
        this.f81526d = unPrivilegedVisitor;
        this.f81527e = z;
    }

    public cfm0(Visitor visitor, String str, int i) {
        this.f81527e = false;
        this.f81524b = visitor;
        this.f81525c = str;
        this.f81523a = i;
    }
}
