package p002l;

import android.view.MotionEvent;
import com.p1.mobile.android.app.c;
import l.e30;
import l.ksz;
import l.mcr;
import l.mkd0;
import l.muy;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class vrz extends muy<ksz> {

    /* JADX INFO: renamed from: b */
    public boolean f21282b;

    public vrz(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: renamed from: Z */
    public void m24112Z() {
        super/*l.jq2*/.Z();
    }

    /* JADX INFO: renamed from: a0 */
    public void m24113a0() {
        super/*l.jq2*/.a0();
        m24114i0();
    }

    /* JADX INFO: renamed from: i0 */
    public final void m24114i0() {
        lifecycle().subscribe(mkd0.G(new e30() { // from class: l.urz
            public final void call(Object obj) {
                this.f20772a.m24115j0((c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m24115j0(c cVar) {
        if (cVar == c.i || cVar == c.m || cVar != c.j) {
            return;
        }
        e0().l().a3();
    }

    /* JADX INFO: renamed from: k0 */
    public void m24116k0(MotionEvent motionEvent) {
        g0().Y(motionEvent);
    }

    /* JADX INFO: renamed from: l0 */
    public void m24117l0(boolean z) {
        this.f21282b = z;
    }

    public void destroy() {
    }
}
