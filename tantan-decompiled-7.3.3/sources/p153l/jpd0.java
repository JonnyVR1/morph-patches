package p153l;

import com.tantanapp.sharedlibrary.loader.SharedLibraryLoader;
import java.util.Objects;
import kotlin.Unit;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes10.dex */
public class jpd0 {
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m146487b(Unit unit) {
    }

    /* JADX INFO: renamed from: c */
    public static boolean m146488c() {
        return SharedLibraryLoader.m82637k().m82646q("rtc");
    }

    /* JADX INFO: renamed from: d */
    public static void m146489d() {
        m146490e().subscribe(psd0.m173600K(new y20() { // from class: l.hpd0
            @Override // p153l.y20
            public final void call(Object obj) {
                jpd0.m146487b((Unit) obj);
            }
        }, new y20() { // from class: l.ipd0
            @Override // p153l.y20
            public final void call(Object obj) {
                Objects.toString((Throwable) obj);
            }
        }, false));
    }

    /* JADX INFO: renamed from: e */
    public static C22421c<Unit> m146490e() {
        return SharedLibraryLoader.m82637k().m82647r("rtc");
    }
}
