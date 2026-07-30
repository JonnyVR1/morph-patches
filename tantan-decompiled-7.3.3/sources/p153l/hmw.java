package p153l;

import com.momosec.mmuid.android.Native;

/* JADX INFO: loaded from: classes8.dex */
public class hmw {
    /* JADX INFO: renamed from: a */
    public static String m136007a(byte[] bArr) {
        byte[] bArrDoCommand = Native.doCommand(bArr, 105);
        return bArrDoCommand == null ? "error" : new String(bArrDoCommand);
    }
}
