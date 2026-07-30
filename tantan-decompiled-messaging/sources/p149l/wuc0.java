package p149l;

import android.app.Activity;
import android.content.DialogInterface;
import android.view.View;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.archi.act.LiveAct;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes4.dex */
public class wuc0<T> {

    /* JADX INFO: renamed from: a */
    public T f188102a;

    /* JADX INFO: renamed from: b */
    public e30<T> f188103b;

    /* JADX INFO: renamed from: c */
    public e30<T> f188104c;

    /* JADX INFO: renamed from: d */
    public d30 f188105d;

    /* JADX INFO: renamed from: e */
    public d30 f188106e;

    /* JADX INFO: renamed from: f */
    public zpd0 f188107f;

    public wuc0(T t, String str) {
        this.f188102a = t;
        this.f188107f = new zpd0(str, 0L);
    }

    /* JADX INFO: renamed from: h */
    public final void m205605h(final T t) {
        if (rqi.m180453d().m180454a(ypv.f199497e)) {
            Act.front().takeFirst(new w9j() { // from class: l.tuc0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(((Boolean) obj).booleanValue() && ypv.f199493a.m199377v0());
                }
            }).subscribe(ffw.m121193d(new e30() { // from class: l.uuc0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f178339a.m205607j(t, (Boolean) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m205606i(Object obj) {
        if (rqi.m180453d().m180455b(ypv.f199497e)) {
            this.f188103b.call(obj);
        } else {
            this.f188104c.call(obj);
        }
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m205607j(final Object obj, Boolean bool) {
        if (rqi.m180453d().m180455b(ypv.f199497e)) {
            this.f188103b.call(obj);
        } else {
            e51.m114743H(ypv.f199497e, new Runnable() { // from class: l.vuc0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f183056a.m205606i(obj);
                }
            }, 2000L);
        }
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Boolean m205608k(String str, Act.C4299r c4299r) {
        return Boolean.valueOf(m205615r(c4299r, str, false));
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m205609l(View view) {
        m205605h(this.f188102a);
        if (NullChecker.m81303a(this.f188105d)) {
            this.f188105d.call();
        }
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m205610m(DialogInterface dialogInterface) {
        this.f188104c.call(this.f188102a);
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m205611n(View view) {
        this.f188104c.call(this.f188102a);
    }

    /* JADX INFO: renamed from: o */
    public boolean m205612o(final String str, boolean z, boolean z2, boolean z3) {
        boolean zM180455b = rqi.m180453d().m180455b(ypv.f199497e);
        if (zM180455b) {
            this.f188103b.call(this.f188102a);
            return true;
        }
        if (!z) {
            return false;
        }
        if (mqi0.m155944o() - this.f188107f.get().longValue() < 604800000) {
            if (z2 && !zM180455b) {
                this.f188104c.call(this.f188102a);
            }
            return false;
        }
        if (z2 && z3) {
            return m205615r(Act.foreground_(), str, z3);
        }
        Act.foreground().takeFirst(new w9j() { // from class: l.puc0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f151267a.m205608k(str, (Act.C4299r) obj);
            }
        }).subscribe(ffw.m121192c());
        return true;
    }

    /* JADX INFO: renamed from: p */
    public void m205613p(e30<T> e30Var) {
        this.f188104c = e30Var;
    }

    /* JADX INFO: renamed from: q */
    public void m205614q(e30<T> e30Var) {
        this.f188103b = e30Var;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m205615r(Act.C4299r c4299r, String str, boolean z) {
        Activity activity;
        if ((!z && (c4299r == null || (c4299r.f15343a.get() instanceof LiveAct))) || (activity = c4299r.f15343a.get()) == null) {
            return false;
        }
        new xh0.C21150a(activity).m208740s(ypv.f199497e.getString(R$string.f47039W9)).m208731j(str).m208723b(true).m208728g(false).m208739r(ypv.f199497e.getString(R$string.f47278ha)).m208736o(new View.OnClickListener() { // from class: l.quc0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f156474a.m205609l(view);
            }
        }).m208727f(ypv.f199497e.getString(R$string.f46607C6)).m208733l(new DialogInterface.OnCancelListener() { // from class: l.ruc0
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                this.f161051a.m205610m(dialogInterface);
            }
        }).m208724c(new View.OnClickListener() { // from class: l.suc0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f166462a.m205611n(view);
            }
        }).m208722a().m208721g();
        if (NullChecker.m81303a(this.f188106e)) {
            this.f188106e.call();
        }
        this.f188107f.put(Long.valueOf(mqi0.m155944o()));
        return true;
    }
}
