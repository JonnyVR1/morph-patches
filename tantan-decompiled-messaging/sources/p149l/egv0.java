package p149l;

import android.os.Build;
import android.os.Bundle;
import android.os.ext.SdkExtensions;
import com.google.android.exoplayer2.PlaybackException;

/* JADX INFO: loaded from: classes6.dex */
public final class egv0 implements plv0 {

    /* JADX INFO: renamed from: a */
    public final Integer f91214a;

    public egv0(Integer num) {
        this.f91214a = num;
    }

    /* JADX INFO: renamed from: b */
    public static /* bridge */ /* synthetic */ egv0 m116367b() {
        if (!((Boolean) d1s0.m109677c().m144697a(m7s0.f131986L9)).booleanValue()) {
            return new egv0(null);
        }
        vny0.m199080r();
        int extensionVersion = 0;
        if (Build.VERSION.SDK_INT >= 30 && SdkExtensions.getExtensionVersion(30) > 3) {
            extensionVersion = SdkExtensions.getExtensionVersion(PlaybackException.CUSTOM_ERROR_CODE_BASE);
        }
        return new egv0(Integer.valueOf(extensionVersion));
    }

    @Override // p149l.plv0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo96132a(Object obj) {
        Integer num = this.f91214a;
        Bundle bundle = (Bundle) obj;
        if (num != null) {
            bundle.putInt("aos", num.intValue());
        }
    }
}
