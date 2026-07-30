package p153l;

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
public class loj0 {

    /* JADX INFO: renamed from: a */
    @SuppressLint({"BanConcurrentHashMap"})
    public ConcurrentHashMap<Long, w0j.C20974c> f132913a = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: l.loj0$a */
    public class C18429a implements InterfaceC18430b<x0j.C21223b> {
        public C18429a() {
        }

        @Override // p153l.loj0.InterfaceC18430b
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int mo155089a(x0j.C21223b c21223b) {
            return c21223b.m208865e();
        }

        @Override // p153l.loj0.InterfaceC18430b
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean mo155090b(x0j.C21223b c21223b) {
            return c21223b.m208866f();
        }
    }

    /* JADX INFO: renamed from: l.loj0$b */
    public interface InterfaceC18430b<T> {
        /* JADX INFO: renamed from: a */
        int mo155089a(T t);

        /* JADX INFO: renamed from: b */
        boolean mo155090b(T t);
    }

    /* JADX INFO: renamed from: e */
    public static <T> T m155085e(T[] tArr, int i, InterfaceC18430b<T> interfaceC18430b) {
        return (T) m155086f(tArr, (i & 1) == 0 ? 400 : 700, (i & 2) != 0, interfaceC18430b);
    }

    /* JADX INFO: renamed from: f */
    public static <T> T m155086f(T[] tArr, int i, boolean z, InterfaceC18430b<T> interfaceC18430b) {
        T t = null;
        int i2 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        for (T t2 : tArr) {
            int iAbs = (Math.abs(interfaceC18430b.mo155089a(t2) - i) * 2) + (interfaceC18430b.mo155090b(t2) == z ? 0 : 1);
            if (t == null || i2 > iAbs) {
                t = t2;
                i2 = iAbs;
            }
        }
        return t;
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public Typeface mo131115a(Context context, w0j.C20974c c20974c, Resources resources, int i) {
        throw null;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public Typeface mo131116b(Context context, @Nullable CancellationSignal cancellationSignal, @NonNull x0j.C21223b[] c21223bArr, int i) {
        throw null;
    }

    /* JADX INFO: renamed from: c */
    public Typeface m155087c(Context context, InputStream inputStream) {
        File fileM159293e = moj0.m159293e(context);
        if (fileM159293e == null) {
            return null;
        }
        try {
            if (moj0.m159292d(fileM159293e, inputStream)) {
                return Typeface.createFromFile(fileM159293e.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileM159293e.delete();
        }
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public Typeface mo141319d(Context context, Resources resources, int i, String str, int i2) {
        File fileM159293e = moj0.m159293e(context);
        if (fileM159293e == null) {
            return null;
        }
        try {
            if (moj0.m159291c(fileM159293e, resources, i)) {
                return Typeface.createFromFile(fileM159293e.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileM159293e.delete();
        }
    }

    /* JADX INFO: renamed from: g */
    public x0j.C21223b m155088g(x0j.C21223b[] c21223bArr, int i) {
        return (x0j.C21223b) m155085e(c21223bArr, i, new C18429a());
    }
}
