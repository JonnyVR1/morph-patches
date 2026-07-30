package p153l;

import android.os.Build;
import com.tantanapp.media.ttmediautils.tinker.ShareConstants;

/* JADX INFO: loaded from: classes6.dex */
final class uph0 implements ylc0.InterfaceC21623b {
    @Override // p153l.ylc0.InterfaceC21623b
    /* JADX INFO: renamed from: a */
    public String mo197092a(String str) {
        return str.substring(3, str.length() - 3);
    }

    @Override // p153l.ylc0.InterfaceC21623b
    /* JADX INFO: renamed from: b */
    public String[] mo197093b() {
        String[] strArr = Build.SUPPORTED_ABIS;
        if (strArr.length > 0) {
            return strArr;
        }
        String str = Build.CPU_ABI2;
        return !ksi0.m151246a(str) ? new String[]{Build.CPU_ABI, str} : new String[]{Build.CPU_ABI};
    }

    @Override // p153l.ylc0.InterfaceC21623b
    /* JADX INFO: renamed from: c */
    public void mo197094c(String str) {
        System.load(str);
    }

    @Override // p153l.ylc0.InterfaceC21623b
    /* JADX INFO: renamed from: d */
    public String mo197095d(String str) {
        return (str.startsWith(ShareConstants.SO_PATH) && str.endsWith(".so")) ? str : System.mapLibraryName(str);
    }

    @Override // p153l.ylc0.InterfaceC21623b
    public void loadLibrary(String str) {
        System.loadLibrary(str);
    }
}
