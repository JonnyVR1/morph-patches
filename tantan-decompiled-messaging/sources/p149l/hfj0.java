package p149l;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.google.android.gms.common.api.Api;
import java.io.File;
import java.io.InputStream;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class hfj0 {

    /* JADX INFO: renamed from: a */
    @SuppressLint({"BanConcurrentHashMap"})
    public ConcurrentHashMap<Long, ayi.C15760c> f107489a = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: l.hfj0$a */
    public class C17299a implements InterfaceC17300b<byi.C16014b> {
        public C17299a() {
        }

        @Override // p149l.hfj0.InterfaceC17300b
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int mo130770a(byi.C16014b c16014b) {
            return c16014b.m104468e();
        }

        @Override // p149l.hfj0.InterfaceC17300b
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean mo130771b(byi.C16014b c16014b) {
            return c16014b.m104469f();
        }
    }

    /* JADX INFO: renamed from: l.hfj0$b */
    public interface InterfaceC17300b<T> {
        /* JADX INFO: renamed from: a */
        int mo130770a(T t);

        /* JADX INFO: renamed from: b */
        boolean mo130771b(T t);
    }

    /* JADX INFO: renamed from: e */
    public static <T> T m130766e(T[] tArr, int i, InterfaceC17300b<T> interfaceC17300b) {
        return (T) m130767f(tArr, (i & 1) == 0 ? 400 : 700, (i & 2) != 0, interfaceC17300b);
    }

    /* JADX INFO: renamed from: f */
    public static <T> T m130767f(T[] tArr, int i, boolean z, InterfaceC17300b<T> interfaceC17300b) {
        T t = null;
        int i2 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        for (T t2 : tArr) {
            int iAbs = (Math.abs(interfaceC17300b.mo130770a(t2) - i) * 2) + (interfaceC17300b.mo130771b(t2) == z ? 0 : 1);
            if (t == null || i2 > iAbs) {
                t = t2;
                i2 = iAbs;
            }
        }
        return t;
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public Typeface mo106577a(Context context, ayi.C15760c c15760c, Resources resources, int i) {
        throw null;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public Typeface mo106578b(Context context, @Nullable CancellationSignal cancellationSignal, @NonNull byi.C16014b[] c16014bArr, int i) {
        throw null;
    }

    /* JADX INFO: renamed from: c */
    public Typeface m130768c(Context context, InputStream inputStream) {
        File fileM135933e = ifj0.m135933e(context);
        if (fileM135933e == null) {
            return null;
        }
        try {
            if (ifj0.m135932d(fileM135933e, inputStream)) {
                return Typeface.createFromFile(fileM135933e.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileM135933e.delete();
        }
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public Typeface mo116071d(Context context, Resources resources, int i, String str, int i2) {
        File fileM135933e = ifj0.m135933e(context);
        if (fileM135933e == null) {
            return null;
        }
        try {
            if (ifj0.m135931c(fileM135933e, resources, i)) {
                return Typeface.createFromFile(fileM135933e.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileM135933e.delete();
        }
    }

    /* JADX INFO: renamed from: g */
    public byi.C16014b m130769g(byi.C16014b[] c16014bArr, int i) {
        return (byi.C16014b) m130766e(c16014bArr, i, new C17299a());
    }
}
