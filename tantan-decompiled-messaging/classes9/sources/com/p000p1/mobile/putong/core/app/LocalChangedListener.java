package com.p000p1.mobile.putong.core.app;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.ui.profile.profilelist.ProfileListFrag;
import com.tantanapp.common.utils.NullChecker;
import java.util.Locale;
import l.ii5;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class LocalChangedListener extends BroadcastReceiver {
    public static void register(Context context) {
        ii5.l(context, new LocalChangedListener(), new IntentFilter("android.intent.action.LOCALE_CHANGED"));
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if ("android.intent.action.LOCALE_CHANGED".equals(intent.getAction())) {
            if (NullChecker.a(CoreModule.f1534c) && NullChecker.a(CoreModule.f1534c.f3625d0.f28368R)) {
                CoreModule.f1534c.f3625d0.f28368R.o();
                CoreModule.f1534c.f3625d0.f28368R.z();
                CoreModule.f1534c.f3628e0.f19127z1.put(Locale.getDefault().getLanguage());
            }
            ProfileListFrag.I4 = null;
        }
    }
}
