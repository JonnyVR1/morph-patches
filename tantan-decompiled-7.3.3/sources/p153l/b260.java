package p153l;

import android.view.View;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationItem;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationPlaceType;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public class b260 {

    /* JADX INFO: renamed from: b */
    public static b260 f74588b;

    /* JADX INFO: renamed from: a */
    public HashMap<String, qq2> f74589a = new HashMap<>();

    /* JADX INFO: renamed from: c */
    public static b260 m102114c() {
        if (f74588b == null) {
            synchronized (b260.class) {
                try {
                    if (f74588b == null) {
                        f74588b = new b260();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f74588b;
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public View m102115a(xzs xzsVar, dum dumVar, BLiveOperationItem bLiveOperationItem) {
        qq2 v060Var = this.f74589a.get(bLiveOperationItem.type);
        if (!NullChecker.m82486a(v060Var)) {
            v060Var = new v060(dumVar);
        }
        return v060Var.m177477d(xzsVar, bLiveOperationItem);
    }

    /* JADX INFO: renamed from: b */
    public void m102116b() {
        this.f74589a.clear();
    }

    /* JADX INFO: renamed from: d */
    public void m102117d(dum dumVar) {
        m102118e(dumVar);
    }

    /* JADX INFO: renamed from: e */
    public final void m102118e(dum dumVar) {
        this.f74589a.put(BLiveOperationPlaceType.turboCard, new v060(dumVar));
    }
}
