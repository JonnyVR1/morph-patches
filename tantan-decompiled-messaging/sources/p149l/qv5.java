package p149l;

import android.content.res.Configuration;
import android.os.LocaleList;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
public final class qv5 {

    /* JADX INFO: renamed from: l.qv5$a */
    @RequiresApi(24)
    public static class C19590a {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static LocaleList m176693a(Configuration configuration) {
            return configuration.getLocales();
        }
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static evv m176692a(@NonNull Configuration configuration) {
        return evv.m118323d(C19590a.m176693a(configuration));
    }
}
