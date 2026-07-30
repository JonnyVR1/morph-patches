package p153l;

import android.content.Context;
import android.view.View;
import com.p051p1.mobile.putong.live.livingroom.common.chat.danmaku.show.DanmakuItem;
import com.p051p1.mobile.putong.live.livingroom.common.chat.danmaku.show.IntlVoiceDanmakuItem;

/* JADX INFO: loaded from: classes4.dex */
public class u2c {

    /* JADX INFO: renamed from: a */
    public static final nj80<csl> f177201a = new pj80(3);

    /* JADX INFO: renamed from: a */
    public static void m194254a() {
        for (csl cslVarAcquire = f177201a.acquire(); cslVarAcquire != null; cslVarAcquire = f177201a.acquire()) {
        }
    }

    /* JADX INFO: renamed from: b */
    public static csl m194255b(sh3 sh3Var) {
        csl cslVarAcquire = f177201a.acquire();
        if (cslVarAcquire == null) {
            boolean z = sh3Var.f168592o;
            Context context = sh3Var.f168578a;
            cslVarAcquire = z ? (IntlVoiceDanmakuItem) View.inflate(context, yec0.f198730D2, null) : (DanmakuItem) View.inflate(context, yec0.f199212q0, null);
            cslVarAcquire.hashCode();
        } else {
            cslVarAcquire.hashCode();
        }
        cslVarAcquire.mo73779z(sh3Var);
        return cslVarAcquire;
    }

    /* JADX INFO: renamed from: c */
    public static void m194256c(csl cslVar) {
        f177201a.release(cslVar);
        cslVar.mo73777B();
        cslVar.hashCode();
    }
}
