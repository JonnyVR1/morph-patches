package p153l;

import android.app.Activity;
import android.content.DialogInterface;
import android.view.View;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.archi.act.LiveAct;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes5.dex */
public class z2d0<T> {

    /* JADX INFO: renamed from: a */
    public T f202674a;

    /* JADX INFO: renamed from: b */
    public y20<T> f202675b;

    /* JADX INFO: renamed from: c */
    public y20<T> f202676c;

    /* JADX INFO: renamed from: d */
    public x20 f202677d;

    /* JADX INFO: renamed from: e */
    public x20 f202678e;

    /* JADX INFO: renamed from: f */
    public byd0 f202679f;

    public z2d0(T t, String str) {
        this.f202674a = t;
        this.f202679f = new byd0(str, 0L);
    }

    /* JADX INFO: renamed from: h */
    public final void m218405h(final T t) {
        if (nti.m164730d().m164731a(zrv.f205803e)) {
            Act.front().takeFirst(new qcj() { // from class: l.w2d0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(((Boolean) obj).booleanValue() && zrv.f205799a.m207699v0());
                }
            }).subscribe(dhw.m115825d(new y20() { // from class: l.x2d0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f192140a.m218407j(t, (Boolean) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m218406i(Object obj) {
        if (nti.m164730d().m164732b(zrv.f205803e)) {
            this.f202675b.call(obj);
        } else {
            this.f202676c.call(obj);
        }
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m218407j(final Object obj, Boolean bool) {
        if (nti.m164730d().m164732b(zrv.f205803e)) {
            this.f202675b.call(obj);
        } else {
            l51.m152888H(zrv.f205803e, new Runnable() { // from class: l.y2d0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f197209a.m218406i(obj);
                }
            }, 2000L);
        }
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Boolean m218408k(String str, Act.C4450r c4450r) {
        return Boolean.valueOf(m218415r(c4450r, str, false));
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m218409l(View view) {
        m218405h(this.f202674a);
        if (NullChecker.m82486a(this.f202677d)) {
            this.f202677d.call();
        }
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m218410m(DialogInterface dialogInterface) {
        this.f202676c.call(this.f202674a);
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m218411n(View view) {
        this.f202676c.call(this.f202674a);
    }

    /* JADX INFO: renamed from: o */
    public boolean m218412o(final String str, boolean z, boolean z2, boolean z3) {
        boolean zM164732b = nti.m164730d().m164732b(zrv.f205803e);
        if (zM164732b) {
            this.f202675b.call(this.f202674a);
            return true;
        }
        if (!z) {
            return false;
        }
        if (pzi0.m174454o() - this.f202679f.get().longValue() < 604800000) {
            if (z2 && !zM164732b) {
                this.f202676c.call(this.f202674a);
            }
            return false;
        }
        if (z2 && z3) {
            return m218415r(Act.foreground_(), str, z3);
        }
        Act.foreground().takeFirst(new qcj() { // from class: l.s2d0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f165878a.m218408k(str, (Act.C4450r) obj);
            }
        }).subscribe(dhw.m115824c());
        return true;
    }

    /* JADX INFO: renamed from: p */
    public void m218413p(y20<T> y20Var) {
        this.f202676c = y20Var;
    }

    /* JADX INFO: renamed from: q */
    public void m218414q(y20<T> y20Var) {
        this.f202675b = y20Var;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m218415r(Act.C4450r c4450r, String str, boolean z) {
        Activity activity;
        if ((!z && (c4450r == null || (c4450r.f16062a.get() instanceof LiveAct))) || (activity = c4450r.f16062a.get()) == null) {
            return false;
        }
        new th0.C20312a(activity).m191160s(zrv.f205803e.getString(R$string.f47887W9)).m191151j(str).m191143b(true).m191148g(false).m191159r(zrv.f205803e.getString(R$string.f48126ha)).m191156o(new View.OnClickListener() { // from class: l.t2d0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f171736a.m218409l(view);
            }
        }).m191147f(zrv.f205803e.getString(R$string.f47455C6)).m191153l(new DialogInterface.OnCancelListener() { // from class: l.u2d0
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                this.f177202a.m218410m(dialogInterface);
            }
        }).m191144c(new View.OnClickListener() { // from class: l.v2d0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f182088a.m218411n(view);
            }
        }).m191142a().m191141g();
        if (NullChecker.m82486a(this.f202678e)) {
            this.f202678e.call();
        }
        this.f202679f.put(Long.valueOf(pzi0.m174454o()));
        return true;
    }
}
