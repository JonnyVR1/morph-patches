package p153l;

import android.nfc.FormatException;
import com.tantanapp.common.utils.CrashHelper;

/* JADX INFO: loaded from: classes5.dex */
public class hfv {
    /* JADX WARN: Type inference failed for: r3v1, types: [l.oo2, l.vp20] */
    /* JADX INFO: renamed from: a */
    public static void m134841a(i6t i6tVar, String str, String str2, int i) {
        if (i6tVar == null || i6tVar.m213810E2() == 0) {
            return;
        }
        CrashHelper.m82479c(new FormatException("getRoomId:" + i6tVar.m213810E2().m202194o() + " anchorId:" + str + " viewedUserId:" + str2 + " from:" + i));
    }
}
