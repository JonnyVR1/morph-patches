package p153l;

import android.util.Log;

/* JADX INFO: loaded from: classes6.dex */
public final class urx0 extends sqx0<Double> {
    public urx0(asx0 asx0Var, String str, Double d, boolean z) {
        super(asx0Var, str, d);
    }

    @Override // p153l.sqx0
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public final Double mo106316c(Object obj) {
        if (obj instanceof Double) {
            return (Double) obj;
        }
        if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        }
        if (obj instanceof String) {
            try {
                return Double.valueOf(Double.parseDouble((String) obj));
            } catch (NumberFormatException unused) {
            }
        }
        Log.e("PhenotypeFlag", "Invalid double value for " + super.m187575k() + ": " + String.valueOf(obj));
        return null;
    }
}
