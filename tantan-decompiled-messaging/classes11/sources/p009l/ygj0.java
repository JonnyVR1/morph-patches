package p009l;

import android.content.Context;
import android.content.res.Configuration;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public final class ygj0 {
    /* JADX INFO: renamed from: a */
    public static Context m25367a(Context context, Configuration configuration) {
        return context.createConfigurationContext(configuration);
    }

    /* JADX INFO: renamed from: b */
    public static Configuration m25368b(Configuration configuration) {
        configuration.mcc = 310;
        return configuration;
    }

    /* JADX INFO: renamed from: c */
    public static Context m25369c(Context context) {
        return m25367a(context, m25368b(context.getResources().getConfiguration()));
    }
}
