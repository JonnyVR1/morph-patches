package p149l;

import android.nfc.FormatException;
import com.tantanapp.common.utils.CrashHelper;

/* JADX INFO: loaded from: classes5.dex */
public class gdv {
    /* JADX WARN: Type inference failed for: r3v1, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: a */
    public static void m125595a(h4t h4tVar, String str, String str2, int i) {
        if (h4tVar == null || h4tVar.m206027E2() == 0) {
            return;
        }
        CrashHelper.m81296c(new FormatException("getRoomId:" + h4tVar.m206027E2().m149818o() + " anchorId:" + str + " viewedUserId:" + str2 + " from:" + i));
    }
}
