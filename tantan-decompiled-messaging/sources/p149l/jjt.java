package p149l;

import com.p046p1.mobile.android.app.Act;
import com.tantan.live.search.eventbus.LiveSearchEventBus;
import com.tantanapp.common.utils.CrashHelper;
import java.util.HashSet;
import p149l.s7m;

/* JADX INFO: loaded from: classes13.dex */
public class jjt<V extends s7m> extends k4t<V> {

    /* JADX INFO: renamed from: e */
    public final hkt f118315e;

    public jjt(mcr mcrVar, hkt hktVar) {
        super(mcrVar);
        this.f118315e = hktVar;
    }

    /* JADX INFO: renamed from: D2 */
    public LiveSearchEventBus m141814D2() {
        return this.f118315e.f108266a;
    }

    /* JADX INFO: renamed from: E2 */
    public hkt m141815E2() {
        return this.f118315e;
    }

    /* JADX INFO: renamed from: F2 */
    public void m141816F2() {
        for (gul gulVar : new HashSet(this.f121122b.values())) {
            if (gulVar instanceof lss) {
                try {
                    ((lss) gulVar).mo122936M2();
                } catch (Exception e) {
                    CrashHelper.m81296c(e);
                }
            }
        }
    }

    public Act act() {
        return this.f118315e.f108267b;
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public final void mo72465t() {
        super.mo72465t();
    }
}
