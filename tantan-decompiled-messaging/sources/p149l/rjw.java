package p149l;

import com.immomo.momosec.Coded;

/* JADX INFO: loaded from: classes7.dex */
public class rjw {
    /* JADX INFO: renamed from: a */
    public static String m179664a(byte[] bArr) {
        byte[] bArrDoCommand = Coded.doCommand(bArr, 105);
        return bArrDoCommand == null ? "error" : new String(bArrDoCommand);
    }
}
