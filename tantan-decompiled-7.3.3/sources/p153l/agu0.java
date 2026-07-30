package p153l;

import android.content.Context;
import android.view.View;
import com.google.android.gms.internal.ads.ViewOnAttachStateChangeListenerC2295w;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes6.dex */
public final class agu0 extends kdu0 implements y6s0 {

    /* JADX INFO: renamed from: b */
    public final Map f71285b;

    /* JADX INFO: renamed from: c */
    public final Context f71286c;

    /* JADX INFO: renamed from: d */
    public final q6w0 f71287d;

    public agu0(Context context, Set set, q6w0 q6w0Var) {
        super(set);
        this.f71285b = new WeakHashMap(1);
        this.f71286c = context;
        this.f71287d = q6w0Var;
    }

    @Override // p153l.y6s0
    /* JADX INFO: renamed from: U */
    public final synchronized void mo13723U(final x6s0 x6s0Var) {
        m149285v0(new jdu0() { // from class: l.zfu0
            @Override // p153l.jdu0
            public final void zza(Object obj) {
                ((y6s0) obj).mo13723U(x6s0Var);
            }
        });
    }

    /* JADX INFO: renamed from: w0 */
    public final synchronized void m97733w0(View view) {
        try {
            ViewOnAttachStateChangeListenerC2295w viewOnAttachStateChangeListenerC2295w = (ViewOnAttachStateChangeListenerC2295w) this.f71285b.get(view);
            if (viewOnAttachStateChangeListenerC2295w == null) {
                ViewOnAttachStateChangeListenerC2295w viewOnAttachStateChangeListenerC2295w2 = new ViewOnAttachStateChangeListenerC2295w(this.f71286c, view);
                viewOnAttachStateChangeListenerC2295w2.m13456c(this);
                this.f71285b.put(view, viewOnAttachStateChangeListenerC2295w2);
                viewOnAttachStateChangeListenerC2295w = viewOnAttachStateChangeListenerC2295w2;
            }
            if (this.f71287d.f155871Y) {
                if (((Boolean) jas0.m144075c().m176505a(sgs0.f168411o1)).booleanValue()) {
                    viewOnAttachStateChangeListenerC2295w.m13460g(((Long) jas0.m144075c().m176505a(sgs0.f168398n1)).longValue());
                    return;
                }
            }
            viewOnAttachStateChangeListenerC2295w.m13459f();
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: z0 */
    public final synchronized void m97734z0(View view) {
        if (this.f71285b.containsKey(view)) {
            ((ViewOnAttachStateChangeListenerC2295w) this.f71285b.get(view)).m13458e(this);
            this.f71285b.remove(view);
        }
    }
}
