package p153l;

import android.content.Context;
import com.tantanapp.httpdns.model.DomainModel;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: loaded from: classes11.dex */
public class u6e implements y1m {

    /* JADX INFO: renamed from: a */
    public fk90 f177752a;

    /* JADX INFO: renamed from: b */
    public msl f177753b;

    /* JADX INFO: renamed from: c */
    public ksl f177754c;

    /* JADX INFO: renamed from: d */
    public boolean f177755d;

    /* JADX INFO: renamed from: e */
    public HashSet<String> f177756e;

    /* JADX INFO: renamed from: l.u6e$a */
    public class RunnableC20503a implements Runnable {
        public RunnableC20503a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            u6e.this.f177753b.mo159837a(u6e.this.f177756e, true);
        }
    }

    /* JADX INFO: renamed from: l.u6e$b */
    public class C20504b extends r2i0 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f177758a;

        public C20504b(String str) {
            this.f177758a = str;
        }

        @Override // p153l.r2i0
        /* JADX INFO: renamed from: a */
        public String mo130570a() {
            return this.f177758a;
        }

        @Override // java.lang.Runnable
        public void run() {
            HashSet<String> hashSet = new HashSet<>();
            hashSet.add(this.f177758a);
            u6e.this.f177753b.mo159837a(hashSet, false);
        }
    }

    /* JADX INFO: renamed from: l.u6e$c */
    public class RunnableC20505c implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ z1m f177760a;

        public RunnableC20505c(z1m z1mVar) {
            this.f177760a = z1mVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            u6e.this.f177754c.mo151249c(this.f177760a);
        }
    }

    public u6e(Context context, boolean z, boolean z2, xul xulVar, HashSet<String> hashSet) {
        this.f177755d = z2;
        this.f177754c = new p6e(context, z);
        fk90 fk90Var = new fk90();
        this.f177752a = fk90Var;
        fk90Var.m125983d(this);
        this.f177756e = hashSet;
        this.f177753b = new vnl(this, xulVar);
    }

    @Override // p153l.y1m
    /* JADX INFO: renamed from: a */
    public void mo194675a(z1m z1mVar) {
        hoi0.m136434a().m136435b(new RunnableC20505c(z1mVar));
    }

    /* JADX INFO: renamed from: e */
    public void m194676e() {
        if (vml.m201753c().m201756b()) {
            return;
        }
        hoi0.m136434a().m136435b(new RunnableC20503a());
    }

    /* JADX INFO: renamed from: f */
    public String m194677f(String str) {
        DomainModel domainModelMo151247a = this.f177754c.mo151247a(str);
        if (domainModelMo151247a == null) {
            return null;
        }
        if (this.f177755d || !domainModelMo151247a.isExpire()) {
            return this.f177754c.mo151250d(domainModelMo151247a);
        }
        this.f177752a.m125984e(domainModelMo151247a);
        r6e.m180005a("domain:" + str + " is Expire! use localDns!");
        return null;
    }

    /* JADX INFO: renamed from: g */
    public void m194678g() {
        this.f177754c.clear();
        this.f177752a.m125980a();
        hoi0.m136434a().m136437d();
    }

    /* JADX INFO: renamed from: h */
    public final void m194679h(DomainModel domainModel) {
        this.f177752a.m125982c(domainModel);
    }

    /* JADX INFO: renamed from: i */
    public final void m194680i(String str, long j) {
        r6e.m180005a("domain:" + str + " will update after " + j + "ms");
        hoi0.m136434a().m136436c(new C20504b(str), j);
    }

    /* JADX INFO: renamed from: j */
    public void m194681j(ArrayList<DomainModel> arrayList) {
        for (DomainModel domainModel : arrayList) {
            this.f177754c.mo151248b(domainModel);
            m194680i(domainModel.domain, ((int) (((double) domainModel.ttl) * 0.8d)) * 1000);
            if (domainModel.isNeedProbe()) {
                m194679h(domainModel);
            }
        }
    }
}
