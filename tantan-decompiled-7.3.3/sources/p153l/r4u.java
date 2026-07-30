package p153l;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.live.base.data.BLiveAbsData;
import io.agora.rtc2.internal.AudioRoutingController;

/* JADX INFO: loaded from: classes9.dex */
public class r4u {
    /* JADX INFO: renamed from: a */
    public static Bundle m179818a(@Nullable String str) {
        return m179819b(str, null);
    }

    /* JADX INFO: renamed from: b */
    public static Bundle m179819b(@Nullable String str, @Nullable String str2) {
        Bundle bundle = new Bundle();
        if (str != null) {
            bundle.putString("default_tab_id", str);
        }
        bundle.putString("extra_tab_id", str2);
        return bundle;
    }

    /* JADX INFO: renamed from: c */
    public static Intent m179820c(Context context, Bundle bundle) {
        Intent intent = new Intent();
        mbs.m157836V(context, intent);
        intent.addFlags(AudioRoutingController.DEVICE_OUT_USB_HEADSET);
        intent.putExtra("extra_new_main_type", "extra_new_main_type_live");
        intent.putExtra("extra_new_main_bundle", bundle);
        return intent;
    }

    /* JADX INFO: renamed from: d */
    public static Bundle m179821d(String str, @Nullable String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("live_dynamic_schema", str);
        if (!TextUtils.isEmpty(str2)) {
            bundle.putString("navigation_live_intent", str2);
        }
        return bundle;
    }

    /* JADX INFO: renamed from: e */
    public static Bundle m179822e(String str, String str2) {
        Bundle bundleM179819b = m179819b(str, str2);
        bundleM179819b.putInt("from", 3);
        return bundleM179819b;
    }

    /* JADX INFO: renamed from: f */
    public static Bundle m179823f(String str, String str2) {
        Bundle bundleM179819b = m179819b(str, str2);
        bundleM179819b.putInt("from", 4);
        return bundleM179819b;
    }

    /* JADX INFO: renamed from: g */
    public static Bundle m179824g(BLiveAbsData bLiveAbsData, String str) {
        Bundle bundleM179818a = m179818a(null);
        bundleM179818a.putInt("from", 1);
        bundleM179818a.putByteArray("extra_live", w6c.m205091d(bLiveAbsData));
        bundleM179818a.putString("live_source", str);
        return bundleM179818a;
    }
}
