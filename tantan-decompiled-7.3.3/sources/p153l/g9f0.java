package p153l;

import androidx.annotation.NonNull;
import com.p051p1.mobile.android.app.Frag;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.base.data.BLiveEntrance;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes4.dex */
public class g9f0 implements v5m {

    /* JADX INFO: renamed from: b */
    public final Frag f102841b;

    /* JADX INFO: renamed from: c */
    public final BLiveEntrance f102842c;

    /* JADX INFO: renamed from: d */
    public final u8f0 f102843d;

    /* JADX INFO: renamed from: a */
    public final tf3<wwt> f102840a = new tf3<>(new wwt());

    /* JADX INFO: renamed from: e */
    public final ft5 f102844e = new ft5();

    public g9f0(Frag frag, @NonNull BLiveEntrance bLiveEntrance, String str) {
        this.f102841b = frag;
        this.f102842c = bLiveEntrance;
        this.f102843d = new u8f0(bLiveEntrance, str);
        m129569v();
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m129553n(List list, j7u j7uVar) {
        if (TEnum.equals(j7uVar.f118726a, "onlive")) {
            return;
        }
        list.add(j7uVar.f118727b);
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ List m129555p(List list) {
        final ArrayList arrayList = new ArrayList();
        jyb.m147537z(list, new y20() { // from class: l.e9f0
            @Override // p153l.y20
            public final void call(Object obj) {
                g9f0.m129553n(arrayList, (j7u) obj);
            }
        });
        return arrayList;
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ wwt m129559t(ubu ubuVar, ubu ubuVar2, ubu ubuVar3) {
        wwt wwtVar = new wwt();
        wwtVar.m208304j(ubuVar3);
        ubuVar.m195319C(ubuVar3.m195323p());
        wwtVar.m208303i(ubuVar);
        ubuVar2.m195319C(ubuVar3.m195323p());
        ubuVar2.m195319C(ubuVar.m195323p());
        wwtVar.m208305k(ubuVar2);
        return wwtVar;
    }

    @Override // p153l.v5m
    /* JADX INFO: renamed from: a */
    public void mo129561a() {
        if (m199906j().size() == 0) {
            m129569v();
        }
    }

    @Override // p153l.v5m
    /* JADX INFO: renamed from: b */
    public void mo129562b() {
        this.f102844e.m127299c();
    }

    @Override // p153l.v5m
    /* JADX INFO: renamed from: c */
    public BLiveEntrance mo129563c() {
        return this.f102842c;
    }

    @Override // p153l.v5m
    /* JADX INFO: renamed from: d */
    public void mo129564d(final Collection<String> collection) {
        this.f102840a.m190908a(new y20() { // from class: l.w8f0
            @Override // p153l.y20
            public final void call(Object obj) {
                ((wwt) obj).m208302h(collection);
            }
        });
    }

    @Override // p153l.v5m
    /* JADX INFO: renamed from: e */
    public C22421c<wwt> mo129565e() {
        return this.f102840a.m190911d();
    }

    @Override // p153l.v5m
    /* JADX INFO: renamed from: f */
    public wwt mo129566f() {
        return this.f102840a.m190910c();
    }

    @Override // p153l.v5m
    /* JADX INFO: renamed from: h */
    public void mo129567h() {
        this.f102844e.m127297a(this.f102841b.duringCreated(this.f102843d.m195036c(this.f102840a.m190910c().m208301g())).observeOn(fo0.m126432a()).subscribe(dhw.m115829h(new y20() { // from class: l.b9f0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f75575a.m129571x((ubu) obj);
            }
        })));
    }

    @Override // p153l.v5m
    /* JADX INFO: renamed from: i */
    public void mo129568i() {
        this.f102844e.m127297a(this.f102841b.duringCreated(this.f102843d.m195039f(m199906j())).map(new qcj() { // from class: l.c9f0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return g9f0.m129555p((List) obj);
            }
        }).observeOn(fo0.m126432a()).subscribe(dhw.m115829h(new y20() { // from class: l.d9f0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f85767a.m129572y((List) obj);
            }
        })));
    }

    /* JADX INFO: renamed from: v */
    public final void m129569v() {
        this.f102844e.m127297a(this.f102841b.duringCreated(C22421c.zip(this.f102843d.m195034a().onErrorReturn(new qcj() { // from class: l.v8f0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ubu.m195316o();
            }
        }), this.f102843d.m195037d().onErrorReturn(new qcj() { // from class: l.x8f0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ubu.m195316o();
            }
        }), this.f102843d.m195035b().onErrorReturn(new qcj() { // from class: l.y8f0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ubu.m195316o();
            }
        }), new scj() { // from class: l.z8f0
            @Override // p153l.scj
            /* JADX INFO: renamed from: a */
            public final Object mo95332a(Object obj, Object obj2, Object obj3) {
                return g9f0.m129559t((ubu) obj, (ubu) obj2, (ubu) obj3);
            }
        })).observeOn(fo0.m126432a()).subscribe(dhw.m115829h(new y20() { // from class: l.a9f0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f69040a.m129570w((wwt) obj);
            }
        })));
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m129570w(wwt wwtVar) {
        this.f102840a.m190912e(wwtVar);
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m129571x(final ubu ubuVar) {
        this.f102840a.m190908a(new y20() { // from class: l.f9f0
            @Override // p153l.y20
            public final void call(Object obj) {
                ((wwt) obj).m208301g().m195330w(ubuVar);
            }
        });
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m129572y(List list) {
        if (list.isEmpty()) {
            return;
        }
        mo129564d(list);
    }
}
