package p149l;

import android.view.View;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationItem;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationPlaceType;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public class vt50 {

    /* JADX INFO: renamed from: b */
    public static vt50 f182903b;

    /* JADX INFO: renamed from: a */
    public HashMap<String, zp2> f182904a = new HashMap<>();

    /* JADX INFO: renamed from: c */
    public static vt50 m199915c() {
        if (f182903b == null) {
            synchronized (vt50.class) {
                try {
                    if (f182903b == null) {
                        f182903b = new vt50();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f182903b;
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public View m199916a(wxs wxsVar, bsm bsmVar, BLiveOperationItem bLiveOperationItem) {
        zp2 ps50Var = this.f182904a.get(bLiveOperationItem.type);
        if (!NullChecker.m81303a(ps50Var)) {
            ps50Var = new ps50(bsmVar);
        }
        return ps50Var.m219605d(wxsVar, bLiveOperationItem);
    }

    /* JADX INFO: renamed from: b */
    public void m199917b() {
        this.f182904a.clear();
    }

    /* JADX INFO: renamed from: d */
    public void m199918d(bsm bsmVar) {
        m199919e(bsmVar);
    }

    /* JADX INFO: renamed from: e */
    public final void m199919e(bsm bsmVar) {
        this.f182904a.put(BLiveOperationPlaceType.turboCard, new ps50(bsmVar));
    }
}
