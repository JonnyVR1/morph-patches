package p009l;

import com.p1.mobile.android.app.c;
import com.p1.mobile.putong.core.CoreModule;
import l.e30;
import l.mcr;
import l.mkd0;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class ny10 extends hx10<oy10> {
    public ny10(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: renamed from: a0 */
    public void m19531a0() {
        super.a0();
        lifecycle().filter(new w9j() { // from class: l.ky10
            public final Object call(Object obj) {
                return Boolean.valueOf(((c) obj) == c.i);
            }
        }).filter(new w9j() { // from class: l.ly10
            public final Object call(Object obj) {
                return Boolean.valueOf(!wn90.m24343U(CoreModule.c.e0.p9()));
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.my10
            public final void call(Object obj) {
                CoreModule.c.e0.B7();
            }
        }));
    }

    public void destroy() {
    }
}
