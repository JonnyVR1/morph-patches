package p153l;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes5.dex */
public class hi2 extends ixl {

    /* JADX INFO: renamed from: a */
    public CopyOnWriteArrayList<hxl> f109977a = new CopyOnWriteArrayList<>();

    @Override // p153l.ixl
    /* JADX INFO: renamed from: a */
    public void mo135096a(final Throwable th) {
        nsw.m164645a(new Runnable() { // from class: l.ei2
            @Override // java.lang.Runnable
            public final void run() {
                this.f94100a.m135102k(th);
            }
        });
    }

    @Override // p153l.ixl
    /* JADX INFO: renamed from: b */
    public void mo135097b(final int i, final int i2, final gxl gxlVar) {
        nsw.m164645a(new Runnable() { // from class: l.gi2
            @Override // java.lang.Runnable
            public final void run() {
                this.f104190a.m135103l(i, i2, gxlVar);
            }
        });
    }

    @Override // p153l.ixl
    /* JADX INFO: renamed from: c */
    public void mo135098c(final int i, final String str) {
        nsw.m164645a(new Runnable() { // from class: l.fi2
            @Override // java.lang.Runnable
            public final void run() {
                this.f99144a.m135104m(i, str);
            }
        });
    }

    @Override // p153l.ixl
    /* JADX INFO: renamed from: d */
    public void mo135099d(final boolean z) {
        nsw.m164645a(new Runnable() { // from class: l.di2
            @Override // java.lang.Runnable
            public final void run() {
                this.f88575a.m135105n(z);
            }
        });
    }

    @Override // p153l.ixl
    /* JADX INFO: renamed from: e */
    public void mo135100e() {
        this.f109977a.clear();
    }

    /* JADX INFO: renamed from: j */
    public void m135101j(hxl hxlVar) {
        this.f109977a.add(hxlVar);
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m135102k(Throwable th) {
        Iterator<hxl> it = this.f109977a.iterator();
        while (it.hasNext()) {
            it.next().mo132226c(th);
        }
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m135103l(int i, int i2, gxl gxlVar) {
        Iterator<hxl> it = this.f109977a.iterator();
        while (it.hasNext()) {
            it.next().mo132227d(i, i2, gxlVar);
        }
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m135104m(int i, String str) {
        Iterator<hxl> it = this.f109977a.iterator();
        while (it.hasNext()) {
            it.next().mo132224a(i, str);
        }
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m135105n(boolean z) {
        Iterator<hxl> it = this.f109977a.iterator();
        while (it.hasNext()) {
            it.next().mo132225b(z);
        }
    }
}
