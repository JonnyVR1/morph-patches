package com.tencent.could.huiyansdk.manager;

import android.content.Context;
import android.content.res.Configuration;
import java.util.Locale;

/* JADX INFO: renamed from: com.tencent.could.huiyansdk.manager.c */
/* JADX INFO: loaded from: classes2.dex */
public class C13903c {

    /* JADX INFO: renamed from: com.tencent.could.huiyansdk.manager.c$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public static final C13903c f57434a = new C13903c();
    }

    /* JADX INFO: renamed from: a */
    public final Context m82333a(Context context, Locale locale) {
        if (context == null) {
            C13905e.a.f57445a.m82337a(2, "LanguageManager", "update locale, but context is null.");
            return null;
        }
        C13905e.a.f57445a.m82337a(1, "LanguageManager", "country: " + locale.getCountry() + " language: " + locale.getLanguage());
        Configuration configuration = context.getResources().getConfiguration();
        configuration.setLocale(locale);
        return context.createConfigurationContext(configuration);
    }
}
