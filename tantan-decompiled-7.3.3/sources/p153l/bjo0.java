package p153l;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.p046mm.mmfile.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.NavigationIntent;
import com.p051p1.mobile.putong.live.base.data.BLiveAbsData;

/* JADX INFO: loaded from: classes9.dex */
public class bjo0 {
    /* JADX INFO: renamed from: a */
    public static Intent m104634a(Context context, Bundle bundle) {
        Intent intentM157875r = mbs.m157875r(context, NavigationIntent.get(NavigationIntent.menu));
        intentM157875r.putExtra("extra_new_main_bundle", bundle);
        return intentM157875r;
    }

    /* JADX INFO: renamed from: b */
    public static Intent m104635b(Context context, String str) {
        Intent intentM157875r = mbs.m157875r(context, NavigationIntent.get(NavigationIntent.internal_voice_square));
        intentM157875r.putExtra("live_internal_voice_square_tab_id", str);
        return intentM157875r;
    }

    /* JADX INFO: renamed from: c */
    public static Intent m104636c(Context context, @Nullable Bundle bundle) {
        Intent intentM157875r;
        if (mqr.m159587g() || mqr.m159586f()) {
            intentM157875r = mbs.m157875r(context, NavigationIntent.get(NavigationIntent.menu));
        } else {
            intentM157875r = mbs.m157875r(context, NavigationIntent.get("live"));
            if (bundle != null) {
                bundle.putString("navigation_live_intent", BLiveAbsData.VOICE_LIVE);
            }
        }
        intentM157875r.putExtra("extra_new_main_bundle", bundle);
        return intentM157875r;
    }

    /* JADX INFO: renamed from: d */
    public static void m104637d(Act act, Bundle bundle) {
        n4u.m161596h(bundle, bundle.getInt("from", 0), act);
    }
}
