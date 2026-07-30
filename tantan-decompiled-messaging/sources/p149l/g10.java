package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.live.livingroom.other.longlinkbase.call.AbstractC12886a;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
public class g10 extends bxm {

    /* JADX INFO: renamed from: b */
    public Map<String, AbstractC12886a> f100110b = new ConcurrentHashMap();

    @Override // p149l.bxm
    /* JADX INFO: renamed from: a */
    public void mo75480a(vq4 vq4Var) throws Exception {
        String strM182210c = vq4Var.mo159107c().m182210c();
        if ((vq4Var.call() instanceof mfc0) && this.f100110b.containsKey(strM182210c)) {
            this.f100110b.remove(strM182210c).m75496i(vq4Var.mo159107c());
        } else {
            vq4Var.mo159105a(vq4Var.mo159107c());
        }
    }

    @Override // p149l.bxm
    /* JADX INFO: renamed from: b */
    public void mo75481b(vq4 vq4Var) throws Exception {
        String strM182210c = vq4Var.mo159107c().m182210c();
        if ((vq4Var.call() instanceof AbstractC12886a) && !TextUtils.isEmpty(strM182210c)) {
            this.f100110b.put(strM182210c, (AbstractC12886a) vq4Var.call());
        }
        vq4Var.mo159105a(vq4Var.mo159107c());
    }
}
