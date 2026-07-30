package p149l;

import android.content.Context;
import android.view.View;
import com.google.android.gms.internal.ads.ViewOnAttachStateChangeListenerC2272w;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes6.dex */
public final class u6u0 extends e4u0 implements sxr0 {

    /* JADX INFO: renamed from: b */
    public final Map f174884b;

    /* JADX INFO: renamed from: c */
    public final Context f174885c;

    /* JADX INFO: renamed from: d */
    public final kxv0 f174886d;

    public u6u0(Context context, Set set, kxv0 kxv0Var) {
        super(set);
        this.f174884b = new WeakHashMap(1);
        this.f174885c = context;
        this.f174886d = kxv0Var;
    }

    @Override // p149l.sxr0
    /* JADX INFO: renamed from: U */
    public final synchronized void mo13669U(final rxr0 rxr0Var) {
        m114712v0(new d4u0() { // from class: l.t6u0
            @Override // p149l.d4u0
            public final void zza(Object obj) {
                ((sxr0) obj).mo13669U(rxr0Var);
            }
        });
    }

    /* JADX INFO: renamed from: w0 */
    public final synchronized void m192029w0(View view) {
        try {
            ViewOnAttachStateChangeListenerC2272w viewOnAttachStateChangeListenerC2272w = (ViewOnAttachStateChangeListenerC2272w) this.f174884b.get(view);
            if (viewOnAttachStateChangeListenerC2272w == null) {
                ViewOnAttachStateChangeListenerC2272w viewOnAttachStateChangeListenerC2272w2 = new ViewOnAttachStateChangeListenerC2272w(this.f174885c, view);
                viewOnAttachStateChangeListenerC2272w2.m13402c(this);
                this.f174884b.put(view, viewOnAttachStateChangeListenerC2272w2);
                viewOnAttachStateChangeListenerC2272w = viewOnAttachStateChangeListenerC2272w2;
            }
            if (this.f174886d.f125181Y) {
                if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132340o1)).booleanValue()) {
                    viewOnAttachStateChangeListenerC2272w.m13406g(((Long) d1s0.m109677c().m144697a(m7s0.f132327n1)).longValue());
                    return;
                }
            }
            viewOnAttachStateChangeListenerC2272w.m13405f();
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: z0 */
    public final synchronized void m192030z0(View view) {
        if (this.f174884b.containsKey(view)) {
            ((ViewOnAttachStateChangeListenerC2272w) this.f174884b.get(view)).m13404e(this);
            this.f174884b.remove(view);
        }
    }
}
