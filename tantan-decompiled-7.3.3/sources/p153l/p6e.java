package p153l;

import android.content.Context;
import android.os.SystemClock;
import com.tantanapp.httpdns.model.DomainModel;
import com.tantanapp.httpdns.model.IpModel;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes11.dex */
public class p6e implements ksl {

    /* JADX INFO: renamed from: a */
    public ftd0 f150824a;

    /* JADX INFO: renamed from: b */
    public final int f150825b = 8;

    /* JADX INFO: renamed from: c */
    public final int f150826c = 32;

    /* JADX INFO: renamed from: d */
    public ConcurrentHashMap<String, DomainModel> f150827d = new ConcurrentHashMap<>(8, 32.0f);

    public p6e(Context context, boolean z) {
        if (z) {
            this.f150824a = new ftd0(context);
        }
    }

    @Override // p153l.ksl
    /* JADX INFO: renamed from: a */
    public DomainModel mo151247a(String str) {
        DomainModel domainModelM127306a;
        if (this.f150827d.containsKey(str)) {
            return this.f150827d.get(str);
        }
        ftd0 ftd0Var = this.f150824a;
        if (ftd0Var == null || (domainModelM127306a = ftd0Var.m127306a(str)) == null) {
            return null;
        }
        this.f150827d.put(str, domainModelM127306a);
        return domainModelM127306a;
    }

    @Override // p153l.ksl
    /* JADX INFO: renamed from: b */
    public void mo151248b(DomainModel domainModel) {
        domainModel.queryTime = SystemClock.elapsedRealtime();
        DomainModel domainModel2 = this.f150827d.get(domainModel.domain);
        if (domainModel2 != null) {
            if (domainModel.healthCheckModel == null) {
                domainModel.healthCheckModel = domainModel2.healthCheckModel;
            }
            Iterator<IpModel> it = domainModel.totalIpModelList.iterator();
            while (it.hasNext()) {
                domainModel.markIpValid(it.next(), domainModel2.totalIpModelList);
            }
        }
        ftd0 ftd0Var = this.f150824a;
        if (ftd0Var != null) {
            ftd0Var.m127311f(domainModel);
        }
        this.f150827d.put(domainModel.domain, domainModel);
        r6e.m180005a("cache data:" + domainModel.domain + " success!!!");
    }

    @Override // p153l.ksl
    /* JADX INFO: renamed from: c */
    public void mo151249c(z1m z1mVar) {
        if (this.f150827d.containsKey(z1mVar.f202569a)) {
            for (IpModel ipModel : this.f150827d.get(z1mVar.f202569a).totalIpModelList) {
                if (ipModel.f56959ip.equals(z1mVar.f202570b)) {
                    ipModel.valide = z1mVar.f202576h;
                    r6e.m180005a("探测结果:域名: " + ipModel.domain + " ip:" + ipModel.f56959ip + " 是否有效: " + ipModel.valide);
                    return;
                }
            }
        }
    }

    @Override // p153l.ksl
    public void clear() {
        this.f150827d.clear();
    }

    @Override // p153l.ksl
    /* JADX INFO: renamed from: d */
    public String mo151250d(DomainModel domainModel) {
        if (domainModel == null) {
            return null;
        }
        return domainModel.getIpByDomainModel();
    }
}
