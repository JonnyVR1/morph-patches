package p002l;

import android.view.View;
import androidx.annotation.Nullable;
import com.p1.mobile.putong.live.base.data.BLiveOperationItem;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class vt50 {

    /* JADX INFO: renamed from: b */
    public static vt50 f21292b;

    /* JADX INFO: renamed from: a */
    public HashMap<String, zp2> f21293a = new HashMap<>();

    /* JADX INFO: renamed from: c */
    public static vt50 m24121c() {
        if (f21292b == null) {
            synchronized (vt50.class) {
                try {
                    if (f21292b == null) {
                        f21292b = new vt50();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f21292b;
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public View m24122a(wxs wxsVar, bsm bsmVar, BLiveOperationItem bLiveOperationItem) {
        zp2 ps50Var = this.f21293a.get(bLiveOperationItem.type);
        if (!NullChecker.a(ps50Var)) {
            ps50Var = new ps50(bsmVar);
        }
        return ps50Var.m27461d(wxsVar, bLiveOperationItem);
    }

    /* JADX INFO: renamed from: b */
    public void m24123b() {
        this.f21293a.clear();
    }

    /* JADX INFO: renamed from: d */
    public void m24124d(bsm bsmVar) {
        m24125e(bsmVar);
    }

    /* JADX INFO: renamed from: e */
    public final void m24125e(bsm bsmVar) {
        this.f21293a.put("turboCard", new ps50(bsmVar));
    }
}
