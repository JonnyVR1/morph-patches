package com.vivo.push.util;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import com.google.firebase.sessions.settings.SettingsCache;

/* JADX INFO: renamed from: com.vivo.push.util.v */
/* JADX INFO: loaded from: classes2.dex */
final class C14801v implements InterfaceC14783d {

    /* JADX INFO: renamed from: a */
    private ContentResolver f61983a;

    @Override // com.vivo.push.util.InterfaceC14783d
    /* JADX INFO: renamed from: a */
    public final String mo86142a(String str, String str2) {
        try {
            return Settings.System.getString(this.f61983a, str);
        } catch (Exception e) {
            e.printStackTrace();
            C14795p.m86186b(SettingsCache.TAG, "getString error by ".concat(String.valueOf(str)));
            return str2;
        }
    }

    @Override // com.vivo.push.util.InterfaceC14783d
    /* JADX INFO: renamed from: b */
    public final void mo86144b(String str, String str2) {
        try {
            Settings.System.putString(this.f61983a, str, str2);
        } catch (Exception e) {
            e.printStackTrace();
            C14795p.m86186b(SettingsCache.TAG, "putString error by ".concat(String.valueOf(str)));
        }
    }

    @Override // com.vivo.push.util.InterfaceC14783d
    /* JADX INFO: renamed from: a */
    public final boolean mo86143a(Context context) {
        if (!C14789j.m86156b()) {
            return false;
        }
        this.f61983a = context.getContentResolver();
        return true;
    }
}
