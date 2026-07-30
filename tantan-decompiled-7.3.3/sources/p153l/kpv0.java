package p153l;

import android.os.Build;
import android.os.Bundle;
import android.os.ext.SdkExtensions;
import com.google.android.exoplayer2.PlaybackException;

/* JADX INFO: loaded from: classes6.dex */
public final class kpv0 implements vuv0 {

    /* JADX INFO: renamed from: a */
    public final Integer f128133a;

    public kpv0(Integer num) {
        this.f128133a = num;
    }

    /* JADX INFO: renamed from: b */
    public static /* bridge */ /* synthetic */ kpv0 m150797b() {
        if (!((Boolean) jas0.m144075c().m176505a(sgs0.f168057L9)).booleanValue()) {
            return new kpv0(null);
        }
        bxy0.m106934r();
        int extensionVersion = 0;
        if (Build.VERSION.SDK_INT >= 30 && SdkExtensions.getExtensionVersion(30) > 3) {
            extensionVersion = SdkExtensions.getExtensionVersion(PlaybackException.CUSTOM_ERROR_CODE_BASE);
        }
        return new kpv0(Integer.valueOf(extensionVersion));
    }

    @Override // p153l.vuv0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo99378a(Object obj) {
        Integer num = this.f128133a;
        Bundle bundle = (Bundle) obj;
        if (num != null) {
            bundle.putInt("aos", num.intValue());
        }
    }
}
