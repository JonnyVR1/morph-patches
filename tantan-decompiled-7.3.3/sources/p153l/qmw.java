package p153l;

import com.immomo.momosec.Coded;

/* JADX INFO: loaded from: classes7.dex */
public class qmw {
    /* JADX INFO: renamed from: a */
    public static String m177151a(byte[] bArr) {
        byte[] bArrDoCommand = Coded.doCommand(bArr, 105);
        return bArrDoCommand == null ? "error" : new String(bArrDoCommand);
    }
}
