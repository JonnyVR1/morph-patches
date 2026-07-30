package p149l;

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
public class bfj0 {

    /* JADX INFO: renamed from: a */
    public static final hfj0 f75322a;

    /* JADX INFO: renamed from: b */
    public static final zew<String, Typeface> f75323b;

    /* JADX INFO: renamed from: l.bfj0$a */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static class C15849a extends byi.C16015c {

        /* JADX INFO: renamed from: a */
        @Nullable
        public ywc0.AbstractC21562e f75324a;

        public C15849a(@Nullable ywc0.AbstractC21562e abstractC21562e) {
            this.f75324a = abstractC21562e;
        }

        @Override // p149l.byi.C16015c
        /* JADX INFO: renamed from: a */
        public void mo101544a(int i) {
            ywc0.AbstractC21562e abstractC21562e = this.f75324a;
            if (abstractC21562e != null) {
                abstractC21562e.onFontRetrievalFailed(i);
            }
        }

        @Override // p149l.byi.C16015c
        /* JADX INFO: renamed from: b */
        public void mo101545b(@NonNull Typeface typeface) {
            ywc0.AbstractC21562e abstractC21562e = this.f75324a;
            if (abstractC21562e != null) {
                abstractC21562e.onFontRetrieved(typeface);
            }
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            f75322a = new gfj0();
        } else if (i >= 28) {
            f75322a = new ffj0();
        } else if (i >= 26) {
            f75322a = new efj0();
        } else if (dfj0.m111470j()) {
            f75322a = new dfj0();
        } else {
            f75322a = new cfj0();
        }
        f75323b = new zew<>(16);
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static Typeface m101537a(@NonNull Context context, @Nullable Typeface typeface, int i) {
        if (context != null) {
            return Typeface.create(typeface, i);
        }
        ig3.m135964a("Context cannot be null");
        return null;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: b */
    public static Typeface m101538b(@NonNull Context context, @Nullable CancellationSignal cancellationSignal, @NonNull byi.C16014b[] c16014bArr, int i) {
        return f75322a.mo106578b(context, cancellationSignal, c16014bArr, i);
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* JADX INFO: renamed from: c */
    public static Typeface m101539c(@NonNull Context context, @NonNull ayi.InterfaceC15759b interfaceC15759b, @NonNull Resources resources, int i, @Nullable String str, int i2, int i3, @Nullable ywc0.AbstractC21562e abstractC21562e, @Nullable Handler handler, boolean z) {
        Typeface typefaceMo106577a;
        if (interfaceC15759b instanceof ayi.C15762e) {
            ayi.C15762e c15762e = (ayi.C15762e) interfaceC15759b;
            Typeface typefaceM101543g = m101543g(c15762e.m99563c());
            if (typefaceM101543g != null) {
                if (abstractC21562e != null) {
                    abstractC21562e.callbackSuccessAsync(typefaceM101543g, handler);
                }
                return typefaceM101543g;
            }
            typefaceMo106577a = byi.m104460c(context, c15762e.m99562b(), i3, !z ? abstractC21562e != null : c15762e.m99561a() != 0, z ? c15762e.m99564d() : -1, ywc0.AbstractC21562e.getHandler(handler), new C15849a(abstractC21562e));
        } else {
            typefaceMo106577a = f75322a.mo106577a(context, (ayi.C15760c) interfaceC15759b, resources, i3);
            if (abstractC21562e != null) {
                if (typefaceMo106577a != null) {
                    abstractC21562e.callbackSuccessAsync(typefaceMo106577a, handler);
                } else {
                    abstractC21562e.callbackFailAsync(-3, handler);
                }
            }
        }
        if (typefaceMo106577a != null) {
            f75323b.m218421e(m101541e(resources, i, str, i2, i3), typefaceMo106577a);
        }
        return typefaceMo106577a;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* JADX INFO: renamed from: d */
    public static Typeface m101540d(@NonNull Context context, @NonNull Resources resources, int i, String str, int i2, int i3) {
        Typeface typefaceMo116071d = f75322a.mo116071d(context, resources, i, str, i3);
        if (typefaceMo116071d != null) {
            f75323b.m218421e(m101541e(resources, i, str, i2, i3), typefaceMo116071d);
        }
        return typefaceMo116071d;
    }

    /* JADX INFO: renamed from: e */
    public static String m101541e(Resources resources, int i, String str, int i2, int i3) {
        return resources.getResourcePackageName(i) + '-' + str + '-' + i2 + '-' + i + '-' + i3;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* JADX INFO: renamed from: f */
    public static Typeface m101542f(@NonNull Resources resources, int i, @Nullable String str, int i2, int i3) {
        return f75323b.m218420d(m101541e(resources, i, str, i2, i3));
    }

    /* JADX INFO: renamed from: g */
    public static Typeface m101543g(@Nullable String str) {
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
