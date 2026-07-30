package p149l;

import android.content.Context;
import android.view.View;
import com.p046p1.mobile.putong.live.livingroom.common.chat.danmaku.show.DanmakuItem;
import com.p046p1.mobile.putong.live.livingroom.common.chat.danmaku.show.IntlVoiceDanmakuItem;

/* JADX INFO: loaded from: classes4.dex */
public class h1c {

    /* JADX INFO: renamed from: a */
    public static final hb80<ppl> f105295a = new jb80(3);

    /* JADX INFO: renamed from: a */
    public static void m129021a() {
        for (ppl pplVarAcquire = f105295a.acquire(); pplVarAcquire != null; pplVarAcquire = f105295a.acquire()) {
        }
    }

    /* JADX INFO: renamed from: b */
    public static ppl m129022b(eh3 eh3Var) {
        ppl pplVarAcquire = f105295a.acquire();
        if (pplVarAcquire == null) {
            boolean z = eh3Var.f91294o;
            Context context = eh3Var.f91280a;
            pplVarAcquire = z ? (IntlVoiceDanmakuItem) View.inflate(context, t6c0.f167998D2, null) : (DanmakuItem) View.inflate(context, t6c0.f168480q0, null);
            pplVarAcquire.hashCode();
        } else {
            pplVarAcquire.hashCode();
        }
        pplVarAcquire.mo72596z(eh3Var);
        return pplVarAcquire;
    }

    /* JADX INFO: renamed from: c */
    public static void m129023c(ppl pplVar) {
        f105295a.release(pplVar);
        pplVar.mo72594B();
        pplVar.hashCode();
    }
}
