package p006l;

import java.util.ArrayList;
import java.util.List;
import l.e30;
import l.vwb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class ji60 {

    /* JADX INFO: renamed from: a */
    public List<AbstractC1333u4> f15162a;

    /* JADX INFO: renamed from: b */
    public gi60 f15163b;

    /* JADX INFO: renamed from: c */
    public hi60 f15164c;

    public ji60(gi60 gi60Var) {
        ArrayList arrayList = new ArrayList();
        this.f15162a = arrayList;
        arrayList.add(new y83());
        this.f15162a.add(new knd0());
        this.f15162a.add(new a0d0());
        this.f15162a.add(new Cnew());
        this.f15162a.add(new sll());
        this.f15162a.add(new omd0());
        this.f15162a.add(new nc60());
        this.f15162a.add(new zh0());
        this.f15162a.add(new lnd0());
        this.f15162a.add(new a8c());
        this.f15163b = gi60Var;
    }

    /* JADX INFO: renamed from: b */
    public hi60 m17456b() {
        vwb.z(this.f15162a, new e30() { // from class: l.ii60
            public final void call(Object obj) {
                this.f14486a.m17457c((AbstractC1333u4) obj);
            }
        });
        return this.f15164c;
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void m17457c(AbstractC1333u4 abstractC1333u4) {
        this.f15164c = abstractC1333u4.m24941a(this.f15163b);
    }
}
