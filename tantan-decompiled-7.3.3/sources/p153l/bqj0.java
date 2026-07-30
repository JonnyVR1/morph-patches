package p153l;

import android.content.Context;
import android.content.res.Configuration;

/* JADX INFO: loaded from: classes10.dex */
public final class bqj0 {
    /* JADX INFO: renamed from: a */
    public static Context m105944a(Context context, Configuration configuration) {
        return context.createConfigurationContext(configuration);
    }

    /* JADX INFO: renamed from: b */
    public static Configuration m105945b(Configuration configuration) {
        configuration.mcc = 310;
        return configuration;
    }

    /* JADX INFO: renamed from: c */
    public static Context m105946c(Context context) {
        return m105944a(context, m105945b(context.getResources().getConfiguration()));
    }
}
