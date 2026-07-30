package p002l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.live.livingroom.other.longlinkbase.call.AbstractC0475a;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class g10 extends bxm {

    /* JADX INFO: renamed from: b */
    public Map<String, AbstractC0475a> f10717b = new ConcurrentHashMap();

    @Override // p002l.bxm
    /* JADX INFO: renamed from: a */
    public void mo9115a(vq4 vq4Var) throws Exception {
        String strM22195c = vq4Var.mo18695c().m22195c();
        if ((vq4Var.call() instanceof mfc0) && this.f10717b.containsKey(strM22195c)) {
            this.f10717b.remove(strM22195c).m9131i(vq4Var.mo18695c());
        } else {
            vq4Var.mo18693a(vq4Var.mo18695c());
        }
    }

    @Override // p002l.bxm
    /* JADX INFO: renamed from: b */
    public void mo9116b(vq4 vq4Var) throws Exception {
        String strM22195c = vq4Var.mo18695c().m22195c();
        if ((vq4Var.call() instanceof AbstractC0475a) && !TextUtils.isEmpty(strM22195c)) {
            this.f10717b.put(strM22195c, (AbstractC0475a) vq4Var.call());
        }
        vq4Var.mo18693a(vq4Var.mo18695c());
    }
}
