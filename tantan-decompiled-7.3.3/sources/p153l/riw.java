package p153l;

import com.immomo.hdata.android.Coded;

/* JADX INFO: loaded from: classes7.dex */
public class riw {
    /* JADX INFO: renamed from: a */
    public static String m181611a(byte[] bArr) {
        byte[] bArrDoCommand = Coded.doCommand(bArr, 105);
        return bArrDoCommand == null ? "error" : new String(bArrDoCommand);
    }
}
