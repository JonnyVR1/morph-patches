package p149l;

import com.p046p1.mobile.putong.core.data.OptiMVParams;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class jx50 {

    /* JADX INFO: renamed from: a */
    public boolean f120193a = false;

    /* JADX INFO: renamed from: b */
    public List<String> f120194b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public Map<String, OptiMVParams> f120195c = new HashMap();

    /* JADX INFO: renamed from: a */
    public void m143755a(OptiMVParams optiMVParams) {
        if (!this.f120193a) {
            optiMVParams.hasSendMV = true;
        }
        this.f120195c.put(optiMVParams.curUserId, optiMVParams);
    }

    /* JADX INFO: renamed from: b */
    public void m143756b(OptiMVParams optiMVParams) {
        this.f120195c.put(optiMVParams.curUserId, optiMVParams);
    }

    /* JADX INFO: renamed from: c */
    public void m143757c() {
        this.f120194b.clear();
        this.f120195c.clear();
    }

    /* JADX INFO: renamed from: d */
    public void m143758d(String str) {
        if (this.f120195c.containsKey(str)) {
            if (!this.f120193a) {
                this.f120194b.add(str);
            }
            this.f120195c.remove(str);
        }
    }

    /* JADX INFO: renamed from: e */
    public void m143759e(bzl bzlVar, boolean z) {
        if (this.f120193a) {
            return;
        }
        for (Map.Entry<String, OptiMVParams> entry : this.f120195c.entrySet()) {
            if (!this.f120195c.get(entry.getKey()).hasSendMV || z) {
                this.f120195c.get(entry.getKey()).hasSendMV = true;
                bzlVar.mo104624a(this.f120195c.get(entry.getKey()));
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public void m143760f(bzl bzlVar, OptiMVParams optiMVParams) {
        if (this.f120193a || !this.f120195c.containsKey(optiMVParams.curUserId)) {
            return;
        }
        if (this.f120194b.contains(optiMVParams.curUserId)) {
            this.f120194b.remove(optiMVParams.curUserId);
        } else {
            bzlVar.mo104624a(optiMVParams);
        }
    }
}
