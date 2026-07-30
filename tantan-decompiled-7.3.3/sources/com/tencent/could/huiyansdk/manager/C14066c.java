package com.tencent.could.huiyansdk.manager;

import android.content.Context;
import android.content.res.Configuration;
import java.util.Locale;

/* JADX INFO: renamed from: com.tencent.could.huiyansdk.manager.c */
/* JADX INFO: loaded from: classes12.dex */
public class C14066c {

    /* JADX INFO: renamed from: com.tencent.could.huiyansdk.manager.c$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public static final C14066c f58282a = new C14066c();
    }

    /* JADX INFO: renamed from: a */
    public final Context m83516a(Context context, Locale locale) {
        if (context == null) {
            C14068e.a.f58293a.m83520a(2, "LanguageManager", "update locale, but context is null.");
            return null;
        }
        C14068e.a.f58293a.m83520a(1, "LanguageManager", "country: " + locale.getCountry() + " language: " + locale.getLanguage());
        Configuration configuration = context.getResources().getConfiguration();
        configuration.setLocale(locale);
        return context.createConfigurationContext(configuration);
    }
}
