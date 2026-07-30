package p149l;

import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.base.apibean.LiveClientSwitchesBean;
import com.tantanapp.common.utils.NullChecker;
import java.util.concurrent.TimeUnit;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes13.dex */
public class lcu {

    /* JADX INFO: renamed from: a */
    public final c4g0 f127468a;

    /* JADX INFO: renamed from: b */
    public final c4g0 f127469b = Act.foreground().map(new w9j() { // from class: l.hcu
        @Override // p149l.w9j
        public final Object call(Object obj) {
            return lcu.m149365b((Act.C4299r) obj);
        }
    }).distinctUntilChanged().subscribe(mkd0.m154956H(new e30() { // from class: l.icu
        @Override // p149l.e30
        public final void call(Object obj) {
            lcu.m149366c((Boolean) obj);
        }
    }, new e30() { // from class: l.jcu
        @Override // p149l.e30
        public final void call(Object obj) {
            lcu.m149367d((Throwable) obj);
        }
    }));

    public lcu(LiveClientSwitchesBean.LiveSwitchConfig liveSwitchConfig) {
        int i;
        this.f127468a = C22306c.interval((liveSwitchConfig == null || (i = liveSwitchConfig.logWriteWindowTime) <= 0) ? 60L : i, TimeUnit.SECONDS).subscribe(ffw.m121197h(new e30() { // from class: l.kcu
            @Override // p149l.e30
            public final void call(Object obj) {
                gkh0.m126625h();
            }
        }));
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ Boolean m149365b(Act.C4299r c4299r) {
        return c4299r == null ? Boolean.FALSE : Boolean.valueOf(NullChecker.m81303a(c4299r.f15343a.get()));
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m149366c(Boolean bool) {
        if (bool.booleanValue()) {
            return;
        }
        gkh0.m126625h();
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m149367d(Throwable th) {
    }

    /* JADX INFO: renamed from: e */
    public void m149368e() {
        mkd0.m154992z(this.f127468a);
        mkd0.m154992z(this.f127469b);
    }
}
