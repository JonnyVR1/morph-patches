package p149l;

import com.tantanapp.sharedlibrary.loader.SharedLibraryLoader;
import java.util.Objects;
import kotlin.Unit;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes10.dex */
public class ghd0 {
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m126178b(Unit unit) {
    }

    /* JADX INFO: renamed from: c */
    public static boolean m126179c() {
        return SharedLibraryLoader.m81454k().m81463q("rtc");
    }

    /* JADX INFO: renamed from: d */
    public static void m126180d() {
        m126181e().subscribe(mkd0.m154959K(new e30() { // from class: l.ehd0
            @Override // p149l.e30
            public final void call(Object obj) {
                ghd0.m126178b((Unit) obj);
            }
        }, new e30() { // from class: l.fhd0
            @Override // p149l.e30
            public final void call(Object obj) {
                Objects.toString((Throwable) obj);
            }
        }, false));
    }

    /* JADX INFO: renamed from: e */
    public static C22306c<Unit> m126181e() {
        return SharedLibraryLoader.m81454k().m81464r("rtc");
    }
}
