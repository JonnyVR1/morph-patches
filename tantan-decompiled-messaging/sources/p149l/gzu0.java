package p149l;

import android.os.Bundle;
import android.text.Spanned;
import androidx.annotation.Nullable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class gzu0 {

    /* JADX INFO: renamed from: a */
    public static final String f105180a = Integer.toString(0, 36);

    /* JADX INFO: renamed from: b */
    public static final String f105181b = Integer.toString(1, 36);

    /* JADX INFO: renamed from: c */
    public static final String f105182c = Integer.toString(2, 36);

    /* JADX INFO: renamed from: d */
    public static final String f105183d = Integer.toString(3, 36);

    /* JADX INFO: renamed from: e */
    public static final String f105184e = Integer.toString(4, 36);

    /* JADX INFO: renamed from: a */
    public static ArrayList m128914a(Spanned spanned) {
        ArrayList arrayList = new ArrayList();
        for (m1v0 m1v0Var : (m1v0[]) spanned.getSpans(0, spanned.length(), m1v0.class)) {
            arrayList.add(m128915b(spanned, m1v0Var, 1, m1v0Var.m152623a()));
        }
        for (v3v0 v3v0Var : (v3v0[]) spanned.getSpans(0, spanned.length(), v3v0.class)) {
            arrayList.add(m128915b(spanned, v3v0Var, 2, v3v0Var.m196874a()));
        }
        for (l0v0 l0v0Var : (l0v0[]) spanned.getSpans(0, spanned.length(), l0v0.class)) {
            arrayList.add(m128915b(spanned, l0v0Var, 3, null));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    public static Bundle m128915b(Spanned spanned, Object obj, int i, @Nullable Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putInt(f105180a, spanned.getSpanStart(obj));
        bundle2.putInt(f105181b, spanned.getSpanEnd(obj));
        bundle2.putInt(f105182c, spanned.getSpanFlags(obj));
        bundle2.putInt(f105183d, i);
        if (bundle != null) {
            bundle2.putBundle(f105184e, bundle);
        }
        return bundle2;
    }
}
