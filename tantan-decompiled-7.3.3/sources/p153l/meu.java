package p153l;

import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.base.apibean.LiveClientSwitchesBean;
import com.tantanapp.common.utils.NullChecker;
import java.util.concurrent.TimeUnit;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes13.dex */
public class meu {

    /* JADX INFO: renamed from: a */
    public final kcg0 f136568a;

    /* JADX INFO: renamed from: b */
    public final kcg0 f136569b = Act.foreground().map(new qcj() { // from class: l.ieu
        @Override // p153l.qcj
        public final Object call(Object obj) {
            return meu.m158099b((Act.C4450r) obj);
        }
    }).distinctUntilChanged().subscribe(psd0.m173597H(new y20() { // from class: l.jeu
        @Override // p153l.y20
        public final void call(Object obj) {
            meu.m158100c((Boolean) obj);
        }
    }, new y20() { // from class: l.keu
        @Override // p153l.y20
        public final void call(Object obj) {
            meu.m158101d((Throwable) obj);
        }
    }));

    public meu(LiveClientSwitchesBean.LiveSwitchConfig liveSwitchConfig) {
        int i;
        this.f136568a = C22421c.interval((liveSwitchConfig == null || (i = liveSwitchConfig.logWriteWindowTime) <= 0) ? 60L : i, TimeUnit.SECONDS).subscribe(dhw.m115829h(new y20() { // from class: l.leu
            @Override // p153l.y20
            public final void call(Object obj) {
                nsh0.m164606h();
            }
        }));
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ Boolean m158099b(Act.C4450r c4450r) {
        return c4450r == null ? Boolean.FALSE : Boolean.valueOf(NullChecker.m82486a(c4450r.f16062a.get()));
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m158100c(Boolean bool) {
        if (bool.booleanValue()) {
            return;
        }
        nsh0.m164606h();
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m158101d(Throwable th) {
    }

    /* JADX INFO: renamed from: e */
    public void m158102e() {
        psd0.m173633z(this.f136568a);
        psd0.m173633z(this.f136569b);
    }
}
