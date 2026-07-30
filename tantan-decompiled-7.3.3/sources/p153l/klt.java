package p153l;

import com.p051p1.mobile.android.app.Act;
import com.tantan.live.search.eventbus.LiveSearchEventBus;
import com.tantanapp.common.utils.CrashHelper;
import java.util.HashSet;
import p153l.iam;

/* JADX INFO: loaded from: classes9.dex */
public class klt<V extends iam> extends l6t<V> {

    /* JADX INFO: renamed from: e */
    public final imt f127410e;

    public klt(ner nerVar, imt imtVar) {
        super(nerVar);
        this.f127410e = imtVar;
    }

    /* JADX INFO: renamed from: D2 */
    public LiveSearchEventBus m150393D2() {
        return this.f127410e.f115831a;
    }

    /* JADX INFO: renamed from: E2 */
    public imt m150394E2() {
        return this.f127410e;
    }

    /* JADX INFO: renamed from: F2 */
    public void m150395F2() {
        for (uwl uwlVar : new HashSet(this.f130285b.values())) {
            if (uwlVar instanceof mus) {
                try {
                    ((mus) uwlVar).mo160242M2();
                } catch (Exception e) {
                    CrashHelper.m82479c(e);
                }
            }
        }
    }

    public Act act() {
        return this.f127410e.f115832b;
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public final void mo73648t() {
        super.mo73648t();
    }
}
