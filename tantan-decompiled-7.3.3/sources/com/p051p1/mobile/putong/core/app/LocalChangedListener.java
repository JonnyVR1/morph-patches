package com.p051p1.mobile.putong.core.app;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.p058ui.profile.profilelist.ProfileListFrag;
import com.tantanapp.common.utils.NullChecker;
import java.util.Locale;
import p153l.jj5;

/* JADX INFO: loaded from: classes9.dex */
public class LocalChangedListener extends BroadcastReceiver {
    public static void register(Context context) {
        jj5.m145018l(context, new LocalChangedListener(), new IntentFilter("android.intent.action.LOCALE_CHANGED"));
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if ("android.intent.action.LOCALE_CHANGED".equals(intent.getAction())) {
            if (NullChecker.m82486a(CoreModule.f18264c) && NullChecker.m82486a(CoreModule.f18264c.f20378d0.f128826R)) {
                CoreModule.f18264c.f20378d0.f128826R.m159278o();
                CoreModule.f18264c.f20378d0.f128826R.m159280q();
                CoreModule.f18264c.f20381e0.f89372z1.put(Locale.getDefault().getLanguage());
            }
            ProfileListFrag.f34458I4 = null;
        }
    }
}
