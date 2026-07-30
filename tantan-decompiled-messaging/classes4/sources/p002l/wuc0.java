package p002l;

import android.app.Activity;
import android.content.DialogInterface;
import android.view.View;
import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p000p1.mobile.putong.live.livingroom.archi.act.LiveAct;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.utils.NullChecker;
import l.d30;
import l.e30;
import l.e51;
import l.ffw;
import l.mqi0;
import l.rqi;
import l.w9j;
import l.xh0;
import l.ypv;
import l.zpd0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class wuc0<T> {

    /* JADX INFO: renamed from: a */
    public T f21987a;

    /* JADX INFO: renamed from: b */
    public e30<T> f21988b;

    /* JADX INFO: renamed from: c */
    public e30<T> f21989c;

    /* JADX INFO: renamed from: d */
    public d30 f21990d;

    /* JADX INFO: renamed from: e */
    public d30 f21991e;

    /* JADX INFO: renamed from: f */
    public zpd0 f21992f;

    public wuc0(T t, String str) {
        this.f21987a = t;
        this.f21992f = new zpd0(str, 0L);
    }

    /* JADX INFO: renamed from: h */
    public final void m25492h(final T t) {
        if (rqi.d().a(ypv.e)) {
            Act.front().takeFirst(new w9j() { // from class: l.tuc0
                public final Object call(Object obj) {
                    return Boolean.valueOf(((Boolean) obj).booleanValue() && ypv.a.v0());
                }
            }).subscribe(ffw.d(new e30() { // from class: l.uuc0
                public final void call(Object obj) {
                    this.f20801a.m25494j(t, (Boolean) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m25493i(Object obj) {
        if (rqi.d().b(ypv.e)) {
            this.f21988b.call(obj);
        } else {
            this.f21989c.call(obj);
        }
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m25494j(final Object obj, Boolean bool) {
        if (rqi.d().b(ypv.e)) {
            this.f21988b.call(obj);
        } else {
            e51.H(ypv.e, new Runnable() { // from class: l.vuc0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f21328a.m25493i(obj);
                }
            }, 2000L);
        }
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Boolean m25495k(String str, Act.r rVar) {
        return Boolean.valueOf(m25502r(rVar, str, false));
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m25496l(View view) {
        m25492h(this.f21987a);
        if (NullChecker.a(this.f21990d)) {
            this.f21990d.call();
        }
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m25497m(DialogInterface dialogInterface) {
        this.f21989c.call(this.f21987a);
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m25498n(View view) {
        this.f21989c.call(this.f21987a);
    }

    /* JADX INFO: renamed from: o */
    public boolean m25499o(final String str, boolean z, boolean z2, boolean z3) {
        boolean zB = rqi.d().b(ypv.e);
        if (zB) {
            this.f21988b.call(this.f21987a);
            return true;
        }
        if (!z) {
            return false;
        }
        if (mqi0.o() - ((Long) this.f21992f.get()).longValue() < 604800000) {
            if (z2 && !zB) {
                this.f21989c.call(this.f21987a);
            }
            return false;
        }
        if (z2 && z3) {
            return m25502r(Act.foreground_(), str, z3);
        }
        Act.foreground().takeFirst(new w9j() { // from class: l.puc0
            public final Object call(Object obj) {
                return this.f17653a.m25495k(str, (Act.r) obj);
            }
        }).subscribe(ffw.c());
        return true;
    }

    /* JADX INFO: renamed from: p */
    public void m25500p(e30<T> e30Var) {
        this.f21989c = e30Var;
    }

    /* JADX INFO: renamed from: q */
    public void m25501q(e30<T> e30Var) {
        this.f21988b = e30Var;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m25502r(Act.r rVar, String str, boolean z) {
        Activity activity;
        if ((!z && (rVar == null || (rVar.a.get() instanceof LiveAct))) || (activity = (Activity) rVar.a.get()) == null) {
            return false;
        }
        new xh0.a(activity).s(ypv.e.getString(R$string.f3081W9)).j(str).b(true).g(false).r(ypv.e.getString(R$string.f3320ha)).o(new View.OnClickListener() { // from class: l.quc0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f18236a.m25496l(view);
            }
        }).f(ypv.e.getString(R$string.f2649C6)).l(new DialogInterface.OnCancelListener() { // from class: l.ruc0
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                this.f18684a.m25497m(dialogInterface);
            }
        }).c(new View.OnClickListener() { // from class: l.suc0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f19295a.m25498n(view);
            }
        }).a().g();
        if (NullChecker.a(this.f21991e)) {
            this.f21991e.call();
        }
        this.f21992f.put(Long.valueOf(mqi0.o()));
        return true;
    }
}
