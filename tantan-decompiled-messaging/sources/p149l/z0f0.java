package p149l;

import androidx.annotation.NonNull;
import com.p046p1.mobile.android.app.Frag;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.base.data.BLiveEntrance;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes4.dex */
public class z0f0 implements e3m {

    /* JADX INFO: renamed from: b */
    public final Frag f200990b;

    /* JADX INFO: renamed from: c */
    public final BLiveEntrance f200991c;

    /* JADX INFO: renamed from: d */
    public final n0f0 f200992d;

    /* JADX INFO: renamed from: a */
    public final ff3<vut> f200989a = new ff3<>(new vut());

    /* JADX INFO: renamed from: e */
    public final bs5 f200993e = new bs5();

    public z0f0(Frag frag, @NonNull BLiveEntrance bLiveEntrance, String str) {
        this.f200990b = frag;
        this.f200991c = bLiveEntrance;
        this.f200992d = new n0f0(bLiveEntrance, str);
        m216745v();
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m216737n(List list, i5u i5uVar) {
        if (TEnum.equals(i5uVar.f111640a, "onlive")) {
            return;
        }
        list.add(i5uVar.f111641b);
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ List m216739p(List list) {
        final ArrayList arrayList = new ArrayList();
        vwb.m200354z(list, new e30() { // from class: l.x0f0
            @Override // p149l.e30
            public final void call(Object obj) {
                z0f0.m216737n(arrayList, (i5u) obj);
            }
        });
        return arrayList;
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ vut m216743t(t9u t9uVar, t9u t9uVar2, t9u t9uVar3) {
        vut vutVar = new vut();
        vutVar.m200130j(t9uVar3);
        t9uVar.m187665C(t9uVar3.m187669p());
        vutVar.m200129i(t9uVar);
        t9uVar2.m187665C(t9uVar3.m187669p());
        t9uVar2.m187665C(t9uVar.m187669p());
        vutVar.m200131k(t9uVar2);
        return vutVar;
    }

    @Override // p149l.e3m
    /* JADX INFO: renamed from: a */
    public void mo114607a() {
        if (m114616j().size() == 0) {
            m216745v();
        }
    }

    @Override // p149l.e3m
    /* JADX INFO: renamed from: b */
    public void mo114608b() {
        this.f200993e.m103657c();
    }

    @Override // p149l.e3m
    /* JADX INFO: renamed from: c */
    public BLiveEntrance mo114609c() {
        return this.f200991c;
    }

    @Override // p149l.e3m
    /* JADX INFO: renamed from: d */
    public void mo114610d(final Collection<String> collection) {
        this.f200989a.m121100a(new e30() { // from class: l.p0f0
            @Override // p149l.e30
            public final void call(Object obj) {
                ((vut) obj).m200128h(collection);
            }
        });
    }

    @Override // p149l.e3m
    /* JADX INFO: renamed from: e */
    public C22306c<vut> mo114611e() {
        return this.f200989a.m121103d();
    }

    @Override // p149l.e3m
    /* JADX INFO: renamed from: f */
    public vut mo114612f() {
        return this.f200989a.m121102c();
    }

    @Override // p149l.e3m
    /* JADX INFO: renamed from: h */
    public void mo114614h() {
        this.f200993e.m103655a(this.f200990b.duringCreated(this.f200992d.m157273c(this.f200989a.m121102c().m200127g())).observeOn(jo0.m142408a()).subscribe(ffw.m121197h(new e30() { // from class: l.u0f0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f172904a.m216747x((t9u) obj);
            }
        })));
    }

    @Override // p149l.e3m
    /* JADX INFO: renamed from: i */
    public void mo114615i() {
        this.f200993e.m103655a(this.f200990b.duringCreated(this.f200992d.m157276f(m114616j())).map(new w9j() { // from class: l.v0f0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return z0f0.m216739p((List) obj);
            }
        }).observeOn(jo0.m142408a()).subscribe(ffw.m121197h(new e30() { // from class: l.w0f0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f183915a.m216748y((List) obj);
            }
        })));
    }

    /* JADX INFO: renamed from: v */
    public final void m216745v() {
        this.f200993e.m103655a(this.f200990b.duringCreated(C22306c.zip(this.f200992d.m157271a().onErrorReturn(new w9j() { // from class: l.o0f0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return t9u.m187662o();
            }
        }), this.f200992d.m157274d().onErrorReturn(new w9j() { // from class: l.q0f0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return t9u.m187662o();
            }
        }), this.f200992d.m157272b().onErrorReturn(new w9j() { // from class: l.r0f0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return t9u.m187662o();
            }
        }), new y9j() { // from class: l.s0f0
            @Override // p149l.y9j
            /* JADX INFO: renamed from: a */
            public final Object mo94599a(Object obj, Object obj2, Object obj3) {
                return z0f0.m216743t((t9u) obj, (t9u) obj2, (t9u) obj3);
            }
        })).observeOn(jo0.m142408a()).subscribe(ffw.m121197h(new e30() { // from class: l.t0f0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f167179a.m216746w((vut) obj);
            }
        })));
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m216746w(vut vutVar) {
        this.f200989a.m121104e(vutVar);
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m216747x(final t9u t9uVar) {
        this.f200989a.m121100a(new e30() { // from class: l.y0f0
            @Override // p149l.e30
            public final void call(Object obj) {
                ((vut) obj).m200127g().m187676w(t9uVar);
            }
        });
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m216748y(List list) {
        if (list.isEmpty()) {
            return;
        }
        mo114610d(list);
    }
}
