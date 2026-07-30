package com.vivo.push.util;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import com.google.firebase.sessions.settings.SettingsCache;

/* JADX INFO: renamed from: com.vivo.push.util.v */
/* JADX INFO: loaded from: classes2.dex */
final class C14653v implements InterfaceC14635d {

    /* JADX INFO: renamed from: a */
    private ContentResolver f61136a;

    @Override // com.vivo.push.util.InterfaceC14635d
    /* JADX INFO: renamed from: a */
    public final String mo84971a(String str, String str2) {
        try {
            return Settings.System.getString(this.f61136a, str);
        } catch (Exception e) {
            e.printStackTrace();
            C14647p.m85015b(SettingsCache.TAG, "getString error by ".concat(String.valueOf(str)));
            return str2;
        }
    }

    @Override // com.vivo.push.util.InterfaceC14635d
    /* JADX INFO: renamed from: b */
    public final void mo84973b(String str, String str2) {
        try {
            Settings.System.putString(this.f61136a, str, str2);
        } catch (Exception e) {
            e.printStackTrace();
            C14647p.m85015b(SettingsCache.TAG, "putString error by ".concat(String.valueOf(str)));
        }
    }

    @Override // com.vivo.push.util.InterfaceC14635d
    /* JADX INFO: renamed from: a */
    public final boolean mo84972a(Context context) {
        if (!C14641j.m84985b()) {
            return false;
        }
        this.f61136a = context.getContentResolver();
        return true;
    }
}
