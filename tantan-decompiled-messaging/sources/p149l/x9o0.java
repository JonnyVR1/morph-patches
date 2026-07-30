package p149l;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.p041mm.mmfile.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.NavigationIntent;
import com.p046p1.mobile.putong.live.base.data.BLiveAbsData;

/* JADX INFO: loaded from: classes13.dex */
public class x9o0 {
    /* JADX INFO: renamed from: a */
    public static Intent m207501a(Context context, Bundle bundle) {
        Intent intentM149098r = l9s.m149098r(context, NavigationIntent.get(NavigationIntent.menu));
        intentM149098r.putExtra("extra_new_main_bundle", bundle);
        return intentM149098r;
    }

    /* JADX INFO: renamed from: b */
    public static Intent m207502b(Context context, String str) {
        Intent intentM149098r = l9s.m149098r(context, NavigationIntent.get(NavigationIntent.internal_voice_square));
        intentM149098r.putExtra("live_internal_voice_square_tab_id", str);
        return intentM149098r;
    }

    /* JADX INFO: renamed from: c */
    public static Intent m207503c(Context context, @Nullable Bundle bundle) {
        Intent intentM149098r;
        if (lor.m150802g() || lor.m150801f()) {
            intentM149098r = l9s.m149098r(context, NavigationIntent.get(NavigationIntent.menu));
        } else {
            intentM149098r = l9s.m149098r(context, NavigationIntent.get("live"));
            if (bundle != null) {
                bundle.putString("navigation_live_intent", BLiveAbsData.VOICE_LIVE);
            }
        }
        intentM149098r.putExtra("extra_new_main_bundle", bundle);
        return intentM149098r;
    }

    /* JADX INFO: renamed from: d */
    public static void m207504d(Act act, Bundle bundle) {
        m2u.m152711h(bundle, bundle.getInt("from", 0), act);
    }
}
