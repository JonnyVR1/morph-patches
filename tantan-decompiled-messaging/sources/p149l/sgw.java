package p149l;

import com.immomo.hdata.android.Coded;

/* JADX INFO: loaded from: classes7.dex */
public class sgw {
    /* JADX INFO: renamed from: a */
    public static String m184137a(byte[] bArr) {
        byte[] bArrDoCommand = Coded.doCommand(bArr, 105);
        return bArrDoCommand == null ? "error" : new String(bArrDoCommand);
    }
}
