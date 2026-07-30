package p003l;

import com.tantanapp.sharedlibrary.loader.SharedLibraryLoader;
import java.util.Objects;
import kotlin.Unit;
import l.e30;
import l.mkd0;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class ghd0 {
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m6640b(Unit unit) {
    }

    /* JADX INFO: renamed from: c */
    public static boolean m6641c() {
        return SharedLibraryLoader.k().q("rtc");
    }

    /* JADX INFO: renamed from: d */
    public static void m6642d() {
        m6643e().subscribe(mkd0.K(new e30() { // from class: l.ehd0
            public final void call(Object obj) {
                ghd0.m6640b((Unit) obj);
            }
        }, new e30() { // from class: l.fhd0
            public final void call(Object obj) {
                Objects.toString((Throwable) obj);
            }
        }, false));
    }

    /* JADX INFO: renamed from: e */
    public static c<Unit> m6643e() {
        return SharedLibraryLoader.k().r("rtc");
    }
}
