package p149l;

import android.content.Context;
import android.os.SystemClock;
import com.tantanapp.httpdns.model.DomainModel;
import com.tantanapp.httpdns.model.IpModel;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes13.dex */
public class b5e implements xpl {

    /* JADX INFO: renamed from: a */
    public cld0 f73632a;

    /* JADX INFO: renamed from: b */
    public final int f73633b = 8;

    /* JADX INFO: renamed from: c */
    public final int f73634c = 32;

    /* JADX INFO: renamed from: d */
    public ConcurrentHashMap<String, DomainModel> f73635d = new ConcurrentHashMap<>(8, 32.0f);

    public b5e(Context context, boolean z) {
        if (z) {
            this.f73632a = new cld0(context);
        }
    }

    @Override // p149l.xpl
    /* JADX INFO: renamed from: a */
    public DomainModel mo100313a(String str) {
        DomainModel domainModelM107452a;
        if (this.f73635d.containsKey(str)) {
            return this.f73635d.get(str);
        }
        cld0 cld0Var = this.f73632a;
        if (cld0Var == null || (domainModelM107452a = cld0Var.m107452a(str)) == null) {
            return null;
        }
        this.f73635d.put(str, domainModelM107452a);
        return domainModelM107452a;
    }

    @Override // p149l.xpl
    /* JADX INFO: renamed from: b */
    public void mo100314b(DomainModel domainModel) {
        domainModel.queryTime = SystemClock.elapsedRealtime();
        DomainModel domainModel2 = this.f73635d.get(domainModel.domain);
        if (domainModel2 != null) {
            if (domainModel.healthCheckModel == null) {
                domainModel.healthCheckModel = domainModel2.healthCheckModel;
            }
            Iterator<IpModel> it = domainModel.totalIpModelList.iterator();
            while (it.hasNext()) {
                domainModel.markIpValid(it.next(), domainModel2.totalIpModelList);
            }
        }
        cld0 cld0Var = this.f73632a;
        if (cld0Var != null) {
            cld0Var.m107457f(domainModel);
        }
        this.f73635d.put(domainModel.domain, domainModel);
        d5e.m110050a("cache data:" + domainModel.domain + " success!!!");
    }

    @Override // p149l.xpl
    /* JADX INFO: renamed from: c */
    public void mo100315c(ezl ezlVar) {
        if (this.f73635d.containsKey(ezlVar.f93904a)) {
            for (IpModel ipModel : this.f73635d.get(ezlVar.f93904a).totalIpModelList) {
                if (ipModel.f56111ip.equals(ezlVar.f93905b)) {
                    ipModel.valide = ezlVar.f93911h;
                    d5e.m110050a("探测结果:域名: " + ipModel.domain + " ip:" + ipModel.f56111ip + " 是否有效: " + ipModel.valide);
                    return;
                }
            }
        }
    }

    @Override // p149l.xpl
    public void clear() {
        this.f73635d.clear();
    }

    @Override // p149l.xpl
    /* JADX INFO: renamed from: d */
    public String mo100316d(DomainModel domainModel) {
        if (domainModel == null) {
            return null;
        }
        return domainModel.getIpByDomainModel();
    }
}
