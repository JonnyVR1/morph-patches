package p153l;

import android.os.LocaleList;
import androidx.annotation.DoNotInline;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class fxv {

    /* JADX INFO: renamed from: b */
    public static final fxv f101315b = m128029a(new Locale[0]);

    /* JADX INFO: renamed from: a */
    public final gxv f101316a;

    /* JADX INFO: renamed from: l.fxv$a */
    @RequiresApi(24)
    public static class C17091a {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static LocaleList m128033a(Locale... localeArr) {
            return new LocaleList(localeArr);
        }
    }

    public fxv(gxv gxvVar) {
        this.f101316a = gxvVar;
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static fxv m128029a(@NonNull Locale... localeArr) {
        return m128030d(C17091a.m128033a(localeArr));
    }

    @NonNull
    @RequiresApi(24)
    /* JADX INFO: renamed from: d */
    public static fxv m128030d(@NonNull LocaleList localeList) {
        return new fxv(new hxv(localeList));
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public Locale m128031b(int i) {
        return this.f101316a.get(i);
    }

    @IntRange(from = 0)
    /* JADX INFO: renamed from: c */
    public int m128032c() {
        return this.f101316a.size();
    }

    public boolean equals(Object obj) {
        return (obj instanceof fxv) && this.f101316a.equals(((fxv) obj).f101316a);
    }

    public int hashCode() {
        return this.f101316a.hashCode();
    }

    @NonNull
    public String toString() {
        return this.f101316a.toString();
    }
}
