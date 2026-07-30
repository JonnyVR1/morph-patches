package p153l;

import com.p051p1.mobile.putong.core.CoreModule;

/* JADX INFO: loaded from: classes11.dex */
public class vi0 extends AbstractC18774n4 {

    /* JADX INFO: renamed from: a */
    public static boolean f184206a = false;

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m201307c(p8l.C19323a c19323a) {
        if (iz40.m142788y(c19323a.m171258a(), true)) {
            return;
        }
        c19323a.f151041b.f74502G.m137019l(Boolean.TRUE);
    }

    @Override // p153l.g6m
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Boolean mo38500a(final p8l.C19323a c19323a) {
        jxd0 jxd0Var = CoreModule.f18264c.f20381e0.f89198c0;
        Boolean bool = Boolean.TRUE;
        jxd0Var.put(bool);
        qtk.m177991P0(c19323a.m171258a(), "", new x20() { // from class: l.ui0
            @Override // p153l.x20
            public final void call() {
                vi0.m201307c(c19323a);
            }
        }, false, false, null);
        return bool;
    }

    @Override // p153l.g6m
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public boolean mo38501b(p8l.C19323a c19323a) {
        boolean z = (!d09.m113367d() || c19323a.f151041b.m102034k6() || f184206a) ? false : true;
        if (!z) {
            c19323a.f151041b.f74502G.m137019l(Boolean.TRUE);
        }
        return z;
    }
}
