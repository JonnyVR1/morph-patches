package p149l;

import com.momosec.mmuid.android.Native;

/* JADX INFO: loaded from: classes8.dex */
public class ijw {
    /* JADX INFO: renamed from: a */
    public static String m136753a(byte[] bArr) {
        byte[] bArrDoCommand = Native.doCommand(bArr, 105);
        return bArrDoCommand == null ? "error" : new String(bArrDoCommand);
    }
}
