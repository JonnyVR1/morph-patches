package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.live.livingroom.other.longlinkbase.call.AbstractC13049a;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes5.dex */
public class a10 extends bzm {

    /* JADX INFO: renamed from: b */
    public Map<String, AbstractC13049a> f67771b = new ConcurrentHashMap();

    @Override // p153l.bzm
    /* JADX INFO: renamed from: a */
    public void mo76663a(ur4 ur4Var) throws Exception {
        String strM215137c = ur4Var.mo196644c().m215137c();
        if ((ur4Var.call() instanceof tnc0) && this.f67771b.containsKey(strM215137c)) {
            this.f67771b.remove(strM215137c).m76679i(ur4Var.mo196644c());
        } else {
            ur4Var.mo196642a(ur4Var.mo196644c());
        }
    }

    @Override // p153l.bzm
    /* JADX INFO: renamed from: b */
    public void mo76664b(ur4 ur4Var) throws Exception {
        String strM215137c = ur4Var.mo196644c().m215137c();
        if ((ur4Var.call() instanceof AbstractC13049a) && !TextUtils.isEmpty(strM215137c)) {
            this.f67771b.put(strM215137c, (AbstractC13049a) ur4Var.call());
        }
        ur4Var.mo196642a(ur4Var.mo196644c());
    }
}
