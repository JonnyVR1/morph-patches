package p007l;

import com.momosec.mmuid.android.Native;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class ijw {
    /* JADX INFO: renamed from: a */
    public static String m9418a(byte[] bArr) {
        byte[] bArrDoCommand = Native.doCommand(bArr, 105);
        return bArrDoCommand == null ? "error" : new String(bArrDoCommand);
    }
}
