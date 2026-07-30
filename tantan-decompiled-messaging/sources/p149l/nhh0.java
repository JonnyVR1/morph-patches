package p149l;

import android.os.Build;
import com.tantanapp.media.ttmediautils.tinker.ShareConstants;

/* JADX INFO: loaded from: classes6.dex */
final class nhh0 implements rdc0.InterfaceC19680b {
    @Override // p149l.rdc0.InterfaceC19680b
    /* JADX INFO: renamed from: a */
    public String mo159397a(String str) {
        return str.substring(3, str.length() - 3);
    }

    @Override // p149l.rdc0.InterfaceC19680b
    /* JADX INFO: renamed from: b */
    public String[] mo159398b() {
        String[] strArr = Build.SUPPORTED_ABIS;
        if (strArr.length > 0) {
            return strArr;
        }
        String str = Build.CPU_ABI2;
        return !kji0.m146235a(str) ? new String[]{Build.CPU_ABI, str} : new String[]{Build.CPU_ABI};
    }

    @Override // p149l.rdc0.InterfaceC19680b
    /* JADX INFO: renamed from: c */
    public void mo159399c(String str) {
        System.load(str);
    }

    @Override // p149l.rdc0.InterfaceC19680b
    /* JADX INFO: renamed from: d */
    public String mo159400d(String str) {
        return (str.startsWith(ShareConstants.SO_PATH) && str.endsWith(".so")) ? str : System.mapLibraryName(str);
    }

    @Override // p149l.rdc0.InterfaceC19680b
    public void loadLibrary(String str) {
        System.loadLibrary(str);
    }
}
