package p149l;

import android.os.LocaleList;
import androidx.annotation.DoNotInline;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class evv {

    /* JADX INFO: renamed from: b */
    public static final evv f93390b = m118322a(new Locale[0]);

    /* JADX INFO: renamed from: a */
    public final fvv f93391a;

    /* JADX INFO: renamed from: l.evv$a */
    @RequiresApi(24)
    public static class C16691a {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static LocaleList m118326a(Locale... localeArr) {
            return new LocaleList(localeArr);
        }
    }

    public evv(fvv fvvVar) {
        this.f93391a = fvvVar;
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static evv m118322a(@NonNull Locale... localeArr) {
        return m118323d(C16691a.m118326a(localeArr));
    }

    @NonNull
    @RequiresApi(24)
    /* JADX INFO: renamed from: d */
    public static evv m118323d(@NonNull LocaleList localeList) {
        return new evv(new gvv(localeList));
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public Locale m118324b(int i) {
        return this.f93391a.get(i);
    }

    @IntRange(from = 0)
    /* JADX INFO: renamed from: c */
    public int m118325c() {
        return this.f93391a.size();
    }

    public boolean equals(Object obj) {
        return (obj instanceof evv) && this.f93391a.equals(((evv) obj).f93391a);
    }

    public int hashCode() {
        return this.f93391a.hashCode();
    }

    @NonNull
    public String toString() {
        return this.f93391a.toString();
    }
}
