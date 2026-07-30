package p149l;

import android.util.Log;

/* JADX INFO: loaded from: classes6.dex */
public final class oix0 extends mhx0<Double> {
    public oix0(uix0 uix0Var, String str, Double d, boolean z) {
        super(uix0Var, str, d);
    }

    @Override // p149l.mhx0
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public final Double mo126416c(Object obj) {
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
        Log.e("PhenotypeFlag", "Invalid double value for " + super.m154655k() + ": " + String.valueOf(obj));
        return null;
    }
}
