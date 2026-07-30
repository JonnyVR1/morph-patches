package p153l;

import android.content.Context;
import androidx.annotation.NonNull;
import com.immomo.mmdns.MDDNSEntrance;

/* JADX INFO: loaded from: classes7.dex */
public class rmw {

    /* JADX INFO: renamed from: a */
    public static volatile InterfaceC19875a f163939a;

    /* JADX INFO: renamed from: l.rmw$a */
    public interface InterfaceC19875a {
        MDDNSEntrance getDnsInstance();
    }

    /* JADX INFO: renamed from: l.rmw$b */
    public interface InterfaceC19876b {
        void onMMUIDGetComplete(String str);

        void onMMUIDGetError(Throwable th);
    }

    /* JADX INFO: renamed from: a */
    public static String m182109a() {
        return rnk0.m182250j();
    }

    /* JADX INFO: renamed from: b */
    public static String m182110b(Context context) {
        return rnk0.m182253m(context);
    }

    /* JADX INFO: renamed from: c */
    public static void m182111c(String str, @NonNull InterfaceC19876b interfaceC19876b) {
        rnk0.m182251k(str, interfaceC19876b);
    }

    /* JADX INFO: renamed from: d */
    public static String m182112d() {
        return rnk0.m182252l();
    }

    /* JADX INFO: renamed from: e */
    public static String m182113e() {
        return rnk0.m182249i();
    }

    /* JADX INFO: renamed from: f */
    public static void m182114f(@NonNull Context context, @NonNull InterfaceC19875a interfaceC19875a) {
        eiw.m120947c(context);
        f163939a = interfaceC19875a;
    }
}
