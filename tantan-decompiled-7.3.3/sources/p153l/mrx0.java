package p153l;

import android.util.Log;

/* JADX INFO: loaded from: classes6.dex */
public final class mrx0 extends sqx0<Long> {
    public mrx0(asx0 asx0Var, String str, Long l2, boolean z) {
        super(asx0Var, str, l2);
    }

    @Override // p153l.sqx0
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public final Long mo106316c(Object obj) {
        if (obj instanceof Long) {
            return (Long) obj;
        }
        if (obj instanceof String) {
            try {
                return Long.valueOf(Long.parseLong((String) obj));
            } catch (NumberFormatException unused) {
            }
        }
        Log.e("PhenotypeFlag", "Invalid long value for " + super.m187575k() + ": " + String.valueOf(obj));
        return null;
    }
}
