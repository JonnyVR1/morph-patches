package p149l;

import com.tantanapp.httpdns.model.DomainModel;
import com.tantanapp.httpdns.model.IpModel;
import com.tantanapp.httpdns.probe.IPProbeService$Status;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes13.dex */
public class bc90 {

    /* JADX INFO: renamed from: a */
    public dzl f74906a;

    /* JADX INFO: renamed from: b */
    public ConcurrentHashMap<String, ArrayList<String>> f74907b = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: a */
    public void m101048a() {
        this.f74907b.clear();
    }

    /* JADX INFO: renamed from: b */
    public IPProbeService$Status m101049b(String str) {
        return this.f74907b.containsKey(str) ? IPProbeService$Status.PROBING : IPProbeService$Status.NO_PROBING;
    }

    /* JADX INFO: renamed from: c */
    public void m101050c(DomainModel domainModel) {
        ArrayList<String> arrayList = this.f74907b.get(domainModel.domain);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.f74907b.put(domainModel.domain, arrayList);
        }
        ArrayList arrayList2 = new ArrayList();
        for (IpModel ipModel : domainModel.totalIpModelList) {
            arrayList2.add(ipModel.f56111ip);
            if (!arrayList.contains(ipModel.f56111ip)) {
                String str = domainModel.domain;
                String str2 = ipModel.f56111ip;
                pxk pxkVar = domainModel.healthCheckModel;
                cc90 cc90Var = new cc90(this, new ezl(str, str2, pxkVar.f151690c, pxkVar.f151691d, pxkVar.f151692e, pxkVar.f151693f, pxkVar.f151689b), this.f74906a);
                arrayList.add(ipModel.f56111ip);
                hfi0.m130761a().m130762b(cc90Var);
            }
        }
        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (!arrayList2.contains(next)) {
                m101053f(next);
                it.remove();
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public void m101051d(dzl dzlVar) {
        this.f74906a = dzlVar;
    }

    /* JADX INFO: renamed from: e */
    public void m101052e(DomainModel domainModel) {
        if (m101049b(domainModel.domain) == IPProbeService$Status.PROBING) {
            this.f74907b.remove(domainModel.domain);
            Iterator<IpModel> it = domainModel.totalIpModelList.iterator();
            while (it.hasNext()) {
                m101053f(it.next().f56111ip);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public void m101053f(String str) {
        hfi0.m130761a().m130765e(str);
    }
}
