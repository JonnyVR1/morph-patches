package com.p046p1.mobile.putong.core.app;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.p053ui.profile.profilelist.ProfileListFrag;
import com.tantanapp.common.utils.NullChecker;
import java.util.Locale;
import p149l.ii5;

/* JADX INFO: loaded from: classes9.dex */
public class LocalChangedListener extends BroadcastReceiver {
    public static void register(Context context) {
        ii5.m136342l(context, new LocalChangedListener(), new IntentFilter("android.intent.action.LOCALE_CHANGED"));
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if ("android.intent.action.LOCALE_CHANGED".equals(intent.getAction())) {
            if (NullChecker.m81303a(CoreModule.f17545c) && NullChecker.m81303a(CoreModule.f17545c.f19636d0.f199753R)) {
                CoreModule.f17545c.f19636d0.f199753R.m121234o();
                CoreModule.f17545c.f19636d0.f199753R.m121236q();
                CoreModule.f17545c.f19639e0.f149515z1.put(Locale.getDefault().getLanguage());
            }
            ProfileListFrag.f33610I4 = null;
        }
    }
}
