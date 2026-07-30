package p149l;

import android.content.Context;
import com.tantanapp.httpdns.model.DomainModel;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: loaded from: classes13.dex */
public class g5e implements dzl {

    /* JADX INFO: renamed from: a */
    public bc90 f101119a;

    /* JADX INFO: renamed from: b */
    public zpl f101120b;

    /* JADX INFO: renamed from: c */
    public xpl f101121c;

    /* JADX INFO: renamed from: d */
    public boolean f101122d;

    /* JADX INFO: renamed from: e */
    public HashSet<String> f101123e;

    /* JADX INFO: renamed from: l.g5e$a */
    public class RunnableC17005a implements Runnable {
        public RunnableC17005a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            g5e.this.f101120b.mo126772a(g5e.this.f101123e, true);
        }
    }

    /* JADX INFO: renamed from: l.g5e$b */
    public class C17006b extends juh0 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f101125a;

        public C17006b(String str) {
            this.f101125a = str;
        }

        @Override // p149l.juh0
        /* JADX INFO: renamed from: a */
        public String mo106041a() {
            return this.f101125a;
        }

        @Override // java.lang.Runnable
        public void run() {
            HashSet<String> hashSet = new HashSet<>();
            hashSet.add(this.f101125a);
            g5e.this.f101120b.mo126772a(hashSet, false);
        }
    }

    /* JADX INFO: renamed from: l.g5e$c */
    public class RunnableC17007c implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ezl f101127a;

        public RunnableC17007c(ezl ezlVar) {
            this.f101127a = ezlVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            g5e.this.f101121c.mo100315c(this.f101127a);
        }
    }

    public g5e(Context context, boolean z, boolean z2, ksl kslVar, HashSet<String> hashSet) {
        this.f101122d = z2;
        this.f101121c = new b5e(context, z);
        bc90 bc90Var = new bc90();
        this.f101119a = bc90Var;
        bc90Var.m101051d(this);
        this.f101123e = hashSet;
        this.f101120b = new gll(this, kslVar);
    }

    @Override // p149l.dzl
    /* JADX INFO: renamed from: a */
    public void mo114129a(ezl ezlVar) {
        hfi0.m130761a().m130762b(new RunnableC17007c(ezlVar));
    }

    /* JADX INFO: renamed from: e */
    public void m124488e() {
        if (hkl.m131567c().m131570b()) {
            return;
        }
        hfi0.m130761a().m130762b(new RunnableC17005a());
    }

    /* JADX INFO: renamed from: f */
    public String m124489f(String str) {
        DomainModel domainModelMo100313a = this.f101121c.mo100313a(str);
        if (domainModelMo100313a == null) {
            return null;
        }
        if (this.f101122d || !domainModelMo100313a.isExpire()) {
            return this.f101121c.mo100316d(domainModelMo100313a);
        }
        this.f101119a.m101052e(domainModelMo100313a);
        d5e.m110050a("domain:" + str + " is Expire! use localDns!");
        return null;
    }

    /* JADX INFO: renamed from: g */
    public void m124490g() {
        this.f101121c.clear();
        this.f101119a.m101048a();
        hfi0.m130761a().m130764d();
    }

    /* JADX INFO: renamed from: h */
    public final void m124491h(DomainModel domainModel) {
        this.f101119a.m101050c(domainModel);
    }

    /* JADX INFO: renamed from: i */
    public final void m124492i(String str, long j) {
        d5e.m110050a("domain:" + str + " will update after " + j + "ms");
        hfi0.m130761a().m130763c(new C17006b(str), j);
    }

    /* JADX INFO: renamed from: j */
    public void m124493j(ArrayList<DomainModel> arrayList) {
        for (DomainModel domainModel : arrayList) {
            this.f101121c.mo100314b(domainModel);
            m124492i(domainModel.domain, ((int) (((double) domainModel.ttl) * 0.8d)) * 1000);
            if (domainModel.isNeedProbe()) {
                m124491h(domainModel);
            }
        }
    }
}
