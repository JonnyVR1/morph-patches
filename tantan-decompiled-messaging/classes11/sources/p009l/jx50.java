package p009l;

import com.p1.mobile.putong.core.data.OptiMVParams;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class jx50 {

    /* JADX INFO: renamed from: a */
    public boolean f15352a = false;

    /* JADX INFO: renamed from: b */
    public List<String> f15353b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public Map<String, OptiMVParams> f15354c = new HashMap();

    /* JADX INFO: renamed from: a */
    public void m17231a(OptiMVParams optiMVParams) {
        if (!this.f15352a) {
            optiMVParams.hasSendMV = true;
        }
        this.f15354c.put(optiMVParams.curUserId, optiMVParams);
    }

    /* JADX INFO: renamed from: b */
    public void m17232b(OptiMVParams optiMVParams) {
        this.f15354c.put(optiMVParams.curUserId, optiMVParams);
    }

    /* JADX INFO: renamed from: c */
    public void m17233c() {
        this.f15353b.clear();
        this.f15354c.clear();
    }

    /* JADX INFO: renamed from: d */
    public void m17234d(String str) {
        if (this.f15354c.containsKey(str)) {
            if (!this.f15352a) {
                this.f15353b.add(str);
            }
            this.f15354c.remove(str);
        }
    }

    /* JADX INFO: renamed from: e */
    public void m17235e(bzl bzlVar, boolean z) {
        if (this.f15352a) {
            return;
        }
        for (Map.Entry<String, OptiMVParams> entry : this.f15354c.entrySet()) {
            if (!this.f15354c.get(entry.getKey()).hasSendMV || z) {
                this.f15354c.get(entry.getKey()).hasSendMV = true;
                bzlVar.mo12325a(this.f15354c.get(entry.getKey()));
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public void m17236f(bzl bzlVar, OptiMVParams optiMVParams) {
        if (this.f15352a || !this.f15354c.containsKey(optiMVParams.curUserId)) {
            return;
        }
        if (this.f15353b.contains(optiMVParams.curUserId)) {
            this.f15353b.remove(optiMVParams.curUserId);
        } else {
            bzlVar.mo12325a(optiMVParams);
        }
    }
}
