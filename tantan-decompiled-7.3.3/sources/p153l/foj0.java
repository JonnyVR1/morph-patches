package p153l;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes.dex */
public class foj0 {

    /* JADX INFO: renamed from: a */
    public static final loj0 f100063a;

    /* JADX INFO: renamed from: b */
    public static final xgw<String, Typeface> f100064b;

    /* JADX INFO: renamed from: l.foj0$a */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static class C17025a extends x0j.C21224c {

        /* JADX INFO: renamed from: a */
        @Nullable
        public c5d0.AbstractC16196e f100065a;

        public C17025a(@Nullable c5d0.AbstractC16196e abstractC16196e) {
            this.f100065a = abstractC16196e;
        }

        @Override // p153l.x0j.C21224c
        /* JADX INFO: renamed from: a */
        public void mo126463a(int i) {
            c5d0.AbstractC16196e abstractC16196e = this.f100065a;
            if (abstractC16196e != null) {
                abstractC16196e.onFontRetrievalFailed(i);
            }
        }

        @Override // p153l.x0j.C21224c
        /* JADX INFO: renamed from: b */
        public void mo126464b(@NonNull Typeface typeface) {
            c5d0.AbstractC16196e abstractC16196e = this.f100065a;
            if (abstractC16196e != null) {
                abstractC16196e.onFontRetrieved(typeface);
            }
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            f100063a = new koj0();
        } else if (i >= 28) {
            f100063a = new joj0();
        } else if (i >= 26) {
            f100063a = new ioj0();
        } else if (hoj0.m136441j()) {
            f100063a = new hoj0();
        } else {
            f100063a = new goj0();
        }
        f100064b = new xgw<>(16);
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static Typeface m126456a(@NonNull Context context, @Nullable Typeface typeface, int i) {
        if (context != null) {
            return Typeface.create(typeface, i);
        }
        wg3.m206174a("Context cannot be null");
        return null;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: b */
    public static Typeface m126457b(@NonNull Context context, @Nullable CancellationSignal cancellationSignal, @NonNull x0j.C21223b[] c21223bArr, int i) {
        return f100063a.mo131116b(context, cancellationSignal, c21223bArr, i);
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* JADX INFO: renamed from: c */
    public static Typeface m126458c(@NonNull Context context, @NonNull w0j.InterfaceC20973b interfaceC20973b, @NonNull Resources resources, int i, @Nullable String str, int i2, int i3, @Nullable c5d0.AbstractC16196e abstractC16196e, @Nullable Handler handler, boolean z) {
        Typeface typefaceMo131115a;
        if (interfaceC20973b instanceof w0j.C20976e) {
            w0j.C20976e c20976e = (w0j.C20976e) interfaceC20973b;
            Typeface typefaceM126462g = m126462g(c20976e.m204199c());
            if (typefaceM126462g != null) {
                if (abstractC16196e != null) {
                    abstractC16196e.callbackSuccessAsync(typefaceM126462g, handler);
                }
                return typefaceM126462g;
            }
            typefaceMo131115a = x0j.m208857c(context, c20976e.m204198b(), i3, !z ? abstractC16196e != null : c20976e.m204197a() != 0, z ? c20976e.m204200d() : -1, c5d0.AbstractC16196e.getHandler(handler), new C17025a(abstractC16196e));
        } else {
            typefaceMo131115a = f100063a.mo131115a(context, (w0j.C20974c) interfaceC20973b, resources, i3);
            if (abstractC16196e != null) {
                if (typefaceMo131115a != null) {
                    abstractC16196e.callbackSuccessAsync(typefaceMo131115a, handler);
                } else {
                    abstractC16196e.callbackFailAsync(-3, handler);
                }
            }
        }
        if (typefaceMo131115a != null) {
            f100064b.m210955e(m126460e(resources, i, str, i2, i3), typefaceMo131115a);
        }
        return typefaceMo131115a;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* JADX INFO: renamed from: d */
    public static Typeface m126459d(@NonNull Context context, @NonNull Resources resources, int i, String str, int i2, int i3) {
        Typeface typefaceMo141319d = f100063a.mo141319d(context, resources, i, str, i3);
        if (typefaceMo141319d != null) {
            f100064b.m210955e(m126460e(resources, i, str, i2, i3), typefaceMo141319d);
        }
        return typefaceMo141319d;
    }

    /* JADX INFO: renamed from: e */
    public static String m126460e(Resources resources, int i, String str, int i2, int i3) {
        return resources.getResourcePackageName(i) + '-' + str + '-' + i2 + '-' + i + '-' + i3;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* JADX INFO: renamed from: f */
    public static Typeface m126461f(@NonNull Resources resources, int i, @Nullable String str, int i2, int i3) {
        return f100064b.m210954d(m126460e(resources, i, str, i2, i3));
    }

    /* JADX INFO: renamed from: g */
    public static Typeface m126462g(@Nullable String str) {
        if (str != null && !str.isEmpty()) {
            Typeface typefaceCreate = Typeface.create(str, 0);
            Typeface typefaceCreate2 = Typeface.create(Typeface.DEFAULT, 0);
            if (typefaceCreate != null && !typefaceCreate.equals(typefaceCreate2)) {
                return typefaceCreate;
            }
        }
        return null;
    }
}
