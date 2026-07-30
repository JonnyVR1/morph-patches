package p153l;

import com.tantanapp.httpdns.model.DomainModel;
import com.tantanapp.httpdns.model.IpModel;
import com.tantanapp.httpdns.probe.IPProbeService$Status;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes11.dex */
public class fk90 {

    /* JADX INFO: renamed from: a */
    public y1m f99486a;

    /* JADX INFO: renamed from: b */
    public ConcurrentHashMap<String, ArrayList<String>> f99487b = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: a */
    public void m125980a() {
        this.f99487b.clear();
    }

    /* JADX INFO: renamed from: b */
    public IPProbeService$Status m125981b(String str) {
        return this.f99487b.containsKey(str) ? IPProbeService$Status.PROBING : IPProbeService$Status.NO_PROBING;
    }

    /* JADX INFO: renamed from: c */
    public void m125982c(DomainModel domainModel) {
        ArrayList<String> arrayList = this.f99487b.get(domainModel.domain);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.f99487b.put(domainModel.domain, arrayList);
        }
        ArrayList arrayList2 = new ArrayList();
        for (IpModel ipModel : domainModel.totalIpModelList) {
            arrayList2.add(ipModel.f56959ip);
            if (!arrayList.contains(ipModel.f56959ip)) {
                String str = domainModel.domain;
                String str2 = ipModel.f56959ip;
                f0l f0lVar = domainModel.healthCheckModel;
                gk90 gk90Var = new gk90(this, new z1m(str, str2, f0lVar.f96695c, f0lVar.f96696d, f0lVar.f96697e, f0lVar.f96698f, f0lVar.f96694b), this.f99486a);
                arrayList.add(ipModel.f56959ip);
                hoi0.m136434a().m136435b(gk90Var);
            }
        }
        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (!arrayList2.contains(next)) {
                m125985f(next);
                it.remove();
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public void m125983d(y1m y1mVar) {
        this.f99486a = y1mVar;
    }

    /* JADX INFO: renamed from: e */
    public void m125984e(DomainModel domainModel) {
        if (m125981b(domainModel.domain) == IPProbeService$Status.PROBING) {
            this.f99487b.remove(domainModel.domain);
            Iterator<IpModel> it = domainModel.totalIpModelList.iterator();
            while (it.hasNext()) {
                m125985f(it.next().f56959ip);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public void m125985f(String str) {
        hoi0.m136434a().m136438e(str);
    }
}
