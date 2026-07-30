package p153l;

import com.p051p1.mobile.putong.core.data.OptiMVParams;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class p560 {

    /* JADX INFO: renamed from: a */
    public boolean f150611a = false;

    /* JADX INFO: renamed from: b */
    public List<String> f150612b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public Map<String, OptiMVParams> f150613c = new HashMap();

    /* JADX INFO: renamed from: a */
    public void m170612a(OptiMVParams optiMVParams) {
        if (!this.f150611a) {
            optiMVParams.hasSendMV = true;
        }
        this.f150613c.put(optiMVParams.curUserId, optiMVParams);
    }

    /* JADX INFO: renamed from: b */
    public void m170613b(OptiMVParams optiMVParams) {
        this.f150613c.put(optiMVParams.curUserId, optiMVParams);
    }

    /* JADX INFO: renamed from: c */
    public void m170614c() {
        this.f150612b.clear();
        this.f150613c.clear();
    }

    /* JADX INFO: renamed from: d */
    public void m170615d(String str) {
        if (this.f150613c.containsKey(str)) {
            if (!this.f150611a) {
                this.f150612b.add(str);
            }
            this.f150613c.remove(str);
        }
    }

    /* JADX INFO: renamed from: e */
    public void m170616e(w1m w1mVar, boolean z) {
        if (this.f150611a) {
            return;
        }
        for (Map.Entry<String, OptiMVParams> entry : this.f150613c.entrySet()) {
            if (!this.f150613c.get(entry.getKey()).hasSendMV || z) {
                this.f150613c.get(entry.getKey()).hasSendMV = true;
                w1mVar.mo204451a(this.f150613c.get(entry.getKey()));
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public void m170617f(w1m w1mVar, OptiMVParams optiMVParams) {
        if (this.f150611a || !this.f150613c.containsKey(optiMVParams.curUserId)) {
            return;
        }
        if (this.f150612b.contains(optiMVParams.curUserId)) {
            this.f150612b.remove(optiMVParams.curUserId);
        } else {
            w1mVar.mo204451a(optiMVParams);
        }
    }
}
