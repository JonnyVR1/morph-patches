package p153l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class oq60 {

    /* JADX INFO: renamed from: a */
    public List<AbstractC19971s4> f148551a;

    /* JADX INFO: renamed from: b */
    public lq60 f148552b;

    /* JADX INFO: renamed from: c */
    public mq60 f148553c;

    public oq60(lq60 lq60Var) {
        ArrayList arrayList = new ArrayList();
        this.f148551a = arrayList;
        arrayList.add(new n93());
        this.f148551a.add(new mvd0());
        this.f148551a.add(new d8d0());
        this.f148551a.add(new lgw());
        this.f148551a.add(new eol());
        this.f148551a.add(new qud0());
        this.f148551a.add(new sk60());
        this.f148551a.add(new vh0());
        this.f148551a.add(new nvd0());
        this.f148551a.add(new g9c());
        this.f148552b = lq60Var;
    }

    /* JADX INFO: renamed from: b */
    public mq60 m168789b() {
        jyb.m147537z(this.f148551a, new y20() { // from class: l.nq60
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f143177a.m168790c((AbstractC19971s4) obj);
            }
        });
        return this.f148553c;
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void m168790c(AbstractC19971s4 abstractC19971s4) {
        this.f148553c = abstractC19971s4.mo38500a(this.f148552b);
    }
}
