package p149l;

import com.idv.identity.platform.log.RecordService;

/* JADX INFO: loaded from: classes7.dex */
public class scm {
    /* JADX INFO: renamed from: a */
    public static boolean m183421a() {
        try {
            System.loadLibrary("IDVMNN");
            return true;
        } catch (UnsatisfiedLinkError e) {
            RecordService.getInstance().recordException(e);
            return false;
        } catch (Error e2) {
            RecordService.getInstance().recordException(e2);
            return false;
        }
    }
}
