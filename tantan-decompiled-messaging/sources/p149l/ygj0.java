package p149l;

import android.content.Context;
import android.content.res.Configuration;

/* JADX INFO: loaded from: classes11.dex */
public final class ygj0 {
    /* JADX INFO: renamed from: a */
    public static Context m214726a(Context context, Configuration configuration) {
        return context.createConfigurationContext(configuration);
    }

    /* JADX INFO: renamed from: b */
    public static Configuration m214727b(Configuration configuration) {
        configuration.mcc = 310;
        return configuration;
    }

    /* JADX INFO: renamed from: c */
    public static Context m214728c(Context context) {
        return m214726a(context, m214727b(context.getResources().getConfiguration()));
    }
}
