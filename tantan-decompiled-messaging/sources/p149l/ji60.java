package p149l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class ji60 {

    /* JADX INFO: renamed from: a */
    public List<AbstractC20353u4> f118052a;

    /* JADX INFO: renamed from: b */
    public gi60 f118053b;

    /* JADX INFO: renamed from: c */
    public hi60 f118054c;

    public ji60(gi60 gi60Var) {
        ArrayList arrayList = new ArrayList();
        this.f118052a = arrayList;
        arrayList.add(new y83());
        this.f118052a.add(new knd0());
        this.f118052a.add(new a0d0());
        this.f118052a.add(new Cnew());
        this.f118052a.add(new sll());
        this.f118052a.add(new omd0());
        this.f118052a.add(new nc60());
        this.f118052a.add(new zh0());
        this.f118052a.add(new lnd0());
        this.f118052a.add(new a8c());
        this.f118053b = gi60Var;
    }

    /* JADX INFO: renamed from: b */
    public hi60 m141631b() {
        vwb.m200354z(this.f118052a, new e30() { // from class: l.ii60
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f113370a.m141632c((AbstractC20353u4) obj);
            }
        });
        return this.f118054c;
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void m141632c(AbstractC20353u4 abstractC20353u4) {
        this.f118054c = abstractC20353u4.mo37497a(this.f118053b);
    }
}
