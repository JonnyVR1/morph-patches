package p153l;

import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.live.livingroom.R$string;

/* JADX INFO: loaded from: classes5.dex */
public class r35 {
    /* JADX INFO: renamed from: a */
    public static boolean m179576a(Throwable th, int i) {
        return th != null && (th instanceof TantanException.Client.CoreService) && ((TantanException.Client.CoreService) th).code == i;
    }

    /* JADX INFO: renamed from: b */
    public static String m179577b(Throwable th) {
        return th != null ? th.getMessage() : "";
    }

    /* JADX INFO: renamed from: c */
    public static void m179578c(Throwable th) {
        int i;
        if (th == null) {
            return;
        }
        String str = null;
        if (th instanceof TantanException.Client.CoreService) {
            TantanException.Client.CoreService coreService = (TantanException.Client.CoreService) th;
            i = coreService.code;
            if (i == 43017 || i == 43018 || i == 51013 || i == 43015 || i == 43000 || i == 43026 || i == 43027 || i == 43006 || i == 42200 || i == 43032 || i == 43033 || i == 43034 || i == 43040 || i == 43052 || i == 43053 || i == 43054 || i == 43073 || i == 43074 || i == 43020 || i == 43075 || i == 43004 || i == 43100 || i == 43101 || i == 43103 || i == 43104 || i == 43102 || i == 55003 || i == 55005 || i == 55104 || i == 55101 || i == 55024 || i == 55103 || i == 43028 || i == 60030 || i == 43010 || i == 41020 || i == 43152 || i == 43151 || i == 43153 || i == 55102 || i == 43120 || i == 43121 || i == 43122 || i == 43123 || i == 43124 || i == 43160 || i == 43165 || i == 43041 || i == 43166 || i == 43105 || i == 43106 || i == 43039 || i == 43140) {
                str = coreService.metaMessage;
            }
        } else {
            i = 0;
        }
        if (str == null) {
            o1j0.m165634h(R$string.f47612J9);
        } else {
            o1j0.m165651y(str);
        }
        fhw.m125605a("[voice][call]", "error cause code = " + i + " message = " + str);
    }
}
