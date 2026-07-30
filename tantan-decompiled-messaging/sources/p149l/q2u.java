package p149l;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.live.base.data.BLiveAbsData;
import io.agora.rtc2.internal.AudioRoutingController;

/* JADX INFO: loaded from: classes13.dex */
public class q2u {
    /* JADX INFO: renamed from: a */
    public static Bundle m172509a(@Nullable String str) {
        return m172510b(str, null);
    }

    /* JADX INFO: renamed from: b */
    public static Bundle m172510b(@Nullable String str, @Nullable String str2) {
        Bundle bundle = new Bundle();
        if (str != null) {
            bundle.putString("default_tab_id", str);
        }
        bundle.putString("extra_tab_id", str2);
        return bundle;
    }

    /* JADX INFO: renamed from: c */
    public static Intent m172511c(Context context, Bundle bundle) {
        Intent intent = new Intent();
        l9s.m149059V(context, intent);
        intent.addFlags(AudioRoutingController.DEVICE_OUT_USB_HEADSET);
        intent.putExtra("extra_new_main_type", "extra_new_main_type_live");
        intent.putExtra("extra_new_main_bundle", bundle);
        return intent;
    }

    /* JADX INFO: renamed from: d */
    public static Bundle m172512d(String str, @Nullable String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("live_dynamic_schema", str);
        if (!TextUtils.isEmpty(str2)) {
            bundle.putString("navigation_live_intent", str2);
        }
        return bundle;
    }

    /* JADX INFO: renamed from: e */
    public static Bundle m172513e(String str, String str2) {
        Bundle bundleM172510b = m172510b(str, str2);
        bundleM172510b.putInt("from", 3);
        return bundleM172510b;
    }

    /* JADX INFO: renamed from: f */
    public static Bundle m172514f(String str, String str2) {
        Bundle bundleM172510b = m172510b(str, str2);
        bundleM172510b.putInt("from", 4);
        return bundleM172510b;
    }

    /* JADX INFO: renamed from: g */
    public static Bundle m172515g(BLiveAbsData bLiveAbsData, String str) {
        Bundle bundleM172509a = m172509a(null);
        bundleM172509a.putInt("from", 1);
        bundleM172509a.putByteArray("extra_live", q5c.m172998d(bLiveAbsData));
        bundleM172509a.putString("live_source", str);
        return bundleM172509a;
    }
}
