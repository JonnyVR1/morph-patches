package p153l;

import android.os.Bundle;
import android.text.Spanned;
import androidx.annotation.Nullable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class m8v0 {

    /* JADX INFO: renamed from: a */
    public static final String f135295a = Integer.toString(0, 36);

    /* JADX INFO: renamed from: b */
    public static final String f135296b = Integer.toString(1, 36);

    /* JADX INFO: renamed from: c */
    public static final String f135297c = Integer.toString(2, 36);

    /* JADX INFO: renamed from: d */
    public static final String f135298d = Integer.toString(3, 36);

    /* JADX INFO: renamed from: e */
    public static final String f135299e = Integer.toString(4, 36);

    /* JADX INFO: renamed from: a */
    public static ArrayList m157518a(Spanned spanned) {
        ArrayList arrayList = new ArrayList();
        for (sav0 sav0Var : (sav0[]) spanned.getSpans(0, spanned.length(), sav0.class)) {
            arrayList.add(m157519b(spanned, sav0Var, 1, sav0Var.m185272a()));
        }
        for (bdv0 bdv0Var : (bdv0[]) spanned.getSpans(0, spanned.length(), bdv0.class)) {
            arrayList.add(m157519b(spanned, bdv0Var, 2, bdv0Var.m103641a()));
        }
        for (r9v0 r9v0Var : (r9v0[]) spanned.getSpans(0, spanned.length(), r9v0.class)) {
            arrayList.add(m157519b(spanned, r9v0Var, 3, null));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    public static Bundle m157519b(Spanned spanned, Object obj, int i, @Nullable Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putInt(f135295a, spanned.getSpanStart(obj));
        bundle2.putInt(f135296b, spanned.getSpanEnd(obj));
        bundle2.putInt(f135297c, spanned.getSpanFlags(obj));
        bundle2.putInt(f135298d, i);
        if (bundle != null) {
            bundle2.putBundle(f135299e, bundle);
        }
        return bundle2;
    }
}
