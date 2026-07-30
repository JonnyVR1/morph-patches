package p149l;

import android.content.Context;
import androidx.annotation.NonNull;
import com.immomo.mmdns.MDDNSEntrance;

/* JADX INFO: loaded from: classes7.dex */
public class sjw {

    /* JADX INFO: renamed from: a */
    public static volatile InterfaceC19967a f164921a;

    /* JADX INFO: renamed from: l.sjw$a */
    public interface InterfaceC19967a {
        MDDNSEntrance getDnsInstance();
    }

    /* JADX INFO: renamed from: l.sjw$b */
    public interface InterfaceC19968b {
        void onMMUIDGetComplete(String str);

        void onMMUIDGetError(Throwable th);
    }

    /* JADX INFO: renamed from: a */
    public static String m184559a() {
        return lek0.m149576j();
    }

    /* JADX INFO: renamed from: b */
    public static String m184560b(Context context) {
        return lek0.m149579m(context);
    }

    /* JADX INFO: renamed from: c */
    public static void m184561c(String str, @NonNull InterfaceC19968b interfaceC19968b) {
        lek0.m149577k(str, interfaceC19968b);
    }

    /* JADX INFO: renamed from: d */
    public static String m184562d() {
        return lek0.m149578l();
    }

    /* JADX INFO: renamed from: e */
    public static String m184563e() {
        return lek0.m149575i();
    }

    /* JADX INFO: renamed from: f */
    public static void m184564f(@NonNull Context context, @NonNull InterfaceC19967a interfaceC19967a) {
        ggw.m126043c(context);
        f164921a = interfaceC19967a;
    }
}
