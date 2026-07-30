package p002l;

import androidx.annotation.NonNull;
import com.p1.mobile.android.app.Frag;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.putong.live.base.data.BLiveEntrance;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import l.bs5;
import l.e30;
import l.ff3;
import l.ffw;
import l.i5u;
import l.jo0;
import l.t9u;
import l.vwb;
import l.w9j;
import l.y9j;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class z0f0 implements e3m {

    /* JADX INFO: renamed from: b */
    public final Frag f23159b;

    /* JADX INFO: renamed from: c */
    public final BLiveEntrance f23160c;

    /* JADX INFO: renamed from: d */
    public final n0f0 f23161d;

    /* JADX INFO: renamed from: a */
    public final ff3<vut> f23158a = new ff3<>(new vut());

    /* JADX INFO: renamed from: e */
    public final bs5 f23162e = new bs5();

    public z0f0(Frag frag, @NonNull BLiveEntrance bLiveEntrance, String str) {
        this.f23159b = frag;
        this.f23160c = bLiveEntrance;
        this.f23161d = new n0f0(bLiveEntrance, str);
        m27034v();
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m27026n(List list, i5u i5uVar) {
        if (TEnum.equals(i5uVar.a, "onlive")) {
            return;
        }
        list.add(i5uVar.b);
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ List m27028p(List list) {
        final ArrayList arrayList = new ArrayList();
        vwb.z(list, new e30() { // from class: l.x0f0
            public final void call(Object obj) {
                z0f0.m27026n(arrayList, (i5u) obj);
            }
        });
        return arrayList;
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ vut m27032t(t9u t9uVar, t9u t9uVar2, t9u t9uVar3) {
        vut vutVar = new vut();
        vutVar.m24172j(t9uVar3);
        t9uVar.C(t9uVar3.p());
        vutVar.m24171i(t9uVar);
        t9uVar2.C(t9uVar3.p());
        t9uVar2.C(t9uVar.p());
        vutVar.m24173k(t9uVar2);
        return vutVar;
    }

    @Override // p002l.e3m
    /* JADX INFO: renamed from: a */
    public void mo12165a() {
        if (m12174j().size() == 0) {
            m27034v();
        }
    }

    @Override // p002l.e3m
    /* JADX INFO: renamed from: b */
    public void mo12166b() {
        this.f23162e.c();
    }

    @Override // p002l.e3m
    /* JADX INFO: renamed from: c */
    public BLiveEntrance mo12167c() {
        return this.f23160c;
    }

    @Override // p002l.e3m
    /* JADX INFO: renamed from: d */
    public void mo12168d(final Collection<String> collection) {
        this.f23158a.a(new e30() { // from class: l.p0f0
            public final void call(Object obj) {
                ((vut) obj).m24170h(collection);
            }
        });
    }

    @Override // p002l.e3m
    /* JADX INFO: renamed from: e */
    public c<vut> mo12169e() {
        return this.f23158a.d();
    }

    @Override // p002l.e3m
    /* JADX INFO: renamed from: f */
    public vut mo12170f() {
        return (vut) this.f23158a.c();
    }

    @Override // p002l.e3m
    /* JADX INFO: renamed from: h */
    public void mo12172h() {
        this.f23162e.a(this.f23159b.duringCreated(this.f23161d.m18344c(((vut) this.f23158a.c()).m24169g())).observeOn(jo0.a()).subscribe(ffw.h(new e30() { // from class: l.u0f0
            public final void call(Object obj) {
                this.f20445a.m27036x((t9u) obj);
            }
        })));
    }

    @Override // p002l.e3m
    /* JADX INFO: renamed from: i */
    public void mo12173i() {
        this.f23162e.a(this.f23159b.duringCreated(this.f23161d.m18347f(m12174j())).map(new w9j() { // from class: l.v0f0
            public final Object call(Object obj) {
                return z0f0.m27028p((List) obj);
            }
        }).observeOn(jo0.a()).subscribe(ffw.h(new e30() { // from class: l.w0f0
            public final void call(Object obj) {
                this.f21403a.m27037y((List) obj);
            }
        })));
    }

    /* JADX INFO: renamed from: v */
    public final void m27034v() {
        this.f23162e.a(this.f23159b.duringCreated(c.zip(this.f23161d.m18342a().onErrorReturn(new w9j() { // from class: l.o0f0
            public final Object call(Object obj) {
                return t9u.o();
            }
        }), this.f23161d.m18345d().onErrorReturn(new w9j() { // from class: l.q0f0
            public final Object call(Object obj) {
                return t9u.o();
            }
        }), this.f23161d.m18343b().onErrorReturn(new w9j() { // from class: l.r0f0
            public final Object call(Object obj) {
                return t9u.o();
            }
        }), new y9j() { // from class: l.s0f0
            /* JADX INFO: renamed from: a */
            public final Object m22186a(Object obj, Object obj2, Object obj3) {
                return z0f0.m27032t((t9u) obj, (t9u) obj2, (t9u) obj3);
            }
        })).observeOn(jo0.a()).subscribe(ffw.h(new e30() { // from class: l.t0f0
            public final void call(Object obj) {
                this.f19350a.m27035w((vut) obj);
            }
        })));
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m27035w(vut vutVar) {
        this.f23158a.e(vutVar);
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m27036x(final t9u t9uVar) {
        this.f23158a.a(new e30() { // from class: l.y0f0
            public final void call(Object obj) {
                ((vut) obj).m24169g().w(t9uVar);
            }
        });
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m27037y(List list) {
        if (list.isEmpty()) {
            return;
        }
        mo12168d(list);
    }
}
