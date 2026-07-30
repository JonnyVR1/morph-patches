package p002l;

import android.content.Context;
import android.view.View;
import com.p000p1.mobile.putong.live.livingroom.common.chat.danmaku.show.DanmakuItem;
import com.p000p1.mobile.putong.live.livingroom.common.chat.danmaku.show.IntlVoiceDanmakuItem;
import l.hb80;
import l.jb80;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class h1c {

    /* JADX INFO: renamed from: a */
    public static final hb80<ppl> f11715a = new jb80(3);

    /* JADX INFO: renamed from: a */
    public static void m14127a() {
        for (ppl pplVar = (ppl) f11715a.acquire(); pplVar != null; pplVar = (ppl) f11715a.acquire()) {
        }
    }

    /* JADX INFO: renamed from: b */
    public static ppl m14128b(eh3 eh3Var) {
        ppl pplVar = (ppl) f11715a.acquire();
        if (pplVar == null) {
            boolean z = eh3Var.f9788o;
            Context context = eh3Var.f9774a;
            pplVar = z ? (IntlVoiceDanmakuItem) View.inflate(context, t6c0.f19494D2, null) : (DanmakuItem) View.inflate(context, t6c0.f19976q0, null);
            pplVar.hashCode();
        } else {
            pplVar.hashCode();
        }
        pplVar.mo6094z(eh3Var);
        return pplVar;
    }

    /* JADX INFO: renamed from: c */
    public static void m14129c(ppl pplVar) {
        f11715a.release(pplVar);
        pplVar.mo6092B();
        pplVar.hashCode();
    }
}
