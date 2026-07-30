package p153l;

import android.content.res.Configuration;
import android.os.LocaleList;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
public final class vw5 {

    /* JADX INFO: renamed from: l.vw5$a */
    @RequiresApi(24)
    public static class C20946a {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static LocaleList m203066a(Configuration configuration) {
            return configuration.getLocales();
        }
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static fxv m203065a(@NonNull Configuration configuration) {
        return fxv.m128030d(C20946a.m203066a(configuration));
    }
}
